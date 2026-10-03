/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextInputValidator {
    private TextInputWidget referenceInput;
    static ClientSessionSnapshot[] field_k;
    static IntrusiveDeque rasterTargetStack;
    static int field_j;

    MatchingTextValidator(TextInputWidget validatedInput, TextInputWidget referenceInput) {
        super(validatedInput);
        try {
            this.referenceInput = referenceInput;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "n.<init>(" + (validatedInput != null ? "{...}" : "null") + ',' + (referenceInput != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(int guard) {
        rasterTargetStack = null;
        field_k = null;
        if (guard != 0) {
            MatchingTextValidator.c((byte) 89);
        }
    }

    final static Sprite[] buildNineSliceSprites(int innerAccentColor, int innerAccentWidth, int topLeftBorderColor, int edgeLength, byte referenceRetentionGuard, int fillColor, int bottomRightBorderColor, int borderGap, int outerBorderWidth) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_56_0 = 0;
        int cornerSize = 0;
        Sprite[] slices = null;
        Sprite[] slicesToFill = null;
        int borderIndex = 0;
        int scanIndex = 0;
        Sprite sliceToFill = null;
        int fillPixelIndex = 0;
        int controlFlowGuard = 0;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        cornerSize = innerAccentWidth + borderGap + outerBorderWidth;
        slices = new Sprite[]{new Sprite(cornerSize, cornerSize), new Sprite(edgeLength, cornerSize), new Sprite(cornerSize, cornerSize), new Sprite(cornerSize, edgeLength), new Sprite(64, 64), new Sprite(cornerSize, edgeLength), new Sprite(cornerSize, cornerSize), new Sprite(edgeLength, cornerSize), new Sprite(cornerSize, cornerSize)};
        slicesToFill = slices;
        scanIndex = 0;
        L0: while (true) {
          L1: {
            if (scanIndex < slicesToFill.length) {
              sliceToFill = slicesToFill[scanIndex];
              stackIn_11_0 = 0;
              if (controlFlowGuard != 0) {
                break L1;
              }
              fillPixelIndex = stackIn_11_0;
              while (true) {
                if (sliceToFill.pixels.length > fillPixelIndex) {
                  sliceToFill.pixels[fillPixelIndex] = fillColor;
                  fillPixelIndex++;
                  continue;
                }
                scanIndex++;
                continue L0;
              }
            }
            stackIn_11_0 = 0;
          }
          borderIndex = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (borderIndex < outerBorderWidth) {
                stackIn_22_0 = 0;
                if (controlFlowGuard != 0) {
                  break L7;
                }
                scanIndex = stackIn_22_0;
                while (true) {
                  if (cornerSize > scanIndex) {
                    slices[6].pixels[scanIndex + (cornerSize - borderIndex - 1) * cornerSize] = bottomRightBorderColor;
                    slices[8].pixels[scanIndex + (-1 - borderIndex + cornerSize) * cornerSize] = bottomRightBorderColor;
                    slices[2].pixels[scanIndex * cornerSize - borderIndex + cornerSize - 1] = bottomRightBorderColor;
                    slices[8].pixels[-borderIndex - 1 - (-cornerSize - cornerSize * scanIndex)] = bottomRightBorderColor;
                    scanIndex++;
                    continue;
                  }
                  borderIndex++;
                  continue L6;
                }
              }
              stackIn_22_0 = 0;
            }
            borderIndex = stackIn_22_0;
            L12: while (true) {
              stackIn_24_0 = borderIndex;
              stackIn_24_1 = outerBorderWidth;
              while (true) {
                L14: {
                  if (stackIn_24_0 < stackIn_24_1) {
                    stackIn_34_0 = 0;
                    if (controlFlowGuard != 0) {
                      break L14;
                    }
                    scanIndex = stackIn_34_0;
                    while (cornerSize > scanIndex) {
                      slices[0].pixels[scanIndex + borderIndex * cornerSize] = topLeftBorderColor;
                      slices[0].pixels[borderIndex + scanIndex * cornerSize] = topLeftBorderColor;
                      stackIn_24_0 = ~(-borderIndex + cornerSize);
                      stackIn_24_1 = ~scanIndex;
                      if (stackIn_24_0 < stackIn_24_1) {
                        slices[2].pixels[cornerSize * borderIndex + scanIndex] = topLeftBorderColor;
                        slices[6].pixels[borderIndex + scanIndex * cornerSize] = topLeftBorderColor;
                      }
                      scanIndex++;
                      continue;
                    }
                    borderIndex++;
                    continue L12;
                  }
                  stackIn_34_0 = 0;
                }
                borderIndex = stackIn_34_0;
                L19: while (true) {
                  L20: {
                    if (borderIndex < edgeLength) {
                      stackIn_45_0 = 0;
                      if (controlFlowGuard != 0) {
                        break L20;
                      }
                      scanIndex = stackIn_45_0;
                      while (true) {
                        if (outerBorderWidth > scanIndex) {
                          slices[7].pixels[edgeLength * (cornerSize - scanIndex - 1) + borderIndex] = bottomRightBorderColor;
                          slices[5].pixels[-1 + (cornerSize - scanIndex + borderIndex * cornerSize)] = bottomRightBorderColor;
                          slices[1].pixels[edgeLength * scanIndex + borderIndex] = topLeftBorderColor;
                          slices[3].pixels[scanIndex + cornerSize * borderIndex] = topLeftBorderColor;
                          scanIndex++;
                          continue;
                        }
                        borderIndex++;
                        continue L19;
                      }
                    }
                    stackIn_45_0 = 0;
                  }
                  borderIndex = stackIn_45_0;
                  L25: while (true) {
                    L26: {
                      if (borderIndex < edgeLength >> 1) {
                        stackIn_56_0 = 0;
                        if (controlFlowGuard != 0) {
                          break L26;
                        }
                        scanIndex = stackIn_56_0;
                        while (true) {
                          if (innerAccentWidth > scanIndex) {
                            slices[1].pixels[edgeLength * (-1 + (-scanIndex + cornerSize)) + borderIndex] = innerAccentColor;
                            slices[3].pixels[-1 + cornerSize + (-scanIndex + cornerSize * borderIndex)] = innerAccentColor;
                            slices[7].pixels[borderIndex + edgeLength * scanIndex] = innerAccentColor;
                            slices[5].pixels[cornerSize * borderIndex + scanIndex] = innerAccentColor;
                            scanIndex++;
                            continue;
                          }
                          borderIndex++;
                          continue L25;
                        }
                      }
                      stackIn_56_0 = referenceRetentionGuard;
                    }
                    if (stackIn_56_0 != 1) {
                      MatchingTextValidator.clearStaticReferences(5);
                    }
                    return slices;
                  }
                }
              }
            }
          }
        }
    }

    final static void c(byte param0) {
        if (!(Geoblox.activeMessageDialog == null)) {
            Geoblox.activeMessageDialog.dismissDialog((byte) -104);
        }
        MouseWheelInput.field_d = new DisplayNamePanel();
        int var1 = 32 / ((param0 - 43) / 47);
        ButtonWidget.field_C.replaceContent(MouseWheelInput.field_d, -106);
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        ValidationProvider referenceValidation = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_9_0 = null;
        ValidationState stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -257) {
            stackIn_2_0 = (ValidationState) null;
            return stackIn_2_0;
          }
          if (this.referenceInput instanceof ValidationProviderSource) {
            referenceValidation = ((ValidationProviderSource) ((Object) this.referenceInput)).getValidationProvider((byte) -106);
            if ((referenceValidation != null) &&
                (referenceValidation.a((byte) -105) != SocketArchiveNetworkClient.field_w)) {
              stackIn_9_0 = WidgetSkinState.field_m;
              return stackIn_9_0;
            }
          }
          if (!candidateText.equals(this.referenceInput.widgetText)) {
            stackIn_13_0 = WidgetSkinState.field_m;
          } else {
            stackIn_13_0 = SocketArchiveNetworkClient.field_w;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("n.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        ValidationProvider referenceValidation = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 422) {
            rasterTargetStack = (IntrusiveDeque) null;
          }
          if (this.referenceInput instanceof ValidationProviderSource) {
            referenceValidation = ((ValidationProviderSource) ((Object) this.referenceInput)).getValidationProvider((byte) -118);
            if (referenceValidation != null) {
              if ((referenceValidation.a((byte) -105) == SocketArchiveNetworkClient.field_w) &&
                  (!candidateText.equals(this.referenceInput.widgetText))) {
                stackIn_8_0 = GrowableIntList.createMismatchAlertText;
                return stackIn_8_0;
              }
              stackIn_10_0 = referenceValidation.c(-21666);
              return stackIn_10_0;
            }
          }
          if (candidateText.equals(this.referenceInput.widgetText)) {
            return null;
          }
          stackIn_14_0 = GrowableIntList.createMismatchAlertText;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("n.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static UsernameAvailabilityQuery d(byte param0) {
        if (!(DiskCacheWorker.field_l != kd.field_b)) {
            throw new IllegalStateException();
        }
        int var1 = 28 % ((-79 - param0) / 44);
        if (va.field_e == kd.field_b) {
            kd.field_b = DiskCacheWorker.field_l;
            return dl.field_a;
        }
        return null;
    }

    static {
        rasterTargetStack = new IntrusiveDeque();
    }
}
