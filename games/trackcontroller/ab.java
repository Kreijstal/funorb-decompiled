/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab {
    static int field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 98) {
            field_a = 29;
        }
    }

    final static qj a(String param0, int param1, String param2, kk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -15383) {
                break L1;
              } else {
                field_a = -117;
                break L1;
              }
            }
            var4_int = param3.a(true, param0);
            var5 = param3.a(param2, var4_int, param1 ^ 15382);
            stackIn_3_0 = kh.a(false, var4_int, var5, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ab.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static kh a(boolean param0) {
        kh stackIn_3_0 = null;
        kh stackIn_3_1 = null;
        String stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        kh stackIn_6_0 = null;
        kh stackIn_6_1 = null;
        String stackIn_6_2 = null;
        kh stackIn_7_0 = null;
        kh stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        if (param0) {
          L0: {
            field_a = 107;
            stackIn_6_0 = null;

            stackIn_6_1 = null;

            stackIn_6_2 = re.c(6);

            if (param0) {
              stackIn_7_0 = null;
              stackIn_7_1 = null;
              stackIn_7_2 = (String) ((Object) stackIn_6_2);
              stackIn_7_3 = 0;
              break L0;
            } else {
              stackIn_7_0 = null;
              stackIn_7_1 = null;
              stackIn_7_2 = (String) ((Object) stackIn_6_2);
              stackIn_7_3 = 1;
              break L0;
            }
          }
          return new kh(stackIn_7_2, r.b(stackIn_7_3 != 0));
        } else {
          stackIn_3_0 = null;
          stackIn_3_1 = null;
          stackIn_3_2 = re.c(6);
          stackIn_3_3 = 1;
          return new kh(stackIn_3_2, r.b(stackIn_3_3 != 0));
        }
    }

    static {
        field_b = null;
    }
}
