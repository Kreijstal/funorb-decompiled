/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextFont extends DualLinkNode {
    private int[] inlineSpriteBaselines;
    int xHeight;
    private int[] glyphAdvances;
    private int[] glyphOffsetY;
    int ascent;
    private byte[] kerning;
    int capHeight;
    private static StringBuilder wrapScratch;
    private static int justifyRemainder256;
    private static int defaultPaint;
    int baselineHeight;
    private static String[] wrappedLines;
    private int[] glyphOffsetX;
    private static int defaultShadow;
    private static int justifyStep256;
    private int[] glyphWidths;
    private static int underlineColor;
    private int[] glyphHeights;
    int descent;
    private static int strikeColor;
    private static int defaultAlpha;
    private static int currentPaint;
    private IndexedSpriteGeometry[] inlineSprites;
    private static int currentAlpha;
    private static int currentShadow;

    abstract void drawGlyph(int glyphId, int x, int y, int width, int height, int paint, boolean shadow);

    private final void applyTag(String tag) {
        Throwable caughtTagFailure = null;
        Exception ignoredTagFailure = null;
        CharSequence paintText = null;
        CharSequence alphaText = null;
        CharSequence strikeText = null;
        CharSequence underlineText = null;
        CharSequence shadowText = null;
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
                                      this.resetStyle(defaultPaint, defaultShadow, defaultAlpha);
                                    }
                                  } else {
                                    currentShadow = defaultShadow;
                                  }
                                } else {
                                  currentShadow = 0;
                                }
                              } else {
                                shadowText = (CharSequence) ((Object) tag.substring(5));
                                currentShadow = DualLinkNode.parseRadixInt(16, (byte) -55, shadowText);
                              }
                            } else {
                              underlineColor = -1;
                            }
                          } else {
                            underlineColor = 0;
                          }
                        } else {
                          underlineText = (CharSequence) ((Object) tag.substring(2));
                          underlineColor = DualLinkNode.parseRadixInt(16, (byte) -55, underlineText);
                        }
                      } else {
                        strikeColor = -1;
                      }
                    } else {
                      strikeColor = 8388608;
                    }
                  } else {
                    strikeText = (CharSequence) ((Object) tag.substring(4));
                    strikeColor = DualLinkNode.parseRadixInt(16, (byte) -55, strikeText);
                  }
                } else {
                  currentAlpha = defaultAlpha;
                }
              } else {
                alphaText = (CharSequence) ((Object) tag.substring(6));
                currentAlpha = UsernameAvailabilityValidator.parseDecimalInt(alphaText, -28734);
              }
            } else {
              currentPaint = defaultPaint;
            }
          } else {
            paintText = (CharSequence) ((Object) tag.substring(4));
            currentPaint = DualLinkNode.parseRadixInt(16, (byte) -55, paintText);
          }
        } catch (java.lang.Exception caughtParameter) {
          caughtTagFailure = caughtParameter;
          ignoredTagFailure = (Exception) (Object) caughtTagFailure;
        }
    }

    public static void clearTextScratchBuffers() {
        wrapScratch = null;
        wrappedLines = null;
    }

    final int countWrappedLines(String text, int width) {
        return this.wrapText(text, new int[]{width}, wrappedLines);
    }

    final int drawParagraph(String text, int x, int y, int width, int height, int paint, int shadow, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        return this.drawParagraphAlpha(text, x, y, width, height, paint, shadow, 256, horizontalAlignment, verticalAlignment, lineSpacing);
    }

    final int drawParagraphAlpha(String text, int x, int y, int width, int height, int paint, int shadow, int alpha, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        int[] lineWidths;
        int lineCount;
        int baselineY;
        int distributedGap;
        int lineIndex;
        if (text == null) {
          return 0;
        }
        this.resetStyle(paint, shadow, alpha);
        if (lineSpacing == 0) {
          lineSpacing = this.baselineHeight;
        }
        lineWidths = new int[]{width};
        if (height < this.ascent + this.descent + lineSpacing &&
          height < lineSpacing + lineSpacing) {
          lineWidths = null;
        }
        lineCount = this.wrapText(text, lineWidths, wrappedLines);
        if (verticalAlignment == 3 &&
          lineCount == 1) {
          verticalAlignment = 1;
        }
        if (verticalAlignment != 0) {
          if (verticalAlignment != 1) {
            if (verticalAlignment != 2) {
              distributedGap = (height - this.ascent - this.descent - (lineCount - 1) * lineSpacing) / (lineCount + 1);
              if (distributedGap < 0) {
                distributedGap = 0;
              }
              baselineY = y + this.ascent + distributedGap;
              lineSpacing = lineSpacing + distributedGap;
            } else {
              baselineY = y + height - this.descent - (lineCount - 1) * lineSpacing;
            }
          } else {
            baselineY = y + this.ascent + (height - this.ascent - this.descent - (lineCount - 1) * lineSpacing) / 2;
          }
        } else {
          baselineY = y + this.ascent;
        }
        for (lineIndex = 0; lineIndex < lineCount; lineIndex++) {
          if (horizontalAlignment != 0) {
            if (horizontalAlignment != 1) {
              if (horizontalAlignment != 2) {
                if (lineIndex != lineCount - 1) {
                  this.prepareJustification(wrappedLines[lineIndex], width);
                  this.drawText(wrappedLines[lineIndex], x, baselineY);
                  justifyStep256 = 0;
                } else {
                  this.drawText(wrappedLines[lineIndex], x, baselineY);
                }
                baselineY = baselineY + lineSpacing;
              } else {
                this.drawText(wrappedLines[lineIndex], x + width - this.measureText(wrappedLines[lineIndex]), baselineY);
                baselineY = baselineY + lineSpacing;
              }
            } else {
              this.drawText(wrappedLines[lineIndex], x + (width - this.measureText(wrappedLines[lineIndex])) / 2, baselineY);
              baselineY = baselineY + lineSpacing;
            }
          } else {
            this.drawText(wrappedLines[lineIndex], x, baselineY);
            baselineY = baselineY + lineSpacing;
          }
        }
        return lineCount;
    }

    private final void resetStyle(int paint, int shadow, int alpha) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadow = shadow;
        currentShadow = shadow;
        defaultPaint = paint;
        currentPaint = paint;
        defaultAlpha = alpha;
        currentAlpha = alpha;
        justifyStep256 = 0;
        justifyRemainder256 = 0;
    }

    private final void prepareJustification(String text, int targetWidth) {
        int characterIndex = 0;
        int spaceCount;
        int insideTag;
        int textLength;
        int character;
        spaceCount = 0;
        insideTag = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          character = text.charAt(characterIndex);
          if (character != 60) {
            if (character != 62) {
              if (insideTag == 0 &&
                character == 32) {
                spaceCount++;
              }
            } else {
              insideTag = 0;
            }
          } else {
            insideTag = 1;
          }
        }
        if (spaceCount > 0) {
          justifyStep256 = (targetWidth - this.measureText(text) << 8) / spaceCount;
        }
    }

    final void drawRightAlpha(String text, int rightX, int baselineY, int paint, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(paint, shadow, alpha);
        this.drawText(text, rightX - this.measureText(text), baselineY);
    }

    private final void readMetrics(byte[] metrics) {
        int advanceIndex = 0;
        int advanceByteIndex = 0;
        int lengthByteIndex = 0;
        int startByteIndex = 0;
        int leadingGlyph = 0;
        byte[] newLeadingProfile = null;
        int leadingDeltaByteIndex = 0;
        byte[] newTrailingProfile = null;
        int trailingRow = 0;
        int trailingDeltaByteIndex = 0;
        int metricsCursor;
        int[] profileLengths;
        int[] profileStarts;
        int lengthIndex;
        byte[][] leadingProfiles;
        byte[][] trailingProfiles;
        int leadingAccumulator;
        int leadingRow;
        int[] profileLengthsAlias;
        byte[][] leadingProfilesAlias;
        byte[][] trailingProfilesAlias;
        int[] profileStartsAlias;
        int[] newProfileLengths;
        byte[][] newLeadingProfiles;
        byte[][] newTrailingProfiles;
        int[] newProfileStarts;
        int startIndex;
        int trailingAccumulator;
        int nextGlyph;
        int trailingGlyph;
        int previousGlyph;
        this.glyphAdvances = new int[256];
        if (metrics.length == 257) {
          for (metricsCursor = 0; metricsCursor < this.glyphAdvances.length; metricsCursor++) {
            this.glyphAdvances[metricsCursor] = metrics[metricsCursor] & 255;
          }
          this.baselineHeight = metrics[256] & 255;
        } else {
          metricsCursor = 0;
          for (advanceIndex = 0; advanceIndex < 256; advanceIndex++) {
            advanceByteIndex = metricsCursor;
            metricsCursor++;
            this.glyphAdvances[advanceIndex] = metrics[advanceByteIndex] & 255;
          }
          newProfileLengths = new int[256];
          profileLengthsAlias = newProfileLengths;
          profileLengths = profileLengthsAlias;
          newProfileStarts = new int[256];
          profileStartsAlias = newProfileStarts;
          profileStarts = profileStartsAlias;
          for (lengthIndex = 0; lengthIndex < 256; lengthIndex++) {
            lengthByteIndex = metricsCursor;
            metricsCursor++;
            profileLengths[lengthIndex] = metrics[lengthByteIndex] & 255;
          }
          for (startIndex = 0; startIndex < 256; startIndex++) {
            startByteIndex = metricsCursor;
            metricsCursor++;
            profileStarts[startIndex] = metrics[startByteIndex] & 255;
          }
          newLeadingProfiles = new byte[256][];
          leadingProfilesAlias = newLeadingProfiles;
          leadingProfiles = leadingProfilesAlias;
          for (leadingGlyph = 0; leadingGlyph < 256; leadingGlyph++) {
            newLeadingProfile = new byte[newProfileLengths[leadingGlyph]];
            leadingProfiles[leadingGlyph] = newLeadingProfile;
            leadingAccumulator = 0;
            for (leadingRow = 0; leadingRow < newLeadingProfiles[leadingGlyph].length; leadingRow++) {
              leadingDeltaByteIndex = metricsCursor;
              metricsCursor++;
              leadingAccumulator = (byte)(leadingAccumulator + metrics[leadingDeltaByteIndex]);
              newLeadingProfiles[leadingGlyph][leadingRow] = (byte)leadingAccumulator;
            }
          }
          newTrailingProfiles = new byte[256][];
          trailingProfilesAlias = newTrailingProfiles;
          trailingProfiles = trailingProfilesAlias;
          for (trailingGlyph = 0; trailingGlyph < 256; trailingGlyph++) {
            newTrailingProfile = new byte[newProfileLengths[trailingGlyph]];
            trailingProfiles[trailingGlyph] = newTrailingProfile;
            trailingAccumulator = 0;
            for (trailingRow = 0; trailingRow < newTrailingProfiles[trailingGlyph].length; trailingRow++) {
              trailingDeltaByteIndex = metricsCursor;
              metricsCursor++;
              trailingAccumulator = (byte)(trailingAccumulator + metrics[trailingDeltaByteIndex]);
              newTrailingProfiles[trailingGlyph][trailingRow] = (byte)trailingAccumulator;
            }
          }
          this.kerning = new byte[65536];
          for (previousGlyph = 0; previousGlyph < 256; previousGlyph++) {
            if (previousGlyph != 32 &&
              previousGlyph != 160) {
              for (nextGlyph = 0; nextGlyph < 256; nextGlyph++) {
                if (nextGlyph != 32 &&
                  nextGlyph != 160) {
                  this.kerning[(previousGlyph << 8) + nextGlyph] = (byte)TextFont.computePairKerning(newLeadingProfiles, newTrailingProfiles, newProfileStarts, this.glyphAdvances, newProfileLengths, previousGlyph, nextGlyph);
                }
              }
            }
          }
          this.baselineHeight = newProfileStarts[32] + newProfileLengths[32];
        }
    }

    final void drawRight(String text, int rightX, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, rightX - this.measureText(text), baselineY);
    }

    final void drawLeftAlpha(String text, int x, int baselineY, int paint, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(paint, shadow, alpha);
        this.drawText(text, x, baselineY);
    }

    private final void drawText(String text, int x, int baselineY) {
        int characterIndex = 0;
        int selectedSpriteBaseline = 0;
        Throwable caughtImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int textLength = 0;
        int characterOrGlyph = 0;
        String tag = null;
        int glyphWidth = 0;
        int imageIndexOrGlyphHeight = 0;
        Exception ignoredImageFailure = null;
        IndexedSpriteGeometry inlineSprite = null;
        int glyphStartX = 0;
        int spriteBaseline = 0;
        CharSequence imageIndexText = null;
        baselineY = baselineY - this.baselineHeight;
        tagStart = -1;
        previousGlyph = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          boolean emitGlyph = true;
          characterOrGlyph = text.charAt(characterIndex);
          if (characterOrGlyph != 60) {
            if (characterOrGlyph == 62 &&
              tagStart != -1) {
              tag = text.substring(tagStart + 1, characterIndex).toLowerCase();
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
                                this.applyTag(tag);
                              } else {
                                try {
                                  imageIndexText = (CharSequence) ((Object) tag.substring(4));
                                  imageIndexOrGlyphHeight = UsernameAvailabilityValidator.parseDecimalInt(imageIndexText, -28734);
                                  inlineSprite = this.inlineSprites[imageIndexOrGlyphHeight];
                                  if (this.inlineSpriteBaselines == null) {
                                    selectedSpriteBaseline = inlineSprite.canvasHeight;
                                  } else {
                                    selectedSpriteBaseline = this.inlineSpriteBaselines[imageIndexOrGlyphHeight];
                                  }
                                  spriteBaseline = selectedSpriteBaseline;
                                  if (currentAlpha != 256) {
                                    inlineSprite.drawAlpha(x, baselineY + this.baselineHeight - spriteBaseline, currentAlpha);
                                  } else {
                                    inlineSprite.drawTransparent(x, baselineY + this.baselineHeight - spriteBaseline);
                                  }
                                  x = x + inlineSprite.canvasWidth;
                                  previousGlyph = 0;
                                } catch (java.lang.Exception caughtParameter) {
                                  caughtImageFailure = caughtParameter;
                                  ignoredImageFailure = (Exception) (Object) caughtImageFailure;
                                }
                              }
                              emitGlyph = false;
                            }
                            else {
                              characterOrGlyph = 174;
                            }
                          } else {
                            characterOrGlyph = 169;
                          }
                        } else {
                          characterOrGlyph = 8364;
                        }
                      } else {
                        characterOrGlyph = 215;
                      }
                    } else {
                      characterOrGlyph = 173;
                    }
                  } else {
                    characterOrGlyph = 160;
                  }
                } else {
                  characterOrGlyph = 62;
                }
              } else {
                characterOrGlyph = 60;
              }
            }
            if ((emitGlyph) &&
              (tagStart == -1)) {
              characterOrGlyph = (char)(DateFieldsWidget.a(-8250, (char) characterOrGlyph) & 255);
              if (this.kerning != null &&
                previousGlyph != 0) {
                x = x + this.kerning[(previousGlyph << 8) + characterOrGlyph];
              }
              glyphWidth = this.glyphWidths[characterOrGlyph];
              imageIndexOrGlyphHeight = this.glyphHeights[characterOrGlyph];
              glyphStartX = x;
              if (characterOrGlyph == 32) {
                if (justifyStep256 > 0) {
                  justifyRemainder256 = justifyRemainder256 + justifyStep256;
                  x = x + (justifyRemainder256 >> 8);
                  justifyRemainder256 = justifyRemainder256 & 255;
                }
              } else {
                if (currentAlpha != 256) {
                  if (currentShadow != -1) {
                    this.drawGlyphAlpha(characterOrGlyph, x + this.glyphOffsetX[characterOrGlyph] + 1, baselineY + this.glyphOffsetY[characterOrGlyph] + 1, glyphWidth, imageIndexOrGlyphHeight, currentShadow, currentAlpha, true);
                  }
                  this.drawGlyphAlpha(characterOrGlyph, x + this.glyphOffsetX[characterOrGlyph], baselineY + this.glyphOffsetY[characterOrGlyph], glyphWidth, imageIndexOrGlyphHeight, currentPaint, currentAlpha, false);
                } else {
                  if (currentShadow != -1) {
                    this.drawGlyph(characterOrGlyph, x + this.glyphOffsetX[characterOrGlyph] + 1, baselineY + this.glyphOffsetY[characterOrGlyph] + 1, glyphWidth, imageIndexOrGlyphHeight, currentShadow, true);
                  }
                  this.drawGlyph(characterOrGlyph, x + this.glyphOffsetX[characterOrGlyph], baselineY + this.glyphOffsetY[characterOrGlyph], glyphWidth, imageIndexOrGlyphHeight, currentPaint, false);
                }
              }
              x = x + this.glyphAdvances[characterOrGlyph];
              if (strikeColor != -1) {
                Rasterizer2D.drawHorizontalLine(glyphStartX, baselineY + (int)((double)this.baselineHeight * 0.7), x - glyphStartX, strikeColor);
              }
              if (underlineColor != -1) {
                Rasterizer2D.drawHorizontalLine(glyphStartX, baselineY + this.baselineHeight + 1, x - glyphStartX, underlineColor);
              }
              previousGlyph = characterOrGlyph;
            }
          } else {
            tagStart = characterIndex;
          }
        }
    }

    private final void resetStyleOpaque(int paint, int shadow) {
        strikeColor = -1;
        underlineColor = -1;
        defaultShadow = shadow;
        currentShadow = shadow;
        defaultPaint = paint;
        currentPaint = paint;
        defaultAlpha = 256;
        currentAlpha = 256;
        justifyStep256 = 0;
        justifyRemainder256 = 0;
    }

    final void drawCenteredAlpha(String text, int centerX, int baselineY, int paint, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(paint, shadow, alpha);
        this.drawText(text, centerX - this.measureText(text) / 2, baselineY);
    }

    final int measureWrappedHeight(String text, int width, int lineSpacing) {
        if (lineSpacing == 0) {
          lineSpacing = this.baselineHeight;
        }
        int lineCount = this.wrapText(text, new int[]{width}, wrappedLines);
        int baselineSpan = (lineCount - 1) * lineSpacing;
        return this.ascent + baselineSpan + this.descent;
    }

    final void drawCentered(String text, int centerX, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, centerX - this.measureText(text) / 2, baselineY);
    }

    final void drawLeft(String text, int x, int baselineY, int paint, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyleOpaque(paint, shadow);
        this.drawText(text, x, baselineY);
    }

    final int measureWrappedWidth(String text, int width) {
        int lineIndex = 0;
        int lineCount;
        int maximumWidth;
        int lineWidth;
        lineCount = this.wrapText(text, new int[]{width}, wrappedLines);
        maximumWidth = 0;
        for (lineIndex = 0; lineIndex < lineCount; lineIndex++) {
          lineWidth = this.measureText(wrappedLines[lineIndex]);
          if (lineWidth > maximumWidth) {
            maximumWidth = lineWidth;
          }
        }
        return maximumWidth;
    }

    final int wrapText(String text, int[] lineWidths, String[] lines) {
        int characterIndex = 0;
        StringBuilder unusedOpenTagAppend = null;
        StringBuilder unusedTagAppend = null;
        StringBuilder unusedCloseTagAppend = null;
        StringBuilder unusedCharacterAppend = null;
        int widthAtLimitCheck = 0;
        int[] widthLimits = null;
        int widthLimitIndex = 0;
        Throwable caughtImageFailure = null;
        int lineWidth = 0;
        int lineStart = 0;
        int breakPosition = 0;
        int widthAtBreak = 0;
        int breakTrim = 0;
        int tagStart = 0;
        int previousCode = 0;
        int lineCount = 0;
        int textLength = 0;
        int characterOrGlyph = 0;
        String tag = null;
        int imageIndex = 0;
        Exception ignoredImageFailure = null;
        Object unusedReference = null;
        CharSequence imageIndexText = null;
        unusedReference = null;
        if (text == null) {
          return 0;
        }
        MessageScreen.resizeAndFillTextBuffer(' ', wrapScratch, 0, false);
        lineWidth = 0;
        lineStart = 0;
        breakPosition = -1;
        widthAtBreak = 0;
        breakTrim = 0;
        tagStart = -1;
        previousCode = 0;
        lineCount = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          characterOrGlyph = text.charAt(characterIndex);
          if (characterOrGlyph != 60) {
            if (characterOrGlyph == 62 &&
              tagStart != -1) {
              tag = text.substring(tagStart + 1, characterIndex).toLowerCase();
              tagStart = -1;
              unusedOpenTagAppend = wrapScratch.append('<');
              unusedTagAppend = wrapScratch.append(tag);
              unusedCloseTagAppend = wrapScratch.append('>');
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
                                    imageIndexText = (CharSequence) ((Object) tag.substring(4));
                                    imageIndex = UsernameAvailabilityValidator.parseDecimalInt(imageIndexText, -28734);
                                    lineWidth = lineWidth + this.inlineSprites[imageIndex].canvasWidth;
                                    previousCode = 0;
                                  } catch (java.lang.Exception caughtParameter) {
                                    caughtImageFailure = caughtParameter;
                                    ignoredImageFailure = (Exception) (Object) caughtImageFailure;
                                  }
                                }
                              } else {
                                lineWidth = lineWidth + this.getAdvance('®');
                                if (this.kerning != null &&
                                  previousCode != 0) {
                                  lineWidth = lineWidth + this.kerning[(previousCode << 8) + 174];
                                }
                                previousCode = 174;
                              }
                            } else {
                              lineWidth = lineWidth + this.getAdvance('©');
                              if (this.kerning != null &&
                                previousCode != 0) {
                                lineWidth = lineWidth + this.kerning[(previousCode << 8) + 169];
                              }
                              previousCode = 169;
                            }
                          } else {
                            lineWidth = lineWidth + this.getAdvance('€');
                            if (this.kerning != null &&
                              previousCode != 0) {
                              lineWidth = lineWidth + this.kerning[(previousCode << 8) + 128];
                            }
                            previousCode = 8364;
                          }
                        } else {
                          lineWidth = lineWidth + this.getAdvance('×');
                          if (this.kerning != null &&
                            previousCode != 0) {
                            lineWidth = lineWidth + this.kerning[(previousCode << 8) + 215];
                          }
                          previousCode = 215;
                        }
                      } else {
                        lineWidth = lineWidth + this.getAdvance('­');
                        if (this.kerning != null &&
                          previousCode != 0) {
                          lineWidth = lineWidth + this.kerning[(previousCode << 8) + 173];
                        }
                        previousCode = 173;
                      }
                    } else {
                      lineWidth = lineWidth + this.getAdvance(' ');
                      if (this.kerning != null &&
                        previousCode != 0) {
                        lineWidth = lineWidth + this.kerning[(previousCode << 8) + 160];
                      }
                      previousCode = 160;
                    }
                  } else {
                    lineWidth = lineWidth + this.getAdvance('>');
                    if (this.kerning != null &&
                      previousCode != 0) {
                      lineWidth = lineWidth + this.kerning[(previousCode << 8) + 62];
                    }
                    previousCode = 62;
                  }
                } else {
                  lineWidth = lineWidth + this.getAdvance('<');
                  if (this.kerning != null &&
                    previousCode != 0) {
                    lineWidth = lineWidth + this.kerning[(previousCode << 8) + 60];
                  }
                  previousCode = 60;
                }
              } else {
                lines[lineCount] = wrapScratch.toString().substring(lineStart, wrapScratch.length());
                lineCount++;
                lineStart = wrapScratch.length();
                lineWidth = 0;
                breakPosition = -1;
                previousCode = 0;
              }
              characterOrGlyph = 0;
            }
            if (tagStart == -1) {
              if (characterOrGlyph != 0) {
                unusedCharacterAppend = wrapScratch.append((char) characterOrGlyph);
                characterOrGlyph = (char)(DateFieldsWidget.a(-8250, (char) characterOrGlyph) & 255);
                lineWidth = lineWidth + this.glyphAdvances[characterOrGlyph];
                if (this.kerning != null &&
                  previousCode != 0) {
                  lineWidth = lineWidth + this.kerning[(previousCode << 8) + characterOrGlyph];
                }
                previousCode = characterOrGlyph;
              }
              if (characterOrGlyph == 32) {
                breakPosition = wrapScratch.length();
                widthAtBreak = lineWidth;
                breakTrim = 1;
              }
              if (lineWidths != null) {
                widthAtLimitCheck = lineWidth;
                widthLimits = (int[]) (lineWidths);
                if (lineCount >= lineWidths.length) {
                  widthLimitIndex = lineWidths.length - 1;
                } else {
                  widthLimitIndex = lineCount;
                }
                if (widthAtLimitCheck > widthLimits[widthLimitIndex] &&
                  breakPosition >= 0) {
                  lines[lineCount] = wrapScratch.toString().substring(lineStart, breakPosition - breakTrim);
                  lineCount++;
                  lineStart = breakPosition;
                  breakPosition = -1;
                  lineWidth = lineWidth - widthAtBreak;
                  previousCode = 0;
                }
              }
              if (characterOrGlyph == 45) {
                breakPosition = wrapScratch.length();
                widthAtBreak = lineWidth;
                breakTrim = 0;
              }
            }
          } else {
            tagStart = characterIndex;
          }
        }
        if (wrapScratch.length() > lineStart) {
          lines[lineCount] = wrapScratch.toString().substring(lineStart, wrapScratch.length());
          lineCount++;
        }
        return lineCount;
    }

    final int measureText(String text) {
        int characterIndex = 0;
        Throwable caughtImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int width = 0;
        int textLength = 0;
        int characterOrGlyph = 0;
        String tag = null;
        int imageIndex = 0;
        Exception ignoredImageFailure = null;
        CharSequence imageIndexText = null;
        if (text == null) {
          return 0;
        }
        tagStart = -1;
        previousGlyph = 0;
        width = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          boolean emitGlyph = true;
          characterOrGlyph = text.charAt(characterIndex);
          if (characterOrGlyph != 60) {
            if (characterOrGlyph == 62 &&
              tagStart != -1) {
              tag = text.substring(tagStart + 1, characterIndex).toLowerCase();
              tagStart = -1;
              if (!tag.equals("lt")) {
                if (!tag.equals("gt")) {
                  if (!tag.equals("nbsp")) {
                    if (!tag.equals("shy")) {
                      if (!tag.equals("times")) {
                        if (!tag.equals("euro")) {
                          if (!tag.equals("copy")) {
                            if (!tag.equals("reg")) {
                              if (!(!tag.startsWith("img="))) {
                                try {
                                  imageIndexText = (CharSequence) ((Object) tag.substring(4));
                                  imageIndex = UsernameAvailabilityValidator.parseDecimalInt(imageIndexText, -28734);
                                  width = width + this.inlineSprites[imageIndex].canvasWidth;
                                  previousGlyph = 0;
                                } catch (java.lang.Exception caughtParameter) {
                                  caughtImageFailure = caughtParameter;
                                  ignoredImageFailure = (Exception) (Object) caughtImageFailure;
                                }
                              }
                              emitGlyph = false;
                            }
                            else {
                              characterOrGlyph = 174;
                            }
                          } else {
                            characterOrGlyph = 169;
                          }
                        } else {
                          characterOrGlyph = 8364;
                        }
                      } else {
                        characterOrGlyph = 215;
                      }
                    } else {
                      characterOrGlyph = 173;
                    }
                  } else {
                    characterOrGlyph = 160;
                  }
                } else {
                  characterOrGlyph = 62;
                }
              } else {
                characterOrGlyph = 60;
              }
            }
            if ((emitGlyph) &&
              (tagStart == -1)) {
              characterOrGlyph = (char)(DateFieldsWidget.a(-8250, (char) characterOrGlyph) & 255);
              width = width + this.glyphAdvances[characterOrGlyph];
              if (this.kerning != null &&
                previousGlyph != 0) {
                width = width + this.kerning[(previousGlyph << 8) + characterOrGlyph];
              }
              previousGlyph = characterOrGlyph;
            }
          } else {
            tagStart = characterIndex;
          }
        }
        return width;
    }

    private final static int computePairKerning(byte[][] leadingProfiles, byte[][] trailingProfiles, int[] profileStarts, int[] advances, int[] profileLengths, int previousGlyph, int nextGlyph) {
        int row = 0;
        int previousProfileIndex = 0;
        int nextProfileIndex = 0;
        int previousStart;
        int previousEnd;
        int nextStart;
        int nextEnd;
        int overlapStart;
        int overlapEnd;
        int minimumGap;
        byte[] previousTrailingProfile;
        byte[] nextLeadingProfile;
        int previousRow;
        int nextRow;
        int profileGap;
        previousStart = profileStarts[previousGlyph];
        previousEnd = previousStart + profileLengths[previousGlyph];
        nextStart = profileStarts[nextGlyph];
        nextEnd = nextStart + profileLengths[nextGlyph];
        overlapStart = previousStart;
        if (nextStart > previousStart) {
          overlapStart = nextStart;
        }
        overlapEnd = previousEnd;
        if (nextEnd < previousEnd) {
          overlapEnd = nextEnd;
        }
        minimumGap = advances[previousGlyph];
        if (advances[nextGlyph] < minimumGap) {
          minimumGap = advances[nextGlyph];
        }
        previousTrailingProfile = trailingProfiles[previousGlyph];
        nextLeadingProfile = leadingProfiles[nextGlyph];
        previousRow = overlapStart - previousStart;
        nextRow = overlapStart - nextStart;
        for (row = overlapStart; row < overlapEnd; row++) {
          previousProfileIndex = previousRow;
          previousRow++;
          nextProfileIndex = nextRow;
          nextRow++;
          profileGap = previousTrailingProfile[previousProfileIndex] + nextLeadingProfile[nextProfileIndex];
          if (profileGap < minimumGap) {
            minimumGap = profileGap;
          }
        }
        return -minimumGap;
    }

    final void drawCharacter(char character, int x, int baselineY, int paint) {
        int glyphId = 0;
        if (character != 32) {
          baselineY = baselineY - this.baselineHeight;
          glyphId = DateFieldsWidget.a(-8250, character) & 255;
          this.drawGlyph(glyphId, x + this.glyphOffsetX[glyphId], baselineY + this.glyphOffsetY[glyphId], this.glyphWidths[glyphId], this.glyphHeights[glyphId], paint, false);
        }
    }

    final void setInlineSprites(IndexedSpriteGeometry[] sprites, int[] baselines) {
        if (baselines != null &&
          baselines.length != sprites.length) {
          throw new IllegalArgumentException();
        }
        this.inlineSprites = sprites;
        this.inlineSpriteBaselines = baselines;
    }

    final int getAdvance(char character) {
        return this.glyphAdvances[DateFieldsWidget.a(-8250, character) & 255];
    }

    final static String truncateText(TextFont font, String text, int width) {
        int characterIndex = 0;
        int ellipsisWidth;
        int prefixBudget;
        int prefixWidth;
        int advance;
        if (font.measureText(text) <= width) {
          return text;
        }
        ellipsisWidth = font.measureText("...");
        prefixBudget = width - ellipsisWidth;
        prefixWidth = 0;
        for (characterIndex = 0; characterIndex < text.length(); characterIndex++) {
          advance = font.getAdvance(text.charAt(characterIndex));
          if (prefixWidth + advance > prefixBudget) {
            return text.substring(0, characterIndex - 1) + "...";
          }
          prefixWidth = prefixWidth + advance;
        }
        return null;
    }

    final static String escapeAngles(String text) {
        int countIndex = 0;
        StringBuilder unusedCharacterAppend = null;
        StringBuilder unusedGreaterAppend = null;
        StringBuilder unusedLessAppend = null;
        int textLength;
        int extraCapacity;
        int characterToCount;
        StringBuilder escaped;
        int characterToAppend;
        int appendIndex;
        textLength = text.length();
        extraCapacity = 0;
        for (countIndex = 0; countIndex < textLength; countIndex++) {
          characterToCount = text.charAt(countIndex);
          if (characterToCount != 60) {
            if (characterToCount == 62) {
              extraCapacity += 3;
            }
          } else {
            extraCapacity += 3;
          }
        }
        escaped = new StringBuilder(textLength + extraCapacity);
        for (appendIndex = 0; appendIndex < textLength; appendIndex++) {
          characterToAppend = text.charAt(appendIndex);
          if (characterToAppend != 60) {
            if (characterToAppend != 62) {
              unusedCharacterAppend = escaped.append((char) characterToAppend);
            } else {
              unusedGreaterAppend = escaped.append("<gt>");
            }
          } else {
            unusedLessAppend = escaped.append("<lt>");
          }
        }
        return escaped.toString();
    }

    abstract void drawGlyphAlpha(int glyphId, int x, int y, int width, int height, int paint, int alpha, boolean shadow);

    TextFont(byte[] metrics, int[] glyphOffsetX, int[] glyphOffsetY, int[] glyphWidths, int[] glyphHeights) {
        int glyphIndex = 0;
        int minimumGlyphTop;
        int maximumGlyphBottom;
        this.baselineHeight = 0;
        this.glyphOffsetX = glyphOffsetX;
        this.glyphOffsetY = glyphOffsetY;
        this.glyphWidths = glyphWidths;
        this.glyphHeights = glyphHeights;
        this.readMetrics(metrics);
        minimumGlyphTop = 2147483647;
        maximumGlyphBottom = -2147483648;
        for (glyphIndex = 0; glyphIndex < 256; glyphIndex++) {
          if (this.glyphOffsetY[glyphIndex] < minimumGlyphTop &&
            this.glyphHeights[glyphIndex] != 0) {
            minimumGlyphTop = this.glyphOffsetY[glyphIndex];
          }
          if (this.glyphOffsetY[glyphIndex] + this.glyphHeights[glyphIndex] > maximumGlyphBottom) {
            maximumGlyphBottom = this.glyphOffsetY[glyphIndex] + this.glyphHeights[glyphIndex];
          }
        }
        this.ascent = this.baselineHeight - minimumGlyphTop;
        this.descent = maximumGlyphBottom - this.baselineHeight;
        this.capHeight = this.baselineHeight - this.glyphOffsetY[88];
        this.xHeight = this.baselineHeight - this.glyphOffsetY[120];
    }

    static {
        wrapScratch = new StringBuilder(100);
        justifyRemainder256 = 0;
        defaultShadow = -1;
        wrappedLines = new String[100];
        underlineColor = -1;
        defaultPaint = 0;
        strikeColor = -1;
        defaultAlpha = 256;
        justifyStep256 = 0;
        currentPaint = 0;
        currentAlpha = 256;
        currentShadow = -1;
    }
}
