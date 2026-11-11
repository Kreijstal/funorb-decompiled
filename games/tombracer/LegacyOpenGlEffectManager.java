/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlEffectManager {
    LegacyOpenGlUnderwaterEffect field_h;
    private OpenGlToolkit toolkit;
    private aaa field_d;
    private LegacyOpenGlEffect[] effects;
    private int parameters1;
    private int activeEffect;
    static ToolkitSprite field_a;
    private int parameters0;

    final void selectEffect(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        param2 = param2 & this.toolkit.i(7085);
        if (param0 > 34) {
          boolean decompiledFrameRemainder0 = true;
          if (!param2) {
            if ((param5 != 4 &&
              param5 != 8) &&
              (decompiledFrameRemainder0 = (9 == param5))) {
              if (param5 == 4) {
                param1 = param4;
              }
              param5 = 2;
              if (param5 != 0 &&
                param3) {
                param5 = param5 | -2147483648;
              }
              if (param5 == this.activeEffect) {
                if (0 != this.activeEffect) {
                  this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
                  if (this.parameters0 == param4 &&
                    param1 == this.parameters1) {
                    return;
                  }
                  this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                  this.parameters0 = param4;
                  this.parameters1 = param1;
                }
              } else {
                if (this.activeEffect != 0) {
                  this.effects[this.activeEffect & 2147483647].disable(false);
                }
                if (0 != param5) {
                  this.effects[2147483647 & param5].enable(param3, 123);
                  this.effects[2147483647 & param5].refreshState(param3, 110);
                  this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
                }
                this.activeEffect = param5;
                this.parameters1 = param1;
                this.parameters0 = param4;
              }
              return;
            }
            if (decompiledFrameRemainder0) {
              if (param5 == 4) {
                param1 = param4;
              }
              param5 = 2;
            }
          }
          if (param5 != 0) {
            if (!param3) {
              if (param5 == this.activeEffect) {
                if (0 != this.activeEffect) {
                  this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
                  if (this.parameters0 == param4 &&
                    param1 == this.parameters1) {
                    return;
                  }
                  this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                  this.parameters0 = param4;
                  this.parameters1 = param1;
                }
              } else {
                if (this.activeEffect != 0) {
                  this.effects[this.activeEffect & 2147483647].disable(false);
                }
                if (0 != param5) {
                  this.effects[2147483647 & param5].enable(param3, 123);
                  this.effects[2147483647 & param5].refreshState(param3, 110);
                  this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
                }
                this.activeEffect = param5;
                this.parameters1 = param1;
                this.parameters0 = param4;
              }
              return;
            }
            param5 = param5 | -2147483648;
          }
        } else {
          LegacyOpenGlEffectManager.releaseStatics((byte) -63);
          if (param2) {
            if (param5 != 0) {
              if (!param3) {
                if (param5 == this.activeEffect) {
                  if (0 != this.activeEffect) {
                    this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
                    if (this.parameters0 == param4 &&
                      param1 == this.parameters1) {
                      return;
                    }
                    this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                    this.parameters0 = param4;
                    this.parameters1 = param1;
                  }
                } else {
                  if (this.activeEffect != 0) {
                    this.effects[this.activeEffect & 2147483647].disable(false);
                  }
                  if (0 != param5) {
                    this.effects[2147483647 & param5].enable(param3, 123);
                    this.effects[2147483647 & param5].refreshState(param3, 110);
                    this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
                  }
                  this.activeEffect = param5;
                  this.parameters1 = param1;
                  this.parameters0 = param4;
                }
                return;
              }
              param5 = param5 | -2147483648;
            }
          } else {
            if (param5 != 4 &&
              param5 != 8) {
              if (9 == param5) {
                if (param5 == 4) {
                  param1 = param4;
                }
                param5 = 2;
                if (param5 != 0 &&
                  param3) {
                  param5 = param5 | -2147483648;
                }
                if (param5 == this.activeEffect) {
                  if (0 != this.activeEffect) {
                    this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
                    if (this.parameters0 != param4) {
                      this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                      this.parameters0 = param4;
                      this.parameters1 = param1;
                      return;
                    }
                    if (param1 == this.parameters1) {
                      return;
                    }
                    this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                    this.parameters0 = param4;
                    this.parameters1 = param1;
                    return;
                  }
                } else {
                  if (this.activeEffect != 0) {
                    this.effects[this.activeEffect & 2147483647].disable(false);
                  }
                  if (0 != param5) {
                    this.effects[2147483647 & param5].enable(param3, 123);
                    this.effects[2147483647 & param5].refreshState(param3, 110);
                    this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
                  }
                  this.activeEffect = param5;
                  this.parameters1 = param1;
                  this.parameters0 = param4;
                }
                return;
              }
            } else {
              if (param5 == 4) {
                param1 = param4;
              }
              param5 = 2;
            }
            if (param5 != 0) {
              if (!param3) {
                if (param5 != this.activeEffect) {
                  if (this.activeEffect != 0) {
                    this.effects[this.activeEffect & 2147483647].disable(false);
                  }
                  if (0 != param5) {
                    this.effects[2147483647 & param5].enable(param3, 123);
                    this.effects[2147483647 & param5].refreshState(param3, 110);
                    this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
                  }
                  this.activeEffect = param5;
                  this.parameters1 = param1;
                  this.parameters0 = param4;
                  return;
                }
                if (0 == this.activeEffect) {
                  return;
                }
                this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
                if (this.parameters0 == param4 &&
                  param1 == this.parameters1) {
                  return;
                }
                this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
                this.parameters0 = param4;
                this.parameters1 = param1;
                return;
              }
              param5 = param5 | -2147483648;
            }
          }
        }
        if (param5 != this.activeEffect) {
          if (this.activeEffect != 0) {
            this.effects[this.activeEffect & 2147483647].disable(false);
          }
          if (0 != param5) {
            this.effects[2147483647 & param5].enable(param3, 123);
            this.effects[2147483647 & param5].refreshState(param3, 110);
            this.effects[param5 & 2147483647].setParameters(param4, param1, 126);
          }
          this.activeEffect = param5;
          this.parameters1 = param1;
          this.parameters0 = param4;
          return;
        }
        if (0 == this.activeEffect) {
          return;
        }
        this.effects[2147483647 & this.activeEffect].refreshState(param3, 100);
        if (this.parameters0 == param4 &&
          param1 == this.parameters1) {
          return;
        }
        this.effects[2147483647 & this.activeEffect].setParameters(param4, param1, 127);
        this.parameters0 = param4;
        this.parameters1 = param1;
    }

    final boolean isSupported(int param0, int param1) {
        if (param0 == 2147483647) {
          return this.effects[param1].isSupported(-11921);
        }
        field_a = (ToolkitSprite) null;
        return this.effects[param1].isSupported(-11921);
    }

    final boolean bindTexture(int param0, int param1, LegacyOpenGlTexture param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.activeEffect == 0) {
            return false;
          }
          this.effects[this.activeEffect & 2147483647].bindTexture(param0, 32221, param2);
          if (param1 == 9) {
            return true;
          }
          this.isSupported(57, 53);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("uua.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 33 / ((-82 - param0) / 38);
        field_a = null;
    }

    LegacyOpenGlEffectManager(OpenGlToolkit param0) {
        LegacyOpenGlUnderwaterEffect dupTemp$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.activeEffect = 0;
        this.parameters1 = 0;
        this.parameters0 = 0;
        try {
          this.toolkit = param0;
          this.field_d = new aaa(param0);
          this.effects = new LegacyOpenGlEffect[10];
          this.effects[1] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlSpecularEffect(param0));
          this.effects[2] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlTurbulentTextureEffect(param0, this.field_d));
          this.effects[4] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlRidgedWaterEffect(param0, this.field_d));
          this.effects[5] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlFlowingWaterEffect(param0, this.field_d));
          this.effects[6] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlUnlitEffect(param0));
          this.effects[7] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlReflectionEffect(param0));
          dupTemp$1 = new LegacyOpenGlUnderwaterEffect(param0);
          this.field_h = dupTemp$1;
          this.effects[3] = (LegacyOpenGlEffect) ((Object) dupTemp$1);
          this.effects[8] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlEnvironmentWaterEffect(param0, this.field_d));
          this.effects[9] = (LegacyOpenGlEffect) ((Object) new LegacyOpenGlShoreWaveWaterEffect(param0, this.field_d));
          if (!this.effects[8].isSupported(-11921)) {
            this.effects[8] = this.effects[4];
          }
          if (!this.effects[9].isSupported(-11921)) {
            this.effects[9] = this.effects[8];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("uua.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
    }
}
