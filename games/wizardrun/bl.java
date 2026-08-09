/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int field_a;
    static long field_d;
    static String field_c;
    static int[] field_b;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            CharSequence var2 = (CharSequence) null;
            bl.a(24, (CharSequence) null);
        }
    }

    final static int a(byte param0, vd param1, String[] param2, int param3, String param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        var14 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              var5_int = param1.b(param4);
              if (var5_int > param3) {
                break L1;
              } else {
                if (-1 != param4.indexOf("<br>")) {
                  break L1;
                } else {
                  param2[0] = param4;
                  stackIn_4_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (param3 + (var5_int + -1)) / param3;
            param3 = var5_int / var6;
            var6 = 0;
            var9 = 82 % ((-41 - param0) / 56);
            var7 = 0;
            var8 = param4.length();
            var10 = 0;
            L2: while (true) {
              if (var8 <= var10) {
                L3: {
                  if (var7 < var8) {
                    incrementValue$0 = var6;
                    var6++;
                    param2[incrementValue$0] = param4.substring(var7, var8).trim();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_24_0 = var6;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param4.charAt(var10);
                    if (var11 == 32) {
                      break L5;
                    } else {
                      if (45 == var11) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var12 = param4.substring(var7, var10 - -1).trim();
                  var13 = param1.b(var12);
                  if (var13 >= param3) {
                    incrementValue$1 = var6;
                    var6++;
                    param2[incrementValue$1] = var12;
                    var7 = var10 + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (62 != var11) {
                    break L6;
                  } else {
                    if (!param4.regionMatches(var10 + -3, "<br>", 0, 4)) {
                      break L6;
                    } else {
                      incrementValue$2 = var6;
                      var6++;
                      param2[incrementValue$2] = param4.substring(var7, var10 - 3).trim();
                      var7 = var10 + 1;
                      break L6;
                    }
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var5);

            stackIn_27_1 = new StringBuilder().append("bl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param2 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_28_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_24_0;
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 4) {
              stackIn_4_0 = bb.a(param1, 0, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_b = new int[8192];
    }
}
