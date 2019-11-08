USE Book
GO
/*Tao ban khach hang(MaKH la so CMND)*/
CREATE TABLE KhachHang
(
	MaKH nvarchar(20),
	HoTen nvarchar(50),
	SDT nvarchar(20),
	PRIMARY KEY (MaKH)	
)
/*Tao ban don hang(Ma don hang la so nguyen tu dong tang)*/
GO
CREATE TABLE DonHang
(
	MaDH INT IDENTITY(1,1),
	MaKH nvarchar(20),
	NgayMuon Date,
	NgayTra Date,
	ThanhTien INT,
	TienPhat INT,
	TinhTrang BIT,
	PRIMARY KEY (MaDH),
	FOREIGN KEY (MaKH) references KhachHang
)
/*Tao ban sach(Ma sach la so nguyen tu dong tang)*/
GO
CREATE TABLE Sach
(
	MaS INT IDENTITY(1,1),
	TenSach nvarchar(100),
	GiaSach INT,
	SLS INT,
	PRIMARY KEY(MaS)
)
/*Tao ban DH-Sach the hien moi quen he nhieu nhieu*/
GO
CREATE TABLE DH_SACH
(
	MaDH INT,
	MaS INT,
	SLM INT,
	PRIMARY KEY (MaDH, MaS),
	FOREIGN KEY (MaDH) references DonHang,
	FOREIGN KEY (MaS) references Sach
)