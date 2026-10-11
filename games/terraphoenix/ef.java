/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    int field_e;
    static String field_b;
    int field_d;
    static int field_h;
    int field_f;
    static String field_c;
    int field_g;
    static int field_j;
    static String field_a;
    static int field_i;

    final static boolean a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          var2_int = param1.charAt(0);
          if (param0 > -54) {
            ef.a(56);
          }
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (var2_int != param1.charAt(var3)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ef.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 31955) {
          return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_a = "Left click to select ";
        field_j = 0;
        field_b = "ACT I: ";
        field_h = 66;
        field_c = "Snap Accuracy: ";
    }
}
