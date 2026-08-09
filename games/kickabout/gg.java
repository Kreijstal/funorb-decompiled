/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends hd {
    int field_Cb;
    hd field_Ab;
    String field_Gb;
    String field_yb;
    hd field_Bb;
    String field_zb;
    String field_Eb;
    static int field_Db;
    hd field_Fb;

    final static void a(int param0, int param1, tj param2) {
        int[] stackIn_3_0;
        int stackIn_3_1;
        int[] stackIn_3_2;
        int stackIn_3_3;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              kk.field_B[1] = 525;
              kk.field_B[0] = 370;
              stackIn_3_0 = or.field_a;

              stackIn_3_1 = 0;

              stackIn_3_2 = or.field_a;

              stackIn_3_3 = 1;

              if ((param0 ^ -1) != -2) {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = (int[]) ((Object) stackIn_3_2);
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 1344;
                break L1;
              } else {
                stackIn_4_0 = (int[]) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = (int[]) ((Object) stackIn_3_2);
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 0;
                break L1;
              }
            }
            L2: {
              stackIn_4_2[stackIn_4_3] = stackIn_4_4;
              stackIn_4_0[stackIn_4_1] = stackIn_4_4;
              var3_int = param2.a(true);
              var4 = param2.c(param1 ^ 879306160);
              if ((var3_int ^ -1) >= -449) {
                break L2;
              } else {
                var5 = kk.field_B[0];
                kk.field_B[0] = kk.field_B[1];
                kk.field_B[1] = var5;
                var5 = or.field_a[0];
                or.field_a[0] = or.field_a[1];
                or.field_a[1] = var5;
                break L2;
              }
            }
            var5 = 0;
            L3: while (true) {
              if (var5 >= 2) {
                var5 = mu.field_Q[0] + -30;
                var9 = 0;
                var6 = var9;
                L4: while (true) {
                  if (var9 >= 2) {
                    L5: {
                      pu.field_zb[0] = kk.field_B[param1] + kk.field_B[1] >> -1288598303;
                      stackIn_17_0 = pu.field_zb;

                      stackIn_17_1 = 1;

                      if (param0 != 1) {
                        stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = 1324;
                        break L5;
                      } else {
                        stackIn_18_0 = (int[]) ((Object) stackIn_17_0);
                        stackIn_18_1 = stackIn_17_1;
                        stackIn_18_2 = 20;
                        break L5;
                      }
                    }
                    stackIn_18_0[stackIn_18_1] = stackIn_18_2;
                    break L0;
                  } else {
                    L6: {
                      if (0 != mu.field_Q[var9]) {
                        kk.field_B[var9] = var5 * (-var3_int + kk.field_B[var9]) / mu.field_Q[var9] + var3_int;
                        or.field_a[var9] = var5 * (or.field_a[var9] - var4) / mu.field_Q[var9] + var4;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var9++;
                    continue L4;
                  }
                }
              } else {
                var6 = -var3_int + kk.field_B[var5];
                var7 = -var4 + or.field_a[var5];
                mu.field_Q[var5] = de.a(var6 * var6 + var7 * var7, (byte) -128);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("gg.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    gg() {
        super(0L, (hd) null);
    }

    final static void h(byte param0) {
        hd.field_K = wm.field_C;
        hw.field_f = la.field_d;
        jr.field_Gb = cq.field_f;
        up.field_f = 0.0;
        o.field_e = 0.0;
        int var1 = -104 % ((param0 - -10) / 60);
        hw.field_i = (int)hw.field_f >> 745109891;
        tf.field_a = 0.0;
    }

    final static void a(int param0) {
        ba.a(112, true);
        if (param0 != -32053) {
            field_Db = 59;
        }
    }

    final static void a(String[] args, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        String stackIn_10_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            if (param1 == 88) {
              li.field_c = new String[args.length];
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= args.length) {
                  L2: {
                    if (-1 == (li.field_c.length ^ -1)) {
                      gu.field_Jb = om.field_zb;
                      break L2;
                    } else {
                      L3: {
                        if (-2 == (li.field_c.length ^ -1)) {
                          stackIn_10_0 = cl.field_g;
                          break L3;
                        } else {
                          stackIn_10_0 = ka.field_d;
                          break L3;
                        }
                      }
                      gu.field_Jb = stackIn_10_0;
                      var4 = 0;
                      var2_int = var4;
                      L4: while (true) {
                        if (var4 >= li.field_c.length) {
                          break L2;
                        } else {
                          L5: {
                            gu.field_Jb = gu.field_Jb + li.field_c[var4];
                            if (li.field_c.length + -1 > var4) {
                              gu.field_Jb = gu.field_Jb + "   ";
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var4++;
                          continue L4;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  li.field_c[var2_int] = args[var2_int];
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("gg.B(");

            if (args == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
