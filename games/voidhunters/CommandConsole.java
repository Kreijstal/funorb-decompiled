/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class CommandConsole extends DeveloperConsole {
    private ConsoleCommand[] commands;
    static boolean field_r;
    static IndexedSpriteData[][] field_s;

    final void completeInput(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        char stackIn_32_1 = 0;
        int stackIn_38_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        RuntimeException decompiledCaughtException = null;
        char stackOut_31_1;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tsa var7 = null;
        SecondaryNodeQueue var7_ref = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ConsoleCommand var12_ref_rqa = null;
        int var12 = 0;
        ConsoleCommand var13 = null;
        int var14 = 0;
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int stackIn_45_2Lifetime1;
        int var12Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          var2 = this.inputWidget.getText(-14453);
          var3 = this.inputWidget.getCaretPosition(param0 ^ param0);
          var4 = dib.a(var2, 90);
          var5 = SetMassDriverRandomness.a(var4, -25223, var3);
          var6 = "";
          if (0 <= var5) {
            var7 = var4[var5];
            var8_int = var3 - var7.field_g;
            if (var7.field_e == SetMissionVariablesHudX.field_p &&
              var8_int > 0 &&
              var8_int <= var7.field_d.length()) {
              var6 = var7.field_d.substring(0, var8_int);
            }
          }
          var7_ref = this.findCommandsByPrefix(var6, (byte) 28);
          if (var7_ref.size(param0 + 35) == 0) {
            return;
          }
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_rqa = (ConsoleCommand) (var7_ref.first((byte) -54));
          while (true) {
            if (var12_ref_rqa != null) {
              stackIn_44_0 = var12_ref_rqa.name.length();
              stackIn_44_1 = var11;
              if (var14 == 0) {
                if (stackIn_44_0 < stackIn_44_1) {
                  var11 = var12_ref_rqa.name.length();
                }
                var12_ref_rqa = (ConsoleCommand) (var7_ref.next(1900));
                continue;
              }
            } else {
              while (true) {
                if (var10 != 0) {
                  stackIn_44_0 = ~var9;
                  stackIn_44_1 = ~var11;
                  if (var14 != 0) {
                    break;
                  }
                  if (stackIn_44_0 > stackIn_44_1) {
                    var12 = ((ConsoleCommand) (var7_ref.first((byte) -54))).name.charAt(var9);
                    var13 = (ConsoleCommand) (var7_ref.next(1900));
                    while (null != var13) {
                      stackIn_45_0 = var10;
                      stackOut_31_1 = var13.name.charAt(var9);
                      stackIn_45_1 = stackOut_31_1;
                      stackIn_32_1 = stackOut_31_1;
                      stackIn_45_2 = var12;
                      if (stackIn_32_1 != stackIn_45_2) {
                        stackIn_38_1 = 0;
                      } else {
                        stackIn_38_1 = 1;
                      }
                      var10 = stackIn_45_0 & stackIn_38_1;
                      var13 = (ConsoleCommand) (var7_ref.next(1900));
                    }
                    if (var10 != 0) {
                      discarded$0 = var8.append((char) var12);
                    }
                    var9++;
                    continue;
                  }
                }
                stackIn_44_0 = var3;
                stackIn_44_1 = var8.length();
                break;
              }
            }
            break;
          }
          var12Lifetime1 = stackIn_44_0 + stackIn_44_1;
          stackIn_45_0Lifetime1 = ~(var6.length() + var8.length());
          stackIn_45_1Lifetime1 = var11;
          stackIn_45_2Lifetime1 = -1;
          if (stackIn_45_0Lifetime1 == (stackIn_45_1Lifetime1 ^ stackIn_45_2Lifetime1)) {
            var12Lifetime1++;
            discarded$1 = var8.append("()");
            if (var7_ref.size(0) == 1 &&
              ((ConsoleCommand) (var7_ref.first((byte) -54))).parameterTypes.length == 0) {
              var12Lifetime1++;
            }
          }
          this.inputWidget.setText(var2.substring(0, var3) + var8.toString() + var2.substring(var3), -110);
          this.inputWidget.collapseSelectionAt((byte) -48, var12Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2_ref), "djb.F(" + param0 + ')');
        }
    }

    final void draw(byte param0) {
        String var3 = null;
        try {
          int var2_int = -15 / ((param0 - 44) / 43);
          var3 = this.inputWidget.textWidget.text;
          this.inputWidget.textWidget.text = OpenGlRenderbuffer.field_r;
          super.draw((byte) -74);
          this.inputWidget.textWidget.text = var3;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "djb.A(" + param0 + ')');
        }
    }

    final String[] getCompletionSuggestions(int param0) {
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        String[] stackIn_39_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        tsa var7 = null;
        SecondaryNodeQueue var7_ref = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ConsoleCommand var10 = null;
        int var11 = 0;
        int var9Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (param0 >= -4) {
            CommandConsole.clearSharedReferences((byte) 38);
          }
          boolean decompiledFrameRemainder0 = true;
          var2 = this.inputWidget.getText(-14453);
          var3 = this.inputWidget.getCaretPosition(0);
          var4 = dib.a(var2, 83);
          var5 = SetMassDriverRandomness.a(var4, -25223, var3);
          this.completionBackground.x = 0;
          var6 = "";
          if (var5 >= 0) {
            var7 = var4[var5];
            var8_int = -var7.field_g + var3;
            if (~SetMissionVariablesHudX.field_p != ~var7.field_e ||
              var8_int <= 0) {
              var9 = var5;
              var10_int = 0;
              scanLoop1: while (true) {
                if (0 <= var9) {
                  stackIn_25_0 = SetMissionTerrainVotingChancestep.field_o;
                  stackIn_25_1 = var4[var9].field_e;
                  if (var11 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_25_0 == stackIn_25_1) {
                    var10_int++;
                  }
                  if (ScrollableActionPanel.field_vb == var4[var9].field_e) {
                    var10_int--;
                  }
                  if (var10_int >= 0) {
                    var9--;
                    continue;
                  }
                }
                stackIn_25_0 = ~var9;
                stackIn_25_1 = -1;
                break;
              }
              if (stackIn_25_0 < stackIn_25_1 &&
                SetMissionVariablesHudX.field_p == var4[var9 - 1].field_e) {
                var6 = var4[var9 - 1].field_d;
                this.completionBackground.x = this.font.getStringWidth(var2.substring(0, var4[-1 + var9].field_g));
              }
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              var6 = var7.field_d.substring(0, Math.min(var7.field_d.length(), var8_int));
              this.completionBackground.x = this.font.getStringWidth(var2.substring(0, var7.field_g));
            }
          }
          var7_ref = this.findCommandsByPrefix(var6, (byte) 28);
          var8 = new String[var7_ref.size(0)];
          var9Lifetime1 = 0;
          var10 = (ConsoleCommand) (var7_ref.first((byte) -54));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var10 == null))) {
            stackIn_39_0 = var8;
            if (var11 == 0) {
              incrementValue$0 = var9Lifetime1;
              var9Lifetime1++;
              stackIn_39_0[incrementValue$0] = var10.signatureText;
              var10 = (ConsoleCommand) (var7_ref.next(1900));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_39_0 = var8;
          }
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2_ref), "djb.E(" + param0 + ')');
        }
    }

    CommandConsole(IntrusiveDeque param0, BitmapFont param1, PlatformService param2) {
        super(param1, param2);
        int incrementValue$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        ConsoleCommand var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = VoidHunters.field_G;
        try {
          this.commands = new ConsoleCommand[param0.size(3)];
          var4_int = 0;
          var5 = (ConsoleCommand) (param0.first(0));
          while (null != var5) {
            incrementValue$1 = var4_int;
            var4_int++;
            this.commands[incrementValue$1] = var5;
            var5 = (ConsoleCommand) (param0.next((byte) 92));
            if (var6 != 0) {
              return;
            }
          }
          this.printLine((byte) 93, "# <col=ffaaff>FunOrbConsole (loaded " + this.commands.length + " methods at " + new Date() + ")</col>");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("djb.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean executeInput(int param0, String param1) {
        try {
          IntrusiveDeque var3 = null;
          ojb var3_ref = null;
          RuntimeException var3_ref2 = null;
          ipb var4 = null;
          Widget var4_ref = null;
          tsa var5 = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          gva var3_ref3 = null;
          try {
            try {
              if (false) throw (ojb) null;
              var3 = SetDebrisGroupColour.a(-1, param1);
              if (param0 != -10278) {
                CommandConsole.clearSharedReferences((byte) 96);
              }
              var4 = new ipb(var3);
              var5 = GrapplingHookFactory.a((byte) 105, var4);
              if (!var4.a(100)) {
                throw new ojb(var4.a((byte) -69).field_g);
              }
              this.printObject(var5.a((byte) 114, this.commands), -110);
              return true;
            } catch (ojb decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (ojb) (Object) decompiledCaughtException;
              param1 = "<col=55ff55>" + param1.substring(0, var3_ref.field_a) + "</col>" + param1.substring(var3_ref.field_a);
              var4_ref = (Widget) (this.outputPane.content.children.last((byte) 122));
              var4_ref.text = this.prompt + param1;
            } catch (gva decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref3 = (gva) (Object) decompiledCaughtException;
              this.printLine((byte) 89, var3_ref3.field_b);
            }
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("djb.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearSharedReferences(byte param0) {
        try {
          field_s = (IndexedSpriteData[][]) null;
          int var1_int = -118 % ((83 - param0) / 35);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "djb.B(" + param0 + ')');
        }
    }

    final boolean handleKey(int param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
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
        String var4Lifetime1;
        int var5Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (!this.isOpen(13462)) {
            stackIn_3_0 = super.handleKey(param0, param1, param2 + 0);
            return stackIn_3_0;
          }
          var4 = this.inputWidget.getText(-14453);
          var5 = this.inputWidget.getCaretPosition(0);
          if (param2 != -40) {
            this.completeInput(87);
          }
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var9 >= var5))) {
            stackIn_42_0 = var8;
            if (var11 == 0) {
              if (stackIn_42_0 != 0) {
                var8 = 0;
              } else {
                boolean decompiledFrameRemainder0 = true;
                var10 = var4.charAt(var9);
                if ((var6 != 0 ||
                  var7 != 0) && 92 == var10) {
                  stackIn_25_0 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  stackIn_25_0 = 0;
                }
                var8 = stackIn_25_0;
                stackIn_31_0 = var6;
                if (var7 == 0 &&
                  var10 == 34) {
                  stackIn_32_1 = 1;
                } else {
                  stackIn_32_1 = 0;
                }
                var6 = stackIn_31_0 ^ stackIn_32_1;
                stackIn_38_0 = var7;
                if (var6 == 0 &&
                  var10 == 39) {
                  stackIn_39_1 = 1;
                } else {
                  stackIn_39_1 = 0;
                }
                var7 = stackIn_38_0 ^ stackIn_39_1;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_42_0 = -1;
          }
          if (stackIn_42_0 <= ~var5) {
            stackIn_46_0 = 65535;
          } else {
            stackIn_46_0 = var4.charAt(var5 - 1);
          }
          var9Lifetime1 = stackIn_46_0;
          if (var4.length() > var5) {
            stackIn_50_0 = var4.charAt(var5);
          } else {
            stackIn_50_0 = 65535;
          }
          var10Lifetime1 = stackIn_50_0;
          if (var6 != 0 &&
            var8 == 0 &&
            param1 == 34 &&
            var10Lifetime1 == 34 ||
            var7 != 0 &&
            var8 == 0 &&
            param1 == 39 &&
            var10Lifetime1 == 39 ||
            var6 == 0 &&
            var7 == 0 &&
            param1 == 41 &&
            var10Lifetime1 == 41) {
            this.inputWidget.collapseSelectionAt((byte) -73, 1 + var5);
          }
          if ((var6 == 0 ||
            var8 != 0 ||
            param1 != 34 ||
            var10Lifetime1 != 34) &&
            (var7 == 0 ||
            var8 != 0 ||
            param1 != 39 ||
            var10Lifetime1 != 39) &&
            (var6 != 0 ||
            var7 != 0 ||
            param1 != 41 ||
            var10Lifetime1 != 41) || var11 != 0) {
            if (param0 == 85 && (40 == var9Lifetime1 &&
              41 == var10Lifetime1 ||
              var6 != 0 &&
              var9Lifetime1 == 34 &&
              34 == var10Lifetime1 ||
              var7 != 0 &&
              var9Lifetime1 == 39 &&
              var10Lifetime1 == 39)) {
              this.inputWidget.handleKey(101, -1, '￿');
            }
            discarded$0 = super.handleKey(param0, param1, -40);
            var4Lifetime1 = this.inputWidget.getText(-14453);
            var5Lifetime1 = this.inputWidget.getCaretPosition(0);
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 40) {
              this.inputWidget.handleKey(-1, param2 ^ 39, ')');
              this.inputWidget.setSelection(var5Lifetime1, 31401, var5Lifetime1);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 34) {
              this.inputWidget.handleKey(-1, param2 + 39, '"');
              this.inputWidget.setSelection(var5Lifetime1, 31401, var5Lifetime1);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 39) {
              this.inputWidget.handleKey(-1, -1, '\'');
              this.inputWidget.setSelection(var5Lifetime1, 31401, var5Lifetime1);
            }
          }
          OpenGlRenderbuffer.field_r = PlayerVoteFactory.a(this.inputWidget.getText(param2 - 14413), 107);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var4_ref), "djb.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final SecondaryNodeQueue findCommandsByPrefix(String param0, byte param1) {
        SecondaryNodeQueue var3 = null;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_11_0 = 0;
        SecondaryNodeQueue stackIn_13_0 = null;
        SecondaryNodeQueue stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          var3 = new SecondaryNodeQueue();
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= this.commands.length))) {
            stackOut_3_0 = this.commands[var4].name.startsWith(param0);
            stackIn_11_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_4_0) {
                this.commands[var4].unlinkSecondary((byte) -35);
                var3.addLast(this.commands[var4], param1 - 93);
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = param1;
          }
          if (stackIn_11_0 == 28) {
            stackIn_15_0 = var3;
            return stackIn_15_0;
          }
          stackIn_13_0 = (SecondaryNodeQueue) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("djb.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
