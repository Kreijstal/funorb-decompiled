/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class LegacyOpenGlEffectManager {
    static MenuScreen[] field_g;
    static int field_i;
    private int parameters1;
    private int activeEffect;
    private LegacyOpenGlEffect[] effects;
    static int[] field_l;
    static long field_f;
    private int parameters0;
    static Random field_b;
    private LegacyWaterTextureResources waterTextures;
    private LegacyOpenGlGraphicsToolkit toolkit;
    static AudioOutput field_a;

    final static char normalizeNameCharacter(int guard, char character) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (guard == 241) {
          var2 = character;
          if (var2 == 32) {
            return '_';
          }
          if (160 == var2) {
            return '_';
          }
          if (95 == var2) {
            return '_';
          }
          if (var2 == 45) {
            return '_';
          }
          if (91 == var2) {
            return character;
          }
          if (var2 != 93 &&
            var2 != 35) {
            if (224 != var2 &&
              225 != var2 &&
              226 != var2 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              193 != var2 &&
              194 != var2 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  206 != var2 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    243 != var2 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    210 != var2 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    214 != var2 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      250 != var2) {
                      if (var2 == 251) {
                        return 'u';
                      }
                      if (252 == var2) {
                        return 'u';
                      }
                      if (var2 != 217) {
                        if (var2 == 218) {
                          return 'u';
                        }
                        if (var2 == 219) {
                          return 'u';
                        }
                        if (var2 == 220) {
                          return 'u';
                        }
                        if (231 != var2 &&
                          var2 != 199) {
                          if (255 != var2 &&
                            var2 != 376) {
                            if (var2 == 241) {
                              return 'n';
                            }
                            if (var2 == 209) {
                              return 'n';
                            }
                            if (var2 == 223) {
                              return 'b';
                            }
                            return Character.toLowerCase(character);
                          }
                          return 'y';
                        }
                        return 'c';
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
        field_f = 31L;
        var2Lifetime1 = character;
        if (var2Lifetime1 == 32) {
          return '_';
        }
        if (160 != var2Lifetime1 &&
          95 != var2Lifetime1 &&
          var2Lifetime1 != 45) {
          if (91 != var2Lifetime1 &&
            var2Lifetime1 != 93 &&
            var2Lifetime1 != 35) {
            if (224 != var2Lifetime1 &&
              225 != var2Lifetime1 &&
              226 != var2Lifetime1 &&
              228 != var2Lifetime1 &&
              var2Lifetime1 != 227 &&
              var2Lifetime1 != 192 &&
              193 != var2Lifetime1 &&
              194 != var2Lifetime1 &&
              var2Lifetime1 != 196 &&
              var2Lifetime1 != 195) {
              if (var2Lifetime1 != 232 &&
                var2Lifetime1 != 233 &&
                var2Lifetime1 != 234) {
                if (var2Lifetime1 == 235) {
                  return 'e';
                }
                if (var2Lifetime1 != 200 &&
                  var2Lifetime1 != 201) {
                  if (var2Lifetime1 == 202) {
                    return 'e';
                  }
                  if (203 != var2Lifetime1) {
                    if (var2Lifetime1 != 237) {
                      if (var2Lifetime1 == 238) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 239) {
                        return 'i';
                      }
                      if (var2Lifetime1 == 205) {
                        return 'i';
                      }
                      if (206 != var2Lifetime1) {
                        if (var2Lifetime1 == 207) {
                          return 'i';
                        }
                        if (var2Lifetime1 == 242) {
                          return 'o';
                        }
                        if (243 != var2Lifetime1 &&
                          var2Lifetime1 != 244 &&
                          var2Lifetime1 != 246 &&
                          var2Lifetime1 != 245) {
                          if (210 == var2Lifetime1) {
                            return 'o';
                          }
                          if (var2Lifetime1 != 211) {
                            if (var2Lifetime1 == 212) {
                              return 'o';
                            }
                            if (214 != var2Lifetime1) {
                              if (var2Lifetime1 == 213) {
                                return 'o';
                              }
                              if (var2Lifetime1 == 249) {
                                return 'u';
                              }
                              if (250 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 251) {
                                return 'u';
                              }
                              if (252 == var2Lifetime1) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 217) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 218) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 219) {
                                return 'u';
                              }
                              if (var2Lifetime1 == 220) {
                                return 'u';
                              }
                              if (231 != var2Lifetime1 &&
                                var2Lifetime1 != 199) {
                                if (255 != var2Lifetime1 &&
                                  var2Lifetime1 != 376) {
                                  if (var2Lifetime1 == 241) {
                                    return 'n';
                                  }
                                  if (var2Lifetime1 == 209) {
                                    return 'n';
                                  }
                                  if (var2Lifetime1 == 223) {
                                    return 'b';
                                  }
                                  return Character.toLowerCase(character);
                                }
                                return 'y';
                              }
                              return 'c';
                            }
                          }
                        }
                        return 'o';
                      }
                    }
                    return 'i';
                  }
                }
              }
              return 'e';
            }
            return 'a';
          }
          return character;
        }
        return '_';
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 255) {
          return;
        }
        field_g = null;
        field_l = null;
    }

    final void selectEffect(boolean allowWaterEffects, int parameters1, int guard, int parameters0, boolean lighting, int effectId) {
        allowWaterEffects = allowWaterEffects & this.toolkit.supportsUnderwaterEffect(123);
        if (!allowWaterEffects) {
          if (4 == effectId) {
            if (effectId == 4) {
              parameters1 = parameters0;
            }
            effectId = 2;
            if (effectId != 0 &&
              lighting) {
              effectId = effectId | -2147483648;
            }
            if (this.activeEffect != effectId) {
              if (this.activeEffect != 0) {
                this.effects[this.activeEffect & 2147483647].disable(-127);
              }
              if (effectId != 0) {
                this.effects[2147483647 & effectId].enable((byte) 88, lighting);
                this.effects[effectId & 2147483647].refreshState(-61, lighting);
                this.effects[2147483647 & effectId].setParameters((byte) 68, parameters0, parameters1);
              }
              this.parameters0 = parameters0;
              this.activeEffect = effectId;
              this.parameters1 = parameters1;
            } else {
              if (this.activeEffect == 0) {
                if (guard > 123) {
                  return;
                }
                this.waterTextures = (LegacyWaterTextureResources) null;
                return;
              }
              this.effects[2147483647 & this.activeEffect].refreshState(-65, lighting);
              if (parameters0 != this.parameters0) {
                this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                this.parameters1 = parameters1;
                this.parameters0 = parameters0;
              } else {
                if (this.parameters1 != parameters1) {
                  this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                  this.parameters1 = parameters1;
                  this.parameters0 = parameters0;
                }
              }
            }
            if (guard <= 123) {
              this.waterTextures = (LegacyWaterTextureResources) null;
            }
            return;
          }
          if (8 == effectId) {
            if (effectId == 4) {
              parameters1 = parameters0;
            }
            effectId = 2;
            if (effectId != 0 &&
              lighting) {
              effectId = effectId | -2147483648;
            }
            if (this.activeEffect != effectId) {
              if (this.activeEffect != 0) {
                this.effects[this.activeEffect & 2147483647].disable(-127);
              }
              if (effectId != 0) {
                this.effects[2147483647 & effectId].enable((byte) 88, lighting);
                this.effects[effectId & 2147483647].refreshState(-61, lighting);
                this.effects[2147483647 & effectId].setParameters((byte) 68, parameters0, parameters1);
              }
              this.parameters0 = parameters0;
              this.activeEffect = effectId;
              this.parameters1 = parameters1;
            } else {
              if (this.activeEffect == 0) {
                if (guard > 123) {
                  return;
                }
                this.waterTextures = (LegacyWaterTextureResources) null;
                return;
              }
              this.effects[2147483647 & this.activeEffect].refreshState(-65, lighting);
              if (parameters0 != this.parameters0) {
                this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                this.parameters1 = parameters1;
                this.parameters0 = parameters0;
              } else {
                if (this.parameters1 != parameters1) {
                  this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                  this.parameters1 = parameters1;
                  this.parameters0 = parameters0;
                }
              }
            }
            if (guard <= 123) {
              this.waterTextures = (LegacyWaterTextureResources) null;
            }
            return;
          }
          if (9 != effectId) {
            if (effectId != 0 &&
              lighting) {
              effectId = effectId | -2147483648;
            }
            if (this.activeEffect == effectId) {
              if (this.activeEffect != 0) {
                this.effects[2147483647 & this.activeEffect].refreshState(-65, lighting);
                if (parameters0 != this.parameters0) {
                  this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                  this.parameters1 = parameters1;
                  this.parameters0 = parameters0;
                } else {
                  if (this.parameters1 != parameters1) {
                    this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                    this.parameters1 = parameters1;
                    this.parameters0 = parameters0;
                    if (guard <= 123) {
                      this.waterTextures = (LegacyWaterTextureResources) null;
                    }
                    return;
                  }
                }
              }
            } else {
              if (this.activeEffect != 0) {
                this.effects[this.activeEffect & 2147483647].disable(-127);
              }
              if (effectId != 0) {
                this.effects[2147483647 & effectId].enable((byte) 88, lighting);
                this.effects[effectId & 2147483647].refreshState(-61, lighting);
                this.effects[2147483647 & effectId].setParameters((byte) 68, parameters0, parameters1);
              }
              this.parameters0 = parameters0;
              this.activeEffect = effectId;
              this.parameters1 = parameters1;
            }
            if (guard > 123) {
              return;
            }
            this.waterTextures = (LegacyWaterTextureResources) null;
            return;
          }
          if (effectId == 4) {
            parameters1 = parameters0;
          }
          effectId = 2;
        }
        if (effectId != 0 &&
          lighting) {
          effectId = effectId | -2147483648;
        }
        if (this.activeEffect != effectId) {
          if (this.activeEffect != 0) {
            this.effects[this.activeEffect & 2147483647].disable(-127);
          }
          if (effectId != 0) {
            this.effects[2147483647 & effectId].enable((byte) 88, lighting);
            this.effects[effectId & 2147483647].refreshState(-61, lighting);
            this.effects[2147483647 & effectId].setParameters((byte) 68, parameters0, parameters1);
          }
          this.parameters0 = parameters0;
          this.activeEffect = effectId;
          this.parameters1 = parameters1;
        } else {
          if (this.activeEffect != 0) {
            this.effects[2147483647 & this.activeEffect].refreshState(-65, lighting);
            if (parameters0 != this.parameters0) {
              this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
              this.parameters1 = parameters1;
              this.parameters0 = parameters0;
            } else {
              if (this.parameters1 != parameters1) {
                this.effects[2147483647 & this.activeEffect].setParameters((byte) 87, parameters0, parameters1);
                this.parameters1 = parameters1;
                this.parameters0 = parameters0;
              }
            }
          }
        }
        if (guard > 123) {
          return;
        }
        this.waterTextures = (LegacyWaterTextureResources) null;
    }

    final boolean bindTexture(int combineMode, byte guard, LegacyOpenGlTexture texture) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.activeEffect == 0) {
            return false;
          }
          this.effects[2147483647 & this.activeEffect].bindTexture((byte) 35, combineMode, texture);
          var4_int = -112 % ((-12 - guard) / 57);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("iv.A(").append(combineMode).append(',').append(guard).append(',');
          if (texture == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final boolean isSupported(int effectId, byte guard) {
        if (guard == 71) {
          return this.effects[effectId].isSupported((byte) -65);
        }
        this.parameters1 = -91;
        return this.effects[effectId].isSupported((byte) -65);
    }

    LegacyOpenGlEffectManager(LegacyOpenGlGraphicsToolkit owner) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.parameters1 = 0;
        this.activeEffect = 0;
        this.parameters0 = 0;
        try {
          this.toolkit = owner;
          this.waterTextures = new LegacyWaterTextureResources(owner);
          this.effects = new LegacyOpenGlEffect[10];
          this.effects[1] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlSpecularEffect(owner));
          this.effects[2] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlTurbulentTextureEffect(owner, this.waterTextures));
          this.effects[4] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlRidgedWaterEffect(owner, this.waterTextures));
          this.effects[5] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlFlowingWaterEffect(owner, this.waterTextures));
          this.effects[6] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlUnlitEffect(owner));
          this.effects[7] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlReflectionEffect(owner));
          this.effects[3] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlUnderwaterEffect(owner));
          this.effects[8] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlEnvironmentWaterEffect(owner, this.waterTextures));
          this.effects[9] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlShoreWaveWaterEffect(owner, this.waterTextures));
          if (!this.effects[8].isSupported((byte) -126)) {
            this.effects[8] = this.effects[4];
          }
          if (!this.effects[9].isSupported((byte) -82)) {
            this.effects[9] = this.effects[8];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("iv.<init>(");
          if (owner == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_i = 1;
        field_g = new MenuScreen[13];
        field_b = new Random(2L);
    }
}
