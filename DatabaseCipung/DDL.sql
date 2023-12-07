CREATE DATABASE cipungSquad
USE cipungSquad

CREATE TABLE Transaksi (
	invoice CHAR(16) PRIMARY KEY,
	tanggal VARCHAR(10),
	kasir VARCHAR(50), 
	pelanggan VARCHAR(50),
	item int,
	total_transaksi int,
	dibayar int,
	kembalian int,
)

CREATE TABLE Barang (
	id_barang CHAR(4) PRIMARY KEY,
    nama_barang VARCHAR(50),
    harga_satuan INT,
	kategori VARCHAR(10)
)

CREATE TABLE Transaksi_Barang (
    invoice CHAR(16),
	id_barang CHAR(4),
    nama_barang VARCHAR(50),
    jumlah INT,
    sub_total INT,
    disc INT,
    PRIMARY KEY (invoice, id_barang),
    FOREIGN KEY (invoice) REFERENCES Transaksi(invoice),
    FOREIGN KEY (id_barang) REFERENCES Barang(id_barang)
)

CREATE TABLE keranjang (
	invoice CHAR(16),
	nama_barang VARCHAR(50),
	kategori VARCHAR(10),
	jumlah INT,
	harga_satuan INT,
	sub_total INT
)

CREATE TABLE kasir(
	nama VARCHAR(30),
	nick_name VARCHAR(10),
	username CHAR(15),
	pass VARCHAR(15),
	saldo int
)

CREATE TABLE kasirSkrg(
	nama VARCHAR(30),
	nick_name VARCHAR(10),
	username CHAR(15),
	pass VARCHAR(15),
	saldo int
)

CREATE TABLE nota (
	invoice CHAR(16),
	tanggal VARCHAR(10),
	kasir VARCHAR(50), 
	pelanggan VARCHAR(50),
	item int,
	total_transaksi int,
	dibayar int,
	disc INT,
	kembalian int
)


CREATE TABLE barangPilih (
	id_barang CHAR(4),
    nama_barang VARCHAR(50),
    harga_satuan INT,
	kategori VARCHAR(10)
)