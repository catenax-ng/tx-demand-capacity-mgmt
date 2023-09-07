ALTER TABLE IF EXISTS demand_category ADD COLUMN description varchar(200);

INSERT INTO demand_category
    (demand_category_code, demand_category_name, description)
VALUES
    ('0001','Default','No Assignement'),
    ('A1S1','After-Sales','After sales demand of spare parts'),
    ('SR99','Series','Dependent demand, production, assembly, raw material'),
    ('PI01','Phase-In-period','Ramp up of a new product or new material introduction'),
    ('OS01','Single-Order','Demand outside the normal spectrum of supply'),
    ('OI01','Small series','Short time frame for demand and pose to higher volatility'),
    ('ED01','Extraordinary demand','Temporary demand on top of standard demand'),
    ('PO01','Phase-Out-period','Ramp down. Product or material retires from the market')

