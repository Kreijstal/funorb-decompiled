/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageScreen extends MenuScreen {
    static UiComponent field_r;
    static String field_u;
    static UiComponent field_s;
    static MusicTrack field_t;

    public static void f(byte param0) {
        field_t = null;
        field_r = null;
        field_u = null;
        field_s = null;
        if (param0 == 88) {
          return;
        }
        MessageScreen.a((String) null, -65L, 54);
    }

    final static void appendRankingStatistics(int rating, int draws, int sourceIndex, int obfuscationGuard, int losses, int wins) {
        int stackIn_8_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_54_0 = 0;
        int var6;
        int var7;
        StringBuilder var8;
        int var6Lifetime1;
        int var7Lifetime1;
        int var6Lifetime2;
        int var7Lifetime2;
        if (obfuscationGuard == -19824) {
          cf.rankingSourceIndices[ProxySocketConnector.rankingRowCount] = sourceIndex;
          VerticalScrollbar.rankingSortIndices[ProxySocketConnector.rankingRowCount] = ProxySocketConnector.rankingRowCount;
          DialogMessagePanel.rankingRatings[ProxySocketConnector.rankingRowCount] = rating;
          if (rating <= BoundedFile.field_l) {
            if (IntArrayRequest.field_u > rating) {
              ba.field_w = rating;
            }
            RankingsScreen.rankingWins[ProxySocketConnector.rankingRowCount] = wins;
            ObjectHistoryBuffer.rankingDraws[ProxySocketConnector.rankingRowCount] = draws;
            WidgetGroup.rankingLosses[ProxySocketConnector.rankingRowCount] = losses;
            var6 = draws + wins + losses;
            if (0 != var6) {
              stackIn_54_0 = 1000 * wins / var6;
            } else {
              stackIn_54_0 = 0;
            }
            var7 = stackIn_54_0;
            DebouncedValidationSource.rankingWinRateThousandths[ProxySocketConnector.rankingRowCount] = var7;
            if (uf.field_b < var7) {
              uf.field_b = var7;
            }
            if (ba.field_w > var7) {
              ba.field_w = var7;
            }
            ProxySocketConnector.rankingRowCount = ProxySocketConnector.rankingRowCount + 1;
            return;
          }
          uf.field_b = rating;
          if (IntArrayRequest.field_u > rating) {
            ba.field_w = rating;
          }
          RankingsScreen.rankingWins[ProxySocketConnector.rankingRowCount] = wins;
          ObjectHistoryBuffer.rankingDraws[ProxySocketConnector.rankingRowCount] = draws;
          WidgetGroup.rankingLosses[ProxySocketConnector.rankingRowCount] = losses;
          var6Lifetime2 = draws + wins + losses;
          if (0 != var6Lifetime2) {
            stackIn_39_0 = 1000 * wins / var6Lifetime2;
          } else {
            stackIn_39_0 = 0;
          }
          var7Lifetime2 = stackIn_39_0;
          DebouncedValidationSource.rankingWinRateThousandths[ProxySocketConnector.rankingRowCount] = var7Lifetime2;
          if (uf.field_b < var7Lifetime2) {
            uf.field_b = var7Lifetime2;
          }
          if (ba.field_w > var7Lifetime2) {
            ba.field_w = var7Lifetime2;
          }
          ProxySocketConnector.rankingRowCount = ProxySocketConnector.rankingRowCount + 1;
          return;
        }
        var8 = (StringBuilder) null;
        MessageScreen.resizeAndFillTextBuffer('￰', (StringBuilder) null, -124, false);
        cf.rankingSourceIndices[ProxySocketConnector.rankingRowCount] = sourceIndex;
        VerticalScrollbar.rankingSortIndices[ProxySocketConnector.rankingRowCount] = ProxySocketConnector.rankingRowCount;
        DialogMessagePanel.rankingRatings[ProxySocketConnector.rankingRowCount] = rating;
        if (rating <= BoundedFile.field_l) {
          if (IntArrayRequest.field_u > rating) {
            ba.field_w = rating;
          }
          RankingsScreen.rankingWins[ProxySocketConnector.rankingRowCount] = wins;
          ObjectHistoryBuffer.rankingDraws[ProxySocketConnector.rankingRowCount] = draws;
          WidgetGroup.rankingLosses[ProxySocketConnector.rankingRowCount] = losses;
          var6Lifetime1 = draws + wins + losses;
          if (0 != var6Lifetime1) {
            stackIn_8_0 = 1000 * wins / var6Lifetime1;
          } else {
            stackIn_8_0 = 0;
          }
          var7Lifetime1 = stackIn_8_0;
        } else {
          uf.field_b = rating;
          if (IntArrayRequest.field_u > rating) {
            ba.field_w = rating;
          }
          RankingsScreen.rankingWins[ProxySocketConnector.rankingRowCount] = wins;
          ObjectHistoryBuffer.rankingDraws[ProxySocketConnector.rankingRowCount] = draws;
          WidgetGroup.rankingLosses[ProxySocketConnector.rankingRowCount] = losses;
          var6Lifetime1 = draws + wins + losses;
          if (0 != var6Lifetime1) {
            stackIn_23_0 = 1000 * wins / var6Lifetime1;
          } else {
            stackIn_23_0 = 0;
          }
          var7Lifetime1 = stackIn_23_0;
        }
        DebouncedValidationSource.rankingWinRateThousandths[ProxySocketConnector.rankingRowCount] = var7Lifetime1;
        if (uf.field_b < var7Lifetime1) {
          uf.field_b = var7Lifetime1;
        }
        if (ba.field_w > var7Lifetime1) {
          ba.field_w = var7Lifetime1;
        }
        ProxySocketConnector.rankingRowCount = ProxySocketConnector.rankingRowCount + 1;
        return;
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
          ng.quickChatChannel = param2;
          DualLinkNode.quickChatRecipient = param0;
          var5 = (CharSequence) ((Object) param0);
          QuickChatHelpDialog.field_Qb = ChatMessage.normalizePlayerName(var5, param2 ^ 103);
          CanvasResizeController.field_n = param1;
          MatchResultScreen.field_s = true;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "uk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    MessageScreen() {
        super(11, 180, 460, 402, 0, new int[]{7});
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        if (obfuscationGuard >= 96) {
          super.onEnter(usePointer, initialSelection, 103);
          return;
        }
        StringBuilder var5 = (StringBuilder) null;
        MessageScreen.resizeAndFillTextBuffer('3', (StringBuilder) null, 57, true);
        super.onEnter(usePointer, initialSelection, 103);
    }

    final static StringBuilder resizeAndFillTextBuffer(char fillCharacter, StringBuilder buffer, int length, boolean returnNull) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = buffer.length();
          buffer.setLength(length);
          var5 = var4_int;
          if (returnNull) {
            stackIn_3_0 = (StringBuilder) null;
            return stackIn_3_0;
          }
          while (length > var5) {
            buffer.setCharAt(var5, fillCharacter);
            var5++;
          }
          stackIn_7_0 = (StringBuilder) (buffer);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("uk.C(").append(fillCharacter).append(',');
          if (buffer == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(length).append(',').append(returnNull).append(')').toString());
        }
    }

    final void drawScreen(byte obfuscationGuard) {
        super.drawScreen((byte) -50);
        GzipInflater.a(550, 5, 243, 5, 140, (byte) -107, 45);
        ContextActionController.field_g.drawParagraph(CanvasResizeController.messageText, 54, 149, 532, 225, 2, -1, 1, 1, 22);
        if (obfuscationGuard < -14) {
          this.a(0);
          return;
        }
    }

    final void layoutButtons(boolean obfuscationGuard) {
        this.e(2);
        if (obfuscationGuard) {
          return;
        }
        MessageScreen.f((byte) -66);
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          MessageScreen.f((byte) 127);
          return this.buttonTop;
        }
        return this.buttonTop;
    }

    static {
        field_u = "Unpacking graphics";
    }
}
