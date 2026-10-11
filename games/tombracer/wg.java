/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends tu {
    static String[] field_j;
    static qda field_l;
    static String[] field_m;
    static String field_k;
    static int field_i;

    final void a(int param0, hca param1, int param2, la param3, int param4, int param5) {
        try {
          nba.a(this.field_f, param3, (byte) 108);
          if (param0 != 15) {
            la var8 = (la) null;
            this.a((hca) null, (la) null, true);
          }
          super.a(param0 + 0, param1, param2, param3, param4, param5);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(int param0, int[] param1) {
        int var3 = 0;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = new StringBuilder("[");
          var2 = var5;
          for (var3 = param0; var3 < param1.length; var3++) {
            if (var3 != 0) {
              discarded$2 = var2.append(',');
            }
            discarded$3 = var5.append("0x").append(Integer.toHexString(param1[var3]));
          }
          stackIn_8_0 = var2.append(']').toString();
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("wg.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, hca param1, la param2) {
        try {
          qra.a(param2, 100, this.field_f);
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wg.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        field_j = null;
        field_m = null;
        if (!param0) {
          return;
        }
        field_l = null;
    }

    wg(ff param0) {
        super(param0);
    }

    final void a(hca param0, la param1, boolean param2) {
        try {
          if (param2) {
            la var5 = (la) null;
            this.a((hca) null, (la) null, false);
          }
          caa.a(this.field_f, param1, 108);
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wg.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 1541709953) {
            wg.a(true);
          }
          var3_int = 0;
          var4 = jua.field_d;
          while (mba.field_g.length > var3_int) {
            var5 = bla.field_H[var3_int];
            if (var5 >= 0) {
              var6 = ro.$cfr$intArgs$a$590e95718a07(-116, mba.field_g[var3_int], true);
              var4 = var4 + mha.field_C;
              var7 = -(var6 >> 1) + ega.field_c;
              if (rea.a(param2, var6 + (nja.field_L << 1), -nja.field_L + var7, param1, (pqa.field_p << 1) + nt.field_d, false, var4)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + ((pqa.field_p << 1) + mha.field_C + nt.field_d);
            } else {
              var4 = var4 + f.field_b;
            }
            var3_int++;
          }
          stackIn_13_0 = -1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wg.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_m = new String[]{"By rating", "By win percentage"};
        field_k = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
