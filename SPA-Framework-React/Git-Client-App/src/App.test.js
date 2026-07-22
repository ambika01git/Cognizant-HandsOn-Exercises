import { render, screen } from "@testing-library/react";
import App from "./App";

test("renders github heading", () => {
  render(<App />);
  const heading = screen.getByText(/Git repositories of User/i);
  expect(heading).toBeInTheDocument();
});