/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends ek {
    static String field_M;
    int field_O;
    static ri[] field_N;
    static String field_P;
    static boolean field_L;

    public static void b(boolean param0) {
        field_N = null;
        field_M = null;
        if (!param0) {
          field_P = (String) null;
          field_P = null;
          return;
        }
        field_P = null;
    }

    final void h(int param0) {
        if (param0 <= 30) {
          sh.b(false);
        }
    }

    final boolean a(pa param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_Q == param1) {
            return false;
          }
          var3_int = param0.e((byte) -112) - this.e((byte) -112);
          var4 = param0.g(1829947600) - this.g(1829947600);
          var5 = var4 * var4 + var3_int * var3_int;
          return !(var5 >= 3600);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("sh.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    sh(int param0, int param1) {
        super(param0, param1, 0);
    }

    static {
        field_P = "";
        field_M = "Login: ";
    }
}
