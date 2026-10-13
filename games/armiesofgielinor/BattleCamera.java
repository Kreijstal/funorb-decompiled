/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattleCamera {
    private int[] velocity;
    private int[] viewportOriginGrid;
    private EventPresenter focusedPresenter;
    int[] transformedPosition;
    private boolean eventFocusActive;
    private int focusWorldY;
    int projectionTileIndex;
    private int[] previousPointer;
    private int mapHeight;
    int[] targetPosition;
    int[] currentPosition;
    int[] screenPosition;
    int[] overlayValues;
    private int[] viewportCenterGrid;
    static String field_f;
    private int focusWorldX;
    int[] gridPosition;
    private int mapWidth;

    private final boolean advanceTowardTarget(byte obfuscationGuard, int maximumSpeed) {
        int targetX;
        int targetY;
        int deltaX;
        int deltaY;
        int speedLimit;
        int acceleration;
        boolean stackIn_8_0 = false;
        this.clampWorldPosition(-100, this.targetPosition);
        targetX = this.targetPosition[0];
        targetY = this.targetPosition[1];
        deltaX = -this.currentPosition[0] + targetX;
        deltaY = -this.currentPosition[1] + targetY;
        speedLimit = 16;
        if (maximumSpeed > -1) {
          speedLimit = maximumSpeed;
        }
        acceleration = 2;
        this.velocity[0] = this.adjustAxisVelocity(this.velocity[0], 6198, deltaX, acceleration, speedLimit);
        this.velocity[1] = this.adjustAxisVelocity(this.velocity[1], 6198, deltaY, acceleration, speedLimit);
        if (obfuscationGuard >= -118) {
          this.projectGridToTarget(-83);
        }
        this.currentPosition[1] = this.currentPosition[1] + this.velocity[1];
        this.currentPosition[0] = this.currentPosition[0] + this.velocity[0];
        this.clampWorldPosition(-78, this.currentPosition);
        this.updateViewportCenterGrid(false);
        this.updateViewportOriginGrid(-1);
        stackIn_8_0 = (0 == this.velocity[0]) && (0 == this.velocity[1]);
        return stackIn_8_0;
    }

    private final int adjustAxisVelocity(int velocity, int obfuscationGuard, int distance, int acceleration, int maximumSpeed) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int adjustedVelocity;
        int velocityDirection;
        int targetDirection;
        int reversing;
        int atSpeedLimit;
        int braking;
        int canAccelerate;
        int belowSpeedLimit;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        adjustedVelocity = velocity;
        if (distance == 0) {
          return 0;
        }
        if (obfuscationGuard != 6198) {
          return -40;
        }
        if (velocity == distance) {
          return velocity;
        }
        stackIn_11_0 = (distance < 0) ? -1 : 1;
        targetDirection = stackIn_11_0;
        distance = distance * targetDirection;
        if (velocity == 0) {
          velocityDirection = targetDirection;
        } else {
          stackIn_15_0 = (0 > velocity) ? -1 : 1;
          velocityDirection = stackIn_15_0;
          velocity = velocityDirection * velocity;
        }
        if (distance < velocity) {
          return targetDirection * distance;
        }
        stackIn_23_0 = (velocityDirection == targetDirection) ? 0 : 1;
        reversing = stackIn_23_0;
        stackIn_26_0 = (maximumSpeed > velocity) ? 0 : 1;
        atSpeedLimit = stackIn_26_0;
        braking = this.shouldBrake((byte) -70, velocity, distance) ? 1 : 0;
        if (acceleration <= maximumSpeed - velocity) {
          stackIn_32_0 = (Math.abs(distance) > acceleration + velocity) ? 1 : 0;
        } else {
          stackIn_32_0 = 0;
        }
        canAccelerate = stackIn_32_0;
        stackIn_35_0 = (maximumSpeed <= velocity) ? 0 : 1;
        regionExit1: {
          belowSpeedLimit = stackIn_35_0;
          if (reversing != 0) {
            adjustedVelocity = velocity >> 3;
          } else {
            if (atSpeedLimit == 0 &&
              braking == 0) {
              if (canAccelerate != 0) {
                adjustedVelocity = velocity + acceleration;
              } else {
                if (belowSpeedLimit != 0) {
                  adjustedVelocity = velocity + 1;
                  break regionExit1;
                }
              }
              break regionExit1;
            }
            adjustedVelocity = velocity * 7 >> 3;
          }
        }
        adjustedVelocity = adjustedVelocity * velocityDirection;
        return adjustedVelocity;
    }

    private final boolean dragCamera(boolean obfuscationGuard, boolean dragging, int pointerX, int pointerY) {
        if (!dragging ||
          pointerX < 0 ||
          0 > pointerY) {
          this.previousPointer[0] = pointerX;
          this.previousPointer[1] = pointerY;
          return false;
        }
        this.currentPosition[0] = this.currentPosition[0] - (pointerX - this.previousPointer[0]);
        this.currentPosition[1] = this.currentPosition[1] - (-this.previousPointer[1] + pointerY);
        this.previousPointer[0] = pointerX;
        this.previousPointer[1] = pointerY;
        this.clampWorldPosition(-85, this.currentPosition);
        this.updateViewportCenterGrid(!obfuscationGuard ? true : false);
        this.updateViewportOriginGrid(-1);
        if (!obfuscationGuard) {
          this.setFocusTile((byte) 70, 24);
        }
        return true;
    }

    private final boolean shouldBrake(byte obfuscationGuard, int speed, int distance) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int remainingSpeed = speed;
        int stoppingDistance = 0;
        while (remainingSpeed > 0) {
          stoppingDistance = stoppingDistance + remainingSpeed;
          remainingSpeed = 7 * remainingSpeed >> 3;
        }
        if (obfuscationGuard != -70) {
          return false;
        }
        if (distance - stoppingDistance <= 0) {
          return true;
        }
        return false;
    }

    final void setWorldPosition(int worldX, int worldY, byte obfuscationGuard) {
        this.currentPosition[1] = worldY;
        this.currentPosition[0] = worldX;
        this.clampWorldPosition(-93, this.currentPosition);
        this.updateViewportCenterGrid(false);
        if (obfuscationGuard <= 54) {
          this.mapHeight = -31;
        }
        this.updateViewportOriginGrid(-1);
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0;
        if (-1 < param2 &&
          param2 < this.mapWidth &&
          param0 > -1 &&
          this.mapWidth > param0) {
          var4 = var4 + this.overlayValues[param2 + param0 * this.mapWidth];
        } else {
          var4 += 255;
        }
        if (-1 < param2 + 1 &&
          this.mapWidth > param2 + 1 &&
          param0 > -1 &&
          param0 < this.mapWidth) {
          var4 = var4 + this.overlayValues[this.mapWidth * param0 + 1 + param2];
        } else {
          var4 += 255;
        }
        if (param2 + 1 > -1 &&
          this.mapWidth > 1 + param2 &&
          param0 + 1 > -1 &&
          param0 + 1 < this.mapWidth) {
          var4 = var4 + this.overlayValues[(1 + param0) * this.mapWidth + (param2 + 1)];
        } else {
          var4 += 255;
        }
        if (param1 != -4510) {
          BattleCamera.d((byte) -11);
        }
        if (param2 > -1 &&
          param2 < this.mapWidth &&
          -1 < param0 + 1 &&
          this.mapWidth > 1 + param0) {
          var4 = var4 + this.overlayValues[this.mapWidth * (1 + param0) + param2];
        } else {
          var4 += 255;
        }
        return var4 >> 2;
    }

    final void projectModelAnchor(int obfuscationGuard) {
        this.projectGridToTarget(-41);
        this.screenPosition[0] = -this.currentPosition[0] + (this.targetPosition[0] + (so.field_b.field_a >> 1));
        if (obfuscationGuard != 9470337) {
          this.eventFocusActive = false;
        }
        this.screenPosition[1] = -this.currentPosition[1] + (this.targetPosition[1] + (so.field_b.field_g >> 1) - 20);
    }

    final void refreshViewportGrid(int obfuscationGuard) {
        if (obfuscationGuard > -117) {
          return;
        }
        this.updateViewportCenterGrid(false);
        this.updateViewportOriginGrid(-1);
    }

    private final void storeGridFocus(byte obfuscationGuard) {
        this.projectGridToTarget(-115);
        if (obfuscationGuard != -28) {
          field_f = (String) null;
        }
        this.focusWorldX = this.targetPosition[0];
        this.focusWorldY = this.targetPosition[1];
        this.updateViewportCenterGrid(false);
        this.updateViewportOriginGrid(obfuscationGuard + 27);
    }

    private final void clampWorldPosition(int obfuscationGuard, int[] worldPosition) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = 40 * this.mapWidth >> 1;
          if (obfuscationGuard >= -76) {
            this.focusedPresenter = (EventPresenter) null;
          }
          var4 = worldPosition[0] - (var3_int << 1) >> 1;
          var5 = worldPosition[1] - var3_int;
          if (Math.abs(var4) + Math.abs(var5) > var3_int) {
            var6 = -var3_int + (Math.abs(var4) + Math.abs(var5)) >> 1;
            if (0 >= var4) {
              worldPosition[0] = worldPosition[0] + (var6 << 1);
            } else {
              worldPosition[0] = worldPosition[0] - (var6 << 1);
            }
            if (var5 > 0) {
              worldPosition[1] = worldPosition[1] - var6;
            } else {
              worldPosition[1] = worldPosition[1] + var6;
            }
          }
          var5Lifetime1 = worldPosition[1] - var3_int;
          var4Lifetime1 = -(var3_int << 1) + worldPosition[0] >> 1;
          var3_int -= 100;
          if (var3_int < var4Lifetime1) {
            worldPosition[0] = worldPosition[0] - (-var3_int + var4Lifetime1 << 1);
          } else {
            if (var4Lifetime1 < -var3_int) {
              worldPosition[0] = worldPosition[0] - (var3_int + var4Lifetime1 << 1);
            }
          }
          if (var5Lifetime1 > var3_int) {
            worldPosition[1] = worldPosition[1] - (var5Lifetime1 - var3_int);
          } else {
            if (-var3_int > var5Lifetime1) {
              worldPosition[1] = worldPosition[1] - (var3_int + var5Lifetime1);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("v.NA(").append(obfuscationGuard).append(',');
          if (worldPosition == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int stackIn_19_0;
        int stackIn_19_1;
        int stackIn_19_2;
        int stackIn_19_3;
        int stackIn_19_4;
        int stackIn_19_5;
        boolean stackIn_20_6;
        int stackIn_29_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 != 1745035905) {
          return;
        }
        var3 = this.viewportOriginGrid[0];
        var4 = this.viewportOriginGrid[1];
        var4 -= 3;
        this.gridPosition[0] = var3;
        this.gridPosition[1] = var4;
        this.projectGridToTarget(param1 ^ -1745035990);
        this.projectTargetToScreen(0);
        var5 = this.screenPosition[0] + 40;
        var6 = this.screenPosition[1] - 20;
        var7 = var5;
        var8 = var6;
        var9 = var3;
        var10 = var4;
        var11 = so.field_b.field_a;
        var12 = so.field_b.field_g;
        SoftwareRaster.setClip(0, 0, var11, var12);
        var13 = 0;
        while (var8 < 256 + var12 + 40) {
          while (80 + var11 > var7) {
            if (var9 >= -1 &&
              var9 <= this.mapWidth &&
              var10 >= -1 &&
              this.mapHeight >= var10) {
              stackIn_19_0 = var10;
              stackIn_19_1 = var9;
              stackIn_19_2 = param0;
              stackIn_19_3 = var8;
              stackIn_19_4 = 99;
              stackIn_19_5 = var7;
              stackIn_20_6 = !(var8 <= var12 + 40);
              RasterState.a(stackIn_19_0, stackIn_19_1, stackIn_19_2, stackIn_19_3, stackIn_19_4, stackIn_19_5, stackIn_20_6);
            }
            var7 += 80;
            var10++;
            var9++;
          }
          var8 += 20;
          if (var13 != 0) {
            var3--;
            var7 = -40 + var5;
          }
          if (var13 == 0) {
            var7 = var5;
            var4++;
          }
          stackIn_29_0 = (var13 != 0) ? 0 : 1;
          var13 = stackIn_29_0;
          var9 = var3;
          var10 = var4;
        }
        if (param0 == 0 &&
          EquipmentBattleTutorial.field_B &&
          cu.field_a) {
          this.a(-12608);
        }
        return;
    }

    private final void screenToTarget(int obfuscationGuard) {
        boolean discarded$0 = false;
        if (obfuscationGuard < 88) {
          discarded$0 = this.dragCamera(false, true, 4, 95);
        }
        int var3 = this.screenPosition[1];
        int var2 = this.screenPosition[0];
        var3 = var3 - (so.field_b.field_g >> 1);
        var2 = var2 - (so.field_b.field_a >> 1);
        int var4 = var2 + this.currentPosition[0];
        int var5 = var3 + this.currentPosition[1];
        this.targetPosition[1] = var5;
        this.targetPosition[0] = var4;
    }

    final void b(int param0, int param1, byte param2) {
        int var15 = 0;
        int var17 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var16;
        int var18;
        int var19;
        int var20;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.screenPosition[0] = 0;
        this.screenPosition[1] = 0;
        this.screenToGrid(false);
        this.gridPosition[1] = this.gridPosition[1] - 2;
        var4 = this.gridPosition[0];
        var5 = this.gridPosition[1];
        this.projectGridToTarget(-63);
        this.projectTargetToScreen(0);
        this.projectGridToTarget(-113);
        this.projectTargetToScreen(0);
        var6 = this.screenPosition[0];
        var7 = this.screenPosition[1];
        var10 = 1 + var4;
        if (param2 != 93) {
          return;
        }
        var11 = var5;
        var12 = 0;
        var13 = so.field_b.field_a;
        var14 = so.field_b.field_g;
        for (var15 = var6; var15 <= var13; var15 += 40) {
          var8 = var10;
          var9 = var11;
          var16 = var12;
          for (var17 = var7; var14 >= var17; var17 += 20) {
            if (var16 != 0) {
              var9++;
            } else {
              var8--;
              if (-1 < var8 &&
                var8 < this.mapWidth + 1 &&
                var9 > -1 &&
                var9 < 1 + this.mapHeight) {
                var18 = (-param1 + var15) * (-param1 + var15) + (var17 - param0) * (-param0 + var17);
                var19 = 3 * fe.a(var18 * 4) - 30;
                if (var19 < 0) {
                  var19 = 0;
                }
                if (var19 < 256) {
                  pi.field_T.e(-6 + var15, -3 + var17, -var19 + 256);
                }
              }
            }
            stackIn_19_0 = (var16 != 0) ? 0 : 1;
            var16 = stackIn_19_0;
          }
          if (var12 != 0) {
            var10++;
            var11++;
          }
          stackIn_26_0 = (var12 != 0) ? 0 : 1;
          var12 = stackIn_26_0;
        }
        return;
    }

    final void selectProjectionTile(byte obfuscationGuard) {
        this.gridPosition[1] = this.projectionTileIndex / this.mapWidth;
        this.gridPosition[0] = -(this.gridPosition[1] * this.mapWidth) + this.projectionTileIndex;
        if (obfuscationGuard != 36) {
          return;
        }
    }

    private final void updateViewportOriginGrid(int obfuscationGuard) {
        this.screenPosition[1] = 0;
        this.screenPosition[0] = 0;
        this.screenToGrid(false);
        if (obfuscationGuard != -1) {
          this.setFocusTile((byte) 54, -118);
        }
        this.viewportOriginGrid[0] = this.gridPosition[0];
        this.viewportOriginGrid[1] = this.gridPosition[1];
    }

    private final void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, boolean param6, int param7, int param8, int param9) {
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var11 = 255;
        var12 = 255;
        var13 = 255;
        var14 = 255;
        if (param1 > -1 &&
          param5 > -1 &&
          param1 < this.mapWidth &&
          param5 < this.mapHeight) {
          if (param3) {
            var12 = this.overlayValues[this.mapWidth * param5 + param1];
          } else {
            var11 = this.overlayValues[param5 * this.mapWidth + param1];
          }
        }
        if (param0 > -1 &&
          param2 > -1 &&
          param0 < this.mapWidth &&
          param2 < this.mapHeight) {
          if (param3) {
            var13 = this.overlayValues[this.mapWidth * param2 + param0];
          } else {
            var14 = this.overlayValues[param0 + param2 * this.mapWidth];
          }
        }
        if (param8 != 1760) {
          this.overlayValues = (int[]) null;
        }
        if (!param3) {
          var13 = this.b(param2, -4510, param0);
          var12 = this.b(-1 + param5, -4510, param1 - 1);
        } else {
          var14 = this.b(param2 - 1, -4510, -1 + param0);
          var11 = this.b(param5, -4510, param1);
        }
        this.a(-8302, param2, var12, param3, var13, param6, param7, var14, param0, param4, param9, param1, var11, param5);
    }

    private final void updateViewportCenterGrid(boolean obfuscationGuard) {
        this.screenPosition[1] = so.field_b.field_g >> 1;
        this.screenPosition[0] = so.field_b.field_a >> 1;
        this.screenToGrid(obfuscationGuard);
        this.viewportCenterGrid[1] = this.gridPosition[1];
        this.viewportCenterGrid[0] = this.gridPosition[0];
    }

    private final boolean panCamera(boolean enabled, boolean panDown, boolean suspendInertia, boolean panRight, boolean panLeft, boolean panUp) {
        int var7;
        int var8;
        int var9;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var7 = 0;
        if (panUp ||
          panDown ||
          panLeft ||
          panRight) {
          var7 = 1;
        }
        if (!enabled) {
          return true;
        }
        var8 = 16;
        if (!panUp) {
          if (!suspendInertia &&
            this.velocity[1] < 0) {
            this.velocity[1] = this.velocity[1] + 1;
          }
        } else {
          if (this.velocity[1] > -var8) {
            this.velocity[1] = this.velocity[1] - 1;
          }
        }
        if (panDown) {
          if (this.velocity[1] < var8) {
            this.velocity[1] = this.velocity[1] + 1;
          }
        } else {
          if (!suspendInertia &&
            this.velocity[1] > 0) {
            this.velocity[1] = this.velocity[1] - 1;
          }
        }
        if (panLeft) {
          if (-var8 < this.velocity[0]) {
            this.velocity[0] = this.velocity[0] - 1;
          }
        } else {
          if (!suspendInertia &&
            this.velocity[0] < 0) {
            this.velocity[0] = this.velocity[0] + 1;
          }
        }
        if (panRight) {
          if (this.velocity[0] < var8) {
            this.velocity[0] = this.velocity[0] + 1;
          }
        } else {
          if (!suspendInertia &&
            0 < this.velocity[0]) {
            this.velocity[0] = this.velocity[0] - 1;
          }
        }
        if (!suspendInertia ||
          var7 != 0) {
          this.currentPosition[1] = this.currentPosition[1] + this.velocity[1];
          this.currentPosition[0] = this.currentPosition[0] + (this.velocity[0] << 1);
          this.clampWorldPosition(-81, this.currentPosition);
          this.updateViewportCenterGrid(false);
          this.updateViewportOriginGrid(-1);
        }
        return var7 != 0;
    }

    private final void targetToGrid(int gridYSlot) {
        int var2 = -40 + this.targetPosition[0] >> 1;
        int var3 = this.targetPosition[1] - (this.mapHeight * 40 >> 1);
        int var5 = var3 + var2;
        int var4 = var2 - var3;
        if (var4 < 0) {
          var4 -= 40;
        }
        if (var5 < 0) {
          var5 -= 40;
        }
        this.gridPosition[0] = var4 / 40;
        this.gridPosition[gridYSlot] = var5 / 40;
    }

    final void snapToTile(int tileIndex, boolean obfuscationGuard) {
        this.gridPosition[1] = tileIndex / this.mapWidth;
        this.gridPosition[0] = tileIndex - this.mapWidth * this.gridPosition[1];
        if (!obfuscationGuard) {
          this.velocity = (int[]) null;
        }
        this.snapToGrid(!obfuscationGuard ? true : false);
    }

    final void screenToGrid(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.projectTile(-4, 46);
        }
        this.screenToTarget(105);
        this.targetToGrid(1);
    }

    private final void a(int param0) {
        int var18 = 0;
        int var20 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var19;
        int var21;
        var21 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.screenPosition[0] = 0;
        this.screenPosition[1] = 0;
        this.screenToGrid(false);
        this.gridPosition[1] = this.gridPosition[1] - 2;
        var2 = this.gridPosition[0];
        var3 = this.gridPosition[1];
        this.projectGridToTarget(-47);
        this.projectTargetToScreen(0);
        this.projectGridToTarget(-85);
        this.projectTargetToScreen(param0 ^ param0);
        var4 = this.screenPosition[0];
        var5 = this.screenPosition[1];
        var11 = var2 - 1;
        var12 = var3;
        var13 = var3;
        var10 = var2;
        var14 = 0;
        stackIn_3_0 = (0 != (var3 + var2) % 2) ? 0 : 1;
        var15 = stackIn_3_0;
        var16 = so.field_b.field_a;
        var17 = so.field_b.field_g;
        for (var18 = var4; var18 <= var16; var18 += 40) {
          var8 = var12;
          var6 = var10;
          var7 = var11;
          var9 = var13;
          var19 = var14;
          for (var20 = var5; var20 <= var17; var20 += 20) {
            this.a(var7, var6, var9, var19 != 0, var15 != 0, var8, var14 != 0, var18, 1760, var20);
            if (var19 == 0) {
              var9++;
              var6--;
            } else {
              var7--;
              var8++;
            }
            stackIn_13_0 = (var19 != 0) ? 0 : 1;
            var19 = stackIn_13_0;
          }
          if (var14 != 0) {
            var10++;
            var12++;
          } else {
            var13++;
            var11++;
          }
          stackIn_20_0 = (var14 != 0) ? 0 : 1;
          var14 = stackIn_20_0;
        }
    }

    final void transformTarget(byte obfuscationGuard) {
        int var2 = this.targetPosition[0];
        int var3 = this.targetPosition[1];
        int var4 = 0;
        int var5 = 0;
        int var6 = so.sqrtFixed16(327680, -129);
        var4 = var4 + RasterViewportResizeHandler.multiplyFixed16(-48, var2 << 14, var6);
        var5 = var5 + RasterViewportResizeHandler.multiplyFixed16(-70, var2 << 14, var6);
        var4 = var4 - RasterViewportResizeHandler.multiplyFixed16(-94, var2 << 15, var6);
        var5 = var5 + RasterViewportResizeHandler.multiplyFixed16(-51, var3 << 15, var6);
        this.transformedPosition[0] = var4;
        this.transformedPosition[1] = var5;
        int var7 = -48 % ((19 - obfuscationGuard) / 36);
    }

    final void projectTargetToScreen(int currentXSlot) {
        int var3 = this.targetPosition[1];
        int var2 = this.targetPosition[0];
        int var5 = var3 - this.currentPosition[1];
        int var4 = var2 - this.currentPosition[currentXSlot];
        var4 = var4 + (so.field_b.field_a >> 1);
        var5 = (so.field_b.field_g >> 1) + var5;
        this.screenPosition[1] = var5;
        this.screenPosition[0] = var4;
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, boolean param5, int param6, int param7, int param8, boolean param9, int param10, int param11, int param12, int param13) {
        int var24 = 0;
        int var28 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        boolean stackIn_28_1 = false;
        int stackIn_31_1 = 0;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var25;
        int var26;
        int var27;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int[] var40;
        var39 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 <= param11 &&
          0 <= param1 &&
          this.mapHeight - 1 >= param13 &&
          param8 <= -1 + this.mapWidth) {
          if (0 > param13) {
            this.a(false, param4, param10, -126, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (0 > param8) {
            this.a(true, param4, param10, param0 ^ 8236, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (param0 != -8302) {
            var40 = (int[]) null;
            this.clampWorldPosition(-43, (int[]) null);
          }
          if (param1 > -1 + this.mapHeight) {
            this.a(true, param4, param10, -78, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          if (-1 + this.mapWidth < param11) {
            this.a(false, param4, param10, -120, param5, param6, param2, param7, param3, param9, param12);
            return;
          }
          var15 = param2 << 16;
          var16 = (-var15 + (param12 << 16)) / 40;
          var17 = param7 << 16;
          var18 = ((param4 << 16) - var17) / 40;
          var19 = var15;
          var20 = var17;
          stackIn_22_0 = 0;
          stackIn_23_1 = (param9 ^ param5) ? 0 : 40;
          var21 = stackIn_22_0 + stackIn_23_1;
          var22 = so.field_b.field_a;
          var23 = so.field_b.field_g;
          for (var24 = param6; var24 < param6 + 40; var24++) {
            stackIn_27_0 = 0;
            stackIn_28_1 = (param3 != param5);
            if (stackIn_28_1 ^ param9) {
              stackIn_31_1 = 20;
            } else {
              stackIn_31_1 = 0;
            }
            var25 = stackIn_27_0 + stackIn_31_1;
            var26 = var19;
            var27 = (-var19 + var20) / 20;
            for (var28 = param10; param10 + 20 > var28; var28++) {
              if (0 <= var24 &&
                var24 < var22 &&
                var28 >= 0 &&
                var23 > var28) {
                var29 = var24 + var22 * var28;
                var30 = SoftwareRaster.pixels[var29];
                var31 = dd.activeTerrainSample.pixels[var21 + var25 * 80];
                if (var30 != 0) {
                  var32 = (16745529 & var26) >> 15;
                  if (var32 > 255) {
                    var32 = 255;
                  }
                  var36 = (16711680 & var31) * (-var32 + 255) >>> 8;
                  var33 = 255 & var30 >> 16;
                  var35 = (var30 & 65280) >> 8;
                  var34 = var30 & 255;
                  var37 = (var31 & 255) * (-var32 + 255);
                  var36 = var36 + var32 * 65280;
                  var38 = (65280 & var31) * (-var32 + 255);
                  var38 = var38 + 65280 * var32;
                  var37 = var37 + 255 * var32;
                  var37 = var37 >> 8;
                  var38 = var38 >> 8;
                  var30 = (var33 * var36 & -16777216 | 65280 & var37 * var34 | 16711680 & var38 * var35) >> 8;
                  SoftwareRaster.pixels[var29] = var30;
                }
              }
              var26 = var26 + var27;
              var25++;
            }
            var20 = var20 + var18;
            var21++;
            var19 = var19 + var16;
          }
          return;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, boolean param8, boolean param9, int param10) {
        int var21 = 0;
        int var27 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_9_1 = false;
        int stackIn_10_2 = 0;
        int stackIn_13_3 = 0;
        boolean stackIn_16_2 = false;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        var38 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var12 = param6 << 16;
        var13 = (-var12 + (param10 << 16)) / 40;
        var14 = param7 << 16;
        var15 = (-var14 + (param1 << 16)) / 40;
        var16 = var12;
        var17 = var14;
        stackIn_2_0 = 0;
        stackIn_3_1 = (param4 ^ param9) ? 0 : 40;
        var18 = stackIn_2_0 + stackIn_3_1;
        var19 = so.field_b.field_a;
        var20 = so.field_b.field_g;
        if (param3 >= -51) {
          this.focusWorldX = -88;
        }
        for (var21 = param5; 40 + param5 > var21; var21++) {
          stackIn_9_0 = 0;
          stackIn_9_1 = param9;
          if (param4) {
            stackIn_10_2 = 0;
          } else {
            stackIn_10_2 = 1;
          }
          if (param8) {
            stackIn_13_3 = 0;
          } else {
            stackIn_13_3 = 1;
          }
          stackIn_16_2 = (stackIn_10_2 != stackIn_13_3);
          if (stackIn_9_1 ^ !stackIn_16_2) {
            stackIn_19_1 = 0;
          } else {
            stackIn_19_1 = 20;
          }
          var22 = stackIn_9_0 + stackIn_19_1;
          var23 = var16;
          if (!param8) {
            stackIn_22_0 = -param5 + var21 >> 1;
          } else {
            stackIn_22_0 = -var21 + (param5 + 40) >> 1;
          }
          var24 = stackIn_22_0;
          var25 = 0;
          var26 = (var17 - var16) / 20;
          for (var27 = param2; param2 + 20 > var27; var27++) {
            if ((var25 >= var24 &&
              !param0 ||
              var25 < var24 &&
              param0) && (0 <= var21 &&
              var19 > var21 &&
              0 <= var27 &&
              var20 > var27)) {
              var28 = var21 + var19 * var27;
              var29 = SoftwareRaster.pixels[var28];
              var30 = dd.activeTerrainSample.pixels[var22 * 80 + var18];
              if (var29 != 0) {
                var31 = (16772243 & var23) >> 15;
                if (255 < var31) {
                  var31 = 255;
                }
                var32 = (var29 & 16711680) >> 16;
                var34 = 255 & var29 >> 8;
                var35 = (-var31 + 255) * (16711680 & var30) >>> 8;
                var33 = var29 & 255;
                var36 = (var30 & 255) * (-var31 + 255);
                var35 = var35 + var31 * 65280;
                var37 = (-var31 + 255) * (65280 & var30);
                var37 = var37 + var31 * 65280;
                var36 = var36 + 255 * var31;
                var37 = var37 >> 8;
                var36 = var36 >> 8;
                var29 = (var37 * var34 & 16711680 | (var36 * var33 & 65280 | var32 * var35 & -16777216)) >> 8;
                SoftwareRaster.pixels[var28] = var29;
              }
            }
            var25++;
            var23 = var23 + var26;
            var22++;
          }
          var16 = var16 + var13;
          var18++;
          var17 = var17 + var15;
        }
    }

    public static void d(byte param0) {
        if (param0 != 55) {
          return;
        }
        field_f = null;
    }

    final boolean handleInput(int obfuscationGuard, boolean panDown, int pointerY, boolean panUp, boolean panRight, boolean panLeft, boolean suspendInertia, boolean dragging, int pointerX) {
        int var10 = 0;
        var10 = this.dragCamera(true, dragging, pointerX, pointerY) ? 1 : 0;
        if (var10 == 0) {
          var10 = this.panCamera(true, panDown, suspendInertia, panRight, panLeft, panUp) ? 1 : 0;
        }
        if (obfuscationGuard < 88) {
          this.screenToTarget(93);
        }
        return var10 != 0;
    }

    final void g(int param0) {
        boolean stackIn_20_0 = false;
        boolean stackIn_23_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_36_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.viewportOriginGrid[0];
        var3 = this.viewportOriginGrid[1];
        this.gridPosition[0] = var2;
        var3 -= 3;
        this.gridPosition[1] = var3;
        this.projectGridToTarget(param0 - 242);
        this.projectTargetToScreen(0);
        if (param0 != 200) {
          this.focusWorldY = 67;
        }
        var4 = 40 + this.screenPosition[0];
        var5 = -20 + this.screenPosition[1];
        var6 = var4;
        var7 = var5;
        var8 = var2;
        var9 = var3;
        var10 = so.field_b.field_a;
        var11 = so.field_b.field_g;
        SoftwareRaster.setClip(0, 0, var10, var11);
        var12 = 0;
        while (var11 + 200 + 256 > var7) {
          while (var6 < var10 + 80) {
            if (-5 <= var8 &&
              this.mapWidth >= var8 &&
              var9 >= -1 &&
              4 + this.mapHeight >= var9) {
              stackIn_20_0 = !(40 + var11 >= var7);
              bi.a(stackIn_20_0, var7, var6, param0 ^ 132, var8, var9);
              stackIn_23_0 = !(var7 <= var11 + 120);
              AccountRequestResult.a(stackIn_23_0, var6, (byte) -128, var9 - 2, -80 + var7, var8 + 2);
              stackIn_26_0 = !(var7 <= 200 + var11);
              ActionRequest.a(stackIn_26_0, 4 + var8, var6, (byte) 120, var9 - 4, var7 - 160);
            }
            var9++;
            var8++;
            var6 += 80;
          }
          var7 += 20;
          if (var12 != 0) {
            var6 = var4 - 40;
            var2--;
          }
          if (var12 == 0) {
            var6 = var4;
            var3++;
          }
          var9 = var3;
          var8 = var2;
          stackIn_36_0 = (var12 != 0) ? 0 : 1;
          var12 = stackIn_36_0;
        }
    }

    final boolean moveTowardTile(int maximumSpeed, byte obfuscationGuard, int tileIndex) {
        this.gridPosition[1] = tileIndex / this.mapWidth;
        if (obfuscationGuard != 113) {
          this.screenPosition = (int[]) null;
        }
        this.gridPosition[0] = -(this.gridPosition[1] * this.mapWidth) + tileIndex;
        this.projectGridToTarget(-62);
        return this.advanceTowardTarget((byte) -125, maximumSpeed);
    }

    final void followEventPresenters(byte obfuscationGuard, NodeDeque presenters) {
        boolean discarded$0 = false;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        EventPresenter var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = (EventPresenter) (presenters.last((byte) -77));
          while (var3 != null) {
            if (var3.tileIndex <= -1) {
              var3 = (EventPresenter) (presenters.previous((byte) 73));
              continue;
            }
            stackIn_7_0 = (var3 != this.focusedPresenter) ? 0 : 1;
            var4 = stackIn_7_0;
            this.focusedPresenter = var3;
            if (var4 == 0) {
              this.eventFocusActive = true;
            }
            this.focusWorldY = -(so.field_b.field_g >> 1) + var3.screenY + this.currentPosition[1];
            this.focusWorldX = this.currentPosition[0] + var3.screenX - (so.field_b.field_a >> 1);
            var5 = this.currentPosition[0] - this.focusWorldX;
            var6 = -this.focusWorldY + this.currentPosition[1];
            if (var6 * var6 + var5 * var5 < 40000) {
              if (var4 == 0) {
                this.eventFocusActive = false;
              }
            } else {
              this.eventFocusActive = true;
            }
            if (!this.eventFocusActive) {
              return;
            }
            break;
          }
          this.targetPosition[0] = this.focusWorldX;
          this.targetPosition[1] = this.focusWorldY;
          if (obfuscationGuard <= 99) {
            this.b(63, 30, (byte) -17);
          }
          discarded$0 = this.advanceTowardTarget((byte) -127, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("v.F(").append(obfuscationGuard).append(',');
          if (presenters == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void setFocusTile(byte obfuscationGuard, int tileIndex) {
        this.gridPosition[1] = tileIndex / this.mapWidth;
        this.gridPosition[0] = tileIndex - this.mapWidth * this.gridPosition[1];
        this.storeGridFocus((byte) -28);
        int var3 = 121 / ((-71 - obfuscationGuard) / 49);
    }

    final void projectTile(int gridYSlot, int tileIndex) {
        this.gridPosition[gridYSlot] = tileIndex / this.mapWidth;
        this.gridPosition[0] = tileIndex - this.mapWidth * this.gridPosition[1];
        this.projectGridToTarget(gridYSlot ^ -72);
        this.projectTargetToScreen(gridYSlot - 1);
    }

    private final void generateOverlayValues(int obfuscationGuard) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = -71 % ((4 - obfuscationGuard) / 32);
        byte[] var3 = new cn(AttackEvent.nextBoundedInt(false, 2147483647, li.field_n), 4, this.mapWidth / 5, this.mapHeight / 5, 7, 0.5f, true).a(this.mapHeight, (byte) 93, this.mapWidth);
        this.overlayValues = new int[var3.length];
        for (var4 = 0; var3.length > var4; var4++) {
          this.overlayValues[var4] = 256 - rn.bitwiseAnd((int) var3[var4], 255);
        }
    }

    private final void snapToGrid(boolean obfuscationGuard) {
        this.projectGridToTarget(-112);
        this.currentPosition[0] = this.targetPosition[0];
        this.currentPosition[1] = this.targetPosition[1];
        this.focusWorldX = this.targetPosition[0];
        this.focusWorldY = this.targetPosition[1];
        this.updateViewportCenterGrid(obfuscationGuard);
        if (obfuscationGuard) {
          this.updateViewportCenterGrid(true);
        }
        this.updateViewportOriginGrid(-1);
    }

    BattleCamera(int mapWidth, int mapHeight) {
        this.focusWorldY = 0;
        this.focusWorldX = 0;
        this.initialize(mapHeight, mapWidth, -87);
        AiInfluenceMap.field_d = this;
    }

    private final void initialize(int mapHeight, int mapWidth, int obfuscationGuard) {
        this.velocity = new int[2];
        this.viewportOriginGrid = new int[2];
        this.viewportCenterGrid = new int[2];
        this.previousPointer = new int[2];
        this.currentPosition = new int[2];
        this.currentPosition[0] = 40 + 80 * (this.mapWidth >> 1) - 80;
        this.screenPosition = new int[2];
        this.currentPosition[1] = 20 + 40 * (-1 + (this.mapHeight >> 1));
        this.targetPosition = new int[2];
        if (obfuscationGuard > -53) {
          return;
        }
        this.transformedPosition = new int[2];
        this.gridPosition = new int[2];
        this.mapHeight = mapHeight;
        this.mapWidth = mapWidth;
        this.generateOverlayValues(63);
        this.handleInput(101, false, so.field_b.field_g >> 1, false, false, false, false, false, so.field_b.field_a >> 1);
        this.updateViewportOriginGrid(-1);
    }

    final void projectGridToTarget(int obfuscationGuard) {
        int var7 = -20;
        int var9 = 20;
        int var6 = 40;
        int var2 = 40;
        int tileX = this.gridPosition[0];
        int tileY = this.gridPosition[1];
        if (obfuscationGuard >= -30) {
          this.focusedPresenter = (EventPresenter) null;
        }
        int var8 = 40;
        int worldYOffset = this.mapWidth * 40 >> 1;
        int diagonalY = tileY * var9 + tileX * var7;
        int diagonalX = var6 * tileX + var8 * tileY;
        worldYOffset = worldYOffset + diagonalY;
        var2 = diagonalX + var2;
        this.targetPosition[0] = var2;
        this.targetPosition[1] = worldYOffset;
    }

    static {
        field_f = "Environmental";
    }
}
