/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static String field_a;
    static String field_b;

    final static String visibleTooltip(byte guard) {
        if (guard != 46) {
          TickClock.releaseStatics((byte) -64);
          if (PasswordFieldPainter.field_u) {
            return null;
          }
          if (SavedDataQuery.field_j < WidgetStyleLayer.field_d) {
            return null;
          }
          if (SavedDataQuery.field_j < WidgetStyleLayer.field_d + NanoTickClock.field_l) {
            return IntroAudioSupport.field_b;
          }
          return null;
        }
        if (PasswordFieldPainter.field_u) {
          return null;
        }
        if (SavedDataQuery.field_j < WidgetStyleLayer.field_d) {
          return null;
        }
        if (SavedDataQuery.field_j < WidgetStyleLayer.field_d + NanoTickClock.field_l) {
          return IntroAudioSupport.field_b;
        }
        return null;
    }

    abstract int advanceTicks(byte guard, long tickNanos);

    final static void drawMenuFrame(int frameId, int bottom, int top, int left, int darkColor, boolean guard, int right, boolean animated, int lightColor, int openingOffset) {
        if (!guard) {
          TickClock.normalizeAccountCharacter(-21, '7');
          if (!animated) {
            AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, frameId, top, 73, left, bottom, openingOffset);
            return;
          }
          AccountNoticeKind.drawAnimatedPanelFrame(openingOffset, left, right, bottom, true, 29788, false, lightColor, darkColor, frameId, top, false);
          return;
        }
        if (!animated) {
          AccountMessagePanel.drawUnevenFrame(darkColor, right, lightColor, frameId, top, 73, left, bottom, openingOffset);
          return;
        }
        AccountNoticeKind.drawAnimatedPanelFrame(openingOffset, left, right, bottom, true, 29788, false, lightColor, darkColor, frameId, top, false);
    }

    abstract long delayMillis(byte guard);

    final static void configureDefaultMenuStyle(int guard, boolean pointerDriven) {
        if (guard != 24) {
          TickClock.visibleTooltip((byte) 53);
          if (null != BoundedRandomAccessFile.activeSession) {
            ModeProgressSupport.field_d = 16777215;
            ValidatedTextWidget.field_X = 7899280;
            MenuTitleSupport.field_e = 12110032;
            Sprite[] var6 = (Sprite[]) null;
            Sprite[] var5 = (Sprite[]) null;
            LevelObject.configureSimpleMenuTheme(0, 0, false, (Sprite[]) null, 0, 24, (Sprite[]) null, 320, 22, ByteStorage.gameFont, 240, pointerDriven);
          } else {
            ValidatedTextWidget.field_X = 6340704;
            MenuTitleSupport.field_e = 10551200;
            ModeProgressSupport.field_d = 16777215;
            Sprite[] var4 = (Sprite[]) null;
            Sprite[] var3 = (Sprite[]) null;
            LevelObject.configureSimpleMenuTheme(0, 0, false, (Sprite[]) null, 0, 24, (Sprite[]) null, 320, 22, ByteStorage.gameFont, 300, pointerDriven);
          }
          LoginHandshakeSupport.field_d = 0;
          ChatMessage.clearFrameOffsets((byte) -71);
          return;
        }
        if (null != BoundedRandomAccessFile.activeSession) {
          ModeProgressSupport.field_d = 16777215;
          ValidatedTextWidget.field_X = 7899280;
          MenuTitleSupport.field_e = 12110032;
          Sprite[] var6Lifetime1 = (Sprite[]) null;
          Sprite[] var5Lifetime1 = (Sprite[]) null;
          LevelObject.configureSimpleMenuTheme(0, 0, false, (Sprite[]) null, 0, 24, (Sprite[]) null, 320, 22, ByteStorage.gameFont, 240, pointerDriven);
          LoginHandshakeSupport.field_d = 0;
          ChatMessage.clearFrameOffsets((byte) -71);
          return;
        }
        ValidatedTextWidget.field_X = 6340704;
        MenuTitleSupport.field_e = 10551200;
        ModeProgressSupport.field_d = 16777215;
        Sprite[] var4Lifetime1 = (Sprite[]) null;
        Sprite[] var3Lifetime1 = (Sprite[]) null;
        LevelObject.configureSimpleMenuTheme(0, 0, false, (Sprite[]) null, 0, 24, (Sprite[]) null, 320, 22, ByteStorage.gameFont, 300, pointerDriven);
        LoginHandshakeSupport.field_d = 0;
        ChatMessage.clearFrameOffsets((byte) -71);
        return;
    }

    final static void pushSpriteRaster(Sprite sprite, byte guard) {
        try {
          LoginStage.pushRasterState(-123);
          if (guard >= -3) {
            Sprite var3 = (Sprite) null;
            TickClock.pushSpriteRaster((Sprite) null, (byte) -40);
          }
          SoftwareRasterizer.bind(sprite.pixels, sprite.fullWidth, sprite.fullHeight);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "eo.B(" + (sprite != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_b = null;
        if (guard != -72) {
          field_b = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final int waitAndAdvance(long tickNanos, int guard) {
        if (guard >= 34) {
          long var4 = this.delayMillis((byte) 96);
          if (var4 > 0L) {
            AchievementTracker.sleepMillis((byte) -86, var4);
          }
          return this.advanceTicks((byte) -95, tickNanos);
        }
        field_a = (String) null;
        long var4Lifetime1 = this.delayMillis((byte) 96);
        if (var4Lifetime1 > 0L) {
          AchievementTracker.sleepMillis((byte) -86, var4Lifetime1);
        }
        return this.advanceTicks((byte) -95, tickNanos);
    }

    final static char normalizeAccountCharacter(int guard, char character) {
        int var3 = EscapeVector.obfuscationControl;
        if (guard == 227) {
          int var2 = character;
          if (var2 == 32) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 != 95 &&
            45 != var2) {
            if (var2 != 91 &&
              93 != var2) {
              if (var2 == 35) {
                return character;
              }
              if (224 != var2) {
                if (var2 == 225) {
                  return 'a';
                }
                if (var2 != 226 &&
                  var2 != 228 &&
                  227 != var2 &&
                  var2 != 192 &&
                  var2 != 193 &&
                  var2 != 194 &&
                  var2 != 196 &&
                  var2 != 195) {
                  if (var2 != 232 &&
                    var2 != 233 &&
                    var2 != 234 &&
                    var2 != 235 &&
                    200 != var2 &&
                    var2 != 201 &&
                    var2 != 202 &&
                    var2 != 203) {
                    if (237 != var2 &&
                      var2 != 238 &&
                      var2 != 239 &&
                      var2 != 205 &&
                      var2 != 206 &&
                      var2 != 207) {
                      if (var2 != 242 &&
                        var2 != 243 &&
                        var2 != 244 &&
                        var2 != 246 &&
                        var2 != 245 &&
                        var2 != 210 &&
                        var2 != 211 &&
                        var2 != 212 &&
                        var2 != 214 &&
                        var2 != 213) {
                        if (var2 != 249 &&
                          var2 != 250 &&
                          var2 != 251 &&
                          var2 != 252) {
                          if (217 == var2) {
                            return 'u';
                          }
                          if (var2 != 218) {
                            if (var2 == 219) {
                              return 'u';
                            }
                            if (var2 == 220) {
                              return 'u';
                            }
                            if (var2 == 231) {
                              return 'c';
                            }
                            if (var2 == 199) {
                              return 'c';
                            }
                            if (var2 == 255) {
                              return 'y';
                            }
                            if (var2 == 376) {
                              return 'y';
                            }
                            if (var2 != 241 &&
                              var2 != 209) {
                              if (223 == var2) {
                                return 'b';
                              }
                              return Character.toLowerCase(character);
                            }
                            return 'n';
                          }
                        }
                        return 'u';
                      }
                      return 'o';
                    }
                    return 'i';
                  }
                  return 'e';
                }
              }
              return 'a';
            }
            return character;
          }
          return '_';
        }
        TickClock.releaseStatics((byte) -68);
        int var2Lifetime1 = character;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (var2Lifetime1 != 160 &&
          var2Lifetime1 != 95 &&
          45 != var2Lifetime1) {
          if (var2Lifetime1 != 91 &&
            93 != var2Lifetime1 &&
            var2Lifetime1 != 35) {
            if (224 != var2Lifetime1 &&
              var2Lifetime1 != 225 &&
              var2Lifetime1 != 226 &&
              var2Lifetime1 != 228 &&
              227 != var2Lifetime1 &&
              var2Lifetime1 != 192 &&
              var2Lifetime1 != 193 &&
              var2Lifetime1 != 194 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234 &&
                var2Lifetime1 != 235 &&
                200 != var2Lifetime1 &&
                var2Lifetime1 != 201 &&
                var2Lifetime1 != 202 &&
                var2Lifetime1 != 203) {
                if (237 == var2Lifetime1) {
                  return 'i';
                }
                if (var2Lifetime1 != 238 &&
                  var2Lifetime1 != 239) {
                  if (var2Lifetime1 == 205) {
                    return 'i';
                  }
                  if (var2Lifetime1 != 206 &&
                    var2Lifetime1 != 207) {
                    if (var2Lifetime1 == 242) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 243) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 244) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 246) {
                      return 'o';
                    }
                    if (var2Lifetime1 == 245) {
                      return 'o';
                    }
                    if (var2Lifetime1 != 210 &&
                      var2Lifetime1 != 211) {
                      if (var2Lifetime1 == 212) {
                        return 'o';
                      }
                      if (var2Lifetime1 != 214 &&
                        var2Lifetime1 != 213) {
                        if (var2Lifetime1 == 249) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 250) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 251) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 252) {
                          return 'u';
                        }
                        if (217 == var2Lifetime1) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 218) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 219) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 220) {
                          return 'u';
                        }
                        if (var2Lifetime1 == 231) {
                          return 'c';
                        }
                        if (var2Lifetime1 == 199) {
                          return 'c';
                        }
                        if (var2Lifetime1 == 255) {
                          return 'y';
                        }
                        if (var2Lifetime1 == 376) {
                          return 'y';
                        }
                        if (var2Lifetime1 != 241 &&
                          var2Lifetime1 != 209) {
                          if (223 == var2Lifetime1) {
                            return 'b';
                          }
                          return Character.toLowerCase(character);
                        }
                        return 'n';
                      }
                    }
                    return 'o';
                  }
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return character;
        }
        return '_';
    }

    abstract void resetTiming(int guard);

    static {
        field_b = "Watch Introduction";
        field_a = "Please check if address is correct";
    }
}
