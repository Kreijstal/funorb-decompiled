/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ee implements pe, pl {
    private hk field_K;
    static ck field_E;
    private vf field_J;
    private r field_C;
    static int menuPointerRepeatCountdown;
    static volatile int liveHeldPointerButton;
    static Sprite[][] geometrySpritesByThemeAndCategory;
    static String field_F;

    final static void g(int param0) {
        if (null == tl.field_f) {
            jk.fullscreenAcceptCountdownPluralText = OpacityWidget.a(jk.fullscreenAcceptCountdownPluralText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -123);
            mj.fullscreenAcceptCountdownSingularText = OpacityWidget.a(mj.fullscreenAcceptCountdownSingularText, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -55);
            tl.field_f = new String[19];
            tl.field_f[12] = lh.nextText;
            tl.field_f[7] = tc.quitText;
            tl.field_f[6] = df.endGameText;
            tl.field_f[8] = wb.soundLabelText;
            tl.field_f[14] = PacketByteCipher.field_c;
            tl.field_f[5] = ij.menuText;
            tl.field_f[0] = nk.startGameText;
            tl.field_f[4] = wf.fullscreenText;
            tl.field_f[param0] = fc.musicLabelText;
            tl.field_f[10] = bl.achievementsText;
            tl.field_f[11] = tl.previousText;
            tl.field_f[15] = ArchiveCatalog.field_a;
            tl.field_f[1] = id.resumeGameText;
            tl.field_f[13] = gj.field_t;
            tl.field_f[3] = ef.instructionsText;
            tl.field_f[2] = ii.highscoresText;
            tl.field_f[18] = vd.highscoreModeNames[2];
            tl.field_f[16] = vd.highscoreModeNames[0];
            tl.field_f[17] = vd.highscoreModeNames[1];
            return;
        }
    }

    final static void a(vd param0, int param1) {
        int var2_int = 0;
        vd var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 != 0) {
            return;
          }
          if (null == param0.field_k) {
            return;
          }
          if (!((param0.field_o == 0) &&
              (0 == param0.field_d))) {
            for (var2_int = 0; oj.field_b > var2_int; var2_int++) {
              var3 = MatchingTextValidator.field_k[var2_int];
              if ((2 == var3.field_f) &&
                  (param0.field_o == var3.field_o) &&
                  (param0.field_d == var3.field_d)) {
                return;
              }
            }
          }
          if (null == param0.field_g) {
          }
          ki.a(param0, 31274);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = (RuntimeException) (var2);
          stackIn_21_1 = new StringBuilder().append("s.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    s(r param0) {
        super(0, 0, 288, 0, (dh) null);
        String var7 = null;
        int var3 = 0;
        ff var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_C = param0;
            this.field_K = new hk(cl.continueText, (bb) null);
            this.field_K.field_q = (dh) ((Object) new ml());
            var7 = OpacityWidget.a(nk.createUnder13TermsText, new String[]{this.f(11501), this.c(false)}, (byte) -114);
            var3 = 20;
            var4 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.maxAscent, -1, 2147483647, true);
            this.field_J = new vf(var7, var4);
            this.field_J.field_j = "";
            this.field_J.a(0, -47, eh.openInPopupWindowText);
            this.field_J.a(1, 118, eh.openInPopupWindowText);
            this.field_J.field_u = (bb) (this);
            this.field_J.widgetWidth = this.widgetWidth - 40;
            this.field_J.b(26, 0, var3, this.widgetWidth - 40);
            var3 = var3 + (this.field_J.widgetHeight + 15);
            this.b((byte) -108, this.field_J);
            var5 = 4;
            var6 = 200;
            this.field_K.a(40, var6, (byte) -71, var3, -var6 + 300 >> 1);
            this.field_K.field_u = (bb) (this);
            this.b((byte) -63, this.field_K);
            this.a(var3 + (55 + var5), 300, (byte) -104, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (0 == param1) {
            uk.a(false, "terms.ws");
          } else {
            if (param1 != 1) {
              if (2 == param1) {
                uk.a(false, "conduct.ws");
              }
            } else {
              uk.a(false, "privacy.ws");
            }
          }
          if (param2 == 2) {
            return;
          }
          this.field_C = (r) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);
          stackIn_13_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String f(int param0) {
        String discarded$0 = null;
        if (param0 != 11501) {
            discarded$0 = this.c(true);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean handleKeyInput(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a(7305, param3);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, -104);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);
          stackIn_13_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            geometrySpritesByThemeAndCategory = (Sprite[][]) null;
            field_E = null;
            field_F = null;
            return;
        }
        liveHeldPointerButton = 58;
        geometrySpritesByThemeAndCategory = (Sprite[][]) null;
        field_E = null;
        field_F = null;
    }

    private final String c(boolean param0) {
        if (param0) {
            field_E = (ck) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, hk param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_K) {
            ki.a(77);
            this.field_C.dismissDialog((byte) -104);
          }
          if (param1 == -20) {
            return;
          }
          this.field_C = (r) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var6);
          stackIn_7_1 = new StringBuilder().append("s.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            int var6 = 0;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            String var8 = null;
            String stackIn_5_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            try {
              try {
                var8 = param1.getParameter("cookieprefix");
                var3 = var8 + "settings";
                var4 = (String) (wk.a((byte) -6, param1, "getcookies"));
                var5 = uj.a(';', true, var4);
                for (var6 = 0; var5.length > var6; var6++) {
                  var7 = var5[var6].indexOf('=');
                  if ((var7 >= 0) &&
                      (var5[var6].substring(0, var7).trim().equals(var3))) {
                    stackIn_5_0 = var5[var6].substring(var7 + 1).trim();
                    return stackIn_5_0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
              }
              if (param0 != -1) {
                s.g(14);
              }
              if (null == NetworkArchiveRequest.field_z) {
                stackIn_15_0 = param1.getParameter("settings");
                return stackIn_15_0;
              }
              stackIn_13_0 = NetworkArchiveRequest.field_z;
              return stackIn_13_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_18_0 = (RuntimeException) (var2_ref);
              stackIn_18_1 = new StringBuilder().append("s.B(").append(param0).append(',');
              if (param1 == null) {
                stackIn_19_2 = "null";
              } else {
                stackIn_19_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = new ck(7, 0, 1, 1);
        geometrySpritesByThemeAndCategory = new Sprite[7][7];
        liveHeldPointerButton = 0;
        field_F = "Growing Pumpkin";
    }
}
