import { StandardEntity } from "./base/sys$StandardEntity";
import { Supplier } from "./jokerhaccp_Supplier";
export class Contact extends StandardEntity {
  static NAME = "jokerhaccp_Contact";
  name?: string | null;
  surname?: string | null;
  phone?: string | null;
  personalEmailAddress?: string | null;
  note?: string | null;
  supplier?: Supplier | null;
}
export type ContactViewName = "_minimal" | "_local" | "_base";
export type ContactView<V extends ContactViewName> = V extends "_local"
  ? Pick<
      Contact,
      "id" | "name" | "surname" | "phone" | "personalEmailAddress" | "note"
    >
  : V extends "_base"
  ? Pick<
      Contact,
      "id" | "name" | "surname" | "phone" | "personalEmailAddress" | "note"
    >
  : never;
