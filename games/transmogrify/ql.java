/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int[] field_b;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 100) {
            field_b = (int[]) null;
        }
    }

    final static dg a(int param0, int param1, fe param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        dg var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        dg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var8 = kl.a(param5, -3, param2, param4, param0, param1);
            var6 = var8;
            if (var8 != null) {
              var7 = new dg();
              var7.field_f = var8;
              var7.field_f.add((java.awt.Component) ((Object) var7));
              var7.setBounds(0, param3, param4, param5);
              var7.addFocusListener(var7);
              var7.requestFocus();
              stackIn_4_0 = (dg) (var7);
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
          L1: {
            var6_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6_ref);

            stackIn_7_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dg) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final static od a(int param0, int param1, int param2, hb param3, int param4) {
        bb var5 = null;
        RuntimeException var5_ref = null;
        nd var6 = null;
        od var7 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = bb.b(param3, 100, param2, param4);
              var6 = fl.a(var5, -11039, param1);
              var7 = new od(var5, var6);
              if (param0 > 100) {
                break L1;
              } else {
                field_b = (int[]) null;
                break L1;
              }
            }
            lb.field_f.a(var7, -83);
            of.field_a.a(var6);
            stackIn_3_0 = (od) (var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ql.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_a = null;
    }
}
