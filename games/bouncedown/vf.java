/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_a;

    public static void a() {
        field_a = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (160 > param1) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (0 == param1) {
                break L3;
              } else {
                var6 = sa.field_j;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L4;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    }
                  }
                }
              }
            }
            stackOut_16_0 = 0;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2_ref, "vf.A(" + -13891 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static void a(int param0, ng param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            L1: {
              tc.field_r[0] = la.field_C.nextInt();
              tc.field_r[1] = la.field_C.nextInt();
              tc.field_r[3] = (int)qa.field_i;
              tc.field_r[2] = (int)(qa.field_i >> 32);
              lb.field_g.field_h = 0;
              lb.field_g.b(tc.field_r[0], (byte) 48);
              lb.field_g.b(tc.field_r[1], (byte) -105);
              lb.field_g.b(tc.field_r[2], (byte) 74);
              lb.field_g.b(tc.field_r[3], (byte) 87);
              sb.a(lb.field_g, (byte) 25);
              lb.field_g.e(-750655096, param0);
              param1.a(false, lb.field_g);
              hh.field_p.field_h = 0;
              if (!param2) {
                hh.field_p.a(16, (byte) 105);
                break L1;
              } else {
                hh.field_p.a(18, (byte) 58);
                break L1;
              }
            }
            L2: {
              hh.field_p.field_h = hh.field_p.field_h + 2;
              var5_int = hh.field_p.field_h;
              hh.field_p.b(nb.field_f, (byte) -128);
              hh.field_p.a(252186072, mb.field_s);
              var6 = 0;
              if (ba.field_B) {
                var6 = var6 | 1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!tc.field_t) {
                break L3;
              } else {
                var6 = var6 | 4;
                break L3;
              }
            }
            L4: {
              if (param3) {
                var6 = var6 | 8;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (mc.field_d == null) {
                break L5;
              } else {
                var6 = var6 | 16;
                break L5;
              }
            }
            L6: {
              hh.field_p.a(var6, (byte) 104);
              var7 = uj.a(true, vi.b(0));
              if (var7 != null) {
                break L6;
              } else {
                var7 = "";
                break L6;
              }
            }
            L7: {
              hh.field_p.a(-256, var7);
              if (null == mc.field_d) {
                break L7;
              } else {
                hh.field_p.a(mc.field_d, (byte) -67);
                break L7;
              }
            }
            f.a(dh.field_b, false, (wi) (Object) hh.field_p, lb.field_g, ja.field_a);
            hh.field_p.c(-100, -var5_int + hh.field_p.field_h);
            jj.a(-1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("vf.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + -93 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately we are unable to create an account for you at this time.";
    }
}
