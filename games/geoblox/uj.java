/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static int field_b;
    static String field_e;
    static String field_c;
    static String field_a;
    static String field_d;

    final static boolean a(boolean param0, int param1) {
        if (param0) {
            return (param1 & -param1) == param1 ? true : false;
        }
        return true;
    }

    final static boolean a(ja param0, float param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_4_0 = aa.a(vf.field_L, -(vf.field_L.field_s >> 1) + ng.field_G, -(vf.field_L.field_o >> 1) + td.field_E, bk.field_a, 0, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = 0;
          return stackIn_2_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("uj.C(");

          if (param0 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 > 0) {
            uj.a(false, -95);
        }
    }

    final static String[] a(char param0, boolean param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param2);
          var3_int = cg.a(var9, param1, param0);
          var4 = new String[1 + var3_int];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var3_int > var7; var7++) {
            for (var8 = var6; param2.charAt(var8) != param0; var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_7_0 = (String[]) (var4);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3);

          stackIn_10_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 0;
        field_e = "Error connecting to server. Please try using a different server.";
        field_c = "Harvesting Pumpkin";
        field_a = "Starting Game";
        field_d = "to return to the normal view.";
    }
}
