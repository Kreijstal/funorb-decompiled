/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends kd {
    static String[] field_i;
    int field_h;
    static int field_l;
    static int field_j;
    int field_k;

    final static void a(cd param0, db param1, int param2, int param3, byte param4, int param5, int param6, char param7) {
        try {
            param1.d(param6, param3);
            int var8_int = 118 % ((param4 - 3) / 50);
            param0.a(param7, param1.field_p / 2 + param6, param3 + (param5 + param1.field_u) / 2, param2);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "cg.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 <= 39) {
            return true;
        }
        if (ti.field_L == null) {
            return false;
        }
        if (ti.field_L.e(false) == null) {
            return false;
        }
        return true;
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 84 % ((16 - param0) / 36);
    }

    final static int a(String[] args, le param1, byte param2, String param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
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
        int var14 = 0;
        int var15 = 0;
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param3);
              if (param4 < var5_int) {
                break L1;
              } else {
                if (-1 == param3.indexOf("<br>")) {
                  args[0] = param3;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (-1 + (param4 + var5_int)) / param4;
              param4 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param3.length();
              if (param2 == 91) {
                break L2;
              } else {
                field_i = (String[]) null;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    if (var9 >= var8) {
                      break L6;
                    } else {
                      var10 = param3.charAt(var9);
                      var15 = 32;
                      var14 = var10;
                      if (var13 != 0) {
                        if (var14 > var15) {
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        L7: {
                          L8: {
                            if (var14 == var15) {
                              break L8;
                            } else {
                              if (var10 == 45) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var11 = param3.substring(var7, 1 + var9).trim();
                          var12 = param1.b(var11);
                          if (var12 >= param4) {
                            incrementValue$0 = var6;
                            var6++;
                            args[incrementValue$0] = var11;
                            var7 = 1 + var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (var10 != 62) {
                            break L9;
                          } else {
                            if (param3.regionMatches(-3 + var9, "<br>", 0, 4)) {
                              incrementValue$1 = var6;
                              var6++;
                              args[incrementValue$1] = param3.substring(var7, -3 + var9).trim();
                              var7 = 1 + var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var9++;
                        if (var13 == 0) {
                          continue L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var8 > var7) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
                incrementValue$2 = var6;
                var6++;
                args[incrementValue$2] = param3.substring(var7, var8).trim();
                break L4;
              }
              stackIn_29_0 = var6;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("cg.C(");

            if (args == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L12;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_39_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_29_0;
        }
    }

    private cg() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_j = 0;
    }
}
