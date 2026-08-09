/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_c;
    static sm field_b;
    static boolean field_a;

    final static boolean a(int[] param0, byte param1) {
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        bg var5_ref_bg = null;
        int var5 = 0;
        int var6_int = 0;
        bg var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (ic.field_T == df.field_j) {
              L1: {
                var2_int = 26 % ((-18 - param1) / 33);
                var3 = pd.a(-22826);
                if (jh.field_h == 0) {
                  break L1;
                } else {
                  if (-1 >= (l.field_e ^ -1)) {
                    break L1;
                  } else {
                    var5_ref_bg = (bg) ((Object) ui.field_f.b((byte) 26));
                    if (var5_ref_bg == null) {
                      break L1;
                    } else {
                      if (var5_ref_bg.field_h < var3) {
                        var5_ref_bg.b(-27598);
                        jd.field_b = var5_ref_bg.field_m.length;
                        fj.field_g.field_j = 0;
                        var6_int = 0;
                        L2: while (true) {
                          if (var6_int >= jd.field_b) {
                            em.field_U = wb.field_t;
                            wb.field_t = e.field_P;
                            e.field_P = l.field_d;
                            l.field_d = var5_ref_bg.field_j;
                            stackIn_13_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            fj.field_g.field_h[var6_int] = var5_ref_bg.field_m[var6_int];
                            var6_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (0 <= l.field_e) {
                    break L4;
                  } else {
                    fj.field_g.field_j = 0;
                    if (!ck.a((byte) -117, 1)) {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      l.field_e = fj.field_g.i((byte) 126);
                      fj.field_g.field_j = 0;
                      jd.field_b = param0[l.field_e];
                      break L4;
                    }
                  }
                }
                if (!nn.a(-2887)) {
                  stackIn_24_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
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
                        ui.field_f.a(0, var6);
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
                    stackIn_27_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var2);

            stackIn_39_1 = new StringBuilder().append("gf.D(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_24_0 != 0;
              } else {
                return stackIn_27_0 != 0;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            String var2 = (String) null;
            gf.a((dj) null, (String) null, -54, (String) null);
        }
        field_b = null;
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (String) null;
                gf.a((dj) null, (String) null, 11, (String) null);
                break L1;
              }
            }
            stackIn_3_0 = ni.a(param1.length, 0, param0 + 127, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gf.E(").append(param0).append(',');

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
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static vn a(dj param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        vn stackIn_2_0 = null;
        vn stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 8) {
              var4_int = param0.a(param3, (byte) 8);
              var5 = param0.a(var4_int, param1, true);
              stackIn_4_0 = hg.a(var5, var4_int, param0, -2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vn) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("gf.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0) {
        ig.m((byte) -102);
        if (param0 != 41) {
            field_a = true;
        }
        mp.field_e = true;
        nm.field_c = true;
        e.field_S.j(-636330975);
        ti.a(tg.field_a, false, false);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param0 ^ -1) == -1) {
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
            if (!(-4 <= (param0 ^ -1))) {
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
        int var3 = 23 % ((param1 - -72) / 44);
        if (!((param0 ^ -1) <= 65535)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!((param0 ^ -1) <= 15)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(param0 >= -4)) {
            var2 += 2;
            param0 = param0 >> 2;
        }
        if (1 < (param0 ^ -1)) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    static {
        field_c = 2;
        field_b = new sm();
        field_a = false;
    }
}
