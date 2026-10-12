/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DebugConsole extends dv {
    static String field_A;
    static CommunityTabGroup field_w;
    static String field_B;
    static String field_C;
    static int field_y;
    static String field_u;
    static String field_v;
    private ConsoleCommand[] commands;
    static int field_x;

    final boolean a(int param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
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
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.a(-31501)) {
            stackIn_3_0 = super.a(-30847, param1, param2);
            return stackIn_3_0;
          }
          var12 = this.field_o.getText(param0 ^ param0);
          var5 = this.field_o.getCaretIndex(param0 ^ 30781);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          for (var9 = 0; var5 > var9; var9++) {
            if (var8 == 0) {
              var10 = var12.charAt(var9);
              if (var6 == 0 &&
                var7 == 0) {
                stackIn_16_0 = 0;
              } else {
                stackIn_16_0 = (var10 == 92) ? 1 : 0;
              }
              var8 = stackIn_16_0;
              stackIn_20_0 = var6;
              if (var7 == 0 &&
                var10 == 34) {
                stackIn_21_1 = 1;
              } else {
                stackIn_21_1 = 0;
              }
              var6 = stackIn_20_0 ^ stackIn_21_1;
              stackIn_25_0 = var7;
              if (var6 == 0 &&
                var10 == 39) {
                stackIn_26_1 = 1;
              } else {
                stackIn_26_1 = 0;
              }
              var7 = stackIn_25_0 ^ stackIn_26_1;
            } else {
              var8 = 0;
            }
          }
          if (0 >= var5) {
            stackIn_32_0 = 65535;
          } else {
            stackIn_32_0 = var12.charAt(var5 - 1);
          }
          var9Lifetime1 = stackIn_32_0;
          if (var12.length() <= var5) {
            stackIn_36_0 = 65535;
          } else {
            stackIn_36_0 = var12.charAt(var5);
          }
          boolean decompiledFrameRemainder0 = true;
          var10Lifetime1 = stackIn_36_0;
          if ((var6 == 0 ||
            var8 != 0 ||
            param1 != 34 ||
            var10Lifetime1 != 34) && (var7 == 0 ||
            var8 != 0 ||
            39 != param1 ||
            var10Lifetime1 != 39) && (var6 != 0 ||
            var7 != 0 ||
            param1 != 41 ||
            var10Lifetime1 != 41)) {
            if (param2 == 85 && (var9Lifetime1 == 40 &&
              var10Lifetime1 == 41 ||
              var6 != 0 &&
              var9Lifetime1 == 34 &&
              var10Lifetime1 == 34 ||
              var7 != 0 &&
              39 == var9Lifetime1 &&
              39 == var10Lifetime1)) {
              this.field_o.handleKey(101, -26126, '￿');
            }
            discarded$0 = super.a(-30847, param1, param2);
            var4 = this.field_o.getText(param0 ^ -30847);
            var5 = this.field_o.getCaretIndex(param0 ^ -30779);
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 40) {
              this.field_o.handleKey(-1, -26126, ')');
              this.field_o.setSelection(-98, var5, var5);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 34) {
              this.field_o.handleKey(-1, -26126, '"');
              this.field_o.setSelection(param0 + 30749, var5, var5);
            }
            if (((var6 == 0)) &&
              ((var7 == 0)) &&
              ((param1 == 39))) {
              this.field_o.handleKey(-1, param0 + 4721, '\'');
              this.field_o.setSelection(-98, var5, var5);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_o.setCollapsedSelection(1 + var5, false);
          }
          vs.field_c = wf.a(this.field_o.getText(0), -101);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ij.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    DebugConsole(NodeDeque param0, BitmapFont param1, PlatformTaskService param2) {
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
          this.commands = new ConsoleCommand[param0.size(false)];
          var4_int = 0;
          var5 = (ConsoleCommand) (param0.first((byte) 94));
          while (var5 != null) {
            incrementValue$3 = var4_int;
            var4_int++;
            this.commands[incrementValue$3] = var5;
            var5 = (ConsoleCommand) (param0.next((byte) 123));
          }
          this.a(-1, "# <col=ffaaff>FunOrbConsole (loaded " + this.commands.length + " methods at " + new Date() + ")</col>");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ij.<init>(");
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void b(int param0) {
        String var3 = null;
        try {
          int var2_int = -78 / ((param0 - 13) / 33);
          var3 = this.field_o.textComponent.text;
          this.field_o.textComponent.text = vs.field_c;
          super.b(-100);
          this.field_o.textComponent.text = var3;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ij.M(" + param0 + ')');
        }
    }

    final String[] b(boolean param0) {
        DualNodeDeque discarded$0 = null;
        int incrementValue$1 = 0;
        String[] stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        ConsoleExpression[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ConsoleCommand var10 = null;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        ConsoleExpression var14 = null;
        DualNodeDeque var15 = null;
        String var6Lifetime1;
        String var6Lifetime2;
        int var9Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var13 = this.field_o.getText(0);
          var6 = var13;
          var6Lifetime1 = var13;
          var3 = this.field_o.getCaretIndex(95);
          var4 = vv.a(var13, 114);
          var5 = DualLinkedNode.a(var3, var4, -122);
          this.field_s.x = 0;
          var6Lifetime2 = "";
          if (0 <= var5) {
            var14 = var4[var5];
            var8_int = -var14.sourceOffset + var3;
            if (rn.consoleCallKind == var14.kind &&
              var8_int > 0) {
              var6Lifetime2 = var14.text.substring(0, Math.min(var14.text.length(), var8_int));
              this.field_s.x = this.field_t.a(var13.substring(0, var14.sourceOffset));
            } else {
              var9 = var5;
              var10_int = 0;
              while (var9 >= 0) {
                if (~LeaderEscortCondition.consoleArgumentEndKind == ~var4[var9].kind) {
                  var10_int++;
                }
                if (var4[var9].kind == ChatMessage.consoleArgumentStartKind) {
                  var10_int--;
                }
                if (var10_int >= 0) {
                  var9--;
                  continue;
                }
                break;
              }
              if (0 < var9 &&
                var4[var9 - 1].kind == rn.consoleCallKind) {
                var6Lifetime2 = var4[-1 + var9].text;
                this.field_s.x = this.field_t.a(var13.substring(0, var4[-1 + var9].sourceOffset));
              }
            }
          }
          var15 = this.a((byte) -75, var6Lifetime2);
          var8 = new String[var15.size(30578)];
          var9Lifetime1 = 0;
          var10 = (ConsoleCommand) (var15.first((byte) 43));
          if (!param0) {
            var12 = (String) null;
            discarded$0 = this.a((byte) 83, (String) null);
          }
          while (var10 != null) {
            incrementValue$1 = var9Lifetime1;
            var9Lifetime1++;
            var8[incrementValue$1] = var10.displaySignature;
            var10 = (ConsoleCommand) (var15.next(24));
          }
          stackIn_27_0 = var8;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ij.K(" + param0 + ')');
        }
    }

    final static LobbyRoom getLobbyRoom(byte obfuscationGuard, int roomId) {
        LobbyRoom stackIn_2_0 = null;
        DualLinkedNode stackIn_7_0 = null;
        LobbyRoom stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != 74) {
            stackIn_2_0 = (LobbyRoom) null;
            return stackIn_2_0;
          }
          if (null != qm.lobbyRoomsById) {
            stackIn_7_0 = qm.lobbyRoomsById.get((byte) -27, (long)roomId);
          } else {
            stackIn_7_0 = null;
          }
          stackIn_8_0 = (LobbyRoom) (stackIn_7_0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ij.AA(" + obfuscationGuard + ',' + roomId + ')');
        }
    }

    final void a(byte param0) {
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
        ConsoleCommand var12_ref_dr = null;
        int var12 = 0;
        ConsoleCommand var13 = null;
        int var14 = 0;
        String var15 = null;
        ConsoleExpression var16 = null;
        DualNodeDeque var17 = null;
        String var6Lifetime1;
        String var6Lifetime2;
        int var12Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var15 = this.field_o.getText(0);
          var6 = var15;
          var6Lifetime1 = var15;
          var3 = this.field_o.getCaretIndex(-105);
          var4 = vv.a(var15, param0 - 11);
          var5 = DualLinkedNode.a(var3, var4, -126);
          var6Lifetime2 = "";
          if (0 <= var5) {
            var16 = var4[var5];
            var8_int = var3 - var16.sourceOffset;
            if (rn.consoleCallKind == var16.kind &&
              0 < var8_int &&
              var16.text.length() >= var8_int) {
              var6Lifetime2 = var16.text.substring(0, var8_int);
            }
          }
          var17 = this.a((byte) -75, var6Lifetime2);
          if (0 == var17.size(30578)) {
            return;
          }
          if (param0 != 122) {
            this.b(77);
          }
          var8 = new StringBuilder();
          var9 = var6Lifetime2.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_dr = (ConsoleCommand) (var17.first((byte) -110));
          while (var12_ref_dr != null) {
            if (var11 > var12_ref_dr.commandName.length()) {
              var11 = var12_ref_dr.commandName.length();
            }
            var12_ref_dr = (ConsoleCommand) (var17.next(24));
          }
          while (var10 != 0) {
            if (var11 > var9) {
              var12 = ((ConsoleCommand) (var17.first((byte) -112))).commandName.charAt(var9);
              var13 = (ConsoleCommand) (var17.next(24));
              while (var13 != null) {
                stackIn_26_0 = var10;
                if (~var12 != ~var13.commandName.charAt(var9)) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                var10 = stackIn_26_0 & stackIn_27_1;
                var13 = (ConsoleCommand) (var17.next(24));
              }
              var9++;
              if (var10 == 0) {
                continue;
              }
              discarded$0 = var8.append((char) var12);
              continue;
            }
            break;
          }
          var12Lifetime1 = var3 + var8.length();
          if (var6Lifetime2.length() + var8.length() == var11) {
            var12Lifetime1++;
            discarded$1 = var8.append("()");
            if (var17.size(30578) == 1 &&
              ((ConsoleCommand) (var17.first((byte) 44))).parameterTypes.length == 0) {
              var12Lifetime1++;
            }
            this.field_o.setText(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
            this.field_o.setCollapsedSelection(var12Lifetime1, false);
          } else {
            this.field_o.setText(var15.substring(0, var3) + var8.toString() + var15.substring(var3), (byte) 45);
            this.field_o.setCollapsedSelection(var12Lifetime1, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ij.J(" + param0 + ')');
        }
    }

    private final DualNodeDeque a(byte param0, String param1) {
        int var4 = 0;
        DualNodeDeque var3 = null;
        int var5 = 0;
        DualNodeDeque var6 = null;
        DualNodeDeque stackIn_3_0 = null;
        DualNodeDeque stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -75) {
            stackIn_3_0 = (DualNodeDeque) null;
            return stackIn_3_0;
          }
          var6 = new DualNodeDeque();
          var3 = var6;
          for (var4 = 0; var4 < this.commands.length; var4++) {
            if (this.commands[var4].commandName.startsWith(param1)) {
              this.commands[var4].unlinkSecondary((byte) -76);
              var6.addLast(this.commands[var4], false);
            }
          }
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ij.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean evaluateInput(String source, boolean executeExpression) {
        try {
          ConsoleExpression var5 = null;
          NodeDeque var6 = null;
          ConsoleTokenCursor var7 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          ConsoleParseException var3 = null;
          ConsoleEvaluationException var3_ref = null;
          RuntimeException var3_ref2 = null;
          ClientUiComponent var4 = null;
          try {
            try {
              if (false) throw (ConsoleParseException) null;
              var6 = gu.tokenizeConsole(false, source);
              if (!executeExpression) {
                return true;
              }
              var7 = new ConsoleTokenCursor(var6);
              var5 = fk.parseConsoleExpression(var7, -39);
              if (!var7.isAtEnd(124)) {
                throw new ConsoleParseException(var7.readToken((byte) 13).sourceOffset);
              }
              this.a(var5.evaluate(1, this.commands), -58);
              return true;
            } catch (ConsoleParseException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (ConsoleParseException) (Object) decompiledCaughtException;
              source = "<col=55ff55>" + source.substring(0, var3.sourceOffset) + "</col>" + source.substring(var3.sourceOffset);
              var4 = (ClientUiComponent) (this.field_d.content.children.last((byte) -98));
              var4.text = this.field_c + source;
              return false;
            } catch (ConsoleEvaluationException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (ConsoleEvaluationException) (Object) decompiledCaughtException;
              this.a(-1, var3_ref.diagnostic);
              return false;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("ij.D(");
            if (source == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(executeExpression).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        try {
          int var1_int = 10 % ((55 - param0) / 54);
          field_A = null;
          field_v = null;
          field_B = null;
          field_u = null;
          field_w = null;
          field_C = null;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ij.W(" + param0 + ')');
        }
    }

    static {
        field_C = "Model Viewer";
        field_A = "Click a unit's base to select it";
        field_B = "The King Black Dragon is already available.";
        field_y = 0;
        field_v = "Group";
        field_u = "Report abuse";
        field_x = 480;
    }
}
