create table user_table (
	user_id SERIAL PRIMARY KEY NOT NULL,
	first_name varchar NOT NULL,
	last_name varchar NOT NULL,
	email varchar NOT NULL,
	user_type varchar NOT NULL
)
