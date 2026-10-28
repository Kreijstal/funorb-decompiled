/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkButtonPainter implements WidgetPainter {
    private BitmapFont font;
    static LoginStage field_c;
    private int horizontalAlignment;
    private int verticalAlignment;
    static int[] field_e;
    static boolean field_a;

    public static void releaseStatics(byte guard) {
        field_c = null;
        if (guard <= 94) {
          return;
        }
        field_e = null;
    }

    public final void drawWidget(int originX, int originY, int guard, UiComponent component, boolean enabled) {
        int stackIn_5_0 = 0;
        String stackIn_21_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          stackIn_5_0 = (!component.hovered &&
            !component.isFocused(0)) ? (2188450) : (3249872);
          int var6_int = stackIn_5_0;
          if (guard > -14) {
            return;
          }
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + component.text + "</u>", component.x + originX, component.y + originY, component.width, component.height, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.maxAscent + this.font.maxDescent);
          if (component.isFocused(0)) {
            int var7 = this.font.stringWidth(component.text);
            int var8 = this.font.maxDescent + this.font.maxAscent;
            int var9 = originX + component.x;
            int var10 = component.y + originY;
            if (this.horizontalAlignment == 2) {
              var9 = var9 + (-var7 + component.width);
            } else if (1 == this.horizontalAlignment) {
              var9 = var9 + (component.width - var7 >> 1);
            }
            if (this.verticalAlignment == 2) {
              var10 = var10 + (component.height - var8);
            } else if (this.verticalAlignment == 1) {
              var10 = var10 + (-var8 + component.height >> 1);
            }
            SeekerMine.drawDottedRectangle(false, 4 + var7, var9 - 2, var8, var10 + 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var6;
          StringBuilder stackIn_20_1 = new StringBuilder().append("ha.M(").append(originX).append(',').append(originY).append(',').append(guard).append(',');
          if (component == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(enabled).append(')').toString());
        }
    }

    final static void fillSortedHalfBlendTriangle(int middleX, int middleY, int topY, int topX, int bottomX, int guard, int halfColor, int bottomY, int[] pixels) {
        String stackIn_97_2 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean var13 = false;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var16Lifetime2;
        int var19 = EscapeVector.obfuscationControl;
        try {
          if (0 <= bottomY &&
            MeshRasterState.clipHeight > topY) {
            if (topX < 0 &&
              middleX < 0 &&
              bottomX < 0) {
              return;
            }
            if (topX >= MeshRasterState.clipWidth &&
              MeshRasterState.clipWidth <= middleX &&
              MeshRasterState.clipWidth <= bottomX) {
              return;
            }
            int var14 = -topY + bottomY;
            if (topY == middleY) {
              if (bottomY != topY) {
                var15 = -middleY + bottomY;
                if (topX >= middleX) {
                  var11 = (bottomX - middleX << 16) / var15;
                  var10 = topX << 16;
                  var12 = (-topX + bottomX << 16) / var14;
                  var9_int = middleX << 16;
                } else {
                  var12 = (bottomX - middleX << 16) / var15;
                  var11 = (-topX + bottomX << 16) / var14;
                  var10 = middleX << 16;
                  var9_int = topX << 16;
                }
              } else {
                var12 = 0;
                var10 = middleX << 16;
                var11 = 0;
                var9_int = topX << 16;
              }
              var13 = false;
              if (topY < 0) {
                topY = Math.min(-topY, -topY + middleY);
                var9_int = var9_int + topY * var11;
                var10 = var10 + var12 * topY;
                topY = 0;
              }
            } else {
              var10 = topX << 16;
              var9_int = topX << 16;
              var15 = middleY - topY;
              var12 = (bottomX - topX << 16) / var14;
              var11 = (middleX - topX << 16) / var15;
              if (var12 > var11) {
                var13 = false;
              } else {
                int var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = true;
              }
              if (topY >= 0) {
                var16Lifetime2 = MeshRasterState.rowOffsets[topY];
                while (topY < middleY) {
                  var17 = var9_int >> 16;
                  if (MeshRasterState.clipWidth > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (MeshRasterState.clipWidth <= var17 + var18) {
                        var18 = -1 - var17 + MeshRasterState.clipWidth;
                      }
                      if (var17 < 0) {
                        ModalPanel.halveAndAddPixels(-23466, var16Lifetime2, halfColor, var17 + var18, pixels);
                      } else {
                        ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, halfColor, var18, pixels);
                      }
                    } else if (0 <= var17 &&
                      MeshRasterState.clipWidth > var17) {
                      ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, halfColor, var18, pixels);
                    }
                  }
                  topY++;
                  if (topY >= MeshRasterState.clipHeight) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.width;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else if (middleY >= 0) {
                topY = -topY;
                var10 = var10 + topY * var12;
                var9_int = var9_int + topY * var11;
                topY = 0;
                var16Lifetime2 = MeshRasterState.rowOffsets[topY];
                while (topY < middleY) {
                  var17 = var9_int >> 16;
                  if (MeshRasterState.clipWidth > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (MeshRasterState.clipWidth <= var17 + var18) {
                        var18 = -1 - var17 + MeshRasterState.clipWidth;
                      }
                      if (var17 < 0) {
                        ModalPanel.halveAndAddPixels(-23466, var16Lifetime2, halfColor, var17 + var18, pixels);
                      } else {
                        ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, halfColor, var18, pixels);
                      }
                    } else if (0 <= var17 &&
                      MeshRasterState.clipWidth > var17) {
                      ModalPanel.halveAndAddPixels(-23466, var17 + var16Lifetime2, halfColor, var18, pixels);
                    }
                  }
                  topY++;
                  if (topY >= MeshRasterState.clipHeight) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRasterizer.width;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              } else {
                topY = -topY + middleY;
                var9_int = var9_int + topY * var11;
                var10 = var10 + topY * var12;
                topY = middleY;
              }
              int var16Lifetime3 = -middleY + bottomY;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                if (var13) {
                  var10 = middleX << 16;
                } else {
                  var9_int = middleX << 16;
                }
                int var17Lifetime2 = bottomX << 16;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (topY < 0) {
              topY = -topY;
              var10 = var10 + var12 * topY;
              var9_int = var9_int + topY * var11;
              topY = 0;
            }
            int var15Lifetime1 = MeshRasterState.rowOffsets[topY];
            while (bottomY > topY) {
              int var16Lifetime1 = var9_int >> 16;
              if (MeshRasterState.clipWidth > var16Lifetime1) {
                int var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (MeshRasterState.clipWidth <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + MeshRasterState.clipWidth);
                  }
                  if (var16Lifetime1 < 0) {
                    ModalPanel.halveAndAddPixels(-23466, var15Lifetime1, halfColor, var16Lifetime1 + var17Lifetime1, pixels);
                  } else {
                    ModalPanel.halveAndAddPixels(-23466, var15Lifetime1 + var16Lifetime1, halfColor, var17Lifetime1, pixels);
                  }
                } else if (0 <= var16Lifetime1 &&
                  MeshRasterState.clipWidth > var16Lifetime1) {
                  ModalPanel.halveAndAddPixels(-23466, var16Lifetime1 + var15Lifetime1, halfColor, var17Lifetime1, pixels);
                }
              }
              topY++;
              if (topY >= MeshRasterState.clipHeight) {
                return;
              }
              var9_int = var9_int + var11;
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRasterizer.width;
            }
            if (guard <= 33) {
              int[] var20 = (int[]) null;
              LinkButtonPainter.blendHalfGradientSpan(96, -39, -128, (byte) 0, -4, 16, -43, 90, (int[]) null, -115);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_96_0 = var9;
          StringBuilder stackIn_96_1 = new StringBuilder().append("ha.K(").append(middleX).append(',').append(middleY).append(',').append(topY).append(',').append(topX).append(',').append(bottomX).append(',').append(guard).append(',').append(halfColor).append(',').append(bottomY).append(',');
          if (pixels == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_96_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont loadCoverageFont(int groupId, int guard, ResourceArchive fontArchive, int fileId, ResourceArchive spriteArchive) {
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        try {
          if (!ArchivePreloader.loadSpriteSheet(spriteArchive, guard ^ 198630719, groupId, fileId)) {
            Object stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          if (guard != -198630768) {
            field_c = (LoginStage) null;
          }
          CoverageBitmapFont stackIn_6_0 = SlidingSpriteTransition.buildCoverageFontFromSheet(fontArchive.getFile(groupId, (byte) -97, fileId), -1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("ha.O(").append(groupId).append(',').append(guard).append(',');
          if (fontArchive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(fileId).append(',');
          if (spriteArchive == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public LinkButtonPainter() {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        this.font = Js5Transport.field_a;
    }

    LinkButtonPainter(BitmapFont param0, int param1, int param2) {
        try {
          this.horizontalAlignment = param1;
          this.verticalAlignment = param2;
          this.font = param0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void blendHalfGradientSpan(int green, int index, int blueStep, byte guard, int blue, int redStep, int greenStep, int length, int[] pixels, int red) {
        String stackIn_9_2 = null;
        int var16 = EscapeVector.obfuscationControl;
        try {
          if (guard > -75) {
            ResourceArchive var17 = (ResourceArchive) null;
            LinkButtonPainter.loadCoverageFont(-4, -41, (ResourceArchive) null, 73, (ResourceArchive) null);
          }
          while (true) {
            length--;
            if (length < 0) {
              return;
            }
            int[] var18 = pixels;
            int[] var10 = var18;
            int var11 = index;
            int var12 = red;
            int var13 = green;
            int var14 = blue;
            int var15 = 8355711 & var18[var11] >> 1;
            var10[var11] = SpriteCheckboxPainter.bitwiseAnd(var13 >> 9, 65280) + (SpriteCheckboxPainter.bitwiseAnd(33423360, var12) >> 1) - (-(SpriteCheckboxPainter.bitwiseAnd(var14, 33532346) >> 17) - var15);
            blue = blue + blueStep;
            red = red + redStep;
            green = green + greenStep;
            index++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var10_ref;
          StringBuilder stackIn_8_1 = new StringBuilder().append("ha.N(").append(green).append(',').append(index).append(',').append(blueStep).append(',').append(guard).append(',').append(blue).append(',').append(redStep).append(',').append(greenStep).append(',').append(length).append(',');
          if (pixels == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(red).append(')').toString());
        }
    }

    static {
        field_c = new LoginStage();
        field_e = new int[]{19, 27};
        field_a = false;
    }
}
