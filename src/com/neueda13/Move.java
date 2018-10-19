package com.neueda13;

public class Move {

    public static boolean isMoveValid(GameBoard gameBoard, PieceType pieceType, Position moveTo) {
        /**
         * Use gameboard state to determine if a pieceType can move to position moveTo
         * Return true if move is valid
         */

        switch(pieceType) {
            case PAWN:
                //todo TASK
                break;

            case KNIGHT:
                //todo TASK
                break;

            case ROOK:
                //todo TASK
                break;

            case BISHOP:
                //todo TASK
                break;

            case QUEEN:
                // todo TASK
                break;

            case KING:
                // todo TASK
                break;

        }
        return false;
    }

    public void updatePosition(Piece piece, Position newPosition) {
        // todo
    }
}
