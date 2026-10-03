/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkNode {
    private int[] glyphAdvances;
    int lineAdvance;
    private int[] glyphXOffsets;
    private int[] glyphWidths;
    private static StringBuilder wrappingBuffer;
    int maxAscent;
    private IndexedSpriteState[] inlineImages;
    private int[] glyphYOffsets;
    private static int defaultAlpha256;
    private static int defaultShadowColor;
    private static int currentAlpha256;
    private byte[] pairKerning;
    private static int currentTextColor;
    private static int defaultTextColor;
    private int[] glyphHeights;
    private static int underlineColor;
    private static int justificationRemainderQ8;
    private static String[] wrappedLines;
    private static int spaceExpansionQ8;
    int maxDescent;
    private int[] inlineImageBaselineOffsets;
    int capitalXAscent;
    private static int currentShadowColor;
    private static int strikethroughColor;

    private final void resetOpaqueTextStyle(int textColor, int shadowColor) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadowColor;
        currentShadowColor = shadowColor;
        defaultTextColor = textColor;
        currentTextColor = textColor;
        defaultAlpha256 = 256;
        currentAlpha256 = 256;
        spaceExpansionQ8 = 0;
        justificationRemainderQ8 = 0;
    }

    final int measureMaximumWrappedWidth(String text, int wrapWidth) {
        int lineIndex = 0;
        int lineCount;
        int maximumWidth;
        int lineWidth;
        lineCount = this.wrapText(text, new int[]{wrapWidth}, wrappedLines);
        maximumWidth = 0;
        for (lineIndex = 0; lineIndex < lineCount; lineIndex++) {
          lineWidth = this.measureTextWidth(wrappedLines[lineIndex]);
          if (lineWidth <= maximumWidth) {
            continue;
          }
          maximumWidth = lineWidth;
        }
        return maximumWidth;
    }

    private final void decodeFontMetrics(byte[] metrics) {
        int advanceGlyphIndex = 0;
        int advanceReadOffsetBeforeIncrement = 0;
        int lengthReadOffsetBeforeIncrement = 0;
        int profileOffsetReadOffsetBeforeIncrement = 0;
        int leadingProfileGlyphIndex = 0;
        byte[] allocatedLeadingProfile = null;
        int leadingDeltaReadOffsetBeforeIncrement = 0;
        byte[] allocatedTrailingProfile = null;
        int trailingProfileRow = 0;
        int trailingDeltaReadOffsetBeforeIncrement = 0;
        int glyphIndexOrMetricsOffset;
        int[] profileLengthsForUpdates;
        int[] profileOffsetsForUpdates;
        int profileMetadataGlyphIndex;
        byte[][] leadingProfilesForUpdates;
        byte[][] trailingProfilesForUpdates;
        int deltaSumOrFirstGlyphIndex;
        int profileRowOrDeltaSumOrSecondGlyphIndex;
        int[] profileLengthsForwarded;
        byte[][] leadingProfilesForwarded;
        byte[][] trailingProfilesForwarded;
        int[] profileOffsetsForwarded;
        int[] profileLengthsSnapshot;
        byte[][] leadingProfilesSnapshot;
        byte[][] trailingProfilesSnapshot;
        int[] profileOffsetsSnapshot;
        L0: {
          this.glyphAdvances = new int[256];
          if (metrics.length == 257) {
            for (glyphIndexOrMetricsOffset = 0; glyphIndexOrMetricsOffset < this.glyphAdvances.length; glyphIndexOrMetricsOffset++) {
              this.glyphAdvances[glyphIndexOrMetricsOffset] = metrics[glyphIndexOrMetricsOffset] & 255;
            }
            this.lineAdvance = metrics[256] & 255;
            break L0;
          }
          glyphIndexOrMetricsOffset = 0;
          for (advanceGlyphIndex = 0; advanceGlyphIndex < 256; advanceGlyphIndex++) {
            advanceReadOffsetBeforeIncrement = glyphIndexOrMetricsOffset;
            glyphIndexOrMetricsOffset++;
            this.glyphAdvances[advanceGlyphIndex] = metrics[advanceReadOffsetBeforeIncrement] & 255;
          }
          profileLengthsSnapshot = new int[256];
          profileLengthsForwarded = profileLengthsSnapshot;
          profileLengthsForUpdates = profileLengthsForwarded;
          profileOffsetsSnapshot = new int[256];
          profileOffsetsForwarded = profileOffsetsSnapshot;
          profileOffsetsForUpdates = profileOffsetsForwarded;
          for (profileMetadataGlyphIndex = 0; profileMetadataGlyphIndex < 256; profileMetadataGlyphIndex++) {
            lengthReadOffsetBeforeIncrement = glyphIndexOrMetricsOffset;
            glyphIndexOrMetricsOffset++;
            profileLengthsForUpdates[profileMetadataGlyphIndex] = metrics[lengthReadOffsetBeforeIncrement] & 255;
          }
          for (profileMetadataGlyphIndex = 0; profileMetadataGlyphIndex < 256; profileMetadataGlyphIndex++) {
            profileOffsetReadOffsetBeforeIncrement = glyphIndexOrMetricsOffset;
            glyphIndexOrMetricsOffset++;
            profileOffsetsForUpdates[profileMetadataGlyphIndex] = metrics[profileOffsetReadOffsetBeforeIncrement] & 255;
          }
          leadingProfilesSnapshot = new byte[256][];
          leadingProfilesForwarded = leadingProfilesSnapshot;
          leadingProfilesForUpdates = leadingProfilesForwarded;
          for (leadingProfileGlyphIndex = 0; leadingProfileGlyphIndex < 256; leadingProfileGlyphIndex++) {
            allocatedLeadingProfile = new byte[profileLengthsSnapshot[leadingProfileGlyphIndex]];
            leadingProfilesForUpdates[leadingProfileGlyphIndex] = allocatedLeadingProfile;
            deltaSumOrFirstGlyphIndex = 0;
            for (profileRowOrDeltaSumOrSecondGlyphIndex = 0; profileRowOrDeltaSumOrSecondGlyphIndex < leadingProfilesSnapshot[leadingProfileGlyphIndex].length; profileRowOrDeltaSumOrSecondGlyphIndex++) {
              leadingDeltaReadOffsetBeforeIncrement = glyphIndexOrMetricsOffset;
              glyphIndexOrMetricsOffset++;
              deltaSumOrFirstGlyphIndex = (byte)(deltaSumOrFirstGlyphIndex + metrics[leadingDeltaReadOffsetBeforeIncrement]);
              leadingProfilesSnapshot[leadingProfileGlyphIndex][profileRowOrDeltaSumOrSecondGlyphIndex] = (byte)deltaSumOrFirstGlyphIndex;
            }
          }
          trailingProfilesSnapshot = new byte[256][];
          trailingProfilesForwarded = trailingProfilesSnapshot;
          trailingProfilesForUpdates = trailingProfilesForwarded;
          for (deltaSumOrFirstGlyphIndex = 0; deltaSumOrFirstGlyphIndex < 256; deltaSumOrFirstGlyphIndex++) {
            allocatedTrailingProfile = new byte[profileLengthsSnapshot[deltaSumOrFirstGlyphIndex]];
            trailingProfilesForUpdates[deltaSumOrFirstGlyphIndex] = allocatedTrailingProfile;
            profileRowOrDeltaSumOrSecondGlyphIndex = 0;
            for (trailingProfileRow = 0; trailingProfileRow < trailingProfilesSnapshot[deltaSumOrFirstGlyphIndex].length; trailingProfileRow++) {
              trailingDeltaReadOffsetBeforeIncrement = glyphIndexOrMetricsOffset;
              glyphIndexOrMetricsOffset++;
              profileRowOrDeltaSumOrSecondGlyphIndex = (byte)(profileRowOrDeltaSumOrSecondGlyphIndex + metrics[trailingDeltaReadOffsetBeforeIncrement]);
              trailingProfilesSnapshot[deltaSumOrFirstGlyphIndex][trailingProfileRow] = (byte)profileRowOrDeltaSumOrSecondGlyphIndex;
            }
          }
          this.pairKerning = new byte[65536];
          deltaSumOrFirstGlyphIndex = 0;
          while (true) {
            if (deltaSumOrFirstGlyphIndex >= 256) {
              this.lineAdvance = profileOffsetsSnapshot[32] + profileLengthsSnapshot[32];
              break;
            }
            if (deltaSumOrFirstGlyphIndex == 32) {
              deltaSumOrFirstGlyphIndex++;
              continue;
            }
            if (deltaSumOrFirstGlyphIndex == 160) {
              deltaSumOrFirstGlyphIndex++;
              continue;
            }
            for (profileRowOrDeltaSumOrSecondGlyphIndex = 0; profileRowOrDeltaSumOrSecondGlyphIndex < 256; profileRowOrDeltaSumOrSecondGlyphIndex++) {
              if (profileRowOrDeltaSumOrSecondGlyphIndex == 32) {
                continue;
              }
              if (profileRowOrDeltaSumOrSecondGlyphIndex == 160) {
                continue;
              }
              this.pairKerning[(deltaSumOrFirstGlyphIndex << 8) + profileRowOrDeltaSumOrSecondGlyphIndex] = (byte)BitmapFont.computePairKerning(leadingProfilesSnapshot, trailingProfilesSnapshot, profileOffsetsSnapshot, this.glyphAdvances, profileLengthsSnapshot, deltaSumOrFirstGlyphIndex, profileRowOrDeltaSumOrSecondGlyphIndex);
            }
            deltaSumOrFirstGlyphIndex++;
            continue;
          }
        }
    }

    public static void releaseTextScratchStorage() {
        wrappingBuffer = null;
        wrappedLines = null;
    }

    final int wrapText(String text, int[] lineWidthLimits, String[] outputLines) {
        int textIndex = 0;
        StringBuilder builderAfterTagOpen = null;
        StringBuilder builderAfterTagText = null;
        StringBuilder builderAfterTagClose = null;
        StringBuilder builderAfterCharacter = null;
        int lineWidthBeforeLimitLookup = 0;
        int[] widthLimitsBeforeLookup = null;
        int widthLimitIndex = 0;
        Throwable caughtInlineImageFailure = null;
        int lineWidth = 0;
        int outputLineStart = 0;
        int breakPosition = 0;
        int widthAtBreak = 0;
        int breakCharacterTrim = 0;
        int tagStart = 0;
        int previousGlyph = 0;
        int lineCount = 0;
        int textLength = 0;
        int characterOrGlyphCode = 0;
        String tag = null;
        int inlineImageIndex = 0;
        Exception ignoredInlineImageFailure = null;
        Object unusedNullSnapshot = null;
        CharSequence inlineImageIndexText = null;
        unusedNullSnapshot = null;
        if (text == null) {
          return 0;
        }
        ug.a(wrappingBuffer, (byte) -126, ' ', 0);
        lineWidth = 0;
        outputLineStart = 0;
        breakPosition = -1;
        widthAtBreak = 0;
        breakCharacterTrim = 0;
        tagStart = -1;
        previousGlyph = 0;
        lineCount = 0;
        textLength = text.length();
        for (textIndex = 0; textIndex < textLength; textIndex++) {
          characterOrGlyphCode = text.charAt(textIndex);
          if (characterOrGlyphCode == 60) {
            tagStart = textIndex;
            continue;
          }
          if ((characterOrGlyphCode == 62) &&
              (tagStart != -1)) {
            tag = text.substring(tagStart + 1, textIndex).toLowerCase();
            tagStart = -1;
            builderAfterTagOpen = wrappingBuffer.append('<');
            builderAfterTagText = wrappingBuffer.append(tag);
            builderAfterTagClose = wrappingBuffer.append('>');
            if (!tag.equals("br")) {
              if (!tag.equals("lt")) {
                if (!tag.equals("gt")) {
                  if (!tag.equals("nbsp")) {
                    if (!tag.equals("shy")) {
                      if (!tag.equals("times")) {
                        if (!tag.equals("euro")) {
                          if (!tag.equals("copy")) {
                            if (!tag.equals("reg")) {
                              if (tag.startsWith("img=")) {
                                try {
                                  inlineImageIndexText = (CharSequence) ((Object) tag.substring(4));
                                  inlineImageIndex = ol.a(false, inlineImageIndexText);
                                  lineWidth = lineWidth + this.inlineImages[inlineImageIndex].fullWidth;
                                  previousGlyph = 0;
                                } catch (java.lang.Exception inlineImageFailure) {
                                  caughtInlineImageFailure = inlineImageFailure;
                                  ignoredInlineImageFailure = (Exception) (Object) caughtInlineImageFailure;
                                }
                              }
                            } else {
                              lineWidth = lineWidth + this.measureCharacterAdvance('®');
                              if ((this.pairKerning != null) &&
                                  (previousGlyph != 0)) {
                                lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 174];
                              }
                              previousGlyph = 174;
                            }
                          } else {
                            lineWidth = lineWidth + this.measureCharacterAdvance('©');
                            if ((this.pairKerning != null) &&
                                (previousGlyph != 0)) {
                              lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 169];
                            }
                            previousGlyph = 169;
                          }
                        } else {
                          lineWidth = lineWidth + this.measureCharacterAdvance('€');
                          if ((this.pairKerning != null) &&
                              (previousGlyph != 0)) {
                            lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 128];
                          }
                          previousGlyph = 8364;
                        }
                      } else {
                        lineWidth = lineWidth + this.measureCharacterAdvance('×');
                        if ((this.pairKerning != null) &&
                            (previousGlyph != 0)) {
                          lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 215];
                        }
                        previousGlyph = 215;
                      }
                    } else {
                      lineWidth = lineWidth + this.measureCharacterAdvance('­');
                      if ((this.pairKerning != null) &&
                          (previousGlyph != 0)) {
                        lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 173];
                      }
                      previousGlyph = 173;
                    }
                  } else {
                    lineWidth = lineWidth + this.measureCharacterAdvance(' ');
                    if ((this.pairKerning != null) &&
                        (previousGlyph != 0)) {
                      lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 160];
                    }
                    previousGlyph = 160;
                  }
                } else {
                  lineWidth = lineWidth + this.measureCharacterAdvance('>');
                  if ((this.pairKerning != null) &&
                      (previousGlyph != 0)) {
                    lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 62];
                  }
                  previousGlyph = 62;
                }
              } else {
                lineWidth = lineWidth + this.measureCharacterAdvance('<');
                if ((this.pairKerning != null) &&
                    (previousGlyph != 0)) {
                  lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + 60];
                }
                previousGlyph = 60;
              }
            } else {
              outputLines[lineCount] = wrappingBuffer.toString().substring(outputLineStart, wrappingBuffer.length());
              lineCount++;
              outputLineStart = wrappingBuffer.length();
              lineWidth = 0;
              breakPosition = -1;
              previousGlyph = 0;
            }
            characterOrGlyphCode = 0;
          }
          if (tagStart != -1) {
            continue;
          }
          if (characterOrGlyphCode != 0) {
            builderAfterCharacter = wrappingBuffer.append((char) characterOrGlyphCode);
            characterOrGlyphCode = (char)(ByteArrayBuffer.encodeTextCharacter((char) characterOrGlyphCode, true) & 255);
            lineWidth = lineWidth + this.glyphAdvances[characterOrGlyphCode];
            if ((this.pairKerning != null) &&
                (previousGlyph != 0)) {
              lineWidth = lineWidth + this.pairKerning[(previousGlyph << 8) + characterOrGlyphCode];
            }
            previousGlyph = characterOrGlyphCode;
          }
          if (characterOrGlyphCode == 32) {
            breakPosition = wrappingBuffer.length();
            widthAtBreak = lineWidth;
            breakCharacterTrim = 1;
          }
          if (lineWidthLimits != null) {
            lineWidthBeforeLimitLookup = lineWidth;
            widthLimitsBeforeLookup = (int[]) (lineWidthLimits);
            if (lineCount >= lineWidthLimits.length) {
              widthLimitIndex = lineWidthLimits.length - 1;
            } else {
              widthLimitIndex = lineCount;
            }
            if ((lineWidthBeforeLimitLookup > widthLimitsBeforeLookup[widthLimitIndex]) &&
                (breakPosition >= 0)) {
              outputLines[lineCount] = wrappingBuffer.toString().substring(outputLineStart, breakPosition - breakCharacterTrim);
              lineCount++;
              outputLineStart = breakPosition;
              breakPosition = -1;
              lineWidth = lineWidth - widthAtBreak;
              previousGlyph = 0;
            }
          }
          if (characterOrGlyphCode != 45) {
            continue;
          }
          breakPosition = wrappingBuffer.length();
          widthAtBreak = lineWidth;
          breakCharacterTrim = 0;
        }
        if (wrappingBuffer.length() > outputLineStart) {
          outputLines[lineCount] = wrappingBuffer.toString().substring(outputLineStart, wrappingBuffer.length());
          lineCount++;
        }
        return lineCount;
    }

    private final void prepareJustification(String text, int targetWidth) {
        int textIndex = 0;
        int spaceCount;
        int insideTag;
        int textLength;
        int character;
        spaceCount = 0;
        insideTag = 0;
        textLength = text.length();
        for (textIndex = 0; textIndex < textLength; textIndex++) {
          character = text.charAt(textIndex);
          if (character == 60) {
            insideTag = 1;
            continue;
          }
          if (character == 62) {
            insideTag = 0;
            continue;
          }
          if (insideTag != 0) {
            continue;
          }
          if (character != 32) {
            continue;
          }
          spaceCount++;
        }
        if (spaceCount > 0) {
          spaceExpansionQ8 = (targetWidth - this.measureTextWidth(text) << 8) / spaceCount;
        }
    }

    final int drawParagraph(String text, int left, int top, int width, int height, int textColor, int shadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        return this.drawParagraphAlpha(text, left, top, width, height, textColor, shadowColor, 256, horizontalAlignment, verticalAlignment, lineSpacing);
    }

    private final void applyStyleTag(String tag) {
        Throwable caughtStyleTagFailure = null;
        Exception ignoredStyleTagFailure = null;
        CharSequence textColorValue = null;
        CharSequence alphaValue = null;
        CharSequence strikethroughValue = null;
        CharSequence underlineValue = null;
        CharSequence shadowValue = null;
        try {
          if (!tag.startsWith("col=")) {
            if (!tag.equals("/col")) {
              if (!tag.startsWith("trans=")) {
                if (!tag.equals("/trans")) {
                  if (!tag.startsWith("str=")) {
                    if (!tag.equals("str")) {
                      if (!tag.equals("/str")) {
                        if (!tag.startsWith("u=")) {
                          if (!tag.equals("u")) {
                            if (!tag.equals("/u")) {
                              if (!tag.startsWith("shad=")) {
                                if (!tag.equals("shad")) {
                                  if (!tag.equals("/shad")) {
                                    if (tag.equals("br")) {
                                      this.resetTextStyle(defaultTextColor, defaultShadowColor, defaultAlpha256);
                                    }
                                  } else {
                                    currentShadowColor = defaultShadowColor;
                                  }
                                } else {
                                  currentShadowColor = 0;
                                }
                              } else {
                                shadowValue = (CharSequence) ((Object) tag.substring(5));
                                currentShadowColor = oa.a(16, shadowValue, 8192);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          underlineValue = (CharSequence) ((Object) tag.substring(2));
                          underlineColor = oa.a(16, underlineValue, 8192);
                        }
                      } else {
                        strikethroughColor = -1;
                      }
                    } else {
                      strikethroughColor = 8388608;
                    }
                  } else {
                    strikethroughValue = (CharSequence) ((Object) tag.substring(4));
                    strikethroughColor = oa.a(16, strikethroughValue, 8192);
                  }
                } else {
                  currentAlpha256 = defaultAlpha256;
                }
              } else {
                alphaValue = (CharSequence) ((Object) tag.substring(6));
                currentAlpha256 = ol.a(false, alphaValue);
              }
            } else {
              currentTextColor = defaultTextColor;
            }
          } else {
            textColorValue = (CharSequence) ((Object) tag.substring(4));
            currentTextColor = oa.a(16, textColorValue, 8192);
          }
        } catch (java.lang.Exception styleTagFailure) {
          caughtStyleTagFailure = styleTagFailure;
          ignoredStyleTagFailure = (Exception) (Object) caughtStyleTagFailure;
        }
    }

    final int drawParagraphAlpha(String text, int left, int top, int width, int height, int textColor, int shadowColor, int alpha256, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        int[] lineWidthLimits;
        int lineCount;
        int baselineY;
        int extraVerticalGapOrLineIndex;
        if (text == null) {
          return 0;
        }
        this.resetTextStyle(textColor, shadowColor, alpha256);
        if (lineSpacing == 0) {
          lineSpacing = this.lineAdvance;
        }
        lineWidthLimits = new int[]{width};
        if ((height < this.maxAscent + this.maxDescent + lineSpacing) &&
            (height < lineSpacing + lineSpacing)) {
          lineWidthLimits = null;
        }
        lineCount = this.wrapText(text, lineWidthLimits, wrappedLines);
        if ((verticalAlignment == 3) &&
            (lineCount == 1)) {
          verticalAlignment = 1;
        }
        if (verticalAlignment != 0) {
          if (verticalAlignment != 1) {
            if (verticalAlignment != 2) {
              extraVerticalGapOrLineIndex = (height - this.maxAscent - this.maxDescent - (lineCount - 1) * lineSpacing) / (lineCount + 1);
              if (extraVerticalGapOrLineIndex < 0) {
                extraVerticalGapOrLineIndex = 0;
              }
              baselineY = top + this.maxAscent + extraVerticalGapOrLineIndex;
              lineSpacing = lineSpacing + extraVerticalGapOrLineIndex;
            } else {
              baselineY = top + height - this.maxDescent - (lineCount - 1) * lineSpacing;
            }
          } else {
            baselineY = top + this.maxAscent + (height - this.maxAscent - this.maxDescent - (lineCount - 1) * lineSpacing) / 2;
          }
        } else {
          baselineY = top + this.maxAscent;
        }
        for (extraVerticalGapOrLineIndex = 0; extraVerticalGapOrLineIndex < lineCount; extraVerticalGapOrLineIndex++) {
          if (horizontalAlignment == 0) {
            this.drawStyledText(wrappedLines[extraVerticalGapOrLineIndex], left, baselineY);
            baselineY = baselineY + lineSpacing;
            continue;
          }
          if (horizontalAlignment == 1) {
            this.drawStyledText(wrappedLines[extraVerticalGapOrLineIndex], left + (width - this.measureTextWidth(wrappedLines[extraVerticalGapOrLineIndex])) / 2, baselineY);
            baselineY = baselineY + lineSpacing;
            continue;
          }
          if (horizontalAlignment == 2) {
            this.drawStyledText(wrappedLines[extraVerticalGapOrLineIndex], left + width - this.measureTextWidth(wrappedLines[extraVerticalGapOrLineIndex]), baselineY);
            baselineY = baselineY + lineSpacing;
            continue;
          }
          if (extraVerticalGapOrLineIndex != lineCount - 1) {
            this.prepareJustification(wrappedLines[extraVerticalGapOrLineIndex], width);
            this.drawStyledText(wrappedLines[extraVerticalGapOrLineIndex], left, baselineY);
            spaceExpansionQ8 = 0;
          } else {
            this.drawStyledText(wrappedLines[extraVerticalGapOrLineIndex], left, baselineY);
          }
          baselineY = baselineY + lineSpacing;
        }
        return lineCount;
    }

    abstract void drawGlyphAlpha(int glyphIndex, int x, int y, int width, int height, int color, int alpha256, boolean shadowPass);

    final int countWrappedLines(String text, int wrapWidth) {
        return this.wrapText(text, new int[]{wrapWidth}, wrappedLines);
    }

    private final void resetTextStyle(int textColor, int shadowColor, int alpha256) {
        strikethroughColor = -1;
        underlineColor = -1;
        defaultShadowColor = shadowColor;
        currentShadowColor = shadowColor;
        defaultTextColor = textColor;
        currentTextColor = textColor;
        defaultAlpha256 = alpha256;
        currentAlpha256 = alpha256;
        spaceExpansionQ8 = 0;
        justificationRemainderQ8 = 0;
    }

    final void drawCenteredText(String text, int centerX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
            return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, centerX - this.measureTextWidth(text) / 2, baselineY);
    }

    final int measureCharacterAdvance(char character) {
        return this.glyphAdvances[ByteArrayBuffer.encodeTextCharacter(character, true) & 255];
    }

    final void drawRightAlignedText(String text, int rightX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
            return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, rightX - this.measureTextWidth(text), baselineY);
    }

    final void drawText(String text, int leftX, int baselineY, int textColor, int shadowColor) {
        if (text == null) {
            return;
        }
        this.resetOpaqueTextStyle(textColor, shadowColor);
        this.drawStyledText(text, leftX, baselineY);
    }

    abstract void drawGlyph(int glyphIndex, int x, int y, int width, int height, int color, boolean shadowPass);

    final int measureTextWidth(String text) {
        Throwable caughtInlineImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int textWidth = 0;
        int textLength = 0;
        int textIndex = 0;
        int characterOrGlyphCode = 0;
        String tag = null;
        int inlineImageIndex = 0;
        Exception ignoredInlineImageFailure = null;
        CharSequence inlineImageIndexText = null;
        if (text == null) {
          return 0;
        }
        tagStart = -1;
        previousGlyph = 0;
        textWidth = 0;
        textLength = text.length();
        textIndex = 0;
        while (textIndex < textLength) {
          characterOrGlyphCode = text.charAt(textIndex);
          if (characterOrGlyphCode == 60) {
            tagStart = textIndex;
            textIndex++;
            continue;
          }
          if ((characterOrGlyphCode == 62) &&
              (tagStart != -1)) {
            tag = text.substring(tagStart + 1, textIndex).toLowerCase();
            tagStart = -1;
            if (!tag.equals("lt")) {
              if (!tag.equals("gt")) {
                if (!tag.equals("nbsp")) {
                  if (!tag.equals("shy")) {
                    if (!tag.equals("times")) {
                      if (!tag.equals("euro")) {
                        if (!tag.equals("copy")) {
                          if (!tag.equals("reg")) {
                            if (!tag.startsWith("img=")) {
                              textIndex++;
                              continue;
                            }
                            try {
                              inlineImageIndexText = (CharSequence) ((Object) tag.substring(4));
                              inlineImageIndex = ol.a(false, inlineImageIndexText);
                              textWidth = textWidth + this.inlineImages[inlineImageIndex].fullWidth;
                              previousGlyph = 0;
                              textIndex++;
                            } catch (java.lang.Exception inlineImageFailure) {
                              caughtInlineImageFailure = inlineImageFailure;
                              ignoredInlineImageFailure = (Exception) (Object) caughtInlineImageFailure;
                              textIndex++;
                            }
                            continue;
                          }
                          characterOrGlyphCode = 174;
                        } else {
                          characterOrGlyphCode = 169;
                        }
                      } else {
                        characterOrGlyphCode = 8364;
                      }
                    } else {
                      characterOrGlyphCode = 215;
                    }
                  } else {
                    characterOrGlyphCode = 173;
                  }
                } else {
                  characterOrGlyphCode = 160;
                }
              } else {
                characterOrGlyphCode = 62;
              }
            } else {
              characterOrGlyphCode = 60;
            }
          }
          if (tagStart != -1) {
            textIndex++;
            continue;
          }
          characterOrGlyphCode = (char)(ByteArrayBuffer.encodeTextCharacter((char) characterOrGlyphCode, true) & 255);
          textWidth = textWidth + this.glyphAdvances[characterOrGlyphCode];
          if ((this.pairKerning != null) &&
              (previousGlyph != 0)) {
            textWidth = textWidth + this.pairKerning[(previousGlyph << 8) + characterOrGlyphCode];
          }
          previousGlyph = characterOrGlyphCode;
          textIndex++;
        }
        return textWidth;
    }

    final int measureWrappedHeight(String text, int wrapWidth, int lineSpacing) {
        if (lineSpacing == 0) {
            lineSpacing = this.lineAdvance;
        }
        int lineCount = this.wrapText(text, new int[]{wrapWidth}, wrappedLines);
        int baselineSpan = (lineCount - 1) * lineSpacing;
        return this.maxAscent + baselineSpan + this.maxDescent;
    }

    private final static int computePairKerning(byte[][] leadingProfiles, byte[][] trailingProfiles, int[] profileOffsets, int[] advances, int[] profileLengths, int firstGlyph, int secondGlyph) {
        int overlapRow = 0;
        int firstProfileRowBeforeIncrement = 0;
        int secondProfileRowBeforeIncrement = 0;
        int firstProfileTop;
        int firstProfileBottom;
        int secondProfileTop;
        int secondProfileBottom;
        int overlapTop;
        int overlapBottom;
        int minimumGap;
        byte[] firstTrailingProfile;
        byte[] secondLeadingProfile;
        int firstProfileRow;
        int secondProfileRow;
        int gap;
        firstProfileTop = profileOffsets[firstGlyph];
        firstProfileBottom = firstProfileTop + profileLengths[firstGlyph];
        secondProfileTop = profileOffsets[secondGlyph];
        secondProfileBottom = secondProfileTop + profileLengths[secondGlyph];
        overlapTop = firstProfileTop;
        if (secondProfileTop > firstProfileTop) {
          overlapTop = secondProfileTop;
        }
        overlapBottom = firstProfileBottom;
        if (secondProfileBottom < firstProfileBottom) {
          overlapBottom = secondProfileBottom;
        }
        minimumGap = advances[firstGlyph];
        if (advances[secondGlyph] < minimumGap) {
          minimumGap = advances[secondGlyph];
        }
        firstTrailingProfile = trailingProfiles[firstGlyph];
        secondLeadingProfile = leadingProfiles[secondGlyph];
        firstProfileRow = overlapTop - firstProfileTop;
        secondProfileRow = overlapTop - secondProfileTop;
        for (overlapRow = overlapTop; overlapRow < overlapBottom; overlapRow++) {
          firstProfileRowBeforeIncrement = firstProfileRow;
          firstProfileRow++;
          secondProfileRowBeforeIncrement = secondProfileRow;
          secondProfileRow++;
          gap = firstTrailingProfile[firstProfileRowBeforeIncrement] + secondLeadingProfile[secondProfileRowBeforeIncrement];
          if (gap >= minimumGap) {
            continue;
          }
          minimumGap = gap;
        }
        return -minimumGap;
    }

    final void setInlineImages(IndexedSpriteState[] images, int[] baselineOffsets) {
        if (baselineOffsets != null && baselineOffsets.length != images.length) {
            throw new IllegalArgumentException();
        }
        this.inlineImages = images;
        this.inlineImageBaselineOffsets = baselineOffsets;
    }

    private final void drawStyledText(String text, int penX, int baselineYOrLineTop) {
        int selectedImageBaselineOffset = 0;
        Throwable caughtInlineImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int textLength = 0;
        int textIndex = 0;
        int characterOrGlyphCode = 0;
        String tag = null;
        int glyphWidth = 0;
        int inlineImageIndexOrGlyphHeight = 0;
        Exception ignoredInlineImageFailure = null;
        IndexedSpriteState inlineImage = null;
        int glyphAdvanceStartX = 0;
        int imageBaselineOffset = 0;
        CharSequence inlineImageIndexText = null;
        baselineYOrLineTop = baselineYOrLineTop - this.lineAdvance;
        tagStart = -1;
        previousGlyph = 0;
        textLength = text.length();
        textIndex = 0;
        while (true) {
          if (textIndex >= textLength) {
            return;
          }
          characterOrGlyphCode = text.charAt(textIndex);
          if (characterOrGlyphCode == 60) {
            tagStart = textIndex;
            textIndex++;
            continue;
          }
          if ((characterOrGlyphCode == 62) &&
              (tagStart != -1)) {
            tag = text.substring(tagStart + 1, textIndex).toLowerCase();
            tagStart = -1;
            if (!tag.equals("lt")) {
              if (!tag.equals("gt")) {
                if (!tag.equals("nbsp")) {
                  if (!tag.equals("shy")) {
                    if (!tag.equals("times")) {
                      if (!tag.equals("euro")) {
                        if (!tag.equals("copy")) {
                          if (!tag.equals("reg")) {
                            if (!tag.startsWith("img=")) {
                              this.applyStyleTag(tag);
                              textIndex++;
                              continue;
                            }
                            try {
                              inlineImageIndexText = (CharSequence) ((Object) tag.substring(4));
                              inlineImageIndexOrGlyphHeight = ol.a(false, inlineImageIndexText);
                              inlineImage = this.inlineImages[inlineImageIndexOrGlyphHeight];
                              if (this.inlineImageBaselineOffsets == null) {
                                selectedImageBaselineOffset = inlineImage.fullHeight;
                              } else {
                                selectedImageBaselineOffset = this.inlineImageBaselineOffsets[inlineImageIndexOrGlyphHeight];
                              }
                              imageBaselineOffset = selectedImageBaselineOffset;
                              if (currentAlpha256 != 256) {
                                inlineImage.drawAlpha(penX, baselineYOrLineTop + this.lineAdvance - imageBaselineOffset, currentAlpha256);
                              } else {
                                inlineImage.draw(penX, baselineYOrLineTop + this.lineAdvance - imageBaselineOffset);
                              }
                              penX = penX + inlineImage.fullWidth;
                              previousGlyph = 0;
                              textIndex++;
                            } catch (java.lang.Exception inlineImageFailure) {
                              caughtInlineImageFailure = inlineImageFailure;
                              ignoredInlineImageFailure = (Exception) (Object) caughtInlineImageFailure;
                              textIndex++;
                            }
                            continue;
                          }
                          characterOrGlyphCode = 174;
                        } else {
                          characterOrGlyphCode = 169;
                        }
                      } else {
                        characterOrGlyphCode = 8364;
                      }
                    } else {
                      characterOrGlyphCode = 215;
                    }
                  } else {
                    characterOrGlyphCode = 173;
                  }
                } else {
                  characterOrGlyphCode = 160;
                }
              } else {
                characterOrGlyphCode = 62;
              }
            } else {
              characterOrGlyphCode = 60;
            }
          }
          if (tagStart != -1) {
            textIndex++;
            continue;
          }
          characterOrGlyphCode = (char)(ByteArrayBuffer.encodeTextCharacter((char) characterOrGlyphCode, true) & 255);
          if ((this.pairKerning != null) &&
              (previousGlyph != 0)) {
            penX = penX + this.pairKerning[(previousGlyph << 8) + characterOrGlyphCode];
          }
          glyphWidth = this.glyphWidths[characterOrGlyphCode];
          inlineImageIndexOrGlyphHeight = this.glyphHeights[characterOrGlyphCode];
          glyphAdvanceStartX = penX;
          if (characterOrGlyphCode == 32) {
            if (spaceExpansionQ8 > 0) {
              justificationRemainderQ8 = justificationRemainderQ8 + spaceExpansionQ8;
              penX = penX + (justificationRemainderQ8 >> 8);
              justificationRemainderQ8 = justificationRemainderQ8 & 255;
            }
          } else {
            if (currentAlpha256 != 256) {
              if (currentShadowColor != -1) {
                this.drawGlyphAlpha(characterOrGlyphCode, penX + this.glyphXOffsets[characterOrGlyphCode] + 1, baselineYOrLineTop + this.glyphYOffsets[characterOrGlyphCode] + 1, glyphWidth, inlineImageIndexOrGlyphHeight, currentShadowColor, currentAlpha256, true);
              }
              this.drawGlyphAlpha(characterOrGlyphCode, penX + this.glyphXOffsets[characterOrGlyphCode], baselineYOrLineTop + this.glyphYOffsets[characterOrGlyphCode], glyphWidth, inlineImageIndexOrGlyphHeight, currentTextColor, currentAlpha256, false);
            } else {
              if (currentShadowColor != -1) {
                this.drawGlyph(characterOrGlyphCode, penX + this.glyphXOffsets[characterOrGlyphCode] + 1, baselineYOrLineTop + this.glyphYOffsets[characterOrGlyphCode] + 1, glyphWidth, inlineImageIndexOrGlyphHeight, currentShadowColor, true);
              }
              this.drawGlyph(characterOrGlyphCode, penX + this.glyphXOffsets[characterOrGlyphCode], baselineYOrLineTop + this.glyphYOffsets[characterOrGlyphCode], glyphWidth, inlineImageIndexOrGlyphHeight, currentTextColor, false);
            }
          }
          penX = penX + this.glyphAdvances[characterOrGlyphCode];
          if (strikethroughColor != -1) {
            SoftwareRasterizer.drawHorizontalLine(glyphAdvanceStartX, baselineYOrLineTop + (int)((double)this.lineAdvance * 0.7), penX - glyphAdvanceStartX, strikethroughColor);
          }
          if (underlineColor != -1) {
            SoftwareRasterizer.drawHorizontalLine(glyphAdvanceStartX, baselineYOrLineTop + this.lineAdvance + 1, penX - glyphAdvanceStartX, underlineColor);
          }
          previousGlyph = characterOrGlyphCode;
          textIndex++;
          continue;
        }
    }

    BitmapFont(byte[] metrics, int[] xOffsets, int[] yOffsets, int[] widths, int[] heights) {
        int glyphIndex = 0;
        int minimumGlyphTop;
        int maximumGlyphBottom;
        this.lineAdvance = 0;
        this.glyphXOffsets = xOffsets;
        this.glyphYOffsets = yOffsets;
        this.glyphWidths = widths;
        this.glyphHeights = heights;
        this.decodeFontMetrics(metrics);
        minimumGlyphTop = 2147483647;
        maximumGlyphBottom = -2147483648;
        for (glyphIndex = 0; glyphIndex < 256; glyphIndex++) {
          if ((this.glyphYOffsets[glyphIndex] < minimumGlyphTop) &&
              (this.glyphHeights[glyphIndex] != 0)) {
            minimumGlyphTop = this.glyphYOffsets[glyphIndex];
          }
          if (this.glyphYOffsets[glyphIndex] + this.glyphHeights[glyphIndex] <= maximumGlyphBottom) {
            continue;
          }
          maximumGlyphBottom = this.glyphYOffsets[glyphIndex] + this.glyphHeights[glyphIndex];
        }
        this.maxAscent = this.lineAdvance - minimumGlyphTop;
        this.maxDescent = maximumGlyphBottom - this.lineAdvance;
        this.capitalXAscent = this.lineAdvance - this.glyphYOffsets[88];
    }

    static {
        wrappingBuffer = new StringBuilder(100);
        currentAlpha256 = 256;
        defaultAlpha256 = 256;
        defaultTextColor = 0;
        defaultShadowColor = -1;
        currentTextColor = 0;
        justificationRemainderQ8 = 0;
        wrappedLines = new String[100];
        underlineColor = -1;
        spaceExpansionQ8 = 0;
        currentShadowColor = -1;
        strikethroughColor = -1;
    }
}
