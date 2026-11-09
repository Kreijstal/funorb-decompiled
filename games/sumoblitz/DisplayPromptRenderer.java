/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayPromptRenderer {
    static PcmStreamMixer field_c;
    static long field_a;
    static QuickChatCommand field_b;

    final static void drawDisplayPrompt(byte guard) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        String stackIn_42_1 = null;
        boolean stackIn_43_2 = false;
        NineSlicePanel stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSlicePanel var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = ProxyAuthenticationRequiredException.field_f;
          if (guard < 118) {
            DisplayPromptRenderer.releaseStatics(false);
          }
          var2 = 0;
          if (DroneChargeParticle.field_s == 2) {
            var3_long = IntroMeshResources.monotonicTimeMillis(-124) - LegacyOpenGlEffectManager.field_f;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; IntIndexHashTable.field_c.length > var3; var3++) {
            var4 = LegacyOpenGlPostProcessManager.field_a[var3];
            if (0 <= var4) {
              if (RendererPreference.field_a.selectedIndex != var4) {
                var5 = OpenGlCubeTexture.field_j;
              } else {
                var5 = LoginCredentialFactory.field_a;
              }
            } else {
              var5 = AppletInstanceState.field_d;
            }
            var6 = IntIndexHashTable.field_c[var3];
            if (2 == DroneChargeParticle.field_s &&
              1 == var2) {
              if (LoginFormState.field_b.length >= ResizingDialog.field_F.length) {
                stackIn_20_0 = LoginFormState.field_b.length;
              } else {
                stackIn_20_0 = ResizingDialog.field_F.length;
              }
              var7 = stackIn_20_0;
              if (TickClock.field_c.length >= TickClock.field_b.length) {
                stackIn_23_0 = TickClock.field_c.length;
              } else {
                stackIn_23_0 = TickClock.field_b.length;
              }
              var8 = stackIn_23_0;
              if (6 <= var3 &&
                var3 < 6 + var7) {
                if (-var7 + (-6 + var3 + LoginFormState.field_b.length) >= 0) {
                  stackIn_29_0 = LoginFormState.field_b[-var7 + LoginFormState.field_b.length + (var3 - 6)];
                } else {
                  stackIn_29_0 = "";
                }
                var6 = stackIn_29_0;
              }
              if (var7 + 7 <= var3 &&
                var8 + var7 + 7 > var3) {
                if (-var7 + (var3 - 7) >= TickClock.field_c.length) {
                  stackIn_36_0 = "";
                } else {
                  stackIn_36_0 = TickClock.field_c[-var7 + var3 - 7];
                }
                var6 = stackIn_36_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            stackIn_42_0 = -9;
            stackIn_42_1 = var6;
            stackIn_43_2 = !(0 > var4);
            var7Lifetime1 = MessageDialog.displayPromptTextWidthIntGuard(stackIn_42_0, stackIn_42_1, stackIn_43_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + BeveledCheckboxRenderer.field_a;
            if (var4 >= 0) {
              var1_int = var1_int + DroneIntroductionOverlay.field_a;
              if (var4 != RendererPreference.field_a.selectedIndex) {
                stackIn_48_0 = DroneVariantScoring.field_e;
              } else {
                stackIn_48_0 = PacketBuffer.field_k;
              }
              var9 = stackIn_48_0;
              if (var9 != null) {
                var9.draw((DebouncedInputValidator.field_b << 1) + var7Lifetime1, -DebouncedInputValidator.field_b + var8Lifetime1, (TextLayout.field_b << 1) + LegacyOpenGlUnderwaterEffect.field_h, 101, var1_int);
              }
              var1_int = var1_int + TextLayout.field_b;
            }
            if (var4 < 0) {
              ValidatedTextInputWidget.field_R.drawText(var6, var8Lifetime1, var1_int + NodeHashTableIterator.field_d, var5, -1);
              var1_int = var1_int + GameClientShell.field_t;
            } else {
              MouseWheelInput.field_a.drawText(var6, var8Lifetime1, var1_int + LegacyOpenGlTransform3D.field_f, var5, -1);
              var1_int = var1_int + (DroneIntroductionOverlay.field_a + (TextLayout.field_b + LegacyOpenGlUnderwaterEffect.field_h));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "sj.C(" + guard + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_c = null;
        if (!param0) {
          DisplayPromptRenderer.showLevelIntroduction(-105, -2, -5);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static boolean a(int param0) {
        BeveledTextInputRenderer.field_o = true;
        field_a = 15000L + IntroMeshResources.monotonicTimeMillis(-13);
        if (param0 < -26) {
          return LoginDialogNavigation.field_a == 11 ? true : false;
        }
        field_b = (QuickChatCommand) null;
        return LoginDialogNavigation.field_a == 11 ? true : false;
    }

    final static void showLevelIntroduction(int guard, int waveIndex, int levelIndex) {
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard == -1) {
          if (!SocketJs5Client.field_p[levelIndex] &&
            !TextureMetadata.field_f[levelIndex]) {
            var3 = levelIndex;
            if (0 == var3) {
              if (waveIndex == 0) {
                OpenGlVertexLayout.field_f.show(guard ^ 3387, 16);
              }
              if (waveIndex == 1) {
                OpenGlVertexLayout.field_f.show(-3388, 0);
              }
              if (2 == waveIndex) {
                OpenGlVertexLayout.field_f.show(-3388, 1);
                SocketJs5Client.field_p[levelIndex] = true;
              }
              return;
            }
            if (1 == var3) {
              if (0 == waveIndex) {
                OpenGlVertexLayout.field_f.show(guard ^ 3387, 2);
                SocketJs5Client.field_p[levelIndex] = true;
              }
              return;
            }
            if (var3 != 2) {
              if (var3 == 3) {
                if (waveIndex != 0) {
                  return;
                }
                OpenGlVertexLayout.field_f.show(-3388, 6);
              } else {
                if (4 == var3) {
                  if (0 == waveIndex) {
                    OpenGlVertexLayout.field_f.show(-3388, 7);
                  }
                  if (waveIndex == 1) {
                    OpenGlVertexLayout.field_f.show(guard ^ 3387, 4);
                  }
                  if (waveIndex == 2) {
                    OpenGlVertexLayout.field_f.show(-3388, 8);
                  }
                  if (waveIndex != 3) {
                    return;
                  }
                  OpenGlVertexLayout.field_f.show(guard ^ 3387, 9);
                } else {
                  if (var3 != 5) {
                    if (6 != var3) {
                      if (var3 == 8) {
                        if (waveIndex != 1) {
                          return;
                        }
                        OpenGlVertexLayout.field_f.show(-3388, 11);
                      } else {
                        if (var3 == 9) {
                          if (0 != waveIndex) {
                            return;
                          }
                          OpenGlVertexLayout.field_f.show(-3388, 12);
                        } else {
                          if (var3 == 10) {
                            if (0 != waveIndex) {
                              return;
                            }
                            OpenGlVertexLayout.field_f.show(guard ^ 3387, 13);
                          } else {
                            if (11 != var3) {
                              return;
                            }
                            if (waveIndex != 0) {
                              return;
                            }
                            OpenGlVertexLayout.field_f.show(-3388, 14);
                          }
                        }
                      }
                    } else {
                      if (0 == waveIndex) {
                        OpenGlVertexLayout.field_f.show(-3388, 18);
                      }
                      if (waveIndex != 4) {
                        return;
                      }
                      OpenGlVertexLayout.field_f.show(guard - 3387, 15);
                    }
                  } else {
                    if (waveIndex != 0) {
                      return;
                    }
                    OpenGlVertexLayout.field_f.show(-3388, 10);
                  }
                }
              }
            } else {
              if (waveIndex == 0) {
                OpenGlVertexLayout.field_f.show(guard ^ 3387, 5);
              }
              if (waveIndex != 5) {
                return;
              }
              OpenGlVertexLayout.field_f.show(-3388, 3);
            }
            SocketJs5Client.field_p[levelIndex] = true;
            return;
          }
          return;
        }
        DisplayPromptRenderer.a(-9);
        if (SocketJs5Client.field_p[levelIndex]) {
          return;
        }
        if (TextureMetadata.field_f[levelIndex]) {
          return;
        }
        var3Lifetime1 = levelIndex;
        if (0 == var3Lifetime1) {
          if (waveIndex == 0) {
            OpenGlVertexLayout.field_f.show(guard ^ 3387, 16);
          }
          if (waveIndex == 1) {
            OpenGlVertexLayout.field_f.show(-3388, 0);
          }
          if (2 != waveIndex) {
            return;
          }
          OpenGlVertexLayout.field_f.show(-3388, 1);
        } else {
          if (1 == var3Lifetime1) {
            if (0 != waveIndex) {
              return;
            }
            OpenGlVertexLayout.field_f.show(guard ^ 3387, 2);
          } else {
            if (var3Lifetime1 != 2) {
              if (var3Lifetime1 == 3) {
                if (waveIndex != 0) {
                  return;
                }
                OpenGlVertexLayout.field_f.show(-3388, 6);
              } else {
                if (4 == var3Lifetime1) {
                  if (0 == waveIndex) {
                    OpenGlVertexLayout.field_f.show(-3388, 7);
                  }
                  if (waveIndex == 1) {
                    OpenGlVertexLayout.field_f.show(guard ^ 3387, 4);
                  }
                  if (waveIndex == 2) {
                    OpenGlVertexLayout.field_f.show(-3388, 8);
                  }
                  if (waveIndex != 3) {
                    return;
                  }
                  OpenGlVertexLayout.field_f.show(guard ^ 3387, 9);
                } else {
                  if (var3Lifetime1 != 5) {
                    if (6 != var3Lifetime1) {
                      if (var3Lifetime1 != 8) {
                        if (var3Lifetime1 == 9) {
                          if (0 != waveIndex) {
                            return;
                          }
                          OpenGlVertexLayout.field_f.show(-3388, 12);
                        } else {
                          if (var3Lifetime1 == 10) {
                            if (0 != waveIndex) {
                              return;
                            }
                            OpenGlVertexLayout.field_f.show(guard ^ 3387, 13);
                          } else {
                            if (11 != var3Lifetime1) {
                              return;
                            }
                            if (waveIndex != 0) {
                              return;
                            }
                            OpenGlVertexLayout.field_f.show(-3388, 14);
                          }
                        }
                      } else {
                        if (waveIndex != 1) {
                          return;
                        }
                        OpenGlVertexLayout.field_f.show(-3388, 11);
                      }
                    } else {
                      if (0 == waveIndex) {
                        OpenGlVertexLayout.field_f.show(-3388, 18);
                      }
                      if (waveIndex != 4) {
                        return;
                      }
                      OpenGlVertexLayout.field_f.show(guard - 3387, 15);
                    }
                  } else {
                    if (waveIndex != 0) {
                      return;
                    }
                    OpenGlVertexLayout.field_f.show(-3388, 10);
                  }
                }
              }
            } else {
              if (waveIndex == 0) {
                OpenGlVertexLayout.field_f.show(guard ^ 3387, 5);
              }
              if (waveIndex != 5) {
                return;
              }
              OpenGlVertexLayout.field_f.show(-3388, 3);
            }
          }
        }
        SocketJs5Client.field_p[levelIndex] = true;
        return;
    }

    final static boolean isValidAccountName(boolean allowConsecutiveSeparators, int guard, CharSequence text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!SocketConnector.a(allowConsecutiveSeparators, 0, text)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (text.length() <= var3_int) {
              if (guard > 122) {
                return true;
              }
              DisplayPromptRenderer.a(-58);
              return true;
            }
            if (HardwareQuadBatchBuffers.isAllowedNameCharacter((byte) 110, text.charAt(var3_int))) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("sj.E(").append(allowConsecutiveSeparators).append(',').append(guard).append(',');
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_b = new QuickChatCommand(2, 4, 4, 0);
    }
}
