/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextInputWidget implements ValidationProviderSource {
    static int archiveClientId;
    private int field_S;
    static int field_R;
    static String goBackText;
    static byte[] field_K;
    private ValidationProvider field_Q;

    final String getHoverText(byte methodGuard) {
        if (methodGuard != 69) {
            this.getHoverText((byte) -87);
            if (!this.pointerInside) {
                return null;
            }
            if (null != this.hoverText) {
                ResizableDialog.a(PcmResampler.pointerYSnapshot, (byte) -84, PrefixCodeDecoder.pointerXSnapshot + this.widgetWidth - this.field_S);
                return this.hoverText;
            }
            return null;
        }
        if (!this.pointerInside) {
            return null;
        }
        if (null != this.hoverText) {
            ResizableDialog.a(PcmResampler.pointerYSnapshot, (byte) -84, PrefixCodeDecoder.pointerXSnapshot + this.widgetWidth - this.field_S);
            return this.hoverText;
        }
        return null;
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 80) {
            field_R = -109;
          }
          stackIn_3_0 = CheckboxRenderer.a(false, param1, (byte) -121);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        if (hoverGuard) {
            return;
        }
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.field_S = -this.widgetX + (PrefixCodeDecoder.pointerXSnapshot - parentX);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hc.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    ValidatedTextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    public final ValidationProvider getValidationProvider(byte methodGuard) {
        if (methodGuard > -97) {
            goBackText = (String) null;
            return this.field_Q;
        }
        return this.field_Q;
    }

    final static char normalizeNameCharacter(char character, int methodGuard) {
        int characterCode;
        if (methodGuard == -227) {
          characterCode = character;
          if (32 == characterCode) {
            return '_';
          }
          if (characterCode == 160) {
            return '_';
          }
          if (characterCode == 95) {
            return '_';
          }
          if (characterCode == 45) {
            return '_';
          }
          if (characterCode == 91) {
            return character;
          }
          if ((93 != characterCode) &&
              (35 != characterCode)) {
            if ((characterCode != 224) &&
                (characterCode != 225) &&
                (characterCode != 226) &&
                (characterCode != 228) &&
                (characterCode != 227) &&
                (characterCode != 192) &&
                (characterCode != 193) &&
                (characterCode != 194) &&
                (characterCode != 196) &&
                (characterCode != 195)) {
              if ((characterCode != 232) &&
                  (characterCode != 233) &&
                  (characterCode != 234) &&
                  (characterCode != 235) &&
                  (characterCode != 200) &&
                  (characterCode != 201) &&
                  (characterCode != 202) &&
                  (characterCode != 203)) {
                if ((characterCode != 237) &&
                    (characterCode != 238) &&
                    (239 != characterCode) &&
                    (characterCode != 205) &&
                    (characterCode != 206) &&
                    (characterCode != 207)) {
                  if ((characterCode != 242) &&
                      (243 != characterCode) &&
                      (characterCode != 244) &&
                      (characterCode != 246) &&
                      (characterCode != 245) &&
                      (characterCode != 210) &&
                      (characterCode != 211) &&
                      (characterCode != 212) &&
                      (characterCode != 214) &&
                      (characterCode != 213)) {
                    if ((249 != characterCode) &&
                        (250 != characterCode) &&
                        (characterCode != 251) &&
                        (characterCode != 252) &&
                        (characterCode != 217)) {
                      if (218 == characterCode) {
                        return 'u';
                      }
                      if (characterCode == 219) {
                        return 'u';
                      }
                      if (characterCode != 220) {
                        if (characterCode == 231) {
                          return 'c';
                        }
                        if (characterCode == 199) {
                          return 'c';
                        }
                        if (characterCode == 255) {
                          return 'y';
                        }
                        if (characterCode == 376) {
                          return 'y';
                        }
                        if (characterCode == 241) {
                          return 'n';
                        }
                        if (characterCode == 209) {
                          return 'n';
                        }
                        if (characterCode == 223) {
                          return 'b';
                        }
                        return Character.toLowerCase(character);
                      }
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return character;
        }
        ValidatedTextInputWidget.k(82);
        characterCode = character;
        if (32 != characterCode) {
          if (characterCode == 160) {
            return '_';
          }
          if ((characterCode != 95) &&
              (characterCode != 45)) {
            if ((characterCode != 91) &&
                (93 != characterCode) &&
                (35 != characterCode)) {
              if ((characterCode != 224) &&
                  (characterCode != 225) &&
                  (characterCode != 226) &&
                  (characterCode != 228) &&
                  (characterCode != 227) &&
                  (characterCode != 192) &&
                  (characterCode != 193) &&
                  (characterCode != 194) &&
                  (characterCode != 196) &&
                  (characterCode != 195)) {
                if ((characterCode != 232) &&
                    (characterCode != 233) &&
                    (characterCode != 234) &&
                    (characterCode != 235) &&
                    (characterCode != 200) &&
                    (characterCode != 201) &&
                    (characterCode != 202)) {
                  if (characterCode == 203) {
                    return 'e';
                  }
                  if (characterCode == 237) {
                    return 'i';
                  }
                  if (characterCode == 238) {
                    return 'i';
                  }
                  if (239 == characterCode) {
                    return 'i';
                  }
                  if ((characterCode != 205) &&
                      (characterCode != 206) &&
                      (characterCode != 207)) {
                    if (characterCode != 242) {
                      if (243 == characterCode) {
                        return 'o';
                      }
                      if (characterCode == 244) {
                        return 'o';
                      }
                      if ((characterCode != 246) &&
                          (characterCode != 245)) {
                        if (characterCode == 210) {
                          return 'o';
                        }
                        if (characterCode == 211) {
                          return 'o';
                        }
                        if ((characterCode != 212) &&
                            (characterCode != 214) &&
                            (characterCode != 213)) {
                          if (249 != characterCode) {
                            if (250 == characterCode) {
                              return 'u';
                            }
                            if (characterCode == 251) {
                              return 'u';
                            }
                            if (characterCode == 252) {
                              return 'u';
                            }
                            if (characterCode == 217) {
                              return 'u';
                            }
                            if (218 == characterCode) {
                              return 'u';
                            }
                            if (characterCode == 219) {
                              return 'u';
                            }
                            if (characterCode != 220) {
                              if (characterCode == 231) {
                                return 'c';
                              }
                              if (characterCode == 199) {
                                return 'c';
                              }
                              if (characterCode == 255) {
                                return 'y';
                              }
                              if (characterCode == 376) {
                                return 'y';
                              }
                              if (characterCode == 241) {
                                return 'n';
                              }
                              if (characterCode == 209) {
                                return 'n';
                              }
                              if (characterCode == 223) {
                                return 'b';
                              }
                              return Character.toLowerCase(character);
                            }
                          }
                          return 'u';
                        }
                      }
                    }
                    return 'o';
                  }
                  return 'i';
                }
                return 'e';
              }
              return 'a';
            }
            return character;
          }
        }
        return '_';
    }

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          archiveClientId = -8;
        }
        if (GameplaySetupSupport.pointerListener == null) {
          return;
        }
        var1 = GameplaySetupSupport.pointerListener;
        synchronized (var1) {
          GameplaySetupSupport.pointerListener = null;
        }
    }

    final void a(byte param0, ValidationProvider param1) {
        try {
            this.field_Q = param1;
            int var3_int = 48 % ((param0 - 34) / 39);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        super.g((byte) -66);
        if (this.field_Q != null) {
            this.field_Q.b(-28133);
            if (param0 > -16) {
                this.field_S = -4;
                return;
            }
            return;
        }
        if (param0 <= -16) {
            return;
        }
        this.field_S = -4;
    }

    public static void k(int param0) {
        goBackText = null;
        field_K = null;
        if (param0 != -243) {
            archiveClientId = -90;
        }
    }

    static {
        goBackText = "Go Back";
    }
}
