/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_a;
    static int field_b;
    static int field_c;

    final static void a(int param0, int param1, byte param2) {
        if (param2 >= -7) {
          ed.a(22, 55, (byte) 8);
        }
        pd.field_Fb = param0;
        of.field_k = param1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Chess.field_G;
        try {
          if (!qm.a(true, param0, (byte) 94)) {
            return false;
          }
          var2_int = 0;
          if (param1 != 21257) {
            field_b = 26;
          }
          while (var2_int < param0.length()) {
            if (!gm.a(param0.charAt(var2_int), (byte) -68)) {
              return false;
            }
            var2_int++;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ed.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -127 % ((param0 - 47) / 59);
    }

    static {
        field_a = "You cannot add yourself!";
    }
}
