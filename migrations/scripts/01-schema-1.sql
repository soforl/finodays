CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE lessons (
                            id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
                            header text,
                            text text,
                            author text,
                            attribute text
);