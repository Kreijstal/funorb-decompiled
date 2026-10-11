/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi implements td {
    static String field_a;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        hj var8 = null;
        try {
          var6_int = param1 + param2.field_s;
          var7 = param0 + param2.field_n;
          if (param3 != -4394) {
            fi.a(-11);
          }
          tl.a(param2.field_r, var7, var6_int, param2.field_m, 127);
          var8 = wd.field_C[1];
          if (param2 instanceof s &&
            ((s) (param2)).field_D) {
            var8.e((-var8.field_s + param2.field_m >> 1) + 1 + var6_int, (-var8.field_t + param2.field_r >> 1) + var7 + 1, 256);
          }
          if (!param2.d(-81)) {
            return;
          }
          wh.a(-4 + param2.field_m, false, var6_int + 2, param2.field_r - 4, var7 + 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("fi.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        int var4 = 0;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var3 = rg.a(param2, param1, 0);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          for (var4 = 0; param1.length() > var4; var4++) {
            if (!vg.a(param1.charAt(var4), -22118)) {
              stackIn_9_0 = pl.field_i;
              return stackIn_9_0;
            }
          }
          if (param0 == 1) {
            return null;
          }
          field_a = (String) null;
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("fi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -8601) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
