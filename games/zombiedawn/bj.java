/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bj extends nb {
    static oi field_q;
    static String field_p;
    int field_r;

    abstract Object d(byte param0);

    public static void e(int param0) {
        field_q = null;
        field_p = null;
        if (param0 <= 37) {
            bj.a('ￔ', 125);
        }
    }

    final static gd a(am param0, byte param1) {
        gd stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.k(99, 8);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                if (param1 < -127) {
                  break L1;
                } else {
                  bj.e(95);
                  break L1;
                }
              }
              L2: {
                var3 = dg.a(param0, false) ? 1 : 0;
                var4 = dg.a(param0, false) ? 1 : 0;
                var5 = new gd();
                var5.field_k = (short)param0.k(61, 16);
                var5.field_G = ad.a(var5.field_G, true, 16, param0);
                var5.field_B = ad.a(var5.field_B, true, 16, param0);
                var5.field_m = ad.a(var5.field_m, true, 16, param0);
                var5.field_c = (short)param0.k(82, 16);
                var5.field_g = ad.a(var5.field_g, true, 16, param0);
                var5.field_H = ad.a(var5.field_H, true, 16, param0);
                var5.field_r = ad.a(var5.field_r, true, 16, param0);
                if (var3 != 0) {
                  var5.field_f = (short)param0.k(56, 16);
                  var5.field_M = ad.a(var5.field_M, true, 16, param0);
                  var5.field_q = ad.a(var5.field_q, true, 16, param0);
                  var5.field_y = ad.a(var5.field_y, true, 16, param0);
                  var5.field_O = ad.a(var5.field_O, true, 16, param0);
                  var5.field_n = ad.a(var5.field_n, true, 16, param0);
                  var5.field_v = ad.a(var5.field_v, true, 16, param0);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  param0.k(13, 16);
                  var5.field_K = ad.a(var5.field_K, true, 16, param0);
                  var5.field_d = ad.a(var5.field_d, true, 16, param0);
                  var5.field_h = ad.a(var5.field_h, true, 16, param0);
                  var5.field_l = ad.a(var5.field_l, true, 16, param0);
                  var5.field_w = ad.a(var5.field_w, true, 16, param0);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (dg.a(param0, false)) {
                  var5.field_x = ad.a(var5.field_x, true, 16, param0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!dg.a(param0, false)) {
                  break L5;
                } else {
                  var5.field_F = hc.a(16, param0, (byte) -44, var5.field_F);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var5.field_F.length) {
                      if (var6 != 0) {
                        var5.field_p = (byte)(var6 + 1);
                        break L5;
                      } else {
                        var5.field_F = null;
                        break L5;
                      }
                    } else {
                      if ((255 & var5.field_F[var7]) > var6) {
                        var6 = var5.field_F[var7] & 255;
                        var7++;
                        continue L6;
                      } else {
                        var7++;
                        continue L6;
                      }
                    }
                  }
                }
              }
              stackIn_25_0 = (gd) (var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var2);

            stackIn_28_1 = new StringBuilder().append("bj.G(");

            if (param0 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L7;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        return stackIn_25_0;
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_p = (String) null;
        }
        return qk.field_Mb;
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 18840) {
          L0: {
            L1: {
              if (10 > fl.field_a) {
                break L1;
              } else {
                if (-14 < (ld.field_j ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_6_0 = 0;
        L0: {
          if (param1 > 44) {
            break L0;
          } else {
            field_q = (oi) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (param0 > 57) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    bj(int param0) {
        this.field_r = param0;
    }

    final static vn[] a(String param0, int param1, dj param2, String param3) {
        vn[] var4 = null;
        RuntimeException var4_ref = null;
        vn[] var5 = null;
        vn[] stackIn_2_0 = null;
        vn[] stackIn_4_0 = null;
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
            var5 = vm.a((byte) 111, param3, param0, param2);
            var4 = var5;
            var5[3].field_q = var5[3].field_t;
            var5[1].field_r = var5[1].field_w;
            if (param1 <= -117) {
              var5[5].field_q = var5[5].field_t;
              var5[7].field_r = var5[7].field_w;
              stackIn_4_0 = (vn[]) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vn[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("bj.D(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

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

    abstract boolean b(boolean param0);

    static {
        field_p = "Click";
    }
}
