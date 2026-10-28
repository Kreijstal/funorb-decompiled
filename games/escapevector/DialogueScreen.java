/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogueScreen extends IntrusiveNode {
    private int photoTransitionTicks;
    private int[] photoIndices;
    int wrappedLineCount;
    private int frameOpenTicks;
    private boolean transitioningDialogue;
    private PcmSampleStream typingSound;
    private int backgroundFadeTicks;
    static String field_G;
    int dialogueIndex;
    private int revealedCharacters;
    static MeshMaterial[] meshMaterials;
    int revealDelayTicks;
    static String field_k;
    String[] dialogueLines;
    private boolean advancingPhoto;
    boolean fullWidthScene;
    private Sprite[] photos;
    private PcmSampleStream backgroundSound;
    private String[] wrappedLines;
    private boolean textOnLeft;
    int revealedLine;
    private int animationTicks;
    boolean autoClose;
    private MenuInputState input;
    private int firstNonemptyLine;
    private String actionLabel;
    private String[] photoGroupNames;
    private int photoIndex;
    private String[] photoFileNames;

    private final int actionButtonPan(int guard) {
        int var2 = 0;
        int var4 = EscapeVector.obfuscationControl;
        int var3 = this.actionButtonWidth((byte) 67);
        if (this.fullWidthScene) {
          var2 = -(var3 / 2) + 626;
        } else if (!this.textOnLeft) {
          var2 = 632 - var3 / 2;
        } else {
          var2 = 162 - var3 / 2;
        }
        if (guard != 2) {
          DialogueScreen.scoreForSubmission(49, (byte) 53, -18);
        }
        return var2 * 12288 / 640 + 2048;
    }

    final void drawDialogue(int guard) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var11;
        int var12;
        int var15 = EscapeVector.obfuscationControl;
        this.drawBackground(80);
        this.drawScenePhoto(401);
        int var2 = this.actionButtonWidth((byte) 67);
        int var3 = 43 - this.frameOpenTicks;
        if (guard < 57) {
          return;
        }
        if (!this.fullWidthScene) {
          int stackIn_19_0 = (!this.textOnLeft) ? 8 : 170;
          var4 = stackIn_19_0;
          int stackIn_22_0 = (!this.textOnLeft) ? 470 : 632;
          var5 = stackIn_22_0;
          var6 = 65;
          var7 = 415;
          if (this.textOnLeft) {
            int stackIn_38_0 = 0;
            int stackIn_38_1 = 409;
            int stackIn_38_2 = 382;
            int stackIn_38_3 = -var2 + (-8 + var4);
            int stackIn_39_4 = (this.input.selectedIndex == 0) ? 8421504 : 3170352;
            boolean stackIn_41_5 = true;
            int stackIn_41_6 = -8 + var4;
            boolean stackIn_42_7 = (var3 != 0) ? false : true;
            int stackIn_45_8 = (0 != this.input.selectedIndex) ? 6340704 : 16777215;
            TickClock.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_39_4, stackIn_41_5, stackIn_41_6, stackIn_42_7, stackIn_45_8, var3);
            int stackIn_47_0 = 405;
            String stackIn_47_1 = this.actionLabel;
            int stackIn_48_2 = (this.input.selectedIndex == 0) ? 16777215 : 6340704;
            MatchingTextValidator.drawOutlinedTitle(stackIn_47_0, stackIn_47_1, stackIn_48_2, -113, var4 + (-8 - var2 / 2 - var3 * 16));
          } else {
            int stackIn_25_0 = 0;
            int stackIn_25_1 = 409;
            int stackIn_25_2 = 382;
            int stackIn_25_3 = 632 - var2;
            int stackIn_26_4 = (this.input.selectedIndex != 0) ? 3170352 : 8421504;
            boolean stackIn_28_5 = true;
            int stackIn_28_6 = 632;
            boolean stackIn_29_7 = (0 != var3) ? false : true;
            int stackIn_32_8 = (this.input.selectedIndex == 0) ? 16777215 : 6340704;
            TickClock.a(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_26_4, stackIn_28_5, stackIn_28_6, stackIn_29_7, stackIn_32_8, var3);
            int stackIn_34_0 = 405;
            String stackIn_34_1 = this.actionLabel;
            int stackIn_35_2 = (this.input.selectedIndex != 0) ? 6340704 : 16777215;
            MatchingTextValidator.drawOutlinedTitle(stackIn_34_0, stackIn_34_1, stackIn_35_2, -120, 16 * var3 + (632 - var2 / 2));
          }
        } else {
          var7 = 420;
          var6 = 60;
          var4 = 8;
          var5 = 632;
          int stackIn_5_0 = 0;
          int stackIn_5_1 = 475;
          int stackIn_5_2 = 448;
          int stackIn_5_3 = -var2 - 6 + var5;
          int stackIn_6_4 = (this.input.selectedIndex == 0) ? 8421504 : 3170352;
          boolean stackIn_8_5 = true;
          int stackIn_8_6 = var5 - 6;
          boolean stackIn_9_7 = (var3 != 0) ? false : true;
          int stackIn_12_8 = (this.input.selectedIndex == 0) ? 16777215 : 6340704;
          TickClock.a(stackIn_5_0, stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, stackIn_8_5, stackIn_8_6, stackIn_9_7, stackIn_12_8, var3);
          int stackIn_14_0 = 471;
          String stackIn_14_1 = this.actionLabel;
          int stackIn_15_2 = (this.input.selectedIndex != 0) ? 6340704 : 16777215;
          MatchingTextValidator.drawOutlinedTitle(stackIn_14_0, stackIn_14_1, stackIn_15_2, -122, 16 * var3 + (-6 + (var5 - var2 / 2)));
        }
        AccountMessagePanel.drawUnevenFrame(3162160, var5 - 3, 6324320, -1, 3 + var6, -108, 3 + var4, var7 - 3, var3);
        AccountMessagePanel.drawUnevenFrame(5275728, var5, 10551200, 1, var6, 99, var4, var7, var3);
        if (this.wrappedLineCount > 0) {
          int var8 = this.revealedLine;
          int var9 = this.revealedCharacters;
          if (this.wrappedLineCount <= var8) {
            var8--;
            var9 = this.wrappedLines[var8].length();
          }
          for (int var10 = 0; var8 >= var10; var10++) {
            String var16 = this.wrappedLines[var10];
            String var13 = var16;
            String var13Lifetime1 = var16;
            String var13Lifetime2 = var16;
            if (!this.fullWidthScene) {
              int stackIn_63_0 = (!this.textOnLeft) ? 478 : 8;
              var11 = stackIn_63_0;
              var12 = 88 + var10 * 20;
            } else {
              int var14 = ByteStorage.gameFont.stringWidth(var16);
              var11 = (-var14 + 640) / 2;
              if (var10 == 1 &&
                614 - var2 < var11 + var14) {
                var11 = -var14 + (-12 - var2 + 626);
              }
              var12 = 445 + 20 * var10;
            }
            if (var8 == var10) {
              String var17 = var16.substring(0, var9);
              var13Lifetime2 = var17;
              var13Lifetime2 = var17;
              var13Lifetime2 = var17;
              if (0 != (this.animationTicks & 4)) {
                var13Lifetime2 = var17 + "_";
              }
            }
            ByteStorage.gameFont.drawLeft(var13Lifetime2, var11, var12, 8454016, -1);
            if (var8 == var10) {
              break;
            }
          }
        }
        if (this.photoTransitionTicks >= 30 &&
          this.backgroundFadeTicks > 0) {
          int var8Lifetime1 = 128;
          if (30 > this.backgroundFadeTicks) {
            var8Lifetime1 = this.backgroundFadeTicks * var8Lifetime1 / 30;
          }
          SoftwareRasterizer.fillRectangleAlpha(15, 178, 610, 62, 0, var8Lifetime1);
        }
        if (30 <= this.photoTransitionTicks &&
          this.backgroundFadeTicks > 50) {
          int var8Lifetime2 = 128;
          if (this.backgroundFadeTicks < 80) {
            var8Lifetime2 = var8Lifetime2 * (-50 + this.backgroundFadeTicks) / 30;
          }
          SoftwareRasterizer.fillRectangleAlpha(15, 240, 610, 62, 0, var8Lifetime2);
        }
        ArchiveKeyRequest.a(244, 182, 8, this.backgroundFadeTicks);
    }

    DialogueScreen(int[] photoIndices, Sprite[] photos, String[] dialogueLines, boolean fullWidthScene) {
        this(photos, dialogueLines, fullWidthScene);
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          this.photoIndices = photoIndices;
          this.photoGroupNames = new String[this.photoIndices.length];
          this.photoFileNames = new String[this.photoIndices.length];
          for (int var5_int = 0; var5_int < this.photoIndices.length; var5_int++) {
            this.photoGroupNames[var5_int] = "photos_" + ValidatedTextWidget.field_R[this.photoIndices[var5_int]];
            this.photoFileNames[var5_int] = "";
            boolean discarded$2 = this.tryLoadScenePhoto((byte) 124, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("tj.<init>(");
          if (photoIndices == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (photos == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (dialogueLines == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(fullWidthScene).append(')').toString());
        }
    }

    private final int photoPan(int guard) {
        if (guard != 8192) {
          this.input = (MenuInputState) null;
        }
        if (this.fullWidthScene) {
          return 8192;
        }
        int var2 = this.textOnLeft ? 401 : 239;
        return 12288 * var2 / 640 + 2048;
    }

    private final void advanceBackgroundFadeOut(int guard) {
        if (this.backgroundFadeTicks == 80) {
          ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, 3072 * IterableNodeHashTable.field_c / 64, 10240);
        }
        if (this.backgroundFadeTicks == 30) {
          ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 6144);
        }
        this.backgroundFadeTicks = this.backgroundFadeTicks - 1;
        if (guard <= 102) {
          meshMaterials = (MeshMaterial[]) null;
        }
    }

    DialogueScreen(String groupName, String filePrefix, Sprite[] photos, String[] dialogueLines, boolean fullWidthScene) {
        this(photos, dialogueLines, fullWidthScene);
        String stackIn_8_2 = null;
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          this.photoIndices = new int[this.photos.length];
          this.photoGroupNames = new String[this.photos.length];
          this.photoFileNames = new String[this.photos.length];
          for (int var6_int = 0; this.photoIndices.length > var6_int; var6_int++) {
            this.photoIndices[var6_int] = var6_int;
            this.photoGroupNames[var6_int] = groupName;
            this.photoFileNames[var6_int] = filePrefix + (var6_int + 1);
            boolean discarded$2 = this.tryLoadScenePhoto((byte) 126, var6_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var6;
          StringBuilder stackIn_7_1 = new StringBuilder().append("tj.<init>(");
          if (groupName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (filePrefix == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (photos == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (dialogueLines == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(fullWidthScene).append(')').toString());
        }
    }

    final static int scoreForSubmission(int mode, byte guard, int score) {
        if (guard < 125) {
          return 20;
        }
        if (0 == mode) {
          return score;
        }
        if (1 == mode) {
          return score;
        }
        if (mode == 2) {
          return ProgressQuery.ceilDivide(-7, 100, score);
        }
        if (mode == 3) {
          return ProgressQuery.ceilDivide(-25, 100, score);
        }
        return score;
    }

    public static void releaseStatics(boolean guard) {
        field_k = null;
        field_G = null;
        if (!guard) {
          DialogueScreen.rotationTransformQ16((byte) -30, -21, 96);
        }
        meshMaterials = null;
    }

    private final void wrapDialogueText(int guard, String text) {
        String stackIn_20_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (guard != 43) {
            return;
          }
          int stackIn_6_0 = (!this.fullWidthScene) ? 154 : 614;
          int var3_int = stackIn_6_0;
          this.wrappedLineCount = ByteStorage.gameFont.wrapLines(text, new int[]{var3_int}, this.wrappedLines);
          for (int var4 = 0; this.wrappedLineCount > var4; var4++) {
            if (this.wrappedLines[var4].endsWith("<br>")) {
              this.wrappedLines[var4] = this.wrappedLines[var4].substring(0, -4 + this.wrappedLines[var4].length());
            }
          }
          this.revealedLine = 0;
          this.revealedCharacters = 0;
          while (this.revealedLine < this.wrappedLineCount) {
            if (0 == this.wrappedLines[this.revealedLine].length()) {
              this.revealedLine = this.revealedLine + 1;
              continue;
            }
            break;
          }
          this.firstNonemptyLine = this.revealedLine;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_19_0 = runtimeException;
          StringBuilder stackIn_19_1 = new StringBuilder().append("tj.N(").append(guard).append(',');
          if (text == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void advanceDialogue(byte guard) {
        int var7 = EscapeVector.obfuscationControl;
        this.input.updatePointer(this.hitActionButton(-84, SessionCounterState.field_c, LoginDialog.field_ob), (byte) 126, this.hitActionButton(-97, GzipDecoder.field_d, UiContainer.field_y));
        if (guard < 10) {
          return;
        }
        if (this.input.selectionChanged) {
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, this.actionButtonPan(2));
        }
        if (AccountMessagePanel.field_N != 0) {
          this.closeDialogue(2048);
          if (SessionMenuSupport.field_c != null) {
            SessionMenuSupport.field_c.updatePointerSelection(true, 320);
            return;
          }
        } else {
          while (true) {
            if (AccountRequestDialog.pollKeyEvent(-82)) {
              this.input.handleKeyEvent((byte) 6);
              if (this.input.selectionChanged) {
                ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, 100, 1536 * IterableNodeHashTable.field_c / 64, this.actionButtonPan(2));
              }
              if (PasswordValidator.field_n != 13 &&
                PasswordValidator.field_n != 84 &&
                PasswordValidator.field_n != 83 &&
                82 != PasswordValidator.field_n) {
                continue;
              }
              this.closeDialogue(2048);
              if (null == SessionMenuSupport.field_c) {
                break;
              }
              SessionMenuSupport.field_c.updatePointerSelection(false, 320);
              return;
            }
            if (!this.transitioningDialogue &&
              this.backgroundFadeTicks > 0 &&
              80 > this.backgroundFadeTicks) {
              this.advanceBackgroundFadeIn((byte) -21);
            }
            if (!this.transitioningDialogue &&
              43 > this.frameOpenTicks) {
              if (this.frameOpenTicks == 0) {
                StringNode.playFrameAppearSound(this.photoPan(8192), (byte) 51);
              }
              if (23 == this.frameOpenTicks) {
                ObjectSpriteSet.field_e.playSampleWithPan(ModeProgressSupport.field_a, 100, 3072 * IterableNodeHashTable.field_c / 64, this.actionButtonPan(2));
              }
              this.frameOpenTicks = this.frameOpenTicks + 1;
              if (this.frameOpenTicks == 43 &&
                this.backgroundSound == null) {
                this.backgroundSound = PcmSampleStream.createAtRatePercentQ6(AchievementTracker.field_d, 100, IterableNodeHashTable.field_c * 768 / 64, this.typingPan((byte) 111));
                this.backgroundSound.setLoopCount(-1);
                ObjectSpriteSet.field_e.addSubstream(this.backgroundSound);
              }
            }
            if (this.transitioningDialogue &&
              this.frameOpenTicks > 0) {
              if (this.photoTransitionTicks > 0) {
                this.advancePhotoClosing((byte) -105);
              }
              if (!this.fullWidthScene ||
                this.dialogueIndex >= this.dialogueLines.length) {
                if (this.frameOpenTicks == 43) {
                  StringNode.playFrameAppearSound(this.photoPan(8192), (byte) 51);
                }
                this.frameOpenTicks = this.frameOpenTicks - 1;
              }
            }
            if (this.transitioningDialogue && (0 == this.frameOpenTicks ||
              this.fullWidthScene &&
              this.dialogueIndex < this.dialogueLines.length &&
              this.photoTransitionTicks <= 20)) {
              if (this.dialogueIndex < this.dialogueLines.length) {
                boolean stackIn_60_1 = !(this.textOnLeft);
                this.textOnLeft = stackIn_60_1;
                this.photoIndex = this.photoIndex + 1;
                this.transitioningDialogue = false;
                if (!this.fullWidthScene) {
                  this.wrapDialogueText(43, this.dialogueLines[this.dialogueIndex]);
                  ChatMessage.clearFrameOffsets((byte) -98);
                }
              } else {
                if (BoundedRandomAccessFile.activeSession != null) {
                  this.closeDialogue(2048);
                  return;
                }
                if (this.backgroundFadeTicks <= 0) {
                  this.closeDialogue(2048);
                  return;
                }
                this.advanceBackgroundFadeOut(108);
              }
            }
            if (!this.transitioningDialogue &&
              43 == this.frameOpenTicks) {
              if (this.advancingPhoto) {
                this.advancePhotoClosing((byte) -111);
                if (this.photoTransitionTicks == 20) {
                  this.photoIndex = this.photoIndex + 1;
                  this.advancingPhoto = false;
                }
              } else if (20 > this.photoTransitionTicks) {
                this.advancePhotoOpening(100);
              } else if (this.photoTransitionTicks < 30 &&
                this.tryLoadScenePhoto((byte) 125, this.photoIndex)) {
                this.advancePhotoOpening(100);
              }
            }
            if (null != this.backgroundSound) {
              this.animationTicks = this.animationTicks + 1;
              if (!this.transitioningDialogue &&
                43 <= this.frameOpenTicks &&
                this.revealDelayTicks > 0) {
                int fieldTemp$0 = this.revealDelayTicks - 1;
                this.revealDelayTicks = this.revealDelayTicks - 1;
                if (fieldTemp$0 == 0) {
                  if (this.wrappedLineCount > this.revealedLine) {
                    boolean var2 = false;
                    String var3 = this.wrappedLines[this.revealedLine];
                    while (this.revealedCharacters < var3.length()) {
                      if (var3.regionMatches(this.revealedCharacters, "<photo>", 0, "<photo>".length())) {
                        this.revealedCharacters = this.revealedCharacters + "<photo>".length();
                        this.advancingPhoto = true;
                        continue;
                      }
                      if (var3.regionMatches(this.revealedCharacters, "<title>", 0, "<title>".length())) {
                        this.revealedCharacters = this.revealedCharacters + "<title>".length();
                        this.advanceBackgroundFadeIn((byte) -21);
                        continue;
                      }
                      break;
                    }
                    if (this.revealedCharacters >= var3.length()) {
                      this.revealedLine = this.revealedLine + 1;
                      this.revealedCharacters = 0;
                      this.typingSound.rampVolume(AudioOutput.sampleRate / 200, 0);
                    } else {
                      int fieldTemp$1 = this.revealedCharacters;
                      this.revealedCharacters = this.revealedCharacters + 1;
                      int var4 = var3.charAt(fieldTemp$1);
                      if (var4 == 60) {
                        int var5 = var3.indexOf('>', this.revealedCharacters);
                        String var6 = var3.substring(this.revealedCharacters, var5);
                        this.revealedCharacters = 1 + var5;
                        if (var6.equals("delay")) {
                          var2 = true;
                          var4 = 32;
                        }
                      }
                      if (var4 == 32) {
                        this.typingSound.rampVolume(AudioOutput.sampleRate / 200, 0);
                      } else {
                        this.typingSound.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, 3072 * IterableNodeHashTable.field_c / 64, this.typingPan((byte) 111));
                      }
                    }
                    this.revealDelayTicks = 2;
                    if (this.revealedLine == this.wrappedLineCount) {
                      this.revealDelayTicks = 100;
                    } else if (var2) {
                      this.revealDelayTicks = 50;
                    }
                    boolean decompiledFrameRemainder0 = false;
                  }
                  else {
                    this.dialogueIndex = this.dialogueIndex + 1;
                    if (this.dialogueLines.length <= this.dialogueIndex) {
                      ObjectSpriteSet.field_e.removeSubstream(this.backgroundSound);
                      this.backgroundSound = null;
                      this.animationTicks = 0;
                      if (!this.autoClose) {
                        this.actionLabel = TextFieldValidator.field_i;
                      } else {
                        this.wrapDialogueText(43, (String) null);
                        this.transitioningDialogue = true;
                      }
                    } else {
                      this.revealedLine = this.firstNonemptyLine;
                      this.revealedCharacters = 0;
                      this.revealDelayTicks = 20;
                      this.transitioningDialogue = true;
                      if (this.fullWidthScene) {
                        this.wrapDialogueText(43, this.dialogueLines[this.dialogueIndex]);
                      }
                    }
                  }
                }
              }
            }
            if (this.backgroundSound != null) {
              this.backgroundSound.rampVolumeAndPanQ6(AudioOutput.sampleRate / 200, 768 * IterableNodeHashTable.field_c / 64, this.typingPan((byte) 111));
            }
            IntValueNode.field_j = true;
            return;
          }
        }
    }

    private final int typingPan(byte guard) {
        int var2;
        int var3 = this.revealedLine;
        int var4 = this.revealedCharacters;
        if (guard != 111) {
          return -60;
        }
        if (this.wrappedLineCount <= var3) {
          var3--;
          var4 = this.wrappedLines[var3].length();
        }
        String var8 = this.wrappedLines[var3];
        if (!this.fullWidthScene) {
          int stackIn_12_0 = (!this.textOnLeft) ? 478 : 8;
          var2 = stackIn_12_0;
        } else {
          int var6 = this.actionButtonWidth((byte) 67);
          int var7 = ByteStorage.gameFont.stringWidth(var8);
          var2 = (640 - var7) / 2;
          if (1 == var3 &&
            626 - var6 - 12 < var7 + var2) {
            var2 = 626 - (var6 + 12 + var7);
          }
        }
        String var9 = var8.substring(0, var4);
        var2 = var2 + (ByteStorage.gameFont.stringWidth(var9) + ByteStorage.gameFont.charAdvance('_') / 2);
        return var2 * 12288 / 640 + 2048;
    }

    private final int actionButtonWidth(byte guard) {
        int var2 = 40;
        if (guard != 67) {
          boolean discarded$0 = this.tryLoadScenePhoto((byte) 12, 65);
        }
        int var3 = ByteStorage.gameFont.stringWidth(LevelSelectScreen.field_c) + 9;
        if (var2 < var3) {
          var2 = var3;
        }
        var3 = 9 + ByteStorage.gameFont.stringWidth(TextFieldValidator.field_i);
        if (var2 < var3) {
          var2 = var3;
        }
        return var2;
    }

    private final void drawScenePhoto(int guard) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2 = 0;
        if (guard != 401) {
          this.textOnLeft = false;
        }
        if (this.fullWidthScene) {
          var3 = 320;
          var4 = 67;
          var5 = 240;
          var2 = 15;
        } else {
          var3 = this.textOnLeft ? 401 : 239;
          var5 = 240;
          var4 = 72;
          var2 = !this.textOnLeft ? 15 : 177;
        }
        Sprite var6 = this.photos[this.photoIndices[this.photoIndex]];
        PathPoint.drawPhotoTransition(-1276284702, this.animationTicks, var4, var3, var6, var5, this.photoTransitionTicks, var2);
    }

    private final void drawBackground(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        if (this.backgroundFadeTicks > 0 &&
          SharedSpriteAssets.field_a != null) {
          Sprite var2 = SharedSpriteAssets.field_a;
          for (int var3 = 0; var3 < 480; var3 = var3 + var2.fullHeight) {
            for (int var4 = 0; var4 < 640; var4 = var4 + var2.fullWidth) {
              var2.drawWithBrightness(var4, var3, this.backgroundFadeTicks * 256 / 80);
            }
          }
        } else {
          SoftwareRasterizer.clearFramebuffer();
        }
        if (guard != 80) {
          int discarded$0 = this.hitActionButton(-21, -68, -73);
        }
    }

    private final void advancePhotoClosing(byte guard) {
        if (this.photoTransitionTicks == 30) {
          PcmSampleStream var2 = PcmSampleStream.createAtRatePercentQ6(SavedCompletionFlags.field_g, 100, 3072 * IterableNodeHashTable.field_c / 64, this.photoPan(8192));
          var2.playBackwardFromEnd();
          ObjectSpriteSet.field_e.addSubstream(var2);
        }
        if (guard >= -86) {
          this.backgroundFadeTicks = -93;
        }
        if (20 == this.photoTransitionTicks) {
          PcmSampleStream var2Lifetime1 = PcmSampleStream.createAtRatePercentQ6(QuickChatPhraseDefinition.field_t, 100, 3072 * IterableNodeHashTable.field_c / 64, this.photoPan(8192));
          ObjectSpriteSet.field_e.addSubstream(var2Lifetime1);
        }
        this.photoTransitionTicks = this.photoTransitionTicks - 1;
    }

    private final boolean tryLoadScenePhoto(byte guard, int sceneIndex) {
        if (guard <= 121) {
          this.closeDialogue(-101);
        }
        return this.tryLoadPhoto(this.photoIndices[sceneIndex], 23381, this.photoFileNames[sceneIndex], this.photoGroupNames[sceneIndex]);
    }

    private final void closeDialogue(int guard) {
        if (this.backgroundSound != null) {
          this.backgroundSound.fadeOut(AudioOutput.sampleRate / 200);
        }
        this.typingSound.fadeOut(AudioOutput.sampleRate / 200);
        Bullet.removeFirstDialogue((byte) -22);
        ChatMessage.clearFrameOffsets((byte) -111);
        Js5NetworkRequest.field_E = true;
        SavedDataQuerySupport.field_d = true;
        if (guard != 2048) {
          DialogueScreen.scoreForSubmission(-3, (byte) -83, 42);
        }
        ScoreSubmission.field_p = true;
    }

    private final void advanceBackgroundFadeIn(byte guard) {
        if (guard != -21) {
          int discarded$0 = this.hitActionButton(3, 15, -89);
        }
        if (this.backgroundFadeTicks == 0) {
          ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 6144);
        }
        if (this.backgroundFadeTicks == 50) {
          ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 10240);
        }
        this.backgroundFadeTicks = this.backgroundFadeTicks + 1;
        ThemeAssetSupport.loadTheme(guard + 25, 4);
    }

    final static void writeCookie(byte guard, java.applet.Applet applet, String name, String value, long lifetimeSeconds) {
        try {
          String stackIn_12_2 = null;
          String stackIn_15_2 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          String var7Lifetime4;
          try {
            try {
              String var8 = applet.getParameter("cookiehost");
              String var7 = var8;
              String var7Lifetime1 = var8;
              if (guard <= 59) {
                return;
              }
              String var9 = name + "=" + value + "; version=1; path=/; domain=" + var8;
              String var7Lifetime2 = var9;
              String var7Lifetime3 = var9;
              if (lifetimeSeconds >= 0L) {
                var7Lifetime4 = var9 + "; Expires=" + EmailCredentials.formatGmtTimestamp(-100, MonotonicClockSupport.monotonicMillis(128) + lifetimeSeconds * 1000L) + "; Max-Age=" + lifetimeSeconds;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              JavaScriptBridge.evaluateScript((byte) -111, applet, "document.cookie=\"" + var7Lifetime4 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_11_0 = var6_ref;
            StringBuilder stackIn_11_1 = new StringBuilder().append("tj.G(").append(guard).append(',');
            if (applet == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (name == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (value == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(lifetimeSeconds).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean tryLoadPhoto(int photoSlot, int guard, String fileName, String groupName) {
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (null == this.photos[photoSlot]) {
            this.photos[photoSlot] = MembershipPromotionScreen.loadNamedSprite(groupName, IndexedSpriteState.field_j, fileName, true);
            if (this.photos[photoSlot] == null) {
              return false;
            }
            SpriteOffset.a((byte) 44);
          }
          if (guard == 23381) {
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("tj.B(").append(photoSlot).append(',').append(guard).append(',');
          if (fileName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (groupName == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void advancePhotoOpening(int guard) {
        if (this.photoTransitionTicks == 0) {
          ObjectSpriteSet.field_e.playSampleWithPan(QuickChatPhraseDefinition.field_t, 100, 3072 * IterableNodeHashTable.field_c / 64, this.photoPan(8192));
        }
        if (this.photoTransitionTicks == 20) {
          ObjectSpriteSet.field_e.playSampleWithPan(SavedCompletionFlags.field_g, 100, IterableNodeHashTable.field_c * 3072 / 64, this.photoPan(8192));
        }
        if (guard != 100) {
          return;
        }
        this.photoTransitionTicks = this.photoTransitionTicks + 1;
    }

    final static int[] rotationTransformQ16(byte guard, int firstAngle, int secondAngle) {
        int var3 = AccountNoticeKind.sinQ16(10758, secondAngle);
        int var4 = EditableTextWidget.cosQ16(-127, secondAngle);
        int var5 = AccountNoticeKind.sinQ16(10758, firstAngle);
        int var6 = EditableTextWidget.cosQ16(-126, firstAngle);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        if (guard != 82) {
          field_k = (String) null;
        }
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    private final int hitActionButton(int guard, int x, int y) {
        int var4 = this.actionButtonWidth((byte) 67);
        int var5 = -104 % ((guard + 17) / 56);
        if (this.fullWidthScene) {
          if (x >= 626 - var4 &&
            x < 626 &&
            y >= 448 &&
            y < 475) {
            return 0;
          }
        } else if (!this.textOnLeft) {
          if (x >= 632 - var4 &&
            x < 632 &&
            382 <= y &&
            y < 409) {
            return 0;
          }
        } else if (-var4 + 162 <= x &&
          x < 162 &&
          y >= 382 &&
          y < 409) {
          return 0;
        }
        return -1;
    }

    private DialogueScreen(Sprite[] photos, String[] dialogueLines, boolean fullWidthScene) {
        int stackIn_3_2 = 0;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        this.dialogueIndex = 0;
        this.wrappedLineCount = 0;
        this.revealedCharacters = 0;
        this.revealedLine = 0;
        this.revealDelayTicks = 40;
        int stackIn_2_1 = 17;
        stackIn_3_2 = (!SelfDestructEffects.field_k) ? (0) : (10);
        this.wrappedLines = new String[stackIn_2_1 + stackIn_3_2];
        this.animationTicks = 0;
        this.backgroundFadeTicks = 0;
        this.autoClose = true;
        this.firstNonemptyLine = 0;
        this.actionLabel = LevelSelectScreen.field_c;
        try {
          ChatMessage.clearFrameOffsets((byte) -103);
          this.dialogueLines = dialogueLines;
          boolean stackIn_7_1 = (fullWidthScene);
          this.fullWidthScene = stackIn_7_1;
          this.photos = photos;
          this.typingSound = PcmSampleStream.createAtRatePercent(QuickChatPhraseCache.field_i, 100, 0);
          this.typingSound.setLoopCount(-1);
          ObjectSpriteSet.field_e.addSubstream(this.typingSound);
          this.input = new MenuInputState(1);
          this.input.setPointerSelection(this.hitActionButton(-77, GzipDecoder.field_d, UiContainer.field_y), true, 4767999);
          this.wrapDialogueText(43, this.dialogueLines[this.dialogueIndex]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var4;
          StringBuilder stackIn_11_1 = new StringBuilder().append("tj.<init>(");
          if (photos == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (dialogueLines == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(fullWidthScene).append(')').toString());
        }
    }

    static {
        field_G = "Friends can be added in multiplayer<nbsp>games";
        field_k = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
