/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryPopup extends UiComponent {
    static RgbSprite field_Sb;
    static String field_Wb;
    private UiComponent inputText;
    static ContentTransitionPhase contentFadingIn;
    private StringBuilder nameBuffer;
    private UiComponent prompt;
    private int completionState;
    static int field_Yb;
    static RgbSprite[] chocLeverSprites;
    static ResourceArchive field_Rb;

    final int updateAndPollNameInput(boolean inputEnabled, byte obfuscationGuard) {
        StringBuilder ignoredCharacterAppend = null;
        StringBuilder ignoredOpeningBracketAppend = null;
        StringBuilder ignoredHashAppend = null;
        StringBuilder ignoredClosingBracketAppend = null;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard < 88) {
          return 77;
        }
        this.updateRoot(inputEnabled, -15211);
        if (!inputEnabled) {
          this.inputText.text = this.nameBuffer.toString();
          if (inputEnabled &&
            BackgroundScene.pressedButton != 0 &&
            this.pressedButton == 0) {
            this.completionState = 1;
          }
          return this.completionState;
        }
        while (true) {
          if (!jl.pollKeyEvent((byte) 5)) {
            this.inputText.text = this.nameBuffer.toString();
            if (!inputEnabled) {
              return this.completionState;
            }
            if (BackgroundScene.pressedButton == 0) {
              return this.completionState;
            }
            if (this.pressedButton != 0) {
              return this.completionState;
            }
            this.completionState = 1;
            return this.completionState;
          }
          if (MeshAttributeRecord.currentKeyCode == 85 &&
            this.nameBuffer.length() > 0) {
            MessageScreen.resizeAndFillTextBuffer(' ', this.nameBuffer, -1 + this.nameBuffer.length(), false);
          }
          if (nk.canAppendNameCharacter(go.currentKeyCharacter, (CharSequence) ((Object) this.nameBuffer), false)) {
            ignoredCharacterAppend = this.nameBuffer.append(go.currentKeyCharacter);
          } else {
            if (this.nameBuffer.length() == 0 &&
              go.currentKeyCharacter == 91) {
              ignoredOpeningBracketAppend = this.nameBuffer.append(go.currentKeyCharacter);
            } else {
              if (this.nameBuffer.length() == 1 &&
                go.currentKeyCharacter == 35) {
                ignoredHashAppend = this.nameBuffer.append(go.currentKeyCharacter);
              } else {
                if (go.currentKeyCharacter == 93) {
                  ignoredClosingBracketAppend = this.nameBuffer.append(go.currentKeyCharacter);
                }
              }
            }
          }
          if (MeshAttributeRecord.currentKeyCode != 84) {
            if (MeshAttributeRecord.currentKeyCode == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (0 >= this.nameBuffer.length()) {
          return 1;
        }
        this.text = this.nameBuffer.toString();
        return 2;
    }

    final boolean handleNormalizedNameKey(int cancelKeyCode) {
        StringBuilder ignoredSeparatorAppend = null;
        StringBuilder ignoredLetterAppend = null;
        StringBuilder ignoredDigitAppend = null;
        StringBuilder ignoredEmptySeparatorAppend = null;
        StringBuilder ignoredEmptyLetterAppend = null;
        StringBuilder ignoredEmptyDigitAppend = null;
        StringBuilder ignoredBackspaceSeparatorAppend = null;
        StringBuilder ignoredBackspaceLetterAppend = null;
        StringBuilder ignoredBackspaceDigitAppend = null;
        int normalizedCharacter;
        int emptyNormalizedCharacter;
        int backspaceNormalizedCharacter;
        if (this.completionState != 0) {
          return false;
        }
        if (MeshAttributeRecord.currentKeyCode != 85) {
          if (12 > this.nameBuffer.length()) {
            normalizedCharacter = Character.toLowerCase(go.currentKeyCharacter);
            if (normalizedCharacter == 32) {
              normalizedCharacter = 95;
            }
            if (95 == normalizedCharacter &&
              0 < this.nameBuffer.length()) {
              ignoredSeparatorAppend = this.nameBuffer.append((char) normalizedCharacter);
            }
            if (StateIconLabel.isAsciiLetter(true, (char) normalizedCharacter)) {
              ignoredLetterAppend = this.nameBuffer.append((char) normalizedCharacter);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.nameBuffer.length() > 0) {
                  this.text = this.nameBuffer.toString();
                  this.completionState = 2;
                } else {
                  this.completionState = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode != cancelKeyCode) {
                return true;
              }
              this.completionState = 1;
              return true;
            }
            if (WidgetTheme.isAsciiDigit((char) normalizedCharacter, (byte) 83)) {
              ignoredDigitAppend = this.nameBuffer.append((char) normalizedCharacter);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.nameBuffer.length() > 0) {
                  this.text = this.nameBuffer.toString();
                  this.completionState = 2;
                } else {
                  this.completionState = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
                this.completionState = 1;
              }
              return true;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.nameBuffer.length() <= 0) {
              this.completionState = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.completionState = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
            this.completionState = 1;
          }
          return true;
        }
        if (this.nameBuffer.length() <= 0) {
          if (12 > this.nameBuffer.length()) {
            emptyNormalizedCharacter = Character.toLowerCase(go.currentKeyCharacter);
            if (emptyNormalizedCharacter == 32) {
              emptyNormalizedCharacter = 95;
            }
            if (95 == emptyNormalizedCharacter &&
              0 < this.nameBuffer.length()) {
              ignoredEmptySeparatorAppend = this.nameBuffer.append((char) emptyNormalizedCharacter);
            }
            if (StateIconLabel.isAsciiLetter(true, (char) emptyNormalizedCharacter)) {
              ignoredEmptyLetterAppend = this.nameBuffer.append((char) emptyNormalizedCharacter);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.nameBuffer.length() > 0) {
                  this.text = this.nameBuffer.toString();
                  this.completionState = 2;
                } else {
                  this.completionState = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode != cancelKeyCode) {
                return true;
              }
              this.completionState = 1;
              return true;
            }
            if (WidgetTheme.isAsciiDigit((char) emptyNormalizedCharacter, (byte) 83)) {
              ignoredEmptyDigitAppend = this.nameBuffer.append((char) emptyNormalizedCharacter);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.nameBuffer.length() > 0) {
                  this.text = this.nameBuffer.toString();
                  this.completionState = 2;
                } else {
                  this.completionState = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
                this.completionState = 1;
              }
              return true;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.nameBuffer.length() <= 0) {
              this.completionState = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.completionState = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
            this.completionState = 1;
          }
          return true;
        }
        MessageScreen.resizeAndFillTextBuffer(' ', this.nameBuffer, -1 + this.nameBuffer.length(), false);
        if (12 <= this.nameBuffer.length()) {
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.nameBuffer.length() <= 0) {
              this.completionState = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.completionState = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode != cancelKeyCode) {
            return true;
          }
          this.completionState = 1;
          return true;
        }
        backspaceNormalizedCharacter = Character.toLowerCase(go.currentKeyCharacter);
        if (backspaceNormalizedCharacter == 32) {
          backspaceNormalizedCharacter = 95;
        }
        if (95 == backspaceNormalizedCharacter &&
          0 < this.nameBuffer.length()) {
          ignoredBackspaceSeparatorAppend = this.nameBuffer.append((char) backspaceNormalizedCharacter);
        }
        if (StateIconLabel.isAsciiLetter(true, (char) backspaceNormalizedCharacter)) {
          ignoredBackspaceLetterAppend = this.nameBuffer.append((char) backspaceNormalizedCharacter);
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.nameBuffer.length() > 0) {
              this.text = this.nameBuffer.toString();
              this.completionState = 2;
            } else {
              this.completionState = 1;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
            this.completionState = 1;
          }
          return true;
        }
        if (WidgetTheme.isAsciiDigit((char) backspaceNormalizedCharacter, (byte) 83)) {
          ignoredBackspaceDigitAppend = this.nameBuffer.append((char) backspaceNormalizedCharacter);
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.nameBuffer.length() <= 0) {
              this.completionState = 1;
              if (MeshAttributeRecord.currentKeyCode == cancelKeyCode) {
                this.completionState = 1;
              }
              return true;
            }
            this.text = this.nameBuffer.toString();
            this.completionState = 2;
          }
          if (MeshAttributeRecord.currentKeyCode != cancelKeyCode) {
            return true;
          }
          this.completionState = 1;
          return true;
        }
        if (MeshAttributeRecord.currentKeyCode == 84) {
          if (this.nameBuffer.length() <= 0) {
            this.completionState = 1;
          } else {
            this.text = this.nameBuffer.toString();
            this.completionState = 2;
          }
        }
        if (MeshAttributeRecord.currentKeyCode != cancelKeyCode) {
          return true;
        }
        this.completionState = 1;
        return true;
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          contentFadingIn = null;
          chocLeverSprites = null;
          return;
        }
        NameEntryPopup.d((byte) -20);
        field_Rb = null;
        field_Sb = null;
        field_Wb = null;
        contentFadingIn = null;
        chocLeverSprites = null;
    }

    final static boolean d(byte param0) {
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (CheckboxWidgetRenderer.field_b == null) {
            CheckboxWidgetRenderer.field_b = LevelPackLoader.requestAchievementMask((byte) 107, 4);
          }
          if (!CheckboxWidgetRenderer.field_b.complete) {
            var1_int = -62 / ((param0 + 18) / 47);
            return false;
          }
          var12 = SecondaryHashTable.earnedAchievementMask;
          var10 = var12;
          var5 = var10;
          var1 = var5;
          var16 = CheckboxWidgetRenderer.field_b.achievementMask;
          for (var3 = 0; 8 > var3; var3++) {
            var5[var3] = LevelSelectScreen.d(var12[var3], var16[var3]);
          }
          var13 = pl.pendingAchievementMask;
          var11 = var13;
          var7 = var11;
          var1Lifetime1 = var7;
          var17 = CheckboxWidgetRenderer.field_b.achievementMask;
          var9 = 0;
          var3Lifetime1 = var9;
          while (var9 < 8) {
            var7[var9] = ik.a(var13[var9], ~var17[var9]);
            var9++;
          }
          CheckboxWidgetRenderer.field_b = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "gq.B(" + param0 + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        if (~param0 > param1) {
          return (1 + param0) % 4 == 0 ? true : false;
        }
        if (param0 < 1582) {
          return param0 % 4 == 0 ? true : false;
        }
        if (param0 % 4 != 0) {
          return false;
        }
        if (0 != param0 % 100) {
          return true;
        }
        if (param0 % 400 == 0) {
          return true;
        }
        return false;
    }

    NameEntryPopup(int anchorX, int anchorY, int anchorWidth, int anchorHeight, String prompt, UiComponent styleTemplate, UiComponent promptStyle, UiComponent inputStyle) {
        super(0L, styleTemplate);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int promptWidth = 0;
        RuntimeException var9 = null;
        int popupWidth = 0;
        int popupHeight = 0;
        int popupX = 0;
        int popupY = 0;
        this.completionState = 0;
        try {
          this.prompt = new UiComponent(0L, promptStyle, prompt);
          this.addChild(this.prompt, 0);
          this.inputText = new UiComponent(0L, inputStyle);
          this.inputText.textColor = 16764006;
          this.addChild(this.inputText, 0);
          this.inputText.textSuffix = "|";
          this.nameBuffer = new StringBuilder(12);
          promptWidth = this.prompt.getContentWidth(81);
          this.prompt.setBounds(np.uiRowHeight, 3, 5, promptWidth, (byte) 64);
          this.inputText.setBounds(np.uiRowHeight, np.uiRowHeight + 3, 5, promptWidth, (byte) 64);
          popupWidth = 10 + promptWidth;
          popupHeight = 3 + np.uiRowHeight * 2 + 3;
          popupX = OptionsScreen.choosePopupX(-1, popupWidth, anchorX, anchorWidth);
          popupY = ContextMenu.choosePopupY(popupHeight, anchorY, anchorHeight, 121);
          this.setBounds(popupHeight, popupY, popupX, popupWidth, (byte) 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("gq.<init>(").append(anchorX).append(',').append(anchorY).append(',').append(anchorWidth).append(',').append(anchorHeight).append(',');
          if (prompt == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (styleTemplate == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (promptStyle == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (inputStyle == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Wb = "Reject";
        contentFadingIn = new ContentTransitionPhase();
    }
}
