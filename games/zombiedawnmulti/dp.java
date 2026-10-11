/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp {
    static cj field_b;
    static String field_a;
    static cj field_c;

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!vd.a(param1, param2, (byte) 109)) {
            return false;
          }
          for (var3_int = param0; var3_int < param2.length(); var3_int++) {
            if (!fl.a(-122, param2.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("dp.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        vl var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != 80) {
            return;
          }
          var4 = (vl) (lf.field_e.c(param0 - 18));
          while (var4 != null) {
            uk.a((byte) 127, var4, param1);
            var4 = (vl) (lf.field_e.b(param0 ^ 86));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "dp.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "On";
    }
}
