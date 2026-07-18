/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_s;
    int field_d;
    kh field_i;
    private int field_v;
    int field_x;
    ka field_m;
    static h field_u;
    kh field_j;
    static int field_e;
    kh field_k;
    int field_c;
    int field_a;
    private boolean field_g;
    int field_n;
    kh field_w;
    kh field_t;
    int field_h;
    int field_b;
    int field_o;
    kh field_p;
    static String field_l;
    int field_r;
    kh field_q;
    static int[] field_f;

    final static void a(ha param0, int param1) {
        try {
            if (param1 >= -107) {
                field_f = null;
            }
            hf.a(param0, (byte) 9, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param3 < 44) {
            ((fl) this).a(69, 37, 82, 84, -66);
        }
        qn.h(param2, param4, param5, param1, param0);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = ((fl) this).field_m.a(param3);
            var6 = ((fl) this).field_m.field_z + ((fl) this).field_m.field_L;
            var7 = param1;
            if (var5_int + (var7 - -6) > qn.field_l) {
                var7 = -6 + -var5_int + qn.field_l;
            }
            var8 = 32 + (param2 - ((fl) this).field_m.field_z);
            if (qn.field_g < var6 + (var8 + 6)) {
                var8 = -6 + -var6 + qn.field_g;
            }
            qn.b(var7, var8, 6 + var5_int, var6 + 6, ((fl) this).field_v);
            qn.f(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, ((fl) this).field_c);
            ((fl) this).field_m.b(param3, var7 + 3, ((fl) this).field_m.field_z + var8 - -3, ((fl) this).field_v, -1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fl.J(" + -6 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_u = null;
        if (param0 <= 75) {
            Object var2 = null;
            fl.a((ha) null, -110);
        }
        field_l = null;
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
            L1: {
              if (!((fl) this).field_g) {
                this.a(-6, param3, param0, param2);
                break L1;
              } else {
                this.a(true, param0, param3, param2);
                break L1;
              }
            }
            L2: {
              if (param1 < -99) {
                break L2;
              } else {
                ((fl) this).field_d = 107;
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
            stackOut_6_1 = new StringBuilder().append("fl.D(").append(param0).append(',').append(param1).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
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
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((fl) this).field_r + ((fl) this).field_x;
              var6 = ((fl) this).field_d + ((fl) this).field_h;
              var7 = ((fl) this).field_o;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((fl) this).field_m.field_H + ((fl) this).field_m.field_L;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = qn.field_l >> 2;
                var9 = ((fl) this).field_m.a(param3);
                var10 = ((fl) this).field_m.field_L + ((fl) this).field_m.field_H;
                var11 = 1;
                if (var9 > var8) {
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
                if (null != tt.field_a) {
                  break L4;
                } else {
                  tt.field_a = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var8 >= var9) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 - -((-1 + var9 % var8 + var13) / var13 * 2);
                  break L5;
                }
              }
              var11 = ((fl) this).field_m.a(param3, new int[1], tt.field_a);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((fl) this).field_m.a(tt.field_a[var13]);
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
              var12 = param2;
              if (qn.field_l >= var5_int + var9 + var12) {
                break L8;
              } else {
                var12 = -var5_int + (qn.field_l + -var9);
                break L8;
              }
            }
            L9: {
              var13 = 32 + param1 - ((fl) this).field_m.field_z;
              if (qn.field_g < var6 + var13 - -var10) {
                var13 = -var10 + (param1 + -var6);
                break L9;
              } else {
                break L9;
              }
            }
            qn.b(var12, var13, var9 - -var5_int, var10 + var6, ((fl) this).field_s);
            qn.f(var12 - -1, 1 + var13, var5_int + (var9 + -2), -2 + (var10 + var6), ((fl) this).field_c);
            int discarded$1 = ((fl) this).field_m.a(param3, var12 + ((fl) this).field_x, ((fl) this).field_h + var13, var9, var10, ((fl) this).field_v, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("fl.A(").append(true).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        id.a(param4, param1, param0, param2, (byte) 83);
        int var6 = 26 / ((param3 - -48) / 53);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        qn.b(param1, param2, param5, param4, param6, param0);
        if (!param3) {
            fl.a((byte) 3);
        }
    }

    final void a(int param0) {
        rf.b(-18862);
        if (param0 < 15) {
            field_l = null;
        }
    }

    final void a(int param0, ka param1) {
        RuntimeException var3 = null;
        ao var4 = null;
        wk[] var5 = null;
        ao var6 = null;
        int var7_int = 0;
        ao var7 = null;
        ao var8 = null;
        wk[] var9 = null;
        wk[] var10 = null;
        ao var11 = null;
        ao var12 = null;
        wk var13 = null;
        ao var14 = null;
        int var15 = 0;
        nj var16 = null;
        lk var17 = null;
        nj var18 = null;
        ao var19 = null;
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
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var17 = new lk(param1, 2, 2, 2236962, 1, 1, 1, param1.field_L + (param1.field_H - -2));
            ((fl) this).field_t = (kh) (Object) var17;
            var17.field_d = 16777215;
            var4 = new ao();
            var17.a((lk) (Object) var4, 24978);
            ((fl) this).field_o = -1;
            ((fl) this).field_x = 3;
            ((fl) this).field_h = 3;
            ((fl) this).field_m = param1;
            var4.field_l = 11711154;
            ((fl) this).field_s = 15658734;
            ((fl) this).field_d = 3;
            ((fl) this).field_c = 5592405;
            ((fl) this).field_v = 15658734;
            ((fl) this).field_r = 3;
            var4.field_o = 15658734;
            ip discarded$10 = var4.a(0, (byte) -102).a(15658734, (byte) -108).a(ue.a(10066329, 8947848, 1, 7829367), 53);
            ip discarded$11 = var4.a(1, (byte) -119).a(ue.a(10066329, 11184810, 1, 13421772), 31);
            ip discarded$12 = var4.a(3, (byte) -128).a(ue.a(7829367, 8947848, 1, 10066329), -128).a(1, 1).a((byte) 81, 1);
            var5 = new wk[9];
            var16 = new nj(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var7_int >= var18.field_B.length) {
                var5[4] = (wk) (Object) var18;
                ip discarded$13 = var4.a(4, (byte) -105).a(true, (byte) 66).a(var5, param0 + -13421900);
                ip discarded$14 = var4.a(5, (byte) -113).a(mg.a(65793, 0, (byte) -125, 0, 0), -126).a(true, (byte) 121).a(-1, (byte) -109);
                ((fl) this).field_j = (kh) (Object) var4;
                var6 = new ao(var4, true);
                var6.field_n = 0;
                var7 = new ao(var4, true);
                var7.field_n = 0;
                var7.a(-128, ak.b(8947848, 5));
                ip discarded$15 = var7.a(1, (byte) -85).a(ak.b(11184810, 5), 67).a(2236962, (byte) -127);
                ((fl) this).field_i = (kh) (Object) new tk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                or discarded$16 = new or(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                kp discarded$17 = new kp(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new ao();
                var17.a((lk) (Object) var8, param0 ^ 13413726);
                ip discarded$18 = var8.a(0, (byte) -128).a(ue.a(7829367, 15658734, param0 ^ 13421773, 10066329), 36).a(1118481, (byte) 27).b(-1, param0 ^ 13421751);
                ip discarded$19 = var8.a(4, (byte) -108).a(true, (byte) 104).a(var5, -126);
                ((fl) this).field_w = (kh) (Object) var8;
                var9 = new wk[9];
                var10 = new wk[9];
                var9[4] = new wk(2, 1);
                var10[4] = new wk(1, 2);
                var9[4].field_B = new int[]{6710886, 7829367};
                var10[4].field_B = new int[]{6710886, 7829367};
                var11 = new ao();
                var12 = new ao();
                var11.a(var9, 0, param0 + -13421779);
                var12.a(var10, 0, param0 + -13421779);
                ((fl) this).field_k = (kh) (Object) var12;
                ((fl) this).field_p = (kh) (Object) var4;
                var13 = new wk(7, 4);
                var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                ((fl) this).field_a = 10;
                var14 = new ao(var4, true);
                var14.a(0, var13.g());
                var13.d();
                var14 = new ao(var4, true);
                var14.a(0, var13.g());
                var13.d();
                var14 = new ao(var4, true);
                var14.a(0, var13.g());
                var13.d();
                var19 = new ao(var4, true);
                var19.a(0, var13);
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
            stackOut_6_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public fl() {
        ((fl) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new h(2);
        field_l = "Join";
        field_f = new int[8192];
    }
}
