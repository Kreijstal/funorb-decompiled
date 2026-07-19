/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static boolean field_b;
    static tg[] field_e;
    static int[] field_c;
    static String field_d;
    static int field_a;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        L0: {
          var2 = 0;
          if (param1 < 0) {
            var2 += 16;
            param1 = param1 >>> 16;
            break L0;
          } else {
            if ((param1 ^ -1) > -65537) {
              break L0;
            } else {
              L1: {
                var2 += 16;
                param1 = param1 >>> 16;
                if (param1 < 256) {
                  break L1;
                } else {
                  var2 += 8;
                  param1 = param1 >>> 8;
                  break L1;
                }
              }
              L2: {
                if ((param1 ^ -1) > -17) {
                  break L2;
                } else {
                  var2 += 4;
                  param1 = param1 >>> 4;
                  break L2;
                }
              }
              if (param0 != 100) {
                return -116;
              } else {
                L3: {
                  if (-5 >= (param1 ^ -1)) {
                    var2 += 2;
                    param1 = param1 >>> 2;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 < 1) {
                    break L4;
                  } else {
                    var2++;
                    param1 = param1 >>> 1;
                    break L4;
                  }
                }
                return var2 - -param1;
              }
            }
          }
        }
        L5: {
          if (param1 < 256) {
            break L5;
          } else {
            var2 += 8;
            param1 = param1 >>> 8;
            break L5;
          }
        }
        L6: {
          if ((param1 ^ -1) > -17) {
            break L6;
          } else {
            var2 += 4;
            param1 = param1 >>> 4;
            break L6;
          }
        }
        if (param0 != 100) {
          return -116;
        } else {
          L7: {
            if (-5 >= (param1 ^ -1)) {
              var2 += 2;
              param1 = param1 >>> 2;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (param1 < 1) {
              break L8;
            } else {
              var2++;
              param1 = param1 >>> 1;
              break L8;
            }
          }
          return var2 - -param1;
        }
    }

    final static rg a(int param0, int param1, String param2) {
        rg var3 = null;
        RuntimeException var3_ref = null;
        rg stackIn_2_0 = null;
        rg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rg stackOut_3_0 = null;
        rg stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              var3 = new rg(false);
              var3.field_c = param2;
              var3.field_g = param0;
              stackOut_3_0 = (rg) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (rg) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("wb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        int var1 = -38 % ((-58 - param0) / 38);
        field_c = null;
    }

    static {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[8192];
    }
}
