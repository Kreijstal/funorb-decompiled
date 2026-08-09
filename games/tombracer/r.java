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
            return;
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
            return;
          } else {
            kw.a(11, false, 0);
            return;
          }
        }
    }

    final static via a(int param0, int param1, int param2, fia param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        via var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        via stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = kha.a(param3, param1, param0, 10, param5, param4);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new via();
                var7.field_d = var8;
                var7.field_d.add((java.awt.Component) ((Object) var7));
                if (param2 == 19293) {
                  break L1;
                } else {
                  r.f(32);
                  break L1;
                }
              }
              var7.setBounds(0, 0, param4, param0);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_6_0 = (via) (var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6_ref);

            stackIn_9_1 = new StringBuilder().append("r.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
