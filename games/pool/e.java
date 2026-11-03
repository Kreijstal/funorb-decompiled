/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String[] shotMessages;
    static UiComponent field_a;
    static String createPasswordConfirm;
    static StateIconLabel field_e;
    static int[] field_c;
    static int[] field_d;
    static String mpRematchnewgameUnrated;
    static String tocustomersupport;

    public static void releaseStatics(boolean param0) {
        field_d = null;
        mpRematchnewgameUnrated = null;
        field_a = null;
        field_e = null;
        if (param0) {
          tocustomersupport = null;
          createPasswordConfirm = null;
          field_c = null;
          shotMessages = null;
          return;
        }
    }

    final static void a(int param0) {
        int stackIn_18_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        String stackIn_38_0 = null;
        boolean stackIn_39_1 = false;
        NineSliceFrame stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSliceFrame var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Pool.field_O;
        try {
          var1_int = PasswordValidator.field_n;
          var2 = 0;
          if (2 == ClientException.field_h) {
            var3_long = -QuickChatPhraseDefinition.field_y + rl.monotonicTimeMillis((byte) -112);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          var3 = 0;
          if (param0 > -78) {
            field_e = (StateIconLabel) null;
          }
          while (dq.field_j.length > var3) {
            var4 = IterableNodeHashTable.field_c[var3];
            if (var4 < 0) {
              var5 = BallSkin.field_f;
            } else {
              if (var4 != LabeledChildWidget.field_W.selectedIndex) {
                var5 = vn.field_c;
              } else {
                var5 = WidgetContainer.field_H;
              }
            }
            var6 = dq.field_j[var3];
            if (ClientException.field_h == 2 &&
              var2 == 1) {
              if (MultiHandleSliderWidget.field_W.length <= NanoTickClock.field_n.length) {
                stackIn_18_0 = NanoTickClock.field_n.length;
              } else {
                stackIn_18_0 = MultiHandleSliderWidget.field_W.length;
              }
              var7 = stackIn_18_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (-var7 + (NanoTickClock.field_n.length - 6) + var3 < 0) {
                  stackIn_24_0 = "";
                } else {
                  stackIn_24_0 = NanoTickClock.field_n[var3 - (6 - NanoTickClock.field_n.length + var7)];
                }
                var6 = stackIn_24_0;
              }
              if (MusicCrossfadeStream.field_H.length >= KeyHandler.field_a.length) {
                stackIn_28_0 = MusicCrossfadeStream.field_H.length;
              } else {
                stackIn_28_0 = KeyHandler.field_a.length;
              }
              var8 = stackIn_28_0;
              if (var7 + 7 <= var3 &&
                var8 + var7 + 7 > var3) {
                if (var3 - 7 - var7 >= MusicCrossfadeStream.field_H.length) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = MusicCrossfadeStream.field_H[-7 + var3 - var7];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = var6;
            stackIn_39_1 = !(var4 < 0);
            var7Lifetime1 = WidgetContainer.a(stackIn_38_0, stackIn_39_1, false);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + nn.field_c;
            if (var4 >= 0) {
              var1_int = var1_int + IterableDualLinkDeque.field_e;
              if (var4 != LabeledChildWidget.field_W.selectedIndex) {
                stackIn_44_0 = TutorialStep.field_m;
              } else {
                stackIn_44_0 = td.field_e;
              }
              var9 = stackIn_44_0;
              if (var9 != null) {
                var9.draw(var7Lifetime1 + (rm.field_b << 1), var1_int, -6316, var8Lifetime1 - rm.field_b, (NineBallRules.field_h << 1) + WidgetContainer.field_I);
              }
              var1_int = var1_int + NineBallRules.field_h;
            }
            if (var4 < 0) {
              dq.field_f.d(var6, var8Lifetime1, ModelTableScene.field_K + var1_int, var5, -1);
              var1_int = var1_int + ShotRecord.field_y;
            } else {
              ProgressBarWidget.field_R.d(var6, var8Lifetime1, var1_int + Camera.field_b, var5, -1);
              var1_int = var1_int + (WidgetContainer.field_I + IterableDualLinkDeque.field_e + NineBallRules.field_h);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "e.B(" + param0 + ')');
        }
    }

    final static boolean handleChoiceButtons(int param0, PoolMatchController param1) {
        ShotRecord var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (GzipDecoder.field_h) {
            var2 = param1.gameModel.currentShot(60);
            LobbyGame.field_Vb.updateRoot(true, false);
            if (NanoTickClock.field_t.pressedButton == 1) {
              var2.makeChoice(ag.field_a, true);
              GzipDecoder.field_h = false;
              RasterSnapshot.a(param1, -16813);
              return true;
            }
            if (rl.field_b.pressedButton == 1) {
              var2.makeChoice(EmailAvailabilityValidator.field_n, true);
              GzipDecoder.field_h = false;
              RasterSnapshot.a(param1, -16813);
              return true;
            }
          }
          if (param0 == -19839) {
            return false;
          }
          shotMessages = (String[]) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("e.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        createPasswordConfirm = "Confirm Password: ";
        field_c = new int[5];
        field_d = new int[]{2, 20, 21, 49, 5, 9};
        shotMessages = new String[]{"<%0> wins!", "Foul! <%0> hit an opponent's ball first!", "Foul! <%0> hit the 8 ball first!", "Foul! <%0> potted the cue ball!", "Foul! <%0> potted opponent's ball!", "<%0> potted the 8 ball!", "Foul! Not enough balls touched the cushion!", "Foul! Didn't hit any balls!", "Foul! Hit wrong ball first!", "<%0> loses! Fouled and potted the 9 ball!", "<%0> wins! Potted the 9 ball!", "Foul snooker!", "Foul! No balls touched any cushions!", "Foul! No object balls touched any cushions!", "Foul! Not enough object balls touched the cushion!", "Foul! No target balls touched any cushions!", "Foul! Not enough target balls touched the cushion!", "Foul! <%0> ran out of time!", "<%0>: Didn't pot anything! Lose a life!", "<%0>: Foul! Lose a life!", "<%0>: Potted the black! Gain a life!", "<%0>: Out of time! Lose a life!", "<%0>: Foul break! Lose a life!"};
        mpRematchnewgameUnrated = "Set up new unrated game";
        tocustomersupport = "To Customer Support";
    }
}
