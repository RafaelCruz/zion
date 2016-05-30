package br.com.henriqueso.zion.piece;

import java.util.List;

import br.com.henriqueso.zion.board.ChessBoard;
import br.com.henriqueso.zion.board.Position;

public class Rook extends ChessPiece {

	@Override
	public List<Position> threatens(ChessBoard chessBoard) {
		List<Position> threatened = new ArrayList<>();
		
		Position newPosition = null;
		
		for(int row = 0; row <= chessBoard.getRows; row++) {
			newPosition = top(row);
			if(chessBoard.isValidPosition(newPosition)) {
				threatened.add(newPosition);
			}
		}
		
		for(int row = 0; row <= chessBoard.getRows; row++) {
			newPosition = bottom(row);
			if(chessBoard.isValidPosition(newPosition)) {
				threatened.add(newPosition);
			}
		}
		
		for(int column = 0; column <= chessBoard.getColumns; column++) {
			newPosition = left(column);
			if(chessBoard.isValidPosition(newPosition)) {
				threatened.add(newPosition);
			}
		}
		
		for(int column = 0; column <= chessBoard.getColumns; column++) {
			newPosition = right(column);
			if(chessBoard.isValidPosition(newPosition)) {
				threatened.add(newPosition);
			}
		}
		
		return threatened;
	}
	
	private Position top(int up) {
		int threatenedX = getPosition().getX();
		int threatenedY = getPosition().getY() + up;
		
		return new Position(threadtenedX, threatenedY);
	}
	
	private Position bottom(int down) {
		int threatenedX = getPosition().getX();
		int threatenedY = getPosition().getY() - bottom;
		
		return new Position(threadtenedX, threatenedY);
	}
	
	private Position left(int left) {
		int threatenedX = getPosition().getX() - left;
		int threatenedY = getPosition().getY();
		
		return new Position(threadtenedX, threatenedY);
	}
	
	private Position right(int right) {
		int threatenedX = getPosition().getX() + right;
		int threatenedY = getPosition().getY();
		
		return new Position(threadtenedX, threatenedY);
	}

	@Override
	public String toString() {
		return "R";
	}
}
