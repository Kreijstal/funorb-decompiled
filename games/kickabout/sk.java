/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static int field_c;
    static String field_b;
    static jj field_d;
    static ut[] field_a;

    final static void a(int param0, int param1) {
        ea.a(vt.field_c.field_v, 5, true, 636, param1, -51);
        if (param0 != 1) {
            field_d = null;
        }
    }

    final static int a(byte param0) {
        if (param0 != 97) {
            field_a = null;
            return wd.field_n[0];
        }
        return wd.field_n[0];
    }

    final static void a(boolean param0) {
        fa var1 = null;
        ml var2 = null;
        if (!param0) {
            sk.a(-17, -97, 99);
            var1 = (fa) (Object) nl.field_f.g(24009);
            if (!(var1 != null)) {
                lr.b((byte) -116);
                return;
            }
            var2 = un.field_e;
            int discarded$0 = var2.k(4);
            int discarded$1 = var2.k(4);
            int discarded$2 = var2.k(4);
            int discarded$3 = var2.k(4);
            var1.c((byte) -109);
            return;
        }
        var1 = (fa) (Object) nl.field_f.g(24009);
        if (!(var1 != null)) {
            lr.b((byte) -116);
            return;
        }
        var2 = un.field_e;
        int discarded$4 = var2.k(4);
        int discarded$5 = var2.k(4);
        int discarded$6 = var2.k(4);
        int discarded$7 = var2.k(4);
        var1.c((byte) -109);
    }

    final static void a(int param0, int param1, lv param2) {
        if (param1 != 16586) {
            return;
        }
        np.field_Jb.a((gn) (Object) new i(param0, param2), 3);
    }

    public static void a(int param0) {
        if (param0 != -5514) {
          field_a = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2) {
        long var3 = 0L;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        String var12 = null;
        var3 = nj.a(108);
        if ((var3 ^ -1L) > (ah.field_c ^ -1L)) {
          return;
        } else {
          L0: {
            ah.field_c = var3 + 25L;
            var5 = (float)param2 / (float)param1;
            var6 = (int)(var5 * 100.0f);
            var8 = -80 / ((param0 - 12) / 58);
            var7 = nm.a((byte) -100, field_c);
            var9 = nm.a((byte) -99, field_c + 1);
            var10 = -var7 + var9;
            var11 = var5 * (float)var10 + (float)var7;
            var12 = no.field_K[field_c];
            if (var12 != null) {
              var12 = var12 + " - " + var6 + "%";
              break L0;
            } else {
              break L0;
            }
          }
          ju.a(var11, var12, (byte) 30);
          nm.field_g.b((byte) 118);
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, ml param4, int param5) {
        if (param0 != 19881) {
          sk.a(22, -23, -9);
          return gl.a(1 << param3, (byte) 123, param2, param5, param4, param3, 1 << param5, 1 << param1, 1 << param2, param1);
        } else {
          return gl.a(1 << param3, (byte) 123, param2, param5, param4, param3, 1 << param5, 1 << param1, 1 << param2, param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_b = "click";
    }
}
