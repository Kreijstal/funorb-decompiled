/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryIntrusiveDeque {
    private DualLinkNode sentinel;
    static long field_b;
    private DualLinkNode cursor;

    final boolean isEmpty(int guard) {
        if (guard != -182442704) {
          this.cursor = (DualLinkNode) null;
        }
        return this.sentinel.secondaryNext == this.sentinel ? true : false;
    }

    final static void resetJs5Errors(int failureCount) {
        SelfDestructEffects.field_j.failureCount = failureCount;
        SelfDestructEffects.field_j.lastErrorCode = 0;
    }

    final int size(int initialCount) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = initialCount;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (this.sentinel != var3) {
          var3 = var3.secondaryNext;
          var2++;
        }
        return var2;
    }

    final DualLinkNode removeFirst(byte guard) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel != var2) {
          if (guard != -75) {
            this.cursor = (DualLinkNode) null;
          }
          var2.unlinkSecondary(110);
          return var2;
        }
        return null;
    }

    final void addLast(int guard, DualLinkNode node) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary(109);
          }
          if (guard != -1) {
            field_b = 29L;
          }
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "va.J(" + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean readBoolean(PacketBuffer input, boolean guard) {
        String stackIn_11_2 = null;
        try {
          int var2_int = input.readUnsignedByte(0);
          if (!guard) {
            return true;
          }
          boolean stackIn_6_0 = !(var2_int != 1);
          boolean var3 = stackIn_6_0;
          boolean stackIn_7_0 = var3;
          return (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2;
          StringBuilder stackIn_10_1 = new StringBuilder().append("va.H(");
          if (input == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void fillSortedHalfBlendGouraudTriangle(int bottomRed, int middleRed, int topBlue, int middleBlue, int[] pixels, int middleX, int middleGreen, int topX, int topY, int middleY, int bottomY, boolean guard, int topRed, int bottomX, int topGreen, int bottomGreen, int bottomBlue) {
        String stackIn_82_2 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        boolean var33 = false;
        int var35 = 0;
        int var42 = EscapeVector.obfuscationControl;
        try {
          if (bottomY >= 0 &&
            topY < MeshRasterState.clipHeight) {
            if (topX < 0 &&
              0 > middleX &&
              0 > bottomX) {
              return;
            }
            if (MeshRasterState.clipWidth <= topX &&
              MeshRasterState.clipWidth <= middleX &&
              MeshRasterState.clipWidth <= bottomX) {
              return;
            }
            if (!guard) {
              SecondaryIntrusiveDeque.resetJs5Errors(-74);
            }
            int var34 = bottomY - topY;
            if (middleY == topY) {
              if (bottomY != topY) {
                var35 = bottomY - middleY;
                if (middleX <= topX) {
                  var21 = middleRed << 16;
                  var25 = middleGreen << 16;
                  var20 = (-topX + bottomX << 16) / var34;
                  var19 = (-middleX + bottomX << 16) / var35;
                  var30 = topBlue << 16;
                  var18 = topX << 16;
                  var17_int = middleX << 16;
                  var27 = (bottomGreen - middleGreen << 16) / var35;
                  var23 = (bottomRed - middleRed << 16) / var35;
                  var22 = topRed << 16;
                  var31 = (-middleBlue + bottomBlue << 16) / var35;
                  var26 = topGreen << 16;
                  var32 = (bottomBlue - topBlue << 16) / var34;
                  var29 = middleBlue << 16;
                  var24 = (-topRed + bottomRed << 16) / var34;
                  var28 = (-topGreen + bottomGreen << 16) / var34;
                } else {
                  var26 = middleGreen << 16;
                  var31 = (bottomBlue - topBlue << 16) / var34;
                  var30 = middleBlue << 16;
                  var17_int = topX << 16;
                  var28 = (-middleGreen + bottomGreen << 16) / var35;
                  var27 = (-topGreen + bottomGreen << 16) / var34;
                  var19 = (bottomX - topX << 16) / var34;
                  var21 = topRed << 16;
                  var18 = middleX << 16;
                  var22 = middleRed << 16;
                  var25 = topGreen << 16;
                  var29 = topBlue << 16;
                  var32 = (-middleBlue + bottomBlue << 16) / var35;
                  var23 = (-topRed + bottomRed << 16) / var34;
                  var24 = (bottomRed - middleRed << 16) / var35;
                  var20 = (-middleX + bottomX << 16) / var35;
                }
              } else {
                var22 = middleRed;
                var30 = middleBlue;
                var27 = 0;
                var32 = 0;
                var18 = middleX << 16;
                var28 = 0;
                var17_int = topX << 16;
                var23 = 0;
                var20 = 0;
                var24 = 0;
                var19 = 0;
                var31 = 0;
                var26 = middleGreen;
                var25 = topGreen;
                var29 = topBlue;
                var21 = topRed;
              }
              if (topY < 0) {
                topY = Math.min(-topY, -topY + middleY);
                var21 = var21 + topY * var23;
                var25 = var25 + topY * var27;
                var17_int = var17_int + var19 * topY;
                var29 = var29 + topY * var31;
                var26 = var26 + var28 * topY;
                var22 = var22 + topY * var24;
                var30 = var30 + var32 * topY;
                var18 = var18 + topY * var20;
                topY = 0;
              }
              var33 = false;
            } else {
              var22 = topRed << 16;
              var21 = topRed << 16;
              var30 = topBlue << 16;
              var29 = topBlue << 16;
              var26 = topGreen << 16;
              var25 = topGreen << 16;
              var18 = topX << 16;
              var17_int = topX << 16;
              var35 = middleY - topY;
              var20 = (bottomX - topX << 16) / var34;
              var19 = (-topX + middleX << 16) / var35;
              if (var20 <= var19) {
                var23 = (-topRed + bottomRed << 16) / var34;
                var27 = (-topGreen + bottomGreen << 16) / var34;
                var24 = (middleRed - topRed << 16) / var35;
                var33 = true;
                int var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (middleBlue - topBlue << 16) / var35;
                var28 = (middleGreen - topGreen << 16) / var35;
                var31 = (-topBlue + bottomBlue << 16) / var34;
              } else {
                var23 = (middleRed - topRed << 16) / var35;
                var24 = (bottomRed - topRed << 16) / var34;
                var32 = (-topBlue + bottomBlue << 16) / var34;
                var27 = (-topGreen + middleGreen << 16) / var35;
                var31 = (-topBlue + middleBlue << 16) / var35;
                var33 = false;
                var28 = (-topGreen + bottomGreen << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (topY < 0) {
                if (0 > middleY) {
                  topY = middleY - topY;
                  var30 = var30 + topY * var32;
                  var25 = var25 + topY * var27;
                  var22 = var22 + var24 * topY;
                  var26 = var26 + var28 * topY;
                  var29 = var29 + var31 * topY;
                  var18 = var18 + var20 * topY;
                  var21 = var21 + topY * var23;
                  var17_int = var17_int + var19 * topY;
                  topY = middleY;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  topY = -topY;
                  var29 = var29 + topY * var31;
                  var25 = var25 + topY * var27;
                  var26 = var26 + topY * var28;
                  var22 = var22 + var24 * topY;
                  var30 = var30 + var32 * topY;
                  var18 = var18 + var20 * topY;
                  var21 = var21 + topY * var23;
                  var17_int = var17_int + var19 * topY;
                  topY = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                int var36Lifetime2 = MeshRasterState.rowOffsets[topY];
                while (topY < middleY) {
                  int var37 = var17_int >> 16;
                  if (MeshRasterState.clipWidth > var37) {
                    int var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      int var39 = (-var21 + var22) / var38;
                      int var40 = (var26 - var25) / var38;
                      int var41 = (var30 - var29) / var38;
                      if (MeshRasterState.clipWidth <= var37 + var38) {
                        var38 = -1 + MeshRasterState.clipWidth - var37;
                      }
                      if (var37 < 0) {
                        LinkButtonPainter.blendHalfGradientSpan(var25 - var40 * var37, var36Lifetime2, var41, (byte) -114, var29 - var37 * var41, var39, var40, var38 + var37, pixels, var21 - var39 * var37);
                      } else {
                        LinkButtonPainter.blendHalfGradientSpan(var25, var37 + var36Lifetime2, var41, (byte) -121, var29, var39, var40, var38, pixels, var21);
                      }
                    } else if (var37 >= 0 &&
                      MeshRasterState.clipWidth > var37) {
                      LinkButtonPainter.blendHalfGradientSpan(var25, var37 + var36Lifetime2, 0, (byte) -116, var29, 0, 0, var38, pixels, var21);
                    }
                  }
                  topY++;
                  if (topY >= MeshRasterState.clipHeight) {
                    return;
                  }
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + SoftwareRasterizer.width;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                }
              }
              int var36Lifetime3 = -middleY + bottomY;
              if (var36Lifetime3 == 0) {
                var20 = 0;
                var27 = 0;
                var32 = 0;
                var31 = 0;
                var23 = 0;
                var19 = 0;
                var28 = 0;
                var24 = 0;
              } else {
                int var37Lifetime2 = bottomX << 16;
                int var38Lifetime2 = bottomRed << 16;
                int var39Lifetime2 = bottomGreen << 16;
                int var40Lifetime2 = bottomBlue << 16;
                if (var33) {
                  var18 = middleX << 16;
                  var26 = middleGreen << 16;
                  var22 = middleRed << 16;
                  var30 = middleBlue << 16;
                } else {
                  var25 = middleGreen << 16;
                  var17_int = middleX << 16;
                  var29 = middleBlue << 16;
                  var21 = middleRed << 16;
                }
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
              }
            }
            if (topY < 0) {
              topY = -topY;
              var17_int = var17_int + var19 * topY;
              var25 = var25 + topY * var27;
              var29 = var29 + topY * var31;
              var21 = var21 + var23 * topY;
              var18 = var18 + var20 * topY;
              var26 = var26 + topY * var28;
              var30 = var30 + var32 * topY;
              var22 = var22 + var24 * topY;
              topY = 0;
            }
            int var35Lifetime1 = MeshRasterState.rowOffsets[topY];
            while (topY < bottomY) {
              int var36Lifetime1 = var17_int >> 16;
              if (MeshRasterState.clipWidth > var36Lifetime1) {
                int var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  int var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  int var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  int var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (MeshRasterState.clipWidth <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + (MeshRasterState.clipWidth - var36Lifetime1);
                  }
                  if (var36Lifetime1 >= 0) {
                    LinkButtonPainter.blendHalfGradientSpan(var25, var36Lifetime1 + var35Lifetime1, var40Lifetime1, (byte) -109, var29, var38Lifetime1, var39Lifetime1, var37Lifetime1, pixels, var21);
                  } else {
                    LinkButtonPainter.blendHalfGradientSpan(var25 - var39Lifetime1 * var36Lifetime1, var35Lifetime1, var40Lifetime1, (byte) -103, -(var40Lifetime1 * var36Lifetime1) + var29, var38Lifetime1, var39Lifetime1, var36Lifetime1 + var37Lifetime1, pixels, -(var38Lifetime1 * var36Lifetime1) + var21);
                  }
                } else if (0 <= var36Lifetime1 &&
                  var36Lifetime1 < MeshRasterState.clipWidth) {
                  LinkButtonPainter.blendHalfGradientSpan(var25, var35Lifetime1 + var36Lifetime1, 0, (byte) -114, var29, 0, 0, var37Lifetime1, pixels, var21);
                }
              }
              topY++;
              if (topY >= MeshRasterState.clipHeight) {
                return;
              }
              var35Lifetime1 = var35Lifetime1 + SoftwareRasterizer.width;
              var17_int = var17_int + var19;
              var22 = var22 + var24;
              var30 = var30 + var32;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var17 = decompiledCaughtException;
          RuntimeException stackIn_81_0 = var17;
          StringBuilder stackIn_81_1 = new StringBuilder().append("va.E(").append(bottomRed).append(',').append(middleRed).append(',').append(topBlue).append(',').append(middleBlue).append(',');
          if (pixels == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(middleX).append(',').append(middleGreen).append(',').append(topX).append(',').append(topY).append(',').append(middleY).append(',').append(bottomY).append(',').append(guard).append(',').append(topRed).append(',').append(bottomX).append(',').append(topGreen).append(',').append(bottomGreen).append(',').append(bottomBlue).append(')').toString());
        }
    }

    final static void setSessionCookie(String session, int guard, java.applet.Applet applet) {
        try {
          try {
            TileSpriteCacheEntry.field_i = session;
            try {
              if (guard > -110) {
                field_b = 2L;
              }
              String var3 = applet.getParameter("cookieprefix");
              String var4 = applet.getParameter("cookiehost");
              String var5 = var3 + "session=" + session + "; version=1; path=/; domain=" + var4;
              if (0 == session.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              JavaScriptBridge.evaluateScript((byte) -111, applet, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            PairedTextColumns.updateBrowserLinks((byte) 15, applet);
          } catch (RuntimeException runtimeException) {
            throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "va.A(" + (session != null ? "{...}" : "null") + ',' + guard + ',' + (applet != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DualLinkNode next(byte guard) {
        int var2 = -2 / ((guard - 48) / 32);
        DualLinkNode var3 = this.cursor;
        if (var3 != this.sentinel) {
          this.cursor = var3.secondaryNext;
          return var3;
        }
        this.cursor = null;
        return null;
    }

    public SecondaryIntrusiveDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    final DualLinkNode first(int guard) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        if (guard != 0) {
          field_b = 88L;
        }
        return var2;
    }

    static {
    }
}
