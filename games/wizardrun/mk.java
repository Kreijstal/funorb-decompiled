/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static lg field_e;
    static int field_f;
    static va field_a;
    static boolean field_d;
    static int[] field_c;
    static int field_b;

    final static int a(ne param0, int param1, ne param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = -55;
            return stackIn_2_0;
          }
          var4 = (String) null;
          stackIn_4_0 = qi.a(param2, param0, (String) null, 0, 0, false, 27851);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -7241) {
          field_e = null;
          field_a = null;
          field_c = null;
          return;
        }
        ne var2 = (ne) null;
        mk.a((ne) null, 78, (ne) null);
        field_e = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_e = new lg();
        field_d = false;
        field_b = 4;
    }
}
