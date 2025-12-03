import { Car } from "./types";
import { DialogContent } from "@mui/material";

type DialogFromProps = {
  car: Car;
  handleChange: (event: React.ChangeEvent<HTMLInputElement>) => void;
};

function CarDialogContent({ car, handleChange }: DialogFromProps) {
  return (
    <DialogContent className="bg-gray-600 w-full backdrop-opacity-50">
      <input
        placeholder="Brand"
        name="brand"
        value={car.brand}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
      <input
        placeholder="Model"
        name="model"
        value={car.model}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
      <input
        placeholder="Color"
        name="color"
        value={car.color}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
      <input
        placeholder="Reg.nr"
        name="registrationNumber"
        value={car.registrationNumber}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
      <input
        placeholder="Model Year"
        name="modelYear"
        value={car.modelYear}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
      <input
        placeholder="Price"
        name="price"
        value={car.price}
        onChange={handleChange}
        className="p-1 m-1 shadow-lg bg-gray-200 rounded-lg"
      />
      <br />
    </DialogContent>
  );
}

export default CarDialogContent;
