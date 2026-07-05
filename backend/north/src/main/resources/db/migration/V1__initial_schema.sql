CREATE TABLE app_user (
    id            UUID PRIMARY KEY,
    email         VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    name          VARCHAR(255) NOT NULL,
    last_name     VARCHAR(255) NOT NULL,
    birthday      DATE         NOT NULL
);

CREATE TABLE telos (
    id           UUID PRIMARY KEY,
    user_id      UUID         NOT NULL REFERENCES app_user (id),
    name         VARCHAR(255) NOT NULL,
    description  VARCHAR(255),
    time_horizon VARCHAR(255) NOT NULL,
    priority     VARCHAR(255) NOT NULL
);

CREATE TABLE event (
    id          UUID PRIMARY KEY,
    user_id     UUID                     NOT NULL REFERENCES app_user (id),
    telos_id    UUID REFERENCES telos (id),
    text        VARCHAR(255)             NOT NULL,
    occurred_at TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE INDEX idx_telos_user_id ON telos (user_id);
CREATE INDEX idx_event_user_id ON event (user_id);
CREATE INDEX idx_event_telos_id ON event (telos_id);
