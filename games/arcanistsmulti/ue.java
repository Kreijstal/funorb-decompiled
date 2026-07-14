/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_a;
    static boolean field_e;
    static eg field_d;
    static wk field_c;
    static int[][] field_b;

    final static void b(int param0) {
        hi.field_e.setLength(0);
        if (param0 != 10) {
            field_c = null;
            nj.field_c = 0;
            return;
        }
        nj.field_c = 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 62) {
          int discarded$2 = ue.b((byte) -12);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, le param1) {
        kl.field_A = 320;
        if (param0 > -26) {
          ue.b(-27);
          mf.field_g = -1;
          hc.field_f = true;
          ti.field_N = -1;
          bk.field_J = param1.field_V;
          bm.field_g = param1;
          mo.field_f = null;
          i.b(-120);
          return;
        } else {
          mf.field_g = -1;
          hc.field_f = true;
          ti.field_N = -1;
          bk.field_J = param1.field_V;
          bm.field_g = param1;
          mo.field_f = null;
          i.b(-120);
          return;
        }
    }

    final static int b(byte param0) {
        if (param0 > -20) {
            return 25;
        }
        return uc.field_b;
    }

    final static boolean a(int param0) {
        if (param0 >= 119) {
          if (10 <= fj.field_j) {
            if (13 > ih.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_e = true;
          if (10 <= fj.field_j) {
            if (13 > ih.field_f) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Players and their health";
    }
}
