/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends dk {
    static String field_J;
    static String field_I;
    static String field_E;
    static boolean field_G;
    static fa field_H;
    static int field_K;
    static String field_F;

    final void a(byte param0, qa param1, int param2, int param3, int param4, int param5) {
        pk var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = wi.field_e;
        if (var7 != null) {
          if (((qj) this).b(param5, param2, param0 ^ 5, param3, param4)) {
            if (!(((qj) this).field_s instanceof vd)) {
              if (!(var7.field_s instanceof vd)) {
                return;
              } else {
                ((vd) (Object) var7.field_s).a(var7, (qj) this, (byte) -46);
                wi.field_e = null;
                return;
              }
            } else {
              ((vd) (Object) ((qj) this).field_s).a(var7, (qj) this, (byte) -46);
              wi.field_e = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = fleas.field_A ? 1 : 0;
        for (var5 = param4; ed.field_c.length > var5; var5++) {
            param0 = ed.field_c[var5];
            var6 = var5 << -1266174492;
            while (true) {
                param0--;
                if (0 == param0) {
                    break;
                }
                var6++;
                param1 = pk.field_J[var6];
                param3[param2[param1]] = param3[param2[param1]] + 1;
                pk.field_J[param3[param2[param1]]] = param1;
            }
            var5++;
        }
    }

    private qj(int param0, int param1, int param2, int param3, ch param4, kd param5, qa param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((qj) this).field_A = param6;
    }

    public static void i(int param0) {
        field_I = null;
        field_E = null;
        field_H = null;
        field_J = null;
        field_F = null;
        if (param0 >= -107) {
            field_G = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "If you hold the mouse button down on a bridge, the currently selected tile will be placed there as soon as the bridge collapses, catching any fleas before they fall through. You can use this tactic with any tile that is going to disappear.";
        field_J = "Go Back";
        field_F = "<%0>Anti-Gravity:<%1> Reverses the direction of gravity when touched by a flea. Items such as balloons and springs now work upside down.";
    }
}
