/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    j field_h;
    mg field_k;
    static int[] field_o;
    int field_e;
    static byte[] field_t;
    int field_b;
    int field_q;
    j field_i;
    static int[] field_m;
    j field_r;
    static String[] field_s;
    private boolean field_c;
    private int field_l;
    j field_a;
    int field_d;
    static int field_p;
    int field_f;
    static int field_u;
    int field_j;
    int field_n;
    j field_g;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 1) {
            return;
        }
        mi.a(param6, param0, param2, param5, param3, param1);
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
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((aj) this).field_j + ((aj) this).field_d;
              var6 = ((aj) this).field_e - -((aj) this).field_q;
              var7 = ((aj) this).field_f;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = ((aj) this).field_k.field_s + ((aj) this).field_k.field_F;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = mi.field_a >> 2;
                var9 = ((aj) this).field_k.b(param1);
                var10 = ((aj) this).field_k.field_F + ((aj) this).field_k.field_s;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (param1.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != kb.field_c) {
                  break L4;
                } else {
                  kb.field_c = new String[16];
                  break L4;
                }
              }
              L5: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                  break L5;
                } else {
                  var12 = var8;
                  break L5;
                }
              }
              var11 = ((aj) this).field_k.a(param1, new int[1], kb.field_c);
              var9 = 0;
              var10 = var10 + var7 * (var11 - 1);
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = ((aj) this).field_k.b(kb.field_c[var13]);
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
              if (var5_int + (var9 + var12) <= mi.field_a) {
                break L8;
              } else {
                var12 = -var9 + mi.field_a + -var5_int;
                break L8;
              }
            }
            L9: {
              var13 = -((aj) this).field_k.field_m + param0 - -32;
              if (mi.field_d < var13 - (-var10 - var6)) {
                var13 = -var6 + (param0 - var10);
                break L9;
              } else {
                break L9;
              }
            }
            mi.g(var12, var13, var9 - -var5_int, var10 - -var6, ((aj) this).field_b);
            mi.b(1 + var12, 1 + var13, var5_int + (var9 - 2), -2 + (var6 + var10), ((aj) this).field_n);
            int discarded$1 = ((aj) this).field_k.a(param1, var12 - -((aj) this).field_j, ((aj) this).field_e + var13, var9, var10, ((aj) this).field_l, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("aj.C(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ',' + 5101 + ')');
        }
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((aj) this).field_k.b(param2);
              var6 = ((aj) this).field_k.field_m - -((aj) this).field_k.field_s;
              var7 = param3;
              if (mi.field_a < var7 + (var5_int + 6)) {
                var7 = -6 + -var5_int + mi.field_a;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = -((aj) this).field_k.field_m + (param1 - -32);
              if (var8 + (var6 - -6) > mi.field_d) {
                var8 = -var6 + mi.field_d + -6;
                break L2;
              } else {
                break L2;
              }
            }
            mi.g(var7, var8, 6 + var5_int, var6 - -6, ((aj) this).field_l);
            mi.b(var7 + 1, 1 + var8, var5_int - -4, 4 + var6, ((aj) this).field_n);
            ((aj) this).field_k.c(param2, var7 + 3, ((aj) this).field_k.field_m + var8 + 3, ((aj) this).field_l, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("aj.A(").append(-123).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = 4 / ((-41 - param0) / 55);
              if (((aj) this).field_c) {
                this.a(param1, param3, param2, 5101);
                break L1;
              } else {
                this.a((byte) -123, param1, param3, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("aj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 126 % ((param0 - 40) / 51);
        mi.e(param3, param1, param5, param2, param4);
    }

    final void a(int param0, mg param1) {
        RuntimeException var3 = null;
        ql var4 = null;
        o[] var5 = null;
        ql var6 = null;
        int var7_int = 0;
        ql var7 = null;
        ql var8 = null;
        o[] var9 = null;
        o[] var10 = null;
        ql var11 = null;
        ql var12 = null;
        o var13 = null;
        ql var14 = null;
        int var15 = 0;
        Object var16 = null;
        ui var17 = null;
        af var18 = null;
        ui var19 = null;
        ql var20 = null;
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
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new af(param1, 2, 2, 2236962, 1, 1, 1, param1.field_s + param1.field_F + 2);
              ((aj) this).field_a = (j) (Object) var18;
              var18.field_o = 16777215;
              var4 = new ql();
              var18.a((af) (Object) var4, 6935);
              if (param0 > 59) {
                break L1;
              } else {
                var16 = null;
                ((aj) this).a(-106, 26, -13, (String) null);
                break L1;
              }
            }
            ((aj) this).field_k = param1;
            ((aj) this).field_f = -1;
            ((aj) this).field_n = 5592405;
            var4.field_e = 11711154;
            ((aj) this).field_j = 3;
            var4.field_m = 15658734;
            ((aj) this).field_b = 15658734;
            ((aj) this).field_e = 3;
            ((aj) this).field_d = 3;
            ((aj) this).field_q = 3;
            ((aj) this).field_l = 15658734;
            bf discarded$10 = var4.a((byte) -80, 0).d(-126, 15658734).a(mb.a(8947848, 10066329, 120, 7829367), (byte) 119);
            bf discarded$11 = var4.a((byte) -68, 1).a(mb.a(11184810, 10066329, 114, 13421772), (byte) 119);
            bf discarded$12 = var4.a((byte) -39, 3).a(mb.a(8947848, 7829367, 93, 10066329), (byte) 119).b(1, -119).a(1, (byte) 85);
            var5 = new o[9];
            var17 = new ui(32, 32);
            var19 = var17;
            var7_int = 0;
            L2: while (true) {
              if (var7_int >= var19.field_v.length) {
                var5[4] = (o) (Object) var19;
                bf discarded$13 = var4.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
                bf discarded$14 = var4.a((byte) -38, 5).a(je.a(0, (byte) -124, 65793, 0, 0), (byte) 119).a(0, true).d(-123, -1);
                ((aj) this).field_i = (j) (Object) var4;
                var6 = new ql(var4, true);
                var6.field_g = 0;
                var7 = new ql(var4, true);
                var7.field_g = 0;
                var7.a((byte) -94, ha.a(8947848, 118));
                bf discarded$15 = var7.a((byte) -80, 1).a(ha.a(11184810, -96), (byte) 119).d(-128, 2236962);
                ((aj) this).field_r = (j) (Object) new td(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924);
                we discarded$16 = new we(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                sj discarded$17 = new sj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new ql();
                var18.a((af) (Object) var8, 6935);
                bf discarded$18 = var8.a((byte) -56, 0).a(mb.a(15658734, 7829367, 126, 10066329), (byte) 119).d(-120, 1118481).a(-1, 256);
                bf discarded$19 = var8.a((byte) -85, 4).a(0, true).a(var5, (byte) 119);
                ((aj) this).field_h = (j) (Object) var8;
                var9 = new o[9];
                var9[4] = new o(2, 1);
                var10 = new o[9];
                var10[4] = new o(1, 2);
                var9[4].field_v = new int[]{6710886, 7829367};
                var10[4].field_v = new int[]{6710886, 7829367};
                var11 = new ql();
                var12 = new ql();
                var11.a((byte) -60, 0, var9);
                var12.a((byte) -60, 0, var10);
                var13 = new o(7, 4);
                var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new ql(var4, true);
                var14.a((byte) 103, var13.c());
                var13.e();
                var14 = new ql(var4, true);
                var14.a((byte) -93, var13.c());
                var13.e();
                var14 = new ql(var4, true);
                var14.a((byte) -86, var13.c());
                var13.e();
                var20 = new ql(var4, true);
                var20.a((byte) 94, var13);
                break L0;
              } else {
                var17.field_v[var7_int] = 1077952576;
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
            stackOut_8_1 = new StringBuilder().append("aj.F(").append(param0).append(',');
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
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_s = null;
        field_m = null;
        field_t = null;
        field_o = null;
    }

    public aj() {
        ((aj) this).field_c = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
        field_m = new int[12];
        field_s = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new byte[520];
    }
}
