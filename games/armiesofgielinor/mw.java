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
        RuntimeException var6 = null;
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
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = 493 + (param2 + (8 - (-2 + -param1)));
              mp.field_Qb.a(ag.field_I.field_ob - 6, -20500, -6 + var6_int, 3, 3);
              var7 = mp.field_Qb.field_ob + -5;
              we.field_f.a(param4, -20500, 2 + (485 + param2 - -param1), -param4 + var7, 5);
              qj.field_z.a(param4, -20500, -rb.field_b.field_gb + (we.field_f.field_gb + -param2), 0, param2);
              var7 = var7 - (2 + param4);
              rb.field_b.a(param4, -20500, rb.field_b.field_gb, 0, param2 + qj.field_z.field_gb);
              vq.field_a.a(5, false, 2 + param2 + (485 - -param1), 2, param1, 5, -5 + var7);
              if (null != aw.field_i) {
                aw.field_i.a(vq.field_a.field_S, vq.field_a.field_gb, vq.field_a.field_ab, 8192, vq.field_a.field_ob);
                break L1;
              } else {
                break L1;
              }
            }
            var8 = -var6_int + (-param2 + ag.field_I.field_gb);
            var9 = var8 / 2;
            var10 = param0 + var9 - -param2;
            var11 = 0;
            var12 = 0;
            L2: while (true) {
              if (var12 >= 6) {
                break L0;
              } else {
                L3: {
                  L4: {
                    if (var12 >= 5) {
                      break L4;
                    } else {
                      if (null == gt.field_b[var12]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var13 = 3 + var11 * (2 + (-6 + ag.field_I.field_ob)) / (1 + se.field_d);
                  var11++;
                  var7 = 3 + (var11 * (2 + ag.field_I.field_ob - 6) / (se.field_d + 1) - 2 + -var13);
                  if (5 <= var12) {
                    mc.field_f.a(var7, -20500, var8, var13, var6_int);
                    break L3;
                  } else {
                    gt.field_b[var12].a(var7, -20500, var8, var13, var6_int);
                    jj.field_i[var12].a(var7, -20500, -param2 + var9, 0, param2);
                    we.field_g[var12].a(-param3 + (var7 - param3), -20500, param0, param3, var9);
                    bp.field_j[var12].a(-param3 + (-param3 + var7), -20500, -var10 + (-param2 + var8), param3, var10);
                    break L3;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var6, "mw.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 1 + 41);
        }
    }

    mw(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_2_0 = new nd((Object) (Object) ub.a((byte) 123, param1[0].a(param0 ^ -24870)));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mw.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                field_F = null;
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
                vm.a(ab.field_c, var2 << 4, ab.field_c, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "mw.A(" + param0 + 41);
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
