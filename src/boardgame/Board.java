package boardgame;

public class Board {
	private Integer rows;
	private Integer colums;
	private Piece[][] pieces;

	public Board(Integer rows, Integer colums) {
		this.rows = rows;
		this.colums = colums;
		this.pieces = new Piece[rows][colums];
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColums() {
		return colums;
	}

	public void setColums(Integer colums) {
		this.colums = colums;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
