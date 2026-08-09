/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd {
    static int[][] field_a;

    final static int a(byte param0, char param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        char stackOut_5_0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -72) {
                break L1;
              } else {
                field_a = (int[][]) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = param2.length();
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 <= var5) {
                    break L4;
                  } else {
                    stackOut_5_0 = param1;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 != param2.charAt(var5)) {
                          break L5;
                        } else {
                          var3_int++;
                          break L5;
                        }
                      }
                      var5++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackIn_10_0 = var3_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final static String a(boolean param0, CharSequence param1, byte param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = -81 / ((param2 - -41) / 45);
            var3 = fj.a(param1, 100, param0);
            if (var3 != null) {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5 = 0;
              L1: while (true) {
                if (param1.length() > var5) {
                  if (!ee.a(37, param1.charAt(var5))) {
                    stackIn_11_0 = wh.field_c;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5++;
                    if (var6 == 0) {
                      continue L1;
                    } else {
                      stackIn_14_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("wd.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return (String) ((Object) stackIn_14_0);
          }
        }
    }

    public static void a(byte param0) {
        field_a = (int[][]) null;
        if (param0 < 1) {
            CharSequence var2 = (CharSequence) null;
            wd.a((byte) -59, '', (CharSequence) null);
        }
    }

    static {
    }
}
