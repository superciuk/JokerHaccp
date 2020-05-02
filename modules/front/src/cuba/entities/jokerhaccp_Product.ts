import { StandardEntity } from "./base/sys$StandardEntity";
import { ProductCategory, Storage, StorageTemperature } from "../enums/enums";
import { Supplier } from "./jokerhaccp_Supplier";
export class Product extends StandardEntity {
  static NAME = "jokerhaccp_Product";
  name?: string | null;
  productCategory?: ProductCategory | null;
  unit?: string | null;
  unitPrice?: any | null;
  storage?: Storage | null;
  storageTemperature?: StorageTemperature | null;
  suppliers?: Supplier[] | null;
}
export type ProductViewName = "_minimal" | "_local" | "_base";
export type ProductView<V extends ProductViewName> = V extends "_local"
  ? Pick<
      Product,
      | "id"
      | "name"
      | "productCategory"
      | "unit"
      | "unitPrice"
      | "storage"
      | "storageTemperature"
    >
  : V extends "_base"
  ? Pick<
      Product,
      | "id"
      | "name"
      | "productCategory"
      | "unit"
      | "unitPrice"
      | "storage"
      | "storageTemperature"
    >
  : never;
