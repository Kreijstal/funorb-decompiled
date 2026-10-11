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
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ih var7 = null;
        uf var8 = null;
        java.awt.Frame var9 = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = sc.a(param4, param0, param5, 124, param1, param2);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var7 = new ih();
          var7.field_a = var9;
          var7.field_a.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param2, param1);
          var7.addFocusListener(var7);
          if (param3 < 15) {
            var8 = (uf) null;
            dj.a(-91, -4, 110, (byte) 50, (uf) null, 31);
          }
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("dj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
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
