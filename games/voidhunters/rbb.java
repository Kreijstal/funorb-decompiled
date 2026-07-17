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
            ((rbb) this).a((byte) 18);
        }
        dma.e(param5, param0, param3, param6, param4, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 11480) {
            Object var8 = null;
            this.a(-20, -99, (String) null, 15);
        }
        dma.a(param4, param1, param3, param2, param0);
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var5_int = ((rbb) this).field_j + ((rbb) this).field_h;
              var6 = ((rbb) this).field_u - -((rbb) this).field_c;
              var7 = ((rbb) this).field_g;
              if (-1 == var7) {
                var7 = ((rbb) this).field_p.field_k + ((rbb) this).field_p.field_A;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = dma.field_g >> 2;
                var9 = ((rbb) this).field_p.b(param3);
                var10 = ((rbb) this).field_p.field_A + ((rbb) this).field_p.field_k;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (-1 != param3.indexOf("<br>")) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = (var13 + var9 % var8 + -1) / var13 * 2 + var8;
                  break L4;
                }
              }
              L5: {
                if (wkb.field_d == null) {
                  wkb.field_d = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 = ((rbb) this).field_p.a(param3, new int[1], wkb.field_d);
              var10 = var10 + var7 * (-1 + var11);
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((rbb) this).field_p.b(wkb.field_d[var13]);
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
              if (dma.field_g < var12 + var9 + var5_int) {
                var12 = -var5_int + -var9 + dma.field_g;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = -((rbb) this).field_p.field_o + param2 + 32;
              if (dma.field_j >= var13 - -var10 - -var6) {
                break L9;
              } else {
                var13 = -var10 + param2 + -var6;
                break L9;
              }
            }
            dma.b(var12, var13, var9 - -var5_int, var6 + var10, ((rbb) this).field_m);
            dma.d(var12 - -1, 1 + var13, var9 - (-var5_int - -2), var10 + (var6 - 2), ((rbb) this).field_b);
            int discarded$1 = ((rbb) this).field_p.a(param3, var12 + ((rbb) this).field_h, ((rbb) this).field_u + var13, var9, var10, ((rbb) this).field_t, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var5;
            stackOut_25_1 = new StringBuilder().append("rbb.I(").append(1).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
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
              if (param0 == 27) {
                break L1;
              } else {
                ((rbb) this).field_s = -7;
                break L1;
              }
            }
            L2: {
              if (((rbb) this).field_f) {
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("rbb.H(").append(param0).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
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
              var5_int = ((rbb) this).field_p.b(param2);
              var6 = ((rbb) this).field_p.field_A + ((rbb) this).field_p.field_o;
              var7 = param3;
              if (var5_int + var7 - -6 > dma.field_g) {
                var7 = -6 + (-var5_int + dma.field_g);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = 32 + -((rbb) this).field_p.field_o + param0;
              if (dma.field_j >= 6 + var6 + var8) {
                break L2;
              } else {
                var8 = dma.field_j + -var6 + -6;
                break L2;
              }
            }
            dma.b(var7, var8, var5_int - -6, var6 - -6, ((rbb) this).field_t);
            dma.d(1 + var7, 1 + var8, var5_int - -4, 4 + var6, ((rbb) this).field_b);
            ((rbb) this).field_p.c(param2, var7 + 3, ((rbb) this).field_p.field_o + param1 + var8, ((rbb) this).field_t, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("rbb.F(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 103) {
            ((rbb) this).field_b = -4;
        }
        qca.a(param2, param0, param4, true, param3);
    }

    final void a(no param0, int param1) {
        RuntimeException var3 = null;
        uea var4 = null;
        phb[] var5 = null;
        uea var6 = null;
        int var7_int = 0;
        uea var7 = null;
        uea var8 = null;
        phb[] var9 = null;
        phb[] var10 = null;
        uea var11 = null;
        uea var12 = null;
        phb var13 = null;
        uea var14 = null;
        int var15 = 0;
        jva var16 = null;
        bob var17 = null;
        jva var18 = null;
        uea var19 = null;
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
        var15 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var17 = new bob(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.field_A + param0.field_k);
              var17.field_i = 16777215;
              ((rbb) this).field_n = (wwa) (Object) var17;
              var4 = new uea();
              var17.a(param1 + 24639, (bob) (Object) var4);
              ((rbb) this).field_t = 15658734;
              ((rbb) this).field_b = 5592405;
              var4.field_a = 15658734;
              ((rbb) this).field_p = param0;
              ((rbb) this).field_h = 3;
              ((rbb) this).field_m = 15658734;
              ((rbb) this).field_g = -1;
              var4.field_b = 11711154;
              ((rbb) this).field_j = 3;
              ((rbb) this).field_c = 3;
              ((rbb) this).field_u = 3;
              vv discarded$10 = var4.a(0, -1).b(15658734, -2147483648).a(true, vdb.a(10066329, 8947848, 117, 7829367));
              if (param1 == -24763) {
                break L1;
              } else {
                ((rbb) this).a(99, (byte) 19, 39, -32, 64);
                break L1;
              }
            }
            vv discarded$11 = var4.a(1, -1).a(true, vdb.a(10066329, 11184810, 118, 13421772));
            vv discarded$12 = var4.a(3, -1).a(true, vdb.a(7829367, 8947848, 123, 10066329)).a(113, 1).b(1, false);
            var5 = new phb[9];
            var16 = new jva(32, 32);
            var18 = var16;
            var7_int = 0;
            L2: while (true) {
              if (var18.field_r.length <= var7_int) {
                var5[4] = (phb) (Object) var18;
                vv discarded$13 = var4.a(4, -1).a(-123, true).a(true, var5);
                vv discarded$14 = var4.a(5, -1).a(true, ra.a(0, (byte) 119, 0, 65793, 0)).a(param1 + 24638, true).b(-1, param1 + -2147458885);
                ((rbb) this).field_a = (wwa) (Object) var4;
                var6 = new uea(var4, true);
                var6.field_c = 0;
                var7 = new uea(var4, true);
                var7.field_c = 0;
                var7.a(prb.a(true, 8947848), (byte) -54);
                vv discarded$15 = var7.a(1, -1).a(true, prb.a(true, 11184810)).b(2236962, -2147483648);
                ((rbb) this).field_d = (wwa) (Object) new uv(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                ei discarded$16 = new ei(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                jba discarded$17 = new jba(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new uea();
                var17.a(-122, (bob) (Object) var8);
                vv discarded$18 = var8.a(0, -1).a(true, vdb.a(7829367, 15658734, param1 + 24884, 10066329)).b(1118481, -2147483648).c(-1, param1 + -2147458885);
                vv discarded$19 = var8.a(4, -1).a(param1 + 24635, true).a(true, var5);
                ((rbb) this).field_o = (wwa) (Object) var8;
                var9 = new phb[9];
                var9[4] = new phb(2, 1);
                var10 = new phb[9];
                var10[4] = new phb(1, 2);
                var9[4].field_r = new int[]{6710886, 7829367};
                var10[4].field_r = new int[]{6710886, 7829367};
                var11 = new uea();
                var12 = new uea();
                var11.a(0, var9, 15486);
                var12.a(0, var10, param1 ^ -23749);
                ((rbb) this).field_l = (wwa) (Object) var4;
                ((rbb) this).field_e = (wwa) (Object) var12;
                var13 = new phb(7, 4);
                ((rbb) this).field_s = 10;
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
                break L0;
              } else {
                var16.field_r[var7_int] = 1077952576;
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
            stackOut_8_1 = new StringBuilder().append("rbb.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    public rbb() {
        ((rbb) this).field_f = true;
    }

    static {
    }
}
