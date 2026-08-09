/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static long field_a;
    static String field_c;
    static int field_b;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
    }

    final static int a(int param0, String param1, String[] param2, rf param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_5_0 = 0;
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
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param1);
              if (var5_int > param0) {
                break L1;
              } else {
                if ((param1.indexOf("<br>") ^ -1) == 0) {
                  param2[0] = param1;
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = (-1 + (var5_int + param0)) / param0;
              param0 = var5_int / var6;
              var6 = 0;
              var7 = 0;
              var8 = param1.length();
              if (param4 == 14074) {
                break L2;
              } else {
                field_b = -21;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= var8) {
                L4: {
                  if (var8 > var7) {
                    incrementValue$0 = var6;
                    var6++;
                    param2[incrementValue$0] = param1.substring(var7, var8).trim();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                stackIn_27_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param1.charAt(var9);
                    if (-33 == (var10 ^ -1)) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param1.substring(var7, var9 + 1).trim();
                  var12 = param3.b(var11);
                  if (param0 <= var12) {
                    var7 = var9 + 1;
                    incrementValue$1 = var6;
                    var6++;
                    param2[incrementValue$1] = var11;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  if (param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                    incrementValue$2 = var6;
                    var6++;
                    param2[incrementValue$2] = param1.substring(var7, -3 + var9).trim();
                    var7 = var9 - -1;
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5);

            stackIn_30_1 = new StringBuilder().append("ab.B(").append(param0).append(',');

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


            stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');

            if (param3 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_31_0), stackIn_37_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_27_0;
        }
    }

    final static int a(int param0) {
        int var1 = -73 % ((param0 - -67) / 51);
        return 1;
    }

    static {
        field_b = -1;
        field_c = "You are not currently logged in to the<nbsp>game.";
    }
}
