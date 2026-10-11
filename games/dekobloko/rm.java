/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm {
    static long field_c;
    static ui field_b;
    static ck[] field_a;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        int var4 = -27 % ((-37 - param2) / 37);
        if (wc.field_n) {
          return bc.field_E.a(wh.field_c, el.field_G, (byte) 126);
        }
        if (jh.field_h) {
          return tl.b(param0, 102, param3);
        }
        if (dc.a(param3, param0, 6774)) {
          return true;
        }
        if (!wl.field_p) {
          return nm.a(param1, 1, param3);
        }
        return false;
    }

    final static void a(byte param0, String param1) {
        try {
          vh.field_f = param1;
          if (param0 != 73) {
            field_a = (ck[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "rm.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, ck[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        try {
          if (param1 != null &&
            param3 > 0) {
            var6_int = param1[0].field_K;
            var7 = param1[2].field_K;
            var8 = param1[1].field_K;
            param1[0].a(param2, param0, param4);
            param1[2].a(-var7 + param2 + param3, param0, param4);
            hk.b(kh.field_e);
            hk.f(var6_int + param2, param0, -var7 + (param3 + param2), param1[1].field_C + param0);
            var9 = param2 + var6_int;
            var10 = param3 + param2 - var7;
            if (param5 >= -98) {
              field_a = (ck[]) null;
            }
            for (param2 = var9; param2 < var10; param2 = param2 + var8) {
              param1[1].a(param2, param0, param4);
            }
            hk.a(kh.field_e);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("rm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
          field_c = 40L;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
    }
}
