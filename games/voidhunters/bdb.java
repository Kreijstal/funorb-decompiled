/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bdb extends rqa {
    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          return (param2 & 2048) != 0 ? true : false;
        }
        int[] var4 = (int[]) null;
        bdb.a(-42, -9, 37, 119, 111, 16, 52, (int[]) null, 30, true);
        return (param2 & 2048) != 0 ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8, boolean param9) {
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
        var16 = VoidHunters.field_G;
        try {
          if (!param9) {
            return;
          }
          while (true) {
            param4--;
            if (0 > param4) {
              return;
            }
            var17 = param7;
            var10 = var17;
            var11 = param3;
            var12 = param2;
            var13 = param0;
            var14 = param6;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = dla.a(65280, var13 >> 9) + (dla.a(var12 >> 1, 16711680) + dla.a(255, var14 >> 17) + var15);
            param6 = param6 + param5;
            param2 = param2 + param8;
            param0 = param0 + param1;
            param3++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("bdb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          tu.field_d = param0[0].a(70);
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -116);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bdb.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    bdb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
