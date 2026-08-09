/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rbb {
    int field_c;
    int field_h;
    int field_u;
    wwa field_a;
    wwa field_l;
    int field_r;
    int field_s;
    wwa field_e;
    static wdb field_k;
    private boolean field_f;
    int field_m;
    wwa field_o;
    wwa field_d;
    int field_j;
    private int field_t;
    int field_b;
    wwa field_n;
    int field_i;
    int field_g;
    wwa field_q;
    no field_p;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
            this.a((byte) 18);
        }
        dma.e(param5, param0, param3, param6, param4, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 11480) {
            String var8 = (String) null;
            this.a(-20, -99, (String) null, 15);
        }
        dma.a(param4, param1, param3, param2, param0);
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
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
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = this.field_j + this.field_h;
              var6 = this.field_u - -this.field_c;
              var7 = this.field_g;
              if (-1 == var7) {
                var7 = this.field_p.field_k + this.field_p.field_A;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = dma.field_g >> 1857704290;
              if (param0) {
                break L2;
              } else {
                this.a(53, -30, true, -4, 116, 102, 70);
                break L2;
              }
            }
            L3: {
              L4: {
                var9 = this.field_p.b(param3);
                var10 = this.field_p.field_A + this.field_p.field_k;
                var11 = 1;
                if (var9 > var8) {
                  break L4;
                } else {
                  if (-1 != param3.indexOf("<br>")) {
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
                  var12 = (var13 + var9 % var8 + -1) / var13 * 2 + var8;
                  break L5;
                }
              }
              L6: {
                if (wkb.field_d == null) {
                  wkb.field_d = new String[16];
                  break L6;
                } else {
                  break L6;
                }
              }
              var11 = this.field_p.a(param3, new int[]{var12}, wkb.field_d);
              var10 = var10 + var7 * (-1 + var11);
              var9 = 0;
              var13 = 0;
              L7: while (true) {
                if (var13 >= var11) {
                  break L3;
                } else {
                  var14 = this.field_p.b(wkb.field_d[var13]);
                  if (var9 < var14) {
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
              var12 = param1;
              if (dma.field_g < var12 + var9 + var5_int) {
                var12 = -var5_int + -var9 + dma.field_g;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = -this.field_p.field_o + param2 + 32;
              if (dma.field_j >= var13 - -var10 - -var6) {
                break L9;
              } else {
                var13 = -var10 + param2 + -var6;
                break L9;
              }
            }
            dma.b(var12, var13, var9 - -var5_int, var6 + var10, this.field_m);
            dma.d(var12 - -1, 1 + var13, var9 - (-var5_int - -2), var10 + (var6 - 2), this.field_b);
            this.field_p.a(param3, var12 + this.field_h, this.field_u + var13, var9, var10, this.field_t, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("rbb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L10;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L10;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != -29) {
            return;
        }
        field_k = null;
    }

    final void a(byte param0) {
        bia.a((byte) 124);
        if (param0 < 82) {
            rbb.b((byte) 6);
        }
    }

    final void a(byte param0, String param1, int param2, int param3) {
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
              if (param0 == 27) {
                break L1;
              } else {
                this.field_s = -7;
                break L1;
              }
            }
            L2: {
              if (this.field_f) {
                this.a(true, param2, param3, param1);
                break L2;
              } else {
                this.a(param3, 3, param1, param2);
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

            stackIn_8_1 = new StringBuilder().append("rbb.H(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_p.b(param2);
            var6 = this.field_p.field_A + this.field_p.field_o;
            var7 = param3;
            if (!(var5_int + var7 - -6 <= dma.field_g)) {
                var7 = -6 + (-var5_int + dma.field_g);
            }
            var8 = 32 + -this.field_p.field_o + param0;
            if (dma.field_j < 6 + var6 + var8) {
                var8 = dma.field_j + -var6 + -6;
            }
            dma.b(var7, var8, var5_int - -6, var6 - -6, this.field_t);
            dma.d(1 + var7, 1 + var8, var5_int - -4, 4 + var6, this.field_b);
            this.field_p.c(param2, var7 + 3, this.field_p.field_o + param1 + var8, this.field_t, -1);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rbb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 103) {
            this.field_b = -4;
        }
        qca.a(param2, param0, param4, true, param3);
    }

    final void a(no param0, int param1) {
        bob var17 = null;
        uea var4 = null;
        phb[] var5 = null;
        jva var16 = null;
        jva var18 = null;
        int var7_int = 0;
        uea var6 = null;
        uea var7 = null;
        ei discarded$0 = null;
        jba discarded$1 = null;
        uea var8 = null;
        phb[] var9 = null;
        phb[] var10 = null;
        phb dupTemp$2 = null;
        uea var11 = null;
        uea var12 = null;
        phb var13 = null;
        uea var14 = null;
        uea var19 = null;
        int var15 = VoidHunters.field_G;
        try {
            var17 = new bob(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_A + param0.field_k);
            var17.field_i = 16777215;
            this.field_n = (wwa) ((Object) var17);
            var4 = new uea();
            var17.a(param1 + 24639, var4);
            this.field_t = 15658734;
            this.field_b = 5592405;
            var4.field_a = 15658734;
            this.field_p = param0;
            this.field_h = 3;
            this.field_m = 15658734;
            this.field_g = -1;
            var4.field_b = 11711154;
            this.field_j = 3;
            this.field_c = 3;
            this.field_u = 3;
            var4.a(0, -1).b(15658734, -2147483648).a(true, vdb.a(10066329, 8947848, 117, 7829367));
            if (param1 != -24763) {
                this.a(99, (byte) 19, 39, -32, 64);
            }
            var4.a(1, -1).a(true, vdb.a(10066329, 11184810, 118, 13421772));
            var4.a(3, -1).a(true, vdb.a(7829367, 8947848, 123, 10066329)).a(113, 1).b(1, false);
            var5 = new phb[9];
            var16 = new jva(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_r.length > var7_int; var7_int++) {
                var16.field_r[var7_int] = 1077952576;
            }
            var5[4] = (phb) ((Object) var18);
            var4.a(4, -1).a(-123, true).a(true, var5);
            var4.a(5, -1).a(true, ra.a(0, (byte) 119, 0, 65793, 0)).a(param1 + 24638, true).b(-1, param1 + -2147458885);
            this.field_a = (wwa) ((Object) var4);
            var6 = new uea(var4, true);
            var6.field_c = 0;
            var7 = new uea(var4, true);
            var7.field_c = 0;
            var7.a(prb.a(true, 8947848), (byte) -54);
            var7.a(1, -1).a(true, prb.a(true, 11184810)).b(2236962, -2147483648);
            this.field_d = (wwa) ((Object) new uv(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new ei(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new jba(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new uea();
            var17.a(-122, var8);
            var8.a(0, -1).a(true, vdb.a(7829367, 15658734, param1 + 24884, 10066329)).b(1118481, -2147483648).c(-1, param1 + -2147458885);
            var8.a(4, -1).a(param1 + 24635, true).a(true, var5);
            this.field_o = (wwa) ((Object) var8);
            var9 = new phb[9];
            var9[4] = new phb(2, 1);
            var10 = new phb[9];
            var10[4] = new phb(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_r = new int[]{6710886, 7829367};
            var10[4].field_r = new int[]{6710886, 7829367};
            var11 = new uea();
            var12 = new uea();
            var11.a(0, var9, 15486);
            var12.a(0, var10, param1 ^ -23749);
            this.field_l = (wwa) ((Object) var4);
            this.field_e = (wwa) ((Object) var12);
            var13 = new phb(7, 4);
            this.field_s = 10;
            var13.field_r = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new uea(var4, true);
            var14.a(param1 ^ -7799, var13.d());
            var13.c();
            var14 = new uea(var4, true);
            var14.a(32460, var13.d());
            var13.c();
            var14 = new uea(var4, true);
            var14.a(32460, var13.d());
            var13.c();
            var19 = new uea(var4, true);
            var19.a(32460, var13);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rbb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public rbb() {
        this.field_f = true;
    }

    static {
    }
}
