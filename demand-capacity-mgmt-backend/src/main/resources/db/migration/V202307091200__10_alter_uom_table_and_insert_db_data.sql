DROP TABLE IF EXISTS unity_of_measure CASCADE;
DROP TABLE IF EXISTS unit_measure CASCADE;

CREATE TABLE IF NOT EXISTS unit_of_measure
(
    id uuid DEFAULT uuid_generate_v4() primary key ,
    dimension varchar(15),
    un_code varchar(15),
    description varchar(50),
    description_german varchar(50),
    un_symbol varchar(15),
    c_x_symbol varchar(15)
);

INSERT INTO unit_of_measure
    (dimension,un_code, description, description_german, un_symbol, c_x_symbol)
VALUES
 ('Mass','GRM','Gram','Gramm','g','g'),
 ('Mass','KGM','Kilogram','Kilogramm','kg','kg'),
 ('Mass','TNE','Metric ton','Metrische Tonne','t','t'),
 ('Mass','STN','ton (US) - short ton (UK/US)','US Tonne','ton (US)','ton'),
 ('Mass','ONZ','Ounce','Unze','oz','oz'),
 ('Mass','LBR','Pound','Pfund','lb','lb'),
 ('Length','CMT','Centimetre','Zentimeter','cm','cm'),
 ('Length','MTR','Metre','Meter','m','m'),
 ('Length','KTM','Kilometre','Kiometer','km','km'),
 ('Length','INH','Inch','Zoll','in','in'),
 ('Length','FOT','Foot','Fuß','ft','ft'),
 ('Length','YRD','Yard','yard','yd','yd'),
 ('Area','CMK','Square centimetre','Quadrat-zentimeter','cm2','cm2'),
 ('Area','MTK','Square metre','Quadratmeter','m2','m2'),
 ('Area','INK','Square inch','Quadratzoll','in2','in2'),
 ('Area','FTK','Square foot','Quadratfuß','ft2','ft2'),
 ('Area','YDK','Square yard','Quadratyard','yd2','yd2'),
 ('Volume','CMQ','Cubic centimetre','Kubikzentimeter','cm3','cm3'),
 ('Volume','MTQ','Cubic metre','Kubikmeter','m3','m3'),
 ('Volume','INQ','Cubic inch','Kubikzoll','in3','in3'),
 ('Volume','FTQ','Cubic foot','Kubikfuß','ft3','ft3'),
 ('Volume','YDQ','Cubic yard','Kubikyard','yd3','yd3'),
 ('Volume','MLT','Millilitre','Milliliter','ml','ml'),
 ('Volume','LTR','Litre','Liter','l','l'),
 ('Volume','HLT','Hectolitre','Hektoliter','hl','hl'),
 ('Quantity','H87','Piece','Stück','','pc'),
 ('Quantity','SET','Set','Satz','','set'),
 ('Quantity','PR','Pair','Paar','','pr'),
 ('Quantity','ZP','Page','Blatt','','pg'),
 ('Mechanic','KWH','Kilowatt hour','Kilowattstunde','kW-h','kwh'),
 ('(blank)','','','','','xxx')


