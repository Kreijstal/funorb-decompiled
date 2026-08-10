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
        if (this.field_w) {
          if (null != this.field_j) {
            sb.d(33, rf.field_b, -this.field_bb - -this.field_y + hn.field_k);
            if (param0 != 0) {
              return (String) null;
            } else {
              return this.field_j;
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
            return this.field_Y;
        }
        return this.field_Y;
    }

    final void g(byte param0) {
        super.g(param0);
        if (null != this.field_Y) {
            this.field_Y.b(true);
        }
    }

    final void a(int param0, vb param1) {
        try {
            this.field_Y = param1;
            if (param0 >= -63) {
                field_ab = true;
            }
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bg.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        if (param0 != 2491) {
            field_Z = (km) null;
            field_cb = null;
            field_Z = null;
            return;
        }
        field_cb = null;
        field_Z = null;
    }

    final void a(int param0, int param1, mf param2, int param3) {
        try {
            if (param1 >= -6) {
                field_cb = (String[]) null;
            }
            super.a(param0, -30, param2, param3);
            this.field_bb = -param0 + (-this.field_u + hn.field_k);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "bg.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    bg(String param0, rg param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_cb = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
