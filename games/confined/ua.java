/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static boolean[] field_a;

    final static void a(sf param0, int param1, int param2) {
        try {
          sm.field_y.a((rk) (param0), (byte) -77);
          nh.a(param0, param2 - 8795, param1);
          if (param2 != 8795) {
            String var4 = (String) null;
            ua.a((String) null, -44, (mi) null, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ua.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static nf[] a(String param0, int param1, mi param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nf[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(-107, param0);
          if (param1 != -563) {
            field_a = (boolean[]) null;
          }
          var5 = param2.a(var4_int, param3, -99);
          stackIn_3_0 = jl.a(-5744, var4_int, var5, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ua.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static float a(boolean param0) {
        if (!param0) {
          return 0.5023189783096313f;
        }
        return 0.800000011920929f - 0.0015625000232830644f * (float)m.field_l;
    }

    public static void a(int param0) {
        if (param0 != 7526) {
          ua.a(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
