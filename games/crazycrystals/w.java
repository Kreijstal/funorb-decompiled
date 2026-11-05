/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends jb {
    static int field_f;
    static int field_g;

    final static sc a(int param0, int param1, int param2, int param3) {
        sc var4 = new sc();
        var4.field_k = param1;
        var4.field_f = param3;
        hd.field_c.b(param0, var4);
        ed.a((byte) 121, param2, var4);
        return var4;
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
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
        var16 = CrazyCrystals.field_B;
        if (param1 != -52) {
          return;
        }
        param8--;
        while (param8 >= 0) {
          try {
            var17 = param2;
            var10 = var17;
            var11 = param9;
            var12 = param0;
            var13 = param4;
            var14 = param7;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = var15 + (pf.b(33474619, var14) >> 17) - (-pf.b(16711680, var12 >> 1) - (pf.b(var13, 33423575) >> 9));
            param7 = param7 + param5;
            param9++;
            param4 = param4 + param3;
            param0 = param0 + param6;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10_ref = decompiledCaughtException;
            stackIn_10_0 = var10_ref;
            stackIn_10_1 = new StringBuilder().append("w.A(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
          }
          param8--;
        }
    }

    private w() throws Throwable {
        throw new Error();
    }

    final static void a(int param0) {
        if (param0 != 33423575) {
          field_g = -117;
        }
    }

    final static jp a(byte param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        jp stackIn_4_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_18_0 = null;
        jp stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = CrazyCrystals.field_B;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = ma.field_m;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = hk.field_d;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == var2_int - 1) {
                stackIn_18_0 = sl.field_m;
                return stackIn_18_0;
              }
            } else {
              if (rk.field_f.indexOf(var4) == -1) {
                stackIn_21_0 = sl.field_m;
                return stackIn_21_0;
              }
            }
          }
          if (param0 == -44) {
            return null;
          }
          field_g = 54;
          stackIn_26_0 = null;
          return (jp) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("w.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    static {
        field_g = 0;
    }
}
