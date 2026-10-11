/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static fa field_f;
    static int field_b;
    static ci[] field_e;
    static lg[] field_a;
    static volatile boolean field_c;
    static int[] field_g;
    static String field_d;

    public static void a(int param0) {
        field_e = null;
        field_g = null;
        if (param0 == 0) {
          field_f = null;
          field_a = null;
          field_d = null;
          return;
        }
        sj.a(53);
        field_f = null;
        field_a = null;
        field_d = null;
    }

    final static void a(boolean param0, byte param1, boolean param2, String param3) {
        try {
          dh.g((byte) -124);
          jl.field_I.b(false);
          mb.field_s = new uh(ol.field_Hb, (String) null, qi.field_b, param2, param0);
          bj.field_f = new jg(jl.field_I, mb.field_s);
          jl.field_I.a((gl) (bj.field_f), (byte) -1);
          if (param1 != 68) {
            field_a = (lg[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 20) {
            stackIn_4_0 = og.field_f.a(param6, param5, param2 - 20, param3 - param5, 480, param0, param7, 0, 0, param4);
            return stackIn_4_0;
          }
          stackIn_2_0 = 29;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("sj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_c = false;
        field_a = new lg[4];
        field_d = "Create your own free Jagex account";
        field_g = new int[128];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$b1efba5c64a3(boolean param0, int param1, boolean param2, String param3) {
        try {
          dh.g((byte) -124);
          jl.field_I.b(false);
          mb.field_s = new uh(ol.field_Hb, (String) null, qi.field_b, param2, param0);
          bj.field_f = new jg(jl.field_I, mb.field_s);
          jl.field_I.a((gl) (bj.field_f), (byte) -1);
          if (param1 != 68) {
            field_a = (lg[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }
}
