/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static int field_c;
    static dl[] field_b;
    static long[] field_a;
    static int field_d;
    private int[] field_e;

    final static int a(vc param0, String param1, int param2, int param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
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
        var13 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = param0.a(param1);
              if (param3 < var5_int) {
                break L1;
              } else {
                if (param1.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  param4[0] = param1;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (-1 + (param3 + var5_int)) / param3;
            param3 = var5_int / var6;
            if (param2 == -27815) {
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  L3: {
                    if (var7 >= var8) {
                      break L3;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      param4[incrementValue$0] = param1.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackIn_26_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param1.charAt(var9);
                      if (32 == var10) {
                        break L5;
                      } else {
                        if (var10 != 45) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11 = param1.substring(var7, 1 + var9).trim();
                    var12 = param0.a(var11);
                    if (var12 >= param3) {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param4[incrementValue$1] = var11;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (62 == var10) {
                    if (param1.regionMatches(var9 - 3, "<br>", 0, 4)) {
                      incrementValue$2 = var6;
                      var6++;
                      param4[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
                      var7 = var9 - -1;
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_7_0 = -21;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var5);

            stackIn_29_1 = new StringBuilder().append("v.E(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_30_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_26_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 <= 83) {
            field_a = (long[]) null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param0 == -2057727803) {
                    break L2;
                  } else {
                    field_d = -119;
                    break L2;
                  }
                }
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = dg.a(param1.charAt(var4), 17176) + -var3 + (var3 << -2057727803);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("v.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var3 = (this.field_e.length >> 1102225089) + -1;
          if (param0 == 0) {
            break L0;
          } else {
            field_d = -81;
            break L0;
          }
        }
        var4 = param1 & var3;
        L1: while (true) {
          var5 = this.field_e[var4 + (var4 - -1)];
          if (-1 == var5) {
            return -1;
          } else {
            if (param1 == this.field_e[var4 - -var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L1;
            }
          }
        }
    }

    final static wj a(int param0, int param1, int param2, db param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 28297) {
              break L0;
            } else {
              field_d = -9;
              break L0;
            }
          }
          if (gm.a(param3, param2, true, param1)) {
            return ql.d(-128);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("v.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    v(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> 1463843617)) {
                this.field_e = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2_int + var2_int) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length <= var3) {
                        break L0;
                      } else {
                        var4 = param0[var3] & -1 + var2_int;
                        L4: while (true) {
                          if (0 == (this.field_e[var4 + (var4 - -1)] ^ -1)) {
                            this.field_e[var4 + var4] = param0[var3];
                            this.field_e[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = -1 + var2_int & 1 + var4;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_e[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("v.<init>(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_a = new long[32];
        field_c = 0;
    }
}
