/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends oj {
    int field_H;
    static String field_B;
    private boolean field_A;
    private int field_C;
    static int[] field_E;
    private int field_y;
    private int field_z;
    private int field_J;
    int field_F;
    static String field_I;

    public static void g(int param0) {
        if (param0 > -5) {
          field_B = null;
          field_E = null;
          field_I = null;
          field_B = null;
          return;
        } else {
          field_E = null;
          field_I = null;
          field_B = null;
          return;
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        if (((kf) this).field_A) {
          return;
        } else {
          ((kf) this).field_A = true;
          ((kf) this).field_w = new jd(((kf) this).field_H, ((kf) this).field_F, 39, ((kf) this).field_C, ((kf) this).field_z, ((kf) this).field_z, 0, 0, 0, param0, 0, 0, -1, false, 0);
          if (param1 == -26661) {
            param0.a(param1 + 34949, ((kf) this).field_w);
            ((kf) this).field_w.field_B = 1;
            ((kf) this).field_w.field_s = true;
            var5 = param0.c(((kf) this).field_y, true, ((kf) this).field_J);
            var6 = var5;
            if (var6 != null) {
              var6.field_s = true;
              fl.a(param0, param1 ^ 26716);
              return;
            } else {
              fl.a(param0, param1 ^ 26716);
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        if (param1 >= -84) {
            return false;
        }
        return ((kf) this).a((byte) -39, param2, param0, true);
    }

    final String a(byte param0, boolean param1) {
        int var4 = -32 / ((param0 - 53) / 51);
        String var3 = "EventGrowth: g: (" + ((kf) this).field_H + "," + ((kf) this).field_F + "), strength: " + ((kf) this).field_z + ", owner: " + ((kf) this).field_C + ", o: (" + ((kf) this).field_J + "," + ((kf) this).field_y + ")";
        return var3;
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((kf) this).field_J = param2;
        ((kf) this).field_C = param5;
        ((kf) this).field_z = param4;
        ((kf) this).field_m = 11;
        ((kf) this).field_F = param1;
        ((kf) this).field_H = param0;
        ((kf) this).field_A = false;
        ((kf) this).field_y = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "<%0> has entered a game.";
        field_E = new int[]{7, 4, 4, 3, 2, 8};
        field_I = "END TURN";
    }
}
