/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends rqa {
    final static wma a(faa param0, byte param1) {
        int var8 = 0;
        wma stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wma var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          var2_int = param0.i(0, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = kv.a(false, param0) ? 1 : 0;
          var4 = kv.a(false, param0) ? 1 : 0;
          var5 = new wma();
          var5.field_J = (short)param0.i(0, 16);
          var5.field_r = et.a(param0, 16, 24, var5.field_r);
          var5.field_o = et.a(param0, 16, 24, var5.field_o);
          var5.field_p = et.a(param0, 16, 24, var5.field_p);
          var6 = -116 / ((-14 - param1) / 61);
          var5.field_y = (short)param0.i(0, 16);
          var5.field_w = et.a(param0, 16, 24, var5.field_w);
          var5.field_N = et.a(param0, 16, 24, var5.field_N);
          var5.field_D = et.a(param0, 16, 24, var5.field_D);
          if (var3 != 0) {
            var5.field_L = (short)param0.i(0, 16);
            var5.field_k = et.a(param0, 16, 24, var5.field_k);
            var5.field_v = et.a(param0, 16, 24, var5.field_v);
            var5.field_n = et.a(param0, 16, 24, var5.field_n);
            var5.field_j = et.a(param0, 16, 24, var5.field_j);
            var5.field_G = et.a(param0, 16, 24, var5.field_G);
            var5.field_I = et.a(param0, 16, 24, var5.field_I);
          }
          if (var4 != 0) {
            param0.i(0, 16);
            var5.field_b = et.a(param0, 16, 24, var5.field_b);
            var5.field_m = et.a(param0, 16, 24, var5.field_m);
            var5.field_f = et.a(param0, 16, 24, var5.field_f);
            var5.field_i = et.a(param0, 16, 24, var5.field_i);
            var5.field_c = et.a(param0, 16, 24, var5.field_c);
          }
          if (kv.a(false, param0)) {
            var5.field_K = et.a(param0, 16, 24, var5.field_K);
          }
          if (kv.a(false, param0)) {
            var5.field_E = mca.a(false, 16, param0, var5.field_E);
            var7 = 0;
            for (var8 = 0; var5.field_E.length > var8; var8++) {
              if (var7 < (255 & var5.field_E[var8])) {
                var7 = 255 & var5.field_E[var8];
              }
            }
            if (var7 != 0) {
              var5.field_z = (byte)(1 + var7);
            } else {
              var5.field_E = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ur.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
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
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, 2);
          }
          stackIn_3_0 = new nc(mbb.field_c);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ur.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ur(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
