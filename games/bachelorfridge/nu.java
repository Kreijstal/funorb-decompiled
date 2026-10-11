/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nu {
    static kia field_h;
    static kv field_e;
    static String field_g;
    static sna field_c;
    static boolean field_b;
    static String field_a;
    static sna field_f;
    static String field_d;

    abstract void a(byte param0, byte[] param1);

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        if (param0 > 64) {
          field_e = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
        field_a = (String) null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        field_f = null;
    }

    final static int a(String param0, lu param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.field_g;
          var5 = (CharSequence) ((Object) param0);
          var4 = bv.a(18019, var5);
          param1.b(var4.length, true);
          if (param2 != -21840) {
            stackIn_2_0 = -15;
            return stackIn_2_0;
          }
          param1.field_g = param1.field_g + jka.field_l.a(var4, var4.length, param2 + 42697, param1.field_h, 0, param1.field_g);
          stackIn_4_0 = -var3_int + param1.field_g;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("nu.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Exploiting a bug";
        field_g = "You will win in <%0> turns!";
        field_d = "<%0> is already on your ignore list.";
    }
}
