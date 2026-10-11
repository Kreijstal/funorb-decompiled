/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends li {
    static String field_w;
    static String field_r;
    private int[] field_q;
    static String field_v;
    static String field_y;
    private int[] field_n;
    int field_z;
    private int[] field_o;
    static r field_s;
    private boolean[] field_t;
    static String field_x;
    private boolean[][] field_p;
    private int[][] field_u;

    public static void e(int param0) {
        field_v = null;
        if (param0 < 75) {
          return;
        }
        field_x = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_w = null;
    }

    final static cr f(int param0) {
        int var1 = 87 % ((param0 + 53) / 59);
        return h.field_D.field_Mb;
    }

    final boolean a(boolean[] param0, int[] param1, int param2) {
        int dupTemp$0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = 1;
          if (param2 != 32) {
            return true;
          }
          for (var5 = 0; this.field_n.length > var5; var5++) {
            if (10 > this.field_n[var5]) {
              var4_int = 0;
            }
          }
          if (var4_int != 0) {
            return true;
          }
          for (var5Lifetime1 = 0; param1.length > var5Lifetime1; var5Lifetime1++) {
            dupTemp$0 = this.field_n[var5Lifetime1];
            this.field_n[var5Lifetime1] = dupTemp$0 + 1;
            var6 = dupTemp$0;
            param1[var5Lifetime1] = br.b(this.field_u[var5Lifetime1][var6], (byte) 48);
            param0[var5Lifetime1] = this.field_p[var5Lifetime1][var6];
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("pp.F(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 76) {
          this.field_z = -29;
          return this.field_o[param1];
        }
        return this.field_o[param1];
    }

    final static cr a(byte param0) {
        if (param0 != 116) {
          return (cr) null;
        }
        return ja.field_f.field_Nb;
    }

    final boolean b(boolean param0, int param1) {
        if (param0) {
          pp.a((byte) 19);
          return this.field_t[param1];
        }
        return this.field_t[param1];
    }

    final int b(int param0, int param1) {
        if (param1 > -58) {
          return -97;
        }
        return this.field_q[param0];
    }

    final static cr a(int param0) {
        if (param0 != 12) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          pp.a((java.applet.Applet) null, 100);
          return hi.b(117);
        }
        return hi.b(117);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        er var8 = new er(param3, param6);
        int[] var9 = bi.field_l;
        int var10 = bi.field_e;
        int var11 = bi.field_j;
        var8.d();
        int var12 = -9 % ((11 - param1) / 38);
        bi.a(0, 0, param3, param6, 12, param0, param7);
        bi.a(var9, var10, var11);
        var8.f(param4, param2);
        var8.d(param4, param2, param5);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Vertigo2.field_L ? 1 : 0;
          try {
            if (tb.field_b) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (je.a(param0, false, "getcookies"));
              var4 = jr.a((byte) -9, ';', var3);
              for (var5 = param1; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("pp.K(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, int param1, mi param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          param2.p(0);
          if (param0 != -8) {
            return;
          }
          for (var4_int = 0; this.field_u.length > var4_int; var4_int++) {
            for (var5 = 0; var5 < 10; var5++) {
              stackIn_9_0 = this.field_p[var4_int];
              stackIn_9_1 = var5;
              stackIn_10_2 = (1 == param2.c((byte) -120, 1));
              stackIn_9_0[stackIn_9_1] = stackIn_10_2;
              if (!this.field_p[var4_int][var5]) {
                this.field_u[var4_int][var5] = param2.c((byte) -104, 6);
              }
            }
          }
          this.field_z = param2.c((byte) -122, 32);
          if (0 <= param1) {
            if (param2.c((byte) -101, 1) == 1) {
              this.field_t[param1] = true;
              this.field_q[param1] = param2.c((byte) -108, 8);
            }
            this.field_o[param1] = param2.c((byte) -110, 4);
            param2.b((byte) -90);
          } else {
            param2.b((byte) -90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("pp.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (up.field_z != null) {
          var3 = up.field_z.b(13721, param1);
          if (var3 != -2) {
            if (-1 != var3) {
              var4 = up.field_z.k(22719) ? 1 : 0;
              qg.a(param2, var3, 0, var4 != 0, up.field_z.l(4), up.field_z.field_Kb);
            }
            up.field_z = null;
            ql.i(30);
          }
        }
        if (param0 <= -46) {
          return;
        }
        pp.f(63);
    }

    pp(int param0) {
        this.field_n = new int[param0];
        this.field_u = new int[param0][10];
        this.field_q = new int[param0];
        this.field_t = new boolean[param0];
        this.field_o = new int[param0];
        this.field_p = new boolean[param0][10];
    }

    static {
        field_r = "Don't mind";
        field_w = "Move left:<br>Move right:<br>Move back:<br>Move forward:<br>Jump:<br><br>Lay dynamite:<br>Use jetpack:<br><br>Pause/Options:<br>Rotate camera left:<br>Rotate camera right:<br>Raise camera up:<br>Time attack quick restart:";
        field_v = "Invite <%0> to this game";
        field_x = "Scamming";
        field_y = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
