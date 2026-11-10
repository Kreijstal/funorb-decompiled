/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AreaSelectionScreen extends MenuScreen {
    static String field_o;
    private MenuSelection field_n;
    private int[] field_p;
    static int field_t;
    static int field_m;
    private MenuSelection field_s;
    static boolean field_r;
    static LoginCredentials field_q;

    private final void closeAreaDetail(byte param0, int param1) {
        int var3 = 0;
        this.resetAreaHighlights(false, 2);
        if (param0 != 0) {
          this.handleInput((byte) -7, true);
        }
        if (-1 == param1) {
          var3 = ExceptionWrapper.field_a + 2;
          this.renderMapSnapshot(ExceptionWrapper.field_a, (byte) -126);
          RandomAccessCacheFile.field_b = 15;
          this.field_h = this.field_p;
          this.field_b = this.field_n;
          RandomAccessCacheFile.field_h = false;
          this.field_b.initializeSelection(this.field_s.field_j, (byte) -95, this.findItemAt(true, KeyStateHelpers.field_b, FadingModalPanel.field_K), var3);
          ExceptionWrapper.field_a = -1;
        }
    }

    final void handleMapClick(int param0, int param1, int param2) {
        if (OctaveNoiseMap.field_j <= 0 &&
          ExceptionWrapper.field_a == -1) {
          param2 -= 80;
          if (SocketConnector.field_a[2] < param0 &&
            param0 < SocketConnector.field_a[2] + MenuBackgroundActor.field_d[2] &&
            IntroSpeedHelpers.field_c[2] < param2 &&
            HighscoreSubmissionHelpers.field_a[2] + IntroSpeedHelpers.field_c[2] > param2 ||
            !(param0 <= SocketConnector.field_a[3]) &&
            !(param0 >= MenuBackgroundActor.field_d[3] + SocketConnector.field_a[3]) &&
            !(IntroSpeedHelpers.field_c[3] >= param2) &&
            !(IntroSpeedHelpers.field_c[3] + HighscoreSubmissionHelpers.field_a[3] <= param2)) {
            this.closeAreaDetail((byte) 0, 4);
          }
        }
        if (param1 != 32526) {
          field_o = (String) null;
        }
    }

    private final boolean isAreaAvailable(int param0, int param1, int param2) {
        int var4 = -44 / ((param2 - 48) / 57);
        return param0 < 4 ? true : false;
    }

    final int findItemAt(boolean param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        boolean stackOut_6_0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = ZombieDawn.field_J;
        param2 = param2 - LevelObstacle.field_M;
        param1 = param1 - SpriteFadeHelpers.field_b;
        if (RandomAccessCacheFile.field_b != 0) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (-1 == ExceptionWrapper.field_a) {
          param2 -= 80;
          var4 = -1;
          var5 = 3;
          while (true) {
            if (0 <= var5) {
              var6 = 80;
              var7 = 130;
              stackOut_6_0 = this.isAreaAvailable(var5 + 2, -1, 110);
              stackIn_15_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var8 == 0) {
                if (stackIn_7_0 &&
                  -var6 + SocketConnector.field_a[var5] < param1 &&
                  (var6 + SocketConnector.field_a[var5]) > param1 &&
                  param2 > IntroSpeedHelpers.field_c[var5] &&
                  param2 < IntroSpeedHelpers.field_c[var5] + var7) {
                  var4 = var5;
                }
                var5--;
                continue;
              }
            } else {
              stackIn_15_0 = 0;
            }
            break;
          }
          if (stackIn_15_0 <= var4) {
            return 2 + var4;
          }
          param2 += 80;
          decompiledFrameRemainder0 = (var8 != 0);
        }
        if (decompiledFrameRemainder0) {
          var4Lifetime1 = 178;
          var5Lifetime1 = (param2 - var4Lifetime1) / 29;
          if (param2 < var4Lifetime1 ||
            var5Lifetime1 < 0 ||
            var5Lifetime1 > 6 ||
            200 > param1 ||
            param1 > 440) {
            var5Lifetime1 = -1;
          }
          if (var5Lifetime1 != -1 &&
            this.isAreaAvailable(3 + var5Lifetime1, ExceptionWrapper.field_a, 126)) {
            return var5Lifetime1 + 3;
          }
          if (param1 > (BrowserUrlHelpers.field_c - 11) &&
            (BrowserUrlHelpers.field_c + 29) > param1 &&
            param2 > 120 &&
            param2 < 160) {
            return 2;
          }
        }
        if (!param0) {
          AreaSelectionScreen.isDimOverlayShown(-64);
        }
        if (this.field_k < param2 &&
          param2 < (this.field_k + 34) &&
          this.field_g < param1 &&
          param1 < this.field_g + this.field_i) {
          return 0;
        }
        return -1;
    }

    final void handleInput(byte param0, boolean param1) {
        int fieldTemp$1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = ZombieDawn.field_J;
        super.handleInput((byte) -127, param1);
        if (RandomAccessCacheFile.field_b != 0) {
          if (RandomAccessCacheFile.field_h) {
            RandomAccessCacheFile.field_b = RandomAccessCacheFile.field_b + 1;
            if (16 != RandomAccessCacheFile.field_b) {
              return;
            }
            ExceptionWrapper.field_a = Zombie.field_Db;
            this.renderMapSnapshot(-1, (byte) -115);
            PowerupCard.field_k.setAsRenderTarget();
            Rasterizer.blurRectangle(3, 3, 0, 0, 640, 341);
            DisplayState.field_f.makeRasterTarget(-124);
            RandomAccessCacheFile.field_b = 0;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            RandomAccessCacheFile.field_b = RandomAccessCacheFile.field_b - 1;
            return;
          }
        }
        int fieldTemp$0 = IterableNodeHashTable.field_e + 1;
        IterableNodeHashTable.field_e = IterableNodeHashTable.field_e + 1;
        if (fieldTemp$0 == 50) {
          IterableNodeHashTable.field_e = 0;
        }
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (4 <= var3))) {
          stackIn_25_0 = LongAndTextLoginPayload.field_i;
          stackIn_25_1 = var3;
          if (var5 == 0) {
            if (stackIn_25_0 == stackIn_25_1) {
              ChatMessage.field_a[var3] = ChatMessage.field_a[var3] + 30;
            } else {
              ChatMessage.field_a[var3] = ChatMessage.field_a[var3] - 30;
            }
            if (ChatMessage.field_a[var3] < 128) {
              ChatMessage.field_a[var3] = 128;
            }
            if (ChatMessage.field_a[var3] > 256) {
              ChatMessage.field_a[var3] = 256;
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          fieldTemp$1 = PopupMenuBuilder.field_b + 1;
          PopupMenuBuilder.field_b = PopupMenuBuilder.field_b + 1;
          stackIn_25_0 = 50;
          stackIn_25_1 = fieldTemp$1;
        }
        if (stackIn_25_0 <= stackIn_25_1) {
          PopupMenuBuilder.field_b = 0;
        }
        var3Lifetime1 = this.field_b.field_d;
        if (2 <= var3Lifetime1) {
          if (var3Lifetime1 - 2 != LongAndTextLoginPayload.field_i) {
            IntroCutsceneScreen.highlightArea(var3Lifetime1 - 2, 16777045);
            if (var5 != 0) {
              LongAndTextLoginPayload.field_i = -1;
            }
          }
        } else {
          LongAndTextLoginPayload.field_i = -1;
        }
        var4 = -54 % ((-39 - param0) / 61);
        return;
    }

    AreaSelectionScreen(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_p = this.field_h;
          this.field_n = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ac.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawAreaMap(int param0, int param1) {
        ValidationStatusIcon.field_E.drawTransparent(SpriteFadeHelpers.field_b, param1 + (LevelObstacle.field_M + 5));
        this.drawAreaIcon(!this.isAreaAvailable(2, -1, 123) ? true : false, 0, 82, param1);
        this.drawAreaIcon(!this.isAreaAvailable(3, -1, 123) ? true : false, 1, 82, param1);
        if (1 == LongAndTextLoginPayload.field_i &&
          IntroSpeedHelpers.field_b[0] < 13 &&
          IntroSpeedHelpers.field_b[1] == 0) {
          CacheEntry.field_q.drawParagraph(ByteArrayPool.field_c, SocketConnector.field_a[1] + (SpriteFadeHelpers.field_b - 90), 170 + (IntroSpeedHelpers.field_c[1] + LevelObstacle.field_M), 240, 180, 16777215, 0, 1, 1, 0);
        }
        int var3 = -98 % ((param0 + 19) / 51);
    }

    private final void drawAreaIcon(boolean param0, int param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        Sprite var6;
        int var7;
        int var8;
        int var9;
        Sprite var10;
        Sprite var11;
        int var7Lifetime1;
        var9 = ZombieDawn.field_J;
        var10 = GlowAreaSupport.field_d;
        var11 = var10;
        var6 = SpriteCheckboxPainter.field_a[param1 + 1];
        SpriteCheckboxPainter.field_a[0].drawWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, 73 + IntroSpeedHelpers.field_c[param1] + (LevelObstacle.field_M + param3), 96);
        if (~param1 == ~LongAndTextLoginPayload.field_i) {
          var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + IntroSpeedHelpers.field_c[param1] + LevelObstacle.field_M, 248, 16776960);
          var6.drawTransparentWithOpacity(2 + (SpriteFadeHelpers.field_b + SocketConnector.field_a[param1]), 1 + (param3 + LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]), 256);
          PowerupCard.field_b.drawAdditive(SocketConnector.field_a[param1] + (SpriteFadeHelpers.field_b - 10), LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1] + (-10 + param3), DiskArchiveRequest.field_z[PopupMenuBuilder.field_b]);
          if (var9 != 0) {
            if (param0) {
              var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (IntroSpeedHelpers.field_c[param1] + LevelObstacle.field_M), 100);
              var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]), 200);
              var6.drawTransparentWithOpacity(SocketConnector.field_a[param1] + (SpriteFadeHelpers.field_b + 2), 1 + (LevelObstacle.field_M - (-IntroSpeedHelpers.field_c[param1] - param3)), 140);
            } else {
              var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]), 200);
              var6.drawTransparentWithOpacity(SocketConnector.field_a[param1] + (SpriteFadeHelpers.field_b + 2), 1 + (LevelObstacle.field_M - (-IntroSpeedHelpers.field_c[param1] - param3)), 140);
            }
          }
        } else {
          if (param0) {
            var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (IntroSpeedHelpers.field_c[param1] + LevelObstacle.field_M), 100);
            if (var9 != 0) {
              var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]), 200);
              var6.drawTransparentWithOpacity(SocketConnector.field_a[param1] + (SpriteFadeHelpers.field_b + 2), 1 + (LevelObstacle.field_M - (-IntroSpeedHelpers.field_c[param1] - param3)), 140);
            }
          } else {
            var10.drawTransparentWithOpacity(SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, param3 + (LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]), 200);
            var6.drawTransparentWithOpacity(SocketConnector.field_a[param1] + (SpriteFadeHelpers.field_b + 2), 1 + (LevelObstacle.field_M - (-IntroSpeedHelpers.field_c[param1] - param3)), 140);
          }
        }
        if (!param0 &&
          ChatMessage.field_a[param1] != 0) {
          stackIn_13_0 = (LongAndTextLoginPayload.field_i == param1) ? 2 : 0;
          var7 = stackIn_13_0;
          ProgressMessageDialog.field_jb.drawCenteredAlpha(CaptionedContainer.field_G[param1], 8 + SpriteFadeHelpers.field_b + SocketConnector.field_a[param1], var10.field_t + (param3 + IntroSpeedHelpers.field_c[param1] + (LevelObstacle.field_M + 20)), var7, -1, ChatMessage.field_a[param1]);
        }
        if (param0 &&
          param1 == this.findItemAt(true, KeyStateHelpers.field_b, FadingModalPanel.field_K)) {
          ProgressMessageDialog.field_jb.drawCenteredAlpha(CaptionedContainer.field_G[param1], 8 + (SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b), IntroSpeedHelpers.field_c[param1] + (LevelObstacle.field_M + param3) + (var11.field_t + 20), 0, -1, ChatMessage.field_a[param1]);
        }
        if (param2 != 82) {
          field_o = (String) null;
        }
        if (param1 == LongAndTextLoginPayload.field_i &&
          !this.field_b.field_j) {
          if (-1 != TrackedSoundStream.field_q[param1]) {
            Human.field_tb.drawMirrored(-20 + SpriteFadeHelpers.field_b + SocketConnector.field_a[param1], param3 + LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1] + 17);
          }
          if (MonotonicClock.field_a[param1] != -1 &&
            this.isAreaAvailable(param1 + 3, -1, 117)) {
            Human.field_tb.drawTransparent(SpriteFadeHelpers.field_b - (-SocketConnector.field_a[param1] - 55), LevelObstacle.field_M - (-IntroSpeedHelpers.field_c[param1] - param3 - 17));
          }
        }
        if (OctaveNoiseMap.field_j <= 0) {
          var7Lifetime1 = IterableNodeHashTable.field_e;
          var8 = 12 + IterableNodeHashTable.field_e;
          if (param1 == 1) {
            DiskArchiveRequest.field_y.drawAdditive(SpriteFadeHelpers.field_b + (SocketConnector.field_a[param1] + 2), param3 + (LevelObstacle.field_M + IntroSpeedHelpers.field_c[param1]) - 17, 50 + DiskArchiveRequest.field_z[var7Lifetime1] / 2);
          }
          if (var8 >= 50) {
            var8 -= 50;
          }
          if (param1 == 2) {
            DiskArchiveRequest.field_y.drawAdditive(2 + SocketConnector.field_a[param1] + SpriteFadeHelpers.field_b, -17 + (param3 + LevelObstacle.field_M) + IntroSpeedHelpers.field_c[param1], 50 + DiskArchiveRequest.field_z[var8] / 2);
          }
        }
    }

    final void returnToPreviousScreen(byte param0) {
        if (RandomAccessCacheFile.field_b != 0) {
          return;
        }
        int var2 = 22 / ((param0 + 83) / 42);
        UiResourceHelpers.switchScreenMusic(false, true, PendingFlagRequest.field_i);
    }

    final static boolean isDimOverlayShown(int param0) {
        if (param0 != 50) {
          field_r = true;
        }
        return ScriptedMinigunner.field_ac;
    }

    public static void releaseStatics(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -90) {
          field_r = false;
        }
    }

    final void handleNavigationKeys(int param0) {
        MenuSelection stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        MenuSelection stackIn_60_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        MenuSelection stackIn_81_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_112_1 = 0;
        MenuSelection stackIn_113_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_129_1 = 0;
        MenuSelection stackIn_131_0 = null;
        int stackIn_142_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 != -31645) {
          AreaSelectionScreen.releaseStatics((byte) -3);
        }
        var2 = this.field_b.field_d;
        if (PasswordValidator.field_i == 48 &&
          AchievementSubmission.field_p[82] &&
          SavedDataRequest.field_j >= 2) {
          IntroSpeedHelpers.field_b[0] = 27;
        }
        if (69 == PasswordValidator.field_i &&
          AchievementSubmission.field_p[82] &&
          2 <= SavedDataRequest.field_j) {
          IntroSpeedHelpers.field_b[0] = 0;
        }
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder0 = true;
        if (ExceptionWrapper.field_a == -1) {
          if (PasswordValidator.field_i == 96) {
            boolean decompiledSharedTail0 = !(var2 < 2);
            if (!decompiledSharedTail0) {
              this.field_b.setSelectedIndex(0, -92);
              decompiledSharedTail0 = (var4 != 0);
            }
            if ((decompiledSharedTail0) &&
              (var2 > 2)) {
              this.field_b.setSelectedIndex(this.field_b.field_d - 1, 60);
            }
          }
          if (PasswordValidator.field_i == 97) {
            if (var2 >= 2) {
              if (5 > var2 &&
                this.isAreaAvailable(var2 + 1, -1, -23)) {
                this.field_b.setSelectedIndex(var2 + 1, param0 + 31525);
                if (var4 != 0) {
                  this.field_b.setSelectedIndex(0, -76);
                }
              }
            } else {
              this.field_b.setSelectedIndex(0, -76);
            }
          }
          if (PasswordValidator.field_i == 99) {
            if (var2 >= 2) {
              ScorePopup.field_J = var2;
            }
            this.field_b.setSelectedIndex(0, 86);
          }
          decompiledFrameRemainder0 = (98 == PasswordValidator.field_i);
          if (decompiledFrameRemainder0) {
            if (var2 == -1) {
              this.field_b.setSelectedIndex(0, 56);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(var2 >= 2))) {
              stackIn_39_0 = this.field_b;
              if (ScorePopup.field_J > 1 &&
                ScorePopup.field_J < 6) {
                stackIn_40_1 = ScorePopup.field_J;
              } else {
                stackIn_40_1 = 2;
              }
              ((MenuSelection) (Object) stackIn_39_0).setSelectedIndex(stackIn_40_1, 46);
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          var3 = ScorePopup.field_J;
          if ((99 == PasswordValidator.field_i ||
            PasswordValidator.field_i == 98) && (var2 == 0 ||
            var2 == 1)) {
            ScorePopup.field_J = var2;
          }
          boolean decompiledFrameRemainder2 = true;
          if (PasswordValidator.field_i == 98) {
            if (var2 < 0) {
              this.field_b.setSelectedIndex(0, 50);
            }
            if (!(var2 < 0) ||
              var4 != 0) {
              scanLoop1: while (true) {
                if (this.field_b.field_d != 0 &&
                  this.field_b.field_d != 1) {
                  if (this.field_b.field_d != 2) {
                    this.field_b.setSelectedIndex(this.field_b.field_d - 1, -89);
                    if (var4 != 0) {
                      stackIn_60_0 = this.field_b;
                      if (0 != var3 &&
                        var3 != 1) {
                        stackIn_62_1 = 0;
                      } else {
                        stackIn_62_1 = var3;
                      }
                      ((MenuSelection) (Object) stackIn_60_0).setSelectedIndex(stackIn_62_1, 116);
                      this.field_b.setSelectedIndex(-1 + this.field_b.field_h, 120);
                    }
                  } else {
                    stackIn_60_0 = this.field_b;
                    if (0 != var3 &&
                      var3 != 1) {
                      stackIn_62_1 = 0;
                    } else {
                      stackIn_62_1 = var3;
                    }
                    ((MenuSelection) (Object) stackIn_60_0).setSelectedIndex(stackIn_62_1, 116);
                    if (var4 != 0) {
                      this.field_b.setSelectedIndex(-1 + this.field_b.field_h, 120);
                    }
                  }
                } else {
                  this.field_b.setSelectedIndex(-1 + this.field_b.field_h, 120);
                }
                stackIn_65_0 = this.isAreaAvailable(this.field_b.field_d, ExceptionWrapper.field_a, 108) ? 1 : 0;
                do {
                  if (stackIn_65_0 == 0) {
                    continue scanLoop1;
                  }
                  stackIn_65_0 = 99;
                  stackIn_67_0 = stackIn_65_0;
                } while (var4 != 0);
                break;
              }
              decompiledFrameRemainder2 = false;
            }}
          if (decompiledFrameRemainder2) {
            while (true) {
              stackIn_142_0 = 99;
              if (var4 == 0) {
                stackIn_67_0 = stackIn_142_0;
                break;
              }
              while (stackIn_142_0 == 0) {
                if (this.field_b.field_d != 0 &&
                  this.field_b.field_d != 1) {
                  if (this.field_b.field_d != 2) {
                    this.field_b.setSelectedIndex(this.field_b.field_d - 1, -89);
                  }
                  stackIn_131_0 = this.field_b;
                  if (0 != var3 &&
                    var3 != 1) {
                    stackIn_129_1 = 0;
                  } else {
                    stackIn_129_1 = var3;
                  }
                  ((MenuSelection) (Object) stackIn_131_0).setSelectedIndex(stackIn_129_1, 116);
                }
                this.field_b.setSelectedIndex(-1 + this.field_b.field_h, 120);
                stackIn_142_0 = this.isAreaAvailable(this.field_b.field_d, ExceptionWrapper.field_a, 108) ? 1 : 0;
              }
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (stackIn_67_0 == PasswordValidator.field_i) {
            if (var2 < 0) {
              this.field_b.setSelectedIndex(0, param0 ^ 31739);
            }
            if (!(var2 < 0) ||
              var4 != 0) {
              scanLoop2: while (true) {
                if (~this.field_b.field_d != ~(this.field_b.field_h - 1)) {
                  if (this.field_b.field_d != 0 &&
                    this.field_b.field_d != 1) {
                    this.field_b.setSelectedIndex(this.field_b.field_d + 1, 57);
                    if (var4 != 0) {
                      this.field_b.setSelectedIndex(2, param0 + 31538);
                      stackIn_81_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_82_1 = 0;
                      } else {
                        stackIn_82_1 = var3;
                      }
                      ((MenuSelection) (Object) stackIn_81_0).setSelectedIndex(stackIn_82_1, param0 + 31524);
                    }
                  } else {
                    this.field_b.setSelectedIndex(2, param0 + 31538);
                    if (var4 != 0) {
                      stackIn_81_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_82_1 = 0;
                      } else {
                        stackIn_82_1 = var3;
                      }
                      ((MenuSelection) (Object) stackIn_81_0).setSelectedIndex(stackIn_82_1, param0 + 31524);
                    }
                  }
                } else {
                  stackIn_81_0 = this.field_b;
                  if (var3 != 0 &&
                    var3 != 1) {
                    stackIn_82_1 = 0;
                  } else {
                    stackIn_82_1 = var3;
                  }
                  ((MenuSelection) (Object) stackIn_81_0).setSelectedIndex(stackIn_82_1, param0 + 31524);
                }
                stackIn_84_0 = this.isAreaAvailable(this.field_b.field_d, ExceptionWrapper.field_a, -119) ? 1 : 0;
                do {
                  if (stackIn_84_0 == 0) {
                    continue scanLoop2;
                  }
                  stackIn_84_0 = PasswordValidator.field_i;
                  stackIn_86_0 = stackIn_84_0;
                } while (var4 != 0);
                break;
              }
              decompiledFrameRemainder1 = false;
            }}
          if (decompiledFrameRemainder1) {
            while (true) {
              stackIn_118_0 = PasswordValidator.field_i;
              if (var4 == 0) {
                stackIn_86_0 = stackIn_118_0;
                break;
              }
              while (stackIn_118_0 == 0) {
                if (~this.field_b.field_d != ~(this.field_b.field_h - 1)) {
                  if (this.field_b.field_d != 0 &&
                    this.field_b.field_d != 1) {
                    this.field_b.setSelectedIndex(this.field_b.field_d + 1, 57);
                  }
                  this.field_b.setSelectedIndex(2, param0 + 31538);
                }
                stackIn_113_0 = this.field_b;
                if (var3 != 0 &&
                  var3 != 1) {
                  stackIn_112_1 = 0;
                } else {
                  stackIn_112_1 = var3;
                }
                ((MenuSelection) (Object) stackIn_113_0).setSelectedIndex(stackIn_112_1, param0 + 31524);
                stackIn_118_0 = this.isAreaAvailable(this.field_b.field_d, ExceptionWrapper.field_a, -119) ? 1 : 0;
              }
            }
          }
          if (stackIn_86_0 != 97 &&
            PasswordValidator.field_i != 96) {
            this.field_b.pollKeyboardCode(26);
            decompiledFrameRemainder3 = false;
          }
          else {
            if (var2 == 0) {
              this.field_b.setSelectedIndex(1, param0 ^ 31701);
              if ((var4 != 0) && (var2 == 1 ||
                0 > var2)) {
                this.field_b.setSelectedIndex(0, 101);
              }
            } else {
              if (var2 == 1 ||
                0 > var2) {
                this.field_b.setSelectedIndex(0, 101);
              }
            }
          }
        }
        if (decompiledFrameRemainder3) {
          this.field_b.pollKeyboardCode(26);
        }

    }

    final static void initializeAudioOutputs(PlatformTaskDispatcher param0, boolean param1, java.awt.Component param2, MidiPcmStream param3, int param4, int param5) {
        try {
          AudioSetupHelpers.initializeAudio(param4, param3, 1024, param2, param0, param4, param1, -112);
          if (param5 != -97) {
            field_t = 126;
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "ac.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawScreen(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        super.drawScreen((byte) -65);
        this.drawAreaMap(-124, 80);
        if (RandomAccessCacheFile.field_b != 0) {
          var2 = RandomAccessCacheFile.field_b << 4;
          var3 = var2 * 2;
          if (var3 > 256) {
            var3 = 256;
          }
          var4 = var2 >= 128 ? 2 * (-128 + var2) : 0;
          PowerupCard.field_k.drawWithVerticalAlphaGradient(0, 80, var3, var4);
        }
        TrafficVehicle.field_H.drawTransparent(SpriteFadeHelpers.field_b, 80 + LevelObstacle.field_M);
        if (param0 >= -35) {
          this.field_s = (MenuSelection) null;
        }
    }

    private final void renderMapSnapshot(int param0, byte param1) {
        int var3 = -9 / ((param1 + 11) / 63);
        PowerupCard.field_k = new Sprite(640, 341);
        PowerupCard.field_k.setAsRenderTarget();
        Rasterizer.clear();
        this.drawAreaMap(-122, 0);
        DisplayState.field_f.makeRasterTarget(13);
    }

    final void activateItem(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ZombieDawn.field_J;
        if (this.field_h.length <= param1) {
          return;
        }
        if (param2 != -8512) {
          this.activateItem(false, -61, -49);
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = this.field_h[param1];
        var5 = var4;
        if (var5 == 46 &&
          var6 == 0) {
          decompiledFrameRemainder1 = !(!this.field_b.isActivated(-125));
          if (decompiledFrameRemainder1) {
            if (OctaveNoiseMap.field_j <= 0) {
              return;
            }
            MenuLayoutHelpers.selectMenuLayout(-11325, 1);
            UiResourceHelpers.switchScreenMusic(param0, true, 9);
            decompiledFrameRemainder2 = false;
          }
        } else {
          decompiledFrameRemainder0 = (var5 == 45);
        }
        if (((decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
          (decompiledFrameRemainder2 = !(!this.field_b.isActivated(-123)))) {
          MenuLayoutHelpers.selectMenuLayout(-11325, 0);
          UiResourceHelpers.switchScreenMusic(param0, true, 9);
          decompiledFrameRemainder2 = (var6 != 0);
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1)) {
          super.activateItem(param0, param1, -8512);
        }

    }

    final static void initializeMenuLabels(int param0) {
        if (InputValidationResult.field_b != null) {
          return;
        }
        GlowAreaSupport.field_j = new String[15];
        GlowAreaSupport.field_j[13] = LoginPromptTexts.field_c;
        GlowAreaSupport.field_j[9] = CheckboxWidget.field_H;
        GlowAreaSupport.field_j[2] = RankingQueryWriter.field_b;
        InputValidationResult.field_b = new String[47];
        GlowAreaSupport.field_j[5] = SocketConnector.field_h;
        GlowAreaSupport.field_j[6] = CheckboxPainter.field_k;
        GlowAreaSupport.field_j[4] = BootstrapLoadingHelpers.field_b;
        GlowAreaSupport.field_j[7] = BloodSplat.field_H;
        GlowAreaSupport.field_j[3] = SessionSocketHelpers.field_c;
        InputValidationResult.field_b[13] = ObstacleFactory.field_a;
        InputValidationResult.field_b[3] = BootstrapLoadingHelpers.field_b;
        InputValidationResult.field_b[14] = SocketConnector.field_h;
        InputValidationResult.field_b[5] = PaletteFontFactory.field_b;
        InputValidationResult.field_b[11] = DelayedPacket.field_n;
        InputValidationResult.field_b[7] = AudioMixerHelpers.field_a;
        InputValidationResult.field_b[2] = SessionSocketHelpers.field_c;
        InputValidationResult.field_b[1] = ExceptionWrapper.field_c;
        InputValidationResult.field_b[12] = QueuedStatSubmission.field_l;
        InputValidationResult.field_b[15] = PendingRecordRequest.field_r;
        InputValidationResult.field_b[0] = MeleeHuman.field_Ab;
        InputValidationResult.field_b[4] = FrameSpriteHelpers.field_e;
        InputValidationResult.field_b[16] = BootstrapLoadingHelpers.field_c;
        InputValidationResult.field_b[6] = PaletteFontFactory.field_b;
        InputValidationResult.field_b[43] = SingleChildWidget.field_A;
        InputValidationResult.field_b[10] = MenuSpriteGlobals.field_a[2];
        InputValidationResult.field_b[39] = "Shouldn't See Me";
        InputValidationResult.field_b[18] = TextLayoutLine.field_f;
        InputValidationResult.field_b[38] = SocialListEntry.field_jb;
        InputValidationResult.field_b[42] = SoundEffectCleanupHelpers.field_b;
        InputValidationResult.field_b[21] = MainMenuScreen.field_n;
        InputValidationResult.field_b[8] = MenuSpriteGlobals.field_a[0];
        InputValidationResult.field_b[35] = AccountRequestState.field_a;
        InputValidationResult.field_b[44] = "";
        InputValidationResult.field_b[40] = KeyStateHelpers.field_c;
        if (param0 != -32435) {
          return;
        }
        InputValidationResult.field_b[34] = AccountCreationDialog.field_qb[0];
        InputValidationResult.field_b[46] = CaptionedContainer.field_G[1];
        InputValidationResult.field_b[37] = ContentTransitionPhase.field_a[0];
        InputValidationResult.field_b[20] = HighscoresScreen.field_s;
        InputValidationResult.field_b[9] = MenuSpriteGlobals.field_a[1];
        InputValidationResult.field_b[45] = CaptionedContainer.field_G[0];
        InputValidationResult.field_b[19] = StripedProgressBar.field_G;
        InputValidationResult.field_b[36] = QueuedStatSubmission.field_o;
        InputValidationResult.field_b[17] = QuickChatPhraseDefinition.field_q;
        InputValidationResult.field_b[41] = LoginPromptTexts.field_c;
    }

    private final void resetAreaHighlights(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0) {
          ExceptionWrapper.field_a = -1;
          this.field_h = this.field_p;
          this.field_b = this.field_n;
        }
        LongAndTextLoginPayload.field_i = -1;
        var3 = 0;
        while (var3 < 4) {
          ChatMessage.field_a[var3] = 128;
          var3++;
          if (var4 != 0) {
            return;
          }
        }
        if (param1 != 2) {
          this.handleNavigationKeys(-128);
        }
        return;
    }

    static {
        field_m = 0;
        field_r = false;
        field_q = null;
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
