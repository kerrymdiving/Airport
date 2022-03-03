public class BoardingPass {
    private int row;
    private int seat;

    public BoardingPass(int row, int seat) {
        this.row = row;
        this.seat = seat;
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public int[] createBoardingPass() {
        return new int[] {row, seat};
    }
}
