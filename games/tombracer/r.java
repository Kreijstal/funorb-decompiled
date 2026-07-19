/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends od {
    static ica field_m;
    static String field_l;
    static String field_k;

    final static void a(int param0, boolean param1) {
        if (param0 == 0) {
          if (!param1) {
            L0: {
              if (uu.field_a != null) {
                et.a(11, 30, uu.field_a.f(param0 ^ 0));
                break L0;
              } else {
                break L0;
              }
            }
            vda.field_q = true;
            if (TombRacer.field_G) {
              kw.a(11, false, 0);
              return;
            } else {
              return;
            }
          } else {
            kw.a(11, false, 0);
            return;
          }
        } else {
          field_l = (String) null;
          if (!param1) {
            L1: {
              if (uu.field_a != null) {
                et.a(11, 30, uu.field_a.f(param0 ^ 0));
                break L1;
              } else {
                break L1;
              }
            }
            vda.field_q = true;
            if (TombRacer.field_G) {
              kw.a(11, false, 0);
              return;
            } else {
              return;
            }
          } else {
            kw.a(11, false, 0);
            return;
          }
        }
    }

    final static via a(int param0, int param1, int param2, fia param3, int param4, int param5) {
        java.awt.Component discarded$11 = null;
        int discarded$12 = 0;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        via var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        via stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        via stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = kha.a(param3, param1, param0, 10, param5, param4);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new via();
                var7.field_d = var8;
                discarded$11 = var7.field_d.add((java.awt.Component) ((Object) var7));
                if (param2 == 19293) {
                  break L1;
                } else {
                  discarded$12 = r.f(32);
                  break L1;
                }
              }
              var7.setBounds(0, 0, param4, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackOut_5_0 = (via) (var7);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (via) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 11) {
            r.a(-85);
            field_l = null;
            field_m = null;
            return;
        }
        field_l = null;
        field_m = null;
    }

    final static int f(int param0) {
        if (param0 != 11) {
          r.a(87, false);
          return caa.field_i + (k.field_A << -1589041404) - -(nba.field_b << 638698306);
        } else {
          return caa.field_i + (k.field_A << -1589041404) - -(nba.field_b << 638698306);
        }
    }

    protected r() {
    }

    static {
        field_k = "You unlocked a Tomb!";
        field_l = "Accept";
        field_m = new ica();
    }
}
