/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    il field_q;
    int field_m;
    isa field_u;
    int field_b;
    static da field_p;
    static ur field_j;
    int field_a;
    int field_l;
    isa field_k;
    private boolean field_n;
    isa field_d;
    isa field_h;
    private int field_s;
    int field_o;
    isa field_v;
    isa field_e;
    int field_i;
    int field_g;
    int field_c;
    int field_f;
    isa field_r;
    int field_t;

    final void a(byte param0) {
        pfa.a(1);
        if (param0 < 22) {
            kn.a(-128);
        }
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
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((kn) this).field_f + ((kn) this).field_i;
              var6 = ((kn) this).field_b + ((kn) this).field_t;
              var7 = ((kn) this).field_o;
              if (var7 == -1) {
                var7 = ((kn) this).field_q.field_k + ((kn) this).field_q.field_w;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = bea.field_g >> 2;
                var9 = ((kn) this).field_q.b(param1);
                var10 = ((kn) this).field_q.field_w + ((kn) this).field_q.field_k;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (-1 != param1.indexOf("<br>")) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L4;
                } else {
                  var13 = var9 / var8;
                  var12 = (-1 + (var13 + var9 % var8)) / var13 * 2 + var8;
                  break L4;
                }
              }
              L5: {
                if (uo.field_d == null) {
                  uo.field_d = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 = ((kn) this).field_q.a(param1, new int[1], uo.field_d);
              var10 = var10 + var7 * (var11 + -1);
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((kn) this).field_q.b(uo.field_d[var13]);
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
              if (var12 - (-var9 + -var5_int) > bea.field_g) {
                var12 = -var5_int + (bea.field_g + -var9);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = param2 - (((kn) this).field_q.field_G - 32);
              if (var13 + var10 + var6 <= bea.field_a) {
                break L9;
              } else {
                var13 = -var6 + param2 + -var10;
                break L9;
              }
            }
            bea.f(var12, var13, var5_int + var9, var6 + var10, ((kn) this).field_a);
            bea.e(var12 + 1, var13 - -1, var9 + (var5_int + -2), var10 + var6 + -2, ((kn) this).field_c);
            int discarded$1 = ((kn) this).field_q.a(param1, ((kn) this).field_i + var12, ((kn) this).field_t + var13, var9, var10, ((kn) this).field_s, -1, 0, 0, var7);
            var14 = -78 % ((-56 - param0) / 47);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var5;
            stackOut_26_1 = new StringBuilder().append("kn.I(").append(param0).append(',');
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
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, boolean param2, int param3) {
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
              if (param2) {
                break L1;
              } else {
                ((kn) this).field_g = 12;
                break L1;
              }
            }
            L2: {
              if (!((kn) this).field_n) {
                this.a(param3, param1, param0, (byte) 73);
                break L2;
              } else {
                this.a(67, param0, param3, param1);
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
            stackOut_6_1 = new StringBuilder().append("kn.A(");
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        bea.c(param6, param0, param5, param1, param2, param3);
        if (param4 <= 103) {
            ((kn) this).field_n = false;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        tga.a(-21953, param2, param4, param3, param1);
        if (param0 <= 25) {
            Object var7 = null;
            this.a(97, (String) null, -120, -122);
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
            kn.a(118);
        }
        field_j = null;
        field_p = null;
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = ((kn) this).field_q.b(param2);
            var6 = ((kn) this).field_q.field_k + ((kn) this).field_q.field_G;
            var7 = param1;
            if (var5_int + (var7 - -6) > bea.field_g) {
                var7 = -6 + bea.field_g - var5_int;
            }
            var8 = param0 + (-((kn) this).field_q.field_G + 32);
            if (!(bea.field_a >= 6 + var6 + var8)) {
                var8 = -var6 + (bea.field_a + -6);
            }
            bea.f(var7, var8, 6 + var5_int, 6 + var6, ((kn) this).field_s);
            bea.e(var7 - -1, 1 + var8, 4 + var5_int, 4 + var6, ((kn) this).field_c);
            ((kn) this).field_q.c(param2, var7 - -3, ((kn) this).field_q.field_G + (3 + var8), ((kn) this).field_s, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "kn.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 73 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 != 8947848) {
            ((kn) this).a((byte) 41, 95, -41, 50, 51);
        }
        bea.a(param3, param0, param4, param5, param1);
    }

    final void a(il param0, boolean param1) {
        RuntimeException var3 = null;
        vga var4 = null;
        iu[] var5 = null;
        vga var6 = null;
        int var7_int = 0;
        vga var7 = null;
        vga var8 = null;
        iu[] var9 = null;
        iu[] var10 = null;
        vga var11 = null;
        vga var12 = null;
        iu var13 = null;
        vga var14 = null;
        int var15 = 0;
        mea var16 = null;
        vpa var17 = null;
        mea var18 = null;
        vga var19 = null;
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
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var17 = new vpa(param0, 2, 2, 2236962, 1, 1, 1, 2 + (param0.field_w - -param0.field_k));
            var17.field_j = 16777215;
            ((kn) this).field_k = (isa) (Object) var17;
            var4 = new vga();
            var17.a((vpa) (Object) var4, -49);
            ((kn) this).field_t = 3;
            ((kn) this).field_q = param0;
            ((kn) this).field_i = 3;
            var4.field_k = 15658734;
            ((kn) this).field_s = 15658734;
            ((kn) this).field_a = 15658734;
            ((kn) this).field_c = 5592405;
            var4.field_d = 11711154;
            ((kn) this).field_f = 3;
            ((kn) this).field_b = 3;
            ((kn) this).field_o = -1;
            ng discarded$10 = var4.a(0, (byte) 41).b(15658734, -2147483648).a(2, gn.b(8947848, 1, 10066329, 7829367));
            ng discarded$11 = var4.a(1, (byte) 98).a(2, gn.b(11184810, 1, 10066329, 13421772));
            ng discarded$12 = var4.a(3, (byte) 42).a(2, gn.b(8947848, 1, 7829367, 10066329)).c(-1, 1).a(1, 1);
            var5 = new iu[9];
            var16 = new mea(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_r.length) {
                var5[4] = (iu) (Object) var18;
                ng discarded$13 = var4.a(4, (byte) 127).a(-2, true).a(2, var5);
                ng discarded$14 = var4.a(5, (byte) 107).a(2, jsa.b(65793, 2, 0, 0, 0)).a(-2, true).b(-1, -2147483648);
                ((kn) this).field_u = (isa) (Object) var4;
                var6 = new vga(var4, true);
                var6.field_l = 0;
                var7 = new vga(var4, true);
                var7.field_l = 0;
                var7.a(-18379, eca.a(4, 8947848));
                ng discarded$15 = var7.a(1, (byte) 85).a(2, eca.a(4, 11184810)).b(2236962, -2147483648);
                ((kn) this).field_d = (isa) (Object) new jr(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                bsa discarded$16 = new bsa(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                cj discarded$17 = new cj(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new vga();
                var17.a((vpa) (Object) var8, -107);
                ng discarded$18 = var8.a(0, (byte) 65).a(2, gn.b(15658734, 1, 7829367, 10066329)).b(1118481, -2147483648).a((byte) 7, -1);
                ng discarded$19 = var8.a(4, (byte) 87).a(-2, true).a(2, var5);
                ((kn) this).field_e = (isa) (Object) var8;
                var9 = new iu[9];
                var10 = new iu[9];
                var9[4] = new iu(2, 1);
                var10[4] = new iu(1, 2);
                var9[4].field_r = new int[]{6710886, 7829367};
                var10[4].field_r = new int[]{6710886, 7829367};
                var11 = new vga();
                var12 = new vga();
                var11.a(0, 0, var9);
                var12.a(0, 0, var10);
                ((kn) this).field_r = (isa) (Object) var12;
                ((kn) this).field_h = (isa) (Object) var4;
                var13 = new iu(7, 4);
                ((kn) this).field_m = 10;
                var13.field_r = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new vga(var4, param1);
                var14.a(var13.a(), (byte) -107);
                var13.b();
                var14 = new vga(var4, true);
                var14.a(var13.a(), (byte) -102);
                var13.b();
                var14 = new vga(var4, true);
                var14.a(var13.a(), (byte) 121);
                var13.b();
                var19 = new vga(var4, true);
                var19.a(var13, (byte) 60);
                break L0;
              } else {
                var16.field_r[var7_int] = 1077952576;
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
            stackOut_6_1 = new StringBuilder().append("kn.B(");
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public kn() {
        ((kn) this).field_n = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ur(4);
    }
}
