/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wt {
    static iu[] field_c;
    static String field_b;
    static fpa field_d;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 <= 105) {
          wt.a((byte) -46);
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = sv.a((byte) -38, jm.a(param1, -127));
          if (param0 != 30433) {
            field_a = -2;
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("wt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        ej.field_a.e(true);
        if (null != ena.field_p) {
          ej.field_a.c(ena.field_p, 87);
          var1 = 44 % ((param0 + 68) / 49);
          return;
        }
        ena.field_p = new vs(ej.field_a, sea.field_o);
        ej.field_a.c(ena.field_p, 87);
        var1Lifetime1 = 44 % ((param0 + 68) / 49);
    }

    static {
        field_b = "Waiting for extra data";
    }
}
