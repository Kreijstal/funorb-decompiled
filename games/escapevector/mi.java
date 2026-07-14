/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends hg {
    int[] field_p;
    int field_h;
    int field_i;
    static cn field_l;
    int field_r;
    int field_n;
    static String field_j;
    int field_q;
    static int[] field_k;
    int field_o;
    static int field_g;
    static ed[] field_m;

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int[] param6, int param7) {
        if (param1 != 29) {
          return;
        } else {
          ((mi) this).field_q = param7;
          ((mi) this).field_n = param2;
          ((mi) this).field_h = param0;
          ((mi) this).field_r = param3;
          ((mi) this).field_i = param5;
          ((mi) this).field_p = param6;
          ((mi) this).field_o = param4;
          return;
        }
    }

    final static void a(int param0, String param1, String param2) {
        jh.a(false, param2, false, param1);
        if (param0 != 0) {
            field_k = null;
        }
    }

    final static String a(byte[] param0, int param1) {
        if (param1 <= 109) {
            return null;
        }
        return qi.a(param0.length, 0, param0, (byte) -109);
    }

    public static void a(byte param0) {
        field_l = null;
        field_j = null;
        field_m = null;
        if (param0 <= 65) {
            field_m = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    mi() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "You have <%0> unread messages!";
        field_l = new cn();
    }
}
