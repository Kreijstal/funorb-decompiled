/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int field_b;
    static String field_a;
    static dd[] field_c;
    static vh field_e;
    static long field_d;

    final static void a(lr param0, boolean param1, di param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        sf var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        di stackIn_6_0 = null;
        di stackIn_7_0 = null;
        di stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_5_0 = null;
        di stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        di stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var3_int = gj.field_S;
            e.field_a = new vh(0L, (vh) null);
            if (param2 == null) {
              var10 = null;
              tc.a((Throwable) null, "QC1", -8555);
              return;
            } else {
              L1: {
                stackOut_5_0 = (di) param2;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (!param1) {
                  stackOut_7_0 = (di) (Object) stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L1;
                } else {
                  stackOut_6_0 = (di) (Object) stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
              }
              stackIn_8_0.field_i = stackIn_8_1 != 0;
              param2.field_k = 0;
              jp.field_N = new ee(var3_int, param2, param2);
              o.field_x = new wh(var3_int, param2, param2, (si) (Object) new wp());
              var4 = nk.c(2);
              if (var4 != null) {
                gp.a((byte) 58, var4);
                var12 = null;
                tp.field_i = id.a(1127256, 0, 0, 4020342, 1513239, 65793, 5138823, 1513239, 65793, (lr) null, 8947848, 2245737, 65793);
                bf.field_c = id.a(0, 0, 16764006, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
                br.field_J = id.a(0, 0, 16777215, 0, 0, 0, 0, 0, 0, param0, 0, 0, 0);
                var5 = qh.field_l;
                var6 = qh.field_f;
                var16 = qh.field_d;
                ue.field_c = new dd(10, 14);
                ue.field_c.e();
                var8 = 2;
                L2: while (true) {
                  if (var8 >= 7) {
                    qh.a(var16, var5, var6);
                    w.field_b = hk.a(br.field_J, bf.field_c, var4, tp.field_i, (byte) 112);
                    e.field_a.field_T = new ko();
                    break L0;
                  } else {
                    qh.b(var8, var8 - -1, 14 + -(var8 << 1), 16777215);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var11 = null;
                tc.a((Throwable) null, "QC2", -8555);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("c.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              if (0 >= param1) {
                stackOut_3_0 = var3_int;
                stackIn_4_0 = stackOut_3_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param0;
                param0 = param0 >>> 1;
                param1--;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "c.D(" + param0 + 44 + param1 + 44 + -87 + 41);
        }
        return stackIn_4_0;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8, int param9, int param10) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        L0: {
          if (0 != param10) {
            break L0;
          } else {
            if (param4 != 0) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        if (~param9 == ~param1) {
          return wh.a(param7, param9, param0, param5, 8, param3, param10, param2, param4, 98);
        } else {
          if (param7 != param3) {
            L1: {
              var11 = -param9 + param1;
              var12 = -param3 + param7;
              var13 = var12;
              var14 = -var11;
              var15 = rf.a(aj.a(var13, false, var13) + aj.a(var14, false, var14), -128);
              int discarded$2 = 0;
              int discarded$3 = 0;
              if (0L < od.a((long)var13, (long)param10) - -od.a((long)var14, (long)param4)) {
                param9 = param9 - lh.a(var15, (byte) -73, (long)(var13 * 8));
                param3 = param3 - lh.a(var15, (byte) -90, (long)(var14 * 8));
                break L1;
              } else {
                param9 = param9 + lh.a(var15, (byte) -95, (long)(var13 * 8));
                param3 = param3 + lh.a(var15, (byte) -111, (long)(8 * var14));
                break L1;
              }
            }
            var16 = aj.a(var11, false, param4) - aj.a(var12, false, param10);
            if (var16 == 0) {
              return -1;
            } else {
              L2: {
                var17 = lh.a(var16, (byte) -82, (long)(aj.a(var12, false, param5 + -param9) + -aj.a(var11, false, -param3 + param2)));
                if (var17 <= 0) {
                  break L2;
                } else {
                  if (var17 <= -param0 + 65536) {
                    var18 = lh.a(var11, (byte) -110, (long)(-param9 + param5 - -aj.a(var17, false, param10)));
                    if (var18 < 0) {
                      break L2;
                    } else {
                      if (var18 > 65536) {
                        break L2;
                      } else {
                        return var17 - -param0;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              return -1;
            }
          } else {
            return cq.a(param3, 8, (byte) -112, param2, param10, param5, param0, param9, param4, param1);
          }
        }
    }

    public static void a() {
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You potted the 8 ball illegally. I will re-spot it for you so you can continue.";
    }
}
