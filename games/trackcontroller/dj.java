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
        ih var7 = null;
        Object var8 = null;
        java.awt.Frame var9 = null;
        var9 = sc.a(param4, param0, param5, 124, param1, param2);
        var6 = var9;
        if (var9 != null) {
          var7 = new ih();
          var7.field_a = var9;
          java.awt.Component discarded$10 = var7.field_a.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, 0, param2, param1);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          if (param3 < 15) {
            var8 = null;
            ih discarded$11 = dj.a(-91, -4, 110, (byte) 50, (uf) null, 31);
            var7.requestFocus();
            return var7;
          } else {
            var7.requestFocus();
            return var7;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        int var1 = -23 / ((4 - param0) / 41);
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new aa(6, 0, 4, 2);
        field_a = "Okay";
    }
}
