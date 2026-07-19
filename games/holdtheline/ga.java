/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    dh field_s;
    qi field_m;
    static String[] field_k;
    int field_n;
    dh field_p;
    static String field_h;
    int field_q;
    int field_g;
    static String field_a;
    int field_c;
    private int field_j;
    dh field_f;
    int field_b;
    dh field_d;
    int field_e;
    dh field_r;
    int field_i;
    static int field_o;
    private boolean field_l;

    final static k a(String param0, String param1, gn param2, byte param3, gn param4) {
        k discarded$2 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        gn var7 = null;
        k stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 35) {
                break L1;
              } else {
                var7 = (gn) null;
                discarded$2 = ga.a((String) null, (String) null, (gn) null, (byte) -97, (gn) null);
                break L1;
              }
            }
            var5_int = param4.c(param0, 3);
            var6 = param4.a(var5_int, param1, false);
            stackOut_2_0 = um.a(var6, param4, param2, var5_int, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ga.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        int discarded$1 = 0;
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
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = this.field_i - -this.field_b;
              var6 = this.field_e + this.field_n;
              var7 = this.field_g;
              if (-1 != var7) {
                break L1;
              } else {
                var7 = this.field_m.field_G + this.field_m.field_I;
                break L1;
              }
            }
            L2: {
              var8 = tc.field_j >> -1888507806;
              if (param0 == -90) {
                break L2;
              } else {
                this.a(-99, -111, (byte) -11, -66, 61, 51);
                break L2;
              }
            }
            L3: {
              L4: {
                var9 = this.field_m.a(param2);
                var10 = this.field_m.field_I + this.field_m.field_G;
                var11 = 1;
                if (var8 < var9) {
                  break L4;
                } else {
                  if (0 == (param2.indexOf("<br>") ^ -1)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (em.field_k == null) {
                  em.field_k = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L6;
                } else {
                  var13 = var9 / var8;
                  var12 = var8 - -((var9 % var8 + var13 - 1) / var13 * 2);
                  break L6;
                }
              }
              var11 = this.field_m.a(param2, new int[]{var12}, em.field_k);
              var9 = 0;
              var10 = var10 + (-1 + var11) * var7;
              var13 = 0;
              L7: while (true) {
                if (var11 <= var13) {
                  break L3;
                } else {
                  L8: {
                    var14 = this.field_m.a(em.field_k[var13]);
                    if (var14 > var9) {
                      var9 = var14;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  var13++;
                  continue L7;
                }
              }
            }
            L9: {
              var12 = param1;
              if (tc.field_j < var5_int + var9 + var12) {
                var12 = -var5_int + (-var9 + tc.field_j);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var13 = 32 + (-this.field_m.field_s + param3);
              if (tc.field_c >= var6 + (var10 + var13)) {
                break L10;
              } else {
                var13 = -var6 + -var10 + param3;
                break L10;
              }
            }
            tc.a(var12, var13, var5_int + var9, var6 + var10, this.field_c);
            tc.f(var12 - -1, var13 + 1, var9 + var5_int - 2, -2 + (var10 + var6), this.field_q);
            discarded$1 = this.field_m.a(param2, var12 - -this.field_i, this.field_n + var13, var9, var10, this.field_j, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var5);
            stackOut_28_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        k discarded$2 = null;
        RuntimeException var5 = null;
        gn var6 = null;
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
              if (this.field_l) {
                this.a((byte) -90, param2, param1, param3);
                break L1;
              } else {
                this.a(-88, param2, param3, param1);
                break L1;
              }
            }
            if (param0 == 7829367) {
              break L0;
            } else {
              var6 = (gn) null;
              discarded$2 = ga.a((String) null, (String) null, (gn) null, (byte) 115, (gn) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("ga.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        tc.d(param5, param1, param4, param3, param0);
        if (param2 != -53) {
            this.field_c = -35;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 13421772) {
          this.a(-126, 95, 114, -63, -82, 84, 53);
          tc.c(param4, param2, param6, param3, param5, param0);
          return;
        } else {
          tc.c(param4, param2, param6, param3, param5, param0);
          return;
        }
    }

    public ga() {
        this.field_l = true;
    }

    final void a(qi param0, byte param1) {
        nj discarded$11 = null;
        nj discarded$12 = null;
        nj discarded$13 = null;
        nj discarded$14 = null;
        nj discarded$15 = null;
        nj discarded$16 = null;
        vh discarded$17 = null;
        ug discarded$18 = null;
        nj discarded$19 = null;
        nj discarded$20 = null;
        k discarded$21 = null;
        RuntimeException var3 = null;
        ig var4 = null;
        hj[] var5 = null;
        ig var6 = null;
        int var7_int = 0;
        ig var7 = null;
        ig var8 = null;
        hj[] var9 = null;
        hj[] var10 = null;
        ig var11 = null;
        ig var12 = null;
        hj var13 = null;
        ig var14 = null;
        int var15 = 0;
        gn var16 = null;
        uc var17 = null;
        dk var18 = null;
        uc var19 = null;
        ig var20 = null;
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
        var15 = HoldTheLine.field_D;
        try {
          L0: {
            var18 = new dk(param0, 2, 2, 2236962, 1, 1, 1, param0.field_G - (-param0.field_I + -2));
            this.field_r = (dh) ((Object) var18);
            var18.field_c = 16777215;
            var4 = new ig();
            var18.a((byte) -123, var4);
            this.field_m = param0;
            this.field_j = 15658734;
            this.field_g = -1;
            var4.field_a = 15658734;
            this.field_i = 3;
            this.field_c = 15658734;
            this.field_e = 3;
            this.field_q = 5592405;
            this.field_b = 3;
            this.field_n = 3;
            var4.field_b = 11711154;
            discarded$11 = var4.a(0, 62).b(15658734, -26228).a(29536, sf.a(7829367, 10066329, 8947848, 14));
            discarded$12 = var4.a(1, param1 ^ 76).a(29536, sf.a(13421772, 10066329, 11184810, param1 + -25));
            discarded$13 = var4.a(3, 122).a(29536, sf.a(10066329, 7829367, 8947848, 14)).a(1, -116).a(1, true);
            var5 = new hj[9];
            var17 = new uc(32, 32);
            var19 = var17;
            var7_int = 0;
            L1: while (true) {
              if (var19.field_z.length <= var7_int) {
                L2: {
                  var5[4] = (hj) ((Object) var19);
                  discarded$14 = var4.a(4, -79).a(true, param1 ^ -2147483609).a(29536, var5);
                  discarded$15 = var4.a(5, -97).a(29536, kk.a(0, 0, 65793, -104, 0)).a(true, -2147483648).b(-1, -26228);
                  this.field_p = (dh) ((Object) var4);
                  var6 = new ig(var4, true);
                  var6.field_i = 0;
                  var7 = new ig(var4, true);
                  var7.field_i = 0;
                  var7.a((byte) -2, bb.a(8947848, (byte) -127));
                  discarded$16 = var7.a(1, param1 + 75).a(param1 + 29497, bb.a(11184810, (byte) 87)).b(2236962, -26228);
                  this.field_f = (dh) ((Object) new ek(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                  discarded$17 = new vh(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                  discarded$18 = new ug(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
                  var8 = new ig();
                  var18.a((byte) -124, var8);
                  discarded$19 = var8.a(0, 61).a(29536, sf.a(10066329, 7829367, 15658734, 14)).b(1118481, -26228).b(-1, false);
                  discarded$20 = var8.a(4, -90).a(true, param1 ^ -2147483609).a(29536, var5);
                  this.field_s = (dh) ((Object) var8);
                  var9 = new hj[9];
                  var9[4] = new hj(2, 1);
                  var10 = new hj[9];
                  var10[4] = new hj(1, 2);
                  var9[4].field_z = new int[]{6710886, 7829367};
                  var10[4].field_z = new int[]{6710886, 7829367};
                  var11 = new ig();
                  if (param1 == 39) {
                    break L2;
                  } else {
                    var16 = (gn) null;
                    discarded$21 = ga.a((String) null, (String) null, (gn) null, (byte) -94, (gn) null);
                    break L2;
                  }
                }
                var12 = new ig();
                var11.a(var9, 6821, 0);
                var12.a(var10, 6821, 0);
                var13 = new hj(7, 4);
                var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new ig(var4, true);
                var14.a(var13.e(), param1 + -39);
                var13.b();
                var14 = new ig(var4, true);
                var14.a(var13.e(), 0);
                var13.b();
                var14 = new ig(var4, true);
                var14.a(var13.e(), 0);
                var13.b();
                var20 = new ig(var4, true);
                var20.a(var13, 0);
                break L0;
              } else {
                var17.field_z[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ga.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
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
              var5_int = this.field_m.a(param3);
              var6 = this.field_m.field_I + this.field_m.field_s;
              var7 = param1;
              if (6 + var7 - -var5_int > tc.field_j) {
                var7 = -6 + -var5_int + tc.field_j;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 < -72) {
                break L2;
              } else {
                this.field_m = (qi) null;
                break L2;
              }
            }
            L3: {
              var8 = 32 + (param2 - this.field_m.field_s);
              if (tc.field_c >= var6 + var8 + 6) {
                break L3;
              } else {
                var8 = -6 + (-var6 + tc.field_c);
                break L3;
              }
            }
            tc.a(var7, var8, var5_int - -6, 6 + var6, this.field_j);
            tc.f(1 + var7, var8 - -1, 4 + var5_int, 4 + var6, this.field_q);
            this.field_m.a(param3, 3 + var7, 3 + var8 + this.field_m.field_s, this.field_j, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("ga.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_k = new String[]{"Click to view best times for the <col=1>Classic Championship</col>", "Click to view best times for the <col=1>Desert Championship</col>", "Click to view best times for the <col=1>Alpine Championship</col>", "Click to view best times for the <col=1>Night Championship</col>"};
        field_a = "Snowmobile";
        field_h = "Afterburner";
        field_o = 256;
    }
}
