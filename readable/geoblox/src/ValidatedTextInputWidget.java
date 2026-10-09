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
        int fallbackCharacterCode;
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
        fallbackCharacterCode = character;
        if (32 != fallbackCharacterCode) {
          if (fallbackCharacterCode == 160) {
            return '_';
          }
          if (fallbackCharacterCode != 95 &&
              fallbackCharacterCode != 45) {
            if (fallbackCharacterCode != 91 &&
                93 != fallbackCharacterCode &&
                35 != fallbackCharacterCode) {
              if (fallbackCharacterCode != 224 &&
                  fallbackCharacterCode != 225 &&
                  fallbackCharacterCode != 226 &&
                  fallbackCharacterCode != 228 &&
                  fallbackCharacterCode != 227 &&
                  fallbackCharacterCode != 192 &&
                  fallbackCharacterCode != 193 &&
                  fallbackCharacterCode != 194 &&
                  fallbackCharacterCode != 196 &&
                  fallbackCharacterCode != 195) {
                if (fallbackCharacterCode != 232 &&
                    fallbackCharacterCode != 233 &&
                    fallbackCharacterCode != 234 &&
                    fallbackCharacterCode != 235 &&
                    fallbackCharacterCode != 200 &&
                    fallbackCharacterCode != 201 &&
                    fallbackCharacterCode != 202) {
                  if (fallbackCharacterCode == 203) {
                    return 'e';
                  }
                  if (fallbackCharacterCode == 237) {
                    return 'i';
                  }
                  if (fallbackCharacterCode == 238) {
                    return 'i';
                  }
                  if (239 == fallbackCharacterCode) {
                    return 'i';
                  }
                  if (fallbackCharacterCode != 205 &&
                      fallbackCharacterCode != 206 &&
                      fallbackCharacterCode != 207) {
                    if (fallbackCharacterCode != 242) {
                      if (243 == fallbackCharacterCode) {
                        return 'o';
                      }
                      if (fallbackCharacterCode == 244) {
                        return 'o';
                      }
                      if (fallbackCharacterCode != 246 &&
                          fallbackCharacterCode != 245) {
                        if (fallbackCharacterCode == 210) {
                          return 'o';
                        }
                        if (fallbackCharacterCode == 211) {
                          return 'o';
                        }
                        if (fallbackCharacterCode != 212 &&
                            fallbackCharacterCode != 214 &&
                            fallbackCharacterCode != 213) {
                          if (249 != fallbackCharacterCode) {
                            if (250 == fallbackCharacterCode) {
                              return 'u';
                            }
                            if (fallbackCharacterCode == 251) {
                              return 'u';
                            }
                            if (fallbackCharacterCode == 252) {
                              return 'u';
                            }
                            if (fallbackCharacterCode == 217) {
                              return 'u';
                            }
                            if (218 == fallbackCharacterCode) {
                              return 'u';
                            }
                            if (fallbackCharacterCode == 219) {
                              return 'u';
                            }
                            if (fallbackCharacterCode != 220) {
                              if (fallbackCharacterCode == 231) {
                                return 'c';
                              }
                              if (fallbackCharacterCode == 199) {
                                return 'c';
                              }
                              if (fallbackCharacterCode == 255) {
                                return 'y';
                              }
                              if (fallbackCharacterCode == 376) {
                                return 'y';
                              }
                              if (fallbackCharacterCode == 241) {
                                return 'n';
                              }
                              if (fallbackCharacterCode == 209) {
                                return 'n';
                              }
                              if (fallbackCharacterCode == 223) {
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
