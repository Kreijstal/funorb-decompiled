/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static hj field_n;
    td field_e;
    int field_k;
    td field_c;
    private boolean field_b;
    kc field_j;
    int field_i;
    int field_d;
    int field_o;
    static int field_p;
    int field_a;
    static volatile int field_g;
    private int field_m;
    td field_f;
    int field_h;
    int field_r;
    td field_l;
    td field_q;

    final void a(kc param0, int param1) {
        jc var18 = null;
        sj var4 = null;
        hj[] var5 = null;
        ra var17 = null;
        ra var19 = null;
        int var7_int = 0;
        sj var6 = null;
        sj var7 = null;
        ab discarded$0 = null;
        ck discarded$1 = null;
        sj var8 = null;
        hj[] var9 = null;
        hj[] var10 = null;
        hj dupTemp$2 = null;
        sj var11 = null;
        sj var12 = null;
        hj var13 = null;
        sj var14 = null;
        sj var20 = null;
        int var15 = OrbDefence.field_D ? 1 : 0;
        try {
            var18 = new jc(param0, 2, 2, 2236962, 1, 1, 1, param0.field_B + param0.field_H + 2);
            var18.field_s = 16777215;
            this.field_f = (td) ((Object) var18);
            var4 = new sj();
            var18.a((byte) 81, var4);
            this.field_h = 3;
            this.field_i = -1;
            this.field_a = 3;
            this.field_r = 15658734;
            var4.field_m = 15658734;
            this.field_o = 3;
            this.field_m = 15658734;
            this.field_k = 5592405;
            this.field_d = 3;
            var4.field_d = 11711154;
            this.field_j = param0;
            var4.a(0, true).a((byte) 123, 15658734).a(vf.a(7829367, 10066329, 8947848, (byte) -106), 0);
            var4.a(1, true).a(vf.a(13421772, 10066329, 11184810, (byte) -118), 0);
            var4.a(3, true).a(vf.a(10066329, 7829367, 8947848, (byte) -90), 0).a(1, 0).b(1, 2);
            var5 = new hj[9];
            var17 = new ra(32, 32);
            var19 = var17;
            for (var7_int = 0; var7_int < var19.field_v.length; var7_int++) {
                var17.field_v[var7_int] = 1077952576;
            }
            var5[4] = (hj) ((Object) var19);
            var4.a(4, true).a(true, (byte) -57).a(var5, 0);
            var4.a(5, true).a(q.a(false, 0, 0, 0, 65793), 0).a(true, (byte) -57).a((byte) 114, -1);
            this.field_l = (td) ((Object) var4);
            var6 = new sj(var4, true);
            var6.field_h = 0;
            var7 = new sj(var4, true);
            var7.field_h = 0;
            var7.a(124, bg.a(-84, 8947848));
            var7.a(1, true).a(bg.a(-126, 11184810), 0).a((byte) 113, 2236962);
            this.field_e = (td) ((Object) new ci(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            if (param1 != -2699) {
                String var16 = (String) null;
                this.a(-85, (byte) 81, -88, (String) null);
            }
            discarded$0 = new ab(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new ck(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new sj();
            var18.a((byte) 81, var8);
            var8.a(0, true).a(vf.a(10066329, 7829367, 15658734, (byte) -94), 0).a((byte) 116, 1118481).c(-1, param1 + 2701);
            var8.a(4, true).a(true, (byte) -57).a(var5, 0);
            this.field_q = (td) ((Object) var8);
            var9 = new hj[9];
            var9[4] = new hj(2, 1);
            var10 = new hj[9];
            var10[4] = new hj(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_v = new int[]{6710886, 7829367};
            var10[4].field_v = new int[]{6710886, 7829367};
            var11 = new sj();
            var12 = new sj();
            var11.a(0, var9, 87);
            var12.a(0, var10, 94);
            var13 = new hj(7, 4);
            var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new sj(var4, true);
            var14.a(param1 ^ 2698, var13.f());
            var13.c();
            var14 = new sj(var4, true);
            var14.a(param1 + 2698, var13.f());
            var13.c();
            var14 = new sj(var4, true);
            var14.a(-1, var13.f());
            var13.c();
            var20 = new sj(var4, true);
            var20.a(-1, var13);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "bl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        ul.b(param0, param5, param4, param2, param3);
        if (param1) {
            String var8 = (String) null;
            this.a(97, -24, 37, (String) null);
        }
    }

    private final void a(boolean param0, String param1, int param2, int param3) {
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
              var5_int = this.field_j.a(param1);
              var6 = this.field_j.field_B + this.field_j.field_E;
              var7 = param3;
              if (!param0) {
                break L1;
              } else {
                bl.b(21);
                break L1;
              }
            }
            L2: {
              if (var5_int + (var7 + 6) > ul.field_f) {
                var7 = -var5_int + ul.field_f - 6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = 32 + param2 + -this.field_j.field_E;
              if (ul.field_l >= var8 + (var6 + 6)) {
                break L3;
              } else {
                var8 = -var6 + ul.field_l - 6;
                break L3;
              }
            }
            ul.d(var7, var8, var5_int + 6, var6 - -6, this.field_m);
            ul.h(1 + var7, var8 - -1, 4 + var5_int, var6 - -4, this.field_k);
            this.field_j.b(param1, 3 + var7, this.field_j.field_E + (var8 - -3), this.field_m, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("bl.D(").append(param0).append(',');

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
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
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
              if (!this.field_b) {
                this.a(false, param3, param0, param1);
                break L1;
              } else {
                this.a(param1, (byte) 84, param0, param3);
                break L1;
              }
            }
            L2: {
              if (param2 == 0) {
                break L2;
              } else {
                bl.b(-79);
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

            stackIn_8_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 13756) {
            return;
        }
        field_n = null;
    }

    private final void a(int param0, byte param1, int param2, String param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_h - -this.field_a;
              var6 = this.field_d + this.field_o;
              var7 = this.field_i;
              if (-1 != var7) {
                break L1;
              } else {
                var7 = this.field_j.field_B + this.field_j.field_H;
                break L1;
              }
            }
            L2: {
              var8 = ul.field_f >> -1569506814;
              var9 = this.field_j.a(param3);
              if (param1 > 63) {
                break L2;
              } else {
                this.a(-73, 11, -20, 9, -90, 41, -128);
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = this.field_j.field_H + this.field_j.field_B;
                var11 = 1;
                if (var9 > var8) {
                  break L4;
                } else {
                  if (0 != (param3.indexOf("<br>") ^ -1)) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 - -((var13 + var9 % var8 - 1) / var13 * 2);
                  break L5;
                }
              }
              L6: {
                if (null != ck.field_h) {
                  break L6;
                } else {
                  ck.field_h = new String[16];
                  break L6;
                }
              }
              var11 = this.field_j.a(param3, new int[]{var12}, ck.field_h);
              var10 = var10 + var7 * (var11 - 1);
              var9 = 0;
              var13 = 0;
              L7: while (true) {
                if (var13 >= var11) {
                  break L3;
                } else {
                  var14 = this.field_j.a(ck.field_h[var13]);
                  if (var14 > var9) {
                    var9 = var14;
                    var13++;
                    continue L7;
                  } else {
                    var13++;
                    continue L7;
                  }
                }
              }
            }
            L8: {
              var12 = param0;
              if (ul.field_f >= var5_int + var9 + var12) {
                break L8;
              } else {
                var12 = ul.field_f - (var9 + var5_int);
                break L8;
              }
            }
            L9: {
              var13 = param2 - (this.field_j.field_E - 32);
              if (ul.field_l < var6 + (var13 - -var10)) {
                var13 = -var10 + param2 - var6;
                break L9;
              } else {
                break L9;
              }
            }
            ul.d(var12, var13, var5_int + var9, var10 - -var6, this.field_r);
            ul.h(var12 - -1, 1 + var13, -2 + var9 - -var5_int, var10 - (-var6 + 2), this.field_k);
            this.field_j.a(param3, var12 + this.field_h, var13 - -this.field_o, var9, var10, this.field_m, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("bl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final static void a(int param0) {
        if (!(null == jg.field_n)) {
            return;
        }
        jg.field_n = new String[27];
        jg.field_n[3] = vh.field_i;
        jg.field_n[11] = qf.field_h;
        jg.field_n[15] = ha.field_j;
        jg.field_n[6] = jl.field_a;
        jg.field_n[14] = nf.field_l;
        jg.field_n[16] = bm.field_c;
        jg.field_n[5] = jl.field_a;
        jg.field_n[12] = l.field_j;
        jg.field_n[0] = k.field_e;
        jg.field_n[4] = rc.field_i;
        jg.field_n[7] = dk.field_b;
        jg.field_n[2] = gl.field_f;
        jg.field_n[1] = vg.field_s;
        jg.field_n[13] = gl.field_a;
        jg.field_n[24] = gb.field_g[5];
        jg.field_n[9] = eg.field_w[1];
        if (param0 < 14) {
            bl.b(-55);
        }
        jg.field_n[20] = gb.field_g[1];
        jg.field_n[23] = gb.field_g[4];
        jg.field_n[18] = qj.field_g;
        jg.field_n[21] = gb.field_g[2];
        jg.field_n[10] = eg.field_w[2];
        jg.field_n[8] = eg.field_w[0];
        jg.field_n[19] = gb.field_g[0];
        jg.field_n[26] = wh.field_d;
        jg.field_n[17] = mi.field_d;
        jg.field_n[22] = gb.field_g[3];
        jg.field_n[25] = cc.field_m;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 90) {
            return;
        }
        ul.d(param5, param3, param1, param2, param0, param4);
    }

    public bl() {
        this.field_b = true;
    }

    static {
        field_g = -1;
    }
}
