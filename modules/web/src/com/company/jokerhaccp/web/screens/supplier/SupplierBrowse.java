package com.company.jokerhaccp.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.jokerhaccp.entity.Supplier;

@UiController("jokerhaccp_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class SupplierBrowse extends MasterDetailScreen<Supplier> {
}