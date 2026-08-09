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
        if (param0 <= 64) {
          field_a = (String) null;
          field_e = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_g = null;
          field_a = null;
          field_c = null;
          field_d = null;
          field_f = null;
          return;
        }
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param1.field_g;
            var5 = (CharSequence) ((Object) param0);
            var4 = bv.a(18019, var5);
            param1.b(var4.length, true);
            if (param2 == -21840) {
              param1.field_g = param1.field_g + jka.field_l.a(var4, var4.length, param2 + 42697, param1.field_h, 0, param1.field_g);
              stackIn_4_0 = -var3_int + param1.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -15;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("nu.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_a = "Exploiting a bug";
        field_g = "You will win in <%0> turns!";
        field_d = "<%0> is already on your ignore list.";
    }
}
