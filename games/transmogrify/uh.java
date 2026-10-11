/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static wk field_r;
    static String field_o;
    bk field_c;
    bk field_h;
    static int field_j;
    bk field_a;
    static int field_q;
    static String field_d;
    static int field_f;
    bk field_n;
    long field_l;
    int field_b;
    oa field_i;
    byte field_m;
    oa field_g;
    volatile int field_k;
    volatile int field_p;
    pj field_e;

    abstract void d(int param0);

    abstract void a(boolean param0, Object param1, int param2);

    final int a(byte param0) {
        int var2 = -4 % ((param0 - 10) / 39);
        return this.field_c.a((byte) 16) + this.field_h.a((byte) 16);
    }

    final int e(int param0) {
        if (param0 == -10236) {
          return this.field_a.a((byte) 16) + this.field_n.a((byte) 16);
        }
        this.c((byte) -50);
        return this.field_a.a((byte) 16) + this.field_n.a((byte) 16);
    }

    public static void c(int param0) {
        if (param0 == -21) {
          field_d = null;
          field_o = null;
          field_r = null;
          return;
        }
        lc var2 = (lc) null;
        uh.a((java.awt.Component) null, 16, -39, (fe) null, (lc) null, true);
        field_d = null;
        field_o = null;
        field_r = null;
    }

    final boolean b(int param0) {
        if (param0 == 6) {
          return this.a((byte) 72) >= 20 ? true : false;
        }
        field_q = -40;
        return this.a((byte) 72) >= 20 ? true : false;
    }

    final static void a(java.awt.Component param0, int param1, int param2, fe param3, lc param4, boolean param5) {
        try {
          aj.a(param0, param1, 22290, param4, param5, param1, param3, 1024);
          if (param2 != -21) {
            field_q = 117;
          }
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "uh.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final pj a(int param0, boolean param1, boolean param2, byte param3, int param4) {
        pj stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        long var6;
        pj var8;
        lc var9;
        var6 = (long)param4 + ((long)param0 << 32);
        var8 = new pj();
        var8.field_z = param3;
        stackIn_2_0 = var8;
        stackIn_3_1 = (!param2) ? false : true;
        stackIn_2_0.field_p = stackIn_3_1;
        if (!param1) {
          var8.field_j = var6;
          if (param2) {
            if (this.a((byte) -110) >= 20) {
              throw new RuntimeException();
            }
            this.field_c.a((byte) -128, var8);
            return var8;
          }
          if (this.e(-10236) >= 20) {
            throw new RuntimeException();
          }
          this.field_a.a((byte) -128, var8);
          return var8;
        }
        var9 = (lc) null;
        uh.a((java.awt.Component) null, -79, 112, (fe) null, (lc) null, false);
        var8.field_j = var6;
        if (param2) {
          if (this.a((byte) -110) >= 20) {
            throw new RuntimeException();
          }
          this.field_c.a((byte) -128, var8);
          return var8;
        }
        if (this.e(-10236) >= 20) {
          throw new RuntimeException();
        }
        this.field_a.a((byte) -128, var8);
        return var8;
    }

    final boolean b(byte param0) {
        if (param0 < 68) {
          return true;
        }
        return this.e(-10236) >= 20 ? true : false;
    }

    abstract void a(int param0);

    abstract boolean c(byte param0);

    uh() {
        this.field_c = new bk();
        this.field_h = new bk();
        this.field_a = new bk();
        this.field_n = new bk();
        this.field_i = new oa(6);
        this.field_m = (byte) 0;
        this.field_p = 0;
        this.field_k = 0;
        this.field_g = new oa(10);
    }

    static {
        field_o = "Please send me news and updates (I can unsubscribe at any time)";
        field_r = new wk();
        field_d = "You have <%0> unread messages!";
    }
}
