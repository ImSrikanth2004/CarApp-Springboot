import { useState } from "react";
import { Car } from "./types";
import { Button, Dialog, DialogActions, DialogTitle } from "@mui/material";
import { useMutation, useQueryClient } from "@tanstack/react-query";
import { addCar } from "@/api/carapi";
import CarDialogContent from "./CarDialogContent";
import { AddCircleOutlineRounded } from "@mui/icons-material";

function AddCar() {
  const queryClient = useQueryClient();
  const { mutate } = useMutation(addCar, {
    onSuccess: () => {
      queryClient.invalidateQueries(["cars"]);
    },
    onError: (err) => {
      console.error(err);
    },
  });

  const [open, setOpen] = useState(false);
  const [car, setCar] = useState<Car>({
    brand: "",
    model: "",
    color: "",
    registrationNumber: "",
    modelYear: 0,
    price: 0,
  });

  const handleClickOpen = () => {
    setOpen(true);
  };
  const handleClose = () => {
    setOpen(false);
  };

  const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
    setCar({ ...car, [event.target.name]: event.target.value });
  };
  const handleSave = () => {
    mutate(car);
    setCar({
      brand: "",
      model: "",
      color: "",
      registrationNumber: "",
      modelYear: 0,
      price: 0,
    });
    handleClose();
  };
  return (
    <>
      <AddCircleOutlineRounded onClick={handleClickOpen} />
      <Dialog
        open={open}
        onClose={handleClose}
        className="grid-cols-2 rounded-2xl">
        <DialogTitle className="bg-gray-300 text-gray-800 font-extrabold">
          New Car
        </DialogTitle>
        <CarDialogContent car={car} handleChange={handleChange} />
        <DialogActions className="bg-gray-300 text-gray-200">
          <Button onClick={handleClose}>Cancel</Button>
          <Button onClick={handleSave}>Save</Button>
        </DialogActions>
      </Dialog>
    </>
  );
}
export default AddCar;
