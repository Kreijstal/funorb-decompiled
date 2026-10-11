/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qe extends mi implements bo {
    private wa field_g;
    static String field_j;
    static boolean field_k;
    static int[] field_h;
    static int[] field_i;
    static int field_m;
    static String field_l;

    public static void b(byte param0) {
        field_i = null;
        field_l = null;
        if (param0 == -36) {
          field_h = null;
          field_j = null;
          return;
        }
        qe.b((byte) 64);
        field_h = null;
        field_j = null;
    }

    qe(wa param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "qe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1) {
        pe var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        pe var2Lifetime1;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          ag.field_c = param1;
          if (param0 < 34) {
            field_i = (int[]) null;
          }
          var2 = (pe) (co.field_a.a((byte) -105));
          while (var2 != null) {
            if (var2.field_h.b(false)) {
              var2.field_g.f(ag.field_c * var2.field_i + 128 >> 8);
            } else {
              var2.a(false);
            }
            var2 = (pe) (co.field_a.a(16213));
          }
          if (null != gk.field_f) {
            var2Lifetime1 = (pe) (gk.field_f.a((byte) -124));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_h.b(false);
              if (!stackIn_14_0) {
                var2Lifetime1.a(false);
              } else {
                var2Lifetime1.field_g.f(128 + var2Lifetime1.field_i * ag.field_c >> 8);
              }
              var2Lifetime1 = (pe) (gk.field_f.a(16213));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2_ref), "qe.K(" + param0 + ',' + param1 + ')');
        }
    }

    abstract String a(int param0, String param1);

    public final void a(boolean param0, wa param1) {
        try {
          if (param0) {
            this.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "qe.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wl f(int param0) {
        if (param0 != -843083384) {
          return (wl) null;
        }
        return this.a(this.field_g.field_n, true);
    }

    final static int g(int param0) {
        if (dj.field_n < 2) {
          return 0;
        }
        if (param0 != 11108) {
          return -58;
        }
        if (ih.field_c == 0) {
          if (!td.field_a.c(0)) {
            return 20;
          }
          if (!td.field_a.a((byte) -102, "commonui")) {
            return 40;
          }
          if (!jf.field_j.c(param0 ^ 11108)) {
            return 50;
          }
          if (!jf.field_j.a((byte) -102, "commonui")) {
            return 60;
          }
          if (!qn.field_I.c(param0 - 11108)) {
            return 70;
          }
          if (qn.field_I.b(25867)) {
            return 100;
          }
          return 80;
        }
        if (sj.field_l == null) {
          if (!td.field_a.c(0)) {
            return 43;
          }
          if (!td.field_a.a((byte) -102, "commonui")) {
            return 57;
          }
          if (!jf.field_j.c(0)) {
            return 71;
          }
          if (!jf.field_j.a((byte) -102, "commonui")) {
            return 80;
          }
          if (!qn.field_I.c(0)) {
            return 82;
          }
          if (!qn.field_I.b(25867)) {
            return 86;
          }
          return 100;
        }
        if (!sj.field_l.c(param0 ^ 11108)) {
          return 14;
        }
        if (!sj.field_l.a("", true)) {
          return 29;
        }
        if (!sj.field_l.a((byte) -102, "")) {
          return 29;
        }
        if (!td.field_a.c(0)) {
          return 43;
        }
        if (!td.field_a.a((byte) -102, "commonui")) {
          return 57;
        }
        if (!jf.field_j.c(0)) {
          return 71;
        }
        if (!jf.field_j.a((byte) -102, "commonui")) {
          return 80;
        }
        if (!qn.field_I.c(0)) {
          return 82;
        }
        if (qn.field_I.b(25867)) {
          return 100;
        }
        return 86;
    }

    public final void a(wa param0, int param1) {
        if (param1 != 13) {
          return;
        }
        try {
          this.b(false);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "qe.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String c(int param0) {
        if (param0 >= -86) {
          return (String) null;
        }
        return this.a(-26358, this.field_g.field_n);
    }

    final static int b(int param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        if (param0 == -728240159) {
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
        field_m = -87;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return ~var2 & param1;
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          String var3 = (String) null;
          this.a((String) null, false);
          if (null != this.field_g.field_n) {
            return 0 == this.field_g.field_n.length() ? true : false;
          }
          return true;
        }
        if (null == this.field_g.field_n) {
          return true;
        }
        if (0 != this.field_g.field_n.length()) {
          return false;
        }
        return true;
    }

    abstract wl a(String param0, boolean param1);

    static {
        field_j = "Rating";
        field_l = "Please log in to access this feature.";
        field_h = new int[4];
        field_i = new int[8192];
    }
}
