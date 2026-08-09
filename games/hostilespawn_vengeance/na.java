/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    int field_a;
    int field_f;
    nn field_j;
    nn field_n;
    int field_p;
    nn field_e;
    private boolean field_m;
    nn field_h;
    nn field_d;
    int field_l;
    private int field_k;
    static boolean field_b;
    static String field_q;
    int field_g;
    int field_o;
    static vm field_c;
    vm field_i;
    int field_r;

    private final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_p + this.field_g;
              var6 = this.field_l + this.field_r;
              var7 = this.field_o;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = this.field_i.field_F + this.field_i.field_y;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = si.field_e >> -2101495902;
                var9 = this.field_i.a(param3);
                var10 = this.field_i.field_F + this.field_i.field_y;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (param3.indexOf("<br>") != -1) {
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
                  var12 = var8 - -(2 * ((var13 + var9 % var8 - 1) / var13));
                  break L4;
                }
              }
              L5: {
                if (null != jd.field_v) {
                  break L5;
                } else {
                  jd.field_v = new String[16];
                  break L5;
                }
              }
              var11 = this.field_i.a(param3, new int[]{var12}, jd.field_v);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  var14 = this.field_i.a(jd.field_v[var13]);
                  if (var14 > var9) {
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
              var12 = param1;
              if (var9 + (var12 - -var5_int) > si.field_e) {
                var12 = -var9 + si.field_e + -var5_int;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var13 = 32 + (param2 - this.field_i.field_N);
              if (var6 + var13 + var10 <= si.field_k) {
                break L8;
              } else {
                var13 = -var6 + param2 + -var10;
                break L8;
              }
            }
            si.a(var12, var13, var5_int + var9, var10 - -var6, this.field_f);
            si.c(1 + var12, 1 + var13, var5_int + (var9 - 2), -2 + var10 + var6, this.field_a);
            this.field_i.a(param3, this.field_p + var12, var13 - -this.field_r, var9, var10, this.field_k, -1, param0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("na.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    final void a(vm param0, byte param1) {
        cn var17 = null;
        ha var4 = null;
        bd[] var5 = null;
        gk var16 = null;
        gk var18 = null;
        int var7_int = 0;
        ha var6 = null;
        ha var7 = null;
        ra discarded$0 = null;
        h discarded$1 = null;
        ha var8 = null;
        bd[] var9 = null;
        bd[] var10 = null;
        bd dupTemp$2 = null;
        ha var11 = null;
        ha var12 = null;
        bd var13 = null;
        ha var14 = null;
        ha var19 = null;
        int var15 = HostileSpawn.field_I ? 1 : 0;
        try {
            var17 = new cn(param0, 2, 2, 2236962, 1, 1, 1, param0.field_F + param0.field_y + 2);
            var17.field_j = 16777215;
            this.field_h = (nn) ((Object) var17);
            var4 = new ha();
            var17.a(-33, var4);
            this.field_o = -1;
            this.field_a = 5592405;
            this.field_r = 3;
            this.field_l = 3;
            var4.field_d = 11711154;
            this.field_i = param0;
            this.field_p = 3;
            this.field_g = 3;
            this.field_k = 15658734;
            var4.field_o = 15658734;
            this.field_f = 15658734;
            var4.a(0, true).a(15658734, true).a(false, pm.a(7829367, 8947848, (byte) -117, 10066329));
            var4.a(1, true).a(false, pm.a(13421772, 11184810, (byte) -117, 10066329));
            var4.a(3, true).a(false, pm.a(10066329, 8947848, (byte) -117, 7829367)).b(1, 16802).a((byte) 92, 1);
            var5 = new bd[9];
            var16 = new gk(32, 32);
            var18 = var16;
            for (var7_int = 0; var7_int < var18.field_D.length; var7_int++) {
                var16.field_D[var7_int] = 1077952576;
            }
            var5[4] = (bd) ((Object) var18);
            var4.a(4, true).a((byte) -37, true).a(false, var5);
            var4.a(5, true).a(false, uk.a(65793, 0, (byte) 127, 0, 0)).a((byte) -128, true).a(-1, true);
            this.field_e = (nn) ((Object) var4);
            var6 = new ha(var4, true);
            var6.field_k = 0;
            var7 = new ha(var4, true);
            var7.field_k = 0;
            var7.a(false, en.h(-71, 8947848));
            var7.a(1, true).a(false, en.h(-96, 11184810)).a(2236962, true);
            this.field_n = (nn) ((Object) new rf(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new ra(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new h(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new ha();
            var17.a(-80, var8);
            var8.a(0, true).a(false, pm.a(10066329, 15658734, (byte) -117, 7829367)).a(1118481, true).a(-2147483648, -1);
            var8.a(4, true).a((byte) -52, true).a(false, var5);
            this.field_j = (nn) ((Object) var8);
            var9 = new bd[9];
            var9[4] = new bd(2, 1);
            if (param1 <= 50) {
                this.field_i = (vm) null;
            }
            var10 = new bd[9];
            var10[4] = new bd(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_D = new int[]{6710886, 7829367};
            var10[4].field_D = new int[]{6710886, 7829367};
            var11 = new ha();
            var12 = new ha();
            var11.a(0, var9, (byte) -26);
            var12.a(0, var10, (byte) -48);
            var13 = new bd(7, 4);
            var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new ha(var4, true);
            var14.a(true, var13.h());
            var13.b();
            var14 = new ha(var4, true);
            var14.a(true, var13.h());
            var13.b();
            var14 = new ha(var4, true);
            var14.a(true, var13.h());
            var13.b();
            var19 = new ha(var4, true);
            var19.a(true, var13);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "na.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_i.a(param2);
            var6 = this.field_i.field_F + this.field_i.field_N;
            var7 = param1;
            if (si.field_e < var7 - -var5_int + 6) {
                var7 = -var5_int + (si.field_e + -6);
            }
            var8 = param0 - (this.field_i.field_N - 32);
            if (6 + var6 + var8 > si.field_k) {
                var8 = -var6 + si.field_k + -6;
            }
            int var9 = 75 / ((2 - param3) / 35);
            si.a(var7, var8, 6 + var5_int, var6 + 6, this.field_k);
            si.c(1 + var7, 1 + var8, var5_int - -4, 4 + var6, this.field_a);
            this.field_i.c(param2, var7 + 3, var8 - -3 + this.field_i.field_N, this.field_k, -1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "na.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 != 11776) {
            return;
        }
        si.a(param0, param5, param1, param4, param3, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 1077952576) {
            return;
        }
        si.g(param3, param5, param1, param2, param4);
    }

    final void a(int param0, String param1, int param2, int param3) {
        try {
            if (this.field_m) {
                this.a(0, param2, param0, param1);
            } else {
                this.a(param0, param2, param1, (byte) -54);
            }
            int var5_int = 125 / ((-59 - param3) / 39);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "na.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 80) {
            field_q = (String) null;
        }
        field_q = null;
    }

    public na() {
        this.field_m = true;
    }

    static {
        field_q = "Sound: ";
    }
}
