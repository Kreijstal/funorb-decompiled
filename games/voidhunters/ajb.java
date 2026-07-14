/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ajb extends ksa {
    int[] field_k;
    int field_j;
    int field_h;
    int field_g;
    static clb field_f;
    int field_i;
    int field_d;
    int field_e;

    final static void a(byte param0, String param1) {
        vda.field_o = param1;
        if (param0 != -74) {
            Object var3 = null;
            ajb.a((byte) 76, (String) null);
        }
    }

    public static void c(byte param0) {
        field_f = null;
        if (param0 != 44) {
            ajb.c((byte) 98);
        }
    }

    final void a(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        ((ajb) this).field_g = param2;
        ((ajb) this).field_e = param5;
        ((ajb) this).field_d = param6;
        ((ajb) this).field_k = param1;
        if (param3 >= -84) {
          ((ajb) this).field_j = -65;
          ((ajb) this).field_i = param0;
          ((ajb) this).field_h = param4;
          ((ajb) this).field_j = param7;
          return;
        } else {
          ((ajb) this).field_i = param0;
          ((ajb) this).field_h = param4;
          ((ajb) this).field_j = param7;
          return;
        }
    }

    ajb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new clb();
    }
}
