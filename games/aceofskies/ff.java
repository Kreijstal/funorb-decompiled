/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String field_a;
    static long field_b;

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 8) {
            hc var2 = (hc) null;
            ff.a(-89, (String) null, (String[]) null, -11, (hc) null);
        }
    }

    final static int a(int param0, String param1, String[] param2, int param3, hc param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
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
        var13 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4.a(param1);
              if (param0 < var5_int) {
                break L1;
              } else {
                if (-1 == param1.indexOf("<br>")) {
                  param2[0] = param1;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (param0 + var5_int - 1) / param0;
            param0 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            if (param3 == -3) {
              var8 = param1.length();
              var9 = 0;
              L2: while (true) {
                if (var9 >= var8) {
                  L3: {
                    if (var8 <= var7) {
                      break L3;
                    } else {
                      incrementValue$0 = var6;
                      var6++;
                      param2[incrementValue$0] = param1.substring(var7, var8).trim();
                      break L3;
                    }
                  }
                  stackIn_27_0 = var6;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L4: {
                    L5: {
                      var10 = param1.charAt(var9);
                      if (-33 == (var10 ^ -1)) {
                        break L5;
                      } else {
                        if (var10 == 45) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var11 = param1.substring(var7, 1 + var9).trim();
                    var12 = param4.a(var11);
                    if (param0 > var12) {
                      break L4;
                    } else {
                      var7 = 1 + var9;
                      incrementValue$1 = var6;
                      var6++;
                      param2[incrementValue$1] = var11;
                      break L4;
                    }
                  }
                  if (var10 == 62) {
                    L6: {
                      if (param1.regionMatches(var9 + -3, "<br>", 0, 4)) {
                        incrementValue$2 = var6;
                        var6++;
                        param2[incrementValue$2] = param1.substring(var7, var9 + -3).trim();
                        var7 = var9 - -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_8_0 = 29;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ff.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param2 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_27_0;
          }
        }
    }

    static {
        field_a = "Loading instruments";
    }
}
