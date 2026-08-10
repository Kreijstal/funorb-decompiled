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
        if (param0 != -1569388056) {
            String var2 = (String) null;
            gi.a(49, (String) null);
        }
    }

    final static fc a(byte[] param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        fc stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        int[][] var26 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -86) {
                break L1;
              } else {
                gi.a(92, 124, -54, (byte) -50);
                break L1;
              }
            }
            var2_int = 1;
            incrementValue$0 = var2_int;
            var2_int++;
            var3 = ql.a(true, incrementValue$0, param0);
            incrementValue$1 = var2_int;
            var2_int++;
            var4 = ql.a(true, incrementValue$1, param0);
            incrementValue$2 = var2_int;
            var2_int++;
            var5 = ql.a(true, incrementValue$2, param0);
            var23 = new int[4];
            var19 = var23;
            var6 = var19;
            var24 = new int[4];
            var20 = var24;
            var7 = var20;
            var8 = 0;
            L2: while (true) {
              if (-5 >= (var8 ^ -1)) {
                incrementValue$3 = var2_int;
                var2_int++;
                var8 = ql.a(true, incrementValue$3, param0);
                incrementValue$4 = var2_int;
                var2_int++;
                var9 = ql.a(true, incrementValue$4, param0);
                incrementValue$5 = var2_int;
                var2_int++;
                var10 = ql.a(true, incrementValue$5, param0);
                incrementValue$6 = var2_int;
                var2_int++;
                var11 = ql.a(true, incrementValue$6, param0);
                var26 = new int[var11][var10];
                var13 = 0;
                L3: while (true) {
                  if (var11 <= var13) {
                    incrementValue$7 = var2_int;
                    var2_int++;
                    var13 = ql.a(true, incrementValue$7, param0);
                    var22 = new int[var13 * 4];
                    var18 = var22;
                    var14 = var18;
                    var15 = 0;
                    L4: while (true) {
                      if (var15 >= var13 * 4) {
                        stackIn_16_0 = new fc(var26, var22, var3, var4, var5, var23, var24, var8, var9);
                        break L0;
                      } else {
                        incrementValue$8 = var2_int;
                        var2_int++;
                        var14[var15] = ql.a(true, incrementValue$8, param0);
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
                        incrementValue$9 = var2_int;
                        var2_int++;
                        var26[var13][var14_int] = ql.a(true, incrementValue$9, param0);
                        var14_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                incrementValue$10 = var2_int;
                var2_int++;
                var6[var8] = ql.a(true, incrementValue$10, param0);
                incrementValue$11 = var2_int;
                var2_int++;
                var7[var8] = ql.a(true, incrementValue$11, param0);
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("gi.D(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(byte param0, int param1) {
        li.field_C = 3 & param1 >> 1326190436;
        qe.field_g = 3 & param1 >> 2121804290;
        if ((li.field_C ^ -1) < -3) {
            li.field_C = 2;
        }
        if (param0 > -51) {
            field_m = 108;
        }
        if ((qe.field_g ^ -1) < -3) {
            qe.field_g = 2;
        }
        ba.field_q = 3 & param1;
        if (!(-3 <= (ba.field_q ^ -1))) {
            ba.field_q = 2;
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (-1 != (param0 ^ -1)) {
            L1: {
              var7 = param2;
              var8 = var7 / 43;
              var9 = 6 * (-(var8 * 43) + var7);
              var10 = (-param0 + 255) * param1 >> -1672199064;
              var11 = (-(var9 * param0 >> -1569388056) + 255) * param1 >> 476623304;
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
              var12 = param1 * (255 + -((-var9 + 255) * param0 >> 662336872)) >> -1464657720;
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
                  if (-4 == (var8 ^ -1)) {
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
            field_n = (String) null;
            break L4;
          }
        }
        return 255 & var6 | ((255 & var4) << -1050576848 | (var5 & 255) << 372560296);
    }

    final static ma a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ma var5 = null;
        ma stackIn_6_0 = null;
        ma stackIn_10_0 = null;
        ma stackIn_13_0 = null;
        ma stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_i = (dk) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackIn_10_0 = jo.field_e;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = sb.a(32351, var3);
                    if (var5 == null) {
                      stackIn_15_0 = nf.a((byte) 125, var4);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      stackIn_13_0 = (ma) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            stackIn_6_0 = of.field_d;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("gi.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    gi(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_o = param0;
              this.field_f = this.field_o[7];
              this.field_j = this.field_o[11];
              if (4 != this.field_f) {
                break L1;
              } else {
                this.field_f = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("gi.<init>(");

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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_m = 0;
        field_g = "This password contains repeated characters, and would be easy to guess";
        field_h = "Email is valid";
        field_n = "Players";
        field_p = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
