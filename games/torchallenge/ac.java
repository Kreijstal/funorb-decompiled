/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static ka field_a;
    static int field_d;
    static long field_e;
    static p field_c;
    static String field_b;

    final static void a(java.math.BigInteger param0, byte param1, uf param2, java.math.BigInteger param3, uf param4) {
        try {
          lc.a(0, param4, 0, param2.field_m, param2.field_q, param3, param0);
          if (param1 != -105) {
            ej var6 = (ej) null;
            ac.a(true, 15, (ej) null, true, -63);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ac.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static jl a(boolean param0) {
        if (!param0) {
          return (jl) null;
        }
        return (jl) ((Object) new bd());
    }

    final static void a(int param0) {
        if (param0 >= -106) {
          return;
        }
        gb.field_d.field_h = 0;
        gb.field_d.field_b = 0;
    }

    final static void a(boolean param0, int param1, ej param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        fj stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = la.field_d;
          stackIn_2_1 = 12048;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = param1;
          stackIn_3_4 = !(param3);
          ((fj) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, param4, param2);
          if (!param0) {
            return;
          }
          field_e = -106L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ac.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 <= -50) {
          field_c = null;
          field_a = null;
          return;
        }
        ej var2 = (ej) null;
        ac.a(true, -1, (ej) null, true, -127);
        field_c = null;
        field_a = null;
    }

    final static t a(long param0, String param1, int param2, String param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        ri stackIn_6_0 = null;
        kk stackIn_8_0 = null;
        na stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0L &&
            param1 != null) {
            stackIn_8_0 = new kk(param1, param3);
            return (t) ((Object) stackIn_8_0);
          }
          if (param4) {
            stackIn_6_0 = new ri(param0, param3);
            return (t) ((Object) stackIn_6_0);
          }
          var6_int = 63 / ((84 - param2) / 37);
          stackIn_10_0 = new na(param0, param3);
          return (t) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ac.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = "Achievements";
        field_c = new p();
    }
}
