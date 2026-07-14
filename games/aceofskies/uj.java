/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static gk field_b;
    static float[][] field_a;

    public static void a(byte param0) {
        if (param0 <= 0) {
            return;
        }
        field_a = (float[][]) null;
        field_b = null;
    }

    final static hj a(rk param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        hj var7 = null;
        java.awt.Frame var8 = null;
        var8 = kn.a(param0, param2, param5, param4, param3, 29742);
        var6 = var8;
        if (var8 == null) {
          return null;
        } else {
          var7 = new hj();
          var7.field_a = var8;
          java.awt.Component discarded$2 = ((hj) var7).field_a.add((java.awt.Component) (Object) var7);
          var7.setBounds(0, param1, param2, param5);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new float[][]{new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3], new float[3]};
    }
}
