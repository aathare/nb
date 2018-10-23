CREATE TABLE acbk
(
  id bigint NOT NULL,
  tdate date,
  drcr character varying(2),
  cashtrf character varying(3),
  prtclr character varying(100),
  acmastcode integer,
  ac_no bigint,
  debit real,
  credit real,
  PRIMARY KEY (id)
);
