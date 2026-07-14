/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me {
    int field_b;
    int field_f;
    static int field_e;
    static int field_c;
    static String field_a;
    static String field_d;

    final static void a(int param0) {
        gl.a(126, 4);
        if (param0 != 26566) {
            boolean discarded$0 = me.a(-97, (String) null, (int[]) null, 72L, -125);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    me(int param0, int param1, int param2, int param3) {
        ((me) this).field_f = param3;
        ((me) this).field_b = param0;
    }

    public static void a(byte param0) {
        if (param0 != -36) {
          boolean discarded$2 = me.a(97, (String) null, (int[]) null, -40L, 2);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0, String param1, int[] param2, long param3, int param4) {
        mq var6 = null;
        CharSequence var7 = null;
        if (rb.a(param3, param1, -17231, param4, param2)) {
          L0: {
            if (param4 == 1) {
              param4 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          rs.field_t = param4;
          qd.field_G = param1;
          var7 = (CharSequence) (Object) param1;
          wm.field_b = k.a(var7, false);
          dj.field_e = param3;
          var6 = fg.a(-11, uj.field_n, param2, vs.field_g, hf.field_f);
          vs.a(256, var6);
          if (param0 <= 77) {
            field_e = -67;
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = -1;
        field_a = "You have: <%0>";
        field_c = -1;
        field_d = "Reload game";
    }
}
