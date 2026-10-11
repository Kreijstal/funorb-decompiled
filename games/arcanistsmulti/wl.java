/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mg {
    static String field_I;
    static int[][] field_L;
    static String field_M;
    private rn field_J;
    private rn field_T;
    static so field_S;
    private boolean field_G;
    private rn field_Q;
    static String field_R;
    static String field_N;
    static ll[] field_U;
    static long field_O;
    static String field_H;
    static int field_K;
    static String field_P;

    final static jg a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        ab var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ab var8 = null;
        tk var9 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        var8 = df.field_z;
        var2 = var8;
        var3 = var8.e((byte) 122);
        stackIn_3_0 = ((128 & var3) != 0);
        sc.field_V = stackIn_3_0;
        sl.field_W = var3 & 127;
        db.field_e = var8.e((byte) 44);
        vi.field_P = var8.c(-943038560);
        if (sl.field_W != 2) {
          ma.field_M = 0;
          i.field_f = 0;
        } else {
          i.field_f = var8.n(-98);
          ma.field_M = var8.h(11609);
        }
        stackIn_9_0 = (var8.e((byte) -105) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        vf.field_j = var8.l(-1);
        if (var4 == 0) {
          ff.field_a = vf.field_j;
        } else {
          ff.field_a = var8.l(-1);
        }
        if (sl.field_W == 1) {
          mc.field_c = var8.n(-98);
          field_N = var8.l(-1);
        } else {
          if (sl.field_W == 4) {
            mc.field_c = var8.n(-98);
            field_N = var8.l(-1);
          } else {
            field_N = null;
            mc.field_c = 0;
          }
        }
        if (param1 < 36) {
          return (jg) null;
        }
        if (!param0) {
          fe.field_p = rm.a(var8, 80, -79);
          ga.field_s = null;
          return new jg(param0);
        }
        var5 = var8.n(-98);
        try {
          var9 = th.field_d.a(var5, (byte) -119);
          fe.field_p = var9.c(true);
          if (ff.field_a.equals(ah.field_b)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_u;
          }
          ga.field_s = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          jh.a((Throwable) ((Object) var6), "CC1", (byte) 20);
          fe.field_p = null;
          ga.field_s = null;
          return new jg(param0);
        }
        return new jg(param0);
    }

    final String b(boolean param0) {
        String var2 = this.field_Q.b(param0);
        if (param0) {
          this.b(false);
          if (var2 != null) {
            return var2;
          }
          if (this.field_w) {
            return this.field_q != null ? this.field_q : this.field_g;
          }
          return null;
        }
        if (var2 != null) {
          return var2;
        }
        if (this.field_w) {
          return this.field_q != null ? this.field_q : this.field_g;
        }
        return null;
    }

    final void a(bl param0, byte param1) {
        try {
          super.a(param0, (byte) 116);
          this.field_T.field_o = (wc) ((Object) param0);
          this.field_Q.field_o = (wc) ((Object) param0);
          int var3_int = -113 / ((63 - param1) / 47);
          this.field_J.field_o = (wc) ((Object) param0);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -52) {
          field_N = (String) null;
          super.a((byte) -57, param1, param2, param3);
          if (param2 != 0) {
            return;
          }
          param1 = param1 + this.field_n;
          param3 = param3 + this.field_j;
          this.a(param3, ne.field_f, this.field_T, -5187, param1);
          this.a(param3, ud.field_y, this.field_Q, -5187, param1);
          this.a(param3, rc.field_g, this.field_J, -5187, param1);
          return;
        }
        super.a((byte) -57, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        param1 = param1 + this.field_n;
        param3 = param3 + this.field_j;
        this.a(param3, ne.field_f, this.field_T, -5187, param1);
        this.a(param3, ud.field_y, this.field_Q, -5187, param1);
        this.a(param3, rc.field_g, this.field_J, -5187, param1);
    }

    public static void k(int param0) {
        if (param0 == 0) {
          field_P = null;
          field_N = null;
          field_H = null;
          field_S = null;
          field_M = null;
          field_L = (int[][]) null;
          field_U = null;
          field_R = null;
          field_I = null;
          return;
        }
        wl.a(false, 47);
        field_P = null;
        field_N = null;
        field_H = null;
        field_S = null;
        field_M = null;
        field_L = (int[][]) null;
        field_U = null;
        field_R = null;
        field_I = null;
    }

    final static void f(boolean param0) {
        pn.a(-47);
        if (!param0) {
          wl.a(false, -104);
        }
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 < 18) {
            field_O = 112L;
          }
          stackIn_3_0 = Integer.parseInt(this.field_T.field_g);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    private final void a(int param0, String param1, qm param2, int param3, int param4) {
        if (param3 != -5187) {
          return;
        }
        try {
          vc.field_e.b(param1, (param2.field_v >> 1) + (param4 + param2.field_n), -5 + (param2.field_j + param0), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wl.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, -67);
        if (param4 > -49) {
          return;
        }
        int var6 = -130 + param2 >> 1;
        if (this.field_G) {
          this.field_Q.a(param0, 0, 25, var6, -74);
          this.field_T.a(param0, 0, 25, 45 + var6, -124);
          this.field_J.a(param0, 0, 40, 90 + var6, -72);
          return;
        }
        this.field_T.a(param0, 0, 25, var6, -80);
        this.field_Q.a(param0, 0, 25, 45 + var6, -50);
        this.field_J.a(param0, 0, 40, 90 + var6, -72);
    }

    final boolean j(int param0) {
        if (null == this.field_T.field_g) {
          return true;
        }
        if (0 == this.field_T.field_g.length()) {
          return true;
        }
        if (null == this.field_Q.field_g) {
          return true;
        }
        if (this.field_Q.field_g.length() == 0) {
          return true;
        }
        if (null == this.field_J.field_g) {
          return true;
        }
        if (this.field_J.field_g.length() == 0) {
          return true;
        }
        if (param0 == -28612) {
          return false;
        }
        field_I = (String) null;
        return false;
    }

    final int e(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          wl.k(94);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_J.field_g);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final int g(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 <= 59) {
          field_M = (String) null;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_Q.field_g) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    wl(pf param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param5, param3, param4, param2, -58);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private wl(pf param0, boolean param1) {
        super(0, 0, 0, 0, (pf) null);
        try {
          this.field_T = (rn) ((Object) new bi("", (wc) null, 2));
          this.field_Q = (rn) ((Object) new bi("", (wc) null, 2));
          this.field_J = (rn) ((Object) new bi("", (wc) null, 4));
          this.field_G = param1 ? true : false;
          this.field_J.field_r = param0;
          this.field_Q.field_r = param0;
          this.field_T.field_r = param0;
          if (!this.field_G) {
            this.c(-107, this.field_T);
            this.c(-121, this.field_Q);
          } else {
            this.c(-104, this.field_Q);
            this.c(-110, this.field_T);
          }
          this.c(-103, this.field_J);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_M = "Remove name";
        field_L = new int[17][];
        field_R = "Error connecting to server. Please try using a different server.";
        field_I = "The '<%0>' setting needs to be changed.";
        field_S = new so(1);
        field_H = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_K = 64;
        field_P = "You must be a member to play with the current options.";
    }
}
