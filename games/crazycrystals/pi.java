/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends jb {
    gb[] field_m;
    int[] field_n;
    int field_i;
    static nd field_j;
    int[] field_f;
    int field_l;
    gb[] field_k;
    static int field_o;
    int[] field_g;
    byte[][][] field_h;

    public static void a(int param0) {
        if (param0 < 76) {
            field_o = 112;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static java.awt.Container d(int param0) {
        if (param0 == 0) {
          if (null != uc.field_d) {
            return (java.awt.Container) (Object) uc.field_d;
          } else {
            return (java.awt.Container) (Object) le.b((byte) -20);
          }
        } else {
          pi.a(32, 84);
          if (null != uc.field_d) {
            return (java.awt.Container) (Object) uc.field_d;
          } else {
            return (java.awt.Container) (Object) le.b((byte) -20);
          }
        }
    }

    pi() {
    }

    final static void a(int param0, int param1) {
        int discarded$0 = ga.p(-1);
        int var2 = 97 / ((param1 - -34) / 55);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
