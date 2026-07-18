/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    int field_u;
    int field_s;
    private int field_a;
    static String field_o;
    private boolean field_f;
    static String field_n;
    de field_c;
    de field_j;
    int field_r;
    de field_d;
    static java.awt.Frame field_i;
    static int field_k;
    qe field_l;
    de field_t;
    int field_b;
    static int field_e;
    static int field_q;
    int field_g;
    de field_p;
    int field_m;
    int field_h;

    private final void a(int param0, int param1, String param2, int param3) {
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
        var15 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = ((sg) this).field_r + ((sg) this).field_g;
              var6 = ((sg) this).field_m + ((sg) this).field_u;
              var7 = ((sg) this).field_b;
              if (-1 == var7) {
                var7 = ((sg) this).field_l.field_q + ((sg) this).field_l.field_p;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = ki.field_j >> 2;
                var9 = ((sg) this).field_l.a(param2);
                var10 = ((sg) this).field_l.field_q + ((sg) this).field_l.field_p;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param2.indexOf("<br>") != -1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = (var9 % var8 - (-var13 + 1)) / var13 * 2 + var8;
                  break L4;
                } else {
                  var12 = var8;
                  break L4;
                }
              }
              L5: {
                if (null != vd.field_f) {
                  break L5;
                } else {
                  vd.field_f = new String[16];
                  break L5;
                }
              }
              var11 = ((sg) this).field_l.a(param2, new int[1], vd.field_f);
              var10 = var10 + (var11 - 1) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((sg) this).field_l.a(vd.field_f[var13]);
                    if (var9 < var14) {
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
              var12 = param3;
              if (ki.field_j < var12 + var9 - -var5_int) {
                var12 = ki.field_j + -var9 + -var5_int;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + param1 + -((sg) this).field_l.field_r;
              if (ki.field_f < var10 + var13 + var6) {
                var13 = -var10 + param1 - var6;
                break L9;
              } else {
                break L9;
              }
            }
            ki.e(var12, var13, var9 - -var5_int, var6 + var10, ((sg) this).field_h);
            ki.d(1 + var12, var13 - -1, var5_int + (var9 - 2), param0 + (var6 + var10), ((sg) this).field_s);
            int discarded$1 = ((sg) this).field_l.a(param2, var12 - -((sg) this).field_r, var13 - -((sg) this).field_u, var9, var10, ((sg) this).field_a, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("sg.F(").append(param0).append(',').append(param1).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        if (param6 != 113) {
            return;
        }
        ki.b(param4, param2, param3, param5, param1, param0);
    }

    private final void a(int param0, boolean param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
              var5_int = ((sg) this).field_l.a(param2);
              var6 = ((sg) this).field_l.field_r - -((sg) this).field_l.field_q;
              var7 = param0;
              if (ki.field_j >= 6 + (var5_int + var7)) {
                break L1;
              } else {
                var7 = -6 + (-var5_int + ki.field_j);
                break L1;
              }
            }
            L2: {
              var8 = 32 + param3 + -((sg) this).field_l.field_r;
              if (6 + (var8 - -var6) <= ki.field_f) {
                break L2;
              } else {
                var8 = ki.field_f - var6 - 6;
                break L2;
              }
            }
            ki.e(var7, var8, 6 + var5_int, var6 - -6, ((sg) this).field_a);
            ki.d(var7 - -1, var8 - -1, var5_int + 4, var6 + 4, ((sg) this).field_s);
            ((sg) this).field_l.a(param2, 3 + var7, 3 + (var8 - -((sg) this).field_l.field_r), ((sg) this).field_a, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sg.D(").append(param0).append(',').append(true).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
            ((sg) this).field_f = false;
        }
        ki.a(param1, param2, param4, param3, param0);
    }

    public static void a() {
        field_o = null;
        field_n = null;
        field_i = null;
    }

    final void b(int param0, int param1, String param2, int param3) {
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
            L1: {
              if (((sg) this).field_f) {
                this.a(-2, param0, param2, param3);
                break L1;
              } else {
                this.a(param3, true, param2, param0);
                break L1;
              }
            }
            L2: {
              if (param1 <= -20) {
                break L2;
              } else {
                ((sg) this).field_a = 81;
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
            stackOut_6_1 = new StringBuilder().append("sg.C(").append(param0).append(',').append(param1).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, qe param1) {
        RuntimeException var3 = null;
        w var4 = null;
        hl[] var5 = null;
        w var6 = null;
        int var7_int = 0;
        w var7 = null;
        w var8 = null;
        hl[] var9 = null;
        hl[] var10 = null;
        w var11 = null;
        w var12 = null;
        hl var13 = null;
        w var14 = null;
        int var15 = 0;
        Object var16 = null;
        pj var17 = null;
        hd var18 = null;
        pj var19 = null;
        w var20 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var15 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var18 = new hd(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_q + param1.field_p);
              var18.field_c = 16777215;
              ((sg) this).field_j = (de) (Object) var18;
              var4 = new w();
              var18.a(-68, (hd) (Object) var4);
              ((sg) this).field_a = 15658734;
              ((sg) this).field_g = 3;
              ((sg) this).field_m = 3;
              ((sg) this).field_s = 5592405;
              if (param0 >= 102) {
                break L1;
              } else {
                var16 = null;
                this.a(-47, -18, (String) null, 92);
                break L1;
              }
            }
            ((sg) this).field_u = 3;
            ((sg) this).field_h = 15658734;
            var4.field_m = 11711154;
            var4.field_j = 15658734;
            ((sg) this).field_l = param1;
            ((sg) this).field_b = -1;
            ((sg) this).field_r = 3;
            il discarded$15 = var4.a(0, (byte) -76).c(15658734, 2).a(el.b(10066329, 22396, 7829367, 8947848), (byte) -74);
            il discarded$16 = var4.a(1, (byte) -76).a(el.b(10066329, 22396, 13421772, 11184810), (byte) -74);
            il discarded$17 = var4.a(3, (byte) -76).a(el.b(7829367, 22396, 10066329, 8947848), (byte) -74).b(1, -86).a(256, 1);
            var5 = new hl[9];
            var17 = new pj(32, 32);
            var19 = var17;
            var7_int = 0;
            L2: while (true) {
              if (var7_int >= var19.field_B.length) {
                var5[4] = (hl) (Object) var19;
                il discarded$18 = var4.a(4, (byte) -76).a(-38, true).a(var5, (byte) -74);
                int discarded$19 = 65793;
                int discarded$20 = 0;
                int discarded$21 = 0;
                int discarded$22 = -25343;
                int discarded$23 = 0;
                il discarded$24 = var4.a(5, (byte) -76).a(ab.b(), (byte) -74).a(-52, true).c(-1, 2);
                ((sg) this).field_d = (de) (Object) var4;
                var6 = new w(var4, true);
                var6.field_h = 0;
                var7 = new w(var4, true);
                var7.field_h = 0;
                var7.a((byte) 68, gi.a(4477, 8947848));
                il discarded$25 = var7.a(1, (byte) -76).a(gi.a(4477, 11184810), (byte) -74).c(2236962, 2);
                ((sg) this).field_p = (de) (Object) new ni(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                eg discarded$26 = new eg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                ci discarded$27 = new ci(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new w();
                var18.a(-121, (hd) (Object) var8);
                il discarded$28 = var8.a(0, (byte) -76).a(el.b(7829367, 22396, 10066329, 15658734), (byte) -74).c(1118481, 2).a((byte) -104, -1);
                il discarded$29 = var8.a(4, (byte) -76).a(-120, true).a(var5, (byte) -74);
                ((sg) this).field_c = (de) (Object) var8;
                var9 = new hl[9];
                var10 = new hl[9];
                var9[4] = new hl(2, 1);
                var10[4] = new hl(1, 2);
                var9[4].field_B = new int[]{6710886, 7829367};
                var10[4].field_B = new int[]{6710886, 7829367};
                var11 = new w();
                var12 = new w();
                var11.a(4, 0, var9);
                var12.a(4, 0, var10);
                var13 = new hl(7, 4);
                var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new w(var4, true);
                var14.a(-127, var13.c());
                var13.a();
                var14 = new w(var4, true);
                var14.a(-118, var13.c());
                var13.a();
                var14 = new w(var4, true);
                var14.a(-34, var13.c());
                var13.a();
                var20 = new w(var4, true);
                var20.a(-85, var13);
                break L0;
              } else {
                var17.field_B[var7_int] = 1077952576;
                var7_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sg.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public sg() {
        ((sg) this).field_f = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_n = null;
        field_q = 0;
    }
}
