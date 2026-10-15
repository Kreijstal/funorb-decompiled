/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ParallaxMusicHelpers {
    static WidgetLayerStack field_b;
    static int fireworkSpawnMaxY;

    public static void b(int param0) {
        int var1 = 32 / ((-29 - param0) / 41);
        field_b = null;
    }

    final static boolean pollSpecialMusicPreparation(int obfuscationGuard) {
        int alternateTitleLoaded = 0;
        int alternatePanicLoaded = 0;
        int alternatePodiumLoaded = 0;
        int alternateTitlePrepared = 0;
        int alternatePodiumPrepared = 0;
        int alternateCompletionLoaded = 0;
        int alternatePanicPrepared = 0;
        int alternateCompletionPrepared = 0;
        int titleLoaded = 0;
        int panicLoaded = 0;
        int podiumLoaded = 0;
        int titlePrepared = 0;
        int podiumPrepared = 0;
        int completionLoaded = 0;
        int panicPrepared = 0;
        int completionPrepared = 0;
        int unusedInitialSuccess;
        int stage;
        int unusedGameFlag;
        RgbSprite unusedSprite;
        int unusedAlternateSuccess;
        int alternateAdvanceFlag;
        int alternateStage;
        int advanceFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard == 2) {
          unusedInitialSuccess = 1;
          stage = ConditionalTextValue.specialMusicPreparationStage;
          if (stage == 0) {
            LoginCredentialKind.titleMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_title_music");
            titleLoaded = (null == LoginCredentialKind.titleMusicTrack) ? 0 : 1;
            advanceFlag = titleLoaded;
          } else {
            if (1 == stage) {
              MessageScreen.panicMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_panic");
              panicLoaded = (MessageScreen.panicMusicTrack == null) ? 0 : 1;
              advanceFlag = panicLoaded;
            } else {
              if (stage == 2) {
                GrowableIntList.completionMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_game_completed");
                completionLoaded = (null == GrowableIntList.completionMusicTrack) ? 0 : 1;
                advanceFlag = completionLoaded;
              } else {
                if (stage == 3) {
                  RichTextLayout.podiumMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_podium");
                  podiumLoaded = (null == RichTextLayout.podiumMusicTrack) ? 0 : 1;
                  advanceFlag = podiumLoaded;
                } else {
                  if (4 == stage) {
                    titlePrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-114, LoginCredentialKind.titleMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                    advanceFlag = titlePrepared;
                  } else {
                    if (stage == 5) {
                      panicPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-112, MessageScreen.panicMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                      advanceFlag = panicPrepared;
                    } else {
                      if (6 == stage) {
                        completionPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-111, GrowableIntList.completionMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                        advanceFlag = completionPrepared;
                      } else {
                        if (7 != stage) {
                          return true;
                        }
                        podiumPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-123, RichTextLayout.podiumMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                        advanceFlag = podiumPrepared;
                      }
                    }
                  }
                }
              }
            }
          }
          if (advanceFlag != 0) {
            ConditionalTextValue.specialMusicPreparationStage = ConditionalTextValue.specialMusicPreparationStage + 1;
          }
          return false;
        }
        unusedSprite = (RgbSprite) null;
        ParallaxMusicHelpers.drawParisParallaxLayers(-99, -77, (RgbSprite) null, -107, -18, 45, 120, 4, (RgbSprite) null, (RgbSprite) null, 24);
        unusedAlternateSuccess = 1;
        alternateStage = ConditionalTextValue.specialMusicPreparationStage;
        if (alternateStage == 0) {
          LoginCredentialKind.titleMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_title_music");
          alternateTitleLoaded = (null == LoginCredentialKind.titleMusicTrack) ? 0 : 1;
          alternateAdvanceFlag = alternateTitleLoaded;
        } else {
          if (1 == alternateStage) {
            MessageScreen.panicMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_panic");
            alternatePanicLoaded = (MessageScreen.panicMusicTrack == null) ? 0 : 1;
            alternateAdvanceFlag = alternatePanicLoaded;
          } else {
            if (alternateStage == 2) {
              GrowableIntList.completionMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_game_completed");
              alternateCompletionLoaded = (null == GrowableIntList.completionMusicTrack) ? 0 : 1;
              alternateAdvanceFlag = alternateCompletionLoaded;
            } else {
              if (alternateStage == 3) {
                RichTextLayout.podiumMusicTrack = MusicTrack.load(BallPulseEffect.specialMusicTrackArchive, "", "BaB_podium");
                alternatePodiumLoaded = (null == RichTextLayout.podiumMusicTrack) ? 0 : 1;
                alternateAdvanceFlag = alternatePodiumLoaded;
              } else {
                if (4 == alternateStage) {
                  alternateTitlePrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-114, LoginCredentialKind.titleMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                  alternateAdvanceFlag = alternateTitlePrepared;
                } else {
                  if (alternateStage == 5) {
                    alternatePanicPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-112, MessageScreen.panicMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                    alternateAdvanceFlag = alternatePanicPrepared;
                  } else {
                    if (6 == alternateStage) {
                      alternateCompletionPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-111, GrowableIntList.completionMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                      alternateAdvanceFlag = alternateCompletionPrepared;
                    } else {
                      if (7 != alternateStage) {
                        return true;
                      }
                      alternatePodiumPrepared = (!ConditionalTextValue.musicSynthesizer.prepareTrack(-123, RichTextLayout.podiumMusicTrack, 22050, LobbyInputHelpers.specialMusicPatchArchive, GameScreen.field_e)) ? 0 : 1;
                      alternateAdvanceFlag = alternatePodiumPrepared;
                    }
                  }
                }
              }
            }
          }
        }
        if (alternateAdvanceFlag != 0) {
          ConditionalTextValue.specialMusicPreparationStage = ConditionalTextValue.specialMusicPreparationStage + 1;
        }
        return false;
    }

    final static void drawParisParallaxLayers(int destinationY, int scroll16, RgbSprite midSprite, int obfuscationGuard, int viewWidth, int verticalOffset, int destinationX, int scaleDivisor, RgbSprite nearSprite, RgbSprite farSprite, int unusedColorIndex) {
        try {
          farSprite.drawAt((viewWidth - farSprite.canvasWidth) / 2 + (destinationX + (scroll16 * 5 >> 16)), destinationY);
          RunLengthSpriteCodec.drawEncodedSprite(midSprite, 5 / scaleDivisor + (10 * scroll16 >> 16) + ((viewWidth - midSprite.canvasWidth) / 2 + destinationX), 53 / scaleDivisor - midSprite.canvasHeight + (verticalOffset + destinationY + 480));
          RunLengthSpriteCodec.drawEncodedSprite(nearSprite, -(5 / scaleDivisor) + (destinationX - (-((viewWidth - nearSprite.canvasWidth) / 2) - (scroll16 * 20 >> 16))), 480 - nearSprite.canvasHeight);
          if (obfuscationGuard <= 108) {
            RgbSprite unusedSprite = (RgbSprite) null;
            ParallaxMusicHelpers.drawParisParallaxLayers(25, -97, (RgbSprite) null, -16, -115, 10, -8, 2, (RgbSprite) null, (RgbSprite) null, -69);
          }
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "wo.B(" + destinationY + ',' + scroll16 + ',' + (midSprite != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + viewWidth + ',' + verticalOffset + ',' + destinationX + ',' + scaleDivisor + ',' + (nearSprite != null ? "{...}" : "null") + ',' + (farSprite != null ? "{...}" : "null") + ',' + unusedColorIndex + ')');
        }
    }

    static {
    }
}
