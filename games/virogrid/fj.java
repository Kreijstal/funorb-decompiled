/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj {
    static String field_c;
    static String field_a;
    static p field_b;

    final static void a(byte param0, int param1, int param2) {
        L0: {
          L1: {
            if (ke.field_r == null) {
              break L1;
            } else {
              if (ke.field_r.length < param2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          ke.field_r = new int[2 * param2];
          break L0;
        }
        L2: {
          L3: {
            if (null == wh.field_c) {
              break L3;
            } else {
              if (param2 <= wh.field_c.length) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          wh.field_c = new int[2 * param2];
          break L2;
        }
        L4: {
          L5: {
            if (null == vc.field_jb) {
              break L5;
            } else {
              if (vc.field_jb.length < param2) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          vc.field_jb = new int[param2 * 2];
          break L4;
        }
        L6: {
          L7: {
            if (tg.field_A == null) {
              break L7;
            } else {
              if (param2 > tg.field_A.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          tg.field_A = new int[param2 * 2];
          break L6;
        }
        L8: {
          L9: {
            if (kf.field_j == null) {
              break L9;
            } else {
              if (param2 <= kf.field_j.length) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          kf.field_j = new int[2 * param2];
          break L8;
        }
        L10: {
          L11: {
            if (vl.field_i == null) {
              break L11;
            } else {
              if (param2 > vl.field_i.length) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          vl.field_i = new int[2 * param2];
          break L10;
        }
        L12: {
          if (param0 > 116) {
            break L12;
          } else {
            field_c = (String) null;
            break L12;
          }
        }
        L13: {
          L14: {
            if (null == lk.field_Tb) {
              break L14;
            } else {
              if (lk.field_Tb.length < param1 + param2) {
                break L14;
              } else {
                break L13;
              }
            }
          }
          lk.field_Tb = new int[2 * (param2 - -param1)];
          break L13;
        }
        L15: {
          L16: {
            if (null == jg.field_b) {
              break L16;
            } else {
              if (param2 > jg.field_b.length) {
                break L16;
              } else {
                break L15;
              }
            }
          }
          jg.field_b = new boolean[param2 * 2];
          break L15;
        }
        dj.field_c = -2147483648;
        ka.field_m = 0;
        ka.field_k = 2147483647;
        rk.field_e = 2147483647;
        bl.field_F = -2147483648;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 > -47) {
            field_a = (String) null;
        }
        field_b = null;
    }

    final static tf[] a(hg param0, int param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        tf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        tf var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        tf[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tf[] stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.c((byte) -78, 8);
            if (-1 <= (var2_int ^ -1)) {
              var3 = param0.c((byte) -78, 12);
              var4 = new tf[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  L2: {
                    if (param1 == 9) {
                      break L2;
                    } else {
                      fj.a((byte) 38);
                      break L2;
                    }
                  }
                  stackOut_12_0 = (tf[]) (var4);
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (tk.a(param1 + -8, param0)) {
                      var6 = new tf();
                      discarded$12 = param0.c((byte) -78, 24);
                      discarded$13 = param0.c((byte) -78, 24);
                      var6.field_b = param0.c((byte) -78, 24);
                      discarded$14 = param0.c((byte) -78, 9);
                      discarded$15 = param0.c((byte) -78, 12);
                      discarded$16 = param0.c((byte) -78, 12);
                      discarded$17 = param0.c((byte) -78, 12);
                      var4[var5] = var6;
                      break L3;
                    } else {
                      var6_int = param0.c((byte) -78, rc.a(-1 + var5, 4));
                      var4[var5] = var4[var6_int];
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("fj.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tf[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_a = "Lobby";
        field_b = new p();
    }
}
