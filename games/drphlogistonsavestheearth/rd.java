/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends wh {
    private Object field_I;
    static int[] field_J;
    static int field_G;
    static int field_D;
    static String field_E;
    static int field_F;
    static he[] field_A;
    static int field_z;
    static int[] field_y;
    static vd field_C;
    static int field_B;

    final boolean a(byte param0) {
        if (param0 != 28) {
            return false;
        }
        return false;
    }

    final Object b(byte param0) {
        if (param0 <= 57) {
            Object var3 = null;
            he[] discarded$0 = rd.a(-9, true, -89, (vj) null);
            return ((rd) this).field_I;
        }
        return ((rd) this).field_I;
    }

    final static he[] a(int param0, boolean param1, int param2, vj param3) {
        if (!param1) {
            return null;
        }
        if (!fl.a(param0, param3, param2, (byte) -98)) {
            return null;
        }
        return ih.k(24782);
    }

    public static void g(int param0) {
        field_y = null;
        field_C = null;
        field_J = null;
        field_E = null;
        field_A = null;
        if (param0 > -102) {
            rd.h(-77);
        }
    }

    final static void h(int param0) {
        if (param0 == 300) {
          if (-11 < dg.field_e) {
            lc.a(dg.field_e - 10, (byte) 24);
            return;
          } else {
            lc.a(0, (byte) 24);
            return;
          }
        } else {
          rd.g(37);
          if (-11 > dg.field_e) {
            lc.a(dg.field_e - 10, (byte) 24);
            return;
          } else {
            lc.a(0, (byte) 24);
            return;
          }
        }
    }

    rd(Object param0, int param1) {
        super(param1);
        ((rd) this).field_I = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "This password contains your email address, and would be easy to guess";
        field_J = new int[]{100, 100, 100, 100, 100, 300, 300, 200, 200, 100, 100, 200, 300, 200, 1000};
        ah.a((byte) 127, 50);
        field_y = new int[8192];
        field_C = new vd();
    }
}
