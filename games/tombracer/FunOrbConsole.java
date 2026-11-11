/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class FunOrbConsole extends ConsoleWindow {
    private ConsoleMethod[] methods;
    static TextureCombineOperation field_w;
    static TextureCoordinateGeneration field_u;

    final void autocomplete(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_36_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ConsoleToken[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ConsoleToken var7 = null;
        SecondaryLinkQueue var7_ref = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ConsoleMethod var12_ref_ela = null;
        int var12 = 0;
        ConsoleMethod var13 = null;
        int var14 = 0;
        int stackIn_47_0Lifetime1;
        int stackIn_47_1Lifetime1;
        int stackIn_47_2Lifetime1;
        int var12Lifetime1;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = this.field_o.getText((byte) -114);
          var3 = this.field_o.getCaret(-1320);
          var4 = LaserShooterComponent.tokenizeCommand((byte) 126, var2);
          var5 = PlayerViewport.findTokenAtPosition(true, var4, var3);
          var6 = "";
          if (var5 >= 0) {
            var7 = var4[var5];
            var8_int = var3 - var7.field_h;
            if (QuickChatPhraseSource.field_f == var7.kind &&
              0 < var8_int &&
              var7.text.length() >= var8_int) {
              var6 = var7.text.substring(0, var8_int);
            }
          }
          var7_ref = this.findMethodsWithPrefix(false, var6);
          if (var7_ref.size((byte) -48) == 0) {
            return;
          }
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_ela = (ConsoleMethod) (var7_ref.first((byte) 38));
          while (true) {
            if (var12_ref_ela != null) {
              stackIn_43_0 = var11;
              stackIn_43_1 = var12_ref_ela.field_l.length();
              if (var14 == 0) {
                if (stackIn_43_0 > stackIn_43_1) {
                  var11 = var12_ref_ela.field_l.length();
                }
                var12_ref_ela = (ConsoleMethod) (var7_ref.next(param0 - 21275));
                continue;
              }
            } else {
              while (true) {
                if (var10 != 0) {
                  stackIn_43_0 = ~var9;
                  stackIn_43_1 = ~var11;
                  if (var14 != 0) {
                    break;
                  }
                  if (stackIn_43_0 > stackIn_43_1) {
                    var12 = ((ConsoleMethod) (var7_ref.first((byte) 38))).field_l.charAt(var9);
                    var13 = (ConsoleMethod) (var7_ref.next(param0 ^ 21291));
                    while (var13 != null) {
                      stackIn_47_0 = var10;
                      stackIn_47_1 = ~var12;
                      stackIn_47_2 = ~var13.field_l.charAt(var9);
                      if (stackIn_47_1 != stackIn_47_2) {
                        stackIn_36_1 = 0;
                      } else {
                        stackIn_36_1 = 1;
                      }
                      var10 = stackIn_47_0 & stackIn_36_1;
                      var13 = (ConsoleMethod) (var7_ref.next(28));
                    }
                    if (var10 != 0) {
                      discarded$0 = var8.append((char) var12);
                    }
                    var9++;
                    continue;
                  }
                }
                stackIn_43_0 = param0;
                stackIn_43_1 = 21303;
                break;
              }
            }
            break;
          }
          if (stackIn_43_0 != stackIn_43_1) {
            field_w = (TextureCombineOperation) null;
          }
          var12Lifetime1 = var3 + var8.length();
          stackIn_47_0Lifetime1 = ~(var6.length() + var8.length());
          stackIn_47_1Lifetime1 = var11;
          stackIn_47_2Lifetime1 = -1;
          if (stackIn_47_0Lifetime1 == (stackIn_47_1Lifetime1 ^ stackIn_47_2Lifetime1)) {
            discarded$1 = var8.append("()");
            var12Lifetime1++;
            if (1 == var7_ref.size((byte) -34) &&
              ((ConsoleMethod) (var7_ref.first((byte) 38))).field_n.length == 0) {
              var12Lifetime1++;
            }
          }
          this.field_o.setText((byte) 96, var2.substring(0, var3) + var8.toString() + var2.substring(var3));
          this.field_o.setCaretAndAnchor(var12Lifetime1, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2_ref), "gq.I(" + param0 + ')');
        }
    }

    private final SecondaryLinkQueue findMethodsWithPrefix(boolean param0, String param1) {
        SecondaryLinkQueue var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        SecondaryLinkQueue stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = new SecondaryLinkQueue();
          var4 = 0;
          if (param0) {
            field_u = (TextureCoordinateGeneration) null;
          }
          while (var4 < this.methods.length) {
            if (this.methods[var4].field_l.startsWith(param1)) {
              this.methods[var4].unlinkSecondary(-7975);
              var3.addLast(this.methods[var4], (byte) -78);
            }
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("gq.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean executeCommand(String param0, byte param1) {
        try {
          IntrusiveDeque var3 = null;
          ConsoleParseException var3_ref = null;
          RuntimeException var3_ref2 = null;
          ConsoleTokenStream var4 = null;
          UiComponent var4_ref = null;
          int var5 = 0;
          ConsoleToken var6 = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          Throwable decompiledCaughtException = null;
          ConsoleEvaluationException var3_ref3 = null;
          try {
            try {
              if (false) throw (ConsoleParseException) null;
              var3 = lp.tokenize((byte) 48, param0);
              var5 = 80 / ((-44 - param1) / 36);
              var4 = new ConsoleTokenStream(var3);
              var6 = ConsoleExpressionParser.parseExpression(var4, -31733);
              if (!var4.isAtEnd((byte) 85)) {
                throw new ConsoleParseException(var4.next((byte) -127).field_h);
              }
              this.printResult((byte) -80, var6.evaluate(-1, this.methods));
              return true;
            } catch (ConsoleParseException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (ConsoleParseException) (Object) decompiledCaughtException;
              param0 = "<col=55ff55>" + param0.substring(0, var3_ref.field_a) + "</col>" + param0.substring(var3_ref.field_a);
              var4_ref = (UiComponent) (this.field_a.field_tb.field_J.last(3));
              var4_ref.field_r = this.field_t + param0;
            } catch (ConsoleEvaluationException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref3 = (ConsoleEvaluationException) (Object) decompiledCaughtException;
              this.printLine(123, var3_ref3.field_b);
            }
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var3_ref2;
            stackIn_12_1 = new StringBuilder().append("gq.G(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseConsoleStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_u = null;
          if (param0 != 39) {
            FunOrbConsole.releaseConsoleStatics(51);
          }
          field_w = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1), "gq.F(" + param0 + ')');
        }
    }

    FunOrbConsole(IntrusiveDeque param0, BitmapFont param1, PlatformTaskDispatcher param2) {
        super(param1, param2);
        int incrementValue$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        ConsoleMethod var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          this.methods = new ConsoleMethod[param0.size((byte) -16)];
          var4_int = 0;
          var5 = (ConsoleMethod) (param0.first(-80));
          while (var5 != null) {
            incrementValue$1 = var4_int;
            var4_int++;
            this.methods[incrementValue$1] = var5;
            var5 = (ConsoleMethod) (param0.next(125));
            if (var6 != 0) {
              return;
            }
          }
          this.printLine(-124, "# <col=ffaaff>FunOrbConsole (loaded " + this.methods.length + " methods at " + new Date() + ")</col>");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("gq.<init>(");
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
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final String[] getCompletions(boolean param0) {
        int incrementValue$0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        String[] stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ConsoleToken[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ConsoleToken var7 = null;
        SecondaryLinkQueue var7_ref = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ConsoleMethod var10 = null;
        int var11 = 0;
        int var9Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = this.field_o.getText((byte) -115);
          var3 = this.field_o.getCaret(-1320);
          var4 = LaserShooterComponent.tokenizeCommand((byte) 126, var2);
          var5 = PlayerViewport.findTokenAtPosition(true, var4, var3);
          if (param0) {
            this.executeCommand((String) null, (byte) -83);
          }
          boolean decompiledFrameRemainder1 = true;
          this.field_p.field_qb = 0;
          var6 = "";
          if (var5 >= 0) {
            var7 = var4[var5];
            var8_int = -var7.field_h + var3;
            if (~var7.kind == ~QuickChatPhraseSource.field_f &&
              var8_int > 0) {
              var6 = var7.text.substring(0, Math.min(var7.text.length(), var8_int));
              this.field_p.field_qb = this.field_m.stringWidth(var2.substring(0, var7.field_h));
              decompiledFrameRemainder1 = (var11 != 0);
            }
            if (decompiledFrameRemainder1) {
              var9 = var5;
              var10_int = 0;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var9 >= 0) {
                  stackIn_31_0 = var4[var9].kind;
                  stackIn_31_1 = rs.field_a;
                  decompiledFrameRemainder0 = (var11 == 0);
                  if (decompiledFrameRemainder0) {
                    if (stackIn_31_0 == stackIn_31_1) {
                      var10_int++;
                    }
                    if (~var4[var9].kind == ~lna.field_a) {
                      var10_int--;
                    }
                    if (var10_int >= 0 ||
                      var11 != 0) {
                      var9--;
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_31_0 = 0;
                  stackIn_31_1 = var9;
                }
                if (stackIn_31_0 >= stackIn_31_1) {
                  break;
                }
                if (~QuickChatPhraseSource.field_f != ~var4[var9 - 1].kind) {
                  break;
                }
                var6 = var4[var9 - 1].text;
                this.field_p.field_qb = this.field_m.stringWidth(var2.substring(0, var4[var9 - 1].field_h));
                break;
              }
            }
          }
          var7_ref = this.findMethodsWithPrefix(param0, var6);
          var8 = new String[var7_ref.size((byte) -99)];
          var9Lifetime1 = 0;
          var10 = (ConsoleMethod) (var7_ref.first((byte) 38));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var10))) {
            stackIn_43_0 = var8;
            if (var11 == 0) {
              incrementValue$0 = var9Lifetime1;
              var9Lifetime1++;
              stackIn_43_0[incrementValue$0] = var10.field_k;
              var10 = (ConsoleMethod) (var7_ref.next(28));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_43_0 = var8;
          }
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2_ref), "gq.E(" + param0 + ')');
        }
    }

    public final boolean handleKey(byte param0, char param1, int param2) {
        boolean discarded$0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
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
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.isModal(-2)) {
            stackIn_5_0 = super.handleKey((byte) -72, param1, param2);
            return stackIn_5_0;
          }
          var4 = this.field_o.getText((byte) -106);
          var5 = this.field_o.getCaret(-1320);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5 <= var9))) {
            stackIn_40_0 = var8;
            if (var11 == 0) {
              if (stackIn_40_0 != 0) {
                var8 = 0;
              } else {
                boolean decompiledFrameRemainder0 = true;
                var10 = var4.charAt(var9);
                if ((var6 != 0 ||
                  var7 != 0) && var10 == 92) {
                  stackIn_23_0 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  stackIn_23_0 = 0;
                }
                var8 = stackIn_23_0;
                stackIn_29_0 = var6;
                if (var7 == 0 &&
                  var10 == 34) {
                  stackIn_30_1 = 1;
                } else {
                  stackIn_30_1 = 0;
                }
                var6 = stackIn_29_0 ^ stackIn_30_1;
                stackIn_36_0 = var7;
                if (var6 == 0 &&
                  var10 == 39) {
                  stackIn_37_1 = 1;
                } else {
                  stackIn_37_1 = 0;
                }
                var7 = stackIn_36_0 ^ stackIn_37_1;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_40_0 = -1;
          }
          if (stackIn_40_0 > ~var5) {
            stackIn_44_0 = var4.charAt(-1 + var5);
          } else {
            stackIn_44_0 = 65535;
          }
          var9Lifetime1 = stackIn_44_0;
          if (var4.length() > var5) {
            stackIn_48_0 = var4.charAt(var5);
          } else {
            stackIn_48_0 = 65535;
          }
          var10Lifetime1 = stackIn_48_0;
          if (var6 != 0 &&
            var8 == 0 &&
            34 == param1 &&
            var10Lifetime1 == 34 ||
            var7 != 0 &&
            var8 == 0 &&
            39 == param1 &&
            var10Lifetime1 == 39 ||
            var6 == 0 &&
            var7 == 0 &&
            param1 == 41 &&
            var10Lifetime1 == 41) {
            this.field_o.setCaretAndAnchor(1 + var5, 1);
          }
          if ((var6 == 0 ||
            var8 != 0 ||
            34 != param1 ||
            var10Lifetime1 != 34) &&
            (var7 == 0 ||
            var8 != 0 ||
            39 != param1 ||
            var10Lifetime1 != 39) &&
            (var6 != 0 ||
            var7 != 0 ||
            param1 != 41 ||
            var10Lifetime1 != 41) || var11 != 0) {
            if (85 == param2 && (40 == var9Lifetime1 &&
              var10Lifetime1 == 41 ||
              var6 != 0 &&
              34 == var9Lifetime1 &&
              34 == var10Lifetime1 ||
              var7 != 0 &&
              var9Lifetime1 == 39 &&
              39 == var10Lifetime1)) {
              this.field_o.handleKey(101, -19696, '￿');
            }
            discarded$0 = super.handleKey((byte) -72, param1, param2);
            var4Lifetime1 = this.field_o.getText((byte) -124);
            var5Lifetime1 = this.field_o.getCaret(-1320);
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 40) {
              this.field_o.handleKey(-1, -19696, ')');
              this.field_o.setSelection(var5Lifetime1, (byte) 84, var5Lifetime1);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 34) {
              this.field_o.handleKey(-1, -19696, '"');
              this.field_o.setSelection(var5Lifetime1, (byte) 95, var5Lifetime1);
            }
            if (var6 == 0 &&
              var7 == 0 &&
              param1 == 39) {
              this.field_o.handleKey(-1, -19696, '\'');
              this.field_o.setSelection(var5Lifetime1, (byte) 72, var5Lifetime1);
            }
          }
          PlayerResultRow.field_w = ResultsPhase.highlightConsoleSyntax(this.field_o.getText((byte) -112), (byte) -110);
          if (param0 != -72) {
            this.methods = (ConsoleMethod[]) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var4_ref), "gq.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void drawOverlay(int param0) {
        String var2 = null;
        try {
          var2 = this.field_o.field_Cb.field_r;
          this.field_o.field_Cb.field_r = PlayerResultRow.field_w;
          super.drawOverlay(param0);
          this.field_o.field_Cb.field_r = var2;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "gq.B(" + param0 + ')');
        }
    }

    static {
        field_w = new TextureCombineOperation();
        field_u = new TextureCoordinateGeneration();
    }
}
