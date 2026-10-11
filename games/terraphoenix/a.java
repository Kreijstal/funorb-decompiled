/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static db field_d;
    static ck field_b;
    static String field_a;
    static int[] field_c;
    static String field_e;

    final static int[] b(int param0) {
        if (param0 != 3922) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void a(int param0, int param1) {
        c.field_i = th.field_c[param0];
        si.field_hb = jc.field_C[param0];
        qb.field_e = dk.field_h[param0];
        int var2 = 48 % ((-54 - param1) / 46);
    }

    final static int a(boolean param0, int param1, int param2, int param3) {
        if (param3 <= 32) {
          return -113;
        }
        return m.a(1);
    }

    final static boolean a(String param0, int param1, String param2) {
        int var3_int = 0;
        String var4 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = 81 / ((param1 - 57) / 41);
          param2 = je.a(125, "", param2, '_');
          var4 = wa.a((byte) -117, param0);
          stackIn_5_0 = (param2.indexOf(param0) != -1) || (param2.indexOf(var4) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("a.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 > 8) {
          field_c = null;
          return;
        }
        field_c = (int[]) null;
        field_c = null;
    }

    static {
        field_d = new db();
        field_a = "Passwords can only contain letters and numbers";
        field_e = "Instructions";
    }
}
