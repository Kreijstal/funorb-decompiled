/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends dg {
    private int field_C;
    private String field_G;
    static int field_H;
    private boolean field_A;
    static int field_E;
    private int field_I;
    private int field_B;
    private bd field_F;
    static int field_D;

    final static void d(boolean param0) {
        ma var1 = null;
        ma var1_ref = null;
        if (param0) {
          return;
        } else {
          L0: {
            var1 = (ma) (Object) mb.field_b.c((byte) -111);
            if (var1 == null) {
              var1_ref = new ma();
              break L0;
            } else {
              break L0;
            }
          }
          var1_ref.a(543992579, ti.field_f, ti.field_b, ti.field_e, ti.field_a, ti.field_c, ti.field_i, ti.field_l);
          dd.field_g.b(-105, (gg) (Object) var1_ref);
          return;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = param3 + ((kg) this).field_w;
        int var6 = param2 + ((kg) this).field_k;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        int var7 = ((kg) this).field_A ? -(((kg) this).field_C * 2) + ((kg) this).field_p - ((kg) this).field_I : 0;
        int discarded$0 = ((kg) this).field_F.a(((kg) this).field_G, var5 - -var7 - -((kg) this).field_C, ((kg) this).field_C + var6, -((kg) this).field_C + ((kg) this).field_I, ((kg) this).field_t - ((kg) this).field_C * 2, ((kg) this).field_B, -1, !((kg) this).field_A ? 2 : 0, 1, ((kg) this).field_F.field_N);
    }

    final static void a(int param0, af param1, boolean param2) {
        ha var3 = pg.field_fb;
        var3.f(param0, 950);
        var3.a(param2, 2);
        var3.a(param2, 0);
        var3.a(false, param1.field_p);
    }

    final String d(int param0) {
        int var2 = ((kg) this).field_y.field_q ? 1 : 0;
        ((kg) this).field_y.field_q = ((kg) this).field_q;
        String var3 = ((kg) this).field_y.d(param0);
        ((kg) this).field_y.field_q = var2 != 0 ? true : false;
        return var3;
    }

    final static boolean e(boolean param0) {
        if (param0) {
            return true;
        }
        return qe.field_o;
    }

    kg(int param0, int param1, int param2, int param3, rj param4, boolean param5, int param6, int param7, bd param8, int param9, String param10) {
        super(param0, param1, param2, param3, (uk) null, (lf) null);
        ((kg) this).field_C = param7;
        ((kg) this).field_F = param8;
        ((kg) this).field_G = param10;
        ((kg) this).field_A = param5 ? true : false;
        ((kg) this).field_B = param9;
        ((kg) this).field_I = param6;
        ((kg) this).field_y = param4;
        int var12 = -((kg) this).field_C + ((kg) this).field_I;
        int var13 = ((kg) this).field_F.b(param10, var12, ((kg) this).field_F.field_N) + ((kg) this).field_C * 2;
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((kg) this).b(param2, param0, param1, var13, 23987);
        }
        int var14 = ((kg) this).field_A ? 0 : ((kg) this).field_I - -(2 * ((kg) this).field_C);
        ((kg) this).field_y.b(param2 + -((kg) this).field_I - ((kg) this).field_C * 3, var14, (-param3 + var13 >> -284065791) + ((kg) this).field_C, param3 + -(((kg) this).field_C * 2), 23987);
    }

    static {
    }
}
