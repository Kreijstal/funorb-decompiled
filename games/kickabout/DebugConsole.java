/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DebugConsole extends ConsolePanel {
    static String field_w;
    private ConsoleCommand[] field_t;
    static Sprite[][] field_y;
    static QuickChatCommandType field_r;
    static boolean field_s;
    static String field_x;
    static String field_u;
    static String field_v;
    static UiLayoutNode field_z;
    static String field_A;

    final boolean executeCommand(String param0, boolean param1) {
        try {
          ConsoleExpression var5 = null;
          IntrusiveDeque var6 = null;
          ConsoleTokenCursor var7 = null;
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          ConsoleParseException var3 = null;
          ConsoleEvaluationException var3_ref = null;
          RuntimeException var3_ref2 = null;
          UiLayoutNode var4 = null;
          try {
            try {
              var6 = ConsoleLexer.tokenize(false, param0);
              if (!param1) {
                this.completeCommandInput(5);
              }
              var7 = new ConsoleTokenCursor(var6);
              var5 = AuctionTableWidget.parseConsoleExpression(var7, 1422);
              if (!var7.isAtEnd(6)) {
                throw new ConsoleParseException(var7.readToken((byte) 114).field_f);
              }
              this.print(-98, var5.a(param1, this.field_t));
              return true;
            } catch (ConsoleParseException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (ConsoleParseException) (Object) decompiledCaughtException;
              param0 = "<col=55ff55>" + param0.substring(0, var3.field_f) + "</col>" + param0.substring(var3.field_f);
              var4 = (UiLayoutNode) (this.field_g.field_Ab.field_jb.last(-9033));
              var4.field_E = this.field_a + param0;
              return false;
            } catch (ConsoleEvaluationException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (ConsoleEvaluationException) (Object) decompiledCaughtException;
              this.print(var3_ref.field_c, (byte) 94);
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("kd.E(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isCp1252Character(char param0, byte param1) {
        int var3 = 0;
        char[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          if ((param0 <= 0 ||
            128 <= param0) &&
            (param0 < 160 ||
            255 < param0)) {
            if (param0 != 0) {
              var6 = PitchCoordinateSupport.field_c;
              var2 = var6;
              for (var3 = 0; var3 < var6.length; var3++) {
                var4 = var6[var3];
                if (~param0 == ~var4) {
                  return true;
                }
              }
            }
            if (param1 >= 63) {
              return false;
            }
            DebugConsole.isCp1252Character('{', (byte) -51);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2_ref), "kd.BA(" + param0 + ',' + param1 + ')');
        }

    }

    final String[] getCommandSuggestions(byte param0) {
        int incrementValue$0 = 0;
        String[] stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        ConsoleExpression[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        ConsoleCommand var11 = null;
        int var12 = 0;
        String var13 = null;
        ConsoleExpression var14 = null;
        DualLinkDeque var15 = null;
        String var6Lifetime1;
        String var6Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var13 = this.field_k.getText((byte) -16);
          var6 = var13;
          var6Lifetime1 = var13;
          var3 = this.field_k.getCaretPosition(-1);
          var4 = DialogOverlay.tokenizeConsoleCached(var13, (byte) -81);
          var5 = ConsoleArgumentSupport.findExpressionBoundary(var3, var4, 1);
          this.field_j.field_s = 0;
          var6Lifetime2 = "";
          if (var5 >= 0) {
            var14 = var4[var5];
            var8_int = -var14.field_f + var3;
            if (var14.field_k == ContextMenuItem.field_Ab &&
              var8_int > 0) {
              var6Lifetime2 = var14.field_h.substring(0, Math.min(var14.field_h.length(), var8_int));
              this.field_j.field_s = this.field_d.stringWidth(var13.substring(0, var14.field_f));
            } else {
              var9 = var5;
              var10 = 0;
              while (var9 >= 0) {
                if (~var4[var9].field_k == ~RasterBuffer.field_c) {
                  var10++;
                }
                if (ReflectionCheck.field_g == var4[var9].field_k) {
                  var10--;
                }
                if (var10 >= 0) {
                  var9--;
                  continue;
                }
                break;
              }
              if (var9 > 0 &&
                var4[var9 - 1].field_k == ContextMenuItem.field_Ab) {
                var6Lifetime2 = var4[var9 - 1].field_h;
                this.field_j.field_s = this.field_d.stringWidth(var13.substring(0, var4[var9 - 1].field_f));
              }
            }
          }
          var15 = this.findCommandsByPrefix(var6Lifetime2, (byte) -91);
          var8 = new String[var15.size(-1976587888)];
          var9Lifetime1 = 0;
          var10Lifetime1 = 43 % ((-2 - param0) / 41);
          var11 = (ConsoleCommand) (var15.first(-124));
          while (var11 != null) {
            incrementValue$0 = var9Lifetime1;
            var9Lifetime1++;
            var8[incrementValue$0] = var11.field_s;
            var11 = (ConsoleCommand) (var15.next(0));
          }
          stackIn_23_0 = var8;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "kd.D(" + param0 + ')');
        }
    }

    DebugConsole(IntrusiveDeque param0, BitmapFont param1, PlatformTaskDispatcher param2) {
        super(param1, param2);
        int incrementValue$3 = 0;
        int var4_int = 0;
        ConsoleCommand var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_t = new ConsoleCommand[param0.size(false)];
          var4_int = 0;
          var5 = (ConsoleCommand) (param0.first(24009));
          while (var5 != null) {
            incrementValue$3 = var4_int;
            var4_int++;
            this.field_t[incrementValue$3] = var5;
            var5 = (ConsoleCommand) (param0.next(33));
          }
          this.print("# <col=ffaaff>FunOrbConsole (loaded " + this.field_t.length + " methods at " + new Date() + ")</col>", (byte) 94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("kd.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_10_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_10_0;
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_15_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_15_0;
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_z = null;
          field_w = null;
          field_A = null;
          field_u = null;
          if (param0 != -1) {
            DebugConsole.isCp1252Character('4', (byte) -128);
          }
          field_r = null;
          field_v = null;
          field_y = (Sprite[][]) null;
          field_x = null;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kd.V(" + param0 + ')');
        }
    }

    public final boolean handleKeyTyped(int param0, int param1, char param2) {
        boolean discarded$0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = Kickabout.field_G;
        try {
          if (!this.capturesInput((byte) 114)) {
            stackIn_3_0 = super.handleKeyTyped(11516, param1, param2);
            return stackIn_3_0;
          }
          var12 = this.field_k.getText((byte) -16);
          var5 = this.field_k.getCaretPosition(-1);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          if (param0 != 11516) {
            this.completeCommandInput(102);
          }
          while (var9 < var5) {
            if (var8 != 0) {
              var8 = 0;
            } else {
              var10 = var12.charAt(var9);
              if (var6 == 0 &&
                var7 == 0) {
                stackIn_19_0 = 0;
              } else {
                stackIn_19_0 = (var10 == 92) ? 1 : 0;
              }
              var8 = stackIn_19_0;
              stackIn_23_0 = var6;
              if (var7 == 0 &&
                var10 == 34) {
                stackIn_24_1 = 1;
              } else {
                stackIn_24_1 = 0;
              }
              var6 = stackIn_23_0 ^ stackIn_24_1;
              stackIn_28_0 = var7;
              if (var6 == 0 &&
                var10 == 39) {
                stackIn_29_1 = 1;
              } else {
                stackIn_29_1 = 0;
              }
              var7 = stackIn_28_0 ^ stackIn_29_1;
            }
            var9++;
          }
          if (var5 > 0) {
            stackIn_35_0 = var12.charAt(var5 - 1);
          } else {
            stackIn_35_0 = 65535;
          }
          var9Lifetime1 = stackIn_35_0;
          if (var12.length() > var5) {
            stackIn_39_0 = var12.charAt(var5);
          } else {
            stackIn_39_0 = 65535;
          }
          boolean decompiledFrameRemainder0 = true;
          var10Lifetime1 = stackIn_39_0;
          if ((var6 == 0 ||
            var8 != 0 ||
            param2 != 34 ||
            var10Lifetime1 != 34) && (var7 == 0 ||
            var8 != 0 ||
            param2 != 39 ||
            var10Lifetime1 != 39) && (var6 != 0 ||
            var7 != 0 ||
            param2 != 41 ||
            var10Lifetime1 != 41)) {
            if (param1 == 85 && (var9Lifetime1 == 40 &&
              41 == var10Lifetime1 ||
              var6 != 0 &&
              34 == var9Lifetime1 &&
              var10Lifetime1 == 34 ||
              var7 != 0 &&
              var9Lifetime1 == 39 &&
              var10Lifetime1 == 39)) {
              this.field_k.handleKey(101, '￿', 875);
            }
            discarded$0 = super.handleKeyTyped(11516, param1, param2);
            var4 = this.field_k.getText((byte) -16);
            var5 = this.field_k.getCaretPosition(-1);
            if (var6 == 0 &&
              var7 == 0 &&
              param2 == 40) {
              this.field_k.handleKey(-1, ')', param0 ^ 12183);
              this.field_k.setSelection(var5, (byte) -96, var5);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param2 == 34) {
              this.field_k.handleKey(-1, '"', 875);
              this.field_k.setSelection(var5, (byte) -97, var5);
            }
            if (((var6 == 0)) &&
              ((var7 == 0)) &&
              ((param2 == 39))) {
              this.field_k.handleKey(-1, '\'', 875);
              this.field_k.setSelection(var5, (byte) -94, var5);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_k.setCaret(-85, 1 + var5);
          }
          MeshObject.field_c = IsaacRandom.highlightConsoleSyntax(this.field_k.getText((byte) -16), 120);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var4_ref), "kd.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final DualLinkDeque findCommandsByPrefix(String param0, byte param1) {
        int var5 = 0;
        DualLinkDeque var3 = null;
        int var4 = 0;
        int var6 = 0;
        DualLinkDeque var7 = null;
        DualLinkDeque stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Kickabout.field_G;
        try {
          var4 = 117 / ((param1 - 27) / 48);
          var7 = new DualLinkDeque();
          var3 = var7;
          for (var5 = 0; this.field_t.length > var5; var5++) {
            if (this.field_t[var5].field_o.startsWith(param0)) {
              this.field_t[var5].unlinkSecondary(47);
              var7.addLast(127, this.field_t[var5]);
            }
          }
          stackIn_9_0 = var3;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("kd.U(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void completeCommandInput(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_26_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        ConsoleExpression[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ConsoleCommand var13_ref_tm = null;
        int var13 = 0;
        ConsoleCommand var14 = null;
        int var15 = 0;
        String var16 = null;
        ConsoleExpression var17 = null;
        DualLinkDeque var18 = null;
        String var6Lifetime1;
        String var6Lifetime2;
        int var13Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var16 = this.field_k.getText((byte) -16);
          var6 = var16;
          var6Lifetime1 = var16;
          var3 = this.field_k.getCaretPosition(-1);
          var4 = DialogOverlay.tokenizeConsoleCached(var16, (byte) -33);
          var5 = ConsoleArgumentSupport.findExpressionBoundary(var3, var4, 1);
          var6Lifetime2 = "";
          if (var5 >= 0) {
            var17 = var4[var5];
            var8_int = var3 - var17.field_f;
            if (var17.field_k == ContextMenuItem.field_Ab &&
              0 < var8_int &&
              var8_int <= var17.field_h.length()) {
              var6Lifetime2 = var17.field_h.substring(0, var8_int);
            }
          }
          var18 = this.findCommandsByPrefix(var6Lifetime2, (byte) -124);
          if (0 == var18.size(-1976587888)) {
            return;
          }
          var8 = new StringBuilder();
          var11 = -93 / ((-44 - param0) / 36);
          var9 = var6Lifetime2.length();
          var10 = 1;
          var12 = 2147483647;
          var13_ref_tm = (ConsoleCommand) (var18.first(-120));
          while (var13_ref_tm != null) {
            if (var12 > var13_ref_tm.field_o.length()) {
              var12 = var13_ref_tm.field_o.length();
            }
            var13_ref_tm = (ConsoleCommand) (var18.next(0));
          }
          while (var10 != 0) {
            if (var9 < var12) {
              var13 = ((ConsoleCommand) (var18.first(-119))).field_o.charAt(var9);
              var14 = (ConsoleCommand) (var18.next(0));
              while (var14 != null) {
                stackIn_26_0 = var10;
                if (var13 != var14.field_o.charAt(var9)) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                var10 = stackIn_26_0 & stackIn_27_1;
                var14 = (ConsoleCommand) (var18.next(0));
              }
              var9++;
              if (var10 == 0) {
                continue;
              }
              discarded$0 = var8.append((char) var13);
              continue;
            }
            break;
          }
          var13Lifetime1 = var8.length() + var3;
          if (var12 == var6Lifetime2.length() + var8.length()) {
            discarded$1 = var8.append("()");
            var13Lifetime1++;
            if (1 == var18.size(-1976587888) &&
              ((ConsoleCommand) (var18.first(-121))).field_p.length == 0) {
              var13Lifetime1++;
            }
          }
          this.field_k.setText(var16.substring(0, var3) + var8.toString() + var16.substring(var3), -23174);
          this.field_k.setCaret(-56, var13Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "kd.R(" + param0 + ')');
        }
    }

    final static void buildGameSetupContextMenu(int param0, GameSetupPanel param1, boolean param2, String param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        PlayerContextMenu var7 = null;
        String var8 = null;
        PlayerContextMenu var9 = null;
        String var10 = null;
        PlayerContextMenu var11 = null;
        String var12 = null;
        PlayerContextMenu var13 = null;
        try {
          BytePlusOneCommand.createPlayerContextMenu(param1, false, ShopPlayerSlot.field_Jb, -1, (String) null, (int[]) null, 0L, (String) null, param1.getGameId((byte) 77));
          if (param1.field_Cb && (param1.field_Mb == 2 ||
            !(2 > ScrollContainer.field_Ib))) {
            var7 = TextButton.field_v;
            var8 = LoginDialog.substitutePlaceholders(-18, SelectableAchievementIcon.field_Ab, new String[]{param3});
            var7.field_j.addItem(0, 10, var8);
          }
          TextButton.field_v.buildMenuItems(param0 - 14);
          if (param2) {
            if (TextButton.field_v.field_c != DelayedServerPacket.field_h) {
              var11 = TextButton.field_v;
              var12 = LoginDialog.substitutePlaceholders(-18, KitUnlockNoticeSupport.field_a, new String[]{param3});
              var11.field_j.addItem(param0 - 15, 15, var12);
            } else {
              var9 = TextButton.field_v;
              var10 = LoginDialog.substitutePlaceholders(-18, FullscreenDisplayMode.field_h, new String[]{param3});
              var9.field_j.addItem(0, 16, var10);
            }
          }
          var13 = TextButton.field_v;
          var5 = HighScoreSubmission.field_q;
          if (param0 != 15) {
            field_x = (String) null;
          }
          var6 = ReceivedAuctionItem.field_y;
          var13.field_j.layoutItems(0, 0, var5, var6, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kd.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_0 = stackIn_17_0;
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_0 = stackIn_21_0;
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = stackIn_17_0;
            stackIn_22_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void paint(int param0) {
        String var4 = null;
        try {
          var4 = this.field_k.field_Lb.field_E;
          String var2 = var4;
          this.field_k.field_Lb.field_E = MeshObject.field_c;
          int var3 = 114 % ((param0 - 50) / 45);
          super.paint(-76);
          this.field_k.field_Lb.field_E = var4;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "kd.L(" + param0 + ')');
        }
    }

    final static IndexedSprite[] createCrowdAnimationFrames(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        int var11 = 0;
        IndexedSprite[] stackIn_9_0 = null;
        int stackIn_16_0 = 0;
        IndexedSprite[] stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        IndexedSprite[] var6 = null;
        RuntimeException var6_ref = null;
        IndexedSprite var7_ref_kg = null;
        int var7 = 0;
        int var8 = 0;
        IntrusiveDeque var9 = null;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        IndexedSprite[] var16 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        var15 = Kickabout.field_G;
        try {
          var16 = new IndexedSprite[6];
          var6 = var16;
          if (!NanoTickClock.field_n) {
            var7_ref_kg = AlphaContainer.renderCrowdFrame(param2, -87, new IntrusiveDeque(), 0);
            for (var8 = 0; var16.length > var8; var8++) {
              var16[var8] = var7_ref_kg;
            }
            stackIn_9_0 = var6;
            return stackIn_9_0;
          }
          var7 = TeamSelectionAgent.field_p[0].field_o;
          if (param3) {
            DebugConsole.isCp1252Character('^', (byte) 107);
          }
          stackIn_16_0 = (param2) ? 6 : 2;
          var8Lifetime1 = stackIn_16_0;
          var9 = new IntrusiveDeque();
          for (var10 = 0; var10 < 3; var10++) {
            for (var11 = 0; var11 < 9; var11++) {
              if (param5 >= LoggedPossession.nextRandomInt((byte) -24, 256)) {
                var12 = LoggedPossession.nextRandomInt((byte) -24, 5);
                var13 = LoggedPossession.nextRandomInt((byte) -24, 5);
                var14 = 50 * var10 + 32 + var13;
                if (!param2) {
                  var14 = var7 - (var14 + 12);
                }
                var9.addLast(new PlayerModelPreview(var14, 63 + (var11 * 26 + 14 * var10), var8Lifetime1, var12), 3);
              }
            }
          }
          for (var10Lifetime1 = 0; var10Lifetime1 < 6; var10Lifetime1++) {
            DelayedServerPacket.updateLoadingProgress(100, 9863, var10Lifetime1 * (-param1 + param0) / 6 + param1);
            var16[var10Lifetime1] = AlphaContainer.renderCrowdFrame(param2, -76, var9, var10Lifetime1);
          }
          stackIn_33_0 = var6;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var6_ref), "kd.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_r = new QuickChatCommandType(10, 2, 2, 0);
        field_u = "<%0> slot";
        field_s = false;
        field_v = "Please enter your date of birth to enable chat:";
        field_x = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_A = "Music";
    }
}
