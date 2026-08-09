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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        gn var7 = null;
        k stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 35) {
                break L1;
              } else {
                var7 = (gn) null;
                ga.a((String) null, (String) null, (gn) null, (byte) -97, (gn) null);
                break L1;
              }
            }
            var5_int = param4.c(param0, 3);
            var6 = param4.a(var5_int, param1, false);
            stackIn_3_0 = um.a(var6, param4, param2, var5_int, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("ga.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
            this.field_m.a(param2, var12 - -this.field_i, this.field_n + var13, var9, var10, this.field_j, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var5);

            stackIn_31_1 = new StringBuilder().append("ga.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        gn var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ga.a((String) null, (String) null, (gn) null, (byte) 115, (gn) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ga.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        dk var18 = null;
        ig var4 = null;
        hj[] var5 = null;
        uc var17 = null;
        uc var19 = null;
        int var7_int = 0;
        ig var6 = null;
        ig var7 = null;
        vh discarded$0 = null;
        ug discarded$1 = null;
        ig var8 = null;
        hj[] var9 = null;
        hj[] var10 = null;
        hj dupTemp$2 = null;
        ig var11 = null;
        ig var12 = null;
        hj var13 = null;
        ig var14 = null;
        ig var20 = null;
        int var15 = HoldTheLine.field_D;
        try {
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
            var4.a(0, 62).b(15658734, -26228).a(29536, sf.a(7829367, 10066329, 8947848, 14));
            var4.a(1, param1 ^ 76).a(29536, sf.a(13421772, 10066329, 11184810, param1 + -25));
            var4.a(3, 122).a(29536, sf.a(10066329, 7829367, 8947848, 14)).a(1, -116).a(1, true);
            var5 = new hj[9];
            var17 = new uc(32, 32);
            var19 = var17;
            for (var7_int = 0; var19.field_z.length > var7_int; var7_int++) {
                var17.field_z[var7_int] = 1077952576;
            }
            var5[4] = (hj) ((Object) var19);
            var4.a(4, -79).a(true, param1 ^ -2147483609).a(29536, var5);
            var4.a(5, -97).a(29536, kk.a(0, 0, 65793, -104, 0)).a(true, -2147483648).b(-1, -26228);
            this.field_p = (dh) ((Object) var4);
            var6 = new ig(var4, true);
            var6.field_i = 0;
            var7 = new ig(var4, true);
            var7.field_i = 0;
            var7.a((byte) -2, bb.a(8947848, (byte) -127));
            var7.a(1, param1 + 75).a(param1 + 29497, bb.a(11184810, (byte) 87)).b(2236962, -26228);
            this.field_f = (dh) ((Object) new ek(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new vh(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new ug(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new ig();
            var18.a((byte) -124, var8);
            var8.a(0, 61).a(29536, sf.a(10066329, 7829367, 15658734, 14)).b(1118481, -26228).b(-1, false);
            var8.a(4, -90).a(true, param1 ^ -2147483609).a(29536, var5);
            this.field_s = (dh) ((Object) var8);
            var9 = new hj[9];
            var9[4] = new hj(2, 1);
            var10 = new hj[9];
            var10[4] = new hj(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_z = new int[]{6710886, 7829367};
            var10[4].field_z = new int[]{6710886, 7829367};
            var11 = new ig();
            if (param1 != 39) {
                gn var16 = (gn) null;
                ga.a((String) null, (String) null, (gn) null, (byte) -94, (gn) null);
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
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ga.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
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
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ga.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
