import { StandardEntity } from "./base/sys$StandardEntity";
import { SupplierType, ProductCategory } from "../enums/enums";
import { Contact } from "./jokerhaccp_Contact";
export class Supplier extends StandardEntity {
  static NAME = "jokerhaccp_Supplier";
  name?: string | null;
  address?: string | null;
  cap?: string | null;
  city?: string | null;
  province?: string | null;
  country?: string | null;
  vat?: string | null;
  fiscalCode?: string | null;
  phone?: string | null;
  emailAddress?: string | null;
  pec?: string | null;
  sdi?: string | null;
  supplierType?: SupplierType | null;
  productCategory?: ProductCategory | null;
  contacts?: Contact[] | null;
}
export type SupplierViewName = "_minimal" | "_local" | "_base";
export type SupplierView<V extends SupplierViewName> = V extends "_local"
  ? Pick<
      Supplier,
      | "id"
      | "name"
      | "address"
      | "cap"
      | "city"
      | "province"
      | "country"
      | "vat"
      | "fiscalCode"
      | "phone"
      | "emailAddress"
      | "pec"
      | "sdi"
      | "supplierType"
      | "productCategory"
    >
  : V extends "_base"
  ? Pick<
      Supplier,
      | "id"
      | "name"
      | "address"
      | "cap"
      | "city"
      | "province"
      | "country"
      | "vat"
      | "fiscalCode"
      | "phone"
      | "emailAddress"
      | "pec"
      | "sdi"
      | "supplierType"
      | "productCategory"
    >
  : never;
