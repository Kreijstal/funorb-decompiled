/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ToolkitFont {
    private FontMetrics metrics;
    private GraphicsToolkit toolkit;

    final void drawText(int baselineY, int x, int color, String text, byte guard, int shadowColor) {
        if (guard > -7) {
          return;
        }
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(color, shadowColor, 60);
          this.drawTextRun(-274, baselineY, (ToolkitSprite[]) null, x, 0, 0, text, (int[]) null, (SpriteMask) null);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "da.I(" + baselineY + ',' + x + ',' + color + ',' + (text != null ? "{...}" : "null") + ',' + guard + ',' + shadowColor + ')');
        }
    }

    final int drawWrappedText(int height, int color, int maskX, int width, int x, int[] spriteBaselineOffsets, ToolkitSprite[] inlineSprites, int y, int shadowColor, int maskY, int lineHeight, int guard, String text, SpriteMask mask, int horizontalAlignment, int verticalAlignment) {
        RuntimeException var17 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -8787) {
            this.toolkit = (GraphicsToolkit) null;
          }
          stackIn_3_0 = this.drawParagraph(mask, inlineSprites, maskX, spriteBaselineOffsets, text, height, color, lineHeight, 0, shadowColor, x, width, horizontalAlignment, maskY, 92, verticalAlignment, y);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("da.P(").append(height).append(',').append(color).append(',').append(maskX).append(',').append(width).append(',').append(x).append(',');
          if (spriteBaselineOffsets == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (inlineSprites == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(y).append(',').append(shadowColor).append(',').append(maskY).append(',').append(lineHeight).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (mask == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(horizontalAlignment).append(',').append(verticalAlignment).append(')').toString());
        }
    }

    final void drawRightAlignedText(int shadowColor, int rightX, String text, int baselineY, int color, int guard) {
        if (text == null) {
          return;
        }
        try {
          if (guard < 40) {
            this.toolkit = (GraphicsToolkit) null;
          }
          this.resetTextStyle(color, shadowColor, 60);
          this.drawTextRun(-274, baselineY, (ToolkitSprite[]) null, -this.metrics.stringWidth(text, 0) + rightX, 0, 0, text, (int[]) null, (SpriteMask) null);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "da.O(" + shadowColor + ',' + rightX + ',' + (text != null ? "{...}" : "null") + ',' + baselineY + ',' + color + ',' + guard + ')');
        }
    }

    private final void applyStyleTag(String tag, int guard) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Exception var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        CharSequence var10 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = -2 / ((guard - 31) / 40);
          try {
            if (tag.startsWith("col=")) {
              var6 = (CharSequence) ((Object) tag.substring(4));
              ArchiveLoadingStage.textColor = ArchiveLoadingStage.textColor & -16777216 | 16777215 & AccountUiBootstrap.parseInt((byte) -73, var6, 16);
            } else {
              if (tag.equals("/col")) {
                ArchiveLoadingStage.textColor = 16777215 & PacketBuffer.defaultTextColor | -16777216 & ArchiveLoadingStage.textColor;
              }
            }
            if (!tag.startsWith("argb=")) {
              if (!tag.equals("/argb")) {
                if (!tag.startsWith("str=")) {
                  if (!tag.equals("str")) {
                    if (!tag.equals("/str")) {
                      if (!tag.startsWith("u=")) {
                        if (!tag.equals("u")) {
                          if (!tag.equals("/u")) {
                            if (tag.equalsIgnoreCase("shad=-1")) {
                              LoginMethodPreference.textShadowColor = 0;
                            } else {
                              if (tag.startsWith("shad=")) {
                                var10 = (CharSequence) ((Object) tag.substring(5));
                                LoginMethodPreference.textShadowColor = ArchiveLoadingStage.textColor & -16777216 | AccountUiBootstrap.parseInt((byte) -73, var10, 16);
                              } else {
                                if (!tag.equals("shad")) {
                                  if (!tag.equals("/shad")) {
                                    if (tag.equals("br")) {
                                      this.resetTextStyle(PacketBuffer.defaultTextColor, LoginDialogNavigation.defaultShadowColor, 60);
                                    }
                                  } else {
                                    LoginMethodPreference.textShadowColor = LoginDialogNavigation.defaultShadowColor;
                                  }
                                } else {
                                  LoginMethodPreference.textShadowColor = ArchiveLoadingStage.textColor & -16777216;
                                }
                              }
                            }
                          } else {
                            StatefulWidgetRenderer.underlineColor = -1;
                          }
                        } else {
                          StatefulWidgetRenderer.underlineColor = -16777216 & ArchiveLoadingStage.textColor;
                        }
                      } else {
                        var9 = (CharSequence) ((Object) tag.substring(2));
                        StatefulWidgetRenderer.underlineColor = -16777216 & ArchiveLoadingStage.textColor | AccountUiBootstrap.parseInt((byte) -73, var9, 16);
                      }
                    } else {
                      ScrollControl.strikethroughColor = -1;
                    }
                  } else {
                    ScrollControl.strikethroughColor = 8388608 | -16777216 & ArchiveLoadingStage.textColor;
                  }
                } else {
                  var8 = (CharSequence) ((Object) tag.substring(4));
                  ScrollControl.strikethroughColor = -16777216 & ArchiveLoadingStage.textColor | AccountUiBootstrap.parseInt((byte) -73, var8, 16);
                }
              } else {
                ArchiveLoadingStage.textColor = PacketBuffer.defaultTextColor;
              }
            } else {
              var7 = (CharSequence) ((Object) tag.substring(5));
              ArchiveLoadingStage.textColor = AccountUiBootstrap.parseInt((byte) -73, var7, 16);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("da.L(");
          if (tag == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(guard).append(')').toString());
        }
    }

    private final int drawParagraph(SpriteMask mask, ToolkitSprite[] inlineSprites, int maskX, int[] spriteBaselineOffsets, String text, int height, int color, int lineHeight, int maxLines, int shadowColor, int x, int width, int horizontalAlignment, int maskY, int guard, int verticalAlignment, int y) {
        int stackIn_4_0 = 0;
        int stackIn_47_0 = 0;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        SpriteMask var23 = null;
        int var21Lifetime1;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (text == null) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          this.resetTextStyle(color, shadowColor, 60);
          if (lineHeight == 0) {
            lineHeight = this.metrics.field_d;
          }
          if (lineHeight + this.metrics.field_c + this.metrics.field_i > height &&
            height < lineHeight + lineHeight) {
            var18 = null;
          } else {
            var18 = new int[]{width};
          }
          if (maxLines == -1) {
            maxLines = height / lineHeight;
            if (maxLines <= 0) {
              maxLines = 1;
            }
          }
          var19 = this.metrics.wrapLines(text, false, VertexStreamLayout.field_a, (int[]) (var18), inlineSprites);
          if (maxLines > 0 &&
            var19 >= maxLines) {
            var19 = maxLines;
            VertexStreamLayout.field_a[-1 + maxLines] = this.metrics.ellipsize(width, VertexStreamLayout.field_a[maxLines - 1], inlineSprites, -63);
          }
          if (verticalAlignment == 3 &&
            var19 == 1) {
            verticalAlignment = 1;
          }
          if (guard < 38) {
            var23 = (SpriteMask) null;
            this.drawTextRun(98, 62, (ToolkitSprite[]) null, 36, 116, -67, (String) null, (int[]) null, (SpriteMask) null);
          }
          if (0 == verticalAlignment) {
            var20 = y + this.metrics.field_i;
          } else {
            if (1 == verticalAlignment) {
              var20 = this.metrics.field_i + (y + (-((var19 - 1) * lineHeight) - this.metrics.field_c + height - this.metrics.field_i) / 2);
            } else {
              if (verticalAlignment != 2) {
                var21 = (-this.metrics.field_c + (height - (this.metrics.field_i + lineHeight * (-1 + var19)))) / (1 + var19);
                if (var21 < 0) {
                  var21 = 0;
                }
                lineHeight = lineHeight + var21;
                var20 = y + (this.metrics.field_i + var21);
              } else {
                var20 = -((var19 - 1) * lineHeight) - this.metrics.field_c + height + y;
              }
            }
          }
          for (var21Lifetime1 = 0; var21Lifetime1 < var19; var21Lifetime1++) {
            if (horizontalAlignment != 0) {
              if (horizontalAlignment == 1) {
                this.drawTextRun(-274, var20, inlineSprites, x + (-this.metrics.stringWidth(VertexStreamLayout.field_a[var21Lifetime1], 0) + width) / 2, maskX, maskY, VertexStreamLayout.field_a[var21Lifetime1], spriteBaselineOffsets, mask);
              } else {
                if (horizontalAlignment != 2) {
                  if (var19 - 1 == var21Lifetime1) {
                    this.drawTextRun(-274, var20, inlineSprites, x, maskX, maskY, VertexStreamLayout.field_a[var21Lifetime1], spriteBaselineOffsets, mask);
                  } else {
                    this.setJustification(VertexStreamLayout.field_a[var21Lifetime1], width, (byte) 5);
                    this.drawTextRun(-274, var20, inlineSprites, x, maskX, maskY, VertexStreamLayout.field_a[var21Lifetime1], spriteBaselineOffsets, mask);
                    StringBuilderSupport.spaceJustificationQ8 = 0;
                  }
                } else {
                  this.drawTextRun(-274, var20, inlineSprites, width + (x - this.metrics.stringWidth(VertexStreamLayout.field_a[var21Lifetime1], 0)), maskX, maskY, VertexStreamLayout.field_a[var21Lifetime1], spriteBaselineOffsets, mask);
                }
              }
            } else {
              this.drawTextRun(-274, var20, inlineSprites, x, maskX, maskY, VertexStreamLayout.field_a[var21Lifetime1], spriteBaselineOffsets, mask);
            }
            var20 = var20 + lineHeight;
          }
          stackIn_47_0 = var19;
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_50_0 = var18;
          stackIn_50_1 = new StringBuilder().append("da.H(");
          if (mask == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (inlineSprites == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(maskX).append(',');
          if (spriteBaselineOffsets == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          stackIn_59_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',');
          if (text == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) (stackIn_50_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(height).append(',').append(color).append(',').append(lineHeight).append(',').append(maxLines).append(',').append(shadowColor).append(',').append(x).append(',').append(width).append(',').append(horizontalAlignment).append(',').append(maskY).append(',').append(guard).append(',').append(verticalAlignment).append(',').append(y).append(')').toString());
        }
    }

    private final void drawTextRun(int guard, int baselineY, ToolkitSprite[] inlineSprites, int x, int maskX, int maskY, String text, int[] spriteBaselineOffsets, SpriteMask mask) {
        int var13 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        Throwable decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        int var16_int = 0;
        Exception var16 = null;
        ToolkitSprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        CharSequence var21 = null;
        var20 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          baselineY = baselineY - this.metrics.field_d;
          var10_int = -1;
          var11 = -1;
          var12 = text.length();
          if (guard != -274) {
            return;
          }
          for (var13 = 0; var13 < var12; var13++) {
            boolean decompiledFrameRemainder0 = true;
            var14 = (char)(255 & HardwareReflectionEffect.encodeCp1252Character(true, text.charAt(var13)));
            if (60 != var14) {
              if (62 == var14 &&
                var10_int != -1) {
                var15_ref_String = text.substring(var10_int + 1, var13);
                var10_int = -1;
                if (var15_ref_String.equals("lt")) {
                  var14 = 60;
                } else {
                  if (var15_ref_String.equals("gt")) {
                    var14 = 62;
                  } else {
                    if (!var15_ref_String.equals("nbsp")) {
                      if (var15_ref_String.equals("shy")) {
                        var14 = 173;
                      } else {
                        if (!var15_ref_String.equals("times")) {
                          if (var15_ref_String.equals("euro")) {
                            var14 = 8364;
                          } else {
                            if (var15_ref_String.equals("copy")) {
                              var14 = 169;
                            } else {
                              if (!var15_ref_String.equals("reg")) {
                                if (!var15_ref_String.startsWith("img=")) {
                                  this.applyStyleTag(var15_ref_String, 120);
                                } else {
                                  try {
                                    var21 = (CharSequence) ((Object) var15_ref_String.substring(4));
                                    var16_int = LoginFormState.parseDecimal((byte) -127, var21);
                                    var17 = inlineSprites[var16_int];
                                    if (spriteBaselineOffsets != null) {
                                      stackIn_25_0 = spriteBaselineOffsets[var16_int];
                                    } else {
                                      stackIn_25_0 = var17.paddedHeight();
                                    }
                                    var18 = stackIn_25_0;
                                    if ((-16777216 & ArchiveLoadingStage.textColor) != -16777216) {
                                      var17.draw(x, -var18 + this.metrics.field_d + baselineY, 0, ArchiveLoadingStage.textColor & -16777216 | 16777215, 1);
                                    } else {
                                      var17.draw(x, -var18 + (baselineY + this.metrics.field_d), 1, 0, 1);
                                    }
                                    var11 = -1;
                                    x = x + inlineSprites[var16_int].paddedWidth();
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                                decompiledFrameRemainder0 = false;
                              }
                              else {
                                var14 = 174;
                              }
                            }
                          }
                        } else {
                          var14 = 215;
                        }
                      }
                    } else {
                      var14 = 160;
                    }
                  }
                }
              }
              if ((decompiledFrameRemainder0) &&
                (var10_int == -1)) {
                if (var11 != -1) {
                  x = x + this.metrics.kerning(-63, (char) var14, var11);
                }
                if (var14 != 32) {
                  if (mask == null) {
                    if ((-16777216 & LoginMethodPreference.textShadowColor) != 0) {
                      this.drawGlyph((char) var14, x + 1, baselineY + 1, LoginMethodPreference.textShadowColor, true);
                    }
                    this.drawGlyph((char) var14, x, baselineY, ArchiveLoadingStage.textColor, false);
                  } else {
                    if ((-16777216 & LoginMethodPreference.textShadowColor) != 0) {
                      this.drawMaskedGlyph((char) var14, x + 1, baselineY + 1, LoginMethodPreference.textShadowColor, true, mask, maskX, maskY);
                    }
                    this.drawMaskedGlyph((char) var14, x, baselineY, ArchiveLoadingStage.textColor, false, mask, maskX, maskY);
                  }
                } else {
                  if (StringBuilderSupport.spaceJustificationQ8 > 0) {
                    GameDefinitionLoader.justificationRemainderQ8 = GameDefinitionLoader.justificationRemainderQ8 + StringBuilderSupport.spaceJustificationQ8;
                    x = x + (GameDefinitionLoader.justificationRemainderQ8 >> 8);
                    GameDefinitionLoader.justificationRemainderQ8 = GameDefinitionLoader.justificationRemainderQ8 & 255;
                  }
                }
                var15 = this.metrics.characterWidth(var14, (byte) -53);
                if (-1 != ScrollControl.strikethroughColor) {
                  this.toolkit.drawHorizontalLineAlpha(ScrollControl.strikethroughColor, 103, baselineY + (int)(0.7 * (double)this.metrics.field_d), var15, x);
                }
                if (StatefulWidgetRenderer.underlineColor != -1) {
                  this.toolkit.drawHorizontalLineAlpha(StatefulWidgetRenderer.underlineColor, 122, this.metrics.field_d + baselineY + 1, var15, x);
                }
                var11 = var14;
                x = x + var15;
              }
            } else {
              var10_int = var13;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var10 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_62_0 = var10;
          stackIn_62_1 = new StringBuilder().append("da.M(").append(guard).append(',').append(baselineY).append(',');
          if (inlineSprites == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(x).append(',').append(maskX).append(',').append(maskY).append(',');
          if (text == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (spriteBaselineOffsets == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',');
          if (mask == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void loadCommonUiAssets(ResourceArchive graphicsArchive, ResourceArchive fontArchive, int guard, ResourceArchive extraArchive) {
        RasterIndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        int var8Lifetime1;
        ToolkitImageProducerBuffer.field_v = LegacyOpenGlBuffer.loadSpriteSheet("frame_top", graphicsArchive, true, "commonui");
        DropDownListWidget.field_O = LegacyOpenGlBuffer.loadSpriteSheet("frame_bottom", graphicsArchive, true, "commonui");
        HotspotTextWidget.field_E = UsernameCredentials.loadNamedSprite("commonui", "jagex_logo_grey", -104, graphicsArchive);
        LevelCompleteUpgradeScreen.field_j = LegacyOpenGlBuffer.loadSpriteSheet("button", graphicsArchive, true, "commonui");
        ToolkitRasterStateCacheEntry.field_m = DelayedInboundPacket.loadNamedSprites(graphicsArchive, "commonui", (byte) -56, "validation");
        MouseInputShutdown.field_a = (LegacyBitmapFont) ((Object) DisplayModeFailure.loadNamedAlphaFont(fontArchive, true, "commonui", "arezzo12", graphicsArchive));
        TextCaretLayout.field_b = (LegacyBitmapFont) ((Object) DisplayModeFailure.loadNamedAlphaFont(fontArchive, true, "commonui", "arezzo14", graphicsArchive));
        LegacyOpenGlDisplayLists.field_a = (LegacyBitmapFont) ((Object) DisplayModeFailure.loadNamedAlphaFont(fontArchive, true, "commonui", "arezzo14bold", graphicsArchive));
        Sprite var17 = new Sprite(extraArchive.fetchNamedFile("", "button.gif", -1), (java.awt.Component) ((Object) NineSlicePanel.field_f));
        ScrollPane.loadIndexedSprite((byte) 83, graphicsArchive, "dropdown", "commonui");
        RasterIndexedSprite[] var5 = ShaderEffect.loadNamedIndexedSprites("screen_options", graphicsArchive, 73, "commonui");
        GameDefinitionLoader.field_d = new RasterIndexedSprite[4];
        WidgetStateStyle.field_c = new RasterIndexedSprite[4];
        SoftwareTransform3D.field_f = new RasterIndexedSprite[4];
        RasterIndexedSprite[][] var6 = new RasterIndexedSprite[][]{GameDefinitionLoader.field_d, SoftwareTransform3D.field_f, WidgetStateStyle.field_c};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].palette;
        for (var8 = 1; var8 < var19.length; var8++) {
          var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8Lifetime1 = var5[0].indices[0];
        var19[2][var8Lifetime1] = 16777215;
        var19[1][var8Lifetime1] = 2394342;
        var19[3][var8Lifetime1] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
          var14 = var6[var9];
          RasterIndexedSprite[] var10 = var14;
          for (var11_int = 0; var11_int < var14.length; var11_int++) {
            var14[var11_int] = Js5ClientState.withPalette(var19[var11_int], var5[var9], -105);
          }
        }
        var9 = var17.height;
        if (guard != 17474) {
          return;
        }
        try {
          GameApplet.pushRasterState(70);
          var17.bindRaster();
          SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
          var15 = new Sprite(var9, var9);
          var18 = var15;
          var18.bindRaster();
          var17.drawPixels(0, 0);
          var11 = new Sprite(var9, var9);
          var11.bindRaster();
          var17.drawPixels(var9 - var17.width, 0);
          var12 = new Sprite(-(2 * var9) + var17.width, var9);
          var12.bindRaster();
          var17.drawPixels(-var9, 0);
          ClientException.popRasterState((byte) -73);
          LevelCompleteUpgradeScreen.field_j = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "da.K(" + (graphicsArchive != null ? "{...}" : "null") + ',' + (fontArchive != null ? "{...}" : "null") + ',' + guard + ',' + (extraArchive != null ? "{...}" : "null") + ')');
        }
    }

    abstract void drawGlyph(char param0, int param1, int param2, int param3, boolean param4);

    final void drawCenteredText(String text, int color, int shadowColor, int baselineY, int centerX, int guard) {
        if (text == null) {
          return;
        }
        try {
          this.resetTextStyle(color, shadowColor, 60);
          this.drawTextRun(-274, baselineY, (ToolkitSprite[]) null, -(this.metrics.stringWidth(text, guard) / 2) + centerX, 0, 0, text, (int[]) null, (SpriteMask) null);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "da.G(" + (text != null ? "{...}" : "null") + ',' + color + ',' + shadowColor + ',' + baselineY + ',' + centerX + ',' + guard + ')');
        }
    }

    private final void resetTextStyle(int color, int shadowColor, int guard) {
        StringBuilderSupport.spaceJustificationQ8 = 0;
        PacketBuffer.defaultTextColor = color;
        ArchiveLoadingStage.textColor = color;
        if (shadowColor == -1) {
          shadowColor = 0;
        }
        ScrollControl.strikethroughColor = -1;
        GameDefinitionLoader.justificationRemainderQ8 = 0;
        if (guard != 60) {
          this.metrics = (FontMetrics) null;
        }
        StatefulWidgetRenderer.underlineColor = -1;
        LoginDialogNavigation.defaultShadowColor = shadowColor;
        LoginMethodPreference.textShadowColor = shadowColor;
    }

    ToolkitFont(GraphicsToolkit param0, FontMetrics param1) {
        try {
          this.metrics = param1;
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "da.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean displayModeSortsAfter(FullscreenDisplayMode left, int guard, FullscreenDisplayMode right) {
        RuntimeException var3 = null;
        ResourceArchive var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (left.width > right.width) {
            return true;
          }
          if (guard > -11) {
            var4 = (ResourceArchive) null;
            ToolkitFont.loadCommonUiAssets((ResourceArchive) null, (ResourceArchive) null, 47, (ResourceArchive) null);
          }
          if (left.width != right.width) {
            return false;
          }
          if (right.height >= left.height) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("da.J(");
          if (left == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(',');
          if (right == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void drawMaskedGlyph(char param0, int param1, int param2, int param3, boolean param4, SpriteMask param5, int param6, int param7);

    private final void setJustification(String text, int targetWidth, byte guard) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = 0;
          var5 = 0;
          for (var6 = 0; text.length() > var6; var6++) {
            var7 = text.charAt(var6);
            if (60 == var7) {
              var5 = 1;
            } else {
              if (62 == var7) {
                var5 = 0;
              } else {
                if (var5 == 0 &&
                  32 == var7) {
                  var4_int++;
                }
              }
            }
          }
          if (var4_int > 0) {
            StringBuilderSupport.spaceJustificationQ8 = (targetWidth - this.metrics.stringWidth(text, 0) << 8) / var4_int;
          }
          if (guard != 5) {
            var9 = (String) null;
            this.drawText(-80, -66, 46, (String) null, (byte) 127, -75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("da.F(");
          if (text == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(targetWidth).append(',').append(guard).append(')').toString());
        }
    }

    static {
    }
}
