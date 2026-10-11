/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ea[] field_a;
    static String field_b;
    static int field_c;
    static int field_d;

    final static String a(boolean param0) {
        if (il.field_n) {
          if (!param0) {
            field_d = -59;
            return null;
          }
          return null;
        }
        if (pe.field_pb < ch.field_f) {
          if (!param0) {
            field_d = -59;
            return null;
          }
          return null;
        }
        if (pe.field_pb < od.field_o + ch.field_f) {
          return fa.field_c;
        }
        if (!param0) {
          field_d = -59;
          return null;
        }
        return null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ke.a('_', (byte) 75, param2, "");
          var4 = 123 % ((param0 - 59) / 55);
          var3 = re.a(param1, 0);
          stackIn_5_0 = (param2.indexOf(param1) != -1) || (param2.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("a.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          field_a = (ea[]) null;
        }
    }

    static {
        field_b = "Pause Menu";
    }
}
