/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_g;
    static String field_b;
    static long field_e;
    static ij field_a;
    static tk field_d;
    static km[] field_c;
    static String field_f;

    final static rk a(int param0, int param1, int param2, um param3) {
        RuntimeException var4 = null;
        rk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tj.a(param2, param0, param3, (byte) 83)) {
            return null;
          }
          if (param1 != 3807) {
            field_b = (String) null;
          }
          stackIn_6_0 = th.b(param1 ^ 3807);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("gi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, le param1, int param2, boolean param3, le param4, int param5) {
        try {
          ek.field_b = param5;
          if (param3) {
            le var7 = (le) null;
            gi.a(-26, (le) null, 18, false, (le) null, 96);
          }
          kl.field_i = param2;
          ie.field_b = param4;
          in.field_d = param1;
          m.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "gi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          field_g = null;
          field_a = null;
          field_c = null;
          field_b = null;
          field_d = null;
          return;
        }
        le var2 = (le) null;
        gi.a(108, (le) null, -27, false, (le) null, -31);
        field_g = null;
        field_a = null;
        field_c = null;
        field_b = null;
        field_d = null;
    }

    static {
        field_b = "Please enter your date of birth to enable chat:";
        field_a = new ij();
        field_d = new tk();
        field_f = null;
    }
}
