CREATE DATABASE TareaRecordatorioDB;
GO

USE TareaRecordatorioDB;
GO

CREATE TABLE TareaRecordatorio
(
    TareaID INT IDENTITY(1,1) PRIMARY KEY,
    Titulo NVARCHAR(100) NOT NULL,
    Descripcion NVARCHAR(MAX) NOT NULL,
    FechaTarea DATE NOT NULL,
    Estado NVARCHAR(50) NOT NULL,
    RepetirDiariamente VARCHAR(10) CHECK (RepetirDiariamente IN ('true', 'false')) NOT NULL
);
GO

INSERT INTO TareaRecordatorio
    (Titulo, Descripcion, FechaTarea, Estado, RepetirDiariamente)
VALUES
    ('Limpieza semanal', 'Hacer limpieza general de escritorio cada viernes', '2025-07-04', 'En progreso', 0),
    ('Pago de servicios', 'Pagar factura de electricidad y agua', '2025-07-05', 'Pendiente', 0),
    ('Ejercicio matutino', 'Hacer 30 minutos de ejercicio al despertar', '2025-07-01', 'En progreso', 1),
    ('Reuni�n equipo', 'Reuni�n diaria de seguimiento con el equipo', '2025-07-02', 'Pendiente', 1);
GO

SELECT *
FROM TareaRecordatorio;
GO
