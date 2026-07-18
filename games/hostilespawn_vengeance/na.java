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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((na) this).field_p + ((na) this).field_g;
              var6 = ((na) this).field_l + ((na) this).field_r;
              var7 = ((na) this).field_o;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((na) this).field_i.field_F + ((na) this).field_i.field_y;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = si.field_e >> 2;
                var9 = ((na) this).field_i.a(param3);
                var10 = ((na) this).field_i.field_F + ((na) this).field_i.field_y;
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
              var11 = ((na) this).field_i.a(param3, new int[1], jd.field_v);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((na) this).field_i.a(jd.field_v[var13]);
                    if (var14 <= var9) {
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
              if (var9 + (var12 - -var5_int) > si.field_e) {
                var12 = -var9 + si.field_e + -var5_int;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + (param2 - ((na) this).field_i.field_N);
              if (var6 + var13 + var10 <= si.field_k) {
                break L9;
              } else {
                var13 = -var6 + param2 + -var10;
                break L9;
              }
            }
            si.a(var12, var13, var5_int + var9, var10 - -var6, ((na) this).field_f);
            si.c(1 + var12, 1 + var13, var5_int + (var9 - 2), -2 + var10 + var6, ((na) this).field_a);
            int discarded$1 = ((na) this).field_i.a(param3, ((na) this).field_p + var12, var13 - -((na) this).field_r, var9, var10, ((na) this).field_k, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("na.B(").append(0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(vm param0, byte param1) {
        RuntimeException var3 = null;
        ha var4 = null;
        bd[] var5 = null;
        ha var6 = null;
        int var7_int = 0;
        ha var7 = null;
        ha var8 = null;
        bd[] var9 = null;
        bd[] var10 = null;
        ha var11 = null;
        ha var12 = null;
        bd var13 = null;
        ha var14 = null;
        int var15 = 0;
        gk var16 = null;
        cn var17 = null;
        gk var18 = null;
        ha var19 = null;
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
        var15 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var17 = new cn(param0, 2, 2, 2236962, 1, 1, 1, param0.field_F + param0.field_y + 2);
            var17.field_j = 16777215;
            ((na) this).field_h = (nn) (Object) var17;
            var4 = new ha();
            var17.a(-33, (cn) (Object) var4);
            ((na) this).field_o = -1;
            ((na) this).field_a = 5592405;
            ((na) this).field_r = 3;
            ((na) this).field_l = 3;
            var4.field_d = 11711154;
            ((na) this).field_i = param0;
            ((na) this).field_p = 3;
            ((na) this).field_g = 3;
            ((na) this).field_k = 15658734;
            var4.field_o = 15658734;
            ((na) this).field_f = 15658734;
            gm discarded$10 = var4.a(0, true).a(15658734, true).a(false, pm.a(7829367, 8947848, (byte) -117, 10066329));
            gm discarded$11 = var4.a(1, true).a(false, pm.a(13421772, 11184810, (byte) -117, 10066329));
            gm discarded$12 = var4.a(3, true).a(false, pm.a(10066329, 8947848, (byte) -117, 7829367)).b(1, 16802).a((byte) 92, 1);
            var5 = new bd[9];
            var16 = new gk(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_D.length) {
                L2: {
                  var5[4] = (bd) (Object) var18;
                  gm discarded$13 = var4.a(4, true).a((byte) -37, true).a(false, var5);
                  gm discarded$14 = var4.a(5, true).a(false, uk.a(65793, 0, (byte) 127, 0, 0)).a((byte) -128, true).a(-1, true);
                  ((na) this).field_e = (nn) (Object) var4;
                  var6 = new ha(var4, true);
                  var6.field_k = 0;
                  var7 = new ha(var4, true);
                  var7.field_k = 0;
                  var7.a(false, en.h(-71, 8947848));
                  gm discarded$15 = var7.a(1, true).a(false, en.h(-96, 11184810)).a(2236962, true);
                  ((na) this).field_n = (nn) (Object) new rf(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                  ra discarded$16 = new ra(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  h discarded$17 = new h(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new ha();
                  var17.a(-80, (cn) (Object) var8);
                  gm discarded$18 = var8.a(0, true).a(false, pm.a(10066329, 15658734, (byte) -117, 7829367)).a(1118481, true).a(-2147483648, -1);
                  gm discarded$19 = var8.a(4, true).a((byte) -52, true).a(false, var5);
                  ((na) this).field_j = (nn) (Object) var8;
                  var9 = new bd[9];
                  var9[4] = new bd(2, 1);
                  if (param1 > 50) {
                    break L2;
                  } else {
                    ((na) this).field_i = null;
                    break L2;
                  }
                }
                var10 = new bd[9];
                var10[4] = new bd(1, 2);
                var9[4].field_D = new int[]{6710886, 7829367};
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
                break L0;
              } else {
                var16.field_D[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("na.D(");
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
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, String param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
              var5_int = ((na) this).field_i.a(param2);
              var6 = ((na) this).field_i.field_F + ((na) this).field_i.field_N;
              var7 = param1;
              if (si.field_e >= var7 - -var5_int + 6) {
                break L1;
              } else {
                var7 = -var5_int + (si.field_e + -6);
                break L1;
              }
            }
            L2: {
              var8 = param0 - (((na) this).field_i.field_N - 32);
              if (6 + var6 + var8 <= si.field_k) {
                break L2;
              } else {
                var8 = -var6 + si.field_k + -6;
                break L2;
              }
            }
            var9 = 75;
            si.a(var7, var8, 6 + var5_int, var6 + 6, ((na) this).field_k);
            si.c(1 + var7, 1 + var8, var5_int - -4, 4 + var6, ((na) this).field_a);
            ((na) this).field_i.c(param2, var7 + 3, var8 - -3 + ((na) this).field_i.field_N, ((na) this).field_k, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("na.G(").append(param0).append(',').append(param1).append(',');
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
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + -54 + ')');
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
            if (((na) this).field_m) {
                this.a(0, param2, param0, param1);
            } else {
                this.a(param0, param2, param1, (byte) -54);
            }
            int var5_int = 125 / ((-59 - param3) / 39);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "na.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 80) {
            field_q = null;
        }
        field_q = null;
    }

    public na() {
        ((na) this).field_m = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Sound: ";
    }
}
