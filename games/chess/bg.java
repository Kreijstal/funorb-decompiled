/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends qn implements ee {
    private int field_bb;
    static boolean field_ab;
    static km field_Z;
    private vb field_Y;
    static String[] field_cb;

    final String g(int param0) {
        if (((bg) this).field_w) {
          if (null != ((bg) this).field_j) {
            sb.d(33, rf.field_b, -((bg) this).field_bb - -((bg) this).field_y + hn.field_k);
            if (param0 != 0) {
              return null;
            } else {
              return ((bg) this).field_j;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final vb a(int param0) {
        if (param0 >= -80) {
            field_ab = false;
            return ((bg) this).field_Y;
        }
        return ((bg) this).field_Y;
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != ((bg) this).field_Y) {
            ((bg) this).field_Y.b(true);
        }
    }

    final void a(int param0, vb param1) {
        ((bg) this).field_Y = param1;
        if (param0 >= -63) {
            field_ab = true;
        }
    }

    public static void n(int param0) {
        if (param0 != 2491) {
            field_Z = null;
            field_cb = null;
            field_Z = null;
            return;
        }
        field_cb = null;
        field_Z = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        if (param1 >= -6) {
          field_cb = null;
          super.a(param0, -30, param2, param3);
          ((bg) this).field_bb = -param0 + (-((bg) this).field_u + hn.field_k);
          return;
        } else {
          super.a(param0, -30, param2, param3);
          ((bg) this).field_bb = -param0 + (-((bg) this).field_u + hn.field_k);
          return;
        }
    }

    bg(String param0, rg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
