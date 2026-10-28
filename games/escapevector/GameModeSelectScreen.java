/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GameModeSelectScreen {
    static int field_i;
    private LegacyButton[] modeButtons;
    MenuInputState input;
    static Sprite[] field_g;
    private int[] actionCodes;
    static String[] field_e;
    static String field_h;
    private LegacyButton[] footerButtons;
    int accountStateIndex;

    private final int selectedButtonIndex(int guard, LegacyButton[] buttons) {
        String stackIn_15_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var3_int = this.input.selectedIndex;
          if (guard != 6481) {
            int stackIn_3_0 = -57;
            return stackIn_3_0;
          }
          int var4 = 0;
          while (true) {
            if (var4 >= buttons.length) {
              int stackIn_11_0 = -1;
              return stackIn_11_0;
            }
            LegacyButton var5 = buttons[var4];
            if (var5.actionId != var3_int) {
              var4++;
              continue;
            }
            break;
          }
          int stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var3;
          StringBuilder stackIn_14_1 = new StringBuilder().append("pf.J(").append(guard).append(',');
          if (buttons == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int centeredButtonBottom(int guard, int top, LegacyButton[] buttons, int bottom) {
        String stackIn_7_2 = null;
        try {
          if (guard != 4) {
            LegacyButton[] var9 = (LegacyButton[]) null;
            int discarded$1 = this.selectedButtonIndex(-84, (LegacyButton[]) null);
          }
          int var5_int = bottom - top;
          int var6 = this.maximumButtonHeight((byte) -106, buttons);
          int var7 = (var5_int - var6) / 2;
          int var8 = bottom - var7;
          int stackIn_3_0 = var8;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("pf.F(").append(guard).append(',').append(top).append(',');
          if (buttons == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(bottom).append(')').toString());
        }
    }

    private final int selectedGameMode(byte guard) {
        if (guard != 89) {
          boolean discarded$0 = this.handleKeyboard((byte) -26);
        }
        int var2 = this.selectedButtonIndex(6481, this.modeButtons);
        if (var2 == 0) {
          return 1;
        }
        if (1 == var2) {
          return 0;
        }
        if (2 == var2) {
          return 2;
        }
        if (var2 == 3) {
          return 3;
        }
        return -1;
    }

    final void draw(int guard) {
        if (guard != 100) {
          this.footerButtons = (LegacyButton[]) null;
        }
        SoftwareRasterizer.clearFramebuffer();
        SelfDestructEffects.drawMenuEdges(guard - 98);
        MenuTitleRenderSupport.drawTitles(4);
        this.drawButtons(this.modeButtons, (byte) -116);
        this.drawButtons(this.footerButtons, (byte) -109);
    }

    private final int hitTest(int guard, int y, int x) {
        if (guard != 1) {
          field_h = (String) null;
        }
        int var4 = this.hitButtons(y, this.modeButtons, x, 3);
        if (var4 >= 0) {
          return var4;
        }
        var4 = this.hitButtons(y, this.footerButtons, x, 3);
        if (var4 >= 0) {
          return var4;
        }
        return -1;
    }

    private final boolean selectPrevious(int guard, LegacyButton[] buttons, LegacyButton[] precedingRow) {
        int var5 = 0;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          if (guard <= 7) {
            return true;
          }
          int var4_int = this.selectedButtonIndex(6481, buttons);
          if (var4_int < 0) {
            return false;
          }
          if (var4_int == 0) {
            var5 = precedingRow[precedingRow.length - 1].actionId;
            this.input.selectFromKeyboard(false, var5);
          } else {
            var5 = buttons[var4_int - 1].actionId;
            this.input.selectFromKeyboard(false, var5);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pf.P(").append(guard).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (precedingRow == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int buttonPan(byte guard, LegacyButton button) {
        String stackIn_5_2 = null;
        try {
          int var3_int = button.width / 2 + button.x;
          int var4 = 16384 * var3_int / 640;
          int var5 = 51 % ((guard - 56) / 58);
          int stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("pf.EA(").append(guard).append(',');
          if (button == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final int[] createModeButtons(int firstAction, int revealTick, BinaryBitmapFont font, byte guard) {
        String[] var5 = null;
        int[] var6 = null;
        Sprite[] var7 = null;
        int[] var8 = null;
        String stackIn_10_2 = null;
        try {
          if (guard < 91) {
            BinaryBitmapFont var11 = (BinaryBitmapFont) null;
            int[] discarded$1 = this.createModeButtons(20, -91, (BinaryBitmapFont) null, (byte) -102);
          }
          if (UiContainer.hasMembership((byte) 127)) {
            var5 = AlternateUsernameCredentials.field_s;
            var6 = new int[]{1, 0, 2, 3};
            var7 = BufferedSocket.field_g;
            var8 = new int[]{0, 1, 2, 3};
          } else {
            var8 = new int[]{0, 1};
            var6 = new int[]{1, 0};
            var7 = new Sprite[]{BufferedSocket.field_g[0], BufferedSocket.field_g[1]};
            var5 = new String[]{AlternateUsernameCredentials.field_s[0], AlternateUsernameCredentials.field_s[1]};
          }
          int var9 = var5.length;
          int[] var15 = this.actionRange(firstAction, true, var9);
          this.layoutModeButtons(3390, revealTick, var5, var7, var15, font, var8);
          int[] stackIn_6_0 = var6;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5_ref;
          StringBuilder stackIn_9_1 = new StringBuilder().append("pf.S(").append(firstAction).append(',').append(revealTick).append(',');
          if (font == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int[] createFooterButtons(BinaryBitmapFont font, int guard, int revealTick, int firstAction) {
        int[] var8 = null;
        String[] var9 = null;
        int[] var10 = null;
        String stackIn_10_2 = null;
        try {
          int var5_int = 0;
          int var6 = 640;
          int var7 = 442;
          if (!AccountSessionSupport.isGuestSession(-96)) {
            var10 = new int[]{0};
            var8 = new int[]{4};
            var9 = new String[]{GameKeyHandler.field_a};
          } else {
            var9 = new String[]{IntrusiveDeque.field_e, GameKeyHandler.field_a};
            var10 = new int[]{0, 1};
            var8 = new int[]{3, 4};
          }
          int var11 = var9.length;
          int[] var20 = this.actionRange(firstAction, true, var11);
          if (guard < 62) {
            field_e = (String[]) null;
          }
          int[] var21 = TextLayoutLine.createSpacedPositions(revealTick, firstAction, var11, (byte) -17);
          this.footerButtons = DynamicTerrainRenderer.createButtonRow(var6, var20, var7, var5_int, font, var9, var10, false, var21);
          int[] stackIn_6_0 = var8;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("pf.CA(");
          if (font == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(revealTick).append(',').append(firstAction).append(')').toString());
        }
    }

    private final void drawButtons(LegacyButton[] buttons, byte guard) {
        String stackIn_13_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          LegacyButton[] var9 = buttons;
          LegacyButton[] var3 = var9;
          for (int var4 = 0; var4 < var9.length; var4++) {
            LegacyButton var5 = var9[var4];
            boolean stackIn_6_0 = !(~this.input.selectedIndex != ~var5.actionId);
            boolean var6 = stackIn_6_0;
            var5.draw(-16383, (var6));
          }
          if (guard > -39) {
            BinaryBitmapFont var8 = (BinaryBitmapFont) null;
            int[] discarded$1 = this.createModeButtons(28, -16, (BinaryBitmapFont) null, (byte) 69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var3_ref;
          StringBuilder stackIn_12_1 = new StringBuilder().append("pf.H(");
          if (buttons == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(guard).append(')').toString());
        }
    }

    private final boolean handleKeyboard(byte guard) {
        int var5 = EscapeVector.obfuscationControl;
        boolean var2 = false;
        int var3 = -14 % ((guard - 15) / 58);
        while (AccountRequestDialog.pollKeyEvent(-98)) {
          this.input.handleKeyWithoutNavigation(113);
          if (PasswordValidator.field_n == 97 ||
            PasswordValidator.field_n == 99) {
            boolean var4 = (this.selectNext(-101, this.modeButtons, this.footerButtons));
            if (!var4) {
              var4 = (this.selectNext(-101, this.footerButtons, this.modeButtons));
            }
            if (!var4) {
              this.input.selectFromKeyboard(false, 0);
            }
          }
          if (96 == PasswordValidator.field_n ||
            PasswordValidator.field_n == 98) {
            boolean var4Lifetime1 = (this.selectPrevious(33, this.modeButtons, this.footerButtons));
            if (!var4Lifetime1) {
              var4Lifetime1 = (this.selectPrevious(84, this.footerButtons, this.modeButtons));
            }
            if (!var4Lifetime1) {
              this.input.selectFromKeyboard(false, 0);
            }
          }
          if (PasswordValidator.field_n == 13) {
            TextLayout.field_b = false;
            ArchiveLoadTask.showMainMenu((var2), -87);
          }
          if (this.handleActivation((var2), (byte) 91)) {
            return true;
          }
        }
        return false;
    }

    final void update(int guard) {
        this.updateRevealEffects((byte) 16);
        if (this.handleKeyboard((byte) 94)) {
          return;
        }
        if (guard <= 61) {
          field_h = (String) null;
        }
        int var2 = this.hitTest(1, UiContainer.field_y, GzipDecoder.field_d);
        int var3 = this.hitTest(1, LoginDialog.field_ob, SessionCounterState.field_c);
        this.input.updatePointer(var3, (byte) 121, var2);
        boolean discarded$0 = this.handleActivation(true, (byte) 91);
    }

    private final int hitButtons(int y, LegacyButton[] buttons, int x, int guard) {
        LegacyButton var7 = null;
        String stackIn_14_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          LegacyButton[] var10 = buttons;
          LegacyButton[] var5 = var10;
          int var6 = 0;
          while (true) {
            if (var6 >= var10.length) {
              if (guard != 3) {
                LegacyButton[] var9 = (LegacyButton[]) null;
                int discarded$1 = this.selectedButtonIndex(-122, (LegacyButton[]) null);
              }
              int stackIn_10_0 = -1;
              return stackIn_10_0;
            }
            var7 = var10[var6];
            if (!var7.hitTest((byte) 65, x, y)) {
              var6++;
              continue;
            }
            break;
          }
          int stackIn_5_0 = var7.actionId;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pf.AA(").append(y).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(x).append(',').append(guard).append(')').toString());
        }
    }

    private final void playCurrentSelectionSound(int guard) {
        Throwable decompiledCaughtException = null;
        int var2 = 84 / ((59 - guard) / 54);
        if (!this.input.selectionChanged) {
          return;
        }
        int var3 = 100;
        int var4 = 1536 * IterableNodeHashTable.field_c / 64;
        Object var5 = ObjectSpriteSet.field_e;
        synchronized (var5) {
          this.playSelectionSound(this.modeButtons, (byte) -23, var3, var4);
          this.playSelectionSound(this.footerButtons, (byte) -23, var3, var4);
        }
        return;
    }

    private final void openGuestLogin(int guard) {
        GuestLoginSupport.beginAccountLogin(true);
        LoginHandshakeSupport.field_d = 0;
        ChatMessage.clearFrameOffsets((byte) -113);
        if (guard != -15268) {
          return;
        }
    }

    final static void advanceMenuEdgeSegments(byte guard) {
        boolean stackIn_78_0 = false;
        boolean stackIn_84_0 = false;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (LoginIdentifierSupport.field_e < 100 &&
            Math.random() < 0.05 * (double)(100 - LoginIdentifierSupport.field_e) / 100.0) {
            MenuEdgeSegment var10 = new MenuEdgeSegment();
            MenuEdgeSegment var11 = var10;
            if (Math.random() < 0.5) {
              var11.direction = 1;
              var11.x = 0;
            } else {
              var10.direction = -1;
              var10.x = 640;
            }
            var11.y = 0 + (int)(81.0 * Math.random()) * 6;
            var11.targetLength = 50 + (int)(100.0 * Math.random());
            var11.lifetimeTicks = (int)(Math.random() * 200.0) + 100;
            int var2 = (int)(7.0 * Math.random());
            if (var2 < 0) {
              var2 = 0;
            } else if (var2 > 6) {
              var2 = 6;
            }
            var11.lowerBranchBudget = -var2 + 6;
            var11.upperBranchBudget = var2;
            TrackerGainSupport.field_c.addLast(-12328, var11);
            if (var11.lifetimeTicks >= 100) {
              LoginIdentifierSupport.field_e = LoginIdentifierSupport.field_e + 1;
            }
          }
          if (guard > -94) {
            GameModeSelectScreen.advanceMenuEdgeSegments((byte) 116);
          }
          MenuEdgeSegment var1 = (MenuEdgeSegment) (TrackerGainSupport.field_c.first(false));
          while (var1 != null) {
            if (var1.lifetimeTicks > var1.ageTicks) {
              var1.ageTicks = var1.ageTicks + 1;
              if (var1.length >= var1.targetLength) {
                var1.x = var1.x + var1.direction;
              } else {
                var1.length = var1.length + 1;
              }
            } else if (var1.length > 0) {
              var1.length = var1.length - 1;
              var1.x = var1.x + var1.direction;
            } else {
              var1.unlink((byte) -33);
            }
            if (var1.direction < 0 &&
              var1.x <= 0) {
              var1.unlink((byte) -26);
            }
            if (0 < var1.direction &&
              640 <= var1.x) {
              var1.unlink((byte) -69);
            }
            if (!var1.isLinked((byte) 48) &&
              100 <= var1.lifetimeTicks) {
              LoginIdentifierSupport.field_e = LoginIdentifierSupport.field_e - 1;
            }
            int var2Lifetime1 = (var1.lifetimeTicks - 50) / 20;
            for (int var3 = 0; var3 < var2Lifetime1; var3++) {
              if (~(-(3 * (-var3 + var2Lifetime1)) + var1.lifetimeTicks) == ~var1.ageTicks) {
                int var4 = var1.x + var1.direction * (var1.length + (var1.lifetimeTicks - var1.ageTicks));
                int var5 = var4;
                if (var1.direction > 0) {
                  var5 += 5;
                }
                var5 = 2 + (var5 - 2) / 6 * 6;
                var5 = var5 - (var2Lifetime1 - var3) * (6 * var1.direction);
                int var6_int = (int)(Math.random() * (double)var1.upperBranchBudget);
                if (var6_int > 0) {
                  MenuEdgeSegment var7_ref_oh = new MenuEdgeSegment();
                  var7_ref_oh.x = var5;
                  var7_ref_oh.length = 1;
                  var7_ref_oh.targetLength = 1 + 6 * var6_int;
                  var7_ref_oh.lifetimeTicks = 50;
                  var7_ref_oh.y = var1.y + 1;
                  var7_ref_oh.direction = -1;
                  QuickChatPhraseDefinition.field_u.addLast(-12328, var7_ref_oh);
                }
                int var7 = (int)(Math.random() * (double)var1.lowerBranchBudget);
                if (0 < var7) {
                  MenuEdgeSegment var8_ref_oh = new MenuEdgeSegment();
                  var8_ref_oh.length = 1;
                  var8_ref_oh.y = var1.y;
                  var8_ref_oh.lifetimeTicks = 50;
                  var8_ref_oh.targetLength = 1 + 6 * var7;
                  var8_ref_oh.direction = 1;
                  var8_ref_oh.x = var5;
                  QuickChatPhraseDefinition.field_u.addLast(-12328, var8_ref_oh);
                }
              }
            }
            var1 = (MenuEdgeSegment) (TrackerGainSupport.field_c.next((byte) 70));
          }
          MenuEdgeSegment var1Lifetime1 = (MenuEdgeSegment) (QuickChatPhraseDefinition.field_u.first(false));
          while (var1Lifetime1 != null) {
            boolean var2Lifetime2 = false;
            int stackIn_55_0 = ~var1Lifetime1.ageTicks;
            int stackIn_55_1 = ~var1Lifetime1.lifetimeTicks;
            if (stackIn_55_0 > stackIn_55_1) {
              if (var1Lifetime1.length < var1Lifetime1.targetLength) {
                var1Lifetime1.length = var1Lifetime1.length + 1;
              }
              var1Lifetime1.ageTicks = var1Lifetime1.ageTicks + 1;
              if (var1Lifetime1.length % 6 == 0) {
                var2Lifetime2 = true;
              }
            } else if (var1Lifetime1.length <= 0) {
              var1Lifetime1.unlink((byte) -59);
            } else {
              var1Lifetime1.y = var1Lifetime1.y + var1Lifetime1.direction;
              var1Lifetime1.length = var1Lifetime1.length - 1;
            }
            if (var1Lifetime1.direction < 0 &&
              var1Lifetime1.x <= 0) {
              var1Lifetime1.unlink((byte) -56);
            }
            if (var1Lifetime1.direction > 0 &&
              480 <= var1Lifetime1.x) {
              var1Lifetime1.unlink((byte) -113);
            }
            if (var2Lifetime2) {
              if (LoginIdentifierSupport.field_e < 100) {
                stackIn_78_0 = (Math.random() < (double)((500 - LoginIdentifierSupport.field_e * 5) / 100));
              } else {
                stackIn_78_0 = false;
              }
              boolean var3Lifetime1 = stackIn_78_0;
              if (LoginIdentifierSupport.field_e < 100) {
                stackIn_84_0 = (Math.random() < (double)((100 - LoginIdentifierSupport.field_e) * 5 / 100));
              } else {
                stackIn_84_0 = false;
              }
              boolean var4Lifetime1 = stackIn_84_0;
              int var5Lifetime1 = var1Lifetime1.y + var1Lifetime1.length * var1Lifetime1.direction;
              if (var1Lifetime1.direction < 0) {
                var5Lifetime1--;
              }
              MenuEdgeSegment var6 = new MenuEdgeSegment();
              var6.y = var5Lifetime1;
              var6.direction = -1;
              var6.x = 1 + var1Lifetime1.x;
              var6.targetLength = 50 + (int)(Math.random() * 100.0);
              if (!var3Lifetime1) {
                var6.lifetimeTicks = (int)(Math.random() * 40.0) + 10;
              } else {
                var6.lifetimeTicks = 100 + (int)(200.0 * Math.random());
                int var7Lifetime1 = (int)(Math.random() * 7.0);
                if (!(var7Lifetime1 >= 0)) {
                  var7Lifetime1 = 0;
                } else if (6 < var7Lifetime1) {
                  var7Lifetime1 = 6;
                }
                var6.upperBranchBudget = var7Lifetime1;
                var6.lowerBranchBudget = -var7Lifetime1 + 6;
              }
              TrackerGainSupport.field_c.addLast(-12328, var6);
              if (100 <= var6.lifetimeTicks) {
                LoginIdentifierSupport.field_e = LoginIdentifierSupport.field_e + 1;
              }
              MenuEdgeSegment var12 = new MenuEdgeSegment();
              var12.x = var1Lifetime1.x;
              var12.y = var5Lifetime1;
              var12.direction = 1;
              var12.targetLength = 50 + (int)(Math.random() * 100.0);
              if (!var4Lifetime1) {
                var12.lifetimeTicks = 10 + (int)(40.0 * Math.random());
              } else {
                var12.lifetimeTicks = 100 + (int)(200.0 * Math.random());
                int var8 = (int)(Math.random() * 7.0);
                if (!(var8 >= 0)) {
                  var8 = 0;
                } else if (var8 > 6) {
                  var8 = 6;
                }
                var12.upperBranchBudget = var8;
                var12.lowerBranchBudget = 6 - var8;
              }
              TrackerGainSupport.field_c.addLast(-12328, var12);
              if (100 <= var12.lifetimeTicks) {
                LoginIdentifierSupport.field_e = LoginIdentifierSupport.field_e + 1;
              }
            }
            var1Lifetime1 = (MenuEdgeSegment) (QuickChatPhraseDefinition.field_u.next((byte) 70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1_ref), "pf.C(" + guard + ')');
        }
    }

    private final void playButtonRevealSound(int interval, int guard, LegacyButton[] buttons, int firstTick, int ratePercent, int volume) {
        int var7_int = LoginHandshakeSupport.field_d;
        if (firstTick > var7_int) {
          return;
        }
        if (var7_int % interval != 0) {
          return;
        }
        int var8 = firstTick + interval * (-1 + buttons.length);
        if (guard != 6) {
          this.accountStateIndex = 120;
        }
        if (var7_int > var8) {
          return;
        }
        int var9 = (var7_int - firstTick) / interval;
        if (var9 < 0 ||
          var9 >= buttons.length) {
          return;
        }
        try {
          LegacyButton var10 = buttons[var9];
          int var11 = this.buttonPan((byte) 120, var10);
          ObjectSpriteSet.field_e.playSampleWithPan(ModeProgressSupport.field_a, ratePercent, volume, var11);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "pf.V(" + interval + ',' + guard + ',' + (buttons != null ? "{...}" : "null") + ',' + firstTick + ',' + ratePercent + ',' + volume + ')');
        }
    }

    private final boolean handleActivation(boolean pointerDriven, byte guard) {
        this.playCurrentSelectionSound(113);
        if (!this.input.isInitialActivation((byte) -18)) {
          return false;
        }
        int var3 = this.input.selectedIndex;
        if (var3 >= 0 &&
          this.actionCodes.length > var3) {
          int var4 = this.actionCodes[var3];
          if (var4 == 3 &&
            AccountSessionSupport.isGuestSession(-100)) {
            this.openGuestLogin(-15268);
            return true;
          }
          if (4 == var4) {
            TextLayout.field_b = false;
            ArchiveLoadTask.showMainMenu(pointerDriven, guard + 34);
            return true;
          }
          if (this.selectedGameMode((byte) 89) == var4) {
            TextLayout.field_b = false;
            int var5 = AccountChoicePanel.availableModeIndex(-8462, var4);
            ArchiveKeyRequest.showLevelSelect(0, var5, pointerDriven, this.accountStateIndex);
            return true;
          }
          if (guard == 91) {
            return false;
          }
          this.input = (MenuInputState) null;
          return false;
        }
        return false;
    }

    private final boolean selectNext(int guard, LegacyButton[] buttons, LegacyButton[] followingRow) {
        int var5 = 0;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var4_int = this.selectedButtonIndex(6481, buttons);
          if (var4_int < 0) {
            return false;
          }
          if (buttons.length - 1 > var4_int) {
            var5 = buttons[var4_int + 1].actionId;
            this.input.selectFromKeyboard(false, var5);
          } else {
            var5 = followingRow[0].actionId;
            this.input.selectFromKeyboard(false, var5);
          }
          if (guard == -101) {
            return true;
          }
          this.input = (MenuInputState) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pf.BA(").append(guard).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (followingRow == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void updateRevealEffects(byte guard) {
        if (LoginHandshakeSupport.field_d == 0) {
          StringNode.playFrameAppearSound(8192, (byte) 51);
        }
        IntValueNode.field_j = true;
        int var2 = 6144 * IterableNodeHashTable.field_c / 64;
        int var3 = 100;
        int var4 = 10;
        if (guard < 4) {
          field_g = (Sprite[]) null;
        }
        int var5 = var4;
        this.playButtonRevealSound(var4, 6, this.modeButtons, var5, var3, var2);
        var5 = var5 + var4 * this.modeButtons.length;
        this.playButtonRevealSound(var4, 6, this.footerButtons, var5, var3, var2);
        if (!(LoginHandshakeSupport.field_d >= 1000)) {
          LoginHandshakeSupport.field_d = LoginHandshakeSupport.field_d + 1;
        }
    }

    private final int[] actionRange(int firstAction, boolean guard, int count) {
        int var6 = EscapeVector.obfuscationControl;
        int[] var7 = new int[count];
        int[] var4 = var7;
        if (!guard) {
          this.draw(106);
        }
        for (int var5 = 0; var5 < count; var5++) {
          var7[var5] = firstAction + var5;
        }
        return var4;
    }

    private final int maximumButtonHeight(byte guard, LegacyButton[] buttons) {
        String stackIn_14_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var3_int = 0;
          if (guard > -105) {
            LegacyButton[] var8 = (LegacyButton[]) null;
            this.playSelectionSound((LegacyButton[]) null, (byte) 115, 95, -46);
          }
          LegacyButton[] var4 = buttons;
          for (int var5 = 0; var5 < var4.length; var5++) {
            LegacyButton var6 = var4[var5];
            if (var6.height > var3_int) {
              var3_int = var6.height;
            }
          }
          int stackIn_10_0 = var3_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("pf.D(").append(guard).append(',');
          if (buttons == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void layoutModeButtons(int guard, int revealTick, String[] labels, Sprite[] sprites, int[] actionIds, BinaryBitmapFont font, int[] frameIds) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        String stackIn_25_2 = null;
        int var23 = EscapeVector.obfuscationControl;
        try {
          int var8_int = 2;
          int var9 = labels.length;
          this.modeButtons = new LegacyButton[var9];
          int var10 = 0;
          for (int var11 = 0; var11 < var9; var11++) {
            LegacyButton var12_ref_dk = new LegacyButton(var8_int, actionIds[var11], labels[var11], revealTick, sprites[var11], frameIds[var11], font);
            this.modeButtons[var11] = var12_ref_dk;
            var10 = var10 + var12_ref_dk.width;
          }
          int var11Lifetime1 = 640;
          int var12 = DynamicTerrainRenderer.calculateButtonGap(1, var9, var11Lifetime1, var10);
          int var13 = PcmResampler.centeredButtonStart(var10, (byte) 86, var11Lifetime1, var9, var12);
          int var14 = 0;
          int var15 = var14 + var13;
          if (guard != 3390) {
            return;
          }
          int var16 = TextWidgetPainter.field_j.fullHeight / 2 + 77;
          int var17 = 442;
          int var18 = this.centeredButtonBottom(4, var16, this.modeButtons, var17);
          LegacyButton[] var19 = this.modeButtons;
          for (int var20 = 0; var19.length > var20; var20++) {
            LegacyButton var21 = var19[var20];
            int var22 = var18 - var21.height;
            var21.setPosition((byte) 39, var15, var22);
            var15 = var15 + (var12 + var21.width);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var8;
          StringBuilder stackIn_12_1 = new StringBuilder().append("pf.B(").append(guard).append(',').append(revealTick).append(',');
          if (labels == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (sprites == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          StringBuilder stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (actionIds == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (font == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (frameIds == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void buildLayout(byte guard) {
        BinaryBitmapFont var2 = ByteStorage.gameFont;
        int var3 = 10;
        int[] var4 = this.createModeButtons(0, var3, var2, (byte) 102);
        int[] var5 = this.createFooterButtons(var2, 84, var3, var4.length);
        int var6 = var4.length + var5.length;
        int var7 = 60 / ((50 - guard) / 47);
        this.actionCodes = new int[var6];
        ArraySupport.copy(var4, 0, this.actionCodes, 0, var4.length);
        ArraySupport.copy(var5, 0, this.actionCodes, var4.length, var5.length);
        IndexedSpriteState.setLegacyButtonColors(this.modeButtons, 0);
        IndexedSpriteState.setLegacyButtonColors(this.footerButtons, 0);
    }

    final static void reportClientError(boolean guard, String message, Throwable failure) {
        try {
          String stackIn_14_6;
          int var6 = EscapeVector.obfuscationControl;
          try {
            String var3 = "";
            if (failure != null) {
              var3 = SectorCacheStore.formatCompactStackTrace(failure, 41);
            }
            if (message != null) {
              if (failure != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + message;
            }
            SpriteFactorySupport.printEncodedError(guard, var3);
            var3 = ResizableModalPanel.replaceAllLiteral(var3, ":", (byte) 111, "%3a");
            var3 = ResizableModalPanel.replaceAllLiteral(var3, "@", (byte) 111, "%40");
            var3 = ResizableModalPanel.replaceAllLiteral(var3, "&", (byte) 111, "%26");
            String var7 = ResizableModalPanel.replaceAllLiteral(var3, "#", (byte) 111, "%23");
            if (IntrusiveNode.field_c == null) {
              return;
            }
            SystemTaskService stackIn_13_0 = SpriteCheckboxPainter.field_a;
            int stackIn_13_1 = -12;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = IntrusiveNode.field_c.getCodeBase();
            StringBuilder stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(UiTheme.field_n).append("&u=");
            if (null != GameAppletShell.field_g) {
              stackIn_14_6 = GameAppletShell.field_g;
            } else {
              java.net.URL stackIn_14_2 = null;
              java.net.URL stackIn_14_3 = null;
              stackIn_14_6 = "" + DialWidget.field_J;
            }
            SystemTask var4 = ((SystemTaskService) (Object) stackIn_13_0).openUrlStream((byte) stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(SystemTaskService.javaVendor).append("&v2=").append(SystemTaskService.javaVersion).append("&e=").append(var7).toString()));
            while (var4.status == 0) {
              AchievementTracker.sleepMillis((byte) 105, 1L);
            }
            if (var4.status == 1) {
              DataInputStream var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            Throwable decompiledCaughtException = decompiledCaughtParameter0;
            Exception var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void initializeInput(boolean pointerDriven, byte guard, int actionCount) {
        if (guard != -73) {
          this.input = (MenuInputState) null;
        }
        this.input = new MenuInputState(actionCount);
        int var4 = this.hitButtons(UiContainer.field_y, this.modeButtons, GzipDecoder.field_d, 3);
        if (var4 < 0) {
          var4 = this.hitButtons(UiContainer.field_y, this.footerButtons, GzipDecoder.field_d, 3);
        }
        this.input.initializeSelection(125, pointerDriven, var4, 0);
    }

    public static void releaseStatics(int guard) {
        field_e = null;
        field_h = null;
        field_g = null;
        if (guard != 459) {
          Throwable var2 = (Throwable) null;
          GameModeSelectScreen.reportClientError(false, (String) null, (Throwable) null);
        }
    }

    private final void playSelectionSound(LegacyButton[] buttons, byte guard, int ratePercent, int volume) {
        int var5_int = this.selectedButtonIndex(6481, buttons);
        if (var5_int < 0) {
          return;
        }
        LegacyButton var6 = buttons[var5_int];
        int var7 = var6.actionId;
        int var8 = this.input.selectedIndex;
        if (guard != -23) {
          field_e = (String[]) null;
        }
        if (var7 != var8) {
          return;
        }
        try {
          int var9 = this.buttonPan((byte) -97, var6);
          ObjectSpriteSet.field_e.playSampleWithPan(ArchiveRequest.field_w, ratePercent, volume, var9);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "pf.G(" + (buttons != null ? "{...}" : "null") + ',' + guard + ',' + ratePercent + ',' + volume + ')');
        }
    }

    GameModeSelectScreen(boolean pointerDriven) {
        this.buildLayout((byte) -35);
        int var2 = this.actionCodes.length;
        this.initializeInput(pointerDriven, (byte) -73, var2);
        this.accountStateIndex = Bullet.accountStateIndex(104);
    }

    static {
        field_i = 1;
        field_g = new Sprite[7];
        field_h = "Level complete.";
        field_e = new String[16];
    }
}
