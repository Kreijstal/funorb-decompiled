/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static String field_b;
    private java.awt.Component delegate;
    static int field_c;

    DelegatingCanvas(java.awt.Component delegate) {
        try {
          this.delegate = delegate;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "od.<init>(" + (delegate != null ? "{...}" : "null") + ')');
        }
    }

    public final void paint(java.awt.Graphics graphics) {
        try {
          this.delegate.paint(graphics);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "od.paint(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int var2;
        regionExit1: {
          var2 = BrickABrac.field_J ? 1 : 0;
          if (13 != TextValidationHelpers.field_a) {
            if (TextValidationHelpers.field_a == 14) {
              if (0 < LogoRenderHelpers.field_a) {
                fieldTemp$0 = LogoRenderHelpers.field_a - 1;
                LogoRenderHelpers.field_a = LogoRenderHelpers.field_a - 1;
                if (0 == fieldTemp$0) {
                  SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
                  LoadingProgressDialog.field_eb = SaveResultsPromptScreen.field_y;
                  TextValidationHelpers.field_a = -1;
                  LogoRenderHelpers.field_a = 250;
                  LobbyOverlayHelpers.field_i = 0;
                  GrowableIntList.field_i = CalendarRankingHelpers.field_e;
                }
              }
            } else {
              if (TextValidationHelpers.field_a == 0) {
                if (0 < LogoRenderHelpers.field_a) {
                  fieldTemp$1 = LogoRenderHelpers.field_a - 1;
                  LogoRenderHelpers.field_a = LogoRenderHelpers.field_a - 1;
                  if (0 == fieldTemp$1) {
                    TextValidationHelpers.field_a = -1;
                    LobbyOverlayHelpers.field_i = 1;
                    LogoRenderHelpers.field_a = 250;
                    GrowableIntList.field_i = CalendarRankingHelpers.field_e;
                    SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
                    LoadingProgressDialog.field_eb = DialogPointerGlobals.field_d;
                  }
                }
              } else {
                if (TextValidationHelpers.field_a != 1) {
                  if (2 == TextValidationHelpers.field_a) {
                    if (0 < LogoRenderHelpers.field_a) {
                      fieldTemp$2 = LogoRenderHelpers.field_a - 1;
                      LogoRenderHelpers.field_a = LogoRenderHelpers.field_a - 1;
                      if (0 == fieldTemp$2) {
                        LoadingProgressDialog.field_eb = KeyboardInput.field_b;
                        TextValidationHelpers.field_a = -1;
                        LobbyOverlayHelpers.field_i = 3;
                      }
                    }
                  } else {
                    if (TextValidationHelpers.field_a != 3 &&
                      TextValidationHelpers.field_a != 4 &&
                      TextValidationHelpers.field_a != 5) {
                      if (TextValidationHelpers.field_a == 6) {
                        TextValidationHelpers.field_a = ArchiveNetworkRequest.field_G;
                        LobbyOverlayHelpers.field_i = ArchiveNetworkRequest.field_G;
                      } else {
                        if (TextValidationHelpers.field_a != 8 &&
                          TextValidationHelpers.field_a != 9) {
                          if (TextValidationHelpers.field_a == 10) {
                            LobbyOverlayHelpers.field_i = ArchiveNetworkRequest.field_G;
                            TextValidationHelpers.field_a = ArchiveNetworkRequest.field_G;
                          } else {
                            if (((TextValidationHelpers.field_a != 11)) &&
                              (TextValidationHelpers.field_a == 12)) {
                              break regionExit1;
                            }
                          }
                          break regionExit1;
                        }
                        if (LogoRenderHelpers.field_a > 0) {
                          fieldTemp$3 = LogoRenderHelpers.field_a - 1;
                          LogoRenderHelpers.field_a = LogoRenderHelpers.field_a - 1;
                          if (fieldTemp$3 == 0) {
                            LobbyOverlayHelpers.field_i = 11;
                            TextValidationHelpers.field_a = -1;
                            LoadingProgressDialog.field_eb = PopupWidgetLayer.field_U;
                            ValidationIconWidget.field_N = true;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (0 < LogoRenderHelpers.field_a) {
              fieldTemp$4 = LogoRenderHelpers.field_a - 1;
              LogoRenderHelpers.field_a = LogoRenderHelpers.field_a - 1;
              if (0 == fieldTemp$4) {
                SpriteGeometry.field_v = MembershipBenefitsScreen.clientTick;
                TextValidationHelpers.field_a = -1;
                GrowableIntList.field_i = CalendarRankingHelpers.field_e;
                LoadingProgressDialog.field_eb = BrickGameLayerController.field_d;
                LogoRenderHelpers.field_a = 250;
                LobbyOverlayHelpers.field_i = 14;
              }
            }
          }
        }
        if (param0 != 32) {
          field_c = 109;
        }
    }

    public final void update(java.awt.Graphics graphics) {
        try {
          this.delegate.update(graphics);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "od.update(" + (graphics != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isLegacyInputCharacter(char character, int obfuscationGuard) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 < character &&
            character < 128) {
            return true;
          }
          if (character >= 160 &&
            character <= 255) {
            return true;
          }
          if (character != 0) {
            var6 = ParisBackground.cp1252Extensions;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (var4 != character) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (obfuscationGuard != -12) {
            field_c = -78;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "od.D(" + character + ',' + obfuscationGuard + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          DelegatingCanvas.a((byte) 23);
        }
        field_b = null;
    }

    final static void appendDiagnosticDecimal(int obfuscationGuard, long value, StringBuilder destination) {
        StringBuilder discardedDigitAppend = null;
        StringBuilder discardedSignAppend = null;
        int digitIndex = 0;
        StringBuilder discardedDestinationAppend = null;
        int negativeFlag = 0;
        int digitCount = 0;
        int unusedClientFlag = 0;
        int negativeValue = 0;
        RuntimeException contextFailure = null;
        StringBuilder contextPrefix = null;
        String destinationArgumentSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException appendFailure = null;
        unusedClientFlag = BrickABrac.field_J ? 1 : 0;
        try {
          TextChoiceDialogStyles.diagnosticDecimalScratch.setLength(0);
          if (obfuscationGuard != -9) {
            field_c = -91;
          }
          negativeValue = (value >= 0L) ? 0 : 1;
          negativeFlag = negativeValue;
          digitCount = 0;
          do {
            discardedDigitAppend = TextChoiceDialogStyles.diagnosticDecimalScratch.append((char)(48 + (int)(value % 10L)));
            value = value / 10L;
            digitCount++;
          } while (0L != value);
          if (negativeFlag != 0) {
            discardedSignAppend = TextChoiceDialogStyles.diagnosticDecimalScratch.append('-');
          }
          for (digitIndex = digitCount - 1; digitIndex >= 0; digitIndex--) {
            discardedDestinationAppend = destination.append(TextChoiceDialogStyles.diagnosticDecimalScratch.charAt(digitIndex));
          }
          return;
        } catch (java.lang.RuntimeException caughtAppendFailure) {
          caughtFailure = caughtAppendFailure;
          appendFailure = caughtFailure;
          contextFailure = appendFailure;
          contextPrefix = new StringBuilder().append("od.C(").append(obfuscationGuard).append(',').append(value).append(',');
          if (destination == null) {
            destinationArgumentSummary = "null";
          } else {
            destinationArgumentSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) contextFailure), ((StringBuilder) (Object) contextPrefix).append(destinationArgumentSummary).append(')').toString());
        }
    }

    static {
        field_b = "Shortcut Reference";
    }
}
