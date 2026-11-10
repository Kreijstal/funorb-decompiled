/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogLayer extends SingleChildWidget {
    static String field_K;
    static int[] field_J;
    private IntrusiveDeque field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static FramePainter field_I;
    static String[] field_L;

    final void showDialog(int param0, UiWidget param1) {
        FadingDialog var3 = null;
        if (!(param1 instanceof FadingDialog)) {
          throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
          return;
        }
        try {
          var3 = (FadingDialog) (param1);
          this.field_H.addLast(-25612, var3);
          var3.field_R = true;
          var3.requestKeyboardFocus((UiWidget) (this), 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "vk.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean canShowAdvert(byte param0) {
        CharSequence var2;
        boolean stackIn_9_0 = false;
        if (param0 > -121) {
          var2 = (CharSequence) null;
          DialogLayer.getNameValidationError(-28, (CharSequence) null);
        }
        boolean decompiledFrameRemainder0 = true;
        if (ClientException.field_i >= 20 &&
          SimZombie.isSessionReady(-86) && (!(IntHashIndex.field_a > 0) ||
          ValidationState.alwaysTrue(-118))) {
          stackIn_9_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_9_0 = true;
        }
        return stackIn_9_0;
    }

    final void advanceDialogs(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingDialog var3 = (FadingDialog) (var2.last(-3));
        if (param0 > -84) {
          DialogLayer.canShowAdvert((byte) 127);
        }
        while (var3 != null) {
          if (var3.advanceDialogAnimation(-27388)) {
            var3.unlink(true);
          }
          var3 = (FadingDialog) (var2.previous((byte) -113));
        }
        this.field_B = (UiWidget) ((Object) this.getActiveDialog((byte) -119));
    }

    public static void releaseStatics(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = 90 / ((30 - param0) / 47);
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void appendChatHistory(ChatMessage param0, byte param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 83) {
            field_J = (int[]) null;
          }
          for (var2_int = 0; var2_int < 3; var2_int++) {
            LoginDialog.field_ub[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; MoveOrderMarker.field_g > var2_intLifetime1; var2_intLifetime1++) {
            if (param0.field_l == ValidationIconWidget.field_M[var2_intLifetime1].field_l) {
              dupTemp$3 = ValidationIconWidget.field_M[var2_intLifetime1].getFilterPriority(true);
              LoginDialog.field_ub[dupTemp$3] = LoginDialog.field_ub[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.getFilterPriority(true);
          LoginDialog.field_ub[dupTemp$0] = LoginDialog.field_ub[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < MoveOrderMarker.field_g; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (ValidationIconWidget.field_M[var3].field_l == param0.field_l) {
              var4 = ValidationIconWidget.field_M[var3].getFilterPriority(true);
              if (LoginDialog.field_ub[var4] > InfectionEvent.field_m) {
                LoginDialog.field_ub[var4] = LoginDialog.field_ub[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ValidationIconWidget.field_M[incrementValue$2] = ValidationIconWidget.field_M[var3];
            }
          }
          MoveOrderMarker.field_g = var2_intLifetime2;
          fieldTemp$1 = MoveOrderMarker.field_g;
          MoveOrderMarker.field_g = MoveOrderMarker.field_g + 1;
          ValidationIconWidget.field_M[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("vk.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String getNameValidationError(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            var3 = (int[]) null;
            DialogLayer.createMenuScreen((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
          }
          stackIn_3_0 = UnitStateEvent.validateNameText(false, -52, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean isBlinkPhaseVisible(byte param0) {
        int[] var2;
        boolean stackIn_6_0 = false;
        if (param0 != -39) {
          var2 = (int[]) null;
          DialogLayer.createMenuScreen((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
        }
        stackIn_6_0 = (LoginSuccessHelpers.hasInputFocus(-107)) && ((8 & PowerupEvent.field_m) == 0);
        return stackIn_6_0;
    }

    final void closeAllDialogs(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingDialog var3 = (FadingDialog) (var2.last(-3));
        while (var3 != null) {
          var3.field_R = false;
          var3 = (FadingDialog) (var2.previous((byte) -112));
        }
        this.field_B = null;
        if (param0 >= -81) {
          DialogLayer.isBlinkPhaseVisible((byte) 56);
        }
    }

    final FadingDialog getActiveDialog(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        FadingDialog var3 = (FadingDialog) (var2.last(-3));
        while (var3 != null) {
          if (var3.field_R) {
            return var3;
          }
          var3 = (FadingDialog) (var2.previous((byte) -48));
        }
        if (param0 < -118) {
          return null;
        }
        return (FadingDialog) null;
    }

    final void renderWidget(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.painter != null) {
          this.painter.paintWidget(true, param1, -15112, param3, (UiWidget) (this));
        }
        if (param0 != -2) {
          return;
        }
        IntrusiveDequeCursor var5 = new IntrusiveDequeCursor(this.field_H);
        UiWidget var6 = (UiWidget) (var5.first(32397));
        while (var6 != null) {
          var6.renderWidget(-2, param1 + this.field_i, param2, param3 + this.field_y);
          var6 = (UiWidget) (var5.next(-3));
        }
    }

    final UiWidget findFocusTarget(int param0) {
        IntrusiveDequeCursor var2;
        FadingDialog var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != -1963) {
          return (UiWidget) null;
        }
        var3 = (FadingDialog) (var2.last(-3));
        while (var3 != null) {
          if (var3.field_R) {
            return var3.findFocusTarget(122);
          }
          var3 = (FadingDialog) (var2.previous((byte) -38));
        }
        return null;
    }

    final static Sprite[] loadSprites(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DialSelectorWidget.loadSpriteSheet(param3, param2, param1, (byte) -42)) {
            return null;
          }
          if (param0 < 32) {
            DialogLayer.isBlinkPhaseVisible((byte) -118);
          }
          stackIn_6_0 = PopupMenuBuilder.buildSprites(33);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vk.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void createMenuScreen(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var9_int = 13 / ((param4 - 48) / 58);
          if (param2 == 1) {
            ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new OptionsMenuScreen(param2, param1, param3, param6, param8, param7, param5));
          } else {
            if (3 != param2) {
              if (param2 == 4) {
                ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new InstructionsScreen(param2, param1, param3, param6, param8, param7, param5));
              } else {
                if (5 != param2 &&
                  param2 != 6) {
                  if (10 == param2) {
                    ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new GameResultsScreen(param2, param1, param3, param6, param8, param7, param5));
                  } else {
                    if (param2 == 12) {
                      ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new IntroScreen(param2, param1, param3, param6, param8, param7, param5));
                    } else {
                      if (param2 == 14) {
                        ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new AppearanceScreen(param2, param1, param3, param6, param8, param7, param5));
                      } else {
                        if (param2 == 15) {
                          ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new LaboratoryScreen(param2, param1, param3, param6, param8, param7, param5));
                        } else {
                          if (13 == param2) {
                            ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new MessageMenuScreen(param2, param1, param3, param6, param8, param7, param5));
                          } else {
                            ScrollBar.field_Hb[param2] = new MenuScreen(param2, param1, param3, param6, param8, param7, param5);
                          }
                        }
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new AchievementsScreen(param2, param1, param3, param6, param8, param7, param5));
                }
              }
            } else {
              ScrollBar.field_Hb[param2] = (MenuScreen) ((Object) new RankingsScreen(param2, param1, param3, param6, param8, param7, param5));
            }
          }
          MusicPatchNode.field_h = (GameResultsScreen) (ScrollBar.field_Hb[10]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_25_0 = var9;
          stackIn_25_1 = new StringBuilder().append("vk.R(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public DialogLayer() {
        super(0, 0, LoginDialog.field_wb, ScreenSizeGlobals.field_a, (WidgetPainter) null, (WidgetListener) null);
        this.field_H = new IntrusiveDeque();
    }

    final void settleDialogAnimations(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        IntrusiveDequeCursor var2 = new IntrusiveDequeCursor(this.field_H);
        if (param0 != 118) {
          field_J = (int[]) null;
        }
        FadingDialog var3 = (FadingDialog) (var2.last(-3));
        while (var3 != null) {
          if (var3.refreshVisibilityAndCheckClosed(-6134)) {
            var3.unlink(true);
          }
          var3 = (FadingDialog) (var2.previous((byte) -30));
        }
    }

    static {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
