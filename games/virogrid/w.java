/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends tg {
    private le field_G;
    private int field_N;
    static String field_M;
    static kg field_I;
    static String field_F;
    static int field_K;
    static ld field_L;
    static boolean field_J;

    final static void a(byte param0, long param1, int param2) {
        hg var4 = null;
        int var5 = 0;
        var4 = gk.field_g;
        if (param0 != 74) {
          w.a((byte) -80, -70L, 4);
          var4.g(param2, param0 ^ 66);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(7, -114);
          var4.a((byte) 100, param1);
          var4.b(-var5 + var4.field_l, -1);
          return;
        } else {
          var4.g(param2, param0 ^ 66);
          var4.field_l = var4.field_l + 1;
          var5 = var4.field_l;
          var4.a(7, -114);
          var4.a((byte) 100, param1);
          var4.b(-var5 + var4.field_l, -1);
          return;
        }
    }

    final static void a(int param0, int param1) {
        hg var2 = null;
        if (param1 != -7093) {
          return;
        } else {
          var2 = gk.field_g;
          var2.g(param0, 8);
          var2.a(1, -124);
          var2.a(0, -71);
          return;
        }
    }

    w(le param0) {
        ((w) this).field_G = param0;
    }

    public static void a(int param0) {
        field_F = null;
        field_M = null;
        field_L = null;
        field_I = null;
        if (param0 >= -1) {
            field_I = null;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = re.a("", param2, '_', param1);
        if (!param2) {
          var3 = od.b(0, param1);
          if (0 == param0.indexOf(param1)) {
            if (0 != param0.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          var4 = null;
          boolean discarded$2 = w.a((String) null, (String) null, false);
          var3 = od.b(0, param1);
          if (0 != param0.indexOf(param1)) {
            return true;
          } else {
            L0: {
              if (0 == param0.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static mg a(eh param0, int param1, int param2, int param3) {
        int var4 = 0;
        var4 = 74 % ((param1 - -29) / 48);
        if (!hn.a(param0, param3, param2, (byte) 109)) {
          return null;
        } else {
          return gn.c((byte) -9);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        wl var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mg var12 = null;
        mg var13 = null;
        mg var15 = null;
        mg var16 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = ((w) this).field_l + (param1 - -(((w) this).field_g >> 671060385));
          var6 = ((w) this).field_u + (param2 - -(((w) this).field_m >> 1725983489));
          var8 = ((w) this).field_G.a(-22243);
          if (gd.field_r != var8) {
            if (var8 != te.field_d) {
              if (var8 != ee.field_c) {
                if (bm.field_i == var8) {
                  var13 = bf.field_p[1];
                  var13.e(var5 + -(var13.field_w >> -611152671), -(var13.field_p >> -1779079103) + var6, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var12 = bf.field_p[2];
                var12.e(-(var12.field_w >> -1127849087) + var5, var6 - (var12.field_p >> 2024782465), 256);
                return;
              }
            } else {
              var16 = bf.field_p[0];
              var9 = var16.field_u << 79881377;
              var10 = var16.field_z << 1027165345;
              if (null != hh.field_a) {
                if (var9 <= hh.field_a.field_w) {
                  if (hh.field_a.field_p >= var10) {
                    kb.a(hh.field_a, 16865);
                    df.c();
                    var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  } else {
                    hh.field_a = new mg(var9, var10);
                    kb.a(hh.field_a, 16865);
                    var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  }
                } else {
                  hh.field_a = new mg(var9, var10);
                  kb.a(hh.field_a, 16865);
                  var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                kb.a(hh.field_a, 16865);
                var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                ai.a(true);
                hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                return;
              }
            }
          } else {
            var15 = bf.field_p[0];
            var9 = var15.field_u << 79881377;
            var10 = var15.field_z << 1027165345;
            if (null != hh.field_a) {
              if (var9 <= hh.field_a.field_w) {
                if (hh.field_a.field_p >= var10) {
                  kb.a(hh.field_a, 16865);
                  df.c();
                  var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                } else {
                  hh.field_a = new mg(var9, var10);
                  kb.a(hh.field_a, 16865);
                  var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                kb.a(hh.field_a, 16865);
                var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
                ai.a(true);
                hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                return;
              }
            } else {
              hh.field_a = new mg(var9, var10);
              kb.a(hh.field_a, 16865);
              var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -((w) this).field_N << 1305825994, 4096);
              ai.a(true);
              hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
              return;
            }
          }
        }
    }

    final String d(int param0) {
        if (param0 < 35) {
            field_L = null;
            if (!(!((w) this).field_p)) {
                return ((w) this).field_G.b(28433);
            }
            return null;
        }
        if (!(!((w) this).field_p)) {
            return ((w) this).field_G.b(28433);
        }
        return null;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        if (param1 <= 113) {
          w.a((byte) -19, -106L, -21);
          ((w) this).field_N = ((w) this).field_N + 1;
          super.a(param0, 127, param2, param3);
          return;
        } else {
          ((w) this).field_N = ((w) this).field_N + 1;
          super.a(param0, 127, param2, param3);
          return;
        }
    }

    final boolean a(fi param0, int param1) {
        if (param1 != -8515) {
            ((w) this).field_N = -119;
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "(1 player wants to join)";
        field_F = "Only show game chat from my friends";
        field_K = 0;
        field_L = new ld();
        field_J = false;
    }
}
