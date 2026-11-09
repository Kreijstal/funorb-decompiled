/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class Drone {
    int blastButtonHeldTicks;
    int yQ8;
    int destructionTicks;
    static byte[] field_g;
    int detonationCountdown;
    private int targetSpeedQ8;
    int field_P;
    private int dragIncrement;
    int xQ8;
    private int temporaryPowerupTicks;
    int radiusQ8;
    int variantCooldownTicks;
    boolean field_R;
    boolean onIce;
    int velocityXQ8;
    double facingRadians;
    private int ageTicks;
    int mass;
    private int lastBlastTick;
    private int targetYQ8;
    private int blastTicksRemaining;
    int field_u;
    int droneType;
    int bounceLevel;
    int spawnAgeTicks;
    int variant;
    int field_G;
    int tractionLevel;
    private int temporaryPowerup;
    int awakeTicksRemaining;
    int field_a;
    double bounceScale;
    private IntrusiveDeque effects;
    int field_F;
    int speedLevel;
    private int targetXQ8;
    private boolean blastActive;
    int field_d;
    int armourHitsRemaining;
    static ResourceArchive field_J;
    int velocityYQ8;
    int field_e;
    boolean steeringSuppressed;
    private int movementLockTicks;

    private final void setTemporaryPowerup(int effectIndex, int guard) {
        this.temporaryPowerup = effectIndex;
        this.temporaryPowerupTicks = 500;
        if (guard <= 98) {
          this.blastChargeGaugeWidth((byte) -2);
        }
        this.recomputeUpgradeStats((byte) 35);
    }

    private final void accelerateInDirection(int directionXQ8, int directionYQ8, int guard) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var7Lifetime1;
        if (this.movementLockTicks > 0) {
          return;
        }
        if (!this.isBlastActive(22)) {
          this.facingRadians = Math.atan2((double)directionXQ8, (double)directionYQ8);
          if (guard >= -43) {
            this.droneType = -106;
          }
          var4 = this.velocityXQ8;
          var5 = this.velocityYQ8;
          var6 = 20;
          var6 = var6 + (this.tractionLevel - 1) * 10;
          if (this.onIce) {
            var6 = (int)((double)var6 * 0.4);
          }
          if (this.variant == 2 &&
            this.variantCooldownTicks > 0) {
            var6 = (int)((double)var6 * 0.4);
          }
          var7 = var6 * (this.targetSpeedQ8 * directionXQ8 / 256 - this.velocityXQ8) >> 8;
          this.velocityXQ8 = this.velocityXQ8 + (var7 == 0 ? 1 : var7);
          if (this.onIce) {
            this.velocityXQ8 = (var4 + this.velocityXQ8) / 2;
          }
          var7Lifetime1 = var6 * (-this.velocityYQ8 + this.targetSpeedQ8 * directionYQ8 / 256) >> 8;
          this.velocityYQ8 = this.velocityYQ8 + (var7Lifetime1 == 0 ? 1 : var7Lifetime1);
          if (this.onIce) {
            this.velocityYQ8 = (var5 + this.velocityYQ8) / 2;
          }
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_J = null;
        if (param0 != 0) {
          Drone.releaseStatics(-3);
        }
    }

    final int blastChargeGaugeWidth(byte param0) {
        if (param0 != -106) {
          this.field_R = false;
        }
        return (int)(395.0 * ((double)(-this.lastBlastTick + this.ageTicks) / 1000.0));
    }

    final void steerNormalized(int guard, int directionY, int directionX) {
        int var4;
        if (this.steeringSuppressed) {
          return;
        }
        if (guard > -59) {
          return;
        }
        var4 = (int)Math.round(Math.sqrt((double)(directionY * directionY + directionX * directionX)));
        if (var4 > 0) {
          directionX = (directionX << 8) / var4;
          directionY = (directionY << 8) / var4;
          if (directionX != 0 ||
            0 != directionY) {
            this.accelerateInDirection(directionX, directionY, -94);
          }
        }
    }

    final void advanceBlastButtonHold(boolean param0) {
        if (param0) {
          return;
        }
        this.blastButtonHeldTicks = this.blastButtonHeldTicks + 1;
    }

    private final void endBlast(int param0) {
        if (param0 != 1261228232) {
          this.droneType = 4;
        }
        this.blastActive = false;
        this.radiusQ8 = this.baseRadiusQ8((byte) -5);
    }

    private final void upgradeBounce(byte param0) {
        this.bounceLevel = this.bounceLevel + 1;
        if (param0 != 98) {
          this.field_G = 29;
        }
        if (10 < this.bounceLevel) {
          this.bounceLevel = 10;
        }
        this.recomputeUpgradeStats((byte) 35);
    }

    final void applyPowerup(byte guard, PowerupPickup pickup) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (pickup.kind != 0) {
            this.setTemporaryPowerup(pickup.effectIndex, 120);
          } else {
            this.upgradeStat(-62, pickup.effectIndex);
          }
          if (guard <= 83) {
            this.resetBlastButtonHold(17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ah.D(").append(guard).append(',');
          if (pickup == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void upgradeTraction(int param0) {
        if (param0 != 0) {
          this.isBlastButtonHoldComplete(-51);
        }
        this.tractionLevel = this.tractionLevel + 1;
        if (10 < this.tractionLevel) {
          this.tractionLevel = 10;
        }
        this.recomputeUpgradeStats((byte) 35);
    }

    final boolean isBlastChargeParticleTick(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
          discarded$0 = this.baseRadiusQ8((byte) 53);
        }
        return -this.lastBlastTick + this.ageTicks == 975 ? true : false;
    }

    final boolean hasVelocityOnBothAxes(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 125) {
          this.blastTicksRemaining = 106;
        }
        stackIn_6_0 = (this.velocityXQ8 != 0) && (this.velocityYQ8 != 0);
        return stackIn_6_0;
    }

    final boolean isPlayerProtected(boolean param0) {
        boolean stackIn_8_0 = false;
        if (!param0) {
          this.field_G = -94;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.droneType == 0 && (4 == this.temporaryPowerup ||
          this.ageTicks - this.lastBlastTick < 50)) {
          stackIn_8_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = false;
        }
        return stackIn_8_0;
    }

    final boolean isAliveAndSpawned(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -63) {
          this.speedLevel = -65;
        }
        stackIn_6_0 = (0 == this.destructionTicks) && (this.spawnAgeTicks >= 0);
        return stackIn_6_0;
    }

    final void onVariantContact(byte param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -55) {
          return;
        }
        var2 = this.variant;
        if (var2 != 0 &&
          var2 != 4 &&
          var2 != 5) {
          if (var2 == 1) {
            if (this.armourHitsRemaining > 0) {
              if (this.droneType != 0) {
                this.armourHitsRemaining = this.armourHitsRemaining - 1;
              }
            } else {
              if (this.variantCooldownTicks <= 0) {
                this.variantCooldownTicks = 200;
              }
            }
          } else {
            if (var2 != 2) {
              if (var2 == 3 &&
                0 >= this.variantCooldownTicks) {
                this.variantCooldownTicks = 500;
              }
            } else {
              if (this.variantCooldownTicks <= 0) {
                this.variantCooldownTicks = 200;
                if (this.droneType == 0) {
                  this.variantCooldownTicks = 0;
                }
              }
            }
          }
        }
        return;
    }

    void update(int param0) {
        float[] var2;
        int var3;
        TimedSceneEffect var4;
        float[] var5;
        float[] var6;
        float[] var7;
        float[] var9;
        float[] var10;
        float[] var13;
        float[] var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (MusicPatch.simulationPaused) {
          return;
        }
        if (this.awakeTicksRemaining > 0) {
          this.awakeTicksRemaining = this.awakeTicksRemaining - 1;
        }
        if (this.canSpawnClearOfPlayer(62)) {
          this.spawnAgeTicks = this.spawnAgeTicks + 1;
        }
        if (this.movementLockTicks > 0) {
          this.movementLockTicks = this.movementLockTicks - 1;
          return;
        }
        if (this.spawnAgeTicks < 0) {
          return;
        }
        if (this.detonationCountdown > -1) {
          this.detonationCountdown = this.detonationCountdown - 1;
        }
        if (0 == this.detonationCountdown) {
          this.detonate((byte) 116);
        }
        this.field_d = this.field_d + 1;
        if (this.droneType == 0 &&
          this.field_d * 20 / 1000 >= 30) {
          UnderageAccountInfoPanel.b(24753, 247, 8);
        }
        if (this.destructionTicks > 0) {
          this.velocityYQ8 = this.velocityYQ8 >> 1;
          this.destructionTicks = this.destructionTicks + 1;
          this.velocityXQ8 = this.velocityXQ8 >> 1;
          if (2 == this.destructionTicks) {
            QuickChatCommand.a(this.xQ8, this.effects, -16240, 20, VertexBufferReference.field_a[this.droneType], this.yQ8);
            var5 = new float[]{0.0f, -3.0f};
            var9 = FullscreenPromptController.rotateVector((byte) -99, var5, (float)this.facingRadians);
            var6 = var9;
            var2 = var6;
            this.effects.addLast((IntrusiveNode) (new DroneDebris(100, this.xQ8, this.yQ8, this.powerupTint(0), this.facingRadians, Math.random() / 100.0, (int)var9[0] << 8, (int)var9[1] << 8, this.droneType, 0, this.baseRadiusQ8((byte) -5) >> 8)), (byte) 39);
            var10 = FullscreenPromptController.rotateVector((byte) -16, var2, (float)(this.facingRadians + 2.0943951023931953));
            var7 = var10;
            var2Lifetime1 = var7;
            this.effects.addLast((IntrusiveNode) (new DroneDebris(100, this.xQ8, this.yQ8, this.powerupTint(0), this.facingRadians, Math.random() / 100.0, (int)var10[0] << 8, (int)var10[1] << 8, this.droneType, 1, this.baseRadiusQ8((byte) -5) >> 8)), (byte) 39);
            var13 = FullscreenPromptController.rotateVector((byte) -43, var2Lifetime1, (float)(4.1887902047863905 + this.facingRadians));
            this.effects.addLast((IntrusiveNode) (new DroneDebris(100, this.xQ8, this.yQ8, this.powerupTint(0), this.facingRadians, Math.random() / 100.0, (int)var13[0] << 8, (int)var13[1] << 8, this.droneType, 2, this.baseRadiusQ8((byte) -5) >> 8)), (byte) 39);
          }
        }
        if (!this.isBlastActive(73)) {
          this.xQ8 = this.xQ8 + this.velocityXQ8;
          this.yQ8 = this.yQ8 + this.velocityYQ8;
        }
        if (param0 > -55) {
          return;
        }
        if (!this.onIce) {
          this.velocityYQ8 = (-this.dragIncrement + 251) * this.velocityYQ8 / 256;
          this.velocityXQ8 = this.velocityXQ8 * (251 - this.dragIncrement) / 256;
        }
        boolean decompiledFrameRemainder0 = true;
        if (2 == this.droneType) {
          if (!DroneProximitySupport.isWithinRadius(this.targetYQ8, 2048, -128, this.xQ8, this.targetXQ8, this.yQ8)) {
            if ((!(!this.isBlastChargeParticleTick(-2))) &&
              ((0 == this.droneType))) {
              NoiseSliceGenerator.a(VertexBufferReference.field_a[this.droneType], this.effects, this, 40, this.yQ8, this.xQ8, (byte) 121);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.movementLockTicks <= 0) {
              this.movementLockTicks = 0;
              this.targetXQ8 = -1;
              this.targetYQ8 = -1;
              this.velocityYQ8 = 0;
              this.velocityXQ8 = 0;
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.isBlastChargeParticleTick(-2) &&
          0 == this.droneType)) {
          NoiseSliceGenerator.a(VertexBufferReference.field_a[this.droneType], this.effects, this, 40, this.yQ8, this.xQ8, (byte) 121);
        }
        if (this.temporaryPowerup != -1) {
          this.temporaryPowerupTicks = this.temporaryPowerupTicks - 1;
          if (0 == this.temporaryPowerupTicks) {
            this.clearTemporaryPowerup(677397768);
          }
          if (this.ageTicks % 2 != 0) {
            this.effects.addLast((IntrusiveNode) (new PowerupTrailParticle(50, this.xQ8 + (ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) - 1024) >> 8, -1024 + (this.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, this.powerupTint(0), this.temporaryPowerup + 1, true)), (byte) 39);
          } else {
            this.effects.addLast((IntrusiveNode) (new PowerupTrailParticle(50, -1024 + this.xQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96) >> 8, -1024 + (this.yQ8 + ExpandingRingEffect.nextRandomInt(2048, HardwareGraphicsHeap.field_o, (byte) -96)) >> 8, this.powerupTint(0), 1 + this.temporaryPowerup, false)), (byte) 39);
          }
        }
        var4 = (TimedSceneEffect) (this.effects.first(118));
        while (var4 != null) {
          if (var4.updateAndIsExpired(-2567)) {
            var4.unlink(false);
          }
          var4 = (TimedSceneEffect) (this.effects.next((byte) 18));
        }
        if (this.isBlastActive(66)) {
          this.radiusQ8 = this.radiusQ8 + 2048;
          this.blastTicksRemaining = this.blastTicksRemaining - 1;
          if (this.blastTicksRemaining == 0) {
            this.endBlast(1261228232);
          }
        }
        this.onIce = false;
        if (this.field_G > 0) {
          this.field_G = this.field_G - 1;
        }
        this.steeringSuppressed = false;
        if (0 < this.variantCooldownTicks) {
          this.variantCooldownTicks = this.variantCooldownTicks - 1;
          if (this.variantCooldownTicks == 0 &&
            this.variant == 1) {
            this.armourHitsRemaining = 3;
          }
        }
        this.ageTicks = this.ageTicks + 1;
        return;
    }

    final void beginDestruction(byte param0) {
        if (this.destructionTicks != 0) {
          return;
        }
        this.destructionTicks = 1;
        int var2 = 117 % ((74 - param0) / 47);
    }

    private final int powerupTint(int param0) {
        int var2;
        var2 = -1414832128;
        if (param0 != 0) {
          this.spawnAgeTicks = 86;
        }
        if (this.temporaryPowerup == 0) {
          var2 = -1442815829;
        } else {
          if (this.temporaryPowerup == 1) {
            var2 = -1436548949;
          }
        }
        return var2;
    }

    final void steerTowardPoint(boolean guard, int targetYQ8, int targetXQ8) {
        if (this.droneType == 2) {
          if (this.targetXQ8 == -1 &&
            -1 == this.targetYQ8) {
            this.targetYQ8 = targetYQ8;
            this.targetXQ8 = targetXQ8;
          } else {
            targetXQ8 = this.targetXQ8;
            targetYQ8 = this.targetYQ8;
          }
        }
        if (guard) {
          this.isBlastWarningTick((byte) 123);
        }
        this.steerNormalized(-108, targetYQ8 - this.yQ8 >> 8, -this.xQ8 + targetXQ8 >> 8);
    }

    final boolean isBlastWarningTick(byte param0) {
        if (param0 == -59) {
          return this.ageTicks - this.lastBlastTick == 980 ? true : false;
        }
        return true;
    }

    final boolean isBlastButtonHoldComplete(int param0) {
        if (param0 <= 54) {
          this.field_P = 112;
        }
        return 36 <= this.blastButtonHeldTicks ? true : false;
    }

    final boolean isActive(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 < 110) {
          this.advanceBlastButtonHold(true);
        }
        stackIn_6_0 = (0 <= this.spawnAgeTicks) && (this.destructionTicks == 0);
        return stackIn_6_0;
    }

    final boolean isAsleep(int param0) {
        if (param0 != -1) {
          this.advanceBlastButtonHold(false);
        }
        return this.awakeTicksRemaining == 0 ? true : false;
    }

    private final int baseRadiusQ8(byte param0) {
        if (param0 != -5) {
          return 24;
        }
        if (this.temporaryPowerup != 1) {
          return 2560;
        }
        return 5120;
    }

    private final void detonate(byte param0) {
        this.blastTicksRemaining = 12;
        this.blastActive = true;
        this.effects = new IntrusiveDeque();
        QuickChatCommand.a(this.xQ8, this.effects, -16240, 40, VertexBufferReference.field_a[this.droneType], this.yQ8);
        int var2 = 111 % ((param0 - 57) / 38);
        ArchiveLoadRequirement.playSoundEffect(19 + ExpandingRingEffect.nextRandomInt(3, HardwareGraphicsHeap.field_o, (byte) -96), true);
    }

    private final void initializeDroneStats(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.droneType;
        if (var2 != 1) {
          if (var2 == 2) {
            this.mass = 40;
            this.awakeTicksRemaining = -1;
            this.field_a = -(RasterStateFrame.field_k << 2) + (RasterStateFrame.field_k << 7);
            this.targetSpeedQ8 = 2800;
            this.bounceScale = 1.0;
          } else {
            if (var2 != 3) {
              if (var2 != 4) {
                if (5 == var2) {
                  this.bounceScale = 0.5;
                  this.field_a = RasterStateFrame.field_k << 7;
                  this.targetSpeedQ8 = 1600;
                  this.awakeTicksRemaining = -1;
                  this.mass = 160;
                } else {
                  if (0 == var2) {
                    this.awakeTicksRemaining = -1;
                    this.mass = 128;
                    this.targetSpeedQ8 = 1024;
                    this.radiusQ8 = 5120;
                  }
                }
              } else {
                this.targetSpeedQ8 = 700;
                this.field_a = -(RasterStateFrame.field_k << 2) + (RasterStateFrame.field_k << 7);
                this.field_e = 4;
                this.field_u = 4;
                this.awakeTicksRemaining = -1;
                this.mass = 80;
              }
            } else {
              this.mass = 80;
              this.awakeTicksRemaining = 0;
              this.field_a = RasterStateFrame.field_k << 7;
              this.targetSpeedQ8 = 700;
            }
          }
        } else {
          this.field_a = (RasterStateFrame.field_k << 7) - (RasterStateFrame.field_k << 2);
          this.mass = 60;
          this.targetSpeedQ8 = 600;
          this.awakeTicksRemaining = -1;
        }
        var2Lifetime1 = this.variant;
        if (var2Lifetime1 == 0) {
          if (this.droneType != 0) {
            this.radiusQ8 = 5120;
          }
        } else {
          if (1 == var2Lifetime1) {
            this.armourHitsRemaining = 3;
            this.radiusQ8 = 5120;
          } else {
            if (var2Lifetime1 != 2) {
              if (3 != var2Lifetime1) {
                if (var2Lifetime1 == 4) {
                  if (this.droneType == 4) {
                    this.field_e = 4;
                    this.field_u = 1;
                  }
                  this.radiusQ8 = 3072;
                  this.mass = this.mass >> 1;
                } else {
                  if (5 != var2Lifetime1) {
                    if (6 == var2Lifetime1) {
                      this.radiusQ8 = 14336;
                      this.field_u = this.droneType;
                      this.mass = this.mass << 1;
                      this.field_e = 5;
                      this.targetSpeedQ8 = this.targetSpeedQ8 >> 1;
                    }
                  } else {
                    this.mass = this.mass << 1;
                    this.radiusQ8 = 7168;
                    if (this.droneType == 4) {
                      this.field_e = 0;
                      this.field_u = 4;
                    }
                  }
                }
              } else {
                this.bounceScale = this.bounceScale / 2.0;
                this.radiusQ8 = 5120;
              }
            } else {
              this.radiusQ8 = 5120;
            }
          }
        }
        if (RenderPresentationException.a(false) &&
          this.droneType != 0) {
          this.bounceScale = this.bounceScale * 2.0;
          this.targetSpeedQ8 = this.targetSpeedQ8 << 1;
          this.mass = this.mass << 1;
        }
        if (param0 < 89) {
          return;
        }
        this.radiusQ8 = this.radiusQ8 >> 1;
    }

    private final void upgradeSpeed(byte param0) {
        this.speedLevel = this.speedLevel + 1;
        if (this.speedLevel > 10) {
          this.speedLevel = 10;
        }
        if (param0 != 61) {
          this.destructionTicks = 40;
        }
        this.recomputeUpgradeStats((byte) 35);
    }

    final void resetBlastButtonHold(int param0) {
        if (param0 >= -50) {
          this.advanceBlastButtonHold(true);
        }
        this.blastButtonHeldTicks = 0;
    }

    final boolean isBlastReady(int param0) {
        if (param0 != 20) {
          return false;
        }
        return -this.lastBlastTick + this.ageTicks > 1000 ? true : false;
    }

    final boolean isBlastActive(int param0) {
        if (param0 <= 17) {
          return true;
        }
        return this.blastActive;
    }

    final void upgradeStat(int guard, int statIndex) {
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard >= -4) {
          this.blastActive = true;
        }
        var3 = statIndex;
        if (0 != var3) {
          if (1 == var3) {
            this.upgradeTraction(0);
          } else {
            if (var3 == 2) {
              this.upgradeBounce((byte) 98);
            }
          }
        } else {
          this.upgradeSpeed((byte) 61);
        }
    }

    private final void clearTemporaryPowerup(int param0) {
        if (this.radiusQ8 > 2560) {
          this.radiusQ8 = 2560;
        }
        this.temporaryPowerup = -1;
        this.recomputeUpgradeStats((byte) 35);
        if (param0 != 677397768) {
          this.isAliveAndSpawned((byte) 38);
        }
    }

    private final boolean canSpawnClearOfPlayer(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Drone var7 = SpriteMask.drones[0];
        if (param0 < 53) {
          this.variant = 4;
        }
        if (var7 == null) {
          return true;
        }
        if (var7.equals(this)) {
          return true;
        }
        int var3 = this.radiusQ8 + var7.radiusQ8;
        if (DroneProximitySupport.isWithinRadius(var7.yQ8, var3, -115, this.xQ8, var7.xQ8, this.yQ8)) {
          var4 = -var7.xQ8 + this.xQ8;
          if (var4 == 0) {
            var4 = -1 + (2 & this.ageTicks << 1);
          }
          var5 = this.yQ8 - var7.yQ8;
          if (0 == var5) {
            var5 = -1 + ((1 & this.ageTicks) << 1);
          }
          var6 = (int)Math.round(Math.sqrt((double)((float)var4 * (float)var4 + (float)var5 * (float)var5)));
          return var6 >= var3 ? true : false;
        }
        return true;
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        ToolkitSprite stackIn_23_0 = null;
        float stackIn_23_1 = 0.0f;
        float stackIn_23_2 = 0.0f;
        int stackIn_24_3;
        ToolkitSprite stackIn_31_0 = null;
        float stackIn_31_1 = 0.0f;
        float stackIn_31_2 = 0.0f;
        int stackIn_32_3;
        ToolkitSprite stackIn_36_0 = null;
        float stackIn_36_1 = 0.0f;
        float stackIn_36_2 = 0.0f;
        int stackIn_37_3;
        ToolkitSprite stackIn_41_0;
        float stackIn_41_1;
        float stackIn_41_2;
        double stackIn_41_3;
        int stackIn_42_4;
        GraphicsToolkit stackIn_45_0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        int stackIn_46_5;
        ToolkitSprite stackIn_49_0 = null;
        float stackIn_49_1 = 0.0f;
        float stackIn_49_2 = 0.0f;
        int stackIn_50_3;
        ToolkitSprite stackIn_53_0 = null;
        float stackIn_53_1 = 0.0f;
        float stackIn_53_2 = 0.0f;
        int stackIn_54_3;
        ToolkitSprite stackIn_66_0;
        float stackIn_66_1;
        float stackIn_66_2;
        double stackIn_66_3;
        int stackIn_67_4;
        ToolkitSprite stackIn_73_0;
        float stackIn_73_1;
        float stackIn_73_2;
        double stackIn_73_3;
        int stackIn_74_4;
        ToolkitSprite stackIn_78_0;
        float stackIn_78_1;
        float stackIn_78_2;
        double stackIn_78_3;
        int stackIn_79_4;
        ToolkitSprite stackIn_83_0;
        float stackIn_83_1;
        float stackIn_83_2;
        double stackIn_83_3;
        int stackIn_84_4;
        ToolkitSprite stackIn_88_0;
        float stackIn_88_1;
        float stackIn_88_2;
        double stackIn_88_3;
        int stackIn_89_4;
        ToolkitSprite stackIn_92_0 = null;
        float stackIn_92_1 = 0.0f;
        float stackIn_92_2 = 0.0f;
        int stackIn_93_3;
        ToolkitSprite stackIn_122_0;
        float stackIn_122_1;
        float stackIn_122_2;
        double stackIn_122_3;
        int stackIn_123_4;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        TimedSceneEffect var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.destructionTicks != 0) {
            stackIn_4_0 = this.destructionTicks * this.destructionTicks << 8;
          } else {
            stackIn_4_0 = 0;
          }
          var3_int = stackIn_4_0;
          if (guard != 19399) {
            this.targetSpeedQ8 = -91;
          }
          if (this.spawnAgeTicks >= 0) {
            stackIn_9_0 = 0;
          } else {
            stackIn_9_0 = this.spawnAgeTicks * (this.spawnAgeTicks * this.radiusQ8) / 2500;
          }
          var4 = stackIn_9_0;
          var5 = this.radiusQ8 - (-var3_int + var4) >> 8;
          var6 = Math.max(0, 255 - this.destructionTicks * this.destructionTicks) << 24;
          var7 = (TimedSceneEffect) (this.effects.first(-80));
          while (var7 != null) {
            var7.render(toolkit, -127);
            var7 = (TimedSceneEffect) (this.effects.next((byte) 18));
          }
          if (0 > this.spawnAgeTicks) {
            QuickChatCommand.field_e[this.droneType].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)(this.radiusQ8 >> 8) / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
          }
          if (this.destructionTicks == 0) {
            if (this.droneType != 0) {
              if (this.droneType == 1) {
                stackIn_53_0 = ContentDialog.field_ab[0];
                stackIn_53_1 = (float)(this.xQ8 >> 8);
                stackIn_53_2 = (float)(this.yQ8 >> 8);
                if (!this.isBlastActive(28)) {
                  stackIn_54_3 = var5;
                } else {
                  stackIn_54_3 = 20;
                }
                ((ToolkitSprite) (Object) stackIn_53_0).drawRotated(stackIn_53_1, stackIn_53_2, (int)((double)stackIn_54_3 / 14.0 * 3072.0), (int)(32768.0 * this.facingRadians / 3.141592653589793), 1, 0, 2);
              } else {
                if (this.droneType == 2) {
                  stackIn_49_0 = ProjectionMode.field_d[0];
                  stackIn_49_1 = (float)(this.xQ8 >> 8);
                  stackIn_49_2 = (float)(this.yQ8 >> 8);
                  if (!this.isBlastActive(37)) {
                    stackIn_50_3 = var5;
                  } else {
                    stackIn_50_3 = 20;
                  }
                  ((ToolkitSprite) (Object) stackIn_49_0).drawRotated(stackIn_49_1, stackIn_49_2, (int)((double)stackIn_50_3 / 14.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                } else {
                  if (this.droneType != 3) {
                    if (this.droneType != 4) {
                      if (5 != this.droneType) {
                        stackIn_45_0 = (GraphicsToolkit) (toolkit);
                        stackIn_45_1 = this.xQ8 >> 8;
                        stackIn_45_2 = this.yQ8 >> 8;
                        stackIn_45_3 = var5;
                        stackIn_45_4 = var6 + UiStyleNode.droneTypeColor(-26346, this.droneType);
                        if (var6 != 255) {
                          stackIn_46_5 = 1;
                        } else {
                          stackIn_46_5 = 0;
                        }
                        ((GraphicsToolkit) (Object) stackIn_45_0).drawCircle(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_46_5);
                      } else {
                        stackIn_41_0 = HardwareTextureCache.field_e[0];
                        stackIn_41_1 = (float)(this.xQ8 >> 8);
                        stackIn_41_2 = (float)(this.yQ8 >> 8);
                        stackIn_41_3 = 3072.0;
                        if (this.isBlastActive(guard - 19316)) {
                          stackIn_42_4 = 20;
                        } else {
                          stackIn_42_4 = var5;
                        }
                        ((ToolkitSprite) (Object) stackIn_41_0).drawRotated(stackIn_41_1, stackIn_41_2, (int)(stackIn_41_3 * ((double)stackIn_42_4 / 14.0)), (int)(32768.0 * this.facingRadians / 3.141592653589793), 1, 0, 2);
                      }
                    } else {
                      stackIn_36_0 = MenuScreen.field_a[0];
                      stackIn_36_1 = (float)(this.xQ8 >> 8);
                      stackIn_36_2 = (float)(this.yQ8 >> 8);
                      if (!this.isBlastActive(27)) {
                        stackIn_37_3 = var5;
                      } else {
                        stackIn_37_3 = 20;
                      }
                      ((ToolkitSprite) (Object) stackIn_36_0).drawRotated(stackIn_36_1, stackIn_36_2, (int)((double)stackIn_37_3 / 14.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                    }
                  } else {
                    stackIn_31_0 = TextHotspot.field_n[0];
                    stackIn_31_1 = (float)(this.xQ8 >> 8);
                    stackIn_31_2 = (float)(this.yQ8 >> 8);
                    if (this.isBlastActive(106)) {
                      stackIn_32_3 = 20;
                    } else {
                      stackIn_32_3 = var5;
                    }
                    ((ToolkitSprite) (Object) stackIn_31_0).drawRotated(stackIn_31_1, stackIn_31_2, (int)((double)stackIn_32_3 / 14.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                  }
                }
              }
            } else {
              if (this.isBlastReady(20) &&
                0 < this.blastButtonHeldTicks &&
                DisplaySizeController.field_f == 0) {
                LegacyOpenGlTexture.field_e[6 - this.blastButtonHeldTicks / 7 + 3].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.facingRadians / 3.141592653589793), 1, 0, 2);
              } else {
                stackIn_23_0 = LegacyOpenGlTexture.field_e[0];
                stackIn_23_1 = (float)(this.xQ8 >> 8);
                stackIn_23_2 = (float)(this.yQ8 >> 8);
                if (!this.isBlastActive(114)) {
                  stackIn_24_3 = var5;
                } else {
                  stackIn_24_3 = 5120;
                }
                ((ToolkitSprite) (Object) stackIn_23_0).drawRotated(stackIn_23_1, stackIn_23_2, (int)((double)stackIn_24_3 / 14.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
              }
            }
            if (this.isBlastActive(guard - 19310) &&
              DisplaySizeController.field_f == 0) {
              TextCaretLayout.field_a.drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)((double)var5 / 28.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
            }
          }
          var8 = this.velocityXQ8;
          var9 = this.velocityYQ8;
          var10 = var5 >> 1;
          var11 = (int)Math.round(Math.sqrt((double)((float)this.velocityYQ8 * (float)this.velocityYQ8 + (float)this.velocityXQ8 * (float)this.velocityXQ8)));
          if (var11 > 1024) {
            var8 = (this.velocityXQ8 << 10) / var11;
            var9 = (this.velocityYQ8 << 10) / var11;
          }
          if (this.isAsleep(-1)) {
            if (var10 != 0) {
              var12 = var8 + this.xQ8 >> 8;
              var13 = this.yQ8 + var9 >> 8;
              toolkit.drawLine(-var10 + var12, var13, var12 + var10, var13, var6 + TextureGeneratorNode.brightDroneTypeColor((byte) -128, this.droneType), 1);
            }
          } else {
            if (this.destructionTicks <= 0) {
              if (this.droneType != 0) {
                if (1 == this.droneType) {
                  stackIn_92_0 = ContentDialog.field_ab[1];
                  stackIn_92_1 = (float)(var8 + this.xQ8 >> 8);
                  stackIn_92_2 = (float)(var9 + this.yQ8 >> 8);
                  if (this.isBlastActive(111)) {
                    stackIn_93_3 = 10;
                  } else {
                    stackIn_93_3 = var10;
                  }
                  ((ToolkitSprite) (Object) stackIn_92_0).drawRotated(stackIn_92_1, stackIn_92_2, (int)((double)stackIn_93_3 / 14.0 * 4096.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                } else {
                  if (2 == this.droneType) {
                    stackIn_88_0 = ProjectionMode.field_d[1];
                    stackIn_88_1 = (float)(var8 + this.xQ8 >> 8);
                    stackIn_88_2 = (float)(this.yQ8 + var9 >> 8);
                    stackIn_88_3 = 4096.0;
                    if (this.isBlastActive(18)) {
                      stackIn_89_4 = 10;
                    } else {
                      stackIn_89_4 = var10;
                    }
                    ((ToolkitSprite) (Object) stackIn_88_0).drawRotated(stackIn_88_1, stackIn_88_2, (int)(stackIn_88_3 * ((double)stackIn_89_4 / 14.0)), (int)(32768.0 * this.facingRadians / 3.141592653589793), 1, 0, 2);
                  } else {
                    if (this.droneType != 3) {
                      if (this.droneType != 4) {
                        if (this.droneType != 5) {
                          toolkit.drawCircle(this.xQ8 + var8 >> 8, this.yQ8 + var9 >> 8, var10, var6 + TextureGeneratorNode.brightDroneTypeColor((byte) -128, this.droneType), 1);
                          toolkit.drawCircle(var8 + this.xQ8 >> 8, var9 + this.yQ8 >> 8, var10 >> 2, 2236962 + var6, 1);
                        } else {
                          stackIn_83_0 = HardwareTextureCache.field_e[1];
                          stackIn_83_1 = (float)(this.xQ8 + var8 >> 8);
                          stackIn_83_2 = (float)(var9 + this.yQ8 >> 8);
                          stackIn_83_3 = 4096.0;
                          if (this.isBlastActive(106)) {
                            stackIn_84_4 = 10;
                          } else {
                            stackIn_84_4 = var10;
                          }
                          ((ToolkitSprite) (Object) stackIn_83_0).drawRotated(stackIn_83_1, stackIn_83_2, (int)(stackIn_83_3 * ((double)stackIn_84_4 / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                        }
                      } else {
                        stackIn_78_0 = MenuScreen.field_a[1];
                        stackIn_78_1 = (float)(var8 + this.xQ8 >> 8);
                        stackIn_78_2 = (float)(this.yQ8 + var9 >> 8);
                        stackIn_78_3 = 4096.0;
                        if (!this.isBlastActive(100)) {
                          stackIn_79_4 = var10;
                        } else {
                          stackIn_79_4 = 10;
                        }
                        ((ToolkitSprite) (Object) stackIn_78_0).drawRotated(stackIn_78_1, stackIn_78_2, (int)(stackIn_78_3 * ((double)stackIn_79_4 / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                      }
                    } else {
                      stackIn_73_0 = TextHotspot.field_n[1];
                      stackIn_73_1 = (float)(this.xQ8 + var8 >> 8);
                      stackIn_73_2 = (float)(var9 + this.yQ8 >> 8);
                      stackIn_73_3 = 4096.0;
                      if (!this.isBlastActive(guard ^ 19425)) {
                        stackIn_74_4 = var10;
                      } else {
                        stackIn_74_4 = 10;
                      }
                      ((ToolkitSprite) (Object) stackIn_73_0).drawRotated(stackIn_73_1, stackIn_73_2, (int)(stackIn_73_3 * ((double)stackIn_74_4 / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
                    }
                  }
                }
              } else {
                stackIn_66_0 = LegacyOpenGlTexture.field_e[1];
                stackIn_66_1 = (float)(var8 + this.xQ8 >> 8);
                stackIn_66_2 = (float)(this.yQ8 + var9 >> 8);
                stackIn_66_3 = 4096.0;
                if (this.isBlastActive(78)) {
                  stackIn_67_4 = 10;
                } else {
                  stackIn_67_4 = var10;
                }
                ((ToolkitSprite) (Object) stackIn_66_0).drawRotated(stackIn_66_1, stackIn_66_2, (int)(stackIn_66_3 * ((double)stackIn_67_4 / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
              }
            }
          }
          if (this.variant == 1 &&
            this.destructionTicks == 0) {
            if (this.variantCooldownTicks == 0 &&
              this.armourHitsRemaining > 0) {
              ProxyAuthenticationRequiredException.field_e[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)((3.141592653589793 + this.facingRadians) * 32768.0 / 3.141592653589793));
            } else {
              ProxyAuthenticationRequiredException.field_e[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * (3.141592653589793 + this.facingRadians) / 3.141592653589793));
            }
            if (this.droneType == 0) {
              ProxyAuthenticationRequiredException.field_e[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * (3.141592653589793 + this.facingRadians) / 3.141592653589793) + 32768);
            }
          } else if (this.variant == 2 &&
            0 == this.destructionTicks) {
            if (0 == this.variantCooldownTicks) {
              IntroMeshProjection.field_e[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793));
            } else {
              IntroMeshProjection.field_e[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(this.facingRadians * 32768.0 / 3.141592653589793));
            }
          } else {
            if (this.variant == 3 &&
              0 == this.destructionTicks) {
              if (this.variantCooldownTicks != 0) {
                HardwareRidgedWaterNoise.field_A[1].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.facingRadians / 3.141592653589793));
              } else {
                HardwareRidgedWaterNoise.field_A[0].drawRotated((float)(this.xQ8 >> 8), (float)(this.yQ8 >> 8), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * this.facingRadians / 3.141592653589793));
              }
            }
          }
          if (this.isBlastActive(101)) {
          }
          if (2 == this.temporaryPowerup) {
            stackIn_122_0 = IntrusiveDeque.field_d;
            stackIn_122_1 = (float)(this.xQ8 >> 8);
            stackIn_122_2 = (float)(this.yQ8 >> 8);
            stackIn_122_3 = 4096.0;
            if (this.isBlastActive(71)) {
              stackIn_123_4 = 20;
            } else {
              stackIn_123_4 = var10;
            }
            ((ToolkitSprite) (Object) stackIn_122_0).drawRotated(stackIn_122_1, stackIn_122_2, (int)(stackIn_122_3 * ((double)stackIn_123_4 / 7.0)), (int)(this.facingRadians * 32768.0 / 3.141592653589793), 1, 0, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_127_0 = var3;
          stackIn_127_1 = new StringBuilder().append("ah.W(");
          if (toolkit == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(guard).append(')').toString());
        }
    }

    final void activateBlast(byte param0) {
        if (this.isBlastActive(22)) {
          return;
        }
        if (this.isBlastReady(20)) {
          ArchiveLoadRequirement.playSoundEffect(28, true);
          this.blastActive = true;
          this.lastBlastTick = this.ageTicks;
          if (param0 >= -5) {
            this.field_G = 4;
          }
          this.blastTicksRemaining = 12;
          this.effects = new IntrusiveDeque();
          QuickChatCommand.a(this.xQ8, this.effects, -16240, 50, VertexBufferReference.field_a[this.droneType], this.yQ8);
          this.resetBlastButtonHold(-82);
          return;
        }
    }

    final void recomputeUpgradeStats(byte param0) {
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 35) {
          this.setTemporaryPowerup(28, -76);
        }
        this.targetSpeedQ8 = 1024 + this.speedLevel * 50 - 50;
        this.dragIncrement = 0 + 3 * (this.tractionLevel - 1);
        if (this.radiusQ8 > 2560) {
          this.radiusQ8 = 2560;
        }
        this.variant = 0;
        this.bounceScale = 0.1 * (double)(-1 + this.bounceLevel) + 1.0;
        if (-1 != this.temporaryPowerup) {
          if (0 != this.temporaryPowerup) {
            if (this.temporaryPowerup == 1) {
              this.radiusQ8 = this.radiusQ8 << 1;
              this.dragIncrement = this.dragIncrement << 1;
            } else {
              if (2 != this.temporaryPowerup) {
                if (3 == this.temporaryPowerup) {
                  this.variant = 2;
                } else {
                  if (this.temporaryPowerup == 4) {
                    this.armourHitsRemaining = 1;
                    this.variant = 1;
                  }
                }
              } else {
                this.bounceScale = this.bounceScale * 2.0;
              }
            }
          } else {
            this.targetSpeedQ8 = this.targetSpeedQ8 << 1;
          }
        }
    }

    Drone(int droneType, int variant, int xQ8, int yQ8) {
        this.destructionTicks = 0;
        this.targetSpeedQ8 = 80;
        this.detonationCountdown = -1;
        this.field_P = -1;
        this.field_R = false;
        this.bounceLevel = 1;
        this.field_u = -1;
        this.targetYQ8 = -1;
        this.field_G = 1500;
        this.tractionLevel = 1;
        this.targetXQ8 = -1;
        this.blastActive = false;
        this.speedLevel = 1;
        this.spawnAgeTicks = -50;
        this.field_e = -1;
        this.field_d = 0;
        this.movementLockTicks = 0;
        this.yQ8 = yQ8;
        this.bounceScale = 1.0;
        this.temporaryPowerup = -1;
        this.xQ8 = xQ8;
        this.variant = variant;
        this.droneType = droneType;
        this.initializeDroneStats(125);
        this.effects = new IntrusiveDeque();
    }

    static {
    }
}
