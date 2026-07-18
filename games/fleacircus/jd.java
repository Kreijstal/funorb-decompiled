/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int[] field_o;
    ch field_d;
    static String[] field_g;
    int field_f;
    ch field_l;
    int field_c;
    ch field_i;
    static long field_n;
    ch field_h;
    private int field_m;
    fa field_a;
    int field_e;
    private boolean field_s;
    int field_j;
    int field_k;
    static sf field_q;
    int field_r;
    static int field_t;
    int field_b;
    ch field_p;

    final static int a(boolean param0, int param1) {
        if (param0) {
            field_o = null;
        }
        return bl.field_g[param1 & 2047];
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        gb.g(param6, param5, param1, param4, param3, param0);
        if (param2) {
            Object var9 = null;
            this.a((byte) 19, -104, (String) null, -15);
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((jd) this).field_a.b(param2);
              var6 = ((jd) this).field_a.field_y + ((jd) this).field_a.field_K;
              if (param0 > 116) {
                break L1;
              } else {
                int discarded$1 = jd.a(true, 96);
                break L1;
              }
            }
            L2: {
              var7 = param1;
              if (gb.field_d < var5_int + var7 + 6) {
                var7 = gb.field_d - var5_int - 6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = 32 + param3 + -((jd) this).field_a.field_y;
              if (gb.field_k >= 6 + var6 + var8) {
                break L3;
              } else {
                var8 = -6 + gb.field_k - var6;
                break L3;
              }
            }
            gb.b(var7, var8, var5_int - -6, var6 - -6, ((jd) this).field_m);
            gb.e(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, ((jd) this).field_f);
            ((jd) this).field_a.c(param2, 3 + var7, ((jd) this).field_a.field_y + (3 + var8), ((jd) this).field_m, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("jd.A(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException var5 = null;
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
            if (param0 == 13421772) {
              L1: {
                if (((jd) this).field_s) {
                  this.a(true, param1, param2, param3);
                  break L1;
                } else {
                  this.a((byte) 120, param1, param2, param3);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jd.F(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, String param2, int param3) {
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var15 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((jd) this).field_r + ((jd) this).field_c;
              var6 = ((jd) this).field_e + ((jd) this).field_j;
              var7 = ((jd) this).field_k;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((jd) this).field_a.field_H - -((jd) this).field_a.field_K;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = gb.field_d >> 2;
                var9 = ((jd) this).field_a.b(param2);
                var10 = ((jd) this).field_a.field_K + ((jd) this).field_a.field_H;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf("<br>")) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 + 2 * ((var13 + var9 % var8 - 1) / var13);
                  break L4;
                }
              }
              L5: {
                if (null != pc.field_f) {
                  break L5;
                } else {
                  pc.field_f = new String[16];
                  break L5;
                }
              }
              var11 = ((jd) this).field_a.a(param2, new int[1], pc.field_f);
              var9 = 0;
              var10 = var10 + (var11 - 1) * var7;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((jd) this).field_a.b(pc.field_f[var13]);
                    if (var9 >= var14) {
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
              var12 = param1;
              if (var5_int + (var12 + var9) > gb.field_d) {
                var12 = -var5_int + gb.field_d - var9;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + -((jd) this).field_a.field_y + param3;
              if (gb.field_k < var6 + (var13 - -var10)) {
                var13 = param3 + (-var10 - var6);
                break L9;
              } else {
                break L9;
              }
            }
            gb.b(var12, var13, var9 - -var5_int, var10 + var6, ((jd) this).field_b);
            gb.e(1 + var12, var13 - -1, -2 + var9 - -var5_int, var10 - -var6 + -2, ((jd) this).field_f);
            int discarded$1 = ((jd) this).field_a.a(param2, var12 - -((jd) this).field_c, ((jd) this).field_e + var13, var9, var10, ((jd) this).field_m, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("jd.D(").append(true).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_q = null;
        field_g = null;
        field_o = null;
    }

    final void a(fa param0, boolean param1) {
        RuntimeException var3 = null;
        hb var4 = null;
        dd[] var5 = null;
        hb var6 = null;
        int var7_int = 0;
        hb var7 = null;
        hb var8 = null;
        dd[] var9 = null;
        dd[] var10 = null;
        hb var11 = null;
        hb var12 = null;
        dd var13 = null;
        hb var14 = null;
        int var15 = 0;
        sj var16 = null;
        e var17 = null;
        sj var18 = null;
        hb var19 = null;
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
        var15 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var17 = new e(param0, 2, 2, 2236962, 1, 1, 1, param0.field_K + param0.field_H + 2);
            var17.field_f = 16777215;
            ((jd) this).field_i = (ch) (Object) var17;
            var4 = new hb();
            var17.a(2, (e) (Object) var4);
            ((jd) this).field_r = 3;
            ((jd) this).field_k = -1;
            ((jd) this).field_c = 3;
            ((jd) this).field_j = 3;
            ((jd) this).field_f = 5592405;
            var4.field_p = 11711154;
            ((jd) this).field_a = param0;
            ((jd) this).field_e = 3;
            ((jd) this).field_b = 15658734;
            var4.field_c = 15658734;
            ((jd) this).field_m = 15658734;
            te discarded$10 = var4.a(0, -17562).a(15658734, (byte) -75).a(true, lh.a(7829367, 8947848, (byte) -90, 10066329));
            te discarded$11 = var4.a(1, -17562).a(true, lh.a(13421772, 11184810, (byte) 66, 10066329));
            te discarded$12 = var4.a(3, -17562).a(param1, lh.a(10066329, 8947848, (byte) -99, 7829367)).a(param1, 1).c(124, 1);
            var5 = new dd[9];
            var16 = new sj(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_B.length) {
                var5[4] = (dd) (Object) var18;
                te discarded$13 = var4.a(4, -17562).a(true, (byte) -121).a(true, var5);
                te discarded$14 = var4.a(5, -17562).a(true, ta.a(0, 65793, -2843, 0, 0)).a(true, (byte) -107).a(-1, (byte) -75);
                ((jd) this).field_p = (ch) (Object) var4;
                var6 = new hb(var4, true);
                var6.field_i = 0;
                var7 = new hb(var4, true);
                var7.field_i = 0;
                var7.a((byte) 61, bf.a(2885, 8947848));
                te discarded$15 = var7.a(1, -17562).a(true, bf.a(2885, 11184810)).a(2236962, (byte) -75);
                ((jd) this).field_d = (ch) (Object) new lb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                ee discarded$16 = new ee(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                ib discarded$17 = new ib(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new hb();
                var17.a(2, (e) (Object) var8);
                te discarded$18 = var8.a(0, -17562).a(param1, lh.a(10066329, 15658734, (byte) -107, 7829367)).a(1118481, (byte) -75).a(-1, 127);
                te discarded$19 = var8.a(4, -17562).a(true, (byte) -115).a(true, var5);
                ((jd) this).field_l = (ch) (Object) var8;
                var9 = new dd[9];
                var10 = new dd[9];
                var9[4] = new dd(2, 1);
                var10[4] = new dd(1, 2);
                var9[4].field_B = new int[]{6710886, 7829367};
                var10[4].field_B = new int[]{6710886, 7829367};
                var11 = new hb();
                var12 = new hb();
                var11.a(var9, -44, 0);
                var12.a(var10, -82, 0);
                var13 = new dd(7, 4);
                var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new hb(var4, param1);
                var14.a(var13.c(), 0);
                var13.e();
                var14 = new hb(var4, true);
                var14.a(var13.c(), 0);
                var13.e();
                var14 = new hb(var4, true);
                var14.a(var13.c(), 0);
                var13.e();
                var19 = new hb(var4, true);
                var19.a(var13, 0);
                break L0;
              } else {
                var16.field_B[var7_int] = 1077952576;
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
            stackOut_6_1 = new StringBuilder().append("jd.H(");
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
          throw pf.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, byte param2, wk param3) {
        try {
            hh.field_b.a(param3, 1000000, -524289, false, 1048576, 256);
            int var5_int = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "jd.B(" + true + ',' + 1048576 + ',' + 102 + ',' + (param3 != null ? "{...}" : "null") + ',' + 256 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 4) {
            field_g = null;
        }
        gb.d(param5, param2, param1, param3, param4);
    }

    final static mk a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        mk stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (ui.field_kb != wi.field_f) {
              L1: {
                if (param1 == 8947848) {
                  break L1;
                } else {
                  var3 = null;
                  mk discarded$2 = jd.a((String) null, -64);
                  break L1;
                }
              }
              L2: {
                if (ui.field_kb != ui.field_ob) {
                  break L2;
                } else {
                  if (param0.equals((Object) (Object) li.field_d)) {
                    ui.field_kb = ql.field_l;
                    stackOut_10_0 = kh.field_a;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              ui.field_kb = wi.field_f;
              li.field_d = param0;
              kh.field_a = null;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (mk) (Object) stackIn_9_0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("jd.J(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    public jd() {
        ((jd) this).field_s = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Many more levels", "Extra achievements", "Fullscreen Mode", "No adverts"};
        field_o = new int[40];
    }
}
