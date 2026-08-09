/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r implements fc {
    static int[] field_c;
    private tj field_b;
    private int field_e;
    static String field_d;
    private int field_a;

    final static int a(tj param0, String[] param1, String param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var5_int = param0.b(param2);
              if (param4 < var5_int) {
                break L1;
              } else {
                if (param2.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param1[0] = param2;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int - (-param4 + param3)) / param4;
            param4 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param2.length();
            var9 = 0;
            L2: while (true) {
              if (var8 <= var9) {
                L3: {
                  if (var7 >= var8) {
                    break L3;
                  } else {
                    incrementValue$0 = var6;
                    var6++;
                    param1[incrementValue$0] = param2.substring(var7, var8).trim();
                    break L3;
                  }
                }
                stackIn_23_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param2.charAt(var9);
                    if (var10 == 32) {
                      break L5;
                    } else {
                      if (var10 != 45) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param2.substring(var7, 1 + var9).trim();
                  var12 = param0.b(var11);
                  if (param4 <= var12) {
                    var7 = 1 + var9;
                    incrementValue$1 = var6;
                    var6++;
                    param1[incrementValue$1] = var11;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var10 != 62) {
                    break L6;
                  } else {
                    if (!param2.regionMatches(-3 + var9, "<br>", 0, 4)) {
                      break L6;
                    } else {
                      incrementValue$2 = var6;
                      var6++;
                      param1[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
                      var7 = 1 + var9;
                      break L6;
                    }
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5);

            stackIn_26_1 = new StringBuilder().append("r.A(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param2 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_33_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_23_0;
        }
    }

    final static rg a(int param0, boolean param1) {
        rg var2;
        rg stackIn_3_0 = null;
        rg stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        var2 = new rg(true);
        if (param0 != 5579) {
          return (rg) null;
        } else {
          L0: {
            stackIn_3_0 = (rg) (var2);

            if (!param1) {
              stackIn_4_0 = (rg) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L0;
            } else {
              stackIn_4_0 = (rg) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L0;
            }
          }
          stackIn_4_0.field_a = stackIn_4_1 != 0;
          return var2;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_d = null;
        if (param0 != 51) {
            field_d = (String) null;
        }
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                var6_int = -49 / ((-60 - param2) / 56);
                if (param1.field_g) {
                  break L2;
                } else {
                  if (param1.e(1)) {
                    break L2;
                  } else {
                    stackIn_5_0 = 2188450;
                    break L1;
                  }
                }
              }
              stackIn_5_0 = 3249872;
              break L1;
            }
            L3: {
              var7 = stackIn_5_0;
              this.field_b.a("<u=" + Integer.toString(var7, 16) + ">" + param1.field_h + "</u>", param4 - -param1.field_r, param1.field_i + param0, param1.field_k, param1.field_m, var7, -1, this.field_a, this.field_e, this.field_b.field_s - -this.field_b.field_x);
              if (!param1.e(1)) {
                break L3;
              } else {
                L4: {
                  var8 = this.field_b.b(param1.field_h);
                  var9 = this.field_b.field_x + this.field_b.field_s;
                  var10 = param1.field_r + param4;
                  if (this.field_a == 2) {
                    var10 = var10 + (param1.field_k + -var8);
                    break L4;
                  } else {
                    if (-2 == (this.field_a ^ -1)) {
                      var10 = var10 + (-var8 + param1.field_k >> -2044717503);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var11 = param1.field_i + param0;
                  if ((this.field_e ^ -1) == -3) {
                    var11 = var11 + (param1.field_m + -var9);
                    break L5;
                  } else {
                    if (1 != this.field_e) {
                      break L5;
                    } else {
                      var11 = var11 + (param1.field_m + -var9 >> 205989569);
                      break L5;
                    }
                  }
                }
                ck.a(-2 + var10, var9, var8 + 4, 2 + var11, 14677);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var6);

            stackIn_19_1 = new StringBuilder().append("r.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public r() {
        this.field_e = 1;
        this.field_b = sg.field_a;
        this.field_a = 1;
    }

    r(tj param0, int param1, int param2) {
        try {
            this.field_b = param0;
            this.field_e = param2;
            this.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_d = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
