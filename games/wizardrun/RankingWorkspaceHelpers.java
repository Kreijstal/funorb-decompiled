/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingWorkspaceHelpers {
    static ResourceArchive field_a;
    static String field_c;
    static String field_b;

    final static void ensureRankingWorkspace(byte param0, int param1, int param2) {
        int var3;
        var3 = -116 / ((-20 - param0) / 43);
        if (null == MidiNoteMixer.field_m) {
          MidiNoteMixer.field_m = new int[param2 * 2];
          if (RadialSelectorWidget.field_I == null ||
            !(param2 <= RadialSelectorWidget.field_I.length)) {
            RadialSelectorWidget.field_I = new int[2 * param2];
          }
          if (DiskCacheRequest.field_B == null ||
            !(DiskCacheRequest.field_B.length >= param2)) {
            DiskCacheRequest.field_B = new int[param2 * 2];
          }
          if (MouseInputHandler.field_c == null ||
            !(MouseInputHandler.field_c.length >= param2)) {
            MouseInputHandler.field_c = new int[param2 * 2];
          }
          if (AccountValidationHelpers.field_c != null &&
            param2 <= AccountValidationHelpers.field_c.length) {
            if (KeyboardShutdownHelpers.field_c == null) {
              KeyboardShutdownHelpers.field_c = new int[param2 * 2];
              if (EmailAddressValidator.field_m == null ||
                !(EmailAddressValidator.field_m.length >= param1 + param2)) {
                EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
              }
              if (WeightedLruCache.field_g == null ||
                !(param2 <= WeightedLruCache.field_g.length)) {
                WeightedLruCache.field_g = new boolean[2 * param2];
              }
            } else {
              if (KeyboardShutdownHelpers.field_c.length < param2) {
                KeyboardShutdownHelpers.field_c = new int[param2 * 2];
                if (EmailAddressValidator.field_m == null ||
                  !(EmailAddressValidator.field_m.length >= param1 + param2)) {
                  EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                }
                if (WeightedLruCache.field_g == null ||
                  !(param2 <= WeightedLruCache.field_g.length)) {
                  WeightedLruCache.field_g = new boolean[2 * param2];
                }
              } else {
                if (EmailAddressValidator.field_m == null) {
                  EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                  if (WeightedLruCache.field_g == null ||
                    !(param2 <= WeightedLruCache.field_g.length)) {
                    WeightedLruCache.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (EmailAddressValidator.field_m.length < param1 + param2) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                    if (WeightedLruCache.field_g == null ||
                      !(param2 <= WeightedLruCache.field_g.length)) {
                      WeightedLruCache.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (WeightedLruCache.field_g == null) {
                      WeightedLruCache.field_g = new boolean[2 * param2];
                    } else {
                      if (param2 > WeightedLruCache.field_g.length) {
                        WeightedLruCache.field_g = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
            ByteStorage.field_b = -2147483648;
            FullscreenFailureKind.rankingCount = 0;
            ArchiveContainerHelpers.field_d = 2147483647;
            ContentTransitionDialog.field_W = 2147483647;
            DisplayModeInfo.field_e = -2147483648;
            return;
          }
          AccountValidationHelpers.field_c = new int[2 * param2];
          if (KeyboardShutdownHelpers.field_c == null ||
            !(KeyboardShutdownHelpers.field_c.length >= param2)) {
            KeyboardShutdownHelpers.field_c = new int[param2 * 2];
          }
          if (EmailAddressValidator.field_m == null ||
            !(EmailAddressValidator.field_m.length >= param1 + param2)) {
            EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
          }
          if (WeightedLruCache.field_g == null ||
            !(param2 <= WeightedLruCache.field_g.length)) {
            WeightedLruCache.field_g = new boolean[2 * param2];
          }
        } else {
          if (MidiNoteMixer.field_m.length >= param2) {
            if (RadialSelectorWidget.field_I == null ||
              !(param2 <= RadialSelectorWidget.field_I.length)) {
              RadialSelectorWidget.field_I = new int[2 * param2];
            }
            if (DiskCacheRequest.field_B == null ||
              !(DiskCacheRequest.field_B.length >= param2)) {
              DiskCacheRequest.field_B = new int[param2 * 2];
            }
            if (MouseInputHandler.field_c == null ||
              !(MouseInputHandler.field_c.length >= param2)) {
              MouseInputHandler.field_c = new int[param2 * 2];
            }
            if (AccountValidationHelpers.field_c != null &&
              param2 <= AccountValidationHelpers.field_c.length) {
              if (KeyboardShutdownHelpers.field_c == null) {
                KeyboardShutdownHelpers.field_c = new int[param2 * 2];
                if (EmailAddressValidator.field_m == null ||
                  !(EmailAddressValidator.field_m.length >= param1 + param2)) {
                  EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                }
                if (WeightedLruCache.field_g == null ||
                  !(param2 <= WeightedLruCache.field_g.length)) {
                  WeightedLruCache.field_g = new boolean[2 * param2];
                }
              } else {
                if (KeyboardShutdownHelpers.field_c.length < param2) {
                  KeyboardShutdownHelpers.field_c = new int[param2 * 2];
                  if (EmailAddressValidator.field_m == null ||
                    !(EmailAddressValidator.field_m.length >= param1 + param2)) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                  }
                  if (WeightedLruCache.field_g == null ||
                    !(param2 <= WeightedLruCache.field_g.length)) {
                    WeightedLruCache.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (EmailAddressValidator.field_m == null) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                    if (WeightedLruCache.field_g == null ||
                      !(param2 <= WeightedLruCache.field_g.length)) {
                      WeightedLruCache.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (EmailAddressValidator.field_m.length < param1 + param2) {
                      EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                      if (WeightedLruCache.field_g == null ||
                        !(param2 <= WeightedLruCache.field_g.length)) {
                        WeightedLruCache.field_g = new boolean[2 * param2];
                      }
                    } else {
                      if (WeightedLruCache.field_g == null) {
                        WeightedLruCache.field_g = new boolean[2 * param2];
                      } else {
                        if (param2 > WeightedLruCache.field_g.length) {
                          WeightedLruCache.field_g = new boolean[2 * param2];
                        }
                      }
                    }
                  }
                }
              }
              ByteStorage.field_b = -2147483648;
              FullscreenFailureKind.rankingCount = 0;
              ArchiveContainerHelpers.field_d = 2147483647;
              ContentTransitionDialog.field_W = 2147483647;
              DisplayModeInfo.field_e = -2147483648;
              return;
            }
            AccountValidationHelpers.field_c = new int[2 * param2];
            if (KeyboardShutdownHelpers.field_c == null ||
              !(KeyboardShutdownHelpers.field_c.length >= param2)) {
              KeyboardShutdownHelpers.field_c = new int[param2 * 2];
            }
            if (EmailAddressValidator.field_m == null ||
              !(EmailAddressValidator.field_m.length >= param1 + param2)) {
              EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
            }
            if (WeightedLruCache.field_g == null ||
              !(param2 <= WeightedLruCache.field_g.length)) {
              WeightedLruCache.field_g = new boolean[2 * param2];
            }
          } else {
            MidiNoteMixer.field_m = new int[param2 * 2];
            if (RadialSelectorWidget.field_I == null ||
              !(param2 <= RadialSelectorWidget.field_I.length)) {
              RadialSelectorWidget.field_I = new int[2 * param2];
            }
            if (DiskCacheRequest.field_B == null ||
              !(DiskCacheRequest.field_B.length >= param2)) {
              DiskCacheRequest.field_B = new int[param2 * 2];
            }
            if (MouseInputHandler.field_c == null ||
              !(MouseInputHandler.field_c.length >= param2)) {
              MouseInputHandler.field_c = new int[param2 * 2];
            }
            if (AccountValidationHelpers.field_c != null &&
              param2 <= AccountValidationHelpers.field_c.length) {
              if (KeyboardShutdownHelpers.field_c == null) {
                KeyboardShutdownHelpers.field_c = new int[param2 * 2];
                if (EmailAddressValidator.field_m == null) {
                  EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                  if (WeightedLruCache.field_g == null ||
                    !(param2 <= WeightedLruCache.field_g.length)) {
                    WeightedLruCache.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (EmailAddressValidator.field_m.length < param1 + param2) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                    if (WeightedLruCache.field_g == null ||
                      !(param2 <= WeightedLruCache.field_g.length)) {
                      WeightedLruCache.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (WeightedLruCache.field_g == null) {
                      WeightedLruCache.field_g = new boolean[2 * param2];
                    } else {
                      if (param2 > WeightedLruCache.field_g.length) {
                        WeightedLruCache.field_g = new boolean[2 * param2];
                      }
                    }
                  }
                }
              } else {
                if (KeyboardShutdownHelpers.field_c.length < param2) {
                  KeyboardShutdownHelpers.field_c = new int[param2 * 2];
                  if (EmailAddressValidator.field_m == null ||
                    !(EmailAddressValidator.field_m.length >= param1 + param2)) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                  }
                } else {
                  if (EmailAddressValidator.field_m == null) {
                    EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                  } else {
                    if (EmailAddressValidator.field_m.length < param1 + param2) {
                      EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
                    }
                  }
                }
                if (WeightedLruCache.field_g == null) {
                  WeightedLruCache.field_g = new boolean[2 * param2];
                } else {
                  if (param2 > WeightedLruCache.field_g.length) {
                    WeightedLruCache.field_g = new boolean[2 * param2];
                  }
                }
              }
              ByteStorage.field_b = -2147483648;
              FullscreenFailureKind.rankingCount = 0;
              ArchiveContainerHelpers.field_d = 2147483647;
              ContentTransitionDialog.field_W = 2147483647;
              DisplayModeInfo.field_e = -2147483648;
              return;
            }
            AccountValidationHelpers.field_c = new int[2 * param2];
            if (KeyboardShutdownHelpers.field_c == null ||
              !(KeyboardShutdownHelpers.field_c.length >= param2)) {
              KeyboardShutdownHelpers.field_c = new int[param2 * 2];
            }
            if (EmailAddressValidator.field_m == null ||
              !(EmailAddressValidator.field_m.length >= param1 + param2)) {
              EmailAddressValidator.field_m = new int[2 * (param2 + param1)];
            }
            if (WeightedLruCache.field_g != null &&
              param2 <= WeightedLruCache.field_g.length) {
              ByteStorage.field_b = -2147483648;
              FullscreenFailureKind.rankingCount = 0;
              ArchiveContainerHelpers.field_d = 2147483647;
              ContentTransitionDialog.field_W = 2147483647;
              DisplayModeInfo.field_e = -2147483648;
              return;
            }
            WeightedLruCache.field_g = new boolean[2 * param2];
          }
        }
        ByteStorage.field_b = -2147483648;
        FullscreenFailureKind.rankingCount = 0;
        ArchiveContainerHelpers.field_d = 2147483647;
        ContentTransitionDialog.field_W = 2147483647;
        DisplayModeInfo.field_e = -2147483648;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 2) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        RankingWorkspaceHelpers.releaseStatics(-78);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void openQuitPage(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param0 < 122) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(SpriteButtonPainter.appendChangedSessionParameters(-73, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("bc.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "OVER <%0>";
        field_c = "Achieved";
    }
}
