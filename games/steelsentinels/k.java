/*
 * Decompiled by CFR-JS 0.4.0.
 */
class k extends gd implements ae {
    private mi field_Bb;
    private boolean field_Jb;
    private boolean field_Db;
    private boolean field_Ab;
    static qb[] field_Cb;
    static String field_zb;
    static String[] field_Ib;
    private boolean field_Mb;
    private bk field_Hb;
    static int field_Gb;
    static String field_Fb;
    static int field_Lb;
    static String field_Kb;
    static String field_Eb;

    final void m(byte param0) {
        bm var2 = null;
        bm var2Lifetime1;
        this.field_Hb.b(4210752, 2121792, 16711422);
        if (param0 > 90) {
          var2 = new bm(this, this.field_Bb, rg.field_a);
          var2.a(15, fb.field_q, 120);
          this.c(var2, -22908735);
          return;
        }
        this.field_Bb = (mi) null;
        var2Lifetime1 = new bm(this, this.field_Bb, rg.field_a);
        var2Lifetime1.a(15, fb.field_q, 120);
        this.c(var2Lifetime1, -22908735);
    }

    final void m(int param0) {
        if (param0 <= 90) {
          return;
        }
        if (!this.field_Q) {
          return;
        }
        this.field_Q = false;
        if (this.field_Jb) {
          il.d(0);
        } else {
          if (this.field_Mb) {
            jf.n(0);
            return;
          }
          return;
        }
    }

    final static void a(byte param0, String param1) {
        try {
          oa.a(param1, (byte) -107);
          bf.a((byte) -83, false, rh.field_p);
          if (param0 < 108) {
            field_Cb = (qb[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "k.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, byte param1, int param2) {
        boolean stackIn_6_1 = false;
        bm stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        bm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        bm var6 = null;
        var5 = SteelSentinels.field_G;
        try {
          if (this.field_Ab) {
            return;
          }
          this.field_Ab = true;
          stackIn_6_1 = (256 == param2);
          this.field_Db = stackIn_6_1;
          if (param1 >= -36) {
            return;
          }
          this.field_Hb.b(4210752, 8405024, 16711422);
          var6 = new bm(this, this.field_Bb, param0);
          var4 = var6;
          if (5 != param2) {
            if (param2 != 256) {
              stackIn_14_0 = var6;
              stackIn_14_1 = -1;
              if (!this.field_Jb) {
                stackIn_15_2 = le.field_J;
              } else {
                stackIn_15_2 = sl.field_c;
              }
              ((bm) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_15_2, 88);
            } else {
              var6.a(-122, (tn) (this), sl.field_c);
            }
          } else {
            var6.a(11, cl.field_c, 94);
            var6.a(17, qe.field_b, 118);
          }
          if (param2 == 3) {
            var6.a(7, vg.field_d, 125);
          } else {
            if (param2 == 4) {
              var6.a(8, bk.field_X, 69);
            } else {
              if (param2 == 6) {
                var6.a(9, rn.field_s, 102);
              } else {
                if (param2 != 9) {
                  this.c(var6, -22908735);
                  return;
                }
                var6.a(-111, (tn) (this), pm.field_Y);
              }
            }
          }
          this.c(var6, -22908735);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("k.K(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    k(ka param0, mi param1, String param2, boolean param3, boolean param4) {
        super(param0, new bm((k) null, param1, param2), 77, 10, 10);
        try {
          this.field_Bb = param1;
          this.field_Mb = param4 ? true : false;
          this.field_Db = false;
          this.field_Jb = param3 ? true : false;
          this.field_Ab = false;
          this.field_Hb = new bk(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_Hb.field_N = true;
          this.a(this.field_Hb, -121);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        hh.field_j = (param1 << 16) / 150;
        hh.field_i = 100 * param1 / 150;
        hh.field_f = 400 * param1 / 150;
        if (param0 != 24) {
          field_Fb = (String) null;
          return;
        }
    }

    public void a(int param0, byte param1, int param2, oa param3, int param4) {
        try {
          if (this.field_Db) {
            hc.a(3, 0);
            this.m(106);
          } else {
            rj.a("tochangedisplayname.ws", wl.d((byte) -21), (byte) -47);
          }
          int var6_int = 31 / ((param1 + 85) / 36);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "k.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void n(byte param0) {
        field_Kb = null;
        field_Fb = null;
        field_Cb = null;
        int var1 = -88 / ((39 - param0) / 56);
        field_Eb = null;
        field_zb = null;
        field_Ib = null;
    }

    final boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (13 == param1) {
            this.m(120);
            return true;
          }
          if (param0 == 30373) {
            stackIn_7_0 = super.a(param0 ^ 0, param1, param2, param3);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("k.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int[] param1, int param2, int param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = SteelSentinels.field_G;
        try {
          if (!param0) {
            field_Gb = -108;
          }
          param2--;
          while (param2 >= 0) {
            var9 = param1;
            var5 = var9;
            var6 = param3;
            var7 = param4;
            var9[var6] = ec.a(var9[var6] >> 1, 8355711) + var7;
            param3++;
            param2--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("k.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_Ib = new String[]{"NAME", "CHASSIS", "WAVE", "SCORE"};
        field_zb = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Cb = new qb[10000];
        for (var0 = 0; 10000 > var0; var0++) {
          field_Cb[var0] = new qb();
        }
        field_Fb = "Friends can be added in the multiplayer<nbsp>lobby";
        field_Kb = "All players have left <%0>'s game.";
        field_Eb = "Research into <col=00ffff>plasma weapons</col> is needed before the <%0> can be engineered.";
        field_Gb = 0;
    }
}
