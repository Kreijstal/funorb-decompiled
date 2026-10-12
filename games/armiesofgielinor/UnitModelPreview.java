/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitModelPreview {
    static je field_m;
    private ModelMesh model;
    private int animationIndex;
    static RgbSprite field_b;
    private int yaw;
    int[] screenPosition;
    static RgbSprite[] field_d;
    private int unitType;
    static String field_h;
    static int field_i;
    private AnimationPlayer animationPlayer;
    private boolean projectionVariant;
    private boolean animationAvailable;

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        int var3 = this.screenPosition[0];
        int var4Lifetime1;
        if (param0 == -72) {
          var4 = this.screenPosition[1];
          this.drawModel(false, param1, var3, var4);
          return;
        }
        this.a((byte) 11, true);
        var4Lifetime1 = this.screenPosition[1];
        this.drawModel(false, param1, var3, var4Lifetime1);
    }

    public static void b(int param0) {
        field_h = null;
        field_d = null;
        field_b = null;
        if (param0 != -298276720) {
          UnitModelPreview.b((byte) -86);
          field_m = null;
          return;
        }
        field_m = null;
    }

    private final void a(boolean param0, int param1, int param2) {
        this.animationPlayer = new AnimationPlayer(1);
        if (param0) {
          this.setUnitType((byte) 125, param2);
          this.animationIndex = -1;
          this.selectAnimation(-23162, 0);
          tm.a();
          this.screenPosition = new int[2];
          this.yaw = param1;
          return;
        }
        field_h = (String) null;
        this.setUnitType((byte) 125, param2);
        this.animationIndex = -1;
        this.selectAnimation(-23162, 0);
        tm.a();
        this.screenPosition = new int[2];
        this.yaw = param1;
    }

    final void setUnitType(byte obfuscationGuard, int unitType) {
        this.unitType = unitType;
        if (this.unitType < 0) {
          this.unitType = 0;
          if (obfuscationGuard >= 42) {
            this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
            this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
            return;
          }
          this.setScreenPosition(54, 25, (byte) -41);
          this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
          this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
          return;
        }
        if (ActionRequest.unitModels.length <= this.unitType) {
          this.unitType = 0;
          if (obfuscationGuard >= 42) {
            this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
            this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
            return;
          }
          this.setScreenPosition(54, 25, (byte) -41);
          this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
          this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
          return;
        }
        if (ActionRequest.unitModels[this.unitType] == null) {
          this.unitType = 0;
          if (obfuscationGuard >= 42) {
            this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
            this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
            return;
          }
          this.setScreenPosition(54, 25, (byte) -41);
          this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
          this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
          return;
        }
        if (obfuscationGuard >= 42) {
          this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
          this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
          return;
        }
        this.setScreenPosition(54, 25, (byte) -41);
        this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][0]);
        this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
    }

    final void selectAnimationAndAdvance(int animationIndex, byte obfuscationGuard) {
        if (obfuscationGuard == -50) {
          this.selectAnimation(-23162, animationIndex);
          if (this.animationPlayer != null) {
            this.animationPlayer.advance(-115);
          }
          this.installFrameSet(-298276720);
          return;
        }
        field_d = (RgbSprite[]) null;
        this.selectAnimation(-23162, animationIndex);
        if (this.animationPlayer != null) {
          this.animationPlayer.advance(-115);
        }
        this.installFrameSet(-298276720);
    }

    final static String b(byte param0) {
        if (param0 < 46) {
          UnitModelPreview.a(-107L, 79);
          return ByteStorage.field_e.g(1);
        }
        return ByteStorage.field_e.g(1);
    }

    final void setYaw(boolean obfuscationGuard, int yaw) {
        if (yaw > -1) {
          if (2048 <= yaw) {
            if (obfuscationGuard) {
              field_d = (RgbSprite[]) null;
              return;
            }
            return;
          }
          this.yaw = yaw;
        }
        if (!obfuscationGuard) {
          return;
        }
        field_d = (RgbSprite[]) null;
    }

    private final void b(int param0, int param1, byte param2) {
        if (param0 == -1) {
          ro.field_ob.field_b = param1;
          ro.field_ob.b((byte) 36);
          ro.field_ob.c(param2 ^ -9470376);
          param0 = ro.field_ob.field_e[1];
          param1 = ro.field_ob.field_e[0];
          param0 += 16;
        }
        param1 += 32;
        if (param2 == -39) {
          this.screenPosition[1] = 7 + param0;
          this.screenPosition[0] = 7 + param1;
          return;
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7;
        this.selectAnimation(-23162, param4);
        if (!this.animationAvailable) {
          return true;
        }
        var7 = this.animationPlayer.advance(-95) ? 1 : 0;
        this.installFrameSet(-298276720);
        if (param5) {
          this.a(85, true, -47, -102, 19, false);
        }
        this.b(param0, param2, (byte) -39);
        if (param3 != -1) {
          this.yaw = param3;
        }
        if (this.animationPlayer.frameChanged) {
        }
        return var7 != 0;
    }

    private final void loadSequence(byte obfuscationGuard) {
        this.animationAvailable = true;
        AnimationSequence var2 = pg.a(this.animationIndex, 176, false, this.unitType);
        if (var2 == null) {
          this.animationAvailable = false;
          return;
        }
        if (var2 == null) {
          this.animationAvailable = false;
          return;
        }
        this.animationPlayer.selectSequence(-1, var2);
        this.installFrameSet(-298276720);
        if (obfuscationGuard == 72) {
          return;
        }
    }

    final static of a(long param0, int param1) {
        if (param1 >= -68) {
          return (of) null;
        }
        return (of) (eu.field_e.a((byte) -27, param0));
    }

    final void selectAnimation(int obfuscationGuard, int animationIndex) {
        int var3;
        var3 = 0;
        if (this.animationIndex != animationIndex) {
          if (animationIndex == -1) {
            if (this.animationIndex == -1) {
              var3 = 1;
              this.animationIndex = 0;
              if (var3 == 0) {
                if (obfuscationGuard != -23162) {
                  this.animationAvailable = true;
                }
                return;
              }
              this.loadSequence((byte) 72);
              if (obfuscationGuard == -23162) {
                return;
              }
              this.animationAvailable = true;
              return;
            }
            if (0 > this.animationIndex) {
              var3 = 1;
              this.animationIndex = 0;
              if (var3 != 0) {
                this.loadSequence((byte) 72);
              }
            } else {
              if (9 <= this.animationIndex) {
                var3 = 1;
                this.animationIndex = 0;
                if (var3 != 0) {
                  this.loadSequence((byte) 72);
                }
              } else {
                if (var3 == 0) {
                  if (obfuscationGuard == -23162) {
                    return;
                  }
                  this.animationAvailable = true;
                  return;
                }
                this.loadSequence((byte) 72);
              }
            }
            if (obfuscationGuard != -23162) {
              this.animationAvailable = true;
            }
            return;
          }
          if (animationIndex < 0) {
            if (this.animationIndex == -1) {
              var3 = 1;
              this.animationIndex = 0;
              if (var3 != 0) {
                this.loadSequence((byte) 72);
              }
            } else {
              if (0 > this.animationIndex) {
                var3 = 1;
                this.animationIndex = 0;
                if (var3 != 0) {
                  this.loadSequence((byte) 72);
                }
              } else {
                if (9 <= this.animationIndex) {
                  var3 = 1;
                  this.animationIndex = 0;
                  if (var3 != 0) {
                    this.loadSequence((byte) 72);
                  }
                } else {
                  if (var3 == 0) {
                    if (obfuscationGuard == -23162) {
                      return;
                    }
                    this.animationAvailable = true;
                    return;
                  }
                  this.loadSequence((byte) 72);
                }
              }
            }
            if (obfuscationGuard != -23162) {
              this.animationAvailable = true;
            }
            return;
          }
          if (animationIndex >= 9) {
            if (this.animationIndex != -1 &&
              0 <= this.animationIndex &&
              9 > this.animationIndex) {
              if (var3 != 0) {
                this.loadSequence((byte) 72);
              }
              if (obfuscationGuard == -23162) {
                return;
              }
              this.animationAvailable = true;
              return;
            }
            var3 = 1;
            this.animationIndex = 0;
            if (var3 == 0) {
              if (obfuscationGuard == -23162) {
                return;
              }
              this.animationAvailable = true;
              return;
            }
            this.loadSequence((byte) 72);
            if (obfuscationGuard != -23162) {
              this.animationAvailable = true;
            }
            return;
          }
          this.animationIndex = animationIndex;
          var3 = 1;
        }
        if (this.animationIndex == -1) {
          var3 = 1;
          this.animationIndex = 0;
        } else {
          if (0 > this.animationIndex) {
            var3 = 1;
            this.animationIndex = 0;
          } else {
            if (9 <= this.animationIndex) {
              var3 = 1;
              this.animationIndex = 0;
            }
          }
        }
        if (var3 != 0) {
          this.loadSequence((byte) 72);
        }
        if (obfuscationGuard == -23162) {
          return;
        }
        this.animationAvailable = true;
    }

    private final void drawModel(boolean copyVariant, boolean highlighted, int screenX, int screenY) {
        ModelMesh var18_ref = null;
        ModelMesh var20 = null;
        Object var17 = null;
        Object var18 = null;
        int var5 = copyVariant ? 1 : 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 2047 & -this.yaw + 2048;
        int var9 = 1024;
        int var10 = 2048;
        int var11 = 12;
        int var12 = var10 - var10 / var11;
        int var13 = 0;
        int var14 = this.projectionVariant & (!highlighted ? true : false) ? 900 : 800;
        int var15 = -1400;
        if (!this.animationAvailable) {
          tm.a();
          tm.c(screenX, screenY);
          var18_ref = (ModelMesh) (this.model.a(var5 != 0, false, var6 != 0));
          var20 = var18_ref;
          var18_ref.b(hk.field_Jb[this.unitType], hk.field_Jb[this.unitType], hk.field_Jb[this.unitType]);
          if (highlighted) {
            np.a(false, var20);
          }
          var20.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
        tm.a();
        tm.c(screenX, screenY);
        ModelMesh var17_ref = (ModelMesh) (this.animationPlayer.applyCurrentFrame(var5 != 0, true, var6 != 0, this.model));
        ModelMesh var19 = var17_ref;
        var17_ref.b(hk.field_Jb[this.unitType], hk.field_Jb[this.unitType], hk.field_Jb[this.unitType]);
        if (highlighted) {
          np.a(copyVariant, var19);
        } else {
          var19.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
        var19.a(var7, var8, var9, var12, var13, var14, var15);
    }

    UnitModelPreview(int[] unusedColors, int unitType, int yaw) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(true, yaw, unitType);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("hr.<init>(");
          if (unusedColors == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(unitType).append(',').append(yaw).append(')').toString());
        }
    }

    UnitModelPreview(int unitType) {
        this.a(true, 1792, unitType);
    }

    private final void installFrameSet(int obfuscationGuard) {
        int var2 = this.animationPlayer.frameId >> 16;
        wp var3 = we.a(var2, true);
        if (obfuscationGuard == -298276720) {
          io.a(var3, (byte) -34);
          return;
        }
        this.model = (ModelMesh) null;
        io.a(var3, (byte) -34);
    }

    final void setScreenPosition(int screenX, int screenY, byte obfuscationGuard) {
        this.screenPosition[0] = screenX;
        int var4 = -95 % ((obfuscationGuard - 34) / 34);
        this.screenPosition[1] = screenY;
    }

    static {
        field_h = "Become a member to get this expansion and...";
        field_i = 0;
    }
}
