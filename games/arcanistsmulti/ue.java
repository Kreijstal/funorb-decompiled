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
        nj.field_c = 0;
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final static void a(byte param0, le param1) {
        try {
            kl.field_A = 320;
            mf.field_g = -1;
            hc.field_f = true;
            ti.field_N = -1;
            bk.field_J = param1.field_V;
            bm.field_g = param1;
            mo.field_f = null;
            i.b(-120);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ue.C(" + -117 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int b() {
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
