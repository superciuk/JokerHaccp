import { StandardEntity } from "./base/sys$StandardEntity";
import { Product } from "./jokerhaccp_Product";
import { StorageTemperature } from "../enums/enums";
export class PreparationPrototype extends StandardEntity {
  static NAME = "jokerhaccp_Preparation";
  name?: string | null;
  ingredients?: Product[] | null;
  roner?: boolean | null;
  ronerTimeInMinutes?: number | null;
  blastChiller?: boolean | null;
  blastChillerTimeInMinutes?: number | null;
  vacuumPacked?: boolean | null;
  storageTemperature?: StorageTemperature | null;
  storageTimeInDays?: number | null;
}
export type PreparationPrototypeViewName = "_minimal" | "_local" | "_base";
export type PreparationPrototypeView<
  V extends PreparationPrototypeViewName
> = V extends "_local"
  ? Pick<
      PreparationPrototype,
      | "id"
      | "name"
      | "roner"
      | "ronerTimeInMinutes"
      | "blastChiller"
      | "blastChillerTimeInMinutes"
      | "vacuumPacked"
      | "storageTemperature"
      | "storageTimeInDays"
    >
  : V extends "_base"
  ? Pick<
      PreparationPrototype,
      | "id"
      | "name"
      | "roner"
      | "ronerTimeInMinutes"
      | "blastChiller"
      | "blastChillerTimeInMinutes"
      | "vacuumPacked"
      | "storageTemperature"
      | "storageTimeInDays"
    >
  : never;
