/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementThresholdRule {
    static Sprite[] objectSprites;
    static UiTheme field_g;
    static String[] field_b;
    private int achievementId;
    private int requiredMode;
    private int minimumValue;
    static PcmSampleStream field_a;

    final static void advanceScreensAndAccountState(byte guard) {
        boolean var2 = false;
        int var3 = EscapeVector.obfuscationControl;
        try {
          DialogueScreen var4 = DropTargetWidget.f((byte) -49);
          if (p.field_h != 0) {
            if (!AccountSessionSupport.isGuestSession(-124)) {
              if (1 == p.field_h) {
                kh.showHighscoresScreen(true, -1230, true);
              }
              if (p.field_h == 2) {
                PacketBuffer.field_h = false;
                ChatMessage.clearFrameOffsets((byte) -126);
                di.field_d = null;
                if (null != IntValueNode.field_i) {
                  ml.a(IntValueNode.field_i, 3, (byte) 101);
                }
                AchievementDefinition.a(0);
              }
            }
            p.field_h = 0;
            mj.field_d = 0;
            ChatMessage.clearFrameOffsets((byte) -105);
          }
          if (guard >= -47) {
            return;
          }
          if (var4 == null) {
            if (null == BoundedRandomAccessFile.activeSession &&
              !wk.field_c) {
              GameModeSelectScreen.advanceMenuEdgeSegments((byte) -111);
            }
            if (wk.field_c) {
              kc.a((byte) -75);
            } else if (TextLayout.field_b) {
              PathPoint.refreshScreenForAccountState(-883);
              UiComponent.field_o.update(117);
            } else if (0 <= SelfDestructEffects.field_q) {
              sn.c(-1);
              CheckboxPainter.field_l.update(2525);
            } else if (!PacketBuffer.field_h) {
              if (e.field_a) {
                var2 = (da.field_b.update(-122));
                if (var2) {
                  return;
                }
              } else if (CheckboxPainter.field_n) {
                ReflectionCheck.d((byte) -120);
                var2 = (rc.field_a.update(-91));
                if (var2) {
                  return;
                }
              } else if (PauseMenuState.instructionsVisible) {
                var2 = (ArchiveLoadTask.field_e.update(-1));
                if (var2) {
                  return;
                }
              } else if (AlternateUsernameCredentials.field_q != null) {
                QuickChatPhraseCache.advanceMenuTransition((byte) 127);
              } else if (null != da.field_c) {
                RatingQuery.e(-46);
              } else {
                if (mj.field_d < 1000) {
                  mj.field_d = mj.field_d + 1;
                }
                BoundedRandomAccessFile.activeSession.updateSession(-41);
              }
            } else if (mm.a(-59)) {
              return;
            }
            MenuTitleSupport.updateTitleBanner(72);
          } else {
            var4.advanceDialogue((byte) 62);
          }
          if (AccountSessionSupport.isGuestSession(-102)) {
            return;
          }
          TrackerMusicDefinition.field_f.serviceAccountAchievements(-32464);
          ua.field_c.flushPendingUpdates(126);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "mb.F(" + guard + ')');
        }
    }

    final static boolean isAccountStateReady(byte guard) {
        try {
          boolean stackIn_4_0 = !(AccountSessionSupport.isGuestSession(-96));
          boolean var1_int = stackIn_4_0;
          if (var1_int &&
            !TrackerMusicDefinition.field_f.accountAchievementsLoaded &&
            !TrackerMusicDefinition.field_f.queryFailed) {
            return false;
          }
          if (var1_int &&
            !ua.field_c.isLoaded(-19836)) {
            return false;
          }
          if (var1_int &&
            UiContainer.hasMembership((byte) 98) &&
            FrameCadenceSupport.field_b == null) {
            return false;
          }
          if (var1_int &&
            UiContainer.hasMembership((byte) 116) &&
            ArchiveProvider.field_b == null) {
            return false;
          }
          if (var1_int &&
            UiContainer.hasMembership((byte) 111) &&
            null != StatefulTextPainter.field_u) {
            return false;
          }
          if (guard <= -61) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "mb.A(" + guard + ')');
        }
    }

    final static void setMirroredPanelBackground(Sprite sprite, int guard) {
        String stackIn_8_2 = null;
        try {
          TextFieldValidator.field_j = sprite;
          SpriteDecodeSupport.field_a = new Sprite(sprite.fullWidth, sprite.fullHeight);
          if (guard > -11) {
            field_a = (PcmSampleStream) null;
          }
          int[] var3 = new int[4];
          int[] var2 = var3;
          SoftwareRasterizer.saveClip(var3);
          SpriteDecodeSupport.field_a.bindAsFramebuffer();
          sprite.drawMirrored(0, 0);
          AlphaContainer.field_D.a(107);
          SoftwareRasterizer.restoreClip(var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_7_0 = runtimeException;
          StringBuilder stackIn_7_1 = new StringBuilder().append("mb.C(");
          if (sprite == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        try {
          field_b = null;
          field_g = null;
          objectSprites = null;
          if (guard != 4) {
            AchievementThresholdRule.isAccountStateReady((byte) -110);
          }
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "mb.B(" + guard + ')');
        }
    }

    final void grantIfThresholdReached(int guard, int mode, int value) {
        try {
          if (this.requiredMode != mode) {
            return;
          }
          if (this.minimumValue > value) {
            return;
          }
          GameplaySession var4 = BoundedRandomAccessFile.activeSession;
          if (guard != 11827) {
            String[] var5 = (String[]) null;
            AchievementThresholdRule.setAccountNameSuggestions((String[]) null, 86);
          }
          if (var4 == null) {
            return;
          }
          var4.awardAchievement(mode, false, this.achievementId, 255 ^ this.achievementId);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var4_ref), "mb.D(" + guard + ',' + mode + ',' + value + ')');
        }
    }

    AchievementThresholdRule(int minimumValue, int requiredMode, int achievementId) {
        try {
          this.requiredMode = requiredMode;
          this.minimumValue = minimumValue;
          this.achievementId = achievementId;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "mb.<init>(" + minimumValue + ',' + requiredMode + ',' + achievementId + ')');
        }
    }

    final static void setAccountNameSuggestions(String[] suggestions, int guard) {
        String stackIn_13_2 = null;
        try {
          if (null != LegacyWidgetStyle.field_E) {
            LegacyWidgetStyle.field_E.field_G.setSuggestions(suggestions, (byte) -103);
          }
          if (guard != 4) {
            return;
          }
          if (rc.field_b != null) {
            rc.field_b.suggestions.setSuggestions(suggestions, (byte) -103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("mb.E(");
          if (suggestions == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        objectSprites = new Sprite[17];
        field_b = new String[]{"Congratulations, commander. Thanks to your superb skills, all of our technology has been recovered.", "The aliens will not be happy. It is now only a matter of time before they come back to Earth.", "This time, however, we and our valuable weapons will be ready."};
    }
}
