/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static String field_e;
    static String field_d;
    static int field_c;
    static String field_a;
    static int field_b;

    final static va a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        va var5 = null;
        va stackIn_4_0 = null;
        va stackIn_8_0 = null;
        va stackIn_11_0 = null;
        va stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (-1 == var2_int) {
              stackIn_8_0 = vf.field_q;
              return stackIn_8_0;
            }
            var3 = param1.substring(param0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = ll.a(var3, true);
            if (var5 == null) {
              stackIn_13_0 = ll.a((byte) 57, var4);
              return stackIn_13_0;
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = pe.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("nl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          field_e = null;
          field_d = null;
          return;
        }
        ok var2 = (ok) null;
        nl.a((ok) null, -61, (ok) null, 56);
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, int param1, nf[] param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Confined.field_J ? 1 : 0;
        try {
          if (param2 != null &&
            param3 > 0) {
            var5_int = param2[0].field_t;
            var6 = param2[2].field_t;
            var7 = param2[1].field_t;
            param2[0].d(param1, param4);
            param2[2].d(param1 + param3 - var6, param4);
            fn.b(hj.field_l);
            if (param0 <= 101) {
              field_e = (String) null;
            }
            fn.f(var5_int + param1, param4, param1 + (param3 - var6), param4 + param2[1].field_x);
            var8 = param1 + var5_int;
            var9 = -var6 + (param1 + param3);
            for (param1 = var8; param1 < var9; param1 = param1 + var7) {
              param2[1].d(param1, param4);
            }
            fn.a(hj.field_l);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("nl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ok param0, int param1, ok param2, int param3) {
        try {
          dn.field_f = param2;
          wg.field_a = param1;
          rn.field_e = param0;
          ud.a(fn.field_g / 2, (byte) -12, fn.field_l / param3);
          ue.a(param0.field_D + param0.field_y, param2.field_y + param2.field_D, param2.field_y, param0.field_y, 243);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "nl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_e = "Members";
        field_d = "Waiting for extra data";
        field_b = 65;
        field_a = "Play the game without logging in just yet";
    }
}
