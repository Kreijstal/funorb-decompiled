/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static String field_a;

    final static oa a(int param0, byte param1, String param2) {
        ra var3 = null;
        RuntimeException var3_ref = null;
        ra stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -117) {
            field_a = (String) null;
          }
          var3 = new ra();
          ((oa) ((Object) var3)).field_e = param0;
          ((oa) ((Object) var3)).field_d = param2;
          stackIn_3_0 = var3;
          return (oa) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -23556) {
          String var2 = (String) null;
          je.a(-102, (byte) 6, (String) null);
        }
    }

    static {
    }
}
