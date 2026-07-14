/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mw extends dr {
    static int[] field_F;
    static mp field_E;

    public static void g(int param0) {
        field_F = null;
        field_E = null;
        if (param0 != 12600) {
            field_E = null;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        L0: {
          var14 = ArmiesOfGielinor.field_M ? 1 : 0;
          var6 = 493 + (param2 + (8 - (-2 + -param1)));
          mp.field_Qb.a(ag.field_I.field_ob - 6, param5 ^ -20499, -6 + var6, 3, 3);
          var7 = mp.field_Qb.field_ob + -5;
          if (param5 == 1) {
            break L0;
          } else {
            mw.g(78);
            break L0;
          }
        }
        L1: {
          we.field_f.a(param4, -20500, 2 + (485 + param2 - -param1), -param4 + var7, 5);
          qj.field_z.a(param4, -20500, -rb.field_b.field_gb + (we.field_f.field_gb + -param2), 0, param2);
          var7 = var7 - (2 + param4);
          rb.field_b.a(param4, -20500, rb.field_b.field_gb, 0, param2 + qj.field_z.field_gb);
          vq.field_a.a(5, false, 2 + param2 + (485 - -param1), 2, param1, 5, -5 + var7);
          if (null != aw.field_i) {
            aw.field_i.a(vq.field_a.field_S, vq.field_a.field_gb, vq.field_a.field_ab, param5 ^ 8193, vq.field_a.field_ob);
            break L1;
          } else {
            break L1;
          }
        }
        var8 = -var6 + (-param2 + ag.field_I.field_gb);
        var9 = var8 / 2;
        var10 = param0 + var9 - -param2;
        var11 = 0;
        var12 = 0;
        L2: while (true) {
          if (var12 >= 6) {
            return;
          } else {
            L3: {
              if (-6 >= (var12 ^ -1)) {
                break L3;
              } else {
                if (null != gt.field_b[var12]) {
                  break L3;
                } else {
                  var12++;
                  continue L2;
                }
              }
            }
            var13 = 3 + var11 * (2 + (-6 + ag.field_I.field_ob)) / (1 + se.field_d);
            var11++;
            var7 = 3 + (var11 * (2 + ag.field_I.field_ob - 6) / (se.field_d + 1) - 2 + -var13);
            if (5 <= var12) {
              mc.field_f.a(var7, param5 ^ -20499, var8, var13, var6);
              var12++;
              continue L2;
            } else {
              gt.field_b[var12].a(var7, param5 ^ -20499, var8, var13, var6);
              jj.field_i[var12].a(var7, -20500, -param2 + var9, 0, param2);
              we.field_g[var12].a(-param3 + (var7 - param3), -20500, param0, param3, var9);
              bp.field_j[var12].a(-param3 + (-param3 + var7), param5 + -20501, -var10 + (-param2 + var8), param3, var10);
              var12++;
              continue L2;
            }
          }
        }
    }

    mw(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        if (param0 != -24872) {
            mw.e((byte) 60);
        }
        return new nd((Object) (Object) ub.a((byte) 123, param1[0].a(param0 ^ -24870)));
    }

    final static void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -63) {
            field_F = null;
        }
        int var1 = am.field_K[0];
        for (var2 = 1; am.field_K.length > var2; var2++) {
            var3 = am.field_K[var2];
            vm.a(ab.field_c, var2 << -83239484, ab.field_c, var1, var3);
            var1 = var1 + var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_F = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_F[var0] = ki.a(var0, -111);
        }
    }
}
