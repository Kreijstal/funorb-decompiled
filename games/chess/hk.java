/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends wc {
    static String field_L;
    static String field_N;
    static int field_H;
    static byte[][] field_K;
    static int field_M;
    static String field_J;
    static int field_I;

    hk(int param0) {
        this(rb.field_b, param0);
    }

    final String a(int param0, mf param1) {
        if (param0 != -29558) {
          field_J = null;
          return a.a((byte) 113, '*', param1.field_v.length());
        } else {
          return a.a((byte) 113, '*', param1.field_v.length());
        }
    }

    public static void c(byte param0) {
        field_N = null;
        field_J = null;
        field_L = null;
        if (param0 != -42) {
            return;
        }
        field_K = null;
    }

    final static km[] a(int param0, int param1, int param2, int param3) {
        if (param1 != 1) {
          field_J = null;
          return sc.a(param2, 121, param3, 1, param0);
        } else {
          return sc.a(param2, 121, param3, 1, param0);
        }
    }

    private hk(lh param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "This game is full.";
        field_N = "You have withdrawn your request to join.";
        field_J = "Offer unrated rematch";
        field_K = new byte[1000][];
        field_I = 640;
    }
}
