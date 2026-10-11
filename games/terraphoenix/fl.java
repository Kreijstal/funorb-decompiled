/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static rh field_e;
    static String field_a;
    static oe field_c;
    static int field_b;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        if (param0 == 827399017) {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
        field_a = (String) null;
        field_d = null;
        field_e = null;
        field_a = null;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Terraphoenix.field_V;
        try {
          if (param3 != 6) {
            fl.a(75);
          }
          while (true) {
            param0--;
            if (0 > param0) {
              return;
            }
            var17 = param1;
            var10 = var17;
            var11 = param8;
            var12 = param5;
            var13 = param4;
            var14 = param6;
            var15 = 8355711 & var17[var11] >> 1;
            var10[var11] = (dg.a(var14, 33464851) >> 17) + (dg.a(var13 >> 9, 65280) + dg.a(16711680, var12 >> 1) + var15);
            param8++;
            param5 = param5 + param9;
            param4 = param4 + param7;
            param6 = param6 + param2;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("fl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final static void a(String param0, boolean param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String[] var6 = null;
        String[] var7 = null;
        var5 = Terraphoenix.field_V;
        try {
          pe.field_a = k.field_b;
          if (param3 == 255) {
            stackIn_10_0 = 4;
            stackIn_11_1 = !(wf.field_q >= 13);
            h.field_c = ia.a(stackIn_10_0, stackIn_11_1);
            var6 = (String[]) null;
            eh.a(-32202, (String[]) null);
          } else {
            if (param3 < 100) {
              h.field_c = aj.a(param3, (byte) -21, param0);
            } else {
              if (param3 <= 105) {
                var7 = param2;
                eh.a(-32202, var7);
                h.field_c = ib.a(true, param2);
              } else {
                h.field_c = aj.a(param3, (byte) -21, param0);
              }
            }
          }
          if (!param1) {
            return;
          }
          fl.a(108, (int[]) null, 127, -106, -84, -57, 125, 57, 52, 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fl.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Email address is unavailable";
        field_b = 48;
        field_d = "OUT OF AMMO";
        field_e = new rh(6, 0, 4, 2);
    }
}
