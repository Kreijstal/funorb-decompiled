/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String field_b;
    static String field_e;
    static String field_a;
    static int field_d;
    static Boolean field_f;
    static tk field_c;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_c = null;
        if (param0 != -35) {
          field_f = (Boolean) null;
          field_f = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          return;
        }
    }

    final static rj a(byte param0, int param1, qk param2, int param3, da param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        rj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = param2.a(param3, (byte) -115, param1);
              var5 = var6;
              if (param0 == 65) {
                break L1;
              } else {
                ni.a((byte) -2);
                break L1;
              }
            }
            if (var6 != null) {
              stackIn_6_0 = new rj(new pb(var6), param4);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5_ref);

            stackIn_9_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        return stackIn_6_0;
    }

    static {
        field_b = "Open in popup window";
        field_e = "Connection lost - attempting to reconnect";
        field_d = -1;
    }
}
