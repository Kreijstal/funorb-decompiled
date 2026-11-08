/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellProjectile extends DualLinkNode {
    int x;
    int velocityY;
    static SceneWidget field_A;
    private PcmSampleStream flightSoundStream;
    int subpixelY;
    private int damageSourceId;
    private int flightSoundTicks;
    int spellType;
    static BinaryBitmapFont field_B;
    private Battle battle;
    private int field_x;
    BattleUnit owner;
    int subpixelX;
    int field_H;
    boolean field_w;
    private IsaacRandom random;
    int ageTicks;
    private Sprite sprite;
    static Sprite field_E;
    static String field_s;
    int velocityX;
    int y;
    private int spriteRadius;
    static SceneWidget field_m;

    final boolean canCollide(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.isAlive(-139)) {
            return false;
          }
          if (this.spellType == 74 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 84 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 81 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 75 &&
            10 < this.ageTicks) {
            return false;
          }
          if (73 == this.spellType &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 97 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 113 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 71) {
            return false;
          }
          if (this.spellType == 47 &&
            50 < this.ageTicks) {
            return false;
          }
          if (36 == this.spellType &&
            50 < this.ageTicks) {
            return false;
          }
          if (obfuscationGuard != 6) {
            this.isAlive(-117);
          }
          if (this.spellType == 19 &&
            this.ageTicks > 50) {
            return false;
          }
          if (this.spellType == 153) {
            return false;
          }
          if (this.spellType == 136) {
            return false;
          }
          if (this.spellType == 141 &&
            10 < this.ageTicks) {
            return false;
          }
          if (this.spellType == 142) {
            return false;
          }
          if (this.spellType == 144 &&
            this.ageTicks > 10) {
            return false;
          }
          if (this.spellType == 125 &&
            this.ageTicks > 10) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.V(" + obfuscationGuard + ')');
        }
    }

    private final void playSound(int soundId, boolean obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!obfuscationGuard) {
            return;
          }
          if (null != this.battle.projectileSamples &&
            this.battle.projectileSamples[soundId] != null) {
            DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[soundId], this.battle.projectileSamples[soundId]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "mi.J(" + soundId + ',' + obfuscationGuard + ')');
        }
    }

    final int getX(int obfuscationGuard) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 25) {
            stackIn_4_0 = this.x;
            return stackIn_4_0;
          }
          stackIn_2_0 = -95;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.T(" + obfuscationGuard + ')');
        }
    }

    final static void playMusic(MusicTrack track, int obfuscationGuard) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MusicAndClipHelpers.playMusicTrack(track, true, (byte) -119);
          if (obfuscationGuard != 3) {
            SpellProjectile.isPointerInRect(-112, 22, 80, -24, 120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.AA(");
          if (track == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isPersistentType(int obfuscationGuard) {
        boolean stackIn_43_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 40 / ((54 - obfuscationGuard) / 47);
          stackIn_43_0 = (this.spellType == 105) || (this.spellType == 87) || (this.spellType == 88) || (90 == this.spellType) || (this.spellType == 100) || (this.spellType == 95) || (this.spellType == 114) || (this.spellType == 102) || (this.spellType == 109) || (this.spellType == 112) || (this.spellType == 129) || (132 == this.spellType) || (166 == this.spellType) || (this.spellType == 167);
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.BA(" + obfuscationGuard + ')');
        }
    }

    final static boolean isPointerInRect(int height, int y, int width, int obfuscationGuard, int x) {
        RuntimeException var5 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -8) {
            SpellProjectile.isPointerInRect(-116, -3, 107, 69, 64);
          }
          stackIn_16_0 = (EmailLoginCredentials.field_g >= x) && ((x + width) > EmailLoginCredentials.field_g) && (y <= MenuButtonPanel.field_I) && ((y + height) > MenuButtonPanel.field_I);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "mi.A(" + height + ',' + y + ',' + width + ',' + obfuscationGuard + ',' + x + ')');
        }
    }

    private final void detonate(int obfuscationGuard, int targetX, int targetY, int round) {
        int stackIn_958_0 = 0;
        int stackIn_1007_1 = 0;
        int stackIn_1293_0 = 0;
        int stackIn_1293_1 = 0;
        boolean stackIn_2219_0 = false;
        int stackIn_2234_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2218_0;
        Object var5 = null;
        int var6 = 0;
        IsaacRandom var6_ref_jd = null;
        int var7 = 0;
        IsaacRandom var7_ref_jd = null;
        int var8 = 0;
        int var9 = 0;
        IsaacRandom var9_ref_jd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        IndexedSprite var12_ref_ll = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (obfuscationGuard != 6016) {
            return;
          }
          regionExit1: {
            var5 = null;
            var6 = this.spellType;
            if (var6 == 84 &&
              var19 == 0) {
              break regionExit1;
            }
            if (var6 == 81 &&
              var19 == 0) {
              break regionExit1;
            }
            if (var6 != 75) {
              if (var6 == 73 &&
                var19 == 0) {
                break regionExit1;
              }
              if (var6 != 97 &&
                113 != var6 &&
                var6 != 125 &&
                var6 != 144) {
                if (var6 == 153 &&
                  var19 == 0) {
                  break regionExit1;
                }
                if (var6 == 133 &&
                  var19 == 0) {
                  this.updateFlightSound(7, (byte) 34);
                  if (this.y >= this.battle.arenaHeight) {
                    if (96 == this.battle.field_Y) {
                      this.battle.field_Y = -96;
                    }
                    this.y = this.battle.arenaHeight;
                    this.applyAreaEffect(this.field_H, this.field_H, this.field_H, 8);
                    var6_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                    var7 = 0;
                    while (40 > var7) {
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 135, this.y, this.battle);
                      var8 = 8191 & var6_ref_jd.nextInt((byte) -46);
                      if (0 == this.velocityX) {
                        this.velocityX = 1;
                      }
                      ((SpellProjectile) (var5)).velocityX = this.velocityX + Math.abs((127 & var6_ref_jd.nextInt((byte) -46)) * GradientBarPainter.sine(obfuscationGuard - 5896, var8) >> 17) * this.velocityX / Math.abs(this.velocityX);
                      ((SpellProjectile) (var5)).velocityY = -Math.abs(this.velocityY) - Math.abs((var6_ref_jd.nextInt((byte) -46) & 127) * BevelBoxPainter.cosine(var8, obfuscationGuard - 6134) >> 17);
                      this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                      var7++;
                    }
                    this.playTypeSound(1, (byte) 37, 7);
                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                    this.remove(0);
                    return;
                  }
                  this.subpixelX = this.subpixelX + this.velocityX;
                  this.subpixelY = this.subpixelY + this.velocityY;
                  this.velocityY = this.velocityY + 4;
                  this.y = this.subpixelY >> 4;
                  this.x = this.subpixelX >> 4;
                  if (null != this.owner &&
                    this.ageTicks < 25) {
                    this.battle.eraseUnitMask(this.owner, obfuscationGuard ^ 6016);
                  }
                  if (!this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, obfuscationGuard ^ 6018, -this.spriteRadius + this.x, this.sprite)) {
                    if (this.x < -640) {
                      this.remove(0);
                      return;
                    }
                    if (this.x > 640 + this.battle.arenaWidth) {
                      this.remove(0);
                      return;
                    }
                    if (this.owner == null) {
                      return;
                    }
                    if (this.ageTicks >= 25) {
                      return;
                    }
                    this.battle.stampUnitMask(obfuscationGuard ^ -6129, this.owner);
                    return;
                  }
                  var6_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                  var7 = 0;
                  while (var7 < 17) {
                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 135, this.y, this.battle);
                    var8 = (var6_ref_jd.nextInt((byte) -46) & 8191) * 3 / 2;
                    if (this.velocityX == 0) {
                      this.velocityX = 1;
                    }
                    ((SpellProjectile) (var5)).velocityX = this.velocityX + Math.abs((var6_ref_jd.nextInt((byte) -46) & 127) * GradientBarPainter.sine(113, var8) >> 17) * this.velocityX / Math.abs(this.velocityX);
                    ((SpellProjectile) (var5)).velocityY = this.velocityY - (-((127 & var6_ref_jd.nextInt((byte) -46)) * BevelBoxPainter.cosine(var8, obfuscationGuard ^ -6134) >> 17) + 64);
                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                    var7++;
                  }
                  this.playTypeSound(1, (byte) 37, 7);
                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                  this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                  this.applyAreaEffect(9, 5, 16, 8);
                  this.remove(0);
                  return;
                }
                if (var6 != 45) {
                  if (28 != var6) {
                    regionExit2: {
                      if (var6 != 49) {
                        if (23 == var6 &&
                          var19 == 0) {
                          break regionExit2;
                        }
                        if (var6 != 24) {
                          if (var6 == 82 &&
                            var19 == 0) {
                            break regionExit2;
                          }
                          if (21 == var6 &&
                            var19 == 0) {
                            break regionExit2;
                          }
                          if (42 == var6 &&
                            var19 == 0) {
                            break regionExit2;
                          }
                          if (var6 == 43 &&
                            var19 == 0) {
                            break regionExit2;
                          }
                          if (var6 != 40 &&
                            var6 != 44) {
                            if (var6 == 96 &&
                              var19 == 0) {
                              break regionExit2;
                            }
                            if (10 != var6) {
                              if (17 == var6 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 == 14 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 == 11 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 == 18 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 == 0 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 == 91 &&
                                var19 == 0) {
                                break regionExit2;
                              }
                              if (var6 != 92) {
                                if (var6 == 52 &&
                                  var19 == 0) {
                                  break regionExit2;
                                }
                                if (var6 == 50 &&
                                  var19 == 0) {
                                  break regionExit2;
                                }
                                if (var6 != 54) {
                                  if (var6 == 115 &&
                                    var19 == 0) {
                                    break regionExit2;
                                  }
                                  if (var6 == 140 &&
                                    var19 == 0) {
                                    break regionExit2;
                                  }
                                  if (var6 != 120 &&
                                    124 != var6 &&
                                    var6 != 145 &&
                                    156 != var6) {
                                    if (158 == var6 &&
                                      var19 == 0) {
                                      break regionExit2;
                                    }
                                    if (var6 == 161 &&
                                      var19 == 0) {
                                      break regionExit2;
                                    }
                                    if (var6 != 162) {
                                      if (var6 == 164 &&
                                        var19 == 0) {
                                        break regionExit2;
                                      }
                                      if (var6 == 3) {
                                        this.field_x = this.field_x + 8;
                                        if (128 < this.field_x) {
                                          this.field_x = this.field_x - 256;
                                        }
                                        if (25 <= this.ageTicks) {
                                          if (!this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, obfuscationGuard - 6014, this.x - this.spriteRadius, this.sprite)) {
                                            return;
                                          }
                                          if (BitHelpers.field_b) {
                                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 101, this.y, this.battle);
                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                            this.applyAreaEffect(10, 64, 32, 8);
                                          }
                                          this.remove(obfuscationGuard - 6016);
                                          return;
                                        }
                                        this.ageTicks = this.ageTicks + 1;
                                        if (var19 == 0) {
                                          return;
                                        }
                                      } else {
                                        if (var6 != 117) {
                                          if (var6 == 16) {
                                            var6 = 1;
                                            if (this.ageTicks >= 300) {
                                              var6 = 0;
                                            }
                                            var7 = 2;
                                            this.field_x = this.field_x + 1;
                                            if (this.field_x > 64) {
                                              this.field_x = this.field_x - (-(int)(4.0 * Math.random()) + 64);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                                              ((SpellProjectile) (var5)).velocityY = -1;
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            if ((63 & this.field_x) == 0) {
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                                              ((SpellProjectile) (var5)).velocityY = -16;
                                              ((SpellProjectile) (var5)).velocityX = 0;
                                              ((SpellProjectile) (var5)).field_H = -4;
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            if (var6 == 0) {
                                              this.velocityY = 0;
                                              this.velocityX = 0;
                                              GameSelectionHelpers.field_k = 0;
                                              BitHelpers.field_b = false;
                                              NodeHashTable.field_m = 0;
                                              var8 = 0;
                                              if (this.battle.isSolidAt(this.y + 1, -3 + this.x, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.battle.isSolidAt(1 + this.y, this.x + 3, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.battle.isSolidAt(1 + this.y - 5, this.x, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.battle.isSolidAt(5 + this.y + 1, this.x, (byte) -83)) {
                                                var8++;
                                              }
                                              if (0 < var8) {
                                                GameSelectionHelpers.field_k = GameSelectionHelpers.field_k / var8;
                                                NodeHashTable.field_m = NodeHashTable.field_m / var8;
                                              }
                                              if (0 == var8) {
                                                this.ageTicks = 50;
                                              } else {
                                                if (this.ageTicks <= 300) {
                                                  this.ageTicks = 300;
                                                }
                                                if (BitHelpers.field_b) {
                                                  if (this.spellType == 16) {
                                                    this.playTypeSound(2, (byte) 37, 0);
                                                    this.applyAreaEffect(5, 20, 16, 8);
                                                    this.remove(obfuscationGuard ^ 6016);
                                                    return;
                                                  }
                                                } else {
                                                  if (16 == this.spellType) {
                                                    BitHelpers.field_b = false;
                                                    if (!(this.y <= (this.battle.arenaHeight - 32)) ||
                                                      this.battle.isSolidAt(this.y, -3 + this.x, (byte) -83) ||
                                                      this.battle.isSolidAt(this.y, this.x + 3, (byte) -83) ||
                                                      this.battle.isSolidAt(this.y - 5, this.x, (byte) -83) ||
                                                      this.battle.isSolidAt(5 + this.y, this.x, (byte) -83)) {
                                                      if (BitHelpers.field_b) {
                                                        this.applyAreaEffect(5, 20, 16, 8);
                                                      }
                                                      this.remove(0);
                                                      return;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var6 != 0 ||
                                              var19 != 0) {
                                              var8 = 0;
                                              if (null != this.owner &&
                                                this.ageTicks < 5) {
                                                this.battle.eraseUnitMask(this.owner, obfuscationGuard - 6016);
                                                var8 = 1;
                                              }
                                              var9 = 0;
                                              this.y = this.subpixelY >> 4;
                                              BitHelpers.field_b = false;
                                              this.x = this.subpixelX >> 4;
                                              NodeHashTable.field_m = 0;
                                              GameSelectionHelpers.field_k = 0;
                                              var10 = 0;
                                              if (this.battle.isSolidAt(this.y, -3 + this.x, (byte) -83)) {
                                                var10++;
                                                var9 = 1;
                                              }
                                              if (this.battle.isSolidAt(this.y, this.x + 3, (byte) -83)) {
                                                var10++;
                                                var9 = 1;
                                              }
                                              if (this.battle.isSolidAt(this.y - 5, this.x, (byte) -83)) {
                                                var9 = 1;
                                                var10++;
                                              }
                                              if (this.battle.isSolidAt(5 + this.y, this.x, (byte) -83)) {
                                                var9 = 1;
                                                var10++;
                                              }
                                              if (var10 > 0) {
                                                NodeHashTable.field_m = NodeHashTable.field_m / var10;
                                                GameSelectionHelpers.field_k = GameSelectionHelpers.field_k / var10;
                                              }
                                              if (var9 != 0 &&
                                                var7 < this.ageTicks &&
                                                !BitHelpers.field_b) {
                                                this.playTypeSound(2, (byte) 37, 0);
                                                this.applyAreaEffect(0, 0, 8, 8);
                                                this.remove(0);
                                                return;
                                              }
                                              this.velocityY = this.velocityY + 4;
                                              if (16 == this.spellType) {
                                                if (this.velocityX > 0) {
                                                  this.velocityX = this.velocityX - 1;
                                                }
                                                if (0 > this.velocityX) {
                                                  this.velocityX = this.velocityX + 1;
                                                }
                                              }
                                              var11 = this.subpixelX;
                                              var12 = this.subpixelY;
                                              var13 = 0;
                                              scanLoop3: while (true) {
                                                this.subpixelY = this.subpixelY + (this.velocityY + 4);
                                                this.subpixelX = this.subpixelX + this.velocityX;
                                                BitHelpers.field_b = false;
                                                NodeHashTable.field_m = 0;
                                                GameSelectionHelpers.field_k = 0;
                                                var10 = 0;
                                                this.x = this.subpixelX >> 4;
                                                this.y = this.subpixelY >> 4;
                                                if (this.battle.isSolidAt(this.y, -3 + this.x, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.battle.isSolidAt(this.y, 3 + this.x, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.battle.isSolidAt(-5 + this.y, this.x, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.battle.isSolidAt(5 + this.y, this.x, (byte) -83)) {
                                                  var10++;
                                                }
                                                stackIn_1293_0 = 0;
                                                stackIn_1293_1 = var10;
                                                do {
                                                  if (stackIn_1293_0 < stackIn_1293_1) {
                                                    GameSelectionHelpers.field_k = GameSelectionHelpers.field_k / var10;
                                                    NodeHashTable.field_m = NodeHashTable.field_m / var10;
                                                  }
                                                  boolean decompiledFrameRemainder14 = true;
                                                  if (var10 <= 0 ||
                                                    this.ageTicks < var7 &&
                                                    BitHelpers.field_b) {
                                                    var13 = 6;
                                                    decompiledFrameRemainder14 = (var19 != 0);
                                                  }
                                                  if (decompiledFrameRemainder14) {
                                                    if (BitHelpers.field_b) {
                                                      this.playTypeSound(2, (byte) 37, 0);
                                                      this.y = this.y - 4;
                                                      this.subpixelY = this.subpixelY - 64;
                                                      this.applyAreaEffect(5, 20, 48, 8);
                                                      this.remove(obfuscationGuard ^ 6016);
                                                      return;
                                                    }
                                                    if (null != this.owner) {
                                                      this.owner = null;
                                                    }
                                                    var15 = -GameSelectionHelpers.field_k + this.y;
                                                    var14 = this.x - NodeHashTable.field_m;
                                                    var16 = ConnectionState.greatestCommonDivisor(var15 << 4, var14 << 4, false);
                                                    if (16 > var16) {
                                                      var15 = -1;
                                                      var16 = 16;
                                                      var14 = 0;
                                                    }
                                                    var17 = (var14 * (this.velocityX << 8) + var15 * (this.velocityY << 8)) / var16;
                                                    var18 = (-(var14 * (this.velocityY << 8)) + var15 * (this.velocityX << 8)) / var16;
                                                    if (0 > var17) {
                                                      var17 = -var17;
                                                      var15 = -var15;
                                                      var18 = -var18;
                                                      var14 = -var14;
                                                    }
                                                    var17 = -(var17 >> 1);
                                                    var18 = var18 >> 1;
                                                    var17 = var17 >> 1;
                                                    if (Math.abs(var18) < 128) {
                                                      if (this.ageTicks > 50) {
                                                        this.ageTicks = 300;
                                                      }
                                                      if (!(this.ageTicks > 5)) {
                                                        this.ageTicks = 6;
                                                        if (var19 != 0) {
                                                          if (this.ageTicks < 50) {
                                                            this.playTypeSound(2, (byte) 37, 0);
                                                            this.applyAreaEffect(0, 0, 8, 8);
                                                          }
                                                          this.ageTicks = 50;
                                                        }
                                                      }
                                                    } else {
                                                      if (this.ageTicks < 50) {
                                                        this.playTypeSound(2, (byte) 37, 0);
                                                        this.applyAreaEffect(0, 0, 8, 8);
                                                      }
                                                      this.ageTicks = 50;
                                                    }
                                                    this.subpixelY = var12;
                                                    this.subpixelX = var11;
                                                    this.velocityY = (var15 * var17 - var18 * var14) / var16;
                                                    this.y = this.subpixelY >> 4;
                                                    var13++;
                                                    this.x = this.subpixelX >> 4;
                                                    this.velocityX = (var15 * var18 + var14 * var17) / var16;
                                                  }
                                                  if (var9 == 0 &&
                                                    var13 < 5) {
                                                    continue scanLoop3;
                                                  }
                                                  stackIn_1293_0 = -6;
                                                  stackIn_1293_1 = ~var13;
                                                } while (var19 != 0);
                                                break;
                                              }
                                              if (stackIn_1293_0 == stackIn_1293_1) {
                                                this.velocityX = this.velocityX >> 1;
                                                this.velocityY = this.velocityY >> 1;
                                              }
                                              if (this.owner != null &&
                                                var8 != 0) {
                                                this.battle.stampUnitMask(-127, this.owner);
                                              }
                                            }
                                            if (this.ageTicks <= 250 && (this.ageTicks > 5 ||
                                              this.ageTicks < 5)) {
                                              this.ageTicks = this.ageTicks + 1;
                                            }
                                            if (this.x < -640) {
                                              this.remove(0);
                                              return;
                                            }
                                            if (640 + this.battle.arenaWidth < this.x) {
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.y <= this.battle.arenaHeight) {
                                              return;
                                            }
                                            this.remove(0);
                                            return;
                                          }
                                          if ((var6 != 26 ||
                                            var19 != 0) && (var6 != 25 ||
                                            var19 != 0) && (var6 != 20 &&
                                            var6 != 135) && (var6 != 152 ||
                                            var19 != 0) && (var6 != 13 ||
                                            var19 != 0) && (var6 != 67 ||
                                            var19 != 0) && (12 != var6 &&
                                            var6 != 46 &&
                                            var6 != 76) && (var6 != 41 ||
                                            var19 != 0) && (var6 != 33 ||
                                            var19 != 0) && (var6 != 31 &&
                                            var6 != 34 &&
                                            var6 != 53) && (var6 != 116 ||
                                            var19 != 0) && (var6 != 122 &&
                                            var6 != 147) && (var6 != 146 ||
                                            var19 != 0) && (var6 != 143 ||
                                            var19 != 0) && (var6 != 159 &&
                                            var6 != 160)) {
                                            if (var6 != 165) {
                                              return;
                                            }
                                            if (var19 != 0) {
                                              break regionExit1;
                                            }
                                          }
                                          var6 = 1;
                                          if (165 == this.spellType &&
                                            300 <= this.ageTicks) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 16 &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 20 &&
                                            300 <= this.ageTicks) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 159 &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (160 == this.spellType &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (135 == this.spellType &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 152 &&
                                            300 <= this.ageTicks) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 46 &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 76 &&
                                            this.ageTicks >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.spellType == 34 &&
                                            0 < this.ageTicks) {
                                            var6 = 0;
                                          }
                                          if (116 == this.spellType &&
                                            this.ageTicks > 250) {
                                            var6 = 0;
                                          }
                                          if (var6 != 0) {
                                            if (this.spellType == 13 ||
                                              67 == this.spellType ||
                                              12 == this.spellType) {
                                              this.updateFlightSound(0, (byte) 34);
                                            }
                                            if (this.spellType == 46 ||
                                              76 == this.spellType ||
                                              this.spellType == 41) {
                                              this.updateFlightSound(3, (byte) 34);
                                            }
                                            if (this.spellType == 26 ||
                                              25 == this.spellType ||
                                              this.spellType == 20) {
                                              this.updateFlightSound(1, (byte) 34);
                                            }
                                            boolean decompiledFrameCompleted36 = true;
                                            if (this.spellType == 31 ||
                                              this.spellType == 34 ||
                                              this.spellType == 33) {
                                              this.updateFlightSound(2, (byte) 34);
                                              if (this.spellType == 34) {
                                                var7 = Math.abs(-this.owner.x + this.x);
                                                if (var7 < 50) {
                                                  var7 = 50;
                                                }
                                                var8 = 225;
                                                if (this.battle.playerSpellbook[this.owner.ownerPlayer] == 2) {
                                                  var8 = var8 + this.battle.field_X[this.owner.ownerPlayer];
                                                }
                                                if (var7 < var8) {
                                                  var8 = var7;
                                                }
                                                var8 -= 50;
                                                var9 = 0;
                                                while (var8 > var9) {
                                                  var5 = this.spawnFromHere(this.x + (int)((double)(-var8) + (double)var8 * Math.random() * 2.0) / 25, (BattleUnit) null, (byte) 81, 112, this.y + (int)((double)(-var8) + Math.random() * (double)var8 * 2.0) / 25, this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  var9 += 50;
                                                  if (var19 != 0) {
                                                    decompiledFrameCompleted36 = false;
                                                    break;
                                                  }
                                                }
                                              }
                                            }
                                            if ((decompiledFrameCompleted36) &&
                                              (this.spellType == 53)) {
                                              this.updateFlightSound(4, (byte) 34);
                                            }
                                            if (this.spellType == 116 ||
                                              this.spellType == 135 ||
                                              this.spellType == 152 ||
                                              this.spellType == 122) {
                                              this.updateFlightSound(6, (byte) 34);
                                            }
                                            if (this.spellType == 146 ||
                                              this.spellType == 143) {
                                              this.updateFlightSound(7, (byte) 34);
                                            }
                                            if (147 == this.spellType) {
                                              var5 = this.spawnFromHere(this.x + (int)(11.0 * Math.random() - 5.0), (BattleUnit) null, (byte) 81, 102, this.y, this.battle);
                                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                              if (this.ageTicks == 225 &&
                                                this.battle.projectileSamples != null &&
                                                null != this.battle.projectileSamples[74]) {
                                                DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[220] >> 2, this.battle.projectileSamples[74]);
                                              }
                                            }
                                          }
                                          if (165 == this.spellType) {
                                            this.field_x = this.field_x + 1;
                                            if (16 < this.field_x) {
                                              this.field_x = this.field_x - (-(int)(4.0 * Math.random()) + 16);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 166, this.y, this.battle);
                                              ((SpellProjectile) (var5)).velocityX = (int)(21.0 * Math.random()) - 10;
                                              ((SpellProjectile) (var5)).velocityY = -10 + (int)(Math.random() * 21.0);
                                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                            }
                                          }
                                          boolean decompiledFrameRemainder13 = true;
                                          if (16 == this.spellType) {
                                            this.field_x = this.field_x + 1;
                                            if (this.field_x > 16) {
                                              this.field_x = this.field_x - (16 - (int)(Math.random() * 4.0));
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                                              ((SpellProjectile) (var5)).velocityY = -1;
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            decompiledFrameRemainder13 = ((3 & this.field_x) == 0);
                                            if (decompiledFrameRemainder13) {
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                                              ((SpellProjectile) (var5)).field_H = -4;
                                              ((SpellProjectile) (var5)).velocityX = 0;
                                              ((SpellProjectile) (var5)).velocityY = -16;
                                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                              decompiledFrameRemainder13 = (var19 != 0);
                                            }
                                          }
                                          if (decompiledFrameRemainder13) {
                                            if (67 == this.spellType) {
                                              this.field_x = this.field_x + 1;
                                              decompiledFrameRemainder13 = !(this.field_x <= 4);
                                              if (decompiledFrameRemainder13) {
                                                this.field_x = this.field_x - 4;
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                                                ((SpellProjectile) (var5)).velocityY = -16;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                decompiledFrameRemainder13 = (var19 != 0);
                                              }
                                            }
                                            if (decompiledFrameRemainder13) {
                                              if (this.spellType == 31) {
                                                if (0 >= this.field_x) {
                                                  this.field_x = this.field_x - 1;
                                                  if (-4 > this.field_x) {
                                                    this.field_x = this.field_x + 4;
                                                  }
                                                }
                                                decompiledFrameRemainder13 = ((3 & this.field_x) == 0);
                                                if (decompiledFrameRemainder13) {
                                                  var5 = this.spawnFromHere(this.x + (int)(-2.0 + Math.random() * 4.0), (BattleUnit) null, (byte) 81, 112, this.y + (int)(Math.random() * 4.0 - 2.0), this.battle);
                                                  ((SpellProjectile) (var5)).velocityX = 4 * this.velocityX + (int)(-8.0 + 16.0 * Math.random());
                                                  ((SpellProjectile) (var5)).velocityY = 4 * this.velocityY + (int)(Math.random() * 16.0 - 8.0);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  decompiledFrameRemainder13 = (var19 != 0);
                                                }
                                              }
                                              if (decompiledFrameRemainder13) {
                                                if (122 == this.spellType) {
                                                  this.field_x = this.field_x + 1;
                                                  decompiledFrameRemainder13 = !(this.field_x <= 4);
                                                  if (decompiledFrameRemainder13) {
                                                    this.field_x = this.field_x - 4;
                                                    var5 = this.spawnFromHere(this.x + (int)(4.0 * Math.random() - 2.0), (BattleUnit) null, (byte) 81, 129, this.y + (int)(-2.0 + 4.0 * Math.random()), this.battle);
                                                    ((SpellProjectile) (var5)).velocityY = -16;
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    decompiledFrameRemainder13 = (var19 != 0);
                                                  }
                                                }
                                                if (decompiledFrameRemainder13) {
                                                  if (this.spellType == 116) {
                                                    this.field_x = this.field_x + 1;
                                                    if (this.field_x > 4) {
                                                      this.field_x = this.field_x - 4;
                                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 129, this.y, this.battle);
                                                      ((SpellProjectile) (var5)).velocityY = -16;
                                                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    }
                                                  } else {
                                                    if (this.spellType != 146 &&
                                                      this.spellType == 143) {
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          regionExit4: {
                                            regionExit5: {
                                              if (var6 != 0) {
                                                var7 = 0;
                                                if (null != this.owner &&
                                                  25 > this.ageTicks) {
                                                  var7 = 1;
                                                  this.battle.eraseUnitMask(this.owner, 0);
                                                }
                                                var8 = 0;
                                                this.y = this.subpixelY >> 4;
                                                this.x = this.subpixelX >> 4;
                                                if (this.spellType != 31 &&
                                                  this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, obfuscationGuard - 6014, -this.spriteRadius + this.x, this.sprite)) {
                                                  this.velocityY = 0;
                                                  this.velocityX = 0;
                                                  var8 = 1;
                                                }
                                                this.velocityY = this.velocityY + 4;
                                                if (this.spellType == 25 &&
                                                  this.velocityY > 0 &&
                                                  this.ageTicks > 50) {
                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.playTypeSound(1, (byte) 37, 1);
                                                  this.applyAreaEffect(25, 64, 12, obfuscationGuard - 6008);
                                                  this.spellType = 26;
                                                  this.velocityY = this.velocityY / 2;
                                                  this.sprite = QuickChatPhrase.field_x[0];
                                                  this.velocityX = this.velocityX / 2;
                                                  this.ageTicks = 50;
                                                  this.spriteRadius = this.sprite.field_n / 2;
                                                }
                                                if ((this.spellType == 152 ||
                                                  this.spellType == 135) &&
                                                  this.velocityY < 0) {
                                                  this.velocityY = this.velocityY + 4;
                                                }
                                                if (this.spellType != 135 ||
                                                  this.velocityY <= 0) {
                                                  if (16 == this.spellType) {
                                                    if (this.velocityX > 0) {
                                                      this.velocityX = this.velocityX - 1;
                                                    }
                                                    if (this.velocityX < 0) {
                                                      this.velocityX = this.velocityX + 1;
                                                      if (var19 != 0) {
                                                        if (this.velocityX > 0) {
                                                          this.velocityX = this.velocityX - 1;
                                                        }
                                                        if (this.velocityX < 0) {
                                                          this.velocityX = this.velocityX + 1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (this.velocityX > 0) {
                                                    this.velocityX = this.velocityX - 1;
                                                  }
                                                  if (this.velocityX < 0) {
                                                    this.velocityX = this.velocityX + 1;
                                                  }
                                                }
                                                if (this.spellType == 46) {
                                                  if (this.y > this.battle.arenaHeight - 32) {
                                                    this.checkHeightEffects(77);
                                                    this.remove(0);
                                                    return;
                                                  }
                                                  if (0 < this.velocityX) {
                                                    this.velocityX = this.velocityX - 1;
                                                  }
                                                  if (this.velocityX < 0) {
                                                    this.velocityX = this.velocityX + 1;
                                                  }
                                                  this.velocityX = this.velocityX * 15 >> 4;
                                                  this.velocityY = this.velocityY * 15 >> 4;
                                                }
                                                var9 = this.subpixelX;
                                                var10 = this.subpixelY;
                                                var11 = 0;
                                                scanLoop6: while (true) {
                                                  boolean decompiledFrameCompleted25 = true;
                                                  boolean decompiledFrameCompleted12 = true;
                                                  regionExit7: {
                                                    boolean decompiledFrameCompleted8 = true;
                                                    boolean decompiledFrameCompleted24 = true;
                                                    boolean decompiledFrameCompleted22 = true;
                                                    boolean decompiledFrameCompleted11 = true;
                                                    boolean decompiledFrameCompleted9 = true;
                                                    regionExit8: {
                                                      boolean decompiledFrameCompleted23 = true;
                                                      boolean decompiledFrameCompleted10 = true;
                                                      boolean decompiledFrameCompleted28 = true;
                                                      boolean decompiledFrameCompleted26 = true;
                                                      boolean decompiledFrameCompleted15 = true;
                                                      boolean decompiledFrameCompleted13 = true;
                                                      boolean decompiledFrameCompleted27 = true;
                                                      boolean decompiledFrameCompleted14 = true;
                                                      boolean decompiledFrameCompleted29 = true;
                                                      boolean decompiledFrameCompleted16 = true;
                                                      boolean decompiledFrameCompleted31 = true;
                                                      boolean decompiledFrameCompleted30 = true;
                                                      boolean decompiledFrameCompleted18 = true;
                                                      boolean decompiledFrameCompleted17 = true;
                                                      boolean decompiledFrameCompleted32 = true;
                                                      boolean decompiledFrameCompleted19 = true;
                                                      boolean decompiledFrameCompleted33 = true;
                                                      boolean decompiledFrameCompleted20 = true;
                                                      boolean decompiledFrameCompleted34 = true;
                                                      boolean decompiledFrameCompleted21 = true;
                                                      boolean decompiledFrameCompleted35 = true;
                                                      this.subpixelY = this.subpixelY + (4 + this.velocityY);
                                                      this.subpixelX = this.subpixelX + this.velocityX;
                                                      this.y = this.subpixelY >> 4;
                                                      this.x = this.subpixelX >> 4;
                                                      if (!this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, obfuscationGuard ^ 6018, this.x - this.spriteRadius, this.sprite)) {
                                                        var11 = 6;
                                                        if (var19 == 0) {
                                                          if (var8 == 0 &&
                                                            5 > var11) {
                                                            continue;
                                                          }
                                                          this.notifyOwner((byte) -123);
                                                          break regionExit7;
                                                        }
                                                      }
                                                      if (this.spellType == 46) {
                                                        do {
                                                          var12_ref_ll = ScreenSwitchHelpers.field_f[17];
                                                          if ((this.battle.arenaHeight / 4) > this.y) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[18];
                                                          }
                                                          if (this.y < this.battle.arenaHeight / 5) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[19];
                                                          }
                                                          this.sprite = var12_ref_ll.toRgbSprite();
                                                          if (BitHelpers.field_b &&
                                                            16 == this.spellType) {
                                                            decompiledFrameCompleted35 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.spellType == 20) {
                                                            decompiledFrameCompleted34 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            159 == this.spellType) {
                                                            decompiledFrameCompleted33 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            160 == this.spellType) {
                                                            decompiledFrameCompleted32 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b) {
                                                            if (135 == this.spellType) {
                                                              decompiledFrameCompleted31 = false;
                                                              break;
                                                            }
                                                            if (152 == this.spellType) {
                                                              decompiledFrameCompleted30 = false;
                                                              break;
                                                            }
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            76 == this.spellType) {
                                                            decompiledFrameCompleted29 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.spellType == 46) {
                                                            decompiledFrameCompleted28 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            31 == this.spellType) {
                                                            decompiledFrameCompleted27 = false;
                                                            break;
                                                          }
                                                          boolean decompiledFrameRemainder12 = true;
                                                          if (this.spellType == 20) {
                                                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.applyAreaEffect(5, 32, 3, obfuscationGuard ^ 6024);
                                                            decompiledFrameRemainder12 = (var19 != 0);
                                                          }
                                                          if (decompiledFrameRemainder12) {
                                                            if (this.spellType == 135 &&
                                                              this.ageTicks < 25) {
                                                              this.applyAreaEffect(0, 32, 3, obfuscationGuard ^ 6024);
                                                              decompiledFrameRemainder12 = (var19 != 0);
                                                              if (decompiledFrameRemainder12) {
                                                                decompiledFrameCompleted26 = false;
                                                                break;
                                                              }
                                                            }
                                                            if ((decompiledFrameRemainder12) &&
                                                              (this.spellType == 152)) {
                                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              if (0 > this.velocityY) {
                                                                decompiledFrameCompleted25 = false;
                                                                break;
                                                              }
                                                            }
                                                          }
                                                          var12 = -NodeHashTable.field_m + this.x;
                                                          var13 = this.y - GameSelectionHelpers.field_k;
                                                          var14 = ConnectionState.greatestCommonDivisor(var13 << 4, var12 << 4, false);
                                                          if (var14 < 1) {
                                                            var14 = 16;
                                                            var13 = -1;
                                                            var12 = 0;
                                                          }
                                                          var15 = ((this.velocityY << 8) * var13 + (this.velocityX << 8) * var12) / var14;
                                                          var16 = ((this.velocityX << 8) * var13 - var12 * (this.velocityY << 8)) / var14;
                                                          if (var15 < 0) {
                                                            var16 = -var16;
                                                            var13 = -var13;
                                                            var12 = -var12;
                                                            var15 = -var15;
                                                          }
                                                          boolean decompiledFrameRemainder11 = true;
                                                          var15 = -(var15 >> 1);
                                                          if (20 != this.spellType &&
                                                            this.spellType != 159 &&
                                                            this.spellType != 160 &&
                                                            165 != this.spellType) {
                                                            if (this.spellType == 135 ||
                                                              this.spellType == 152) {
                                                              if ((Math.abs(var16) < 128) &&
                                                                (decompiledFrameRemainder11 = !(this.ageTicks <= 200))) {
                                                                this.ageTicks = 300;
                                                                decompiledFrameRemainder11 = (var19 != 0);
                                                              }
                                                              if (decompiledFrameRemainder11) {
                                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 132, this.y, this.battle);
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                this.ageTicks = this.ageTicks + 5;
                                                                decompiledFrameRemainder11 = (var19 != 0);
                                                              }
                                                            }
                                                            if (decompiledFrameRemainder11) {
                                                              if (this.spellType == 46) {
                                                                var15 = var15 >> 1;
                                                                var16 = var16 >> 1;
                                                                if ((256 > Math.abs(var16)) &&
                                                                  (decompiledFrameRemainder11 = !(this.ageTicks <= 50))) {
                                                                  this.ageTicks = 300;
                                                                  decompiledFrameRemainder11 = (var19 != 0);
                                                                }
                                                                if (decompiledFrameRemainder11) {
                                                                  this.ageTicks = 50;
                                                                  decompiledFrameRemainder11 = (var19 != 0);
                                                                }
                                                              }
                                                              if (decompiledFrameRemainder11) {
                                                                if (16 != this.spellType &&
                                                                  76 != this.spellType) {
                                                                  if (this.spellType == 26) {
                                                                    decompiledFrameCompleted24 = false;
                                                                    break;
                                                                  }
                                                                  if ((this.spellType != 31) &&
                                                                    (decompiledFrameRemainder11 = (this.spellType == 34))) {
                                                                    var12 = 0;
                                                                    var13 = 0;
                                                                    this.ageTicks = 1;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder11) {
                                                                    this.field_x = 0;
                                                                    this.playTypeSound(1, (byte) 37, 2);
                                                                    this.ageTicks = this.ageTicks + 50;
                                                                    var17 = this.x;
                                                                    this.x = NodeHashTable.field_m;
                                                                    var18 = this.y;
                                                                    this.y = GameSelectionHelpers.field_k;
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 99, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(10, 64, 64, 8);
                                                                    this.y = var18;
                                                                    this.x = var17;
                                                                    if (this.ageTicks > 1000) {
                                                                      decompiledFrameCompleted23 = false;
                                                                      break;
                                                                    }
                                                                    if (-1000 > var16) {
                                                                      var16 = -1000;
                                                                    }
                                                                    var15 -= 256;
                                                                    if (var16 > 1000) {
                                                                      var16 = 1000;
                                                                    }
                                                                    var11 = 5;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                    if (decompiledFrameRemainder11) {
                                                                      decompiledFrameCompleted22 = false;
                                                                      break;
                                                                    }
                                                                  }
                                                                }
                                                                if (decompiledFrameRemainder11) {
                                                                  var16 = var16 >> 1;
                                                                  var15 = var15 >> 1;
                                                                  if ((Math.abs(var16) < 128) &&
                                                                    (decompiledFrameRemainder11 = !(50 >= this.ageTicks))) {
                                                                    this.ageTicks = 300;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder11) {
                                                                    if (this.ageTicks < 50 &&
                                                                      16 == this.spellType) {
                                                                      this.playTypeSound(2, (byte) 37, 0);
                                                                      this.applyAreaEffect(0, 0, 8, 8);
                                                                    }
                                                                    this.ageTicks = 50;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (decompiledFrameRemainder11) {
                                                            if (this.spellType != 165) {
                                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                                            }
                                                            if (Math.abs(var16) >= 128) {
                                                              this.ageTicks = this.ageTicks + 5;
                                                              if ((!(this.ageTicks < 300)) &&
                                                                (this.spellType == 165) &&
                                                                (this.spellType == 165)) {
                                                                this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -112, this.x - this.spriteRadius, this.sprite);
                                                                if ((var19 != 0) &&
                                                                  (this.ageTicks > 200)) {
                                                                  this.ageTicks = 300;
                                                                  if (165 == this.spellType) {
                                                                    this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, obfuscationGuard ^ -6132, -this.spriteRadius + this.x, this.sprite);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.ageTicks > 200) {
                                                                this.ageTicks = 300;
                                                                if (165 == this.spellType) {
                                                                  this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, obfuscationGuard ^ -6132, -this.spriteRadius + this.x, this.sprite);
                                                                }
                                                              }
                                                            }
                                                          }
                                                          boolean decompiledFrameRemainder10 = true;
                                                          if (var15 < -128) {
                                                            if (this.spellType == 143 ||
                                                              this.spellType == 135 ||
                                                              this.spellType == 152) {
                                                              if ((this.spellType != 143) &&
                                                                (decompiledFrameRemainder10 = (null != this.battle.projectileSamples)) &&
                                                                (decompiledFrameRemainder10 = (this.battle.projectileSamples[CacheEntry.field_n[7][1]] != null))) {
                                                                IconHighlightPainter.playSample(200 + (int)(Math.random() * 500.0), false, this.battle.projectileSamples[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 4);
                                                                decompiledFrameRemainder10 = (var19 != 0);
                                                              }
                                                              if ((decompiledFrameRemainder10) &&
                                                                (null != this.battle.projectileSamples) &&
                                                                (this.battle.projectileSamples[CacheEntry.field_n[7][0]] != null)) {
                                                                IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.battle.projectileSamples[CacheEntry.field_n[7][0]], SceneWidgetNode.field_r[CacheEntry.field_n[7][0]] / 8);
                                                                if (var19 != 0) {
                                                                  this.playTypeSound(1, (byte) 37, 3);
                                                                }
                                                              }
                                                            } else {
                                                              this.playTypeSound(1, (byte) 37, 3);
                                                            }
                                                          }
                                                          this.velocityX = (var15 * var12 + var16 * var13) / var14;
                                                          this.velocityY = (var15 * var13 - var16 * var12) / var14;
                                                          if ((135 == this.spellType ||
                                                            152 == this.spellType) && Math.abs(var16) < 128) {
                                                            this.velocityY = this.velocityY - 32;
                                                          }
                                                          this.subpixelY = var10;
                                                          this.subpixelX = var9;
                                                          this.y = this.subpixelY >> 4;
                                                          this.x = this.subpixelX >> 4;
                                                          var11++;
                                                          if (143 == this.spellType &&
                                                            100 < this.ageTicks) {
                                                            this.velocityY = -64;
                                                            this.velocityX = 0;
                                                            this.applyAreaEffect(0, 0, 32, 8);
                                                          }
                                                          if (var8 == 0 &&
                                                            5 > var11) {
                                                            continue scanLoop6;
                                                          }
                                                          this.notifyOwner((byte) -123);
                                                        } while (var19 != 0);
                                                        if ((decompiledFrameCompleted35) &&
                                                          (decompiledFrameCompleted34) &&
                                                          (decompiledFrameCompleted33) &&
                                                          (decompiledFrameCompleted32) &&
                                                          (decompiledFrameCompleted31) &&
                                                          (decompiledFrameCompleted30) &&
                                                          (decompiledFrameCompleted29) &&
                                                          (decompiledFrameCompleted28) &&
                                                          (decompiledFrameCompleted27) &&
                                                          (decompiledFrameCompleted26) &&
                                                          (decompiledFrameCompleted25) &&
                                                          (decompiledFrameCompleted24) &&
                                                          (decompiledFrameCompleted23) &&
                                                          (decompiledFrameCompleted22)) {
                                                          break regionExit7;
                                                        }
                                                      }
                                                      if ((decompiledFrameCompleted35) &&
                                                        (decompiledFrameCompleted34) &&
                                                        (decompiledFrameCompleted33) &&
                                                        (decompiledFrameCompleted32) &&
                                                        (decompiledFrameCompleted31) &&
                                                        (decompiledFrameCompleted30) &&
                                                        (decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22)) {
                                                        while (true) {
                                                          if (BitHelpers.field_b &&
                                                            16 == this.spellType) {
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.spellType == 20) {
                                                            decompiledFrameCompleted21 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            159 == this.spellType) {
                                                            decompiledFrameCompleted20 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            160 == this.spellType) {
                                                            decompiledFrameCompleted19 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b) {
                                                            if (135 == this.spellType) {
                                                              decompiledFrameCompleted18 = false;
                                                              break;
                                                            }
                                                            if (152 == this.spellType) {
                                                              decompiledFrameCompleted17 = false;
                                                              break;
                                                            }
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            76 == this.spellType) {
                                                            decompiledFrameCompleted16 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.spellType == 46) {
                                                            decompiledFrameCompleted15 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            31 == this.spellType) {
                                                            decompiledFrameCompleted14 = false;
                                                            break;
                                                          }
                                                          boolean decompiledFrameRemainder9 = true;
                                                          if (this.spellType == 20) {
                                                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.applyAreaEffect(5, 32, 3, obfuscationGuard ^ 6024);
                                                            decompiledFrameRemainder9 = (var19 != 0);
                                                          }
                                                          if (decompiledFrameRemainder9) {
                                                            if (this.spellType == 135 &&
                                                              this.ageTicks < 25) {
                                                              this.applyAreaEffect(0, 32, 3, obfuscationGuard ^ 6024);
                                                              decompiledFrameRemainder9 = (var19 != 0);
                                                              if (decompiledFrameRemainder9) {
                                                                decompiledFrameCompleted13 = false;
                                                                break;
                                                              }
                                                            }
                                                            if ((decompiledFrameRemainder9) &&
                                                              (this.spellType == 152)) {
                                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              if (0 > this.velocityY) {
                                                                decompiledFrameCompleted12 = false;
                                                                break;
                                                              }
                                                            }
                                                          }
                                                          var12 = -NodeHashTable.field_m + this.x;
                                                          var13 = this.y - GameSelectionHelpers.field_k;
                                                          var14 = ConnectionState.greatestCommonDivisor(var13 << 4, var12 << 4, false);
                                                          if (var14 < 1) {
                                                            var14 = 16;
                                                            var13 = -1;
                                                            var12 = 0;
                                                          }
                                                          var15 = ((this.velocityY << 8) * var13 + (this.velocityX << 8) * var12) / var14;
                                                          var16 = ((this.velocityX << 8) * var13 - var12 * (this.velocityY << 8)) / var14;
                                                          if (var15 < 0) {
                                                            var16 = -var16;
                                                            var13 = -var13;
                                                            var12 = -var12;
                                                            var15 = -var15;
                                                          }
                                                          boolean decompiledFrameRemainder8 = true;
                                                          var15 = -(var15 >> 1);
                                                          if (20 != this.spellType &&
                                                            this.spellType != 159 &&
                                                            this.spellType != 160 &&
                                                            165 != this.spellType) {
                                                            if (this.spellType == 135 ||
                                                              this.spellType == 152) {
                                                              if ((Math.abs(var16) < 128) &&
                                                                (decompiledFrameRemainder8 = !(this.ageTicks <= 200))) {
                                                                this.ageTicks = 300;
                                                                decompiledFrameRemainder8 = (var19 != 0);
                                                              }
                                                              if (decompiledFrameRemainder8) {
                                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 132, this.y, this.battle);
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                this.ageTicks = this.ageTicks + 5;
                                                                decompiledFrameRemainder8 = (var19 != 0);
                                                              }
                                                            }
                                                            if (decompiledFrameRemainder8) {
                                                              if (this.spellType == 46) {
                                                                var15 = var15 >> 1;
                                                                var16 = var16 >> 1;
                                                                if ((256 > Math.abs(var16)) &&
                                                                  (decompiledFrameRemainder8 = !(this.ageTicks <= 50))) {
                                                                  this.ageTicks = 300;
                                                                  decompiledFrameRemainder8 = (var19 != 0);
                                                                }
                                                                if (decompiledFrameRemainder8) {
                                                                  this.ageTicks = 50;
                                                                  decompiledFrameRemainder8 = (var19 != 0);
                                                                }
                                                              }
                                                              if (decompiledFrameRemainder8) {
                                                                if (16 != this.spellType &&
                                                                  76 != this.spellType) {
                                                                  if (this.spellType == 26) {
                                                                    decompiledFrameCompleted11 = false;
                                                                    break;
                                                                  }
                                                                  if ((this.spellType != 31) &&
                                                                    (decompiledFrameRemainder8 = (this.spellType == 34))) {
                                                                    var12 = 0;
                                                                    var13 = 0;
                                                                    this.ageTicks = 1;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder8) {
                                                                    this.field_x = 0;
                                                                    this.playTypeSound(1, (byte) 37, 2);
                                                                    this.ageTicks = this.ageTicks + 50;
                                                                    var17 = this.x;
                                                                    this.x = NodeHashTable.field_m;
                                                                    var18 = this.y;
                                                                    this.y = GameSelectionHelpers.field_k;
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 99, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(10, 64, 64, 8);
                                                                    this.y = var18;
                                                                    this.x = var17;
                                                                    if (this.ageTicks > 1000) {
                                                                      decompiledFrameCompleted10 = false;
                                                                      break;
                                                                    }
                                                                    if (-1000 > var16) {
                                                                      var16 = -1000;
                                                                    }
                                                                    var15 -= 256;
                                                                    if (var16 > 1000) {
                                                                      var16 = 1000;
                                                                    }
                                                                    var11 = 5;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                    if (decompiledFrameRemainder8) {
                                                                      decompiledFrameCompleted9 = false;
                                                                      break;
                                                                    }
                                                                  }
                                                                }
                                                                if (decompiledFrameRemainder8) {
                                                                  var16 = var16 >> 1;
                                                                  var15 = var15 >> 1;
                                                                  if ((Math.abs(var16) < 128) &&
                                                                    (decompiledFrameRemainder8 = !(50 >= this.ageTicks))) {
                                                                    this.ageTicks = 300;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder8) {
                                                                    if (this.ageTicks < 50 &&
                                                                      16 == this.spellType) {
                                                                      this.playTypeSound(2, (byte) 37, 0);
                                                                      this.applyAreaEffect(0, 0, 8, 8);
                                                                    }
                                                                    this.ageTicks = 50;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (decompiledFrameRemainder8) {
                                                            if (this.spellType != 165) {
                                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                                            }
                                                            if (Math.abs(var16) >= 128) {
                                                              this.ageTicks = this.ageTicks + 5;
                                                              if ((!(this.ageTicks < 300)) &&
                                                                (this.spellType == 165) &&
                                                                (this.spellType == 165)) {
                                                                this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -112, this.x - this.spriteRadius, this.sprite);
                                                                if ((var19 != 0) &&
                                                                  (this.ageTicks > 200)) {
                                                                  this.ageTicks = 300;
                                                                  if (165 == this.spellType) {
                                                                    this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, obfuscationGuard ^ -6132, -this.spriteRadius + this.x, this.sprite);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.ageTicks > 200) {
                                                                this.ageTicks = 300;
                                                                if (165 == this.spellType) {
                                                                  this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, obfuscationGuard ^ -6132, -this.spriteRadius + this.x, this.sprite);
                                                                }
                                                              }
                                                            }
                                                          }
                                                          boolean decompiledFrameRemainder7 = true;
                                                          if (var15 < -128) {
                                                            if (this.spellType == 143 ||
                                                              this.spellType == 135 ||
                                                              this.spellType == 152) {
                                                              if ((this.spellType != 143) &&
                                                                (decompiledFrameRemainder7 = (null != this.battle.projectileSamples)) &&
                                                                (decompiledFrameRemainder7 = (this.battle.projectileSamples[CacheEntry.field_n[7][1]] != null))) {
                                                                IconHighlightPainter.playSample(200 + (int)(Math.random() * 500.0), false, this.battle.projectileSamples[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 4);
                                                                decompiledFrameRemainder7 = (var19 != 0);
                                                              }
                                                              if ((decompiledFrameRemainder7) &&
                                                                (null != this.battle.projectileSamples) &&
                                                                (this.battle.projectileSamples[CacheEntry.field_n[7][0]] != null)) {
                                                                IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.battle.projectileSamples[CacheEntry.field_n[7][0]], SceneWidgetNode.field_r[CacheEntry.field_n[7][0]] / 8);
                                                                if (var19 != 0) {
                                                                  this.playTypeSound(1, (byte) 37, 3);
                                                                }
                                                              }
                                                            } else {
                                                              this.playTypeSound(1, (byte) 37, 3);
                                                            }
                                                          }
                                                          this.velocityX = (var15 * var12 + var16 * var13) / var14;
                                                          this.velocityY = (var15 * var13 - var16 * var12) / var14;
                                                          if ((135 == this.spellType ||
                                                            152 == this.spellType) && Math.abs(var16) < 128) {
                                                            this.velocityY = this.velocityY - 32;
                                                          }
                                                          this.subpixelY = var10;
                                                          this.subpixelX = var9;
                                                          this.y = this.subpixelY >> 4;
                                                          this.x = this.subpixelX >> 4;
                                                          var11++;
                                                          if (143 == this.spellType &&
                                                            100 < this.ageTicks) {
                                                            this.velocityY = -64;
                                                            this.velocityX = 0;
                                                            this.applyAreaEffect(0, 0, 32, 8);
                                                          }
                                                          if (var8 == 0 &&
                                                            5 > var11) {
                                                            continue scanLoop6;
                                                          }
                                                          this.notifyOwner((byte) -123);
                                                          if (var19 == 0) {
                                                            decompiledFrameCompleted8 = false;
                                                            break;
                                                          }
                                                          var12_ref_ll = ScreenSwitchHelpers.field_f[17];
                                                          if ((this.battle.arenaHeight / 4) > this.y) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[18];
                                                          }
                                                          if (this.y < this.battle.arenaHeight / 5) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[19];
                                                          }
                                                          this.sprite = var12_ref_ll.toRgbSprite();
                                                        }
                                                      }
                                                      if ((decompiledFrameCompleted34) &&
                                                        (decompiledFrameCompleted33) &&
                                                        (decompiledFrameCompleted32) &&
                                                        (decompiledFrameCompleted31) &&
                                                        (decompiledFrameCompleted30) &&
                                                        (decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted21) &&
                                                        (decompiledFrameCompleted20) &&
                                                        (decompiledFrameCompleted19) &&
                                                        (decompiledFrameCompleted18) &&
                                                        (decompiledFrameCompleted17) &&
                                                        (decompiledFrameCompleted16) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        this.playTypeSound(2, (byte) 37, 0);
                                                        this.applyAreaEffect(5, 20, 32, 8);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted33) &&
                                                        (decompiledFrameCompleted32) &&
                                                        (decompiledFrameCompleted31) &&
                                                        (decompiledFrameCompleted30) &&
                                                        (decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted20) &&
                                                        (decompiledFrameCompleted19) &&
                                                        (decompiledFrameCompleted18) &&
                                                        (decompiledFrameCompleted17) &&
                                                        (decompiledFrameCompleted16) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(5, 20, 32, 8);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted32) &&
                                                        (decompiledFrameCompleted31) &&
                                                        (decompiledFrameCompleted30) &&
                                                        (decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted19) &&
                                                        (decompiledFrameCompleted18) &&
                                                        (decompiledFrameCompleted17) &&
                                                        (decompiledFrameCompleted16) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        this.applyAreaEffect(10, 32, 32, obfuscationGuard - 6008);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted31) &&
                                                        (decompiledFrameCompleted30) &&
                                                        (decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted18) &&
                                                        (decompiledFrameCompleted17) &&
                                                        (decompiledFrameCompleted16) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        this.applyAreaEffect(50, 128, 128, 8);
                                                        this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, -120, this.x - this.spriteRadius, this.sprite);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted29) &&
                                                        (decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted16) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        this.playTypeSound(1, (byte) 37, 7);
                                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 132, this.y, this.battle);
                                                        this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(3, 20, 32, obfuscationGuard ^ 6024);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted27) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted14) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        this.playTypeSound(2, (byte) 37, 3);
                                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 95, this.y, this.battle);
                                                        this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(5, 20, 32, 8);
                                                        break regionExit8;
                                                      }
                                                      if ((decompiledFrameCompleted28) &&
                                                        (decompiledFrameCompleted26) &&
                                                        (decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted15) &&
                                                        (decompiledFrameCompleted13) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        if (this.field_x > 0) {
                                                          this.field_x = this.field_x - 1;
                                                          this.notifyOwner((byte) -123);
                                                          return;
                                                        }
                                                        this.field_x = 5;
                                                        this.ageTicks = this.ageTicks + 50;
                                                        var12 = this.x;
                                                        this.x = NodeHashTable.field_m;
                                                        var13 = this.y;
                                                        this.y = GameSelectionHelpers.field_k;
                                                        this.playTypeSound(1, (byte) 37, 2);
                                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 99, this.y, this.battle);
                                                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(10, 64, 64, 8);
                                                        this.y = var13;
                                                        this.x = var12;
                                                        if (1000 < this.ageTicks) {
                                                          this.remove(0);
                                                        }
                                                        this.notifyOwner((byte) 118);
                                                        return;
                                                      }
                                                      if ((decompiledFrameCompleted25) &&
                                                        (decompiledFrameCompleted24) &&
                                                        (decompiledFrameCompleted23) &&
                                                        (decompiledFrameCompleted22) &&
                                                        (decompiledFrameCompleted12) &&
                                                        (decompiledFrameCompleted11) &&
                                                        (decompiledFrameCompleted10) &&
                                                        (decompiledFrameCompleted9) &&
                                                        (decompiledFrameCompleted8)) {
                                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 95, this.y, this.battle);
                                                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(2, 10, 8, 8);
                                                      }
                                                    }
                                                    if ((decompiledFrameCompleted25) &&
                                                      (decompiledFrameCompleted24) &&
                                                      (decompiledFrameCompleted22) &&
                                                      (decompiledFrameCompleted12) &&
                                                      (decompiledFrameCompleted11) &&
                                                      (decompiledFrameCompleted9) &&
                                                      (decompiledFrameCompleted8)) {
                                                      this.remove(0);
                                                      return;
                                                    }
                                                    if ((decompiledFrameCompleted25) &&
                                                      (decompiledFrameCompleted12) &&
                                                      (decompiledFrameCompleted8)) {
                                                      this.ageTicks = this.ageTicks + 50;
                                                      var17 = this.x;
                                                      var18 = this.y;
                                                      this.x = NodeHashTable.field_m;
                                                      this.y = GameSelectionHelpers.field_k;
                                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                                                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                      this.playTypeSound(1, (byte) 37, 1);
                                                      if (!BitHelpers.field_b) {
                                                        this.applyAreaEffect(50, 64, 96, 8);
                                                        if (var19 != 0) {
                                                          var10 -= 256;
                                                          this.applyAreaEffect(25, 64, 96, 8);
                                                          if (0 == (this.x & 1)) {
                                                            this.velocityX = this.velocityX - 64;
                                                            this.velocityX = this.velocityX + 64;
                                                          } else {
                                                            this.velocityX = this.velocityX + 64;
                                                          }
                                                          this.velocityY = this.velocityY - 64;
                                                        }
                                                      } else {
                                                        var10 -= 256;
                                                        this.applyAreaEffect(25, 64, 96, 8);
                                                        if (0 == (this.x & 1)) {
                                                          this.velocityX = this.velocityX - 64;
                                                          if (var19 != 0) {
                                                            this.velocityX = this.velocityX + 64;
                                                          }
                                                        } else {
                                                          this.velocityX = this.velocityX + 64;
                                                        }
                                                        this.velocityY = this.velocityY - 64;
                                                      }
                                                      this.x = var17;
                                                      this.y = var18;
                                                      if (this.ageTicks > 200) {
                                                        this.remove(0);
                                                        return;
                                                      }
                                                      var12 = -(this.velocityX >> 1);
                                                      var14 = 1;
                                                      var13 = -(this.velocityY >> 1);
                                                      var15 = 1;
                                                      var16 = 0;
                                                      this.subpixelY = var10;
                                                      this.subpixelX = var9;
                                                      if (!BitHelpers.field_b) {
                                                        this.velocityY = (var13 * var15 - var12 * var16) / var14;
                                                        this.velocityX = (var16 * var13 + var15 * var12) / var14;
                                                      }
                                                      this.x = this.subpixelX >> 4;
                                                      this.y = this.subpixelY >> 4;
                                                      this.notifyOwner((byte) 104);
                                                      return;
                                                    }
                                                  }
                                                  if ((decompiledFrameCompleted25) &&
                                                    (decompiledFrameCompleted12)) {
                                                    if (null != this.owner &&
                                                      var7 != 0) {
                                                      this.battle.stampUnitMask(-46, this.owner);
                                                    }
                                                    if (5 == var11) {
                                                      this.velocityY = this.velocityY >> 1;
                                                      this.velocityX = this.velocityX >> 1;
                                                    }
                                                    if (var19 == 0) {
                                                      break regionExit4;
                                                    }
                                                    break regionExit5;
                                                  }
                                                  break;
                                                }
                                                this.applyAreaEffect(3, 32, 64, 8);
                                                this.playSound(160, true);
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                            if (this.spellType != 116) {
                                              boolean decompiledFrameRemainder15 = true;
                                              this.velocityX = 0;
                                              this.velocityY = 0;
                                              if (this.spellType != 34 ||
                                                null == this.owner) {
                                                if (this.spellType == 46) {
                                                  this.checkHeightEffects(87);
                                                  this.remove(obfuscationGuard ^ 6016);
                                                  return;
                                                }
                                                if (this.spellType == 76) {
                                                  if (7 <= this.y) {
                                                    this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, obfuscationGuard ^ -6020, -this.spriteRadius + this.x, this.sprite);
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (20 == this.spellType) {
                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (159 == this.spellType) {
                                                  this.applyAreaEffect(10, 32, 32, 8);
                                                  this.remove(obfuscationGuard ^ 6016);
                                                  return;
                                                }
                                                if (160 == this.spellType) {
                                                  this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -82, this.x - this.spriteRadius, this.sprite);
                                                  this.remove(obfuscationGuard ^ 6016);
                                                  return;
                                                }
                                                if (this.spellType != 135 &&
                                                  152 != this.spellType) {
                                                  if (!this.battle.spriteOverlapsTerrain(1 + this.y - this.spriteRadius, 2, -this.spriteRadius + this.x, this.sprite)) {
                                                    this.ageTicks = 0;
                                                    if (var19 == 0) {
                                                      break regionExit4;
                                                    }
                                                    decompiledFrameRemainder15 = false;
                                                  }
                                                  else {
                                                    if (BitHelpers.field_b) {
                                                      if (this.spellType != 16) {
                                                        break regionExit4;
                                                      }
                                                      this.playTypeSound(2, (byte) 37, 0);
                                                      this.applyAreaEffect(5, 20, 32, 8);
                                                      this.remove(0);
                                                      return;
                                                    }
                                                    if (16 != this.spellType) {
                                                      break regionExit4;
                                                    }
                                                    if ((-32 + this.battle.arenaHeight) >= this.y &&
                                                      !this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius + 1, 2, -this.spriteRadius + this.x, ScreenSwitchHelpers.field_f[0].toRgbSprite())) {
                                                      break regionExit4;
                                                    }
                                                    this.remove(0);
                                                    return;
                                                  }
                                                }
                                                if (decompiledFrameRemainder15) {
                                                  this.playTypeSound(1, (byte) 37, 7);
                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.applyAreaEffect(3, 16, 16, obfuscationGuard ^ 6024);
                                                  this.remove(0);
                                                  return;
                                                }
                                              }
                                              var7 = this.x;
                                              var8 = Math.abs(this.x - this.owner.x);
                                              if (var8 < 50) {
                                                var8 = 50;
                                              }
                                              var9 = 225;
                                              if (this.battle.playerSpellbook[this.owner.ownerPlayer] == 2) {
                                                var9 = var9 + this.battle.field_X[this.owner.ownerPlayer];
                                              }
                                              if (var9 > var8) {
                                                var9 = var8;
                                              }
                                              if (this.ageTicks == 50) {
                                                var7 -= 128;
                                              }
                                              if (100 == this.ageTicks) {
                                                var7 += 128;
                                              }
                                              if (175 == this.ageTicks) {
                                                var7 -= 64;
                                              }
                                              if (this.ageTicks == 200) {
                                                var7 += 64;
                                              }
                                              if (this.ageTicks == 225) {
                                                var7++;
                                              }
                                              if (250 == this.ageTicks) {
                                                var7 -= 32;
                                              }
                                              if (275 == this.ageTicks) {
                                                var7 += 32;
                                              }
                                              if (300 == this.ageTicks) {
                                                var7++;
                                              }
                                              if (310 == this.ageTicks) {
                                                var7 -= 16;
                                              }
                                              if (325 == this.ageTicks) {
                                                var7 += 16;
                                              }
                                              if (~this.x != ~var7 &&
                                                this.ageTicks <= var8) {
                                                this.playSound(100, true);
                                                var5 = this.spawnFromHere(var7, (BattleUnit) null, (byte) 81, 84, -480, this.battle);
                                                ((SpellProjectile) (var5)).velocityX = (-var7 + this.x) / 3;
                                                ((SpellProjectile) (var5)).ageTicks = 45;
                                                ((SpellProjectile) (var5)).velocityY = (480 + this.y) / 3;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (var9 < this.ageTicks) {
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                          }
                                          boolean decompiledFrameRemainder17 = true;
                                          if ((250 >= this.ageTicks ||
                                            this.spellType == 34) &&
                                            (decompiledFrameRemainder17 = (this.spellType != 26)) &&
                                            (decompiledFrameRemainder17 = (this.spellType != 31)) &&
                                            (decompiledFrameRemainder17 = (this.spellType != 34 ||
                                            !(this.ageTicks <= 0)))) {
                                            this.ageTicks = this.ageTicks + 1;
                                            decompiledFrameRemainder17 = (var19 != 0);
                                          }
                                          if (decompiledFrameRemainder17) {
                                            if (this.spellType == 116) {
                                              if (this.ageTicks == 251) {
                                                this.playTypeSound(1, (byte) 37, 6);
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 128, this.y, this.battle);
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                this.applyAreaEffect(40, 128, 32, obfuscationGuard ^ 6024);
                                              }
                                              this.ageTicks = this.ageTicks + 1;
                                              var7 = 1;
                                              if (null != this.owner) {
                                                this.battle.eraseUnitMask(this.owner, obfuscationGuard ^ 6016);
                                                if (this.battle.playerSpellbook[this.owner.ownerPlayer] == 6) {
                                                  var7 = var7 + this.battle.field_X[this.owner.ownerPlayer] / 20;
                                                }
                                              }
                                              boolean decompiledFrameCompleted7 = true;
                                              if ((-250 + this.ageTicks) % 5 == 0) {
                                                var8 = (this.ageTicks - 250 - 5) / 5;
                                                var9 = var8 * 8192 / 15;
                                                var10 = 0;
                                                while (var7 > var10) {
                                                  var11 = GradientBarPainter.sine(-43, var9) * (3 + var10) >> 12;
                                                  var12 = (3 + var10) * BevelBoxPainter.cosine(var9, obfuscationGuard - 6137) >> 12;
                                                  BitHelpers.field_b = false;
                                                  stackOut_2218_0 = this.battle.isSolidAt(this.y + var12, this.x + var11, (byte) -83);
                                                  stackIn_2234_0 = stackOut_2218_0 ? 1 : 0;
                                                  stackIn_2219_0 = stackOut_2218_0;
                                                  if (var19 != 0) {
                                                    decompiledFrameCompleted7 = false;
                                                    break;
                                                  }
                                                  if (stackIn_2219_0 &&
                                                    !BitHelpers.field_b) {
                                                    this.playTypeSound(1, (byte) 37, 6);
                                                    var5 = this.spawnFromHere(var11 + this.x, this.owner, (byte) 81, 117, var12 + this.y, this.battle);
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    var5 = this.spawnFromHere(this.x + var11, (BattleUnit) null, (byte) 81, 128, this.y + var12, this.battle);
                                                    this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                                                  }
                                                  var10++;
                                                }
                                              }
                                              if (decompiledFrameCompleted7) {
                                                if (this.owner != null) {
                                                  this.battle.stampUnitMask(-68, this.owner);
                                                }
                                                this.velocityY = 0;
                                                this.velocityX = 0;
                                                stackIn_2234_0 = -326;
                                              }
                                              if (stackIn_2234_0 > ~this.ageTicks) {
                                                this.remove(0);
                                              }
                                              return;
                                            }
                                            if (this.spellType == 33) {
                                              var7 = 0;
                                              while (var7 < 10) {
                                                var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 112, this.y, this.battle);
                                                ((SpellProjectile) (var5)).velocityX = (int)(96.0 * Math.sin(3.14 * (double)var7 / 5.0)) << 4;
                                                ((SpellProjectile) (var5)).velocityY = (int)(-32.0 + 96.0 * Math.cos((double)var7 * 3.14 / 5.0)) << 4;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var7++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.playTypeSound(1, (byte) 37, 2);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 99, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(80, 256, 64, 8);
                                              this.remove(obfuscationGuard ^ 6016);
                                              return;
                                            }
                                            if (this.spellType == 122) {
                                              this.playTypeSound(1, (byte) 37, 1);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 154, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(30, 128, 64, 8);
                                              this.ageTicks = this.ageTicks + 1;
                                              this.drawOrbitEffect(88);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.spellType == 53) {
                                              this.playTypeSound(1, (byte) 37, 4);
                                              this.playSound(132, true);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 104, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 55, this.y, this.battle);
                                              ((SpellProjectile) (var5)).field_H = 1;
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(40, 64, 48, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (12 == this.spellType) {
                                              this.playTypeSound(1, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 86, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(50, 128, 80, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.spellType == 143) {
                                              if (null != this.battle.projectileSamples &&
                                                null != this.battle.projectileSamples[CacheEntry.field_n[7][2]]) {
                                                IconHighlightPainter.playSample((int)(Math.random() * 50.0) + 100, false, this.battle.projectileSamples[CacheEntry.field_n[7][2]], SceneWidgetNode.field_r[CacheEntry.field_n[7][2]] / 2);
                                              }
                                              var5 = this.spawnFromHere(-32 + this.x, (BattleUnit) null, (byte) 81, 131, this.y, this.battle);
                                              this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(32 + this.x, (BattleUnit) null, (byte) 81, 131, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 131, -32 + this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 131, this.y + 32, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(50, 128, 128, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.spellType == 147) {
                                              this.playTypeSound(0, (byte) 37, 9);
                                              this.applyAreaEffect(10, 256, 128, 8);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 101, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 74, this.y, this.battle);
                                              ((SpellProjectile) (var5)).velocityX = 0;
                                              ((SpellProjectile) (var5)).velocityY = -256;
                                              ((SpellProjectile) (var5)).ageTicks = 5;
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.spellType == 13) {
                                              this.playTypeSound(0, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 86, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                              var8 = 0;
                                              while (var8 < 5) {
                                                var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 14, this.y, this.battle);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, -2147483648, 8192);
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(127, var9) >> 9;
                                                ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var9, -115) * 3 >> 11) - 64;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.applyAreaEffect(25, 128, 64, obfuscationGuard ^ 6024);
                                              this.remove(0);
                                              return;
                                            }
                                            if (41 == this.spellType) {
                                              this.playTypeSound(0, (byte) 37, 3);
                                              var7_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                              var8 = 0;
                                              do {
                                                if (var8 >= 5) {
                                                  var8 = 0;
                                                  break;
                                                }
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 42, this.y, this.battle);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, -2147483648, 8192);
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-95, var9) >> 9;
                                                ((SpellProjectile) (var5)).velocityY = (3 * BevelBoxPainter.cosine(var9, -111) >> 11) - 64;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                              } while (var19 == 0);
                                              while (var8 < 4) {
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 76, this.y, this.battle);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, obfuscationGuard ^ -2147477632, 8192);
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-71, var9) >> 11;
                                                ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var9, obfuscationGuard - 6130) >> 11;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(5, 128, 64, 8);
                                              this.remove(obfuscationGuard ^ 6016);
                                              return;
                                            }
                                            if (this.spellType == 67) {
                                              this.playTypeSound(1, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 86, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7 = 0;
                                              while (var7 < 15) {
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 16, this.y, this.battle);
                                                var8 = 8192 * var7 / 15;
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(118, var8) >> 9;
                                                ((SpellProjectile) (var5)).velocityY = (3 * BevelBoxPainter.cosine(var8, obfuscationGuard ^ -6117) >> 11) - 64;
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                                var7++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.applyAreaEffect(25, 128, 64, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.spellType == 146) {
                                              this.playTypeSound(0, (byte) 37, 7);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 131, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7 = 0;
                                              while (var7 < 15) {
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 145, this.y, this.battle);
                                                var8 = 8192 * var7 / 15;
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-78, var8) >> 9;
                                                ((SpellProjectile) (var5)).velocityY = -64 + (3 * BevelBoxPainter.cosine(var8, -116) >> 11);
                                                ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).subpixelY + 4 * ((SpellProjectile) (var5)).velocityY;
                                                ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).subpixelX + 4 * ((SpellProjectile) (var5)).velocityX;
                                                ((SpellProjectile) (var5)).y = ((SpellProjectile) (var5)).subpixelY >> 4;
                                                ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).subpixelX >> 4;
                                                this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                                var7++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.applyAreaEffect(25, 128, 128, 8);
                                              this.remove(0);
                                              return;
                                            }
                                          }
                                          if (this.x < -640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.x > this.battle.arenaWidth + 640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.y <= this.battle.arenaHeight) {
                                            return;
                                          }
                                          this.remove(0);
                                          return;
                                        }
                                      }
                                      if (this.battle.isSolidAt(this.y, this.x, (byte) -83)) {
                                        return;
                                      }
                                      this.playTypeSound(1, (byte) 37, 6);
                                      this.applyAreaEffect(25, 32, 64, 8);
                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 128, this.y, this.battle);
                                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                      this.remove(0);
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if ((this.spellType == 91 ||
                      this.spellType == 92) &&
                      this.ageTicks < 20) {
                      this.ageTicks = this.ageTicks + 1;
                      return;
                    }
                    if (this.spellType == 49 ||
                      10 == this.spellType ||
                      43 == this.spellType) {
                      this.updateFlightSound(3, (byte) 34);
                    }
                    if (this.spellType == 0) {
                      this.updateFlightSound(9, (byte) 34);
                    }
                    if (this.spellType == 52 ||
                      this.spellType == 50 ||
                      this.spellType == 54) {
                      this.updateFlightSound(4, (byte) 34);
                    }
                    if (this.spellType == 23 ||
                      24 == this.spellType ||
                      this.spellType == 82 ||
                      this.spellType == 21) {
                      this.updateFlightSound(1, (byte) 34);
                      if (this.spellType == 23) {
                        var5 = this.spawnFromHere(this.x + (int)(-8.0 + Math.random() * 17.0), (BattleUnit) null, (byte) 81, 90, this.y + (int)(-8.0 + Math.random() * 17.0), this.battle);
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      }
                      if (this.spellType == 82) {
                        this.field_x = this.field_x + 1;
                        if (this.field_x > 4) {
                          this.field_x = this.field_x - 4;
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 90, this.y, this.battle);
                          this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                        }
                      }
                    }
                    boolean decompiledFrameRemainder16 = true;
                    if (this.spellType != 10 &&
                      this.spellType != 91) {
                      if (this.spellType != 17 &&
                        this.spellType != 91) {
                        if (14 == this.spellType) {
                          this.updateFlightSound(0, (byte) 34);
                          this.field_x = this.field_x + 1;
                          decompiledFrameRemainder16 = !(this.field_x <= 4);
                          if (decompiledFrameRemainder16) {
                            this.field_x = this.field_x - 4;
                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                            decompiledFrameRemainder16 = (var19 != 0);
                          }
                        }
                        if (decompiledFrameRemainder16) {
                          if (this.spellType != 11) {
                            if (this.spellType != 164) {
                              if (this.spellType != 158) {
                                if (this.spellType != 44 &&
                                  this.spellType != 42 &&
                                  96 != this.spellType &&
                                  92 != this.spellType) {
                                  if (this.spellType != 18) {
                                    if (115 == this.spellType) {
                                      this.updateFlightSound(6, (byte) 34);
                                      this.field_x = this.field_x + 1;
                                      decompiledFrameRemainder16 = !(4 >= this.field_x);
                                      if (decompiledFrameRemainder16) {
                                        this.field_x = this.field_x - 4;
                                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 129, this.y, this.battle);
                                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                        decompiledFrameRemainder16 = (var19 != 0);
                                      }
                                    }
                                    if (decompiledFrameRemainder16) {
                                      if (this.spellType == 120 ||
                                        this.spellType == 124) {
                                        this.updateFlightSound(6, (byte) 34);
                                        decompiledFrameRemainder16 = (var19 != 0);
                                      }
                                      if (decompiledFrameRemainder16) {
                                        if ((this.spellType != 140) &&
                                          (decompiledFrameRemainder16 = (this.spellType == 145))) {
                                          this.updateFlightSound(7, (byte) 34);
                                          decompiledFrameRemainder16 = (var19 != 0);
                                        }
                                        if (decompiledFrameRemainder16) {
                                          this.updateFlightSound(7, (byte) 34);
                                          this.field_x = this.field_x + 1;
                                          decompiledFrameRemainder16 = !(this.field_x <= 2);
                                          if (decompiledFrameRemainder16) {
                                            this.field_x = this.field_x - 2;
                                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 130, this.y, this.battle);
                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                            var5 = this.spawnFromHere(-16 + (this.x + (int)(32.0 * Math.random())), (BattleUnit) null, (byte) 81, 130, -16 + this.y + (int)(32.0 * Math.random()), this.battle);
                                            this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                            decompiledFrameRemainder16 = (var19 != 0);
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (decompiledFrameRemainder16) {
                                    this.updateFlightSound(0, (byte) 34);
                                    this.field_x = this.field_x + 1;
                                    decompiledFrameRemainder16 = !(this.field_x <= 2);
                                    if (decompiledFrameRemainder16) {
                                      this.field_x = this.field_x - 2;
                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                                      this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                                      ((SpellProjectile) (var5)).velocityY = -this.velocityY;
                                      ((SpellProjectile) (var5)).velocityX = -this.velocityX;
                                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                      decompiledFrameRemainder16 = (var19 != 0);
                                    }
                                  }
                                }
                                if (decompiledFrameRemainder16) {
                                  this.updateFlightSound(3, (byte) 34);
                                  this.field_x = this.field_x + 1;
                                  decompiledFrameRemainder16 = !(this.field_x <= 2);
                                  if (decompiledFrameRemainder16) {
                                    this.field_x = this.field_x - 2;
                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 95, this.y, this.battle);
                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                    decompiledFrameRemainder16 = (var19 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder16) {
                                this.updateFlightSound(8, (byte) 34);
                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 166, this.y, this.battle);
                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 166, this.y, this.battle);
                                ((SpellProjectile) (var5)).velocityX = (int)(21.0 * Math.random()) - 10;
                                ((SpellProjectile) (var5)).velocityY = (int)(21.0 * Math.random()) - 10;
                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 166, this.y, this.battle);
                                ((SpellProjectile) (var5)).velocityX = (int)(Math.random() * 21.0) - 10;
                                ((SpellProjectile) (var5)).velocityY = (int)(21.0 * Math.random()) - 10;
                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                decompiledFrameRemainder16 = (var19 != 0);
                              }
                            }
                            if (decompiledFrameRemainder16) {
                              this.updateFlightSound(8, (byte) 34);
                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 166, this.y, this.battle);
                              this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                              decompiledFrameRemainder16 = (var19 != 0);
                            }
                          }
                          if (decompiledFrameRemainder16) {
                            this.updateFlightSound(0, (byte) 34);
                            this.field_x = this.field_x + 1;
                            decompiledFrameRemainder16 = !(2 >= this.field_x);
                            if (decompiledFrameRemainder16) {
                              this.field_x = this.field_x - 2;
                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                              this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                              ((SpellProjectile) (var5)).velocityY = -this.velocityY;
                              ((SpellProjectile) (var5)).velocityX = -this.velocityX;
                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                              decompiledFrameRemainder16 = (var19 != 0);
                            }
                          }
                        }
                      }
                      if (decompiledFrameRemainder16) {
                        this.updateFlightSound(0, (byte) 34);
                        this.field_x = this.field_x + 1;
                        if (!(this.field_x <= 2)) {
                          this.field_x = this.field_x - 2;
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 88, this.y, this.battle);
                          ((SpellProjectile) (var5)).velocityX = -this.velocityX;
                          ((SpellProjectile) (var5)).velocityY = -this.velocityY;
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                          if (var19 != 0) {
                            this.updateFlightSound(0, (byte) 34);
                            this.field_x = this.field_x + 1;
                            if (4 < this.field_x) {
                              this.field_x = this.field_x - 4;
                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                            }
                          }
                        }
                      }
                    } else {
                      this.updateFlightSound(0, (byte) 34);
                      this.field_x = this.field_x + 1;
                      if (4 < this.field_x) {
                        this.field_x = this.field_x - 4;
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      }
                    }
                    boolean decompiledFrameRemainder6 = true;
                    if (this.spellType == 50) {
                      if (this.ageTicks < 250) {
                        this.ageTicks = this.ageTicks + 1;
                      }
                      if (this.ageTicks < 250 &&
                        25 < this.ageTicks) {
                        var6 = -this.x + targetX;
                        var7 = -100 - this.y;
                        if (this.ageTicks > 150) {
                          var7 = targetY - this.y;
                        }
                        var8 = LoginMessageTable.computeAngle(var6, var7, (byte) -110);
                        var9 = LoginMessageTable.computeAngle(this.velocityX, this.velocityY, (byte) -89);
                        var10 = -4096 + (8191 & -var9 + var8 + 4096);
                        var11 = ConnectionState.greatestCommonDivisor(this.velocityY, this.velocityX, false);
                        if (var10 < -1024 ||
                          var10 > 1024) {
                          if (var11 < 100) {
                            var11 += 5;
                          }
                          if (!(var11 <= 100)) {
                            var11 -= 5;
                            if ((var19 != 0) &&
                              (var11 < 150)) {
                              var11 += 5;
                            }
                          }
                        } else {
                          if (var11 < 150) {
                            var11 += 5;
                          }
                        }
                        if (48 < var10) {
                          var10 = 48;
                        }
                        if (var10 < -48) {
                          var10 = -48;
                        }
                        var9 = var9 + var10;
                        this.velocityX = var11 * BevelBoxPainter.cosine(var9, -109) >> 16;
                        this.velocityY = GradientBarPainter.sine(125, var9) * var11 >> 16;
                        if (var19 != 0) {
                          this.velocityY = this.velocityY + 4;
                        }
                      } else {
                        this.velocityY = this.velocityY + 4;
                      }
                      this.subpixelX = this.subpixelX + this.velocityX;
                      this.subpixelY = this.subpixelY + this.velocityY;
                      this.x = this.subpixelX >> 4;
                      this.y = this.subpixelY >> 4;
                      decompiledFrameRemainder6 = (var19 != 0);
                    }
                    if (decompiledFrameRemainder6) {
                      if (18 != this.spellType &&
                        11 != this.spellType &&
                        this.spellType != 44 &&
                        this.spellType != 96 &&
                        0 != this.spellType &&
                        this.spellType != 158) {
                        this.subpixelX = this.subpixelX + this.velocityX;
                        this.subpixelY = this.subpixelY + this.velocityY;
                        this.y = this.subpixelY >> 4;
                        this.velocityY = this.velocityY + 4;
                        this.x = this.subpixelX >> 4;
                        decompiledFrameRemainder6 = (var19 != 0);
                      }
                      if (decompiledFrameRemainder6) {
                        if (250 > this.ageTicks) {
                          this.ageTicks = this.ageTicks + 1;
                          if (250 == this.ageTicks &&
                            this.battle.field_Y > 0) {
                            this.battle.field_Y = -this.battle.field_Y;
                            if (this.battle.field_Y == 0) {
                              this.battle.field_Y = -2;
                            }
                          }
                        }
                        boolean decompiledFrameRemainder5 = true;
                        if (250 > this.ageTicks &&
                          this.ageTicks > 25) {
                          boolean decompiledFrameRemainder4 = true;
                          var6 = -this.x + targetX;
                          var7 = targetY - this.y;
                          var8 = LoginMessageTable.computeAngle(var6, var7, (byte) -90);
                          var9 = LoginMessageTable.computeAngle(this.velocityX, this.velocityY, (byte) 57);
                          var10 = -4096 + (var8 - (var9 - 4096) & 8191);
                          var11 = ConnectionState.greatestCommonDivisor(this.velocityY, this.velocityX, false);
                          if (0 == this.spellType) {
                            if (-1024 > var10 ||
                              var10 > 1024) {
                              if (var11 < 100) {
                                var11 += 5;
                              }
                              if (!(var11 <= 100)) {
                                var11 -= 5;
                                if ((var19 != 0) &&
                                  (var11 < 150)) {
                                  var11 += 5;
                                }
                              }
                            } else {
                              if (var11 < 150) {
                                var11 += 5;
                              }
                            }
                            if (var10 > 128) {
                              var10 = 128;
                            }
                            decompiledFrameRemainder4 = !(var10 >= -128);
                            if (decompiledFrameRemainder4) {
                              var10 = -128;
                              decompiledFrameRemainder4 = (var19 != 0);
                            }
                          }
                          if (decompiledFrameRemainder4) {
                            if (this.spellType == 18) {
                              if (-1024 > var10 ||
                                1024 < var10) {
                                if (200 > var11) {
                                  var11 += 10;
                                }
                                if (!(200 >= var11)) {
                                  var11 -= 10;
                                  if ((var19 != 0) &&
                                    (var11 < 300)) {
                                    var11 += 50;
                                  }
                                }
                              } else {
                                if (var11 < 300) {
                                  var11 += 50;
                                }
                              }
                              if (64 < var10) {
                                var10 = 64;
                              }
                              decompiledFrameRemainder4 = !(-64 <= var10);
                              if (decompiledFrameRemainder4) {
                                var10 = -64;
                                decompiledFrameRemainder4 = (var19 != 0);
                              }
                            }
                            if (decompiledFrameRemainder4) {
                              if (this.spellType != 158) {
                                if (var10 < -1024 ||
                                  var10 > 1024) {
                                  if (var11 < 200) {
                                    var11 += 5;
                                  }
                                  if (!(200 >= var11)) {
                                    var11 -= 5;
                                    if ((var19 != 0) &&
                                      (var11 < 200)) {
                                      var11 += 5;
                                    }
                                  }
                                } else {
                                  if (var11 < 200) {
                                    var11 += 5;
                                  }
                                }
                                if (48 < var10) {
                                  var10 = 48;
                                }
                                decompiledFrameRemainder4 = !(var10 >= -48);
                                if (decompiledFrameRemainder4) {
                                  var10 = -48;
                                  decompiledFrameRemainder4 = (var19 != 0);
                                }
                              }
                              if (decompiledFrameRemainder4) {
                                if (-1024 <= var10 &&
                                  var10 <= 1024) {
                                  if (var11 < 100) {
                                    var11 += 5;
                                  }
                                  if (!(var11 <= 100)) {
                                    var11 -= 5;
                                    if (var19 != 0) {
                                      if (var11 < 100) {
                                        var11 += 5;
                                      }
                                      if (var11 > 100) {
                                        var11 -= 5;
                                      }
                                    }
                                  }
                                } else {
                                  if (var11 < 100) {
                                    var11 += 5;
                                  }
                                  if (var11 > 100) {
                                    var11 -= 5;
                                  }
                                }
                                if (var10 > 48) {
                                  var10 = 48;
                                }
                                if (var10 < -48) {
                                  var10 = -48;
                                }
                              }
                            }
                          }
                          var9 = var9 + var10;
                          this.velocityX = var11 * BevelBoxPainter.cosine(var9, -102) >> 16;
                          this.velocityY = GradientBarPainter.sine(-59, var9) * var11 >> 16;
                          decompiledFrameRemainder5 = (var19 != 0);
                        }
                        if (decompiledFrameRemainder5) {
                          this.velocityY = this.velocityY + 4;
                          if (158 == this.spellType &&
                            250 <= this.ageTicks) {
                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 163, this.y, this.battle);
                            this.playTypeSound(0, (byte) 37, 0);
                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                            var6 = 0;
                            while (15 > var6) {
                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 159, this.y, this.battle);
                              var7 = var6 * 8192 / 15;
                              ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-36, var7) >> 10;
                              ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var7, -127) >> 11) - 64;
                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                              var6++;
                              if (var19 != 0) {
                                return;
                              }
                            }
                            this.applyAreaEffect(0, 128, 64, 8);
                            this.remove(0);
                            return;
                          }
                        }
                        if (this.spellType == 158 && (this.ageTicks == 50 ||
                          this.ageTicks == 100 ||
                          150 == this.ageTicks ||
                          this.ageTicks == 200)) {
                          var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 159, this.y, this.battle);
                          ((SpellProjectile) (var5)).velocityY = this.velocityY / 2;
                          ((SpellProjectile) (var5)).velocityX = this.velocityX / 2;
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        if (this.spellType == 0) {
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 102, this.y, this.battle);
                          this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                        }
                        this.subpixelY = this.subpixelY + this.velocityY;
                        this.subpixelX = this.subpixelX + this.velocityX;
                        this.y = this.subpixelY >> 4;
                        this.x = this.subpixelX >> 4;
                      }
                    }
                    if (null != this.owner &&
                      this.ageTicks < 25) {
                      this.battle.eraseUnitMask(this.owner, obfuscationGuard - 6016);
                      this.ageTicks = this.ageTicks + 1;
                    }
                    var6 = this.subpixelX;
                    var7 = this.subpixelY;
                    if (!this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, this.x - this.spriteRadius, this.sprite)) {
                      if (-640 > this.x) {
                        this.remove(0);
                        return;
                      }
                      if ((this.battle.arenaWidth + 640) < this.x) {
                        this.remove(0);
                        return;
                      }
                      if (this.y > this.battle.arenaHeight) {
                        this.remove(0);
                        return;
                      }
                      if (null == this.owner) {
                        return;
                      }
                      if (this.ageTicks > 25) {
                        return;
                      }
                      this.battle.stampUnitMask(-54, this.owner);
                      return;
                    }
                    boolean decompiledFrameCompleted6 = true;
                    if (92 == this.spellType) {
                      this.playTypeSound(0, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                      this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                      this.applyAreaEffect(50, 96, 48, 8);
                      var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                      var10 = 0;
                      while (var10 < 15) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 76, this.y, this.battle);
                        stackIn_958_0 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        if (var19 != 0) {
                          decompiledFrameCompleted6 = false;
                          break;
                        }
                        var11 = stackIn_958_0;
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(119, var11) >> 10;
                        ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -119) >> 10;
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                      }
                    }
                    if (decompiledFrameCompleted6) {
                      stackIn_958_0 = -1;
                    }
                    var8 = stackIn_958_0;
                    if (this.spellType == 162) {
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 163, this.y, this.battle);
                      this.playTypeSound(0, (byte) 37, 0);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      var9 = 0;
                      while (var9 < 4) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 159, this.y, this.battle);
                        var10 = 8192 * var9 / 4;
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(obfuscationGuard ^ 6136, var10) >> 10;
                        ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var10, -113) >> 11) - 64;
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var9++;
                        if (var19 != 0) {
                          return;
                        }
                      }
                      var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 167, this.y, this.battle);
                      ((SpellProjectile) (var5)).velocityX = 0;
                      ((SpellProjectile) (var5)).velocityY = -1;
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(60, 128, 64, obfuscationGuard ^ 6024);
                      this.remove(0);
                      return;
                    }
                    if (91 == this.spellType) {
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 86, this.y, this.battle);
                      this.playTypeSound(0, (byte) 37, 0);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      var9 = 0;
                      while (var9 < 15) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 16, this.y, this.battle);
                        var10 = var9 * 8192 / 15;
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(obfuscationGuard - 6056, var10) >> 10;
                        ((SpellProjectile) (var5)).velocityY = -64 + (BevelBoxPainter.cosine(var10, obfuscationGuard - 6119) >> 11);
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var9++;
                        if (var19 != 0) {
                          return;
                        }
                      }
                      this.applyAreaEffect(25, 128, 64, 8);
                      this.remove(0);
                      return;
                    }
                    if (52 == this.spellType) {
                      this.playTypeSound(1, (byte) 37, 4);
                      var8 = 103;
                      this.applyAreaEffect(30, 128, 64, 8);
                    }
                    if (this.spellType == 50) {
                      this.playTypeSound(1, (byte) 37, 4);
                      var8 = 103;
                      this.applyAreaEffect(15, 256, 48, 8);
                    }
                    if (this.spellType == 54) {
                      this.playTypeSound(1, (byte) 37, 4);
                      this.applyAreaEffect(25, 128, 64, obfuscationGuard - 6008);
                      var8 = 104;
                    }
                    if (10 == this.spellType) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (17 == this.spellType) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(25, 128, 64, 8);
                    }
                    if (18 == this.spellType) {
                      this.playTypeSound(1, (byte) 37, 0);
                      this.applyAreaEffect(15, 128, 64, 8);
                      var8 = 85;
                    }
                    if (this.spellType == 14) {
                      this.playTypeSound(1, (byte) 37, 0);
                      this.applyAreaEffect(25, 96, 48, 8);
                      var8 = 86;
                    }
                    if (11 == this.spellType) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (this.spellType == 140) {
                      this.playTypeSound(0, (byte) 37, 6);
                      var8 = 130;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (124 == this.spellType) {
                      this.playTypeSound(2, (byte) 37, 6);
                      this.applyAreaEffect(20, 32, 16, 8);
                      var8 = 128;
                    }
                    if (this.spellType == 164) {
                      this.playTypeSound(2, (byte) 37, 0);
                      var8 = 99;
                      if (this.ageTicks > 1) {
                        stackIn_1007_1 = 5;
                      } else {
                        stackIn_1007_1 = 0;
                      }
                      this.applyAreaEffect(stackIn_1007_1, 32, 32, 8);
                    }
                    if (this.spellType == 161) {
                      var8 = 163;
                      if (BitHelpers.field_b) {
                        this.applyAreaEffect(0, 0, 16, obfuscationGuard ^ 6024);
                      }
                    }
                    if (this.spellType == 158) {
                      var9 = 250 - this.ageTicks;
                      if (50 < var9) {
                        var9 = 50;
                      }
                      var8 = 163;
                      this.applyAreaEffect(var9, 128, 64, 8);
                    }
                    if (this.spellType == 120) {
                      this.playTypeSound(1, (byte) 37, 6);
                      var8 = 154;
                      this.applyAreaEffect(0, 32, 32, 8);
                    }
                    if (this.spellType == 115) {
                      boolean decompiledSharedTail2 = !(!BitHelpers.field_b);
                      if (!decompiledSharedTail2) {
                        this.playTypeSound(2, (byte) 37, 6);
                        this.battle.carveTerrainAndSprite(this.y - 8, obfuscationGuard ^ -6121, -8 + this.x, ScreenSwitchHelpers.field_f[0].toRgbSprite());
                        var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 117, this.y, this.battle);
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        decompiledSharedTail2 = (var19 != 0);
                      }
                      if (decompiledSharedTail2) {
                        this.playTypeSound(1, (byte) 37, 6);
                        this.applyAreaEffect(50, 128, 64, 8);
                        var8 = 128;
                      }
                    }
                    if (this.spellType == 0) {
                      this.playTypeSound(1, (byte) 37, 9);
                      this.applyAreaEffect(10, 64, 32, 8);
                      var8 = 101;
                    }
                    if (this.spellType == 43) {
                      this.playTypeSound(2, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 95, this.y, this.battle);
                      this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                      this.applyAreaEffect(5, 32, 16, 8);
                    }
                    if (this.spellType == 24) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 64, 8);
                      this.ageTicks = this.ageTicks + 1;
                      this.drawUnitMarkers((byte) -104);
                    }
                    if (this.spellType == 82) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 48, 8);
                      this.drawUnitMarkers((byte) -100);
                      this.subpixelX = var6;
                      this.subpixelY = var7;
                      this.y = this.subpixelY >> 4;
                      this.x = this.subpixelX >> 4;
                    }
                    if (this.spellType == 49) {
                      this.playTypeSound(0, (byte) 37, 3);
                      var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                      var10 = 0;
                      while (true) {
                        if (var10 < 10) {
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 42, this.y, this.battle);
                          ((SpellProjectile) (var5)).field_w = this.field_w;
                          var11 = HuffmanCodec.randomBelow(var9_ref_jd, obfuscationGuard ^ -2147477632, 8192);
                          ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(126, var11) >> 9;
                          ((SpellProjectile) (var5)).velocityY = -64 + (BevelBoxPainter.cosine(var11, -119) >> 9);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                          var10++;
                          if (var19 == 0) {
                            continue;
                          }
                        } else {
                          this.y = GameSelectionHelpers.field_k;
                          this.x = NodeHashTable.field_m;
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        break;
                      }
                      this.applyAreaEffect(50, 128, 96, 8);
                    }
                    boolean decompiledFrameCompleted3 = true;
                    boolean decompiledFrameRemainder3 = true;
                    boolean decompiledFrameCompleted4 = true;
                    boolean decompiledFrameCompleted5 = true;
                    if (23 == this.spellType) {
                      this.playTypeSound(0, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 128, 8);
                      this.subpixelX = var6;
                      this.subpixelY = var7;
                      this.x = this.subpixelX >> 4;
                      this.y = this.subpixelY >> 4;
                      var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                      var10 = 0;
                      do {
                        if (var10 >= 5) {
                          var10 = 0;
                          break;
                        }
                        HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 256);
                        var10++;
                      } while (var19 == 0);
                      while (var10 < 5) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 82, this.y, this.battle);
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(obfuscationGuard - 5899, var11) >> 10;
                        ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var11, -120) >> 11) - 48;
                        ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).x + ((SpellProjectile) (var5)).velocityX;
                        ((SpellProjectile) (var5)).y = ((SpellProjectile) (var5)).y + 2 * (48 + ((SpellProjectile) (var5)).velocityY);
                        ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                        ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).y << 4;
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted5 = false;
                          break;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted5) &&
                      (this.spellType == 21)) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(40, 96, 48, obfuscationGuard - 6008);
                      var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                      var10 = 0;
                      while (var10 < 7) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 20, this.y, this.battle);
                        ((SpellProjectile) (var5)).field_w = this.field_w;
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(10, var11) >> 9;
                        ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -114) >> 9;
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted4 = false;
                          break;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted4) &&
                      (decompiledFrameRemainder3 = (40 == this.spellType))) {
                      this.playTypeSound(1, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 48, 8);
                      var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                    }
                    if (decompiledFrameRemainder3) {
                      var10 = 0;
                      while (var10 < 10) {
                        var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 76, this.y, this.battle);
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(0, var11) >> 11;
                        ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -116) >> 11;
                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted3) {
                      if (this.spellType != 145) {
                        boolean decompiledFrameRemainder2 = true;
                        boolean decompiledFrameCompleted0 = true;
                        boolean decompiledFrameRemainder1 = true;
                        boolean decompiledFrameCompleted1 = true;
                        boolean decompiledFrameRemainder0 = true;
                        boolean decompiledFrameCompleted2 = true;
                        if (this.spellType == 42) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                          this.applyAreaEffect(25, 96, 48, obfuscationGuard - 6008);
                          var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                          var10 = 0;
                          while (var10 < 4) {
                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 76, this.y, this.battle);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(obfuscationGuard - 6088, var11) >> 11;
                            ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -114) >> 11;
                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted2 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted2) &&
                          (decompiledFrameRemainder0 = (this.spellType == 96))) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                          this.applyAreaEffect(10, 64, 32, 8);
                          var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                        }
                        if (decompiledFrameRemainder0) {
                          var10 = 0;
                          while (var10 < 2) {
                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 43, this.y, this.battle);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-5, var11) >> 10;
                            ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -103) >> 10;
                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted1 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted1) &&
                          (decompiledFrameRemainder1 = (44 == this.spellType))) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                          this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                          this.applyAreaEffect(25, 64, 32, 8);
                          var9_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                        }
                        if (decompiledFrameRemainder1) {
                          var10 = 0;
                          while (15 > var10) {
                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 43, this.y, this.battle);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(116, var11) >> 9;
                            ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var11, -112) >> 9;
                            this.battle.onProjectileFinished(obfuscationGuard - 5964, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted0) &&
                          (decompiledFrameRemainder2 = (this.spellType == 156))) {
                          var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 168, this.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        if (decompiledFrameRemainder2) {
                          ((SpellProjectile) (var5)).field_H = 1;
                        }
                        if (var8 != -1) {
                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, var8, this.y, this.battle);
                          this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                        }
                        if (this.spellType != 121) {
                          this.remove(obfuscationGuard - 6016);
                        }
                        return;
                      }
                      this.playTypeSound(2, (byte) 37, 3);
                      this.applyAreaEffect(5, 32, 16, 8);
                    }
                    if (this.y >= 7 &&
                      !BitHelpers.field_b) {
                      this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, -119, -this.spriteRadius + this.x, this.sprite);
                    }
                    this.remove(0);
                    return;
                  }
                } else {
                  this.updateFlightSound(3, (byte) 34);
                  this.subpixelY = this.subpixelY + this.velocityY;
                  this.subpixelX = this.subpixelX + this.velocityX;
                  this.y = this.subpixelY >> 4;
                  this.velocityY = this.velocityY + 4;
                  this.x = this.subpixelX >> 4;
                  if (50 > this.ageTicks) {
                    this.ageTicks = this.ageTicks + 1;
                  }
                  if (null != this.owner &&
                    25 > this.ageTicks) {
                    this.battle.eraseUnitMask(this.owner, obfuscationGuard - 6016);
                  }
                  if (this.ageTicks < 50 &&
                    !this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, 2, -this.spriteRadius + this.x, this.sprite)) {
                    if (-640 > this.x) {
                      this.remove(0);
                      return;
                    }
                    if (this.battle.arenaWidth + 640 < this.x) {
                      this.remove(obfuscationGuard ^ 6016);
                      return;
                    }
                    if (this.battle.arenaHeight < this.y) {
                      this.remove(0);
                      return;
                    }
                    if (null == this.owner) {
                      return;
                    }
                    if (this.ageTicks >= 25) {
                      return;
                    }
                    this.battle.stampUnitMask(obfuscationGuard ^ -6067, this.owner);
                    if (var19 == 0) {
                      return;
                    }
                  } else {
                    var6_ref_jd = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                    var7 = 0;
                    while (var7 < 45) {
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 46, this.y, this.battle);
                      var8 = var6_ref_jd.nextInt((byte) -46) & 8191;
                      ((SpellProjectile) (var5)).velocityX = this.velocityX + ((var6_ref_jd.nextInt((byte) -46) & 127) * GradientBarPainter.sine(-122, var8) >> 16);
                      ((SpellProjectile) (var5)).velocityY = this.velocityY + ((127 & var6_ref_jd.nextInt((byte) -46)) * BevelBoxPainter.cosine(var8, obfuscationGuard - 6140) >> 16);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      var7++;
                      if (var19 != 0) {
                        return;
                      }
                    }
                    this.playTypeSound(1, (byte) 37, 3);
                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                    this.applyAreaEffect(10, 5, 16, 8);
                    this.remove(0);
                    return;
                  }
                }
                this.subpixelY = this.subpixelY + this.velocityY;
                this.subpixelX = this.subpixelX + this.velocityX;
                this.y = this.subpixelY >> 4;
                this.velocityY = this.velocityY + 4;
                this.x = this.subpixelX >> 4;
                if (this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, -this.spriteRadius + this.x, this.sprite)) {
                  this.ageTicks = this.ageTicks + 1;
                  var6 = this.x;
                  var7 = this.y;
                  this.x = NodeHashTable.field_m;
                  this.y = GameSelectionHelpers.field_k;
                  this.playTypeSound(1, (byte) 37, 1);
                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                  this.applyAreaEffect(5, 128, 64, obfuscationGuard - 6008);
                  this.x = var6;
                  this.y = var7;
                  if (this.random == null) {
                    this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                  }
                  var8 = 0;
                  while (true) {
                    if (this.ageTicks / 2 > var8) {
                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 20, this.y, this.battle);
                      var9 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                      ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-46, var9) >> 9;
                      ((SpellProjectile) (var5)).velocityY = BevelBoxPainter.cosine(var9, -127) >> 9;
                      this.battle.onProjectileFinished(obfuscationGuard ^ 6068, (SpellProjectile) (var5));
                      var8++;
                      if (var19 != 0) {
                        return;
                      }
                      continue;
                    }
                    if (10 >= this.ageTicks) {
                      break;
                    }
                    this.remove(0);
                    return;
                  }
                }
                if (-640 > this.x) {
                  this.remove(0);
                  return;
                }
                if (this.x > 640 + this.battle.arenaWidth) {
                  this.remove(0);
                  return;
                }
                if (this.y > this.battle.arenaHeight) {
                  this.remove(0);
                  return;
                }
                var5 = this.spawnFromHere(this.x + (int)(64.0 * Math.random() - 32.0), (BattleUnit) null, (byte) 81, 90, this.y + (int)(Math.random() * 64.0 - 32.0), this.battle);
                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                return;
              }
            }
          }
          if (this.spellType == 113 &&
            this.ageTicks < 20) {
            this.ageTicks = this.ageTicks + 1;
            return;
          }
          this.ageTicks = this.ageTicks + 1;
          if (null == this.random) {
            this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
          }
          var6 = 50;
          if (84 == this.spellType &&
            this.owner != null &&
            2 == this.battle.playerSpellbook[this.owner.ownerPlayer]) {
            var6 = var6 + this.battle.field_X[this.owner.ownerPlayer] / 4;
          }
          if (this.spellType == 75) {
            var6 = 75;
          }
          if (73 == this.spellType) {
            var6 = 60;
            if (this.owner != null &&
              this.battle.playerSpellbook[this.owner.ownerPlayer] == 0) {
              var6 = 60 + 3 * this.battle.field_X[this.owner.ownerPlayer] / 10;
            }
          }
          if (this.spellType == 144) {
            var6 = 60;
          }
          if (this.spellType == 97) {
            var6 = 15;
          }
          if (this.spellType == 125) {
            var6 = 25;
          }
          if (this.spellType == 153) {
            var6 = 25;
          }
          if (113 == this.spellType) {
            var6 = 35;
          }
          if (this.ageTicks <= var6 && (null == this.owner ||
            !(this.owner.pendingDamage > 0))) {
            if (0 != this.ageTicks % 5) {
              return;
            }
            if (this.spellType == 73) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 16, this.y, this.battle);
              if (null != this.owner &&
                0 == this.battle.playerSpellbook[this.owner.ownerPlayer]) {
                var7 = 2 * this.battle.field_X[this.owner.ownerPlayer];
                ((SpellProjectile) (var5)).velocityX = this.velocityX + HuffmanCodec.randomBelow(this.random, -2147483648, var7 * 2 + 1) - var7;
                ((SpellProjectile) (var5)).velocityY = -var7 + this.velocityY + HuffmanCodec.randomBelow(this.random, -2147483648, var7 * 2 + 1);
              }
            }
            if (this.spellType == 144) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 145, this.y, this.battle);
              this.playSound(166, true);
            }
            if (this.spellType == 75) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 43, this.y, this.battle);
            }
            if (97 == this.spellType) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 96, this.y, this.battle);
            }
            if (this.spellType == 125) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 124, this.y, this.battle);
            }
            if (this.spellType == 153) {
              boolean decompiledSharedTail1 = !(!Js5Transport.isFeatureEnabled(0, (byte) -89));
              if (!decompiledSharedTail1) {
                var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 115, this.y, this.battle);
                decompiledSharedTail1 = (var19 != 0);
              }
              if (decompiledSharedTail1) {
                var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 116, this.y, this.battle);
              }
              ((SpellProjectile) (var5)).field_w = this.field_w;
            }
            if (this.spellType == 81) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 20, this.y, this.battle);
              this.playSound(88, true);
            }
            if (this.spellType == 113) {
              var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 52, this.y, this.battle);
            }
            if (this.spellType == 84) {
              var5 = this.spawnFromHere((this.velocityX >> 4) + this.x, this.owner, (byte) 81, 30, this.y + (this.velocityY >> 4), this.battle);
              ((SpellProjectile) (var5)).field_w = this.field_w;
              ((SpellProjectile) (var5)).velocityY = this.velocityY;
              ((SpellProjectile) (var5)).velocityX = this.velocityX;
              if (var19 != 0) {
                if (125 != this.spellType &&
                  153 != this.spellType) {
                  ((SpellProjectile) (var5)).velocityX = -15 + (this.velocityX >> 1) + HuffmanCodec.randomBelow(this.random, -2147483648, 31);
                  ((SpellProjectile) (var5)).velocityY = -15 + (this.velocityY >> 1) + HuffmanCodec.randomBelow(this.random, obfuscationGuard + 2147477632, 31);
                  ((SpellProjectile) (var5)).velocityX = this.velocityX + HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15;
                  ((SpellProjectile) (var5)).velocityY = this.velocityY + (HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15);
                } else {
                  ((SpellProjectile) (var5)).velocityX = this.velocityX + HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15;
                  ((SpellProjectile) (var5)).velocityY = this.velocityY + (HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15);
                }
              }
            } else {
              boolean decompiledSharedTail0 = (125 == this.spellType ||
                153 == this.spellType);
              if (!decompiledSharedTail0) {
                ((SpellProjectile) (var5)).velocityX = -15 + (this.velocityX >> 1) + HuffmanCodec.randomBelow(this.random, -2147483648, 31);
                ((SpellProjectile) (var5)).velocityY = -15 + (this.velocityY >> 1) + HuffmanCodec.randomBelow(this.random, obfuscationGuard + 2147477632, 31);
                decompiledSharedTail0 = (var19 != 0);
              }
              if (decompiledSharedTail0) {
                ((SpellProjectile) (var5)).velocityX = this.velocityX + HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15;
                ((SpellProjectile) (var5)).velocityY = this.velocityY + (HuffmanCodec.randomBelow(this.random, -2147483648, 31) - 15);
              }
            }
            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
            return;
          }
          this.remove(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var5), "mi.G(" + obfuscationGuard + ',' + targetX + ',' + targetY + ',' + round + ')');
        }
    }

    private final void notifyOwner(byte obfuscationGuard) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.owner) {
            this.battle.stampUnitMask(-49, this.owner);
          }
          var2_int = 48 % ((obfuscationGuard + 53) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.LA(" + obfuscationGuard + ')');
        }
    }

    final void remove(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.flightSoundStream != null) {
            DateOfBirthValidator.stopEffectStream(this.flightSoundStream, 123);
          }
          if (this.owner != null) {
            if (this == this.owner.attachedProjectile) {
              this.owner.attachedProjectile = null;
            }
            if (!this.owner.isDead(-1)) {
              this.battle.stampUnitMask(-44, this.owner);
            }
          }
          this.flightSoundTicks = 0;
          this.velocityX = 0;
          this.field_x = 0;
          this.velocityY = param0;
          this.sprite = null;
          this.field_H = 0;
          this.ageTicks = 0;
          this.random = null;
          this.battle.addProjectile(-1, this);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.F(" + param0 + ')');
        }
    }

    private final PcmSampleStream createFlightSoundStream(PcmSample sample, int obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_2_0 = null;
        PcmSampleStream stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == sample) {
            stackIn_2_0 = null;
            return (PcmSampleStream) (stackIn_2_0);
          }
          var3_int = Math.abs(this.velocityY) + Math.abs(this.velocityX);
          if (obfuscationGuard != 19227) {
            field_E = (Sprite) null;
          }
          var4 = var3_int / 10 + 100;
          var5 = 16;
          if (512 > var3_int) {
            var5 = var5 * var3_int / 512;
          }
          stackIn_9_0 = PcmSampleStream.createAtRatePercent(sample, var4, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mi.CA(");
          if (sample == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void playTypeSound(int soundIndex, byte obfuscationGuard, int soundGroup) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (obfuscationGuard != 37) {
            this.velocityY = 10;
          }
          if (null != this.battle.projectileSamples &&
            this.battle.projectileSamples[CacheEntry.field_n[soundGroup][soundIndex]] != null) {
            DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[CacheEntry.field_n[soundGroup][soundIndex]], this.battle.projectileSamples[CacheEntry.field_n[soundGroup][soundIndex]]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "mi.MA(" + soundIndex + ',' + obfuscationGuard + ',' + soundGroup + ')');
        }
    }

    private final boolean isActiveEffect(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (!this.isAlive(-139)) {
            return false;
          }
          if (this.isPersistentType(120)) {
            return false;
          }
          if (this.spellType != 1 &&
            this.spellType != 2 &&
            this.spellType != 3) {
            if (15 != this.spellType &&
              this.spellType != 19 &&
              this.spellType != 68) {
              if (this.spellType != 22 &&
                26 != this.spellType &&
                this.spellType != 27 &&
                this.spellType != 28 &&
                this.spellType != 29 &&
                this.spellType != 68) {
                var2_int = -78 / ((obfuscationGuard + 7) / 49);
                if (this.spellType != 30 &&
                  69 != this.spellType &&
                  this.spellType != 32 &&
                  this.spellType != 36 &&
                  this.spellType != 35 &&
                  70 != this.spellType &&
                  71 != this.spellType) {
                  if (this.spellType != 47 &&
                    this.spellType != 48 &&
                    this.spellType != 49 &&
                    this.spellType != 72) {
                    if (55 != this.spellType &&
                      this.spellType != 56 &&
                      this.spellType != 157 &&
                      this.spellType != 168) {
                      if (60 != this.spellType &&
                        this.spellType != 62 &&
                        this.spellType != 63 &&
                        64 != this.spellType &&
                        this.spellType != 65) {
                        if (this.spellType != 73 &&
                          this.spellType != 74 &&
                          75 != this.spellType &&
                          77 != this.spellType &&
                          78 != this.spellType) {
                          if (this.spellType != 79 &&
                            80 != this.spellType) {
                            if (81 != this.spellType &&
                              this.spellType != 83 &&
                              84 != this.spellType) {
                              if (this.spellType != 85 &&
                                this.spellType != 86 &&
                                this.spellType != 89 &&
                                this.spellType != 163) {
                                if (this.spellType == 93) {
                                  return false;
                                }
                                if (94 != this.spellType &&
                                  this.spellType != 97) {
                                  if (this.spellType == 98) {
                                    return false;
                                  }
                                  if (this.spellType != 99 &&
                                    this.spellType != 101 &&
                                    this.spellType != 103 &&
                                    this.spellType != 104 &&
                                    this.spellType != 106 &&
                                    this.spellType != 107) {
                                    if (108 != this.spellType &&
                                      this.spellType != 110) {
                                      if (this.spellType != 111 &&
                                        this.spellType != 113 &&
                                        this.spellType != 114) {
                                        if (this.spellType != 118 &&
                                          this.spellType != 119 &&
                                          this.spellType != 121 &&
                                          this.spellType != 123 &&
                                          this.spellType != 125 &&
                                          this.spellType != 127 &&
                                          this.spellType != 126 &&
                                          this.spellType != 128) {
                                          if (130 != this.spellType &&
                                            this.spellType != 131 &&
                                            this.spellType != 134 &&
                                            this.spellType != 136 &&
                                            138 != this.spellType &&
                                            this.spellType != 139 &&
                                            this.spellType != 141 &&
                                            this.spellType != 142 &&
                                            this.spellType != 144) {
                                            if (148 != this.spellType &&
                                              this.spellType != 149 &&
                                              150 != this.spellType &&
                                              this.spellType != 153 &&
                                              this.spellType != 154) {
                                              if (this.spellType == 151) {
                                                return false;
                                              }
                                              if (this.spellType != 160) {
                                                return true;
                                              }
                                              return false;
                                            }
                                            return false;
                                          }
                                          return false;
                                        }
                                        return false;
                                      }
                                      return false;
                                    }
                                    return false;
                                  }
                                  return false;
                                }
                                return false;
                              }
                              return false;
                            }
                            return false;
                          }
                          return false;
                        }
                        return false;
                      }
                      return false;
                    }
                    return false;
                  }
                  return false;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.DA(" + obfuscationGuard + ')');
        }
    }

    private final SpellProjectile spawnFromHere(int x, BattleUnit owner, byte obfuscationGuard, int spellType, int y, Battle battle) {
        RuntimeException var7 = null;
        SpellProjectile stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 81) {
            this.setBattle(76, (Battle) null);
          }
          stackIn_4_0 = BevelBoxPainter.createProjectile(owner, y, (byte) -118, battle, this.damageSourceId, x, spellType);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mi.KA(").append(x).append(',');
          if (owner == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(spellType).append(',').append(y).append(',');
          if (battle == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void initialize(int obfuscationGuard, int spellType, int y, int x, int damageSourceId, Battle battle, BattleUnit owner) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.spellType = spellType;
          this.y = y;
          this.x = x;
          this.damageSourceId = damageSourceId;
          this.owner = owner;
          if (obfuscationGuard > -92) {
            return;
          }
          this.battle = battle;
          this.subpixelX = this.x << 4;
          this.subpixelY = this.y << 4;
          this.initializeSprite(-103);
          this.field_w = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("mi.K(").append(obfuscationGuard).append(',').append(spellType).append(',').append(y).append(',').append(x).append(',').append(damageSourceId).append(',');
          if (battle == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (owner == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean shouldCameraFollow(int obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_41_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.sprite) {
            return false;
          }
          if (this.spellType == 157) {
            return false;
          }
          if (this.spellType == 168) {
            return false;
          }
          if (this.spellType == 26) {
            return true;
          }
          if (this.spellType == 64) {
            return true;
          }
          if (63 == this.spellType) {
            return true;
          }
          if (this.spellType == 160) {
            return true;
          }
          if (obfuscationGuard != -8209) {
            this.updateFlightSound(-104, (byte) 102);
          }
          if (this.spellType == 28) {
            return true;
          }
          if (this.spellType == 49) {
            return true;
          }
          stackIn_41_0 = this.isActiveEffect((byte) -108);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.H(" + obfuscationGuard + ')');
        }
    }

    final void setBattle(int obfuscationGuard, Battle battle) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 7 % ((-52 - obfuscationGuard) / 61);
          this.battle = battle;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("mi.E(").append(obfuscationGuard).append(',');
          if (battle == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void updateMotion(int round, byte obfuscationGuard, int targetY, int targetX) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        Object stackIn_392_0 = null;
        BattleUnit stackIn_431_0 = null;
        Object stackIn_472_0 = null;
        int stackIn_539_0 = 0;
        int stackIn_539_1 = 0;
        int stackIn_594_0 = 0;
        int stackIn_594_1 = 0;
        int stackIn_748_0 = 0;
        int stackIn_748_1 = 0;
        int stackIn_823_0 = 0;
        IndexedSprite[] stackIn_950_1 = null;
        int stackIn_951_2 = 0;
        Object stackIn_953_0 = null;
        Battle stackIn_957_0 = null;
        int stackIn_957_1 = 0;
        int stackIn_958_2 = 0;
        boolean stackIn_1134_0 = false;
        int stackIn_1159_0 = 0;
        SpellProjectile stackIn_1285_0 = null;
        Object stackIn_1322_0 = null;
        int stackIn_1322_1 = 0;
        boolean stackIn_1434_0 = false;
        int stackIn_1444_0 = 0;
        SpellProjectile stackIn_1494_0 = null;
        Object stackIn_1544_0 = null;
        SpellProjectile stackIn_1871_0 = null;
        Object stackIn_1893_0 = null;
        int stackIn_1893_1 = 0;
        SpellProjectile stackIn_2017_0 = null;
        Object stackIn_2042_0 = null;
        int stackIn_2042_1 = 0;
        RuntimeException decompiledCaughtException = null;
        BattleUnit stackOut_430_0;
        boolean stackOut_1133_0;
        SpellProjectile stackOut_1284_0;
        boolean stackOut_1433_0;
        SpellProjectile stackOut_1493_0;
        SpellProjectile stackOut_2016_0;
        SpellProjectile stackOut_1870_0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BattleUnit var9_ref_ml = null;
        double var9_double = 0.0;
        SpellProjectile var9_ref_mi = null;
        int var10 = 0;
        BattleUnit var10_ref_ml = null;
        double var10_double = 0.0;
        SpellProjectile var10_ref_mi = null;
        IntrusiveDequeCursor var10_ref_oc = null;
        int var11 = 0;
        BattleUnit var11_ref_ml = null;
        SpellProjectile var11_ref_mi = null;
        int var12 = 0;
        SpellProjectile var12_ref_mi = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object stackIn_392_0Lifetime1;
        Object stackIn_472_0Lifetime1;
        Object stackIn_953_0Lifetime1;
        Object stackIn_1322_0Lifetime1;
        Object stackIn_1544_0Lifetime1;
        Object stackIn_2042_0Lifetime1;
        BattleUnit var9_ref_mlLifetime1;
        SpellProjectile var9_ref_miLifetime1;
        SpellProjectile var9_ref_miLifetime2;
        SpellProjectile var9_ref_miLifetime3;
        BattleUnit var10_ref_mlLifetime1;
        SpellProjectile var11_ref_miLifetime1;
        BattleUnit var9_ref_mlLifetime1Lifetime1;
        SpellProjectile var9_ref_miLifetime2Lifetime1;
        int stackIn_539_0Lifetime1;
        int stackIn_539_1Lifetime1;
        int stackIn_1159_0Lifetime1;
        int stackIn_2042_1Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var10Lifetime1;
        double var10_doubleLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var7Lifetime4;
        int var10Lifetime2;
        int var12Lifetime3;
        int var13Lifetime3;
        int var14Lifetime3;
        int var15Lifetime2;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime1Lifetime2;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var14Lifetime1Lifetime1;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.sprite == null) {
            return;
          }
          if (this.isSecondaryLinked((byte) -17)) {
            return;
          }
          regionExit1: {
            var6 = 109 / ((19 - obfuscationGuard) / 55);
            var5 = null;
            var9 = this.spellType;
            if (var9 != 127) {
              if (var9 == 149 &&
                var19 == 0) {
                if (this.owner != null &&
                  !this.owner.isDead(-1)) {
                  if (256 <= this.ageTicks) {
                    return;
                  }
                  this.ageTicks = this.ageTicks + 1;
                  if (this.ageTicks > 255) {
                    this.ageTicks = 0;
                  }
                  MidiPcmStream.field_L.setDeque((byte) 90, this.battle.projectiles);
                  var5 = (SpellProjectile) (MidiPcmStream.field_L.first(-69));
                  while (null != var5) {
                    stackIn_392_0 = var5;
                    boolean decompiledFrameRemainder2 = true;
                    if (((SpellProjectile) stackIn_392_0).isActiveEffect((byte) -124)) {
                      var9 = this.x - ((SpellProjectile) (var5)).x;
                      var10 = this.y - ((SpellProjectile) (var5)).y;
                      if (!(Math.abs(var9) < 32) ||
                        !(Math.abs(var10) < 32)) {
                        var9 = this.velocityX + (this.x - ((SpellProjectile) (var5)).x);
                        var10 = this.y - (-this.velocityY + ((SpellProjectile) (var5)).y);
                        if ((!(Math.abs(var9) >= 32)) &&
                          (!(Math.abs(var10) >= 32))) {
                          ((SpellProjectile) (var5)).y = this.y;
                          ((SpellProjectile) (var5)).x = this.x;
                          this.ageTicks = 256;
                          ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                          ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).y << 4;
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        ((SpellProjectile) (var5)).x = this.x + this.velocityX;
                        this.ageTicks = 256;
                        ((SpellProjectile) (var5)).y = this.velocityY + this.y;
                        ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                        ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).y << 4;
                      }
                    }
                    var5 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                  }
                  MidiPcmStream.field_L.setDeque((byte) 28, this.battle.units);
                  stackIn_392_0Lifetime1 = MidiPcmStream.field_L.first(-66);
                  var9_ref_ml = (BattleUnit) (stackIn_392_0Lifetime1);
                  while (null != var9_ref_ml) {
                    boolean decompiledFrameRemainder1 = true;
                    if (var9_ref_ml.size <= 32) {
                      var10Lifetime2 = this.x - var9_ref_ml.x;
                      var11 = this.y - var9_ref_ml.y;
                      if (!(Math.abs(var10Lifetime2) < 32) ||
                        !(Math.abs(var11) < 32)) {
                        var10Lifetime2 = this.x + this.velocityX - var9_ref_ml.x;
                        var11 = -var9_ref_ml.y + this.velocityY + this.y;
                        if ((!(Math.abs(var10Lifetime2) >= 32)) &&
                          (!(Math.abs(var11) >= 32))) {
                          this.ageTicks = 256;
                          this.battle.eraseUnitMask(var9_ref_ml, 0);
                          var9_ref_ml.y = this.y;
                          var9_ref_ml.x = this.x;
                          var9_ref_ml.subpixelY = var9_ref_ml.y << 4;
                          var9_ref_ml.subpixelX = var9_ref_ml.x << 4;
                          var9_ref_ml.moving = true;
                        }
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        this.ageTicks = 256;
                        this.battle.eraseUnitMask(var9_ref_ml, 0);
                        var9_ref_ml.y = this.y + this.velocityY;
                        var9_ref_ml.x = this.x + this.velocityX;
                        var9_ref_ml.subpixelX = var9_ref_ml.x << 4;
                        var9_ref_ml.moving = true;
                        var9_ref_ml.subpixelY = var9_ref_ml.y << 4;
                      }
                    }
                    var9_ref_ml = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                  }
                  return;
                }
                this.remove(0);
                return;
              }
              if (32 == var9 &&
                var19 == 0) {
                this.ageTicks = this.ageTicks + 1;
                if ((this.ageTicks == 100 ||
                  this.ageTicks == 150) && (null != this.battle.projectileSamples &&
                  null != this.battle.projectileSamples[103])) {
                  DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[103], this.battle.projectileSamples[103]);
                }
                var5 = this.spawnFromHere(this.owner.x, (BattleUnit) null, (byte) 81, 100, this.owner.y - (this.owner.size >> 1), this.battle);
                ((SpellProjectile) (var5)).velocityX = (int)(64.0 * Math.sin(0.1 * (double)this.ageTicks));
                ((SpellProjectile) (var5)).velocityY = (int)(Math.cos((double)this.ageTicks * 0.1) * 64.0);
                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                var9_double = 2.0 * (3.141592653589793 * Math.random());
                var5 = this.spawnFromHere(this.owner.x + (int)(Math.random() * 256.0 * Math.cos(var9_double)), (BattleUnit) null, (byte) 81, 100, this.owner.y - (this.owner.size >> 1) + (int)(Math.random() * 256.0 * Math.sin(var9_double)), this.battle);
                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                if (this.ageTicks % 15 == 1) {
                  MidiPcmStream.field_L.setDeque((byte) 39, this.battle.units);
                  var11_ref_ml = (BattleUnit) (MidiPcmStream.field_L.first(-59));
                  while (var11_ref_ml != null) {
                    stackOut_430_0 = var11_ref_ml;
                    stackIn_472_0 = stackOut_430_0;
                    stackIn_431_0 = stackOut_430_0;
                    if (stackIn_431_0 != this.owner) {
                      var12 = -var11_ref_ml.x + this.x;
                      var13 = this.y - var11_ref_ml.y;
                      var14 = ConnectionState.greatestCommonDivisor(var13, var12, false);
                      if (256 > var14 ||
                        var11_ref_ml.moving) {
                        if (var11_ref_ml.y >= 0 &&
                          this.ageTicks <= 200) {
                          if (Math.abs(var12) > 64 &&
                            100 > this.ageTicks) {
                            var12 = -var12;
                            var13 = -var13;
                            var13 += 128;
                          } else {
                            var13 = 32;
                            var12 = 0;
                          }
                        } else {
                          var13 = 32;
                        }
                        var14 = ConnectionState.greatestCommonDivisor(var13, var12, false);
                        var15 = 64;
                        if (var14 > 128) {
                          var15 = 8192 / var14;
                        }
                        if (var15 > 0 &&
                          4 < var14 &&
                          var14 < 512) {
                          var11_ref_ml.field_P = 2;
                          if (!var11_ref_ml.moving) {
                            var11_ref_ml.velocityY = var11_ref_ml.velocityY - var15;
                          }
                          var11_ref_ml.velocityX = var11_ref_ml.velocityX - var12 * var15 / var14;
                          var11_ref_ml.velocityY = var11_ref_ml.velocityY - (var15 * var13 / var14 + 8);
                          var11_ref_ml.moving = true;
                          var5 = this.spawnFromHere(var11_ref_ml.x + (int)(Math.random() * (double)var11_ref_ml.size - (double)(var11_ref_ml.size / 2)), (BattleUnit) null, (byte) 81, 100, var11_ref_ml.y, this.battle);
                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                      }
                    }
                    var11_ref_ml = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                  }
                  MidiPcmStream.field_L.setDeque((byte) 122, this.battle.projectiles);
                  stackIn_472_0Lifetime1 = MidiPcmStream.field_L.first(-109);
                  var11_ref_mi = (SpellProjectile) (stackIn_472_0Lifetime1);
                  while (var11_ref_mi != null) {
                    stackIn_539_0 = var11_ref_mi.spellType;
                    stackIn_539_1 = 30;
                    if (stackIn_539_0 != stackIn_539_1 &&
                      84 != var11_ref_mi.spellType &&
                      var11_ref_mi.spellType != 149) {
                      var12Lifetime3 = this.x - var11_ref_mi.x;
                      var13Lifetime3 = this.y - var11_ref_mi.y;
                      var14Lifetime3 = ConnectionState.greatestCommonDivisor(var13Lifetime3, var12Lifetime3, false);
                      if (var14Lifetime3 < 256 ||
                        var11_ref_mi.isAlive(-139)) {
                        if (0 <= var11_ref_mi.y &&
                          this.ageTicks <= 200) {
                          if (!(Math.abs(var12Lifetime3) > 64) ||
                            this.ageTicks >= 100) {
                            var12Lifetime3 = 0;
                            var13Lifetime3 = 32;
                          } else {
                            var12Lifetime3 = -var12Lifetime3;
                            var13Lifetime3 = -var13Lifetime3;
                            var13Lifetime3 += 128;
                          }
                        } else {
                          var13Lifetime3 = 32;
                        }
                        var14Lifetime3 = ConnectionState.greatestCommonDivisor(var13Lifetime3, var12Lifetime3, false);
                        var15Lifetime2 = 128;
                        if (var14Lifetime3 > 128) {
                          var15Lifetime2 = 8192 / var14Lifetime3;
                        }
                        if (var11_ref_mi.spellType == 71 ||
                          47 == var11_ref_mi.spellType ||
                          var11_ref_mi.spellType == 36) {
                          if (var12Lifetime3 > 0) {
                            var11_ref_mi.subpixelX = var11_ref_mi.subpixelX + 240;
                            var11_ref_mi.x = var11_ref_mi.x + 15;
                          }
                          if (var12Lifetime3 < 0) {
                            var11_ref_mi.x = var11_ref_mi.x - 15;
                            var11_ref_mi.subpixelX = var11_ref_mi.subpixelX - 240;
                          }
                        }
                        if (0 < var15Lifetime2 &&
                          var14Lifetime3 > 4 &&
                          var14Lifetime3 < 512) {
                          if (var11_ref_mi.spellType == 16) {
                            var11_ref_mi.ageTicks = 0;
                          }
                          var11_ref_mi.velocityY = var11_ref_mi.velocityY - (-(var15Lifetime2 / 2) + var15Lifetime2 * var13Lifetime3 / var14Lifetime3);
                          var11_ref_mi.velocityX = var11_ref_mi.velocityX - var15Lifetime2 * var12Lifetime3 / var14Lifetime3;
                        }
                      }
                    }
                    var11_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                  }
                }
                stackIn_539_0Lifetime1 = -251;
                stackIn_539_1Lifetime1 = ~this.ageTicks;
                if (stackIn_539_0Lifetime1 <= stackIn_539_1Lifetime1) {
                  return;
                }
                this.remove(0);
                return;
              }
              regionExit2: {
                if (157 != var9 &&
                  168 != var9) {
                  if (var9 == 55) {
                    break regionExit2;
                  }
                  if (var9 == 111) {
                    break regionExit2;
                  }
                  regionExit3: {
                    if (var9 == 56) {
                      if (!this.owner.isDead(-1) &&
                        (128 + this.battle.arenaHeight) > this.owner.y) {
                        this.x = this.owner.x;
                        this.y = this.owner.y - (this.owner.size >> 1);
                        this.subpixelX = this.x << 4;
                        this.subpixelY = this.y << 4;
                        if (this.ageTicks != 0) {
                          return;
                        }
                        if (this.owner.health >= 250) {
                          return;
                        }
                        var9 = 0;
                        MidiPcmStream.field_L.setDeque((byte) 69, this.battle.units);
                        var10_ref_ml = (BattleUnit) (MidiPcmStream.field_L.first(-111));
                        while (var10_ref_ml != null) {
                          if (var19 != 0) {
                            return;
                          }
                          if (var10_ref_ml.linkedUnit == this.owner &&
                            0 < var10_ref_ml.health - var10_ref_ml.pendingDamage &&
                            this.owner.health < 250) {
                            this.owner.health = this.owner.health + 1;
                            var10_ref_ml.pendingDamage = var10_ref_ml.pendingDamage + 1;
                            var9 = 1;
                          }
                          var10_ref_ml = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                        }
                        if (var9 != 0) {
                          if (var19 == 0) {
                            return;
                          }
                          break regionExit3;
                        }
                        this.remove(0);
                        return;
                      }
                      if (this.battle.getCurrentPlayer(false) == this.owner.unitId) {
                      }
                      this.remove(0);
                      return;
                    }
                    if (var9 != 167) {
                      if (var9 == 102) {
                        this.field_x = this.field_x + 8;
                        if (250 >= this.field_x) {
                          return;
                        }
                        this.remove(0);
                        return;
                      }
                      if (var9 != 108 &&
                        var9 != 109) {
                        if (var9 == 112) {
                          this.ageTicks = this.ageTicks + 1;
                          if (this.ageTicks <= 50) {
                            return;
                          }
                          this.remove(0);
                          return;
                        }
                        regionExit4: {
                          if (var9 != 85 &&
                            var9 != 86 &&
                            var9 != 103) {
                            if (var9 == 104 &&
                              var19 == 0) {
                              break regionExit4;
                            }
                            if (var9 != 163) {
                              if (var9 == 105 &&
                                var19 == 0) {
                                break regionExit4;
                              }
                              if (var9 == 87 &&
                                var19 == 0) {
                                break regionExit4;
                              }
                              if (var9 != 88 &&
                                var9 != 90) {
                                if (89 == var9 &&
                                  var19 == 0) {
                                  break regionExit4;
                                }
                                if (var9 == 100 &&
                                  var19 == 0) {
                                  break regionExit4;
                                }
                                if (var9 == 166 &&
                                  var19 == 0) {
                                  break regionExit4;
                                }
                                if (var9 != 99) {
                                  if (var9 == 94 &&
                                    var19 == 0) {
                                    break regionExit4;
                                  }
                                  if (95 == var9 &&
                                    var19 == 0) {
                                    break regionExit4;
                                  }
                                  if (101 != var9) {
                                    if (128 == var9 &&
                                      var19 == 0) {
                                      break regionExit4;
                                    }
                                    if (var9 != 154) {
                                      if (var9 == 130 &&
                                        var19 == 0) {
                                        break regionExit4;
                                      }
                                      if (var9 == 131 &&
                                        var19 == 0) {
                                        break regionExit4;
                                      }
                                      if (var9 != 132) {
                                        if (var9 == 129 &&
                                          var19 == 0) {
                                          break regionExit4;
                                        }
                                        if (137 == var9 &&
                                          var19 == 0) {
                                          this.ageTicks = this.ageTicks + 1;
                                          if (this.ageTicks == 3 &&
                                            0 == this.field_H) {
                                            this.playSound(160, true);
                                          }
                                          if (this.ageTicks > 8) {
                                            this.ageTicks = this.ageTicks - 8;
                                            this.field_H = this.field_H + 1;
                                            if (this.field_H == 1) {
                                              this.applyAreaEffect(0, this.owner.size, this.owner.size * 2, 8);
                                            }
                                          }
                                          if (this.field_H < 8) {
                                            return;
                                          }
                                          this.remove(0);
                                          return;
                                        }
                                        if (var9 == 114 &&
                                          var19 == 0) {
                                          this.ageTicks = this.ageTicks + 64;
                                          this.y = -480;
                                          if (this.velocityY >= this.ageTicks) {
                                            return;
                                          }
                                          this.remove(0);
                                          return;
                                        }
                                        if (var9 == 155) {
                                          if (this.owner.field_q > 0) {
                                            this.owner.field_q = this.owner.field_q - 1;
                                            this.owner.moving = true;
                                          }
                                          this.ageTicks = this.ageTicks + 1;
                                          if (0 != (this.ageTicks & 5)) {
                                            return;
                                          }
                                          if (this.owner.field_q <= 0) {
                                            if (this.ageTicks > 128) {
                                              this.remove(0);
                                            }
                                            return;
                                          }
                                          var5 = this.spawnFromHere(this.owner.x, this.owner, (byte) 81, 0, this.owner.y - this.owner.size - 8, this.battle);
                                          ((SpellProjectile) (var5)).velocityX = -56 + 8 * (this.ageTicks / 5 & 15);
                                          this.battle.field_mb = this.owner.x;
                                          ((SpellProjectile) (var5)).velocityY = -100;
                                          this.battle.field_t = -240;
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          return;
                                        }
                                        if (var9 == 60) {
                                          this.ageTicks = this.ageTicks + 1;
                                          var9 = 0;
                                          boolean decompiledNaturalLoopExit0 = false;
                                          while (!(decompiledNaturalLoopExit0 = (32 <= var9))) {
                                            stackIn_823_0 = this.y;
                                            if (var19 == 0) {
                                              if (stackIn_823_0 < -32 + this.battle.arenaHeight &&
                                                !this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, 2, this.x - this.spriteRadius, this.sprite)) {
                                                this.y = this.y + 1;
                                              }
                                              var9++;
                                              continue;
                                            }
                                            break;
                                          }
                                          if (decompiledNaturalLoopExit0) {
                                            stackIn_823_0 = compareDoublesNanGreater(128.0 * Math.random(), (double)this.ageTicks);
                                          }
                                          if (stackIn_823_0 < 0) {
                                            var5 = this.spawnFromHere(this.x + (int)(96.0 * Math.random() - 48.0), (BattleUnit) null, (byte) 81, 109, (int)(-480.0 + Math.random() * (double)(this.y + 480)), this.battle);
                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          }
                                          if (this.ageTicks < 128) {
                                            return;
                                          }
                                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 108, this.y, this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          this.applyAreaEffect(50, 128, 96, 8);
                                          this.playTypeSound(1, (byte) 37, 5);
                                          this.remove(0);
                                          return;
                                        }
                                        if ((61 != var9 ||
                                          var19 != 0) &&
                                          (63 != var9 &&
                                          var9 != 64 &&
                                          var9 != 66)) {
                                          if (119 == var9 &&
                                            var19 == 0) {
                                            if (this.ageTicks != 0) {
                                              if (this.ageTicks > 50) {
                                                this.ageTicks = this.ageTicks + 1;
                                                if (this.ageTicks <= 80) {
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                              this.ageTicks = this.ageTicks + 1;
                                              if (this.ageTicks <= 50) {
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.owner != null) {
                                              this.battle.eraseUnitMask(this.owner, 0);
                                            }
                                            var9 = 25;
                                            var10Lifetime1 = this.subpixelX;
                                            var11Lifetime1 = this.subpixelY;
                                            var12Lifetime1 = 0;
                                            var13Lifetime1 = 0;
                                            while (var13Lifetime1 == 0) {
                                              if (this.battle.isSolidAt(this.y, this.x + 2, (byte) -83) ||
                                                this.battle.isSolidAt(this.y, this.x - 2, (byte) -83) ||
                                                this.battle.isSolidAt(this.y - 2, this.x, (byte) -83) ||
                                                this.battle.isSolidAt(this.y + 2, this.x, (byte) -83)) {
                                                var13Lifetime1 = 1;
                                              }
                                              var12Lifetime1++;
                                              this.subpixelY = this.subpixelY + (this.velocityY >> 1);
                                              this.subpixelX = this.subpixelX + (this.velocityX >> 1);
                                              this.y = this.subpixelY >> 4;
                                              this.x = this.subpixelX >> 4;
                                              if (-640 > this.x) {
                                                var13Lifetime1 = 1;
                                              }
                                              if ((640 + this.battle.arenaWidth) < this.x) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.battle.arenaHeight < this.y) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.y < -480) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (var12Lifetime1 <= var9) {
                                                continue;
                                              }
                                              var13Lifetime1 = 1;
                                            }
                                            this.velocityY = this.subpixelY - var11Lifetime1;
                                            this.velocityX = this.subpixelX - var10Lifetime1;
                                            this.subpixelY = var11Lifetime1;
                                            this.subpixelX = var10Lifetime1;
                                            this.y = this.subpixelY >> 4;
                                            this.x = this.subpixelX >> 4;
                                            regionExit5: {
                                              if (var12Lifetime1 <= var9 &&
                                                var12Lifetime1 > 5) {
                                                var14Lifetime1 = 0;
                                                while (var14Lifetime1 < var12Lifetime1) {
                                                  var15Lifetime1 = (this.velocityX * var14Lifetime1 / var12Lifetime1 >> 4) + this.x;
                                                  var16 = this.y + (var14Lifetime1 * this.velocityY / var12Lifetime1 >> 4);
                                                  var17 = Math.abs(var12Lifetime1 / 2 - var14Lifetime1);
                                                  var18 = (var12Lifetime1 * var12Lifetime1 / 4 - var17 * var17) / 4 + (-var14Lifetime1 + var12Lifetime1) * this.owner.getSize(-8323) / (2 * var12Lifetime1);
                                                  var16 = var16 + var18;
                                                  var5 = this.spawnFromHere(var15Lifetime1, (BattleUnit) null, (byte) 81, 151, var16, this.battle);
                                                  stackIn_953_0 = var5;
                                                  stackIn_950_1 = ScreenSwitchHelpers.field_f;
                                                  if (0 == (1 & var14Lifetime1)) {
                                                    stackIn_951_2 = 22;
                                                  } else {
                                                    if ((3 & var14Lifetime1) == 1) {
                                                      stackIn_951_2 = 26;
                                                    } else {
                                                      stackIn_951_2 = 27;
                                                    }
                                                  }
                                                  ((SpellProjectile) (stackIn_953_0)).sprite = ((IndexedSprite) (Object) stackIn_950_1[stackIn_951_2]).toRgbSprite();
                                                  ((SpellProjectile) (var5)).ageTicks = var18;
                                                  ((SpellProjectile) (var5)).field_x = 2 * var14Lifetime1;
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  var14Lifetime1++;
                                                }
                                                DropdownList.field_N = -1;
                                                stackIn_953_0Lifetime1 = this;
                                                this.ageTicks = 1;
                                                break regionExit5;
                                              }
                                              stackIn_957_0 = this.battle;
                                              stackIn_957_1 = 87;
                                              if (this.owner.linkedUnit != null) {
                                                stackIn_958_2 = this.owner.linkedUnit.unitId;
                                              } else {
                                                stackIn_958_2 = this.owner.unitId;
                                              }
                                              ((Battle) (Object) stackIn_957_0).resetSpellSlots(stackIn_957_1, stackIn_958_2, true);
                                              this.ageTicks = 51;
                                            }
                                            if (null != this.owner) {
                                              this.battle.stampUnitMask(-100, this.owner);
                                            }
                                            return;
                                          }
                                          if (var9 == 151) {
                                            if (0 < this.field_x) {
                                              this.field_x = this.field_x - 1;
                                              if (var19 == 0) {
                                                return;
                                              }
                                            }
                                            this.ageTicks = this.ageTicks - 1;
                                            if (this.ageTicks > 0) {
                                              return;
                                            }
                                            this.battle.spriteOverlapsTerrain(-8 + this.y, 2, this.x - 8, this.sprite);
                                            if (!BitHelpers.field_b) {
                                              this.battle.carveTerrainAndSprite(this.y - 8, -19, -8 + this.x, this.sprite);
                                            }
                                            this.remove(0);
                                            return;
                                          }
                                          if (var9 != 30 &&
                                            93 != var9) {
                                            if (var9 == 72 &&
                                              var19 == 0) {
                                              if (!this.owner.isDead(-1) &&
                                                (this.battle.arenaHeight + 128) > this.owner.y) {
                                                this.y = this.owner.y - (this.owner.size >> 1);
                                                this.x = this.owner.x;
                                                this.subpixelX = this.x << 4;
                                                this.subpixelY = this.y << 4;
                                                var9 = this.ageTicks * 4096 / 100;
                                                var10Lifetime1 = GradientBarPainter.sine(10, var9) >> 10;
                                                var11Lifetime1 = BevelBoxPainter.cosine(var9, -105) >> 10;
                                                this.ageTicks = this.ageTicks + 1;
                                                var5 = this.spawnFromHere(this.x - var10Lifetime1, (BattleUnit) null, (byte) 81, 95, this.y - var11Lifetime1, this.battle);
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var5 = this.spawnFromHere(this.x + var10Lifetime1, (BattleUnit) null, (byte) 81, 95, this.y - var11Lifetime1, this.battle);
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                if (!this.battle.spriteOverlapsTerrain(this.y - var11Lifetime1 - this.spriteRadius, 2, var10Lifetime1 + (this.x - this.spriteRadius), DateHelpers.field_a)) {
                                                  this.battle.carveTerrainAndSprite(-var11Lifetime1 + this.y - 8, -125, -8 + (this.x + var10Lifetime1), ScreenSwitchHelpers.field_f[7].toRgbSprite());
                                                }
                                                if (!this.battle.spriteOverlapsTerrain(this.y + (-var11Lifetime1 - this.spriteRadius), 2, -this.spriteRadius + (-var10Lifetime1 + this.x), DateHelpers.field_a)) {
                                                  this.battle.carveTerrainAndSprite(-8 + this.y - var11Lifetime1, -44, -8 + (this.x - var10Lifetime1), ScreenSwitchHelpers.field_f[7].toRgbSprite());
                                                }
                                                if (this.ageTicks <= 100) {
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 83) {
                                              if (!this.owner.isDead(-1) &&
                                                (this.battle.arenaHeight + 128) > this.owner.y) {
                                                this.x = this.owner.x;
                                                this.y = -(this.owner.size >> 1) + this.owner.y;
                                                this.subpixelY = this.y << 4;
                                                this.subpixelX = this.x << 4;
                                                var9 = 4096 * (this.ageTicks + this.x + this.y) / 100;
                                                var10Lifetime1 = GradientBarPainter.sine(117, var9) >> 10;
                                                var11Lifetime1 = BevelBoxPainter.cosine(var9, -112) >> 10;
                                                this.ageTicks = this.ageTicks + 20;
                                                var5 = this.spawnFromHere(var10Lifetime1 + this.x, this.owner, (byte) 81, 3, this.y + var11Lifetime1, this.battle);
                                                ((SpellProjectile) (var5)).velocityX = var10Lifetime1;
                                                ((SpellProjectile) (var5)).velocityY = var11Lifetime1;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                if (this.ageTicks < 200) {
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 22 &&
                                              var19 == 0) {
                                              QuickChatHelpers.field_b = -3 + (7 & this.ageTicks);
                                              if (0 == this.ageTicks) {
                                                this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                              }
                                              if (this.ageTicks == 50 &&
                                                this.battle.projectileSamples != null &&
                                                null != this.battle.projectileSamples[90]) {
                                                DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[90], this.battle.projectileSamples[90]);
                                              }
                                              this.ageTicks = this.ageTicks + 1;
                                              if (this.ageTicks % 15 == 1) {
                                                MidiPcmStream.field_L.setDeque((byte) 28, this.battle.units);
                                                var9_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-70));
                                                while (var9_ref_mlLifetime1 != null) {
                                                  stackOut_1133_0 = var9_ref_mlLifetime1.moving;
                                                  stackIn_1159_0 = stackOut_1133_0 ? 1 : 0;
                                                  stackIn_1134_0 = stackOut_1133_0;
                                                  if (!stackIn_1134_0) {
                                                    var9_ref_mlLifetime1.moving = true;
                                                    var9_ref_mlLifetime1.velocityY = -16;
                                                    var9_ref_mlLifetime1.velocityX = 64 * (HuffmanCodec.randomBelow(this.random, -2147483648, 256) & 2) - 32;
                                                    var5 = this.spawnFromHere(var9_ref_mlLifetime1.x + (int)(Math.random() * (double)var9_ref_mlLifetime1.size - (double)(var9_ref_mlLifetime1.size / 2)), (BattleUnit) null, (byte) 81, 90, var9_ref_mlLifetime1.y, this.battle);
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  if (var9_ref_mlLifetime1.unitType == 22 ||
                                                    23 == var9_ref_mlLifetime1.unitType ||
                                                    var9_ref_mlLifetime1.unitType == 21 ||
                                                    var9_ref_mlLifetime1.unitType == 24 ||
                                                    var9_ref_mlLifetime1.unitType == 20 ||
                                                    var9_ref_mlLifetime1.unitType == 35) {
                                                    var9_ref_mlLifetime1.pendingDamage = var9_ref_mlLifetime1.pendingDamage + 2;
                                                    var9_ref_mlLifetime1.moving = true;
                                                  }
                                                  var9_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                }
                                              }
                                              stackIn_1159_0Lifetime1 = this.ageTicks;
                                              if (stackIn_1159_0Lifetime1 <= 250) {
                                                return;
                                              }
                                              QuickChatHelpers.field_b = 0;
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 29 &&
                                              var19 == 0) {
                                              if (this.owner != null &&
                                                this.owner.isDead(-1)) {
                                                this.remove(0);
                                                return;
                                              }
                                              if (this.field_H > 0 ||
                                                this.ageTicks < 30) {
                                                this.ageTicks = this.ageTicks + 1;
                                              }
                                              if (1 == (7 & this.ageTicks)) {
                                                if (this.ageTicks == 1 ||
                                                  this.ageTicks == 33) {
                                                  this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                }
                                                var9 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 21, this.y, this.battle);
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                this.playSound(89, true);
                                                ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(126, var9) >> 11;
                                                ((SpellProjectile) (var5)).velocityY = -256 + (BevelBoxPainter.cosine(var9, -119) >> 9);
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (this.ageTicks <= 250) {
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 118) {
                                              this.ageTicks = this.ageTicks + 1;
                                              if (0 == this.ageTicks % 3) {
                                                var9 = this.x;
                                                this.x = this.owner.subpixelX + this.velocityX * this.ageTicks / 3 >> 4;
                                                var10Lifetime1 = this.y;
                                                this.y = -(this.owner.size / 2) + (this.owner.subpixelY + this.ageTicks * this.velocityY / 3 >> 4);
                                                this.applyAreaEffect(5, 64, 32, 8);
                                                this.playTypeSound(2, (byte) 37, 6);
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 129, this.y, this.battle);
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                this.x = var9;
                                                this.y = var10Lifetime1;
                                              }
                                              if (this.ageTicks <= 16) {
                                                return;
                                              }
                                              var9 = this.x;
                                              var10Lifetime1 = this.y;
                                              this.x = this.owner.subpixelX + this.velocityX * this.ageTicks / 3 >> 4;
                                              this.y = -(this.owner.size / 2) + (this.owner.subpixelY + this.velocityY * this.ageTicks / 3 >> 4);
                                              this.applyAreaEffect(10, 128, 48, 8);
                                              this.playTypeSound(1, (byte) 37, 6);
                                              var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 154, this.y, this.battle);
                                              this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.y = var10Lifetime1;
                                              this.x = var9;
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 != 79) {
                                              if (var9 != 98 ||
                                                var19 != 0) {
                                                if (var9 == 80 &&
                                                  var19 == 0) {
                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 87, this.y, this.battle);
                                                  ((SpellProjectile) (var5)).velocityX = (int)(Math.random() * 15.0) - 8;
                                                  ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY - 16;
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  if (this.owner.x < this.x) {
                                                    this.owner.field_M = -1;
                                                  }
                                                  if (this.x < this.owner.x) {
                                                    this.owner.field_M = 1;
                                                  }
                                                  this.ageTicks = this.ageTicks + 1;
                                                  if (this.ageTicks <= 50) {
                                                    return;
                                                  }
                                                  this.playTypeSound(0, (byte) 37, 1);
                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 89, this.y, this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.applyAreaEffect(75, 256, 80, 8);
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (69 == var9) {
                                                  if (!this.owner.isDead(-1) &&
                                                    this.owner.y < (128 + this.battle.arenaHeight)) {
                                                    this.field_x = this.field_x + 1;
                                                    this.y = this.owner.y;
                                                    this.x = this.owner.x;
                                                    if (this.field_x >= 12) {
                                                      this.field_x = this.field_x - 12;
                                                    }
                                                    boolean decompiledFrameCompleted1 = true;
                                                    if (this.ageTicks < 250) {
                                                      if (0 < this.ageTicks) {
                                                        this.ageTicks = this.ageTicks + 1;
                                                      }
                                                      MidiPcmStream.field_L.setDeque((byte) 121, this.battle.projectiles);
                                                      var9_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.first(-60));
                                                      while (null != var9_ref_mi) {
                                                        stackOut_1284_0 = var9_ref_mi;
                                                        stackIn_1322_0 = stackOut_1284_0;
                                                        stackIn_1285_0 = stackOut_1284_0;
                                                        stackIn_1322_1 = -139;
                                                        if (var19 != 0) {
                                                          decompiledFrameCompleted1 = false;
                                                          break;
                                                        }
                                                        if (((SpellProjectile) (Object) stackIn_1285_0).isAlive(stackIn_1322_1) &&
                                                          30 != var9_ref_mi.spellType &&
                                                          93 != var9_ref_mi.spellType &&
                                                          var9_ref_mi.spellType != 84 &&
                                                          118 != var9_ref_mi.spellType &&
                                                          var9_ref_mi.spellType != 119) {
                                                          var10Lifetime1 = -this.x + var9_ref_mi.x;
                                                          var11Lifetime1 = -this.y + var9_ref_mi.y;
                                                          if (var10Lifetime1 * var9_ref_mi.velocityX + var11Lifetime1 * var9_ref_mi.velocityY < 0) {
                                                            var12Lifetime1 = var10Lifetime1 * var10Lifetime1 + var11Lifetime1 * var11Lifetime1;
                                                            if (this.owner.unitType == 25) {
                                                              var12Lifetime1 = 3 * var12Lifetime1 / 2;
                                                            }
                                                            if (var12Lifetime1 < 65536) {
                                                              this.ageTicks = this.ageTicks + 1;
                                                              if (var12Lifetime1 > 0) {
                                                                var9_ref_mi.velocityX = var9_ref_mi.velocityX + Math.abs(var10Lifetime1) * 32 * var10Lifetime1 / var12Lifetime1;
                                                                var9_ref_mi.velocityY = var9_ref_mi.velocityY + Math.abs(var11Lifetime1) * var11Lifetime1 * 32 / var12Lifetime1;
                                                                if (var10Lifetime1 <= 0) {
                                                                  var9_ref_mi.velocityX = var9_ref_mi.velocityX - 5;
                                                                } else {
                                                                  var9_ref_mi.velocityX = var9_ref_mi.velocityX + 5;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var9_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    if (decompiledFrameCompleted1) {
                                                      this.subpixelY = this.y << 4;
                                                      stackIn_1322_0Lifetime1 = this;
                                                      stackIn_1322_1 = this.x << 4;
                                                    }
                                                    this.subpixelX = stackIn_1322_1;
                                                    return;
                                                  }
                                                  if (this.battle.getCurrentPlayer(false) == this.owner.unitId) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (138 == var9 &&
                                                  var19 == 0) {
                                                  if (this.owner.health > 0 &&
                                                    this.owner.y < (this.battle.arenaHeight + 128)) {
                                                    this.y = this.owner.y;
                                                    this.x = this.owner.x;
                                                    if (0 == this.ageTicks) {
                                                      if (null != this.owner && (null == this.owner.attachedProjectile ||
                                                        this.owner.attachedProjectile.spellType != 121)) {
                                                        this.owner.attachedProjectile = this;
                                                      }
                                                      MidiPcmStream.field_L.setDeque((byte) 117, this.battle.units);
                                                      var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-62));
                                                      while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                        if (var9_ref_mlLifetime1Lifetime1 != this.owner &&
                                                          this.ageTicks == 0) {
                                                          var10Lifetime1 = -var9_ref_mlLifetime1Lifetime1.x + this.x;
                                                          var11Lifetime1 = -(this.owner.size / 2) + this.y + (-var9_ref_mlLifetime1Lifetime1.y + var9_ref_mlLifetime1Lifetime1.size / 2);
                                                          if (Math.abs(var10Lifetime1) < ((var9_ref_mlLifetime1Lifetime1.size + this.owner.size * 4 / 3) / 2) &&
                                                            Math.abs(var11Lifetime1) < (this.owner.size * 4 / 3 + var9_ref_mlLifetime1Lifetime1.size) / 2) {
                                                            var12Lifetime1 = this.x;
                                                            this.x = var9_ref_mlLifetime1Lifetime1.x;
                                                            var13Lifetime1 = this.y;
                                                            if (var10Lifetime1 > 0) {
                                                              this.x = this.x - 4;
                                                            } else {
                                                              this.x = this.x + 4;
                                                            }
                                                            this.y = var9_ref_mlLifetime1Lifetime1.y;
                                                            this.y = this.y + 8;
                                                            var5 = this.spawnFromHere(this.owner.x, this.owner, (byte) 81, 139, this.owner.y, this.battle);
                                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            ((SpellProjectile) (var5)).velocityX = var10Lifetime1;
                                                            ((SpellProjectile) (var5)).velocityY = var11Lifetime1;
                                                            if (28 == this.owner.unitType) {
                                                              this.playTypeSound(2, (byte) 37, 6);
                                                              this.applyAreaEffect(5, 32, 16, 8);
                                                            }
                                                            if (this.owner.unitType == 29) {
                                                              this.playTypeSound(1, (byte) 37, 6);
                                                              this.applyAreaEffect(15, 32, 16, 8);
                                                            }
                                                            if (this.owner.unitType == 30) {
                                                              this.playTypeSound(0, (byte) 37, 6);
                                                              this.applyAreaEffect(30, 32, 16, 8);
                                                            }
                                                            this.x = var12Lifetime1;
                                                            this.y = var13Lifetime1;
                                                            this.ageTicks = 1;
                                                          }
                                                        }
                                                        var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    this.subpixelY = this.y << 4;
                                                    this.subpixelX = this.x << 4;
                                                    return;
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (var9 == 70 &&
                                                  var19 == 0) {
                                                  if (!this.owner.isDead(-1) &&
                                                    (128 + this.battle.arenaHeight) > this.owner.y) {
                                                    this.field_x = this.field_x + 1;
                                                    this.x = this.owner.x;
                                                    if (16 <= this.field_x) {
                                                      this.field_x = this.field_x - 16;
                                                    }
                                                    this.y = this.owner.y;
                                                    if (this.ageTicks < 5) {
                                                      MidiPcmStream.field_L.setDeque((byte) 116, this.battle.units);
                                                      var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-57));
                                                      while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                        if (~this.owner.ownerPlayer != ~var9_ref_mlLifetime1Lifetime1.ownerPlayer) {
                                                          var10Lifetime1 = -var9_ref_mlLifetime1Lifetime1.x + this.x;
                                                          var11Lifetime1 = this.y - (this.owner.size / 2 + (-(var9_ref_mlLifetime1Lifetime1.size / 2) + var9_ref_mlLifetime1Lifetime1.y));
                                                          if (Math.abs(var10Lifetime1) < 64 &&
                                                            Math.abs(var11Lifetime1) < 64) {
                                                            var12Lifetime1 = this.x;
                                                            this.x = var9_ref_mlLifetime1Lifetime1.x;
                                                            var13Lifetime1 = this.y;
                                                            this.y = var9_ref_mlLifetime1Lifetime1.y;
                                                            if (var10Lifetime1 >= 0) {
                                                              this.x = this.x - 8;
                                                            } else {
                                                              this.x = this.x + 8;
                                                            }
                                                            this.y = this.y + 8;
                                                            var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 100, this.y, this.battle);
                                                            this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.playTypeSound(2, (byte) 37, 2);
                                                            var14Lifetime1 = 0;
                                                            while (true) {
                                                              if (var14Lifetime1 < 5) {
                                                                var5 = this.spawnFromHere(this.x + (int)(-2.0 + Math.random() * 4.0), (BattleUnit) null, (byte) 81, 112, this.y + (int)(-2.0 + Math.random() * 4.0), this.battle);
                                                                ((SpellProjectile) (var5)).velocityX = (int)(32.0 * Math.random() - 16.0) << 4;
                                                                ((SpellProjectile) (var5)).velocityY = (int)(-16.0 + Math.random() * 32.0) << 4;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                var14Lifetime1++;
                                                                continue;
                                                              }
                                                              break;
                                                            }
                                                            this.applyAreaEffect(5, 32, 16, 8);
                                                            this.ageTicks = this.ageTicks + 1;
                                                            this.x = var12Lifetime1;
                                                            this.y = var13Lifetime1;
                                                          }
                                                        }
                                                        var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    this.subpixelY = this.y << 4;
                                                    this.subpixelX = this.x << 4;
                                                    return;
                                                  }
                                                  if (this.battle.getCurrentPlayer(false) == this.owner.unitId) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (var9 == 123) {
                                                  this.field_x = this.field_x + 1;
                                                  if (this.field_x >= 16) {
                                                    this.field_x = this.field_x - 16;
                                                  }
                                                  if (this.ageTicks == -1) {
                                                    this.ageTicks = 0;
                                                  }
                                                  scanLoop6: while (true) {
                                                    if (this.battle.arenaHeight > this.y) {
                                                      stackOut_1433_0 = this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, this.x - this.spriteRadius, this.sprite);
                                                      stackIn_1444_0 = stackOut_1433_0 ? 1 : 0;
                                                      stackIn_1434_0 = stackOut_1433_0;
                                                      if (var19 != 0) {
                                                        break scanLoop6;
                                                      }
                                                      if (!stackIn_1434_0) {
                                                        this.subpixelY = this.subpixelY + 16;
                                                        if (this.ageTicks == 0) {
                                                          this.ageTicks = -1;
                                                        }
                                                        this.y = this.subpixelY >> 4;
                                                        continue;
                                                      }
                                                    }
                                                    stackIn_1444_0 = this.y;
                                                    break;
                                                  }
                                                  if (stackIn_1444_0 < this.battle.arenaHeight) {
                                                    return;
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (126 == var9 &&
                                                  var19 == 0) {
                                                  if (this.owner.isDead(-1)) {
                                                    this.remove(0);
                                                    return;
                                                  }
                                                  this.field_x = this.field_x + 7;
                                                  if (this.field_x >= 255) {
                                                    this.field_x = this.field_x - 255;
                                                  }
                                                  if (!this.battle.isRecording(-28046)) {
                                                    var9 = -this.battle.arenaHeight;
                                                    while (true) {
                                                      if (var9 < this.y) {
                                                        var10Lifetime1 = this.x + (int)(Math.sin((double)(this.y - var9) * 3.14 / (double)(this.y + this.battle.arenaHeight)) * Math.cos(-((double)SpriteState.field_v * 0.1) + (double)(-var9)) * 64.0);
                                                        var5 = this.spawnFromHere(var10Lifetime1, (BattleUnit) null, (byte) 81, 129, var9 + (int)(32.0 * Math.random() - 16.0), this.battle);
                                                        this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        ((SpellProjectile) (var5)).velocityX = (int)(Math.random() * 5.0 - 2.0);
                                                        ((SpellProjectile) (var5)).velocityY = -64;
                                                        ((SpellProjectile) (var5)).field_x = 1;
                                                        var9 += 32;
                                                        continue;
                                                      }
                                                      break;
                                                    }
                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 129, this.y, this.battle);
                                                    ((SpellProjectile) (var5)).velocityX = (int)(-64.0 + Math.random() * 128.0);
                                                    ((SpellProjectile) (var5)).velocityY = -(int)Math.sqrt((double)(-(((SpellProjectile) (var5)).velocityX * ((SpellProjectile) (var5)).velocityX) + 4096));
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  if (this.ageTicks == -1) {
                                                    this.ageTicks = 0;
                                                  }
                                                  while (this.y < this.battle.arenaHeight &&
                                                    !this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, -this.spriteRadius + this.x, this.sprite)) {
                                                    this.subpixelY = this.subpixelY + 16;
                                                    this.y = this.subpixelY >> 4;
                                                    if (0 != this.ageTicks) {
                                                      continue;
                                                    }
                                                    this.ageTicks = -1;
                                                  }
                                                  if (this.ageTicks >= 25) {
                                                    this.ageTicks = this.ageTicks + 1;
                                                    if (this.ageTicks <= 27) {
                                                      return;
                                                    }
                                                    this.ageTicks = 0;
                                                    return;
                                                  }
                                                  if (this.ageTicks > 0) {
                                                    this.ageTicks = this.ageTicks + 1;
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 51, this.battle.projectiles);
                                                  var9_ref_miLifetime1 = (SpellProjectile) (MidiPcmStream.field_L.first(-62));
                                                  while (null != var9_ref_miLifetime1) {
                                                    stackOut_1493_0 = var9_ref_miLifetime1;
                                                    stackIn_1544_0 = stackOut_1493_0;
                                                    stackIn_1494_0 = stackOut_1493_0;
                                                    regionExit7: {
                                                      if (((SpellProjectile) (Object) stackIn_1494_0).isAlive(-139) &&
                                                        126 != var9_ref_miLifetime1.spellType &&
                                                        var9_ref_miLifetime1.spellType != 30 &&
                                                        93 != var9_ref_miLifetime1.spellType &&
                                                        84 != var9_ref_miLifetime1.spellType) {
                                                        var10Lifetime1 = var9_ref_miLifetime1.x - this.x;
                                                        var11Lifetime1 = -this.y + var9_ref_miLifetime1.y;
                                                        if (0 > var11Lifetime1 &&
                                                          Math.abs(var10Lifetime1) < 128) {
                                                          if (46 != var9_ref_miLifetime1.spellType &&
                                                            var9_ref_miLifetime1.spellType != 25) {
                                                            var9_ref_miLifetime1.velocityY = var9_ref_miLifetime1.velocityY - 5;
                                                          }
                                                          if (0 <= var10Lifetime1) {
                                                            if (var9_ref_miLifetime1.velocityX < 0) {
                                                              var9_ref_miLifetime1.velocityX = var9_ref_miLifetime1.velocityX + 4;
                                                            } else {
                                                              var9_ref_miLifetime1.velocityX = var9_ref_miLifetime1.velocityX + 4;
                                                            }
                                                            break regionExit7;
                                                          }
                                                          if (var9_ref_miLifetime1.velocityX <= 0) {
                                                            var9_ref_miLifetime1.velocityX = var9_ref_miLifetime1.velocityX - 4;
                                                          } else {
                                                            var9_ref_miLifetime1.velocityX = var9_ref_miLifetime1.velocityX - 4;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9_ref_miLifetime1 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 77, this.battle.units);
                                                  stackIn_1544_0Lifetime1 = MidiPcmStream.field_L.first(-78);
                                                  var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (stackIn_1544_0Lifetime1);
                                                  while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                    if (var9_ref_mlLifetime1Lifetime1.moving) {
                                                      var10Lifetime1 = var9_ref_mlLifetime1Lifetime1.x - this.x;
                                                      var11Lifetime1 = -this.y + var9_ref_mlLifetime1Lifetime1.y;
                                                      if (var11Lifetime1 < 0 &&
                                                        Math.abs(var10Lifetime1) < 128) {
                                                        if (0 > var10Lifetime1) {
                                                          if (!(var9_ref_mlLifetime1Lifetime1.velocityX <= 0)) {
                                                            if (var9_ref_mlLifetime1Lifetime1.velocityX < 20) {
                                                              var9_ref_mlLifetime1Lifetime1.velocityX = -60;
                                                            } else {
                                                              var9_ref_mlLifetime1Lifetime1.velocityX = var9_ref_mlLifetime1Lifetime1.velocityX - 8;
                                                            }
                                                          }
                                                        } else {
                                                          if (0 > var9_ref_mlLifetime1Lifetime1.velocityX) {
                                                            if (var9_ref_mlLifetime1Lifetime1.velocityX > -20) {
                                                              var9_ref_mlLifetime1Lifetime1.velocityX = 60;
                                                            } else {
                                                              var9_ref_mlLifetime1Lifetime1.velocityX = var9_ref_mlLifetime1Lifetime1.velocityX + 8;
                                                            }
                                                          }
                                                        }
                                                        this.ageTicks = this.ageTicks + 1;
                                                      }
                                                    }
                                                    var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                  }
                                                  return;
                                                }
                                                if (var9 != 15) {
                                                  regionExit8: {
                                                    regionExit9: {
                                                      regionExit10: {
                                                        regionExit11: {
                                                          if (148 == var9) {
                                                            if (!this.owner.isDead(-1) &&
                                                              128 + this.battle.arenaHeight > this.owner.y) {
                                                              this.field_x = this.field_x + 1;
                                                              if (this.field_x >= 256) {
                                                                this.field_x = this.field_x - 256;
                                                              }
                                                              this.x = this.owner.x;
                                                              this.y = this.owner.y;
                                                              this.subpixelY = this.y << 4;
                                                              this.subpixelX = this.x << 4;
                                                              if (var19 == 0) {
                                                                return;
                                                              }
                                                              break regionExit11;
                                                            }
                                                            if (this.battle.getCurrentPlayer(false) == this.owner.unitId) {
                                                            }
                                                            this.remove(0);
                                                            return;
                                                          }
                                                          if (121 != var9) {
                                                            if (106 == var9) {
                                                              break regionExit10;
                                                            }
                                                            if (var9 == 107) {
                                                              break regionExit9;
                                                            }
                                                            if (68 == var9) {
                                                              break regionExit8;
                                                            }
                                                            if ((47 != var9 ||
                                                              var19 != 0) &&
                                                              (71 != var9 ||
                                                              var19 != 0)) {
                                                              if (var9 == 142 &&
                                                                var19 == 0) {
                                                                if (this.owner == null) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.owner.isDead(-1)) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.y = -240;
                                                                if (100 > this.ageTicks) {
                                                                  this.y = this.y - 2 * (100 - this.ageTicks);
                                                                }
                                                                if (400 < this.ageTicks) {
                                                                  this.y = this.y - (this.ageTicks * 2 - 800);
                                                                }
                                                                this.subpixelX = this.x << 4;
                                                                this.field_x = this.field_x + 1;
                                                                this.subpixelY = this.y << 4;
                                                                if (100 < this.field_x) {
                                                                  this.field_x = this.field_x - 100;
                                                                }
                                                                if (this.ageTicks != 100 &&
                                                                  200 != this.ageTicks &&
                                                                  this.ageTicks != 300 &&
                                                                  this.ageTicks != 400) {
                                                                  if (this.ageTicks == 101 ||
                                                                    this.ageTicks == 0 ||
                                                                    this.ageTicks == 201 ||
                                                                    this.ageTicks == 301 ||
                                                                    this.ageTicks == 401 ||
                                                                    this.random == null) {
                                                                    this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                    this.playSound(165, true);
                                                                  }
                                                                  this.ageTicks = this.ageTicks + 1;
                                                                  var9 = 15;
                                                                  if (this.ageTicks > 100) {
                                                                    var9 = 7;
                                                                  }
                                                                  if (200 < this.ageTicks) {
                                                                    var9 = 3;
                                                                  }
                                                                  if (this.ageTicks > 300) {
                                                                    var9 = 1;
                                                                  }
                                                                  if (this.ageTicks > 400 ||
                                                                    (this.ageTicks & var9) == 0) {
                                                                    var10Lifetime1 = -128 + (this.x + HuffmanCodec.randomBelow(this.random, -2147483648, 256));
                                                                    var11Lifetime1 = 48 + (this.y + HuffmanCodec.randomBelow(this.random, -2147483648, 16));
                                                                    var12Lifetime1 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                    var5 = this.spawnFromHere(var10Lifetime1, (BattleUnit) null, (byte) 81, 135, var11Lifetime1, this.battle);
                                                                    if (this.battle.projectileSamples != null &&
                                                                      null != this.battle.projectileSamples[CacheEntry.field_n[7][1]]) {
                                                                      IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.battle.projectileSamples[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 8);
                                                                    }
                                                                    ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(113, var12Lifetime1) >> 11;
                                                                    ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var12Lifetime1, -101) >> 11) + 32;
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  }
                                                                } else {
                                                                  MidiPcmStream.field_L.setDeque((byte) 75, this.battle.projectiles);
                                                                  var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.first(-43));
                                                                  while (true) {
                                                                    if (null != var9_ref_miLifetime2) {
                                                                      stackOut_2016_0 = var9_ref_miLifetime2;
                                                                      stackIn_2042_0 = stackOut_2016_0;
                                                                      stackIn_2017_0 = stackOut_2016_0;
                                                                      stackIn_2042_1 = -139;
                                                                      if (((SpellProjectile) (Object) stackIn_2017_0).isAlive(stackIn_2042_1) &&
                                                                        var9_ref_miLifetime2.owner != this.owner &&
                                                                        30 != var9_ref_miLifetime2.spellType &&
                                                                        var9_ref_miLifetime2.spellType != 84) {
                                                                        var10Lifetime1 = var9_ref_miLifetime2.x - this.x;
                                                                        var11Lifetime1 = var9_ref_miLifetime2.y - this.y;
                                                                        if (var9_ref_miLifetime2.velocityY * var11Lifetime1 + var10Lifetime1 * var9_ref_miLifetime2.velocityX < 0) {
                                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                                          if (var12Lifetime1 < 65536 &&
                                                                            var12Lifetime1 > 0) {
                                                                            var9_ref_miLifetime2.velocityX = var9_ref_miLifetime2.velocityX - Math.abs(var10Lifetime1) * var10Lifetime1 * 32 / var12Lifetime1;
                                                                          }
                                                                        }
                                                                      }
                                                                      var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                                      continue;
                                                                    }
                                                                    break;
                                                                  }
                                                                  stackIn_2042_0Lifetime1 = this;
                                                                  stackIn_2042_1Lifetime1 = -128 + this.x + (int)(Math.random() * 256.0);
                                                                  var5 = this.spawnFromHere(stackIn_2042_1Lifetime1, (BattleUnit) null, (byte) 81, 132, this.y + 48 + (int)(Math.random() * 16.0), this.battle);
                                                                  var9 = (int)(Math.random() * 256.0);
                                                                  ((SpellProjectile) (var5)).velocityX = 0;
                                                                  var10_double = 3.141592653589793 * (double)var9 / 128.0;
                                                                  ((SpellProjectile) (var5)).velocityY = 32 + (int)(Math.cos(var10_double) * 32.0);
                                                                  ((SpellProjectile) (var5)).field_x = 1;
                                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                }
                                                                if (this.ageTicks < 500) {
                                                                  return;
                                                                }
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (var9 == 136) {
                                                                this.ageTicks = this.ageTicks + 1;
                                                                if (this.ageTicks > 480) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                var9 = 31 * this.ageTicks % 480;
                                                                var5 = this.spawnFromHere(-320, (BattleUnit) null, (byte) 81, 152, this.battle.arenaHeight - var9, this.battle);
                                                                ((SpellProjectile) (var5)).velocityY = -var9;
                                                                ((SpellProjectile) (var5)).velocityX = 128;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                var5 = this.spawnFromHere(320 + this.battle.arenaWidth, (BattleUnit) null, (byte) 81, 152, this.battle.arenaHeight - var9, this.battle);
                                                                ((SpellProjectile) (var5)).velocityX = -128;
                                                                ((SpellProjectile) (var5)).velocityY = -var9;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                return;
                                                              }
                                                              if (var9 == 134) {
                                                                if (this.owner != null &&
                                                                  0 >= this.owner.health) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.ageTicks != 100 &&
                                                                  this.ageTicks != 200) {
                                                                  this.ageTicks = this.ageTicks + 1;
                                                                }
                                                                var7 = -1;
                                                                if (this.ageTicks == 102 ||
                                                                  this.ageTicks == 202 ||
                                                                  null == this.random) {
                                                                  this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                }
                                                                var7Lifetime4 = 132;
                                                                if (100 <= this.ageTicks) {
                                                                  if (this.ageTicks % 2 == 1 &&
                                                                    this.ageTicks > 75) {
                                                                    var7Lifetime4 = 152;
                                                                    if (var19 != 0 && (this.ageTicks % 2 == 1 &&
                                                                      this.ageTicks > 75)) {
                                                                      var7Lifetime4 = 152;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (this.ageTicks % 2 == 1 &&
                                                                    this.ageTicks > 75) {
                                                                    var7Lifetime4 = 152;
                                                                  }
                                                                }
                                                                if (this.ageTicks >= 300) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                var8 = 1;
                                                                if (132 == var7Lifetime4) {
                                                                  var8 = 2 + (-(this.ageTicks / 100) + 5);
                                                                }
                                                                var9 = 0;
                                                                while (var9 < var8) {
                                                                  if (var19 != 0) {
                                                                    return;
                                                                  }
                                                                  if (var7Lifetime4 != -1) {
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, var7Lifetime4, this.y, this.battle);
                                                                  }
                                                                  if (null != var5) {
                                                                    var10Lifetime1 = (int)(Math.random() * 8192.0);
                                                                    if (var7Lifetime4 != 132) {
                                                                      var10Lifetime1 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                    }
                                                                    ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-17, var10Lifetime1) >> 9;
                                                                    ((SpellProjectile) (var5)).velocityY = -256 + (BevelBoxPainter.cosine(var10Lifetime1, -101) >> 9);
                                                                    if (var7Lifetime4 == 152) {
                                                                      ((SpellProjectile) (var5)).velocityX = ((SpellProjectile) (var5)).velocityX >> 1;
                                                                      ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY >> 1;
                                                                      ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY - 96;
                                                                      ((SpellProjectile) (var5)).ageTicks = HuffmanCodec.randomBelow(this.random, -2147483648, 200);
                                                                      ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).x - 2 * ((SpellProjectile) (var5)).velocityX;
                                                                      ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                                                                    } else {
                                                                      ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY >> 2;
                                                                      ((SpellProjectile) (var5)).velocityX = ((SpellProjectile) (var5)).velocityX >> 1;
                                                                      ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY - 16;
                                                                      var11Lifetime1 = this.ageTicks * 48 / 500 + 48;
                                                                      ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).x + (int)((double)var11Lifetime1 * Math.random() - (double)(var11Lifetime1 / 2));
                                                                      ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).x - 2 * ((SpellProjectile) (var5)).velocityX;
                                                                      ((SpellProjectile) (var5)).y = ((SpellProjectile) (var5)).y + 16;
                                                                      ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                                                                      ((SpellProjectile) (var5)).field_x = 1;
                                                                      ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).y << 4;
                                                                      ((SpellProjectile) (var5)).ageTicks = (int)(4.0 * Math.random() - 10.0);
                                                                    }
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  }
                                                                  var9++;
                                                                }
                                                                return;
                                                              }
                                                              if (var9 == 36) {
                                                                if (this.owner != null &&
                                                                  this.owner.isDead(-1)) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.y = -240;
                                                                this.field_x = this.field_x + 1;
                                                                if (100 < this.field_x) {
                                                                  this.field_x = this.field_x - 100;
                                                                }
                                                                var5 = this.spawnFromHere(this.x + ((int)(-50.0 + Math.random() * 100.0) + (int)(96.0 * Math.sin(0.01 * (6.28 * (double)this.field_x)))), (BattleUnit) null, (byte) 81, 112, 48 + (this.y + (int)(Math.random() * 8.0)), this.battle);
                                                                ((SpellProjectile) (var5)).velocityX = (int)(-256.0 + Math.random() * 512.0);
                                                                ((SpellProjectile) (var5)).velocityY = -(int)(Math.random() * 512.0) + 192;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                if (this.ageTicks == 100) {
                                                                  return;
                                                                }
                                                                if (200 == this.ageTicks) {
                                                                  return;
                                                                }
                                                                if (this.ageTicks == 201 ||
                                                                  this.ageTicks == 101 ||
                                                                  this.ageTicks == 0 ||
                                                                  null == this.random) {
                                                                  this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                }
                                                                this.ageTicks = this.ageTicks + 1;
                                                                if (this.ageTicks == 300) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.ageTicks % 15 != 10) {
                                                                  return;
                                                                }
                                                                var9 = HuffmanCodec.randomBelow(this.random, -2147483648, 320) - 160;
                                                                this.playSound(100, true);
                                                                var5 = this.spawnFromHere(this.x + var9, (BattleUnit) null, (byte) 81, 84, 48 + this.y, this.battle);
                                                                ((SpellProjectile) (var5)).velocityX = 0;
                                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                ((SpellProjectile) (var5)).ageTicks = 45;
                                                                ((SpellProjectile) (var5)).velocityY = 256;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                return;
                                                              }
                                                              if (var9 != 19) {
                                                                if (62 == var9 &&
                                                                  var19 == 0) {
                                                                  if (this.owner != null &&
                                                                    !this.owner.isDead(-1)) {
                                                                    this.field_x = this.field_x + 1;
                                                                    if (this.ageTicks != 100 &&
                                                                      this.ageTicks != 200 &&
                                                                      this.ageTicks != 300 &&
                                                                      this.ageTicks != 400) {
                                                                      this.ageTicks = this.ageTicks + 1;
                                                                    }
                                                                    if (256 <= this.field_x) {
                                                                      this.field_x = this.field_x - 256;
                                                                    }
                                                                    var7Lifetime1 = -1;
                                                                    if (this.ageTicks == 102 ||
                                                                      this.ageTicks == 202 ||
                                                                      this.ageTicks == 302 ||
                                                                      this.ageTicks == 402 ||
                                                                      null == this.random) {
                                                                      this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                    }
                                                                    if (this.ageTicks == 10) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 110) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 115) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 210) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 215) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 220) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (310 == this.ageTicks) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 315) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.ageTicks == 320) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (325 == this.ageTicks) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (410 == this.ageTicks) {
                                                                      var7Lifetime1 = 64;
                                                                    }
                                                                    if (500 == this.ageTicks) {
                                                                      this.remove(0);
                                                                      return;
                                                                    }
                                                                    if (var7Lifetime1 != -1) {
                                                                      var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, var7Lifetime1, -480, this.battle);
                                                                    }
                                                                    if (var5 == null) {
                                                                      return;
                                                                    }
                                                                    var9 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                    ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(127, var9) >> 11;
                                                                    ((SpellProjectile) (var5)).velocityY = 0;
                                                                    if (var7Lifetime1 == 64) {
                                                                      ((SpellProjectile) (var5)).velocityX = 0;
                                                                    }
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    return;
                                                                  }
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (var9 == 77 &&
                                                                  var19 == 0) {
                                                                  this.ageTicks = this.ageTicks + 1;
                                                                  if (this.ageTicks < this.owner.health) {
                                                                    return;
                                                                  }
                                                                  var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 101, this.y, this.battle);
                                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  this.owner.y = 1000 + this.battle.arenaHeight;
                                                                  if (this.owner.health >= 50) {
                                                                    if (this.owner.health < 100) {
                                                                      this.playTypeSound(1, (byte) 37, 9);
                                                                    } else {
                                                                      this.playTypeSound(0, (byte) 37, 9);
                                                                    }
                                                                  } else {
                                                                    this.playTypeSound(2, (byte) 37, 9);
                                                                  }
                                                                  this.applyAreaEffect(this.owner.health, this.owner.health + this.owner.size, this.owner.health * 2 + this.owner.size, 8);
                                                                  this.owner.y = this.battle.arenaHeight + 128;
                                                                  this.owner.pendingDamage = 1;
                                                                  this.owner.health = 0;
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if ((139 != var9 ||
                                                                  var19 != 0) &&
                                                                  var9 != 78) {
                                                                  if (2 == var9 &&
                                                                    var19 == 0) {
                                                                    this.ageTicks = this.ageTicks + 1;
                                                                    if (25 > this.ageTicks) {
                                                                      return;
                                                                    }
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 101, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.playTypeSound(0, (byte) 37, 9);
                                                                    this.applyAreaEffect(15, 256, 96, 8);
                                                                    this.remove(0);
                                                                    return;
                                                                  }
                                                                  if (var9 == 74 &&
                                                                    var19 == 0) {
                                                                    var9 = 20;
                                                                    this.ageTicks = this.ageTicks + 1;
                                                                    if (this.owner.unitType == 27) {
                                                                      var9 = 50;
                                                                    }
                                                                    if (null == this.random) {
                                                                      this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                    }
                                                                    if (var9 >= this.ageTicks &&
                                                                      this.owner.pendingDamage <= 0) {
                                                                      if (Math.abs(this.ageTicks) % 5 != 0) {
                                                                        return;
                                                                      }
                                                                      var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 0, this.y, this.battle);
                                                                      ((SpellProjectile) (var5)).velocityX = (this.velocityX >> 1) + (HuffmanCodec.randomBelow(this.random, -2147483648, 65) - 32);
                                                                      ((SpellProjectile) (var5)).velocityY = -32 + (this.velocityY >> 1) + HuffmanCodec.randomBelow(this.random, -2147483648, 65);
                                                                      ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                      return;
                                                                    }
                                                                    this.remove(0);
                                                                    return;
                                                                  }
                                                                  if (var9 != 141) {
                                                                    this.detonate(6016, targetX, targetY, round);
                                                                    if (var19 == 0) {
                                                                      return;
                                                                    }
                                                                    break regionExit1;
                                                                  }
                                                                  if (this.random == null) {
                                                                    this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                                  }
                                                                  this.ageTicks = this.ageTicks + 1;
                                                                  if (this.ageTicks % 5 == 4) {
                                                                    this.playTypeSound(1, (byte) 37, 7);
                                                                  }
                                                                  var9 = 90;
                                                                  if (this.ageTicks <= var9 && (null == this.owner ||
                                                                    !(0 < this.owner.pendingDamage))) {
                                                                    if (this.ageTicks % 3 != 0) {
                                                                      return;
                                                                    }
                                                                    var5 = this.spawnFromHere(-15 + (this.x + HuffmanCodec.randomBelow(this.random, -2147483648, 31)), this.owner, (byte) 81, 135, this.y, this.battle);
                                                                    ((SpellProjectile) (var5)).velocityX = 0 + (HuffmanCodec.randomBelow(this.random, -2147483648, 3) - 1);
                                                                    ((SpellProjectile) (var5)).velocityY = 64 - (-HuffmanCodec.randomBelow(this.random, -2147483648, 31) + 15);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    return;
                                                                  }
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.ageTicks = this.ageTicks + 1;
                                                                if (this.owner != null) {
                                                                  this.owner.attachedProjectile = this;
                                                                }
                                                                if (this.ageTicks == 13) {
                                                                  if (5 == this.owner.unitType) {
                                                                    this.playTypeSound(1, (byte) 37, 3);
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 94, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(30, 256, 64, 8);
                                                                  }
                                                                  if (this.owner.unitType == 2) {
                                                                    this.playTypeSound(1, (byte) 37, 1);
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 86, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(30, 256, 64, 8);
                                                                  }
                                                                  if (this.owner.unitType == 9) {
                                                                    this.playTypeSound(0, (byte) 37, 5);
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 108, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(75, 256, 64, 8);
                                                                  }
                                                                  if (this.owner.unitType == 39) {
                                                                    this.playTypeSound(0, (byte) 37, 0);
                                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 163, this.y, this.battle);
                                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(50, 64, 96, 8);
                                                                  }
                                                                }
                                                                if (this.ageTicks < 25) {
                                                                  return;
                                                                }
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (this.owner != null &&
                                                                this.owner.isDead(-1)) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (this.ageTicks != 100 &&
                                                                this.ageTicks != 200 &&
                                                                this.ageTicks != 300 &&
                                                                this.ageTicks != 400) {
                                                                this.ageTicks = this.ageTicks + 1;
                                                              }
                                                              if (102 == this.ageTicks ||
                                                                this.ageTicks == 202 ||
                                                                this.ageTicks == 302 ||
                                                                this.ageTicks == 402 ||
                                                                this.random == null) {
                                                                this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                              }
                                                              var7Lifetime2 = -1;
                                                              var7Lifetime3 = 87;
                                                              if (0.5 > Math.random()) {
                                                                var7Lifetime3 = 88;
                                                              }
                                                              if (this.ageTicks == 10) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (15 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 20) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 25) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 30) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 110) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (115 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 120) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 125) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (130 == this.ageTicks) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 210) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (215 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (220 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 225) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 230) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 212) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 217) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 222) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 227) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 232) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (310 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 315) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 320) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 325) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 330) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 312) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 317) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (322 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 327) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 332) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 314) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 319) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 324) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 329) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 334) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (402 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (404 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 406) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 408) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (409 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 410) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 415) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (420 == this.ageTicks) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 425) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.ageTicks == 430) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (412 == this.ageTicks) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 417) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 422) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 427) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks == 432) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.ageTicks % 100 != 0 &&
                                                                this.ageTicks % 10 == 9) {
                                                                var9 = this.ageTicks * 64 / 500 + 64;
                                                                var10Lifetime1 = this.battle.arenaHeight;
                                                                if (this.ageTicks < 100) {
                                                                  var10Lifetime1 = var10Lifetime1 - (64 + 64 * this.ageTicks / 500) * this.ageTicks / 100;
                                                                  if (var19 != 0) {
                                                                    var10Lifetime1 = var10Lifetime1 - var9;
                                                                  }
                                                                } else {
                                                                  var10Lifetime1 = var10Lifetime1 - var9;
                                                                }
                                                                if (null == LoginStackHelpers.field_e) {
                                                                  LoginStackHelpers.field_e = new Sprite(512, 128);
                                                                }
                                                                LoginStackHelpers.field_e.makeRasterTarget();
                                                                SoftwareRasterizer.fillRectangle(0, 0, 512, 128, 0);
                                                                MeshModel.field_M.drawScaled(0, 0, 4 * var9, var9);
                                                                this.battle.carveTerrainAndSprite(var10Lifetime1, -38, -(2 * var9) + this.x, LoginStackHelpers.field_e);
                                                              }
                                                              if (this.ageTicks >= 500) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              var8Lifetime1 = 1;
                                                              if (var7Lifetime3 == 87 ||
                                                                var7Lifetime3 == 88) {
                                                                var8Lifetime1 = 7 - this.ageTicks / 100;
                                                              }
                                                              var9 = 0;
                                                              while (var8Lifetime1 > var9) {
                                                                if (var19 != 0) {
                                                                  return;
                                                                }
                                                                if (var7Lifetime3 != -1) {
                                                                  var10Lifetime1 = 64 + this.ageTicks * 64 / 500;
                                                                  if (this.ageTicks < 100) {
                                                                    var10Lifetime1 = this.ageTicks * (64 * this.ageTicks / 500 + 64) / 100;
                                                                  }
                                                                  var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, var7Lifetime3, -var10Lifetime1 + this.y, this.battle);
                                                                }
                                                                if (var5 != null) {
                                                                  var10Lifetime1 = (int)(8192.0 * Math.random());
                                                                  if (87 != var7Lifetime3 &&
                                                                    var7Lifetime3 != 88) {
                                                                    var10Lifetime1 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                  }
                                                                  if (var7Lifetime3 == 10) {
                                                                    this.playSound(76, true);
                                                                  }
                                                                  if (var7Lifetime3 == 67) {
                                                                    this.playSound(83, true);
                                                                  }
                                                                  ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(123, var10Lifetime1) >> 9;
                                                                  ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var10Lifetime1, -101) >> 9) - 256;
                                                                  if (var7Lifetime3 == 10) {
                                                                    ((SpellProjectile) (var5)).velocityX = ((SpellProjectile) (var5)).velocityX >> 1;
                                                                    ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY - 64;
                                                                  }
                                                                  ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                  if (67 == var7Lifetime3 ||
                                                                    var7Lifetime3 == 13) {
                                                                    ((SpellProjectile) (var5)).velocityX = ((SpellProjectile) (var5)).velocityX >> 2;
                                                                    ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY - 128;
                                                                    ((SpellProjectile) (var5)).ageTicks = HuffmanCodec.randomBelow(this.random, -2147483648, 200);
                                                                  }
                                                                  if (var7Lifetime3 == 87 ||
                                                                    var7Lifetime3 == 88) {
                                                                    ((SpellProjectile) (var5)).velocityY = ((SpellProjectile) (var5)).velocityY >> 2;
                                                                    ((SpellProjectile) (var5)).velocityX = ((SpellProjectile) (var5)).velocityX >> 2;
                                                                    var11Lifetime1 = 48 + this.ageTicks * 48 / 500;
                                                                    ((SpellProjectile) (var5)).x = ((SpellProjectile) (var5)).x + (int)((double)(-(var11Lifetime1 / 2)) + (double)var11Lifetime1 * Math.random());
                                                                    ((SpellProjectile) (var5)).y = ((SpellProjectile) (var5)).y + 16;
                                                                    ((SpellProjectile) (var5)).subpixelX = ((SpellProjectile) (var5)).x << 4;
                                                                    ((SpellProjectile) (var5)).subpixelY = ((SpellProjectile) (var5)).y << 4;
                                                                    if (var7Lifetime3 == 87) {
                                                                      ((SpellProjectile) (var5)).field_x = 1;
                                                                    }
                                                                    ((SpellProjectile) (var5)).ageTicks = (int)(-10.0 + Math.random() * 4.0);
                                                                  }
                                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                }
                                                                var9++;
                                                              }
                                                              return;
                                                            }
                                                            if (this.owner == null) {
                                                              this.remove(0);
                                                              return;
                                                            }
                                                            if (5 == this.owner.unitType) {
                                                              this.x = this.owner.x;
                                                              if (this.owner.y >= (this.battle.arenaHeight + 128)) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                            }
                                                            if (this.owner.isDead(-1)) {
                                                              this.remove(0);
                                                              return;
                                                            }
                                                            this.y = -240;
                                                            if (this.ageTicks < 100) {
                                                              this.y = this.y - 2 * (-this.ageTicks + 100);
                                                            }
                                                            if (this.ageTicks > 400) {
                                                              this.y = this.y - (this.ageTicks * 2 - 800);
                                                            }
                                                            this.subpixelX = this.x << 4;
                                                            this.subpixelY = this.y << 4;
                                                            this.field_x = this.field_x + 1;
                                                            if (this.field_x > 100) {
                                                              this.field_x = this.field_x - 100;
                                                            }
                                                            if (100 != this.ageTicks &&
                                                              this.ageTicks != 200 &&
                                                              this.ageTicks != 300 &&
                                                              400 != this.ageTicks) {
                                                              if (this.ageTicks == 101 ||
                                                                this.ageTicks == 0 ||
                                                                this.ageTicks == 201 ||
                                                                this.ageTicks == 301 ||
                                                                this.ageTicks == 401 ||
                                                                this.random == null) {
                                                                this.random = new IsaacRandom(new int[]{this.battle.randomSeed, round, this.x, this.y});
                                                              }
                                                              this.ageTicks = this.ageTicks + 1;
                                                              if (this.owner.unitType != 5 ||
                                                                this.ageTicks > 100) {
                                                                if (71 != this.spellType) {
                                                                  var9 = this.x - (-HuffmanCodec.randomBelow(this.random, -2147483648, 256) + 128);
                                                                  var10Lifetime1 = this.y - (-HuffmanCodec.randomBelow(this.random, -2147483648, 16) - 48);
                                                                  var11Lifetime1 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                  var5 = this.spawnFromHere(var9, (BattleUnit) null, (byte) 81, 46, var10Lifetime1, this.battle);
                                                                  ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(125, var11Lifetime1) >> 11;
                                                                  ((SpellProjectile) (var5)).velocityY = (BevelBoxPainter.cosine(var11Lifetime1, -104) >> 11) + 32;
                                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                } else {
                                                                  var9 = this.x + HuffmanCodec.randomBelow(this.random, -2147483648, 192) - 96;
                                                                  var10Lifetime1 = this.y + (48 + HuffmanCodec.randomBelow(this.random, -2147483648, 16));
                                                                  var5 = this.spawnFromHere(var9, (BattleUnit) null, (byte) 81, 46, var10Lifetime1, this.battle);
                                                                  var11Lifetime1 = HuffmanCodec.randomBelow(this.random, -2147483648, 8192);
                                                                  ((SpellProjectile) (var5)).velocityX = GradientBarPainter.sine(-2, var11Lifetime1) >> 11;
                                                                  ((SpellProjectile) (var5)).velocityY = 32 + (BevelBoxPainter.cosine(var11Lifetime1, -128) >> 11);
                                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  if (100 != this.ageTicks &&
                                                                    this.ageTicks != 200 &&
                                                                    this.ageTicks != 300 &&
                                                                    400 != this.ageTicks) {
                                                                    this.ageTicks = this.ageTicks + 1;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.spellType != 71) {
                                                                MidiPcmStream.field_L.setDeque((byte) 100, this.battle.projectiles);
                                                                var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.first(-123));
                                                                while (true) {
                                                                  if (var9_ref_miLifetime2 != null) {
                                                                    stackOut_1870_0 = var9_ref_miLifetime2;
                                                                    stackIn_1893_0 = stackOut_1870_0;
                                                                    stackIn_1871_0 = stackOut_1870_0;
                                                                    stackIn_1893_1 = -139;
                                                                    if (var19 == 0) {
                                                                      if (((SpellProjectile) (Object) stackIn_1871_0).isAlive(stackIn_1893_1) &&
                                                                        var9_ref_miLifetime2.owner != this.owner &&
                                                                        30 != var9_ref_miLifetime2.spellType &&
                                                                        var9_ref_miLifetime2.spellType != 84) {
                                                                        var10Lifetime1 = var9_ref_miLifetime2.x - this.x;
                                                                        var11Lifetime1 = -this.y + var9_ref_miLifetime2.y;
                                                                        if (var9_ref_miLifetime2.velocityY * var11Lifetime1 + var9_ref_miLifetime2.velocityX * var10Lifetime1 < 0) {
                                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                                          if (var12Lifetime1 < 65536 &&
                                                                            0 < var12Lifetime1) {
                                                                            var9_ref_miLifetime2.velocityX = var9_ref_miLifetime2.velocityX + Math.abs(var10Lifetime1) * (32 * var10Lifetime1) / var12Lifetime1;
                                                                          }
                                                                        }
                                                                      }
                                                                      var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                                      continue;
                                                                    }
                                                                  } else {
                                                                    stackIn_1893_0 = this;
                                                                    stackIn_1893_1 = this.x + (int)(256.0 * Math.random()) - 128;
                                                                  }
                                                                  break;
                                                                }
                                                                var5 = this.spawnFromHere(stackIn_1893_1, (BattleUnit) null, (byte) 81, 95, this.y - (-48 - (int)(16.0 * Math.random())), this.battle);
                                                                var9 = (int)(256.0 * Math.random());
                                                                var10_doubleLifetime1 = (double)var9 * 3.141592653589793 / 128.0;
                                                                ((SpellProjectile) (var5)).velocityX = (int)(Math.sin(var10_doubleLifetime1) * 32.0);
                                                                ((SpellProjectile) (var5)).velocityY = 32 + (int)(32.0 * Math.cos(var10_doubleLifetime1));
                                                                ((SpellProjectile) (var5)).field_x = 1;
                                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              }
                                                            }
                                                            if (71 == this.spellType) {
                                                              if (this.ageTicks < 300) {
                                                                return;
                                                              }
                                                              this.ageTicks = this.ageTicks - 200;
                                                              return;
                                                            }
                                                            if (this.ageTicks < 500) {
                                                              return;
                                                            }
                                                            this.remove(0);
                                                            return;
                                                          }
                                                        }
                                                        if (!this.owner.isDead(-1) &&
                                                          128 + this.battle.arenaHeight > this.owner.y) {
                                                          this.owner.attachedProjectile = this;
                                                          if (this.owner.pendingDamage > 0) {
                                                            if (this == this.owner.attachedProjectile) {
                                                              this.owner.attachedProjectile = null;
                                                            }
                                                            this.remove(0);
                                                            return;
                                                          }
                                                          this.x = this.owner.x;
                                                          this.y = this.owner.y;
                                                          if (this.owner.moving) {
                                                            if (this.owner.velocityX < -4) {
                                                              this.owner.velocityX = 1 + this.owner.velocityX / 2;
                                                            }
                                                            if (this.owner.velocityY < -16) {
                                                              this.owner.velocityY = this.owner.velocityY / 2 + 1;
                                                            }
                                                            if (4 < this.owner.velocityX) {
                                                              this.owner.velocityX = this.owner.velocityX / 2 - 1;
                                                            }
                                                          }
                                                          this.subpixelX = this.x << 4;
                                                          this.subpixelY = this.y << 4;
                                                          if (var19 == 0) {
                                                            return;
                                                          }
                                                        } else {
                                                          if (~this.battle.getCurrentPlayer(false) == ~this.owner.unitId) {
                                                          }
                                                          this.remove(0);
                                                          return;
                                                        }
                                                      }
                                                      if (!this.owner.isDead(-1) &&
                                                        (128 + this.battle.arenaHeight) > this.owner.y) {
                                                        if (this.owner.pendingDamage > 0) {
                                                          this.ageTicks = this.ageTicks + this.owner.pendingDamage;
                                                          if (this.ageTicks > 50) {
                                                            this.owner.pendingDamage = -50 + this.ageTicks;
                                                            if (var19 != 0) {
                                                              this.owner.pendingDamage = 0;
                                                            }
                                                          } else {
                                                            this.owner.pendingDamage = 0;
                                                          }
                                                        }
                                                        if (this.ageTicks >= 50) {
                                                          this.remove(0);
                                                          return;
                                                        }
                                                        this.field_x = this.field_x + (this.ageTicks + 8);
                                                        if (256 <= this.field_x) {
                                                          this.field_x = this.field_x - 256;
                                                        }
                                                        this.y = this.owner.y;
                                                        this.x = this.owner.x;
                                                        this.subpixelY = this.y << 4;
                                                        this.subpixelX = this.x << 4;
                                                        if (var19 == 0) {
                                                          return;
                                                        }
                                                      } else {
                                                        if (this.battle.getCurrentPlayer(false) == this.owner.unitId) {
                                                        }
                                                        this.remove(0);
                                                        return;
                                                      }
                                                    }
                                                    if (!this.owner.isDead(-1) &&
                                                      this.owner.y < (128 + this.battle.arenaHeight)) {
                                                      this.field_x = this.field_x + 16;
                                                      if (this.owner.pendingDamage > 0) {
                                                        this.owner.pendingDamage = 0;
                                                      }
                                                      if (this.field_x >= 256) {
                                                        this.field_x = this.field_x - 256;
                                                      }
                                                      this.y = this.owner.y;
                                                      this.x = this.owner.x;
                                                      this.subpixelX = this.x << 4;
                                                      this.subpixelY = this.y << 4;
                                                      if (var19 == 0) {
                                                        return;
                                                      }
                                                    } else {
                                                      if (this.battle.getCurrentPlayer(false) != this.owner.unitId) {
                                                      }
                                                      this.remove(0);
                                                      return;
                                                    }
                                                  }
                                                  if (!this.owner.isDead(-1) &&
                                                    128 + this.battle.arenaHeight > this.owner.y) {
                                                    this.field_x = this.field_x + 1;
                                                    if (16 <= this.field_x) {
                                                      this.field_x = this.field_x - 16;
                                                    }
                                                    this.x = this.owner.x;
                                                    this.y = this.owner.y;
                                                    this.subpixelY = this.y << 4;
                                                    this.subpixelX = this.x << 4;
                                                    if (this.ageTicks >= 250) {
                                                      return;
                                                    }
                                                    if (0 < this.ageTicks) {
                                                      this.ageTicks = this.ageTicks + 1;
                                                    }
                                                    MidiPcmStream.field_L.setDeque((byte) 107, this.battle.projectiles);
                                                    var9_ref_miLifetime2Lifetime1 = (SpellProjectile) (MidiPcmStream.field_L.first(-32));
                                                    while (var9_ref_miLifetime2Lifetime1 != null) {
                                                      if (var9_ref_miLifetime2Lifetime1.isAlive(-139) &&
                                                        var9_ref_miLifetime2Lifetime1.spellType != 30 &&
                                                        var9_ref_miLifetime2Lifetime1.spellType != 93 &&
                                                        var9_ref_miLifetime2Lifetime1.spellType != 84 &&
                                                        118 != var9_ref_miLifetime2Lifetime1.spellType &&
                                                        var9_ref_miLifetime2Lifetime1.spellType != 119) {
                                                        var10Lifetime1 = -this.x + var9_ref_miLifetime2Lifetime1.x;
                                                        var11Lifetime1 = var9_ref_miLifetime2Lifetime1.y - this.y;
                                                        if (-this.owner.size > var11Lifetime1 &&
                                                          Math.abs(var10Lifetime1) < Math.abs(var11Lifetime1) &&
                                                          var9_ref_miLifetime2Lifetime1.velocityY * var11Lifetime1 + var9_ref_miLifetime2Lifetime1.velocityX * var10Lifetime1 < 0) {
                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                          if (var12Lifetime1 < 65536) {
                                                            this.ageTicks = this.ageTicks + 1;
                                                            if (var12Lifetime1 > 0) {
                                                              var9_ref_miLifetime2Lifetime1.velocityX = var9_ref_miLifetime2Lifetime1.velocityX + var10Lifetime1 * (32 * Math.abs(var10Lifetime1)) / var12Lifetime1;
                                                              var9_ref_miLifetime2Lifetime1.velocityY = var9_ref_miLifetime2Lifetime1.velocityY + Math.abs(var11Lifetime1) * (var11Lifetime1 * 32) / var12Lifetime1;
                                                              if (0 < var10Lifetime1) {
                                                                var9_ref_miLifetime2Lifetime1.velocityX = var9_ref_miLifetime2Lifetime1.velocityX + 5;
                                                                if (var19 != 0) {
                                                                  var9_ref_miLifetime2Lifetime1.velocityX = var9_ref_miLifetime2Lifetime1.velocityX - 5;
                                                                }
                                                              } else {
                                                                var9_ref_miLifetime2Lifetime1.velocityX = var9_ref_miLifetime2Lifetime1.velocityX - 5;
                                                              }
                                                            }
                                                            if (var9_ref_miLifetime2Lifetime1.spellType == 46) {
                                                              var9_ref_miLifetime2Lifetime1.spellType = 95;
                                                              var9_ref_miLifetime2Lifetime1.ageTicks = 0;
                                                              var9_ref_miLifetime2Lifetime1.field_H = 0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var9_ref_miLifetime2Lifetime1 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                      if (var19 == 0) {
                                                        continue;
                                                      }
                                                      break;
                                                    }
                                                    return;
                                                  }
                                                  if (~this.battle.getCurrentPlayer(false) != ~this.owner.unitId) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (this.owner.isDead(-1)) {
                                                  this.remove(0);
                                                  return;
                                                }
                                                this.field_x = this.field_x + 1;
                                                if (this.ageTicks == -1) {
                                                  this.ageTicks = 0;
                                                }
                                                if (this.field_x >= 16) {
                                                  this.field_x = this.field_x - 16;
                                                }
                                                while (this.y < this.battle.arenaHeight &&
                                                  !this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, -this.spriteRadius + this.x, this.sprite)) {
                                                  this.subpixelY = this.subpixelY + 16;
                                                  this.y = this.subpixelY >> 4;
                                                  if (0 != this.ageTicks) {
                                                    continue;
                                                  }
                                                  this.ageTicks = -1;
                                                  if (var19 != 0) {
                                                    return;
                                                  }
                                                }
                                                if (this.battle.arenaHeight > this.y) {
                                                  if (this.ageTicks >= 250) {
                                                    return;
                                                  }
                                                  if (this.ageTicks > 0) {
                                                    this.ageTicks = this.ageTicks + 1;
                                                  }
                                                  if (this.battle.spriteOverlapsTerrain(-this.spriteRadius + this.y, 2, -this.spriteRadius + this.x, this.sprite) &&
                                                    BitHelpers.field_b) {
                                                    var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 85, this.y, this.battle);
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    this.playTypeSound(1, (byte) 37, 0);
                                                    this.applyAreaEffect(50, 64, 32, 8);
                                                    this.ageTicks = 250;
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 31, this.battle.projectiles);
                                                  var9_ref_miLifetime3 = (SpellProjectile) (MidiPcmStream.field_L.first(-78));
                                                  while (var9_ref_miLifetime3 != null) {
                                                    if (var19 != 0) {
                                                      return;
                                                    }
                                                    if (var9_ref_miLifetime3.isAlive(-139) &&
                                                      30 != var9_ref_miLifetime3.spellType &&
                                                      var9_ref_miLifetime3.spellType != 93 &&
                                                      var9_ref_miLifetime3.spellType != 84 &&
                                                      118 != var9_ref_miLifetime3.spellType &&
                                                      var9_ref_miLifetime3.spellType != 119) {
                                                      var10Lifetime1 = -this.x + var9_ref_miLifetime3.x;
                                                      var11Lifetime1 = var9_ref_miLifetime3.y - this.y;
                                                      if (var11Lifetime1 < 0 &&
                                                        Math.abs(var10Lifetime1) < Math.abs(var11Lifetime1) &&
                                                        var9_ref_miLifetime3.velocityY * var11Lifetime1 + var9_ref_miLifetime3.velocityX * var10Lifetime1 < 0) {
                                                        var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                        if (var12Lifetime1 < 65536) {
                                                          this.ageTicks = this.ageTicks + 1;
                                                          if (0 < var12Lifetime1) {
                                                            var9_ref_miLifetime3.velocityX = var9_ref_miLifetime3.velocityX + 32 * var10Lifetime1 * Math.abs(var10Lifetime1) / var12Lifetime1;
                                                            var9_ref_miLifetime3.velocityY = var9_ref_miLifetime3.velocityY + Math.abs(var11Lifetime1) * 32 * var11Lifetime1 / var12Lifetime1;
                                                            if (var10Lifetime1 <= 0) {
                                                              var9_ref_miLifetime3.velocityX = var9_ref_miLifetime3.velocityX - 5;
                                                            } else {
                                                              var9_ref_miLifetime3.velocityX = var9_ref_miLifetime3.velocityX + 5;
                                                            }
                                                          }
                                                          if (var9_ref_miLifetime3.spellType == 46) {
                                                            var9_ref_miLifetime3.spellType = 95;
                                                            var9_ref_miLifetime3.field_H = 0;
                                                            var9_ref_miLifetime3.ageTicks = 0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9_ref_miLifetime3 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                  }
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                            if (null == this.owner) {
                                              this.remove(0);
                                              return;
                                            }
                                            regionExit12: {
                                              this.owner.attachedProjectile = this;
                                              this.ageTicks = this.ageTicks + 1;
                                              if (0 == this.ageTicks % 2) {
                                                if (this.ageTicks % 16 == 0) {
                                                  this.playTypeSound(2, (byte) 37, 1);
                                                }
                                                var9 = targetX - this.owner.x;
                                                var10Lifetime1 = (this.owner.size >> 1) + (-this.owner.y + targetY);
                                                var11Lifetime1 = ConnectionState.greatestCommonDivisor(var10Lifetime1, var9, false);
                                                if (0 < var11Lifetime1 &&
                                                  this.owner.pendingDamage <= 0) {
                                                  if (this.spellType != 79) {
                                                    this.velocityX = var9 * 96 / var11Lifetime1;
                                                    this.velocityY = 96 * var10Lifetime1 / var11Lifetime1;
                                                    if (var19 != 0) {
                                                      this.velocityY = 48 * var10Lifetime1 / var11Lifetime1;
                                                      this.velocityX = var9 * 48 / var11Lifetime1;
                                                    }
                                                  } else {
                                                    this.velocityY = 48 * var10Lifetime1 / var11Lifetime1;
                                                    this.velocityX = var9 * 48 / var11Lifetime1;
                                                  }
                                                  if (this.velocityX > 0) {
                                                    this.owner.facing = 1;
                                                    if (var19 != 0) {
                                                      this.owner.facing = -1;
                                                    }
                                                  } else {
                                                    this.owner.facing = -1;
                                                  }
                                                  this.battle.eraseUnitMask(this.owner, 0);
                                                  this.owner.subpixelY = this.owner.y << 4;
                                                  this.owner.subpixelX = this.owner.x << 4;
                                                  this.subpixelY = this.velocityY + this.owner.subpixelY;
                                                  this.subpixelX = this.owner.subpixelX + this.velocityX;
                                                  this.y = this.subpixelY >> 4;
                                                  this.x = this.subpixelX >> 4;
                                                  this.owner.y = this.y;
                                                  this.owner.x = this.x;
                                                  this.owner.subpixelY = this.owner.y << 4;
                                                  this.subpixelX = this.subpixelX + this.velocityX;
                                                  this.owner.subpixelX = this.owner.x << 4;
                                                  this.subpixelY = this.subpixelY + (this.velocityY - (this.owner.size << 3));
                                                  if (this.spellType == 98) {
                                                    this.battle.field_t = -(this.owner.size >> 1) + (this.owner.y + var10Lifetime1);
                                                    this.battle.field_mb = this.owner.x + var9;
                                                  }
                                                  this.y = this.subpixelY >> 4;
                                                  this.x = this.subpixelX >> 4;
                                                  var5 = this.spawnFromHere(this.x + (int)(-8.0 + 16.0 * Math.random()), (BattleUnit) null, (byte) 81, 90, this.y + (int)(Math.random() * 16.0 - 8.0), this.battle);
                                                  this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  if (this.spellType == 79) {
                                                    this.y = this.y - 2;
                                                    this.applyAreaEffect(1, 32, 28, 8);
                                                    this.y = this.y + 2;
                                                    if (var19 == 0) {
                                                      break regionExit12;
                                                    }
                                                  }
                                                  if ((this.spellType == 98)) {
                                                    this.applyAreaEffect(10, 5, 36, 8);
                                                  }
                                                  break regionExit12;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                            if (this.ageTicks <= 150) {
                                              if (this.ageTicks <= 50) {
                                                return;
                                              }
                                              if (this.spellType != 98) {
                                                return;
                                              }
                                            }
                                            if (this.spellType == 98) {
                                              this.owner.velocityY = -64;
                                              this.owner.velocityX = 16 * this.owner.facing;
                                            }
                                            this.remove(0);
                                            return;
                                          }
                                          var9 = 1;
                                          if (this.spellType == 30) {
                                            var9 = 2;
                                          }
                                          var10Lifetime1 = 0;
                                          while (var10Lifetime1 < var9) {
                                            if (var19 != 0) {
                                              return;
                                            }
                                            if (this.spellType == 93 &&
                                              this.ageTicks < 20) {
                                              this.ageTicks = this.ageTicks + 1;
                                              return;
                                            }
                                            if (this.ageTicks == 0) {
                                              this.applyAreaEffect(0, 0, 16, 8);
                                            }
                                            boolean decompiledFrameRemainder0 = true;
                                            if (20 == this.ageTicks ||
                                              this.ageTicks == 0 &&
                                              this.spellType == 30) {
                                              if (this.owner != null) {
                                                this.battle.eraseUnitMask(this.owner, 0);
                                              }
                                              if (this.spellType == 30) {
                                                this.ageTicks = 1;
                                              } else {
                                                this.ageTicks = 21;
                                              }
                                              var11Lifetime1 = this.subpixelX;
                                              var12Lifetime1 = this.subpixelY;
                                              var13Lifetime1 = 0;
                                              while (var13Lifetime1 == 0) {
                                                if (this.battle.isSolidAt(this.y, this.x + 2, (byte) -83) ||
                                                  this.battle.isSolidAt(this.y, -2 + this.x, (byte) -83) ||
                                                  this.battle.isSolidAt(this.y - 2, this.x, (byte) -83) ||
                                                  this.battle.isSolidAt(2 + this.y, this.x, (byte) -83)) {
                                                  if (this.spellType == 30) {
                                                    this.playTypeSound(2, (byte) 37, 2);
                                                    this.applyAreaEffect(5, 64, 8, 8);
                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 100, this.y, this.battle);
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  var13Lifetime1 = 1;
                                                  if (93 == this.spellType) {
                                                    this.playTypeSound(0, (byte) 37, 2);
                                                    this.applyAreaEffect(75, 256, 32, 8);
                                                    var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 99, this.y, this.battle);
                                                    this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                }
                                                this.subpixelX = this.subpixelX + (this.velocityX >> 1);
                                                this.subpixelY = this.subpixelY + (this.velocityY >> 1);
                                                this.x = this.subpixelX >> 4;
                                                this.y = this.subpixelY >> 4;
                                                if (this.x < -640) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.x > this.battle.arenaWidth + 640) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.y > this.battle.arenaHeight) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.y >= -480) {
                                                  continue;
                                                }
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.spellType == 30 &&
                                                null == this.owner) {
                                                var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 31, this.y, this.battle);
                                                ((SpellProjectile) (var5)).ageTicks = 950;
                                                ((SpellProjectile) (var5)).velocityX = 0;
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                ((SpellProjectile) (var5)).velocityY = 0;
                                                this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (null != this.owner) {
                                                this.battle.stampUnitMask(-87, this.owner);
                                              }
                                              this.velocityY = this.subpixelY - var12Lifetime1;
                                              this.velocityX = this.subpixelX - var11Lifetime1;
                                              decompiledFrameRemainder0 = false;
                                            }
                                            else {
                                              this.ageTicks = this.ageTicks + 1;
                                              if ((this.ageTicks <= 30) &&
                                                (decompiledFrameRemainder0 = !(this.ageTicks <= 10))) {
                                                decompiledFrameRemainder0 = (this.spellType == 30);
                                              }
                                              if (decompiledFrameRemainder0) {
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                            var10Lifetime1++;
                                          }
                                          return;
                                        }
                                        this.updateFlightSound(5, (byte) 34);
                                        if (this.spellType == 61) {
                                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 109, this.y, this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          if (this.owner != null &&
                                            this.ageTicks < 25) {
                                            this.battle.eraseUnitMask(this.owner, 0);
                                          }
                                        }
                                        if (63 == this.spellType) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.x + (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 24.0), (BattleUnit) null, (byte) 81, 109, this.y + (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 32.0), this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                        }
                                        if (this.spellType == 64) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.x + (int)(48.0 * Math.sin((double)this.field_x * 3.14 / 128.0)), (BattleUnit) null, (byte) 81, 109, this.y + (int)(Math.cos((double)this.field_x * 3.14 / 128.0) * 64.0), this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                        }
                                        if (this.spellType == 66) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.x + (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 24.0), (BattleUnit) null, (byte) 81, 109, this.y + (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 64.0), this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          var5 = this.spawnFromHere(this.x - (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 64.0), (BattleUnit) null, (byte) 81, 109, this.y - (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 24.0), this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                          if (null != this.owner &&
                                            this.ageTicks < 25) {
                                            this.battle.eraseUnitMask(this.owner, 0);
                                          }
                                        }
                                        this.subpixelX = this.subpixelX + this.velocityX;
                                        this.subpixelY = this.subpixelY + this.velocityY;
                                        this.y = this.subpixelY >> 4;
                                        this.x = this.subpixelX >> 4;
                                        this.velocityY = this.velocityY + 2;
                                        if (!this.battle.spriteOverlapsTerrain(this.y - this.spriteRadius, 2, -this.spriteRadius + this.x, this.sprite)) {
                                          if (this.x < -640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.x > this.battle.arenaWidth + 640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.y > this.battle.arenaHeight) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (61 != this.spellType &&
                                            this.spellType != 66) {
                                            return;
                                          }
                                          if (this.owner == null) {
                                            return;
                                          }
                                          if (this.ageTicks >= 25) {
                                            return;
                                          }
                                          this.battle.stampUnitMask(-63, this.owner);
                                          return;
                                        }
                                        var9 = -1;
                                        if (61 == this.spellType) {
                                          this.applyAreaEffect(45, 64, 80, 8);
                                          var9 = 108;
                                          this.playTypeSound(2, (byte) 37, 5);
                                        }
                                        if (63 == this.spellType) {
                                          var9 = 108;
                                          this.applyAreaEffect(25, 192, 80, 8);
                                          this.playTypeSound(1, (byte) 37, 5);
                                        }
                                        if (this.spellType == 64) {
                                          this.applyAreaEffect(50, 192, 192, 8);
                                          var9 = 108;
                                          this.playTypeSound(0, (byte) 37, 5);
                                        }
                                        if (this.spellType == 66) {
                                          this.applyAreaEffect(25, 32, 64, 8);
                                          var9 = 108;
                                          this.playTypeSound(2, (byte) 37, 5);
                                        }
                                        if (var9 != -1) {
                                          var5 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, var9, this.y, this.battle);
                                          this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                                        }
                                        this.remove(0);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (this.field_x == 1) {
                          this.velocityY = this.velocityY + 4;
                        }
                        this.subpixelX = this.subpixelX + this.velocityX;
                        this.subpixelY = this.subpixelY + this.velocityY;
                        this.x = this.subpixelX >> 4;
                        this.y = this.subpixelY >> 4;
                        this.ageTicks = this.ageTicks + 1;
                        if (4 < this.ageTicks) {
                          this.ageTicks = this.ageTicks - 4;
                          this.field_H = this.field_H + 1;
                        }
                        if (this.field_H < 8) {
                          return;
                        }
                        this.remove(0);
                        return;
                      }
                      this.ageTicks = this.ageTicks + 1;
                      if (this.ageTicks <= 32) {
                        return;
                      }
                      this.remove(0);
                      return;
                    }
                  }
                  this.field_x = this.field_x + 1;
                  if (this.ageTicks == 0) {
                    fieldTemp$0 = this.velocityX;
                    this.velocityX = this.velocityX + 1;
                    if (20 < fieldTemp$0) {
                      this.ageTicks = 1;
                    }
                  }
                  if (1 == this.ageTicks) {
                    fieldTemp$1 = this.velocityX;
                    this.velocityX = this.velocityX - 1;
                    if (fieldTemp$1 < -20) {
                      this.ageTicks = 0;
                    }
                  }
                  if (this.owner != null) {
                    var9 = 0;
                    while (true) {
                      if (var9 < 10) {
                        stackIn_748_0 = this.owner.subpixelX;
                        stackIn_748_1 = this.subpixelX;
                        if (var19 == 0) {
                          if (stackIn_748_0 < stackIn_748_1) {
                            this.subpixelX = this.subpixelX - 1;
                          }
                          if (this.owner.subpixelX > this.subpixelX) {
                            this.subpixelX = this.subpixelX + 1;
                          }
                          if (this.subpixelY > this.owner.subpixelY - 500) {
                            this.subpixelY = this.subpixelY - 1;
                          }
                          if (this.subpixelY < (-500 + this.owner.subpixelY)) {
                            this.subpixelY = this.subpixelY + 1;
                          }
                          var9++;
                          continue;
                        }
                      } else {
                        stackIn_748_0 = 100;
                        stackIn_748_1 = this.field_x;
                      }
                      break;
                    }
                    if (stackIn_748_0 == stackIn_748_1) {
                      this.velocityY = this.velocityY - 1;
                    }
                    if (this.field_x > 2500) {
                      this.velocityY = this.velocityY - 1;
                      if (var19 != 0) {
                        this.velocityY = this.velocityY - 1;
                      }
                    }
                  } else {
                    this.velocityY = this.velocityY - 1;
                  }
                  this.subpixelX = this.subpixelX + this.velocityX;
                  this.subpixelY = this.subpixelY + this.velocityY;
                  this.y = this.subpixelY >> 4;
                  this.x = this.subpixelX >> 4;
                  if (this.field_x <= 3000) {
                    return;
                  }
                  this.remove(0);
                  return;
                }
                if (null != this.owner &&
                  0 == this.ageTicks &&
                  this.spellType == 157) {
                  this.subpixelY = -(this.owner.size << 3) + this.owner.subpixelY;
                  this.subpixelX = this.owner.subpixelX;
                  this.ageTicks = 1;
                  this.x = this.subpixelX >> 4;
                  this.y = this.subpixelY >> 4;
                }
                var9 = 2048;
                if ((null == this.owner ||
                  !this.owner.isDead(-1)) && this.ageTicks != -1) {
                  boolean decompiledFrameCompleted0 = true;
                  if (null != this.owner &&
                    this.spellType == 157) {
                    var10Lifetime1Lifetime1 = this.subpixelX;
                    var11Lifetime1Lifetime1 = this.subpixelY;
                    this.subpixelX = this.owner.subpixelX;
                    this.x = this.subpixelX >> 4;
                    this.subpixelY = this.owner.subpixelY - (this.owner.size << 3);
                    this.y = this.subpixelY >> 4;
                    if (~var10Lifetime1Lifetime1 != ~this.subpixelX ||
                      ~this.subpixelY != ~var11Lifetime1Lifetime1) {
                      MidiPcmStream.field_L.setDeque((byte) 38, this.battle.field_r);
                      var12_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.first(-62));
                      while (var12_ref_mi != null) {
                        var13Lifetime1Lifetime1 = var12_ref_mi.subpixelX - var10Lifetime1Lifetime1;
                        var14Lifetime1Lifetime1 = var12_ref_mi.subpixelY - var11Lifetime1Lifetime1;
                        stackIn_594_0 = (var14Lifetime1Lifetime1 >> 4) * var14Lifetime1Lifetime1 + var13Lifetime1Lifetime1 * (var13Lifetime1Lifetime1 >> 4);
                        stackIn_594_1 = var9 * (var9 >> 4);
                        if (var19 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (stackIn_594_0 < stackIn_594_1) {
                          var12_ref_mi.subpixelY = this.subpixelY + var14Lifetime1Lifetime1;
                          var12_ref_mi.subpixelX = this.subpixelX + var13Lifetime1Lifetime1;
                          var12_ref_mi.x = var12_ref_mi.subpixelX >> 4;
                          var12_ref_mi.y = var12_ref_mi.subpixelY >> 4;
                        }
                        var12_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                      }
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    this.field_x = this.field_x + 25;
                    stackIn_594_0 = this.field_x;
                    stackIn_594_1 = 256;
                  }
                  if (stackIn_594_0 >= stackIn_594_1) {
                    this.field_x = this.field_x - 256;
                  }
                  MidiPcmStream.field_L.setDeque((byte) 75, this.battle.projectiles);
                  var10_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.first(-52));
                  while (null != var10_ref_mi) {
                    if (var10_ref_mi.shouldCameraFollow(-8209)) {
                      var11Lifetime1Lifetime1 = this.subpixelX - var10_ref_mi.subpixelX;
                      var12Lifetime1Lifetime1 = this.subpixelY - var10_ref_mi.subpixelY;
                      if (var9 * (var9 >> 4) > (var12Lifetime1Lifetime1 >> 4) * var12Lifetime1Lifetime1 + (var11Lifetime1Lifetime1 >> 4) * var11Lifetime1Lifetime1) {
                        this.battle.field_h.addLast(var10_ref_mi, 15893);
                      }
                    }
                    var10_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                    if (var19 == 0) {
                      continue;
                    }
                    break;
                  }
                  if (var19 == 0) {
                    return;
                  }
                  break regionExit2;
                }
                var10_ref_oc = new IntrusiveDequeCursor(this.battle.field_r);
                var11_ref_miLifetime1 = (SpellProjectile) (var10_ref_oc.first(-123));
                while (var11_ref_miLifetime1 != null) {
                  var12Lifetime1Lifetime2 = -var11_ref_miLifetime1.subpixelX + this.subpixelX;
                  var13Lifetime1Lifetime2 = -var11_ref_miLifetime1.subpixelY + this.subpixelY;
                  if (var19 != 0) {
                    return;
                  }
                  if (((var9 >> 4) * var9) > (var13Lifetime1Lifetime2 * (var13Lifetime1Lifetime2 >> 4) + (var12Lifetime1Lifetime2 >> 4) * var12Lifetime1Lifetime2)) {
                    this.battle.spawnedProjectiles.addLast(var11_ref_miLifetime1, -1);
                  }
                  var11_ref_miLifetime1 = (SpellProjectile) (var10_ref_oc.next(-18502));
                }
                this.remove(0);
                return;
              }
              if (this.owner != null &&
                !this.owner.isDead(-1) && (this.spellType != 111 ||
                this.owner.unitType == 23 ||
                this.owner.unitType == 16)) {
                this.field_x = this.field_x + 1;
                if (this.owner.linkedUnit != null ||
                  111 == this.spellType) {
                  this.x = this.owner.x;
                  this.y = this.owner.y - (this.owner.size >> 1);
                }
                if (this.field_x >= 32) {
                  this.field_x = this.field_x - 32;
                }
                var9 = 128;
                if (null != this.owner &&
                  this.owner.unitType == 6) {
                  var9 = 64;
                }
                if (this.ageTicks >= 1) {
                  return;
                }
                MidiPcmStream.field_L.setDeque((byte) 27, this.battle.units);
                var10_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-99));
                while (null != var10_ref_mlLifetime1) {
                  if (var19 != 0) {
                    return;
                  }
                  if (this.owner != var10_ref_mlLifetime1 ||
                    var10_ref_mlLifetime1.unitType != 6 &&
                    (16 != var10_ref_mlLifetime1.unitType &&
                    23 != var10_ref_mlLifetime1.unitType ||
                    this.spellType == 55)) {
                    var11Lifetime2 = this.x - var10_ref_mlLifetime1.x;
                    var12Lifetime2 = this.y + (-var10_ref_mlLifetime1.y + var10_ref_mlLifetime1.size / 2);
                    if ((var10_ref_mlLifetime1.size / 2 + var9) * (var9 + var10_ref_mlLifetime1.size / 2) > var12Lifetime2 * var12Lifetime2 + var11Lifetime2 * var11Lifetime2 &&
                      35 != var10_ref_mlLifetime1.unitType &&
                      var10_ref_mlLifetime1.health > 0) {
                      var13Lifetime2 = this.x;
                      var14Lifetime2 = this.y;
                      this.x = var10_ref_mlLifetime1.x;
                      this.y = var10_ref_mlLifetime1.y;
                      var5 = this.spawnFromHere(this.x, this.owner, (byte) 81, 104, this.y - var10_ref_mlLifetime1.size / 2, this.battle);
                      this.battle.onProjectileFinished(52, (SpellProjectile) (var5));
                      if (var11Lifetime2 < 0) {
                        this.x = this.x + 8;
                      } else {
                        this.x = this.x - 8;
                      }
                      this.y = this.y + 8;
                      this.applyAreaEffect(15, 32, 16, 8);
                      this.ageTicks = this.ageTicks + 1;
                      this.x = var13Lifetime2;
                      this.y = var14Lifetime2;
                    }
                  }
                  var10_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                }
                return;
              }
              this.remove(0);
              return;
            }
          }
          if (!this.owner.isDead(-1)) {
            this.x = this.owner.x;
            this.y = this.owner.y;
            this.subpixelY = this.y << 4;
            this.subpixelX = this.x << 4;
            if (var19 == 0) {
              return;
            }
          }
          this.remove(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var5), "mi.NA(" + round + ',' + obfuscationGuard + ',' + targetY + ',' + targetX + ')');
        }
    }

    final int getY(int obfuscationGuard) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -128 % ((-14 - obfuscationGuard) / 54);
          stackIn_1_0 = this.y;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.IA(" + obfuscationGuard + ')');
        }
    }

    private final void initializeSprite(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 69 / ((obfuscationGuard + 50) / 32);
          if (DateHelpers.field_a == null) {
            DateHelpers.field_a = new Sprite(15, 15);
            DateHelpers.field_a.makeRasterTarget();
            SoftwareRasterizer.fillCircle(7, 7, 7, 16777215);
          }
          this.sprite = DateHelpers.field_a;
          if (46 == this.spellType) {
            if (null == AudioShutdownHelpers.field_g) {
              AudioShutdownHelpers.field_g = new Sprite(16, 16);
              AudioShutdownHelpers.field_g.makeRasterTarget();
              SoftwareRasterizer.fillRectangle(6, 6, 7, 7, 16777214);
            }
            this.sprite = AudioShutdownHelpers.field_g;
          }
          if (this.spellType == 145) {
            this.sprite = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.spellType == 16) {
            this.sprite = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.spellType == 10) {
            this.sprite = ScreenSwitchHelpers.field_f[1].toRgbSprite();
          }
          if (this.spellType == 11) {
            this.sprite = ScreenSwitchHelpers.field_f[1].toRgbSprite();
          }
          if (13 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (12 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (this.spellType == 14) {
            this.sprite = ScreenSwitchHelpers.field_f[4].toRgbSprite();
          }
          if (67 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (this.spellType == 17) {
            this.sprite = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.spellType == 18) {
            this.sprite = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.spellType == 0) {
            this.sprite = ScreenSwitchHelpers.field_f[12].toRgbSprite();
          }
          if (this.spellType == 24) {
            this.sprite = DualLinkDeque.field_b[2].toRgbSprite();
          }
          if (this.spellType == 26) {
            this.sprite = QuickChatPhrase.field_x[0];
          }
          if (this.spellType == 23) {
            this.sprite = DualLinkDeque.field_b[2].toRgbSprite();
          }
          if (this.spellType == 82) {
            this.sprite = ScreenSwitchHelpers.field_f[4].toRgbSprite();
          }
          if (this.spellType == 25) {
            this.sprite = DualLinkDeque.field_b[1].toRgbSprite();
          }
          if (this.spellType == 28) {
            this.sprite = QuickChatPhrase.field_x[0];
          }
          if (this.spellType == 21) {
            this.sprite = ScreenSwitchHelpers.field_f[5].toRgbSprite();
          }
          if (this.spellType == 44 ||
            this.spellType == 96) {
            this.sprite = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (45 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.spellType == 41) {
            this.sprite = ScreenSwitchHelpers.field_f[8].toRgbSprite();
          }
          if (this.spellType == 42) {
            this.sprite = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (this.spellType == 49) {
            this.sprite = FlagSumHelpers.field_f[1];
          }
          if (40 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[7].toRgbSprite();
          }
          if (76 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.spellType == 43) {
            this.sprite = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (33 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[11].toRgbSprite();
          }
          if (53 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[13].toRgbSprite();
          }
          if (this.spellType == 54) {
            this.sprite = ScreenSwitchHelpers.field_f[14].toRgbSprite();
          }
          if (this.spellType == 50) {
            this.sprite = ScreenSwitchHelpers.field_f[15].toRgbSprite();
          }
          if (this.spellType == 52) {
            this.sprite = ScreenSwitchHelpers.field_f[15].toRgbSprite();
          }
          if (this.spellType == 133) {
            this.sprite = DualLinkDeque.field_b[12].toRgbSprite();
          }
          if (145 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[24].toRgbSprite();
          }
          if (this.spellType == 146) {
            this.sprite = ScreenSwitchHelpers.field_f[25].toRgbSprite();
          }
          if (this.spellType == 115) {
            this.sprite = ScreenSwitchHelpers.field_f[20].toRgbSprite();
          }
          if (this.spellType == 116) {
            this.sprite = ScreenSwitchHelpers.field_f[21].toRgbSprite();
          }
          if (this.spellType == 119) {
            this.sprite = ScreenSwitchHelpers.field_f[22].toRgbSprite();
          }
          if (120 == this.spellType) {
            this.sprite = DualLinkDeque.field_b[13].toRgbSprite();
          }
          if (this.spellType == 117) {
            this.sprite = ScreenSwitchHelpers.field_f[20].toRgbSprite();
          }
          if (this.spellType == 122) {
            this.sprite = ScreenSwitchHelpers.field_f[23].toRgbSprite();
          }
          if (this.spellType == 156) {
            this.sprite = ScreenSwitchHelpers.field_f[28].toRgbSprite();
          }
          if (this.spellType == 164) {
            this.sprite = ScreenSwitchHelpers.field_f[28].toRgbSprite();
          }
          if (159 == this.spellType) {
            this.sprite = ScreenSwitchHelpers.field_f[29].toRgbSprite();
          }
          if (this.spellType == 165) {
            this.sprite = DualLinkDeque.field_b[16].toRgbSprite();
          }
          if (this.spellType == 161) {
            this.sprite = DualLinkDeque.field_b[17].toRgbSprite();
          }
          if (this.spellType == 158) {
            this.sprite = DualLinkDeque.field_b[18].toRgbSprite();
          }
          if (this.spellType == 162) {
            this.sprite = DualLinkDeque.field_b[19].toRgbSprite();
          }
          if (this.spellType == 160) {
            this.sprite = FlagSumHelpers.field_f[3];
          }
          if (this.spellType == 165) {
            this.field_H = (1 + this.battle.getRound((byte) -75) * 3) % (this.battle.getPlayerCount(0) * 5) + 1 * this.battle.getPlayerCount(0);
          }
          this.spriteRadius = this.sprite.field_n >> 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.FA(" + obfuscationGuard + ')');
        }
    }

    final SpellProjectile copyForBattle(int obfuscationGuard, Battle battle) {
        SpellProjectile var3 = null;
        RuntimeException var3_ref = null;
        SpellProjectile stackIn_3_0 = null;
        IsaacRandom stackIn_4_1 = null;
        SpellProjectile stackIn_10_0 = null;
        BattleUnit stackIn_11_1 = null;
        SpellProjectile stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = GameOptionType.acquireProjectile(battle, -108);
          stackIn_3_0 = var3;
          if (this.random == null) {
            stackIn_4_1 = null;
          } else {
            stackIn_4_1 = this.random.copy((byte) 64);
          }
          stackIn_3_0.random = stackIn_4_1;
          var3.spellType = this.spellType;
          var3.subpixelX = this.subpixelX;
          var3.x = this.x;
          var3.y = this.y;
          if (obfuscationGuard != 21310) {
            field_m = (SceneWidget) null;
          }
          var3.subpixelY = this.subpixelY;
          var3.initializeSprite(44);
          var3.velocityY = this.velocityY;
          var3.field_H = this.field_H;
          var3.ageTicks = this.ageTicks;
          var3.velocityX = this.velocityX;
          stackIn_10_0 = var3;
          if (this.owner == null) {
            stackIn_11_1 = null;
          } else {
            stackIn_11_1 = battle.getUnitByOwner(this.owner.unitId, true);
          }
          stackIn_10_0.owner = stackIn_11_1;
          var3.field_w = this.field_w;
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mi.S(").append(obfuscationGuard).append(',');
          if (battle == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void applyAreaEffect(int damage, int knockback, int radius, int obfuscationGuard) {
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_347_0 = 0;
        int stackIn_347_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        SpellProjectile var6_ref_mi = null;
        BattleUnit var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        BattleUnit var14 = null;
        int var15 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = -1;
          if (null != this.owner) {
            var5_int = this.owner.ownerPlayer;
          }
          if ((this.spellType == 10 ||
            this.spellType == 11 ||
            this.spellType == 12 ||
            this.spellType == 13 ||
            this.spellType == 14 ||
            this.spellType == 67 ||
            15 == this.spellType) &&
            (null != this.owner &&
            this.battle.playerSpellbook[this.owner.ownerPlayer] == 0)) {
            var6 = this.battle.field_X[this.owner.ownerPlayer] / 20;
            radius = radius + var6 * radius / 5;
            damage = damage + var6 * damage / 10;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.spellType == 0 ||
            this.spellType == 2 ||
            this.spellType == 3 ||
            147 == this.spellType) {
            EmailValidator.field_v.setDeque((byte) 116, this.battle.projectiles);
            var6_ref_mi = (SpellProjectile) (EmailValidator.field_v.first(obfuscationGuard ^ -40));
            while (var6_ref_mi != null) {
              stackIn_52_0 = 148;
              stackIn_52_1 = var6_ref_mi.spellType;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_52_0 == stackIn_52_1 &&
                this.owner == var6_ref_mi.owner) {
                knockback += 16;
                radius += 5;
                damage += 5;
              }
              var6_ref_mi = (SpellProjectile) (EmailValidator.field_v.next(obfuscationGuard - 18510));
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_52_0 = -71;
            stackIn_52_1 = ~this.spellType;
          }
          if (stackIn_52_0 != stackIn_52_1 &&
            this.spellType != 55 &&
            this.spellType != 111 &&
            this.spellType != 66 &&
            this.spellType != 24 &&
            this.spellType != 145 &&
            this.spellType != 138) {
            if (33 != this.spellType) {
              var6Lifetime1 = radius * 2 / 3;
              if (this.spellType == 108) {
                var6Lifetime1 = radius;
              }
              if (0 == this.spellType) {
                var6Lifetime1 = radius;
              }
              if (this.spellType == 2) {
                var6Lifetime1 = radius;
              }
              if (this.spellType == 31) {
                var6Lifetime1 = var6Lifetime1 / 2;
              }
              if (16 > var6Lifetime1) {
                var6Lifetime1 = 16;
              }
              if (this.spellType == 30 ||
                this.spellType == 16) {
                var6Lifetime1 = radius;
              }
              this.battle.refreshTerrainArea(this.x, var6Lifetime1, (byte) 51, this.y);
              if (var15 != 0) {
                this.y = this.y + 32;
                radius += 32;
              }
            } else {
              this.y = this.y + 32;
              radius += 32;
            }
            if (this.spellType == 43) {
              radius += 16;
            }
            if (41 == this.spellType ||
              this.spellType == 13 ||
              this.spellType == 12) {
              radius += 32;
              knockback += 32;
              this.y = this.y + 32;
            }
          }
          EmailValidator.field_v.setDeque((byte) 109, this.battle.units);
          var6Lifetime2 = 1;
          if (obfuscationGuard != 8) {
            this.velocityY = -5;
          }
          var7 = (BattleUnit) (EmailValidator.field_v.first(-46));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 == null))) {
            var6Lifetime3 = 1;
            stackIn_347_0 = -1;
            stackIn_347_1 = ~var7.health;
            if (var15 == 0) {
              if (stackIn_347_0 <= stackIn_347_1) {
                var6Lifetime3 = 0;
              }
              if ((this.spellType == 118 ||
                this.spellType == 78 ||
                this.spellType == 79 ||
                this.spellType == 98 ||
                this.spellType == 138) &&
                this.owner == var7) {
                var6Lifetime3 = 0;
              }
              if ((0 == this.spellType ||
                2 == this.spellType ||
                this.spellType == 3 ||
                147 == this.spellType) &&
                (this.owner == var7 &&
                this.owner.unitType != 20 &&
                this.owner.unitType != 27)) {
                var6Lifetime3 = 0;
              }
              if ((this.spellType == 55 ||
                this.spellType == 111) &&
                var7.unitType == 35) {
                var6Lifetime3 = 0;
              }
              if (var6Lifetime3 == 0) {
                var6Lifetime3 = 1;
              } else {
                var8 = knockback;
                if ((var7.field_U ||
                  16 == var7.unitType) && 66 == this.spellType) {
                  var8 = 250;
                }
                var9 = var7.x - this.x;
                var10 = -this.y + (var7.y - (var7.size >> 1));
                var11 = ConnectionState.greatestCommonDivisor(var10, var9, false);
                if (var11 == 0) {
                  var9 = 0;
                  var10 = -1;
                  var11 = 1;
                }
                var12 = 0;
                var13 = 0;
                if (var11 >= (radius >> 1) + (var7.size >> 1)) {
                  if (!(((var7.size >> 1) + radius) <= var11)) {
                    var13 = damage * (var11 - (var7.size >> 1)) / radius;
                    var12 = (var8 >> 1) + var8 * (var11 - ((radius >> 1) + (var7.size >> 1))) / radius;
                  }
                } else {
                  var13 = damage;
                  var12 = var8;
                  if (var13 > 5 &&
                    0 <= var5_int) {
                    this.battle.field_ab[var5_int] = this.battle.field_ab[var5_int] + 1;
                  }
                }
                if (var13 < damage &&
                  damage <= 5 &&
                  var11 < radius + (var7.size >> 1)) {
                  var13 = damage;
                }
                if (!this.battle.field_M) {
                  if (0 == var7.unitType) {
                    var13 = 0;
                  }
                  var12 = 0;
                }
                if (this.spellType == 161 &&
                  var7.unitType != 37 &&
                  var7.unitType != 12 &&
                  (16 + (var7.size >> 1) + radius) > var11) {
                  var14 = var7;
                  var7 = (BattleUnit) (EmailValidator.field_v.first(obfuscationGuard - 88));
                  while (var7 != null) {
                    if (var7.unitType == 37) {
                      this.battle.eraseUnitMask(var14, 0);
                      var14.x = var7.x;
                      var7.health = 0;
                      var7.pendingDamage = 1;
                      var14.subpixelX = var7.subpixelX;
                      var14.subpixelY = var7.subpixelY;
                      var14.moving = true;
                      var14.y = var7.y;
                      this.playTypeSound(2, (byte) 37, 8);
                      return;
                    }
                    var7 = (BattleUnit) (EmailValidator.field_v.next(obfuscationGuard ^ -18510));
                  }
                  this.playTypeSound(0, (byte) 37, 8);
                  return;
                }
                if ((this.spellType == 55 ||
                  111 == this.spellType) &&
                  radius + (var7.size >> 1) > var11) {
                  var13 = 15;
                }
                if (this.spellType == 78 &&
                  var11 < (var7.size >> 1) + radius) {
                  var13 = 30;
                  if (9 == this.owner.unitType) {
                    var13 = 75;
                    if (~this.owner.ownerPlayer == ~var7.ownerPlayer) {
                      if (var7.unitType != 17) {
                      }
                      var13 = 0;
                    }
                  }
                  if (39 == this.owner.unitType) {
                    var13 = 50;
                    if (var7.unitId == this.owner.ownerPlayer) {
                      var13 = 0;
                    }
                  }
                }
                if (this.spellType == 2 &&
                  var11 < (radius + (var7.size >> 1))) {
                  var13 = damage;
                }
                if (this.spellType == 16 &&
                  var11 < (var7.size + radius)) {
                  var13 = 5;
                }
                if (this.spellType == 138) {
                  if (var11 < (radius + (var7.size >> 1))) {
                    var13 = damage;
                  } else {
                    var13 = 0;
                  }
                }
                if (this.spellType == 70 &&
                  ~this.owner.ownerPlayer == ~var7.ownerPlayer) {
                  var12 = 0;
                  var13 = 0;
                }
                if (this.spellType == 55 &&
                  null != this.owner &&
                  this.owner.unitType == 6 &&
                  var7 == this.owner) {
                  var13 = 0;
                  var12 = 0;
                }
                if (var12 <= 0) {
                  if (this.spellType == 16 &&
                    !var7.moving) {
                    var7.moving = true;
                    var7.velocityY = 0;
                    var7.velocityX = 0;
                  }
                } else {
                  if (var7.unitType == 7 ||
                    var7.unitType == 27) {
                    var12 = var12 / 4;
                  }
                  if (!var7.moving) {
                    var7.velocityY = 0;
                    var7.velocityX = 0;
                    var7.moving = true;
                  }
                  var7.velocityX = var7.velocityX + var9 * var12 / var11;
                  var7.velocityY = var7.velocityY + ((var12 >> 1) * var10 / var11 - (var12 >> 1));
                  if (this.spellType == 15) {
                    var7.velocityY = var7.velocityY - 128;
                    if (var9 <= 0) {
                      var7.velocityY = var7.velocityY - 16;
                    } else {
                      var7.velocityX = var7.velocityX + 16;
                    }
                  }
                  if (this.spellType == 120 &&
                    12 != var7.unitType) {
                    if (this.owner != null) {
                      this.battle.stampUnitMask(-107, this.owner);
                    }
                    this.subpixelX = var7.subpixelX;
                    this.y = var7.y;
                    this.spellType = 121;
                    this.subpixelY = var7.subpixelY;
                    this.x = var7.x;
                    this.owner = var7;
                  }
                }
                if (0 < var13) {
                  this.onHitUnit(var5_int, true, var13, var7);
                }
              }
              var7 = (BattleUnit) (EmailValidator.field_v.next(-18502));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_347_0 = this.spellType;
            stackIn_347_1 = 161;
          }
          if (stackIn_347_0 == stackIn_347_1) {
            this.playTypeSound(2, (byte) 37, 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "mi.JA(" + damage + ',' + knockback + ',' + radius + ',' + obfuscationGuard + ')');
        }
    }

    final static CoverageBitmapFont createCoverageFont(byte[] data, int obfuscationGuard) {
        CoverageBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        CoverageBitmapFont stackIn_5_0 = null;
        CoverageBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == data) {
            stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          var2 = new CoverageBitmapFont(data, BufferedMessage.field_l, SectorCacheStore.field_d, ChatLine.field_p, ServerMessage.field_i, PriceCaptionGlobals.field_c, AccountRegistrationPanel.field_I);
          if (obfuscationGuard < 43) {
            stackIn_5_0 = (CoverageBitmapFont) null;
            return stackIn_5_0;
          }
          CanvasRasterBuffer.releaseDecodeArrays(-18229);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("mi.U(");
          if (data == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void checkHeightEffects(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        SpellProjectile var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (obfuscationGuard < 58) {
            SpellProjectile.releaseStatics(27);
          }
          if (this.y < this.battle.arenaHeight / 4) {
            if (this.y >= this.battle.arenaHeight / 5) {
              this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, -87, -this.spriteRadius + this.x, ScreenSwitchHelpers.field_f[16].toRgbSprite());
              if (var3 == 0) {
                return;
              }
            }
            if (this.y < (this.battle.arenaHeight / 6)) {
              if (this.y < this.battle.arenaHeight / 7) {
                if (this.battle.arenaHeight / 8 > this.y) {
                  var2 = this.spawnFromHere(this.x, (BattleUnit) null, (byte) 81, 95, this.y, this.battle);
                  this.battle.onProjectileFinished(52, var2);
                  if (var3 == 0) {
                    return;
                  }
                }
                this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -97, -this.spriteRadius + this.x, ScreenSwitchHelpers.field_f[19].toRgbSprite());
                if (var3 == 0) {
                  return;
                }
              }
              this.battle.carveTerrainAndSprite(-this.spriteRadius + this.y, -5, this.x - this.spriteRadius, ScreenSwitchHelpers.field_f[18].toRgbSprite());
              if (var3 == 0) {
                return;
              }
            }
            this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -18, -this.spriteRadius + this.x, ScreenSwitchHelpers.field_f[17].toRgbSprite());
            if (var3 == 0) {
              return;
            }
          }
          this.battle.carveTerrainAndSprite(this.y - this.spriteRadius, -34, -this.spriteRadius + this.x, ScreenSwitchHelpers.field_f[6].toRgbSprite());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.EA(" + obfuscationGuard + ')');
        }
    }

    public static void releaseStatics(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (obfuscationGuard != 2) {
            SpellProjectile.releaseStatics(-17);
          }
          field_E = null;
          field_m = null;
          field_s = null;
          field_B = null;
          field_A = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "mi.W(" + obfuscationGuard + ')');
        }
    }

    private final void onHitUnit(int attackerPlayer, boolean obfuscationGuard, int damage, BattleUnit unit) {
        BattleUnit stackIn_552_0 = null;
        BattleUnit stackIn_552_1 = null;
        BattleUnit stackIn_563_0 = null;
        int stackIn_564_0 = 0;
        int stackIn_564_1 = 0;
        RuntimeException stackIn_587_0 = null;
        StringBuilder stackIn_587_1 = null;
        String stackIn_588_2 = null;
        RuntimeException decompiledCaughtException = null;
        SpellProjectile var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        IntrusiveDequeCursor var6 = null;
        int var6_int = 0;
        SpellProjectile var7 = null;
        int var7_int = 0;
        BattleUnit var7_ref = null;
        int var8 = 0;
        BattleUnit stackIn_552_0Lifetime1;
        BattleUnit stackIn_552_1Lifetime1;
        SpellProjectile var5Lifetime1;
        IntrusiveDequeCursor var6Lifetime1;
        BattleUnit var7_refLifetime1;
        SpellProjectile var5Lifetime2;
        IntrusiveDequeCursor var6Lifetime1Lifetime1;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var5_intLifetime3;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder2 = true;
          if (140 == this.spellType) {
            if (unit.unitType == 28) {
              unit.field_J = false;
              unit.unitType = 29;
              unit.buildSprites(12, true);
              damage = 0;
              var5 = this.spawnFromHere(unit.x, unit, (byte) 81, 137, unit.y - unit.size / 2, this.battle);
              this.battle.onProjectileFinished(52, var5);
              decompiledFrameRemainder2 = (var8 != 0);
            }
            if (decompiledFrameRemainder2) {
              if (unit.unitType != 29) {
                if (unit.unitType == 30) {
                  damage = 0;
                  if (var8 != 0) {
                    unit.unitType = 30;
                    unit.field_J = false;
                    unit.buildSprites(12, true);
                    damage = 0;
                    var5Lifetime2 = this.spawnFromHere(unit.x, unit, (byte) 81, 137, unit.y - unit.size / 2, this.battle);
                    this.battle.onProjectileFinished(52, var5Lifetime2);
                  }
                }
              } else {
                unit.unitType = 30;
                unit.field_J = false;
                unit.buildSprites(12, true);
                damage = 0;
                var5Lifetime2 = this.spawnFromHere(unit.x, unit, (byte) 81, 137, unit.y - unit.size / 2, this.battle);
                this.battle.onProjectileFinished(52, var5Lifetime2);
              }
            }
          }
          if ((20 == this.spellType ||
            this.spellType == 80 ||
            this.spellType == 165) &&
            unit.field_q > 0) {
            damage = damage * 2;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.spellType == 0 ||
            2 == this.spellType ||
            3 == this.spellType ||
            this.spellType == 77 ||
            this.spellType == 147) {
            if (unit.unitType == 11) {
              unit.pendingDamage = unit.pendingDamage - damage;
              damage = 0;
            }
            if (unit.unitType == 27) {
              unit.pendingDamage = -damage / 2;
              damage = 0;
            }
            decompiledFrameRemainder1 = (unit.unitType == 20);
            if (decompiledFrameRemainder1) {
              unit.field_q = unit.field_q + damage;
              damage = 0;
              if (unit.field_q > 100) {
                unit.field_q = 100;
              }
              decompiledFrameRemainder1 = (null != this.owner);
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder1 = (this.owner.unitType == 27)) &&
                (decompiledFrameRemainder1 = (this.spellType == 2))) {
                var5Lifetime1 = this.spawnFromHere(unit.x, unit, (byte) 81, 155, unit.y - unit.size / 2, this.battle);
                this.battle.onProjectileFinished(52, var5Lifetime1);
                decompiledFrameRemainder1 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder1) {
            if ((this.spellType != 46) &&
              (decompiledFrameRemainder1 = (45 == this.spellType ||
              this.spellType == 76)) &&
              (decompiledFrameRemainder1 = (unit.unitType == 22 ||
              unit.unitType == 4 ||
              5 == unit.unitType ||
              15 == unit.unitType))) {
              damage = 0;
              decompiledFrameRemainder1 = (var8 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (4 == unit.unitType ||
                unit.unitType == 5 ||
                unit.unitType == 15) {
                damage = -1;
                var5_int = 50;
                if (unit.unitType == 5) {
                  var5_int = 100;
                }
                if (unit.unitType == 15) {
                  var5_int = 150;
                }
                if (var5_int < -unit.pendingDamage + (-damage + unit.health)) {
                  damage = -var5_int + (unit.health - unit.pendingDamage);
                }
              }
              if (unit.unitType == 22) {
                if (75 > unit.field_q) {
                  unit.field_q = unit.field_q + 1;
                }
                damage = 0;
              }
            }
          }
          if (1 < damage) {
            var5_intLifetime1 = 1;
            if (unit.unitType == 2) {
              damage -= 10;
            }
            if (unit.unitType == 27) {
              damage -= 5;
            }
            if (1 == this.battle.playerSpellbook[unit.ownerPlayer]) {
              damage = damage - this.battle.field_X[unit.ownerPlayer] / 20;
            }
            if (this.battle.playerSpellbook[unit.ownerPlayer] == 7) {
              if (this.spellType == 135) {
                var5_intLifetime1 = 0;
                damage = damage - this.battle.field_X[unit.ownerPlayer] / 20;
              }
              if (this.spellType == 133) {
                damage = damage - this.battle.field_X[unit.ownerPlayer] / 10;
                var5_intLifetime1 = 0;
              }
            }
            if (var5_intLifetime1 > damage) {
              damage = var5_intLifetime1;
            }
          }
          if (unit.unitType == 13 && (this.spellType == 16 ||
            this.spellType == 15)) {
            damage = 0;
          }
          if (!obfuscationGuard) {
            return;
          }
          if ((unit.unitType == 3 ||
            unit.unitType == 14) &&
            (30 == this.spellType ||
            this.spellType == 31 ||
            this.spellType == 33 ||
            this.spellType == 70 ||
            this.spellType == 93)) {
            damage = 0;
          }
          if (unit.field_U) {
            if (52 == this.spellType) {
              unit.recordDamage(124, damage, this.damageSourceId);
              if (attackerPlayer >= 0) {
                this.battle.field_K[attackerPlayer] = this.battle.field_K[attackerPlayer] + damage;
              }
              if (unit.hasNoLinkedUnit(46)) {
                this.battle.field_db[unit.unitId] = this.battle.field_db[unit.unitId] + damage;
              }
              this.battle.field_tb = this.battle.field_tb + damage;
              damage = 0;
            }
            if (this.spellType == 54 ||
              this.spellType == 55 ||
              this.spellType == 111) {
              unit.recordDamage(-19, -damage, this.damageSourceId);
              if (0 <= attackerPlayer) {
                this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] + damage;
              }
              if (unit.hasNoLinkedUnit(102)) {
                this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] - damage;
              }
              damage = 0;
            }
          }
          if (damage > 0 &&
            this.owner != null &&
            !unit.field_U &&
            unit.unitType != 2 &&
            unit.unitType != 11 &&
            unit.unitType != 25 &&
            unit.unitType != 39 &&
            unit.unitType != 6 &&
            unit.unitType != 32) {
            if (52 == this.spellType) {
              if (unit == this.owner) {
                damage = 0;
              }
              var5_intLifetime2 = damage;
              if (var5_intLifetime2 > this.owner.health) {
                var5_intLifetime2 = this.owner.health;
              }
              if (0 > var5_intLifetime2) {
                var5_intLifetime2 = 0;
              }
              this.owner.pendingDamage = this.owner.pendingDamage - var5_intLifetime2;
              this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] + var5_intLifetime2;
              if (unit.hasNoLinkedUnit(121)) {
                this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] + var5_intLifetime2;
              }
              if ((var8 != 0) &&
                (this.owner.unitType == 16)) {
                this.owner.pendingDamage = this.owner.pendingDamage - (damage >> 1);
                this.battle.field_p[attackerPlayer] = this.battle.field_p[attackerPlayer] + (damage >> 1);
                this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] + (damage >> 1);
                if (unit.hasNoLinkedUnit(68)) {
                  this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] + (damage >> 1);
                }
              }
            } else {
              if (this.owner.unitType == 16) {
                this.owner.pendingDamage = this.owner.pendingDamage - (damage >> 1);
                this.battle.field_p[attackerPlayer] = this.battle.field_p[attackerPlayer] + (damage >> 1);
                this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] + (damage >> 1);
                if (unit.hasNoLinkedUnit(68)) {
                  this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] + (damage >> 1);
                }
              }
            }
          }
          if (0 < damage &&
            this.owner != null &&
            null != this.owner.linkedUnit &&
            this.owner.linkedUnit.unitType == 16 &&
            !unit.field_U &&
            2 != unit.unitType &&
            unit.unitType != 11 &&
            unit.unitType != 25 &&
            39 != unit.unitType &&
            unit.unitType != 6 &&
            unit.unitType != 32) {
            this.owner.linkedUnit.pendingDamage = this.owner.linkedUnit.pendingDamage - (damage >> 1);
            this.battle.field_p[attackerPlayer] = this.battle.field_p[attackerPlayer] + (damage >> 1);
            this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] + (damage >> 1);
            if (unit.hasNoLinkedUnit(34)) {
              this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] + (damage >> 1);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.spellType == 66) {
            if (unit.unitType == 2 ||
              unit.unitType == 11 ||
              unit.unitType == 25 ||
              unit.unitType == 6 ||
              unit.unitType == 11 ||
              unit.unitType == 25 ||
              39 == unit.unitType ||
              unit.unitType == 6 ||
              unit.unitType == 32) {
              damage = 0;
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if ((decompiledFrameRemainder0) && (!unit.field_U &&
              unit.unitType != 16)) {
              damage = -damage;
              if (unit.field_p < -damage + unit.health) {
                damage = -unit.field_p + unit.health;
                if (0 < damage) {
                  damage = 0;
                }
              }
            }
          }
          if (this.spellType == 61 ||
            this.spellType == 64 ||
            this.spellType == 63 ||
            this.spellType == 60 ||
            this.spellType == 66) {
            if (unit.field_U) {
              damage = damage * 2;
            }
            if (unit.hasNoLinkedUnit(62)) {
              if (this.battle.playerSpellbook[unit.unitId] == 4 &&
                -unit.pendingDamage + (-damage + unit.health) <= 0) {
                this.battle.field_X[unit.unitId] = 0;
              }
              if (unit.unitType == 16 &&
                66 == this.spellType) {
                this.battle.refreshTerrainArea(this.x, 64, (byte) 51, this.y);
              }
            }
          }
          unit.recordDamage(-7, damage, this.damageSourceId);
          if (0 >= damage) {
            if (attackerPlayer >= 0) {
              this.battle.field_g[attackerPlayer] = this.battle.field_g[attackerPlayer] - damage;
            }
            if (unit.hasNoLinkedUnit(93)) {
              this.battle.field_s[unit.unitId] = this.battle.field_s[unit.unitId] - damage;
            }
          } else {
            if (this.spellType == 31 &&
              unit.field_q > 0) {
              this.field_x = 0;
            }
            if (unit.hasNoLinkedUnit(118)) {
              this.battle.field_db[unit.unitId] = this.battle.field_db[unit.unitId] + damage;
            }
            if (unit.unitType != 12 &&
              !this.field_w) {
              this.battle.field_tb = this.battle.field_tb + damage;
              if (attackerPlayer >= 0) {
                if (~unit.unitId != ~attackerPlayer) {
                  this.battle.field_K[attackerPlayer] = this.battle.field_K[attackerPlayer] + damage;
                  if (var8 != 0) {
                    this.battle.field_K[attackerPlayer] = this.battle.field_K[attackerPlayer] - damage;
                  }
                } else {
                  this.battle.field_K[attackerPlayer] = this.battle.field_K[attackerPlayer] - damage;
                }
              }
            }
            if (!this.field_w) {
            }
            if (34 == unit.unitType && (this.spellType == 145 ||
              this.spellType == 146)) {
              unit.health = 0;
              unit.updateTurnLogic(attackerPlayer, 104);
            }
            if (null == unit.linkedUnit) {
              if (-unit.pendingDamage + unit.health > 0) {
                this.battle.field_n[unit.unitId] = this.battle.field_n[unit.unitId] + 1;
              }
              if (attackerPlayer >= 0) {
                if (~this.battle.healthiestPlayer == ~unit.unitId &&
                  ~attackerPlayer != ~this.battle.healthiestPlayer) {
                  this.battle.field_Fb[attackerPlayer] = this.battle.field_Fb[attackerPlayer] + damage;
                }
                if (~unit.unitId == ~this.battle.weakestPlayer &&
                  ~this.battle.weakestPlayer != ~attackerPlayer) {
                  this.battle.field_gb[attackerPlayer] = this.battle.field_gb[attackerPlayer] + damage;
                }
              }
            }
            if (attackerPlayer >= 0 &&
              !this.field_w) {
              if (this.spellType == 77) {
                this.battle.field_wb[attackerPlayer] = this.battle.field_wb[attackerPlayer] + damage;
              }
              if (this.owner.isFlyingType(-26)) {
                this.battle.field_Nb[attackerPlayer] = this.battle.field_Nb[attackerPlayer] + damage;
              }
              if (null != this.owner.linkedUnit) {
                this.battle.field_T[attackerPlayer] = this.battle.field_T[attackerPlayer] + damage;
              }
              if (null != this.owner.linkedUnit &&
                this.owner.linkedUnit != this.battle.getUnitByOwner(this.battle.getCurrentPlayer(false), obfuscationGuard)) {
              }
            }
          }
          if ((this.spellType == 23 ||
            this.spellType == 82) &&
            75 < unit.pendingDamage) {
            unit.pendingDamage = 75;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          regionExit1: {
            if ((this.spellType == 54 ||
              55 == this.spellType ||
              this.spellType == 53 ||
              this.spellType == 111) && (-unit.pendingDamage + unit.health <= 0 &&
              !unit.hasNoLinkedUnit(71) &&
              12 != unit.unitType &&
              unit.unitType != 2 &&
              unit.unitType != 6 &&
              unit.unitType != 11 &&
              unit.unitType != 25 &&
              unit.unitType != 32 &&
              unit.unitType != 39 &&
              unit.field_q <= 0)) {
              var5_intLifetime3 = 1;
              if (17 == unit.unitType ||
                unit.unitType == 9) {
                var6 = new IntrusiveDequeCursor(this.battle.projectiles);
                var7 = (SpellProjectile) (var6.first(-77));
                while (var7 != null) {
                  stackIn_564_0 = var7.spellType;
                  stackIn_564_1 = 106;
                  if (var8 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_564_0 == stackIn_564_1 &&
                    unit == var7.owner) {
                    var5_intLifetime3 = 0;
                  }
                  var7 = (SpellProjectile) (var6.next(-18502));
                }
              }
              if ((decompiledFrameCompleted1) && (!unit.field_U &&
                var5_intLifetime3 != 0)) {
                if (unit.isFlyingType(-26)) {
                  unit.unitType = 26;
                }
                if (unit.isAirborneOrHovering(32)) {
                  var6_int = -this.x + unit.linkedUnit.x;
                  var7_int = -(unit.linkedUnit.size / 2) + unit.size / 2 + (unit.linkedUnit.y - this.y);
                  if (((unit.linkedUnit.size + unit.size) * (unit.linkedUnit.size + unit.size) >> 2) <= (var7_int * var7_int + var6_int * var6_int)) {
                  }
                }
                unit.pendingDamage = 0;
                unit.field_U = true;
                unit.linkedUnit = this.battle.getUnitByOwner(this.owner.ownerPlayer, obfuscationGuard);
                unit.ownerPlayer = this.owner.ownerPlayer;
                unit.field_J = false;
                unit.buildSprites(12, true);
                unit.health = unit.health / 4;
                if (unit.unitType == 9) {
                  unit.unitType = 7;
                  var6Lifetime1 = new IntrusiveDequeCursor(this.battle.units);
                  var7_ref = (BattleUnit) (var6Lifetime1.first(-38));
                  while (var7_ref != null) {
                    stackIn_552_0 = var7_ref.linkedUnit;
                    stackIn_552_1 = unit.linkedUnit;
                    if (var8 == 0) {
                      if (stackIn_552_0 == stackIn_552_1 &&
                        var7_ref.field_U &&
                        17 == var7_ref.unitType) {
                      }
                      var7_ref = (BattleUnit) (var6Lifetime1.next(-18502));
                      continue;
                    }
                    while (true) {
                      if (stackIn_552_0 == stackIn_552_1 &&
                        var7_ref.field_U &&
                        var7_ref.unitType == 7) {
                      }
                      var7_ref = (BattleUnit) (var6Lifetime1.next(-18502));
                      break regionExit1;
                    }
                  }
                }
                if (unit.unitType == 17) {
                  var6Lifetime1Lifetime1 = new IntrusiveDequeCursor(this.battle.units);
                  var7_refLifetime1 = (BattleUnit) (var6Lifetime1Lifetime1.first(-62));
                  while (null != var7_refLifetime1) {
                    stackIn_563_0 = unit.linkedUnit;
                    if (var8 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    stackIn_552_0Lifetime1 = stackIn_563_0;
                    stackIn_552_1Lifetime1 = var7_refLifetime1.linkedUnit;
                    if (stackIn_552_0Lifetime1 == stackIn_552_1Lifetime1 &&
                      var7_refLifetime1.field_U &&
                      var7_refLifetime1.unitType == 7) {
                    }
                    var7_refLifetime1 = (BattleUnit) (var6Lifetime1Lifetime1.next(-18502));
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            if (!this.battle.field_Z) {
              return;
            }
            stackIn_563_0 = (BattleUnit) (unit);
          }
          if (decompiledFrameCompleted1) {
            stackIn_564_0 = -stackIn_563_0.pendingDamage;
            stackIn_564_1 = unit.health;
          }
          if (stackIn_564_0 + stackIn_564_1 < 0 &&
            unit.hasNoLinkedUnit(81) &&
            !unit.isTower((byte) 104) &&
            !this.field_w &&
            this.owner != null &&
            Math.abs(-unit.subpixelX + this.owner.subpixelX) > 10240) {
            this.battle.field_Z = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_587_0 = var5_ref;
          stackIn_587_1 = new StringBuilder().append("mi.I(").append(attackerPlayer).append(',').append(obfuscationGuard).append(',').append(damage).append(',');
          if (unit == null) {
            stackIn_588_2 = "null";
          } else {
            stackIn_588_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_587_0), ((StringBuilder) (Object) stackIn_587_1).append(stackIn_588_2).append(')').toString());
        }
    }

    final boolean isAlive(int param0) {
        boolean stackIn_118_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.isPersistentType(125)) {
            return false;
          }
          if (29 == this.spellType &&
            this.field_H == 0 &&
            this.ageTicks >= 30) {
            return false;
          }
          if (68 == this.spellType && (250 <= this.ageTicks ||
            0 == this.ageTicks)) {
            return false;
          }
          if (15 == this.spellType && (this.ageTicks >= 250 ||
            this.ageTicks == 0)) {
            return false;
          }
          if (this.spellType == 16 &&
            300 <= this.ageTicks) {
            return false;
          }
          if (this.spellType == 165 &&
            this.ageTicks >= 300) {
            return false;
          }
          if (this.spellType == 3 &&
            this.ageTicks >= 25) {
            return false;
          }
          if (this.spellType == 106) {
            return false;
          }
          if (this.spellType == 121) {
            return false;
          }
          if (this.spellType == 127) {
            return false;
          }
          if (148 == this.spellType) {
            return false;
          }
          if (this.spellType == 117) {
            return false;
          }
          if (this.spellType == 149) {
            return false;
          }
          if (param0 == ~this.spellType) {
            return false;
          }
          if (this.spellType == 107) {
            return false;
          }
          if (this.spellType == 126) {
            return false;
          }
          if (this.spellType == 69 && (this.ageTicks >= 250 ||
            this.ageTicks == 0)) {
            return false;
          }
          if (70 == this.spellType) {
            return false;
          }
          if (55 == this.spellType) {
            return false;
          }
          if (this.spellType == 111) {
            return false;
          }
          if (56 == this.spellType) {
            stackIn_118_0 = !(this.owner.health >= 250);
            return stackIn_118_0;
          }
          if (this.spellType == 157) {
            return false;
          }
          if (this.spellType == 168) {
            return false;
          }
          if (this.spellType == 123) {
            return false;
          }
          if ((this.spellType == 19 ||
            this.spellType == 142 ||
            this.spellType == 134 ||
            62 == this.spellType ||
            47 == this.spellType ||
            this.spellType == 71 ||
            this.spellType == 36) &&
            (this.ageTicks == 100 ||
            this.ageTicks == 200 ||
            300 == this.ageTicks ||
            this.ageTicks == 400)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.GA(" + param0 + ')');
        }
    }

    private final void updateFlightSound(int param0, byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        PcmSample var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (this.battle.projectileSamples != null) {
            var3 = this.battle.projectileSamples[220];
            if ((this.spellType == 11 ||
              this.spellType == 44 ||
              this.spellType == 18) && (this.ageTicks > 25 &&
              this.ageTicks < 250)) {
              var3 = this.battle.projectileSamples[226];
            }
            if (null == var3) {
              return;
            }
            this.flightSoundTicks = this.flightSoundTicks + 1;
            if (this.flightSoundStream == null ||
              this.flightSoundStream.isSamplePositionOutOfRange() ||
              this.flightSoundTicks > 5) {
              this.flightSoundTicks = 0;
              this.flightSoundStream = this.createFlightSoundStream(var3, 19227);
              if (this.flightSoundStream != null) {
                ValidationHelpWidget.playEffectStream(this.flightSoundStream, (byte) 68);
              }
            }
          }
          if (obfuscationGuard != 34) {
            this.onHitUnit(34, true, -6, (BattleUnit) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3_ref), "mi.D(" + param0 + ',' + obfuscationGuard + ')');
        }
    }

    private final void drawUnitMarkers(byte obfuscationGuard) {
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite var2 = null;
        RuntimeException var2_ref = null;
        Sprite var3 = null;
        Sprite var4 = null;
        IntrusiveDequeCursor var5 = null;
        BattleUnit var6_ref_ml = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = ScreenSwitchHelpers.field_f[0].toRgbSprite();
          var3 = ScreenSwitchHelpers.field_f[5].toRgbSprite();
          var4 = DualLinkDeque.field_b[2].toRgbSprite();
          var5 = new IntrusiveDequeCursor(this.battle.units);
          var6_ref_ml = (BattleUnit) (var5.first(-36));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_ref_ml == null))) {
            stackIn_14_0 = 0;
            if (var12 == 0) {
              if (stackIn_14_0 < var6_ref_ml.health) {
                this.battle.stampUnitMask(-114, var6_ref_ml);
              } else {
                this.battle.eraseUnitMask(var6_ref_ml, 0);
              }
              var6_ref_ml = (BattleUnit) (var5.next(-18502));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_14_0 = 2;
          }
          var6 = stackIn_14_0;
          var7 = 36 % ((-26 - obfuscationGuard) / 51);
          scanLoop1: while (true) {
            stackIn_16_0 = 0;
            if (stackIn_16_0 <= var6) {
              if (var12 != 0) {
                return;
              }
              var8 = 0;
              scanLoop2: while (true) {
                stackIn_20_0 = ~var8;
                stackIn_20_1 = -65;
                if (stackIn_20_0 > stackIn_20_1) {
                  stackIn_16_0 = 0;
                  var9 = stackIn_16_0;
                  while (var9 < 8192) {
                    var10 = GradientBarPainter.sine(125, var9) * var8 >> 16;
                    var11 = var8 * BevelBoxPainter.cosine(var9, -107) >> 16;
                    stackIn_20_0 = 0;
                    stackIn_20_1 = var6;
                    if (stackIn_20_0 != stackIn_20_1) {
                      if (var6 == 1) {
                        if (!this.battle.spriteOverlapsTerrain(this.y - var11 - 8, 2, -8 + (var10 + this.x), var3)) {
                          this.battle.carveTerrainAndSprite(-8 + (-var11 + this.y), -90, this.x + var10 - 8, var3);
                        }
                      } else if (!this.battle.spriteOverlapsTerrain(-var11 + (this.y - 16), 2, this.x + var10 - 16, var4)) {
                        this.battle.carveTerrainAndSprite(-16 - var11 + this.y, -11, this.x + var10 - 16, var4);
                      }
                    } else {
                      if (!this.battle.spriteOverlapsTerrain(-8 - var11 + this.y, 2, var10 + this.x - 8, var2)) {
                        this.battle.carveTerrainAndSprite(-8 + this.y - var11, -43, -8 + var10 + this.x, var2);
                      }
                    }
                    var9 += 64;
                  }
                  var8 += 8;
                  continue scanLoop2;
                }
                break;
              }
              var6--;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.C(" + obfuscationGuard + ')');
        }
    }

    final void draw(int offsetY, int obfuscationGuard, int offsetX) {
        Sprite stackIn_473_0 = null;
        int stackIn_473_1 = 0;
        int stackIn_474_2 = 0;
        Sprite stackIn_477_0 = null;
        int stackIn_477_1 = 0;
        int stackIn_478_2 = 0;
        IndexedSprite[] stackIn_508_0 = null;
        int stackIn_512_1 = 0;
        int stackIn_593_0 = 0;
        int stackIn_593_1 = 0;
        int stackIn_948_0 = 0;
        int stackIn_948_1 = 0;
        int stackIn_950_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        double var5_double = 0.0;
        int var6_int = 0;
        int[] var6 = null;
        BattleUnit var6_ref = null;
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int var8 = 0;
        double var8_double = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_948_0Lifetime1;
        int stackIn_948_1Lifetime1;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.ageTicks < 20) {
            if (!((this.spellType != 93) &&
              (91 != this.spellType) &&
              (this.spellType != 92) &&
              (this.spellType != 113))) {
              return;
            }
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  regionExit5: {
                    regionExit6: {
                      regionExit7: {
                        regionExit8: {
                          regionExit9: {
                            regionExit10: {
                              regionExit11: {
                                regionExit12: {
                                  regionExit13: {
                                    regionExit14: {
                                      regionExit15: {
                                        regionExit16: {
                                          regionExit17: {
                                            regionExit18: {
                                              regionExit19: {
                                                regionExit20: {
                                                  regionExit21: {
                                                    regionExit22: {
                                                      regionExit23: {
                                                        regionExit24: {
                                                          regionExit25: {
                                                            regionExit26: {
                                                              regionExit27: {
                                                                regionExit28: {
                                                                  regionExit29: {
                                                                    regionExit30: {
                                                                      regionExit31: {
                                                                        regionExit32: {
                                                                          regionExit33: {
                                                                            regionExit34: {
                                                                              regionExit35: {
                                                                                regionExit36: {
                                                                                  regionExit37: {
                                                                                    regionExit38: {
                                                                                      regionExit39: {
                                                                                        regionExit40: {
                                                                                          regionExit41: {
                                                                                            regionExit42: {
                                                                                              var4_int = -47 % ((obfuscationGuard - 8) / 33);
                                                                                              var5 = this.spellType;
                                                                                              if (var5 == 167) {
                                                                                                var5 = 86;
                                                                                                if ((this.field_x & 8) > 0) {
                                                                                                  var5++;
                                                                                                }
                                                                                                regionExit43: {
                                                                                                  var6_int = this.x - (-offsetX + 20);
                                                                                                  var7 = offsetY + this.y - 20;
                                                                                                  if (this.velocityX > 0) {
                                                                                                    LoginLoadingHelpers.field_g[var5].drawTransparent(var6_int, var7);
                                                                                                    if (var16 == 0) {
                                                                                                      break regionExit43;
                                                                                                    }
                                                                                                  }
                                                                                                  LoginLoadingHelpers.field_g[var5].drawHorizontalFlip(var6_int, var7);
                                                                                                }
                                                                                                if (this.field_x < 200) {
                                                                                                  var8 = 65;
                                                                                                  var9 = this.battle.getArenaTheme(-31497);
                                                                                                  if (var9 == 6) {
                                                                                                    var8 = 70;
                                                                                                  }
                                                                                                  if (var9 == 2) {
                                                                                                    var8 = 40;
                                                                                                  }
                                                                                                  if (var9 == 8) {
                                                                                                    var8 = 62;
                                                                                                  }
                                                                                                  if (var9 == 3) {
                                                                                                    var8 = 66;
                                                                                                  }
                                                                                                  if (var9 == 1) {
                                                                                                    var8 = 18;
                                                                                                  }
                                                                                                  if (var9 == 0) {
                                                                                                    var8 = 6;
                                                                                                  }
                                                                                                  if (var9 == 7) {
                                                                                                    var8 = 85;
                                                                                                  }
                                                                                                  if (4 == var9) {
                                                                                                    var8 = 30;
                                                                                                  }
                                                                                                  if (5 == var9) {
                                                                                                    var8 = 95;
                                                                                                  }
                                                                                                  stackIn_473_0 = LoginLoadingHelpers.field_g[var8];
                                                                                                  stackIn_473_1 = 20 + var6_int;
                                                                                                  if (this.velocityX <= 0) {
                                                                                                    stackIn_474_2 = -4;
                                                                                                  } else {
                                                                                                    stackIn_474_2 = 0;
                                                                                                  }
                                                                                                  ((Sprite) (Object) stackIn_473_0).drawQuarterSize(stackIn_473_1 - (-stackIn_474_2 - (int)(10.0 * Math.cos(0.2 * (double)this.field_x))), var7 + (int)(5.0 * Math.sin((double)this.field_x * 0.2)));
                                                                                                  stackIn_477_0 = LoginLoadingHelpers.field_g[var8].copyFlippedHorizontal();
                                                                                                  stackIn_477_1 = 20 + var6_int;
                                                                                                  if (this.velocityX <= 0) {
                                                                                                    stackIn_478_2 = -4;
                                                                                                  } else {
                                                                                                    stackIn_478_2 = 0;
                                                                                                  }
                                                                                                  ((Sprite) (Object) stackIn_477_0).drawQuarterSize(stackIn_477_1 - (-stackIn_478_2 + (int)(Math.cos((double)this.field_x * 0.2) * 10.0)), -(int)(Math.sin(0.2 * (double)this.field_x) * 5.0) + var7);
                                                                                                }
                                                                                                if (var16 == 0) {
                                                                                                  return;
                                                                                                }
                                                                                              } else {
                                                                                                if (var5 != 136) {
                                                                                                  if (var5 == 123) {
                                                                                                    break regionExit42;
                                                                                                  }
                                                                                                  if (var5 == 143) {
                                                                                                    break regionExit41;
                                                                                                  }
                                                                                                  if (var5 == 119) {
                                                                                                    break regionExit40;
                                                                                                  }
                                                                                                  if (var5 == 139) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 138) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 118) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((var5 == 84) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 81) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 75) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 73) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((var5 == 97) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((var5 == 113) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((var5 == 125) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 144) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((153 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((var5 == 74) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((32 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if ((164 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (151 == var5) {
                                                                                                    break regionExit39;
                                                                                                  }
                                                                                                  if ((var5 == 149) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit38;
                                                                                                  }
                                                                                                  if (var5 == 60) {
                                                                                                    break regionExit37;
                                                                                                  }
                                                                                                  if ((var5 == 155) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit36;
                                                                                                  }
                                                                                                  if (106 == var5) {
                                                                                                    break regionExit35;
                                                                                                  }
                                                                                                  if (var5 == 148) {
                                                                                                    break regionExit34;
                                                                                                  }
                                                                                                  if (var5 == 127) {
                                                                                                    break regionExit33;
                                                                                                  }
                                                                                                  if ((var5 == 121) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit32;
                                                                                                  }
                                                                                                  if (var5 == 120) {
                                                                                                    break regionExit31;
                                                                                                  }
                                                                                                  if (var5 == 107) {
                                                                                                    break regionExit30;
                                                                                                  }
                                                                                                  if ((var5 == 126) &&
                                                                                                    (var16 == 0)) {
                                                                                                    return;
                                                                                                  }
                                                                                                  if (var5 == 63) {
                                                                                                    break regionExit29;
                                                                                                  }
                                                                                                  if (64 == var5) {
                                                                                                    break regionExit28;
                                                                                                  }
                                                                                                  if ((61 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit27;
                                                                                                  }
                                                                                                  if (var5 == 109) {
                                                                                                    break regionExit26;
                                                                                                  }
                                                                                                  if ((var5 == 108) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit25;
                                                                                                  }
                                                                                                  if (var5 == 0) {
                                                                                                    break regionExit24;
                                                                                                  }
                                                                                                  if ((var5 == 147) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit23;
                                                                                                  }
                                                                                                  if (var5 == 2) {
                                                                                                    break regionExit22;
                                                                                                  }
                                                                                                  if (var5 == 77) {
                                                                                                    break regionExit21;
                                                                                                  }
                                                                                                  if ((var5 == 56) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit20;
                                                                                                  }
                                                                                                  if (var5 == 85) {
                                                                                                    break regionExit19;
                                                                                                  }
                                                                                                  if ((var5 == 86) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit18;
                                                                                                  }
                                                                                                  if ((163 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit17;
                                                                                                  }
                                                                                                  if ((var5 == 166) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit16;
                                                                                                  }
                                                                                                  if (var5 == 87) {
                                                                                                    break regionExit15;
                                                                                                  }
                                                                                                  if ((var5 == 88) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit14;
                                                                                                  }
                                                                                                  if (var5 == 68) {
                                                                                                    break regionExit13;
                                                                                                  }
                                                                                                  if ((var5 == 69) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit12;
                                                                                                  }
                                                                                                  if (70 == var5) {
                                                                                                    break regionExit11;
                                                                                                  }
                                                                                                  if (var5 == 15) {
                                                                                                    break regionExit10;
                                                                                                  }
                                                                                                  if (var5 == 89) {
                                                                                                    break regionExit9;
                                                                                                  }
                                                                                                  if (var5 == 103) {
                                                                                                    break regionExit8;
                                                                                                  }
                                                                                                  if ((104 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit7;
                                                                                                  }
                                                                                                  if ((90 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit6;
                                                                                                  }
                                                                                                  if ((var5 == 99) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit5;
                                                                                                  }
                                                                                                  if ((var5 == 101) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit4;
                                                                                                  }
                                                                                                  if ((100 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit3;
                                                                                                  }
                                                                                                  if (var5 == 132) {
                                                                                                    break regionExit2;
                                                                                                  }
                                                                                                  if (var5 == 135) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                  if ((152 == var5) &&
                                                                                                    (var16 == 0)) {
                                                                                                    break regionExit1;
                                                                                                  }
                                                                                                  regionExit44: {
                                                                                                    regionExit45: {
                                                                                                      regionExit46: {
                                                                                                        regionExit47: {
                                                                                                          regionExit48: {
                                                                                                            regionExit49: {
                                                                                                              regionExit50: {
                                                                                                                regionExit51: {
                                                                                                                  regionExit52: {
                                                                                                                    regionExit53: {
                                                                                                                      regionExit54: {
                                                                                                                        regionExit55: {
                                                                                                                          regionExit56: {
                                                                                                                            regionExit57: {
                                                                                                                              regionExit58: {
                                                                                                                                regionExit59: {
                                                                                                                                  regionExit60: {
                                                                                                                                    regionExit61: {
                                                                                                                                      regionExit62: {
                                                                                                                                        regionExit63: {
                                                                                                                                          regionExit64: {
                                                                                                                                            regionExit65: {
                                                                                                                                              regionExit66: {
                                                                                                                                                regionExit67: {
                                                                                                                                                  regionExit68: {
                                                                                                                                                    if ((var5 == 128) &&
                                                                                                                                                      (var16 == 0)) {
                                                                                                                                                      if (CheckboxPainter.field_p == null) {
                                                                                                                                                        return;
                                                                                                                                                      }
                                                                                                                                                      CheckboxPainter.field_p[this.field_H].draw(offsetX + (this.x - 50), this.y + (offsetY - 50));
                                                                                                                                                      return;
                                                                                                                                                    } else {
                                                                                                                                                      if (var5 != 154) {
                                                                                                                                                        if ((var5 == 130) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit68;
                                                                                                                                                        }
                                                                                                                                                        if (131 == var5) {
                                                                                                                                                          break regionExit67;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 129) {
                                                                                                                                                          break regionExit66;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 137) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit65;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 114) {
                                                                                                                                                          break regionExit64;
                                                                                                                                                        }
                                                                                                                                                        if ((94 == var5) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit63;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 95) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit62;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 30) {
                                                                                                                                                          break regionExit61;
                                                                                                                                                        }
                                                                                                                                                        if (93 == var5) {
                                                                                                                                                          break regionExit61;
                                                                                                                                                        }
                                                                                                                                                        if (112 == var5) {
                                                                                                                                                          break regionExit61;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 31) {
                                                                                                                                                          break regionExit60;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 47) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit59;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 142) {
                                                                                                                                                          break regionExit58;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 71) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit57;
                                                                                                                                                        }
                                                                                                                                                        if (36 == var5) {
                                                                                                                                                          break regionExit56;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 62) {
                                                                                                                                                          break regionExit55;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 3) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit54;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 102) {
                                                                                                                                                          break regionExit53;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 91) {
                                                                                                                                                          break regionExit52;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 20) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit51;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 34) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit50;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 124) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit49;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 158) {
                                                                                                                                                          break regionExit48;
                                                                                                                                                        }
                                                                                                                                                        if (161 == var5) {
                                                                                                                                                          break regionExit48;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 162) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit48;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 157) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit47;
                                                                                                                                                        }
                                                                                                                                                        if ((168 == var5) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit47;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 55) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit46;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 111) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          break regionExit46;
                                                                                                                                                        }
                                                                                                                                                        if (46 == var5) {
                                                                                                                                                          break regionExit45;
                                                                                                                                                        }
                                                                                                                                                        if ((var5 == 78) &&
                                                                                                                                                          (var16 == 0)) {
                                                                                                                                                          return;
                                                                                                                                                        }
                                                                                                                                                        if (var5 == 22) {
                                                                                                                                                          return;
                                                                                                                                                        }
                                                                                                                                                        break regionExit44;
                                                                                                                                                      }
                                                                                                                                                    }
                                                                                                                                                    if (HighscoreEntry.field_j == null) {
                                                                                                                                                      return;
                                                                                                                                                    }
                                                                                                                                                    HighscoreEntry.field_j[this.field_H].draw(-50 + (this.x + offsetX), -50 + (offsetY + this.y));
                                                                                                                                                    if (var16 == 0) {
                                                                                                                                                      return;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (DropdownItemList.field_cb == null) {
                                                                                                                                                    return;
                                                                                                                                                  }
                                                                                                                                                  DropdownItemList.field_cb[this.field_H].draw(-50 + (offsetX + this.x), offsetY + (this.y - 50));
                                                                                                                                                  if (var16 == 0) {
                                                                                                                                                    return;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                                if (DiskCacheRequest.field_H == null) {
                                                                                                                                                  return;
                                                                                                                                                }
                                                                                                                                                DiskCacheRequest.field_H[this.field_H].draw(this.x + offsetX - 50, -50 + (offsetY + this.y));
                                                                                                                                                if (var16 == 0) {
                                                                                                                                                  return;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                              if (HotspotRegion.field_i == null) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                              if (this.field_H < 0) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                              HotspotRegion.field_i[this.field_H].draw(-8 + this.x + offsetX, -8 + offsetY + this.y);
                                                                                                                                              if (var16 == 0) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            if (null == ResizableModalPanel.field_db) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                            ResizableModalPanel.field_db[this.field_H].draw(offsetX + (this.x - 64), -128 + offsetY + this.battle.arenaHeight);
                                                                                                                                            if (var16 == 0) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          if (this.velocityY <= 0) {
                                                                                                                                            return;
                                                                                                                                          }
                                                                                                                                          var5 = 0;
                                                                                                                                          if ((this.battle.field_N != null) &&
                                                                                                                                            (this.owner != null) &&
                                                                                                                                            (this.owner.linkedUnit == null)) {
                                                                                                                                            var5 = this.battle.field_N[this.owner.unitId][5] | (this.battle.field_N[this.owner.unitId][3] << 16 | this.battle.field_N[this.owner.unitId][4] << 8);
                                                                                                                                          }
                                                                                                                                          var6_int = this.ageTicks - 64;
                                                                                                                                          while (this.ageTicks > var6_int) {
                                                                                                                                            var7 = var6_int * this.velocityX / this.velocityY + offsetX + this.x;
                                                                                                                                            var8 = this.y + (offsetY + var6_int);
                                                                                                                                            var9 = 14 * var6_int / this.velocityY + 2;
                                                                                                                                            var10 = 8 + 24 * var6_int / this.velocityY;
                                                                                                                                            if (var16 != 0) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                            if (var10 > 32) {
                                                                                                                                              var10 = 32;
                                                                                                                                            }
                                                                                                                                            if (96 > -var6_int + this.velocityY) {
                                                                                                                                              var10 = 32 + this.velocityY + (-var6_int - 96);
                                                                                                                                            }
                                                                                                                                            if ((var10 > 0) &&
                                                                                                                                              (0 < var5)) {
                                                                                                                                              SoftwareRasterizer.fillCircleAlpha(var7, var8, var9, var5, var10);
                                                                                                                                            }
                                                                                                                                            var6_int += 2;
                                                                                                                                            continue;
                                                                                                                                          }
                                                                                                                                          if (var16 == 0) {
                                                                                                                                            return;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        if (null == ScreenTransitionHelpers.field_e) {
                                                                                                                                          return;
                                                                                                                                        }
                                                                                                                                        ScreenTransitionHelpers.field_e[this.field_H].draw(offsetX + (this.x - 50), -50 + (this.y + offsetY));
                                                                                                                                        if (var16 == 0) {
                                                                                                                                          return;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      if (null == ArrayWidgetContainer.field_G) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                      if (0 > this.field_H) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                      ArrayWidgetContainer.field_G[this.field_H].draw(-8 + this.x + offsetX, -8 + this.y + offsetY);
                                                                                                                                      if (var16 == 0) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    var5 = ButtonMenuDialog.highestOneBit((int)Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY)) / 15, (byte) 124);
                                                                                                                                    var5++;
                                                                                                                                    var6 = new int[var5];
                                                                                                                                    var6[0] = this.x + offsetX;
                                                                                                                                    var7_ref_int__ = new int[var5];
                                                                                                                                    var7_ref_int__[0] = this.y + offsetY;
                                                                                                                                    var6[-1 + var5] = -(this.velocityX >> 4) + this.x + offsetX;
                                                                                                                                    var7_ref_int__[-1 + var5] = -(this.velocityY >> 4) + (offsetY + this.y);
                                                                                                                                    var8 = (var5 - 1) / 2;
                                                                                                                                    while (true) {
                                                                                                                                      regionExit69: {
                                                                                                                                        if (var8 >= 1) {
                                                                                                                                          stackIn_950_0 = var8;
                                                                                                                                          if (var16 != 0) {
                                                                                                                                            break regionExit69;
                                                                                                                                          }
                                                                                                                                          var10 = stackIn_950_0;
                                                                                                                                          while (var10 < var5) {
                                                                                                                                            var9 = var8;
                                                                                                                                            stackIn_948_0 = 128;
                                                                                                                                            stackIn_948_1 = var9;
                                                                                                                                            if (stackIn_948_0 < stackIn_948_1) {
                                                                                                                                              var9 = 128;
                                                                                                                                            }
                                                                                                                                            var6[var10] = (var6[var10 - var8] + var6[var8 + var10]) / 2 + (int)((double)(-var9) + (double)(2 * var9 + 1) * Math.random()) / 5;
                                                                                                                                            var7_ref_int__[var10] = (var7_ref_int__[var8 + var10] + var7_ref_int__[-var8 + var10]) / 2 + (int)((double)(-var9) + Math.random() * (double)(1 + var9 * 2)) / 5;
                                                                                                                                            var10 = var10 + var8 * 2;
                                                                                                                                            continue;
                                                                                                                                          }
                                                                                                                                          stackIn_948_0Lifetime1 = var8;
                                                                                                                                          stackIn_948_1Lifetime1 = 2;
                                                                                                                                          var8 = stackIn_948_0Lifetime1 / stackIn_948_1Lifetime1;
                                                                                                                                          continue;
                                                                                                                                        }
                                                                                                                                        stackIn_950_0 = 0;
                                                                                                                                      }
                                                                                                                                      break;
                                                                                                                                    }
                                                                                                                                    var10 = stackIn_950_0;
                                                                                                                                    while (~var10 > ~var5) {
                                                                                                                                      if (var16 != 0) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                      if (this.spellType != 112) {
                                                                                                                                        if (this.spellType != 93) {
                                                                                                                                          if (var5 - 1 > var10) {
                                                                                                                                            SoftwareRasterizer.drawLine(var6[var10], var7_ref_int__[var10], var6[var10 + 1], var7_ref_int__[var10 + 1], 16777215);
                                                                                                                                          }
                                                                                                                                          QuickChatPhraseCache.fillCircleMasked(8, (byte) 105, -(25 * (this.ageTicks * var10) / var5) + 255 >> 4, var6[var10], var7_ref_int__[var10]);
                                                                                                                                        } else {
                                                                                                                                          if (~(-1 + var5) < ~var10) {
                                                                                                                                            SoftwareRasterizer.drawLine(var6[var10], var7_ref_int__[var10], var6[1 + var10], var7_ref_int__[1 + var10], 16777215);
                                                                                                                                          }
                                                                                                                                          QuickChatPhraseCache.fillCircleMasked(8, (byte) 125, 255 - var10 * (this.ageTicks * 25 - 500) / var5 >> 4, var6[var10], var7_ref_int__[var10]);
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        if (-1 + var5 > var10) {
                                                                                                                                          SoftwareRasterizer.drawLineBlendedInclusive(var6[var10], var7_ref_int__[var10], var6[var10 + 1], var7_ref_int__[1 + var10], 16777215, -(this.ageTicks * 5 * var10 / var5) + 255 >> 4);
                                                                                                                                        }
                                                                                                                                        QuickChatPhraseCache.fillCircleMasked(8, (byte) 94, -(var10 * 5 * this.ageTicks / var5) + 255 >> 4, var6[var10], var7_ref_int__[var10]);
                                                                                                                                      }
                                                                                                                                      var10++;
                                                                                                                                      continue;
                                                                                                                                    }
                                                                                                                                    if (var16 == 0) {
                                                                                                                                      return;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  var5 = 0;
                                                                                                                                  while (true) {
                                                                                                                                    if (5 > var5) {
                                                                                                                                      QuickChatPhraseCache.fillCircleMasked(8, (byte) 66, 32, -16 + (offsetX + this.x + (int)(Math.random() * 32.0)), offsetY + this.y + ((int)(Math.random() * 32.0) - 16));
                                                                                                                                      var5++;
                                                                                                                                      if (var16 == 0) {
                                                                                                                                        continue;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      QuickChatPhraseCache.fillCircleMasked(16, (byte) 62, 64, offsetX + this.x, offsetY + this.y);
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                  }
                                                                                                                                  if (var16 == 0) {
                                                                                                                                    return;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                var5 = (int)(96.0 * Math.sin(0.01 * (6.28 * (double)this.field_x)));
                                                                                                                                var6_int = (this.field_x & 12 & 15) >> 2;
                                                                                                                                FlagSumHelpers.field_f[4 + var6_int].drawTransparent(this.x + offsetX + (-64 + var5), offsetY + this.y);
                                                                                                                                FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparent(-64 + this.x + (offsetX - var5), this.y + offsetY);
                                                                                                                                FlagSumHelpers.field_f[(3 & var6_int + 1) + 4].drawTransparentWithOpacity(-(6 * var5 / 10) + this.x + offsetX - 64, this.y - (-offsetY + 4), 192);
                                                                                                                                FlagSumHelpers.field_f[4 + (3 & var6_int + 2)].drawTransparentWithOpacity(var5 * 4 / 10 + (-64 + (this.x + offsetX)), this.y - (-offsetY + 8), 128);
                                                                                                                                FlagSumHelpers.field_f[(var6_int + 3 & 3) + 4].drawTransparentWithOpacity(-64 + (offsetX + this.x) - var5 * 2 / 10, this.y + offsetY - 12, 96);
                                                                                                                                if (var16 == 0) {
                                                                                                                                  return;
                                                                                                                                }
                                                                                                                              }
                                                                                                                              var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.01) * 96.0);
                                                                                                                              var6_int = (15 & (this.field_x & 12)) >> 2;
                                                                                                                              FlagSumHelpers.field_f[4 + var6_int].drawTransparentWithOpacity(offsetX + this.x - (64 - var5), this.y + offsetY, 64);
                                                                                                                              FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparentWithOpacity(-var5 - 64 + (offsetX + this.x), offsetY + this.y, 128);
                                                                                                                              FlagSumHelpers.field_f[(1 + var6_int & 3) + 4].drawTransparentWithOpacity(-(6 * var5 / 10) + offsetX + this.x - 64, -4 + offsetY + this.y, 96);
                                                                                                                              FlagSumHelpers.field_f[4 + (var6_int + 2 & 3)].drawTransparentWithOpacity(var5 * 4 / 10 + (this.x + offsetX - 64), this.y + offsetY - 8, 64);
                                                                                                                              FlagSumHelpers.field_f[(var6_int + 3 & 3) + 4].drawTransparentWithOpacity(-64 + (offsetX + this.x - 2 * var5 / 10), -12 + this.y + offsetY, 32);
                                                                                                                              if (var16 == 0) {
                                                                                                                                return;
                                                                                                                              }
                                                                                                                            }
                                                                                                                            var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.02) * 64.0);
                                                                                                                            var6_int = 3 & (12 & this.field_x) >> 2;
                                                                                                                            FlagSumHelpers.field_f[var6_int + 4].drawTransparent(var5 + (-64 + offsetX + this.x), offsetY + this.y);
                                                                                                                            FlagSumHelpers.field_f[4 + (3 & var6_int + 3)].drawTransparent(-var5 + (-64 + (offsetX + this.x)), offsetY + this.y);
                                                                                                                            FlagSumHelpers.field_f[4 + (1 + var6_int & 3)].drawTransparentWithOpacity(-64 + (offsetX + this.x - var5 * 6 / 10), this.y + offsetY - 4, 192);
                                                                                                                            FlagSumHelpers.field_f[4 + (var6_int + 2 & 3)].drawTransparentWithOpacity(-64 + (this.x + offsetX) + 4 * var5 / 10, offsetY + this.y - 8, 128);
                                                                                                                            FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparentWithOpacity(-(2 * var5 / 10) + offsetX + this.x - 64, this.y - (-offsetY + 12), 96);
                                                                                                                            if (var16 == 0) {
                                                                                                                              return;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.01) * 96.0);
                                                                                                                          var6_int = (this.field_x & 12) >> 2 & 3;
                                                                                                                          FlagSumHelpers.field_f[4 + var6_int].drawTransparent(-64 + this.x - (-offsetX - var5), this.y + offsetY);
                                                                                                                          FlagSumHelpers.field_f[4 + (var6_int + 3 & 3)].drawTransparent(-var5 + offsetX + (this.x - 64), this.y + offsetY);
                                                                                                                          FlagSumHelpers.field_f[4 + (3 & var6_int + 1)].drawTransparentWithOpacity(this.x + offsetX + (-64 - var5 * 6 / 10), this.y - (-offsetY + 4), 192);
                                                                                                                          FlagSumHelpers.field_f[4 + (3 & var6_int + 2)].drawTransparentWithOpacity(this.x + offsetX - 64 + var5 * 4 / 10, -8 + (this.y + offsetY), 128);
                                                                                                                          FlagSumHelpers.field_f[(3 + var6_int & 3) + 4].drawTransparentWithOpacity(offsetX + this.x - (64 + var5 * 2 / 10), offsetY + this.y - 12, 96);
                                                                                                                          if (var16 == 0) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        if (this.field_x >= 128) {
                                                                                                                          QuickChatPhraseCache.fillCircleMasked(128 + this.field_x, (byte) 63, 320 - this.field_x, offsetX + this.x, this.y + offsetY);
                                                                                                                          if (var16 == 0) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        QuickChatPhraseCache.fillCircleMasked(256 - this.field_x + 128, (byte) 72, this.field_x + 64, this.x + offsetX, offsetY + this.y);
                                                                                                                        if (var16 == 0) {
                                                                                                                          return;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      ChatLine.field_c[7 & this.x + this.y * 3].draw(-12 + offsetX + this.x, offsetY + this.y - 12);
                                                                                                                      BufferedMessage.fillCircleOr(offsetY + this.y, offsetX + this.x, 256 - Math.abs(this.field_x), 2232, 16);
                                                                                                                      if (var16 == 0) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    SoftwareRasterizer.fillRadialPaletteCircle(this.x + offsetX << 4, offsetY + this.y << 4, 112, 250 - this.field_x, StatusMessageHelpers.field_a);
                                                                                                                    if (var16 == 0) {
                                                                                                                      return;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle(offsetX + this.x << 4, offsetY + this.y << 4, 112, 250, AccountCreationHelpers.field_g);
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle(-((this.velocityY / 2 + this.velocityX) / 4) + (offsetX + this.x << 4), (offsetY + this.y << 4) + (this.velocityX / 2 - this.velocityY) / 4, 80, 250, AccountCreationHelpers.field_g);
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle((this.x + offsetX << 4) + (-this.velocityX + this.velocityY / 2) / 4, -((this.velocityX / 2 + this.velocityY) / 4) + (offsetY + this.y << 4), 80, 250, AccountCreationHelpers.field_g);
                                                                                                                  if (var16 == 0) {
                                                                                                                    return;
                                                                                                                  }
                                                                                                                }
                                                                                                                ScreenSwitchHelpers.field_f[0].draw(-this.spriteRadius + offsetX + this.x, -8 + this.y - (-offsetY - this.spriteRadius));
                                                                                                                if (var16 == 0) {
                                                                                                                  return;
                                                                                                                }
                                                                                                              }
                                                                                                              if ((0 == this.ageTicks) &&
                                                                                                                (this.velocityX != 0) &&
                                                                                                                (this.velocityY != 0)) {
                                                                                                                var5 = (int)(Math.atan2((double)this.velocityX, (double)this.velocityY) * 32368.0 / 3.141592653589793);
                                                                                                                if (0 > var5) {
                                                                                                                  var5 = var5 + 65536;
                                                                                                                }
                                                                                                                this.field_x = var5;
                                                                                                              }
                                                                                                              var5 = this.field_x;
                                                                                                              QuickChatPhrase.field_x[1].drawRotatedQuarterScale(4096, offsetY + this.y, 41, offsetX + this.x, var5);
                                                                                                              if (this.ageTicks <= 0) {
                                                                                                                return;
                                                                                                              }
                                                                                                              ChatPanel.field_a[(15 & this.ageTicks) >> 1].draw(-32 + this.x + offsetX, -32 + (offsetY + this.y));
                                                                                                              if (var16 == 0) {
                                                                                                                return;
                                                                                                              }
                                                                                                            }
                                                                                                            if ((0 != this.velocityX) &&
                                                                                                              (0 != this.velocityY)) {
                                                                                                              var5 = (int)(32368.0 * Math.atan2((double)this.velocityX, (double)this.velocityY) / 3.141592653589793);
                                                                                                              if (0 > var5) {
                                                                                                                var5 = var5 + 65536;
                                                                                                              }
                                                                                                              this.field_x = var5;
                                                                                                            }
                                                                                                            var5 = this.field_x;
                                                                                                            QuickChatPhrase.field_x[8].drawRotatedQuarterScale(2048, offsetY + this.y, 122, offsetX + this.x, var5 + 32768);
                                                                                                            if (var16 == 0) {
                                                                                                              return;
                                                                                                            }
                                                                                                          }
                                                                                                          if ((0 != this.velocityX) &&
                                                                                                            (this.velocityY != 0)) {
                                                                                                            var5 = (int)(32368.0 * Math.atan2((double)this.velocityX, (double)this.velocityY) / 3.141592653589793);
                                                                                                            if (var5 < 0) {
                                                                                                              var5 = var5 + 65536;
                                                                                                            }
                                                                                                            this.field_x = var5;
                                                                                                          }
                                                                                                          var5 = this.field_x;
                                                                                                          this.sprite.drawRotatedQuarterScale(4096, this.y + offsetY, 122, this.x + offsetX, var5 + 32768);
                                                                                                          if (var16 == 0) {
                                                                                                            return;
                                                                                                          }
                                                                                                        }
                                                                                                        var5 = ArrayWidgetContainer.field_E.length * this.field_x / 256;
                                                                                                        if (0 > var5) {
                                                                                                          var5 = 0;
                                                                                                        }
                                                                                                        if (ArrayWidgetContainer.field_E.length <= var5) {
                                                                                                          var5 = -1 + ArrayWidgetContainer.field_E.length;
                                                                                                        }
                                                                                                        ArrayWidgetContainer.field_E[var5].drawScaledAlpha(offsetX + (this.x - 128), -128 + this.y + offsetY, 256, 256, 64);
                                                                                                        if (var16 == 0) {
                                                                                                          return;
                                                                                                        }
                                                                                                      }
                                                                                                      regionExit70: {
                                                                                                        if ((this.owner != null) &&
                                                                                                          (6 == this.owner.unitType)) {
                                                                                                          if (this.ageTicks < 1) {
                                                                                                            ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(-64 + (this.x + offsetX), this.y - (-offsetY + 64), 128, 128, 64);
                                                                                                            if (var16 == 0) {
                                                                                                              break regionExit70;
                                                                                                            }
                                                                                                          }
                                                                                                          ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(this.x - (-offsetX + 64), this.y + (offsetY - 64), 128, 128, 32);
                                                                                                          if (var16 == 0) {
                                                                                                            break regionExit70;
                                                                                                          }
                                                                                                        }
                                                                                                        if (this.ageTicks >= 1) {
                                                                                                          ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(-128 + (offsetX + this.x), this.y + (offsetY - 128), 256, 256, 32);
                                                                                                          if (var16 == 0) {
                                                                                                            break regionExit70;
                                                                                                          }
                                                                                                        }
                                                                                                        ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(this.x + offsetX - 128, -128 + this.y + offsetY, 256, 256, 64);
                                                                                                      }
                                                                                                      var5 = 128;
                                                                                                      if ((null != this.owner) &&
                                                                                                        (this.owner.unitType == 6)) {
                                                                                                        var5 = 64;
                                                                                                      }
                                                                                                      MidiPcmStream.field_L.setDeque((byte) 36, this.battle.units);
                                                                                                      var6_ref = (BattleUnit) (MidiPcmStream.field_L.first(-68));
                                                                                                      while (var6_ref != null) {
                                                                                                        if (var16 != 0) {
                                                                                                          return;
                                                                                                        }
                                                                                                        if (((this.owner != var6_ref) ||
                                                                                                          ((6 != var6_ref.unitType) &&
                                                                                                          (!(!((var6_ref.unitType != 16) &&
                                                                                                          (var6_ref.unitType != 23))) ||
                                                                                                          (55 == this.spellType))))) {
                                                                                                          var7 = this.x - var6_ref.x;
                                                                                                          var8 = this.y - var6_ref.y + var6_ref.size / 2;
                                                                                                          if ((var7 * var7 + var8 * var8 < (var5 + var6_ref.size / 2) * (var5 + var6_ref.size / 2)) &&
                                                                                                            (var6_ref.unitType != 35)) {
                                                                                                            var9 = var6_ref.getSize(-8323) / 2;
                                                                                                            var10 = offsetX + var6_ref.x;
                                                                                                            var11 = var6_ref.y + offsetY - var9;
                                                                                                            ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(-var9 + var10, -var9 + var11, var9 * 2, 2 * var9, 48);
                                                                                                          }
                                                                                                        }
                                                                                                        var6_ref = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                                                                        continue;
                                                                                                      }
                                                                                                      if (var16 == 0) {
                                                                                                        return;
                                                                                                      }
                                                                                                    }
                                                                                                    ScreenSwitchHelpers.field_f[6].draw(-this.spriteRadius + this.x + offsetX, -this.spriteRadius + (offsetY + this.y));
                                                                                                    if (var16 == 0) {
                                                                                                      return;
                                                                                                    }
                                                                                                  }
                                                                                                  if (this.sprite == null) {
                                                                                                    return;
                                                                                                  }
                                                                                                  this.sprite.drawTransparent(offsetX + (this.x - this.spriteRadius), this.y + offsetY - this.spriteRadius);
                                                                                                  return;
                                                                                                }
                                                                                              }
                                                                                              var5 = 0;
                                                                                              while (var5 < 5) {
                                                                                                var6_int = -320 - (-offsetX + 64);
                                                                                                var7 = -128 + offsetY + this.battle.arenaHeight;
                                                                                                var8_double = 4.0 * ((double)var5 * 3.14) + (double)this.ageTicks;
                                                                                                FlagSumHelpers.field_f[(this.ageTicks / 6 + var5) % 6 + 8].drawTransparent((int)(Math.sin(0.1 * var8_double) * 100.0) + var6_int, -(int)(80.0 * Math.cos(var8_double * 0.1)) + var7 + 60);
                                                                                                var6_int = -64 + (320 + this.battle.arenaWidth + offsetX);
                                                                                                FlagSumHelpers.field_f[(this.ageTicks / 6 + var5) % 6 + 8].drawHorizontalFlip(var6_int - (int)(100.0 * Math.sin(0.1 * var8_double)), var7 - ((int)(Math.cos(0.1 * var8_double) * 80.0) - 60));
                                                                                                var5++;
                                                                                                if (var16 != 0) {
                                                                                                  return;
                                                                                                }
                                                                                                continue;
                                                                                              }
                                                                                              if (var16 == 0) {
                                                                                                return;
                                                                                              }
                                                                                            }
                                                                                            var5 = offsetX + this.x;
                                                                                            var6_int = this.y + offsetY;
                                                                                            LoginLoadingHelpers.field_g[128].drawTransparent(-20 + var5, var6_int - 32);
                                                                                            if (var16 == 0) {
                                                                                              return;
                                                                                            }
                                                                                          }
                                                                                          if (this.velocityY >= 0) {
                                                                                            var5 = this.x + offsetX;
                                                                                            var6_int = offsetY + this.y;
                                                                                            DualLinkDeque.field_b[14].draw(var5 - 16, -12 + var6_int);
                                                                                            if (var16 == 0) {
                                                                                              return;
                                                                                            }
                                                                                          }
                                                                                          var5 = offsetX + this.x;
                                                                                          var6_int = offsetY + this.y;
                                                                                          DualLinkDeque.field_b[15].draw(-16 + var5, -12 + var6_int);
                                                                                          if (var16 == 0) {
                                                                                            return;
                                                                                          }
                                                                                        }
                                                                                        if (this.ageTicks <= 50) {
                                                                                          return;
                                                                                        }
                                                                                        var5 = -50 + this.ageTicks;
                                                                                        if (var5 > 15) {
                                                                                          var5 = 30 - var5;
                                                                                        }
                                                                                        var6_int = 15 * this.velocityX / 17 >> 4;
                                                                                        var7 = this.velocityY * 15 / 17 >> 4;
                                                                                        var8 = 1;
                                                                                        while (~var8 > ~(var5 * 3 / 2)) {
                                                                                          if (var16 != 0) {
                                                                                            return;
                                                                                          }
                                                                                          stackIn_508_0 = ScreenSwitchHelpers.field_f;
                                                                                          if ((var8 & 1) != 1) {
                                                                                            if ((var8 & 2) != 2) {
                                                                                              stackIn_512_1 = 27;
                                                                                            } else {
                                                                                              stackIn_512_1 = 26;
                                                                                            }
                                                                                          } else {
                                                                                            stackIn_512_1 = 22;
                                                                                          }
                                                                                          ((IndexedSprite) (Object) stackIn_508_0[stackIn_512_1]).draw(-8 + this.x + offsetX + var6_int * var8 / 23, var7 * var8 / 23 + this.y + (offsetY - 8));
                                                                                          var8++;
                                                                                          continue;
                                                                                        }
                                                                                        if (var16 == 0) {
                                                                                          return;
                                                                                        }
                                                                                      }
                                                                                      if (this.field_x > 0) {
                                                                                        return;
                                                                                      }
                                                                                      var5 = offsetX + this.x;
                                                                                      var6_int = this.y + offsetY - this.ageTicks;
                                                                                      this.sprite.drawTransparent(-8 + var5, -8 + var6_int);
                                                                                      if (var16 == 0) {
                                                                                        return;
                                                                                      }
                                                                                    }
                                                                                    if (this.ageTicks < 256) {
                                                                                      var5 = this.x + offsetX;
                                                                                      var6_int = -16 + (offsetY + this.y);
                                                                                      var7 = 0;
                                                                                      do {
                                                                                        if (!(var7 < 8)) {
                                                                                          BufferedMessage.fillCircleOr(var6_int, var5, 256, 2232, 16);
                                                                                          var5 = this.x + offsetX + this.velocityX;
                                                                                          var6_int = -16 + this.velocityY + (this.y + offsetY);
                                                                                          break;
                                                                                        }
                                                                                        var8_double = (double)(var7 * 32 + this.ageTicks) * 3.141592653589793 / 128.0;
                                                                                        ChatLine.field_c[var7].drawQuarterSize((int)(Math.sin(var8_double) * 14.0) + (-2 + var5), (int)(Math.cos(var8_double) * 14.0) + (-2 + var6_int));
                                                                                        var7++;
                                                                                      } while (var16 == 0);
                                                                                      var7 = 0;
                                                                                      do {
                                                                                        if (!(var7 < 8)) {
                                                                                          BufferedMessage.fillCircleOr(var6_int, var5, 256, 2232, 16);
                                                                                          break;
                                                                                        }
                                                                                        var8_double = 3.141592653589793 * (double)(32 * var7 - this.ageTicks) / 128.0;
                                                                                        ChatLine.field_c[var7].drawQuarterSize((int)(14.0 * Math.sin(var8_double)) + var5 - 2, -2 + var6_int + (int)(Math.cos(var8_double) * 14.0));
                                                                                        var7++;
                                                                                      } while (var16 == 0);
                                                                                      if (var16 == 0) {
                                                                                        return;
                                                                                      }
                                                                                    }
                                                                                    var5 = this.x + offsetX;
                                                                                    var6_int = -16 + (offsetY + this.y);
                                                                                    var7 = 0;
                                                                                    do {
                                                                                      if (!(var7 < 8)) {
                                                                                        BufferedMessage.fillCircleOr(var6_int, var5, 32, 2232, 16);
                                                                                        var5 = offsetX + this.x + this.velocityX;
                                                                                        var6_int = -16 + this.velocityY + offsetY + this.y;
                                                                                        break;
                                                                                      }
                                                                                      var8_double = (double)(this.ageTicks + 32 * var7) * 3.141592653589793 / 128.0;
                                                                                      ChatLine.field_c[var7].drawQuarterSize((int)(14.0 * Math.sin(var8_double)) - 2 + var5, var6_int - (2 - (int)(14.0 * Math.cos(var8_double))));
                                                                                      var7++;
                                                                                    } while (var16 == 0);
                                                                                    var7 = 0;
                                                                                    do {
                                                                                      if (!(var7 < 8)) {
                                                                                        BufferedMessage.fillCircleOr(var6_int, var5, 32, 2232, 16);
                                                                                        break;
                                                                                      }
                                                                                      var8_double = 3.141592653589793 * (double)(var7 * 32 - this.ageTicks) / 128.0;
                                                                                      ChatLine.field_c[var7].drawQuarterSize((int)(Math.sin(var8_double) * 14.0) - 2 + var5, (int)(14.0 * Math.cos(var8_double)) + (-2 + var6_int));
                                                                                      var7++;
                                                                                    } while (var16 == 0);
                                                                                    if (var16 == 0) {
                                                                                      return;
                                                                                    }
                                                                                  }
                                                                                  var5 = this.ageTicks;
                                                                                  if (this.ageTicks > 118) {
                                                                                    var5 = (15104 - this.ageTicks * 118) / 10;
                                                                                  }
                                                                                  var6_int = -480 + offsetY;
                                                                                  while (true) {
                                                                                    if (var6_int < offsetY + (this.y + 16)) {
                                                                                      QuickChatPhraseCache.fillCircleMasked(32, (byte) 99, var5 * 2, offsetX + this.x, var6_int);
                                                                                      var6_int += 16;
                                                                                      if (var16 == 0) {
                                                                                        continue;
                                                                                      }
                                                                                    } else {
                                                                                      QuickChatPhraseCache.fillCircleMasked(var5 * 2, (byte) 103, 2 * var5, this.x + offsetX, this.y + offsetY);
                                                                                    }
                                                                                    break;
                                                                                  }
                                                                                  if (var16 == 0) {
                                                                                    return;
                                                                                  }
                                                                                }
                                                                                var5 = this.ageTicks;
                                                                                if (this.ageTicks > 118) {
                                                                                  var5 = (-(this.ageTicks * 118) + 15104) / 10;
                                                                                }
                                                                                {
                                                                                  boolean decompiledFrameCompleted0 = true;
                                                                                  if (this.ageTicks < 128) {
                                                                                    var6_int = -480 + offsetY;
                                                                                    while (~(16 + this.y + offsetY) < ~var6_int) {
                                                                                      QuickChatPhraseCache.fillCircleMasked(32, (byte) 81, 2 * var5, offsetX + this.x, var6_int);
                                                                                      var6_int += 16;
                                                                                      if (var16 != 0) {
                                                                                        decompiledFrameCompleted0 = false;
                                                                                        break;
                                                                                      }
                                                                                      continue;
                                                                                    }
                                                                                    if (decompiledFrameCompleted0) {
                                                                                      BufferedMessage.fillCircleOr(offsetY + this.y, offsetX + this.x, var5 * 2, 2232, var5 * 2);
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var16 == 0) {
                                                                                  return;
                                                                                }
                                                                              }
                                                                              if (this.owner == null) {
                                                                                return;
                                                                              }
                                                                              var5 = this.field_x;
                                                                              if (this.field_x > 128) {
                                                                                var5 = -this.field_x + 256;
                                                                              }
                                                                              var6_int = this.owner.size >> 1;
                                                                              if (this.owner.unitType == 9) {
                                                                                var6_int = 24;
                                                                              }
                                                                              QuickChatPhraseCache.fillCircleMasked(var6_int, (byte) 62, var5, this.x + offsetX, -var6_int + (this.y + offsetY));
                                                                              if (var16 == 0) {
                                                                                return;
                                                                              }
                                                                            }
                                                                            if (null == this.owner) {
                                                                              return;
                                                                            }
                                                                            var5 = 46;
                                                                            var6_int = var5 * var5;
                                                                            var7 = 256;
                                                                            var8 = -var5;
                                                                            while (true) {
                                                                              stackIn_593_0 = var5;
                                                                              stackIn_593_1 = var8;
                                                                              if (stackIn_593_0 > stackIn_593_1) {
                                                                                if (var16 != 0) {
                                                                                  return;
                                                                                }
                                                                                var9 = -var5;
                                                                                while (var5 > var9) {
                                                                                  var10 = var9 * var9 + var8 * var8;
                                                                                  var11 = this.owner.x + var8 + offsetX;
                                                                                  var12 = -(this.owner.size / 2) + var9 + (offsetY + this.owner.y);
                                                                                  var13 = 64 * (63 & SpriteState.field_v + var9 / 2) + (63 & var8 / 2 + SpriteState.field_v);
                                                                                  stackIn_593_0 = ~QuickChatPhrase.field_x[9].field_A.length;
                                                                                  stackIn_593_1 = ~var13;
                                                                                  if (stackIn_593_0 >= stackIn_593_1) {
                                                                                    var13 = 0;
                                                                                  }
                                                                                  var14 = QuickChatPhrase.field_x[9].field_A[var13] & 255;
                                                                                  var15 = 255 - var14;
                                                                                  if (!((~var6_int < ~var10) &&
                                                                                    (~var10 < ~var7))) {
                                                                                    if (!(var7 < var10)) {
                                                                                      SoftwareRasterizer.fillRectangleAlpha(var11, var12, 1, 1, 0, var15 * var10 / var7);
                                                                                      SoftwareRasterizer.addPixelScaled(var11, var12, 16711935, var10 * var14 / var7);
                                                                                    }
                                                                                  } else {
                                                                                    SoftwareRasterizer.fillRectangleAlpha(var11, var12, 1, 1, 0, -(var15 * (-var7 + var10) / (var6_int - var7)) + var15);
                                                                                    SoftwareRasterizer.addPixelScaled(var11, var12, 16711935, var14 - (var10 - var7) * var14 / (-var7 + var6_int));
                                                                                  }
                                                                                  var9++;
                                                                                  continue;
                                                                                }
                                                                                var8++;
                                                                                continue;
                                                                              }
                                                                              break;
                                                                            }
                                                                            if (var16 == 0) {
                                                                              return;
                                                                            }
                                                                          }
                                                                          if (this.owner == null) {
                                                                            return;
                                                                          }
                                                                          var5 = this.owner.size >> 1;
                                                                          var8 = 512 * SpriteState.field_v;
                                                                          var9 = 0;
                                                                          while (var9 < 16) {
                                                                            var6_int = (int)((double)(offsetX + this.x) + Math.sin(0.12 * (double)SpriteState.field_v + 0.6 * (double)var9) * (double)var5);
                                                                            var7 = (int)((double)(offsetY + this.y - var5) + Math.cos((double)SpriteState.field_v * 0.12 + (double)var9 * 0.6) * (double)var5);
                                                                            ScreenSwitchHelpers.field_f[20].toRgbSprite().drawRotatedQuarterScale(4096 - 500 * var9, var7, -18, var6_int, var8);
                                                                            var9++;
                                                                            if (var16 != 0) {
                                                                              return;
                                                                            }
                                                                            continue;
                                                                          }
                                                                          if (var16 == 0) {
                                                                            return;
                                                                          }
                                                                        }
                                                                        if (null == this.owner) {
                                                                          return;
                                                                        }
                                                                        var5 = this.owner.size >> 1;
                                                                        var8 = 512 * SpriteState.field_v;
                                                                        var6_int = (int)((double)(this.x + offsetX) + Math.sin((double)SpriteState.field_v * 0.1 - 1.6) * (double)var5);
                                                                        var7 = (int)((double)(-var5 + offsetY + this.y) + (double)var5 * Math.cos(0.09 * (double)SpriteState.field_v - 1.6));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(2000, var7, 127, var6_int, var8);
                                                                        var6_int = (int)((double)(this.x + offsetX) + (double)var5 * Math.sin((double)SpriteState.field_v * 0.1 - 0.8));
                                                                        var7 = (int)((double)(this.y + offsetY - var5) + (double)var5 * Math.cos(-0.8 + 0.09 * (double)SpriteState.field_v));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(2500, var7, 124, var6_int, var8);
                                                                        var6_int = (int)((double)(this.x + offsetX) + Math.sin(0.1 * (double)SpriteState.field_v) * (double)var5);
                                                                        var7 = (int)((double)(-var5 + this.y + offsetY) + (double)var5 * Math.cos((double)SpriteState.field_v * 0.09));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(3000, var7, 123, var6_int, var8);
                                                                        if (var16 == 0) {
                                                                          return;
                                                                        }
                                                                      }
                                                                      var5 = 2000 * SpriteState.field_v;
                                                                      this.sprite.drawRotatedQuarterScale(4096, offsetY + this.y, -43, offsetX + this.x, var5);
                                                                      if (var16 == 0) {
                                                                        return;
                                                                      }
                                                                    }
                                                                    if (null == this.owner) {
                                                                      return;
                                                                    }
                                                                    var5 = this.field_x;
                                                                    if (this.field_x > 128) {
                                                                      var5 = 256 - this.field_x;
                                                                    }
                                                                    QuickChatPhraseCache.fillCircleMasked(this.owner.size >> 1, (byte) 70, 128 + var5, this.x + offsetX, -(this.owner.size >> 1) + this.y + offsetY);
                                                                    var6_int = 0;
                                                                    while (3 > var6_int) {
                                                                      var7 = (int)(Math.sin((double)(this.field_x + var6_int * 256 / 3) * 3.141592653589793 / 128.0) * (double)(this.owner.size >> 1));
                                                                      var8 = (int)(Math.cos(3.141592653589793 * (double)(var6_int * 256 / 3 + this.field_x) / 128.0) * (double)(this.owner.size >> 1));
                                                                      QuickChatPhraseCache.fillCircleMasked(this.owner.size >> 2, (byte) 68, var5 + 128, var7 + (offsetX + this.x), -(this.owner.size >> 1) + var8 + offsetY + this.y);
                                                                      var6_int++;
                                                                      if (var16 != 0) {
                                                                        return;
                                                                      }
                                                                      continue;
                                                                    }
                                                                    if (var16 == 0) {
                                                                      return;
                                                                    }
                                                                  }
                                                                  QuickChatPhraseCache.fillCircleMasked(32, (byte) 88, 256, this.x + offsetX, offsetY + this.y);
                                                                  if (var16 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                QuickChatPhraseCache.fillCircleMasked(64, (byte) 97, 256, this.x + offsetX, offsetY + this.y);
                                                                if (var16 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              QuickChatPhraseCache.fillCircleMasked(16, (byte) 94, 256, offsetX + this.x, offsetY + this.y);
                                                              if (var16 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            QuickChatPhraseCache.fillCircleMasked(8, (byte) 79, -(this.ageTicks << 3) + 256, offsetX + this.x, this.y + offsetY);
                                                            if (var16 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          QuickChatPhraseCache.fillCircleMasked(80, (byte) 120, -(this.ageTicks << 3) + 256, offsetX + this.x, offsetY + this.y);
                                                          if (this.ageTicks >= 32) {
                                                            return;
                                                          }
                                                          QuickChatPhraseCache.fillCircleMasked(32 * this.ageTicks + 60, (byte) 64, -(256 - (this.ageTicks << 3)), this.x + offsetX, offsetY + this.y);
                                                          if (var16 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        BufferedMessage.fillCircleOr(offsetY + this.y, offsetX + this.x, 256, 2232, 8);
                                                        if (var16 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      BufferedMessage.fillCircleOr(offsetY + this.y, this.x + offsetX, 256, 2232, 10);
                                                      if (this.ageTicks <= 225) {
                                                        return;
                                                      }
                                                      BufferedMessage.fillCircleOr(this.y + offsetY, this.x + offsetX, (256 * this.ageTicks - 57600) / 25, 2232, 96);
                                                      if (var16 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    BufferedMessage.fillCircleOr(offsetY + this.y, offsetX + this.x, 256 * this.ageTicks / 25, 2232, 96);
                                                    if (var16 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (this.owner == null) {
                                                    return;
                                                  }
                                                  BufferedMessage.fillCircleOr(this.y + offsetY, this.x + offsetX, this.ageTicks * 256 / this.owner.health, 2232, this.owner.size + 2 * this.owner.health);
                                                  if (var16 == 0) {
                                                    return;
                                                  }
                                                }
                                                SoftwareRasterizer.fillCircleAlpha(offsetX + this.x, offsetY + this.y, 16, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(offsetX + this.x, this.y + offsetY, 18, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(offsetX + this.x, this.y + offsetY, 20, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(this.x + offsetX, this.y + offsetY, 22, 0, 64);
                                                if (var16 == 0) {
                                                  return;
                                                }
                                              }
                                              if (null == DisplayNameForm.field_E) {
                                                return;
                                              }
                                              DisplayNameForm.field_E[this.field_H].draw(-50 + (this.x + offsetX), this.y - (-offsetY + 50));
                                              if (var16 == 0) {
                                                return;
                                              }
                                            }
                                            if (DiskCacheWorker.field_a == null) {
                                              return;
                                            }
                                            DiskCacheWorker.field_a[this.field_H].draw(offsetX + this.x - 50, -50 + offsetY + this.y);
                                            if (var16 == 0) {
                                              return;
                                            }
                                          }
                                          if (null == MouseInputHandler.field_a) {
                                            return;
                                          }
                                          MouseInputHandler.field_a[this.field_H].draw(-50 + this.x + offsetX, -50 + offsetY + this.y);
                                          if (var16 == 0) {
                                            return;
                                          }
                                        }
                                        if (PaletteSpriteHelpers.field_k == null) {
                                          return;
                                        }
                                        if (0 > this.field_H) {
                                          return;
                                        }
                                        PaletteSpriteHelpers.field_k[this.field_H].draw(-8 + (this.x + offsetX), this.y - (-offsetY + 8));
                                        if (var16 == 0) {
                                          return;
                                        }
                                      }
                                      if (DebouncedValidator.field_b == null) {
                                        return;
                                      }
                                      if (this.field_H < 0) {
                                        return;
                                      }
                                      DebouncedValidator.field_b[this.field_H].draw(-8 + (offsetX + this.x), -8 + (offsetY + this.y));
                                      if (var16 == 0) {
                                        return;
                                      }
                                    }
                                    if (null == DisplayNameForm.field_E) {
                                      return;
                                    }
                                    if (0 > this.field_H) {
                                      return;
                                    }
                                    FadingModalPanel.field_M[this.field_H].draw(-8 + (this.x + offsetX), -8 + this.y + offsetY);
                                    if (var16 == 0) {
                                      return;
                                    }
                                  }
                                  if (null == AccountCreationHelpers.field_f) {
                                    return;
                                  }
                                  if (null == this.owner) {
                                    return;
                                  }
                                  if (this.ageTicks < 250) {
                                    AccountCreationHelpers.field_f[this.field_x >> 2].draw(-25 + this.x + offsetX, -65 + (offsetY + this.y));
                                    if (var16 == 0) {
                                      return;
                                    }
                                  }
                                  AccountCreationHelpers.field_f[this.field_x >> 2].drawAlpha(-25 + (offsetX + this.x), offsetY + (this.y - 65), 64);
                                  if (var16 == 0) {
                                    return;
                                  }
                                }
                                if (null == IterableNodeHashTable.field_a) {
                                  return;
                                }
                                if (this.owner == null) {
                                  return;
                                }
                                if (this.ageTicks >= 250) {
                                  IterableNodeHashTable.field_a[this.field_x >> 1].draw(offsetX + (this.x - 24), -(this.owner.size >> 1) + this.y - (-offsetY + 32));
                                  if (var16 == 0) {
                                    return;
                                  }
                                }
                                IterableNodeHashTable.field_a[this.field_x >> 1].draw(offsetX + this.x - 24, this.y + offsetY + (-32 - (this.owner.size >> 1)));
                                if (var16 == 0) {
                                  return;
                                }
                              }
                              if (ChatPanel.field_a == null) {
                                return;
                              }
                              if (this.owner == null) {
                                return;
                              }
                              if (5 > this.ageTicks) {
                                ChatPanel.field_a[this.field_x >> 1].draw(-32 + (offsetX + this.x), this.y + offsetY + (-32 - (this.owner.size >> 1)));
                                if (var16 == 0) {
                                  return;
                                }
                              }
                              ChatPanel.field_a[this.field_x >> 1].drawAlpha(-32 + (this.x + offsetX), this.y + (offsetY + (-32 - (this.owner.size >> 1))), 64);
                              if (var16 == 0) {
                                return;
                              }
                            }
                            if (null == BirthDateEntryPanel.field_S) {
                              return;
                            }
                            if (this.ageTicks < 250) {
                              BirthDateEntryPanel.field_S[this.field_x >> 1].draw(offsetX + this.x - 25, -64 + (this.y + offsetY));
                              if (var16 == 0) {
                                return;
                              }
                            }
                            BirthDateEntryPanel.field_S[this.field_x >> 1].drawAlpha(-25 + offsetX + this.x, this.y + offsetY - 64, 64);
                            if (var16 == 0) {
                              return;
                            }
                          }
                          if (StatusDialog.field_Tb == null) {
                            return;
                          }
                          StatusDialog.field_Tb[this.field_H].draw(-50 + offsetX + this.x, -50 + (offsetY + this.y));
                          if (var16 == 0) {
                            return;
                          }
                        }
                        if (null == ChatLine.field_l) {
                          return;
                        }
                        ChatLine.field_l[this.field_H].draw(offsetX + this.x - 50, -50 + (this.y + offsetY));
                        if (var16 == 0) {
                          return;
                        }
                      }
                      if (null == MusicPatchNode.field_E) {
                        return;
                      }
                      MusicPatchNode.field_E[this.field_H].draw(this.x - (-offsetX + 50), -50 + offsetY + this.y);
                      if (var16 == 0) {
                        return;
                      }
                    }
                    if (null == UrlHelpers.field_c) {
                      return;
                    }
                    if (this.field_H < 0) {
                      return;
                    }
                    UrlHelpers.field_c[this.field_H].draw(-8 + (offsetX + this.x), -8 + (this.y + offsetY));
                    if (var16 == 0) {
                      return;
                    }
                  }
                  if (null == HuffmanCodec.field_j) {
                    return;
                  }
                  HuffmanCodec.field_j[this.field_H].draw(-50 + (offsetX + this.x), offsetY + this.y - 50);
                  if (var16 == 0) {
                    return;
                  }
                }
                if (null == BirthDateEntryPanel.field_N) {
                  return;
                }
                BirthDateEntryPanel.field_N[this.field_H].draw(this.x + offsetX - 50, -50 + offsetY + this.y);
                if (var16 == 0) {
                  return;
                }
              }
              if (null == CookieHelpers.field_j) {
                return;
              }
              if (this.field_H < 0) {
                return;
              }
              CookieHelpers.field_j[this.field_H].draw(offsetX + (this.x - 8), -8 + this.y + offsetY);
              if (var16 == 0) {
                return;
              }
            }
            if (this.field_x != 0) {
              var5_double = Math.sqrt((double)(this.velocityY * this.velocityY + this.velocityX * this.velocityX));
              SoftwareRasterizer.fillCircleAlpha(this.x + offsetX, this.y + offsetY, 5, 35071, 96);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.velocityX) / var5_double) + (double)(this.x + offsetX)), (int)(-((double)(6 * this.velocityY) / var5_double) + (double)(offsetY + this.y)), 4, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(8 * this.velocityX) / var5_double) + (double)(offsetX + this.x)), (int)((double)(offsetY + this.y) - (double)(this.velocityY * 8) / var5_double), 3, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.velocityX * 10) / var5_double) + (double)(this.x + offsetX)), (int)(-((double)(this.velocityY * 10) / var5_double) + (double)(this.y + offsetY)), 2, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.velocityX * 12) / var5_double) + (double)(this.x + offsetX)), (int)(-((double)(12 * this.velocityY) / var5_double) + (double)(this.y + offsetY)), 1, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.velocityX) / var5_double) + (double)(this.x + offsetX)), (int)((double)(offsetY + this.y) - (double)(this.velocityY * 6) / var5_double), 3, 8978431, 32);
              SoftwareRasterizer.fillCircleAlpha((int)((double)(this.x + offsetX) - (double)(8 * this.velocityX) / var5_double), (int)((double)(this.y + offsetY) - (double)(this.velocityY * 8) / var5_double), 2, 8978431, 32);
              SoftwareRasterizer.fillCircleAlpha(offsetX + this.x, offsetY + this.y, 4, 8978431, 64);
              SoftwareRasterizer.fillCircleAlpha(this.x - (-offsetX + 1), -1 + offsetY + this.y, 2, 16777215, 32);
              return;
            }
            if (null == ResizableModalPanel.field_db) {
              return;
            }
            if (this.field_H < 0) {
              return;
            }
            ResizableModalPanel.field_db[this.field_H].drawScaled(-8 + (offsetX + this.x), -8 + (this.y + offsetY), 16, 16);
            if (var16 == 0) {
              return;
            }
          }
          var5_double = Math.sqrt((double)(this.velocityY * this.velocityY + this.velocityX * this.velocityX));
          SoftwareRasterizer.fillCircleAlpha(offsetX + this.x, this.y + offsetY, 6, 35071, 192);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.velocityX) / var5_double) + (double)(this.x + offsetX)), (int)((double)(offsetY + this.y) - (double)(6 * this.velocityY) / var5_double), 5, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.velocityX * 8) / var5_double) + (double)(offsetX + this.x)), (int)((double)(offsetY + this.y) - (double)(this.velocityY * 8) / var5_double), 4, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.velocityX * 10) / var5_double) + (double)(this.x + offsetX)), (int)((double)(this.y + offsetY) - (double)(this.velocityY * 10) / var5_double), 3, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)((double)(this.x + offsetX) - (double)(this.velocityX * 12) / var5_double), (int)((double)(this.y + offsetY) - (double)(12 * this.velocityY) / var5_double), 2, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.velocityX) / var5_double) + (double)(offsetX + this.x)), (int)((double)(offsetY + this.y) - (double)(6 * this.velocityY) / var5_double), 4, 8978431, 64);
          SoftwareRasterizer.fillCircleAlpha((int)((double)(offsetX + this.x) - (double)(8 * this.velocityX) / var5_double), (int)((double)(offsetY + this.y) - (double)(8 * this.velocityY) / var5_double), 3, 8978431, 64);
          SoftwareRasterizer.fillCircleAlpha(this.x + offsetX, offsetY + this.y, 5, 8978431, 128);
          SoftwareRasterizer.fillCircleAlpha(-1 + this.x + offsetX, -1 + (this.y + offsetY), 3, 16777215, 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "mi.B(" + offsetY + ',' + obfuscationGuard + ',' + offsetX + ')');
        }
    }

    private final void drawOrbitEffect(int obfuscationGuard) {
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Sprite[] var2 = null;
        RuntimeException var2_ref = null;
        Sprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = new Sprite[]{ScreenSwitchHelpers.field_f[22].toRgbSprite(), ScreenSwitchHelpers.field_f[26].toRgbSprite(), ScreenSwitchHelpers.field_f[27].toRgbSprite()};
          var3 = DualLinkDeque.field_b[13].toRgbSprite();
          if (obfuscationGuard < 9) {
            this.field_x = 106;
          }
          var4 = 0;
          var5 = 64;
          if (this.owner != null &&
            this.battle.playerSpellbook[this.owner.ownerPlayer] == 6) {
            var5 = var5 + this.battle.field_X[this.owner.ownerPlayer] * 16 / 20;
          }
          var6 = 0;
          scanLoop1: while (true) {
            stackIn_11_0 = 0;
            if (stackIn_11_0 <= var6) {
              if (var11 != 0) {
                return;
              }
              var7 = 0;
              scanLoop2: while (true) {
                stackIn_15_0 = var7;
                stackIn_15_1 = var5;
                if (stackIn_15_0 < stackIn_15_1) {
                  stackIn_11_0 = 0;
                  var8 = stackIn_11_0;
                  while (var8 < 8192) {
                    var9 = GradientBarPainter.sine(116, var8) * var7 >> 16;
                    var10 = BevelBoxPainter.cosine(var8, -126) * var7 >> 16;
                    stackIn_15_0 = 0;
                    stackIn_15_1 = var6;
                    if (stackIn_15_0 != stackIn_15_1) {
                      if (1 == var6 &&
                        !this.battle.spriteOverlapsTerrain(-var10 + (this.y - 8), 2, this.x - (-var9 + 8), var3)) {
                        this.battle.carveTerrainAndSprite(-8 - var10 + this.y, -12, var9 + this.x - 8, var3);
                      }
                    } else {
                      if (!this.battle.spriteOverlapsTerrain(-8 + (-var10 + this.y), 2, var9 + (this.x - 8), var2[var4])) {
                        this.battle.carveTerrainAndSprite(-8 + (-var10 + this.y), -90, this.x + var9 - 8, var2[var4]);
                        var4++;
                        if (var2.length <= var4) {
                          var4 = var4 - var2.length;
                        }
                      }
                    }
                    var8 += 64;
                  }
                  var7 += 8;
                  continue scanLoop2;
                }
                break;
              }
              var6--;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.HA(" + obfuscationGuard + ')');
        }
    }

    SpellProjectile(int spellType, int damageSourceId, int x, int y, BattleUnit owner, Battle battle) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.initialize(-103, spellType, y, x, damageSourceId, battle, owner);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.<init>(").append(spellType).append(',').append(damageSourceId).append(',').append(x).append(',').append(y).append(',');
          if (owner == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (battle == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    SpellProjectile(Battle battle) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.battle = battle;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.<init>(");
          if (battle == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_s = "Sea spells focus on diverse attacks from above, below and summoning armies of minions.";
    }

    private static int compareDoublesNanGreater(double left, double right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
