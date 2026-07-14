/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gca extends bw {
    static qia field_f;
    int field_h;
    static kv field_g;

    void a(int param0, int param1, byte param2) {
        if (param2 != -34) {
            gca.c((byte) -81);
        }
    }

    final static ola a(int param0, lu param1) {
        ola var2 = null;
        if (param0 != 0) {
          gca.c((byte) -1);
          var2 = new ola();
          var2.a((byte) -118, param1);
          return var2;
        } else {
          var2 = new ola();
          var2.a((byte) -118, param1);
          return var2;
        }
    }

    final static void d(byte param0) {
        if (param0 != 124) {
          gca.c((byte) -33);
          iv.b(false);
          hb.a(gi.field_b[0].field_n, gba.field_Bb, he.field_l, rg.field_h, -103, rj.field_j);
          return;
        } else {
          iv.b(false);
          hb.a(gi.field_b[0].field_n, gba.field_Bb, he.field_l, rg.field_h, -103, rj.field_j);
          return;
        }
    }

    gca(int param0) {
        ((gca) this).field_h = param0;
    }

    void a(int param0, byte param1, int param2) {
        if (param1 <= 7) {
            field_f = null;
        }
    }

    public static void c(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 <= 102) {
            gca.c((byte) 111);
        }
    }

    abstract boolean a(boolean param0, boolean param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new qia();
    }
}
