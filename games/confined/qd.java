/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_d;
    static String field_a;
    static nf[] field_c;
    static bm[] field_b;

    final static String a(char param0, int param1, byte param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        var5 = Confined.field_J ? 1 : 0;
        var6 = new char[param1];
        var3 = var6;
        if (param2 >= -105) {
          qd.a(12, -41, -37, -115, false, -55, -83);
          var4 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L0;
            }
          }
        } else {
          var4 = 0;
          L1: while (true) {
            if (param1 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 >= -98) {
            field_a = (String) null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (param4) {
          if (param0 >= param5) {
            if (param0 < param2 + param5) {
              if (param3 >= param1) {
                if (param6 + param1 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          qd.a('ﾏ', 69, (byte) -113);
          if (param0 >= param5) {
            if (param0 < param2 + param5) {
              if (param3 >= param1) {
                if (param6 + param1 <= param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            param0 = sc.a(param0, '_', "", 99);
            if (!param2) {
              L1: {
                L2: {
                  var3 = pn.a(-1, param1);
                  if (0 != (param0.indexOf(param1) ^ -1)) {
                    break L2;
                  } else {
                    if (-1 == param0.indexOf(var3)) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("qd.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    static {
        field_a = "Suggested names: ";
    }
}
