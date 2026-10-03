/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static int[] field_b;
    static String field_a;

    static long andLong(long left, long right) {
        return left & right;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > -59) {
            return;
        }
        field_b = null;
    }

    final int a(byte param0, long param1) {
        long var4 = this.a((byte) -49);
        if (!(0L >= var4)) {
            bc.sleepMillis(0, var4);
        }
        if (param0 == -6) {
            return this.a(true, param1);
        }
        return -30;
    }

    abstract void a(int param0);

    abstract long a(byte param0);

    abstract int a(boolean param0, long param1);

    static {
    }
}
