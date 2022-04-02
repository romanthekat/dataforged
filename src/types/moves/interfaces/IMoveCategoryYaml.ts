import type IMove from "./IMove.js";
import type ISource from "../../general/interfaces/ISource.js";
import type MdString from "../../general/MdString.js";
import type MoveCategoryName from "../MoveCategoryName.js";


export default interface IMoveCategoryYaml {
  Name: MoveCategoryName;
  Source: ISource;
  Description: MdString;
  Moves: IMove[];
}