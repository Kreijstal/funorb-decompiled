/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static double field_a;

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        bd var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var1 = nj.field_c;
          synchronized (var1) {
            ae.field_s = ae.field_s + 1;
            ee.field_e = nm.field_j;
            if (uc.field_b < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                qh.field_m[var2] = false;
              }
              uc.field_b = md.field_o;
            } else {
              while (uc.field_b != md.field_o) {
                var2 = al.field_W[md.field_o];
                md.field_o = 127 & md.field_o + 1;
                if (var2 < 0) {
                  qh.field_m[~var2] = false;
                  continue;
                }
                qh.field_m[var2] = true;
              }
            }
            nm.field_j = oa.field_a;
          }
          if (param0 != -113) {
            var5 = (bd) null;
            sb.a((bd) null, -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "sb.A(" + param0 + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = HostileSpawn.field_I ? 1 : 0;
        if (param9 != 3) {
          return;
        }
        param3--;
        while (param3 >= 0) {
          try {
            var17 = param0;
            var10 = var17;
            var11 = param2;
            var12 = param1;
            var13 = param4;
            var14 = param8;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = var15 + ua.a(65280, var13 >> 9) + (ua.a(var12 >> 1, 16711680) + ua.a(255, var14 >> 17));
            param8 = param8 + param5;
            param1 = param1 + param6;
            param2++;
            param4 = param4 + param7;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("sb.D(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
          }
          param3--;
        }
    }

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        nj var5 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            var4 = (Object) null;
            sb.a(true, (Object) null, false);
          }
          if (param1 == null) {
            return null;
          }
          if (!(param1 instanceof byte[])) {
            if (!(param1 instanceof nj)) {
              throw new IllegalArgumentException();
            }
            var5 = (nj) (param1);
            stackIn_13_0 = var5.a((byte) -26);
            return stackIn_13_0;
          }
          var3 = (byte[]) (param1);
          if (!param2) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = dc.a(97, var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("sb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(bd param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          pf.b(511);
          si.a(param0.field_D, param0.field_u, param0.field_r);
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "sb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_a = 0.0;
    }
}
