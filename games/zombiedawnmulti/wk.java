/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wk extends se implements kh {
    static String field_K;
    static ri field_J;
    static mh field_I;
    private dj field_H;
    static int[] field_L;
    static int field_G;

    public final j a(byte param0) {
        int var2 = 108 / ((param0 - 0) / 43);
        return (j) (Object) ((wk) this).field_H;
    }

    wk(int param0, int param1, int param2, int param3, nl param4) {
        super(param0, param1, param2, param3, param4);
    }

    abstract int j(int param0);

    abstract int g(byte param0);

    abstract int i(int param0);

    abstract boolean a(int param0);

    void a(int param0, dj param1) {
        if (param0 != 3) {
          int discarded$2 = ((wk) this).j(-11);
          ((wk) this).field_H = param1;
          ((wk) this).field_H.field_n = (wk) this;
          return;
        } else {
          ((wk) this).field_H = param1;
          ((wk) this).field_H.field_n = (wk) this;
          return;
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 <= 27) {
            wk.h(-110);
            oe.field_f = param0;
            return;
        }
        oe.field_f = param0;
    }

    public static void h(int param0) {
        field_L = null;
        field_I = null;
        int var1 = 52 % ((-10 - param0) / 50);
        field_J = null;
        field_K = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "No adverts";
        field_L = new int[]{42, 38};
    }
}
