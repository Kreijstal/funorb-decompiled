/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k extends pj implements hf {
    static String field_i;
    static BitPacketBuffer outgoingPackets;
    static String field_j;
    private vb field_g;

    final qh c(int param0) {
        if (param0 != 4) {
          field_i = (String) null;
        }
        return this.a(this.field_g.text, (byte) 106);
    }

    abstract qh a(String param0, byte param1);

    final static void d(byte param0) {
        if (param0 < 114) {
          return;
        }
        ga.d(-105);
    }

    abstract String a(int param0, String param1);

    public final void a(vb param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -39) {
            outgoingPackets = (BitPacketBuffer) null;
            this.a(false);
          } else {
            this.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("k.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static RgbSprite a(RgbSprite param0, int param1, int param2) {
        int var4 = 0;
        RgbSprite var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = new RgbSprite(param0.canvasWidth, param2 * param0.canvasHeight);
          var3.bindRasterTarget();
          if (param1 <= 74) {
            field_i = (String) null;
          }
          for (var4 = 0; var4 < param2; var4++) {
            param0.drawTransparent(0, param0.canvasHeight * var4);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 89);
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("k.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void rasterFlatMeshTriangle(int xMiddle, int xBottom, int yTop, int[] target, int yBottom, int yMiddle, int halfRgb, int xTop, int obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String targetSummary = null;
        RuntimeException caughtFailure = null;
        int leftXQ16 = 0;
        RuntimeException failure = null;
        int rightXQ16 = 0;
        int leftStepQ16 = 0;
        int rightStepQ16 = 0;
        int shortEdgeOnRight = 0;
        int totalHeight = 0;
        int upperHeight = 0;
        int swappedSlope = 0;
        int upperLeftX = 0;
        int upperSpanLength = 0;
        int unusedGameFlag = 0;
        int lowerRowOffset;
        int lowerLeftX;
        int lowerSpanLength;
        int upperRowOffset;
        int lowerHeight;
        int bottomXQ16;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (yBottom >= 0 &&
            MeshRasterState.viewportHeight > yTop) {
            if (xTop < obfuscationGuard &&
              xMiddle < 0 &&
              xBottom < 0) {
              return;
            }
            if (MeshRasterState.viewportWidth <= xTop &&
              xMiddle >= MeshRasterState.viewportWidth &&
              xBottom >= MeshRasterState.viewportWidth) {
              return;
            }
            totalHeight = -yTop + yBottom;
            if (yMiddle == yTop) {
              if (yBottom == yTop) {
                leftXQ16 = xTop << 16;
                leftStepQ16 = 0;
                rightXQ16 = xMiddle << 16;
                rightStepQ16 = 0;
              } else {
                upperHeight = -yMiddle + yBottom;
                if (xMiddle > xTop) {
                  rightXQ16 = xMiddle << 16;
                  leftStepQ16 = (-xTop + xBottom << 16) / totalHeight;
                  rightStepQ16 = (xBottom - xMiddle << 16) / upperHeight;
                  leftXQ16 = xTop << 16;
                } else {
                  leftXQ16 = xMiddle << 16;
                  rightXQ16 = xTop << 16;
                  rightStepQ16 = (xBottom - xTop << 16) / totalHeight;
                  leftStepQ16 = (-xMiddle + xBottom << 16) / upperHeight;
                }
              }
              if (yTop < 0) {
                yTop = Math.min(-yTop, -yTop + yMiddle);
                rightXQ16 = rightXQ16 + yTop * rightStepQ16;
                leftXQ16 = leftXQ16 + leftStepQ16 * yTop;
                yTop = 0;
              }
              shortEdgeOnRight = 0;
            } else {
              rightXQ16 = xTop << 16;
              leftXQ16 = xTop << 16;
              upperHeight = -yTop + yMiddle;
              leftStepQ16 = (xMiddle - xTop << 16) / upperHeight;
              rightStepQ16 = (-xTop + xBottom << 16) / totalHeight;
              if (leftStepQ16 >= rightStepQ16) {
                swappedSlope = leftStepQ16;
                leftStepQ16 = rightStepQ16;
                rightStepQ16 = swappedSlope;
                shortEdgeOnRight = 1;
              } else {
                shortEdgeOnRight = 0;
              }
              if (0 <= yTop) {
                upperRowOffset = MeshRasterState.rowOffsets[yTop];
                while (yMiddle > yTop) {
                  upperLeftX = leftXQ16 >> 16;
                  if (MeshRasterState.viewportWidth > upperLeftX) {
                    upperSpanLength = -(leftXQ16 >> 16) + (rightXQ16 >> 16);
                    if (upperSpanLength == 0) {
                      if (upperLeftX >= 0 &&
                        MeshRasterState.viewportWidth > upperLeftX) {
                        wc.blendHalfRgbSpan(target, upperSpanLength, halfRgb, upperRowOffset + upperLeftX, -1);
                      }
                    } else {
                      if (MeshRasterState.viewportWidth <= upperLeftX + upperSpanLength) {
                        upperSpanLength = -1 - upperLeftX + MeshRasterState.viewportWidth;
                      }
                      if (upperLeftX < 0) {
                        wc.blendHalfRgbSpan(target, upperLeftX + upperSpanLength, halfRgb, upperRowOffset, -1);
                      } else {
                        wc.blendHalfRgbSpan(target, upperSpanLength, halfRgb, upperLeftX + upperRowOffset, ~obfuscationGuard);
                      }
                    }
                  }
                  yTop++;
                  if (yTop >= MeshRasterState.viewportHeight) {
                    return;
                  }
                  leftXQ16 = leftXQ16 + leftStepQ16;
                  upperRowOffset = upperRowOffset + Rasterizer2D.width;
                  rightXQ16 = rightXQ16 + rightStepQ16;
                }
              } else if (yMiddle >= 0) {
                yTop = -yTop;
                rightXQ16 = rightXQ16 + rightStepQ16 * yTop;
                leftXQ16 = leftXQ16 + yTop * leftStepQ16;
                yTop = 0;
                upperRowOffset = MeshRasterState.rowOffsets[yTop];
                while (yMiddle > yTop) {
                  upperLeftX = leftXQ16 >> 16;
                  if (MeshRasterState.viewportWidth > upperLeftX) {
                    upperSpanLength = -(leftXQ16 >> 16) + (rightXQ16 >> 16);
                    if (upperSpanLength == 0) {
                      if (upperLeftX >= 0 &&
                        MeshRasterState.viewportWidth > upperLeftX) {
                        wc.blendHalfRgbSpan(target, upperSpanLength, halfRgb, upperRowOffset + upperLeftX, -1);
                      }
                    } else {
                      if (MeshRasterState.viewportWidth <= upperLeftX + upperSpanLength) {
                        upperSpanLength = -1 - upperLeftX + MeshRasterState.viewportWidth;
                      }
                      if (upperLeftX < 0) {
                        wc.blendHalfRgbSpan(target, upperLeftX + upperSpanLength, halfRgb, upperRowOffset, -1);
                      } else {
                        wc.blendHalfRgbSpan(target, upperSpanLength, halfRgb, upperLeftX + upperRowOffset, ~obfuscationGuard);
                      }
                    }
                  }
                  yTop++;
                  if (yTop >= MeshRasterState.viewportHeight) {
                    return;
                  }
                  leftXQ16 = leftXQ16 + leftStepQ16;
                  upperRowOffset = upperRowOffset + Rasterizer2D.width;
                  rightXQ16 = rightXQ16 + rightStepQ16;
                }
              } else {
                yTop = yMiddle - yTop;
                leftXQ16 = leftXQ16 + yTop * leftStepQ16;
                rightXQ16 = rightXQ16 + rightStepQ16 * yTop;
                yTop = yMiddle;
              }
              lowerHeight = yBottom - yMiddle;
              if (lowerHeight != 0) {
                bottomXQ16 = xBottom << 16;
                if (shortEdgeOnRight == 0) {
                  leftXQ16 = xMiddle << 16;
                } else {
                  rightXQ16 = xMiddle << 16;
                }
                rightStepQ16 = (-rightXQ16 + bottomXQ16) / lowerHeight;
                leftStepQ16 = (bottomXQ16 - leftXQ16) / lowerHeight;
              } else {
                rightStepQ16 = 0;
                leftStepQ16 = 0;
              }
            }
            if (yTop < 0) {
              yTop = -yTop;
              leftXQ16 = leftXQ16 + leftStepQ16 * yTop;
              rightXQ16 = rightXQ16 + yTop * rightStepQ16;
              yTop = 0;
            }
            lowerRowOffset = MeshRasterState.rowOffsets[yTop];
            while (yTop < yBottom) {
              lowerLeftX = leftXQ16 >> 16;
              if (MeshRasterState.viewportWidth > lowerLeftX) {
                lowerSpanLength = (rightXQ16 >> 16) - (leftXQ16 >> 16);
                if (lowerSpanLength == 0) {
                  if (lowerLeftX >= 0 &&
                    lowerLeftX < MeshRasterState.viewportWidth) {
                    wc.blendHalfRgbSpan(target, lowerSpanLength, halfRgb, lowerLeftX + lowerRowOffset, -1);
                  }
                } else {
                  if (MeshRasterState.viewportWidth <= lowerLeftX + lowerSpanLength) {
                    lowerSpanLength = -1 + MeshRasterState.viewportWidth - lowerLeftX;
                  }
                  if (lowerLeftX >= 0) {
                    wc.blendHalfRgbSpan(target, lowerSpanLength, halfRgb, lowerLeftX + lowerRowOffset, -1);
                  } else {
                    wc.blendHalfRgbSpan(target, lowerSpanLength + lowerLeftX, halfRgb, lowerRowOffset, -1);
                  }
                }
              }
              yTop++;
              if (yTop >= MeshRasterState.viewportHeight) {
                return;
              }
              lowerRowOffset = lowerRowOffset + Rasterizer2D.width;
              leftXQ16 = leftXQ16 + leftStepQ16;
              rightXQ16 = rightXQ16 + rightStepQ16;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("k.S(").append(xMiddle).append(',').append(xBottom).append(',').append(yTop).append(',');
          if (target == null) {
            targetSummary = "null";
          } else {
            targetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(targetSummary).append(',').append(yBottom).append(',').append(yMiddle).append(',').append(halfRgb).append(',').append(xTop).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_j = null;
        outgoingPackets = null;
        if (param0 > -73) {
          field_i = (String) null;
        }
    }

    final String b(int param0) {
        if (param0 != 28600) {
          field_j = (String) null;
        }
        return this.a(56, this.field_g.text);
    }

    public final boolean a(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 > -27) {
          k.d((byte) 112);
        }
        stackIn_7_0 = (this.field_g.text == null) || (0 == this.field_g.text.length());
        return stackIn_7_0;
    }

    k(vb param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vb param0, int param1) {
        try {
          if (param1 != -40) {
            String var4 = (String) null;
            this.a((String) null, (byte) -114);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "k.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_j = "OK";
        field_i = "Staff impersonation";
    }
}
