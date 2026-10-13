/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitmapTextLayout extends TextLayout {
    static String field_e;
    private BitmapFont cachedFont;
    private int cachedLineHeight;
    private int cachedHorizontalAlignment;
    private int cachedWidth;
    private boolean cachedSingleLine;
    static String field_j;
    private int cachedHeight;
    private String cachedText;
    private int cachedVerticalAlignment;

    final void layoutParagraph(String text, byte obfuscationGuard, int height, int verticalAlignment, int lineHeight, int horizontalAlignment, int width, BitmapFont font) {
        TextLineLayout unusedLineReceiver;
        TextLineLayout unusedLineAlias;
        int lineTop;
        int lineBottom;
        TextLineLayout unusedEmptyLineReceiver = null;
        TextLineLayout unusedEmptyLineAlias = null;
        int characterCount = 0;
        int spacingStep = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        StringBuilder errorContextWithText = null;
        String fontDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int lineCount = 0;
        int baselineY = 0;
        int verticalGap = 0;
        String lineText = null;
        TextLineLayout line = null;
        int obfuscationControl = 0;
        String[] wrappedLines = null;
        String[] wrappedLinesAlias = null;
        int lineIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (lineHeight == 0) {
            lineHeight = font.baselineHeight;
          }
          if (text == null) {
            this.lines = null;
            return;
          }
          if (font == this.cachedFont &&
            !this.cachedSingleLine &&
            horizontalAlignment == this.cachedHorizontalAlignment &&
            this.cachedVerticalAlignment == verticalAlignment &&
            lineHeight == this.cachedLineHeight &&
            this.cachedHeight == height &&
            width == this.cachedWidth &&
            null != this.cachedText &&
            this.cachedText.equals(text)) {
            return;
          }
          this.cachedVerticalAlignment = verticalAlignment;
          this.cachedWidth = width;
          if (obfuscationGuard != 30) {
            this.cachedHorizontalAlignment = -127;
          }
          this.cachedHorizontalAlignment = horizontalAlignment;
          this.cachedHeight = height;
          this.cachedFont = font;
          this.cachedText = text;
          this.cachedSingleLine = false;
          this.cachedLineHeight = lineHeight;
          wrappedLines = new String[font.getLineCount(text, width) + 1];
          wrappedLinesAlias = wrappedLines;
          lineCount = Math.max(1, font.wrapLines(text, new int[]{width}, wrappedLinesAlias));
          if (this.cachedVerticalAlignment == 3 &&
            lineCount == 1) {
            this.cachedVerticalAlignment = 1;
          }
          if (this.cachedVerticalAlignment != 0) {
            if (this.cachedVerticalAlignment == 1) {
              baselineY = font.maxAscent + (this.cachedHeight - this.cachedLineHeight * lineCount >> 1);
            } else {
              if (2 == this.cachedVerticalAlignment) {
                baselineY = -(lineCount * this.cachedLineHeight) - font.maxDescent + this.cachedHeight;
              } else {
                verticalGap = (this.cachedHeight - this.cachedLineHeight * lineCount) / (1 + lineCount);
                if (verticalGap < 0) {
                  verticalGap = 0;
                }
                this.cachedLineHeight = this.cachedLineHeight + verticalGap;
                baselineY = verticalGap + font.maxAscent;
              }
            }
          } else {
            baselineY = font.maxAscent;
          }
          this.lines = new TextLineLayout[lineCount];
          for (lineIndex = 0; lineCount > lineIndex; lineIndex++) {
            lineText = wrappedLines[lineIndex];
            unusedLineReceiver = null;
            unusedLineAlias = null;
            lineTop = -font.maxAscent + baselineY;
            lineBottom = font.maxDescent + baselineY;
            if (lineText == null) {
              unusedEmptyLineReceiver = null;
              unusedEmptyLineAlias = null;
              characterCount = 0;
            } else {
              unusedEmptyLineReceiver = null;
              unusedEmptyLineAlias = null;
              characterCount = lineText.length();
            }
            line = new TextLineLayout(lineTop, lineBottom, characterCount);
            line.caretXs[0] = 0;
            if (lineText != null) {
              line.caretXs[lineText.length()] = font.textWidth(lineText);
              if (horizontalAlignment == 3) {
                spacingStep = this.justificationStep(0, lineText, width, font.textWidth(lineText));
              } else {
                spacingStep = 0;
              }
              kd.computeCaretPositions(spacingStep, lineText, line, font, (byte) 84);
            }
            baselineY = baselineY + lineHeight;
            this.lines[lineIndex] = line;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ak.T(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          errorContextWithText = ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(obfuscationGuard).append(',').append(height).append(',').append(verticalAlignment).append(',').append(lineHeight).append(',').append(horizontalAlignment).append(',').append(width).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithText).append(fontDescription).append(')').toString());
        }
    }

    final void layoutRightAligned(int right, String text, BitmapFont font, int obfuscationGuard, int baselineY) {
        TextLineLayout line = null;
        TextLineLayout lineAlias = null;
        if (obfuscationGuard != -31932) {
          ResourceArchive guardArchive = (ResourceArchive) null;
          BitmapTextLayout.a(-2, (ResourceArchive) null, 6, -12);
        }
        if (text == null) {
          this.lines = null;
          return;
        }
        if (this.cachedFont == font && this.cachedSingleLine && this.cachedHorizontalAlignment == 2 && null != this.cachedText &&
          this.cachedText.equals(text)) {
          return;
        }
        try {
          this.cachedSingleLine = true;
          this.cachedText = text;
          this.cachedFont = font;
          this.cachedHorizontalAlignment = 2;
          line = this.createSingleLine(font, text, (byte) 74, baselineY);
          lineAlias = line;
          lineAlias.caretXs[0] = right - font.textWidth(text);
          lineAlias.caretXs[text.length()] = right;
          kd.computeCaretPositions(0, text, lineAlias, font, (byte) 97);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ak.J(" + right + ',' + (text != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + baselineY + ')');
        }
    }

    final static IndexedSprite[] a(int param0, ResourceArchive param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        IndexedSprite[] stackIn_5_0 = null;
        IndexedSprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kp.decodeSpriteSheetFromArchive(false, param3, param1, param0)) {
            stackIn_2_0 = null;
            return (IndexedSprite[]) (stackIn_2_0);
          }
          if (param2 == 0) {
            stackIn_7_0 = IntKeyLookup.buildDecodedIndexedSprites(111);
            return stackIn_7_0;
          }
          stackIn_5_0 = (IndexedSprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ak.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        try {
          mk.field_f = param0;
          gl.a(120, 12);
          if (param1 >= -61) {
            field_e = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ak.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void layoutCentered(int baselineY, byte obfuscationGuard, BitmapFont font, String text, int centerX) {
        RuntimeException failure = null;
        int textWidth = 0;
        TextLineLayout line = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String fontDescription = null;
        StringBuilder errorContextWithFont = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (text == null) {
            this.lines = null;
            return;
          }
          if (font == this.cachedFont &&
            this.cachedSingleLine &&
            this.cachedHorizontalAlignment == 1 &&
            null != this.cachedText &&
            this.cachedText.equals(text)) {
            return;
          }
          this.cachedHorizontalAlignment = 1;
          this.cachedSingleLine = true;
          this.cachedFont = font;
          line = this.createSingleLine(font, text, (byte) 115, baselineY);
          textWidth = font.textWidth(text);
          line.caretXs[0] = -(textWidth >> 1) + centerX;
          line.caretXs[text.length()] = centerX + (textWidth >> 1);
          kd.computeCaretPositions(0, text, line, font, (byte) 103);
          if (obfuscationGuard > 6) {
            return;
          }
          this.cachedLineHeight = 43;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ak.N(").append(baselineY).append(',').append(obfuscationGuard).append(',');
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          errorContextWithFont = ((StringBuilder) (Object) errorContext).append(fontDescription).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithFont).append(textDescription).append(',').append(centerX).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_j = null;
        if (!param0) {
          return;
        }
        field_e = null;
    }

    private final TextLineLayout createSingleLine(BitmapFont font, String text, byte obfuscationGuard, int baselineY) {
        TextLineLayout lineAlias = null;
        RuntimeException failure = null;
        TextLineLayout line = null;
        TextLineLayout result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String fontDescription = null;
        StringBuilder errorContextWithFont = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard < 2) {
            this.cachedHorizontalAlignment = 62;
          }
          line = new TextLineLayout(-font.maxAscent + baselineY, baselineY + font.maxDescent, text.length());
          lineAlias = line;
          this.lines = new TextLineLayout[]{line};
          result = lineAlias;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("ak.P(");
          if (font == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          errorContextWithFont = ((StringBuilder) (Object) errorContext).append(fontDescription).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContextWithFont).append(textDescription).append(',').append(obfuscationGuard).append(',').append(baselineY).append(')').toString());
        }
    }

    final void layoutLeftAligned(String text, int horizontalAlignment, BitmapFont font, int baselineY, int left) {
        TextLineLayout line = null;
        TextLineLayout lineAlias = null;
        if (text == null) {
          this.lines = null;
          return;
        }
        if (font == this.cachedFont && this.cachedSingleLine && this.cachedHorizontalAlignment == 0 && this.cachedText != null &&
          this.cachedText.equals(text)) {
          return;
        }
        try {
          this.cachedHorizontalAlignment = horizontalAlignment;
          this.cachedSingleLine = true;
          this.cachedFont = font;
          this.cachedText = text;
          line = this.createSingleLine(font, text, (byte) 18, baselineY);
          lineAlias = line;
          line.caretXs[0] = left;
          lineAlias.caretXs[text.length()] = left + font.textWidth(text);
          kd.computeCaretPositions(0, text, lineAlias, font, (byte) 83);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "ak.R(" + (text != null ? "{...}" : "null") + ',' + horizontalAlignment + ',' + (font != null ? "{...}" : "null") + ',' + baselineY + ',' + left + ')');
        }
    }

    final static void b(boolean param0) {
        tq.field_c = SoftwareRaster.width;
        CachedArchiveProvider.field_p = SoftwareRaster.height;
        AlphaWidgetContainer.d(false);
        SpellCastEvent.field_E.setLayout(-2 + no.field_T.height - 40, (byte) -124, 0, no.field_T.width, 0);
        t.field_g.setBounds(jn.field_d, -20500, GlobalSpell.field_f.width, 0, 0);
        int var1 = 2 + jn.field_d;
        IconTextComponent.field_Kb.setBounds(GlobalSpell.field_f.height - (!fh.field_c ? 0 : var1), -20500, GlobalSpell.field_f.width, !fh.field_c ? 0 : var1, 0);
        mj.a((byte) 91);
        cp.field_d.setBounds(40, -20500, no.field_T.width, no.field_T.height - 40, 0);
        ClientContextMenu.field_n.setBounds(30, -20500, ov.field_i.width, 0, 0);
        LobbyPlayer.field_Lb.setBounds(-30 + (-40 + ov.field_i.height) - 2, -20500, ov.field_i.width, 30, 0);
        r.field_v.setBounds(30, -20500, 68, 5, 5);
        ek.field_c.setBounds(30, -20500, 78, 5, 75);
        CombatViewTransition.field_p.setBounds(30, -20500, 48, 5, 155);
        bs.field_a.setBounds(30, -20500, 48, 5, 205);
        int var2 = !fh.field_c ? 200 : 250;
        SphinxActionRequest.field_A.setBounds(30, -20500, -var2 + 363, 5, var2 + 5);
        ModalDialog.field_K.setBounds(30, -20500, -370 + (-5 + ov.field_i.width), 5, 370);
        CipherPacketBuffer.field_x.setLayout(5, param0, LobbyPlayer.field_Lb.width - 5 - 5, 2, jn.field_c, 37, -32 + (LobbyPlayer.field_Lb.height - 5 - 5));
        int var3 = (ov.field_i.width + 2) / 2;
        fj.field_d.setBounds(40, -20500, var3 - 2, ov.field_i.height - 40, 0);
        if (!fh.field_c) {
          var3 = 0;
        }
        VineGrowthAction.field_x.setBounds(40, -20500, ov.field_i.width - var3, -40 + ov.field_i.height, var3);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var4Lifetime1;
        vd.field_b.position = 0;
        vd.field_b.writeByte(1, 12);
        vd.field_b.writeInt((byte) -128, CampaignMenuButton.connectionRandom.nextInt());
        vd.field_b.writeInt((byte) -75, CampaignMenuButton.connectionRandom.nextInt());
        if (param3 == 30) {
          vd.field_b.writeByte(1, param0);
          vd.field_b.writeByte(1, param1);
          vd.field_b.writeShort(true, param2);
          vd.field_b.a(-5247, cs.field_cb, mu.field_c);
          vl.outgoingPacket.writeCipheredOpcode(32161, 18);
          fieldTemp$0 = vl.outgoingPacket.position + 1;
          vl.outgoingPacket.position = vl.outgoingPacket.position + 1;
          var4 = fieldTemp$0;
          vl.outgoingPacket.writeBytes(vd.field_b.payload, 0, vd.field_b.position, param3 + 69);
          vl.outgoingPacket.writeByteLengthPrefix(-var4 + vl.outgoingPacket.position, param3 + 5900);
          return;
        }
        ResourceArchive var5 = (ResourceArchive) null;
        BitmapTextLayout.a(81, (ResourceArchive) null, -36, 38);
        vd.field_b.writeByte(1, param0);
        vd.field_b.writeByte(1, param1);
        vd.field_b.writeShort(true, param2);
        vd.field_b.a(-5247, cs.field_cb, mu.field_c);
        vl.outgoingPacket.writeCipheredOpcode(32161, 18);
        int fieldTemp$1 = vl.outgoingPacket.position + 1;
        vl.outgoingPacket.position = vl.outgoingPacket.position + 1;
        var4Lifetime1 = fieldTemp$1;
        vl.outgoingPacket.writeBytes(vd.field_b.payload, 0, vd.field_b.position, param3 + 69);
        vl.outgoingPacket.writeByteLengthPrefix(-var4Lifetime1 + vl.outgoingPacket.position, param3 + 5900);
    }

    final static RgbSprite[] b(int param0, int param1) {
        RgbSprite[] var3 = null;
        RgbSprite[] var2 = null;
        if (param1 == 5) {
          var3 = new RgbSprite[9];
          var2 = var3;
          var3[4] = SocialListEntry.a(false, param0, 64);
          return var2;
        }
        return (RgbSprite[]) null;
    }

    public BitmapTextLayout() {
    }

    static {
        field_j = "This entry doesn't match";
        field_e = "You can spectate this game";
    }
}
