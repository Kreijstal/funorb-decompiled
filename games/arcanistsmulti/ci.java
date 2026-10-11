/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_b;
    static gd field_c;
    static kc field_a;
    static qb field_e;
    static pb field_d;

    final static void a(byte param0) {
        io.field_n = oo.d(-9685);
        p.field_b = new h();
        if (param0 > 49) {
          sc.a(true, false, true);
          return;
        }
        field_b = (String) null;
        sc.a(true, false, true);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static bd a(boolean param0, String param1, int param2, long param3, String param4) {
        RuntimeException var6 = null;
        ld stackIn_6_0 = null;
        an stackIn_8_0 = null;
        im stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == 0L &&
            param1 != null) {
            stackIn_8_0 = new an(param1, param4);
            return (bd) ((Object) stackIn_8_0);
          }
          if (param0) {
            stackIn_6_0 = new ld(param3, param4);
            return (bd) ((Object) stackIn_6_0);
          }
          if (param2 >= -49) {
            field_e = (qb) null;
          }
          stackIn_12_0 = new im(param3, param4);
          return (bd) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ci.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_b = "Classic";
    }
}
