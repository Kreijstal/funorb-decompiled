/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlMaterialEffectManager {
    private LegacyOpenGlWaterTextures waterTextures;
    static int[] field_f;
    private LegacyOpenGlMaterialEffect[] effects;
    private int parameter2;
    static int field_i;
    private int activeEffectKey;
    private int parameter1;
    LegacyOpenGlUnderwaterEffect underwaterEffect;
    private OpenGlToolkit toolkit;
    static int[] field_j;

    final static boolean b(int param0, int param1) {
        if (param1 != 15923) {
          return false;
        }
        if (param0 <= 3) {
          return false;
        }
        if (!EnvironmentReflectionGpuMaterialEffect.field_g[param0].field_f) {
          return true;
        }
        return false;
    }

    public static void clearSharedReferences(boolean param0) {
        field_f = null;
        field_j = null;
        if (param0) {
          LegacyOpenGlMaterialEffectManager.b(-82, 83);
        }
    }

    final boolean isEffectSupported(int param0, int param1) {
        if (param0 == 8) {
          return this.effects[param1].isSupported(-90);
        }
        this.setEffect(false, false, 71, -110, 65, -25);
        return this.effects[param1].isSupported(-90);
    }

    final void setEffect(boolean param0, boolean param1, int param2, int param3, int param4, int param5) {
        param0 = param0 & this.toolkit.supportsUnderwaterEffects();
        if (!param0) {
          if (param4 == 4) {
            if (4 == param4) {
              param5 = param2;
            }
            param4 = 2;
            if (param4 != 0 &&
              param1) {
              param4 = param4 | -2147483648;
            }
            if (param3 >= -104) {
              return;
            }
            if (this.activeEffectKey != param4) {
              if (this.activeEffectKey == 0) {
                if (param4 != 0) {
                  this.effects[param4 & 2147483647].enable(param1, 76);
                  this.effects[2147483647 & param4].applyRenderState(true, param1);
                  this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
                }
                this.parameter1 = param2;
                this.activeEffectKey = param4;
                this.parameter2 = param5;
                return;
              }
              this.effects[2147483647 & this.activeEffectKey].disable(5890);
              if (param4 != 0) {
                this.effects[param4 & 2147483647].enable(param1, 76);
                this.effects[2147483647 & param4].applyRenderState(true, param1);
                this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
              }
              this.parameter1 = param2;
              this.activeEffectKey = param4;
              this.parameter2 = param5;
              return;
            }
            if (this.activeEffectKey == 0) {
              return;
            }
            this.effects[2147483647 & this.activeEffectKey].applyRenderState(true, param1);
            if (param2 != this.parameter1) {
              this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
              this.parameter2 = param5;
              this.parameter1 = param2;
              return;
            }
            if (this.parameter2 == param5) {
              return;
            }
            this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
            this.parameter2 = param5;
            this.parameter1 = param2;
            return;
          }
          if (8 == param4) {
            if (4 == param4) {
              param5 = param2;
            }
            param4 = 2;
            if (param4 != 0 &&
              param1) {
              param4 = param4 | -2147483648;
            }
            if (param3 >= -104) {
              return;
            }
            if (this.activeEffectKey != param4) {
              if (this.activeEffectKey == 0) {
                if (param4 != 0) {
                  this.effects[param4 & 2147483647].enable(param1, 76);
                  this.effects[2147483647 & param4].applyRenderState(true, param1);
                  this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
                }
                this.parameter1 = param2;
                this.activeEffectKey = param4;
                this.parameter2 = param5;
                return;
              }
              this.effects[2147483647 & this.activeEffectKey].disable(5890);
              if (param4 != 0) {
                this.effects[param4 & 2147483647].enable(param1, 76);
                this.effects[2147483647 & param4].applyRenderState(true, param1);
                this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
              }
              this.parameter1 = param2;
              this.activeEffectKey = param4;
              this.parameter2 = param5;
              return;
            }
            if (this.activeEffectKey == 0) {
              return;
            }
            this.effects[2147483647 & this.activeEffectKey].applyRenderState(true, param1);
            if (param2 != this.parameter1) {
              this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
              this.parameter2 = param5;
              this.parameter1 = param2;
              return;
            }
            if (this.parameter2 == param5) {
              return;
            }
            this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
            this.parameter2 = param5;
            this.parameter1 = param2;
            return;
          }
          if (param4 != 9) {
            if (param4 != 0 &&
              param1) {
              param4 = param4 | -2147483648;
            }
            if (param3 >= -104) {
              return;
            }
            if (this.activeEffectKey != param4) {
              if (this.activeEffectKey != 0) {
                this.effects[2147483647 & this.activeEffectKey].disable(5890);
              }
              if (param4 != 0) {
                this.effects[param4 & 2147483647].enable(param1, 76);
                this.effects[2147483647 & param4].applyRenderState(true, param1);
                this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
              }
              this.parameter1 = param2;
              this.activeEffectKey = param4;
              this.parameter2 = param5;
              return;
            }
            if (this.activeEffectKey == 0) {
              return;
            }
            this.effects[2147483647 & this.activeEffectKey].applyRenderState(true, param1);
            if (param2 != this.parameter1) {
              this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
              this.parameter2 = param5;
              this.parameter1 = param2;
              return;
            }
            if (this.parameter2 == param5) {
              return;
            }
            this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
            this.parameter2 = param5;
            this.parameter1 = param2;
            return;
          }
          if (4 == param4) {
            param5 = param2;
          }
          param4 = 2;
        }
        if (param4 != 0 &&
          param1) {
          param4 = param4 | -2147483648;
        }
        if (param3 >= -104) {
          return;
        }
        if (this.activeEffectKey != param4) {
          if (this.activeEffectKey != 0) {
            this.effects[2147483647 & this.activeEffectKey].disable(5890);
            if (param4 != 0) {
              this.effects[param4 & 2147483647].enable(param1, 76);
              this.effects[2147483647 & param4].applyRenderState(true, param1);
              this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
            }
            this.parameter1 = param2;
            this.activeEffectKey = param4;
            this.parameter2 = param5;
            return;
          }
          if (param4 != 0) {
            this.effects[param4 & 2147483647].enable(param1, 76);
            this.effects[2147483647 & param4].applyRenderState(true, param1);
            this.effects[2147483647 & param4].setParameters(param2, -25139, param5);
          }
          this.parameter1 = param2;
          this.activeEffectKey = param4;
          this.parameter2 = param5;
          return;
        }
        if (this.activeEffectKey == 0) {
          return;
        }
        this.effects[2147483647 & this.activeEffectKey].applyRenderState(true, param1);
        if (param2 != this.parameter1) {
          this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
          this.parameter2 = param5;
          this.parameter1 = param2;
          return;
        }
        if (this.parameter2 != param5) {
          this.effects[this.activeEffectKey & 2147483647].setParameters(param2, -25139, param5);
          this.parameter2 = param5;
          this.parameter1 = param2;
          return;
        }
    }

    final boolean setTexture(OpenGlTexture param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.activeEffectKey == 0) {
            return false;
          }
          var4_int = -72 % ((param1 + 71) / 53);
          this.effects[2147483647 & this.activeEffectKey].setTexture(param2, (byte) 125, param0);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("fbb.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    LegacyOpenGlMaterialEffectManager(OpenGlToolkit param0) {
        LegacyOpenGlUnderwaterEffect dupTemp$1 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.parameter2 = 0;
        this.parameter1 = 0;
        this.activeEffectKey = 0;
        try {
          this.toolkit = param0;
          this.waterTextures = new LegacyOpenGlWaterTextures(param0);
          this.effects = new LegacyOpenGlMaterialEffect[10];
          this.effects[1] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlSpecularEffect(param0));
          this.effects[2] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlTurbulenceEffect(param0, this.waterTextures));
          this.effects[4] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlWaterFogEffect(param0, this.waterTextures));
          this.effects[5] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlScrollingNoiseEffect(param0, this.waterTextures));
          this.effects[6] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlUnlitEffect(param0));
          this.effects[7] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlEnvironmentReflectionEffect(param0));
          dupTemp$1 = new LegacyOpenGlUnderwaterEffect(param0);
          this.underwaterEffect = dupTemp$1;
          this.effects[3] = (LegacyOpenGlMaterialEffect) ((Object) dupTemp$1);
          this.effects[8] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlEnvironmentMappedWaterEffect(param0, this.waterTextures));
          this.effects[9] = (LegacyOpenGlMaterialEffect) ((Object) new LegacyOpenGlWaveWaterEffect(param0, this.waterTextures));
          if (!this.effects[8].isSupported(-113)) {
            this.effects[8] = this.effects[4];
          }
          if (!this.effects[9].isSupported(-110)) {
            this.effects[9] = this.effects[8];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("fbb.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_j = new int[109];
    }
}
