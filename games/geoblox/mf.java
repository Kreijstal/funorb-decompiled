/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    static na field_a;

    final static void b(boolean param0) {
        if (el.field_o.field_Y) {
          if (param0) {
            mf.a(false);
            return;
          } else {
            return;
          }
        } else {
          fj.field_m = fj.field_m + 1;
          if (!param0) {
            return;
          } else {
            mf.a(false);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, rh param3) {
        byte[] var5 = param3.a(param1, -28153, param0);
        byte[] var4 = var5;
        if (param2 < 102) {
            return false;
        }
        if (!(var5 != null)) {
            return false;
        }
        hf.a(true, var5);
        return true;
    }

    static {
    }
}
