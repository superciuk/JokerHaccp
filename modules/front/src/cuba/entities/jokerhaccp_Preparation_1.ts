import { StandardEntity } from "./base/sys$StandardEntity";
import { PreparationPrototype } from "./jokerhaccp_Preparation";
export class Preparation extends StandardEntity {
  static NAME = "jokerhaccp_Preparation_1";
  preparationDate?: any | null;
  expirationDate?: any | null;
  preparation?: PreparationPrototype | null;
  internalLot?: string | null;
  quantity?: number | null;
}
export type PreparationViewName = "_minimal" | "_local" | "_base";
export type PreparationView<V extends PreparationViewName> = V extends "_local"
  ? Pick<
      Preparation,
      "id" | "preparationDate" | "expirationDate" | "internalLot" | "quantity"
    >
  : V extends "_base"
  ? Pick<
      Preparation,
      "id" | "preparationDate" | "expirationDate" | "internalLot" | "quantity"
    >
  : never;
