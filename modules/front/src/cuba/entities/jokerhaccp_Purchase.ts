import { StandardEntity } from "./base/sys$StandardEntity";
import { Product } from "./jokerhaccp_Product";
import { Supplier } from "./jokerhaccp_Supplier";
import { Unit, Payment, PurchaseDocument } from "../enums/enums";
export class Purchase extends StandardEntity {
  static NAME = "jokerhaccp_Purchase";
  date?: any | null;
  product?: Product | null;
  supplier?: Supplier | null;
  lot?: string | null;
  quantity?: any | null;
  unit?: Unit | null;
  price?: any | null;
  payment?: Payment | null;
  purchaseDocument?: PurchaseDocument | null;
  purchaseDocumentId?: string | null;
  note?: string | null;
}
export type PurchaseViewName = "_minimal" | "_local" | "_base";
export type PurchaseView<V extends PurchaseViewName> = V extends "_local"
  ? Pick<
      Purchase,
      | "id"
      | "date"
      | "lot"
      | "quantity"
      | "unit"
      | "price"
      | "payment"
      | "purchaseDocument"
      | "purchaseDocumentId"
      | "note"
    >
  : V extends "_base"
  ? Pick<
      Purchase,
      | "id"
      | "date"
      | "lot"
      | "quantity"
      | "unit"
      | "price"
      | "payment"
      | "purchaseDocument"
      | "purchaseDocumentId"
      | "note"
    >
  : never;
