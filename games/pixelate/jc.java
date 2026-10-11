/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc implements eb {
    static id field_f;
    static long field_c;
    static tf field_a;
    static String field_e;
    static boolean field_d;
    static int field_b;

    final static void a(byte param0, int param1, m param2) {
        pc var3 = null;
        try {
          if (param0 != -31) {
            jc.a(-63);
          }
          var3 = aa.field_f;
          var3.g(param1, 15514);
          var3.e(160, param2.field_m);
          var3.b(param0 + 1276387975, param2.field_k);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jc.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1) {
        try {
          int var2_int = 31 % ((param1 + 78) / 35);
          oo.field_a = param0;
          te.a(12, -2671);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "jc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(ng param0, byte param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        tf var8 = null;
        try {
          if (param1 != -124) {
            field_e = (String) null;
          }
          var6_int = param0.field_z + param3;
          var7 = param2 + param0.field_p;
          kk.a(var6_int, param0.field_C, var7, param0.field_E, (byte) -51);
          var8 = ha.field_g[1];
          if (param0 instanceof qm &&
            ((qm) (param0)).field_M) {
            var8.b((-var8.field_A + param0.field_E >> 1) + var6_int + 1, var7 + (1 + (-var8.field_B + param0.field_C >> 1)), 256);
          }
          if (!param0.b(true)) {
            return;
          }
          gk.a(var6_int + 2, 2 + var7, (byte) -128, param0.field_E - 4, param0.field_C - 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jc.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 14518) {
          return;
        }
        field_e = null;
        field_a = null;
    }

    static {
        field_d = true;
        field_e = "Email address is unavailable";
    }
}
