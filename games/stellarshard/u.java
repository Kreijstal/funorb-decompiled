/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends gg {
    static int field_k;
    int field_n;
    static java.math.BigInteger field_o;
    int field_q;
    static pb field_m;
    static int field_p;
    static String field_l;

    public static void a() {
        field_o = null;
        field_m = null;
        field_l = null;
    }

    final static int a(int param0, int param1) {
        if (param0 != 7527) {
          int discarded$1 = u.a(-49, 96);
          param1--;
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 - -1;
        } else {
          param1--;
          param1 = param1 | param1 >>> 1;
          param1 = param1 | param1 >>> 2;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 - -1;
        }
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new java.math.BigInteger("65537");
        field_m = new pb(540, 140);
        field_p = 0;
        field_l = "Passwords must be between 5 and 20 letters and numbers";
    }
}
