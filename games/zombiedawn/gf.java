/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_c;
    static sm field_b;
    static boolean field_a;

    final static boolean a(int[] param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        bg var5_ref_bg = null;
        int var5 = 0;
        int var6_int = 0;
        bg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = ZombieDawn.field_J;
        try {
          if (ic.field_T == df.field_j) {
            L0: {
              L1: {
                var2_int = 0;
                var3 = pd.a(-22826);
                if (jh.field_h == 0) {
                  break L1;
                } else {
                  if (l.field_e >= 0) {
                    break L1;
                  } else {
                    var5_ref_bg = (bg) (Object) ui.field_f.b((byte) 26);
                    if (var5_ref_bg == null) {
                      break L0;
                    } else {
                      if (var5_ref_bg.field_h < var3) {
                        var5_ref_bg.b(-27598);
                        jd.field_b = var5_ref_bg.field_m.length;
                        fj.field_g.field_j = 0;
                        var6_int = 0;
                        L2: while (true) {
                          if (~var6_int <= ~jd.field_b) {
                            em.field_U = wb.field_t;
                            wb.field_t = e.field_P;
                            e.field_P = l.field_d;
                            l.field_d = var5_ref_bg.field_j;
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            return stackIn_13_0 != 0;
                          } else {
                            fj.field_g.field_h[var6_int] = var5_ref_bg.field_m[var6_int];
                            var6_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              break L0;
            }
            L3: while (true) {
              L4: {
                if (0 <= l.field_e) {
                  break L4;
                } else {
                  fj.field_g.field_j = 0;
                  if (!ck.a((byte) -117, 1)) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  } else {
                    l.field_e = fj.field_g.i((byte) 126);
                    fj.field_g.field_j = 0;
                    jd.field_b = param0[l.field_e];
                    break L4;
                  }
                }
              }
              int discarded$1 = -2887;
              if (!nn.a()) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                if (0 != jh.field_h) {
                  L5: {
                    var5 = jh.field_h;
                    if (ca.field_a != 0.0) {
                      var5 = (int)((double)var5 + p.field_b.nextGaussian() * ca.field_a);
                      if (var5 < 0) {
                        var5 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var6 = new bg((long)var5 + var3, l.field_e, new byte[jd.field_b]);
                  var7 = 0;
                  L6: while (true) {
                    if (jd.field_b <= var7) {
                      ui.field_f.a(0, (le) (Object) var6);
                      l.field_e = -1;
                      continue L3;
                    } else {
                      var6.field_m[var7] = fj.field_g.field_h[var7];
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  em.field_U = wb.field_t;
                  wb.field_t = e.field_P;
                  e.field_P = l.field_d;
                  l.field_d = l.field_e;
                  l.field_e = -1;
                  stackOut_26_0 = 1;
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0 != 0;
                }
              }
            }
          } else {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var2;
            stackOut_37_1 = new StringBuilder().append("gf.D(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L7;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L7;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + 44 + 41);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = ni.a(param1.length, 0, 127, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gf.E(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final static vn a(dj param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param2 == 8) {
              var4_int = param0.a(param3, (byte) 8);
              var5 = param0.a(var4_int, param1, true);
              int discarded$2 = -2;
              stackOut_3_0 = hg.a(var5, var4_int, param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("gf.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a() {
        ig.m((byte) -102);
        mp.field_e = true;
        nm.field_c = true;
        e.field_S.j(-636330975);
        ti.a(tg.field_a, false, false);
    }

    final static int a(int param0) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (param0 > 0) {
            var2 = 1;
            if (!(param0 <= 65535)) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(15 >= param0)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(param0 <= 3)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (1 < param0) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        int var3 = 1;
        if (!(param0 >= -65536)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (param0 < -2) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 2;
        field_b = new sm();
        field_a = false;
    }
}
