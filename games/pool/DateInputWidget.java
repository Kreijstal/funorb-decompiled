/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DateInputWidget extends WidgetContainer implements ValidationProviderSource {
    static String offerdraw;
    static int field_W;
    static int field_R;
    static String ratingRating;
    static HighScoreRequest field_V;
    static Sprite[] field_Q;
    static String tutorialNineBallAfterbreak;
    static int field_Y;
    static int field_U;
    static int field_S;
    private BirthDateValidator validator;
    static String rule00;

    abstract int getYear(int param0);

    abstract int getDay(byte param0);

    abstract int getMonthIndex(int param0);

    void setBirthDateValidator(int param0, BirthDateValidator param1) {
        this.validator = param1;
        if (param0 != -15309) {
          return;
        }
        try {
          this.validator.dateInput = this;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "eq.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void shutdownAudioOutputs(byte obfuscationGuard) {
        if (obfuscationGuard < -9) {
          if (MidiNoteMixer.field_s != null) {
            MidiNoteMixer.field_s.shutdown();
          }
          if (CacheEntry.field_D != null) {
            CacheEntry.field_D.shutdown();
          }
          return;
        }
        field_S = 52;
        if (MidiNoteMixer.field_s != null) {
          MidiNoteMixer.field_s.shutdown();
        }
        if (CacheEntry.field_D != null) {
          CacheEntry.field_D.shutdown();
        }
    }

    public final ValidationProvider getValidationProvider(int param0) {
        int var2 = 93 % ((33 - param0) / 34);
        return (ValidationProvider) ((Object) this.validator);
    }

    abstract boolean isDateIncomplete(byte param0);

    public static void releaseStatics(int param0) {
        field_V = null;
        offerdraw = null;
        tutorialNineBallAfterbreak = null;
        ratingRating = null;
        field_Q = null;
        rule00 = null;
        if (param0 != -12253) {
          field_Q = (Sprite[]) null;
        }
    }

    DateInputWidget(int param0, int param1, int param2, int param3, WidgetPainter param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void initializeMenuScreens(byte obfuscationGuard) {
        DisplayModeSupport.field_c = new MenuScreen[25];
        MenuScreen discarded$0 = new MenuScreen(ProjectedLineSupport.field_m, 0, 180, 460, 160, 24, new int[]{39, 43, 0, 1, 5, 47, 4, 48, 22, 19});
        OptionsScreen discarded$1 = new OptionsScreen(14, 180, 460, 160, 24, MusicCrossfadeStream.field_B);
        TimeTrialSelectScreen discarded$2 = new TimeTrialSelectScreen(DialogLayer.field_Q, 2, 180, 460, 160, 24, new int[]{50, 51, 8});
        PauseMenuScreen discarded$3 = new PauseMenuScreen((Sprite) null, 3, 180, 460, 160, 24, ArchiveIndex.field_o);
        PauseMenuScreen discarded$4 = new PauseMenuScreen((Sprite) null, 8, 180, 460, 160, 24, ChoiceButtonSupport.field_d);
        PauseMenuScreen discarded$5 = new PauseMenuScreen((Sprite) null, 9, 180, 460, 160, 24, LimitedRandomAccessFile.field_f);
        PauseMenuScreen discarded$6 = new PauseMenuScreen((Sprite) null, 24, 180, 460, 160, 24, TutorialSelectScreen.field_J);
        PauseMenuScreen discarded$7 = new PauseMenuScreen((Sprite) null, 10, 180, 460, 160, 24, WireframeQuad.field_r);
        PauseMenuScreen discarded$8 = new PauseMenuScreen((Sprite) null, 11, 180, 460, 160, 24, RankingsScreen.field_L);
        PauseMenuScreen discarded$9 = new PauseMenuScreen((Sprite) null, 12, 180, 460, 160, 24, MenuScreen.field_m);
        DimmedPauseMenu discarded$10 = new DimmedPauseMenu((Sprite) null, 23, 180, 460, 160, 24, new int[]{9, 3});
        PauseMenuScreen discarded$11 = new PauseMenuScreen((Sprite) null, 22, 180, 460, 160, 24, new int[]{2, 21, 59, 60, 54, 55, 56, 57, 58});
        HighscoresScreen discarded$12 = new HighscoresScreen(16, 180, 460, 410, 24, new int[]{23, 8});
        RankingsScreen discarded$13 = new RankingsScreen(15, 180, 460, 410, 24, new int[]{23, 8});
        InstructionsScreen discarded$14 = new InstructionsScreen(13, 70, 460, 400, 24, new int[]{25, 8, 26});
        AchievementsScreen discarded$15 = new AchievementsScreen(17, 180, 460, 400, 24, new int[]{23, 8});
        AchievementsScreen discarded$16 = new AchievementsScreen(18, 180, 460, 400, 24, new int[]{48, 8});
        LoginRequiredScreen discarded$17 = new LoginRequiredScreen(19, 180, 460, 400, 24, new int[]{23, 24});
        MessageScreen discarded$18 = new MessageScreen(20, 290, 460, 400, 24, new int[]{7});
        int var1 = 37 % ((37 - obfuscationGuard) / 35);
        MembershipBenefitsScreen discarded$19 = new MembershipBenefitsScreen(21, 180, 460, 160, 24, new int[]{});
        LocalGameSetupScreen discarded$20 = new LocalGameSetupScreen(6, 180, 460, 160, 24, new int[]{28, 27, 64, 63, 45, 44, 46, 8, 65});
        ThemeSelectScreen discarded$21 = new ThemeSelectScreen(7, 180, 460, 160, 24, new int[]{29, 30, 31, 32, 33, 8});
        TutorialSelectScreen discarded$22 = new TutorialSelectScreen(AimTarget.field_i, 1, 180, 460, 160, 24, new int[]{40, 41, 42, 8});
        Ball.field_H = FreePlayRules.field_e.stringWidth(TranslatedUiText.field_f[20]) + 10;
        var1 = 10 + FreePlayRules.field_e.stringWidth(TranslatedUiText.field_f[21]);
        if (!(Ball.field_H >= var1)) {
          Ball.field_H = var1;
        }
        PauseMenuScreen.applyScreenLayouts((byte) -104);
    }

    final static String readSettingsCookie(java.applet.Applet applet, byte obfuscationGuard) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          String var8 = null;
          String stackIn_7_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          try {
            try {
              var8 = applet.getParameter("cookieprefix");
              if (obfuscationGuard <= 110) {
                field_U = 74;
              }
              var3 = var8 + "settings";
              var4 = (String) (JavaScriptBridge.callWindowFunction((byte) 124, "getcookies", applet));
              var5 = AppletUrlSupport.splitString(30634, var4, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_7_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_7_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (GlowSprite.field_g == null) {
              return applet.getParameter("settings");
            }
            stackIn_14_0 = GlowSprite.field_g;
            return stackIn_14_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref;
            stackIn_17_1 = new StringBuilder().append("eq.H(");
            if (applet == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        offerdraw = "Offer draw";
        field_V = null;
        field_W = -1;
        tutorialNineBallAfterbreak = "The key rule of nine-ball pool is that you must always hit the lowest numbered ball on the table first. Try this now, the ball you should be aiming for is indicated in the top-left corner.";
        ratingRating = "Rating";
        rule00 = "Buying or selling an account";
    }
}
