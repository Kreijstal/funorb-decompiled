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

    public static void a(int param0) {
        if (param0 != 540) {
            return;
        }
        field_o = null;
        field_m = null;
        field_l = null;
    }

    final static int a(int param0, int param1) {
        int discarded$1 = 0;
        if (param0 != 7527) {
          discarded$1 = u.a(-49, 96);
          param1--;
          param1 = param1 | param1 >>> -932587423;
          param1 = param1 | param1 >>> -23164702;
          param1 = param1 | param1 >>> 25265156;
          param1 = param1 | param1 >>> 1047914152;
          param1 = param1 | param1 >>> 1832801200;
          return param1 - -1;
        } else {
          param1--;
          param1 = param1 | param1 >>> -932587423;
          param1 = param1 | param1 >>> -23164702;
          param1 = param1 | param1 >>> 25265156;
          param1 = param1 | param1 >>> 1047914152;
          param1 = param1 | param1 >>> 1832801200;
          return param1 - -1;
        }
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        field_o = new java.math.BigInteger("65537");
        field_m = new pb(540, 140);
        field_p = 0;
        field_l = "Passwords must be between 5 and 20 letters and numbers";
    }
}
