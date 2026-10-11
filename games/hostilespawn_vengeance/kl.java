/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static int[] field_c;
    static int field_a;
    static bd[][] field_b;

    final static boolean b(int param0) {
        if (param0 != 50) {
          kl.b(-84);
          if (ag.field_t == null) {
            return false;
          }
          if (ci.field_d == rc.field_a) {
            return true;
          }
          return false;
        }
        if (ag.field_t == null) {
          return false;
        }
        if (ci.field_d == rc.field_a) {
          return true;
        }
        return false;
    }

    public static void a(int param0) {
        if (param0 < 90) {
          kl.a(92);
          field_c = null;
          field_b = (bd[][]) null;
          return;
        }
        field_c = null;
        field_b = (bd[][]) null;
    }

    static {
        field_c = new int[50];
    }
}
