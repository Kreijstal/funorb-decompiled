/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static jq field_c;
    static String field_a;
    static int[] field_b;

    public static void a(int param0) {
        if (param0 != -27153) {
            return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (!param0) {
          L0: {
            field_a = (String) null;
            if (ol.a(-128)) {
              param1 = false;
              break L0;
            } else {
              break L0;
            }
          }
          kq.a((byte) -57, param1);
          ms.b(20975);
          return;
        } else {
          L1: {
            if (ol.a(-128)) {
              param1 = false;
              break L1;
            } else {
              break L1;
            }
          }
          kq.a((byte) -57, param1);
          ms.b(20975);
          return;
        }
    }

    final static void a(fs param0, ob param1, int param2) {
        RuntimeException var3 = null;
        ob var4 = null;
        ob stackIn_2_0 = null;
        ob stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (ob) (param1);

              if (param0 == null) {
                stackIn_3_0 = (ob) ((Object) stackIn_2_0);
                stackIn_3_1 = -1;
                break L1;
              } else {
                stackIn_3_0 = (ob) ((Object) stackIn_2_0);
                stackIn_3_1 = param0.field_x;
                break L1;
              }
            }
            ((ob) (Object) stackIn_3_0).c(stackIn_3_1, (byte) -97);
            if (param2 == 9555) {
              break L0;
            } else {
              var4 = (ob) null;
              im.a((fs) null, (ob) null, -30);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("im.B(");

            if (param0 == null) {
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
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = 75 % ((52 - param1) / 51);
            stackIn_1_0 = nn.a(-105, param0, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("im.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_a = "Withdraw request to join <%0>'s game";
        field_c = new jq();
    }
}
