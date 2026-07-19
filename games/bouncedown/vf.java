/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            ng var2 = (ng) null;
            vf.a(1, (ng) null, false, true, -94);
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        var5 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 == -13891) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (param1 <= 0) {
                break L2;
              } else {
                if (param1 < 128) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (160 > param1) {
                break L3;
              } else {
                if (param1 > 255) {
                  break L3;
                } else {
                  return true;
                }
              }
            }
            L4: {
              if (0 == param1) {
                break L4;
              } else {
                var6 = sa.field_j;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var3 >= var6.length) {
                    break L4;
                  } else {
                    var4 = var6[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2_ref), "vf.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static void a(int param0, ng param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              tc.field_r[0] = la.field_C.nextInt();
              tc.field_r[1] = la.field_C.nextInt();
              tc.field_r[3] = (int)qa.field_i;
              tc.field_r[2] = (int)(qa.field_i >> 348015584);
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
              if (param4 < -1) {
                break L2;
              } else {
                field_a = (String) null;
                break L2;
              }
            }
            L3: {
              var5_int = hh.field_p.field_h;
              hh.field_p.b(nb.field_f, (byte) -128);
              hh.field_p.a(252186072, mb.field_s);
              var6 = 0;
              if (ba.field_B) {
                var6 = var6 | 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!tc.field_t) {
                break L4;
              } else {
                var6 = var6 | 4;
                break L4;
              }
            }
            L5: {
              if (param3) {
                var6 = var6 | 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (mc.field_d == null) {
                break L6;
              } else {
                var6 = var6 | 16;
                break L6;
              }
            }
            L7: {
              hh.field_p.a(var6, (byte) 104);
              var7 = uj.a(true, vi.b(0));
              if (var7 != null) {
                break L7;
              } else {
                var7 = "";
                break L7;
              }
            }
            L8: {
              hh.field_p.a(-256, var7);
              if (null == mc.field_d) {
                break L8;
              } else {
                hh.field_p.a(mc.field_d, (byte) -67);
                break L8;
              }
            }
            f.a(dh.field_b, false, hh.field_p, lb.field_g, ja.field_a);
            hh.field_p.c(-100, -var5_int + hh.field_p.field_h);
            jj.a(-1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("vf.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = "Unfortunately we are unable to create an account for you at this time.";
    }
}
