/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    private boolean field_s;
    int field_j;
    int field_h;
    private int field_a;
    ca field_o;
    ca field_d;
    int field_k;
    static int field_t;
    ca field_q;
    ca field_m;
    static tb field_p;
    ca field_c;
    int field_l;
    static String field_b;
    int field_e;
    static String field_r;
    se field_f;
    int field_g;
    static String[] field_n;
    int field_i;

    private final void a(int param0, byte param1, String param2, int param3) {
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
        var15 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var5_int = this.field_e - -this.field_g;
              var6 = this.field_h + this.field_l;
              var7 = this.field_i;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = this.field_f.field_E + this.field_f.field_H;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = gf.field_i >> 1347161634;
                var9 = this.field_f.b(param2);
                var10 = this.field_f.field_E + this.field_f.field_H;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if ((param2.indexOf("<br>") ^ -1) == 0) {
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
                  var12 = var8 + (-1 + (var9 % var8 - -var13)) / var13 * 2;
                  break L4;
                }
              }
              L5: {
                if (null != pe.field_m) {
                  break L5;
                } else {
                  pe.field_m = new String[16];
                  break L5;
                }
              }
              var11 = this.field_f.a(param2, new int[]{var12}, pe.field_m);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  var14 = this.field_f.b(pe.field_m[var13]);
                  if ((var14 ^ -1) < (var9 ^ -1)) {
                    var9 = var14;
                    var13++;
                    continue L6;
                  } else {
                    var13++;
                    continue L6;
                  }
                }
              }
            }
            L7: {
              var12 = param0;
              if (var12 - (-var9 + -var5_int) > gf.field_i) {
                var12 = -var9 + (gf.field_i + -var5_int);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var13 = 32 + (-this.field_f.field_N + param3);
              if (gf.field_c < var6 + (var13 + var10)) {
                var13 = -var6 + -var10 + param3;
                break L8;
              } else {
                break L8;
              }
            }
            gf.e(var12, var13, var9 - -var5_int, var6 + var10, this.field_k);
            if (param1 == -81) {
              gf.b(var12 - -1, 1 + var13, var5_int + var9 + -2, -2 + (var6 + var10), this.field_j);
              this.field_f.a(param2, this.field_e + var12, var13 + this.field_l, var9, var10, this.field_a, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("lh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, se param1) {
        hh var18 = null;
        an var4 = null;
        cn[] var5 = null;
        ei var17 = null;
        ei var19 = null;
        int var8_int = 0;
        an var7 = null;
        an var8 = null;
        jn discarded$0 = null;
        im discarded$1 = null;
        an var9 = null;
        cn[] var10 = null;
        cn[] var11 = null;
        cn dupTemp$2 = null;
        an var12 = null;
        an var13 = null;
        cn var14 = null;
        an var15 = null;
        an var20 = null;
        int var16 = DungeonAssault.field_K;
        try {
            var18 = new hh(param1, 2, 2, 2236962, 1, 1, 1, param1.field_H + (param1.field_E - -2));
            var18.field_g = 16777215;
            this.field_m = (ca) ((Object) var18);
            var4 = new an();
            var18.a((byte) 126, var4);
            var4.field_t = 11711154;
            this.field_i = -1;
            this.field_a = 15658734;
            this.field_f = param1;
            this.field_j = 5592405;
            this.field_e = 3;
            this.field_g = 3;
            this.field_l = 3;
            this.field_h = 3;
            var4.field_j = 15658734;
            this.field_k = 15658734;
            var4.a(0, (byte) -115).a(-7695, 15658734).a(bb.a(8947848, false, 7829367, 10066329), true);
            var4.a(1, (byte) -90).a(bb.a(11184810, false, 13421772, 10066329), true);
            var4.a(3, (byte) -97).a(bb.a(8947848, false, 10066329, 7829367), true).b(1, -114).c(1, -33);
            int var6 = -31 / ((param0 - -69) / 45);
            var5 = new cn[9];
            var17 = new ei(32, 32);
            var19 = var17;
            for (var8_int = 0; var8_int < var19.field_B.length; var8_int++) {
                var17.field_B[var8_int] = 1077952576;
            }
            var5[4] = (cn) ((Object) var19);
            var4.a(4, (byte) -115).a((byte) -110, true).a(var5, true);
            var4.a(5, (byte) -86).a(hj.a(0, 65793, (byte) 123, 0, 0), true).a((byte) -116, true).a(-7695, -1);
            this.field_o = (ca) ((Object) var4);
            var7 = new an(var4, true);
            var7.field_f = 0;
            var8 = new an(var4, true);
            var8.field_f = 0;
            var8.a(ek.a((byte) -64, 8947848), 0);
            var8.a(1, (byte) -107).a(ek.a((byte) -93, 11184810), true).a(-7695, 2236962);
            this.field_q = (ca) ((Object) new oh(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new jn(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new im(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var9 = new an();
            var18.a((byte) 126, var9);
            var9.a(0, (byte) -99).a(bb.a(15658734, false, 10066329, 7829367), true).a(-7695, 1118481).d(-1, 216);
            var9.a(4, (byte) -91).a((byte) -111, true).a(var5, true);
            this.field_c = (ca) ((Object) var9);
            var10 = new cn[9];
            var10[4] = new cn(2, 1);
            var11 = new cn[9];
            var11[4] = new cn(1, 2);
            dupTemp$2 = var10[4];
            dupTemp$2.field_B = new int[]{6710886, 7829367};
            var11[4].field_B = new int[]{6710886, 7829367};
            var12 = new an();
            var13 = new an();
            var12.a(0, var10, -116);
            var13.a(0, var11, -116);
            var14 = new cn(7, 4);
            var14.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var15 = new an(var4, true);
            var15.a((byte) 47, var14.d());
            var14.g();
            var15 = new an(var4, true);
            var15.a((byte) 47, var14.d());
            var14.g();
            var15 = new an(var4, true);
            var15.a((byte) 47, var14.d());
            var14.g();
            var20 = new an(var4, true);
            var20.a((byte) 47, var14);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "lh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        gf.b(param1, param2, param0, param6, param3, param5);
        if (param4 > -61) {
            this.a(-30, 77, 78, 91, 100, false);
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_b = null;
        field_n = null;
        field_p = null;
        if (param0 > -54) {
            lh.a(6);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        gf.c(param3, param2, param0, param1, param4);
        if (!param5) {
            this.field_s = true;
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            var5_int = this.field_f.b(param3);
            var6 = this.field_f.field_N - -this.field_f.field_E;
            var7 = param1;
            if (param2 == 28964) {
              L1: {
                if (6 + (var7 + var5_int) > gf.field_i) {
                  var7 = -var5_int + (gf.field_i + -6);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var8 = 32 + -this.field_f.field_N + param0;
                if (6 + var6 + var8 > gf.field_c) {
                  var8 = gf.field_c + (-var6 - 6);
                  break L2;
                } else {
                  break L2;
                }
              }
              gf.e(var7, var8, 6 + var5_int, 6 + var6, this.field_a);
              gf.b(var7 - -1, var8 + 1, var5_int - -4, var6 - -4, this.field_j);
              this.field_f.b(param3, var7 + 3, this.field_f.field_N + var8 + 3, this.field_a, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("lh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
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
              if (this.field_s) {
                this.a(param3, (byte) -81, param0, param2);
                break L1;
              } else {
                this.a(param2, param3, param1 + -6681922, param0);
                break L1;
              }
            }
            L2: {
              if (param1 == 6710886) {
                break L2;
              } else {
                field_r = (String) null;
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

            stackIn_8_1 = new StringBuilder().append("lh.G(");

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
          throw vk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public lh() {
        this.field_s = true;
    }

    static {
        field_b = "<col=8B1717>Charge</col>";
        field_r = "Connection timed out. Please try using a different server.";
        field_t = 9;
        field_n = new String[]{"<%0> the Feared", "<%0> the Stalwart", "<%0> the Vengeful", "<%0> the Tyrant", "<%0>, Mistress of the Game"};
    }
}
