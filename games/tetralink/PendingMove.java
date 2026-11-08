/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingMove {
    int field_b;
    static ScrollPane field_d;
    int field_f;
    static int[][] field_e;
    static int[] field_c;
    static int field_a;

    public static void releaseStatics(int param0) {
        if (param0 == 480) {
          field_c = null;
          field_d = null;
          field_e = (int[][]) null;
          return;
        }
        PendingMove.createFrameClock((byte) -77);
        field_c = null;
        field_d = null;
        field_e = (int[][]) null;
    }

    final static GameClock createFrameClock(byte param0) {
        if (param0 < 48) {
          PendingMove.releaseStatics(-128);
          return (GameClock) ((Object) new NanoTickClock());
        }
        return (GameClock) ((Object) new NanoTickClock());
    }

    PendingMove(int param0, int param1, int param2) {
        this.field_f = param1;
        this.field_b = param0;
    }

    static {
        field_a = 480;
    }
}
