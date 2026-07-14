/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends mc {
    int field_s;
    int field_q;
    int field_o;
    int[] field_t;
    int field_u;
    int field_p;
    int field_r;
    static String field_n;

    final static void a(int param0) {
        if (param0 != 18278) {
            dl.a(38);
        }
    }

    final static void a(int param0, ri param1) {
        mm.a(param1, (byte) -71, true);
        if (param0 != 27654) {
            field_n = null;
        }
    }

    public static void c(int param0) {
        if (param0 > -25) {
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        ((dl) this).field_p = param2;
        if (!param5) {
          ((dl) this).field_t = null;
          ((dl) this).field_t = param4;
          ((dl) this).field_s = param0;
          ((dl) this).field_o = param7;
          ((dl) this).field_q = param6;
          ((dl) this).field_r = param3;
          ((dl) this).field_u = param1;
          return;
        } else {
          ((dl) this).field_t = param4;
          ((dl) this).field_s = param0;
          ((dl) this).field_o = param7;
          ((dl) this).field_q = param6;
          ((dl) this).field_r = param3;
          ((dl) this).field_u = param1;
          return;
        }
    }

    dl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Enter multiplayer lobby";
    }
}
