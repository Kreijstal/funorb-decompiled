/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FlightSession {
    private Vector2 scratchPosition;
    private int field_a;
    private int field_k;
    private int field_bb;
    private int timedSpriteEffectCount;
    private boolean attractMode;
    private int shotsHit;
    private int field_zb;
    private int simulationTick;
    private int screenParticleCount;
    private Aircraft[] aircraft;
    private int field_eb;
    private boolean debugControlsEnabled;
    int finalAccuracyPercent;
    private int victoryCountdown;
    private int respawnDelayTicks;
    private SmokeParticle[] smokeParticles;
    private int field_O;
    private int field_sb;
    private int field_db;
    private int shotsFired;
    private int field_fb;
    private Pickup[] pickups;
    private int smokeParticleCount;
    static RendererManager field_wb;
    private Bullet[] bullets;
    private int pickupCount;
    private int field_o;
    private FlightBody[] backgroundBodies;
    private Aircraft playerAircraft;
    private boolean noLivesLost;
    int finalScore;
    private int field_L;
    private ScreenParticle[] screenParticles;
    private int bulletCount;
    static hc field_e;
    private int field_qb;
    private int[] field_r;
    private TimedSpriteEffect[] timedSpriteEffects;
    private int field_gb;
    private int field_v;
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
    private boolean field_Eb;
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
    private int field_G;
    private boolean manualMusicLayers;
    private int controlTick;
    private int musicLayerPresetIndex;
    private int lives;
    private int fireRateUpgradeLevel;
    private double field_hb;
    private double field_u;
    private int turnRateUpgradeLevel;
    private int targetScore;
    private int lastRightPressTick;
    private int field_Db;
    private int multiplierAnimationTicks;
    private double backgroundPanY;
    private int field_y;
    private int scoreMultiplier;
    private int field_R;
    private int field_f;
    private double backgroundPanX;

    private final void drawHud(GraphicsRenderer renderer, int obfuscationGuard) {
        int stackIn_55_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_104_0 = 0;
        bo stackIn_135_0;
        int stackIn_135_1;
        int stackIn_135_2;
        int stackIn_135_3;
        int stackIn_135_4;
        int stackIn_136_5 = 0;
        int stackIn_141_0 = 0;
        int stackIn_141_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_184_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ScreenParticle var4 = null;
        int var5 = 0;
        bo var5_ref_bo = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Aircraft[] var10_ref_md__ = null;
        int var10 = 0;
        int var11 = 0;
        Aircraft var12 = null;
        int var13 = 0;
        int var11Lifetime1;
        var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_R < 200) {
            var3_int = 128 + (int)(128.0 * -Math.cos((double)this.field_R * 3.141592653589793 / 200.0));
            var4_int = var3_int * 140 >> 8;
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
                  var10_ref_md__ = this.aircraft;
                  var11 = 0;
                  while (var10_ref_md__.length > var11) {
                    var12 = var10_ref_md__[var11];
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
                  this.field_y = this.upgradeCredits;
                }
                stackIn_55_0 = ((1 + var7) > this.field_y) ? 0 : 1;
                var10 = stackIn_55_0;
                if (var7 == 6) {
                  var8 = 20;
                } else if (var7 == 4 ||
                  5 == var7) {
                  if (6 < var8) {
                    var8 = 6;
                  }
                  stackIn_72_0 = var10;
                  if (var8 >= 6) {
                    stackIn_73_1 = 0;
                  } else {
                    stackIn_73_1 = 1;
                  }
                  var10 = stackIn_72_0 & stackIn_73_1;
                  var8 += 13;
                } else {
                  if (var8 > 12) {
                    var8 = 12;
                  }
                  stackIn_81_0 = var10;
                  if (12 <= var8) {
                    stackIn_82_1 = 0;
                  } else {
                    stackIn_82_1 = 1;
                  }
                  var10 = stackIn_81_0 & stackIn_82_1;
                }
                jm.field_a[var8].a(var5, var6);
                if (var7 == 6) {
                  if (this.scoreMultiplier <= 50) {
                    stackIn_90_0 = 16777215 | 255 * this.scoreMultiplier / 50 << 24;
                  } else {
                    stackIn_90_0 = -1;
                  }
                  var11Lifetime1 = stackIn_90_0;
                  jm.field_a[1 + var8].a(var5, var6, 0, var11Lifetime1, 1);
                }
                bs.field_b[var7].a(var5, var6);
                if (var10 != 0) {
                  HighscoreQuery.field_o[1].a(var5 - 9, -12 + var6, 0, var9 * 16843009, 2);
                }
                if (this.field_r[var7] > 0) {
                  var9 = this.field_r[var7];
                  if (64 <= var9) {
                    if (var9 > 448) {
                      stackIn_104_0 = -(var9 - 512 << 2);
                    } else {
                      stackIn_104_0 = 255;
                    }
                  } else {
                    stackIn_104_0 = var9 << 2;
                  }
                  var9 = stackIn_104_0;
                  var9 = (-var3_int + 256) * var9 >> 8;
                  if (var9 > 0) {
                    PacketBuffer.field_j.a(16777215 | var9 << 24, -1, var5 + 55, ii.field_e[var7], obfuscationGuard ^ -1573, 24 + var6);
                  }
                }
                var6 += 38;
                var7++;
              }
            }
            if (decompiledFrameCompleted0) {
              var5_ref_bo = fa.a(renderer, true);
              var6 = 0;
              if (this.field_G > 0) {
                var6 = 40 * (int)(-Math.cos((double)this.field_G * 3.141592653589793 / 200.0) * 128.0) + 5120 >> 8;
              }
              if (this.field_Eb &&
                this.debugControlsEnabled) {
                var4_int = (var3_int * 40 >> 8) + var6;
                renderer.d(33, 70, 0 - var4_int, -5782, -65281, sh.field_u - 211);
                var4_int = var3_int * 146 >> 8;
                renderer.d(33, 213, 0, -5782, -65281, -149 + sh.field_u + var4_int);
              }
              var4_int = var6 + (40 * var3_int >> 8);
              ua.field_g[1].a(-208 + sh.field_u, -var4_int);
              this.drawRollingDigits(this.displayedMultiplier, 3, -var4_int + 4, true, this.multiplierAnimationTicks, this.targetMultiplier, -167 + sh.field_u, true, 10);
              var4_int = 146 * var3_int >> 8;
              ua.field_g[0].a(sh.field_u - 146 + var4_int, 0);
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
                  ii.field_k[1][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, 124 + var8, -this.field_a + var8 + 104, 82);
                  ii.field_k[1][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.field_k[1][0].a(var7, var8);
                  var7 = var4_int + (sh.field_u - 50);
                  var8 = -150 + gp.field_w;
                  ii.field_k[0][2].a(var7, var8);
                  var5_ref_bo.a(var7 + 20, var7, var8 + 124, -this.field_eb + var8 + 101, -92);
                  ii.field_k[0][1].a(var7, var8);
                  var5_ref_bo.a(true);
                  ii.field_k[0][0].a(var7, var8);
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
                  ii.field_k[2][3].a(var7, var8, 0, 16777215 | this.field_bb << 24, 1);
                  var5_ref_bo.a(30 + var7, var7, 135 + var8, -this.field_qb + (103 + var8), obfuscationGuard + 20115);
                  ii.field_k[2][2].a(var7, var8, 0, 16777215 | this.field_bb << 24, 1);
                  var5_ref_bo.a(true);
                  ii.field_k[2][1].a(var7, var8, 0, this.field_bb << 24 | 16777215, 1);
                  var9 = (int)((1.0 + Math.sin((double)this.simulationTick * 3.141592653589793 / 20.0)) * (double)this.field_bb / 2.0);
                  break;
                }
                var10 = -(var9 * 100 / gh.playerDefinition.maximumHitPoints) + (var8 + 100);
                renderer.b(var10, var7 + 5, var7 + 10, 1879048192, var10, 1);
                renderer.b(var10 + 1, var7 + 5, var7 + 10, 1073741824, var10 + 1, 1);
                var9++;
              } while (var13 == 0);
              stackIn_135_0 = var5_ref_bo;
              stackIn_135_1 = 30 + var7;
              stackIn_135_2 = var7;
              stackIn_135_3 = var8 + 135;
              stackIn_135_4 = 103 + var8 - this.field_qb;
              if (this.field_qb >= 99) {
                stackIn_136_5 = 50;
              } else {
                stackIn_136_5 = 0;
              }
              ((bo) (Object) stackIn_135_0).a(stackIn_135_1, stackIn_135_2, stackIn_135_3, stackIn_135_4 - stackIn_136_5, 100);
              ii.field_k[2][0].a(var7, var8, 0, 16843009 * var9, 2);
              var5_ref_bo.a(true);
              if (this.field_gb > 0) {
                po.field_e[-1 + this.field_gb].a(var7 + 7, 104 + var8, 0, this.field_bb << 24 | 16777215, 1);
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_141_0 = obfuscationGuard;
            stackIn_141_1 = -20240;
          }
          if (stackIn_141_0 != stackIn_141_1) {
            this.field_G = -51;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3_int >= this.screenParticleCount))) {
            var4 = this.screenParticles[var3_int];
            stackIn_173_0 = -1;
            if (var13 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_173_0 > ~var4.field_d) {
                var5 = var4.field_k >> 8;
                var6 = var4.field_n >> 8;
                var7 = var4.field_m >> 8;
                var8 = (var4.field_d - Math.abs(var4.field_h)) * var4.field_p / var4.field_d;
                if (var4.field_e != 0 ||
                  !(var4.field_h < var4.field_d)) {
                  if ((var4.field_e == 1)) {
                    es.field_b[(var4.field_d + var4.field_p) % es.field_b.length].a(-var7 + var5, var6 - var7, var7 << 1, var7 << 1, 0, var8 << 24 | 16777215, 1);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var8 <= 64) {
                    stackIn_170_0 = var8 << 26 | 16711680;
                  } else {
                    if (var8 <= 192) {
                      stackIn_170_0 = (-64 + var8 | -1107296384) << 9;
                    } else {
                      stackIn_170_0 = var8 - 192 << 2 | -256;
                    }
                  }
                  var9 = stackIn_170_0;
                  renderer.b(var6, var5, var4.field_c >> 8, var9, var4.field_g >> 8, obfuscationGuard ^ -20239);
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
            PacketBuffer.field_j.a(119, -16711936, -16777216, 50, sh.field_u - 20, Integer.toString(this.musicLayerPresetIndex));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_183_0 = var3;
          stackIn_183_1 = new StringBuilder().append("pk.V(");
          if (renderer == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void a(byte param0, Vector2 param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        FlightBody[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        FlightBody var7 = null;
        int var8 = 0;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.field_db > 0) {
            this.field_db = this.field_db - 1;
            this.field_sb = this.b(this.field_db, this.field_o, -570490625, this.field_k);
          }
          if (0 < this.field_zb) {
            this.field_zb = this.field_zb - 1;
          }
          if (10 == this.field_zb) {
            lq.a(hp.field_i, -28);
          }
          if (this.field_zb == 0) {
            if (this.field_L <= 0) {
              this.field_zb = -1;
              if (var8 != 0) {
                if (qq.a(20, this.field_L) >= 10) {
                  this.field_zb = 10 + qq.a(20, this.field_L) + (this.field_L >> 1);
                  this.field_zb = qq.a(20, 20) + 10;
                } else {
                  this.field_zb = qq.a(20, 20) + 10;
                }
              }
            } else {
              if (qq.a(20, this.field_L) >= 10) {
                this.field_zb = 10 + qq.a(20, this.field_L) + (this.field_L >> 1);
                if (var8 != 0) {
                  this.field_zb = qq.a(20, 20) + 10;
                }
              } else {
                this.field_zb = qq.a(20, 20) + 10;
              }
            }
          }
          var3_int = np.a(-5, 5, (byte) 75);
          var5 = 125 / ((-14 - param0) / 43);
          var4 = this.backgroundBodies;
          var6 = 0;
          while (var6 < var4.length) {
            var7 = var4[var6];
            var7.headingOffset = var7.headingOffset + var3_int;
            var7.position.subtract(param1, -30507);
            var7.advance(2);
            var7.wrapSquare(1300000.0 / this.cameraScale, -87);
            var6++;
            if (var8 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("pk.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final int a(Vector2 param0, int param1, Vector2 param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = param1;
          if (!(600.0 >= this.cameraScale)) {
            if (this.cameraScale < 1000.0) {
              var4_int = (int)((double)var4_int * (400.0 - (1000.0 - this.cameraScale)) / 400.0);
              if (var6 != 0) {
                var4_int = 0;
              }
            }
          } else {
            var4_int = 0;
          }
          if (param0 == param2) {
            stackIn_9_0 = var4_int;
            return stackIn_9_0;
          }
          var5 = (int)sb.a(param1 ^ 157, param0, param2);
          if (var5 > 1000) {
            var4_int = 0;
          }
          if ((var5 <= 1000 ||
            var6 != 0) &&
            var5 > 10) {
            var4_int = var4_int * (-var5 + 10 + 990) / 990;
          }
          stackIn_17_0 = var4_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("pk.EA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void emitSmoke(int size, Vector2 position, byte obfuscationGuard, int colour) {
        SmokeParticle dupTemp$1 = null;
        RuntimeException runtimeException = null;
        SmokeParticle var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.smokeParticles.length <= this.smokeParticleCount) {
            return;
          }
          var5 = this.smokeParticles[this.smokeParticleCount];
          if (obfuscationGuard != -74) {
            this.manualMusicLayers = false;
          }
          if (var5 == null) {
            dupTemp$1 = new SmokeParticle();
            this.smokeParticles[this.smokeParticleCount] = dupTemp$1;
            var5 = dupTemp$1;
          }
          var5.a(-32, position, colour, size);
          this.smokeParticleCount = this.smokeParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("pk.R(").append(size).append(',');
          if (position == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(',').append(colour).append(')').toString());
        }
    }

    private final void setMusicLayersImmediately(int obfuscationGuard) {
        int var2_int = 0;
        int var3 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.gameMusic != null &&
            !this.alternateMusicActive) {
            if (obfuscationGuard != 11154) {
              this.field_hb = 0.030616966813019907;
            }
            var2_int = 0;
            while (16 > var2_int) {
              if (var3 != 0) {
                return;
              }
              stackIn_19_0 = this.musicChannelVolumes;
              stackIn_19_1 = var2_int;
              if (sd.musicLayerPresets[this.musicLayerPresetIndex][var2_int]) {
                stackIn_20_2 = 255;
              } else {
                stackIn_20_2 = 0;
              }
              stackIn_19_0[stackIn_19_1] = stackIn_20_2;
              this.gameMusic.a((byte) -120, this.musicChannelVolumes[var2_int], var2_int);
              var2_int++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.IA(" + obfuscationGuard + ')');
        }
    }

    private final void selectAircraftTarget(Aircraft aircraft, int obfuscationGuard) {
        int stackIn_19_0 = 0;
        int stackIn_23_1 = 0;
        Aircraft stackIn_88_0 = null;
        Object stackIn_153_0 = null;
        Aircraft stackIn_153_1 = null;
        Aircraft stackIn_178_0 = null;
        Aircraft stackIn_178_1 = null;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        String stackIn_184_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        Aircraft[] aircraftCandidates = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Aircraft candidateAircraft = null;
        int obfuscationControl = 0;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
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
            var3_int = qq.a(20, this.aircraft.length);
            if (null != this.aircraft[var3_int]) {
              stackIn_19_0 = (gh.playerDefinition != aircraft.definition) ? 0 : 1;
              if (this.aircraft[var3_int].definition != gh.playerDefinition) {
                stackIn_23_1 = 0;
              } else {
                stackIn_23_1 = 1;
              }
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
            this.field_Eb = true;
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
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_183_0 = var3_ref;
          stackIn_183_1 = new StringBuilder().append("pk.O(");
          if (aircraft == null) {
            stackIn_184_2 = "null";
          } else {
            stackIn_184_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_183_0), ((StringBuilder) (Object) stackIn_183_1).append(stackIn_184_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void startArcadeWave(byte obfuscationGuard, int waveNumber) {
        int discarded$0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] aircraftCosts = null;
        int remainingPickupCarriers = 0;
        int typeIndex = 0;
        int obfuscationControl = 0;
        int stackIn_29_0Lifetime1;
        int stackIn_29_1Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.field_db = 255;
          this.field_o = this.field_sb;
          var3_int = qq.a(obfuscationGuard - 8, 220);
          var4 = qq.a(20, 200);
          var4Lifetime1 = 152;
          var5 = qq.a(obfuscationGuard ^ 8, 128);
          if (obfuscationGuard != 28) {
            this.advanceDestroyedAircraft(true, (Aircraft) null);
          }
          var5Lifetime1 = 127;
          var3_intLifetime1 = 192;
          this.field_k = var3_intLifetime1 << 24 | this.b(var4Lifetime1, 0, obfuscationGuard ^ -570490653, this.b(var5Lifetime1, 255, obfuscationGuard ^ -570490653, 16777215));
          if (var3_intLifetime1 > 190 &&
            var4Lifetime1 > 150) {
            this.field_L = qq.a(obfuscationGuard ^ 8, 255) + 100;
            if (this.field_zb == -1) {
              this.field_zb = this.field_L;
              if (obfuscationControl != 0) {
                this.field_L = -1;
              }
            }
          } else {
            this.field_L = -1;
          }
          aircraftCosts = new int[]{1, 3, 4, 6, 8, 20};
          waveNumber = waveNumber << 1;
          remainingPickupCarriers = 2;
          while (waveNumber > 0) {
            if (obfuscationControl != 0) {
              return;
            }
            typeIndex = 0;
            while (aircraftCosts.length > typeIndex) {
              stackIn_29_0 = waveNumber >> 1;
              stackIn_29_1 = aircraftCosts[typeIndex];
              if (stackIn_29_0 >= stackIn_29_1) {
                typeIndex++;
                continue;
              }
              break;
            }
            stackIn_29_0Lifetime1 = 0;
            stackIn_29_1Lifetime1 = typeIndex;
            if (stackIn_29_0Lifetime1 < stackIn_29_1Lifetime1) {
              typeIndex--;
            }
            waveNumber = waveNumber - aircraftCosts[typeIndex];
            discarded$0 = this.spawnAircraft((byte) -120, this.getArcadeAircraftDefinition((byte) 108, typeIndex), 1, remainingPickupCarriers);
            if (remainingPickupCarriers > 0) {
              remainingPickupCarriers--;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.S(" + obfuscationGuard + ',' + waveNumber + ')');
        }
    }

    final void startGame(int obfuscationGuard, boolean arcadeMode) {
        RuntimeException runtimeException = null;
        Aircraft var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.alternateMusicActive = false;
          lm.a(40, tg.field_a[1], true, (byte) -58);
          this.gameMusic = wt.field_e.field_s;
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
          this.field_f = 0;
          this.field_G = 200;
          ei.field_a = 0;
          this.targetScore = 0;
          this.turnRateUpgradeLevel = 0;
          this.upgradeCredits = 0;
          this.scoreMultiplier = 1;
          this.field_Eb = false;
          this.targetMultiplier = 1;
          gh.playerDefinition.turnRate = ub.basePlayerDefinition.turnRate;
          or.score = 0;
          se.field_b = 0;
          this.healthUpgradeLevel = 0;
          this.field_v = 0;
          NetworkGameClient.field_x = 0;
          gh.playerDefinition.maximumHitPoints = ub.basePlayerDefinition.maximumHitPoints;
          this.displayedScore = 0;
          gh.playerDefinition.fireInterval = ub.basePlayerDefinition.fireInterval;
          r.field_n = 0;
          this.speedUpgradeLevel = 0;
          this.displayedMultiplier = 1;
          gh.playerDefinition.heatReduction = ub.basePlayerDefinition.heatReduction;
          var3 = this.playerAircraft;
          this.playerAircraft = new Aircraft(new Vector2(), gh.playerDefinition);
          this.playerAircraft.engineSound = po.a(this.a(this.playerAircraft.position, 200, this.playerAircraft.position), 0, this.playerAircraft.definition.getEngineSample((byte) -88));
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
          var4 = 0;
          do {
            if (var4 >= this.field_r.length) {
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
            this.field_r[var4] = -1;
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
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.F(" + obfuscationGuard + ',' + arcadeMode + ')');
        }
    }

    private final void advanceBullets(Vector2 cameraMovement, byte obfuscationGuard) {
        Object stackIn_11_0 = null;
        Aircraft stackIn_11_1 = null;
        int stackIn_82_1 = 0;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Bullet var4 = null;
        int var5 = 0;
        Aircraft[] var6_ref_md__ = null;
        int var6 = 0;
        int var7 = 0;
        Aircraft var8 = null;
        int var9 = 0;
        Object stackIn_11_0Lifetime1;
        Object stackIn_11_0Lifetime2;
        Aircraft stackIn_11_1Lifetime1;
        Aircraft stackIn_11_1Lifetime2;
        Aircraft[] var6_ref_md__Lifetime1;
        Aircraft var8Lifetime1;
        Aircraft[] var6_ref_md__Lifetime2;
        Aircraft var8Lifetime2;
        Object stackIn_11_0Lifetime1Lifetime1;
        Aircraft stackIn_11_1Lifetime1Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -93) {
            return;
          }
          var3_int = 0;
          while (var3_int < this.bulletCount) {
            var4 = this.bullets[var3_int];
            if (var9 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted1 = true;
            if (null != var4) {
              stackIn_11_0 = null;
              stackIn_11_1 = var4.sourceAircraft;
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
                  if (ro.field_u != var4.sourceAircraft.definition) {
                    if (var4.sourceAircraft.definition != gh.playerDefinition) {
                      var6_ref_md__ = this.aircraft;
                      var7 = 0;
                      scanLoop1: while (true) {
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
                            break scanLoop1;
                          }
                          var7++;
                          continue;
                        }
                        break;
                      }
                    } else {
                      var6_ref_md__ = this.aircraft;
                      var7 = 0;
                      scanLoop2: while (true) {
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
                            if (this.playerAircraft == var4.sourceAircraft) {
                              stackIn_82_1 = 50;
                            } else {
                              stackIn_82_1 = 25;
                            }
                            this.addScore(stackIn_82_1 * this.scoreMultiplier, -54);
                            if (var8.hitPoints != 0) {
                              break scanLoop2;
                            }
                            if (var8.dropPickupCode <= -1) {
                              break scanLoop2;
                            }
                            this.a(var8.position, obfuscationGuard + 32690, var8.dropPickupCode);
                            var8.dropPickupCode = -1;
                            break scanLoop2;
                          }
                          var7++;
                          continue;
                        }
                        break;
                      }
                    }
                  } else {
                    var6_ref_md__Lifetime2 = this.aircraft;
                    var7Lifetime2 = 0;
                    scanLoop3: while (true) {
                      if (var6_ref_md__Lifetime2.length > var7Lifetime2) {
                        var8Lifetime2 = var6_ref_md__Lifetime2[var7Lifetime2];
                        stackIn_11_0Lifetime1Lifetime1 = null;
                        stackIn_11_1Lifetime1Lifetime1 = var8Lifetime2;
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
                            break scanLoop3;
                          }
                          if (var8Lifetime2.dropPickupCode <= -1) {
                            break scanLoop3;
                          }
                          this.a(var8Lifetime2.position, 32597, var8Lifetime2.dropPickupCode);
                          var8Lifetime2.dropPickupCode = -1;
                          break scanLoop3;
                        }
                        var7Lifetime2++;
                        continue;
                      }
                      break;
                    }
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var6_ref_md__Lifetime1 = this.aircraft;
                  var7Lifetime1 = 0;
                  while (var7Lifetime1 < var6_ref_md__Lifetime1.length) {
                    var8Lifetime1 = var6_ref_md__Lifetime1[var7Lifetime1];
                    stackIn_11_0Lifetime2 = null;
                    stackIn_11_1Lifetime2 = var8Lifetime1;
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
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0) &&
              (decompiledFrameCompleted1)) {
              while (true) {
                this.removeBullet(73, var3_int);
                var3_int--;
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0) &&
              (var5 != 0)) {
              var4.advance(2);
              this.emitSmoke(80, var4.position, (byte) -74, -20);
              var6 = this.a(this.playerAircraft.position, obfuscationGuard + 293, var4.position);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_172_0 = var3;
          stackIn_172_1 = new StringBuilder().append("pk.C(");
          if (cameraMovement == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void removeTimedSpriteEffect(int index, int obfuscationGuard) {
        RuntimeException runtimeException = null;
        TimedSpriteEffect var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.timedSpriteEffectCount = this.timedSpriteEffectCount - 1;
          if (~index == ~this.timedSpriteEffectCount) {
            return;
          }
          var3 = this.timedSpriteEffects[index];
          this.timedSpriteEffects[index] = this.timedSpriteEffects[this.timedSpriteEffectCount];
          if (obfuscationGuard != 10355) {
            this.field_Eb = false;
          }
          this.timedSpriteEffects[this.timedSpriteEffectCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.M(" + index + ',' + obfuscationGuard + ')');
        }
    }

    private final void fireBullets(byte obfuscationGuard, Aircraft aircraft) {
        Bullet dupTemp$0 = null;
        Bullet dupTemp$1 = null;
        Bullet dupTemp$2 = null;
        Bullet stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackIn_32_3 = 0;
        Bullet stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackIn_40_3 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Bullet var4 = null;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        Bullet var4Lifetime1;
        Bullet var4Lifetime1Lifetime1;
        double var6Lifetime1;
        double var6Lifetime1Lifetime1;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = aircraft.definition.gunPattern;
          if (1 == aircraft.temporaryWeapon) {
            var3_int = 1;
          }
          if (aircraft.temporaryWeapon == 2) {
            var3_int = 2;
          }
          if (this.bulletCount >= -var3_int + this.bullets.length) {
            return;
          }
          var4 = this.bullets[this.bulletCount];
          var5 = aircraft.definition.aimSpread;
          var6 = (double)np.a(-var5, var5, (byte) 83) / 300.0;
          if (var3_int != 1) {
            if (var4 == null) {
              dupTemp$0 = new Bullet();
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
            var6Lifetime1 = (double)np.a(-var5, var5, (byte) 83) / 100.0;
            var4Lifetime1 = this.bullets[this.bulletCount];
            if (var4Lifetime1 == null) {
              dupTemp$1 = new Bullet();
              this.bullets[this.bulletCount] = dupTemp$1;
              var4Lifetime1 = dupTemp$1;
            }
            stackIn_31_0 = var4Lifetime1;
            stackIn_31_1 = aircraft.definition.collisionRadius;
            stackIn_31_2 = 0;
            if (2 != var3_int) {
              stackIn_32_3 = 0;
            } else {
              stackIn_32_3 = 10;
            }
            ((Bullet) (Object) stackIn_31_0).spawn(stackIn_31_1, stackIn_31_2, (double)stackIn_32_3 + var6Lifetime1, aircraft);
            this.bulletCount = this.bulletCount + 1;
            var4Lifetime1Lifetime1 = this.bullets[this.bulletCount];
            var6Lifetime1Lifetime1 = (double)np.a(-var5, var5, (byte) -67) / 100.0;
            if (var4Lifetime1Lifetime1 == null) {
              dupTemp$2 = new Bullet();
              this.bullets[this.bulletCount] = dupTemp$2;
              var4Lifetime1Lifetime1 = dupTemp$2;
            }
            stackIn_39_0 = var4Lifetime1Lifetime1;
            stackIn_39_1 = -aircraft.definition.collisionRadius;
            stackIn_39_2 = 0;
            if (var3_int == 2) {
              stackIn_40_3 = -10;
            } else {
              stackIn_40_3 = 0;
            }
            ((Bullet) (Object) stackIn_39_0).spawn(stackIn_39_1, stackIn_39_2, (double)stackIn_40_3 + var6Lifetime1Lifetime1, aircraft);
            if (aircraft == this.playerAircraft) {
              this.shotsFired = this.shotsFired + 2;
            }
            this.bulletCount = this.bulletCount + 1;
          }
          var8 = this.a(this.playerAircraft.position, 200, aircraft.position);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_74_0 = var3;
          stackIn_74_1 = new StringBuilder().append("pk.T(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    private final void a(Aircraft param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = (int)(param0.position.x / 3.0);
          var4 = (int)(param0.position.y / 3.0);
          var5 = (int)(this.backgroundPanX - (double)(1720 * this.field_fb));
          var6 = (int)(this.backgroundPanY - (double)(1280 * this.field_O));
          this.a(-var6 + var4, param1 - 22703, -var5 + var3_int, param0.definition.collisionRadius << 2);
          if (param1 != 8073) {
            this.drawHud((GraphicsRenderer) null, -110);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pk.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawRollingDigits(int settledValue, int digitCount, int top, boolean suppressLeadingZeros, int remainingAnimationTicks, int targetValue, int right, boolean alternateGlyphBank, int obfuscationGuard) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int foldHeight = 0;
        RuntimeException failure = null;
        int shadeAlpha = 0;
        GraphicsRenderer renderer = null;
        int settledBankPending = 0;
        int targetBankPending = 0;
        int skipZeroSuppression = 0;
        int settledGlyphIndex = 0;
        int targetGlyphIndex = 0;
        int obfuscationControl = 0;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          foldHeight = (int)(Math.cos(3.141592653589793 * (double)remainingAnimationTicks / 20.0) * 10.0);
          shadeAlpha = (int)(100.0 * Math.sin(3.141592653589793 * (double)remainingAnimationTicks / 20.0));
          renderer = field_wb.a((byte) 95);
          settledBankPending = alternateGlyphBank ? 1 : 0;
          targetBankPending = alternateGlyphBank ? 1 : 0;
          if (obfuscationGuard != 10) {
            this.startClassicWave(94);
          }
          stackIn_8_0 = (alternateGlyphBank) ? 0 : 1;
          skipZeroSuppression = stackIn_8_0;
          scanLoop1: while (true) {
            settledGlyphIndex = settledValue % 10;
            targetGlyphIndex = targetValue % 10;
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
                if ((obfuscationControl != 0) &&
                  (alternateGlyphBank)) {
                  settledGlyphIndex += 22;
                }
              } else if (alternateGlyphBank) {
                settledGlyphIndex += 22;
              }
            }
            skipZeroSuppression = 0;
            in.field_c[targetGlyphIndex].a(right, top);
            in.field_c[settledGlyphIndex + 11].a(right, 10 + top);
            do {
              if (~targetGlyphIndex != ~settledGlyphIndex) {
                boolean drawSettledFold = !(foldHeight >= 0);
                if (!drawSettledFold) {
                  in.field_c[11 + targetGlyphIndex].b(right, 10 + top, 16, foldHeight);
                  renderer.d(foldHeight, 16, top + 10, -5782, shadeAlpha << 24 | 16777215, right);
                  drawSettledFold = (obfuscationControl != 0);
                }
                if (drawSettledFold) {
                  in.field_c[settledGlyphIndex].b(right, foldHeight + 10 + top, 16, -foldHeight);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.HB(" + settledValue + ',' + digitCount + ',' + top + ',' + suppressLeadingZeros + ',' + remainingAnimationTicks + ',' + targetValue + ',' + right + ',' + alternateGlyphBank + ',' + obfuscationGuard + ')');
        }
    }

    private final void removeSmokeParticle(int index, int obfuscationGuard) {
        SmokeParticle var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.smokeParticleCount = this.smokeParticleCount - 1;
          if (index == this.smokeParticleCount) {
            return;
          }
          if (obfuscationGuard != -690800984) {
            this.respawnDelayTicks = -99;
          }
          var3 = this.smokeParticles[index];
          this.smokeParticles[index] = this.smokeParticles[this.smokeParticleCount];
          this.smokeParticles[this.smokeParticleCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.JA(" + index + ',' + obfuscationGuard + ')');
        }
    }

    private final void removeScreenParticle(byte obfuscationGuard, int index) {
        RuntimeException runtimeException = null;
        ScreenParticle var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.screenParticleCount = this.screenParticleCount - 1;
          if (index == this.screenParticleCount) {
            return;
          }
          var3 = this.screenParticles[index];
          this.screenParticles[index] = this.screenParticles[this.screenParticleCount];
          this.screenParticles[this.screenParticleCount] = var3;
          if (obfuscationGuard != -94) {
            this.updatePlayerControls((byte) -55);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.A(" + obfuscationGuard + ',' + index + ')');
        }
    }

    final void submitFinalScore(int obfuscationGuard) {
        ScoreSubmission stackIn_12_0 = null;
        ScoreSubmission stackIn_12_1 = null;
        ScoreSubmission stackIn_13_0 = null;
        ScoreSubmission stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_15_3;
        int stackIn_16_4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        ScoreSubmission stackIn_13_0Lifetime1;
        ScoreSubmission stackIn_13_1Lifetime1;
        try {
          if (to.lastScoreSubmission == null &&
            this.finalScore > 0 &&
            !tt.field_a) {
            stackIn_12_0 = null;
            stackIn_12_1 = null;
            if (this.arcadeMode) {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_2 = 1;
            } else {
              stackIn_13_0 = null;
              stackIn_13_1 = null;
              stackIn_13_2 = 0;
            }
            stackIn_15_3 = 65535;
            if (!this.arcadeMode) {
              stackIn_13_0Lifetime1 = null;
              stackIn_13_1Lifetime1 = null;
              stackIn_16_4 = 0;
            } else {
              stackIn_13_0Lifetime1 = null;
              stackIn_13_1Lifetime1 = null;
              stackIn_16_4 = 1;
            }
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.GA(" + obfuscationGuard + ')');
        }
    }

    private final void handleKeyEvent(byte obfuscationGuard) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        Aircraft[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Aircraft var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
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
                this.field_gb = 1;
                tt.field_a = true;
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.playerAircraft.temporaryWeapon = 1;
              }
              if (bk.lastKeyCode == 2) {
                tt.field_a = true;
                this.field_gb = 2;
                this.playerAircraft.temporaryWeapon = 2;
                this.playerAircraft.temporaryWeaponTicks = 100;
              }
              if (bk.lastKeyCode == 3) {
                tt.field_a = true;
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.field_gb = 3;
                this.playerAircraft.temporaryWeapon = 3;
              }
              if (8 == bk.lastKeyCode) {
                this.lives = this.lives + 1;
                tt.field_a = true;
                this.playerAircraft.hitPoints = 0;
              }
              if (bk.lastKeyCode == 4) {
                this.playerAircraft.temporaryWeaponTicks = 100;
                this.field_gb = 4;
                tt.field_a = true;
                this.playerAircraft.temporaryWeapon = 4;
              }
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameCompleted1 = true;
              if (70 == bk.lastKeyCode) {
                this.upgradeCredits = 400;
                tt.field_a = true;
                wd.hudMessages.clear(268435455);
                var2_int = -1;
                while (var2_int < 8) {
                  MenuScreen.field_g.addLast(95, new iq(var2_int));
                  var2_int++;
                  if (var5 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted1) &&
                (decompiledFrameRemainder1 = (bk.lastKeyCode == 38))) {
                tt.field_a = true;
              }
              if (decompiledFrameRemainder1) {
                discarded$0 = this.spawnAircraft((byte) 108, ro.field_u, 1, 0);
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
                discarded$1 = this.spawnAircraft((byte) -123, ju.field_k, 1, 0);
              }
              if (bk.lastKeyCode == 41) {
                tt.field_a = true;
                this.a(new Vector2(100.0, 100.0), 32597, 2);
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted0 = true;
              if (bk.lastKeyCode == 33) {
                tt.field_a = true;
                var2 = this.aircraft;
                var3 = 0;
                while (var3 < var2.length) {
                  var4 = var2[var3];
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
              if ((decompiledFrameRemainder0) &&
                (this.field_db > 1)) {
                this.field_db = 1;
              }
              if (bk.lastKeyCode == 52) {
                this.field_Eb = this.field_Eb ^ true;
                tt.field_a = true;
              }
              if (bk.lastKeyCode == 50) {
                mj.field_b = mj.field_b ^ true;
              }
              if (bk.lastKeyCode == 65) {
                this.a(0, -14630, 0, 64);
                tt.field_a = true;
              }
            }
          }
          if (obfuscationGuard < 31) {
            this.field_eb = -94;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.NA(" + obfuscationGuard + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        ScreenParticle var8 = null;
        ScreenParticle dupTemp$0 = null;
        if (this.screenParticles.length <= this.screenParticleCount) {
          return;
        }
        try {
          int var9 = 23 % ((24 - param6) / 62);
          var8 = this.screenParticles[this.screenParticleCount];
          if (null == var8) {
            dupTemp$0 = new ScreenParticle();
            this.screenParticles[this.screenParticleCount] = dupTemp$0;
            var8 = dupTemp$0;
          }
          var8.a(param3, param1, param5, param2, param4, param0, -1588713311);
          this.screenParticleCount = this.screenParticleCount + 1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void i(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 32458) {
            field_e = (hc) null;
          }
          field_wb = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.BA(" + param0 + ')');
        }
    }

    private final void a(Vector2 param0, int param1, int param2, int param3, int param4) {
        SmokeParticle dupTemp$1 = null;
        RuntimeException runtimeException = null;
        SmokeParticle var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            return;
          }
          if (this.smokeParticles.length <= this.smokeParticleCount) {
            return;
          }
          var6 = this.smokeParticles[this.smokeParticleCount];
          if (var6 == null) {
            dupTemp$1 = new SmokeParticle();
            this.smokeParticles[this.smokeParticleCount] = dupTemp$1;
            var6 = dupTemp$1;
          }
          var6.a(param2, 122, param1, param4, param0);
          this.smokeParticleCount = this.smokeParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("pk.DB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void advancePickups(Vector2 cameraMovement, boolean obfuscationGuard) {
        int incrementValue$0 = 0;
        boolean discarded$1 = false;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Pickup var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard) {
            this.backgroundPanY = -0.6422101977961518;
          }
          var3_int = 0;
          while (var3_int < this.pickupCount) {
            var4 = this.pickups[var3_int];
            var4.position.subtract(cameraMovement, -30507);
            var4.remainingTicks = var4.remainingTicks - 1;
            if (var5 != 0) {
              return;
            }
            if (var4.remainingTicks <= 0) {
              if (!(var4.remainingTicks > -184)) {
                incrementValue$0 = var3_int;
                var3_int--;
                this.removePickup(false, incrementValue$0);
              }
            } else {
              if (uh.a(99, var4.position, (double)(this.playerAircraft.definition.collisionRadius + 16), this.playerAircraft.position)) {
                if (var4.pickupCode >= 4) {
                  discarded$1 = this.applyUpgrade((byte) -95, var4.pickupCode - 4);
                  incrementValue$2 = var3_int;
                  var3_int--;
                  this.removePickup(false, incrementValue$2);
                } else {
                  this.field_gb = var4.pickupCode + 1;
                  this.playerAircraft.temporaryWeaponTicks = 100;
                  this.playerAircraft.temporaryWeapon = 1 + var4.pickupCode;
                  bm.a((byte) -70, uh.upgradeSounds[1]);
                  this.queueTimedHudMessage(50, (byte) -127, -16711681, ke.field_c[var4.pickupCode]);
                  incrementValue$3 = var3_int;
                  var3_int--;
                  this.removePickup(false, incrementValue$3);
                }
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("pk.U(");
          if (cameraMovement == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void queueTimedHudMessage(int holdTicks, byte obfuscationGuard, int colour, String text) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.hudMessages.addLast(82, new HudMessage(text, colour, holdTicks));
          if (obfuscationGuard > -34) {
            this.a(-63, -32, -115, -32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pk.D(").append(holdTicks).append(',').append(obfuscationGuard).append(',').append(colour).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        ScreenParticle dupTemp$1 = null;
        RuntimeException runtimeException = null;
        ScreenParticle var8 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.screenParticles.length <= this.screenParticleCount) {
            return;
          }
          var8 = this.screenParticles[this.screenParticleCount];
          if (null == var8) {
            dupTemp$1 = new ScreenParticle();
            this.screenParticles[this.screenParticleCount] = dupTemp$1;
            var8 = dupTemp$1;
          }
          if (param3 > -35) {
            field_wb = (RendererManager) null;
          }
          var8.a(param1, false, param4, param0, param2, param6, param5);
          this.screenParticleCount = this.screenParticleCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void installAircraft(byte obfuscationGuard, Aircraft aircraft) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        Aircraft var4 = null;
        int var5 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          while (this.aircraft.length > var3_int) {
            var4 = this.aircraft[var3_int];
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
          discarded$2 = this.a(this.playerAircraft.position, 200, aircraft.position);
          aircraft.engineSound = po.a(this.a(this.playerAircraft.position, 200, aircraft.position), 0, aircraft.definition.getEngineSample((byte) -66));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_27_0 = runtimeException;
          stackIn_27_1 = new StringBuilder().append("pk.H(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final void addScore(int points, int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var3_int = or.score;
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
          } else {
            if (qq.a(20, 10) >= 5) {
              NetworkGameClient.field_x = NetworkGameClient.field_x - points;
              if (var5 != 0) {
                bo.field_h = bo.field_h - points;
              }
            } else {
              bo.field_h = bo.field_h - points;
            }
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
          var4 = -30 / ((26 - obfuscationGuard) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.LA(" + points + ',' + obfuscationGuard + ')');
        }
    }

    private final void purchaseUpgrade(int baseCost, int upgradeCode) {
        int cost = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        try {
          if (this.field_r[upgradeCode] > 0) {
            if (this.field_r[upgradeCode] > 448) {
              this.field_r[upgradeCode] = 512 - this.field_r[upgradeCode];
              if ((AceOfSkies.obfuscationControl) &&
                (this.field_r[upgradeCode] > 64)) {
                this.field_r[upgradeCode] = 64;
              }
            } else {
              if (this.field_r[upgradeCode] > 64) {
                this.field_r[upgradeCode] = 64;
              }
            }
          }
          cost = upgradeCode + baseCost;
          if (this.upgradeCredits >= cost &&
            this.applyUpgrade((byte) -14, upgradeCode)) {
            this.upgradeCredits = this.upgradeCredits - cost;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.MA(" + baseCost + ',' + upgradeCode + ')');
        }
    }

    private final int b(int param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 0) {
            stackIn_2_0 = param3;
            return stackIn_2_0;
          }
          if (256 <= param0) {
            stackIn_5_0 = param1;
            return stackIn_5_0;
          }
          var5_int = 256 - param0;
          var6 = (16711935 & param1) * param0 + (param3 & 16711935) * var5_int >>> 8 & param2;
          var7 = (16711890 & (65280 & param1) * param0 + var5_int * (65280 & param3)) >>> 8;
          var8 = param0 * (16711680 & param1 >>> 8) + var5_int * ((-16777216 & param3) >>> 8) & -16777216;
          stackIn_7_0 = var6 | var8 | var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void spawnWingman(int obfuscationGuard) {
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != -19054) {
            this.removeSmokeParticle(-82, -76);
          }
          discarded$1 = this.spawnAircraft((byte) -8, gh.playerDefinition, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "pk.TA(" + obfuscationGuard + ')');
        }
    }

    private final void removePickup(boolean obfuscationGuard, int index) {
        Pickup var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          this.pickupCount = this.pickupCount - 1;
          if (~index == ~this.pickupCount) {
            return;
          }
          if (obfuscationGuard) {
            this.handleKeyEvent((byte) -109);
          }
          var3 = this.pickups[index];
          this.pickups[index] = this.pickups[this.pickupCount];
          this.pickups[this.pickupCount] = var3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3_ref), "pk.K(" + obfuscationGuard + ',' + index + ')');
        }
    }

    private final void removeBullet(int obfuscationGuard, int index) {
        Bullet var3 = null;
        this.bulletCount = this.bulletCount - 1;
        if (~this.bulletCount == ~index) {
          return;
        }
        try {
          var3 = this.bullets[index];
          this.bullets[index] = this.bullets[this.bulletCount];
          this.bullets[this.bulletCount] = var3;
          int var4 = -12 / ((-3 - obfuscationGuard) / 40);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "pk.UA(" + obfuscationGuard + ',' + index + ')');
        }
    }

    final void advanceSession(boolean obfuscationGuard, boolean processInput) {
        int fieldTemp$0 = 0;
        int discarded$1 = 0;
        int discarded$2 = 0;
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        Vector2 stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        Aircraft stackIn_169_0 = null;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        Aircraft stackIn_265_0 = null;
        Aircraft stackIn_297_0 = null;
        int stackIn_371_0 = 0;
        int stackIn_371_1 = 0;
        double stackIn_381_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        Vector2 cameraMovement = null;
        RuntimeException failure = null;
        Aircraft[] aircraftToAdvance = null;
        int var4 = 0;
        int var5 = 0;
        Aircraft advancingAircraft = null;
        int var6_int = 0;
        Aircraft[] var6_ref_md__ = null;
        FlightBody[] backgroundToRecenter = null;
        Pickup[] pickupsToRecenter = null;
        Bullet[] bulletsToRecenter = null;
        SmokeParticle[] smokeParticlesToRecenter = null;
        double viewportMinimumExtent = 0.0;
        int var7 = 0;
        int var8_int = 0;
        Aircraft populationAircraft = null;
        Aircraft[] aircraftForSpawnCheck = null;
        FlightBody backgroundBody = null;
        Pickup pickupToRecenter = null;
        Bullet bulletToRecenter = null;
        SmokeParticle smokeToRecenter = null;
        double minimumCameraScale = 0.0;
        int var9 = 0;
        Aircraft[] aircraftForWaveCount = null;
        int var10_int = 0;
        Aircraft spawnObstacle = null;
        double attractCameraScale = 0.0;
        int var11 = 0;
        Aircraft waveAircraft = null;
        double maximumCameraScale = 0.0;
        Vector2 playerPosition = null;
        double scaledPlayerOffsetX = 0.0;
        double scaledPlayerOffsetY = 0.0;
        int obfuscationControl = 0;
        Aircraft[] aircraftForAttractPlayer;
        Aircraft attractPlayerCandidate;
        Aircraft[] aircraftToRecenter;
        Aircraft aircraftToShift;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var7Lifetime2;
        int var5Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
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
          if (((decompiledFrameCompleted6) && (!this.paused &&
            !this.attractMode)) &&
            (decompiledFrameRemainder2 = !(this.field_R <= 0))) {
            this.field_R = this.field_R - 5;
            decompiledFrameRemainder2 = (obfuscationControl != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (this.field_R < 200)) {
            this.field_R = this.field_R + 5;
          }
          this.advanceScreenParticles(-115);
          if (this.paused) {
            return;
          }
          this.simulationTick = this.simulationTick + 1;
          cameraMovement = new Vector2(this.playerAircraft.position);
          this.backgroundPanY = this.backgroundPanY - this.playerAircraft.position.y / 3.0;
          this.backgroundPanX = this.backgroundPanX - this.playerAircraft.position.x / 3.0;
          this.a((byte) 76, cameraMovement);
          aircraftToAdvance = this.aircraft;
          var5 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var5 >= aircraftToAdvance.length))) {
            advancingAircraft = aircraftToAdvance[var5];
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
            stackIn_38_1 = cameraMovement;
            stackIn_39_2 = !(obfuscationGuard);
            this.advancePickups(stackIn_38_1, stackIn_39_2);
            this.advanceBullets(cameraMovement, (byte) -93);
            this.advanceSmokeParticles(cameraMovement, 4473924);
          }
          var4 = 0;
          scanLoop1: while (true) {
            if (var4 < 7) {
              stackIn_261_0 = -1;
              stackIn_261_1 = ~this.field_r[var4];
              if (obfuscationControl == 0) {
                if (stackIn_261_0 >= stackIn_261_1 ||
                  this.upgradeCredits <= var4) {
                  if (this.field_r[var4] > 0) {
                    this.field_r[var4] = this.field_r[var4] - 1;
                  }
                } else {
                  this.field_r[var4] = 512;
                }
                var4++;
                continue;
              }
            } else {
              boolean decompiledFrameRemainder1 = true;
              if (!this.attractMode) {
                if (this.victoryCountdown < 0) {
                  var4 = 0;
                  var5Lifetime1 = 0;
                  var6_int = 0;
                  var7 = 0;
                  var8_int = 0;
                  var9 = 0;
                  aircraftForWaveCount = this.aircraft;
                  var11 = 0;
                  scanLoop2: while (true) {
                    if (aircraftForWaveCount.length > var11) {
                      waveAircraft = aircraftForWaveCount[var11];
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
                          lm.a(20, tg.field_a[2], true, (byte) -106);
                          var10_int = 0;
                          while (var10_int < 16) {
                            wt.field_e.field_s.a((byte) -119, 256, var10_int);
                            var10_int++;
                            if (obfuscationControl != 0) {
                              decompiledFrameCompleted5 = false;
                              break;
                            }
                          }
                          decompiledFrameRemainder0 = !(decompiledFrameCompleted5);
                        }
                        if ((decompiledFrameRemainder0) && (decompiledFrameCompleted5) && (var9 == 0 &&
                          this.alternateMusicActive)) {
                          this.alternateMusicActive = false;
                          lm.a(20, tg.field_a[1], true, (byte) 115);
                          this.setMusicLayersImmediately(11154);
                        }
                        if (~var4 != ~var5Lifetime1) {
                          if (var5Lifetime1 > 0 ||
                            var7 > 0) {
                            this.musicLayerPresetIndex = 3;
                          }
                          if (!(var5Lifetime1 > 0) &&
                            !(var7 > 0) || obfuscationControl != 0) {
                            if (var6_int <= 0 &&
                              var8_int <= 4) {
                              if (var8_int > 0) {
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
                            } else {
                              this.musicLayerPresetIndex = 2;
                              if (obfuscationControl != 0) {
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
                  fieldTemp$0 = this.victoryCountdown - 1;
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
                var5Lifetime1Lifetime1 = 0;
                var6_ref_md__ = this.aircraft;
                var7Lifetime2 = 0;
                while (var6_ref_md__.length > var7Lifetime2) {
                  populationAircraft = var6_ref_md__[var7Lifetime2];
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
                  discarded$1 = this.spawnAircraft((byte) -1, gh.playerDefinition, 1, 0);
                }
                if (var4 < 7) {
                  var4 = qq.a(20, 100);
                  if (var4 == 0 &&
                    (hg.field_D & 64) != 0) {
                    discarded$2 = this.spawnAircraft((byte) 54, ro.field_u, 1, 0);
                    decompiledFrameRemainder1 = (obfuscationControl != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    if (5 > var4 &&
                      (2 & hg.field_D) != 0) {
                      discarded$3 = this.spawnAircraft((byte) 116, ju.field_k, 1, 0);
                      decompiledFrameRemainder1 = (obfuscationControl != 0);
                    }
                    if (decompiledFrameRemainder1) {
                      if (15 <= var4 ||
                        (hg.field_D & 1) == 0) {
                        if (var4 < 25) {
                          discarded$4 = this.spawnAircraft((byte) 38, gm.field_y, 1, 0);
                        }
                        if (!(var4 < 25) ||
                          obfuscationControl != 0) {
                          if (40 > var4) {
                            discarded$5 = this.spawnAircraft((byte) 56, sl.field_p, 1, 0);
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
                aircraftForAttractPlayer = this.aircraft;
                var5Lifetime2 = 0;
                while (var5Lifetime2 < aircraftForAttractPlayer.length) {
                  attractPlayerCandidate = aircraftForAttractPlayer[var5Lifetime2];
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
                  var4Lifetime1 = 0;
                  var5Lifetime2 = 0;
                  scanLoop4: while (var4Lifetime1 == 0) {
                    var5Lifetime2++;
                    stackIn_371_0 = -51;
                    stackIn_371_1 = ~var5Lifetime2;
                    if (obfuscationControl != 0) {
                      break regionExit3;
                    }
                    if (stackIn_371_0 < stackIn_371_1) {
                      var6_intLifetime1 = qq.a(20, 3200);
                      var7Lifetime1 = qq.a(20, 2400);
                      this.playerAircraft.position.set((double)var6_intLifetime1, (double)var7Lifetime1, true);
                      jp.a(50, this.playerAircraft.engineSound);
                      stackIn_297_0 = this.playerAircraft;
                      while (true) {
                        stackIn_297_0.engineSound = po.a(256, 0, this.playerAircraft.definition.getEngineSample((byte) 104));
                        var4Lifetime1 = 1;
                        aircraftForSpawnCheck = this.aircraft;
                        var9Lifetime1 = 0;
                        while (var9Lifetime1 < aircraftForSpawnCheck.length) {
                          spawnObstacle = aircraftForSpawnCheck[var9Lifetime1];
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
                  backgroundToRecenter = this.backgroundBodies;
                  var7Lifetime1Lifetime1 = 0;
                  while (var7Lifetime1Lifetime1 < backgroundToRecenter.length) {
                    backgroundBody = backgroundToRecenter[var7Lifetime1Lifetime1];
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
                    aircraftToRecenter = this.aircraft;
                    var7Lifetime1Lifetime2 = 0;
                    while (aircraftToRecenter.length > var7Lifetime1Lifetime2) {
                      aircraftToShift = aircraftToRecenter[var7Lifetime1Lifetime2];
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
                      pickupsToRecenter = this.pickups;
                      var7Lifetime1Lifetime2 = 0;
                      while (pickupsToRecenter.length > var7Lifetime1Lifetime2) {
                        pickupToRecenter = pickupsToRecenter[var7Lifetime1Lifetime2];
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
                        bulletsToRecenter = this.bullets;
                        var7Lifetime1Lifetime2 = 0;
                        while (var7Lifetime1Lifetime2 < bulletsToRecenter.length) {
                          bulletToRecenter = bulletsToRecenter[var7Lifetime1Lifetime2];
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
                          smokeParticlesToRecenter = this.smokeParticles;
                          var7Lifetime1Lifetime2 = 0;
                          boolean decompiledNaturalLoopExit0 = false;
                          while (!(decompiledNaturalLoopExit0 = (smokeParticlesToRecenter.length <= var7Lifetime1Lifetime2))) {
                            smokeToRecenter = smokeParticlesToRecenter[var7Lifetime1Lifetime2];
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
            if ((decompiledFrameCompleted4) &&
              (decompiledFrameCompleted3) &&
              (decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1) &&
              (decompiledFrameCompleted0)) {
              this.updatePlayerControls((byte) -13);
            }
            stackIn_371_0 = ~this.lives;
            stackIn_371_1 = -1;
          }
          if (stackIn_371_0 > stackIn_371_1) {
            this.finishGame(false, false, 100);
          }
          var4Lifetime2 = 0;
          if (!obfuscationGuard) {
            this.startClassicWave(-8);
          }
          var5Lifetime3 = 0;
          if (sh.field_u < gp.field_w) {
            stackIn_381_0 = (double)sh.field_u;
          } else {
            stackIn_381_0 = (double)gp.field_w;
          }
          viewportMinimumExtent = stackIn_381_0;
          minimumCameraScale = viewportMinimumExtent * 100.0 / 480.0;
          attractCameraScale = viewportMinimumExtent * 600.0 / 480.0;
          maximumCameraScale = viewportMinimumExtent * 1000.0 / 480.0;
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
          playerPosition = this.playerAircraft.position;
          scaledPlayerOffsetX = Math.abs(this.cameraScale * playerPosition.x / 1000.0);
          scaledPlayerOffsetY = Math.abs(playerPosition.y * this.cameraScale / 1000.0);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.SA(" + obfuscationGuard + ',' + processInput + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        TimedSpriteEffect dupTemp$2 = null;
        int discarded$3 = 0;
        RuntimeException runtimeException = null;
        TimedSpriteEffect var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.timedSpriteEffects.length <= this.timedSpriteEffectCount) {
            return;
          }
          var5 = this.timedSpriteEffects[this.timedSpriteEffectCount];
          if (var5 == null) {
            dupTemp$2 = new TimedSpriteEffect();
            this.timedSpriteEffects[this.timedSpriteEffectCount] = dupTemp$2;
            var5 = dupTemp$2;
          }
          var5.a(param3, param2, param0, (byte) 127);
          if (param1 != -14630) {
            discarded$3 = this.a((Aircraft) null, 100, (Aircraft) null);
          }
          this.timedSpriteEffectCount = this.timedSpriteEffectCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void stopAircraftEngineSounds(boolean obfuscationGuard) {
        RuntimeException runtimeException = null;
        Aircraft[] var2 = null;
        int var3 = 0;
        Aircraft var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            return;
          }
          if (null == this.aircraft) {
            return;
          }
          var2 = this.aircraft;
          var3 = 0;
          while (var2.length > var3) {
            var4 = var2[var3];
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
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.QA(" + obfuscationGuard + ')');
        }
    }

    private final void advanceAircraft(int obfuscationGuard, Aircraft aircraft, Vector2 cameraMovement) {
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_147_2 = null;
        StringBuilder stackIn_150_1 = null;
        String stackIn_151_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
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
          if (this.field_Eb &&
            this.debugControlsEnabled &&
            aircraft == this.playerAircraft) {
            aircraft.hitPoints = aircraft.definition.maximumHitPoints;
          }
          if (aircraft.hitPoints <= 0) {
            this.advanceDestroyedAircraft(true, aircraft);
            return;
          }
          rg.a(this.a(aircraft, 5000, this.playerAircraft), false, aircraft.engineSound, this.a(this.playerAircraft.position, 200, aircraft.position));
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
              if ((decompiledFrameRemainder0) &&
                (!(aircraft.weaponHeat >= 100))) {
                this.fireBullets((byte) 115, aircraft);
                aircraft.weaponHeat = aircraft.weaponHeat + (-aircraft.definition.heatReduction + aircraft.definition.fireInterval + 22);
                aircraft.fireCooldown = aircraft.fireCooldown + aircraft.definition.fireInterval;
                if (0 < aircraft.temporaryWeapon) {
                  aircraft.temporaryWeaponTicks = aircraft.temporaryWeaponTicks - 5;
                }
                if (!(aircraft.weaponHeat < 100)) {
                  aircraft.weaponHeat = 200;
                  if ((this.playerAircraft == aircraft) &&
                    (!this.attractMode)) {
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
          var4_int = -31 % ((7 - obfuscationGuard) / 35);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_146_0 = var4;
          stackIn_146_1 = new StringBuilder().append("pk.P(").append(obfuscationGuard).append(',');
          if (aircraft == null) {
            stackIn_147_2 = "null";
          } else {
            stackIn_147_2 = "{...}";
          }
          stackIn_150_1 = ((StringBuilder) (Object) stackIn_146_1).append(stackIn_147_2).append(',');
          if (cameraMovement == null) {
            stackIn_151_2 = "null";
          } else {
            stackIn_151_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_146_0), ((StringBuilder) (Object) stackIn_150_1).append(stackIn_151_2).append(')').toString());
        }
    }

    private final void a(Vector2 param0, int param1, int param2) {
        Pickup dupTemp$0 = null;
        RuntimeException runtimeException = null;
        Pickup var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 32597) {
            return;
          }
          if (this.pickups.length <= this.pickupCount) {
            return;
          }
          var4 = this.pickups[this.pickupCount];
          if (var4 == null) {
            dupTemp$0 = new Pickup();
            this.pickups[this.pickupCount] = dupTemp$0;
            var4 = dupTemp$0;
          }
          var4.spawn(param2, -111, param0);
          this.pickupCount = this.pickupCount + 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("pk.KA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(Aircraft param0, int param1, Aircraft param2) {
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var4_doubleLifetime1;
        try {
          if (param0 == param2) {
            stackIn_4_0 = 256;
            return stackIn_4_0;
          }
          if (param1 != 5000) {
            this.field_Db = 84;
          }
          ek.field_u.setFrom(param2.position, true);
          ek.field_u.subtract(param0.position, -30507);
          var4_double = 3.141592653589793 * param0.heading / 128.0;
          IntrusiveDeque.field_d.set(param0.speed * Math.sin(var4_double), param0.speed * Math.cos(var4_double), true);
          var4_doubleLifetime1 = param2.heading * 3.141592653589793 / 128.0;
          IntrusiveDeque.field_d.x = IntrusiveDeque.field_d.x - param2.speed * Math.sin(var4_doubleLifetime1);
          IntrusiveDeque.field_d.y = IntrusiveDeque.field_d.y - param2.speed * Math.cos(var4_doubleLifetime1);
          var6 = IntrusiveDeque.field_d.dot(ek.field_u, (byte) -67);
          var8 = 500;
          var8 = (int)(var6 * (double)var8 / ek.field_u.lengthSquared(127));
          if (var8 < -100) {
            var8 = -100;
          }
          if (100 < var8) {
            var8 = 100;
          }
          var9 = -var8 + 256;
          stackIn_15_0 = var9;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pk.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void advanceDestroyedAircraft(boolean obfuscationGuard, Aircraft aircraft) {
        int stackIn_23_0 = 0;
        boolean stackIn_27_1 = false;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
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
            if (92 <= aircraft.lifecyclePhase) {
              if (ro.field_u == aircraft.definition) {
                jp.a(50, aircraft.engineSound);
                aircraft.engineSound = po.a(this.a(this.playerAircraft.position, 200, aircraft.position), 0, kn.field_c[4]);
                if (var4 != 0) {
                  if (aircraft.definition != ro.field_u) {
                    stackIn_23_0 = aircraft.lifecyclePhase + 164;
                  } else {
                    stackIn_23_0 = 256;
                  }
                  stackIn_27_1 = !(obfuscationGuard);
                  rg.a(stackIn_23_0, stackIn_27_1, aircraft.engineSound, this.a(this.playerAircraft.position, 200, aircraft.position));
                  this.scratchPosition.setFrom(aircraft.position, true);
                  this.scratchPosition.add((byte) 103, oh.a(5.0, (byte) 28));
                  this.a(this.scratchPosition, 16777215, qq.a(20, 64) + 64, 0, aircraft.lifecyclePhase);
                }
              }
            } else {
              if (aircraft.definition != ro.field_u) {
                stackIn_23_0 = aircraft.lifecyclePhase + 164;
              } else {
                stackIn_23_0 = 256;
              }
              stackIn_27_1 = !(obfuscationGuard);
              rg.a(stackIn_23_0, stackIn_27_1, aircraft.engineSound, this.a(this.playerAircraft.position, 200, aircraft.position));
              this.scratchPosition.setFrom(aircraft.position, true);
              this.scratchPosition.add((byte) 103, oh.a(5.0, (byte) 28));
              this.a(this.scratchPosition, 16777215, qq.a(20, 64) + 64, 0, aircraft.lifecyclePhase);
            }
            aircraft.lifecyclePhase = aircraft.lifecyclePhase - 1;
            if (aircraft.lifecyclePhase == 2) {
              if (this.playerAircraft != aircraft) {
                this.upgradeCredits = this.upgradeCredits + 1;
              }
              jp.a(50, aircraft.engineSound);
              aircraft.engineSound = null;
              this.a(aircraft, 8073);
              this.a(this.scratchPosition, -aircraft.definition.collisionRadius * 4, 240, 0, 0);
              if (aircraft.definition == ro.field_u &&
                !this.attractMode &&
                !this.arcadeMode) {
                fm.a(249, (byte) 111, 6);
              }
              var3_int = this.a(this.playerAircraft.position, 200, aircraft.position);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_73_0 = var3;
          stackIn_73_1 = new StringBuilder().append("pk.GB(").append(obfuscationGuard).append(',');
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
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
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
            stackIn_19_0 = (!this.arcadeMode) ? 0 : 1;
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
          } else {
            if (0 < or.score) {
              Bullet.requestMenu((byte) -81, 6, screenFlag);
              if (var5 != 0) {
                Bullet.requestMenu((byte) -86, 0, screenFlag);
              }
            } else {
              Bullet.requestMenu((byte) -86, 0, screenFlag);
            }
          }
          lm.a(40, tg.field_a[0], true, (byte) -84);
          var4_int = 0;
          while (var4_int < 16) {
            wt.field_e.field_s.a((byte) -126, 256, var4_int);
            var4_int++;
            if (var5 != 0) {
              return;
            }
          }
          sg.flightSession.startAttractMode((byte) 50);
          co.returnMenuId = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var4), "pk.BB(" + screenFlag + ',' + awardFlag + ',' + accuracyTarget + ')');
        }
    }

    private final void drawRadar(GraphicsRenderer renderer, int insetOffset, int obfuscationGuard) {
        int stackIn_13_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_84_1 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Aircraft[] var7_ref_md__ = null;
        int var7 = 0;
        int var8_int = 0;
        Pickup var8 = null;
        Aircraft var9_ref_md = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        double var12_double = 0.0;
        int var13 = 0;
        double var14_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var12Lifetime1Lifetime1;
        var18 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = -insetOffset + 64;
          var5 = -64 + gp.field_w + insetOffset;
          ec.field_e[0].a(3 - insetOffset, insetOffset + (-126 + gp.field_w));
          var6 = 7 * -this.simulationTick & 511;
          ec.field_e[1].a((float)var4_int, (float)var5, 4096, 65536 * var6 / 511);
          if (obfuscationGuard != 16711935) {
            return;
          }
          var7_ref_md__ = this.aircraft;
          var8_int = 0;
          while (var8_int < var7_ref_md__.length) {
            boolean decompiledFrameRemainder1 = true;
            var9_ref_md = var7_ref_md__[var8_int];
            if (null != var9_ref_md &&
              var9_ref_md.lifecyclePhase > 2) {
              var10 = (int)(60.0 * var9_ref_md.position.x / 2400.0);
              var11 = (int)(var9_ref_md.position.y * 60.0 / 2400.0);
              if (this.playerAircraft == var9_ref_md) {
                stackIn_13_0 = 255;
              } else {
                stackIn_13_0 = 511 & var9_ref_md.position.angle255(-113) + var6;
              }
              var12 = stackIn_13_0;
              if (var12 > 255) {
                var12 = 0;
              }
              if (gh.playerDefinition == var9_ref_md.definition) {
                var12 = 127 + (var12 >> 1);
              }
              var13 = var11 * var11 + var10 * var10;
              if (var13 > 3600) {
                var14_double = 60.0 / Math.sqrt((double)var13);
                var10 = (int)((double)var10 * var14_double);
                var11 = (int)((double)var11 * var14_double);
              }
              boolean decompiledFrameRemainder0 = true;
              var10 = var10 + var4_int;
              var11 = var11 + var5;
              var14 = 2;
              if (var9_ref_md != this.playerAircraft) {
                if (gh.playerDefinition == var9_ref_md.definition) {
                  var15 = 65280 | var12 << 24;
                  decompiledFrameRemainder0 = (var18 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (kk.field_N != var9_ref_md.definition) {
                    if (var9_ref_md.definition != sl.field_p) {
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
                              var16 = (int)sb.a(63, var9_ref_md.position, this.playerAircraft.position);
                              decompiledFrameRemainder1 = !(var16 >= 600);
                              if (decompiledFrameRemainder1) {
                                var15 = 16742144;
                                if (var16 > 500) {
                                  var17 = (-var16 + 600) * 255 / 100;
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
                      if ((decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
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
                  } else {
                    var15 = 16711680 | var12 << 24;
                    if (var18 != 0) {
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
          var7 = 0;
          while (this.pickupCount > var7) {
            var8 = this.pickups[var7];
            if (var18 != 0) {
              return;
            }
            if ((null != var8 ||
              var18 != 0) &&
              (!(var8.remainingTicks < 0) ||
              var18 != 0)) {
              var9 = (int)(var8.position.x * 60.0 / 2400.0);
              var10Lifetime1 = (int)(60.0 * var8.position.y / 2400.0);
              var11Lifetime1 = var9 * var9 + var10Lifetime1 * var10Lifetime1;
              if (3600 < var11Lifetime1) {
                var12_double = 60.0 / Math.sqrt((double)var11Lifetime1);
                var9 = (int)((double)var9 * var12_double);
                var10Lifetime1 = (int)((double)var10Lifetime1 * var12_double);
              }
              var10Lifetime1 = var10Lifetime1 + var5;
              var9 = var9 + var4_int;
              var12Lifetime1 = 2;
              var14Lifetime1 = (var8.remainingTicks & 15) >> 1;
              var12Lifetime1Lifetime1 = 8 - var14Lifetime1;
              stackIn_83_0 = var14Lifetime1 << 29;
              if (var8.pickupCode < 4) {
                stackIn_84_1 = 65280;
              } else {
                stackIn_84_1 = 16776960;
              }
              var13Lifetime1 = stackIn_83_0 | stackIn_84_1;
              renderer.e(var13Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var10Lifetime1, var12Lifetime1Lifetime1, -(var12Lifetime1Lifetime1 >> 1) + var9, 3105);
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_90_0 = var4;
          stackIn_90_1 = new StringBuilder().append("pk.EB(");
          if (renderer == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(insetOffset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void advanceSmokeParticles(Vector2 cameraMovement, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        SmokeParticle var4 = null;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.smokeParticleCount <= var3_int))) {
            var4 = this.smokeParticles[var3_int];
            var4.position.subtract(cameraMovement, -30507);
            fieldTemp$0 = var4.remainingTicks + 5;
            var4.remainingTicks = var4.remainingTicks + 5;
            stackIn_18_0 = ~fieldTemp$0;
            stackIn_18_1 = ~var4.field_g;
            if (var5 == 0) {
              if (stackIn_18_0 <= stackIn_18_1) {
                this.removeSmokeParticle(var3_int, -690800984);
                var3_int--;
              }
              if (var4.field_l < 0 &&
                var4.remainingTicks < var4.field_g) {
                this.a(var4.position, 10066329, 2 * qq.a(obfuscationGuard ^ 4473936, -var4.remainingTicks + var4.field_g), 0, var4.field_j);
                this.a(var4.position, 6710886, 2 * qq.a(20, -var4.remainingTicks + var4.field_g), obfuscationGuard - 4473924, var4.field_j);
                this.a(var4.position, 4473924, 2 * qq.a(20, -var4.remainingTicks + var4.field_g), 0, var4.field_j);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("pk.L(");
          if (cameraMovement == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final boolean applyUpgrade(byte obfuscationGuard, int upgradeCode) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException failure = null;
        int wingmanCount = 0;
        Aircraft[] aircraftToCount = null;
        int aircraftIndex = 0;
        Aircraft candidate = null;
        int obfuscationControl = 0;
        int particleIndex;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
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
          var3_int = -31 / ((50 - obfuscationGuard) / 59);
          if (5 == upgradeCode) {
            wingmanCount = 0;
            aircraftToCount = this.aircraft;
            aircraftIndex = 0;
            while (true) {
              if (aircraftToCount.length > aircraftIndex) {
                candidate = aircraftToCount[aircraftIndex];
                if (obfuscationControl == 0) {
                  if (null != candidate &&
                    this.playerAircraft != candidate &&
                    candidate.definition == gh.playerDefinition) {
                    wingmanCount++;
                  }
                  aircraftIndex++;
                  continue;
                }
              } else {
                if (6 <= wingmanCount) {
                  return false;
                }
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
            particleIndex = 0;
            while (particleIndex < 80) {
              this.a(2560, 5888, np.a(25, 80, (byte) -65) >> 1, 80, 23 + upgradeCode * 38 << 8, 800, (byte) -108);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.DA(" + obfuscationGuard + ',' + upgradeCode + ')');
        }
    }

    private final void updatePlayerControls(byte obfuscationGuard) {
        boolean stackIn_67_1 = false;
        boolean stackIn_68_2 = false;
        Aircraft stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        Aircraft stackIn_76_0 = null;
        boolean stackIn_77_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        int obfuscationControl = 0;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
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
            boolean fireKeyHeld = (lp.heldKeys[83] ||
              lp.heldKeys[82]);
            if (!fireKeyHeld) {
              this.overheatFireLatch = false;
              fireKeyHeld = (obfuscationControl != 0);
            }
            if (fireKeyHeld) {
              stackIn_67_1 = this.overheatFireLatch;
              stackIn_68_2 = !(this.playerAircraft.weaponHeat <= 100);
              this.overheatFireLatch = stackIn_67_1 | stackIn_68_2;
              stackIn_71_0 = this.playerAircraft;
              stackIn_72_1 = !(this.overheatFireLatch);
              stackIn_71_0.fireRequested = stackIn_72_1;
            }
            stackIn_76_0 = this.playerAircraft;
            stackIn_77_1 = (this.doubleTapTurnDirection != 0);
            stackIn_76_0.braking = stackIn_77_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.FA(" + obfuscationGuard + ')');
        }
    }

    private final void drawWorld(int obfuscationGuard) {
        int incrementValue$0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_144_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Aircraft[] var21_ref_md__ = null;
        int var22_int = 0;
        TimedSpriteEffect var22 = null;
        SmokeParticle var22_ref = null;
        FlightBody var22_ref2 = null;
        Pickup var22_ref3 = null;
        Bullet var22_ref4 = null;
        int var23 = 0;
        Aircraft var23_ref_md = null;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        SmokeParticle var22_refLifetime1;
        FlightBody var22_ref2Lifetime1;
        FlightBody var22_ref2Lifetime2;
        Bullet var22_ref4Lifetime1;
        FlightBody var22_ref2Lifetime3;
        int stackIn_91_0Lifetime1;
        int stackIn_91_1Lifetime1;
        int stackIn_118_0Lifetime1;
        int stackIn_118_1Lifetime1;
        int stackIn_169_0Lifetime1;
        int stackIn_169_1Lifetime1;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var22_intLifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        int var23Lifetime4;
        int var23Lifetime5;
        int var24Lifetime1;
        int var24Lifetime2;
        int var24Lifetime3;
        int var24Lifetime4;
        int var25Lifetime1;
        int var25Lifetime2;
        int var25Lifetime3;
        int var25Lifetime4;
        int var26Lifetime1;
        int var26Lifetime2;
        int var26Lifetime3;
        int var27Lifetime1;
        int var27Lifetime2;
        int var26Lifetime4;
        int var23Lifetime2Lifetime1;
        int var23Lifetime3Lifetime1;
        int var23Lifetime4Lifetime1;
        int var24Lifetime1Lifetime1;
        int var24Lifetime2Lifetime1;
        int var24Lifetime3Lifetime1;
        int var25Lifetime1Lifetime1;
        int var25Lifetime2Lifetime1;
        int var25Lifetime3Lifetime1;
        int var26Lifetime1Lifetime1;
        int var26Lifetime2Lifetime1;
        int var27Lifetime1Lifetime1;
        var28 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          field_wb.a((byte) 121);
          var2_int = 1;
          scanLoop1: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (-1720.0 > this.backgroundPanX + this.field_hb) {
              this.field_fb = this.field_fb + 1;
              this.backgroundPanX = this.backgroundPanX + 1720.0;
              if (var28 == 0) {
                continue;
              }
            } else {
              while (true) {
                if (!(-1280.0 > this.field_u + this.backgroundPanY)) {
                  break;
                }
                this.backgroundPanY = this.backgroundPanY + 1280.0;
                this.field_O = this.field_O + 1;
                if (var28 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              while (true) {
                if (!(this.field_hb + this.backgroundPanX > 0.0)) {
                  break;
                }
                this.field_fb = this.field_fb - 1;
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
            if (this.backgroundPanY + this.field_u > 0.0) {
              this.backgroundPanY = this.backgroundPanY - 1280.0;
              if (var28 == 0) {
                this.field_O = this.field_O - 1;
                continue;
              }
            }
            break;
          }
          var3 = this.cameraScale / 1000.0;
          var5 = 3.141592653589793 * this.playerAircraft.heading / 128.0;
          var7 = Math.sin(var5) * 192.0 * this.cameraScale / 1000.0;
          var9 = 192.0 * Math.cos(var5) * this.cameraScale / 1000.0;
          this.field_u = this.field_u + (-this.field_u + var9) * 0.05;
          this.field_hb = this.field_hb + 0.05 * (-this.field_hb + var7);
          var11 = (int)(this.backgroundPanX - this.field_hb * 2.0 / 3.0);
          var12 = (int)(this.backgroundPanY - this.field_u * 2.0 / 3.0);
          var13 = (double)(sh.field_u / 2);
          var15 = (double)(gp.field_w / 2);
          var17 = this.field_sb;
          if (this.field_zb <= 10) {
            boolean decompiledSharedTail0 = !(this.field_zb <= 5);
            if (!decompiledSharedTail0) {
              var17 = this.b(this.field_zb * 51, -1, obfuscationGuard - 437819992, this.field_sb);
              decompiledSharedTail0 = (var28 != 0);
            }
            if (decompiledSharedTail0) {
              var17 = this.b((10 - this.field_zb) * 51, -1, obfuscationGuard - 437819992, this.field_sb);
            }
          }
          var18 = this.field_O;
          var19 = (int)(this.field_hb + var13);
          var20 = (int)(this.field_u + var15);
          var21 = -1280 + var12;
          scanLoop2: while (true) {
            if (var21 <= gp.field_w) {
              var22_int = this.field_fb;
              stackIn_48_0 = var11 - 1720;
              if (var28 != 0) {
                break scanLoop2;
              }
              var23 = stackIn_48_0;
              while (var23 <= sh.field_u) {
                is.field_a[qg.a((byte) 110, is.field_a.length, var22_int * 23 + 7 * var18)].a((int)(var13 + this.field_hb) + var23, var21 + (int)(var15 + this.field_u), 1, 0, 0);
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
          var21Lifetime1 = stackIn_48_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var21Lifetime1 >= this.timedSpriteEffectCount))) {
            var22 = this.timedSpriteEffects[var21Lifetime1];
            var23Lifetime1 = var19 + var22.field_b - this.field_fb * 1720 + var11;
            var24 = var20 + (var22.field_d - 1280 * this.field_O) + var12;
            var25 = var22.field_e;
            stackIn_70_0 = var23Lifetime1;
            stackIn_70_1 = -500 - var25;
            if (var28 == 0) {
              if (stackIn_70_0 >= stackIn_70_1 &&
                -var25 - 500 <= var24 &&
                (500 + var25 + sh.field_u) >= var23Lifetime1 &&
                var24 <= var25 + gp.field_w + 500) {
                co.field_i[var22.field_c].b(-(var25 >> 1) + var23Lifetime1, var24 - (var25 >> 1), var25, var25);
              } else {
                incrementValue$0 = var21Lifetime1;
                var21Lifetime1--;
                this.removeTimedSpriteEffect(incrementValue$0, 10355);
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
          var21Lifetime2 = stackIn_70_0 + stackIn_70_1;
          scanLoop3: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var21Lifetime2 >= 0) {
              var22_ref = this.smokeParticles[var21Lifetime2];
              stackIn_91_0 = var22_ref.field_j;
              stackIn_91_1 = 30;
              if (var28 != 0) {
                if (stackIn_91_0 > stackIn_91_1) {
                  var22_ref2 = this.backgroundBodies[var21Lifetime2];
                  var23Lifetime2 = (int)((var22_ref2.position.x + this.field_hb) * var3 * 0.9 + var13);
                  var24Lifetime1 = (int)((var22_ref2.position.y + this.field_u) * var3 * 0.9 + var15);
                  var25Lifetime1 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].a() * var3 * 0.9);
                  var26 = (int)(0.9 * ((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3));
                  sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var25Lifetime1, var26, 0, var17, 1);
                  var21Lifetime2 += 2;
                  break scanLoop3;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (stackIn_91_0 <= stackIn_91_1 ||
                  var28 != 0) {
                  var23Lifetime2 = (int)(var13 + (var22_ref.position.x + this.field_hb) * this.a((byte) -125, var22_ref.field_j, var3));
                  var24Lifetime1 = (int)(var15 + (var22_ref.position.y + this.field_u) * this.a((byte) -123, var22_ref.field_j, var3));
                  if (var22_ref.field_g < 512) {
                    if (var22_ref.field_l < 0) {
                      var25Lifetime1 = (int)(var3 * (double)(2 * -var22_ref.field_l));
                      var26 = var22_ref.remainingTicks * bl.field_b.length / var22_ref.field_g;
                      bl.field_b[var26].b(-(var25Lifetime1 >> 1) + var23Lifetime2, -(var25Lifetime1 >> 1) + var24Lifetime1, var25Lifetime1, var25Lifetime1);
                    } else {
                      var25Lifetime1 = var22_ref.spriteIndex;
                      var26 = (int)(var3 * (double)(50 * var22_ref.remainingTicks) / (double)var22_ref.field_g + 10.0);
                      var27 = -(var22_ref.remainingTicks * 256 / var22_ref.field_g) + 256;
                      es.field_b[var25Lifetime1].a(-(var26 >> 1) + var23Lifetime2, -(var26 >> 1) + var24Lifetime1, var26, var26, 0, var27 << 23 & -14870727 | var22_ref.field_l & 16777215, 1);
                    }
                  }
                }
                var21Lifetime2--;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (var2_int != 0)) {
              var21Lifetime2 = 0;
              while (true) {
                stackIn_91_0Lifetime1 = ~var21Lifetime2;
                stackIn_91_1Lifetime1 = ~this.backgroundBodies.length;
                if (stackIn_91_0Lifetime1 <= stackIn_91_1Lifetime1) {
                  break;
                }
                var22_ref2Lifetime3 = this.backgroundBodies[var21Lifetime2];
                var23Lifetime2Lifetime1 = (int)((var22_ref2Lifetime3.position.x + this.field_hb) * var3 * 0.9 + var13);
                var24Lifetime1Lifetime1 = (int)((var22_ref2Lifetime3.position.y + this.field_u) * var3 * 0.9 + var15);
                var25Lifetime1Lifetime1 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].a() * var3 * 0.9);
                var26Lifetime4 = (int)(0.9 * ((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3));
                sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime1Lifetime1 >> 1) + var23Lifetime2Lifetime1, -(var26Lifetime4 >> 1) + var24Lifetime1Lifetime1, var25Lifetime1Lifetime1, var26Lifetime4, 0, var17, 1);
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
              var22_ref3 = this.pickups[var21Lifetime2];
              stackIn_118_0 = -1;
              stackIn_118_1 = ~var22_ref3.remainingTicks;
              if (var28 != 0) {
                if (stackIn_118_0 > stackIn_118_1) {
                  var22_ref4 = this.bullets[var21Lifetime2];
                  var23Lifetime3 = (int)(var13 + (var22_ref4.position.x + this.field_hb) * var3);
                  var24Lifetime2 = (int)(var3 * (var22_ref4.position.y + this.field_u) + var15);
                  dc.field_g.a((float)var23Lifetime3, (float)var24Lifetime2, (int)((double)(var22_ref4.remainingTicks * 42) * var3), (int)(256.0 * var22_ref4.heading));
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
                var24Lifetime2 = (int)((this.field_hb + var22_ref3.position.x) * this.a((byte) -124, var23Lifetime3, var3) + var13);
                var25Lifetime2 = (int)((this.field_u + var22_ref3.position.y) * this.a((byte) -122, var23Lifetime3, var3) + var15);
                var26Lifetime1 = (int)(var3 * (double)(42 * var23Lifetime3));
                if (400 - var22_ref3.remainingTicks < 15) {
                  var26Lifetime1 = var26Lifetime1 * (-var22_ref3.remainingTicks + 400) / 15;
                }
                if (0 > var22_ref3.remainingTicks) {
                  Pickup.field_i[var22_ref3.pickupCode].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, var22_ref3.remainingTicks * 20, 0, -16777216 | 190 * var23Lifetime3 / 92 * 65793, 1);
                } else {
                  Pickup.field_i[var22_ref3.pickupCode].a((float)var24Lifetime2, (float)var25Lifetime2, var26Lifetime1, 20 * var22_ref3.remainingTicks);
                }
                var21Lifetime2++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              var21Lifetime2 = 0;
              while (true) {
                stackIn_118_0Lifetime1 = ~var21Lifetime2;
                stackIn_118_1Lifetime1 = ~this.bulletCount;
                if (stackIn_118_0Lifetime1 <= stackIn_118_1Lifetime1) {
                  break;
                }
                var22_ref4Lifetime1 = this.bullets[var21Lifetime2];
                var23Lifetime3Lifetime1 = (int)(var13 + (var22_ref4Lifetime1.position.x + this.field_hb) * var3);
                var24Lifetime2 = (int)(var3 * (var22_ref4Lifetime1.position.y + this.field_u) + var15);
                dc.field_g.a((float)var23Lifetime3Lifetime1, (float)var24Lifetime2, (int)((double)(var22_ref4Lifetime1.remainingTicks * 42) * var3), (int)(256.0 * var22_ref4Lifetime1.heading));
                var21Lifetime2++;
                if (var28 != 0) {
                  break scanLoop4;
                }
              }
            }
            var21_ref_md__ = this.aircraft;
            var22_intLifetime1 = 0;
            while (var22_intLifetime1 < var21_ref_md__.length) {
              boolean decompiledFrameRemainder2 = true;
              var23_ref_md = var21_ref_md__[var22_intLifetime1];
              if ((var23_ref_md != null ||
                var28 != 0) && var23_ref_md.lifecyclePhase > 2) {
                var24Lifetime2Lifetime1 = (int)((var23_ref_md.position.x + this.field_hb) * this.a((byte) -126, var23_ref_md.lifecyclePhase, var3) + var13);
                var25Lifetime2Lifetime1 = (int)((var23_ref_md.position.y + this.field_u) * this.a((byte) -126, var23_ref_md.lifecyclePhase, var3) + var15);
                var26Lifetime1Lifetime1 = 4 * var23_ref_md.bankOffset / 16 + 4;
                if (var23_ref_md == this.playerAircraft &&
                  this.respawnInvulnerabilityTicks > 0) {
                  var27Lifetime1 = -16777216;
                  var27Lifetime1 = var27Lifetime1 | 65793 * (int)(-Math.cos((double)this.respawnInvulnerabilityTicks * 3.141592653589793 / 5.0) * (double)this.respawnInvulnerabilityTicks + (double)this.respawnInvulnerabilityTicks);
                  var23_ref_md.definition.getSprites(-32275)[var26Lifetime1Lifetime1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)(var3 * (double)(32 * var23_ref_md.lifecyclePhase)), (int)(256.0 * var23_ref_md.heading), 3, var27Lifetime1, 1);
                  decompiledFrameRemainder2 = (var28 != 0);
                }
                if (decompiledFrameRemainder2) {
                  if (ro.field_u == var23_ref_md.definition) {
                    var23_ref_md.definition.getSprites(-32275)[0].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(var23_ref_md.lifecyclePhase * 32) * var3), 0);
                    var23_ref_md.definition.getSprites(-32275)[1].a((float)var24Lifetime2Lifetime1, (float)var25Lifetime2Lifetime1, (int)((double)(32 * var23_ref_md.lifecyclePhase) * var3), var23_ref_md.bankOffset << 10);
                    var27Lifetime1Lifetime1 = (var23_ref_md.bankOffset & 536870975) << 3;
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
            var22_refLifetime1 = this.smokeParticles[var21Lifetime2];
            stackIn_169_0 = ~var22_refLifetime1.field_j;
            stackIn_169_1 = -31;
            if (var28 != 0) {
              if (stackIn_169_0 < stackIn_169_1) {
                var22_ref2Lifetime1 = this.backgroundBodies[var21Lifetime2];
                var23Lifetime4 = (int)(var3 * (this.field_hb + var22_ref2Lifetime1.position.x) + var13);
                var24Lifetime3 = (int)(var15 + (this.field_u + var22_ref2Lifetime1.position.y) * var3);
                var25Lifetime3 = (int)(var3 * (double)sd.field_k[var21Lifetime2 % sd.field_k.length].a());
                var26Lifetime2 = (int)((double)sd.field_k[var21Lifetime2 % sd.field_k.length].b() * var3);
                sd.field_k[var21Lifetime2 % sd.field_k.length].a(-(var25Lifetime3 >> 1) + var23Lifetime4, var24Lifetime3 - (var26Lifetime2 >> 1), var25Lifetime3, var26Lifetime2, 0, var17, 1);
                var21Lifetime2 += 2;
                return;
              }
              return;
            }
            if (stackIn_169_0 < stackIn_169_1 ||
              var28 != 0) {
              var23Lifetime4Lifetime1 = (int)(var13 + (this.field_hb + var22_refLifetime1.position.x) * this.a((byte) -124, var22_refLifetime1.field_j, var3));
              var24Lifetime3Lifetime1 = (int)(var15 + (var22_refLifetime1.position.y + this.field_u) * this.a((byte) -119, var22_refLifetime1.field_j, var3));
              if (512 > var22_refLifetime1.field_g) {
                if (var22_refLifetime1.field_l >= 0) {
                  var25Lifetime3Lifetime1 = var22_refLifetime1.spriteIndex;
                  var26Lifetime2Lifetime1 = (int)(10.0 + var3 * (double)(var22_refLifetime1.remainingTicks * 50) / (double)var22_refLifetime1.field_g);
                  var27Lifetime2 = 256 - var22_refLifetime1.remainingTicks * 256 / var22_refLifetime1.field_g;
                  es.field_b[var25Lifetime3Lifetime1].a(-(var26Lifetime2Lifetime1 >> 1) + var23Lifetime4Lifetime1, -(var26Lifetime2Lifetime1 >> 1) + var24Lifetime3Lifetime1, var26Lifetime2Lifetime1, var26Lifetime2Lifetime1, 0, 16777215 & var22_refLifetime1.field_l | -9633548 & var27Lifetime2 << 23, 1);
                } else {
                  var25Lifetime3Lifetime1 = (int)(var3 * (double)(2 * -var22_refLifetime1.field_l));
                  var26Lifetime2Lifetime1 = bl.field_b.length * var22_refLifetime1.remainingTicks / var22_refLifetime1.field_g;
                  bl.field_b[var26Lifetime2Lifetime1].b(-(var25Lifetime3Lifetime1 >> 1) + var23Lifetime4Lifetime1, var24Lifetime3Lifetime1 - (var25Lifetime3Lifetime1 >> 1), var25Lifetime3Lifetime1, var25Lifetime3Lifetime1);
                }
              }
            }
            var21Lifetime2--;
          }
          if (var2_int == 0) {
            return;
          }
          var21Lifetime3 = 1;
          while (true) {
            stackIn_169_0Lifetime1 = ~this.backgroundBodies.length;
            stackIn_169_1Lifetime1 = ~var21Lifetime3;
            if (stackIn_169_0Lifetime1 >= stackIn_169_1Lifetime1) {
              break;
            }
            var22_ref2Lifetime2 = this.backgroundBodies[var21Lifetime3];
            var23Lifetime5 = (int)(var3 * (this.field_hb + var22_ref2Lifetime2.position.x) + var13);
            var24Lifetime4 = (int)(var15 + (this.field_u + var22_ref2Lifetime2.position.y) * var3);
            var25Lifetime4 = (int)(var3 * (double)sd.field_k[var21Lifetime3 % sd.field_k.length].a());
            var26Lifetime3 = (int)((double)sd.field_k[var21Lifetime3 % sd.field_k.length].b() * var3);
            sd.field_k[var21Lifetime3 % sd.field_k.length].a(-(var25Lifetime4 >> 1) + var23Lifetime5, var24Lifetime4 - (var26Lifetime3 >> 1), var25Lifetime4, var26Lifetime3, 0, var17, 1);
            var21Lifetime3 += 2;
            if (var28 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
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
        RuntimeException var1 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -56) {
            stackIn_7_0 = (nb.field_c == jq.field_fb);
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "pk.RA(" + param0 + ')');
        }
    }

    private final AircraftDefinition getArcadeAircraftDefinition(byte obfuscationGuard, int typeIndex) {
        int selectedType = 0;
        RuntimeException failure = null;
        int obfuscationControl = 0;
        AircraftDefinition stackIn_32_0 = null;
        AircraftDefinition stackIn_34_0 = null;
        AircraftDefinition stackIn_36_0 = null;
        AircraftDefinition stackIn_38_0 = null;
        AircraftDefinition stackIn_40_0 = null;
        AircraftDefinition stackIn_42_0 = null;
        AircraftDefinition stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        obfuscationControl = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard <= 99) {
            this.backgroundPanX = -1.7731094820794981;
          }
          selectedType = typeIndex;
          if (selectedType == 0 &&
            obfuscationControl == 0) {
            stackIn_32_0 = kk.field_N;
            return stackIn_32_0;
          }
          if (selectedType == 1) {
            stackIn_34_0 = sl.field_p;
            return stackIn_34_0;
          }
          if (selectedType == 3) {
            stackIn_36_0 = gm.field_y;
            return stackIn_36_0;
          }
          if (selectedType == 2 &&
            obfuscationControl == 0) {
            stackIn_38_0 = qq.field_g;
            return stackIn_38_0;
          }
          if (selectedType == 4 &&
            obfuscationControl == 0) {
            stackIn_40_0 = ju.field_k;
            return stackIn_40_0;
          }
          if (selectedType == 5) {
            stackIn_42_0 = ro.field_u;
            return stackIn_42_0;
          }
          stackIn_44_0 = kk.field_N;
          return stackIn_44_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.AB(" + obfuscationGuard + ',' + typeIndex + ')');
        }
    }

    final void renderSession(int obfuscationGuard, boolean unusedFlag, GraphicsRenderer renderer) {
        RuntimeException runtimeException = null;
        HudMessage var4 = null;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          this.drawWorld(-132670633);
          this.drawHud(renderer, -20240);
          if (!this.attractMode) {
            var4 = (HudMessage) (wd.hudMessages.first(obfuscationGuard ^ -251723521));
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
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_18_0 = runtimeException;
          stackIn_18_1 = new StringBuilder().append("pk.CB(").append(obfuscationGuard).append(',').append(unusedFlag).append(',');
          if (renderer == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void fadeMusicLayers(int obfuscationGuard, int volumeStep) {
        boolean stackIn_11_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (this.gameMusic != null &&
            !this.alternateMusicActive) {
            var3_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (16 <= var3_int))) {
              stackOut_10_0 = sd.musicLayerPresets[this.musicLayerPresetIndex][var3_int];
              stackIn_33_0 = stackOut_10_0 ? 1 : 0;
              stackIn_11_0 = stackOut_10_0;
              if (var5 == 0) {
                stackIn_17_0 = (!stackIn_11_0) ? 0 : 255;
                var4 = stackIn_17_0;
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var3), "pk.E(" + obfuscationGuard + ',' + volumeStep + ')');
        }
    }

    private final void queueHudMessage(int colour, byte obfuscationGuard, String text) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.hudMessages.addLast(120, new HudMessage(text, colour));
          var4_int = 105 % ((obfuscationGuard - 70) / 46);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("pk.G(").append(colour).append(',').append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void startAttractMode(byte obfuscationGuard) {
        RuntimeException runtimeException = null;
        Aircraft var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wd.hudMessages.clear(268435455);
          gh.playerDefinition.fireInterval = ub.basePlayerDefinition.fireInterval;
          this.paused = false;
          gh.playerDefinition.maximumHitPoints = ub.basePlayerDefinition.maximumHitPoints;
          gh.playerDefinition.heatReduction = ub.basePlayerDefinition.heatReduction;
          gh.playerDefinition.maximumSpeed = ub.basePlayerDefinition.maximumSpeed;
          gh.playerDefinition.turnRate = ub.basePlayerDefinition.turnRate;
          this.field_Eb = false;
          var2 = this.playerAircraft;
          this.stopAircraftEngineSounds(true);
          this.playerAircraft = new Aircraft(new Vector2(), gh.playerDefinition);
          this.aircraft = new Aircraft[16];
          this.aircraft[0] = this.playerAircraft;
          this.playerAircraft.engineSound = po.a(this.a(this.playerAircraft.position, 200, this.playerAircraft.position), 0, this.playerAircraft.definition.getEngineSample((byte) 93));
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
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "pk.HA(" + obfuscationGuard + ')');
        }
    }

    private final double a(byte param0, int param1, double param2) {
        double var5_double = 0.0;
        RuntimeException var5 = null;
        double stackIn_2_0 = 0.0;
        double stackIn_5_0 = 0.0;
        double stackIn_7_0 = 0.0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 92) {
            stackIn_2_0 = param2;
            return stackIn_2_0;
          }
          if (param0 >= -118) {
            stackIn_5_0 = -0.6152644756512422;
            return stackIn_5_0;
          }
          var5_double = 3.0 - (-(1.0 / param2) + 3.0) * (double)param1 / 92.0;
          stackIn_7_0 = 1.0 / var5_double;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var5), "pk.FB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void startClassicWave(int obfuscationGuard) {
        int stackIn_20_1 = 0;
        AircraftDefinition stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] waveComposition = null;
        RuntimeException failure = null;
        int remainingPickupBudget = 0;
        try {
          this.field_db = 255;
          this.field_o = this.field_sb;
          this.field_k = mr.field_b[this.classicWaveIndex];
          this.field_L = gi.field_e[this.classicWaveIndex];
          if (this.field_zb == -1) {
            this.field_zb = this.field_L;
          }
          this.queueHudMessage(16744448, (byte) -44, oe.classicWaveMessages[this.classicWaveIndex]);
          waveComposition = ArchiveProvider.classicWaveCompositions[this.classicWaveIndex];
          if (obfuscationGuard != -20416) {
            this.respawnInvulnerabilityTicks = -42;
          }
          remainingPickupBudget = waveComposition[6];
          if (waveComposition[5] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) -128, ro.field_u, waveComposition[5], remainingPickupBudget);
          }
          if (waveComposition[4] > 0) {
            remainingPickupBudget = this.spawnAircraft((byte) -118, ju.field_k, waveComposition[4], remainingPickupBudget);
          }
          if (waveComposition[3] > 0) {
            stackIn_20_1 = -127;
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
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) failure), "pk.OA(" + obfuscationGuard + ')');
        }
    }

    private final int spawnAircraft(byte obfuscationGuard, AircraftDefinition definition, int count, int pickupCount) {
        int incrementValue$1 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Aircraft var8 = null;
        int var9 = 0;
        Aircraft stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_int >= count))) {
            var6 = 3200 + (int)this.playerAircraft.position.x + np.a(-1600, 1600, (byte) -42);
            var7 = (int)this.playerAircraft.position.y + (2400 + np.a(-1200, 1200, (byte) -46));
            var8 = new Aircraft(new Vector2((double)var6, (double)var7), definition);
            incrementValue$1 = pickupCount;
            pickupCount--;
            stackIn_16_0 = incrementValue$1;
            if (var9 == 0) {
              if (stackIn_16_0 > 0) {
                stackIn_12_0 = var8;
                stackIn_12_1 = 20;
                if (!this.arcadeMode) {
                  stackIn_13_2 = 4;
                } else {
                  stackIn_13_2 = 9;
                }
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pk.PA(").append(obfuscationGuard).append(',');
          if (definition == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(count).append(',').append(pickupCount).append(')').toString());
        }
    }

    private final void advanceScreenParticles(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int incrementValue$1 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_27_0;
        int var2_int = 0;
        HudMessage var2 = null;
        RuntimeException var2_ref = null;
        ScreenParticle var3_ref_ok = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          if (obfuscationGuard > -79) {
            this.gameMusic = (MidiPcmStream) null;
          }
          scanLoop1: while (true) {
            if (var2_int < this.screenParticleCount) {
              var3_ref_ok = this.screenParticles[var2_int];
              if (var7 == 0) {
                if (var3_ref_ok != null) {
                  fieldTemp$0 = var3_ref_ok.field_h + 1;
                  var3_ref_ok.field_h = var3_ref_ok.field_h + 1;
                  if (!(var3_ref_ok.field_d >= fieldTemp$0)) {
                    incrementValue$1 = var2_int;
                    var2_int--;
                    this.removeScreenParticle((byte) -94, incrementValue$1);
                  }
                } else {
                  incrementValue$1 = var2_int;
                  var2_int--;
                  this.removeScreenParticle((byte) -94, incrementValue$1);
                }
                var3_ref_ok.field_c = var3_ref_ok.field_k;
                var3_ref_ok.field_g = var3_ref_ok.field_n;
                var3_ref_ok.field_m = var3_ref_ok.field_m + var3_ref_ok.field_l;
                var3_ref_ok.field_n = var3_ref_ok.field_n + var3_ref_ok.field_i;
                var3_ref_ok.field_k = var3_ref_ok.field_k + var3_ref_ok.field_b;
                var3_ref_ok.field_i = var3_ref_ok.field_i + var3_ref_ok.field_f;
                var3_ref_ok.field_l = var3_ref_ok.field_l + var3_ref_ok.field_j;
                var3_ref_ok.field_b = var3_ref_ok.field_b + var3_ref_ok.field_a;
                var2_int++;
                continue;
              }
            } else {
              if (this.playerAircraft.weaponHeat <= 100) {
                break scanLoop1;
              }
            }
            if (this.field_R < 200) {
              var2_int = (int)(-Math.cos((double)this.field_R * 3.141592653589793 / 200.0) * 128.0) + 128;
              var3 = var2_int * 80 >> 8;
              var4 = var3 + 623;
              this.a(80, var4 << 8, 2560, (byte) -115, np.a(20, 40, (byte) 99) * (this.playerAircraft.weaponHeat - 100) / 100, 117760, (-12800 + 128 * this.playerAircraft.weaponHeat) / 100);
            }
            break;
          }
          if (this.simulationTick % 40 == 0) {
            this.field_y = this.upgradeCredits;
          }
          var2 = (HudMessage) (wd.hudMessages.first(268435455));
          scanLoop2: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var2 != null) {
              stackOut_27_0 = var2.advanceAndIsExpired(-122);
              stackIn_41_0 = stackOut_27_0 ? 1 : 0;
              stackIn_28_0 = stackOut_27_0;
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
          if (stackIn_41_0 == -1) {
            if (~this.displayedScore != ~or.score) {
              this.scoreAnimationTicks = 20;
              this.targetScore = or.score;
              if (var7 != 0) {
                this.scoreAnimationTicks = this.scoreAnimationTicks - 1;
                if (this.scoreAnimationTicks == 0) {
                  this.displayedScore = this.targetScore;
                }
              }
            }
          } else {
            this.scoreAnimationTicks = this.scoreAnimationTicks - 1;
            if (this.scoreAnimationTicks == 0) {
              this.displayedScore = this.targetScore;
            }
          }
          if (this.field_Db == 0) {
            if (~this.upgradeCredits != ~this.field_v) {
              this.field_f = this.upgradeCredits;
              this.field_Db = 20;
              if (var7 != 0) {
                this.field_Db = this.field_Db - 1;
                if (this.field_Db == 0) {
                  this.field_v = this.field_f;
                }
              }
            }
          } else {
            this.field_Db = this.field_Db - 1;
            if (this.field_Db == 0) {
              this.field_v = this.field_f;
            }
          }
          if (this.field_G > 0 &&
            this.scoreMultiplier > 1) {
            this.field_G = this.field_G - 5;
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
          } else {
            if (this.scoreMultiplier != this.displayedMultiplier) {
              this.targetMultiplier = this.scoreMultiplier;
              this.multiplierAnimationTicks = 20;
            }
          }
          var3Lifetime1 = this.field_eb - this.playerAircraft.hitPoints * 100 / gh.playerDefinition.maximumHitPoints;
          this.field_qb = this.playerAircraft.temporaryWeaponTicks + this.field_qb >> 1;
          if (var3Lifetime1 > 0) {
            this.field_eb = this.field_eb - (1 + (var3Lifetime1 >> 4));
          }
          if ((var3Lifetime1 <= 0 ||
            var7 != 0) &&
            var3Lifetime1 < 0) {
            this.field_eb = this.field_eb - ((var3Lifetime1 >> 4) - 1);
          }
          if (this.playerAircraft.weaponHeat >= 100) {
            this.field_a = this.playerAircraft.weaponHeat + this.field_a - 100 >> 1;
            if (var7 != 0) {
              this.field_a = this.field_a + this.playerAircraft.weaponHeat >> 1;
            }
          } else {
            this.field_a = this.field_a + this.playerAircraft.weaponHeat >> 1;
          }
          if (this.playerAircraft.temporaryWeapon > 0 &&
            this.field_bb < 255) {
            this.field_bb = this.field_bb + 8;
            if (this.field_bb > 255) {
              this.field_bb = 255;
            }
          }
          if (this.playerAircraft.temporaryWeapon == 0 &&
            this.field_bb > 0) {
            this.field_bb = this.field_bb - 8;
            if (this.field_bb < 0) {
              this.field_bb = 0;
            }
          }
          if (!this.attractMode &&
            !this.arcadeMode &&
            !this.paused &&
            1 == vj.pressedMouseButton) {
            var4Lifetime1 = -22 + ln.field_c;
            var5 = -22 + lq.field_a;
            var6 = 0;
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
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2_ref), "pk.I(" + obfuscationGuard + ')');
        }
    }

    FlightSession() {
        RuntimeException runtimeException = null;
        Vector2 var1 = null;
        int var2 = 0;
        int var3 = 0;
        FlightBody var4 = null;
        int var5 = 0;
        boolean stackIn_4_1 = false;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        this.field_k = 0;
        this.field_bb = 0;
        this.attractMode = true;
        this.simulationTick = 0;
        this.field_a = 0;
        this.field_sb = 0;
        this.field_db = 0;
        this.shotsFired = 0;
        this.victoryCountdown = -1;
        this.field_eb = 100;
        this.field_o = 0;
        this.field_zb = -1;
        this.noLivesLost = true;
        this.field_L = -1;
        this.shotsHit = 0;
        this.screenParticles = new ScreenParticle[1000];
        this.field_qb = 0;
        this.field_r = new int[7];
        this.timedSpriteEffects = new TimedSpriteEffect[200];
        this.scratchPosition = new Vector2(0.0, 0.0);
        this.lastLeftPressTick = -100;
        this.musicChannelVolumes = new int[16];
        this.scoreAnimationTicks = 0;
        this.field_G = 200;
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
        this.field_Db = 0;
        this.targetMultiplier = 1;
        this.field_Eb = false;
        this.displayedScore = 0;
        this.lastRightPressTick = -100;
        this.multiplierAnimationTicks = 0;
        this.turnRateUpgradeLevel = 0;
        this.leftHeldLastTick = false;
        this.fireRateUpgradeLevel = 0;
        this.field_R = 200;
        this.scoreMultiplier = 1;
        try {
          stackIn_4_1 = !(2 > ln.field_d);
          this.debugControlsEnabled = stackIn_4_1;
          var1 = new Vector2();
          var2 = qq.a(20, 128);
          this.backgroundBodies = new FlightBody[30];
          var3 = 0;
          while (30 > var3) {
            var1.set((double)qq.a(20, 3200), (double)qq.a(20, 2400), true);
            var4 = new FlightBody(var1);
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
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
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
