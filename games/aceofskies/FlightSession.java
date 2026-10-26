/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FlightSession {
    private Vector2 scratchPosition;
    private int displayedWeaponHeat;
    private int targetBackgroundTint;
    private int temporaryWeaponOpacity;
    private int scorchMarkCount;
    private boolean attractMode;
    private int shotsHit;
    private int lightningCountdown;
    private int simulationTick;
    private int screenParticleCount;
    private Aircraft[] aircraft;
    private int displayedHealthPercent;
    private boolean debugControlsEnabled;
    int finalAccuracyPercent;
    private int victoryCountdown;
    private int respawnDelayTicks;
    private SmokeParticle[] smokeParticles;
    private int backgroundTileY;
    private int backgroundTint;
    private int backgroundTintBlendTicks;
    private int shotsFired;
    private int backgroundTileX;
    private Pickup[] pickups;
    private int smokeParticleCount;
    static RendererManager rendererManager;
    private Bullet[] bullets;
    private int pickupCount;
    private int previousBackgroundTint;
    private FlightBody[] backgroundBodies;
    private Aircraft playerAircraft;
    private boolean noLivesLost;
    int finalScore;
    private int lightningRandomBound;
    private ScreenParticle[] screenParticles;
    private int bulletCount;
    static BitmapFont field_e;
    private int displayedTemporaryWeaponTicks;
    private int[] upgradeFlashTicks;
    private ScorchMark[] scorchMarks;
    private int displayedTemporaryWeaponType;
    private int displayedUpgradeCredits;
    private int upgradeCredits;
    private int speedUpgradeLevel;
    private int lastLeftPressTick;
    private MidiPcmStream gameMusic;
    private int completedWaveCount;
    private int[] musicChannelVolumes;
    private double cameraScale;
    private int healthUpgradeLevel;
    private int scoreAnimationTicks;
    private boolean rightHeldLastTick;
    private int targetMultiplier;
    private boolean invulnerabilityCheat;
    private boolean alternateMusicActive;
    private boolean arcadeMode;
    private int displayedMultiplier;
    private boolean overheatFireLatch;
    private int respawnInvulnerabilityTicks;
    private boolean leftHeldLastTick;
    private boolean paused;
    private int displayedScore;
    private int classicWaveIndex;
    private int doubleTapTurnDirection;
    private int multiplierPanelHidePhase;
    private boolean manualMusicLayers;
    private int controlTick;
    private int musicLayerPresetIndex;
    private int lives;
    private int fireRateUpgradeLevel;
    private double cameraLookAheadX;
    private double cameraLookAheadY;
    private int turnRateUpgradeLevel;
    private int targetScore;
    private int lastRightPressTick;
    private int creditAnimationTicks;
    private int multiplierAnimationTicks;
    private double backgroundPanY;
    private int sampledUpgradeCredits;
    private int scoreMultiplier;
    private int hudHidePhase;
    private int targetUpgradeCredits;
    private double backgroundPanX;

    private final void drawHud(GraphicsRenderer renderer, int obfuscationGuard) {
        int stackIn_90_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        String stackIn_184_2 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.hudHidePhase < 200) {
            var3_int = 128 + (int)(128.0 * -Math.cos((double)this.hudHidePhase * 3.141592653589793 / 200.0));
            int var4_int = var3_int * 140 >> 8;
            if (!this.arcadeMode) {
              var5 = -var4_int + 5;
              var6 = 5;
              var7 = 0;
              while (var7 < 7) {
                var8 = 0;
                stackIn_141_0 = -1;
                stackIn_141_1 = ~var7;
                if (var13 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_141_0 == stackIn_141_1) {
                  var8 = this.speedUpgradeLevel;
                }
                if (1 == var7) {
                  var8 = this.fireRateUpgradeLevel;
                }
                if (var7 == 2) {
                  var8 = this.turnRateUpgradeLevel;
                }
                if (var7 == 3) {
                  var8 = this.healthUpgradeLevel;
                }
                if (4 == var7) {
                  var8 = this.lives;
                }
                if (var7 == 5) {
                  var9 = 0;
                  Aircraft[] var10_ref_md__ = this.aircraft;
                  int var11 = 0;
                  while (var10_ref_md__.length > var11) {
                    Aircraft var12 = var10_ref_md__[var11];
                    if (var12 != null &&
                      var12.hitPoints > 0 && (this.playerAircraft != var12 ||
                      var13 != 0) && gh.playerDefinition == var12.definition) {
                      var9++;
                    }
                    var11++;
                  }
                  var8 = var9;
                }
                var9 = (int)((1.0 + Math.sin((double)this.simulationTick * 3.141592653589793 / 20.0)) * 127.0);
                if (var9 == 0) {
                  this.sampledUpgradeCredits = this.upgradeCredits;
                }
                int stackIn_55_0 = ((1 + var7) > this.sampledUpgradeCredits) ? 0 : 1;
                var10 = stackIn_55_0;
                if (var7 == 6) {
                  var8 = 20;
                } else if (var7 == 4 ||
                  5 == var7) {
                  if (6 < var8) {
                    var8 = 6;
                  }
                  int stackIn_72_0 = var10;
                  int stackIn_73_1 = (var8 >= 6) ? 0 : 1;
                  var10 = stackIn_72_0 & stackIn_73_1;
                  var8 += 13;
                } else {
                  if (var8 > 12) {
                    var8 = 12;
                  }
                  int stackIn_81_0 = var10;
                  int stackIn_82_1 = (12 <= var8) ? 0 : 1;
                  var10 = stackIn_81_0 & stackIn_82_1;
                }
                jm.levelRingSprites[var8].a(var5, var6);
                if (var7 == 6) {
                  if (this.scoreMultiplier <= 50) {
                    stackIn_90_0 = 16777215 | 255 * this.scoreMultiplier / 50 << 24;
                  } else {
                    stackIn_90_0 = -1;
                  }
                  int var11Lifetime1 = stackIn_90_0;
                  jm.levelRingSprites[1 + var8].a(var5, var6, 0, var11Lifetime1, 1);
                }
                bs.upgradeSprites[var7].a(var5, var6);
                if (var10 != 0) {
                  HighscoreQuery.powerBulbSprites[1].a(var5 - 9, -12 + var6, 0, var9 * 16843009, 2);
                }
                if (this.upgradeFlashTicks[var7] > 0) {
                  var9 = this.upgradeFlashTicks[var7];
                  if (!(64 <= var9)) {
                    stackIn_104_0 = var9 << 2;
                  } else if (var9 > 448) {
                    stackIn_104_0 = -(var9 - 512 << 2);
                  } else {
                    stackIn_104_0 = 255;
                  }
                  var9 = stackIn_104_0;
                  var9 = (-var3_int + 256) * var9 >> 8;
                  if (var9 > 0) {
                    PacketBuffer.gameFont.drawText(16777215 | var9 << 24, -1, var5 + 55, ii.field_e[var7], obfuscationGuard ^ -1573, 24 + var6);
                  }
                }
                var6 += 38;
                var7++;
              }
            }
            if (decompiledFrameCompleted0) {
              bo var5_ref_bo = fa.a(renderer, true);
              var6 = 0;
              if (this.multiplierPanelHidePhase > 0) {
                var6 = 40 * (int)(-Math.cos((double)this.multiplierPanelHidePhase * 3.141592653589793 / 200.0) * 128.0) + 5120 >> 8;
              }
              if (this.invulnerabilityCheat &&
                this.debugControlsEnabled) {
                var4_int = (var3_int * 40 >> 8) + var6;
                renderer.d(33, 70, 0 - var4_int, -5782, -65281, sh.field_u - 211);
                var4_int = var3_int * 146 >> 8;
                renderer.d(33, 213, 0, -5782, -65281, -149 + sh.field_u + var4_int);
              }
              var4_int = var6 + (40 * var3_int >> 8);
              ua.counterPanelSprites[1].a(-208 + sh.field_u, -var4_int);
              this.drawRollingDigits(this.displayedMultiplier, 3, -var4_int + 4, true, this.multiplierAnimationTicks, this.targetMultiplier, -167 + sh.field_u, true, 10);
              var4_int = 146 * var3_int >> 8;
              ua.counterPanelSprites[0].a(sh.field_u - 146 + var4_int, 0);
              this.drawRollingDigits(this.displayedScore, 8, 4, false, this.scoreAnimationTicks, this.targetScore, -21 + (sh.field_u + var4_int), false, 10);
              var4_int = 130 * var3_int >> 8;
              this.drawRadar(renderer, var4_int, obfuscationGuard ^ -16732145);
              var4_int = 35 * var3_int >> 8;
              var7 = sh.field_u - 30;
              var8 = var4_int + gp.field_w - 30;
              var9 = 0;
              do {
                if (var9 >= this.lives) {
                  var4_int = var3_int * 80 >> 8;
                  var8 = gp.field_w - 150;
                  var7 = -25 + (sh.field_u + var4_int);
                  ii.gaugeSprites[1][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, 124 + var8, -this.displayedWeaponHeat + var8 + 104, 82);
                  ii.gaugeSprites[1][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.gaugeSprites[1][0].a(var7, var8);
                  var7 = var4_int + (sh.field_u - 50);
                  var8 = -150 + gp.field_w;
                  ii.gaugeSprites[0][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, var8 + 124, -this.displayedHealthPercent + var8 + 101, -92);
                  ii.gaugeSprites[0][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.gaugeSprites[0][0].a(var7, var8);
                  break;
                }
                this.playerAircraft.definition.getSprites(-32275)[4].b(var7, var8, 20, 20);
                var7 -= 20;
                var9++;
              } while (var13 == 0);
              var9 = 0;
              do {
                if (!(var9 < gh.playerDefinition.maximumHitPoints)) {
                  var7 = var4_int + (-80 + sh.field_u);
                  var8 = -151 + gp.field_w;
                  ii.gaugeSprites[2][3].a(var7, var8, 0, 16777215 | this.temporaryWeaponOpacity << 24, 1);
                  var5_ref_bo.a(30 + var7, var7, 135 + var8, -this.displayedTemporaryWeaponTicks + (103 + var8), obfuscationGuard + 20115);
                  ii.gaugeSprites[2][2].a(var7, var8, 0, 16777215 | this.temporaryWeaponOpacity << 24, 1);
                  var5_ref_bo.a(true);
                  ii.gaugeSprites[2][1].a(var7, var8, 0, this.temporaryWeaponOpacity << 24 | 16777215, 1);
                  var9 = (int)((1.0 + Math.sin((double)this.simulationTick * 3.141592653589793 / 20.0)) * (double)this.temporaryWeaponOpacity / 2.0);
                  break;
                }
                var10 = -(var9 * 100 / gh.playerDefinition.maximumHitPoints) + (var8 + 100);
                renderer.b(var10, var7 + 5, var7 + 10, 1879048192, var10, 1);
                renderer.b(var10 + 1, var7 + 5, var7 + 10, 1073741824, var10 + 1, 1);
                var9++;
              } while (var13 == 0);
              bo stackIn_135_0 = var5_ref_bo;
              int stackIn_135_1 = 30 + var7;
              int stackIn_135_2 = var7;
              int stackIn_135_3 = var8 + 135;
              int stackIn_135_4 = 103 + var8 - this.displayedTemporaryWeaponTicks;
              int stackIn_136_5 = (this.displayedTemporaryWeaponTicks >= 99) ? 50 : 0;
              ((bo) (Object) stackIn_135_0).a(stackIn_135_1, stackIn_135_2, stackIn_135_3, stackIn_135_4 - stackIn_136_5, 100);
              ii.gaugeSprites[2][0].a(var7, var8, 0, 16843009 * var9, 2);
              var5_ref_bo.a(true);
              if (this.displayedTemporaryWeaponType > 0) {
                po.powerIconSprites[-1 + this.displayedTemporaryWeaponType].a(var7 + 7, 104 + var8, 0, this.temporaryWeaponOpacity << 24 | 16777215, 1);
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_141_0 = obfuscationGuard;
            stackIn_141_1 = -20240;
          }
          if (stackIn_141_0 != stackIn_141_1) {
            this.multiplierPanelHidePhase = -51;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= this.screenParticleCount))) {
            ScreenParticle var4 = this.screenParticles[var3_int];
            stackIn_173_0 = -1;
            if (var13 == 0) {
              if (stackIn_173_0 > ~var4.durationTicks) {
                var5 = var4.xQ8 >> 8;
                var6 = var4.yQ8 >> 8;
                var7 = var4.radiusQ8 >> 8;
                var8 = (var4.durationTicks - Math.abs(var4.ageTicks)) * var4.alphaScale / var4.durationTicks;
                if (var4.renderMode != 0 ||
                  !(var4.ageTicks < var4.durationTicks)) {
                  if (var4.renderMode == 1) {
                    es.smokeSprites[(var4.durationTicks + var4.alphaScale) % es.smokeSprites.length].a(-var7 + var5, var6 - var7, var7 << 1, var7 << 1, 0, var8 << 24 | 16777215, 1);
                  }
                  boolean decompiledFrameRemainder0 = false;
                }
                else {
                  if (var8 <= 64) {
                    stackIn_170_0 = var8 << 26 | 16711680;
                  } else if (var8 <= 192) {
                    stackIn_170_0 = (-64 + var8 | -1107296384) << 9;
                  } else {
                    stackIn_170_0 = var8 - 192 << 2 | -256;
                  }
                  var9 = stackIn_170_0;
                  renderer.b(var6, var5, var4.previousXQ8 >> 8, var9, var4.previousYQ8 >> 8, obfuscationGuard ^ -20239);
                }
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_173_0 = this.debugControlsEnabled ? 1 : 0;
          }
          if (stackIn_173_0 != 0 &&
            this.manualMusicLayers) {
            PacketBuffer.gameFont.drawCenteredText(119, -16711936, -16777216, 50, sh.field_u - 20, Integer.toString(this.musicLayerPresetIndex));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_183_0 = var3;
          StringBuilder stackIn_183_1 = new StringBuilder().append("pk.V(");
          if (renderer == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void advanceBackground(byte obfuscationGuard, Vector2 cameraMovement) {
        String stackIn_38_2 = null;
        int var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.backgroundTintBlendTicks > 0) {
            this.backgroundTintBlendTicks = this.backgroundTintBlendTicks - 1;
            this.backgroundTint = this.blendArgb(this.backgroundTintBlendTicks, this.previousBackgroundTint, -570490625, this.targetBackgroundTint);
          }
          if (0 < this.lightningCountdown) {
            this.lightningCountdown = this.lightningCountdown - 1;
          }
          if (10 == this.lightningCountdown) {
            lq.a(hp.field_i, -28);
          }
          if (this.lightningCountdown == 0) {
            if (this.lightningRandomBound <= 0) {
              this.lightningCountdown = -1;
              if (var8 != 0) {
                if (qq.a(20, this.lightningRandomBound) >= 10) {
                  this.lightningCountdown = 10 + qq.a(20, this.lightningRandomBound) + (this.lightningRandomBound >> 1);
                  this.lightningCountdown = qq.a(20, 20) + 10;
                } else {
                  this.lightningCountdown = qq.a(20, 20) + 10;
                }
              }
            } else if (qq.a(20, this.lightningRandomBound) >= 10) {
              this.lightningCountdown = 10 + qq.a(20, this.lightningRandomBound) + (this.lightningRandomBound >> 1);
              if (var8 != 0) {
                this.lightningCountdown = qq.a(20, 20) + 10;
              }
            } else {
              this.lightningCountdown = qq.a(20, 20) + 10;
            }
          }
          int var3_int = np.a(-5, 5, (byte) 75);
          int var5 = 125 / ((-14 - obfuscationGuard) / 43);
          FlightBody[] var4 = this.backgroundBodies;
          int var6 = 0;
          while (var6 < var4.length) {
            FlightBody var7 = var4[var6];
            var7.headingOffset = var7.headingOffset + var3_int;
            var7.position.subtract(cameraMovement, -30507);
            var7.advance(2);
            var7.wrapSquare(1300000.0 / this.cameraScale, -87);
            var6++;
            if (var8 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_37_0 = var3;
          StringBuilder stackIn_37_1 = new StringBuilder().append("pk.CA(").append(obfuscationGuard).append(',');
          if (cameraMovement == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final int computeSpatialVolume(Vector2 listenerPosition, int maximumVolumeAndGuard, Vector2 sourcePosition) {
        String stackIn_22_2 = null;
        String stackIn_26_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = maximumVolumeAndGuard;
          if (600.0 >= this.cameraScale) {
            var4_int = 0;
          } else if (this.cameraScale < 1000.0) {
            var4_int = (int)((double)var4_int * (400.0 - (1000.0 - this.cameraScale)) / 400.0);
            if (var6 != 0) {
              var4_int = 0;
            }
          }
          if (listenerPosition == sourcePosition) {
            int stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          int var5 = (int)sb.a(maximumVolumeAndGuard ^ 157, listenerPosition, sourcePosition);
          if (var5 > 1000) {
            var4_int = 0;
          }
          if ((var5 <= 1000 ||
            var6 != 0) &&
            var5 > 10) {
            var4_int = var4_int * (-var5 + 10 + 990) / 990;
          }
          int stackIn_17_0 = var4_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          RuntimeException stackIn_21_0 = var4;
          StringBuilder stackIn_21_1 = new StringBuilder().append("pk.EA(");
          if (listenerPosition == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          StringBuilder stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(maximumVolumeAndGuard).append(',');
          if (sourcePosition == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void emitSmoke(int lifetimeTicks, Vector2 position, byte obfuscationGuard, int colourOrBlastRadius) {
        String stackIn_13_2 = null;
        try {
          if (this.smokeParticles.length <= this.smokeParticleCount) {
            return;
          }
          SmokeParticle var5 = this.smokeParticles[this.smokeParticleCount];
          if (obfuscationGuard != -74) {
            this.manualMusicLayers = false;
          }
          if (var5 == null) {
            SmokeParticle dupTemp$1 = new SmokeParticle();
            this.smokeParticles[this.smokeParticleCount] = dupTemp$1;
            var5 = dupTemp$1;
          }
          var5.spawn(-32, position, colourOrBlastRadius, lifetimeTicks);
          this.smokeParticleCount = this.smokeParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("pk.R(").append(lifetimeTicks).append(',');
          if (position == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(',').append(colourOrBlastRadius).append(')').toString());
        }
    }

    private final void setMusicLayersImmediately(int obfuscationGuard) {
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.gameMusic != null &&
            !this.alternateMusicActive) {
            if (obfuscationGuard != 11154) {
              this.cameraLookAheadX = 0.030616966813019907;
            }
            int var2_int = 0;
            while (16 > var2_int) {
              if (var3 != 0) {
                return;
              }
              int[] stackIn_19_0 = this.musicChannelVolumes;
              int stackIn_19_1 = var2_int;
              int stackIn_20_2 = (sd.musicLayerPresets[this.musicLayerPresetIndex][var2_int]) ? 255 : 0;
              stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              this.gameMusic.a((byte) -120, this.musicChannelVolumes[var2_int], var2_int);
              var2_int++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2), "pk.IA(" + obfuscationGuard + ')');
        }
    }

    private final void selectAircraftTarget(Aircraft aircraft, int obfuscationGuard) {
        Aircraft stackIn_88_0 = null;
        Object stackIn_153_0 = null;
        Aircraft stackIn_153_1 = null;
        Aircraft stackIn_178_0 = null;
        Aircraft stackIn_178_1 = null;
        String stackIn_184_2 = null;
        Aircraft[] aircraftCandidates = null;
        int var4 = 0;
        Aircraft candidateAircraft = null;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.attractMode) {
            boolean decompiledFrameRemainder0 = true;
            if (null != aircraft.targetAircraft) {
              if (aircraft.targetAircraft.lifecyclePhase <= 2) {
                aircraft.targetAircraft = null;
                decompiledFrameRemainder0 = (obfuscationControl != 0);
              }
              if (decompiledFrameRemainder0) {
                return;
              }
            }
            int var3_int = qq.a(20, this.aircraft.length);
            if (null != this.aircraft[var3_int]) {
              int stackIn_19_0 = (gh.playerDefinition != aircraft.definition) ? 0 : 1;
              int stackIn_23_1 = (this.aircraft[var3_int].definition != gh.playerDefinition) ? 0 : 1;
              if ((stackIn_19_0 ^ stackIn_23_1) != 0) {
                aircraft.targetAircraft = this.aircraft[var3_int];
              }
            }
          }
          if (this.arcadeMode) {
            aircraft.targetAircraft = this.playerAircraft;
            return;
          }
          if (obfuscationGuard > -69) {
            this.invulnerabilityCheat = true;
          }
          boolean decompiledFrameCompleted0 = true;
          regionExit1: {
            boolean decompiledFrameCompleted1 = true;
            regionExit2: {
              if (ro.field_u == aircraft.definition) {
                if (aircraft.targetAircraft != null) {
                  return;
                }
                aircraftCandidates = this.aircraft;
                var4 = 0;
                while (var4 < aircraftCandidates.length) {
                  candidateAircraft = aircraftCandidates[var4];
                  stackIn_153_0 = null;
                  stackIn_153_1 = candidateAircraft;
                  if (obfuscationControl != 0) {
                    while (true) {
                      if (stackIn_153_0 != stackIn_153_1 && (!(2 >= candidateAircraft.lifecyclePhase) ||
                        obfuscationControl != 0) && (candidateAircraft.definition == gh.playerDefinition &&
                        candidateAircraft.targetAircraft != aircraft &&
                        candidateAircraft.pursuingAircraft == null)) {
                        break regionExit2;
                      }
                      do {
                        var4++;
                        if (obfuscationControl != 0) {
                          break regionExit1;
                        }
                        if (aircraftCandidates.length <= var4) {
                          break regionExit1;
                        }
                        candidateAircraft = aircraftCandidates[var4];
                        stackIn_178_0 = this.playerAircraft;
                        stackIn_178_1 = candidateAircraft;
                      } while (stackIn_178_0 == stackIn_178_1);
                      stackIn_153_0 = null;
                      stackIn_153_1 = candidateAircraft;
                    }
                  }
                  if (stackIn_153_0 != stackIn_153_1 &&
                    candidateAircraft.lifecyclePhase > 2 &&
                    this.playerAircraft != candidateAircraft &&
                    candidateAircraft.definition != ro.field_u &&
                    candidateAircraft.definition != gh.playerDefinition) {
                    if (aircraft.targetAircraft != null) {
                      aircraft.targetAircraft.pursuingAircraft = null;
                    }
                    aircraft.targetAircraft = candidateAircraft;
                    return;
                  }
                  var4++;
                  if (obfuscationControl == 0) {
                    continue;
                  }
                  break;
                }
                aircraftCandidates = this.aircraft;
                var4 = 0;
                while (true) {
                  if (aircraftCandidates.length > var4) {
                    candidateAircraft = aircraftCandidates[var4];
                    stackIn_88_0 = candidateAircraft;
                    if (obfuscationControl == 0) {
                      if (stackIn_88_0 != null &&
                        2 < candidateAircraft.lifecyclePhase &&
                        this.playerAircraft != candidateAircraft &&
                        ro.field_u != candidateAircraft.definition) {
                        if (aircraft.targetAircraft != null) {
                          aircraft.targetAircraft.pursuingAircraft = null;
                        }
                        aircraft.targetAircraft = candidateAircraft;
                        return;
                      }
                      var4++;
                      continue;
                    }
                  } else {
                    aircraft.targetAircraft = this.playerAircraft;
                    stackIn_88_0 = this.playerAircraft;
                  }
                  break;
                }
                stackIn_88_0.pursuingAircraft = aircraft;
              }
              if (gh.playerDefinition == aircraft.definition) {
                if (null != aircraft.targetAircraft) {
                  return;
                }
                aircraftCandidates = this.aircraft;
                var4 = 0;
                while (var4 < aircraftCandidates.length) {
                  candidateAircraft = aircraftCandidates[var4];
                  if (obfuscationControl != 0) {
                    return;
                  }
                  if (candidateAircraft != null &&
                    candidateAircraft.lifecyclePhase > 2 && (gh.playerDefinition != candidateAircraft.definition ||
                    obfuscationControl != 0) && (aircraft != candidateAircraft.targetAircraft &&
                    candidateAircraft.pursuingAircraft == null)) {
                    if (aircraft.targetAircraft != null) {
                      aircraft.targetAircraft.pursuingAircraft = null;
                    }
                    aircraft.targetAircraft = candidateAircraft;
                    candidateAircraft.pursuingAircraft = aircraft;
                    return;
                  }
                  var4++;
                }
                if (obfuscationControl == 0) {
                  return;
                }
              }
              if (aircraft == this.playerAircraft.pursuingAircraft) {
                return;
              }
              if (this.playerAircraft.pursuingAircraft == null) {
                if (aircraft.targetAircraft != null) {
                  aircraft.targetAircraft.pursuingAircraft = null;
                }
                this.playerAircraft.pursuingAircraft = aircraft;
                aircraft.targetAircraft = this.playerAircraft;
                return;
              }
              if (aircraft.targetAircraft != this.playerAircraft &&
                null != aircraft.targetAircraft) {
                return;
              }
              aircraftCandidates = this.aircraft;
              var4 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (aircraftCandidates.length <= var4))) {
                candidateAircraft = aircraftCandidates[var4];
                stackIn_178_0 = this.playerAircraft;
                stackIn_178_1 = candidateAircraft;
                if (obfuscationControl != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_178_0 != stackIn_178_1) {
                  stackIn_153_0 = null;
                  stackIn_153_1 = candidateAircraft;
                  if (stackIn_153_0 != stackIn_153_1 && (!(2 >= candidateAircraft.lifecyclePhase) ||
                    obfuscationControl != 0) && (candidateAircraft.definition == gh.playerDefinition &&
                    candidateAircraft.targetAircraft != aircraft &&
                    candidateAircraft.pursuingAircraft == null)) {
                    break;
                  }
                }
                var4++;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted1 = false;
              }
            }
            if (decompiledFrameCompleted1 &&
              decompiledFrameCompleted0) {
              if (aircraft.targetAircraft != null) {
                aircraft.targetAircraft.pursuingAircraft = null;
              }
              candidateAircraft.pursuingAircraft = aircraft;
              aircraft.targetAircraft = candidateAircraft;
              return;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_178_0 = (Aircraft) (aircraft);
            stackIn_178_1 = this.playerAircraft;
          }
          stackIn_178_0.targetAircraft = stackIn_178_1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3_ref = decompiledCaughtParameter0;
          RuntimeException stackIn_183_0 = var3_ref;
          StringBuilder stackIn_183_1 = new StringBuilder().append("pk.O(");
          if (aircraft == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void startArcadeWave(byte obfuscationGuard, int waveNumber) {
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.backgroundTintBlendTicks = 255;
          this.previousBackgroundTint = this.backgroundTint;
          int var3_int = qq.a(obfuscationGuard - 8, 220);
          int var4 = qq.a(20, 200);
          int var4Lifetime1 = 152;
          int var5 = qq.a(obfuscationGuard ^ 8, 128);
          if (obfuscationGuard != 28) {
            this.advanceDestroyedAircraft(true, (Aircraft) null);
          }
          int var5Lifetime1 = 127;
          int var3_intLifetime1 = 192;
          this.targetBackgroundTint = var3_intLifetime1 << 24 | this.blendArgb(var4Lifetime1, 0, obfuscationGuard ^ -570490653, this.blendArgb(var5Lifetime1, 255, obfuscationGuard ^ -570490653, 16777215));
          if (var3_intLifetime1 > 190 &&
            var4Lifetime1 > 150) {
            this.lightningRandomBound = qq.a(obfuscationGuard ^ 8, 255) + 100;
            if (this.lightningCountdown == -1) {
              this.lightningCountdown = this.lightningRandomBound;
              if (obfuscationControl != 0) {
                this.lightningRandomBound = -1;
              }
            }
          } else {
            this.lightningRandomBound = -1;
          }
          int[] aircraftCosts = new int[]{1, 3, 4, 6, 8, 20};
          waveNumber = waveNumber << 1;
          int remainingPickupCarriers = 2;
          while (waveNumber > 0) {
            if (obfuscationControl != 0) {
              return;
            }
            int typeIndex = 0;
            while (aircraftCosts.length > typeIndex) {
              int stackIn_29_0 = waveNumber >> 1;
              int stackIn_29_1 = aircraftCosts[typeIndex];
              if (stackIn_29_0 >= stackIn_29_1) {
                typeIndex++;
                continue;
              }
              break;
            }
            int stackIn_29_0Lifetime1 = 0;
            int stackIn_29_1Lifetime1 = typeIndex;
            if (stackIn_29_0Lifetime1 < stackIn_29_1Lifetime1) {
              typeIndex--;
            }
            waveNumber = waveNumber - aircraftCosts[typeIndex];
            int discarded$0 = this.spawnAircraft((byte) -120, this.getArcadeAircraftDefinition((byte) 108, typeIndex), 1, remainingPickupCarriers);
            if (remainingPickupCarriers > 0) {
              remainingPickupCarriers--;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var3), "pk.S(" + obfuscationGuard + ',' + waveNumber + ')');
        }
    }

    final void startGame(int obfuscationGuard, boolean arcadeMode) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.alternateMusicActive = false;
          lm.a(40, tg.musicTracks[1], true, (byte) -58);
          this.gameMusic = DualLinkNode.field_e.field_s;
          this.musicLayerPresetIndex = 0;
          this.setMusicLayersImmediately(11154);
          this.stopAircraftEngineSounds(true);
          this.arcadeMode = arcadeMode;
          to.lastScoreSubmission = null;
          this.simulationTick = 0;
          wd.hudMessages.clear(268435455);
          if (obfuscationGuard <= 59) {
            return;
          }
          bo.field_h = 0;
          gh.playerDefinition.maximumSpeed = ub.basePlayerDefinition.maximumSpeed;
          this.fireRateUpgradeLevel = 0;
          this.targetUpgradeCredits = 0;
          this.multiplierPanelHidePhase = 200;
          ei.field_a = 0;
          this.targetScore = 0;
          this.turnRateUpgradeLevel = 0;
          this.upgradeCredits = 0;
          this.scoreMultiplier = 1;
          this.invulnerabilityCheat = false;
          this.targetMultiplier = 1;
          gh.playerDefinition.turnRate = ub.basePlayerDefinition.turnRate;
          or.score = 0;
          se.field_b = 0;
          this.healthUpgradeLevel = 0;
          this.displayedUpgradeCredits = 0;
          NetworkGameClient.field_x = 0;
          gh.playerDefinition.maximumHitPoints = ub.basePlayerDefinition.maximumHitPoints;
          this.displayedScore = 0;
          gh.playerDefinition.fireInterval = ub.basePlayerDefinition.fireInterval;
          r.field_n = 0;
          this.speedUpgradeLevel = 0;
          this.displayedMultiplier = 1;
          gh.playerDefinition.heatReduction = ub.basePlayerDefinition.heatReduction;
          Aircraft var3 = this.playerAircraft;
          this.playerAircraft = new Aircraft(new Vector2(), gh.playerDefinition);
          this.playerAircraft.engineSound = po.a(this.computeSpatialVolume(this.playerAircraft.position, 200, this.playerAircraft.position), 0, this.playerAircraft.definition.getEngineSample((byte) -88));
          this.aircraft = new Aircraft[16];
          this.bullets = new Bullet[1000];
          this.smokeParticleCount = 0;
          this.bulletCount = 0;
          this.pickups = new Pickup[16];
          this.pickupCount = 0;
          this.smokeParticles = new SmokeParticle[1000];
          this.noLivesLost = true;
          if (null != var3) {
            this.playerAircraft.heading = var3.heading;
          }
          this.aircraft[0] = this.playerAircraft;
          int var4 = 0;
          do {
            if (var4 >= this.upgradeFlashTicks.length) {
              this.completedWaveCount = 0;
              this.respawnInvulnerabilityTicks = 120;
              this.shotsFired = 0;
              this.respawnDelayTicks = 80;
              this.classicWaveIndex = 0;
              this.shotsHit = 0;
              tt.field_a = false;
              this.lives = 3;
              break;
            }
            this.upgradeFlashTicks[var4] = -1;
            var4++;
          } while (var5 == 0);
          if (!this.arcadeMode) {
            this.startClassicWave(-20416);
            if (var5 != 0) {
              this.startArcadeWave((byte) 28, 1);
            }
          } else {
            this.startArcadeWave((byte) 28, 1);
          }
          this.attractMode = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.F(" + obfuscationGuard + ',' + arcadeMode + ')');
        }
    }

    private final void advanceBullets(Vector2 cameraMovement, byte obfuscationGuard) {
        String stackIn_173_2 = null;
        int var5 = 0;
        Aircraft[] var6_ref_md__ = null;
        int var7 = 0;
        Aircraft var8 = null;
        Object stackIn_11_0Lifetime1;
        Aircraft stackIn_11_1Lifetime1;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -93) {
            return;
          }
          int var3_int = 0;
          while (var3_int < this.bulletCount) {
            Bullet var4 = this.bullets[var3_int];
            if (var9 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted1 = true;
            if (null != var4) {
              Object stackIn_11_0 = null;
              Aircraft stackIn_11_1 = var4.sourceAircraft;
              if (stackIn_11_0 == stackIn_11_1 ||
                !uh.a(98, var4.sourceAircraft.position, 600.0, var4.position)) {
                this.removeBullet(73, var3_int);
                var3_int--;
                decompiledFrameRemainder0 = false;
              }
              else {
                var4.position.subtract(cameraMovement, -30507);
                var4.advance(obfuscationGuard + 95);
                var5 = 0;
                if (null != var4.sourceAircraft) {
                  if (ro.field_u == var4.sourceAircraft.definition) {
                    Aircraft[] var6_ref_md__Lifetime2 = this.aircraft;
                    int var7Lifetime2 = 0;
                    scanLoop1: while (true) {
                      if (var6_ref_md__Lifetime2.length > var7Lifetime2) {
                        Aircraft var8Lifetime2 = var6_ref_md__Lifetime2[var7Lifetime2];
                        Object stackIn_11_0Lifetime1Lifetime1 = null;
                        Aircraft stackIn_11_1Lifetime1Lifetime1 = var8Lifetime2;
                        if (stackIn_11_0Lifetime1Lifetime1 != stackIn_11_1Lifetime1Lifetime1 &&
                          0 < var8Lifetime2.hitPoints && ((ro.field_u != var8Lifetime2.definition ||
                          var9 != 0) &&
                          (this.playerAircraft != var8Lifetime2 ||
                          this.respawnInvulnerabilityTicks <= 0 ||
                          var9 != 0)) && uh.a(obfuscationGuard + 199, var8Lifetime2.position, (double)(2 * var8Lifetime2.definition.collisionRadius), var4.position)) {
                          var8Lifetime2.hitPoints = var8Lifetime2.hitPoints - 1;
                          var5 = 1;
                          var8Lifetime2.damageSmokeTicks = 256;
                          if (var8Lifetime2.hitPoints != 0) {
                            break scanLoop1;
                          }
                          if (var8Lifetime2.dropPickupCode <= -1) {
                            break scanLoop1;
                          }
                          this.emitPickup(var8Lifetime2.position, 32597, var8Lifetime2.dropPickupCode);
                          var8Lifetime2.dropPickupCode = -1;
                          break scanLoop1;
                        }
                        var7Lifetime2++;
                        continue;
                      }
                      break;
                    }
                  } else if (var4.sourceAircraft.definition != gh.playerDefinition) {
                    var6_ref_md__ = this.aircraft;
                    var7 = 0;
                    scanLoop2: while (true) {
                      if (var6_ref_md__.length > var7) {
                        var8 = var6_ref_md__[var7];
                        stackIn_11_0Lifetime1 = null;
                        stackIn_11_1Lifetime1 = var8;
                        if (stackIn_11_0Lifetime1 != stackIn_11_1Lifetime1 &&
                          var8.hitPoints > 0 && ((var8.definition == gh.playerDefinition ||
                          var9 != 0) &&
                          (this.playerAircraft != var8 ||
                          this.respawnInvulnerabilityTicks <= 0) &&
                          (uh.a(obfuscationGuard + 217, var8.position, (double)(2 * var8.definition.collisionRadius), var4.position) ||
                          var9 != 0))) {
                          var8.damageSmokeTicks = 256;
                          var8.hitPoints = var8.hitPoints - 1;
                          var5 = 1;
                          break scanLoop2;
                        }
                        var7++;
                        continue;
                      }
                      break;
                    }
                  } else {
                    var6_ref_md__ = this.aircraft;
                    var7 = 0;
                    scanLoop3: while (true) {
                      if (var7 < var6_ref_md__.length) {
                        var8 = var6_ref_md__[var7];
                        stackIn_11_0Lifetime1 = null;
                        stackIn_11_1Lifetime1 = var8;
                        if (stackIn_11_0Lifetime1 != stackIn_11_1Lifetime1 && (!(var8.hitPoints <= 0) ||
                          var9 != 0) && var8.definition != gh.playerDefinition && (uh.a(obfuscationGuard + 185, var8.position, (double)(var8.definition.collisionRadius * 2), var4.position) ||
                          var9 != 0)) {
                          if (var4.sourceAircraft == this.playerAircraft) {
                            this.shotsHit = this.shotsHit + 1;
                          }
                          var8.hitPoints = var8.hitPoints - 1;
                          var5 = 1;
                          var8.damageSmokeTicks = 256;
                          int stackIn_82_1 = (this.playerAircraft == var4.sourceAircraft) ? 50 : 25;
                          this.addScore(stackIn_82_1 * this.scoreMultiplier, -54);
                          if (var8.hitPoints != 0) {
                            break scanLoop3;
                          }
                          if (var8.dropPickupCode <= -1) {
                            break scanLoop3;
                          }
                          this.emitPickup(var8.position, obfuscationGuard + 32690, var8.dropPickupCode);
                          var8.dropPickupCode = -1;
                          break scanLoop3;
                        }
                        var7++;
                        continue;
                      }
                      break;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  Aircraft[] var6_ref_md__Lifetime1 = this.aircraft;
                  int var7Lifetime1 = 0;
                  while (var7Lifetime1 < var6_ref_md__Lifetime1.length) {
                    Aircraft var8Lifetime1 = var6_ref_md__Lifetime1[var7Lifetime1];
                    Object stackIn_11_0Lifetime2 = null;
                    Aircraft stackIn_11_1Lifetime2 = var8Lifetime1;
                    if (stackIn_11_0Lifetime2 != stackIn_11_1Lifetime2 && (!(0 >= var8Lifetime1.hitPoints) ||
                      var9 != 0) && gh.playerDefinition != var8Lifetime1.definition && (this.playerAircraft != var8Lifetime1 ||
                      0 >= this.respawnInvulnerabilityTicks ||
                      var9 != 0) && (uh.a(122, var8Lifetime1.position, (double)(var8Lifetime1.definition.collisionRadius * 2), var4.position) ||
                      var9 != 0)) {
                      var8Lifetime1.hitPoints = var8Lifetime1.hitPoints - 1;
                      var8Lifetime1.damageSmokeTicks = 256;
                      var5 = 1;
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    var7Lifetime1++;
                  }
                  decompiledFrameRemainder1 = !(decompiledFrameCompleted1);
                }
              }
            }
            if (decompiledFrameRemainder1 &&
              decompiledFrameRemainder0 &&
              decompiledFrameCompleted1) {
              while (true) {
                this.removeBullet(73, var3_int);
                var3_int--;
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0 &&
              var5 != 0) {
              var4.advance(2);
              this.emitSmoke(80, var4.position, (byte) -74, -20);
              int var6 = this.computeSpatialVolume(this.playerAircraft.position, obfuscationGuard + 293, var4.position);
              if (var6 < 1) {
                return;
              }
              bo.a(lp.field_g, var6, 23187);
              this.removeBullet(42, var3_int);
              var3_int--;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_172_0 = var3;
          StringBuilder stackIn_172_1 = new StringBuilder().append("pk.C(");
          if (cameraMovement == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void removeScorchMark(int index, int obfuscationGuard) {
        try {
          this.scorchMarkCount = this.scorchMarkCount - 1;
          if (~index == ~this.scorchMarkCount) {
            return;
          }
          ScorchMark var3 = this.scorchMarks[index];
          this.scorchMarks[index] = this.scorchMarks[this.scorchMarkCount];
          if (obfuscationGuard != 10355) {
            this.invulnerabilityCheat = false;
          }
          this.scorchMarks[this.scorchMarkCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.M(" + index + ',' + obfuscationGuard + ')');
        }
    }

    private final void fireBullets(byte obfuscationGuard, Aircraft aircraft) {
        String stackIn_75_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var3_int = aircraft.definition.gunPattern;
          if (1 == aircraft.temporaryWeapon) {
            var3_int = 1;
          }
          if (aircraft.temporaryWeapon == 2) {
            var3_int = 2;
          }
          if (this.bulletCount >= -var3_int + this.bullets.length) {
            return;
          }
          Bullet var4 = this.bullets[this.bulletCount];
          int var5 = aircraft.definition.aimSpread;
          double var6 = (double)np.a(-var5, var5, (byte) 83) / 300.0;
          if (var3_int != 1) {
            if (var4 == null) {
              Bullet dupTemp$0 = new Bullet();
              this.bullets[this.bulletCount] = dupTemp$0;
              var4 = dupTemp$0;
            }
            var4.spawn(0, 0, var6, aircraft);
            this.bulletCount = this.bulletCount + 1;
            if (aircraft == this.playerAircraft) {
              this.shotsFired = this.shotsFired + 1;
            }
          }
          if (obfuscationGuard < 9) {
            this.rightHeldLastTick = true;
          }
          if (0 < var3_int) {
            double var6Lifetime1 = (double)np.a(-var5, var5, (byte) 83) / 100.0;
            Bullet var4Lifetime1 = this.bullets[this.bulletCount];
            if (var4Lifetime1 == null) {
              Bullet dupTemp$1 = new Bullet();
              this.bullets[this.bulletCount] = dupTemp$1;
              var4Lifetime1 = dupTemp$1;
            }
            Bullet stackIn_31_0 = var4Lifetime1;
            int stackIn_31_1 = aircraft.definition.collisionRadius;
            int stackIn_31_2 = 0;
            int stackIn_32_3 = (2 != var3_int) ? 0 : 10;
            ((Bullet) (Object) stackIn_31_0).spawn(stackIn_31_1, stackIn_31_2, (double)stackIn_32_3 + var6Lifetime1, aircraft);
            this.bulletCount = this.bulletCount + 1;
            Bullet var4Lifetime1Lifetime1 = this.bullets[this.bulletCount];
            double var6Lifetime1Lifetime1 = (double)np.a(-var5, var5, (byte) -67) / 100.0;
            if (var4Lifetime1Lifetime1 == null) {
              Bullet dupTemp$2 = new Bullet();
              this.bullets[this.bulletCount] = dupTemp$2;
              var4Lifetime1Lifetime1 = dupTemp$2;
            }
            Bullet stackIn_39_0 = var4Lifetime1Lifetime1;
            int stackIn_39_1 = -aircraft.definition.collisionRadius;
            int stackIn_39_2 = 0;
            int stackIn_40_3 = (var3_int == 2) ? -10 : 0;
            ((Bullet) (Object) stackIn_39_0).spawn(stackIn_39_1, stackIn_39_2, (double)stackIn_40_3 + var6Lifetime1Lifetime1, aircraft);
            if (aircraft == this.playerAircraft) {
              this.shotsFired = this.shotsFired + 2;
            }
            this.bulletCount = this.bulletCount + 1;
          }
          int var8 = this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position);
          if (var8 < 1) {
            return;
          }
          if (ro.field_u != aircraft.definition) {
            if (aircraft.temporaryWeapon == 3) {
              bo.a(fd.field_b[3], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            if (var3_int == 2) {
              bo.a(fd.field_b[2], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            if (1 != var3_int) {
              bo.a(fd.field_b[0], var8, 23187);
              if (var9 == 0) {
                return;
              }
            }
            bo.a(fd.field_b[1], var8, 23187);
            if (var9 == 0) {
              return;
            }
          }
          bo.a(fd.field_b[4], var8, 23187);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_74_0 = var3;
          StringBuilder stackIn_74_1 = new StringBuilder().append("pk.T(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final void emitAircraftScorchMark(Aircraft aircraft, int obfuscationGuard) {
        String stackIn_8_2 = null;
        try {
          int var3_int = (int)(aircraft.position.x / 3.0);
          int var4 = (int)(aircraft.position.y / 3.0);
          int var5 = (int)(this.backgroundPanX - (double)(1720 * this.backgroundTileX));
          int var6 = (int)(this.backgroundPanY - (double)(1280 * this.backgroundTileY));
          this.emitScorchMark(-var6 + var4, obfuscationGuard - 22703, -var5 + var3_int, aircraft.definition.collisionRadius << 2);
          if (obfuscationGuard != 8073) {
            this.drawHud((GraphicsRenderer) null, -110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_7_0 = runtimeException;
          StringBuilder stackIn_7_1 = new StringBuilder().append("pk.J(");
          if (aircraft == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void drawRollingDigits(int settledValue, int digitCount, int top, boolean suppressLeadingZeros, int remainingAnimationTicks, int targetValue, int right, boolean alternateGlyphBank, int obfuscationGuard) {
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int foldHeight = (int)(Math.cos(3.141592653589793 * (double)remainingAnimationTicks / 20.0) * 10.0);
          int shadeAlpha = (int)(100.0 * Math.sin(3.141592653589793 * (double)remainingAnimationTicks / 20.0));
          GraphicsRenderer renderer = rendererManager.a((byte) 95);
          int settledBankPending = alternateGlyphBank ? 1 : 0;
          int targetBankPending = alternateGlyphBank ? 1 : 0;
          if (obfuscationGuard != 10) {
            this.startClassicWave(94);
          }
          int stackIn_8_0 = (alternateGlyphBank) ? 0 : 1;
          int skipZeroSuppression = stackIn_8_0;
          scanLoop1: while (true) {
            int settledGlyphIndex = settledValue % 10;
            int targetGlyphIndex = targetValue % 10;
            if (suppressLeadingZeros &&
              skipZeroSuppression == 0) {
              if (0 == targetValue) {
                targetGlyphIndex = 10;
                if (targetBankPending != 0) {
                  targetGlyphIndex += 22;
                }
                targetBankPending = 0;
              }
              if ((0 != targetValue ||
                obfuscationControl != 0) &&
                alternateGlyphBank) {
                targetGlyphIndex += 22;
              }
              if (0 == settledValue) {
                settledGlyphIndex = 10;
                if (settledBankPending != 0) {
                  settledGlyphIndex += 22;
                }
                settledBankPending = 0;
                if (obfuscationControl != 0 &&
                  alternateGlyphBank) {
                  settledGlyphIndex += 22;
                }
              } else if (alternateGlyphBank) {
                settledGlyphIndex += 22;
              }
            }
            skipZeroSuppression = 0;
            in.scoreDigitSprites[targetGlyphIndex].a(right, top);
            in.scoreDigitSprites[settledGlyphIndex + 11].a(right, 10 + top);
            do {
              if (~targetGlyphIndex != ~settledGlyphIndex) {
                boolean drawSettledFold = !(foldHeight >= 0);
                if (!drawSettledFold) {
                  in.scoreDigitSprites[11 + targetGlyphIndex].b(right, 10 + top, 16, foldHeight);
                  renderer.d(foldHeight, 16, top + 10, -5782, shadeAlpha << 24 | 16777215, right);
                  drawSettledFold = (obfuscationControl != 0);
                }
                if (drawSettledFold) {
                  in.scoreDigitSprites[settledGlyphIndex].b(right, foldHeight + 10 + top, 16, -foldHeight);
                  renderer.d(-foldHeight, 16, top + 10 + foldHeight, -5782, (shadeAlpha | -739482368) << 24, right);
                }
              }
              settledValue = settledValue / 10;
              targetValue = targetValue / 10;
              digitCount--;
              right -= 17;
              if (digitCount > 0) {
                continue scanLoop1;
              }
            } while (obfuscationControl != 0);
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.HB(" + settledValue + ',' + digitCount + ',' + top + ',' + suppressLeadingZeros + ',' + remainingAnimationTicks + ',' + targetValue + ',' + right + ',' + alternateGlyphBank + ',' + obfuscationGuard + ')');
        }
    }

    private final void removeSmokeParticle(int index, int obfuscationGuard) {
        try {
          this.smokeParticleCount = this.smokeParticleCount - 1;
          if (index == this.smokeParticleCount) {
            return;
          }
          if (obfuscationGuard != -690800984) {
            this.respawnDelayTicks = -99;
          }
          SmokeParticle var3 = this.smokeParticles[index];
          this.smokeParticles[index] = this.smokeParticles[this.smokeParticleCount];
          this.smokeParticles[this.smokeParticleCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3_ref = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.JA(" + index + ',' + obfuscationGuard + ')');
        }
    }

    private final void removeScreenParticle(byte obfuscationGuard, int index) {
        try {
          this.screenParticleCount = this.screenParticleCount - 1;
          if (index == this.screenParticleCount) {
            return;
          }
          ScreenParticle var3 = this.screenParticles[index];
          this.screenParticles[index] = this.screenParticles[this.screenParticleCount];
          this.screenParticles[this.screenParticleCount] = var3;
          if (obfuscationGuard != -94) {
            this.updatePlayerControls((byte) -55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.A(" + obfuscationGuard + ',' + index + ')');
        }
    }

    final void submitFinalScore(int obfuscationGuard) {
        try {
          if (to.lastScoreSubmission == null &&
            this.finalScore > 0 &&
            !tt.field_a) {
            int stackIn_13_2 = (this.arcadeMode) ? 1 : 0;
            int stackIn_15_3 = 65535;
            int stackIn_16_4 = (!this.arcadeMode) ? 0 : 1;
            to.lastScoreSubmission = new ScoreSubmission(stackIn_13_2, stackIn_15_3 ^ stackIn_16_4, NetworkGameClient.field_x, bo.field_h, se.field_b, ei.field_a, new int[]{100 * this.finalScore + this.finalAccuracyPercent});
            if (!cn.b(true)) {
              ClientException.queueScoreSubmission(to.lastScoreSubmission, true, 3);
            }
          }
          if (obfuscationGuard != -8) {
            this.musicChannelVolumes = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2), "pk.GA(" + obfuscationGuard + ')');
        }
    }

    private final void handleKeyEvent(byte obfuscationGuard) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          se.field_b = se.field_b + 8;
          ei.field_a = ei.field_a - 3;
          bo.field_h = bo.field_h - 5;
          NetworkGameClient.field_x = NetworkGameClient.field_x + 10;
          if (!this.attractMode) {
            if (!this.arcadeMode &&
              bk.lastKeyCode >= 16 &&
              22 >= bk.lastKeyCode) {
              this.purchaseUpgrade(1, bk.lastKeyCode - 16);
              return;
            }
            if (bk.lastKeyCode == 13 &&
              !this.paused) {
              this.paused = true;
              Bullet.requestMenu((byte) 111, 1, false);
              return;
            }
            if (this.debugControlsEnabled &&
              lp.heldKeys[81]) {
              if (bk.lastKeyCode == 5) {
                tt.field_a = true;
                this.manualMusicLayers = false;
              }
              if (bk.lastKeyCode == 7) {
                this.manualMusicLayers = true;
                if (this.musicLayerPresetIndex < -1 + sd.musicLayerPresets.length) {
                  this.musicLayerPresetIndex = this.musicLayerPresetIndex + 1;
                }
                tt.field_a = true;
              }
              if (bk.lastKeyCode == 6) {
                this.manualMusicLayers = true;
                if (this.musicLayerPresetIndex > 0) {
                  this.musicLayerPresetIndex = this.musicLayerPresetIndex - 1;
                }
                tt.field_a = true;
              }
              if (bk.lastKeyCode == 1) {
                this.displayedTemporaryWeaponType = 1;
                tt.field_a = true;
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.playerAircraft.temporaryWeapon = 1;
              }
              if (bk.lastKeyCode == 2) {
                tt.field_a = true;
                this.displayedTemporaryWeaponType = 2;
                this.playerAircraft.temporaryWeapon = 2;
                this.playerAircraft.temporaryWeaponTicks = 100;
              }
              if (bk.lastKeyCode == 3) {
                tt.field_a = true;
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.displayedTemporaryWeaponType = 3;
                this.playerAircraft.temporaryWeapon = 3;
              }
              if (8 == bk.lastKeyCode) {
                this.lives = this.lives + 1;
                tt.field_a = true;
                this.playerAircraft.hitPoints = 0;
              }
              if (bk.lastKeyCode == 4) {
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.displayedTemporaryWeaponType = 4;
                tt.field_a = true;
                this.playerAircraft.temporaryWeapon = 4;
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted1 = true;
              if (70 == bk.lastKeyCode) {
                this.upgradeCredits = 400;
                tt.field_a = true;
                wd.hudMessages.clear(268435455);
                int var2_int = -1;
                while (var2_int < 8) {
                  MenuScreen.field_g.addLast(95, new iq(var2_int));
                  var2_int++;
                  if (var5 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
              }
              if (decompiledFrameCompleted1 &&
                (decompiledFrameRemainder1 = (bk.lastKeyCode == 38))) {
                tt.field_a = true;
              }
              if (decompiledFrameRemainder1) {
                int discarded$0 = this.spawnAircraft((byte) 108, ro.field_u, 1, 0);
              }
              if (bk.lastKeyCode == 51) {
                tt.field_a = true;
                or.score = or.score + 13;
              }
              if (bk.lastKeyCode == 65) {
                tt.field_a = true;
                this.scoreMultiplier = this.scoreMultiplier + 1;
              }
              if (bk.lastKeyCode == 49) {
                tt.field_a = true;
                int discarded$1 = this.spawnAircraft((byte) -123, ju.field_k, 1, 0);
              }
              if (bk.lastKeyCode == 41) {
                tt.field_a = true;
                this.emitPickup(new Vector2(100.0, 100.0), 32597, 2);
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if (bk.lastKeyCode == 33) {
                tt.field_a = true;
                Aircraft[] var2 = this.aircraft;
                int var3 = 0;
                while (var3 < var2.length) {
                  Aircraft var4 = var2[var3];
                  if (var5 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if ((var4 != null ||
                    var5 != 0) &&
                    var4.definition != gh.playerDefinition) {
                    var4.hitPoints = 0;
                  }
                  var3++;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (56 == bk.lastKeyCode);
              }
              if (decompiledFrameRemainder0 &&
                this.backgroundTintBlendTicks > 1) {
                this.backgroundTintBlendTicks = 1;
              }
              if (bk.lastKeyCode == 52) {
                this.invulnerabilityCheat = this.invulnerabilityCheat ^ true;
                tt.field_a = true;
              }
              if (bk.lastKeyCode == 50) {
                mj.field_b = mj.field_b ^ true;
              }
              if (bk.lastKeyCode == 65) {
                this.emitScorchMark(0, -14630, 0, 64);
                tt.field_a = true;
              }
            }
          }
          if (obfuscationGuard < 31) {
            this.displayedHealthPercent = -94;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.NA(" + obfuscationGuard + ')');
        }
    }

    private final void emitBurstScreenParticle(int radiusQ8, int xQ8, int durationTicks, int yAccelerationQ8, int yQ8, int spreadQ8, byte obfuscationGuard) {
        if (this.screenParticles.length <= this.screenParticleCount) {
          return;
        }
        try {
          int var9 = 23 % ((24 - obfuscationGuard) / 62);
          ScreenParticle var8 = this.screenParticles[this.screenParticleCount];
          if (null == var8) {
            ScreenParticle dupTemp$0 = new ScreenParticle();
            this.screenParticles[this.screenParticleCount] = dupTemp$0;
            var8 = dupTemp$0;
          }
          var8.spawnBurst(yAccelerationQ8, xQ8, spreadQ8, durationTicks, yQ8, radiusQ8, -1588713311);
          this.screenParticleCount = this.screenParticleCount + 1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.AA(" + radiusQ8 + ',' + xQ8 + ',' + durationTicks + ',' + yAccelerationQ8 + ',' + yQ8 + ',' + spreadQ8 + ',' + obfuscationGuard + ')');
        }
    }

    public static void releaseStaticReferences(int obfuscationGuard) {
        try {
          if (obfuscationGuard != 32458) {
            field_e = (BitmapFont) null;
          }
          rendererManager = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var1 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var1), "pk.BA(" + obfuscationGuard + ')');
        }
    }

    private final void emitDepthSmoke(Vector2 position, int colourOrBlastRadius, int lifetimeTicks, int obfuscationGuard, int depthPhase) {
        String stackIn_13_2 = null;
        try {
          if (obfuscationGuard != 0) {
            return;
          }
          if (this.smokeParticles.length <= this.smokeParticleCount) {
            return;
          }
          SmokeParticle var6 = this.smokeParticles[this.smokeParticleCount];
          if (var6 == null) {
            SmokeParticle dupTemp$1 = new SmokeParticle();
            this.smokeParticles[this.smokeParticleCount] = dupTemp$1;
            var6 = dupTemp$1;
          }
          var6.spawnAtDepth(lifetimeTicks, 122, colourOrBlastRadius, depthPhase, position);
          this.smokeParticleCount = this.smokeParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("pk.DB(");
          if (position == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(colourOrBlastRadius).append(',').append(lifetimeTicks).append(',').append(obfuscationGuard).append(',').append(depthPhase).append(')').toString());
        }
    }

    private final void advancePickups(Vector2 cameraMovement, boolean obfuscationGuard) {
        String stackIn_33_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard) {
            this.backgroundPanY = -0.6422101977961518;
          }
          int var3_int = 0;
          while (var3_int < this.pickupCount) {
            Pickup var4 = this.pickups[var3_int];
            var4.position.subtract(cameraMovement, -30507);
            var4.remainingTicks = var4.remainingTicks - 1;
            if (var5 != 0) {
              return;
            }
            if (var4.remainingTicks <= 0) {
              if (!(var4.remainingTicks > -184)) {
                int incrementValue$0 = var3_int;
                var3_int--;
                this.removePickup(false, incrementValue$0);
              }
            } else if (uh.a(99, var4.position, (double)(this.playerAircraft.definition.collisionRadius + 16), this.playerAircraft.position)) {
              if (var4.pickupCode >= 4) {
                boolean discarded$1 = this.applyUpgrade((byte) -95, var4.pickupCode - 4);
                int incrementValue$2 = var3_int;
                var3_int--;
                this.removePickup(false, incrementValue$2);
              } else {
                this.displayedTemporaryWeaponType = var4.pickupCode + 1;
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.playerAircraft.temporaryWeapon = 1 + var4.pickupCode;
                bm.a((byte) -70, uh.upgradeSounds[1]);
                this.queueTimedHudMessage(50, (byte) -127, -16711681, ke.field_c[var4.pickupCode]);
                int incrementValue$3 = var3_int;
                var3_int--;
                this.removePickup(false, incrementValue$3);
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_32_0 = var3;
          StringBuilder stackIn_32_1 = new StringBuilder().append("pk.U(");
          if (cameraMovement == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void queueTimedHudMessage(int holdTicks, byte obfuscationGuard, int colour, String text) {
        String stackIn_7_2 = null;
        try {
          wd.hudMessages.addLast(82, new HudMessage(text, colour, holdTicks));
          if (obfuscationGuard > -34) {
            this.emitScorchMark(-63, -32, -115, -32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("pk.D(").append(holdTicks).append(',').append(obfuscationGuard).append(',').append(colour).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void emitGrowingScreenParticle(int growthStepQ8, int xQ8, int radiusQ8, byte obfuscationGuard, int durationTicks, int yQ8, int alphaScale) {
        try {
          if (this.screenParticles.length <= this.screenParticleCount) {
            return;
          }
          ScreenParticle var8 = this.screenParticles[this.screenParticleCount];
          if (null == var8) {
            ScreenParticle dupTemp$1 = new ScreenParticle();
            this.screenParticles[this.screenParticleCount] = dupTemp$1;
            var8 = dupTemp$1;
          }
          if (obfuscationGuard > -35) {
            rendererManager = (RendererManager) null;
          }
          var8.spawnGrowingSprite(xQ8, false, durationTicks, growthStepQ8, radiusQ8, alphaScale, yQ8);
          this.screenParticleCount = this.screenParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.VA(" + growthStepQ8 + ',' + xQ8 + ',' + radiusQ8 + ',' + obfuscationGuard + ',' + durationTicks + ',' + yQ8 + ',' + alphaScale + ')');
        }
    }

    private final void installAircraft(byte obfuscationGuard, Aircraft aircraft) {
        String stackIn_28_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var3_int = 0;
          while (this.aircraft.length > var3_int) {
            Aircraft var4 = this.aircraft[var3_int];
            if (var5 != 0) {
              return;
            }
            if (null == var4 ||
              var4 != this.playerAircraft &&
              !(var4.lifecyclePhase > 2)) {
              this.aircraft[var3_int] = aircraft;
            } else {
              var3_int++;
              continue;
            }
            break;
          }
          if (obfuscationGuard < 111) {
            this.addScore(-75, 118);
          }
          int discarded$2 = this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position);
          aircraft.engineSound = po.a(this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position), 0, aircraft.definition.getEngineSample((byte) -66));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_27_0 = runtimeException;
          StringBuilder stackIn_27_1 = new StringBuilder().append("pk.H(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void addScore(int points, int obfuscationGuard) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          int var3_int = or.score;
          or.score = or.score + points;
          if (qq.a(20, 10) < 5) {
            if (5 > qq.a(20, 10)) {
              se.field_b = se.field_b + points;
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              ei.field_a = ei.field_a + points;
              if (var5 != 0) {
                if (qq.a(20, 10) >= 5) {
                  NetworkGameClient.field_x = NetworkGameClient.field_x - points;
                  bo.field_h = bo.field_h - points;
                } else {
                  bo.field_h = bo.field_h - points;
                }
              }
            }
          } else if (qq.a(20, 10) >= 5) {
            NetworkGameClient.field_x = NetworkGameClient.field_x - points;
            if (var5 != 0) {
              bo.field_h = bo.field_h - points;
            }
          } else {
            bo.field_h = bo.field_h - points;
          }
          if (!this.attractMode &&
            !this.arcadeMode) {
            if (var3_int < 5000 &&
              or.score >= 5000) {
              fm.a(255, (byte) 111, 0);
            }
            if (var3_int < 30000 &&
              or.score >= 30000) {
              fm.a(254, (byte) 111, 1);
            }
            if (var3_int < 80000 &&
              or.score >= 80000) {
              fm.a(253, (byte) 111, 2);
            }
          }
          int var4 = -30 / ((26 - obfuscationGuard) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var3), "pk.LA(" + points + ',' + obfuscationGuard + ')');
        }
    }

    private final void purchaseUpgrade(int baseCost, int upgradeCode) {
        try {
          if (this.upgradeFlashTicks[upgradeCode] > 0) {
            if (this.upgradeFlashTicks[upgradeCode] > 448) {
              this.upgradeFlashTicks[upgradeCode] = 512 - this.upgradeFlashTicks[upgradeCode];
              if (AceOfSkies.obfuscationControl &&
                this.upgradeFlashTicks[upgradeCode] > 64) {
                this.upgradeFlashTicks[upgradeCode] = 64;
              }
            } else if (this.upgradeFlashTicks[upgradeCode] > 64) {
              this.upgradeFlashTicks[upgradeCode] = 64;
            }
          }
          int cost = upgradeCode + baseCost;
          if (this.upgradeCredits >= cost &&
            this.applyUpgrade((byte) -14, upgradeCode)) {
            this.upgradeCredits = this.upgradeCredits - cost;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.MA(" + baseCost + ',' + upgradeCode + ')');
        }
    }

    private final int blendArgb(int foregroundWeight, int foreground, int redBlueMask, int background) {
        try {
          if (foregroundWeight <= 0) {
            int stackIn_2_0 = background;
            return stackIn_2_0;
          }
          if (256 <= foregroundWeight) {
            int stackIn_5_0 = foreground;
            return stackIn_5_0;
          }
          int var5_int = 256 - foregroundWeight;
          int var6 = (16711935 & foreground) * foregroundWeight + (background & 16711935) * var5_int >>> 8 & redBlueMask;
          int var7 = (16711890 & (65280 & foreground) * foregroundWeight + var5_int * (65280 & background)) >>> 8;
          int var8 = foregroundWeight * (16711680 & foreground >>> 8) + var5_int * ((-16777216 & background) >>> 8) & -16777216;
          int stackIn_7_0 = var6 | var8 | var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var5 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var5), "pk.B(" + foregroundWeight + ',' + foreground + ',' + redBlueMask + ',' + background + ')');
        }
    }

    private final void spawnWingman(int obfuscationGuard) {
        try {
          if (obfuscationGuard != -19054) {
            this.removeSmokeParticle(-82, -76);
          }
          int discarded$1 = this.spawnAircraft((byte) -8, gh.playerDefinition, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2), "pk.TA(" + obfuscationGuard + ')');
        }
    }

    private final void removePickup(boolean obfuscationGuard, int index) {
        try {
          this.pickupCount = this.pickupCount - 1;
          if (~index == ~this.pickupCount) {
            return;
          }
          if (obfuscationGuard) {
            this.handleKeyEvent((byte) -109);
          }
          Pickup var3 = this.pickups[index];
          this.pickups[index] = this.pickups[this.pickupCount];
          this.pickups[this.pickupCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3_ref = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.K(" + obfuscationGuard + ',' + index + ')');
        }
    }

    private final void removeBullet(int obfuscationGuard, int index) {
        this.bulletCount = this.bulletCount - 1;
        if (~this.bulletCount == ~index) {
          return;
        }
        try {
          Bullet var3 = this.bullets[index];
          this.bullets[index] = this.bullets[this.bulletCount];
          this.bullets[this.bulletCount] = var3;
          int var4 = -12 / ((-3 - obfuscationGuard) / 40);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.UA(" + obfuscationGuard + ',' + index + ')');
        }
    }

    final void advanceSession(boolean obfuscationGuard, boolean processInput) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        Aircraft stackIn_169_0 = null;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        Aircraft stackIn_265_0 = null;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        double stackIn_381_0 = 0.0;
        int var5Lifetime2;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameCompleted6 = true;
          this.fadeMusicLayers(24260, 10);
          if (processInput) {
            while (ek.a((byte) -126)) {
              this.handleKeyEvent((byte) 73);
              if (obfuscationControl != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted6 && (!this.paused &&
            !this.attractMode) &&
            (decompiledFrameRemainder2 = !(this.hudHidePhase <= 0))) {
            this.hudHidePhase = this.hudHidePhase - 5;
            decompiledFrameRemainder2 = (obfuscationControl != 0);
          }
          if (decompiledFrameRemainder2 &&
            this.hudHidePhase < 200) {
            this.hudHidePhase = this.hudHidePhase + 5;
          }
          this.advanceScreenParticles(-115);
          if (this.paused) {
            return;
          }
          this.simulationTick = this.simulationTick + 1;
          Vector2 cameraMovement = new Vector2(this.playerAircraft.position);
          this.backgroundPanY = this.backgroundPanY - this.playerAircraft.position.y / 3.0;
          this.backgroundPanX = this.backgroundPanX - this.playerAircraft.position.x / 3.0;
          this.advanceBackground((byte) 76, cameraMovement);
          Aircraft[] aircraftToAdvance = this.aircraft;
          int var5 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5 >= aircraftToAdvance.length))) {
            Aircraft advancingAircraft = aircraftToAdvance[var5];
            if (obfuscationControl == 0) {
              if (null != advancingAircraft) {
                this.advanceAircraft(-106, advancingAircraft, cameraMovement);
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            Vector2 stackIn_38_1 = cameraMovement;
            boolean stackIn_39_2 = (obfuscationGuard) ? false : true;
            this.advancePickups(stackIn_38_1, stackIn_39_2);
            this.advanceBullets(cameraMovement, (byte) -93);
            this.advanceSmokeParticles(cameraMovement, 4473924);
          }
          int var4 = 0;
          scanLoop1: while (true) {
            if (var4 < 7) {
              stackIn_261_0 = -1;
              stackIn_261_1 = ~this.upgradeFlashTicks[var4];
              if (obfuscationControl == 0) {
                if (!(stackIn_261_0 >= stackIn_261_1) &&
                  !(this.upgradeCredits <= var4)) {
                  this.upgradeFlashTicks[var4] = 512;
                } else if (this.upgradeFlashTicks[var4] > 0) {
                  this.upgradeFlashTicks[var4] = this.upgradeFlashTicks[var4] - 1;
                }
                var4++;
                continue;
              }
            } else {
              boolean decompiledFrameRemainder1 = true;
              if (!this.attractMode) {
                if (this.victoryCountdown < 0) {
                  var4 = 0;
                  int var5Lifetime1 = 0;
                  int var6_int = 0;
                  int var7 = 0;
                  int var8_int = 0;
                  int var9 = 0;
                  Aircraft[] aircraftForWaveCount = this.aircraft;
                  int var11 = 0;
                  scanLoop2: while (true) {
                    if (aircraftForWaveCount.length > var11) {
                      Aircraft waveAircraft = aircraftForWaveCount[var11];
                      stackIn_169_0 = waveAircraft;
                      if (obfuscationControl == 0) {
                        if (stackIn_169_0 != null &&
                          gh.playerDefinition != waveAircraft.definition &&
                          waveAircraft.lifecyclePhase > 2) {
                          if (waveAircraft.definition == sl.field_p) {
                            var8_int++;
                          }
                          if (waveAircraft.definition == qq.field_g) {
                            var7++;
                          }
                          if (gm.field_y == waveAircraft.definition) {
                            var6_int++;
                          }
                          if (ro.field_u == waveAircraft.definition) {
                            var9++;
                          }
                          if (ju.field_k == waveAircraft.definition) {
                            var5Lifetime1++;
                          }
                          var4++;
                        }
                        var11++;
                        continue;
                      }
                    } else {
                      if (0 < var4 &&
                        !this.manualMusicLayers) {
                        boolean decompiledFrameRemainder0 = true;
                        boolean decompiledFrameCompleted5 = true;
                        if (var9 > 0 &&
                          !this.alternateMusicActive) {
                          this.alternateMusicActive = true;
                          lm.a(20, tg.musicTracks[2], true, (byte) -106);
                          int var10_int = 0;
                          while (var10_int < 16) {
                            DualLinkNode.field_e.field_s.a((byte) -119, 256, var10_int);
                            var10_int++;
                            if (obfuscationControl != 0) {
                              decompiledFrameCompleted5 = false;
                              break;
                            }
                          }
                          decompiledFrameRemainder0 = !(decompiledFrameCompleted5);
                        }
                        if (decompiledFrameRemainder0 && decompiledFrameCompleted5 && (var9 == 0 &&
                          this.alternateMusicActive)) {
                          this.alternateMusicActive = false;
                          lm.a(20, tg.musicTracks[1], true, (byte) 115);
                          this.setMusicLayersImmediately(11154);
                        }
                        if (~var4 != ~var5Lifetime1) {
                          if (var5Lifetime1 > 0 ||
                            var7 > 0) {
                            this.musicLayerPresetIndex = 3;
                          }
                          if (!(var5Lifetime1 > 0) &&
                            !(var7 > 0) || obfuscationControl != 0) {
                            if (!(var6_int <= 0) ||
                              !(var8_int <= 4)) {
                              this.musicLayerPresetIndex = 2;
                              if (obfuscationControl != 0) {
                                this.musicLayerPresetIndex = 4;
                              }
                            } else if (var8_int > 0) {
                              this.musicLayerPresetIndex = 1;
                              if (obfuscationControl != 0) {
                                this.musicLayerPresetIndex = 0;
                                this.musicLayerPresetIndex = 2;
                                this.musicLayerPresetIndex = 4;
                              }
                            } else {
                              this.musicLayerPresetIndex = 0;
                              if (obfuscationControl != 0) {
                                this.musicLayerPresetIndex = 2;
                                this.musicLayerPresetIndex = 4;
                              }
                            }
                          }} else {
                          this.musicLayerPresetIndex = 4;
                        }
                      }
                      if (this.arcadeMode) {
                        if (0 < var4) {
                          break scanLoop2;
                        }
                        this.completedWaveCount = this.completedWaveCount + 1;
                        this.startArcadeWave((byte) 28, this.completedWaveCount + 1);
                        if (obfuscationControl == 0) {
                          break scanLoop2;
                        }
                      }
                      if (var4 > (this.classicWaveIndex / 5)) {
                        break scanLoop2;
                      }
                      if (this.classicWaveIndex >= (oe.classicWaveMessages.length - 1)) {
                        if (0 < var4) {
                          break scanLoop2;
                        }
                        this.queueHudMessage(-16711936, (byte) -32, "Congratulations!");
                        this.victoryCountdown = 100;
                        if (obfuscationControl == 0) {
                          break scanLoop2;
                        }
                      }
                      this.completedWaveCount = this.completedWaveCount + 1;
                      this.classicWaveIndex = this.classicWaveIndex + 1;
                      stackIn_169_0 = this.playerAircraft;
                    }
                    if (stackIn_169_0.hitPoints > 0) {
                      this.playerAircraft.hitPoints = this.playerAircraft.hitPoints + (this.playerAircraft.definition.maximumHitPoints >> 1);
                    }
                    if (this.playerAircraft.definition.maximumHitPoints < this.playerAircraft.hitPoints) {
                      this.playerAircraft.hitPoints = this.playerAircraft.definition.maximumHitPoints;
                    }
                    this.startClassicWave(-20416);
                    break;
                  }
                  decompiledFrameRemainder1 = (obfuscationControl != 0);
                }
                if (decompiledFrameRemainder1) {
                  int fieldTemp$0 = this.victoryCountdown - 1;
                  this.victoryCountdown = this.victoryCountdown - 1;
                  decompiledFrameRemainder1 = (fieldTemp$0 == 0);
                  if (decompiledFrameRemainder1) {
                    if (!this.attractMode &&
                      this.noLivesLost) {
                      fm.a(250, (byte) 111, 5);
                    }
                    this.finishGame(false, true, 100);
                    decompiledFrameRemainder1 = (obfuscationControl != 0);
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                var4 = 0;
                int var5Lifetime1Lifetime1 = 0;
                Aircraft[] var6_ref_md__ = this.aircraft;
                int var7Lifetime2 = 0;
                while (var6_ref_md__.length > var7Lifetime2) {
                  Aircraft populationAircraft = var6_ref_md__[var7Lifetime2];
                  stackIn_265_0 = populationAircraft;
                  if (obfuscationControl != 0) {
                    break scanLoop1;
                  }
                  if ((stackIn_265_0 != null ||
                    obfuscationControl != 0) && (!(populationAircraft.lifecyclePhase <= 2) ||
                    obfuscationControl != 0)) {
                    if (gh.playerDefinition != populationAircraft.definition) {
                      var4++;
                    } else {
                      var5Lifetime1Lifetime1++;
                    }
                  }
                  var7Lifetime2++;
                }
                if (var5Lifetime1Lifetime1 < 7) {
                  int discarded$1 = this.spawnAircraft((byte) -1, gh.playerDefinition, 1, 0);
                }
                if (var4 < 7) {
                  var4 = qq.a(20, 100);
                  if (var4 == 0 &&
                    (hg.field_D & 64) != 0) {
                    int discarded$2 = this.spawnAircraft((byte) 54, ro.field_u, 1, 0);
                    decompiledFrameRemainder1 = (obfuscationControl != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (5 > var4 &&
                      (2 & hg.field_D) != 0) {
                      int discarded$3 = this.spawnAircraft((byte) 116, ju.field_k, 1, 0);
                      decompiledFrameRemainder1 = (obfuscationControl != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (15 <= var4 ||
                        (hg.field_D & 1) == 0) {
                        if (var4 < 25) {
                          int discarded$4 = this.spawnAircraft((byte) 38, gm.field_y, 1, 0);
                        }
                        if (!(var4 < 25) ||
                          obfuscationControl != 0) {
                          if (40 > var4) {
                            int discarded$5 = this.spawnAircraft((byte) 56, sl.field_p, 1, 0);
                            if (obfuscationControl != 0) {
                              discarded$6 = this.spawnAircraft((byte) 85, kk.field_N, 1, 0);
                              discarded$7 = this.spawnAircraft((byte) 13, qq.field_g, 1, 0);
                            }
                          } else {
                            discarded$6 = this.spawnAircraft((byte) 85, kk.field_N, 1, 0);
                            if (obfuscationControl != 0) {
                              discarded$7 = this.spawnAircraft((byte) 13, qq.field_g, 1, 0);
                            }
                          }
                        }} else {
                        discarded$7 = this.spawnAircraft((byte) 13, qq.field_g, 1, 0);
                      }
                    }
                  }
                }
              }
              stackIn_261_0 = -1;
              stackIn_261_1 = ~this.respawnInvulnerabilityTicks;
            }
            if (stackIn_261_0 > stackIn_261_1) {
              this.respawnInvulnerabilityTicks = this.respawnInvulnerabilityTicks - 1;
            }
            stackIn_265_0 = this.playerAircraft;
            break;
          }
          regionExit3: {
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (stackIn_265_0.hitPoints <= 0 &&
              this.playerAircraft.lifecyclePhase <= 2) {
              if (this.attractMode) {
                Aircraft[] aircraftForAttractPlayer = this.aircraft;
                var5Lifetime2 = 0;
                while (var5Lifetime2 < aircraftForAttractPlayer.length) {
                  Aircraft attractPlayerCandidate = aircraftForAttractPlayer[var5Lifetime2];
                  if (obfuscationControl != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (attractPlayerCandidate != null &&
                    attractPlayerCandidate.definition == gh.playerDefinition &&
                    attractPlayerCandidate.hitPoints > 0) {
                    this.playerAircraft = attractPlayerCandidate;
                  }
                  var5Lifetime2++;
                }
              } else {
                this.noLivesLost = false;
                if (this.respawnDelayTicks <= 0) {
                  this.respawnDelayTicks = 80;
                  int var4Lifetime1 = 0;
                  var5Lifetime2 = 0;
                  scanLoop4: while (var4Lifetime1 == 0) {
                    var5Lifetime2++;
                    stackIn_371_0 = -51;
                    stackIn_371_1 = ~var5Lifetime2;
                    if (obfuscationControl != 0) {
                      break regionExit3;
                    }
                    if (stackIn_371_0 < stackIn_371_1) {
                      int var6_intLifetime1 = qq.a(20, 3200);
                      int var7Lifetime1 = qq.a(20, 2400);
                      this.playerAircraft.position.set((double)var6_intLifetime1, (double)var7Lifetime1, true);
                      jp.a(50, this.playerAircraft.engineSound);
                      Aircraft stackIn_297_0 = this.playerAircraft;
                      while (true) {
                        stackIn_297_0.engineSound = po.a(256, 0, this.playerAircraft.definition.getEngineSample((byte) 104));
                        var4Lifetime1 = 1;
                        Aircraft[] aircraftForSpawnCheck = this.aircraft;
                        int var9Lifetime1 = 0;
                        while (var9Lifetime1 < aircraftForSpawnCheck.length) {
                          Aircraft spawnObstacle = aircraftForSpawnCheck[var9Lifetime1];
                          stackIn_297_0 = spawnObstacle;
                          if (stackIn_297_0 != null &&
                            spawnObstacle != this.playerAircraft &&
                            spawnObstacle.lifecyclePhase > 2 &&
                            uh.a(97, spawnObstacle.position, 500.0, this.playerAircraft.position)) {
                            var4Lifetime1 = 0;
                          } else {
                            var9Lifetime1++;
                            continue;
                          }
                          break;
                        }
                        continue scanLoop4;
                      }
                    }
                    break;
                  }
                  this.backgroundPanX = this.backgroundPanX - this.playerAircraft.position.x / 3.0;
                  this.backgroundPanY = this.backgroundPanY - this.playerAircraft.position.y / 3.0;
                  cameraMovement.setFrom(this.playerAircraft.position, true);
                  FlightBody[] backgroundToRecenter = this.backgroundBodies;
                  int var7Lifetime1Lifetime1 = 0;
                  while (var7Lifetime1Lifetime1 < backgroundToRecenter.length) {
                    FlightBody backgroundBody = backgroundToRecenter[var7Lifetime1Lifetime1];
                    if (obfuscationControl != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    if (backgroundBody != null) {
                      backgroundBody.position.subtract(cameraMovement, -30507);
                    }
                    var7Lifetime1Lifetime1++;
                  }
                  if (decompiledFrameCompleted3) {
                    Aircraft[] aircraftToRecenter = this.aircraft;
                    int var7Lifetime1Lifetime2 = 0;
                    while (aircraftToRecenter.length > var7Lifetime1Lifetime2) {
                      Aircraft aircraftToShift = aircraftToRecenter[var7Lifetime1Lifetime2];
                      if (obfuscationControl != 0) {
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                      if (aircraftToShift != null) {
                        aircraftToShift.position.subtract(cameraMovement, -30507);
                      }
                      var7Lifetime1Lifetime2++;
                    }
                    if (decompiledFrameCompleted2) {
                      Pickup[] pickupsToRecenter = this.pickups;
                      var7Lifetime1Lifetime2 = 0;
                      while (pickupsToRecenter.length > var7Lifetime1Lifetime2) {
                        Pickup pickupToRecenter = pickupsToRecenter[var7Lifetime1Lifetime2];
                        if (obfuscationControl != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        if (pickupToRecenter != null) {
                          pickupToRecenter.position.subtract(cameraMovement, -30507);
                        }
                        var7Lifetime1Lifetime2++;
                      }
                      if (decompiledFrameCompleted1) {
                        Bullet[] bulletsToRecenter = this.bullets;
                        var7Lifetime1Lifetime2 = 0;
                        while (var7Lifetime1Lifetime2 < bulletsToRecenter.length) {
                          Bullet bulletToRecenter = bulletsToRecenter[var7Lifetime1Lifetime2];
                          if (obfuscationControl != 0) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          if (bulletToRecenter != null) {
                            bulletToRecenter.position.subtract(cameraMovement, -30507);
                          }
                          var7Lifetime1Lifetime2++;
                        }
                        if (decompiledFrameCompleted0) {
                          SmokeParticle[] smokeParticlesToRecenter = this.smokeParticles;
                          var7Lifetime1Lifetime2 = 0;
                          boolean decompiledNaturalLoopExit0 = false;
                          while (!(decompiledNaturalLoopExit0 = (smokeParticlesToRecenter.length <= var7Lifetime1Lifetime2))) {
                            SmokeParticle smokeToRecenter = smokeParticlesToRecenter[var7Lifetime1Lifetime2];
                            if (obfuscationControl == 0) {
                              if (null != smokeToRecenter) {
                                smokeToRecenter.position.subtract(cameraMovement, -30507);
                              }
                              var7Lifetime1Lifetime2++;
                              continue;
                            }
                            break;
                          }
                          if (decompiledNaturalLoopExit0) {
                            this.respawnInvulnerabilityTicks = 120;
                            this.playerAircraft.lifecyclePhase = 3;
                            this.playerAircraft.hitPoints = this.playerAircraft.definition.maximumHitPoints;
                            this.lives = this.lives - 1;
                          }
                          if (obfuscationControl != 0) {
                            this.respawnDelayTicks = this.respawnDelayTicks - 1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.respawnDelayTicks = this.respawnDelayTicks - 1;
                }
              }
            }
            if (decompiledFrameCompleted4 &&
              decompiledFrameCompleted3 &&
              decompiledFrameCompleted2 &&
              decompiledFrameCompleted1 &&
              decompiledFrameCompleted0) {
              this.updatePlayerControls((byte) -13);
            }
            stackIn_371_0 = ~this.lives;
            stackIn_371_1 = -1;
          }
          if (stackIn_371_0 > stackIn_371_1) {
            this.finishGame(false, false, 100);
          }
          int var4Lifetime2 = 0;
          if (!obfuscationGuard) {
            this.startClassicWave(-8);
          }
          int var5Lifetime3 = 0;
          if (sh.field_u < gp.field_w) {
            stackIn_381_0 = (double)sh.field_u;
          } else {
            stackIn_381_0 = (double)gp.field_w;
          }
          double viewportMinimumExtent = stackIn_381_0;
          double minimumCameraScale = viewportMinimumExtent * 100.0 / 480.0;
          double attractCameraScale = viewportMinimumExtent * 600.0 / 480.0;
          double maximumCameraScale = viewportMinimumExtent * 1000.0 / 480.0;
          if (this.attractMode) {
            if (attractCameraScale < this.cameraScale) {
              this.cameraScale = this.cameraScale * 0.99;
            }
            if (!(this.cameraScale < attractCameraScale)) {
              return;
            }
            this.cameraScale = attractCameraScale;
            if (obfuscationControl == 0) {
              return;
            }
          }
          Vector2 playerPosition = this.playerAircraft.position;
          double scaledPlayerOffsetX = Math.abs(this.cameraScale * playerPosition.x / 1000.0);
          double scaledPlayerOffsetY = Math.abs(playerPosition.y * this.cameraScale / 1000.0);
          if (1.01 * scaledPlayerOffsetX < (double)(gp.field_w / 4) &&
            (double)(sh.field_u / 4) > scaledPlayerOffsetY * 1.01) {
            var5Lifetime3 = 1;
          }
          if (0.99 * scaledPlayerOffsetX > (double)(sh.field_u / 4) ||
            scaledPlayerOffsetY * 0.99 > (double)(gp.field_w / 4)) {
            var4Lifetime2 = 1;
          }
          if (this.cameraScale > maximumCameraScale) {
            var4Lifetime2 = 1;
          }
          if (var4Lifetime2 != 0) {
            this.cameraScale = this.cameraScale * 0.99;
            if (!(this.cameraScale < minimumCameraScale)) {
              return;
            }
            this.cameraScale = minimumCameraScale;
            if (obfuscationControl == 0) {
              return;
            }
          }
          if (var5Lifetime3 != 0) {
            this.cameraScale = this.cameraScale * 1.01;
            if (maximumCameraScale < this.cameraScale) {
              this.cameraScale = maximumCameraScale;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.SA(" + obfuscationGuard + ',' + processInput + ')');
        }
    }

    private final void emitScorchMark(int worldY, int obfuscationGuard, int worldX, int diameter) {
        try {
          if (this.scorchMarks.length <= this.scorchMarkCount) {
            return;
          }
          ScorchMark var5 = this.scorchMarks[this.scorchMarkCount];
          if (var5 == null) {
            ScorchMark dupTemp$2 = new ScorchMark();
            this.scorchMarks[this.scorchMarkCount] = dupTemp$2;
            var5 = dupTemp$2;
          }
          var5.spawn(diameter, worldX, worldY, (byte) 127);
          if (obfuscationGuard != -14630) {
            int discarded$3 = this.computeDopplerPitchStep((Aircraft) null, 100, (Aircraft) null);
          }
          this.scorchMarkCount = this.scorchMarkCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.WA(" + worldY + ',' + obfuscationGuard + ',' + worldX + ',' + diameter + ')');
        }
    }

    private final void stopAircraftEngineSounds(boolean obfuscationGuard) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            return;
          }
          if (null == this.aircraft) {
            return;
          }
          Aircraft[] var2 = this.aircraft;
          int var3 = 0;
          while (var2.length > var3) {
            Aircraft var4 = var2[var3];
            if (var5 != 0) {
              return;
            }
            if (var4 != null &&
              null != var4.engineSound) {
              jp.a(50, var4.engineSound);
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.QA(" + obfuscationGuard + ')');
        }
    }

    private final void advanceAircraft(int obfuscationGuard, Aircraft aircraft, Vector2 cameraMovement) {
        String stackIn_147_2 = null;
        String stackIn_151_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          aircraft.position.subtract(cameraMovement, -30507);
          if (aircraft.pursuingAircraft != null && (!(aircraft.pursuingAircraft.hitPoints > 0) ||
            aircraft.pursuingAircraft.targetAircraft != aircraft)) {
            aircraft.pursuingAircraft = null;
          }
          if (0 < aircraft.damageSmokeTicks) {
            aircraft.damageSmokeTicks = aircraft.damageSmokeTicks - 2;
            if (aircraft.hitPoints > 0) {
              this.emitSmoke(qq.a(20, 10) + (aircraft.damageSmokeTicks >> 1), aircraft.position, (byte) -74, 4473924);
            }
          }
          if (this.invulnerabilityCheat &&
            this.debugControlsEnabled &&
            aircraft == this.playerAircraft) {
            aircraft.hitPoints = aircraft.definition.maximumHitPoints;
          }
          if (aircraft.hitPoints <= 0) {
            this.advanceDestroyedAircraft(true, aircraft);
            return;
          }
          rg.a(this.computeDopplerPitchStep(aircraft, 5000, this.playerAircraft), false, aircraft.engineSound, this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position));
          if (!aircraft.braking) {
            if (aircraft.definition.maximumSpeed > aircraft.speed) {
              aircraft.speed = aircraft.speed + 0.2;
            }
            if (aircraft.definition.maximumSpeed < aircraft.speed) {
              aircraft.speed = aircraft.definition.maximumSpeed;
              if (var5 != 0) {
                if (aircraft.speed > aircraft.definition.minimumSpeed) {
                  aircraft.speed = aircraft.speed - 0.2;
                }
                if (aircraft.definition.minimumSpeed > aircraft.speed) {
                  aircraft.speed = aircraft.definition.minimumSpeed;
                }
              }
            }
          } else {
            if (aircraft.speed > aircraft.definition.minimumSpeed) {
              aircraft.speed = aircraft.speed - 0.2;
            }
            if (aircraft.definition.minimumSpeed > aircraft.speed) {
              aircraft.speed = aircraft.definition.minimumSpeed;
            }
          }
          if (aircraft.lifecyclePhase < 92) {
            aircraft.lifecyclePhase = aircraft.lifecyclePhase + 1;
          }
          if (aircraft.weaponHeat > 100) {
            aircraft.moveForward(24.0, 128);
            this.scratchPosition.setFrom(aircraft.position, true);
            aircraft.moveForward(-24.0, 128);
            this.scratchPosition.add((byte) 103, oh.a(3.0, (byte) 28));
          }
          boolean decompiledFrameRemainder0 = true;
          if (aircraft.fireRequested &&
            aircraft.lifecyclePhase == 92 &&
            aircraft.fireCooldown <= 0) {
            if (aircraft.temporaryWeapon != 3) {
              if (aircraft.temporaryWeapon == 4) {
                this.fireBullets((byte) 55, aircraft);
                aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 2;
                aircraft.fireCooldown = aircraft.fireCooldown + aircraft.definition.fireInterval;
                aircraft.weaponHeat = aircraft.weaponHeat + aircraft.definition.fireInterval;
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0 &&
                !(aircraft.weaponHeat >= 100)) {
                this.fireBullets((byte) 115, aircraft);
                aircraft.weaponHeat = aircraft.weaponHeat + (-aircraft.definition.heatReduction + aircraft.definition.fireInterval + 22);
                aircraft.fireCooldown = aircraft.fireCooldown + aircraft.definition.fireInterval;
                if (0 < aircraft.temporaryWeapon) {
                  aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 5;
                }
                if (!(aircraft.weaponHeat < 100)) {
                  aircraft.weaponHeat = 200;
                  if (this.playerAircraft == aircraft &&
                    !this.attractMode) {
                    bm.a((byte) -70, mh.field_o);
                    if (var5 != 0) {
                      this.fireBullets((byte) 60, aircraft);
                      aircraft.fireCooldown = aircraft.fireCooldown + 2;
                      aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 2;
                    }
                  }
                }
              }
            } else {
              this.fireBullets((byte) 60, aircraft);
              aircraft.fireCooldown = aircraft.fireCooldown + 2;
              aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 2;
            }
          }
          if (0 >= aircraft.temporaryWeaponTicks &&
            0 < aircraft.temporaryWeapon) {
            if (aircraft.temporaryWeapon == 3) {
              aircraft.weaponHeat = 200;
              bm.a((byte) -70, mh.field_o);
            }
            aircraft.temporaryWeapon = 0;
            aircraft.temporaryWeaponTicks = 0;
          }
          if (0 < aircraft.fireCooldown) {
            aircraft.fireCooldown = aircraft.fireCooldown - 1;
          }
          int var4_int = -31 % ((7 - obfuscationGuard) / 35);
          if (aircraft.weaponHeat > 0) {
            aircraft.weaponHeat = aircraft.weaponHeat - 1;
            if (aircraft.weaponHeat == 100) {
              aircraft.weaponHeat = 0;
            }
          }
          aircraft.fireRequested = false;
          aircraft.advance(2);
          aircraft.wrapWorld(3200.0, (byte) 49, 2400.0);
          if (ro.field_u != aircraft.definition) {
            if (0 < aircraft.bankOffset) {
              aircraft.bankOffset = aircraft.bankOffset - 1;
            }
            if (!(aircraft.bankOffset >= 0)) {
              aircraft.bankOffset = aircraft.bankOffset + 1;
              if (var5 != 0) {
                aircraft.bankOffset = aircraft.bankOffset + 1;
              }
            }
          } else {
            aircraft.bankOffset = aircraft.bankOffset + 1;
          }
          if (this.playerAircraft == aircraft &&
            !this.attractMode) {
            return;
          }
          if (qo.field_e == aircraft.steeringMode &&
            uh.a(93, this.playerAircraft.position, 1000.0, aircraft.position)) {
            aircraft.steeringMode = ht.field_i;
          }
          if (aircraft.targetAircraft != null &&
            aircraft.targetAircraft.hitPoints <= 0) {
            aircraft.targetAircraft = null;
          }
          aircraft.speed = aircraft.definition.maximumSpeed;
          this.selectAircraftTarget(aircraft, -111);
          aircraft.steerTowardsTarget(this.completedWaveCount, (byte) 75, aircraft.targetAircraft);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          RuntimeException stackIn_146_0 = var4;
          StringBuilder stackIn_146_1 = new StringBuilder().append("pk.P(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_147_2 = "null";
          } else {
            stackIn_147_2 = "{...}";
          }
          StringBuilder stackIn_150_1 = ((StringBuilder) (Object) stackIn_146_1).append(stackIn_147_2).append(',');
          if (cameraMovement == null) {
            stackIn_151_2 = "null";
          } else {
            stackIn_151_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_146_0), ((StringBuilder) (Object) stackIn_150_1).append(stackIn_151_2).append(')').toString());
        }
    }

    private final void emitPickup(Vector2 position, int obfuscationGuard, int pickupCode) {
        String stackIn_15_2 = null;
        try {
          if (obfuscationGuard != 32597) {
            return;
          }
          if (this.pickups.length <= this.pickupCount) {
            return;
          }
          Pickup var4 = this.pickups[this.pickupCount];
          if (var4 == null) {
            Pickup dupTemp$0 = new Pickup();
            this.pickups[this.pickupCount] = dupTemp$0;
            var4 = dupTemp$0;
          }
          var4.spawn(pickupCode, -111, position);
          this.pickupCount = this.pickupCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_14_0 = runtimeException;
          StringBuilder stackIn_14_1 = new StringBuilder().append("pk.KA(");
          if (position == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(obfuscationGuard).append(',').append(pickupCode).append(')').toString());
        }
    }

    private final int computeDopplerPitchStep(Aircraft sourceAircraft, int obfuscationGuard, Aircraft listenerAircraft) {
        String stackIn_20_2 = null;
        String stackIn_24_2 = null;
        try {
          if (sourceAircraft == listenerAircraft) {
            int stackIn_4_0 = 256;
            return stackIn_4_0;
          }
          if (obfuscationGuard != 5000) {
            this.creditAnimationTicks = 84;
          }
          ek.field_u.setFrom(listenerAircraft.position, true);
          ek.field_u.subtract(sourceAircraft.position, -30507);
          double var4_double = 3.141592653589793 * sourceAircraft.heading / 128.0;
          IntrusiveDeque.field_d.set(sourceAircraft.speed * Math.sin(var4_double), sourceAircraft.speed * Math.cos(var4_double), true);
          double var4_doubleLifetime1 = listenerAircraft.heading * 3.141592653589793 / 128.0;
          IntrusiveDeque.field_d.x = IntrusiveDeque.field_d.x - listenerAircraft.speed * Math.sin(var4_doubleLifetime1);
          IntrusiveDeque.field_d.y = IntrusiveDeque.field_d.y - listenerAircraft.speed * Math.cos(var4_doubleLifetime1);
          double var6 = IntrusiveDeque.field_d.dot(ek.field_u, (byte) -67);
          int var8 = 500;
          var8 = (int)(var6 * (double)var8 / ek.field_u.lengthSquared(127));
          if (var8 < -100) {
            var8 = -100;
          }
          if (100 < var8) {
            var8 = 100;
          }
          int var9 = -var8 + 256;
          int stackIn_15_0 = var9;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          RuntimeException stackIn_19_0 = var4;
          StringBuilder stackIn_19_1 = new StringBuilder().append("pk.W(");
          if (sourceAircraft == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(',');
          if (listenerAircraft == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void advanceDestroyedAircraft(boolean obfuscationGuard, Aircraft aircraft) {
        int stackIn_23_0 = 0;
        String stackIn_74_2 = null;
        int stackIn_23_0Lifetime1;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (2 >= aircraft.lifecyclePhase) {
            aircraft.speed = 0.0;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (aircraft.definition == ro.field_u) {
              aircraft.bankOffset = aircraft.bankOffset + 1;
            }
            if (!(92 <= aircraft.lifecyclePhase)) {
              if (aircraft.definition != ro.field_u) {
                stackIn_23_0Lifetime1 = aircraft.lifecyclePhase + 164;
              } else {
                stackIn_23_0Lifetime1 = 256;
              }
              boolean stackIn_27_1Lifetime1 = (obfuscationGuard) ? false : true;
              rg.a(stackIn_23_0Lifetime1, stackIn_27_1Lifetime1, aircraft.engineSound, this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position));
              this.scratchPosition.setFrom(aircraft.position, true);
              this.scratchPosition.add((byte) 103, oh.a(5.0, (byte) 28));
              this.emitDepthSmoke(this.scratchPosition, 16777215, qq.a(20, 64) + 64, 0, aircraft.lifecyclePhase);
            } else if (ro.field_u == aircraft.definition) {
              jp.a(50, aircraft.engineSound);
              aircraft.engineSound = po.a(this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position), 0, kn.field_c[4]);
              if (var4 != 0) {
                if (aircraft.definition != ro.field_u) {
                  stackIn_23_0 = aircraft.lifecyclePhase + 164;
                } else {
                  stackIn_23_0 = 256;
                }
                boolean stackIn_27_1 = (obfuscationGuard) ? false : true;
                rg.a(stackIn_23_0, stackIn_27_1, aircraft.engineSound, this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position));
                this.scratchPosition.setFrom(aircraft.position, true);
                this.scratchPosition.add((byte) 103, oh.a(5.0, (byte) 28));
                this.emitDepthSmoke(this.scratchPosition, 16777215, qq.a(20, 64) + 64, 0, aircraft.lifecyclePhase);
              }
            }
            aircraft.lifecyclePhase = aircraft.lifecyclePhase - 1;
            if (aircraft.lifecyclePhase == 2) {
              if (this.playerAircraft != aircraft) {
                this.upgradeCredits = this.upgradeCredits + 1;
              }
              jp.a(50, aircraft.engineSound);
              aircraft.engineSound = null;
              this.emitAircraftScorchMark(aircraft, 8073);
              this.emitDepthSmoke(this.scratchPosition, -aircraft.definition.collisionRadius * 4, 240, 0, 0);
              if (aircraft.definition == ro.field_u &&
                !this.attractMode &&
                !this.arcadeMode) {
                fm.a(249, (byte) 111, 6);
              }
              int var3_int = this.computeSpatialVolume(this.playerAircraft.position, 200, aircraft.position);
              if (var3_int > 0) {
                if (ro.field_u == aircraft.definition) {
                  gg.a(kn.field_c[5], var3_int, -27227);
                  if (var4 != 0) {
                    if (gm.field_y == aircraft.definition) {
                      gg.a(kn.field_c[3], var3_int, -27227);
                      gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                    } else {
                      gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                    }
                  }
                } else {
                  boolean decompiledSharedTail0 = (gm.field_y != aircraft.definition);
                  if (!decompiledSharedTail0) {
                    gg.a(kn.field_c[3], var3_int, -27227);
                    decompiledSharedTail0 = (var4 != 0);
                  }
                  if (decompiledSharedTail0) {
                    gg.a(kn.field_c[qq.a(20, 3)], var3_int, -27227);
                  }
                }
              }
            }
            if (aircraft.speed > 0.0) {
              aircraft.speed = aircraft.speed - 0.1;
            }
            aircraft.temporaryWeapon = 0;
            if (0 < aircraft.temporaryWeaponTicks) {
              aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 1;
            }
            aircraft.turn(2.0, (byte) 25);
            aircraft.advance(2);
            aircraft.wrapWorld(3200.0, (byte) 49, 2400.0);
          }
          if (!obfuscationGuard) {
            this.removeSmokeParticle(110, -27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_73_0 = var3;
          StringBuilder stackIn_73_1 = new StringBuilder().append("pk.GB(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final void finishGame(boolean screenFlag, boolean awardFlag, int accuracyTarget) {
        int stackIn_5_1 = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.finalScore = or.score;
          if (this.shotsFired > 0) {
            stackIn_5_1 = this.shotsHit * 100 / this.shotsFired;
          } else {
            stackIn_5_1 = 0;
          }
          this.finalAccuracyPercent = stackIn_5_1;
          if (accuracyTarget == this.finalAccuracyPercent &&
            awardFlag) {
            fm.a(248, (byte) 111, 7);
          }
          boolean decompiledFrameRemainder0 = true;
          if (!cn.b(true)) {
            sg.flightSession.submitFinalScore(-8);
            ql.activeHighscoreQuery = null;
            int stackIn_19_0 = (!this.arcadeMode) ? 0 : 1;
            cs.highscoreMode = stackIn_19_0;
            if (0 == r.field_n) {
              Bullet.requestMenu((byte) -105, 2, screenFlag);
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              Bullet.requestMenu((byte) -102, 5, screenFlag);
              if (var5 != 0) {
                if (0 < or.score) {
                  Bullet.requestMenu((byte) -81, 6, screenFlag);
                  Bullet.requestMenu((byte) -86, 0, screenFlag);
                } else {
                  Bullet.requestMenu((byte) -86, 0, screenFlag);
                }
              }
            }
          } else if (0 < or.score) {
            Bullet.requestMenu((byte) -81, 6, screenFlag);
            if (var5 != 0) {
              Bullet.requestMenu((byte) -86, 0, screenFlag);
            }
          } else {
            Bullet.requestMenu((byte) -86, 0, screenFlag);
          }
          lm.a(40, tg.musicTracks[0], true, (byte) -84);
          int var4_int = 0;
          while (var4_int < 16) {
            DualLinkNode.field_e.field_s.a((byte) -126, 256, var4_int);
            var4_int++;
            if (var5 != 0) {
              return;
            }
          }
          sg.flightSession.startAttractMode((byte) 50);
          co.returnMenuId = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var4), "pk.BB(" + screenFlag + ',' + awardFlag + ',' + accuracyTarget + ')');
        }
    }

    private final void drawRadar(GraphicsRenderer renderer, int insetOffset, int obfuscationGuard) {
        int stackIn_13_0 = 0;
        String stackIn_91_2 = null;
        int var15 = 0;
        int var18 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var4_int = -insetOffset + 64;
          int var5 = -64 + gp.field_w + insetOffset;
          ec.radarSprites[0].a(3 - insetOffset, insetOffset + (-126 + gp.field_w));
          int var6 = 7 * -this.simulationTick & 511;
          ec.radarSprites[1].a((float)var4_int, (float)var5, 4096, 65536 * var6 / 511);
          if (obfuscationGuard != 16711935) {
            return;
          }
          Aircraft[] var7_ref_md__ = this.aircraft;
          int var8_int = 0;
          while (var8_int < var7_ref_md__.length) {
            boolean decompiledFrameRemainder1 = true;
            Aircraft var9_ref_md = var7_ref_md__[var8_int];
            if (null != var9_ref_md &&
              var9_ref_md.lifecyclePhase > 2) {
              int var10 = (int)(60.0 * var9_ref_md.position.x / 2400.0);
              int var11 = (int)(var9_ref_md.position.y * 60.0 / 2400.0);
              if (this.playerAircraft == var9_ref_md) {
                stackIn_13_0 = 255;
              } else {
                stackIn_13_0 = 511 & var9_ref_md.position.angle255(-113) + var6;
              }
              int var12 = stackIn_13_0;
              if (var12 > 255) {
                var12 = 0;
              }
              if (gh.playerDefinition == var9_ref_md.definition) {
                var12 = 127 + (var12 >> 1);
              }
              int var13 = var11 * var11 + var10 * var10;
              if (var13 > 3600) {
                double var14_double = 60.0 / Math.sqrt((double)var13);
                var10 = (int)((double)var10 * var14_double);
                var11 = (int)((double)var11 * var14_double);
              }
              boolean decompiledFrameRemainder0 = true;
              var10 = var10 + var4_int;
              var11 = var11 + var5;
              int var14 = 2;
              if (var9_ref_md != this.playerAircraft) {
                if (gh.playerDefinition == var9_ref_md.definition) {
                  var15 = 65280 | var12 << 24;
                  decompiledFrameRemainder0 = (var18 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (kk.field_N == var9_ref_md.definition) {
                    var15 = 16711680 | var12 << 24;
                    if (var18 != 0) {
                      var15 = -16711936;
                      var14 = 3;
                    }
                  } else if (var9_ref_md.definition != sl.field_p) {
                    if (var9_ref_md.definition != gm.field_y) {
                      if (var9_ref_md.definition == id.field_f) {
                        var15 = var12 << 24 | 16777088;
                        decompiledFrameRemainder0 = (var18 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (qq.field_g == var9_ref_md.definition) {
                          var15 = var12 << 24 | 224694;
                          decompiledFrameRemainder0 = (var18 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (var9_ref_md.definition != ju.field_k) {
                            if (var9_ref_md.definition == ro.field_u) {
                              var14 = 5;
                              var15 = var12 << 24 | 65535;
                              decompiledFrameRemainder0 = (var18 != 0);
                            }
                            if (decompiledFrameRemainder0) {
                              throw new IllegalStateException();
                            }
                          }
                          if (decompiledFrameRemainder0) {
                            int var16 = (int)sb.a(63, var9_ref_md.position, this.playerAircraft.position);
                            decompiledFrameRemainder1 = !(var16 >= 600);
                            if (decompiledFrameRemainder1) {
                              var15 = 16742144;
                              if (var16 > 500) {
                                int var17 = (-var16 + 600) * 255 / 100;
                                var15 = var15 | var17 * var12 >> 8 << 24;
                              }
                              if (var16 <= 500 ||
                                var18 != 0) {
                                var15 = var15 | -16777216;
                              }
                              decompiledFrameRemainder0 = (var18 != 0);
                            }
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder1 &&
                      decompiledFrameRemainder0) {
                      var15 = 16777215 | var12 << 24;
                      if (var18 != 0) {
                        var15 = var12 << 24 | 16711935;
                        var15 = 16711680 | var12 << 24;
                        var15 = -16711936;
                        var14 = 3;
                      }
                    }
                  } else {
                    var15 = var12 << 24 | 16711935;
                    if (var18 != 0) {
                      var15 = 16711680 | var12 << 24;
                      var15 = -16711936;
                      var14 = 3;
                    }
                  }
                }
              } else {
                var15 = -16711936;
                var14 = 3;
              }
              if (decompiledFrameRemainder1) {
                renderer.d(var14, var14, -(var14 >> 1) + var11, -5782, var15, var10 - (var14 >> 1));
              }
            }
            var8_int++;
            if (var18 == 0) {
              continue;
            }
            break;
          }
          int var7 = 0;
          while (this.pickupCount > var7) {
            Pickup var8 = this.pickups[var7];
            if (var18 != 0) {
              return;
            }
            if ((null != var8 ||
              var18 != 0) &&
              (!(var8.remainingTicks < 0) ||
              var18 != 0)) {
              int var9 = (int)(var8.position.x * 60.0 / 2400.0);
              int var10Lifetime1 = (int)(60.0 * var8.position.y / 2400.0);
              int var11Lifetime1 = var9 * var9 + var10Lifetime1 * var10Lifetime1;
              if (3600 < var11Lifetime1) {
                double var12_double = 60.0 / Math.sqrt((double)var11Lifetime1);
                var9 = (int)((double)var9 * var12_double);
                var10Lifetime1 = (int)((double)var10Lifetime1 * var12_double);
              }
              var10Lifetime1 = var10Lifetime1 + var5;
              var9 = var9 + var4_int;
              int var12Lifetime1 = 2;
              int var14Lifetime1 = (var8.remainingTicks & 15) >> 1;
              int var12Lifetime1Lifetime1 = 8 - var14Lifetime1;
              int stackIn_83_0 = var14Lifetime1 << 29;
              int stackIn_84_1 = (var8.pickupCode < 4) ? 65280 : 16776960;
              int var13Lifetime1 = stackIn_83_0 | stackIn_84_1;
              renderer.e(var13Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var10Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var9, 3105);
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          RuntimeException stackIn_90_0 = var4;
          StringBuilder stackIn_90_1 = new StringBuilder().append("pk.EB(");
          if (renderer == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(insetOffset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void advanceSmokeParticles(Vector2 cameraMovement, int obfuscationGuard) {
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        String stackIn_26_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.smokeParticleCount <= var3_int))) {
            SmokeParticle var4 = this.smokeParticles[var3_int];
            var4.position.subtract(cameraMovement, -30507);
            int fieldTemp$0 = var4.ageTicks + 5;
            var4.ageTicks = var4.ageTicks + 5;
            stackIn_18_0 = ~fieldTemp$0;
            stackIn_18_1 = ~var4.lifetimeTicks;
            if (var5 == 0) {
              if (stackIn_18_0 <= stackIn_18_1) {
                this.removeSmokeParticle(var3_int, -690800984);
                var3_int--;
              }
              if (var4.colourOrBlastRadius < 0 &&
                var4.ageTicks < var4.lifetimeTicks) {
                this.emitDepthSmoke(var4.position, 10066329, 2 * qq.a(obfuscationGuard ^ 4473936, -var4.ageTicks + var4.lifetimeTicks), 0, var4.depthPhase);
                this.emitDepthSmoke(var4.position, 6710886, 2 * qq.a(20, -var4.ageTicks + var4.lifetimeTicks), obfuscationGuard - 4473924, var4.depthPhase);
                this.emitDepthSmoke(var4.position, 4473924, 2 * qq.a(20, -var4.ageTicks + var4.lifetimeTicks), 0, var4.depthPhase);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_18_0 = obfuscationGuard;
            stackIn_18_1 = 4473924;
          }
          if (stackIn_18_0 != stackIn_18_1) {
            this.emitSmoke(-112, (Vector2) null, (byte) 98, -76);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_25_0 = var3;
          StringBuilder stackIn_25_1 = new StringBuilder().append("pk.L(");
          if (cameraMovement == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final boolean applyUpgrade(byte obfuscationGuard, int upgradeCode) {
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (upgradeCode == 0) {
            if (this.speedUpgradeLevel == 12) {
              return false;
            }
            this.speedUpgradeLevel = this.speedUpgradeLevel + 1;
            this.playerAircraft.definition.maximumSpeed = this.playerAircraft.definition.maximumSpeed + 0.4;
          }
          if (1 == upgradeCode) {
            if (12 == this.fireRateUpgradeLevel) {
              return false;
            }
            this.fireRateUpgradeLevel = this.fireRateUpgradeLevel + 1;
            if (1 >= this.playerAircraft.definition.fireInterval) {
              return false;
            }
            this.playerAircraft.definition.fireInterval = this.playerAircraft.definition.fireInterval - 1;
            this.playerAircraft.definition.heatReduction = this.playerAircraft.definition.heatReduction + 1;
          }
          if (upgradeCode == 2) {
            if (12 == this.turnRateUpgradeLevel) {
              return false;
            }
            this.turnRateUpgradeLevel = this.turnRateUpgradeLevel + 1;
            this.playerAircraft.definition.turnRate = this.playerAircraft.definition.turnRate + 0.1;
          }
          if (upgradeCode == 3) {
            if (this.healthUpgradeLevel == 12) {
              return false;
            }
            this.playerAircraft.definition.maximumHitPoints = this.playerAircraft.definition.maximumHitPoints + 1;
            this.healthUpgradeLevel = this.healthUpgradeLevel + 1;
            if (this.playerAircraft.hitPoints > 0) {
              this.playerAircraft.hitPoints = this.playerAircraft.hitPoints + 1;
            }
          }
          if (upgradeCode == 4) {
            if (5 < this.lives) {
              return false;
            }
            this.lives = this.lives + 1;
          }
          int var3_int = -31 / ((50 - obfuscationGuard) / 59);
          if (5 == upgradeCode) {
            int wingmanCount = 0;
            Aircraft[] aircraftToCount = this.aircraft;
            int aircraftIndex = 0;
            while (true) {
              if (aircraftToCount.length > aircraftIndex) {
                Aircraft candidate = aircraftToCount[aircraftIndex];
                if (obfuscationControl == 0) {
                  if (null != candidate &&
                    this.playerAircraft != candidate &&
                    candidate.definition == gh.playerDefinition) {
                    wingmanCount++;
                  }
                  aircraftIndex++;
                  continue;
                }
              } else if (6 <= wingmanCount) {
                return false;
              }
              break;
            }
            if (wingmanCount == 5) {
              fm.a(252, (byte) 111, 3);
            }
            this.spawnWingman(-19054);
          }
          if (upgradeCode == 6) {
            if (this.scoreMultiplier == 99) {
              return false;
            }
            this.scoreMultiplier = this.scoreMultiplier + 1;
          }
          if (upgradeCode < 4 &&
            this.healthUpgradeLevel == 12 &&
            12 == this.turnRateUpgradeLevel &&
            this.fireRateUpgradeLevel == 12 &&
            this.speedUpgradeLevel == 12) {
            fm.a(251, (byte) 111, 4);
          }
          boolean decompiledFrameCompleted0 = true;
          this.queueTimedHudMessage(50, (byte) -86, 65280, ae.upgradeLabels[upgradeCode]);
          if (!this.arcadeMode) {
            int particleIndex = 0;
            while (particleIndex < 80) {
              this.emitBurstScreenParticle(2560, 5888, np.a(25, 80, (byte) -65) >> 1, 80, 23 + upgradeCode * 38 << 8, 800, (byte) -108);
              particleIndex++;
              if (obfuscationControl != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            bm.a((byte) -70, uh.upgradeSounds[upgradeCode]);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.DA(" + obfuscationGuard + ',' + upgradeCode + ')');
        }
    }

    private final void updatePlayerControls(byte obfuscationGuard) {
        Aircraft stackIn_71_0 = null;
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -13) {
            return;
          }
          this.controlTick = this.controlTick + 1;
          if (!this.attractMode) {
            if (lp.heldKeys[96] &&
              !lp.heldKeys[97]) {
              this.playerAircraft.turn(this.playerAircraft.definition.turnRate, (byte) 25);
              this.playerAircraft.bankOffset = this.playerAircraft.bankOffset + 2;
              if (16 < this.playerAircraft.bankOffset) {
                this.playerAircraft.bankOffset = 16;
              }
              if (!this.leftHeldLastTick) {
                if (50 > -this.lastLeftPressTick + this.controlTick) {
                  this.doubleTapTurnDirection = -1;
                }
                this.lastLeftPressTick = this.controlTick;
              }
              this.leftHeldLastTick = true;
              if (obfuscationControl != 0) {
                if (this.doubleTapTurnDirection == -1) {
                  this.doubleTapTurnDirection = 0;
                }
                this.leftHeldLastTick = false;
              }
            } else {
              if (this.doubleTapTurnDirection == -1) {
                this.doubleTapTurnDirection = 0;
              }
              this.leftHeldLastTick = false;
            }
            if (lp.heldKeys[97] &&
              !lp.heldKeys[96]) {
              this.playerAircraft.turn(-this.playerAircraft.definition.turnRate, (byte) 25);
              this.playerAircraft.bankOffset = this.playerAircraft.bankOffset - 2;
              if (this.playerAircraft.bankOffset < -16) {
                this.playerAircraft.bankOffset = -16;
              }
              if (!this.rightHeldLastTick) {
                if (this.controlTick - this.lastRightPressTick < 50) {
                  this.doubleTapTurnDirection = 1;
                }
                this.lastRightPressTick = this.controlTick;
              }
              this.rightHeldLastTick = true;
              if (obfuscationControl != 0) {
                if (this.doubleTapTurnDirection == 1) {
                  this.doubleTapTurnDirection = 0;
                }
                this.rightHeldLastTick = false;
              }
            } else {
              if (this.doubleTapTurnDirection == 1) {
                this.doubleTapTurnDirection = 0;
              }
              this.rightHeldLastTick = false;
            }
            if (!lp.heldKeys[83] &&
              !lp.heldKeys[82]) {
              this.overheatFireLatch = false;
              if (obfuscationControl != 0) {
                boolean stackIn_67_1 = this.overheatFireLatch;
                boolean stackIn_68_2 = (this.playerAircraft.weaponHeat <= 100) ? false : true;
                this.overheatFireLatch = stackIn_67_1 | stackIn_68_2;
                stackIn_71_0 = this.playerAircraft;
                boolean stackIn_72_1 = (this.overheatFireLatch) ? false : true;
                stackIn_71_0.fireRequested = stackIn_72_1;
              }
            } else {
              boolean stackIn_67_1Lifetime1 = this.overheatFireLatch;
              boolean stackIn_68_2Lifetime1 = (this.playerAircraft.weaponHeat <= 100) ? false : true;
              this.overheatFireLatch = stackIn_67_1Lifetime1 | stackIn_68_2Lifetime1;
              stackIn_71_0 = this.playerAircraft;
              boolean stackIn_72_1Lifetime1 = (this.overheatFireLatch) ? false : true;
              stackIn_71_0.fireRequested = stackIn_72_1Lifetime1;
            }
            Aircraft stackIn_76_0 = this.playerAircraft;
            boolean stackIn_77_1 = (this.doubleTapTurnDirection == 0) ? false : true;
            stackIn_76_0.braking = stackIn_77_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.FA(" + obfuscationGuard + ')');
        }
    }

    private final void drawWorld(int obfuscationGuard) {
        int stackIn_48_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_144_0 = 0;
        int var26 = 0;
        int var23Lifetime2;
        int var23Lifetime3;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var25Lifetime3Lifetime1;
        int var26Lifetime2Lifetime1;
        int var28 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          rendererManager.a((byte) 121);
          int var2_int = 1;
          scanLoop1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (-1720.0 > this.backgroundPanX + this.cameraLookAheadX) {
              this.backgroundTileX = this.backgroundTileX + 1;
              this.backgroundPanX = this.backgroundPanX + 1720.0;
              if (var28 == 0) {
                continue;
              }
            } else {
              while (true) {
                if (!(-1280.0 > this.cameraLookAheadY + this.backgroundPanY)) {
                  break;
                }
                this.backgroundPanY = this.backgroundPanY + 1280.0;
                this.backgroundTileY = this.backgroundTileY + 1;
                if (var28 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              while (true) {
                if (!(this.cameraLookAheadX + this.backgroundPanX > 0.0)) {
                  break;
                }
                this.backgroundTileX = this.backgroundTileX - 1;
                this.backgroundPanX = this.backgroundPanX - 1720.0;
                if (var28 != 0) {
                  break scanLoop1;
                }
              }
            }
            if (obfuscationGuard != -132670633) {
              this.fireRateUpgradeLevel = -125;
            }
            break;
          }
          while (true) {
            if (this.backgroundPanY + this.cameraLookAheadY > 0.0) {
              this.backgroundPanY = this.backgroundPanY - 1280.0;
              if (var28 == 0) {
                this.backgroundTileY = this.backgroundTileY - 1;
                continue;
              }
            }
            break;
          }
          double var3 = this.cameraScale / 1000.0;
          double var5 = 3.141592653589793 * this.playerAircraft.heading / 128.0;
          double var7 = Math.sin(var5) * 192.0 * this.cameraScale / 1000.0;
          double var9 = 192.0 * Math.cos(var5) * this.cameraScale / 1000.0;
          this.cameraLookAheadY = this.cameraLookAheadY + (-this.cameraLookAheadY + var9) * 0.05;
          this.cameraLookAheadX = this.cameraLookAheadX + 0.05 * (-this.cameraLookAheadX + var7);
          int var11 = (int)(this.backgroundPanX - this.cameraLookAheadX * 2.0 / 3.0);
          int var12 = (int)(this.backgroundPanY - this.cameraLookAheadY * 2.0 / 3.0);
          double var13 = (double)(sh.field_u / 2);
          double var15 = (double)(gp.field_w / 2);
          int var17 = this.backgroundTint;
          if (this.lightningCountdown <= 10) {
            boolean decompiledSharedTail0 = !(this.lightningCountdown <= 5);
            if (!decompiledSharedTail0) {
              var17 = this.blendArgb(this.lightningCountdown * 51, -1, obfuscationGuard - 437819992, this.backgroundTint);
              decompiledSharedTail0 = (var28 != 0);
            }
            if (decompiledSharedTail0) {
              var17 = this.blendArgb((10 - this.lightningCountdown) * 51, -1, obfuscationGuard - 437819992, this.backgroundTint);
            }
          }
          int var18 = this.backgroundTileY;
          int var19 = (int)(this.cameraLookAheadX + var13);
          int var20 = (int)(this.cameraLookAheadY + var15);
          int var21 = -1280 + var12;
          scanLoop2: while (true) {
            if (var21 <= gp.field_w) {
              int var22_int = this.backgroundTileX;
              stackIn_48_0 = var11 - 1720;
              if (var28 != 0) {
                break scanLoop2;
              }
              int var23 = stackIn_48_0;
              while (var23 <= sh.field_u) {
                is.backgroundSprites[qg.a((byte) 110, is.backgroundSprites.length, var22_int * 23 + 7 * var18)].a((int)(var13 + this.cameraLookAheadX) + var23, var21 + (int)(var15 + this.cameraLookAheadY), 1, 0, 0);
                var22_int++;
                var23 += 1720;
              }
              var18++;
              var21 += 1280;
              continue scanLoop2;
            }
            stackIn_48_0 = 0;
            break;
          }
          int var21Lifetime1 = stackIn_48_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var21Lifetime1 >= this.scorchMarkCount))) {
            ScorchMark var22 = this.scorchMarks[var21Lifetime1];
            int var23Lifetime1 = var19 + var22.worldX - this.backgroundTileX * 1720 + var11;
            int var24 = var20 + (var22.worldY - 1280 * this.backgroundTileY) + var12;
            int var25 = var22.diameter;
            stackIn_70_0 = var23Lifetime1;
            stackIn_70_1 = -500 - var25;
            if (var28 == 0) {
              if (stackIn_70_0 >= stackIn_70_1 &&
                -var25 - 500 <= var24 &&
                (500 + var25 + sh.field_u) >= var23Lifetime1 &&
                var24 <= var25 + gp.field_w + 500) {
                co.scorchSprites[var22.spriteIndex].b(-(var25 >> 1) + var23Lifetime1, var24 - (var25 >> 1), var25, var25);
              } else {
                int incrementValue$0 = var21Lifetime1;
                var21Lifetime1--;
                this.removeScorchMark(incrementValue$0, 10355);
              }
              var21Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_70_0 = -1;
            stackIn_70_1 = this.smokeParticleCount;
          }
          int var21Lifetime2 = stackIn_70_0 + stackIn_70_1;
          scanLoop3: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var21Lifetime2 >= 0) {
              SmokeParticle var22_ref = this.smokeParticles[var21Lifetime2];
              int stackIn_91_0 = var22_ref.depthPhase;
              int stackIn_91_1 = 30;
              if (var28 != 0) {
                if (stackIn_91_0 > stackIn_91_1) {
                  FlightBody var22_ref2 = this.backgroundBodies[var21Lifetime2];
                  var23Lifetime2 = (int)((var22_ref2.position.x + this.cameraLookAheadX) * var3 * 0.9 + var13);
                  var24Lifetime1 = (int)((var22_ref2.position.y + this.cameraLookAheadY) * var3 * 0.9 + var15);
                  var25Lifetime1 = (int)((double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a() * var3 * 0.9);
                  var26 = (int)(0.9 * ((double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].b() * var3));
                  sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var25Lifetime1, var26, 0, var17, 1);
                  var21Lifetime2 += 2;
                  break scanLoop3;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (stackIn_91_0 <= stackIn_91_1 ||
                  var28 != 0) {
                  var23Lifetime2 = (int)(var13 + (var22_ref.position.x + this.cameraLookAheadX) * this.computePhaseScale((byte) -125, var22_ref.depthPhase, var3));
                  var24Lifetime1 = (int)(var15 + (var22_ref.position.y + this.cameraLookAheadY) * this.computePhaseScale((byte) -123, var22_ref.depthPhase, var3));
                  if (var22_ref.lifetimeTicks < 512) {
                    if (var22_ref.colourOrBlastRadius < 0) {
                      var25Lifetime1 = (int)(var3 * (double)(2 * -var22_ref.colourOrBlastRadius));
                      var26 = var22_ref.ageTicks * bl.explosionSprites.length / var22_ref.lifetimeTicks;
                      bl.explosionSprites[var26].b(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var25Lifetime1 >> 1) + var24Lifetime1, var25Lifetime1, var25Lifetime1);
                    } else {
                      var25Lifetime1 = var22_ref.spriteIndex;
                      var26 = (int)(var3 * (double)(50 * var22_ref.ageTicks) / (double)var22_ref.lifetimeTicks + 10.0);
                      int var27 = -(var22_ref.ageTicks * 256 / var22_ref.lifetimeTicks) + 256;
                      es.smokeSprites[var25Lifetime1].a(-(var26 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var26, var26, 0, var27 << 23 & -14870727 | var22_ref.colourOrBlastRadius & 16777215, 1);
                    }
                  }
                }
                var21Lifetime2--;
                continue;
              }
            }
            if (decompiledFrameRemainder1 &&
              var2_int != 0) {
              var21Lifetime2 = 0;
              while (true) {
                int stackIn_91_0Lifetime1 = ~var21Lifetime2;
                int stackIn_91_1Lifetime1 = ~this.backgroundBodies.length;
                if (stackIn_91_0Lifetime1 <= stackIn_91_1Lifetime1) {
                  break;
                }
                FlightBody var22_ref2Lifetime3 = this.backgroundBodies[var21Lifetime2];
                int var23Lifetime2Lifetime1 = (int)((var22_ref2Lifetime3.position.x + this.cameraLookAheadX) * var3 * 0.9 + var13);
                int var24Lifetime1Lifetime1 = (int)((var22_ref2Lifetime3.position.y + this.cameraLookAheadY) * var3 * 0.9 + var15);
                int var25Lifetime1Lifetime1 = (int)((double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a() * var3 * 0.9);
                int var26Lifetime4 = (int)(0.9 * ((double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].b() * var3));
                sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a(-(var25Lifetime1Lifetime1 >> 1) + var23Lifetime2Lifetime1, -(var26Lifetime4 >> 1) + var24Lifetime1Lifetime1, var25Lifetime1Lifetime1, var26Lifetime4, 0, var17, 1);
                var21Lifetime2 += 2;
                if (var28 != 0) {
                  break scanLoop3;
                }
              }
            }
            var21Lifetime2 = 0;
            break;
          }
          scanLoop4: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.pickupCount > var21Lifetime2) {
              Pickup var22_ref3 = this.pickups[var21Lifetime2];
              int stackIn_118_0 = -1;
              int stackIn_118_1 = ~var22_ref3.remainingTicks;
              if (var28 != 0) {
                if (stackIn_118_0 > stackIn_118_1) {
                  Bullet var22_ref4 = this.bullets[var21Lifetime2];
                  var23Lifetime3 = (int)(var13 + (var22_ref4.position.x + this.cameraLookAheadX) * var3);
                  var24Lifetime2 = (int)(var3 * (var22_ref4.position.y + this.cameraLookAheadY) + var15);
                  dc.bulletSprite.a((float)var23Lifetime3, (float)var24Lifetime2, (int)((double)(var22_ref4.remainingTicks * 42) * var3), (int)(256.0 * var22_ref4.heading));
                  var21Lifetime2++;
                  break scanLoop4;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_118_0 < stackIn_118_1) {
                  stackIn_105_0 = (var22_ref3.remainingTicks >> 1) + 92;
                } else {
                  stackIn_105_0 = 92;
                }
                var23Lifetime3 = stackIn_105_0;
                var24Lifetime2 = (int)((this.cameraLookAheadX + var22_ref3.position.x) * this.computePhaseScale((byte) -124, var23Lifetime3, var3) + var13);
                int var25Lifetime2 = (int)((this.cameraLookAheadY + var22_ref3.position.y) * this.computePhaseScale((byte) -122, var23Lifetime3, var3) + var15);
                int var26Lifetime1 = (int)(var3 * (double)(42 * var23Lifetime3));
                if (400 - var22_ref3.remainingTicks < 15) {
                  var26Lifetime1 = var26Lifetime1 * (-var22_ref3.remainingTicks + 400) / 15;
                }
                if (0 > var22_ref3.remainingTicks) {
                  Pickup.powerchuteSprites[var22_ref3.pickupCode].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, var22_ref3.remainingTicks * 20, 0, -16777216 | 190 * var23Lifetime3 / 92 * 65793, 1);
                } else {
                  Pickup.powerchuteSprites[var22_ref3.pickupCode].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, 20 * var22_ref3.remainingTicks);
                }
                var21Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var21Lifetime2 = 0;
              while (true) {
                int stackIn_118_0Lifetime1 = ~var21Lifetime2;
                int stackIn_118_1Lifetime1 = ~this.bulletCount;
                if (stackIn_118_0Lifetime1 <= stackIn_118_1Lifetime1) {
                  break;
                }
                Bullet var22_ref4Lifetime1 = this.bullets[var21Lifetime2];
                int var23Lifetime3Lifetime1 = (int)(var13 + (var22_ref4Lifetime1.position.x + this.cameraLookAheadX) * var3);
                var24Lifetime2 = (int)(var3 * (var22_ref4Lifetime1.position.y + this.cameraLookAheadY) + var15);
                dc.bulletSprite.a((float)var23Lifetime3Lifetime1, (float)var24Lifetime2, (int)((double)(var22_ref4Lifetime1.remainingTicks * 42) * var3), (int)(256.0 * var22_ref4Lifetime1.heading));
                var21Lifetime2++;
                if (var28 != 0) {
                  break scanLoop4;
                }
              }
            }
            Aircraft[] var21_ref_md__ = this.aircraft;
            int var22_intLifetime1 = 0;
            while (var22_intLifetime1 < var21_ref_md__.length) {
              boolean decompiledFrameRemainder2 = true;
              Aircraft var23_ref_md = var21_ref_md__[var22_intLifetime1];
              if ((var23_ref_md != null ||
                var28 != 0) && var23_ref_md.lifecyclePhase > 2) {
                int var24Lifetime2Lifetime1 = (int)((var23_ref_md.position.x + this.cameraLookAheadX) * this.computePhaseScale((byte) -126, var23_ref_md.lifecyclePhase, var3) + var13);
                int var25Lifetime2Lifetime1 = (int)((var23_ref_md.position.y + this.cameraLookAheadY) * this.computePhaseScale((byte) -126, var23_ref_md.lifecyclePhase, var3) + var15);
                int var26Lifetime1Lifetime1 = 4 * var23_ref_md.bankOffset / 16 + 4;
                if (var23_ref_md == this.playerAircraft &&
                  this.respawnInvulnerabilityTicks > 0) {
                  int var27Lifetime1 = -16777216;
                  var27Lifetime1 = var27Lifetime1 | 65793 * (int)(-Math.cos((double)this.respawnInvulnerabilityTicks * 3.141592653589793 / 5.0) * (double)this.respawnInvulnerabilityTicks + (double)this.respawnInvulnerabilityTicks);
                  var23_ref_md.definition.getSprites(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.lifecyclePhase)), (int)(256.0 * var23_ref_md.heading), 3, var27Lifetime1, 1);
                  decompiledFrameRemainder2 = (var28 != 0);
                }
                if (decompiledFrameRemainder2) {
                  if (ro.field_u == var23_ref_md.definition) {
                    var23_ref_md.definition.getSprites(-32275)[0].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(var23_ref_md.lifecyclePhase * 32) * var3), 0);
                    var23_ref_md.definition.getSprites(-32275)[1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(32 * var23_ref_md.lifecyclePhase) * var3), var23_ref_md.bankOffset << 10);
                    int var27Lifetime1Lifetime1 = (var23_ref_md.bankOffset & 536870975) << 3;
                    if (var27Lifetime1Lifetime1 <= 255) {
                      stackIn_144_0 = var27Lifetime1Lifetime1;
                    } else {
                      stackIn_144_0 = 511 - var27Lifetime1Lifetime1;
                    }
                    var27Lifetime1Lifetime1 = stackIn_144_0;
                    var23_ref_md.definition.getSprites(-32275)[2].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(var23_ref_md.lifecyclePhase * 32) * var3), var23_ref_md.bankOffset << 10, 0, var27Lifetime1Lifetime1 * -16711423, 2);
                    var23_ref_md.definition.getSprites(obfuscationGuard ^ 132651706)[2].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(32 * var23_ref_md.lifecyclePhase) * var3), var23_ref_md.bankOffset << 10, 0, var27Lifetime1Lifetime1 * -16711423, 2);
                    if (var28 != 0) {
                      var23_ref_md.definition.getSprites(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.lifecyclePhase)), (int)(256.0 * var23_ref_md.heading));
                    }
                  } else {
                    var23_ref_md.definition.getSprites(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.lifecyclePhase)), (int)(256.0 * var23_ref_md.heading));
                  }
                }
              }
              var22_intLifetime1++;
              if (var28 == 0) {
                continue;
              }
              break;
            }
            var21Lifetime2 = -1 + this.smokeParticleCount;
            break;
          }
          while (var21Lifetime2 >= 0) {
            SmokeParticle var22_refLifetime1 = this.smokeParticles[var21Lifetime2];
            int stackIn_169_0 = ~var22_refLifetime1.depthPhase;
            int stackIn_169_1 = -31;
            if (var28 != 0) {
              if (stackIn_169_0 < stackIn_169_1) {
                FlightBody var22_ref2Lifetime1 = this.backgroundBodies[var21Lifetime2];
                int var23Lifetime4 = (int)(var3 * (this.cameraLookAheadX + var22_ref2Lifetime1.position.x) + var13);
                int var24Lifetime3 = (int)(var15 + (this.cameraLookAheadY + var22_ref2Lifetime1.position.y) * var3);
                int var25Lifetime3 = (int)(var3 * (double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a());
                int var26Lifetime2 = (int)((double)sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].b() * var3);
                sd.cloudSprites[var21Lifetime2 % sd.cloudSprites.length].a(-(var25Lifetime3 >> 1) + var23Lifetime4, var24Lifetime3 - (var26Lifetime2 >> 1), var25Lifetime3, var26Lifetime2, 0, var17, 1);
                var21Lifetime2 += 2;
                return;
              }
              return;
            }
            if (stackIn_169_0 < stackIn_169_1 ||
              var28 != 0) {
              int var23Lifetime4Lifetime1 = (int)(var13 + (this.cameraLookAheadX + var22_refLifetime1.position.x) * this.computePhaseScale((byte) -124, var22_refLifetime1.depthPhase, var3));
              int var24Lifetime3Lifetime1 = (int)(var15 + (var22_refLifetime1.position.y + this.cameraLookAheadY) * this.computePhaseScale((byte) -119, var22_refLifetime1.depthPhase, var3));
              if (512 > var22_refLifetime1.lifetimeTicks) {
                if (var22_refLifetime1.colourOrBlastRadius >= 0) {
                  var25Lifetime3Lifetime1 = var22_refLifetime1.spriteIndex;
                  var26Lifetime2Lifetime1 = (int)(10.0 + var3 * (double)(var22_refLifetime1.ageTicks * 50) / (double)var22_refLifetime1.lifetimeTicks);
                  int var27Lifetime2 = 256 - var22_refLifetime1.ageTicks * 256 / var22_refLifetime1.lifetimeTicks;
                  es.smokeSprites[var25Lifetime3Lifetime1].a(-(var26Lifetime2Lifetime1 >> 1) + var23Lifetime4Lifetime1, -(var26Lifetime2Lifetime1 >> 1) + var24Lifetime3Lifetime1, var26Lifetime2Lifetime1, var26Lifetime2Lifetime1, 0, 16777215 & var22_refLifetime1.colourOrBlastRadius | -9633548 & var27Lifetime2 << 23, 1);
                } else {
                  var25Lifetime3Lifetime1 = (int)(var3 * (double)(2 * -var22_refLifetime1.colourOrBlastRadius));
                  var26Lifetime2Lifetime1 = bl.explosionSprites.length * var22_refLifetime1.ageTicks / var22_refLifetime1.lifetimeTicks;
                  bl.explosionSprites[var26Lifetime2Lifetime1].b(-(var25Lifetime3Lifetime1 >> 1) + var23Lifetime4Lifetime1, var24Lifetime3Lifetime1 - (var25Lifetime3Lifetime1 >> 1), var25Lifetime3Lifetime1, var25Lifetime3Lifetime1);
                }
              }
            }
            var21Lifetime2--;
          }
          if (var2_int == 0) {
            return;
          }
          int var21Lifetime3 = 1;
          while (true) {
            int stackIn_169_0Lifetime1 = ~this.backgroundBodies.length;
            int stackIn_169_1Lifetime1 = ~var21Lifetime3;
            if (stackIn_169_0Lifetime1 >= stackIn_169_1Lifetime1) {
              break;
            }
            FlightBody var22_ref2Lifetime2 = this.backgroundBodies[var21Lifetime3];
            int var23Lifetime5 = (int)(var3 * (this.cameraLookAheadX + var22_ref2Lifetime2.position.x) + var13);
            int var24Lifetime4 = (int)(var15 + (this.cameraLookAheadY + var22_ref2Lifetime2.position.y) * var3);
            int var25Lifetime4 = (int)(var3 * (double)sd.cloudSprites[var21Lifetime3 % sd.cloudSprites.length].a());
            int var26Lifetime3 = (int)((double)sd.cloudSprites[var21Lifetime3 % sd.cloudSprites.length].b() * var3);
            sd.cloudSprites[var21Lifetime3 % sd.cloudSprites.length].a(-(var25Lifetime4 >> 1) + var23Lifetime5, var24Lifetime4 - (var26Lifetime3 >> 1), var25Lifetime4, var26Lifetime3, 0, var17, 1);
            var21Lifetime3 += 2;
            if (var28 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2), "pk.N(" + obfuscationGuard + ')');
        }
    }

    final void resumeGame(int obfuscationGuard) {
        try {
          int var2_int = -5 % ((obfuscationGuard + 73) / 34);
          this.paused = false;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.Q(" + obfuscationGuard + ')');
        }
    }

    final static boolean d(int param0) {
        try {
          if (param0 <= -56) {
            boolean stackIn_7_0 = (nb.field_c == jq.field_fb);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var1 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var1), "pk.RA(" + param0 + ')');
        }
    }

    private final AircraftDefinition getArcadeAircraftDefinition(byte obfuscationGuard, int typeIndex) {
        int obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 99) {
            this.backgroundPanX = -1.7731094820794981;
          }
          int selectedType = typeIndex;
          if (selectedType == 0 &&
            obfuscationControl == 0) {
            AircraftDefinition stackIn_32_0 = kk.field_N;
            return stackIn_32_0;
          }
          if (selectedType == 1) {
            AircraftDefinition stackIn_34_0 = sl.field_p;
            return stackIn_34_0;
          }
          if (selectedType == 3) {
            AircraftDefinition stackIn_36_0 = gm.field_y;
            return stackIn_36_0;
          }
          if (selectedType == 2 &&
            obfuscationControl == 0) {
            AircraftDefinition stackIn_38_0 = qq.field_g;
            return stackIn_38_0;
          }
          if (selectedType == 4 &&
            obfuscationControl == 0) {
            AircraftDefinition stackIn_40_0 = ju.field_k;
            return stackIn_40_0;
          }
          if (selectedType == 5) {
            AircraftDefinition stackIn_42_0 = ro.field_u;
            return stackIn_42_0;
          }
          AircraftDefinition stackIn_44_0 = kk.field_N;
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.AB(" + obfuscationGuard + ',' + typeIndex + ')');
        }
    }

    final void renderSession(int obfuscationGuard, boolean unusedFlag, GraphicsRenderer renderer) {
        String stackIn_19_2 = null;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.drawWorld(-132670633);
          this.drawHud(renderer, -20240);
          if (!this.attractMode) {
            HudMessage var4 = (HudMessage) (wd.hudMessages.first(obfuscationGuard ^ -251723521));
            while (var4 != null) {
              if (var5 != 0) {
                return;
              }
              if (var4 != null) {
                var4.draw(obfuscationGuard ^ 16711886);
              }
              var4 = (HudMessage) (wd.hudMessages.next((byte) 103));
            }
          }
          if (obfuscationGuard != -16711936) {
            this.removeSmokeParticle(8, 125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_18_0 = runtimeException;
          StringBuilder stackIn_18_1 = new StringBuilder().append("pk.CB(").append(obfuscationGuard).append(',').append(unusedFlag).append(',');
          if (renderer == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void fadeMusicLayers(int obfuscationGuard, int volumeStep) {
        int stackIn_33_0 = 0;
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.gameMusic != null &&
            !this.alternateMusicActive) {
            int var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (16 <= var3_int))) {
              boolean stackOut_10_0 = sd.musicLayerPresets[this.musicLayerPresetIndex][var3_int];
              stackIn_33_0 = stackOut_10_0 ? 1 : 0;
              boolean stackIn_11_0 = stackOut_10_0;
              if (var5 == 0) {
                int stackIn_17_0 = (!stackIn_11_0) ? 0 : 255;
                int var4 = stackIn_17_0;
                if (var4 > this.musicChannelVolumes[var3_int]) {
                  this.musicChannelVolumes[var3_int] = this.musicChannelVolumes[var3_int] + volumeStep;
                  if (this.musicChannelVolumes[var3_int] > var4) {
                    this.musicChannelVolumes[var3_int] = var4;
                  }
                }
                if (var4 < this.musicChannelVolumes[var3_int]) {
                  this.musicChannelVolumes[var3_int] = this.musicChannelVolumes[var3_int] - volumeStep;
                  if (var4 > this.musicChannelVolumes[var3_int]) {
                    this.musicChannelVolumes[var3_int] = var4;
                  }
                }
                this.gameMusic.a((byte) -126, this.musicChannelVolumes[var3_int], var3_int);
                var3_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_33_0 = obfuscationGuard;
            }
            if (stackIn_33_0 != 24260) {
              this.scoreMultiplier = 9;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var3), "pk.E(" + obfuscationGuard + ',' + volumeStep + ')');
        }
    }

    private final void queueHudMessage(int colour, byte obfuscationGuard, String text) {
        String stackIn_6_2 = null;
        try {
          wd.hudMessages.addLast(120, new HudMessage(text, colour));
          int var4_int = 105 % ((obfuscationGuard - 70) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("pk.G(").append(colour).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void startAttractMode(byte obfuscationGuard) {
        try {
          wd.hudMessages.clear(268435455);
          gh.playerDefinition.fireInterval = ub.basePlayerDefinition.fireInterval;
          this.paused = false;
          gh.playerDefinition.maximumHitPoints = ub.basePlayerDefinition.maximumHitPoints;
          gh.playerDefinition.heatReduction = ub.basePlayerDefinition.heatReduction;
          gh.playerDefinition.maximumSpeed = ub.basePlayerDefinition.maximumSpeed;
          gh.playerDefinition.turnRate = ub.basePlayerDefinition.turnRate;
          this.invulnerabilityCheat = false;
          Aircraft var2 = this.playerAircraft;
          this.stopAircraftEngineSounds(true);
          this.playerAircraft = new Aircraft(new Vector2(), gh.playerDefinition);
          this.aircraft = new Aircraft[16];
          this.aircraft[0] = this.playerAircraft;
          this.playerAircraft.engineSound = po.a(this.computeSpatialVolume(this.playerAircraft.position, 200, this.playerAircraft.position), 0, this.playerAircraft.definition.getEngineSample((byte) 93));
          this.smokeParticles = new SmokeParticle[1000];
          this.lives = 3;
          this.bullets = new Bullet[1000];
          this.completedWaveCount = 20;
          this.respawnInvulnerabilityTicks = 120;
          this.bulletCount = 0;
          if (null != var2) {
            this.playerAircraft.heading = var2.heading;
          }
          if (obfuscationGuard <= 34) {
            this.gameMusic = (MidiPcmStream) null;
          }
          this.pickups = new Pickup[16];
          this.pickupCount = 0;
          this.upgradeCredits = 0;
          this.attractMode = true;
          this.smokeParticleCount = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.HA(" + obfuscationGuard + ')');
        }
    }

    private final double computePhaseScale(byte obfuscationGuard, int depthPhase, double normalScale) {
        try {
          if (depthPhase == 92) {
            double stackIn_2_0 = normalScale;
            return stackIn_2_0;
          }
          if (obfuscationGuard >= -118) {
            double stackIn_5_0 = -0.6152644756512422;
            return stackIn_5_0;
          }
          double var5_double = 3.0 - (-(1.0 / normalScale) + 3.0) * (double)depthPhase / 92.0;
          double stackIn_7_0 = 1.0 / var5_double;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var5 = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var5), "pk.FB(" + obfuscationGuard + ',' + depthPhase + ',' + normalScale + ')');
        }
    }

    private final void startClassicWave(int obfuscationGuard) {
        AircraftDefinition stackIn_21_2 = null;
        try {
          this.backgroundTintBlendTicks = 255;
          this.previousBackgroundTint = this.backgroundTint;
          this.targetBackgroundTint = mr.field_b[this.classicWaveIndex];
          this.lightningRandomBound = gi.field_e[this.classicWaveIndex];
          if (this.lightningCountdown == -1) {
            this.lightningCountdown = this.lightningRandomBound;
          }
          this.queueHudMessage(16744448, (byte) -44, oe.classicWaveMessages[this.classicWaveIndex]);
          int[] waveComposition = ArchiveProvider.classicWaveCompositions[this.classicWaveIndex];
          if (obfuscationGuard != -20416) {
            this.respawnInvulnerabilityTicks = -42;
          }
          int remainingPickupBudget = waveComposition[6];
          if (waveComposition[5] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) -128, ro.field_u, waveComposition[5], remainingPickupBudget);
          }
          if (waveComposition[4] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) -118, ju.field_k, waveComposition[4], remainingPickupBudget);
          }
          if (waveComposition[3] > 0) {
            int stackIn_20_1 = -127;
            if (this.classicWaveIndex <= 10) {
              stackIn_21_2 = id.field_f;
            } else {
              stackIn_21_2 = qq.field_g;
            }
            remainingPickupBudget = this.spawnAircraft((byte) stackIn_20_1, stackIn_21_2, waveComposition[3], remainingPickupBudget);
          }
          if (waveComposition[2] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) -128, gm.field_y, waveComposition[2], remainingPickupBudget);
          }
          if (0 < waveComposition[1]) {
            remainingPickupBudget = this.spawnAircraft((byte) -125, sl.field_p, waveComposition[1], remainingPickupBudget);
          }
          if (waveComposition[0] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) 127, kk.field_N, waveComposition[0], remainingPickupBudget);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException failure = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) failure), "pk.OA(" + obfuscationGuard + ')');
        }
    }

    private final int spawnAircraft(byte obfuscationGuard, AircraftDefinition definition, int count, int pickupCount) {
        int stackIn_16_0 = 0;
        String stackIn_21_2 = null;
        int var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var5_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_int >= count))) {
            int var6 = 3200 + (int)this.playerAircraft.position.x + np.a(-1600, 1600, (byte) -42);
            int var7 = (int)this.playerAircraft.position.y + (2400 + np.a(-1200, 1200, (byte) -46));
            Aircraft var8 = new Aircraft(new Vector2((double)var6, (double)var7), definition);
            int incrementValue$1 = pickupCount;
            pickupCount--;
            stackIn_16_0 = incrementValue$1;
            if (var9 == 0) {
              if (stackIn_16_0 > 0) {
                Aircraft stackIn_12_0 = var8;
                int stackIn_12_1 = 20;
                int stackIn_13_2 = (!this.arcadeMode) ? 4 : 9;
                stackIn_12_0.dropPickupCode = qq.a(stackIn_12_1, stackIn_13_2);
              }
              this.installAircraft((byte) 112, var8);
              var5_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var5_int = 18 / ((obfuscationGuard + 74) / 36);
            stackIn_16_0 = pickupCount;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var5 = decompiledCaughtParameter0;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("pk.PA(").append(obfuscationGuard).append(',');
          if (definition == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(count).append(',').append(pickupCount).append(')').toString());
        }
    }

    private final void advanceScreenParticles(int obfuscationGuard) {
        int stackIn_41_0 = 0;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          int var2_int = 0;
          if (obfuscationGuard > -79) {
            this.gameMusic = (MidiPcmStream) null;
          }
          scanLoop1: while (true) {
            if (var2_int < this.screenParticleCount) {
              ScreenParticle var3_ref_ok = this.screenParticles[var2_int];
              if (var7 == 0) {
                if (var3_ref_ok != null) {
                  int fieldTemp$0 = var3_ref_ok.ageTicks + 1;
                  var3_ref_ok.ageTicks = var3_ref_ok.ageTicks + 1;
                  if (!(var3_ref_ok.durationTicks >= fieldTemp$0)) {
                    int incrementValue$1 = var2_int;
                    var2_int--;
                    this.removeScreenParticle((byte) -94, incrementValue$1);
                  }
                } else {
                  int incrementValue$1Lifetime1 = var2_int;
                  var2_int--;
                  this.removeScreenParticle((byte) -94, incrementValue$1Lifetime1);
                }
                var3_ref_ok.previousXQ8 = var3_ref_ok.xQ8;
                var3_ref_ok.previousYQ8 = var3_ref_ok.yQ8;
                var3_ref_ok.radiusQ8 = var3_ref_ok.radiusQ8 + var3_ref_ok.radiusVelocityQ8;
                var3_ref_ok.yQ8 = var3_ref_ok.yQ8 + var3_ref_ok.yVelocityQ8;
                var3_ref_ok.xQ8 = var3_ref_ok.xQ8 + var3_ref_ok.xVelocityQ8;
                var3_ref_ok.yVelocityQ8 = var3_ref_ok.yVelocityQ8 + var3_ref_ok.yAccelerationQ8;
                var3_ref_ok.radiusVelocityQ8 = var3_ref_ok.radiusVelocityQ8 + var3_ref_ok.radiusAccelerationQ8;
                var3_ref_ok.xVelocityQ8 = var3_ref_ok.xVelocityQ8 + var3_ref_ok.xAccelerationQ8;
                var2_int++;
                continue;
              }
            } else if (this.playerAircraft.weaponHeat <= 100) {
              break scanLoop1;
            }
            if (this.hudHidePhase < 200) {
              var2_int = (int)(-Math.cos((double)this.hudHidePhase * 3.141592653589793 / 200.0) * 128.0) + 128;
              int var3 = var2_int * 80 >> 8;
              int var4 = var3 + 623;
              this.emitGrowingScreenParticle(80, var4 << 8, 2560, (byte) -115, np.a(20, 40, (byte) 99) * (this.playerAircraft.weaponHeat - 100) / 100, 117760, (-12800 + 128 * this.playerAircraft.weaponHeat) / 100);
            }
            break;
          }
          if (this.simulationTick % 40 == 0) {
            this.sampledUpgradeCredits = this.upgradeCredits;
          }
          HudMessage var2 = (HudMessage) (wd.hudMessages.first(268435455));
          scanLoop2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var2 != null) {
              boolean stackOut_27_0 = var2.advanceAndIsExpired(-122);
              stackIn_41_0 = stackOut_27_0 ? 1 : 0;
              boolean stackIn_28_0 = stackOut_27_0;
              if (var7 != 0) {
                break scanLoop2;
              }
              if (!stackIn_28_0) {
                decompiledFrameRemainder0 = !(var2.c((byte) 47));
              } else {
                var2.unlink(-127);
              }
              if (decompiledFrameRemainder0) {
                var2 = (HudMessage) (wd.hudMessages.next((byte) 103));
                continue;
              }
            }
            stackIn_41_0 = ~this.scoreAnimationTicks;
            break;
          }
          if (stackIn_41_0 != -1) {
            this.scoreAnimationTicks = this.scoreAnimationTicks - 1;
            if (this.scoreAnimationTicks == 0) {
              this.displayedScore = this.targetScore;
            }
          } else if (~this.displayedScore != ~or.score) {
            this.scoreAnimationTicks = 20;
            this.targetScore = or.score;
            if (var7 != 0) {
              this.scoreAnimationTicks = this.scoreAnimationTicks - 1;
              if (this.scoreAnimationTicks == 0) {
                this.displayedScore = this.targetScore;
              }
            }
          }
          if (this.creditAnimationTicks != 0) {
            this.creditAnimationTicks = this.creditAnimationTicks - 1;
            if (this.creditAnimationTicks == 0) {
              this.displayedUpgradeCredits = this.targetUpgradeCredits;
            }
          } else if (~this.upgradeCredits != ~this.displayedUpgradeCredits) {
            this.targetUpgradeCredits = this.upgradeCredits;
            this.creditAnimationTicks = 20;
            if (var7 != 0) {
              this.creditAnimationTicks = this.creditAnimationTicks - 1;
              if (this.creditAnimationTicks == 0) {
                this.displayedUpgradeCredits = this.targetUpgradeCredits;
              }
            }
          }
          if (this.multiplierPanelHidePhase > 0 &&
            this.scoreMultiplier > 1) {
            this.multiplierPanelHidePhase = this.multiplierPanelHidePhase - 5;
          }
          if (this.multiplierAnimationTicks != 0) {
            this.multiplierAnimationTicks = this.multiplierAnimationTicks - 1;
            if (this.multiplierAnimationTicks == 0) {
              this.displayedMultiplier = this.targetMultiplier;
              if (var7 != 0 &&
                this.scoreMultiplier != this.displayedMultiplier) {
                this.targetMultiplier = this.scoreMultiplier;
                this.multiplierAnimationTicks = 20;
              }
            }
          } else if (this.scoreMultiplier != this.displayedMultiplier) {
            this.targetMultiplier = this.scoreMultiplier;
            this.multiplierAnimationTicks = 20;
          }
          int var3Lifetime1 = this.displayedHealthPercent - this.playerAircraft.hitPoints * 100 / gh.playerDefinition.maximumHitPoints;
          this.displayedTemporaryWeaponTicks = this.playerAircraft.temporaryWeaponTicks + this.displayedTemporaryWeaponTicks >> 1;
          if (var3Lifetime1 > 0) {
            this.displayedHealthPercent = this.displayedHealthPercent - (1 + (var3Lifetime1 >> 4));
          }
          if ((var3Lifetime1 <= 0 ||
            var7 != 0) &&
            var3Lifetime1 < 0) {
            this.displayedHealthPercent = this.displayedHealthPercent - ((var3Lifetime1 >> 4) - 1);
          }
          if (this.playerAircraft.weaponHeat >= 100) {
            this.displayedWeaponHeat = this.playerAircraft.weaponHeat + this.displayedWeaponHeat - 100 >> 1;
            if (var7 != 0) {
              this.displayedWeaponHeat = this.displayedWeaponHeat + this.playerAircraft.weaponHeat >> 1;
            }
          } else {
            this.displayedWeaponHeat = this.displayedWeaponHeat + this.playerAircraft.weaponHeat >> 1;
          }
          if (this.playerAircraft.temporaryWeapon > 0 &&
            this.temporaryWeaponOpacity < 255) {
            this.temporaryWeaponOpacity = this.temporaryWeaponOpacity + 8;
            if (this.temporaryWeaponOpacity > 255) {
              this.temporaryWeaponOpacity = 255;
            }
          }
          if (this.playerAircraft.temporaryWeapon == 0 &&
            this.temporaryWeaponOpacity > 0) {
            this.temporaryWeaponOpacity = this.temporaryWeaponOpacity - 8;
            if (this.temporaryWeaponOpacity < 0) {
              this.temporaryWeaponOpacity = 0;
            }
          }
          if (!this.attractMode &&
            !this.arcadeMode &&
            !this.paused &&
            1 == vj.pressedMouseButton) {
            int var4Lifetime1 = -22 + ln.field_c;
            int var5 = -22 + lq.field_a;
            int var6 = 0;
            while (var6 < 7) {
              if (var7 != 0) {
                return;
              }
              if (var4Lifetime1 * var4Lifetime1 + var5 * var5 < 289) {
                this.purchaseUpgrade(1, var6);
              }
              var5 -= 38;
              var6++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.I(" + obfuscationGuard + ')');
        }
    }

    FlightSession() {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.targetBackgroundTint = 0;
        this.temporaryWeaponOpacity = 0;
        this.attractMode = true;
        this.simulationTick = 0;
        this.displayedWeaponHeat = 0;
        this.backgroundTint = 0;
        this.backgroundTintBlendTicks = 0;
        this.shotsFired = 0;
        this.victoryCountdown = -1;
        this.displayedHealthPercent = 100;
        this.previousBackgroundTint = 0;
        this.lightningCountdown = -1;
        this.noLivesLost = true;
        this.lightningRandomBound = -1;
        this.shotsHit = 0;
        this.screenParticles = new ScreenParticle[1000];
        this.displayedTemporaryWeaponTicks = 0;
        this.upgradeFlashTicks = new int[7];
        this.scorchMarks = new ScorchMark[200];
        this.scratchPosition = new Vector2(0.0, 0.0);
        this.lastLeftPressTick = -100;
        this.musicChannelVolumes = new int[16];
        this.scoreAnimationTicks = 0;
        this.multiplierPanelHidePhase = 200;
        this.healthUpgradeLevel = 0;
        this.manualMusicLayers = false;
        this.rightHeldLastTick = false;
        this.overheatFireLatch = false;
        this.controlTick = 0;
        this.alternateMusicActive = false;
        this.cameraScale = 600.0;
        this.speedUpgradeLevel = 0;
        this.doubleTapTurnDirection = 0;
        this.displayedMultiplier = 1;
        this.targetScore = 0;
        this.creditAnimationTicks = 0;
        this.targetMultiplier = 1;
        this.invulnerabilityCheat = false;
        this.displayedScore = 0;
        this.lastRightPressTick = -100;
        this.multiplierAnimationTicks = 0;
        this.turnRateUpgradeLevel = 0;
        this.leftHeldLastTick = false;
        this.fireRateUpgradeLevel = 0;
        this.hudHidePhase = 200;
        this.scoreMultiplier = 1;
        try {
          boolean stackIn_4_1 = !(2 > ln.field_d);
          this.debugControlsEnabled = stackIn_4_1;
          Vector2 var1 = new Vector2();
          int var2 = qq.a(20, 128);
          this.backgroundBodies = new FlightBody[30];
          int var3 = 0;
          while (30 > var3) {
            var1.set((double)qq.a(20, 3200), (double)qq.a(20, 2400), true);
            FlightBody var4 = new FlightBody(var1);
            var4.speed = 0.5;
            var4.heading = (double)(qq.a(20, 128) + var2);
            this.backgroundBodies[var3] = var4;
            var3++;
            if (var5 != 0) {
              return;
            }
          }
          this.startAttractMode((byte) 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.<init>()");
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
