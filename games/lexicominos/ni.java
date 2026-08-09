/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_e;
    static sc field_b;
    static int[] field_a;
    static String field_d;
    static String field_c;

    final static String a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -55) {
                break L1;
              } else {
                field_a = (int[]) null;
                break L1;
              }
            }
            stackIn_3_0 = dc.a(param1.length, param1, (byte) 16, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ni.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(boolean param0) {
        String var1;
        String var2;
        L0: {
          var1 = "";
          if (eb.field_b != null) {
            var1 = eb.field_b.e((byte) -74);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          L1: {
            var2 = (String) null;
            ni.a((byte) -127, (String) null, (String) null);
            if (var1.length() == 0) {
              var1 = a.a(-1);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = ld.field_G;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (var1.length() == 0) {
              var1 = a.a(-1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (var1.length() == 0) {
              var1 = ld.field_G;
              break L4;
            } else {
              break L4;
            }
          }
          return var1;
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        byte[] var4 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = ne.a('_', "", param2, (byte) -127);
              var3 = ci.a(param2, (byte) -79);
              if (param0 == 120) {
                break L1;
              } else {
                var4 = (byte[]) null;
                ni.a((byte) -19, (byte[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param1.indexOf(param2) ^ -1) != 0) {
                  break L3;
                } else {
                  if (param1.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("ni.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 65) {
            field_a = (int[]) null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 65 % ((param0 - -77) / 47);
        il.field_c = param1;
    }

    static {
        field_b = new sc();
        field_d = "Loading music";
        field_c = "Achieved";
    }
}
