/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wca extends od {
    int field_q;
    int field_p;
    static int[] field_l;
    int field_k;
    int field_o;
    int field_n;
    int field_m;

    public static void f(int param0) {
        if (param0 != 0) {
          wca.a(18);
          field_l = null;
          return;
        }
        field_l = null;
    }

    final static void a(int param0) {
        rm.field_a = (mfa) ((Object) new wu());
        vha.field_c = (pma) ((Object) new rn());
        if (param0 == -18035) {
          dea.field_a = (mb) ((Object) new gva());
          return;
        }
        field_l = (int[]) null;
        dea.field_a = (mb) ((Object) new gva());
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != null &&
            0 < param5) {
            var6_int = param1[0].field_n;
            var7 = param1[2].field_n;
            var8 = param1[1].field_n;
            param1[0].d(param4, param2, param0);
            param1[2].d(param4 - (-param5 + var7), param2, param0);
            bea.b(ic.field_d);
            bea.g(var6_int + param4, param2, -var7 + param4 + param5, param2 + param1[1].field_k);
            var9 = param4 + var6_int;
            var10 = -var7 + param4 + param5;
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param1[1].d(param4, param2, param0);
            }
            if (param3 != 20278) {
              field_l = (int[]) null;
            }
            bea.a(ic.field_d);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wca.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    wca() {
    }

    static {
    }
}
