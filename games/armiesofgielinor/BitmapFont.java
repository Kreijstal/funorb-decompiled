/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkedNode {
    private int[] glyphHeights;
    private int[] advances;
    private IndexedSpriteBase[] inlineSprites;
    private int[] glyphWidths;
    int maxAscent;
    private byte[] kerning;
    int xHeight;
    int maxDescent;
    private int[] glyphOffsetYs;
    private int[] inlineSpriteBaselines;
    int baselineHeight;
    private int[] glyphOffsetXs;
    private static StringBuilder wrapBuffer;
    int capitalHeight;
    private static int strikethroughColour;
    private static int underlineColour;
    private static int shadowColour;
    private static int justificationRemainder;
    private static int textColour;
    private static int textAlpha;
    private static int justificationStep;
    private static int defaultTextColour;
    private static String[] lineScratch;
    private static int defaultShadowColour;
    private static int defaultTextAlpha;

    final static String escapeMarkup(String text) {
        int countIndex = 0;
        StringBuilder characterAppendResult = null;
        StringBuilder greaterAppendResult = null;
        StringBuilder lessAppendResult = null;
        int textLength;
        int extraCapacity;
        int character;
        StringBuilder escaped;
        int escapeCharacter;
        int escapeIndex;
        textLength = text.length();
        extraCapacity = 0;
        for (countIndex = 0; countIndex < textLength; countIndex++) {
          character = text.charAt(countIndex);
          if (character != 60) {
            if (character == 62) {
              extraCapacity += 3;
            }
          } else {
            extraCapacity += 3;
          }
        }
        escaped = new StringBuilder(textLength + extraCapacity);
        for (escapeIndex = 0; escapeIndex < textLength; escapeIndex++) {
          escapeCharacter = text.charAt(escapeIndex);
          if (escapeCharacter != 60) {
            if (escapeCharacter != 62) {
              characterAppendResult = escaped.append((char) escapeCharacter);
            } else {
              greaterAppendResult = escaped.append("<gt>");
            }
          } else {
            lessAppendResult = escaped.append("<lt>");
          }
        }
        return escaped.toString();
    }

    final int textWidth(String text) {
        int characterIndex = 0;
        Throwable caughtImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int width = 0;
        int textLength = 0;
        int character = 0;
        String tag = null;
        int spriteIndex = 0;
        Exception imageFailure = null;
        CharSequence indexText = null;
        if (text == null) {
          return 0;
        }
        tagStart = -1;
        previousGlyph = 0;
        width = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          boolean measureCharacter = true;
          character = text.charAt(characterIndex);
          if (character != 60) {
            if (character == 62 &&
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
                                  indexText = (CharSequence) ((Object) tag.substring(4));
                                  spriteIndex = HuffmanCodec.a(49, indexText);
                                  width = width + this.inlineSprites[spriteIndex].canvasWidth;
                                  previousGlyph = 0;
                                } catch (java.lang.Exception caughtParameter) {
                                  caughtImageFailure = caughtParameter;
                                  imageFailure = (Exception) (Object) caughtImageFailure;
                                }
                              }
                              measureCharacter = false;
                            }
                            else {
                              character = 174;
                            }
                          } else {
                            character = 169;
                          }
                        } else {
                          character = 8364;
                        }
                      } else {
                        character = 215;
                      }
                    } else {
                      character = 173;
                    }
                  } else {
                    character = 160;
                  }
                } else {
                  character = 62;
                }
              } else {
                character = 60;
              }
            }
            if ((measureCharacter) &&
              (tagStart == -1)) {
              character = (char)(kw.a((char) character, 39) & 255);
              width = width + this.advances[character];
              if (this.kerning != null &&
                previousGlyph != 0) {
                width = width + this.kerning[(previousGlyph << 8) + character];
              }
              previousGlyph = character;
            }
          } else {
            tagStart = characterIndex;
          }
        }
        return width;
    }

    final int wrapLines(String text, int[] maximumWidths, String[] lines) {
        int characterIndex = 0;
        StringBuilder openingAppendResult = null;
        StringBuilder tagAppendResult = null;
        StringBuilder closingAppendResult = null;
        StringBuilder characterAppendResult = null;
        int widthForLimit = 0;
        int[] widthsForLimit = null;
        int widthLimitIndex = 0;
        Throwable caughtImageFailure = null;
        int lineWidth = 0;
        int lineStart = 0;
        int breakPosition = 0;
        int widthAtBreak = 0;
        int breakCharacterCount = 0;
        int tagStart = 0;
        int previousGlyph = 0;
        int lineCount = 0;
        int textLength = 0;
        int character = 0;
        String tag = null;
        int spriteIndex = 0;
        Exception imageFailure = null;
        Object unusedMarker = null;
        CharSequence indexText = null;
        unusedMarker = null;
        if (text == null) {
          return 0;
        }
        PortalLossCondition.a(' ', 0, wrapBuffer, true);
        lineWidth = 0;
        lineStart = 0;
        breakPosition = -1;
        widthAtBreak = 0;
        breakCharacterCount = 0;
        tagStart = -1;
        previousGlyph = 0;
        lineCount = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          character = text.charAt(characterIndex);
          if (character != 60) {
            if (character == 62 &&
              tagStart != -1) {
              tag = text.substring(tagStart + 1, characterIndex).toLowerCase();
              tagStart = -1;
              openingAppendResult = wrapBuffer.append('<');
              tagAppendResult = wrapBuffer.append(tag);
              closingAppendResult = wrapBuffer.append('>');
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
                                    indexText = (CharSequence) ((Object) tag.substring(4));
                                    spriteIndex = HuffmanCodec.a(25, indexText);
                                    lineWidth = lineWidth + this.inlineSprites[spriteIndex].canvasWidth;
                                    previousGlyph = 0;
                                  } catch (java.lang.Exception caughtParameter) {
                                    caughtImageFailure = caughtParameter;
                                    imageFailure = (Exception) (Object) caughtImageFailure;
                                  }
                                }
                              } else {
                                lineWidth = lineWidth + this.characterWidth('®');
                                if (this.kerning != null &&
                                  previousGlyph != 0) {
                                  lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 174];
                                }
                                previousGlyph = 174;
                              }
                            } else {
                              lineWidth = lineWidth + this.characterWidth('©');
                              if (this.kerning != null &&
                                previousGlyph != 0) {
                                lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 169];
                              }
                              previousGlyph = 169;
                            }
                          } else {
                            lineWidth = lineWidth + this.characterWidth('€');
                            if (this.kerning != null &&
                              previousGlyph != 0) {
                              lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 128];
                            }
                            previousGlyph = 8364;
                          }
                        } else {
                          lineWidth = lineWidth + this.characterWidth('×');
                          if (this.kerning != null &&
                            previousGlyph != 0) {
                            lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 215];
                          }
                          previousGlyph = 215;
                        }
                      } else {
                        lineWidth = lineWidth + this.characterWidth('­');
                        if (this.kerning != null &&
                          previousGlyph != 0) {
                          lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 173];
                        }
                        previousGlyph = 173;
                      }
                    } else {
                      lineWidth = lineWidth + this.characterWidth(' ');
                      if (this.kerning != null &&
                        previousGlyph != 0) {
                        lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 160];
                      }
                      previousGlyph = 160;
                    }
                  } else {
                    lineWidth = lineWidth + this.characterWidth('>');
                    if (this.kerning != null &&
                      previousGlyph != 0) {
                      lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 62];
                    }
                    previousGlyph = 62;
                  }
                } else {
                  lineWidth = lineWidth + this.characterWidth('<');
                  if (this.kerning != null &&
                    previousGlyph != 0) {
                    lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + 60];
                  }
                  previousGlyph = 60;
                }
              } else {
                lines[lineCount] = wrapBuffer.toString().substring(lineStart, wrapBuffer.length());
                lineCount++;
                lineStart = wrapBuffer.length();
                lineWidth = 0;
                breakPosition = -1;
                previousGlyph = 0;
              }
              character = 0;
            }
            if (tagStart == -1) {
              if (character != 0) {
                characterAppendResult = wrapBuffer.append((char) character);
                character = (char)(kw.a((char) character, 37) & 255);
                lineWidth = lineWidth + this.advances[character];
                if (this.kerning != null &&
                  previousGlyph != 0) {
                  lineWidth = lineWidth + this.kerning[(previousGlyph << 8) + character];
                }
                previousGlyph = character;
              }
              if (character == 32) {
                breakPosition = wrapBuffer.length();
                widthAtBreak = lineWidth;
                breakCharacterCount = 1;
              }
              if (maximumWidths != null) {
                widthForLimit = lineWidth;
                widthsForLimit = (int[]) (maximumWidths);
                if (lineCount >= maximumWidths.length) {
                  widthLimitIndex = maximumWidths.length - 1;
                } else {
                  widthLimitIndex = lineCount;
                }
                if (widthForLimit > widthsForLimit[widthLimitIndex] &&
                  breakPosition >= 0) {
                  lines[lineCount] = wrapBuffer.toString().substring(lineStart, breakPosition - breakCharacterCount);
                  lineCount++;
                  lineStart = breakPosition;
                  breakPosition = -1;
                  lineWidth = lineWidth - widthAtBreak;
                  previousGlyph = 0;
                }
              }
              if (character == 45) {
                breakPosition = wrapBuffer.length();
                widthAtBreak = lineWidth;
                breakCharacterCount = 0;
              }
            }
          } else {
            tagStart = characterIndex;
          }
        }
        if (wrapBuffer.length() > lineStart) {
          lines[lineCount] = wrapBuffer.toString().substring(lineStart, wrapBuffer.length());
          lineCount++;
        }
        return lineCount;
    }

    final int characterWidth(char character) {
        return this.advances[kw.a(character, -106) & 255];
    }

    private final void resetStyle(int colour, int shadow) {
        strikethroughColour = -1;
        underlineColour = -1;
        defaultShadowColour = shadow;
        shadowColour = shadow;
        defaultTextColour = colour;
        textColour = colour;
        defaultTextAlpha = 256;
        textAlpha = 256;
        justificationStep = 0;
        justificationRemainder = 0;
    }

    final int getWrappedWidth(String text, int maximumWidth) {
        int lineIndex = 0;
        int lineCount;
        int maximumLineWidth;
        int lineWidth;
        lineCount = this.wrapLines(text, new int[]{maximumWidth}, lineScratch);
        maximumLineWidth = 0;
        for (lineIndex = 0; lineIndex < lineCount; lineIndex++) {
          lineWidth = this.textWidth(lineScratch[lineIndex]);
          if (lineWidth > maximumLineWidth) {
            maximumLineWidth = lineWidth;
          }
        }
        return maximumLineWidth;
    }

    final void drawText(String text, int x, int baselineY, int colour, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow);
        this.drawStyledText(text, x, baselineY);
    }

    private final void applyStyleTag(String tag) {
        Throwable caughtTagFailure = null;
        Exception tagFailure = null;
        CharSequence colourText = null;
        CharSequence alphaText = null;
        CharSequence strikethroughText = null;
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
                                      this.resetStyle(defaultTextColour, defaultShadowColour, defaultTextAlpha);
                                    }
                                  } else {
                                    shadowColour = defaultShadowColour;
                                  }
                                } else {
                                  shadowColour = 0;
                                }
                              } else {
                                shadowText = (CharSequence) ((Object) tag.substring(5));
                                shadowColour = TextLayout.parseRadixInt(0, 16, shadowText);
                              }
                            } else {
                              underlineColour = -1;
                            }
                          } else {
                            underlineColour = 0;
                          }
                        } else {
                          underlineText = (CharSequence) ((Object) tag.substring(2));
                          underlineColour = TextLayout.parseRadixInt(0, 16, underlineText);
                        }
                      } else {
                        strikethroughColour = -1;
                      }
                    } else {
                      strikethroughColour = 8388608;
                    }
                  } else {
                    strikethroughText = (CharSequence) ((Object) tag.substring(4));
                    strikethroughColour = TextLayout.parseRadixInt(0, 16, strikethroughText);
                  }
                } else {
                  textAlpha = defaultTextAlpha;
                }
              } else {
                alphaText = (CharSequence) ((Object) tag.substring(6));
                textAlpha = HuffmanCodec.a(34, alphaText);
              }
            } else {
              textColour = defaultTextColour;
            }
          } else {
            colourText = (CharSequence) ((Object) tag.substring(4));
            textColour = TextLayout.parseRadixInt(0, 16, colourText);
          }
        } catch (java.lang.Exception caughtParameter) {
          caughtTagFailure = caughtParameter;
          tagFailure = (Exception) (Object) caughtTagFailure;
        }
    }

    final void drawCentered(String text, int x, int baselineY, int colour, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow);
        this.drawStyledText(text, x - this.textWidth(text) / 2, baselineY);
    }

    public static void a() {
        wrapBuffer = null;
        lineScratch = null;
    }

    final void setInlineSprites(IndexedSpriteBase[] sprites, int[] baselines) {
        if (baselines != null &&
          baselines.length != sprites.length) {
          throw new IllegalArgumentException();
        }
        this.inlineSprites = sprites;
        this.inlineSpriteBaselines = baselines;
    }

    private final void resetStyle(int colour, int shadow, int alpha) {
        strikethroughColour = -1;
        underlineColour = -1;
        defaultShadowColour = shadow;
        shadowColour = shadow;
        defaultTextColour = colour;
        textColour = colour;
        defaultTextAlpha = alpha;
        textAlpha = alpha;
        justificationStep = 0;
        justificationRemainder = 0;
    }

    final void drawTextWithAlpha(String text, int x, int baselineY, int colour, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow, alpha);
        this.drawStyledText(text, x, baselineY);
    }

    final void drawRightAligned(String text, int x, int baselineY, int colour, int shadow) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow);
        this.drawStyledText(text, x - this.textWidth(text), baselineY);
    }

    private final void prepareJustification(String text, int targetWidth) {
        int characterIndex = 0;
        int spaceCount;
        int inTag;
        int textLength;
        int character;
        spaceCount = 0;
        inTag = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          character = text.charAt(characterIndex);
          if (character != 60) {
            if (character != 62) {
              if (inTag == 0 &&
                character == 32) {
                spaceCount++;
              }
            } else {
              inTag = 0;
            }
          } else {
            inTag = 1;
          }
        }
        if (spaceCount > 0) {
          justificationStep = (targetWidth - this.textWidth(text) << 8) / spaceCount;
        }
    }

    final int drawParagraph(String text, int left, int top, int width, int height, int colour, int shadow, int alpha, int horizontalAlignment, int verticalAlignment, int lineHeight) {
        int[] maximumWidths;
        int lineCount;
        int baselineY;
        int verticalGap;
        int lineIndex;
        if (text == null) {
          return 0;
        }
        this.resetStyle(colour, shadow, alpha);
        if (lineHeight == 0) {
          lineHeight = this.baselineHeight;
        }
        maximumWidths = new int[]{width};
        if (height < this.maxAscent + this.maxDescent + lineHeight &&
          height < lineHeight + lineHeight) {
          maximumWidths = null;
        }
        lineCount = this.wrapLines(text, maximumWidths, lineScratch);
        if (verticalAlignment == 3 &&
          lineCount == 1) {
          verticalAlignment = 1;
        }
        if (verticalAlignment != 0) {
          if (verticalAlignment != 1) {
            if (verticalAlignment != 2) {
              verticalGap = (height - this.maxAscent - this.maxDescent - (lineCount - 1) * lineHeight) / (lineCount + 1);
              if (verticalGap < 0) {
                verticalGap = 0;
              }
              baselineY = top + this.maxAscent + verticalGap;
              lineHeight = lineHeight + verticalGap;
            } else {
              baselineY = top + height - this.maxDescent - (lineCount - 1) * lineHeight;
            }
          } else {
            baselineY = top + this.maxAscent + (height - this.maxAscent - this.maxDescent - (lineCount - 1) * lineHeight) / 2;
          }
        } else {
          baselineY = top + this.maxAscent;
        }
        for (lineIndex = 0; lineIndex < lineCount; lineIndex++) {
          if (horizontalAlignment != 0) {
            if (horizontalAlignment != 1) {
              if (horizontalAlignment != 2) {
                if (lineIndex != lineCount - 1) {
                  this.prepareJustification(lineScratch[lineIndex], width);
                  this.drawStyledText(lineScratch[lineIndex], left, baselineY);
                  justificationStep = 0;
                } else {
                  this.drawStyledText(lineScratch[lineIndex], left, baselineY);
                }
                baselineY = baselineY + lineHeight;
              } else {
                this.drawStyledText(lineScratch[lineIndex], left + width - this.textWidth(lineScratch[lineIndex]), baselineY);
                baselineY = baselineY + lineHeight;
              }
            } else {
              this.drawStyledText(lineScratch[lineIndex], left + (width - this.textWidth(lineScratch[lineIndex])) / 2, baselineY);
              baselineY = baselineY + lineHeight;
            }
          } else {
            this.drawStyledText(lineScratch[lineIndex], left, baselineY);
            baselineY = baselineY + lineHeight;
          }
        }
        return lineCount;
    }

    abstract void drawGlyph(int glyph, int left, int top, int width, int height, int colour, boolean shadow);

    final int getLineCount(String text, int maximumWidth) {
        return this.wrapLines(text, new int[]{maximumWidth}, lineScratch);
    }

    final static String truncateWithEllipsis(BitmapFont font, String text, int maximumWidth) {
        int characterIndex = 0;
        int ellipsisWidth;
        int availableWidth;
        int prefixWidth;
        int characterWidth;
        if (font.textWidth(text) <= maximumWidth) {
          return text;
        }
        ellipsisWidth = font.textWidth("...");
        availableWidth = maximumWidth - ellipsisWidth;
        prefixWidth = 0;
        for (characterIndex = 0; characterIndex < text.length(); characterIndex++) {
          characterWidth = font.characterWidth(text.charAt(characterIndex));
          if (prefixWidth + characterWidth > availableWidth) {
            return text.substring(0, characterIndex - 1) + "...";
          }
          prefixWidth = prefixWidth + characterWidth;
        }
        return null;
    }

    final int getParagraphHeight(String text, int width, int lineHeight) {
        if (lineHeight == 0) {
          lineHeight = this.baselineHeight;
        }
        int lineCount = this.wrapLines(text, new int[]{width}, lineScratch);
        int additionalLineHeight = (lineCount - 1) * lineHeight;
        return this.maxAscent + additionalLineHeight + this.maxDescent;
    }

    private final void decodeMetrics(byte[] metrics) {
        int advanceGlyph = 0;
        int advanceOffset = 0;
        int lengthOffset = 0;
        int profileOffsetIndex = 0;
        int leftGlyph = 0;
        byte[] leftProfile = null;
        int leftDeltaOffset = 0;
        byte[] rightProfile = null;
        int rightRow = 0;
        int rightDeltaOffset = 0;
        int cursor;
        int[] profileLengths;
        int[] profileOffsets;
        int lengthGlyph;
        byte[][] leftProfilesAlias;
        byte[][] rightProfilesAlias;
        int leftValue;
        int leftRow;
        int[] profileLengthsAlias;
        byte[][] leftProfilesSecondAlias;
        byte[][] rightProfilesSecondAlias;
        int[] profileOffsetsAlias;
        int[] profileLengthsSource;
        byte[][] leftProfiles;
        byte[][] rightProfiles;
        int[] profileOffsetsSource;
        int offsetGlyph;
        int rightValue;
        int nextGlyph;
        int rightGlyph;
        int previousGlyph;
        this.advances = new int[256];
        if (metrics.length == 257) {
          for (cursor = 0; cursor < this.advances.length; cursor++) {
            this.advances[cursor] = metrics[cursor] & 255;
          }
          this.baselineHeight = metrics[256] & 255;
        } else {
          cursor = 0;
          for (advanceGlyph = 0; advanceGlyph < 256; advanceGlyph++) {
            advanceOffset = cursor;
            cursor++;
            this.advances[advanceGlyph] = metrics[advanceOffset] & 255;
          }
          profileLengthsSource = new int[256];
          profileLengthsAlias = profileLengthsSource;
          profileLengths = profileLengthsAlias;
          profileOffsetsSource = new int[256];
          profileOffsetsAlias = profileOffsetsSource;
          profileOffsets = profileOffsetsAlias;
          for (lengthGlyph = 0; lengthGlyph < 256; lengthGlyph++) {
            lengthOffset = cursor;
            cursor++;
            profileLengths[lengthGlyph] = metrics[lengthOffset] & 255;
          }
          for (offsetGlyph = 0; offsetGlyph < 256; offsetGlyph++) {
            profileOffsetIndex = cursor;
            cursor++;
            profileOffsets[offsetGlyph] = metrics[profileOffsetIndex] & 255;
          }
          leftProfiles = new byte[256][];
          leftProfilesSecondAlias = leftProfiles;
          leftProfilesAlias = leftProfilesSecondAlias;
          for (leftGlyph = 0; leftGlyph < 256; leftGlyph++) {
            leftProfile = new byte[profileLengthsSource[leftGlyph]];
            leftProfilesAlias[leftGlyph] = leftProfile;
            leftValue = 0;
            for (leftRow = 0; leftRow < leftProfiles[leftGlyph].length; leftRow++) {
              leftDeltaOffset = cursor;
              cursor++;
              leftValue = (byte)(leftValue + metrics[leftDeltaOffset]);
              leftProfiles[leftGlyph][leftRow] = (byte)leftValue;
            }
          }
          rightProfiles = new byte[256][];
          rightProfilesSecondAlias = rightProfiles;
          rightProfilesAlias = rightProfilesSecondAlias;
          for (rightGlyph = 0; rightGlyph < 256; rightGlyph++) {
            rightProfile = new byte[profileLengthsSource[rightGlyph]];
            rightProfilesAlias[rightGlyph] = rightProfile;
            rightValue = 0;
            for (rightRow = 0; rightRow < rightProfiles[rightGlyph].length; rightRow++) {
              rightDeltaOffset = cursor;
              cursor++;
              rightValue = (byte)(rightValue + metrics[rightDeltaOffset]);
              rightProfiles[rightGlyph][rightRow] = (byte)rightValue;
            }
          }
          this.kerning = new byte[65536];
          for (previousGlyph = 0; previousGlyph < 256; previousGlyph++) {
            if (previousGlyph != 32 &&
              previousGlyph != 160) {
              for (nextGlyph = 0; nextGlyph < 256; nextGlyph++) {
                if (nextGlyph != 32 &&
                  nextGlyph != 160) {
                  this.kerning[(previousGlyph << 8) + nextGlyph] = (byte)BitmapFont.calculatePairKerning(leftProfiles, rightProfiles, profileOffsetsSource, this.advances, profileLengthsSource, previousGlyph, nextGlyph);
                }
              }
            }
          }
          this.baselineHeight = profileOffsetsSource[32] + profileLengthsSource[32];
        }
    }

    final int drawParagraph(String text, int left, int top, int width, int height, int colour, int shadow, int horizontalAlignment, int verticalAlignment, int lineHeight) {
        return this.drawParagraph(text, left, top, width, height, colour, shadow, 256, horizontalAlignment, verticalAlignment, lineHeight);
    }

    abstract void drawGlyphWithAlpha(int glyph, int left, int top, int width, int height, int colour, int alpha, boolean shadow);

    final void drawCenteredWithAlpha(String text, int x, int baselineY, int colour, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow, alpha);
        this.drawStyledText(text, x - this.textWidth(text) / 2, baselineY);
    }

    private final void drawStyledText(String text, int left, int baselineY) {
        int characterIndex = 0;
        int spriteBaseline = 0;
        Throwable caughtImageFailure = null;
        int tagStart = 0;
        int previousGlyph = 0;
        int textLength = 0;
        int character = 0;
        String tag = null;
        int glyphWidth = 0;
        int glyphHeightOrSpriteIndex = 0;
        Exception imageFailure = null;
        IndexedSpriteBase sprite = null;
        int glyphLeft = 0;
        int imageBaseline = 0;
        CharSequence indexText = null;
        baselineY = baselineY - this.baselineHeight;
        tagStart = -1;
        previousGlyph = 0;
        textLength = text.length();
        for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
          boolean drawCharacter = true;
          character = text.charAt(characterIndex);
          if (character != 60) {
            if (character == 62 &&
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
                                this.applyStyleTag(tag);
                              } else {
                                try {
                                  indexText = (CharSequence) ((Object) tag.substring(4));
                                  glyphHeightOrSpriteIndex = HuffmanCodec.a(12, indexText);
                                  sprite = this.inlineSprites[glyphHeightOrSpriteIndex];
                                  if (this.inlineSpriteBaselines == null) {
                                    spriteBaseline = sprite.canvasHeight;
                                  } else {
                                    spriteBaseline = this.inlineSpriteBaselines[glyphHeightOrSpriteIndex];
                                  }
                                  imageBaseline = spriteBaseline;
                                  if (textAlpha != 256) {
                                    sprite.drawAlpha(left, baselineY + this.baselineHeight - imageBaseline, textAlpha);
                                  } else {
                                    sprite.draw(left, baselineY + this.baselineHeight - imageBaseline);
                                  }
                                  left = left + sprite.canvasWidth;
                                  previousGlyph = 0;
                                } catch (java.lang.Exception caughtParameter) {
                                  caughtImageFailure = caughtParameter;
                                  imageFailure = (Exception) (Object) caughtImageFailure;
                                }
                              }
                              drawCharacter = false;
                            }
                            else {
                              character = 174;
                            }
                          } else {
                            character = 169;
                          }
                        } else {
                          character = 8364;
                        }
                      } else {
                        character = 215;
                      }
                    } else {
                      character = 173;
                    }
                  } else {
                    character = 160;
                  }
                } else {
                  character = 62;
                }
              } else {
                character = 60;
              }
            }
            if ((drawCharacter) &&
              (tagStart == -1)) {
              character = (char)(kw.a((char) character, 90) & 255);
              if (this.kerning != null &&
                previousGlyph != 0) {
                left = left + this.kerning[(previousGlyph << 8) + character];
              }
              glyphWidth = this.glyphWidths[character];
              glyphHeightOrSpriteIndex = this.glyphHeights[character];
              glyphLeft = left;
              if (character == 32) {
                if (justificationStep > 0) {
                  justificationRemainder = justificationRemainder + justificationStep;
                  left = left + (justificationRemainder >> 8);
                  justificationRemainder = justificationRemainder & 255;
                }
              } else {
                if (textAlpha != 256) {
                  if (shadowColour != -1) {
                    this.drawGlyphWithAlpha(character, left + this.glyphOffsetXs[character] + 1, baselineY + this.glyphOffsetYs[character] + 1, glyphWidth, glyphHeightOrSpriteIndex, shadowColour, textAlpha, true);
                  }
                  this.drawGlyphWithAlpha(character, left + this.glyphOffsetXs[character], baselineY + this.glyphOffsetYs[character], glyphWidth, glyphHeightOrSpriteIndex, textColour, textAlpha, false);
                } else {
                  if (shadowColour != -1) {
                    this.drawGlyph(character, left + this.glyphOffsetXs[character] + 1, baselineY + this.glyphOffsetYs[character] + 1, glyphWidth, glyphHeightOrSpriteIndex, shadowColour, true);
                  }
                  this.drawGlyph(character, left + this.glyphOffsetXs[character], baselineY + this.glyphOffsetYs[character], glyphWidth, glyphHeightOrSpriteIndex, textColour, false);
                }
              }
              left = left + this.advances[character];
              if (strikethroughColour != -1) {
                SoftwareRaster.e(glyphLeft, baselineY + (int)((double)this.baselineHeight * 0.7), left - glyphLeft, strikethroughColour);
              }
              if (underlineColour != -1) {
                SoftwareRaster.e(glyphLeft, baselineY + this.baselineHeight + 1, left - glyphLeft, underlineColour);
              }
              previousGlyph = character;
            }
          } else {
            tagStart = characterIndex;
          }
        }
    }

    final void drawRightAlignedWithAlpha(String text, int x, int baselineY, int colour, int shadow, int alpha) {
        if (text == null) {
          return;
        }
        this.resetStyle(colour, shadow, alpha);
        this.drawStyledText(text, x - this.textWidth(text), baselineY);
    }

    BitmapFont(byte[] metrics, int[] glyphOffsetXs, int[] glyphOffsetYs, int[] glyphWidths, int[] glyphHeights) {
        int glyph = 0;
        int minimumInkY;
        int maximumInkEndY;
        this.baselineHeight = 0;
        this.glyphOffsetXs = glyphOffsetXs;
        this.glyphOffsetYs = glyphOffsetYs;
        this.glyphWidths = glyphWidths;
        this.glyphHeights = glyphHeights;
        this.decodeMetrics(metrics);
        minimumInkY = 2147483647;
        maximumInkEndY = -2147483648;
        for (glyph = 0; glyph < 256; glyph++) {
          if (this.glyphOffsetYs[glyph] < minimumInkY &&
            this.glyphHeights[glyph] != 0) {
            minimumInkY = this.glyphOffsetYs[glyph];
          }
          if (this.glyphOffsetYs[glyph] + this.glyphHeights[glyph] > maximumInkEndY) {
            maximumInkEndY = this.glyphOffsetYs[glyph] + this.glyphHeights[glyph];
          }
        }
        this.maxAscent = this.baselineHeight - minimumInkY;
        this.maxDescent = maximumInkEndY - this.baselineHeight;
        this.capitalHeight = this.baselineHeight - this.glyphOffsetYs[88];
        this.xHeight = this.baselineHeight - this.glyphOffsetYs[120];
    }

    private final static int calculatePairKerning(byte[][] leftProfiles, byte[][] rightProfiles, int[] profileOffsets, int[] advances, int[] profileLengths, int previousGlyph, int nextGlyph) {
        int profileY = 0;
        int previousRow = 0;
        int nextRow = 0;
        int previousStart;
        int previousEnd;
        int nextStart;
        int nextEnd;
        int overlapStart;
        int overlapEnd;
        int minimumSpacing;
        byte[] previousRightProfile;
        byte[] nextLeftProfile;
        int previousProfileIndex;
        int nextProfileIndex;
        int profileSpacing;
        previousStart = profileOffsets[previousGlyph];
        previousEnd = previousStart + profileLengths[previousGlyph];
        nextStart = profileOffsets[nextGlyph];
        nextEnd = nextStart + profileLengths[nextGlyph];
        overlapStart = previousStart;
        if (nextStart > previousStart) {
          overlapStart = nextStart;
        }
        overlapEnd = previousEnd;
        if (nextEnd < previousEnd) {
          overlapEnd = nextEnd;
        }
        minimumSpacing = advances[previousGlyph];
        if (advances[nextGlyph] < minimumSpacing) {
          minimumSpacing = advances[nextGlyph];
        }
        previousRightProfile = rightProfiles[previousGlyph];
        nextLeftProfile = leftProfiles[nextGlyph];
        previousProfileIndex = overlapStart - previousStart;
        nextProfileIndex = overlapStart - nextStart;
        for (profileY = overlapStart; profileY < overlapEnd; profileY++) {
          previousRow = previousProfileIndex;
          previousProfileIndex++;
          nextRow = nextProfileIndex;
          nextProfileIndex++;
          profileSpacing = previousRightProfile[previousRow] + nextLeftProfile[nextRow];
          if (profileSpacing < minimumSpacing) {
            minimumSpacing = profileSpacing;
          }
        }
        return -minimumSpacing;
    }

    static {
        wrapBuffer = new StringBuilder(100);
        underlineColour = -1;
        justificationRemainder = 0;
        textAlpha = 256;
        shadowColour = -1;
        strikethroughColour = -1;
        textColour = 0;
        justificationStep = 0;
        defaultShadowColour = -1;
        defaultTextColour = 0;
        lineScratch = new String[100];
        defaultTextAlpha = 256;
    }
}
