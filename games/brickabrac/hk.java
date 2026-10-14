/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends WidgetGroup implements hf, WidgetActionListener {
    static String field_L;
    static RgbSprite waterMidSprite;
    private String field_N;
    static boolean field_R;
    private FocusableWidget field_M;
    private FocusableWidget field_O;
    private boolean field_V;
    private boolean field_K;
    private FocusableWidget field_U;
    static RgbSprite arcticFarSprite;
    private vb field_P;
    static int field_W;
    static String field_J;
    private boolean field_S;
    private vb field_T;

    final static void a(byte param0) {
        if (MatchResultScreen.field_t != -BoundedFile.field_i + 0 &&
          -BoundedFile.field_i + 250 != MatchResultScreen.field_t) {
        }
        MatchResultScreen.field_t = MatchResultScreen.field_t + 1;
        int var1 = -127 / ((29 - param0) / 32);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        if (this.field_N != null) {
          ArchiveNetworkClient.field_u.a(this.field_N, this.x + (parentX + 20), parentY - (-this.y - 15), -40 + this.width, this.height, 16777215, -1, 1, 0, ArchiveNetworkClient.field_u.ascent);
        }
        if (null != this.field_O) {
          Rasterizer2D.drawHorizontalLine(parentX + 10, parentY + 134, this.width - 20, 4210752);
        }
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
    }

    final boolean a(int param0, byte param1, Widget param2, char param3) {
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
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
          QuickChatPhraseDefinition.quickChatMenuRoot = new UiComponent(0L, (UiComponent) null);
          if (param2 == null) {
            AlignedIconLabel.a("QC1", (Throwable) null, param1 ^ 118);
            return;
          }
          param2.decodedFilePolicy = 0;
          param2.discardPackedGroups = false;
          pj.field_c = new so(var3_int, param2, param2);
          nh.quickChatPhrases = new QuickChatPhraseRegistry(var3_int, param2, param2, new rm());
          var4 = gj.b(0);
          if (var4 == null) {
            AlignedIconLabel.a("QC2", (Throwable) null, param1 - 14);
            return;
          }
          ResourceRequest.a(var4, false);
          var10 = (TextFont) null;
          ArchiveIndex.field_j = ug.a(1513239, 1127256, (byte) 123, 65793, 4020342, 5138823, 65793, 1513239, (TextFont) null, 0, 65793, 2245737, 8947848);
          SoftwareFramebuffer.field_e = ug.a(0, 0, (byte) 122, 0, 0, 0, 0, 0, param0, 16764006, 0, 0, 0);
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
          fe.field_kb = AchievementSubmission.a(SoftwareFramebuffer.field_e, ArchiveIndex.field_j, var4, 4, cp.field_K);
          QuickChatPhraseDefinition.quickChatMenuRoot.children = new NodeDeque();
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
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
            this.field_T.tryFocus(true, (Widget) (this));
          }
          if (param0 == this.field_T) {
            this.a(25);
          }
          if (param1 != -40) {
            this.drawLayer(-38, -29, -91, (byte) 20);
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final String j(byte param0) {
        if (param0 != -76) {
          String var3 = (String) null;
          this.a(113, (String) null);
        }
        if (null != this.field_P.text) {
          return this.field_P.text;
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeMenuScreens(byte obfuscationGuard, ResourceArchive archive) {
        try {
          DelayedPacket.menuScreens = new MenuScreen[22];
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
          IntrusiveHashTable.field_k = rd.selectBackground(0, (byte) 19);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.E(" + obfuscationGuard + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vb param0, byte param1) {
        try {
          if (param1 >= -39) {
            this.h(68);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hk.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        kd.field_c = tf.field_f[param0];
        int var2 = -14 % ((param1 + 33) / 34);
        wn.field_a = ua.field_b[param0];
        FocusableWidget.field_C = he.field_L[param0];
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard > -22) {
            this.field_O = (FocusableWidget) null;
          }
          if (this.field_U != widget) {
            if (this.field_O != widget) {
              if (widget == this.field_M) {
                if (!this.field_K) {
                  if (this.field_S) {
                    ln.a(-107);
                  } else {
                    ResourceRequest.g(29);
                  }
                } else {
                  dg.a(true);
                }
              }
            } else {
              Mesh3D.d(-1);
            }
          } else {
            this.a(25);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("hk.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 >= 4) {
          var1 = ContextActionController.field_g.measureText(ag.buttonLabels[20]);
          var2 = ContextActionController.field_g.measureText(ag.buttonLabels[21]);
          dg.field_d = (var2 >= var1 ? var2 : var1) + 4;
          QuickChatMenu.field_Zb = QuickChatMenu.field_Zb + (dg.field_d + 120);
          return;
        }
    }

    hk(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (WidgetRenderer) null);
        ma dupTemp$0 = null;
        ma dupTemp$1 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        FocusableWidget stackIn_18_1 = null;
        FocusableWidget stackIn_18_2 = null;
        FocusableWidget stackIn_19_1 = null;
        FocusableWidget stackIn_19_2 = null;
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
          this.field_P = (vb) ((Object) new sf(param0, (WidgetListener) (this), 100));
          this.field_T = (vb) ((Object) new sf("", (WidgetListener) (this), 20));
          if (!this.field_K) {
            this.field_U = new FocusableWidget(ok.field_a, (WidgetListener) null);
            stackIn_18_1 = null;
            stackIn_18_2 = null;
            if (!this.field_S) {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = HalloweenBackground.field_s;
            } else {
              stackIn_19_1 = null;
              stackIn_19_2 = null;
              stackIn_19_3 = nd.field_d;
            }
            this.field_M = new FocusableWidget(stackIn_19_3, (WidgetListener) null);
            if (this.field_V) {
              this.field_O = new FocusableWidget(bd.field_a, (WidgetListener) (this));
            }
          } else {
            this.field_U = new FocusableWidget(TabbedPane.field_Tb, (WidgetListener) null);
            this.field_M = new FocusableWidget(wc.field_a, (WidgetListener) null);
            this.field_P.enabled = false;
          }
          this.field_P.renderer = (WidgetRenderer) ((Object) new r(10000536));
          this.field_T.renderer = (WidgetRenderer) ((Object) new ob(10000536));
          var6 = new hi();
          this.field_U.renderer = (WidgetRenderer) ((Object) var6);
          if (null != this.field_M) {
            this.field_M.renderer = (WidgetRenderer) ((Object) var6);
          }
          if (this.field_O != null) {
            this.field_O.renderer = (WidgetRenderer) ((Object) var6);
          }
          this.field_P.tooltip = sf.field_X;
          if (this.field_O != null) {
            this.field_O.tooltip = MidiSynthesizer.field_q;
          }
          if (this.field_K) {
            this.field_M.tooltip = LevelResultSubmission.field_o;
          } else {
            if (this.field_S) {
              this.field_M.tooltip = SoundCache.field_i;
              this.field_M.renderer = (WidgetRenderer) ((Object) new bb());
            } else {
              this.field_M.renderer = (WidgetRenderer) ((Object) new bb());
            }
          }
          this.y = 15;
          var7 = ArchiveNetworkClient.field_u;
          if (this.field_N != null) {
            this.y = this.y + (5 + var7.measureWrappedHeight(this.field_N, -40 + this.width, var7.ascent));
          }
          var8 = PlayerInputBatch.field_p;
          var9 = qi.a(uc.e((byte) -115), -28432);
          if (uc.field_k == var9) {
            var8 = sq.field_a;
          } else {
            if (ll.field_d == var9) {
              var8 = IndexedSpriteGeometry.field_c;
            }
          }
          dupTemp$0 = new ma(10, this.y, this.width - 20, 25, this.field_P, false, 80, 3, var7, 16777215, var8);
          var12 = dupTemp$0;
          this.addChild(dupTemp$0, true);
          this.y = this.y + (5 + ((Widget) ((Object) var12)).height);
          dupTemp$1 = new ma(10, this.y, this.width - 20, 25, this.field_T, false, 80, 3, var7, 16777215, wc.field_c);
          var13 = dupTemp$1;
          this.addChild(dupTemp$1, true);
          this.field_U.listener = (WidgetListener) (this);
          this.y = this.y + (5 + ((Widget) ((Object) var13)).height);
          if (null != this.field_O) {
            this.field_O.listener = (WidgetListener) (this);
          }
          if (this.field_M != null) {
            this.field_M.listener = (WidgetListener) (this);
          }
          if (null == this.field_O) {
            this.field_U.setBounds(30, 8, this.y, (byte) -119, this.width - 16);
            this.y = this.y + 35;
          } else {
            this.field_U.setBounds(30, 85, this.y, (byte) -119, -95 + this.width);
            this.y = this.y + 60;
          }
          if (null != this.field_O) {
            this.field_O.setBounds(30, 8, this.y, (byte) -119, -6 + this.width - 10);
            this.y = this.y + 35;
          }
          if (null != this.field_M) {
            if (!this.field_K &&
              !this.field_S) {
              this.field_M.setBounds(20, 8, this.y, (byte) -119, 40);
              this.y = this.y + 25;
            } else {
              this.field_M.setBounds(30, 8, this.y, (byte) -119, -10 + (this.width - 6));
              this.y = this.y + 35;
            }
          }
          this.setBounds(this.y + 3, 0, 0, (byte) -119, this.width);
          this.addChild(this.field_U, true);
          if (null != this.field_O) {
            this.addChild(this.field_O, true);
          }
          if (this.field_M != null) {
            this.addChild(this.field_M, true);
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_J = null;
        if (param0 != 88) {
          return;
        }
        arcticFarSprite = null;
        waterMidSprite = null;
        field_L = null;
    }

    private final void a(int param0) {
        if (Mesh3D.a((byte) 114) ||
          !(this.field_P.text.length() <= 0) &&
          !(0 >= this.field_T.text.length())) {
          HighscoresScreen.a(this.field_P.text, 11455, this.field_T.text);
        }
        if (param0 != 25) {
          this.field_O = (FocusableWidget) null;
        }
    }

    final void h(int param0) {
        if (param0 >= -101) {
          FocusableWidget var3 = (FocusableWidget) null;
          this.onAction(64, -27, (byte) 58, 71, (FocusableWidget) null);
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
