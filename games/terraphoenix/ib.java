/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends ej implements v {
    static String field_ab;
    static ci field_Y;
    private rc field_db;
    private int field_Z;
    static String field_X;
    static int field_cb;
    static String field_bb;

    public static void b(boolean param0) {
        field_ab = null;
        if (param0) {
          boolean discarded$2 = ib.p(-64);
          field_X = null;
          field_bb = null;
          field_Y = null;
          return;
        } else {
          field_X = null;
          field_bb = null;
          field_Y = null;
          return;
        }
    }

    final String f(int param0) {
        if (((ib) this).field_s) {
          if (((ib) this).field_x != null) {
            if (param0 <= 70) {
              return null;
            } else {
              sh.a((byte) -122, jb.field_b, -((ib) this).field_Z + ((ib) this).field_p + ef.field_j);
              return ((ib) this).field_x;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(rc param0, int param1) {
        if (param1 != 5859) {
            field_cb = -97;
            ((ib) this).field_db = param0;
            return;
        }
        ((ib) this).field_db = param0;
    }

    ib(String param0, sc param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(gl param0, int param1, int param2, int param3) {
        if (param3 < 25) {
          String discarded$2 = ((ib) this).f(-56);
          super.a(param0, param1, param2, 77);
          ((ib) this).field_Z = -param2 + -((ib) this).field_w + ef.field_j;
          return;
        } else {
          super.a(param0, param1, param2, 77);
          ((ib) this).field_Z = -param2 + -((ib) this).field_w + ef.field_j;
          return;
        }
    }

    final void i(int param0) {
        super.i(127);
        if (null == ((ib) this).field_db) {
          if (param0 <= 121) {
            boolean discarded$4 = ib.p(109);
            return;
          } else {
            return;
          }
        } else {
          ((ib) this).field_db.c((byte) 56);
          if (param0 > 121) {
            return;
          } else {
            boolean discarded$5 = ib.p(109);
            return;
          }
        }
    }

    public final rc a(int param0) {
        if (param0 != 29730) {
            return null;
        }
        return ((ib) this).field_db;
    }

    final static boolean p(int param0) {
        if (param0 <= 70) {
            ib.b(false);
            return dg.field_d;
        }
        return dg.field_d;
    }

    final static pd a(boolean param0, String[] param1) {
        pd var2 = null;
        if (!param0) {
          field_cb = 75;
          var2 = new pd(false);
          var2.field_d = param1;
          return var2;
        } else {
          var2 = new pd(false);
          var2.field_d = param1;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ab = "Unfortunately you are not eligible to create an account.";
        field_X = "Hostile sighted";
        field_bb = "Return to game";
    }
}
