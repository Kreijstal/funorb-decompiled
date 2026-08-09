/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    uk field_r;
    private boolean field_a;
    uk field_u;
    int field_c;
    static ua field_s;
    int field_i;
    int field_l;
    private int field_n;
    static String[] field_m;
    uk field_b;
    int field_e;
    static String field_k;
    uk field_j;
    uk field_d;
    int field_o;
    static int[] field_f;
    int field_p;
    bd field_g;
    static String[] field_t;
    static String field_h;
    int field_q;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        if (param6 < 64) {
            this.field_j = (uk) null;
        }
        ti.b(param0, param3, param5, param4, param1, param2);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var5_int = this.field_l - -this.field_o;
            if (param2 > 29) {
              L1: {
                var6 = this.field_e + this.field_c;
                var7 = this.field_q;
                if ((var7 ^ -1) == 0) {
                  var7 = this.field_g.field_N + this.field_g.field_r;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  var8 = ti.field_i >> 1611850306;
                  var9 = this.field_g.b(param1);
                  var10 = this.field_g.field_N + this.field_g.field_r;
                  var11 = 1;
                  if (var8 < var9) {
                    break L3;
                  } else {
                    if (0 == (param1.indexOf("<br>") ^ -1)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != uf.field_b) {
                    break L4;
                  } else {
                    uf.field_b = new String[16];
                    break L4;
                  }
                }
                L5: {
                  if (var9 > var8) {
                    var13 = var9 / var8;
                    var12 = 2 * ((-1 + (var9 % var8 - -var13)) / var13) + var8;
                    break L5;
                  } else {
                    var12 = var8;
                    break L5;
                  }
                }
                var11 = this.field_g.a(param1, new int[]{var12}, uf.field_b);
                var9 = 0;
                var10 = var10 + (var11 - 1) * var7;
                var13 = 0;
                L6: while (true) {
                  if (var13 >= var11) {
                    break L2;
                  } else {
                    L7: {
                      var14 = this.field_g.b(uf.field_b[var13]);
                      if (var14 > var9) {
                        var9 = var14;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var13++;
                    continue L6;
                  }
                }
              }
              L8: {
                var12 = param0;
                if (var5_int + (var9 + var12) <= ti.field_i) {
                  break L8;
                } else {
                  var12 = -var9 + ti.field_i - var5_int;
                  break L8;
                }
              }
              L9: {
                var13 = 32 + (-this.field_g.field_x + param3);
                if (ti.field_b >= var6 + (var13 + var10)) {
                  break L9;
                } else {
                  var13 = -var6 + param3 - var10;
                  break L9;
                }
              }
              ti.b(var12, var13, var9 + var5_int, var10 + var6, this.field_i);
              ti.f(1 + var12, var13 - -1, -2 + (var9 - -var5_int), -2 + var6 + var10, this.field_p);
              this.field_g.a(param1, this.field_l + var12, var13 + this.field_c, var9, var10, this.field_n, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("hc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ti.a(param4, param1, param3, param5, param0);
        if (param2 != 10066329) {
            bd var8 = (bd) null;
            this.a(-79, (bd) null);
        }
    }

    private final void a(byte param0, String param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -83) {
                break L1;
              } else {
                hc.a(92);
                break L1;
              }
            }
            L2: {
              var5_int = this.field_g.b(param1);
              var6 = this.field_g.field_r + this.field_g.field_x;
              var7 = param3;
              if (ti.field_i < 6 + var7 + var5_int) {
                var7 = -var5_int + (ti.field_i + -6);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = 32 + (param2 - this.field_g.field_x);
              if (ti.field_b >= var8 - -var6 - -6) {
                break L3;
              } else {
                var8 = -6 + (-var6 + ti.field_b);
                break L3;
              }
            }
            ti.b(var7, var8, var5_int + 6, 6 + var6, this.field_n);
            ti.f(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_p);
            this.field_g.a(param1, var7 - -3, 3 + (var8 - -this.field_g.field_x), this.field_n, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("hc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(pf param0, pf param1, pf param2, boolean param3, byte param4) {
        try {
            al.field_f = de.a("", -47);
            al.field_f.a(false, true);
            fh.a(param0, param2, param1, (byte) -108);
            int var5_int = 37 % ((param4 - -36) / 42);
            pe.b(4);
            el.field_E = ok.field_a;
            o.field_l = ok.field_a;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hc.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(String param0, int param1, int param2, byte param3) {
        String var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_a) {
                this.a(param2, param0, 63, param1);
                break L1;
              } else {
                this.a((byte) -95, param0, param1, param2);
                break L1;
              }
            }
            L2: {
              if (param3 >= 126) {
                break L2;
              } else {
                var6 = (String) null;
                this.a(-31, (String) null, -105, 118);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("hc.B(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, bd param1) {
        id var17 = null;
        tc var4 = null;
        pb[] var5 = null;
        jc var16 = null;
        jc var18 = null;
        int var7_int = 0;
        tc var6 = null;
        tc var7 = null;
        hh discarded$0 = null;
        df discarded$1 = null;
        tc var8 = null;
        pb[] var9 = null;
        pb[] var10 = null;
        pb dupTemp$2 = null;
        tc var11 = null;
        tc var12 = null;
        pb var13 = null;
        tc var14 = null;
        tc var19 = null;
        int var15 = stellarshard.field_B;
        try {
            var17 = new id(param1, 2, 2, 2236962, 1, param0, 1, param1.field_N - (-param1.field_r - 2));
            this.field_r = (uk) ((Object) var17);
            var17.field_i = 16777215;
            var4 = new tc();
            var17.a(var4, (byte) -34);
            this.field_n = 15658734;
            this.field_c = 3;
            this.field_p = 5592405;
            this.field_g = param1;
            this.field_o = 3;
            this.field_l = 3;
            var4.field_o = 11711154;
            this.field_i = 15658734;
            this.field_q = -1;
            var4.field_n = 15658734;
            this.field_e = 3;
            var4.a((byte) 119, 0).a(param0 ^ -2, 15658734).a((byte) 102, cj.a(7829367, 10066329, 8947848, -17768));
            var4.a((byte) 10, 1).a((byte) 104, cj.a(13421772, 10066329, 11184810, -17768));
            var4.a((byte) 115, 3).a((byte) 100, cj.a(10066329, 7829367, 8947848, -17768)).a(1, false).b(-2147483648, 1);
            var5 = new pb[9];
            var16 = new jc(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
                var16.field_z[var7_int] = 1077952576;
            }
            var5[4] = (pb) ((Object) var18);
            var4.a((byte) 116, 4).a((byte) 126, true).a((byte) 120, var5);
            var4.a((byte) -113, 5).a((byte) 120, di.a(0, 0, 0, 65793, (byte) -80)).a((byte) 124, true).a(-1, -1);
            this.field_b = (uk) ((Object) var4);
            var6 = new tc(var4, true);
            var6.field_h = 0;
            var7 = new tc(var4, true);
            var7.field_h = 0;
            var7.a(-74, he.a((byte) -121, 8947848));
            var7.a((byte) 120, 1).a((byte) 89, he.a((byte) -120, 11184810)).a(-1, 2236962);
            this.field_j = (uk) ((Object) new bb(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new hh(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new df(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new tc();
            var17.a(var8, (byte) -34);
            var8.a((byte) -104, 0).a((byte) 108, cj.a(10066329, 7829367, 15658734, -17768)).a(-1, 1118481).a(false, -1);
            var8.a((byte) 115, 4).a((byte) 124, true).a((byte) 110, var5);
            this.field_d = (uk) ((Object) var8);
            var9 = new pb[9];
            var9[4] = new pb(2, 1);
            var10 = new pb[9];
            var10[4] = new pb(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_z = new int[]{6710886, 7829367};
            var10[4].field_z = new int[]{6710886, 7829367};
            var11 = new tc();
            var12 = new tc();
            var11.a(0, -72, var9);
            var12.a(0, param0 + -56, var10);
            var13 = new pb(7, 4);
            var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new tc(var4, true);
            var14.a(true, var13.a());
            var13.c();
            var14 = new tc(var4, true);
            var14.a(true, var13.a());
            var13.c();
            var14 = new tc(var4, true);
            var14.a(true, var13.a());
            var13.c();
            var19 = new tc(var4, true);
            var19.a(true, var13);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 21215) {
            return;
        }
        field_f = null;
        field_t = null;
        field_s = null;
        field_m = null;
        field_k = null;
    }

    public hc() {
        this.field_a = true;
    }

    static {
        field_s = new ua(3);
        field_m = new String[16];
        field_f = new int[8192];
        field_h = "Splits into 4";
        field_t = new String[]{"Complete 5 levels with super cannon", "Earn 1000 points in phoenix mode", "Complete 5 levels with the flame cannon", "Complete 5 levels with lightning gun", "Complete 5 levels with mega laser", "Collect all weapons in 1 sitting", "Reach level 10 picking up no shields", "Reach level 20 picking up no shields", "Reach level 10 from level 1", "Reach level 30 from level 1", "Reach level 50 from level 1", "Destroy 20 alien ships", "Destroy 10 alien spinners", "Collect 20 sensor ghosts in one game during Hallowe'en"};
        field_k = "Loading sound effects";
    }
}
