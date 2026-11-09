/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateUsernameCredentials extends UsernameCredentials {
    final static void initializeHiscoreRows(int count, int initialMaximum, int extraCount) {
        if (null == OpenGlUnderwaterEffect.field_p ||
          !(count <= OpenGlUnderwaterEffect.field_p.length)) {
          OpenGlUnderwaterEffect.field_p = new int[count * 2];
        }
        if (null == LoginFieldValue.field_a) {
          LoginFieldValue.field_a = new int[count * 2];
          if (ContentTransitionPhase.field_f == null) {
            ContentTransitionPhase.field_f = new int[2 * count];
            if (LegacyOpenGlInterleavedStream.field_c == null ||
              !(count <= LegacyOpenGlInterleavedStream.field_c.length)) {
              LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
            }
            if (SlowBurstParticle.field_z == null ||
              !(count <= SlowBurstParticle.field_z.length)) {
              SlowBurstParticle.field_z = new int[count * 2];
            }
            if (IntroductionOverlaySupport.field_c == null ||
              !(count <= IntroductionOverlaySupport.field_c.length)) {
              IntroductionOverlaySupport.field_c = new int[2 * count];
            }
            if (null == FourIntReadRequest.field_q ||
              !(extraCount + count <= FourIntReadRequest.field_q.length)) {
              FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
            }
            if (LegacyOpenGlTextureCache.field_b == null ||
              !(LegacyOpenGlTextureCache.field_b.length >= count)) {
              LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
            }
          } else {
            if (count <= ContentTransitionPhase.field_f.length) {
              if (LegacyOpenGlInterleavedStream.field_c == null ||
                !(count <= LegacyOpenGlInterleavedStream.field_c.length)) {
                LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
              }
              if (SlowBurstParticle.field_z == null ||
                !(count <= SlowBurstParticle.field_z.length)) {
                SlowBurstParticle.field_z = new int[count * 2];
              }
              if (IntroductionOverlaySupport.field_c == null ||
                !(count <= IntroductionOverlaySupport.field_c.length)) {
                IntroductionOverlaySupport.field_c = new int[2 * count];
              }
              if (null == FourIntReadRequest.field_q ||
                !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
              }
              if (LegacyOpenGlTextureCache.field_b == null ||
                !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
              }
            } else {
              ContentTransitionPhase.field_f = new int[2 * count];
              if (LegacyOpenGlInterleavedStream.field_c == null ||
                !(count <= LegacyOpenGlInterleavedStream.field_c.length)) {
                LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
              }
              if (SlowBurstParticle.field_z == null ||
                !(count <= SlowBurstParticle.field_z.length)) {
                SlowBurstParticle.field_z = new int[count * 2];
              }
              if (IntroductionOverlaySupport.field_c == null ||
                !(count <= IntroductionOverlaySupport.field_c.length)) {
                IntroductionOverlaySupport.field_c = new int[2 * count];
              }
              if (null == FourIntReadRequest.field_q ||
                !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
              }
              if (LegacyOpenGlTextureCache.field_b == null ||
                !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
              }
            }
          }
        } else {
          if (LoginFieldValue.field_a.length < count) {
            LoginFieldValue.field_a = new int[count * 2];
            if (ContentTransitionPhase.field_f == null ||
              !(count <= ContentTransitionPhase.field_f.length)) {
              ContentTransitionPhase.field_f = new int[2 * count];
            }
            if (LegacyOpenGlInterleavedStream.field_c == null ||
              !(count <= LegacyOpenGlInterleavedStream.field_c.length)) {
              LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
            }
            if (SlowBurstParticle.field_z == null ||
              !(count <= SlowBurstParticle.field_z.length)) {
              SlowBurstParticle.field_z = new int[count * 2];
            }
            if (IntroductionOverlaySupport.field_c == null) {
              IntroductionOverlaySupport.field_c = new int[2 * count];
              if (null == FourIntReadRequest.field_q ||
                !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
              }
              if (LegacyOpenGlTextureCache.field_b == null ||
                !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
              }
            } else {
              if (count <= IntroductionOverlaySupport.field_c.length) {
                if (null == FourIntReadRequest.field_q ||
                  !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                  FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                }
                if (LegacyOpenGlTextureCache.field_b == null ||
                  !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                  LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                }
              } else {
                IntroductionOverlaySupport.field_c = new int[2 * count];
                if (null == FourIntReadRequest.field_q ||
                  !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                  FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                }
                if (LegacyOpenGlTextureCache.field_b == null ||
                  !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                  LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                }
              }
            }
          } else {
            if (ContentTransitionPhase.field_f == null ||
              !(count <= ContentTransitionPhase.field_f.length)) {
              ContentTransitionPhase.field_f = new int[2 * count];
            }
            if (LegacyOpenGlInterleavedStream.field_c == null) {
              LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
              if (SlowBurstParticle.field_z == null ||
                !(count <= SlowBurstParticle.field_z.length)) {
                SlowBurstParticle.field_z = new int[count * 2];
              }
              if (IntroductionOverlaySupport.field_c == null) {
                IntroductionOverlaySupport.field_c = new int[2 * count];
                if (null == FourIntReadRequest.field_q ||
                  !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                  FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                }
                if (LegacyOpenGlTextureCache.field_b == null ||
                  !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                  LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                }
              } else {
                if (count <= IntroductionOverlaySupport.field_c.length) {
                  if (null == FourIntReadRequest.field_q ||
                    !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                    FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                  }
                  if (LegacyOpenGlTextureCache.field_b == null ||
                    !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                    LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                  }
                } else {
                  IntroductionOverlaySupport.field_c = new int[2 * count];
                  if (null == FourIntReadRequest.field_q ||
                    !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                    FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                  }
                  if (LegacyOpenGlTextureCache.field_b == null ||
                    !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                    LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                  }
                }
              }
            } else {
              if (count <= LegacyOpenGlInterleavedStream.field_c.length) {
                if (SlowBurstParticle.field_z == null ||
                  !(count <= SlowBurstParticle.field_z.length)) {
                  SlowBurstParticle.field_z = new int[count * 2];
                }
                if (IntroductionOverlaySupport.field_c == null) {
                  IntroductionOverlaySupport.field_c = new int[2 * count];
                  if (null == FourIntReadRequest.field_q ||
                    !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                    FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                  }
                  if (LegacyOpenGlTextureCache.field_b == null ||
                    !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                    LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                  }
                } else {
                  if (count <= IntroductionOverlaySupport.field_c.length) {
                    if (null == FourIntReadRequest.field_q ||
                      !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                      FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                    }
                    if (LegacyOpenGlTextureCache.field_b == null ||
                      !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                      LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                    }
                  } else {
                    IntroductionOverlaySupport.field_c = new int[2 * count];
                    if (null == FourIntReadRequest.field_q ||
                      !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                      FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                    }
                    if (LegacyOpenGlTextureCache.field_b == null ||
                      !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                      LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                    }
                  }
                }
              } else {
                LegacyOpenGlInterleavedStream.field_c = new int[2 * count];
                if (SlowBurstParticle.field_z == null ||
                  !(count <= SlowBurstParticle.field_z.length)) {
                  SlowBurstParticle.field_z = new int[count * 2];
                }
                if (IntroductionOverlaySupport.field_c == null) {
                  IntroductionOverlaySupport.field_c = new int[2 * count];
                  if (null == FourIntReadRequest.field_q ||
                    !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                    FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                  }
                  if (LegacyOpenGlTextureCache.field_b == null ||
                    !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                    LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                  }
                } else {
                  if (count <= IntroductionOverlaySupport.field_c.length) {
                    if (null == FourIntReadRequest.field_q ||
                      !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                      FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                    }
                    if (LegacyOpenGlTextureCache.field_b == null ||
                      !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                      LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                    }
                  } else {
                    IntroductionOverlaySupport.field_c = new int[2 * count];
                    if (null == FourIntReadRequest.field_q ||
                      !(extraCount + count <= FourIntReadRequest.field_q.length)) {
                      FourIntReadRequest.field_q = new int[2 * (count + extraCount)];
                    }
                    if (LegacyOpenGlTextureCache.field_b == null ||
                      !(LegacyOpenGlTextureCache.field_b.length >= count)) {
                      LegacyOpenGlTextureCache.field_b = new boolean[2 * count];
                    }
                  }
                }
              }
            }
          }
        }
        GameApplet.field_l = initialMaximum;
        NoiseSliceGenerator.field_c = 2147483647;
        HardwareUnlitEffect.field_f = -2147483648;
        GameplaySession.field_k = 2147483647;
        LoginCredentials.field_d = 0;
    }

    final static int pollNameAvailability(LoginFieldValue secondaryIdentifier, int guard, LoginFieldValue identifier) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            AlternateUsernameCredentials.initializeHiscoreRows(-2, -71, 69);
          }
          var4 = (String) null;
          stackIn_3_0 = CachedTextLayout.pollAccountFormRequest(identifier, 0, secondaryIdentifier, 0, false, 72, (String) null);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tn.G(");
          if (secondaryIdentifier == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',');
          if (identifier == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void initializeGraphicsOptionsLayer(byte guard) {
        if (guard >= -87) {
          return;
        }
        HardwareTurbulentWaterNoise.widgetTheme = ToolkitRasterStateCacheEntry.sharedWidgetTheme(false);
        HardwareTextureSprite.field_e = new DialogLayer();
        QuickChatPhraseProvider.showGraphicsOptions(40);
    }

    final LoginCredentialType credentialType(byte guard) {
        if (guard < 80) {
          return (LoginCredentialType) null;
        }
        return AccountPacketReader.ALTERNATE_USERNAME_CREDENTIALS;
    }

    AlternateUsernameCredentials(long nameKey, String secret) {
        super(nameKey, secret);
    }

    static {
    }
}
