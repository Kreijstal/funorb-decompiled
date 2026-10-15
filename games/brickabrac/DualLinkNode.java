/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static String field_o;
    static UiComponent field_t;
    static int field_q;
    static RgbSprite[][] jungleCapsSprites;
    static int field_r;
    static String field_m;
    static byte[] field_k;
    long secondaryKey;
    static String field_i;
    DualLinkNode secondaryPrevious;
    static String quickChatRecipient;
    DualLinkNode secondaryNext;

    final void unlinkSecondary(int obfuscationGuard) {
        if (null == this.secondaryPrevious) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryPrevious = null;
        if (obfuscationGuard != 3) {
          this.secondaryNext = (DualLinkNode) null;
        }
        this.secondaryNext = null;
    }

    final static void drawSinglePlayerStatus(int height, MultiplayerMatch match, PaletteFont font, PlayerBoard board, byte obfuscationGuard, int x, int y, int width) {
        int lifeIndex = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String matchSummary = null;
        StringBuilder fontContextBuilder = null;
        String fontSummary = null;
        StringBuilder boardContextBuilder = null;
        String boardSummary = null;
        RuntimeException caughtFailure = null;
        int insetX = 0;
        RuntimeException failure = null;
        int insetY = 0;
        int lineHeight = 0;
        int drawX = 0;
        int drawY = 0;
        int unusedClientFlag = 0;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          insetX = 5;
          insetY = 5;
          lineHeight = 3 + font.capHeight + font.descent;
          drawX = insetX + x;
          drawY = y + (insetY + font.capHeight);
          font.drawLeft(ProducerFramebuffer.field_j, drawX, drawY, 2, -1);
          drawY = drawY + lineHeight;
          font.drawLeft(SecondaryNodeQueue.field_e, drawX, drawY, 1, -1);
          drawY = drawY + lineHeight;
          font.drawLeft(LoginCredentials.field_j, drawX, drawY, 2, -1);
          drawY = drawY + lineHeight;
          font.drawLeft(vd.field_d, drawX, drawY, 0, -1);
          if (obfuscationGuard >= -96) {
            return;
          }
          if (TextFieldRenderer.field_A &&
            !ValidationIconWidget.field_N) {
            return;
          }
          drawX -= 2;
          drawY = drawY + (font.descent + 4);
          for (lifeIndex = 0; lifeIndex < -1 + board.lives; lifeIndex++) {
            if (lifeIndex < -2 + board.lives) {
              ch.field_l.a(drawX, drawY, 196);
            } else {
              ch.field_l.e(ch.field_l.canvasWidth / 2 + drawX, drawY + ch.field_l.canvasHeight / 2, 0, 4480 + (BrickABrac.cosine8192(2048, 200 * MembershipBenefitsScreen.clientTick) * 384 >> 16));
            }
            drawX = drawX + ch.field_l.width / 2;
            if (x + width < drawX + ch.field_l.width) {
              drawY = drawY + (ch.field_l.height + 2);
              drawX = x + insetX - 2;
            }
            if (drawY + ch.field_l.height > y - (-height + insetY)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtException) {
          caughtFailure = caughtException;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("tk.VB(").append(height).append(',');
          if (match == null) {
            matchSummary = "null";
          } else {
            matchSummary = "{...}";
          }
          fontContextBuilder = ((StringBuilder) (Object) contextBuilder).append(matchSummary).append(',');
          if (font == null) {
            fontSummary = "null";
          } else {
            fontSummary = "{...}";
          }
          boardContextBuilder = ((StringBuilder) (Object) fontContextBuilder).append(fontSummary).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) boardContextBuilder).append(boardSummary).append(',').append(obfuscationGuard).append(',').append(x).append(',').append(y).append(',').append(width).append(')').toString());
        }
    }

    public static void a(int param0) {
        quickChatRecipient = null;
        field_o = null;
        if (param0 != -2) {
          quickChatRecipient = (String) null;
        }
        field_m = null;
        jungleCapsSprites = (RgbSprite[][]) null;
        field_k = null;
        field_i = null;
        field_t = null;
    }

    final static int a(int param0, byte param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -55) {
            field_k = (byte[]) null;
          }
          stackIn_3_0 = sq.a((byte) -32, param0, true, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tk.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final long getSecondaryKey(int obfuscationGuard) {
        if (obfuscationGuard != -19451) {
          this.secondaryNext = (DualLinkNode) null;
        }
        return this.secondaryKey;
    }

    final boolean isSecondaryLinked(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          DualLinkNode.prepareRankingScratch((byte) 86, 25, 9);
        }
        if (null == this.secondaryPrevious) {
          return false;
        }
        return true;
    }

    final void setSecondaryKey(long key, int obfuscationGuard) {
        if (this.secondaryPrevious != null) {
          throw new RuntimeException();
        }
        if (obfuscationGuard >= -62) {
          field_k = (byte[]) null;
        }
        this.secondaryKey = key;
    }

    final static void prepareRankingScratch(byte obfuscationGuard, int recordCount, int rowLimit) {
        if (null == cf.rankingSourceIndices ||
          !(recordCount <= cf.rankingSourceIndices.length)) {
          cf.rankingSourceIndices = new int[recordCount * 2];
        }
        if (DialogMessagePanel.rankingRatings == null ||
          !(DialogMessagePanel.rankingRatings.length >= recordCount)) {
          DialogMessagePanel.rankingRatings = new int[recordCount * 2];
        }
        if (RankingsScreen.rankingWins == null ||
          !(RankingsScreen.rankingWins.length >= recordCount)) {
          RankingsScreen.rankingWins = new int[recordCount * 2];
        }
        if (ObjectHistoryBuffer.rankingDraws == null ||
          !(recordCount <= ObjectHistoryBuffer.rankingDraws.length)) {
          ObjectHistoryBuffer.rankingDraws = new int[recordCount * 2];
        }
        if (null == WidgetGroup.rankingLosses ||
          !(recordCount <= WidgetGroup.rankingLosses.length)) {
          WidgetGroup.rankingLosses = new int[2 * recordCount];
        }
        if (DebouncedValidationSource.rankingWinRateThousandths == null ||
          !(DebouncedValidationSource.rankingWinRateThousandths.length >= recordCount)) {
          DebouncedValidationSource.rankingWinRateThousandths = new int[2 * recordCount];
        }
        if (VerticalScrollbar.rankingSortIndices == null ||
          !(rowLimit + recordCount <= VerticalScrollbar.rankingSortIndices.length)) {
          VerticalScrollbar.rankingSortIndices = new int[2 * (rowLimit + recordCount)];
        }
        if (null == ga.field_l ||
          !(ga.field_l.length >= recordCount)) {
          ga.field_l = new boolean[2 * recordCount];
        }
        BoundedFile.field_l = -2147483648;
        if (obfuscationGuard < 0) {
          return;
        }
        ProxySocketConnector.rankingRowCount = 0;
        ba.field_w = 2147483647;
        IntArrayRequest.field_u = 2147483647;
        uf.field_b = -2147483648;
    }

    final static boolean isValidSocialName(CharSequence name, boolean obfuscationGuard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!CheckboxWidgetRenderer.hasValidPlayerNameShape(name, 0, true)) {
            return false;
          }
          var2_int = 0;
          if (obfuscationGuard) {
            var4 = (CharSequence) null;
            DualLinkNode.isValidSocialName((CharSequence) null, false);
          }
          while (true) {
            if (name.length() <= var2_int) {
              return true;
            }
            if (ConditionalTextValue.isNameCharacter(true, name.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("tk.SB(");
          if (name == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    protected DualLinkNode() {
    }

    static {
        field_o = "Honour";
        field_m = "Show game chat from my friends";
        field_k = new byte[]{(byte) 1};
        field_i = "Scamming";
    }
}
