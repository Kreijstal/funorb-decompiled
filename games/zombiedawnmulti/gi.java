/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends br {
    private int field_f;
    static int field_l;
    byte[] field_o;
    static volatile int field_m;
    int field_j;
    static String field_g;
    static String field_n;
    static String field_h;
    int field_k;
    static dk field_i;
    static String field_p;

    public static void a(int param0) {
        field_i = null;
        field_p = null;
        field_n = null;
        field_h = null;
        field_g = null;
    }

    final static fc a(byte[] param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        fc stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        fc stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -86) {
                break L1;
              } else {
                int discarded$13 = gi.a(92, 124, -54, (byte) -50);
                break L1;
              }
            }
            var2_int = 1;
            int incrementValue$14 = var2_int;
            var2_int++;
            var3 = ql.a(true, incrementValue$14, param0);
            int incrementValue$15 = var2_int;
            var2_int++;
            var4 = ql.a(true, incrementValue$15, param0);
            int incrementValue$16 = var2_int;
            var2_int++;
            var5 = ql.a(true, incrementValue$16, param0);
            var31 = new int[4];
            var27 = var31;
            var23 = var27;
            var19 = var23;
            var6 = var19;
            var32 = new int[4];
            var28 = var32;
            var24 = var28;
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L2: while (true) {
              if (var8 >= 4) {
                int incrementValue$17 = var2_int;
                var2_int++;
                var8 = ql.a(true, incrementValue$17, param0);
                int incrementValue$18 = var2_int;
                var2_int++;
                var9 = ql.a(true, incrementValue$18, param0);
                int incrementValue$19 = var2_int;
                var2_int++;
                var10 = ql.a(true, incrementValue$19, param0);
                int incrementValue$20 = var2_int;
                var2_int++;
                var11 = ql.a(true, incrementValue$20, param0);
                var29 = new int[var11][var10];
                var13 = 0;
                L3: while (true) {
                  if (var11 <= var13) {
                    int incrementValue$21 = var2_int;
                    var2_int++;
                    var13 = ql.a(true, incrementValue$21, param0);
                    var30 = new int[var13 * 4];
                    var26 = var30;
                    var22 = var26;
                    var18 = var22;
                    var14 = var18;
                    var15 = 0;
                    L4: while (true) {
                      if (var15 >= var13 * 4) {
                        stackOut_15_0 = new fc(var29, var30, var3, var4, var5, var31, var32, var8, var9);
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        int incrementValue$22 = var2_int;
                        var2_int++;
                        var14[var15] = ql.a(true, incrementValue$22, param0);
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    var14_int = 0;
                    L5: while (true) {
                      if (var10 <= var14_int) {
                        var13++;
                        continue L3;
                      } else {
                        int incrementValue$23 = var2_int;
                        var2_int++;
                        var29[var13][var14_int] = ql.a(true, incrementValue$23, param0);
                        var14_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                int incrementValue$24 = var2_int;
                var2_int++;
                var6[var8] = ql.a(true, incrementValue$24, param0);
                int incrementValue$25 = var2_int;
                var2_int++;
                var7[var8] = ql.a(true, incrementValue$25, param0);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("gi.D(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(byte param0, int param1) {
        li.field_C = 3 & param1 >> 4;
        qe.field_g = 3 & param1 >> 2;
        if (li.field_C > 2) {
            li.field_C = 2;
        }
        if (qe.field_g > 2) {
            qe.field_g = 2;
        }
        ba.field_q = 3 & param1;
        if (!(ba.field_q <= 2)) {
            ba.field_q = 2;
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 != 0) {
            L1: {
              var7 = param2;
              var8 = var7 / 43;
              var9 = 6 * (-(var8 * 43) + var7);
              var10 = (-param0 + 255) * param1 >> 8;
              var11 = (-(var9 * param0 >> 8) + 255) * param1 >> 8;
              if (var10 >= 256) {
                var10 = 255;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var11 < 256) {
                break L2;
              } else {
                var11 = 255;
                break L2;
              }
            }
            L3: {
              var12 = param1 * (255 + -((-var9 + 255) * param0 >> 8)) >> 8;
              if (256 <= var12) {
                var12 = 255;
                break L3;
              } else {
                break L3;
              }
            }
            if (0 == var8) {
              var4 = param1;
              var6 = var10;
              var5 = var12;
              break L0;
            } else {
              if (1 != var8) {
                if (2 != var8) {
                  if (var8 == 3) {
                    var6 = param1;
                    var5 = var11;
                    var4 = var10;
                    break L0;
                  } else {
                    if (4 != var8) {
                      var4 = param1;
                      var5 = var10;
                      var6 = var11;
                      break L0;
                    } else {
                      var4 = var12;
                      var6 = param1;
                      var5 = var10;
                      break L0;
                    }
                  }
                } else {
                  var5 = param1;
                  var4 = var10;
                  var6 = var12;
                  break L0;
                }
              } else {
                var5 = param1;
                var4 = var11;
                var6 = var10;
                break L0;
              }
            }
          } else {
            var6 = param1;
            var5 = param1;
            var4 = param1;
            break L0;
          }
        }
        L4: {
          if (param3 < -17) {
            break L4;
          } else {
            field_n = null;
            break L4;
          }
        }
        return 255 & var6 | ((255 & var4) << 16 | (var5 & 255) << 8);
    }

    final static ma a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ma var5 = null;
        ma stackIn_4_0 = null;
        ma stackIn_8_0 = null;
        ma stackIn_11_0 = null;
        ma stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_7_0 = null;
        ma stackOut_12_0 = null;
        ma stackOut_10_0 = null;
        ma stackOut_3_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackOut_7_0 = jo.field_e;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = sb.a(32351, var3);
                    if (var5 == null) {
                      stackOut_12_0 = nf.a((byte) 125, var4);
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      stackOut_10_0 = (ma) var5;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = of.field_d;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("gi.E(").append(4).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    gi(byte[] param0) {
        RuntimeException runtimeException = null;
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
              ((gi) this).field_o = param0;
              ((gi) this).field_f = ((gi) this).field_o[7];
              ((gi) this).field_j = ((gi) this).field_o[11];
              if (4 != ((gi) this).field_f) {
                break L1;
              } else {
                ((gi) this).field_f = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("gi.<init>(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_h = "Email is valid";
        field_n = "Players";
        field_p = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
