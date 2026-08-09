/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static int field_b;
    static String field_a;

    final static pm a(ha param0, byte param1) {
        fw var2 = null;
        pm var3 = null;
        pm stackIn_3_0 = null;
        pm stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            if (param0 == im.field_c) {
              stackIn_3_0 = ha.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                L2: {
                  var2 = (fw) ((Object) ar.field_N.a(122, (long)param0.field_a));
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (param0 == var2.field_k) {
                      var3 = var2.field_l;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.b(false);
                    break L3;
                  }
                }
                var3 = new pm(param0);
                ar.field_N.a(new fw(param0, var3), -1, (long)param0.field_a);
                break L1;
              }
              L4: {
                im.field_c = param0;
                ha.field_c = var3;
                if (param1 > 8) {
                  break L4;
                } else {
                  field_b = 38;
                  break L4;
                }
              }
              stackIn_14_0 = (pm) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2_ref);

            stackIn_17_1 = new StringBuilder().append("wq.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final synchronized static long a(int param0) {
        long var1;
        if (param0 < -5) {
          var1 = System.currentTimeMillis();
          if (var1 < sg.field_j) {
            uv.field_n = uv.field_n + (-var1 + sg.field_j);
            sg.field_j = var1;
            return var1 - -uv.field_n;
          } else {
            sg.field_j = var1;
            return var1 - -uv.field_n;
          }
        } else {
          return 4L;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, ki param1) {
        gk stackIn_10_0;
        int stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        gk stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_11_4;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gk var5 = null;
        int[] var6 = null;
        int var7 = 0;
        pl var8 = null;
        int var9 = 0;
        pl var10 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var8 = new pl(param1.a("", "logo.fo3d", -1));
            var10 = var8;
            var3 = var10.e(-31302);
            var10.i((byte) 54);
            au.field_i = ok.a(-126, var10);
            mr.field_b = new gk[var3];
            kh.field_c = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var3 <= var4) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    wq.a(-93);
                    break L2;
                  }
                }
                var10.h((byte) -63);
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    L4: {
                      var5 = mr.field_b[var9];
                      stackIn_10_0 = (gk) (var5);

                      stackIn_10_1 = 6;

                      stackIn_10_2 = 1;

                      stackIn_10_3 = 6;

                      if (param0) {
                        stackIn_11_0 = (gk) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = stackIn_10_3;
                        stackIn_11_4 = 0;
                        break L4;
                      } else {
                        stackIn_11_0 = (gk) ((Object) stackIn_10_0);
                        stackIn_11_1 = stackIn_10_1;
                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = stackIn_10_3;
                        stackIn_11_4 = 1;
                        break L4;
                      }
                    }
                    ((gk) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4 != 0, 6);
                    var5.a(false);
                    var6 = new int[]{var5.field_t + var5.field_T >> -1030714623, var5.field_j - -var5.field_f >> -1414454975, var5.field_P + var5.field_S >> -643307999};
                    kh.field_c[var9] = var6;
                    var5.a(-var6[2], -var6[1], (byte) -81, -var6[0]);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                mr.field_b[var4] = fh.a(var8, -16736);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("wq.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_a = "ALL HISCORES";
    }
}
