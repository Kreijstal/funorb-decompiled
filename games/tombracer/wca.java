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
        field_l = null;
    }

    final static void a(int param0) {
        rm.field_a = (mfa) (Object) new wu();
        vha.field_c = (pma) (Object) new rn();
        dea.field_a = (mb) (Object) new gva();
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 < param5) {
                  var6_int = param1[0].field_n;
                  var7 = param1[2].field_n;
                  var8 = param1[1].field_n;
                  param1[0].d(param4, param2, param0);
                  param1[2].d(param4 - (-param5 - -var7), param2, param0);
                  bea.b(ic.field_d);
                  bea.g(var6_int + param4, param2, -var7 + param4 + param5, param2 + param1[1].field_k);
                  var9 = param4 + var6_int;
                  var10 = -var7 + param4 + param5;
                  param4 = var9;
                  L2: while (true) {
                    if (param4 >= var10) {
                      bea.a(ic.field_d);
                      break L0;
                    } else {
                      param1[1].d(param4, param2, param0);
                      param4 = param4 + var8;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("wca.M(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + 20278 + ',' + param4 + ',' + param5 + ')');
        }
    }

    wca() {
    }

    static {
    }
}
