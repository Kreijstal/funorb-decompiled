/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lq {
    static int field_e;
    static boolean field_d;
    static int field_b;
    static gu field_c;
    static String field_a;
    static String field_f;

    final static nc a(byte[] param0, int param1) {
        nc var2 = null;
        if (param0 != null) {
          var2 = new nc(param0, j.field_e, iq.field_g, qm.field_K, c.field_e, qv.field_j, vj.field_j);
          if (param1 != 0) {
            return null;
          } else {
            rj.d((byte) 117);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var3 = 1;
        while ((param1 ^ -1) < -2) {
            if (0 != (1 & param1)) {
                var3 = var3 * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
        }
        if (param2 != 21) {
            int discarded$12 = lq.a(-54, -42, (byte) -105);
            if (!((param1 ^ -1) != -2)) {
                return var3 * param0;
            }
            return var3;
        }
        if (!((param1 ^ -1) != -2)) {
            return var3 * param0;
        }
        return var3;
    }

    public static void a(int param0) {
        if (param0 != -31320) {
            return;
        }
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_e = -1;
        field_b = 0;
        field_c = new gu();
        field_f = "Build cannon - The troop of engineers will build a single, powerful cannon on the tile they're on.";
        field_a = "SPEED";
    }
}
