create table ticket (
	ID SERIAL PRIMARY KEY NOT NULL,
	ticket_id UUID NOT NULL,
	created_date Date NOT NULL,
	status varchar NOT NULL,
	issue varchar NOT NULL
)
