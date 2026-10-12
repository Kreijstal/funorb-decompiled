/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitModelPreview {
    static ClientUiComponent field_m;
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

    final void drawAtStoredPosition(byte obfuscationGuard, boolean highlighted) {
        int var4 = 0;
        int var3 = this.screenPosition[0];
        int var4Lifetime1;
        if (obfuscationGuard == -72) {
          var4 = this.screenPosition[1];
          this.drawModel(false, highlighted, var3, var4);
          return;
        }
        this.drawAtStoredPosition((byte) 11, true);
        var4Lifetime1 = this.screenPosition[1];
        this.drawModel(false, highlighted, var3, var4Lifetime1);
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

    private final void initialize(boolean obfuscationGuard, int yaw, int unitType) {
        this.animationPlayer = new AnimationPlayer(1);
        if (obfuscationGuard) {
          this.setUnitType((byte) 125, unitType);
          this.animationIndex = -1;
          this.selectAnimation(-23162, 0);
          TriangleRasterizer.useRasterClip();
          this.screenPosition = new int[2];
          this.yaw = yaw;
          return;
        }
        field_h = (String) null;
        this.setUnitType((byte) 125, unitType);
        this.animationIndex = -1;
        this.selectAnimation(-23162, 0);
        TriangleRasterizer.useRasterClip();
        this.screenPosition = new int[2];
        this.yaw = yaw;
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
          UnitModelPreview.getCurrentRoomPlayer(-107L, 79);
          return ByteStorage.incomingPacket.readNullTerminatedString(1);
        }
        return ByteStorage.incomingPacket.readNullTerminatedString(1);
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

    private final void setBattleScreenPosition(int screenY, int screenXOrTileIndex, byte obfuscationGuard) {
        if (screenY == -1) {
          ro.modelProjectionCamera.projectionTileIndex = screenXOrTileIndex;
          ro.modelProjectionCamera.selectProjectionTile((byte) 36);
          ro.modelProjectionCamera.projectModelAnchor(obfuscationGuard ^ -9470376);
          screenY = ro.modelProjectionCamera.screenPosition[1];
          screenXOrTileIndex = ro.modelProjectionCamera.screenPosition[0];
          screenY += 16;
        }
        screenXOrTileIndex += 32;
        if (obfuscationGuard == -39) {
          this.screenPosition[1] = 7 + screenY;
          this.screenPosition[0] = 7 + screenXOrTileIndex;
          return;
        }
    }

    final boolean advanceBattleModel(int screenY, boolean unusedVisible, int screenXOrTileIndex, int yawOverride, int animationIndex, boolean obfuscationGuard) {
        int var7;
        this.selectAnimation(-23162, animationIndex);
        if (!this.animationAvailable) {
          return true;
        }
        var7 = this.animationPlayer.advance(-95) ? 1 : 0;
        this.installFrameSet(-298276720);
        if (obfuscationGuard) {
          this.advanceBattleModel(85, true, -47, -102, 19, false);
        }
        this.setBattleScreenPosition(screenY, screenXOrTileIndex, (byte) -39);
        if (yawOverride != -1) {
          this.yaw = yawOverride;
        }
        if (this.animationPlayer.frameChanged) {
        }
        return var7 != 0;
    }

    private final void loadSequence(byte obfuscationGuard) {
        this.animationAvailable = true;
        AnimationSequence var2 = pg.selectUnitAnimation(this.animationIndex, 176, false, this.unitType);
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

    final static LobbyPlayer getCurrentRoomPlayer(long accountId, int obfuscationGuard) {
        if (obfuscationGuard >= -68) {
          return (LobbyPlayer) null;
        }
        return (LobbyPlayer) (UnitCycler.currentRoomPlayersById.get((byte) -27, accountId));
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
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(screenX, screenY);
          var18_ref = (ModelMesh) (this.model.a(var5 != 0, false, var6 != 0));
          var20 = var18_ref;
          var18_ref.scaleGeometry(hk.field_Jb[this.unitType], hk.field_Jb[this.unitType], hk.field_Jb[this.unitType]);
          if (highlighted) {
            ContextActionMenu.a(false, var20);
          }
          var20.a(var7, var8, var9, var12, var13, var14, var15);
          return;
        }
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.setProjectionCenter(screenX, screenY);
        ModelMesh var17_ref = (ModelMesh) (this.animationPlayer.applyCurrentFrame(var5 != 0, true, var6 != 0, this.model));
        ModelMesh var19 = var17_ref;
        var17_ref.scaleGeometry(hk.field_Jb[this.unitType], hk.field_Jb[this.unitType], hk.field_Jb[this.unitType]);
        if (highlighted) {
          ContextActionMenu.a(copyVariant, var19);
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
          this.initialize(true, yaw, unitType);
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
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(unitType).append(',').append(yaw).append(')').toString());
        }
    }

    UnitModelPreview(int unitType) {
        this.initialize(true, 1792, unitType);
    }

    private final void installFrameSet(int obfuscationGuard) {
        int var2 = this.animationPlayer.frameId >> 16;
        AnimationFrameSet var3 = we.a(var2, true);
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
