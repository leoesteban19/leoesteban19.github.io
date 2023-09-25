USE Bicicleteria;

-- tabla tiposbicicleta
CREATE TABLE TipoBicicleta (
    Codigo INT PRIMARY KEY,
    Descripcion VARCHAR(30) NOT NULL
);

-- datos de tiposbicicleta
INSERT INTO TipoBicicleta (Codigo, Descripcion) VALUES
    (0, 'Sin Bici'),
    (1, 'Paseo'),
    (2, 'Montaña'),
    (3, 'Carrera');

-- tabla bicicletas
CREATE TABLE Bicicleta (
    Codigo INT PRIMARY KEY,
    Marca VARCHAR(50) NOT NULL,
    Modelo VARCHAR(50) NOT NULL,
    Color VARCHAR(50) NOT NULL,
    TipoBicicletaCodigo INT,
	Fabricacion INT
);

-- tabla clientes
CREATE TABLE Cliente (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NOT NULL,
    Telefono VARCHAR(20),
    DNI VARCHAR(20) NOT NULL,
    Domicilio VARCHAR(50) NOT NULL,
    BicicletaCodigo INT,
    FOREIGN KEY (BicicletaCodigo) REFERENCES Bicicleta(Codigo)
);

-- datos
INSERT INTO Bicicleta (Codigo, Marca, Modelo, Color, TipoBicicletaCodigo, Fabricacion) VALUES
    (0 , 'n/a', 'n/a', 'n/a', 'n/a','n/a'),
    (1, 'trek', 'xxx01', 'Rojo', 1, 2019),
    (2, 'canyon', 'xxx02', 'Azul', 2, 2023),
    (3, 'scott', 'xxx03', 'Verde', 3, 2010);

INSERT INTO Cliente (Nombre, Apellido, Telefono, DNI, Domicilio, BicicletaCodigo) VALUES
    ('leonardo', 'sandoval', '123456789', '12345678A', 'CABA', 3),
    ('jose', 'campero', '987654321', '98765432B', 'lanus', 1),
    ('juan', 'rodriguez', NULL, '45678901C', 'banfield', 2),
    ('santiago', 'morales', NULL, '45678901C', 'tigre', 0);

