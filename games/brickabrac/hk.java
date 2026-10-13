/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ib implements hf, en {
    static String field_L;
    static RgbSprite field_Q;
    private String field_N;
    static boolean field_R;
    private d field_M;
    private d field_O;
    private boolean field_V;
    private boolean field_K;
    private d field_U;
    static RgbSprite field_I;
    private vb field_P;
    static int field_W;
    static String field_J;
    private boolean field_S;
    private vb field_T;

    final static void a(byte param0) {
        if (MatchResultScreen.field_t != -rn.field_i + 0 &&
          -rn.field_i + 250 != MatchResultScreen.field_t) {
        }
        MatchResultScreen.field_t = MatchResultScreen.field_t + 1;
        int var1 = -127 / ((29 - param0) / 32);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (this.field_N != null) {
          a.field_u.a(this.field_N, this.field_o + (param1 + 20), param0 - (-this.field_w - 15), -40 + this.field_t, this.field_s, 16777215, -1, 1, 0, a.field_u.ascent);
        }
        if (null != this.field_O) {
          Rasterizer2D.drawHorizontalLine(param1 + 10, param0 + 134, this.field_t - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_7_0 = this.b(param2, (byte) -78);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param2, (byte) -122);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("hk.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(TextFont param0, byte param1, ResourceArchive param2) {
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        TextFont var10 = null;
        int[] var14 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = cd.field_e;
          wd.field_w = new mh(0L, (mh) null);
          if (param2 == null) {
            rk.a("QC1", (Throwable) null, param1 ^ 118);
            return;
          }
          param2.decodedFilePolicy = 0;
          param2.discardPackedGroups = false;
          pj.field_c = new so(var3_int, param2, param2);
          nh.field_c = new rg(var3_int, param2, param2, new rm());
          var4 = gj.b(0);
          if (var4 == null) {
            rk.a("QC2", (Throwable) null, param1 - 14);
            return;
          }
          hb.a(var4, false);
          var10 = (TextFont) null;
          ArchiveIndex.field_j = ug.a(1513239, 1127256, (byte) 123, 65793, 4020342, 5138823, 65793, 1513239, (TextFont) null, 0, 65793, 2245737, 8947848);
          nb.field_e = ug.a(0, 0, (byte) 122, 0, 0, 0, 0, 0, param0, 16764006, 0, 0, 0);
          cp.field_K = ug.a(0, 0, (byte) 113, 0, 0, 0, 0, 0, param0, 16777215, 0, 0, 0);
          var5 = Rasterizer2D.width;
          var6 = Rasterizer2D.height;
          var14 = Rasterizer2D.pixels;
          uf.field_e = new RgbSprite(10, 14);
          uf.field_e.bindRasterTarget();
          for (var8 = 2; 7 > var8; var8++) {
            Rasterizer2D.drawVerticalLine(var8, var8 + 1, 14 - (var8 << 1), 16777215);
          }
          if (param1 != 90) {
            hk.i((byte) 86);
          }
          Rasterizer2D.bind(var14, var5, var6);
          fe.field_kb = e.a(nb.field_e, ArchiveIndex.field_j, var4, 4, cp.field_K);
          wd.field_w.field_bb = new NodeDeque();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("hk.F(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final void a(vb param0, int param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_P == param0) {
            this.field_T.a(true, (oc) (this));
          }
          if (param0 == this.field_T) {
            this.a(25);
          }
          if (param1 != -40) {
            this.a(-38, -29, -91, (byte) 20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hk.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String j(byte param0) {
        if (param0 != -76) {
          String var3 = (String) null;
          this.a(113, (String) null);
        }
        if (null != this.field_P.field_A) {
          return this.field_P.field_A;
        }
        return "";
    }

    final void a(int param0, String param1) {
        vb var3 = null;
        String var4 = null;
        try {
          var3 = this.field_P;
          var4 = param1;
          if (param0 < 53) {
            this.h(-119);
          }
          var3.a(var4, -12592, false);
          this.field_T.c(false);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeMenuScreens(byte obfuscationGuard, ResourceArchive archive) {
        try {
          pg.menuScreens = new MenuScreen[22];
          GameCanvas.registerMenuScreen(-74, new MainMenuScreen());
          GameCanvas.registerMenuScreen(-68, cf.createPauseMenu(1, -2635));
          GameCanvas.registerMenuScreen(-90, cf.createPauseMenu(2, -2635));
          GameCanvas.registerMenuScreen(-111, cf.createPauseMenu(3, -2635));
          GameCanvas.registerMenuScreen(-109, cf.createPauseMenu(4, -2635));
          GameCanvas.registerMenuScreen(-93, new HighscoresScreen());
          GameCanvas.registerMenuScreen(-114, new RankingsScreen());
          GameCanvas.registerMenuScreen(-114, new InstructionsScreen());
          GameCanvas.registerMenuScreen(-104, new AchievementsScreen());
          GameCanvas.registerMenuScreen(-66, new NewAchievementsScreen());
          GameCanvas.registerMenuScreen(-55, new SaveResultsPromptScreen());
          GameCanvas.registerMenuScreen(-75, new MessageScreen());
          GameCanvas.registerMenuScreen(-63, new MembershipBenefitsScreen(archive));
          GameCanvas.registerMenuScreen(-60, new LevelSelectScreen(13, 0));
          GameCanvas.registerMenuScreen(-105, new OptionsScreen());
          GameCanvas.registerMenuScreen(-69, new LevelSelectScreen(15, 1));
          GameCanvas.registerMenuScreen(-71, new LevelPackSelectScreen());
          GameCanvas.registerMenuScreen(-54, cf.createPauseMenu(17, -2635));
          GameCanvas.registerMenuScreen(-70, new LevelCompleteScreen());
          GameCanvas.registerMenuScreen(-63, new MultiplayerExitScreen());
          GameCanvas.registerMenuScreen(-91, new MatchCompleteScreen());
          int var2_int = -5 / ((obfuscationGuard - 70) / 42);
          GameCanvas.registerMenuScreen(-73, new TimedSplashScreen());
          IntrusiveHashTable.field_k = rd.a(0, (byte) 19);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "hk.E(" + obfuscationGuard + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vb param0, byte param1) {
        try {
          if (param1 >= -39) {
            this.h(68);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "hk.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        kd.field_c = tf.field_f[param0];
        int var2 = -14 % ((param1 + 33) / 34);
        wn.field_a = ua.field_b[param0];
        d.field_C = he.field_L[param0];
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param2 > -22) {
            this.field_O = (d) null;
          }
          if (this.field_U != param4) {
            if (this.field_O != param4) {
              if (param4 == this.field_M) {
                if (!this.field_K) {
                  if (this.field_S) {
                    ln.a(-107);
                  } else {
                    hb.g(29);
                  }
                } else {
                  dg.a(true);
                }
              }
            } else {
              fr.d(-1);
            }
          } else {
            this.a(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("hk.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 >= 4) {
          var1 = nn.field_g.measureText(ag.buttonLabels[20]);
          var2 = nn.field_g.measureText(ag.buttonLabels[21]);
          dg.field_d = (var2 >= var1 ? var2 : var1) + 4;
          og.field_Zb = og.field_Zb + (dg.field_d + 120);
          return;
        }
    }

    hk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (ub) null);
        ma dupTemp$0 = null;
        ma dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        d stackIn_18_1 = null;
        d stackIn_18_2 = null;
        d stackIn_19_1 = null;
        d stackIn_19_2 = null;
        String stackIn_19_3 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        hi var6 = null;
        RuntimeException var6_ref = null;
        TextFont var7 = null;
        String var8 = null;
        me var9 = null;
        ma var12 = null;
        ma var13 = null;
        try {
          stackIn_4_1 = (param4);
          this.field_S = stackIn_4_1;
          stackIn_7_1 = (param3);
          this.field_V = stackIn_7_1;
          stackIn_10_1 = (param2);
          this.field_K = stackIn_10_1;
          this.field_N = param1;
          if (this.field_K && (this.field_V ||
            this.field_S)) {
            throw new IllegalStateException();
          }
          this.field_P = (vb) ((Object) new sf(param0, (uh) (this), 100));
          this.field_T = (vb) ((Object) new sf("", (uh) (this), 20));
          if (!this.field_K) {
            this.field_U = new d(ok.field_a, (uh) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_S) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = dp.field_s;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = nd.field_d;
            }
            this.field_M = new d(stackIn_19_3, (uh) null);
            if (this.field_V) {
              this.field_O = new d(bd.field_a, (uh) (this));
            }
          } else {
            this.field_U = new d(oa.field_Tb, (uh) null);
            this.field_M = new d(wc.field_a, (uh) null);
            this.field_P.field_J = false;
          }
          this.field_P.field_l = (ub) ((Object) new r(10000536));
          this.field_T.field_l = (ub) ((Object) new ob(10000536));
          var6 = new hi();
          this.field_U.field_l = (ub) ((Object) var6);
          if (null != this.field_M) {
            this.field_M.field_l = (ub) ((Object) var6);
          }
          if (this.field_O != null) {
            this.field_O.field_l = (ub) ((Object) var6);
          }
          this.field_P.field_z = sf.field_X;
          if (this.field_O != null) {
            this.field_O.field_z = ie.field_q;
          }
          if (this.field_K) {
            this.field_M.field_z = pn.field_o;
          } else {
            if (this.field_S) {
              this.field_M.field_z = wp.field_i;
              this.field_M.field_l = (ub) ((Object) new bb());
            } else {
              this.field_M.field_l = (ub) ((Object) new bb());
            }
          }
          this.field_w = 15;
          var7 = a.field_u;
          if (this.field_N != null) {
            this.field_w = this.field_w + (5 + var7.measureWrappedHeight(this.field_N, -40 + this.field_t, var7.ascent));
          }
          var8 = p.field_p;
          var9 = qi.a(uc.e((byte) -115), -28432);
          if (uc.field_k == var9) {
            var8 = sq.field_a;
          } else {
            if (ll.field_d == var9) {
              var8 = IndexedSpriteGeometry.field_c;
            }
          }
          dupTemp$0 = new ma(10, this.field_w, this.field_t - 20, 25, this.field_P, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.a(dupTemp$0, true);
          this.field_w = this.field_w + (5 + ((oc) ((Object) var12)).field_s);
          dupTemp$1 = new ma(10, this.field_w, this.field_t - 20, 25, this.field_T, false, 80, 3, var7, 16777215, wc.field_c);
          var13 = dupTemp$1;
          this.a(dupTemp$1, true);
          this.field_U.field_i = (uh) (this);
          this.field_w = this.field_w + (5 + ((oc) ((Object) var13)).field_s);
          if (null != this.field_O) {
            this.field_O.field_i = (uh) (this);
          }
          if (this.field_M != null) {
            this.field_M.field_i = (uh) (this);
          }
          if (null == this.field_O) {
            this.field_U.a(30, 8, this.field_w, (byte) -119, this.field_t - 16);
            this.field_w = this.field_w + 35;
          } else {
            this.field_U.a(30, 85, this.field_w, (byte) -119, -95 + this.field_t);
            this.field_w = this.field_w + 60;
          }
          if (null != this.field_O) {
            this.field_O.a(30, 8, this.field_w, (byte) -119, -6 + this.field_t - 10);
            this.field_w = this.field_w + 35;
          }
          if (null != this.field_M) {
            if (!this.field_K &&
              !this.field_S) {
              this.field_M.a(20, 8, this.field_w, (byte) -119, 40);
              this.field_w = this.field_w + 25;
            } else {
              this.field_M.a(30, 8, this.field_w, (byte) -119, -10 + (this.field_t - 6));
              this.field_w = this.field_w + 35;
            }
          }
          this.a(this.field_w + 3, 0, 0, (byte) -119, this.field_t);
          this.a(this.field_U, true);
          if (null != this.field_O) {
            this.a(this.field_O, true);
          }
          if (this.field_M != null) {
            this.a(this.field_M, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_59_0 = var6_ref;
          stackIn_59_1 = new StringBuilder().append("hk.<init>(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',');
          if (param1 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_J = null;
        if (param0 != 88) {
          return;
        }
        field_I = null;
        field_Q = null;
        field_L = null;
    }

    private final void a(int param0) {
        if (fr.a((byte) 114) ||
          !(this.field_P.field_A.length() <= 0) &&
          !(0 >= this.field_T.field_A.length())) {
          HighscoresScreen.a(this.field_P.field_A, 11455, this.field_T.field_A);
        }
        if (param0 != 25) {
          this.field_O = (d) null;
        }
    }

    final void h(int param0) {
        if (param0 >= -101) {
          d var3 = (d) null;
          this.a(64, -27, (byte) 58, 71, (d) null);
        }
        this.field_P.c(false);
        this.field_T.c(false);
    }

    static {
        field_L = "Options";
        field_J = "Add friend";
        field_W = 0;
    }
}
