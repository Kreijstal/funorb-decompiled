/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    int field_d;
    static boolean field_b;
    static boolean field_a;
    static String field_c;

    final static void a(d param0, int param1, int param2) {
        se var3 = null;
        try {
          if (param2 < 14) {
            fa.a(false);
          }
          var3 = uk.field_b;
          var3.i(param1, -74);
          var3.a(param0.field_f, -12);
          var3.a(param0.field_i, -99);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "fa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          qc.field_g = kf.field_d;
          if (param0 > -103) {
            field_a = true;
          }
          if (param1 == 255) {
            stackIn_7_0 = !(ae.field_a >= 13);
            tl.field_g = fk.a(stackIn_7_0, (byte) -68);
            return;
          }
          if (param1 < 100) {
            tl.field_g = oe.a(param1, param3, -3);
            return;
          }
          if (param1 <= 105) {
            tl.field_g = hi.a(2, param2);
            return;
          }
          tl.field_g = oe.a(param1, param3, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_c = "Loading extra data";
    }
}
