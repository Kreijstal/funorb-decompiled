/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends ck {
    byte[] field_r;
    static String field_p;
    static gh field_u;
    int field_x;
    static rj[] field_o;
    static cj field_q;
    static String[] field_t;
    static wk[] field_v;
    static int field_s;
    static gh field_w;

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (!vb.field_e) {
          return;
        }
        if (param3 != 635) {
          return;
        }
        qf.field_c.a((byte) -80, param1);
        var4 = jk.field_i.m(109) ? 1 : 0;
        if (lb.field_gc != 0 &&
          var4 == 0) {
          pm.a((byte) 48);
          param1 = false;
        }
        if (param1) {
          jk.field_i.a((byte) 68, param2, param0);
        }
        if (var4 == 0) {
          var5 = jk.field_i.j(0) + jk.field_i.field_Rb;
          if (var5 > 640) {
            ed.field_i = ed.field_i + 5;
            return;
          }
          if (var5 >= 635) {
            return;
          }
          if (0 >= ed.field_i) {
            return;
          }
          ed.field_i = ed.field_i - 5;
          return;
        }
        qf.field_c.a((byte) -37, param1);
        var5Lifetime1 = jk.field_i.j(0) + jk.field_i.field_Rb;
        if (var5Lifetime1 > 640) {
          ed.field_i = ed.field_i + 5;
          return;
        }
        if (var5Lifetime1 >= 635) {
          return;
        }
        if (0 >= ed.field_i) {
          return;
        }
        ed.field_i = ed.field_i - 5;
        return;
    }

    final static void a(boolean param0) {
        if (an.field_i == null) {
          if (!param0) {
            an.field_i = null;
            la.field_c = null;
            return;
          }
          return;
        }
        if (null == an.field_i.field_c) {
          if (!param0) {
            an.field_i = null;
            la.field_c = null;
            return;
          }
          return;
        }
        an.field_i.field_c.field_G = false;
        if (!param0) {
          an.field_i = null;
          la.field_c = null;
          return;
        }
    }

    public static void b(boolean param0) {
        field_q = null;
        field_u = null;
        field_t = null;
        if (!param0) {
          field_p = null;
          field_w = null;
          field_o = null;
          field_v = null;
          return;
        }
        rh.a(true);
        field_p = null;
        field_w = null;
        field_o = null;
        field_v = null;
    }

    final static void a(int param0, int param1, jm param2) {
        kj var3 = null;
        if (param1 != 0) {
          return;
        }
        try {
          var3 = mm.field_g;
          var3.a(param0, (byte) -117);
          var3.a((byte) 123, param2.field_q);
          var3.d(param2.field_s, 77);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "rh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    rh(byte[] param0) {
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = "Logging in...";
        field_t = new String[]{"KNEEL BEFORE YOUR CONQUEROR!", "Lord Ba'al, help me!", "Lord Ba'al, help us!"};
        field_u = null;
        field_v = new wk[26];
        field_s = 0;
    }
}
