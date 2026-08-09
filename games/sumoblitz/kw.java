/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw {
    static vn field_b;
    static qr field_c;
    static hr field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kc.j(125);
        lk.e(param3, param1, param4, param0);
        if (param2 != 1) {
            field_b = (vn) null;
        }
    }

    final static void a(byte param0, tk param1, int param2, vn param3, String param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 90) {
                break L1;
              } else {
                field_b = (vn) null;
                break L1;
              }
            }
            var5_int = 0;
            var6 = -1;
            var7 = 1;
            L2: while (true) {
              if (param4.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param4.charAt(var7);
                  if (60 != var8) {
                    break L3;
                  } else {
                    var6 = (var5_int >> -887551960) - -param1.field_b[0] - -param3.a(param4.substring(0, var7));
                    break L3;
                  }
                }
                L4: {
                  if ((var6 ^ -1) == 0) {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param2;
                        break L5;
                      }
                    }
                    param1.field_b[var7] = param1.field_b[0] + ((var5_int >> 1316085832) + (param3.a(param4.substring(0, 1 + var7)) + -param3.a((char) var8)));
                    break L4;
                  } else {
                    param1.field_b[var7] = var6;
                    break L4;
                  }
                }
                L6: {
                  if (62 != var8) {
                    break L6;
                  } else {
                    var6 = -1;
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("kw.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param4 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_26_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -86) {
            field_b = (vn) null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
    }
}
