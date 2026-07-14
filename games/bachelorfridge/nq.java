/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends bw {
    int field_f;
    static String field_h;
    int field_g;

    final ad a(int param0, gj param1) {
        if (param0 != -27449) {
          ((nq) this).field_f = -111;
          return param1.field_o[((nq) this).field_g][((nq) this).field_f];
        } else {
          return param1.field_o[((nq) this).field_g][((nq) this).field_f];
        }
    }

    final aga a(int param0, op param1) {
        aga var3 = null;
        if (param0 <= 7) {
          nq.c((byte) -65);
          var3 = param1.field_S[((nq) this).field_g].field_b[((nq) this).field_f];
          return var3;
        } else {
          var3 = param1.field_S[((nq) this).field_g].field_b[((nq) this).field_f];
          return var3;
        }
    }

    public static void c(byte param0) {
        if (param0 != -115) {
            return;
        }
        field_h = null;
    }

    nq(aga param0) {
        this(param0.field_D, param0.field_u);
    }

    nq(int param0, int param1) {
        ((nq) this).field_f = param1;
        ((nq) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "You do not have a suitable number of players for the current options.";
    }
}
