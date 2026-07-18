/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static String[] field_a;
    static ja field_c;
    static boolean field_b;
    static boolean field_e;
    static int field_d;

    final static int a(byte param0, int param1) {
        int var2 = 106 / ((param0 - 18) / 56);
        return ep.field_k[param1 & 2047];
    }

    final static void a(int param0) {
        va.field_a = 0;
        lp.a((byte) 48);
    }

    final static void b(int param0) {
        if (pk.field_b != null) {
          if (pk.field_b.field_e != null) {
            pk.field_b.field_e.field_Ab = false;
            vc.field_d = null;
            if (param0 < 25) {
              return;
            } else {
              pk.field_b = null;
              return;
            }
          } else {
            vc.field_d = null;
            if (param0 < 25) {
              return;
            } else {
              pk.field_b = null;
              return;
            }
          }
        } else {
          vc.field_d = null;
          if (param0 < 25) {
            return;
          } else {
            pk.field_b = null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
    }

    static {
    }
}
