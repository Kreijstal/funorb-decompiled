/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ni {
    static int field_a;
    static String field_b;

    final static boolean a(int param0, int param1) {
        if (param1 != 11764) {
          return false;
        }
        if (ke.field_X[param0]) {
          return true;
        }
        if (!d.a(param0, cm.field_o, (byte) 68)) {
          return false;
        }
        return true;
    }

    abstract byte[] a(int param0);

    public static void a(byte param0) {
        int var1 = -11 % ((-37 - param0) / 60);
        field_b = null;
    }

    abstract void a(byte param0, byte[] param1);

    static {
        field_a = 38;
        field_b = "Press <img=20> to continue.";
    }
}
