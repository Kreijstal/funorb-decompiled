/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    static String field_d;
    static ak field_a;
    static int[] field_c;
    static fl field_e;
    static kk field_b;

    final static void a(jl param0, int param1, byte param2, mn param3, String param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -92) {
                break L1;
              } else {
                an.a(-43);
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
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = param3.field_g[0] + ((var5_int >> -475583384) + param0.c(param4.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (0 != (var6 ^ -1)) {
                    param3.field_g[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param1;
                        break L5;
                      }
                    }
                    param3.field_g[var7] = param3.field_g[0] + ((var5_int >> -44774136) + param0.c(param4.substring(0, var7 + 1)) + -param0.a((char) var8));
                    break L4;
                  }
                }
                L6: {
                  if (62 == var8) {
                    var6 = -1;
                    break L6;
                  } else {
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
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("an.B(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
            field_d = (String) null;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != -1) {
          field_b = (kk) null;
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_d = "<%0> has declined the invitation.";
    }
}
