/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static sa field_a;
    static md field_d;
    private String field_b;
    private boolean field_h;
    static String field_e;
    private boolean field_c;
    static String field_g;
    static dd field_f;

    final static void b(int param0) {
        if (param0 == 13) {
          tj.field_p = null;
          em.field_m = null;
          ik.field_a = null;
          hj.field_l = null;
          kb.field_S = false;
          return;
        }
        mh.b(22);
        tj.field_p = null;
        em.field_m = null;
        ik.field_a = null;
        hj.field_l = null;
        kb.field_S = false;
    }

    final static void a(int param0, int param1) {
        sg.field_d = 3 & param1 >> 4;
        ii.field_Q = (param1 & 13) >> 2;
        if (!(sg.field_d <= 2)) {
          sg.field_d = 2;
        }
        v.field_d = 3 & param1;
        if (2 >= ii.field_Q) {
          if (!(v.field_d <= param0)) {
            v.field_d = 2;
          }
          return;
        }
        ii.field_Q = 2;
        if (!(v.field_d <= param0)) {
          v.field_d = 2;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (param0 == 3) {
          field_g = null;
          field_f = null;
          return;
        }
        mh.a(-32);
        field_g = null;
        field_f = null;
    }

    final void a(boolean param0, int param1) {
        if (param1 == -1730123902) {
          this.field_h = param0 ? true : false;
          this.field_c = true;
          return;
        }
        mh.b(-93);
        this.field_h = param0 ? true : false;
        this.field_c = true;
    }

    final boolean b(byte param0) {
        if (param0 < 94) {
          mh.a(35);
          return this.field_c;
        }
        return this.field_c;
    }

    final boolean c(int param0) {
        if (param0 > -14) {
          this.field_b = (String) null;
          return this.field_h;
        }
        return this.field_h;
    }

    final String a(byte param0) {
        int var2 = 34 % ((param0 + 10) / 60);
        return this.field_b;
    }

    mh(String param0) {
        this.field_h = false;
        this.field_c = false;
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "White's move";
        field_g = "%L";
        field_a = new sa();
    }
}
