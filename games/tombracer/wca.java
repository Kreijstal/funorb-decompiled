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
        if (param0 != -18035) {
          field_l = (int[]) null;
          dea.field_a = (mb) ((Object) new gva());
          return;
        } else {
          dea.field_a = (mb) ((Object) new gva());
          return;
        }
    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                    L3: {
                      if (param4 >= var10) {
                        L4: {
                          if (param3 == 20278) {
                            break L4;
                          } else {
                            field_l = (int[]) null;
                            break L4;
                          }
                        }
                        bea.a(ic.field_d);
                        break L3;
                      } else {
                        param1[1].d(param4, param2, param0);
                        param4 = param4 + var8;
                        if (var11 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("wca.M(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wca() {
    }

    static {
    }
}
