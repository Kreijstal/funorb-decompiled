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

    final static char a(char param0, int param1) {
        int var2;
        if (param1 == -227) {
          var2 = param0;
          if (32 == var2) {
            return '_';
          }
          if (var2 == 160) {
            return '_';
          }
          if (var2 == 95) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (var2 == 91) {
            return param0;
          }
          if ((93 != var2) &&
              (35 != var2)) {
            if ((var2 != 224) &&
                (var2 != 225) &&
                (var2 != 226) &&
                (var2 != 228) &&
                (var2 != 227) &&
                (var2 != 192) &&
                (var2 != 193) &&
                (var2 != 194) &&
                (var2 != 196) &&
                (var2 != 195)) {
              if ((var2 != 232) &&
                  (var2 != 233) &&
                  (var2 != 234) &&
                  (var2 != 235) &&
                  (var2 != 200) &&
                  (var2 != 201) &&
                  (var2 != 202) &&
                  (var2 != 203)) {
                if ((var2 != 237) &&
                    (var2 != 238) &&
                    (239 != var2) &&
                    (var2 != 205) &&
                    (var2 != 206) &&
                    (var2 != 207)) {
                  if ((var2 != 242) &&
                      (243 != var2) &&
                      (var2 != 244) &&
                      (var2 != 246) &&
                      (var2 != 245) &&
                      (var2 != 210) &&
                      (var2 != 211) &&
                      (var2 != 212) &&
                      (var2 != 214) &&
                      (var2 != 213)) {
                    if ((249 != var2) &&
                        (250 != var2) &&
                        (var2 != 251) &&
                        (var2 != 252) &&
                        (var2 != 217)) {
                      if (218 == var2) {
                        return 'u';
                      }
                      if (var2 == 219) {
                        return 'u';
                      }
                      if (var2 != 220) {
                        if (var2 == 231) {
                          return 'c';
                        }
                        if (var2 == 199) {
                          return 'c';
                        }
                        if (var2 == 255) {
                          return 'y';
                        }
                        if (var2 == 376) {
                          return 'y';
                        }
                        if (var2 == 241) {
                          return 'n';
                        }
                        if (var2 == 209) {
                          return 'n';
                        }
                        if (var2 == 223) {
                          return 'b';
                        }
                        return Character.toLowerCase(param0);
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
          return param0;
        }
        ValidatedTextInputWidget.k(82);
        var2 = param0;
        if (32 != var2) {
          if (var2 == 160) {
            return '_';
          }
          if ((var2 != 95) &&
              (var2 != 45)) {
            if ((var2 != 91) &&
                (93 != var2) &&
                (35 != var2)) {
              if ((var2 != 224) &&
                  (var2 != 225) &&
                  (var2 != 226) &&
                  (var2 != 228) &&
                  (var2 != 227) &&
                  (var2 != 192) &&
                  (var2 != 193) &&
                  (var2 != 194) &&
                  (var2 != 196) &&
                  (var2 != 195)) {
                if ((var2 != 232) &&
                    (var2 != 233) &&
                    (var2 != 234) &&
                    (var2 != 235) &&
                    (var2 != 200) &&
                    (var2 != 201) &&
                    (var2 != 202)) {
                  if (var2 == 203) {
                    return 'e';
                  }
                  if (var2 == 237) {
                    return 'i';
                  }
                  if (var2 == 238) {
                    return 'i';
                  }
                  if (239 == var2) {
                    return 'i';
                  }
                  if ((var2 != 205) &&
                      (var2 != 206) &&
                      (var2 != 207)) {
                    if (var2 != 242) {
                      if (243 == var2) {
                        return 'o';
                      }
                      if (var2 == 244) {
                        return 'o';
                      }
                      if ((var2 != 246) &&
                          (var2 != 245)) {
                        if (var2 == 210) {
                          return 'o';
                        }
                        if (var2 == 211) {
                          return 'o';
                        }
                        if ((var2 != 212) &&
                            (var2 != 214) &&
                            (var2 != 213)) {
                          if (249 != var2) {
                            if (250 == var2) {
                              return 'u';
                            }
                            if (var2 == 251) {
                              return 'u';
                            }
                            if (var2 == 252) {
                              return 'u';
                            }
                            if (var2 == 217) {
                              return 'u';
                            }
                            if (218 == var2) {
                              return 'u';
                            }
                            if (var2 == 219) {
                              return 'u';
                            }
                            if (var2 != 220) {
                              if (var2 == 231) {
                                return 'c';
                              }
                              if (var2 == 199) {
                                return 'c';
                              }
                              if (var2 == 255) {
                                return 'y';
                              }
                              if (var2 == 376) {
                                return 'y';
                              }
                              if (var2 == 241) {
                                return 'n';
                              }
                              if (var2 == 209) {
                                return 'n';
                              }
                              if (var2 == 223) {
                                return 'b';
                              }
                              return Character.toLowerCase(param0);
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
            return param0;
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
