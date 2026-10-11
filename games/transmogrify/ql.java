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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = kl.a(param5, -3, param2, param4, param0, param1);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (dg) (stackIn_2_0);
          }
          var7 = new dg();
          var7.field_f = var8;
          var7.field_f.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, param3, param4, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = bb.b(param3, 100, param2, param4);
          var6 = fl.a(var5, -11039, param1);
          var7 = new od(var5, var6);
          if (param0 <= 100) {
            field_b = (int[]) null;
          }
          lb.field_f.a(var7, -83);
          of.field_a.a(var6);
          stackIn_3_0 = var7;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ql.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
