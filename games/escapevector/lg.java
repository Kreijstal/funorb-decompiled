/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    final static boolean a(int param0, String param1, String param2) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        try {
          String var3 = DynamicTerrainRenderer.a(param2, false);
          if (param1.indexOf(param2) != -1) {
            return true;
          }
          if (param1.indexOf(var3) != -1) {
            return true;
          }
          if (param0 != 0) {
            return true;
          }
          boolean stackIn_15_0 = (param1.startsWith(param2)) || (param1.startsWith(var3)) || (param1.endsWith(param2)) || (param1.endsWith(var3));
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("lg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
    }
}
