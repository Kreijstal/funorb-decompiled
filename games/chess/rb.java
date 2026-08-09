/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static String field_a;
    static lh field_b;
    static ci field_c;
    static String field_d;

    final static int a(int param0) {
        if (param0 != 0) {
            StringBuilder var2 = (StringBuilder) null;
            rb.a('', (StringBuilder) null, 120, (byte) -15);
        }
        return in.field_i;
    }

    final static byte[] a(byte[] param0, byte param1, nk param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Chess.field_G;
        try {
          L0: {
            var4_int = param2.e(29, param3);
            if (-1 != (var4_int ^ -1)) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int == param0.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param0 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param2.e(111, 3);
                var6 = (byte)param2.e(-5, 8);
                if (param1 <= -51) {
                  break L3;
                } else {
                  field_b = (lh) null;
                  break L3;
                }
              }
              L4: {
                if (var5 <= 0) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param0[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param0[var7] = (byte)(var6 + param2.e(-44, var5));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("rb.A(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    public static void b(int param0) {
        if (param0 != -18067) {
            field_a = (String) null;
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
    }

    final static StringBuilder a(char param0, StringBuilder param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Chess.field_G;
        try {
          L0: {
            var4_int = param1.length();
            param1.setLength(param2);
            var5 = var4_int;
            L1: while (true) {
              if (param2 <= var5) {
                var6 = -99 % ((param3 - 51) / 45);
                stackIn_5_0 = (StringBuilder) (param1);
                break L0;
              } else {
                param1.setCharAt(var5, param0);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("rb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static int a(byte param0) {
        if (param0 != 46) {
            field_b = (lh) null;
        }
        return aa.field_i;
    }

    static {
        field_d = "Unfortunately we are unable to create an account for you at this time.";
        field_a = "This game has been updated! Please reload this page.";
    }
}
