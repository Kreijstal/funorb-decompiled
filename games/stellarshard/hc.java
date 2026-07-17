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
            ((hc) this).field_j = null;
        }
        ti.b(param0, param3, param5, param4, param1, param2);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var5_int = ((hc) this).field_l - -((hc) this).field_o;
            if (param2 > 29) {
              L1: {
                var6 = ((hc) this).field_e + ((hc) this).field_c;
                var7 = ((hc) this).field_q;
                if (var7 == -1) {
                  var7 = ((hc) this).field_g.field_N + ((hc) this).field_g.field_r;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  var8 = ti.field_i >> 2;
                  var9 = ((hc) this).field_g.b(param1);
                  var10 = ((hc) this).field_g.field_N + ((hc) this).field_g.field_r;
                  var11 = 1;
                  if (var8 < var9) {
                    break L3;
                  } else {
                    if (param1.indexOf("<br>") == -1) {
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
                var11 = ((hc) this).field_g.a(param1, new int[1], uf.field_b);
                var9 = 0;
                var10 = var10 + (var11 - 1) * var7;
                var13 = 0;
                L6: while (true) {
                  if (var13 >= var11) {
                    break L2;
                  } else {
                    L7: {
                      var14 = ((hc) this).field_g.b(uf.field_b[var13]);
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
                var13 = 32 + (-((hc) this).field_g.field_x + param3);
                if (ti.field_b >= var6 + (var13 + var10)) {
                  break L9;
                } else {
                  var13 = -var6 + param3 - var10;
                  break L9;
                }
              }
              ti.b(var12, var13, var9 + var5_int, var10 + var6, ((hc) this).field_i);
              ti.f(1 + var12, var13 - -1, -2 + (var9 - -var5_int), -2 + var6 + var10, ((hc) this).field_p);
              int discarded$1 = ((hc) this).field_g.a(param1, ((hc) this).field_l + var12, var13 + ((hc) this).field_c, var9, var10, ((hc) this).field_n, -1, 0, 0, var7);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("hc.G(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ti.a(param4, param1, param3, param5, param0);
        if (param2 != 10066329) {
            Object var8 = null;
            ((hc) this).a(-79, (bd) null);
        }
    }

    private final void a(byte param0, String param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((hc) this).field_g.b(param1);
              var6 = ((hc) this).field_g.field_r + ((hc) this).field_g.field_x;
              var7 = param3;
              if (ti.field_i < 6 + var7 + var5_int) {
                var7 = -var5_int + (ti.field_i + -6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 32 + (param2 - ((hc) this).field_g.field_x);
              if (ti.field_b >= var8 - -var6 - -6) {
                break L2;
              } else {
                var8 = -6 + (-var6 + ti.field_b);
                break L2;
              }
            }
            ti.b(var7, var8, var5_int + 6, 6 + var6, ((hc) this).field_n);
            ti.f(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, ((hc) this).field_p);
            ((hc) this).field_g.a(param1, var7 - -3, 3 + (var8 - -((hc) this).field_g.field_x), ((hc) this).field_n, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("hc.H(").append(-95).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(pf param0, pf param1, pf param2, boolean param3) {
        try {
            al.field_f = de.a("", -47);
            al.field_f.a(false, true);
            int discarded$0 = -108;
            fh.a(param0, param2, param1);
            int var5_int = 0;
            int discarded$1 = 4;
            pe.b();
            el.field_E = ok.field_a;
            o.field_l = ok.field_a;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hc.E(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + -88 + 41);
        }
    }

    final void a(String param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((hc) this).field_a) {
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
                var6 = null;
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("hc.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, bd param1) {
        RuntimeException var3 = null;
        tc var4 = null;
        pb[] var5 = null;
        tc var6 = null;
        int var7_int = 0;
        tc var7 = null;
        tc var8 = null;
        pb[] var9 = null;
        pb[] var10 = null;
        tc var11 = null;
        tc var12 = null;
        pb var13 = null;
        tc var14 = null;
        int var15 = 0;
        jc var16 = null;
        id var17 = null;
        jc var18 = null;
        tc var19 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var17 = new id(param1, 2, 2, 2236962, 1, param0, 1, param1.field_N - (-param1.field_r - 2));
            ((hc) this).field_r = (uk) (Object) var17;
            var17.field_i = 16777215;
            var4 = new tc();
            var17.a((id) (Object) var4, (byte) -34);
            ((hc) this).field_n = 15658734;
            ((hc) this).field_c = 3;
            ((hc) this).field_p = 5592405;
            ((hc) this).field_g = param1;
            ((hc) this).field_o = 3;
            ((hc) this).field_l = 3;
            var4.field_o = 11711154;
            ((hc) this).field_i = 15658734;
            ((hc) this).field_q = -1;
            var4.field_n = 15658734;
            ((hc) this).field_e = 3;
            int discarded$14 = -17768;
            db discarded$15 = var4.a((byte) 119, 0).a(param0 ^ -2, 15658734).a((byte) 102, cj.a(7829367, 10066329, 8947848));
            int discarded$16 = -17768;
            db discarded$17 = var4.a((byte) 10, 1).a((byte) 104, cj.a(13421772, 10066329, 11184810));
            int discarded$18 = -17768;
            db discarded$19 = var4.a((byte) 115, 3).a((byte) 100, cj.a(10066329, 7829367, 8947848)).a(1, false).b(-2147483648, 1);
            var5 = new pb[9];
            var16 = new jc(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var18.field_z.length <= var7_int) {
                var5[4] = (pb) (Object) var18;
                db discarded$20 = var4.a((byte) 116, 4).a((byte) 126, true).a((byte) 120, var5);
                db discarded$21 = var4.a((byte) -113, 5).a((byte) 120, di.a(0, 0, 0, 65793, (byte) -80)).a((byte) 124, true).a(-1, -1);
                ((hc) this).field_b = (uk) (Object) var4;
                var6 = new tc(var4, true);
                var6.field_h = 0;
                var7 = new tc(var4, true);
                var7.field_h = 0;
                var7.a(-74, he.a((byte) -121, 8947848));
                db discarded$22 = var7.a((byte) 120, 1).a((byte) 89, he.a((byte) -120, 11184810)).a(-1, 2236962);
                ((hc) this).field_j = (uk) (Object) new bb(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                hh discarded$23 = new hh(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                df discarded$24 = new df(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new tc();
                var17.a((id) (Object) var8, (byte) -34);
                int discarded$25 = -17768;
                db discarded$26 = var8.a((byte) -104, 0).a((byte) 108, cj.a(10066329, 7829367, 15658734)).a(-1, 1118481).a(false, -1);
                db discarded$27 = var8.a((byte) 115, 4).a((byte) 124, true).a((byte) 110, var5);
                ((hc) this).field_d = (uk) (Object) var8;
                var9 = new pb[9];
                var9[4] = new pb(2, 1);
                var10 = new pb[9];
                var10[4] = new pb(1, 2);
                var9[4].field_z = new int[]{6710886, 7829367};
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
                break L0;
              } else {
                var16.field_z[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("hc.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
        ((hc) this).field_a = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new ua(3);
        field_m = new String[16];
        field_f = new int[8192];
        field_h = "Splits into 4";
        field_t = new String[]{"Complete 5 levels with super cannon", "Earn 1000 points in phoenix mode", "Complete 5 levels with the flame cannon", "Complete 5 levels with lightning gun", "Complete 5 levels with mega laser", "Collect all weapons in 1 sitting", "Reach level 10 picking up no shields", "Reach level 20 picking up no shields", "Reach level 10 from level 1", "Reach level 30 from level 1", "Reach level 50 from level 1", "Destroy 20 alien ships", "Destroy 10 alien spinners", "Collect 20 sensor ghosts in one game during Hallowe'en"};
        field_k = "Loading sound effects";
    }
}
