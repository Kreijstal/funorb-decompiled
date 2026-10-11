/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vs {
    static boolean field_d;
    static kv field_b;
    static boolean field_c;
    static String[] field_a;

    final static boolean a(int param0) {
        if (param0 != 23864) {
          field_a = (String[]) null;
          return fr.field_n;
        }
        return fr.field_n;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = vm.a(param1, (byte) 113);
          if (param0 > -23) {
            vs.a(69);
          }
          if (param2.indexOf(param1) == -1 &&
            param2.indexOf(var3) == -1) {
            stackIn_14_0 = (param2.startsWith(param1)) || (param2.startsWith(var3)) || (param2.endsWith(param1)) || (param2.endsWith(var3));
            return stackIn_14_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("vs.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 10530) {
          vs.b(24);
        }
    }

    static {
        field_a = new String[255];
    }
}
