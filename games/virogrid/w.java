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
        hg var4;
        int var5;
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
        hg var2;
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
        try {
            this.field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_F = null;
        field_M = null;
        field_L = null;
        field_I = null;
        if (param0 >= -1) {
            field_I = (kg) null;
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        String var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = re.a("", param2, '_', param1);
              if (!param2) {
                break L1;
              } else {
                var4 = (String) null;
                w.a((String) null, (String) null, false);
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = od.b(0, param1);
                if (0 != (param0.indexOf(param1) ^ -1)) {
                  break L3;
                } else {
                  if (0 == (param0.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("w.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static mg a(eh param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        mg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = 74 % ((param1 - -29) / 48);
            if (hn.a(param0, param3, param2, (byte) 109)) {
              stackIn_4_0 = gn.c((byte) -9);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("w.K(");

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
          throw kg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mg) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        wl var8;
        int var9;
        int var10;
        int var11;
        mg var12;
        mg var13;
        mg var15;
        mg var16;
        var11 = Virogrid.field_F ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = this.field_l + (param1 - -(this.field_g >> 671060385));
          var6 = this.field_u + (param2 - -(this.field_m >> 1725983489));
          var8 = this.field_G.a(-22243);
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
                    var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -this.field_N << 1305825994, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  } else {
                    hh.field_a = new mg(var9, var10);
                    kb.a(hh.field_a, 16865);
                    var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -this.field_N << 1305825994, 4096);
                    ai.a(true);
                    hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                    return;
                  }
                } else {
                  hh.field_a = new mg(var9, var10);
                  kb.a(hh.field_a, 16865);
                  var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -this.field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var16.field_u, -var16.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                kb.a(hh.field_a, 16865);
                var16.a(112, 144, var16.field_u << 1871112516, var16.field_z << 30520708, -this.field_N << 1305825994, 4096);
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
                  var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -this.field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                } else {
                  hh.field_a = new mg(var9, var10);
                  kb.a(hh.field_a, 16865);
                  var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -this.field_N << 1305825994, 4096);
                  ai.a(true);
                  hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                  return;
                }
              } else {
                hh.field_a = new mg(var9, var10);
                kb.a(hh.field_a, 16865);
                var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -this.field_N << 1305825994, 4096);
                ai.a(true);
                hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
                return;
              }
            } else {
              hh.field_a = new mg(var9, var10);
              kb.a(hh.field_a, 16865);
              var15.a(112, 144, var15.field_u << 1871112516, var15.field_z << 30520708, -this.field_N << 1305825994, 4096);
              ai.a(true);
              hh.field_a.e(var5 + -var15.field_u, -var15.field_z + var6, 256);
              return;
            }
          }
        }
    }

    final String d(int param0) {
        if (param0 < 35) {
            field_L = (ld) null;
            if (!(!this.field_p)) {
                return this.field_G.b(28433);
            }
            return null;
        }
        if (!(!this.field_p)) {
            return this.field_G.b(28433);
        }
        return null;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        try {
            if (param1 <= 113) {
                w.a((byte) -19, -106L, -21);
            }
            this.field_N = this.field_N + 1;
            super.a(param0, 127, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "w.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -8515) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.field_N = -119;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("w.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    static {
        field_M = "(1 player wants to join)";
        field_F = "Only show game chat from my friends";
        field_K = 0;
        field_L = new ld();
        field_J = false;
    }
}
