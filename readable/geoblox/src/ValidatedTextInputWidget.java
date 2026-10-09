/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextInputWidget implements ValidationProviderSource {
    static int archiveClientId;
    private int pointerLocalX;
    static int logoStartDelayMillis;
    static String goBackText;
    static byte[] loginResponseExtensionBytes;
    private ValidationProvider validationProvider;

    final String getHoverText(byte methodGuard) {
        if (methodGuard != 69) {
            this.getHoverText((byte) -87);
            if (!this.pointerInside) {
                return null;
            }
            if (null != this.hoverText) {
                ResizableDialog.setPendingTooltipAnchor(PcmResampler.pointerYSnapshot, (byte) -84, PrefixCodeDecoder.pointerXSnapshot + this.widgetWidth - this.pointerLocalX);
                return this.hoverText;
            }
            return null;
        }
        if (!this.pointerInside) {
            return null;
        }
        if (null != this.hoverText) {
            ResizableDialog.setPendingTooltipAnchor(PcmResampler.pointerYSnapshot, (byte) -84, PrefixCodeDecoder.pointerXSnapshot + this.widgetWidth - this.pointerLocalX);
            return this.hoverText;
        }
        return null;
    }

    final static boolean isValidAccountName(byte methodGuard, CharSequence nameText) {
        RuntimeException nameValidationFailure = null;
        boolean validNameBeforeReturn = false;
        RuntimeException nameFailureForContext = null;
        StringBuilder nameContextBuilder = null;
        String nameDescription = null;
        RuntimeException caughtNameFailure = null;
        try {
          if (methodGuard <= 80) {
            logoStartDelayMillis = -109;
          }
          validNameBeforeReturn = CheckboxRenderer.isValidAccountName(false, nameText, (byte) -121);
          return validNameBeforeReturn;
        } catch (java.lang.RuntimeException nameFailure) {
          caughtNameFailure = nameFailure;
          nameValidationFailure = caughtNameFailure;
          nameFailureForContext = nameValidationFailure;
          nameContextBuilder = new StringBuilder().append("hc.IA(").append(methodGuard).append(',');
          if (nameText == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) nameFailureForContext), ((StringBuilder) (Object) nameContextBuilder).append(nameDescription).append(')').toString());
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        if (hoverGuard) {
            return;
        }
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.pointerLocalX = -this.widgetX + (PrefixCodeDecoder.pointerXSnapshot - parentX);
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "hc.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    ValidatedTextInputWidget(String initialText, WidgetListener listener, int maximumLength) {
        super(initialText, listener, maximumLength);
    }

    public final ValidationProvider getValidationProvider(byte methodGuard) {
        if (methodGuard > -97) {
            goBackText = (String) null;
            return this.validationProvider;
        }
        return this.validationProvider;
    }

    final static char normalizeNameCharacter(char character, int methodGuard) {
        int characterCode;
        int characterCodePhase2;
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
          if (93 != characterCode &&
              35 != characterCode) {
            if (characterCode != 224 &&
                characterCode != 225 &&
                characterCode != 226 &&
                characterCode != 228 &&
                characterCode != 227 &&
                characterCode != 192 &&
                characterCode != 193 &&
                characterCode != 194 &&
                characterCode != 196 &&
                characterCode != 195) {
              if (characterCode != 232 &&
                  characterCode != 233 &&
                  characterCode != 234 &&
                  characterCode != 235 &&
                  characterCode != 200 &&
                  characterCode != 201 &&
                  characterCode != 202 &&
                  characterCode != 203) {
                if (characterCode != 237 &&
                    characterCode != 238 &&
                    239 != characterCode &&
                    characterCode != 205 &&
                    characterCode != 206 &&
                    characterCode != 207) {
                  if (characterCode != 242 &&
                      243 != characterCode &&
                      characterCode != 244 &&
                      characterCode != 246 &&
                      characterCode != 245 &&
                      characterCode != 210 &&
                      characterCode != 211 &&
                      characterCode != 212 &&
                      characterCode != 214 &&
                      characterCode != 213) {
                    if (249 != characterCode &&
                        250 != characterCode &&
                        characterCode != 251 &&
                        characterCode != 252 &&
                        characterCode != 217) {
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
        ValidatedTextInputWidget.releaseStaticReferences(82);
        characterCodePhase2 = character;
        if (32 != characterCodePhase2) {
          if (characterCodePhase2 == 160) {
            return '_';
          }
          if (characterCodePhase2 != 95 &&
              characterCodePhase2 != 45) {
            if (characterCodePhase2 != 91 &&
                93 != characterCodePhase2 &&
                35 != characterCodePhase2) {
              if (characterCodePhase2 != 224 &&
                  characterCodePhase2 != 225 &&
                  characterCodePhase2 != 226 &&
                  characterCodePhase2 != 228 &&
                  characterCodePhase2 != 227 &&
                  characterCodePhase2 != 192 &&
                  characterCodePhase2 != 193 &&
                  characterCodePhase2 != 194 &&
                  characterCodePhase2 != 196 &&
                  characterCodePhase2 != 195) {
                if (characterCodePhase2 != 232 &&
                    characterCodePhase2 != 233 &&
                    characterCodePhase2 != 234 &&
                    characterCodePhase2 != 235 &&
                    characterCodePhase2 != 200 &&
                    characterCodePhase2 != 201 &&
                    characterCodePhase2 != 202) {
                  if (characterCodePhase2 == 203) {
                    return 'e';
                  }
                  if (characterCodePhase2 == 237) {
                    return 'i';
                  }
                  if (characterCodePhase2 == 238) {
                    return 'i';
                  }
                  if (239 == characterCodePhase2) {
                    return 'i';
                  }
                  if (characterCodePhase2 != 205 &&
                      characterCodePhase2 != 206 &&
                      characterCodePhase2 != 207) {
                    if (characterCodePhase2 != 242) {
                      if (243 == characterCodePhase2) {
                        return 'o';
                      }
                      if (characterCodePhase2 == 244) {
                        return 'o';
                      }
                      if (characterCodePhase2 != 246 &&
                          characterCodePhase2 != 245) {
                        if (characterCodePhase2 == 210) {
                          return 'o';
                        }
                        if (characterCodePhase2 == 211) {
                          return 'o';
                        }
                        if (characterCodePhase2 != 212 &&
                            characterCodePhase2 != 214 &&
                            characterCodePhase2 != 213) {
                          if (249 != characterCodePhase2) {
                            if (250 == characterCodePhase2) {
                              return 'u';
                            }
                            if (characterCodePhase2 == 251) {
                              return 'u';
                            }
                            if (characterCodePhase2 == 252) {
                              return 'u';
                            }
                            if (characterCodePhase2 == 217) {
                              return 'u';
                            }
                            if (218 == characterCodePhase2) {
                              return 'u';
                            }
                            if (characterCodePhase2 == 219) {
                              return 'u';
                            }
                            if (characterCodePhase2 != 220) {
                              if (characterCodePhase2 == 231) {
                                return 'c';
                              }
                              if (characterCodePhase2 == 199) {
                                return 'c';
                              }
                              if (characterCodePhase2 == 255) {
                                return 'y';
                              }
                              if (characterCodePhase2 == 376) {
                                return 'y';
                              }
                              if (characterCodePhase2 == 241) {
                                return 'n';
                              }
                              if (characterCodePhase2 == 209) {
                                return 'n';
                              }
                              if (characterCodePhase2 == 223) {
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

    final static void releasePointerListener(boolean methodGuard) {
        Object pointerListenerMonitor = null;
        Throwable unusedReleaseFailure = null;
        Throwable unusedCaughtReleaseFailure = null;
        if (!methodGuard) {
          archiveClientId = -8;
        }
        if (GameplaySetupSupport.pointerListener == null) {
          return;
        }
        pointerListenerMonitor = GameplaySetupSupport.pointerListener;
        synchronized (pointerListenerMonitor) {
          GameplaySetupSupport.pointerListener = null;
        }
    }

    final void setValidationProvider(byte methodGuard, ValidationProvider provider) {
        try {
            this.validationProvider = provider;
            int guardResidue = 48 % ((methodGuard - 34) / 39);
        } catch (RuntimeException providerAssignmentFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) providerAssignmentFailure), "hc.GA(" + methodGuard + ',' + (provider != null ? "{...}" : "null") + ')');
        }
    }

    final void notifyTextInputChanged(byte methodGuard) {
        super.notifyTextInputChanged((byte) -66);
        if (this.validationProvider != null) {
            this.validationProvider.resetValidationDelay(-28133);
            if (methodGuard > -16) {
                this.pointerLocalX = -4;
                return;
            }
            return;
        }
        if (methodGuard <= -16) {
            return;
        }
        this.pointerLocalX = -4;
    }

    public static void releaseStaticReferences(int methodGuard) {
        goBackText = null;
        loginResponseExtensionBytes = null;
        if (methodGuard != -243) {
            archiveClientId = -90;
        }
    }

    static {
        goBackText = "Go Back";
    }
}
