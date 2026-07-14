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
            boolean discarded$0 = bj.a('ￔ', 125);
        }
    }

    final static gd a(am param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        gd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        var2 = param0.k(99, 8);
        if (0 < var2) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param1 < -127) {
              break L0;
            } else {
              bj.e(95);
              break L0;
            }
          }
          L1: {
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
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param0.k(13, 16);
              var5.field_K = ad.a(var5.field_K, true, 16, param0);
              var5.field_d = ad.a(var5.field_d, true, 16, param0);
              var5.field_h = ad.a(var5.field_h, true, 16, param0);
              var5.field_l = ad.a(var5.field_l, true, 16, param0);
              var5.field_w = ad.a(var5.field_w, true, 16, param0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (dg.a(param0, false)) {
              var5.field_x = ad.a(var5.field_x, true, 16, param0);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!dg.a(param0, false)) {
              break L4;
            } else {
              var5.field_F = hc.a(16, param0, (byte) -44, var5.field_F);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_F.length) {
                  if (var6 != 0) {
                    var5.field_p = (byte)(var6 + 1);
                    break L4;
                  } else {
                    var5.field_F = null;
                    break L4;
                  }
                } else {
                  if ((255 & var5.field_F[var7]) > var6) {
                    var6 = var5.field_F[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    final static int a(boolean param0) {
        if (!param0) {
            field_p = null;
        }
        return qk.field_Mb;
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 18840) {
          L0: {
            L1: {
              if (10 > fl.field_a) {
                break L1;
              } else {
                if (-14 < (ld.field_j ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final static boolean a(char param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 > 44) {
            break L0;
          } else {
            field_q = null;
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
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    bj(int param0) {
        ((bj) this).field_r = param0;
    }

    final static vn[] a(String param0, int param1, dj param2, String param3) {
        vn[] var5 = vm.a((byte) 111, param3, param0, param2);
        vn[] var4 = var5;
        var5[3].field_q = var5[3].field_t;
        var5[1].field_r = var5[1].field_w;
        if (param1 > -117) {
            return null;
        }
        var5[5].field_q = var5[5].field_t;
        var5[7].field_r = var5[7].field_w;
        return var4;
    }

    abstract boolean b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Click";
    }
}
