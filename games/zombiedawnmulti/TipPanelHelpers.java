/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TipPanelHelpers extends IntrusiveNode {
    int field_g;
    static TextValidationFailure field_f;
    static int field_k;
    static int field_i;
    static int field_h;
    static Sprite field_j;

    TipPanelHelpers(int param0) {
        this.field_g = param0;
    }

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 != 4) {
          return;
        }
        field_f = null;
    }

    final static boolean tickTipPageTransition(int param0) {
        boolean stackIn_7_0 = false;
        boolean stackIn_51_0 = false;
        int var1;
        int var2;
        int var1Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (DiskCacheWorker.field_b != TextValidationFailure.field_d) {
          WidgetContainer.field_E = WidgetContainer.field_E - 40;
          if (WidgetContainer.field_E <= 0) {
            WidgetContainer.field_E = 0;
            SocialListRow.field_Jb = ButtonWidget.field_I[ArmedHumanView.field_rb];
            TextValidationFailure.field_d = DiskCacheWorker.field_b;
            stackIn_51_0 = !(ArmedHumanView.field_rb >= -1 + SimHuman.field_pb);
            PlayModeChoiceDialog.field_J = stackIn_51_0;
            if (0 <= DiskCacheWorker.field_b &&
              SocialListRow.field_Jb >= 0) {
              var1 = EffectAudioHelpers.field_e.countWrappedLines(LayoutCenterHelpers.field_g[TextValidationFailure.field_d][SocialListRow.field_Jb], 400);
              SpriteDecodeGlobals.field_g = 4 + (20 + var1 * (EffectAudioHelpers.field_e.maxAscent + EffectAudioHelpers.field_e.maxDescent));
              if (!UsernameCredentials.field_n) {
                SpriteDecodeGlobals.field_g = SpriteDecodeGlobals.field_g + 20;
              }
            }
          }
          if (DiskCacheWorker.field_b == 21 &&
            10 == ArmedHumanView.field_rb &&
            !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
            FadingDialog.setTutorialTipPage(param0 - 16504, 9);
            MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
          }
          if (param0 == -802) {
            return false;
          }
          field_k = -56;
          return false;
        }
        if (ArmedHumanView.field_rb != SocialListRow.field_Jb) {
          WidgetContainer.field_E = WidgetContainer.field_E - 40;
          if (WidgetContainer.field_E <= 0) {
            WidgetContainer.field_E = 0;
            SocialListRow.field_Jb = ButtonWidget.field_I[ArmedHumanView.field_rb];
            TextValidationFailure.field_d = DiskCacheWorker.field_b;
            stackIn_7_0 = !(ArmedHumanView.field_rb >= -1 + SimHuman.field_pb);
            PlayModeChoiceDialog.field_J = stackIn_7_0;
            if (0 > DiskCacheWorker.field_b) {
              if (DiskCacheWorker.field_b == 21 &&
                10 == ArmedHumanView.field_rb &&
                !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
                FadingDialog.setTutorialTipPage(param0 - 16504, 9);
                MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
              }
              if (param0 == -802) {
                return false;
              }
              field_k = -56;
              return false;
            }
            if (SocialListRow.field_Jb >= 0) {
              var1Lifetime1 = EffectAudioHelpers.field_e.countWrappedLines(LayoutCenterHelpers.field_g[TextValidationFailure.field_d][SocialListRow.field_Jb], 400);
              SpriteDecodeGlobals.field_g = 4 + (20 + var1Lifetime1 * (EffectAudioHelpers.field_e.maxAscent + EffectAudioHelpers.field_e.maxDescent));
              if (!UsernameCredentials.field_n) {
                SpriteDecodeGlobals.field_g = SpriteDecodeGlobals.field_g + 20;
              }
            }
          }
        } else {
          if (!WeightedLruCache.field_g) {
            if (WeightedLruCache.field_g) {
              if (DiskCacheWorker.field_b == 21 &&
                10 == ArmedHumanView.field_rb &&
                !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
                FadingDialog.setTutorialTipPage(param0 - 16504, 9);
                MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
              }
            } else {
              if (WidgetContainer.field_E <= 0) {
                if (DiskCacheWorker.field_b == 21 &&
                  10 == ArmedHumanView.field_rb &&
                  !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
                  FadingDialog.setTutorialTipPage(param0 - 16504, 9);
                  MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
                }
              } else {
                WidgetContainer.field_E = WidgetContainer.field_E - 40;
                if (WidgetContainer.field_E <= 0) {
                  WidgetContainer.field_E = 0;
                }
                if (DiskCacheWorker.field_b == 21 &&
                  10 == ArmedHumanView.field_rb &&
                  !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
                  FadingDialog.setTutorialTipPage(param0 - 16504, 9);
                  MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
                }
              }
            }
            if (param0 == -802) {
              return false;
            }
            field_k = -56;
            return false;
          }
          if (WidgetContainer.field_E < 400) {
            WidgetContainer.field_E = WidgetContainer.field_E + 40;
            if (WidgetContainer.field_E > 400) {
              WidgetContainer.field_E = 400;
            }
            if (DiskCacheWorker.field_b == 21 &&
              10 == ArmedHumanView.field_rb &&
              !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
              FadingDialog.setTutorialTipPage(param0 - 16504, 9);
              MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
            }
            if (param0 == -802) {
              return false;
            }
            field_k = -56;
            return false;
          }
          if (!WeightedLruCache.field_g &&
            WidgetContainer.field_E > 0) {
            WidgetContainer.field_E = WidgetContainer.field_E - 40;
            if (WidgetContainer.field_E <= 0) {
              WidgetContainer.field_E = 0;
            }
          }
        }
        if (DiskCacheWorker.field_b == 21 &&
          10 == ArmedHumanView.field_rb &&
          !PowerupButton.field_e.field_I.targetsOwnZombies(true)) {
          FadingDialog.setTutorialTipPage(param0 - 16504, 9);
          MusicCrossfadeStream.field_m = MusicCrossfadeStream.field_m & -1025;
        }
        if (param0 != -802) {
          field_k = -56;
        }
        return false;
    }

    final static BinaryBitmapFont loadBinaryFont(ResourceArchive param0, int param1, int param2, int param3, ResourceArchive param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        BinaryBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DialSelectorWidget.loadSpriteSheet(param1, param4, param3, (byte) -42)) {
            stackIn_2_0 = null;
            return (BinaryBitmapFont) (stackIn_2_0);
          }
          if (param2 != 0) {
            TipPanelHelpers.tickTipPageTransition(5);
          }
          stackIn_6_0 = HudSpriteStore.createBinaryFont(103, param0.getFile(param1, true, param3));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("er.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_f = new TextValidationFailure();
        field_h = 0;
        field_i = field_h;
        field_k = 0;
    }
}
