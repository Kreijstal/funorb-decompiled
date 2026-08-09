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
            field_E = (mp) null;
        }
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 493 + (param2 + (8 - (-2 + -param1)));
              mp.field_Qb.a(ag.field_I.field_ob - 6, param5 ^ -20499, -6 + var6_int, 3, 3);
              var7 = mp.field_Qb.field_ob + -5;
              if (param5 == 1) {
                break L1;
              } else {
                mw.g(78);
                break L1;
              }
            }
            L2: {
              we.field_f.a(param4, -20500, 2 + (485 + param2 - -param1), -param4 + var7, 5);
              qj.field_z.a(param4, -20500, -rb.field_b.field_gb + (we.field_f.field_gb + -param2), 0, param2);
              var7 = var7 - (2 + param4);
              rb.field_b.a(param4, -20500, rb.field_b.field_gb, 0, param2 + qj.field_z.field_gb);
              vq.field_a.a(5, false, 2 + param2 + (485 - -param1), 2, param1, 5, -5 + var7);
              if (null != aw.field_i) {
                aw.field_i.a(vq.field_a.field_S, vq.field_a.field_gb, vq.field_a.field_ab, param5 ^ 8193, vq.field_a.field_ob);
                break L2;
              } else {
                break L2;
              }
            }
            var8 = -var6_int + (-param2 + ag.field_I.field_gb);
            var9 = var8 / 2;
            var10 = param0 + var9 - -param2;
            var11 = 0;
            var12 = 0;
            L3: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L4: {
                  L5: {
                    if (-6 >= (var12 ^ -1)) {
                      break L5;
                    } else {
                      if (null == gt.field_b[var12]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13 = 3 + var11 * (2 + (-6 + ag.field_I.field_ob)) / (1 + se.field_d);
                  var11++;
                  var7 = 3 + (var11 * (2 + ag.field_I.field_ob - 6) / (se.field_d + 1) - 2 + -var13);
                  if (5 <= var12) {
                    mc.field_f.a(var7, param5 ^ -20499, var8, var13, var6_int);
                    break L4;
                  } else {
                    gt.field_b[var12].a(var7, param5 ^ -20499, var8, var13, var6_int);
                    jj.field_i[var12].a(var7, -20500, -param2 + var9, 0, param2);
                    we.field_g[var12].a(-param3 + (var7 - param3), -20500, param0, param3, var9);
                    bp.field_j[var12].a(-param3 + (-param3 + var7), param5 + -20501, -var10 + (-param2 + var8), param3, var10);
                    break L4;
                  }
                }
                var12++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "mw.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    mw(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -24872) {
                break L1;
              } else {
                mw.e((byte) 60);
                break L1;
              }
            }
            stackIn_3_0 = new nd(ub.a((byte) 123, param1[0].a(param0 ^ -24870)));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mw.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                field_F = (int[]) null;
                break L1;
              }
            }
            var1_int = am.field_K[0];
            var2 = 1;
            L2: while (true) {
              if (am.field_K.length <= var2) {
                break L0;
              } else {
                var3 = am.field_K[var2];
                vm.a(ab.field_c, var2 << -83239484, ab.field_c, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "mw.A(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_F = new int[4096];
        for (var0 = 0; 4096 > var0; var0++) {
            field_F[var0] = ki.a(var0, -111);
        }
    }
}
