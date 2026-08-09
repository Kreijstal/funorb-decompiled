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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
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
        var15 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              var5_int = this.field_r + this.field_g;
              var6 = this.field_m + this.field_u;
              var7 = this.field_b;
              if (-1 == var7) {
                var7 = this.field_l.field_q + this.field_l.field_p;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = ki.field_j >> -117738558;
                var9 = this.field_l.a(param2);
                var10 = this.field_l.field_q + this.field_l.field_p;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (0 != (param2.indexOf("<br>") ^ -1)) {
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
              var11 = this.field_l.a(param2, new int[]{var12}, vd.field_f);
              var10 = var10 + (var11 - 1) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_l.a(vd.field_f[var13]);
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
              var13 = 32 + param1 + -this.field_l.field_r;
              if (ki.field_f < var10 + var13 + var6) {
                var13 = -var10 + param1 - var6;
                break L9;
              } else {
                break L9;
              }
            }
            ki.e(var12, var13, var9 - -var5_int, var6 + var10, this.field_h);
            ki.d(1 + var12, var13 - -1, var5_int + (var9 - 2), param0 + (var6 + var10), this.field_s);
            this.field_l.a(param2, var12 - -this.field_r, var13 - -this.field_u, var9, var10, this.field_a, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("sg.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
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
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_l.a(param2);
            var6 = this.field_l.field_r - -this.field_l.field_q;
            var7 = param0;
            if (ki.field_j < 6 + (var5_int + var7)) {
                var7 = -6 + (-var5_int + ki.field_j);
            }
            var8 = 32 + param3 + -this.field_l.field_r;
            if (6 + (var8 - -var6) > ki.field_f) {
                var8 = ki.field_f - var6 - 6;
            }
            if (!param1) {
                this.a(-128, 24, -71, 13, 44, 91, (byte) -1);
            }
            ki.e(var7, var8, 6 + var5_int, var6 - -6, this.field_a);
            ki.d(var7 - -1, var8 - -1, var5_int + 4, var6 + 4, this.field_s);
            this.field_l.a(param2, 3 + var7, 3 + (var8 - -this.field_l.field_r), this.field_a, -1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "sg.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
            this.field_f = false;
        }
        ki.a(param1, param2, param4, param3, param0);
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        if (param0) {
            return;
        }
        field_i = null;
    }

    final void b(int param0, int param1, String param2, int param3) {
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
              if (this.field_f) {
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
                this.field_a = 81;
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

            stackIn_8_1 = new StringBuilder().append("sg.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, qe param1) {
        hd var18 = null;
        w var4 = null;
        hl[] var5 = null;
        pj var17 = null;
        pj var19 = null;
        int var7_int = 0;
        w var6 = null;
        w var7 = null;
        eg discarded$0 = null;
        ci discarded$1 = null;
        w var8 = null;
        hl[] var9 = null;
        hl[] var10 = null;
        hl dupTemp$2 = null;
        w var11 = null;
        w var12 = null;
        hl var13 = null;
        w var14 = null;
        w var20 = null;
        int var15 = StarCannon.field_A;
        try {
            var18 = new hd(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_q + param1.field_p);
            var18.field_c = 16777215;
            this.field_j = (de) ((Object) var18);
            var4 = new w();
            var18.a(-68, var4);
            this.field_a = 15658734;
            this.field_g = 3;
            this.field_m = 3;
            this.field_s = 5592405;
            if (param0 < 102) {
                String var16 = (String) null;
                this.a(-47, -18, (String) null, 92);
            }
            this.field_u = 3;
            this.field_h = 15658734;
            var4.field_m = 11711154;
            var4.field_j = 15658734;
            this.field_l = param1;
            this.field_b = -1;
            this.field_r = 3;
            var4.a(0, (byte) -76).c(15658734, 2).a(el.b(10066329, 22396, 7829367, 8947848), (byte) -74);
            var4.a(1, (byte) -76).a(el.b(10066329, 22396, 13421772, 11184810), (byte) -74);
            var4.a(3, (byte) -76).a(el.b(7829367, 22396, 10066329, 8947848), (byte) -74).b(1, -86).a(256, 1);
            var5 = new hl[9];
            var17 = new pj(32, 32);
            var19 = var17;
            for (var7_int = 0; var7_int < var19.field_B.length; var7_int++) {
                var17.field_B[var7_int] = 1077952576;
            }
            var5[4] = (hl) ((Object) var19);
            var4.a(4, (byte) -76).a(-38, true).a(var5, (byte) -74);
            var4.a(5, (byte) -76).a(ab.b(0, -25343, 0, 0, 65793), (byte) -74).a(-52, true).c(-1, 2);
            this.field_d = (de) ((Object) var4);
            var6 = new w(var4, true);
            var6.field_h = 0;
            var7 = new w(var4, true);
            var7.field_h = 0;
            var7.a((byte) 68, gi.a(4477, 8947848));
            var7.a(1, (byte) -76).a(gi.a(4477, 11184810), (byte) -74).c(2236962, 2);
            this.field_p = (de) ((Object) new ni(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new eg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new ci(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new w();
            var18.a(-121, var8);
            var8.a(0, (byte) -76).a(el.b(7829367, 22396, 10066329, 15658734), (byte) -74).c(1118481, 2).a((byte) -104, -1);
            var8.a(4, (byte) -76).a(-120, true).a(var5, (byte) -74);
            this.field_c = (de) ((Object) var8);
            var9 = new hl[9];
            var10 = new hl[9];
            var9[4] = new hl(2, 1);
            var10[4] = new hl(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_B = new int[]{6710886, 7829367};
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
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "sg.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public sg() {
        this.field_f = true;
    }

    static {
        field_o = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_n = null;
        field_q = 0;
    }
}
