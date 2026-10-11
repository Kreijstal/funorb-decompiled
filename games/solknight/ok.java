/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static jh field_a;

    final static String a(int param0, int param1, String param2, da param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -18884) {
            ok.a((byte) -15);
          }
          if (param3.c((byte) -121)) {
            stackIn_6_0 = param4 + " - " + param3.b((byte) 80, param0) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ok.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 > 73) {
          var2 = (String) null;
          le.a(-35, "", (String) null);
          return;
        }
        field_a = (jh) null;
        var2Lifetime1 = (String) null;
        le.a(-35, "", (String) null);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -15739) {
          field_a = (jh) null;
        }
    }

    static {
    }
}
