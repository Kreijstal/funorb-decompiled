/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dj extends IOException {
    static aa field_b;
    static String field_a;

    dj(String param0) {
        super(param0);
    }

    final static ih a(int param0, int param1, int param2, byte param3, uf param4, int param5) {
        java.awt.Component discarded$10 = null;
        ih discarded$11 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ih var7 = null;
        uf var8 = null;
        java.awt.Frame var9 = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ih stackOut_5_0 = null;
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
            var9 = sc.a(param4, param0, param5, 124, param1, param2);
            var6 = var9;
            if (var9 != null) {
              L1: {
                var7 = new ih();
                var7.field_a = var9;
                discarded$10 = var7.field_a.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param2, param1);
                var7.addFocusListener(var7);
                if (param3 >= 15) {
                  break L1;
                } else {
                  var8 = (uf) null;
                  discarded$11 = dj.a(-91, -4, 110, (byte) 50, (uf) null, 31);
                  break L1;
                }
              }
              var7.requestFocus();
              stackOut_5_0 = (ih) (var7);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("dj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        int var1 = -23 / ((4 - param0) / 41);
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new aa(6, 0, 4, 2);
        field_a = "Okay";
    }
}
