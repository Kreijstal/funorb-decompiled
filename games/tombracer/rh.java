/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends nv implements ut {
    static String field_o;
    static String field_q;
    static boolean field_s;
    static int field_n;
    static String field_r;
    private jma field_p;

    public static void l(int param0) {
        field_o = null;
        field_q = null;
        field_r = null;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            ((rh) this).field_p.a(((rh) this).h((byte) 113), (byte) 82, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rh(la param0, boolean param1) {
        super(param0, param1);
        try {
            ((rh) this).field_p = new jma(15);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int g(byte param0) {
        if (param0 != -108) {
            return 85;
        }
        return 16776960;
    }

    final int a(boolean param0) {
        if (param0) {
            field_o = null;
            return 19;
        }
        return 19;
    }

    final static void b(int param0, int param1) {
        kh var2 = null;
        if (param1 > -98) {
          field_r = null;
          var2 = ql.field_k;
          var2.k(4, -2988);
          var2.i(1, 0);
          var2.i(2, 0);
          return;
        } else {
          var2 = ql.field_k;
          var2.k(4, -2988);
          var2.i(1, 0);
          var2.i(2, 0);
          return;
        }
    }

    final void g(int param0) {
        super.g(param0);
        ((rh) this).field_p.a((byte) 48, ((rh) this).h((byte) 106));
    }

    public final int b(int param0) {
        int var2 = 33 / ((-46 - param0) / 45);
        return 0;
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            field_s = true;
            return ((rh) this).field_p.a(122, param0);
        }
        return ((rh) this).field_p.a(122, param0);
    }

    rh(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
            ((rh) this).field_p = new jma(15, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void k(int param0) {
        if (!((rh) this).field_p.f((byte) -56)) {
          ((rh) this).field_p.a((byte) -14, ((rh) this).d(8031));
          if (param0 != 5418) {
            jma discarded$4 = ((rh) this).k((byte) 120);
            return;
          } else {
            return;
          }
        } else {
          ((rh) this).c(false);
          ((rh) this).field_p.a((byte) -14, ((rh) this).d(8031));
          if (param0 == 5418) {
            return;
          } else {
            jma discarded$5 = ((rh) this).k((byte) 120);
            return;
          }
        }
    }

    public final int c(int param0) {
        if (param0 != 17832) {
            field_s = true;
            return 5592320;
        }
        return 5592320;
    }

    public final int j(byte param0) {
        if (param0 != -108) {
            return -60;
        }
        return 0;
    }

    public final jma k(byte param0) {
        if (param0 >= -67) {
            return null;
        }
        return ((rh) this).field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "<%0> has left the lobby.";
        field_q = "Ten-megawatt lasers";
        field_n = 22;
        field_r = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
