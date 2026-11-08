/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpellProjectile extends DualLinkNode {
    int field_v;
    int field_F;
    static SceneWidget field_A;
    private PcmSampleStream field_D;
    int field_z;
    private int field_n;
    private int field_J;
    int field_I;
    static BinaryBitmapFont field_B;
    private Battle field_q;
    private int field_x;
    BattleUnit field_t;
    int field_o;
    int field_H;
    boolean field_w;
    private IsaacRandom field_C;
    int field_y;
    private Sprite field_p;
    static Sprite field_E;
    static String field_s;
    int field_u;
    int field_G;
    private int field_r;
    static SceneWidget field_m;

    final boolean canCollide(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.isAlive(-139)) {
            return false;
          }
          if (this.field_I == 74 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 84 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 81 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 75 &&
            10 < this.field_y) {
            return false;
          }
          if (73 == this.field_I &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 97 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 113 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 71) {
            return false;
          }
          if (this.field_I == 47 &&
            50 < this.field_y) {
            return false;
          }
          if (36 == this.field_I &&
            50 < this.field_y) {
            return false;
          }
          if (param0 != 6) {
            this.isAlive(-117);
          }
          if (this.field_I == 19 &&
            this.field_y > 50) {
            return false;
          }
          if (this.field_I == 153) {
            return false;
          }
          if (this.field_I == 136) {
            return false;
          }
          if (this.field_I == 141 &&
            10 < this.field_y) {
            return false;
          }
          if (this.field_I == 142) {
            return false;
          }
          if (this.field_I == 144 &&
            this.field_y > 10) {
            return false;
          }
          if (this.field_I == 125 &&
            this.field_y > 10) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.V(" + param0 + ')');
        }
    }

    private final void playSound(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param1) {
            return;
          }
          if (null != this.field_q.field_sb &&
            this.field_q.field_sb[param0] != null) {
            DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[param0], this.field_q.field_sb[param0]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "mi.J(" + param0 + ',' + param1 + ')');
        }
    }

    final int getX(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 25) {
            stackIn_4_0 = this.field_v;
            return stackIn_4_0;
          }
          stackIn_2_0 = -95;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.T(" + param0 + ')');
        }
    }

    final static void playMusic(MusicTrack param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MusicAndClipHelpers.playMusicTrack(param0, true, (byte) -119);
          if (param1 != 3) {
            SpellProjectile.isPointerInRect(-112, 22, 80, -24, 120);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isPersistentType(int param0) {
        boolean stackIn_43_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 40 / ((54 - param0) / 47);
          stackIn_43_0 = (this.field_I == 105) || (this.field_I == 87) || (this.field_I == 88) || (90 == this.field_I) || (this.field_I == 100) || (this.field_I == 95) || (this.field_I == 114) || (this.field_I == 102) || (this.field_I == 109) || (this.field_I == 112) || (this.field_I == 129) || (132 == this.field_I) || (166 == this.field_I) || (this.field_I == 167);
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.BA(" + param0 + ')');
        }
    }

    final static boolean isPointerInRect(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -8) {
            SpellProjectile.isPointerInRect(-116, -3, 107, 69, 64);
          }
          stackIn_16_0 = (EmailLoginCredentials.field_g >= param4) && ((param4 + param2) > EmailLoginCredentials.field_g) && (param1 <= MenuButtonPanel.field_I) && ((param1 + param0) > MenuButtonPanel.field_I);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "mi.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void detonate(int param0, int param1, int param2, int param3) {
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
          if (param0 != 6016) {
            return;
          }
          regionExit1: {
            var5 = null;
            var6 = this.field_I;
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
                  if (this.field_G >= this.field_q.field_H) {
                    if (96 == this.field_q.field_Y) {
                      this.field_q.field_Y = -96;
                    }
                    this.field_G = this.field_q.field_H;
                    this.applyAreaEffect(this.field_H, this.field_H, this.field_H, 8);
                    var6_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                    var7 = 0;
                    while (40 > var7) {
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 135, this.field_G, this.field_q);
                      var8 = 8191 & var6_ref_jd.nextInt((byte) -46);
                      if (0 == this.field_u) {
                        this.field_u = 1;
                      }
                      ((SpellProjectile) (var5)).field_u = this.field_u + Math.abs((127 & var6_ref_jd.nextInt((byte) -46)) * GradientBarPainter.sine(param0 - 5896, var8) >> 17) * this.field_u / Math.abs(this.field_u);
                      ((SpellProjectile) (var5)).field_F = -Math.abs(this.field_F) - Math.abs((var6_ref_jd.nextInt((byte) -46) & 127) * BevelBoxPainter.cosine(var8, param0 - 6134) >> 17);
                      this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                      var7++;
                    }
                    this.playTypeSound(1, (byte) 37, 7);
                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                    this.remove(0);
                    return;
                  }
                  this.field_o = this.field_o + this.field_u;
                  this.field_z = this.field_z + this.field_F;
                  this.field_F = this.field_F + 4;
                  this.field_G = this.field_z >> 4;
                  this.field_v = this.field_o >> 4;
                  if (null != this.field_t &&
                    this.field_y < 25) {
                    this.field_q.eraseUnitMask(this.field_t, param0 ^ 6016);
                  }
                  if (!this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, param0 ^ 6018, -this.field_r + this.field_v, this.field_p)) {
                    if (this.field_v < -640) {
                      this.remove(0);
                      return;
                    }
                    if (this.field_v > 640 + this.field_q.field_y) {
                      this.remove(0);
                      return;
                    }
                    if (this.field_t == null) {
                      return;
                    }
                    if (this.field_y >= 25) {
                      return;
                    }
                    this.field_q.stampUnitMask(param0 ^ -6129, this.field_t);
                    return;
                  }
                  var6_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                  var7 = 0;
                  while (var7 < 17) {
                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 135, this.field_G, this.field_q);
                    var8 = (var6_ref_jd.nextInt((byte) -46) & 8191) * 3 / 2;
                    if (this.field_u == 0) {
                      this.field_u = 1;
                    }
                    ((SpellProjectile) (var5)).field_u = this.field_u + Math.abs((var6_ref_jd.nextInt((byte) -46) & 127) * GradientBarPainter.sine(113, var8) >> 17) * this.field_u / Math.abs(this.field_u);
                    ((SpellProjectile) (var5)).field_F = this.field_F - (-((127 & var6_ref_jd.nextInt((byte) -46)) * BevelBoxPainter.cosine(var8, param0 ^ -6134) >> 17) + 64);
                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                    var7++;
                  }
                  this.playTypeSound(1, (byte) 37, 7);
                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                  this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
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
                                        if (25 <= this.field_y) {
                                          if (!this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, param0 - 6014, this.field_v - this.field_r, this.field_p)) {
                                            return;
                                          }
                                          if (BitHelpers.field_b) {
                                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 101, this.field_G, this.field_q);
                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                            this.applyAreaEffect(10, 64, 32, 8);
                                          }
                                          this.remove(param0 - 6016);
                                          return;
                                        }
                                        this.field_y = this.field_y + 1;
                                        if (var19 == 0) {
                                          return;
                                        }
                                      } else {
                                        if (var6 != 117) {
                                          if (var6 == 16) {
                                            var6 = 1;
                                            if (this.field_y >= 300) {
                                              var6 = 0;
                                            }
                                            var7 = 2;
                                            this.field_x = this.field_x + 1;
                                            if (this.field_x > 64) {
                                              this.field_x = this.field_x - (-(int)(4.0 * Math.random()) + 64);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_F = -1;
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            if ((63 & this.field_x) == 0) {
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_F = -16;
                                              ((SpellProjectile) (var5)).field_u = 0;
                                              ((SpellProjectile) (var5)).field_H = -4;
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            if (var6 == 0) {
                                              this.field_F = 0;
                                              this.field_u = 0;
                                              GameSelectionHelpers.field_k = 0;
                                              BitHelpers.field_b = false;
                                              NodeHashTable.field_m = 0;
                                              var8 = 0;
                                              if (this.field_q.isSolidAt(this.field_G + 1, -3 + this.field_v, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.field_q.isSolidAt(1 + this.field_G, this.field_v + 3, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.field_q.isSolidAt(1 + this.field_G - 5, this.field_v, (byte) -83)) {
                                                var8++;
                                              }
                                              if (this.field_q.isSolidAt(5 + this.field_G + 1, this.field_v, (byte) -83)) {
                                                var8++;
                                              }
                                              if (0 < var8) {
                                                GameSelectionHelpers.field_k = GameSelectionHelpers.field_k / var8;
                                                NodeHashTable.field_m = NodeHashTable.field_m / var8;
                                              }
                                              if (0 == var8) {
                                                this.field_y = 50;
                                              } else {
                                                if (this.field_y <= 300) {
                                                  this.field_y = 300;
                                                }
                                                if (BitHelpers.field_b) {
                                                  if (this.field_I == 16) {
                                                    this.playTypeSound(2, (byte) 37, 0);
                                                    this.applyAreaEffect(5, 20, 16, 8);
                                                    this.remove(param0 ^ 6016);
                                                    return;
                                                  }
                                                } else {
                                                  if (16 == this.field_I) {
                                                    BitHelpers.field_b = false;
                                                    if (!(this.field_G <= (this.field_q.field_H - 32)) ||
                                                      this.field_q.isSolidAt(this.field_G, -3 + this.field_v, (byte) -83) ||
                                                      this.field_q.isSolidAt(this.field_G, this.field_v + 3, (byte) -83) ||
                                                      this.field_q.isSolidAt(this.field_G - 5, this.field_v, (byte) -83) ||
                                                      this.field_q.isSolidAt(5 + this.field_G, this.field_v, (byte) -83)) {
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
                                              if (null != this.field_t &&
                                                this.field_y < 5) {
                                                this.field_q.eraseUnitMask(this.field_t, param0 - 6016);
                                                var8 = 1;
                                              }
                                              var9 = 0;
                                              this.field_G = this.field_z >> 4;
                                              BitHelpers.field_b = false;
                                              this.field_v = this.field_o >> 4;
                                              NodeHashTable.field_m = 0;
                                              GameSelectionHelpers.field_k = 0;
                                              var10 = 0;
                                              if (this.field_q.isSolidAt(this.field_G, -3 + this.field_v, (byte) -83)) {
                                                var10++;
                                                var9 = 1;
                                              }
                                              if (this.field_q.isSolidAt(this.field_G, this.field_v + 3, (byte) -83)) {
                                                var10++;
                                                var9 = 1;
                                              }
                                              if (this.field_q.isSolidAt(this.field_G - 5, this.field_v, (byte) -83)) {
                                                var9 = 1;
                                                var10++;
                                              }
                                              if (this.field_q.isSolidAt(5 + this.field_G, this.field_v, (byte) -83)) {
                                                var9 = 1;
                                                var10++;
                                              }
                                              if (var10 > 0) {
                                                NodeHashTable.field_m = NodeHashTable.field_m / var10;
                                                GameSelectionHelpers.field_k = GameSelectionHelpers.field_k / var10;
                                              }
                                              if (var9 != 0 &&
                                                var7 < this.field_y &&
                                                !BitHelpers.field_b) {
                                                this.playTypeSound(2, (byte) 37, 0);
                                                this.applyAreaEffect(0, 0, 8, 8);
                                                this.remove(0);
                                                return;
                                              }
                                              this.field_F = this.field_F + 4;
                                              if (16 == this.field_I) {
                                                if (this.field_u > 0) {
                                                  this.field_u = this.field_u - 1;
                                                }
                                                if (0 > this.field_u) {
                                                  this.field_u = this.field_u + 1;
                                                }
                                              }
                                              var11 = this.field_o;
                                              var12 = this.field_z;
                                              var13 = 0;
                                              scanLoop3: while (true) {
                                                this.field_z = this.field_z + (this.field_F + 4);
                                                this.field_o = this.field_o + this.field_u;
                                                BitHelpers.field_b = false;
                                                NodeHashTable.field_m = 0;
                                                GameSelectionHelpers.field_k = 0;
                                                var10 = 0;
                                                this.field_v = this.field_o >> 4;
                                                this.field_G = this.field_z >> 4;
                                                if (this.field_q.isSolidAt(this.field_G, -3 + this.field_v, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.field_q.isSolidAt(this.field_G, 3 + this.field_v, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.field_q.isSolidAt(-5 + this.field_G, this.field_v, (byte) -83)) {
                                                  var10++;
                                                }
                                                if (this.field_q.isSolidAt(5 + this.field_G, this.field_v, (byte) -83)) {
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
                                                    this.field_y < var7 &&
                                                    BitHelpers.field_b) {
                                                    var13 = 6;
                                                    decompiledFrameRemainder14 = (var19 != 0);
                                                  }
                                                  if (decompiledFrameRemainder14) {
                                                    if (BitHelpers.field_b) {
                                                      this.playTypeSound(2, (byte) 37, 0);
                                                      this.field_G = this.field_G - 4;
                                                      this.field_z = this.field_z - 64;
                                                      this.applyAreaEffect(5, 20, 48, 8);
                                                      this.remove(param0 ^ 6016);
                                                      return;
                                                    }
                                                    if (null != this.field_t) {
                                                      this.field_t = null;
                                                    }
                                                    var15 = -GameSelectionHelpers.field_k + this.field_G;
                                                    var14 = this.field_v - NodeHashTable.field_m;
                                                    var16 = ConnectionState.greatestCommonDivisor(var15 << 4, var14 << 4, false);
                                                    if (16 > var16) {
                                                      var15 = -1;
                                                      var16 = 16;
                                                      var14 = 0;
                                                    }
                                                    var17 = (var14 * (this.field_u << 8) + var15 * (this.field_F << 8)) / var16;
                                                    var18 = (-(var14 * (this.field_F << 8)) + var15 * (this.field_u << 8)) / var16;
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
                                                      if (this.field_y > 50) {
                                                        this.field_y = 300;
                                                      }
                                                      if (!(this.field_y > 5)) {
                                                        this.field_y = 6;
                                                        if (var19 != 0) {
                                                          if (this.field_y < 50) {
                                                            this.playTypeSound(2, (byte) 37, 0);
                                                            this.applyAreaEffect(0, 0, 8, 8);
                                                          }
                                                          this.field_y = 50;
                                                        }
                                                      }
                                                    } else {
                                                      if (this.field_y < 50) {
                                                        this.playTypeSound(2, (byte) 37, 0);
                                                        this.applyAreaEffect(0, 0, 8, 8);
                                                      }
                                                      this.field_y = 50;
                                                    }
                                                    this.field_z = var12;
                                                    this.field_o = var11;
                                                    this.field_F = (var15 * var17 - var18 * var14) / var16;
                                                    this.field_G = this.field_z >> 4;
                                                    var13++;
                                                    this.field_v = this.field_o >> 4;
                                                    this.field_u = (var15 * var18 + var14 * var17) / var16;
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
                                                this.field_u = this.field_u >> 1;
                                                this.field_F = this.field_F >> 1;
                                              }
                                              if (this.field_t != null &&
                                                var8 != 0) {
                                                this.field_q.stampUnitMask(-127, this.field_t);
                                              }
                                            }
                                            if (this.field_y <= 250 && (this.field_y > 5 ||
                                              this.field_y < 5)) {
                                              this.field_y = this.field_y + 1;
                                            }
                                            if (this.field_v < -640) {
                                              this.remove(0);
                                              return;
                                            }
                                            if (640 + this.field_q.field_y < this.field_v) {
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_G <= this.field_q.field_H) {
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
                                          if (165 == this.field_I &&
                                            300 <= this.field_y) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 16 &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 20 &&
                                            300 <= this.field_y) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 159 &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (160 == this.field_I &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (135 == this.field_I &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 152 &&
                                            300 <= this.field_y) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 46 &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 76 &&
                                            this.field_y >= 300) {
                                            var6 = 0;
                                          }
                                          if (this.field_I == 34 &&
                                            0 < this.field_y) {
                                            var6 = 0;
                                          }
                                          if (116 == this.field_I &&
                                            this.field_y > 250) {
                                            var6 = 0;
                                          }
                                          if (var6 != 0) {
                                            if (this.field_I == 13 ||
                                              67 == this.field_I ||
                                              12 == this.field_I) {
                                              this.updateFlightSound(0, (byte) 34);
                                            }
                                            if (this.field_I == 46 ||
                                              76 == this.field_I ||
                                              this.field_I == 41) {
                                              this.updateFlightSound(3, (byte) 34);
                                            }
                                            if (this.field_I == 26 ||
                                              25 == this.field_I ||
                                              this.field_I == 20) {
                                              this.updateFlightSound(1, (byte) 34);
                                            }
                                            boolean decompiledFrameCompleted36 = true;
                                            if (this.field_I == 31 ||
                                              this.field_I == 34 ||
                                              this.field_I == 33) {
                                              this.updateFlightSound(2, (byte) 34);
                                              if (this.field_I == 34) {
                                                var7 = Math.abs(-this.field_t.field_lb + this.field_v);
                                                if (var7 < 50) {
                                                  var7 = 50;
                                                }
                                                var8 = 225;
                                                if (this.field_q.field_x[this.field_t.field_u] == 2) {
                                                  var8 = var8 + this.field_q.field_X[this.field_t.field_u];
                                                }
                                                if (var7 < var8) {
                                                  var8 = var7;
                                                }
                                                var8 -= 50;
                                                var9 = 0;
                                                while (var8 > var9) {
                                                  var5 = this.spawnFromHere(this.field_v + (int)((double)(-var8) + (double)var8 * Math.random() * 2.0) / 25, (BattleUnit) null, (byte) 81, 112, this.field_G + (int)((double)(-var8) + Math.random() * (double)var8 * 2.0) / 25, this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  var9 += 50;
                                                  if (var19 != 0) {
                                                    decompiledFrameCompleted36 = false;
                                                    break;
                                                  }
                                                }
                                              }
                                            }
                                            if ((decompiledFrameCompleted36) &&
                                              (this.field_I == 53)) {
                                              this.updateFlightSound(4, (byte) 34);
                                            }
                                            if (this.field_I == 116 ||
                                              this.field_I == 135 ||
                                              this.field_I == 152 ||
                                              this.field_I == 122) {
                                              this.updateFlightSound(6, (byte) 34);
                                            }
                                            if (this.field_I == 146 ||
                                              this.field_I == 143) {
                                              this.updateFlightSound(7, (byte) 34);
                                            }
                                            if (147 == this.field_I) {
                                              var5 = this.spawnFromHere(this.field_v + (int)(11.0 * Math.random() - 5.0), (BattleUnit) null, (byte) 81, 102, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                              if (this.field_y == 225 &&
                                                this.field_q.field_sb != null &&
                                                null != this.field_q.field_sb[74]) {
                                                DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[220] >> 2, this.field_q.field_sb[74]);
                                              }
                                            }
                                          }
                                          if (165 == this.field_I) {
                                            this.field_x = this.field_x + 1;
                                            if (16 < this.field_x) {
                                              this.field_x = this.field_x - (-(int)(4.0 * Math.random()) + 16);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 166, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_u = (int)(21.0 * Math.random()) - 10;
                                              ((SpellProjectile) (var5)).field_F = -10 + (int)(Math.random() * 21.0);
                                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                            }
                                          }
                                          boolean decompiledFrameRemainder13 = true;
                                          if (16 == this.field_I) {
                                            this.field_x = this.field_x + 1;
                                            if (this.field_x > 16) {
                                              this.field_x = this.field_x - (16 - (int)(Math.random() * 4.0));
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_F = -1;
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                            }
                                            decompiledFrameRemainder13 = ((3 & this.field_x) == 0);
                                            if (decompiledFrameRemainder13) {
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_H = -4;
                                              ((SpellProjectile) (var5)).field_u = 0;
                                              ((SpellProjectile) (var5)).field_F = -16;
                                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                              decompiledFrameRemainder13 = (var19 != 0);
                                            }
                                          }
                                          if (decompiledFrameRemainder13) {
                                            if (67 == this.field_I) {
                                              this.field_x = this.field_x + 1;
                                              decompiledFrameRemainder13 = !(this.field_x <= 4);
                                              if (decompiledFrameRemainder13) {
                                                this.field_x = this.field_x - 4;
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                                                ((SpellProjectile) (var5)).field_F = -16;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                decompiledFrameRemainder13 = (var19 != 0);
                                              }
                                            }
                                            if (decompiledFrameRemainder13) {
                                              if (this.field_I == 31) {
                                                if (0 >= this.field_x) {
                                                  this.field_x = this.field_x - 1;
                                                  if (-4 > this.field_x) {
                                                    this.field_x = this.field_x + 4;
                                                  }
                                                }
                                                decompiledFrameRemainder13 = ((3 & this.field_x) == 0);
                                                if (decompiledFrameRemainder13) {
                                                  var5 = this.spawnFromHere(this.field_v + (int)(-2.0 + Math.random() * 4.0), (BattleUnit) null, (byte) 81, 112, this.field_G + (int)(Math.random() * 4.0 - 2.0), this.field_q);
                                                  ((SpellProjectile) (var5)).field_u = 4 * this.field_u + (int)(-8.0 + 16.0 * Math.random());
                                                  ((SpellProjectile) (var5)).field_F = 4 * this.field_F + (int)(Math.random() * 16.0 - 8.0);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  decompiledFrameRemainder13 = (var19 != 0);
                                                }
                                              }
                                              if (decompiledFrameRemainder13) {
                                                if (122 == this.field_I) {
                                                  this.field_x = this.field_x + 1;
                                                  decompiledFrameRemainder13 = !(this.field_x <= 4);
                                                  if (decompiledFrameRemainder13) {
                                                    this.field_x = this.field_x - 4;
                                                    var5 = this.spawnFromHere(this.field_v + (int)(4.0 * Math.random() - 2.0), (BattleUnit) null, (byte) 81, 129, this.field_G + (int)(-2.0 + 4.0 * Math.random()), this.field_q);
                                                    ((SpellProjectile) (var5)).field_F = -16;
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    decompiledFrameRemainder13 = (var19 != 0);
                                                  }
                                                }
                                                if (decompiledFrameRemainder13) {
                                                  if (this.field_I == 116) {
                                                    this.field_x = this.field_x + 1;
                                                    if (this.field_x > 4) {
                                                      this.field_x = this.field_x - 4;
                                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 129, this.field_G, this.field_q);
                                                      ((SpellProjectile) (var5)).field_F = -16;
                                                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    }
                                                  } else {
                                                    if (this.field_I != 146 &&
                                                      this.field_I == 143) {
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
                                                if (null != this.field_t &&
                                                  25 > this.field_y) {
                                                  var7 = 1;
                                                  this.field_q.eraseUnitMask(this.field_t, 0);
                                                }
                                                var8 = 0;
                                                this.field_G = this.field_z >> 4;
                                                this.field_v = this.field_o >> 4;
                                                if (this.field_I != 31 &&
                                                  this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, param0 - 6014, -this.field_r + this.field_v, this.field_p)) {
                                                  this.field_F = 0;
                                                  this.field_u = 0;
                                                  var8 = 1;
                                                }
                                                this.field_F = this.field_F + 4;
                                                if (this.field_I == 25 &&
                                                  this.field_F > 0 &&
                                                  this.field_y > 50) {
                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.playTypeSound(1, (byte) 37, 1);
                                                  this.applyAreaEffect(25, 64, 12, param0 - 6008);
                                                  this.field_I = 26;
                                                  this.field_F = this.field_F / 2;
                                                  this.field_p = QuickChatPhrase.field_x[0];
                                                  this.field_u = this.field_u / 2;
                                                  this.field_y = 50;
                                                  this.field_r = this.field_p.field_n / 2;
                                                }
                                                if ((this.field_I == 152 ||
                                                  this.field_I == 135) &&
                                                  this.field_F < 0) {
                                                  this.field_F = this.field_F + 4;
                                                }
                                                if (this.field_I != 135 ||
                                                  this.field_F <= 0) {
                                                  if (16 == this.field_I) {
                                                    if (this.field_u > 0) {
                                                      this.field_u = this.field_u - 1;
                                                    }
                                                    if (this.field_u < 0) {
                                                      this.field_u = this.field_u + 1;
                                                      if (var19 != 0) {
                                                        if (this.field_u > 0) {
                                                          this.field_u = this.field_u - 1;
                                                        }
                                                        if (this.field_u < 0) {
                                                          this.field_u = this.field_u + 1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (this.field_u > 0) {
                                                    this.field_u = this.field_u - 1;
                                                  }
                                                  if (this.field_u < 0) {
                                                    this.field_u = this.field_u + 1;
                                                  }
                                                }
                                                if (this.field_I == 46) {
                                                  if (this.field_G > this.field_q.field_H - 32) {
                                                    this.checkHeightEffects(77);
                                                    this.remove(0);
                                                    return;
                                                  }
                                                  if (0 < this.field_u) {
                                                    this.field_u = this.field_u - 1;
                                                  }
                                                  if (this.field_u < 0) {
                                                    this.field_u = this.field_u + 1;
                                                  }
                                                  this.field_u = this.field_u * 15 >> 4;
                                                  this.field_F = this.field_F * 15 >> 4;
                                                }
                                                var9 = this.field_o;
                                                var10 = this.field_z;
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
                                                      this.field_z = this.field_z + (4 + this.field_F);
                                                      this.field_o = this.field_o + this.field_u;
                                                      this.field_G = this.field_z >> 4;
                                                      this.field_v = this.field_o >> 4;
                                                      if (!this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, param0 ^ 6018, this.field_v - this.field_r, this.field_p)) {
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
                                                      if (this.field_I == 46) {
                                                        do {
                                                          var12_ref_ll = ScreenSwitchHelpers.field_f[17];
                                                          if ((this.field_q.field_H / 4) > this.field_G) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[18];
                                                          }
                                                          if (this.field_G < this.field_q.field_H / 5) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[19];
                                                          }
                                                          this.field_p = var12_ref_ll.toRgbSprite();
                                                          if (BitHelpers.field_b &&
                                                            16 == this.field_I) {
                                                            decompiledFrameCompleted35 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.field_I == 20) {
                                                            decompiledFrameCompleted34 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            159 == this.field_I) {
                                                            decompiledFrameCompleted33 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            160 == this.field_I) {
                                                            decompiledFrameCompleted32 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b) {
                                                            if (135 == this.field_I) {
                                                              decompiledFrameCompleted31 = false;
                                                              break;
                                                            }
                                                            if (152 == this.field_I) {
                                                              decompiledFrameCompleted30 = false;
                                                              break;
                                                            }
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            76 == this.field_I) {
                                                            decompiledFrameCompleted29 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.field_I == 46) {
                                                            decompiledFrameCompleted28 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            31 == this.field_I) {
                                                            decompiledFrameCompleted27 = false;
                                                            break;
                                                          }
                                                          boolean decompiledFrameRemainder12 = true;
                                                          if (this.field_I == 20) {
                                                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.applyAreaEffect(5, 32, 3, param0 ^ 6024);
                                                            decompiledFrameRemainder12 = (var19 != 0);
                                                          }
                                                          if (decompiledFrameRemainder12) {
                                                            if (this.field_I == 135 &&
                                                              this.field_y < 25) {
                                                              this.applyAreaEffect(0, 32, 3, param0 ^ 6024);
                                                              decompiledFrameRemainder12 = (var19 != 0);
                                                              if (decompiledFrameRemainder12) {
                                                                decompiledFrameCompleted26 = false;
                                                                break;
                                                              }
                                                            }
                                                            if ((decompiledFrameRemainder12) &&
                                                              (this.field_I == 152)) {
                                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              if (0 > this.field_F) {
                                                                decompiledFrameCompleted25 = false;
                                                                break;
                                                              }
                                                            }
                                                          }
                                                          var12 = -NodeHashTable.field_m + this.field_v;
                                                          var13 = this.field_G - GameSelectionHelpers.field_k;
                                                          var14 = ConnectionState.greatestCommonDivisor(var13 << 4, var12 << 4, false);
                                                          if (var14 < 1) {
                                                            var14 = 16;
                                                            var13 = -1;
                                                            var12 = 0;
                                                          }
                                                          var15 = ((this.field_F << 8) * var13 + (this.field_u << 8) * var12) / var14;
                                                          var16 = ((this.field_u << 8) * var13 - var12 * (this.field_F << 8)) / var14;
                                                          if (var15 < 0) {
                                                            var16 = -var16;
                                                            var13 = -var13;
                                                            var12 = -var12;
                                                            var15 = -var15;
                                                          }
                                                          boolean decompiledFrameRemainder11 = true;
                                                          var15 = -(var15 >> 1);
                                                          if (20 != this.field_I &&
                                                            this.field_I != 159 &&
                                                            this.field_I != 160 &&
                                                            165 != this.field_I) {
                                                            if (this.field_I == 135 ||
                                                              this.field_I == 152) {
                                                              if ((Math.abs(var16) < 128) &&
                                                                (decompiledFrameRemainder11 = !(this.field_y <= 200))) {
                                                                this.field_y = 300;
                                                                decompiledFrameRemainder11 = (var19 != 0);
                                                              }
                                                              if (decompiledFrameRemainder11) {
                                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 132, this.field_G, this.field_q);
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                this.field_y = this.field_y + 5;
                                                                decompiledFrameRemainder11 = (var19 != 0);
                                                              }
                                                            }
                                                            if (decompiledFrameRemainder11) {
                                                              if (this.field_I == 46) {
                                                                var15 = var15 >> 1;
                                                                var16 = var16 >> 1;
                                                                if ((256 > Math.abs(var16)) &&
                                                                  (decompiledFrameRemainder11 = !(this.field_y <= 50))) {
                                                                  this.field_y = 300;
                                                                  decompiledFrameRemainder11 = (var19 != 0);
                                                                }
                                                                if (decompiledFrameRemainder11) {
                                                                  this.field_y = 50;
                                                                  decompiledFrameRemainder11 = (var19 != 0);
                                                                }
                                                              }
                                                              if (decompiledFrameRemainder11) {
                                                                if (16 != this.field_I &&
                                                                  76 != this.field_I) {
                                                                  if (this.field_I == 26) {
                                                                    decompiledFrameCompleted24 = false;
                                                                    break;
                                                                  }
                                                                  if ((this.field_I != 31) &&
                                                                    (decompiledFrameRemainder11 = (this.field_I == 34))) {
                                                                    var12 = 0;
                                                                    var13 = 0;
                                                                    this.field_y = 1;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder11) {
                                                                    this.field_x = 0;
                                                                    this.playTypeSound(1, (byte) 37, 2);
                                                                    this.field_y = this.field_y + 50;
                                                                    var17 = this.field_v;
                                                                    this.field_v = NodeHashTable.field_m;
                                                                    var18 = this.field_G;
                                                                    this.field_G = GameSelectionHelpers.field_k;
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 99, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(10, 64, 64, 8);
                                                                    this.field_G = var18;
                                                                    this.field_v = var17;
                                                                    if (this.field_y > 1000) {
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
                                                                    (decompiledFrameRemainder11 = !(50 >= this.field_y))) {
                                                                    this.field_y = 300;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder11) {
                                                                    if (this.field_y < 50 &&
                                                                      16 == this.field_I) {
                                                                      this.playTypeSound(2, (byte) 37, 0);
                                                                      this.applyAreaEffect(0, 0, 8, 8);
                                                                    }
                                                                    this.field_y = 50;
                                                                    decompiledFrameRemainder11 = (var19 != 0);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (decompiledFrameRemainder11) {
                                                            if (this.field_I != 165) {
                                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                                            }
                                                            if (Math.abs(var16) >= 128) {
                                                              this.field_y = this.field_y + 5;
                                                              if ((!(this.field_y < 300)) &&
                                                                (this.field_I == 165) &&
                                                                (this.field_I == 165)) {
                                                                this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -112, this.field_v - this.field_r, this.field_p);
                                                                if ((var19 != 0) &&
                                                                  (this.field_y > 200)) {
                                                                  this.field_y = 300;
                                                                  if (165 == this.field_I) {
                                                                    this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, param0 ^ -6132, -this.field_r + this.field_v, this.field_p);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.field_y > 200) {
                                                                this.field_y = 300;
                                                                if (165 == this.field_I) {
                                                                  this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, param0 ^ -6132, -this.field_r + this.field_v, this.field_p);
                                                                }
                                                              }
                                                            }
                                                          }
                                                          boolean decompiledFrameRemainder10 = true;
                                                          if (var15 < -128) {
                                                            if (this.field_I == 143 ||
                                                              this.field_I == 135 ||
                                                              this.field_I == 152) {
                                                              if ((this.field_I != 143) &&
                                                                (decompiledFrameRemainder10 = (null != this.field_q.field_sb)) &&
                                                                (decompiledFrameRemainder10 = (this.field_q.field_sb[CacheEntry.field_n[7][1]] != null))) {
                                                                IconHighlightPainter.playSample(200 + (int)(Math.random() * 500.0), false, this.field_q.field_sb[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 4);
                                                                decompiledFrameRemainder10 = (var19 != 0);
                                                              }
                                                              if ((decompiledFrameRemainder10) &&
                                                                (null != this.field_q.field_sb) &&
                                                                (this.field_q.field_sb[CacheEntry.field_n[7][0]] != null)) {
                                                                IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.field_q.field_sb[CacheEntry.field_n[7][0]], SceneWidgetNode.field_r[CacheEntry.field_n[7][0]] / 8);
                                                                if (var19 != 0) {
                                                                  this.playTypeSound(1, (byte) 37, 3);
                                                                }
                                                              }
                                                            } else {
                                                              this.playTypeSound(1, (byte) 37, 3);
                                                            }
                                                          }
                                                          this.field_u = (var15 * var12 + var16 * var13) / var14;
                                                          this.field_F = (var15 * var13 - var16 * var12) / var14;
                                                          if ((135 == this.field_I ||
                                                            152 == this.field_I) && Math.abs(var16) < 128) {
                                                            this.field_F = this.field_F - 32;
                                                          }
                                                          this.field_z = var10;
                                                          this.field_o = var9;
                                                          this.field_G = this.field_z >> 4;
                                                          this.field_v = this.field_o >> 4;
                                                          var11++;
                                                          if (143 == this.field_I &&
                                                            100 < this.field_y) {
                                                            this.field_F = -64;
                                                            this.field_u = 0;
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
                                                            16 == this.field_I) {
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.field_I == 20) {
                                                            decompiledFrameCompleted21 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            159 == this.field_I) {
                                                            decompiledFrameCompleted20 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            160 == this.field_I) {
                                                            decompiledFrameCompleted19 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b) {
                                                            if (135 == this.field_I) {
                                                              decompiledFrameCompleted18 = false;
                                                              break;
                                                            }
                                                            if (152 == this.field_I) {
                                                              decompiledFrameCompleted17 = false;
                                                              break;
                                                            }
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            76 == this.field_I) {
                                                            decompiledFrameCompleted16 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            this.field_I == 46) {
                                                            decompiledFrameCompleted15 = false;
                                                            break;
                                                          }
                                                          if (BitHelpers.field_b &&
                                                            31 == this.field_I) {
                                                            decompiledFrameCompleted14 = false;
                                                            break;
                                                          }
                                                          boolean decompiledFrameRemainder9 = true;
                                                          if (this.field_I == 20) {
                                                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.applyAreaEffect(5, 32, 3, param0 ^ 6024);
                                                            decompiledFrameRemainder9 = (var19 != 0);
                                                          }
                                                          if (decompiledFrameRemainder9) {
                                                            if (this.field_I == 135 &&
                                                              this.field_y < 25) {
                                                              this.applyAreaEffect(0, 32, 3, param0 ^ 6024);
                                                              decompiledFrameRemainder9 = (var19 != 0);
                                                              if (decompiledFrameRemainder9) {
                                                                decompiledFrameCompleted13 = false;
                                                                break;
                                                              }
                                                            }
                                                            if ((decompiledFrameRemainder9) &&
                                                              (this.field_I == 152)) {
                                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              if (0 > this.field_F) {
                                                                decompiledFrameCompleted12 = false;
                                                                break;
                                                              }
                                                            }
                                                          }
                                                          var12 = -NodeHashTable.field_m + this.field_v;
                                                          var13 = this.field_G - GameSelectionHelpers.field_k;
                                                          var14 = ConnectionState.greatestCommonDivisor(var13 << 4, var12 << 4, false);
                                                          if (var14 < 1) {
                                                            var14 = 16;
                                                            var13 = -1;
                                                            var12 = 0;
                                                          }
                                                          var15 = ((this.field_F << 8) * var13 + (this.field_u << 8) * var12) / var14;
                                                          var16 = ((this.field_u << 8) * var13 - var12 * (this.field_F << 8)) / var14;
                                                          if (var15 < 0) {
                                                            var16 = -var16;
                                                            var13 = -var13;
                                                            var12 = -var12;
                                                            var15 = -var15;
                                                          }
                                                          boolean decompiledFrameRemainder8 = true;
                                                          var15 = -(var15 >> 1);
                                                          if (20 != this.field_I &&
                                                            this.field_I != 159 &&
                                                            this.field_I != 160 &&
                                                            165 != this.field_I) {
                                                            if (this.field_I == 135 ||
                                                              this.field_I == 152) {
                                                              if ((Math.abs(var16) < 128) &&
                                                                (decompiledFrameRemainder8 = !(this.field_y <= 200))) {
                                                                this.field_y = 300;
                                                                decompiledFrameRemainder8 = (var19 != 0);
                                                              }
                                                              if (decompiledFrameRemainder8) {
                                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 132, this.field_G, this.field_q);
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                this.field_y = this.field_y + 5;
                                                                decompiledFrameRemainder8 = (var19 != 0);
                                                              }
                                                            }
                                                            if (decompiledFrameRemainder8) {
                                                              if (this.field_I == 46) {
                                                                var15 = var15 >> 1;
                                                                var16 = var16 >> 1;
                                                                if ((256 > Math.abs(var16)) &&
                                                                  (decompiledFrameRemainder8 = !(this.field_y <= 50))) {
                                                                  this.field_y = 300;
                                                                  decompiledFrameRemainder8 = (var19 != 0);
                                                                }
                                                                if (decompiledFrameRemainder8) {
                                                                  this.field_y = 50;
                                                                  decompiledFrameRemainder8 = (var19 != 0);
                                                                }
                                                              }
                                                              if (decompiledFrameRemainder8) {
                                                                if (16 != this.field_I &&
                                                                  76 != this.field_I) {
                                                                  if (this.field_I == 26) {
                                                                    decompiledFrameCompleted11 = false;
                                                                    break;
                                                                  }
                                                                  if ((this.field_I != 31) &&
                                                                    (decompiledFrameRemainder8 = (this.field_I == 34))) {
                                                                    var12 = 0;
                                                                    var13 = 0;
                                                                    this.field_y = 1;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder8) {
                                                                    this.field_x = 0;
                                                                    this.playTypeSound(1, (byte) 37, 2);
                                                                    this.field_y = this.field_y + 50;
                                                                    var17 = this.field_v;
                                                                    this.field_v = NodeHashTable.field_m;
                                                                    var18 = this.field_G;
                                                                    this.field_G = GameSelectionHelpers.field_k;
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 99, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(10, 64, 64, 8);
                                                                    this.field_G = var18;
                                                                    this.field_v = var17;
                                                                    if (this.field_y > 1000) {
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
                                                                    (decompiledFrameRemainder8 = !(50 >= this.field_y))) {
                                                                    this.field_y = 300;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                  if (decompiledFrameRemainder8) {
                                                                    if (this.field_y < 50 &&
                                                                      16 == this.field_I) {
                                                                      this.playTypeSound(2, (byte) 37, 0);
                                                                      this.applyAreaEffect(0, 0, 8, 8);
                                                                    }
                                                                    this.field_y = 50;
                                                                    decompiledFrameRemainder8 = (var19 != 0);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          if (decompiledFrameRemainder8) {
                                                            if (this.field_I != 165) {
                                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                                            }
                                                            if (Math.abs(var16) >= 128) {
                                                              this.field_y = this.field_y + 5;
                                                              if ((!(this.field_y < 300)) &&
                                                                (this.field_I == 165) &&
                                                                (this.field_I == 165)) {
                                                                this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -112, this.field_v - this.field_r, this.field_p);
                                                                if ((var19 != 0) &&
                                                                  (this.field_y > 200)) {
                                                                  this.field_y = 300;
                                                                  if (165 == this.field_I) {
                                                                    this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, param0 ^ -6132, -this.field_r + this.field_v, this.field_p);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.field_y > 200) {
                                                                this.field_y = 300;
                                                                if (165 == this.field_I) {
                                                                  this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, param0 ^ -6132, -this.field_r + this.field_v, this.field_p);
                                                                }
                                                              }
                                                            }
                                                          }
                                                          boolean decompiledFrameRemainder7 = true;
                                                          if (var15 < -128) {
                                                            if (this.field_I == 143 ||
                                                              this.field_I == 135 ||
                                                              this.field_I == 152) {
                                                              if ((this.field_I != 143) &&
                                                                (decompiledFrameRemainder7 = (null != this.field_q.field_sb)) &&
                                                                (decompiledFrameRemainder7 = (this.field_q.field_sb[CacheEntry.field_n[7][1]] != null))) {
                                                                IconHighlightPainter.playSample(200 + (int)(Math.random() * 500.0), false, this.field_q.field_sb[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 4);
                                                                decompiledFrameRemainder7 = (var19 != 0);
                                                              }
                                                              if ((decompiledFrameRemainder7) &&
                                                                (null != this.field_q.field_sb) &&
                                                                (this.field_q.field_sb[CacheEntry.field_n[7][0]] != null)) {
                                                                IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.field_q.field_sb[CacheEntry.field_n[7][0]], SceneWidgetNode.field_r[CacheEntry.field_n[7][0]] / 8);
                                                                if (var19 != 0) {
                                                                  this.playTypeSound(1, (byte) 37, 3);
                                                                }
                                                              }
                                                            } else {
                                                              this.playTypeSound(1, (byte) 37, 3);
                                                            }
                                                          }
                                                          this.field_u = (var15 * var12 + var16 * var13) / var14;
                                                          this.field_F = (var15 * var13 - var16 * var12) / var14;
                                                          if ((135 == this.field_I ||
                                                            152 == this.field_I) && Math.abs(var16) < 128) {
                                                            this.field_F = this.field_F - 32;
                                                          }
                                                          this.field_z = var10;
                                                          this.field_o = var9;
                                                          this.field_G = this.field_z >> 4;
                                                          this.field_v = this.field_o >> 4;
                                                          var11++;
                                                          if (143 == this.field_I &&
                                                            100 < this.field_y) {
                                                            this.field_F = -64;
                                                            this.field_u = 0;
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
                                                          if ((this.field_q.field_H / 4) > this.field_G) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[18];
                                                          }
                                                          if (this.field_G < this.field_q.field_H / 5) {
                                                            var12_ref_ll = ScreenSwitchHelpers.field_f[19];
                                                          }
                                                          this.field_p = var12_ref_ll.toRgbSprite();
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
                                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                                                        this.applyAreaEffect(10, 32, 32, param0 - 6008);
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
                                                        this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, -120, this.field_v - this.field_r, this.field_p);
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
                                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 132, this.field_G, this.field_q);
                                                        this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(3, 20, 32, param0 ^ 6024);
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
                                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 95, this.field_G, this.field_q);
                                                        this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
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
                                                        this.field_y = this.field_y + 50;
                                                        var12 = this.field_v;
                                                        this.field_v = NodeHashTable.field_m;
                                                        var13 = this.field_G;
                                                        this.field_G = GameSelectionHelpers.field_k;
                                                        this.playTypeSound(1, (byte) 37, 2);
                                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 99, this.field_G, this.field_q);
                                                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        this.applyAreaEffect(10, 64, 64, 8);
                                                        this.field_G = var13;
                                                        this.field_v = var12;
                                                        if (1000 < this.field_y) {
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
                                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 95, this.field_G, this.field_q);
                                                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                                                      this.field_y = this.field_y + 50;
                                                      var17 = this.field_v;
                                                      var18 = this.field_G;
                                                      this.field_v = NodeHashTable.field_m;
                                                      this.field_G = GameSelectionHelpers.field_k;
                                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                                                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                      this.playTypeSound(1, (byte) 37, 1);
                                                      if (!BitHelpers.field_b) {
                                                        this.applyAreaEffect(50, 64, 96, 8);
                                                        if (var19 != 0) {
                                                          var10 -= 256;
                                                          this.applyAreaEffect(25, 64, 96, 8);
                                                          if (0 == (this.field_v & 1)) {
                                                            this.field_u = this.field_u - 64;
                                                            this.field_u = this.field_u + 64;
                                                          } else {
                                                            this.field_u = this.field_u + 64;
                                                          }
                                                          this.field_F = this.field_F - 64;
                                                        }
                                                      } else {
                                                        var10 -= 256;
                                                        this.applyAreaEffect(25, 64, 96, 8);
                                                        if (0 == (this.field_v & 1)) {
                                                          this.field_u = this.field_u - 64;
                                                          if (var19 != 0) {
                                                            this.field_u = this.field_u + 64;
                                                          }
                                                        } else {
                                                          this.field_u = this.field_u + 64;
                                                        }
                                                        this.field_F = this.field_F - 64;
                                                      }
                                                      this.field_v = var17;
                                                      this.field_G = var18;
                                                      if (this.field_y > 200) {
                                                        this.remove(0);
                                                        return;
                                                      }
                                                      var12 = -(this.field_u >> 1);
                                                      var14 = 1;
                                                      var13 = -(this.field_F >> 1);
                                                      var15 = 1;
                                                      var16 = 0;
                                                      this.field_z = var10;
                                                      this.field_o = var9;
                                                      if (!BitHelpers.field_b) {
                                                        this.field_F = (var13 * var15 - var12 * var16) / var14;
                                                        this.field_u = (var16 * var13 + var15 * var12) / var14;
                                                      }
                                                      this.field_v = this.field_o >> 4;
                                                      this.field_G = this.field_z >> 4;
                                                      this.notifyOwner((byte) 104);
                                                      return;
                                                    }
                                                  }
                                                  if ((decompiledFrameCompleted25) &&
                                                    (decompiledFrameCompleted12)) {
                                                    if (null != this.field_t &&
                                                      var7 != 0) {
                                                      this.field_q.stampUnitMask(-46, this.field_t);
                                                    }
                                                    if (5 == var11) {
                                                      this.field_F = this.field_F >> 1;
                                                      this.field_u = this.field_u >> 1;
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
                                            if (this.field_I != 116) {
                                              boolean decompiledFrameRemainder15 = true;
                                              this.field_u = 0;
                                              this.field_F = 0;
                                              if (this.field_I != 34 ||
                                                null == this.field_t) {
                                                if (this.field_I == 46) {
                                                  this.checkHeightEffects(87);
                                                  this.remove(param0 ^ 6016);
                                                  return;
                                                }
                                                if (this.field_I == 76) {
                                                  if (7 <= this.field_G) {
                                                    this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, param0 ^ -6020, -this.field_r + this.field_v, this.field_p);
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (20 == this.field_I) {
                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (159 == this.field_I) {
                                                  this.applyAreaEffect(10, 32, 32, 8);
                                                  this.remove(param0 ^ 6016);
                                                  return;
                                                }
                                                if (160 == this.field_I) {
                                                  this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -82, this.field_v - this.field_r, this.field_p);
                                                  this.remove(param0 ^ 6016);
                                                  return;
                                                }
                                                if (this.field_I != 135 &&
                                                  152 != this.field_I) {
                                                  if (!this.field_q.spriteOverlapsTerrain(1 + this.field_G - this.field_r, 2, -this.field_r + this.field_v, this.field_p)) {
                                                    this.field_y = 0;
                                                    if (var19 == 0) {
                                                      break regionExit4;
                                                    }
                                                    decompiledFrameRemainder15 = false;
                                                  }
                                                  else {
                                                    if (BitHelpers.field_b) {
                                                      if (this.field_I != 16) {
                                                        break regionExit4;
                                                      }
                                                      this.playTypeSound(2, (byte) 37, 0);
                                                      this.applyAreaEffect(5, 20, 32, 8);
                                                      this.remove(0);
                                                      return;
                                                    }
                                                    if (16 != this.field_I) {
                                                      break regionExit4;
                                                    }
                                                    if ((-32 + this.field_q.field_H) >= this.field_G &&
                                                      !this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r + 1, 2, -this.field_r + this.field_v, ScreenSwitchHelpers.field_f[0].toRgbSprite())) {
                                                      break regionExit4;
                                                    }
                                                    this.remove(0);
                                                    return;
                                                  }
                                                }
                                                if (decompiledFrameRemainder15) {
                                                  this.playTypeSound(1, (byte) 37, 7);
                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.applyAreaEffect(3, 16, 16, param0 ^ 6024);
                                                  this.remove(0);
                                                  return;
                                                }
                                              }
                                              var7 = this.field_v;
                                              var8 = Math.abs(this.field_v - this.field_t.field_lb);
                                              if (var8 < 50) {
                                                var8 = 50;
                                              }
                                              var9 = 225;
                                              if (this.field_q.field_x[this.field_t.field_u] == 2) {
                                                var9 = var9 + this.field_q.field_X[this.field_t.field_u];
                                              }
                                              if (var9 > var8) {
                                                var9 = var8;
                                              }
                                              if (this.field_y == 50) {
                                                var7 -= 128;
                                              }
                                              if (100 == this.field_y) {
                                                var7 += 128;
                                              }
                                              if (175 == this.field_y) {
                                                var7 -= 64;
                                              }
                                              if (this.field_y == 200) {
                                                var7 += 64;
                                              }
                                              if (this.field_y == 225) {
                                                var7++;
                                              }
                                              if (250 == this.field_y) {
                                                var7 -= 32;
                                              }
                                              if (275 == this.field_y) {
                                                var7 += 32;
                                              }
                                              if (300 == this.field_y) {
                                                var7++;
                                              }
                                              if (310 == this.field_y) {
                                                var7 -= 16;
                                              }
                                              if (325 == this.field_y) {
                                                var7 += 16;
                                              }
                                              if (~this.field_v != ~var7 &&
                                                this.field_y <= var8) {
                                                this.playSound(100, true);
                                                var5 = this.spawnFromHere(var7, (BattleUnit) null, (byte) 81, 84, -480, this.field_q);
                                                ((SpellProjectile) (var5)).field_u = (-var7 + this.field_v) / 3;
                                                ((SpellProjectile) (var5)).field_y = 45;
                                                ((SpellProjectile) (var5)).field_F = (480 + this.field_G) / 3;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (var9 < this.field_y) {
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                          }
                                          boolean decompiledFrameRemainder17 = true;
                                          if ((250 >= this.field_y ||
                                            this.field_I == 34) &&
                                            (decompiledFrameRemainder17 = (this.field_I != 26)) &&
                                            (decompiledFrameRemainder17 = (this.field_I != 31)) &&
                                            (decompiledFrameRemainder17 = (this.field_I != 34 ||
                                            !(this.field_y <= 0)))) {
                                            this.field_y = this.field_y + 1;
                                            decompiledFrameRemainder17 = (var19 != 0);
                                          }
                                          if (decompiledFrameRemainder17) {
                                            if (this.field_I == 116) {
                                              if (this.field_y == 251) {
                                                this.playTypeSound(1, (byte) 37, 6);
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 128, this.field_G, this.field_q);
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                this.applyAreaEffect(40, 128, 32, param0 ^ 6024);
                                              }
                                              this.field_y = this.field_y + 1;
                                              var7 = 1;
                                              if (null != this.field_t) {
                                                this.field_q.eraseUnitMask(this.field_t, param0 ^ 6016);
                                                if (this.field_q.field_x[this.field_t.field_u] == 6) {
                                                  var7 = var7 + this.field_q.field_X[this.field_t.field_u] / 20;
                                                }
                                              }
                                              boolean decompiledFrameCompleted7 = true;
                                              if ((-250 + this.field_y) % 5 == 0) {
                                                var8 = (this.field_y - 250 - 5) / 5;
                                                var9 = var8 * 8192 / 15;
                                                var10 = 0;
                                                while (var7 > var10) {
                                                  var11 = GradientBarPainter.sine(-43, var9) * (3 + var10) >> 12;
                                                  var12 = (3 + var10) * BevelBoxPainter.cosine(var9, param0 - 6137) >> 12;
                                                  BitHelpers.field_b = false;
                                                  stackOut_2218_0 = this.field_q.isSolidAt(this.field_G + var12, this.field_v + var11, (byte) -83);
                                                  stackIn_2234_0 = stackOut_2218_0 ? 1 : 0;
                                                  stackIn_2219_0 = stackOut_2218_0;
                                                  if (var19 != 0) {
                                                    decompiledFrameCompleted7 = false;
                                                    break;
                                                  }
                                                  if (stackIn_2219_0 &&
                                                    !BitHelpers.field_b) {
                                                    this.playTypeSound(1, (byte) 37, 6);
                                                    var5 = this.spawnFromHere(var11 + this.field_v, this.field_t, (byte) 81, 117, var12 + this.field_G, this.field_q);
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    var5 = this.spawnFromHere(this.field_v + var11, (BattleUnit) null, (byte) 81, 128, this.field_G + var12, this.field_q);
                                                    this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                                                  }
                                                  var10++;
                                                }
                                              }
                                              if (decompiledFrameCompleted7) {
                                                if (this.field_t != null) {
                                                  this.field_q.stampUnitMask(-68, this.field_t);
                                                }
                                                this.field_F = 0;
                                                this.field_u = 0;
                                                stackIn_2234_0 = -326;
                                              }
                                              if (stackIn_2234_0 > ~this.field_y) {
                                                this.remove(0);
                                              }
                                              return;
                                            }
                                            if (this.field_I == 33) {
                                              var7 = 0;
                                              while (var7 < 10) {
                                                var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 112, this.field_G, this.field_q);
                                                ((SpellProjectile) (var5)).field_u = (int)(96.0 * Math.sin(3.14 * (double)var7 / 5.0)) << 4;
                                                ((SpellProjectile) (var5)).field_F = (int)(-32.0 + 96.0 * Math.cos((double)var7 * 3.14 / 5.0)) << 4;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var7++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.playTypeSound(1, (byte) 37, 2);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 99, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(80, 256, 64, 8);
                                              this.remove(param0 ^ 6016);
                                              return;
                                            }
                                            if (this.field_I == 122) {
                                              this.playTypeSound(1, (byte) 37, 1);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 154, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(30, 128, 64, 8);
                                              this.field_y = this.field_y + 1;
                                              this.drawOrbitEffect(88);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_I == 53) {
                                              this.playTypeSound(1, (byte) 37, 4);
                                              this.playSound(132, true);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 104, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 55, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_H = 1;
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(40, 64, 48, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (12 == this.field_I) {
                                              this.playTypeSound(1, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 86, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(50, 128, 80, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_I == 143) {
                                              if (null != this.field_q.field_sb &&
                                                null != this.field_q.field_sb[CacheEntry.field_n[7][2]]) {
                                                IconHighlightPainter.playSample((int)(Math.random() * 50.0) + 100, false, this.field_q.field_sb[CacheEntry.field_n[7][2]], SceneWidgetNode.field_r[CacheEntry.field_n[7][2]] / 2);
                                              }
                                              var5 = this.spawnFromHere(-32 + this.field_v, (BattleUnit) null, (byte) 81, 131, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(32 + this.field_v, (BattleUnit) null, (byte) 81, 131, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 131, -32 + this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 131, this.field_G + 32, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(50, 128, 128, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_I == 147) {
                                              this.playTypeSound(0, (byte) 37, 9);
                                              this.applyAreaEffect(10, 256, 128, 8);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 101, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 74, this.field_G, this.field_q);
                                              ((SpellProjectile) (var5)).field_u = 0;
                                              ((SpellProjectile) (var5)).field_F = -256;
                                              ((SpellProjectile) (var5)).field_y = 5;
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_I == 13) {
                                              this.playTypeSound(0, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 86, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                                              var8 = 0;
                                              while (var8 < 5) {
                                                var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 14, this.field_G, this.field_q);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, -2147483648, 8192);
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(127, var9) >> 9;
                                                ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var9, -115) * 3 >> 11) - 64;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.applyAreaEffect(25, 128, 64, param0 ^ 6024);
                                              this.remove(0);
                                              return;
                                            }
                                            if (41 == this.field_I) {
                                              this.playTypeSound(0, (byte) 37, 3);
                                              var7_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                                              var8 = 0;
                                              do {
                                                if (var8 >= 5) {
                                                  var8 = 0;
                                                  break;
                                                }
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 42, this.field_G, this.field_q);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, -2147483648, 8192);
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-95, var9) >> 9;
                                                ((SpellProjectile) (var5)).field_F = (3 * BevelBoxPainter.cosine(var9, -111) >> 11) - 64;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                              } while (var19 == 0);
                                              while (var8 < 4) {
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 76, this.field_G, this.field_q);
                                                var9 = HuffmanCodec.randomBelow(var7_ref_jd, param0 ^ -2147477632, 8192);
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-71, var9) >> 11;
                                                ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var9, param0 - 6130) >> 11;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var8++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.applyAreaEffect(5, 128, 64, 8);
                                              this.remove(param0 ^ 6016);
                                              return;
                                            }
                                            if (this.field_I == 67) {
                                              this.playTypeSound(1, (byte) 37, 0);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 86, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7 = 0;
                                              while (var7 < 15) {
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 16, this.field_G, this.field_q);
                                                var8 = 8192 * var7 / 15;
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(118, var8) >> 9;
                                                ((SpellProjectile) (var5)).field_F = (3 * BevelBoxPainter.cosine(var8, param0 ^ -6117) >> 11) - 64;
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                                var7++;
                                                if (var19 != 0) {
                                                  return;
                                                }
                                              }
                                              this.applyAreaEffect(25, 128, 64, 8);
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_I == 146) {
                                              this.playTypeSound(0, (byte) 37, 7);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 131, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              var7 = 0;
                                              while (var7 < 15) {
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 145, this.field_G, this.field_q);
                                                var8 = 8192 * var7 / 15;
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-78, var8) >> 9;
                                                ((SpellProjectile) (var5)).field_F = -64 + (3 * BevelBoxPainter.cosine(var8, -116) >> 11);
                                                ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_z + 4 * ((SpellProjectile) (var5)).field_F;
                                                ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_o + 4 * ((SpellProjectile) (var5)).field_u;
                                                ((SpellProjectile) (var5)).field_G = ((SpellProjectile) (var5)).field_z >> 4;
                                                ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_o >> 4;
                                                this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
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
                                          if (this.field_v < -640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.field_v > this.field_q.field_y + 640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.field_G <= this.field_q.field_H) {
                                            return;
                                          }
                                          this.remove(0);
                                          return;
                                        }
                                      }
                                      if (this.field_q.isSolidAt(this.field_G, this.field_v, (byte) -83)) {
                                        return;
                                      }
                                      this.playTypeSound(1, (byte) 37, 6);
                                      this.applyAreaEffect(25, 32, 64, 8);
                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 128, this.field_G, this.field_q);
                                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                    if ((this.field_I == 91 ||
                      this.field_I == 92) &&
                      this.field_y < 20) {
                      this.field_y = this.field_y + 1;
                      return;
                    }
                    if (this.field_I == 49 ||
                      10 == this.field_I ||
                      43 == this.field_I) {
                      this.updateFlightSound(3, (byte) 34);
                    }
                    if (this.field_I == 0) {
                      this.updateFlightSound(9, (byte) 34);
                    }
                    if (this.field_I == 52 ||
                      this.field_I == 50 ||
                      this.field_I == 54) {
                      this.updateFlightSound(4, (byte) 34);
                    }
                    if (this.field_I == 23 ||
                      24 == this.field_I ||
                      this.field_I == 82 ||
                      this.field_I == 21) {
                      this.updateFlightSound(1, (byte) 34);
                      if (this.field_I == 23) {
                        var5 = this.spawnFromHere(this.field_v + (int)(-8.0 + Math.random() * 17.0), (BattleUnit) null, (byte) 81, 90, this.field_G + (int)(-8.0 + Math.random() * 17.0), this.field_q);
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      }
                      if (this.field_I == 82) {
                        this.field_x = this.field_x + 1;
                        if (this.field_x > 4) {
                          this.field_x = this.field_x - 4;
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 90, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                        }
                      }
                    }
                    boolean decompiledFrameRemainder16 = true;
                    if (this.field_I != 10 &&
                      this.field_I != 91) {
                      if (this.field_I != 17 &&
                        this.field_I != 91) {
                        if (14 == this.field_I) {
                          this.updateFlightSound(0, (byte) 34);
                          this.field_x = this.field_x + 1;
                          decompiledFrameRemainder16 = !(this.field_x <= 4);
                          if (decompiledFrameRemainder16) {
                            this.field_x = this.field_x - 4;
                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                            decompiledFrameRemainder16 = (var19 != 0);
                          }
                        }
                        if (decompiledFrameRemainder16) {
                          if (this.field_I != 11) {
                            if (this.field_I != 164) {
                              if (this.field_I != 158) {
                                if (this.field_I != 44 &&
                                  this.field_I != 42 &&
                                  96 != this.field_I &&
                                  92 != this.field_I) {
                                  if (this.field_I != 18) {
                                    if (115 == this.field_I) {
                                      this.updateFlightSound(6, (byte) 34);
                                      this.field_x = this.field_x + 1;
                                      decompiledFrameRemainder16 = !(4 >= this.field_x);
                                      if (decompiledFrameRemainder16) {
                                        this.field_x = this.field_x - 4;
                                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 129, this.field_G, this.field_q);
                                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                        decompiledFrameRemainder16 = (var19 != 0);
                                      }
                                    }
                                    if (decompiledFrameRemainder16) {
                                      if (this.field_I == 120 ||
                                        this.field_I == 124) {
                                        this.updateFlightSound(6, (byte) 34);
                                        decompiledFrameRemainder16 = (var19 != 0);
                                      }
                                      if (decompiledFrameRemainder16) {
                                        if ((this.field_I != 140) &&
                                          (decompiledFrameRemainder16 = (this.field_I == 145))) {
                                          this.updateFlightSound(7, (byte) 34);
                                          decompiledFrameRemainder16 = (var19 != 0);
                                        }
                                        if (decompiledFrameRemainder16) {
                                          this.updateFlightSound(7, (byte) 34);
                                          this.field_x = this.field_x + 1;
                                          decompiledFrameRemainder16 = !(this.field_x <= 2);
                                          if (decompiledFrameRemainder16) {
                                            this.field_x = this.field_x - 2;
                                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 130, this.field_G, this.field_q);
                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                            var5 = this.spawnFromHere(-16 + (this.field_v + (int)(32.0 * Math.random())), (BattleUnit) null, (byte) 81, 130, -16 + this.field_G + (int)(32.0 * Math.random()), this.field_q);
                                            this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
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
                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                                      this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                                      ((SpellProjectile) (var5)).field_F = -this.field_F;
                                      ((SpellProjectile) (var5)).field_u = -this.field_u;
                                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 95, this.field_G, this.field_q);
                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                    decompiledFrameRemainder16 = (var19 != 0);
                                  }
                                }
                              }
                              if (decompiledFrameRemainder16) {
                                this.updateFlightSound(8, (byte) 34);
                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 166, this.field_G, this.field_q);
                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 166, this.field_G, this.field_q);
                                ((SpellProjectile) (var5)).field_u = (int)(21.0 * Math.random()) - 10;
                                ((SpellProjectile) (var5)).field_F = (int)(21.0 * Math.random()) - 10;
                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 166, this.field_G, this.field_q);
                                ((SpellProjectile) (var5)).field_u = (int)(Math.random() * 21.0) - 10;
                                ((SpellProjectile) (var5)).field_F = (int)(21.0 * Math.random()) - 10;
                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                decompiledFrameRemainder16 = (var19 != 0);
                              }
                            }
                            if (decompiledFrameRemainder16) {
                              this.updateFlightSound(8, (byte) 34);
                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 166, this.field_G, this.field_q);
                              this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                              decompiledFrameRemainder16 = (var19 != 0);
                            }
                          }
                          if (decompiledFrameRemainder16) {
                            this.updateFlightSound(0, (byte) 34);
                            this.field_x = this.field_x + 1;
                            decompiledFrameRemainder16 = !(2 >= this.field_x);
                            if (decompiledFrameRemainder16) {
                              this.field_x = this.field_x - 2;
                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                              this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                              ((SpellProjectile) (var5)).field_F = -this.field_F;
                              ((SpellProjectile) (var5)).field_u = -this.field_u;
                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 88, this.field_G, this.field_q);
                          ((SpellProjectile) (var5)).field_u = -this.field_u;
                          ((SpellProjectile) (var5)).field_F = -this.field_F;
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                          if (var19 != 0) {
                            this.updateFlightSound(0, (byte) 34);
                            this.field_x = this.field_x + 1;
                            if (4 < this.field_x) {
                              this.field_x = this.field_x - 4;
                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                            }
                          }
                        }
                      }
                    } else {
                      this.updateFlightSound(0, (byte) 34);
                      this.field_x = this.field_x + 1;
                      if (4 < this.field_x) {
                        this.field_x = this.field_x - 4;
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      }
                    }
                    boolean decompiledFrameRemainder6 = true;
                    if (this.field_I == 50) {
                      if (this.field_y < 250) {
                        this.field_y = this.field_y + 1;
                      }
                      if (this.field_y < 250 &&
                        25 < this.field_y) {
                        var6 = -this.field_v + param1;
                        var7 = -100 - this.field_G;
                        if (this.field_y > 150) {
                          var7 = param2 - this.field_G;
                        }
                        var8 = LoginMessageTable.computeAngle(var6, var7, (byte) -110);
                        var9 = LoginMessageTable.computeAngle(this.field_u, this.field_F, (byte) -89);
                        var10 = -4096 + (8191 & -var9 + var8 + 4096);
                        var11 = ConnectionState.greatestCommonDivisor(this.field_F, this.field_u, false);
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
                        this.field_u = var11 * BevelBoxPainter.cosine(var9, -109) >> 16;
                        this.field_F = GradientBarPainter.sine(125, var9) * var11 >> 16;
                        if (var19 != 0) {
                          this.field_F = this.field_F + 4;
                        }
                      } else {
                        this.field_F = this.field_F + 4;
                      }
                      this.field_o = this.field_o + this.field_u;
                      this.field_z = this.field_z + this.field_F;
                      this.field_v = this.field_o >> 4;
                      this.field_G = this.field_z >> 4;
                      decompiledFrameRemainder6 = (var19 != 0);
                    }
                    if (decompiledFrameRemainder6) {
                      if (18 != this.field_I &&
                        11 != this.field_I &&
                        this.field_I != 44 &&
                        this.field_I != 96 &&
                        0 != this.field_I &&
                        this.field_I != 158) {
                        this.field_o = this.field_o + this.field_u;
                        this.field_z = this.field_z + this.field_F;
                        this.field_G = this.field_z >> 4;
                        this.field_F = this.field_F + 4;
                        this.field_v = this.field_o >> 4;
                        decompiledFrameRemainder6 = (var19 != 0);
                      }
                      if (decompiledFrameRemainder6) {
                        if (250 > this.field_y) {
                          this.field_y = this.field_y + 1;
                          if (250 == this.field_y &&
                            this.field_q.field_Y > 0) {
                            this.field_q.field_Y = -this.field_q.field_Y;
                            if (this.field_q.field_Y == 0) {
                              this.field_q.field_Y = -2;
                            }
                          }
                        }
                        boolean decompiledFrameRemainder5 = true;
                        if (250 > this.field_y &&
                          this.field_y > 25) {
                          boolean decompiledFrameRemainder4 = true;
                          var6 = -this.field_v + param1;
                          var7 = param2 - this.field_G;
                          var8 = LoginMessageTable.computeAngle(var6, var7, (byte) -90);
                          var9 = LoginMessageTable.computeAngle(this.field_u, this.field_F, (byte) 57);
                          var10 = -4096 + (var8 - (var9 - 4096) & 8191);
                          var11 = ConnectionState.greatestCommonDivisor(this.field_F, this.field_u, false);
                          if (0 == this.field_I) {
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
                            if (this.field_I == 18) {
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
                              if (this.field_I != 158) {
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
                          this.field_u = var11 * BevelBoxPainter.cosine(var9, -102) >> 16;
                          this.field_F = GradientBarPainter.sine(-59, var9) * var11 >> 16;
                          decompiledFrameRemainder5 = (var19 != 0);
                        }
                        if (decompiledFrameRemainder5) {
                          this.field_F = this.field_F + 4;
                          if (158 == this.field_I &&
                            250 <= this.field_y) {
                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 163, this.field_G, this.field_q);
                            this.playTypeSound(0, (byte) 37, 0);
                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                            var6 = 0;
                            while (15 > var6) {
                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 159, this.field_G, this.field_q);
                              var7 = var6 * 8192 / 15;
                              ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-36, var7) >> 10;
                              ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var7, -127) >> 11) - 64;
                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                        if (this.field_I == 158 && (this.field_y == 50 ||
                          this.field_y == 100 ||
                          150 == this.field_y ||
                          this.field_y == 200)) {
                          var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 159, this.field_G, this.field_q);
                          ((SpellProjectile) (var5)).field_F = this.field_F / 2;
                          ((SpellProjectile) (var5)).field_u = this.field_u / 2;
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        if (this.field_I == 0) {
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 102, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                        }
                        this.field_z = this.field_z + this.field_F;
                        this.field_o = this.field_o + this.field_u;
                        this.field_G = this.field_z >> 4;
                        this.field_v = this.field_o >> 4;
                      }
                    }
                    if (null != this.field_t &&
                      this.field_y < 25) {
                      this.field_q.eraseUnitMask(this.field_t, param0 - 6016);
                      this.field_y = this.field_y + 1;
                    }
                    var6 = this.field_o;
                    var7 = this.field_z;
                    if (!this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, this.field_v - this.field_r, this.field_p)) {
                      if (-640 > this.field_v) {
                        this.remove(0);
                        return;
                      }
                      if ((this.field_q.field_y + 640) < this.field_v) {
                        this.remove(0);
                        return;
                      }
                      if (this.field_G > this.field_q.field_H) {
                        this.remove(0);
                        return;
                      }
                      if (null == this.field_t) {
                        return;
                      }
                      if (this.field_y > 25) {
                        return;
                      }
                      this.field_q.stampUnitMask(-54, this.field_t);
                      return;
                    }
                    boolean decompiledFrameCompleted6 = true;
                    if (92 == this.field_I) {
                      this.playTypeSound(0, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                      this.applyAreaEffect(50, 96, 48, 8);
                      var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                      var10 = 0;
                      while (var10 < 15) {
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 76, this.field_G, this.field_q);
                        stackIn_958_0 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        if (var19 != 0) {
                          decompiledFrameCompleted6 = false;
                          break;
                        }
                        var11 = stackIn_958_0;
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(119, var11) >> 10;
                        ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -119) >> 10;
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                      }
                    }
                    if (decompiledFrameCompleted6) {
                      stackIn_958_0 = -1;
                    }
                    var8 = stackIn_958_0;
                    if (this.field_I == 162) {
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 163, this.field_G, this.field_q);
                      this.playTypeSound(0, (byte) 37, 0);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      var9 = 0;
                      while (var9 < 4) {
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 159, this.field_G, this.field_q);
                        var10 = 8192 * var9 / 4;
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(param0 ^ 6136, var10) >> 10;
                        ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var10, -113) >> 11) - 64;
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var9++;
                        if (var19 != 0) {
                          return;
                        }
                      }
                      var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 167, this.field_G, this.field_q);
                      ((SpellProjectile) (var5)).field_u = 0;
                      ((SpellProjectile) (var5)).field_F = -1;
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(60, 128, 64, param0 ^ 6024);
                      this.remove(0);
                      return;
                    }
                    if (91 == this.field_I) {
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 86, this.field_G, this.field_q);
                      this.playTypeSound(0, (byte) 37, 0);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      var9 = 0;
                      while (var9 < 15) {
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 16, this.field_G, this.field_q);
                        var10 = var9 * 8192 / 15;
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(param0 - 6056, var10) >> 10;
                        ((SpellProjectile) (var5)).field_F = -64 + (BevelBoxPainter.cosine(var10, param0 - 6119) >> 11);
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var9++;
                        if (var19 != 0) {
                          return;
                        }
                      }
                      this.applyAreaEffect(25, 128, 64, 8);
                      this.remove(0);
                      return;
                    }
                    if (52 == this.field_I) {
                      this.playTypeSound(1, (byte) 37, 4);
                      var8 = 103;
                      this.applyAreaEffect(30, 128, 64, 8);
                    }
                    if (this.field_I == 50) {
                      this.playTypeSound(1, (byte) 37, 4);
                      var8 = 103;
                      this.applyAreaEffect(15, 256, 48, 8);
                    }
                    if (this.field_I == 54) {
                      this.playTypeSound(1, (byte) 37, 4);
                      this.applyAreaEffect(25, 128, 64, param0 - 6008);
                      var8 = 104;
                    }
                    if (10 == this.field_I) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (17 == this.field_I) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(25, 128, 64, 8);
                    }
                    if (18 == this.field_I) {
                      this.playTypeSound(1, (byte) 37, 0);
                      this.applyAreaEffect(15, 128, 64, 8);
                      var8 = 85;
                    }
                    if (this.field_I == 14) {
                      this.playTypeSound(1, (byte) 37, 0);
                      this.applyAreaEffect(25, 96, 48, 8);
                      var8 = 86;
                    }
                    if (11 == this.field_I) {
                      this.playTypeSound(1, (byte) 37, 0);
                      var8 = 85;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (this.field_I == 140) {
                      this.playTypeSound(0, (byte) 37, 6);
                      var8 = 130;
                      this.applyAreaEffect(50, 128, 64, 8);
                    }
                    if (124 == this.field_I) {
                      this.playTypeSound(2, (byte) 37, 6);
                      this.applyAreaEffect(20, 32, 16, 8);
                      var8 = 128;
                    }
                    if (this.field_I == 164) {
                      this.playTypeSound(2, (byte) 37, 0);
                      var8 = 99;
                      if (this.field_y > 1) {
                        stackIn_1007_1 = 5;
                      } else {
                        stackIn_1007_1 = 0;
                      }
                      this.applyAreaEffect(stackIn_1007_1, 32, 32, 8);
                    }
                    if (this.field_I == 161) {
                      var8 = 163;
                      if (BitHelpers.field_b) {
                        this.applyAreaEffect(0, 0, 16, param0 ^ 6024);
                      }
                    }
                    if (this.field_I == 158) {
                      var9 = 250 - this.field_y;
                      if (50 < var9) {
                        var9 = 50;
                      }
                      var8 = 163;
                      this.applyAreaEffect(var9, 128, 64, 8);
                    }
                    if (this.field_I == 120) {
                      this.playTypeSound(1, (byte) 37, 6);
                      var8 = 154;
                      this.applyAreaEffect(0, 32, 32, 8);
                    }
                    if (this.field_I == 115) {
                      boolean decompiledSharedTail2 = !(!BitHelpers.field_b);
                      if (!decompiledSharedTail2) {
                        this.playTypeSound(2, (byte) 37, 6);
                        this.field_q.carveTerrainAndSprite(this.field_G - 8, param0 ^ -6121, -8 + this.field_v, ScreenSwitchHelpers.field_f[0].toRgbSprite());
                        var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 117, this.field_G, this.field_q);
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        decompiledSharedTail2 = (var19 != 0);
                      }
                      if (decompiledSharedTail2) {
                        this.playTypeSound(1, (byte) 37, 6);
                        this.applyAreaEffect(50, 128, 64, 8);
                        var8 = 128;
                      }
                    }
                    if (this.field_I == 0) {
                      this.playTypeSound(1, (byte) 37, 9);
                      this.applyAreaEffect(10, 64, 32, 8);
                      var8 = 101;
                    }
                    if (this.field_I == 43) {
                      this.playTypeSound(2, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 95, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                      this.applyAreaEffect(5, 32, 16, 8);
                    }
                    if (this.field_I == 24) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 64, 8);
                      this.field_y = this.field_y + 1;
                      this.drawUnitMarkers((byte) -104);
                    }
                    if (this.field_I == 82) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 48, 8);
                      this.drawUnitMarkers((byte) -100);
                      this.field_o = var6;
                      this.field_z = var7;
                      this.field_G = this.field_z >> 4;
                      this.field_v = this.field_o >> 4;
                    }
                    if (this.field_I == 49) {
                      this.playTypeSound(0, (byte) 37, 3);
                      var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                      var10 = 0;
                      while (true) {
                        if (var10 < 10) {
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 42, this.field_G, this.field_q);
                          ((SpellProjectile) (var5)).field_w = this.field_w;
                          var11 = HuffmanCodec.randomBelow(var9_ref_jd, param0 ^ -2147477632, 8192);
                          ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(126, var11) >> 9;
                          ((SpellProjectile) (var5)).field_F = -64 + (BevelBoxPainter.cosine(var11, -119) >> 9);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                          var10++;
                          if (var19 == 0) {
                            continue;
                          }
                        } else {
                          this.field_G = GameSelectionHelpers.field_k;
                          this.field_v = NodeHashTable.field_m;
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        break;
                      }
                      this.applyAreaEffect(50, 128, 96, 8);
                    }
                    boolean decompiledFrameCompleted3 = true;
                    boolean decompiledFrameRemainder3 = true;
                    boolean decompiledFrameCompleted4 = true;
                    boolean decompiledFrameCompleted5 = true;
                    if (23 == this.field_I) {
                      this.playTypeSound(0, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 128, 8);
                      this.field_o = var6;
                      this.field_z = var7;
                      this.field_v = this.field_o >> 4;
                      this.field_G = this.field_z >> 4;
                      var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
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
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 82, this.field_G, this.field_q);
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(param0 - 5899, var11) >> 10;
                        ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var11, -120) >> 11) - 48;
                        ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_v + ((SpellProjectile) (var5)).field_u;
                        ((SpellProjectile) (var5)).field_G = ((SpellProjectile) (var5)).field_G + 2 * (48 + ((SpellProjectile) (var5)).field_F);
                        ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                        ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_G << 4;
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted5 = false;
                          break;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted5) &&
                      (this.field_I == 21)) {
                      this.playTypeSound(1, (byte) 37, 1);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(40, 96, 48, param0 - 6008);
                      var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                      var10 = 0;
                      while (var10 < 7) {
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 20, this.field_G, this.field_q);
                        ((SpellProjectile) (var5)).field_w = this.field_w;
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(10, var11) >> 9;
                        ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -114) >> 9;
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted4 = false;
                          break;
                        }
                      }
                    }
                    if ((decompiledFrameCompleted4) &&
                      (decompiledFrameRemainder3 = (40 == this.field_I))) {
                      this.playTypeSound(1, (byte) 37, 3);
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      this.applyAreaEffect(25, 128, 48, 8);
                      var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                    }
                    if (decompiledFrameRemainder3) {
                      var10 = 0;
                      while (var10 < 10) {
                        var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 76, this.field_G, this.field_q);
                        var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                        ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(0, var11) >> 11;
                        ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -116) >> 11;
                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        var10++;
                        if (var19 != 0) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                      }
                    }
                    if (decompiledFrameCompleted3) {
                      if (this.field_I != 145) {
                        boolean decompiledFrameRemainder2 = true;
                        boolean decompiledFrameCompleted0 = true;
                        boolean decompiledFrameRemainder1 = true;
                        boolean decompiledFrameCompleted1 = true;
                        boolean decompiledFrameRemainder0 = true;
                        boolean decompiledFrameCompleted2 = true;
                        if (this.field_I == 42) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                          this.applyAreaEffect(25, 96, 48, param0 - 6008);
                          var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                          var10 = 0;
                          while (var10 < 4) {
                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 76, this.field_G, this.field_q);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(param0 - 6088, var11) >> 11;
                            ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -114) >> 11;
                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted2 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted2) &&
                          (decompiledFrameRemainder0 = (this.field_I == 96))) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                          this.applyAreaEffect(10, 64, 32, 8);
                          var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                        }
                        if (decompiledFrameRemainder0) {
                          var10 = 0;
                          while (var10 < 2) {
                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 43, this.field_G, this.field_q);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-5, var11) >> 10;
                            ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -103) >> 10;
                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted1 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted1) &&
                          (decompiledFrameRemainder1 = (44 == this.field_I))) {
                          this.playTypeSound(1, (byte) 37, 3);
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                          this.applyAreaEffect(25, 64, 32, 8);
                          var9_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                        }
                        if (decompiledFrameRemainder1) {
                          var10 = 0;
                          while (15 > var10) {
                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 43, this.field_G, this.field_q);
                            var11 = HuffmanCodec.randomBelow(var9_ref_jd, -2147483648, 8192);
                            ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(116, var11) >> 9;
                            ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var11, -112) >> 9;
                            this.field_q.onProjectileFinished(param0 - 5964, (SpellProjectile) (var5));
                            var10++;
                            if (var19 != 0) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                          }
                        }
                        if ((decompiledFrameCompleted0) &&
                          (decompiledFrameRemainder2 = (this.field_I == 156))) {
                          var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 168, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                        if (decompiledFrameRemainder2) {
                          ((SpellProjectile) (var5)).field_H = 1;
                        }
                        if (var8 != -1) {
                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, var8, this.field_G, this.field_q);
                          this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                        }
                        if (this.field_I != 121) {
                          this.remove(param0 - 6016);
                        }
                        return;
                      }
                      this.playTypeSound(2, (byte) 37, 3);
                      this.applyAreaEffect(5, 32, 16, 8);
                    }
                    if (this.field_G >= 7 &&
                      !BitHelpers.field_b) {
                      this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, -119, -this.field_r + this.field_v, this.field_p);
                    }
                    this.remove(0);
                    return;
                  }
                } else {
                  this.updateFlightSound(3, (byte) 34);
                  this.field_z = this.field_z + this.field_F;
                  this.field_o = this.field_o + this.field_u;
                  this.field_G = this.field_z >> 4;
                  this.field_F = this.field_F + 4;
                  this.field_v = this.field_o >> 4;
                  if (50 > this.field_y) {
                    this.field_y = this.field_y + 1;
                  }
                  if (null != this.field_t &&
                    25 > this.field_y) {
                    this.field_q.eraseUnitMask(this.field_t, param0 - 6016);
                  }
                  if (this.field_y < 50 &&
                    !this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, 2, -this.field_r + this.field_v, this.field_p)) {
                    if (-640 > this.field_v) {
                      this.remove(0);
                      return;
                    }
                    if (this.field_q.field_y + 640 < this.field_v) {
                      this.remove(param0 ^ 6016);
                      return;
                    }
                    if (this.field_q.field_H < this.field_G) {
                      this.remove(0);
                      return;
                    }
                    if (null == this.field_t) {
                      return;
                    }
                    if (this.field_y >= 25) {
                      return;
                    }
                    this.field_q.stampUnitMask(param0 ^ -6067, this.field_t);
                    if (var19 == 0) {
                      return;
                    }
                  } else {
                    var6_ref_jd = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                    var7 = 0;
                    while (var7 < 45) {
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 46, this.field_G, this.field_q);
                      var8 = var6_ref_jd.nextInt((byte) -46) & 8191;
                      ((SpellProjectile) (var5)).field_u = this.field_u + ((var6_ref_jd.nextInt((byte) -46) & 127) * GradientBarPainter.sine(-122, var8) >> 16);
                      ((SpellProjectile) (var5)).field_F = this.field_F + ((127 & var6_ref_jd.nextInt((byte) -46)) * BevelBoxPainter.cosine(var8, param0 - 6140) >> 16);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      var7++;
                      if (var19 != 0) {
                        return;
                      }
                    }
                    this.playTypeSound(1, (byte) 37, 3);
                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                    this.applyAreaEffect(10, 5, 16, 8);
                    this.remove(0);
                    return;
                  }
                }
                this.field_z = this.field_z + this.field_F;
                this.field_o = this.field_o + this.field_u;
                this.field_G = this.field_z >> 4;
                this.field_F = this.field_F + 4;
                this.field_v = this.field_o >> 4;
                if (this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, -this.field_r + this.field_v, this.field_p)) {
                  this.field_y = this.field_y + 1;
                  var6 = this.field_v;
                  var7 = this.field_G;
                  this.field_v = NodeHashTable.field_m;
                  this.field_G = GameSelectionHelpers.field_k;
                  this.playTypeSound(1, (byte) 37, 1);
                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                  this.applyAreaEffect(5, 128, 64, param0 - 6008);
                  this.field_v = var6;
                  this.field_G = var7;
                  if (this.field_C == null) {
                    this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
                  }
                  var8 = 0;
                  while (true) {
                    if (this.field_y / 2 > var8) {
                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 20, this.field_G, this.field_q);
                      var9 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                      ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-46, var9) >> 9;
                      ((SpellProjectile) (var5)).field_F = BevelBoxPainter.cosine(var9, -127) >> 9;
                      this.field_q.onProjectileFinished(param0 ^ 6068, (SpellProjectile) (var5));
                      var8++;
                      if (var19 != 0) {
                        return;
                      }
                      continue;
                    }
                    if (10 >= this.field_y) {
                      break;
                    }
                    this.remove(0);
                    return;
                  }
                }
                if (-640 > this.field_v) {
                  this.remove(0);
                  return;
                }
                if (this.field_v > 640 + this.field_q.field_y) {
                  this.remove(0);
                  return;
                }
                if (this.field_G > this.field_q.field_H) {
                  this.remove(0);
                  return;
                }
                var5 = this.spawnFromHere(this.field_v + (int)(64.0 * Math.random() - 32.0), (BattleUnit) null, (byte) 81, 90, this.field_G + (int)(Math.random() * 64.0 - 32.0), this.field_q);
                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                return;
              }
            }
          }
          if (this.field_I == 113 &&
            this.field_y < 20) {
            this.field_y = this.field_y + 1;
            return;
          }
          this.field_y = this.field_y + 1;
          if (null == this.field_C) {
            this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param3, this.field_v, this.field_G});
          }
          var6 = 50;
          if (84 == this.field_I &&
            this.field_t != null &&
            2 == this.field_q.field_x[this.field_t.field_u]) {
            var6 = var6 + this.field_q.field_X[this.field_t.field_u] / 4;
          }
          if (this.field_I == 75) {
            var6 = 75;
          }
          if (73 == this.field_I) {
            var6 = 60;
            if (this.field_t != null &&
              this.field_q.field_x[this.field_t.field_u] == 0) {
              var6 = 60 + 3 * this.field_q.field_X[this.field_t.field_u] / 10;
            }
          }
          if (this.field_I == 144) {
            var6 = 60;
          }
          if (this.field_I == 97) {
            var6 = 15;
          }
          if (this.field_I == 125) {
            var6 = 25;
          }
          if (this.field_I == 153) {
            var6 = 25;
          }
          if (113 == this.field_I) {
            var6 = 35;
          }
          if (this.field_y <= var6 && (null == this.field_t ||
            !(this.field_t.field_x > 0))) {
            if (0 != this.field_y % 5) {
              return;
            }
            if (this.field_I == 73) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 16, this.field_G, this.field_q);
              if (null != this.field_t &&
                0 == this.field_q.field_x[this.field_t.field_u]) {
                var7 = 2 * this.field_q.field_X[this.field_t.field_u];
                ((SpellProjectile) (var5)).field_u = this.field_u + HuffmanCodec.randomBelow(this.field_C, -2147483648, var7 * 2 + 1) - var7;
                ((SpellProjectile) (var5)).field_F = -var7 + this.field_F + HuffmanCodec.randomBelow(this.field_C, -2147483648, var7 * 2 + 1);
              }
            }
            if (this.field_I == 144) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 145, this.field_G, this.field_q);
              this.playSound(166, true);
            }
            if (this.field_I == 75) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 43, this.field_G, this.field_q);
            }
            if (97 == this.field_I) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 96, this.field_G, this.field_q);
            }
            if (this.field_I == 125) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 124, this.field_G, this.field_q);
            }
            if (this.field_I == 153) {
              boolean decompiledSharedTail1 = !(!Js5Transport.isFeatureEnabled(0, (byte) -89));
              if (!decompiledSharedTail1) {
                var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 115, this.field_G, this.field_q);
                decompiledSharedTail1 = (var19 != 0);
              }
              if (decompiledSharedTail1) {
                var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 116, this.field_G, this.field_q);
              }
              ((SpellProjectile) (var5)).field_w = this.field_w;
            }
            if (this.field_I == 81) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 20, this.field_G, this.field_q);
              this.playSound(88, true);
            }
            if (this.field_I == 113) {
              var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 52, this.field_G, this.field_q);
            }
            if (this.field_I == 84) {
              var5 = this.spawnFromHere((this.field_u >> 4) + this.field_v, this.field_t, (byte) 81, 30, this.field_G + (this.field_F >> 4), this.field_q);
              ((SpellProjectile) (var5)).field_w = this.field_w;
              ((SpellProjectile) (var5)).field_F = this.field_F;
              ((SpellProjectile) (var5)).field_u = this.field_u;
              if (var19 != 0) {
                if (125 != this.field_I &&
                  153 != this.field_I) {
                  ((SpellProjectile) (var5)).field_u = -15 + (this.field_u >> 1) + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31);
                  ((SpellProjectile) (var5)).field_F = -15 + (this.field_F >> 1) + HuffmanCodec.randomBelow(this.field_C, param0 + 2147477632, 31);
                  ((SpellProjectile) (var5)).field_u = this.field_u + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15;
                  ((SpellProjectile) (var5)).field_F = this.field_F + (HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15);
                } else {
                  ((SpellProjectile) (var5)).field_u = this.field_u + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15;
                  ((SpellProjectile) (var5)).field_F = this.field_F + (HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15);
                }
              }
            } else {
              boolean decompiledSharedTail0 = (125 == this.field_I ||
                153 == this.field_I);
              if (!decompiledSharedTail0) {
                ((SpellProjectile) (var5)).field_u = -15 + (this.field_u >> 1) + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31);
                ((SpellProjectile) (var5)).field_F = -15 + (this.field_F >> 1) + HuffmanCodec.randomBelow(this.field_C, param0 + 2147477632, 31);
                decompiledSharedTail0 = (var19 != 0);
              }
              if (decompiledSharedTail0) {
                ((SpellProjectile) (var5)).field_u = this.field_u + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15;
                ((SpellProjectile) (var5)).field_F = this.field_F + (HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) - 15);
              }
            }
            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
            return;
          }
          this.remove(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var5), "mi.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void notifyOwner(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != this.field_t) {
            this.field_q.stampUnitMask(-49, this.field_t);
          }
          var2_int = 48 % ((param0 + 53) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.LA(" + param0 + ')');
        }
    }

    final void remove(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_D != null) {
            DateOfBirthValidator.stopEffectStream(this.field_D, 123);
          }
          if (this.field_t != null) {
            if (this == this.field_t.field_gb) {
              this.field_t.field_gb = null;
            }
            if (!this.field_t.isDead(-1)) {
              this.field_q.stampUnitMask(-44, this.field_t);
            }
          }
          this.field_J = 0;
          this.field_u = 0;
          this.field_x = 0;
          this.field_F = param0;
          this.field_p = null;
          this.field_H = 0;
          this.field_y = 0;
          this.field_C = null;
          this.field_q.addProjectile(-1, this);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.F(" + param0 + ')');
        }
    }

    private final PcmSampleStream createFlightSoundStream(PcmSample param0, int param1) {
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
          if (null == param0) {
            stackIn_2_0 = null;
            return (PcmSampleStream) (stackIn_2_0);
          }
          var3_int = Math.abs(this.field_F) + Math.abs(this.field_u);
          if (param1 != 19227) {
            field_E = (Sprite) null;
          }
          var4 = var3_int / 10 + 100;
          var5 = 16;
          if (512 > var3_int) {
            var5 = var5 * var3_int / 512;
          }
          stackIn_9_0 = PcmSampleStream.createAtRatePercent(param0, var4, var5);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("mi.CA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void playTypeSound(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 37) {
            this.field_F = 10;
          }
          if (null != this.field_q.field_sb &&
            this.field_q.field_sb[CacheEntry.field_n[param2][param0]] != null) {
            DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[CacheEntry.field_n[param2][param0]], this.field_q.field_sb[CacheEntry.field_n[param2][param0]]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "mi.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean isActiveEffect(byte param0) {
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
          if (this.field_I != 1 &&
            this.field_I != 2 &&
            this.field_I != 3) {
            if (15 != this.field_I &&
              this.field_I != 19 &&
              this.field_I != 68) {
              if (this.field_I != 22 &&
                26 != this.field_I &&
                this.field_I != 27 &&
                this.field_I != 28 &&
                this.field_I != 29 &&
                this.field_I != 68) {
                var2_int = -78 / ((param0 + 7) / 49);
                if (this.field_I != 30 &&
                  69 != this.field_I &&
                  this.field_I != 32 &&
                  this.field_I != 36 &&
                  this.field_I != 35 &&
                  70 != this.field_I &&
                  71 != this.field_I) {
                  if (this.field_I != 47 &&
                    this.field_I != 48 &&
                    this.field_I != 49 &&
                    this.field_I != 72) {
                    if (55 != this.field_I &&
                      this.field_I != 56 &&
                      this.field_I != 157 &&
                      this.field_I != 168) {
                      if (60 != this.field_I &&
                        this.field_I != 62 &&
                        this.field_I != 63 &&
                        64 != this.field_I &&
                        this.field_I != 65) {
                        if (this.field_I != 73 &&
                          this.field_I != 74 &&
                          75 != this.field_I &&
                          77 != this.field_I &&
                          78 != this.field_I) {
                          if (this.field_I != 79 &&
                            80 != this.field_I) {
                            if (81 != this.field_I &&
                              this.field_I != 83 &&
                              84 != this.field_I) {
                              if (this.field_I != 85 &&
                                this.field_I != 86 &&
                                this.field_I != 89 &&
                                this.field_I != 163) {
                                if (this.field_I == 93) {
                                  return false;
                                }
                                if (94 != this.field_I &&
                                  this.field_I != 97) {
                                  if (this.field_I == 98) {
                                    return false;
                                  }
                                  if (this.field_I != 99 &&
                                    this.field_I != 101 &&
                                    this.field_I != 103 &&
                                    this.field_I != 104 &&
                                    this.field_I != 106 &&
                                    this.field_I != 107) {
                                    if (108 != this.field_I &&
                                      this.field_I != 110) {
                                      if (this.field_I != 111 &&
                                        this.field_I != 113 &&
                                        this.field_I != 114) {
                                        if (this.field_I != 118 &&
                                          this.field_I != 119 &&
                                          this.field_I != 121 &&
                                          this.field_I != 123 &&
                                          this.field_I != 125 &&
                                          this.field_I != 127 &&
                                          this.field_I != 126 &&
                                          this.field_I != 128) {
                                          if (130 != this.field_I &&
                                            this.field_I != 131 &&
                                            this.field_I != 134 &&
                                            this.field_I != 136 &&
                                            138 != this.field_I &&
                                            this.field_I != 139 &&
                                            this.field_I != 141 &&
                                            this.field_I != 142 &&
                                            this.field_I != 144) {
                                            if (148 != this.field_I &&
                                              this.field_I != 149 &&
                                              150 != this.field_I &&
                                              this.field_I != 153 &&
                                              this.field_I != 154) {
                                              if (this.field_I == 151) {
                                                return false;
                                              }
                                              if (this.field_I != 160) {
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
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.DA(" + param0 + ')');
        }
    }

    private final SpellProjectile spawnFromHere(int param0, BattleUnit param1, byte param2, int param3, int param4, Battle param5) {
        RuntimeException var7 = null;
        SpellProjectile stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 81) {
            this.setBattle(76, (Battle) null);
          }
          stackIn_4_0 = BevelBoxPainter.createProjectile(param1, param4, (byte) -118, param5, this.field_n, param0, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mi.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void initialize(int param0, int param1, int param2, int param3, int param4, Battle param5, BattleUnit param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_I = param1;
          this.field_G = param2;
          this.field_v = param3;
          this.field_n = param4;
          this.field_t = param6;
          if (param0 > -92) {
            return;
          }
          this.field_q = param5;
          this.field_o = this.field_v << 4;
          this.field_z = this.field_G << 4;
          this.initializeSprite(-103);
          this.field_w = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("mi.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean shouldCameraFollow(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_41_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.field_p) {
            return false;
          }
          if (this.field_I == 157) {
            return false;
          }
          if (this.field_I == 168) {
            return false;
          }
          if (this.field_I == 26) {
            return true;
          }
          if (this.field_I == 64) {
            return true;
          }
          if (63 == this.field_I) {
            return true;
          }
          if (this.field_I == 160) {
            return true;
          }
          if (param0 != -8209) {
            this.updateFlightSound(-104, (byte) 102);
          }
          if (this.field_I == 28) {
            return true;
          }
          if (this.field_I == 49) {
            return true;
          }
          stackIn_41_0 = this.isActiveEffect((byte) -108);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.H(" + param0 + ')');
        }
    }

    final void setBattle(int param0, Battle param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 7 % ((-52 - param0) / 61);
          this.field_q = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("mi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void updateMotion(int param0, byte param1, int param2, int param3) {
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
          if (this.field_p == null) {
            return;
          }
          if (this.isSecondaryLinked((byte) -17)) {
            return;
          }
          regionExit1: {
            var6 = 109 / ((19 - param1) / 55);
            var5 = null;
            var9 = this.field_I;
            if (var9 != 127) {
              if (var9 == 149 &&
                var19 == 0) {
                if (this.field_t != null &&
                  !this.field_t.isDead(-1)) {
                  if (256 <= this.field_y) {
                    return;
                  }
                  this.field_y = this.field_y + 1;
                  if (this.field_y > 255) {
                    this.field_y = 0;
                  }
                  MidiPcmStream.field_L.setDeque((byte) 90, this.field_q.field_Kb);
                  var5 = (SpellProjectile) (MidiPcmStream.field_L.first(-69));
                  while (null != var5) {
                    stackIn_392_0 = var5;
                    boolean decompiledFrameRemainder2 = true;
                    if (((SpellProjectile) stackIn_392_0).isActiveEffect((byte) -124)) {
                      var9 = this.field_v - ((SpellProjectile) (var5)).field_v;
                      var10 = this.field_G - ((SpellProjectile) (var5)).field_G;
                      if (!(Math.abs(var9) < 32) ||
                        !(Math.abs(var10) < 32)) {
                        var9 = this.field_u + (this.field_v - ((SpellProjectile) (var5)).field_v);
                        var10 = this.field_G - (-this.field_F + ((SpellProjectile) (var5)).field_G);
                        if ((!(Math.abs(var9) >= 32)) &&
                          (!(Math.abs(var10) >= 32))) {
                          ((SpellProjectile) (var5)).field_G = this.field_G;
                          ((SpellProjectile) (var5)).field_v = this.field_v;
                          this.field_y = 256;
                          ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                          ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_G << 4;
                        }
                        decompiledFrameRemainder2 = false;
                      }
                      else {
                        ((SpellProjectile) (var5)).field_v = this.field_v + this.field_u;
                        this.field_y = 256;
                        ((SpellProjectile) (var5)).field_G = this.field_F + this.field_G;
                        ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                        ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_G << 4;
                      }
                    }
                    var5 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                  }
                  MidiPcmStream.field_L.setDeque((byte) 28, this.field_q.field_i);
                  stackIn_392_0Lifetime1 = MidiPcmStream.field_L.first(-66);
                  var9_ref_ml = (BattleUnit) (stackIn_392_0Lifetime1);
                  while (null != var9_ref_ml) {
                    boolean decompiledFrameRemainder1 = true;
                    if (var9_ref_ml.field_Y <= 32) {
                      var10Lifetime2 = this.field_v - var9_ref_ml.field_lb;
                      var11 = this.field_G - var9_ref_ml.field_db;
                      if (!(Math.abs(var10Lifetime2) < 32) ||
                        !(Math.abs(var11) < 32)) {
                        var10Lifetime2 = this.field_v + this.field_u - var9_ref_ml.field_lb;
                        var11 = -var9_ref_ml.field_db + this.field_F + this.field_G;
                        if ((!(Math.abs(var10Lifetime2) >= 32)) &&
                          (!(Math.abs(var11) >= 32))) {
                          this.field_y = 256;
                          this.field_q.eraseUnitMask(var9_ref_ml, 0);
                          var9_ref_ml.field_db = this.field_G;
                          var9_ref_ml.field_lb = this.field_v;
                          var9_ref_ml.field_R = var9_ref_ml.field_db << 4;
                          var9_ref_ml.field_X = var9_ref_ml.field_lb << 4;
                          var9_ref_ml.field_z = true;
                        }
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        this.field_y = 256;
                        this.field_q.eraseUnitMask(var9_ref_ml, 0);
                        var9_ref_ml.field_db = this.field_G + this.field_F;
                        var9_ref_ml.field_lb = this.field_v + this.field_u;
                        var9_ref_ml.field_X = var9_ref_ml.field_lb << 4;
                        var9_ref_ml.field_z = true;
                        var9_ref_ml.field_R = var9_ref_ml.field_db << 4;
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
                this.field_y = this.field_y + 1;
                if ((this.field_y == 100 ||
                  this.field_y == 150) && (null != this.field_q.field_sb &&
                  null != this.field_q.field_sb[103])) {
                  DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[103], this.field_q.field_sb[103]);
                }
                var5 = this.spawnFromHere(this.field_t.field_lb, (BattleUnit) null, (byte) 81, 100, this.field_t.field_db - (this.field_t.field_Y >> 1), this.field_q);
                ((SpellProjectile) (var5)).field_u = (int)(64.0 * Math.sin(0.1 * (double)this.field_y));
                ((SpellProjectile) (var5)).field_F = (int)(Math.cos((double)this.field_y * 0.1) * 64.0);
                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                var9_double = 2.0 * (3.141592653589793 * Math.random());
                var5 = this.spawnFromHere(this.field_t.field_lb + (int)(Math.random() * 256.0 * Math.cos(var9_double)), (BattleUnit) null, (byte) 81, 100, this.field_t.field_db - (this.field_t.field_Y >> 1) + (int)(Math.random() * 256.0 * Math.sin(var9_double)), this.field_q);
                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                if (this.field_y % 15 == 1) {
                  MidiPcmStream.field_L.setDeque((byte) 39, this.field_q.field_i);
                  var11_ref_ml = (BattleUnit) (MidiPcmStream.field_L.first(-59));
                  while (var11_ref_ml != null) {
                    stackOut_430_0 = var11_ref_ml;
                    stackIn_472_0 = stackOut_430_0;
                    stackIn_431_0 = stackOut_430_0;
                    if (stackIn_431_0 != this.field_t) {
                      var12 = -var11_ref_ml.field_lb + this.field_v;
                      var13 = this.field_G - var11_ref_ml.field_db;
                      var14 = ConnectionState.greatestCommonDivisor(var13, var12, false);
                      if (256 > var14 ||
                        var11_ref_ml.field_z) {
                        if (var11_ref_ml.field_db >= 0 &&
                          this.field_y <= 200) {
                          if (Math.abs(var12) > 64 &&
                            100 > this.field_y) {
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
                          if (!var11_ref_ml.field_z) {
                            var11_ref_ml.field_eb = var11_ref_ml.field_eb - var15;
                          }
                          var11_ref_ml.field_kb = var11_ref_ml.field_kb - var12 * var15 / var14;
                          var11_ref_ml.field_eb = var11_ref_ml.field_eb - (var15 * var13 / var14 + 8);
                          var11_ref_ml.field_z = true;
                          var5 = this.spawnFromHere(var11_ref_ml.field_lb + (int)(Math.random() * (double)var11_ref_ml.field_Y - (double)(var11_ref_ml.field_Y / 2)), (BattleUnit) null, (byte) 81, 100, var11_ref_ml.field_db, this.field_q);
                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                        }
                      }
                    }
                    var11_ref_ml = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                  }
                  MidiPcmStream.field_L.setDeque((byte) 122, this.field_q.field_Kb);
                  stackIn_472_0Lifetime1 = MidiPcmStream.field_L.first(-109);
                  var11_ref_mi = (SpellProjectile) (stackIn_472_0Lifetime1);
                  while (var11_ref_mi != null) {
                    stackIn_539_0 = var11_ref_mi.field_I;
                    stackIn_539_1 = 30;
                    if (stackIn_539_0 != stackIn_539_1 &&
                      84 != var11_ref_mi.field_I &&
                      var11_ref_mi.field_I != 149) {
                      var12Lifetime3 = this.field_v - var11_ref_mi.field_v;
                      var13Lifetime3 = this.field_G - var11_ref_mi.field_G;
                      var14Lifetime3 = ConnectionState.greatestCommonDivisor(var13Lifetime3, var12Lifetime3, false);
                      if (var14Lifetime3 < 256 ||
                        var11_ref_mi.isAlive(-139)) {
                        if (0 <= var11_ref_mi.field_G &&
                          this.field_y <= 200) {
                          if (!(Math.abs(var12Lifetime3) > 64) ||
                            this.field_y >= 100) {
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
                        if (var11_ref_mi.field_I == 71 ||
                          47 == var11_ref_mi.field_I ||
                          var11_ref_mi.field_I == 36) {
                          if (var12Lifetime3 > 0) {
                            var11_ref_mi.field_o = var11_ref_mi.field_o + 240;
                            var11_ref_mi.field_v = var11_ref_mi.field_v + 15;
                          }
                          if (var12Lifetime3 < 0) {
                            var11_ref_mi.field_v = var11_ref_mi.field_v - 15;
                            var11_ref_mi.field_o = var11_ref_mi.field_o - 240;
                          }
                        }
                        if (0 < var15Lifetime2 &&
                          var14Lifetime3 > 4 &&
                          var14Lifetime3 < 512) {
                          if (var11_ref_mi.field_I == 16) {
                            var11_ref_mi.field_y = 0;
                          }
                          var11_ref_mi.field_F = var11_ref_mi.field_F - (-(var15Lifetime2 / 2) + var15Lifetime2 * var13Lifetime3 / var14Lifetime3);
                          var11_ref_mi.field_u = var11_ref_mi.field_u - var15Lifetime2 * var12Lifetime3 / var14Lifetime3;
                        }
                      }
                    }
                    var11_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                  }
                }
                stackIn_539_0Lifetime1 = -251;
                stackIn_539_1Lifetime1 = ~this.field_y;
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
                      if (!this.field_t.isDead(-1) &&
                        (128 + this.field_q.field_H) > this.field_t.field_db) {
                        this.field_v = this.field_t.field_lb;
                        this.field_G = this.field_t.field_db - (this.field_t.field_Y >> 1);
                        this.field_o = this.field_v << 4;
                        this.field_z = this.field_G << 4;
                        if (this.field_y != 0) {
                          return;
                        }
                        if (this.field_t.field_ib >= 250) {
                          return;
                        }
                        var9 = 0;
                        MidiPcmStream.field_L.setDeque((byte) 69, this.field_q.field_i);
                        var10_ref_ml = (BattleUnit) (MidiPcmStream.field_L.first(-111));
                        while (var10_ref_ml != null) {
                          if (var19 != 0) {
                            return;
                          }
                          if (var10_ref_ml.field_s == this.field_t &&
                            0 < var10_ref_ml.field_ib - var10_ref_ml.field_x &&
                            this.field_t.field_ib < 250) {
                            this.field_t.field_ib = this.field_t.field_ib + 1;
                            var10_ref_ml.field_x = var10_ref_ml.field_x + 1;
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
                      if (this.field_q.getCurrentPlayer(false) == this.field_t.field_T) {
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
                          this.field_y = this.field_y + 1;
                          if (this.field_y <= 50) {
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
                                          this.field_y = this.field_y + 1;
                                          if (this.field_y == 3 &&
                                            0 == this.field_H) {
                                            this.playSound(160, true);
                                          }
                                          if (this.field_y > 8) {
                                            this.field_y = this.field_y - 8;
                                            this.field_H = this.field_H + 1;
                                            if (this.field_H == 1) {
                                              this.applyAreaEffect(0, this.field_t.field_Y, this.field_t.field_Y * 2, 8);
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
                                          this.field_y = this.field_y + 64;
                                          this.field_G = -480;
                                          if (this.field_F >= this.field_y) {
                                            return;
                                          }
                                          this.remove(0);
                                          return;
                                        }
                                        if (var9 == 155) {
                                          if (this.field_t.field_q > 0) {
                                            this.field_t.field_q = this.field_t.field_q - 1;
                                            this.field_t.field_z = true;
                                          }
                                          this.field_y = this.field_y + 1;
                                          if (0 != (this.field_y & 5)) {
                                            return;
                                          }
                                          if (this.field_t.field_q <= 0) {
                                            if (this.field_y > 128) {
                                              this.remove(0);
                                            }
                                            return;
                                          }
                                          var5 = this.spawnFromHere(this.field_t.field_lb, this.field_t, (byte) 81, 0, this.field_t.field_db - this.field_t.field_Y - 8, this.field_q);
                                          ((SpellProjectile) (var5)).field_u = -56 + 8 * (this.field_y / 5 & 15);
                                          this.field_q.field_mb = this.field_t.field_lb;
                                          ((SpellProjectile) (var5)).field_F = -100;
                                          this.field_q.field_t = -240;
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                          return;
                                        }
                                        if (var9 == 60) {
                                          this.field_y = this.field_y + 1;
                                          var9 = 0;
                                          boolean decompiledNaturalLoopExit0 = false;
                                          while (!(decompiledNaturalLoopExit0 = (32 <= var9))) {
                                            stackIn_823_0 = this.field_G;
                                            if (var19 == 0) {
                                              if (stackIn_823_0 < -32 + this.field_q.field_H &&
                                                !this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, 2, this.field_v - this.field_r, this.field_p)) {
                                                this.field_G = this.field_G + 1;
                                              }
                                              var9++;
                                              continue;
                                            }
                                            break;
                                          }
                                          if (decompiledNaturalLoopExit0) {
                                            stackIn_823_0 = compareDoublesNanGreater(128.0 * Math.random(), (double)this.field_y);
                                          }
                                          if (stackIn_823_0 < 0) {
                                            var5 = this.spawnFromHere(this.field_v + (int)(96.0 * Math.random() - 48.0), (BattleUnit) null, (byte) 81, 109, (int)(-480.0 + Math.random() * (double)(this.field_G + 480)), this.field_q);
                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                          }
                                          if (this.field_y < 128) {
                                            return;
                                          }
                                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 108, this.field_G, this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                                            if (this.field_y != 0) {
                                              if (this.field_y > 50) {
                                                this.field_y = this.field_y + 1;
                                                if (this.field_y <= 80) {
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                              this.field_y = this.field_y + 1;
                                              if (this.field_y <= 50) {
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (this.field_t != null) {
                                              this.field_q.eraseUnitMask(this.field_t, 0);
                                            }
                                            var9 = 25;
                                            var10Lifetime1 = this.field_o;
                                            var11Lifetime1 = this.field_z;
                                            var12Lifetime1 = 0;
                                            var13Lifetime1 = 0;
                                            while (var13Lifetime1 == 0) {
                                              if (this.field_q.isSolidAt(this.field_G, this.field_v + 2, (byte) -83) ||
                                                this.field_q.isSolidAt(this.field_G, this.field_v - 2, (byte) -83) ||
                                                this.field_q.isSolidAt(this.field_G - 2, this.field_v, (byte) -83) ||
                                                this.field_q.isSolidAt(this.field_G + 2, this.field_v, (byte) -83)) {
                                                var13Lifetime1 = 1;
                                              }
                                              var12Lifetime1++;
                                              this.field_z = this.field_z + (this.field_F >> 1);
                                              this.field_o = this.field_o + (this.field_u >> 1);
                                              this.field_G = this.field_z >> 4;
                                              this.field_v = this.field_o >> 4;
                                              if (-640 > this.field_v) {
                                                var13Lifetime1 = 1;
                                              }
                                              if ((640 + this.field_q.field_y) < this.field_v) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.field_q.field_H < this.field_G) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.field_G < -480) {
                                                var13Lifetime1 = 1;
                                              }
                                              if (var12Lifetime1 <= var9) {
                                                continue;
                                              }
                                              var13Lifetime1 = 1;
                                            }
                                            this.field_F = this.field_z - var11Lifetime1;
                                            this.field_u = this.field_o - var10Lifetime1;
                                            this.field_z = var11Lifetime1;
                                            this.field_o = var10Lifetime1;
                                            this.field_G = this.field_z >> 4;
                                            this.field_v = this.field_o >> 4;
                                            regionExit5: {
                                              if (var12Lifetime1 <= var9 &&
                                                var12Lifetime1 > 5) {
                                                var14Lifetime1 = 0;
                                                while (var14Lifetime1 < var12Lifetime1) {
                                                  var15Lifetime1 = (this.field_u * var14Lifetime1 / var12Lifetime1 >> 4) + this.field_v;
                                                  var16 = this.field_G + (var14Lifetime1 * this.field_F / var12Lifetime1 >> 4);
                                                  var17 = Math.abs(var12Lifetime1 / 2 - var14Lifetime1);
                                                  var18 = (var12Lifetime1 * var12Lifetime1 / 4 - var17 * var17) / 4 + (-var14Lifetime1 + var12Lifetime1) * this.field_t.getSize(-8323) / (2 * var12Lifetime1);
                                                  var16 = var16 + var18;
                                                  var5 = this.spawnFromHere(var15Lifetime1, (BattleUnit) null, (byte) 81, 151, var16, this.field_q);
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
                                                  ((SpellProjectile) (stackIn_953_0)).field_p = ((IndexedSprite) (Object) stackIn_950_1[stackIn_951_2]).toRgbSprite();
                                                  ((SpellProjectile) (var5)).field_y = var18;
                                                  ((SpellProjectile) (var5)).field_x = 2 * var14Lifetime1;
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  var14Lifetime1++;
                                                }
                                                DropdownList.field_N = -1;
                                                stackIn_953_0Lifetime1 = this;
                                                this.field_y = 1;
                                                break regionExit5;
                                              }
                                              stackIn_957_0 = this.field_q;
                                              stackIn_957_1 = 87;
                                              if (this.field_t.field_s != null) {
                                                stackIn_958_2 = this.field_t.field_s.field_T;
                                              } else {
                                                stackIn_958_2 = this.field_t.field_T;
                                              }
                                              ((Battle) (Object) stackIn_957_0).resetSpellSlots(stackIn_957_1, stackIn_958_2, true);
                                              this.field_y = 51;
                                            }
                                            if (null != this.field_t) {
                                              this.field_q.stampUnitMask(-100, this.field_t);
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
                                            this.field_y = this.field_y - 1;
                                            if (this.field_y > 0) {
                                              return;
                                            }
                                            this.field_q.spriteOverlapsTerrain(-8 + this.field_G, 2, this.field_v - 8, this.field_p);
                                            if (!BitHelpers.field_b) {
                                              this.field_q.carveTerrainAndSprite(this.field_G - 8, -19, -8 + this.field_v, this.field_p);
                                            }
                                            this.remove(0);
                                            return;
                                          }
                                          if (var9 != 30 &&
                                            93 != var9) {
                                            if (var9 == 72 &&
                                              var19 == 0) {
                                              if (!this.field_t.isDead(-1) &&
                                                (this.field_q.field_H + 128) > this.field_t.field_db) {
                                                this.field_G = this.field_t.field_db - (this.field_t.field_Y >> 1);
                                                this.field_v = this.field_t.field_lb;
                                                this.field_o = this.field_v << 4;
                                                this.field_z = this.field_G << 4;
                                                var9 = this.field_y * 4096 / 100;
                                                var10Lifetime1 = GradientBarPainter.sine(10, var9) >> 10;
                                                var11Lifetime1 = BevelBoxPainter.cosine(var9, -105) >> 10;
                                                this.field_y = this.field_y + 1;
                                                var5 = this.spawnFromHere(this.field_v - var10Lifetime1, (BattleUnit) null, (byte) 81, 95, this.field_G - var11Lifetime1, this.field_q);
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                var5 = this.spawnFromHere(this.field_v + var10Lifetime1, (BattleUnit) null, (byte) 81, 95, this.field_G - var11Lifetime1, this.field_q);
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                if (!this.field_q.spriteOverlapsTerrain(this.field_G - var11Lifetime1 - this.field_r, 2, var10Lifetime1 + (this.field_v - this.field_r), DateHelpers.field_a)) {
                                                  this.field_q.carveTerrainAndSprite(-var11Lifetime1 + this.field_G - 8, -125, -8 + (this.field_v + var10Lifetime1), ScreenSwitchHelpers.field_f[7].toRgbSprite());
                                                }
                                                if (!this.field_q.spriteOverlapsTerrain(this.field_G + (-var11Lifetime1 - this.field_r), 2, -this.field_r + (-var10Lifetime1 + this.field_v), DateHelpers.field_a)) {
                                                  this.field_q.carveTerrainAndSprite(-8 + this.field_G - var11Lifetime1, -44, -8 + (this.field_v - var10Lifetime1), ScreenSwitchHelpers.field_f[7].toRgbSprite());
                                                }
                                                if (this.field_y <= 100) {
                                                  return;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 83) {
                                              if (!this.field_t.isDead(-1) &&
                                                (this.field_q.field_H + 128) > this.field_t.field_db) {
                                                this.field_v = this.field_t.field_lb;
                                                this.field_G = -(this.field_t.field_Y >> 1) + this.field_t.field_db;
                                                this.field_z = this.field_G << 4;
                                                this.field_o = this.field_v << 4;
                                                var9 = 4096 * (this.field_y + this.field_v + this.field_G) / 100;
                                                var10Lifetime1 = GradientBarPainter.sine(117, var9) >> 10;
                                                var11Lifetime1 = BevelBoxPainter.cosine(var9, -112) >> 10;
                                                this.field_y = this.field_y + 20;
                                                var5 = this.spawnFromHere(var10Lifetime1 + this.field_v, this.field_t, (byte) 81, 3, this.field_G + var11Lifetime1, this.field_q);
                                                ((SpellProjectile) (var5)).field_u = var10Lifetime1;
                                                ((SpellProjectile) (var5)).field_F = var11Lifetime1;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                if (this.field_y < 200) {
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
                                              QuickChatHelpers.field_b = -3 + (7 & this.field_y);
                                              if (0 == this.field_y) {
                                                this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                              }
                                              if (this.field_y == 50 &&
                                                this.field_q.field_sb != null &&
                                                null != this.field_q.field_sb[90]) {
                                                DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[90], this.field_q.field_sb[90]);
                                              }
                                              this.field_y = this.field_y + 1;
                                              if (this.field_y % 15 == 1) {
                                                MidiPcmStream.field_L.setDeque((byte) 28, this.field_q.field_i);
                                                var9_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-70));
                                                while (var9_ref_mlLifetime1 != null) {
                                                  stackOut_1133_0 = var9_ref_mlLifetime1.field_z;
                                                  stackIn_1159_0 = stackOut_1133_0 ? 1 : 0;
                                                  stackIn_1134_0 = stackOut_1133_0;
                                                  if (!stackIn_1134_0) {
                                                    var9_ref_mlLifetime1.field_z = true;
                                                    var9_ref_mlLifetime1.field_eb = -16;
                                                    var9_ref_mlLifetime1.field_kb = 64 * (HuffmanCodec.randomBelow(this.field_C, -2147483648, 256) & 2) - 32;
                                                    var5 = this.spawnFromHere(var9_ref_mlLifetime1.field_lb + (int)(Math.random() * (double)var9_ref_mlLifetime1.field_Y - (double)(var9_ref_mlLifetime1.field_Y / 2)), (BattleUnit) null, (byte) 81, 90, var9_ref_mlLifetime1.field_db, this.field_q);
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  if (var9_ref_mlLifetime1.field_jb == 22 ||
                                                    23 == var9_ref_mlLifetime1.field_jb ||
                                                    var9_ref_mlLifetime1.field_jb == 21 ||
                                                    var9_ref_mlLifetime1.field_jb == 24 ||
                                                    var9_ref_mlLifetime1.field_jb == 20 ||
                                                    var9_ref_mlLifetime1.field_jb == 35) {
                                                    var9_ref_mlLifetime1.field_x = var9_ref_mlLifetime1.field_x + 2;
                                                    var9_ref_mlLifetime1.field_z = true;
                                                  }
                                                  var9_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                }
                                              }
                                              stackIn_1159_0Lifetime1 = this.field_y;
                                              if (stackIn_1159_0Lifetime1 <= 250) {
                                                return;
                                              }
                                              QuickChatHelpers.field_b = 0;
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 29 &&
                                              var19 == 0) {
                                              if (this.field_t != null &&
                                                this.field_t.isDead(-1)) {
                                                this.remove(0);
                                                return;
                                              }
                                              if (this.field_H > 0 ||
                                                this.field_y < 30) {
                                                this.field_y = this.field_y + 1;
                                              }
                                              if (1 == (7 & this.field_y)) {
                                                if (this.field_y == 1 ||
                                                  this.field_y == 33) {
                                                  this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                }
                                                var9 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 21, this.field_G, this.field_q);
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                this.playSound(89, true);
                                                ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(126, var9) >> 11;
                                                ((SpellProjectile) (var5)).field_F = -256 + (BevelBoxPainter.cosine(var9, -119) >> 9);
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (this.field_y <= 250) {
                                                return;
                                              }
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 == 118) {
                                              this.field_y = this.field_y + 1;
                                              if (0 == this.field_y % 3) {
                                                var9 = this.field_v;
                                                this.field_v = this.field_t.field_X + this.field_u * this.field_y / 3 >> 4;
                                                var10Lifetime1 = this.field_G;
                                                this.field_G = -(this.field_t.field_Y / 2) + (this.field_t.field_R + this.field_y * this.field_F / 3 >> 4);
                                                this.applyAreaEffect(5, 64, 32, 8);
                                                this.playTypeSound(2, (byte) 37, 6);
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 129, this.field_G, this.field_q);
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                this.field_v = var9;
                                                this.field_G = var10Lifetime1;
                                              }
                                              if (this.field_y <= 16) {
                                                return;
                                              }
                                              var9 = this.field_v;
                                              var10Lifetime1 = this.field_G;
                                              this.field_v = this.field_t.field_X + this.field_u * this.field_y / 3 >> 4;
                                              this.field_G = -(this.field_t.field_Y / 2) + (this.field_t.field_R + this.field_F * this.field_y / 3 >> 4);
                                              this.applyAreaEffect(10, 128, 48, 8);
                                              this.playTypeSound(1, (byte) 37, 6);
                                              var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 154, this.field_G, this.field_q);
                                              this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              this.field_G = var10Lifetime1;
                                              this.field_v = var9;
                                              this.remove(0);
                                              return;
                                            }
                                            if (var9 != 79) {
                                              if (var9 != 98 ||
                                                var19 != 0) {
                                                if (var9 == 80 &&
                                                  var19 == 0) {
                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 87, this.field_G, this.field_q);
                                                  ((SpellProjectile) (var5)).field_u = (int)(Math.random() * 15.0) - 8;
                                                  ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F - 16;
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  if (this.field_t.field_lb < this.field_v) {
                                                    this.field_t.field_M = -1;
                                                  }
                                                  if (this.field_v < this.field_t.field_lb) {
                                                    this.field_t.field_M = 1;
                                                  }
                                                  this.field_y = this.field_y + 1;
                                                  if (this.field_y <= 50) {
                                                    return;
                                                  }
                                                  this.playTypeSound(0, (byte) 37, 1);
                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 89, this.field_G, this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  this.applyAreaEffect(75, 256, 80, 8);
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (69 == var9) {
                                                  if (!this.field_t.isDead(-1) &&
                                                    this.field_t.field_db < (128 + this.field_q.field_H)) {
                                                    this.field_x = this.field_x + 1;
                                                    this.field_G = this.field_t.field_db;
                                                    this.field_v = this.field_t.field_lb;
                                                    if (this.field_x >= 12) {
                                                      this.field_x = this.field_x - 12;
                                                    }
                                                    boolean decompiledFrameCompleted1 = true;
                                                    if (this.field_y < 250) {
                                                      if (0 < this.field_y) {
                                                        this.field_y = this.field_y + 1;
                                                      }
                                                      MidiPcmStream.field_L.setDeque((byte) 121, this.field_q.field_Kb);
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
                                                          30 != var9_ref_mi.field_I &&
                                                          93 != var9_ref_mi.field_I &&
                                                          var9_ref_mi.field_I != 84 &&
                                                          118 != var9_ref_mi.field_I &&
                                                          var9_ref_mi.field_I != 119) {
                                                          var10Lifetime1 = -this.field_v + var9_ref_mi.field_v;
                                                          var11Lifetime1 = -this.field_G + var9_ref_mi.field_G;
                                                          if (var10Lifetime1 * var9_ref_mi.field_u + var11Lifetime1 * var9_ref_mi.field_F < 0) {
                                                            var12Lifetime1 = var10Lifetime1 * var10Lifetime1 + var11Lifetime1 * var11Lifetime1;
                                                            if (this.field_t.field_jb == 25) {
                                                              var12Lifetime1 = 3 * var12Lifetime1 / 2;
                                                            }
                                                            if (var12Lifetime1 < 65536) {
                                                              this.field_y = this.field_y + 1;
                                                              if (var12Lifetime1 > 0) {
                                                                var9_ref_mi.field_u = var9_ref_mi.field_u + Math.abs(var10Lifetime1) * 32 * var10Lifetime1 / var12Lifetime1;
                                                                var9_ref_mi.field_F = var9_ref_mi.field_F + Math.abs(var11Lifetime1) * var11Lifetime1 * 32 / var12Lifetime1;
                                                                if (var10Lifetime1 <= 0) {
                                                                  var9_ref_mi.field_u = var9_ref_mi.field_u - 5;
                                                                } else {
                                                                  var9_ref_mi.field_u = var9_ref_mi.field_u + 5;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var9_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    if (decompiledFrameCompleted1) {
                                                      this.field_z = this.field_G << 4;
                                                      stackIn_1322_0Lifetime1 = this;
                                                      stackIn_1322_1 = this.field_v << 4;
                                                    }
                                                    this.field_o = stackIn_1322_1;
                                                    return;
                                                  }
                                                  if (this.field_q.getCurrentPlayer(false) == this.field_t.field_T) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (138 == var9 &&
                                                  var19 == 0) {
                                                  if (this.field_t.field_ib > 0 &&
                                                    this.field_t.field_db < (this.field_q.field_H + 128)) {
                                                    this.field_G = this.field_t.field_db;
                                                    this.field_v = this.field_t.field_lb;
                                                    if (0 == this.field_y) {
                                                      if (null != this.field_t && (null == this.field_t.field_gb ||
                                                        this.field_t.field_gb.field_I != 121)) {
                                                        this.field_t.field_gb = this;
                                                      }
                                                      MidiPcmStream.field_L.setDeque((byte) 117, this.field_q.field_i);
                                                      var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-62));
                                                      while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                        if (var9_ref_mlLifetime1Lifetime1 != this.field_t &&
                                                          this.field_y == 0) {
                                                          var10Lifetime1 = -var9_ref_mlLifetime1Lifetime1.field_lb + this.field_v;
                                                          var11Lifetime1 = -(this.field_t.field_Y / 2) + this.field_G + (-var9_ref_mlLifetime1Lifetime1.field_db + var9_ref_mlLifetime1Lifetime1.field_Y / 2);
                                                          if (Math.abs(var10Lifetime1) < ((var9_ref_mlLifetime1Lifetime1.field_Y + this.field_t.field_Y * 4 / 3) / 2) &&
                                                            Math.abs(var11Lifetime1) < (this.field_t.field_Y * 4 / 3 + var9_ref_mlLifetime1Lifetime1.field_Y) / 2) {
                                                            var12Lifetime1 = this.field_v;
                                                            this.field_v = var9_ref_mlLifetime1Lifetime1.field_lb;
                                                            var13Lifetime1 = this.field_G;
                                                            if (var10Lifetime1 > 0) {
                                                              this.field_v = this.field_v - 4;
                                                            } else {
                                                              this.field_v = this.field_v + 4;
                                                            }
                                                            this.field_G = var9_ref_mlLifetime1Lifetime1.field_db;
                                                            this.field_G = this.field_G + 8;
                                                            var5 = this.spawnFromHere(this.field_t.field_lb, this.field_t, (byte) 81, 139, this.field_t.field_db, this.field_q);
                                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            ((SpellProjectile) (var5)).field_u = var10Lifetime1;
                                                            ((SpellProjectile) (var5)).field_F = var11Lifetime1;
                                                            if (28 == this.field_t.field_jb) {
                                                              this.playTypeSound(2, (byte) 37, 6);
                                                              this.applyAreaEffect(5, 32, 16, 8);
                                                            }
                                                            if (this.field_t.field_jb == 29) {
                                                              this.playTypeSound(1, (byte) 37, 6);
                                                              this.applyAreaEffect(15, 32, 16, 8);
                                                            }
                                                            if (this.field_t.field_jb == 30) {
                                                              this.playTypeSound(0, (byte) 37, 6);
                                                              this.applyAreaEffect(30, 32, 16, 8);
                                                            }
                                                            this.field_v = var12Lifetime1;
                                                            this.field_G = var13Lifetime1;
                                                            this.field_y = 1;
                                                          }
                                                        }
                                                        var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    this.field_z = this.field_G << 4;
                                                    this.field_o = this.field_v << 4;
                                                    return;
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (var9 == 70 &&
                                                  var19 == 0) {
                                                  if (!this.field_t.isDead(-1) &&
                                                    (128 + this.field_q.field_H) > this.field_t.field_db) {
                                                    this.field_x = this.field_x + 1;
                                                    this.field_v = this.field_t.field_lb;
                                                    if (16 <= this.field_x) {
                                                      this.field_x = this.field_x - 16;
                                                    }
                                                    this.field_G = this.field_t.field_db;
                                                    if (this.field_y < 5) {
                                                      MidiPcmStream.field_L.setDeque((byte) 116, this.field_q.field_i);
                                                      var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-57));
                                                      while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                        if (~this.field_t.field_u != ~var9_ref_mlLifetime1Lifetime1.field_u) {
                                                          var10Lifetime1 = -var9_ref_mlLifetime1Lifetime1.field_lb + this.field_v;
                                                          var11Lifetime1 = this.field_G - (this.field_t.field_Y / 2 + (-(var9_ref_mlLifetime1Lifetime1.field_Y / 2) + var9_ref_mlLifetime1Lifetime1.field_db));
                                                          if (Math.abs(var10Lifetime1) < 64 &&
                                                            Math.abs(var11Lifetime1) < 64) {
                                                            var12Lifetime1 = this.field_v;
                                                            this.field_v = var9_ref_mlLifetime1Lifetime1.field_lb;
                                                            var13Lifetime1 = this.field_G;
                                                            this.field_G = var9_ref_mlLifetime1Lifetime1.field_db;
                                                            if (var10Lifetime1 >= 0) {
                                                              this.field_v = this.field_v - 8;
                                                            } else {
                                                              this.field_v = this.field_v + 8;
                                                            }
                                                            this.field_G = this.field_G + 8;
                                                            var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 100, this.field_G, this.field_q);
                                                            this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                            this.playTypeSound(2, (byte) 37, 2);
                                                            var14Lifetime1 = 0;
                                                            while (true) {
                                                              if (var14Lifetime1 < 5) {
                                                                var5 = this.spawnFromHere(this.field_v + (int)(-2.0 + Math.random() * 4.0), (BattleUnit) null, (byte) 81, 112, this.field_G + (int)(-2.0 + Math.random() * 4.0), this.field_q);
                                                                ((SpellProjectile) (var5)).field_u = (int)(32.0 * Math.random() - 16.0) << 4;
                                                                ((SpellProjectile) (var5)).field_F = (int)(-16.0 + Math.random() * 32.0) << 4;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                var14Lifetime1++;
                                                                continue;
                                                              }
                                                              break;
                                                            }
                                                            this.applyAreaEffect(5, 32, 16, 8);
                                                            this.field_y = this.field_y + 1;
                                                            this.field_v = var12Lifetime1;
                                                            this.field_G = var13Lifetime1;
                                                          }
                                                        }
                                                        var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (MidiPcmStream.field_L.next(-18502));
                                                      }
                                                    }
                                                    this.field_z = this.field_G << 4;
                                                    this.field_o = this.field_v << 4;
                                                    return;
                                                  }
                                                  if (this.field_q.getCurrentPlayer(false) == this.field_t.field_T) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (var9 == 123) {
                                                  this.field_x = this.field_x + 1;
                                                  if (this.field_x >= 16) {
                                                    this.field_x = this.field_x - 16;
                                                  }
                                                  if (this.field_y == -1) {
                                                    this.field_y = 0;
                                                  }
                                                  scanLoop6: while (true) {
                                                    if (this.field_q.field_H > this.field_G) {
                                                      stackOut_1433_0 = this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, this.field_v - this.field_r, this.field_p);
                                                      stackIn_1444_0 = stackOut_1433_0 ? 1 : 0;
                                                      stackIn_1434_0 = stackOut_1433_0;
                                                      if (var19 != 0) {
                                                        break scanLoop6;
                                                      }
                                                      if (!stackIn_1434_0) {
                                                        this.field_z = this.field_z + 16;
                                                        if (this.field_y == 0) {
                                                          this.field_y = -1;
                                                        }
                                                        this.field_G = this.field_z >> 4;
                                                        continue;
                                                      }
                                                    }
                                                    stackIn_1444_0 = this.field_G;
                                                    break;
                                                  }
                                                  if (stackIn_1444_0 < this.field_q.field_H) {
                                                    return;
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (126 == var9 &&
                                                  var19 == 0) {
                                                  if (this.field_t.isDead(-1)) {
                                                    this.remove(0);
                                                    return;
                                                  }
                                                  this.field_x = this.field_x + 7;
                                                  if (this.field_x >= 255) {
                                                    this.field_x = this.field_x - 255;
                                                  }
                                                  if (!this.field_q.isRecording(-28046)) {
                                                    var9 = -this.field_q.field_H;
                                                    while (true) {
                                                      if (var9 < this.field_G) {
                                                        var10Lifetime1 = this.field_v + (int)(Math.sin((double)(this.field_G - var9) * 3.14 / (double)(this.field_G + this.field_q.field_H)) * Math.cos(-((double)SpriteState.field_v * 0.1) + (double)(-var9)) * 64.0);
                                                        var5 = this.spawnFromHere(var10Lifetime1, (BattleUnit) null, (byte) 81, 129, var9 + (int)(32.0 * Math.random() - 16.0), this.field_q);
                                                        this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                        ((SpellProjectile) (var5)).field_u = (int)(Math.random() * 5.0 - 2.0);
                                                        ((SpellProjectile) (var5)).field_F = -64;
                                                        ((SpellProjectile) (var5)).field_x = 1;
                                                        var9 += 32;
                                                        continue;
                                                      }
                                                      break;
                                                    }
                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 129, this.field_G, this.field_q);
                                                    ((SpellProjectile) (var5)).field_u = (int)(-64.0 + Math.random() * 128.0);
                                                    ((SpellProjectile) (var5)).field_F = -(int)Math.sqrt((double)(-(((SpellProjectile) (var5)).field_u * ((SpellProjectile) (var5)).field_u) + 4096));
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  if (this.field_y == -1) {
                                                    this.field_y = 0;
                                                  }
                                                  while (this.field_G < this.field_q.field_H &&
                                                    !this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, -this.field_r + this.field_v, this.field_p)) {
                                                    this.field_z = this.field_z + 16;
                                                    this.field_G = this.field_z >> 4;
                                                    if (0 != this.field_y) {
                                                      continue;
                                                    }
                                                    this.field_y = -1;
                                                  }
                                                  if (this.field_y >= 25) {
                                                    this.field_y = this.field_y + 1;
                                                    if (this.field_y <= 27) {
                                                      return;
                                                    }
                                                    this.field_y = 0;
                                                    return;
                                                  }
                                                  if (this.field_y > 0) {
                                                    this.field_y = this.field_y + 1;
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 51, this.field_q.field_Kb);
                                                  var9_ref_miLifetime1 = (SpellProjectile) (MidiPcmStream.field_L.first(-62));
                                                  while (null != var9_ref_miLifetime1) {
                                                    stackOut_1493_0 = var9_ref_miLifetime1;
                                                    stackIn_1544_0 = stackOut_1493_0;
                                                    stackIn_1494_0 = stackOut_1493_0;
                                                    regionExit7: {
                                                      if (((SpellProjectile) (Object) stackIn_1494_0).isAlive(-139) &&
                                                        126 != var9_ref_miLifetime1.field_I &&
                                                        var9_ref_miLifetime1.field_I != 30 &&
                                                        93 != var9_ref_miLifetime1.field_I &&
                                                        84 != var9_ref_miLifetime1.field_I) {
                                                        var10Lifetime1 = var9_ref_miLifetime1.field_v - this.field_v;
                                                        var11Lifetime1 = -this.field_G + var9_ref_miLifetime1.field_G;
                                                        if (0 > var11Lifetime1 &&
                                                          Math.abs(var10Lifetime1) < 128) {
                                                          if (46 != var9_ref_miLifetime1.field_I &&
                                                            var9_ref_miLifetime1.field_I != 25) {
                                                            var9_ref_miLifetime1.field_F = var9_ref_miLifetime1.field_F - 5;
                                                          }
                                                          if (0 <= var10Lifetime1) {
                                                            if (var9_ref_miLifetime1.field_u < 0) {
                                                              var9_ref_miLifetime1.field_u = var9_ref_miLifetime1.field_u + 4;
                                                            } else {
                                                              var9_ref_miLifetime1.field_u = var9_ref_miLifetime1.field_u + 4;
                                                            }
                                                            break regionExit7;
                                                          }
                                                          if (var9_ref_miLifetime1.field_u <= 0) {
                                                            var9_ref_miLifetime1.field_u = var9_ref_miLifetime1.field_u - 4;
                                                          } else {
                                                            var9_ref_miLifetime1.field_u = var9_ref_miLifetime1.field_u - 4;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var9_ref_miLifetime1 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 77, this.field_q.field_i);
                                                  stackIn_1544_0Lifetime1 = MidiPcmStream.field_L.first(-78);
                                                  var9_ref_mlLifetime1Lifetime1 = (BattleUnit) (stackIn_1544_0Lifetime1);
                                                  while (var9_ref_mlLifetime1Lifetime1 != null) {
                                                    if (var9_ref_mlLifetime1Lifetime1.field_z) {
                                                      var10Lifetime1 = var9_ref_mlLifetime1Lifetime1.field_lb - this.field_v;
                                                      var11Lifetime1 = -this.field_G + var9_ref_mlLifetime1Lifetime1.field_db;
                                                      if (var11Lifetime1 < 0 &&
                                                        Math.abs(var10Lifetime1) < 128) {
                                                        if (0 > var10Lifetime1) {
                                                          if (!(var9_ref_mlLifetime1Lifetime1.field_kb <= 0)) {
                                                            if (var9_ref_mlLifetime1Lifetime1.field_kb < 20) {
                                                              var9_ref_mlLifetime1Lifetime1.field_kb = -60;
                                                            } else {
                                                              var9_ref_mlLifetime1Lifetime1.field_kb = var9_ref_mlLifetime1Lifetime1.field_kb - 8;
                                                            }
                                                          }
                                                        } else {
                                                          if (0 > var9_ref_mlLifetime1Lifetime1.field_kb) {
                                                            if (var9_ref_mlLifetime1Lifetime1.field_kb > -20) {
                                                              var9_ref_mlLifetime1Lifetime1.field_kb = 60;
                                                            } else {
                                                              var9_ref_mlLifetime1Lifetime1.field_kb = var9_ref_mlLifetime1Lifetime1.field_kb + 8;
                                                            }
                                                          }
                                                        }
                                                        this.field_y = this.field_y + 1;
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
                                                            if (!this.field_t.isDead(-1) &&
                                                              128 + this.field_q.field_H > this.field_t.field_db) {
                                                              this.field_x = this.field_x + 1;
                                                              if (this.field_x >= 256) {
                                                                this.field_x = this.field_x - 256;
                                                              }
                                                              this.field_v = this.field_t.field_lb;
                                                              this.field_G = this.field_t.field_db;
                                                              this.field_z = this.field_G << 4;
                                                              this.field_o = this.field_v << 4;
                                                              if (var19 == 0) {
                                                                return;
                                                              }
                                                              break regionExit11;
                                                            }
                                                            if (this.field_q.getCurrentPlayer(false) == this.field_t.field_T) {
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
                                                                if (this.field_t == null) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.field_t.isDead(-1)) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.field_G = -240;
                                                                if (100 > this.field_y) {
                                                                  this.field_G = this.field_G - 2 * (100 - this.field_y);
                                                                }
                                                                if (400 < this.field_y) {
                                                                  this.field_G = this.field_G - (this.field_y * 2 - 800);
                                                                }
                                                                this.field_o = this.field_v << 4;
                                                                this.field_x = this.field_x + 1;
                                                                this.field_z = this.field_G << 4;
                                                                if (100 < this.field_x) {
                                                                  this.field_x = this.field_x - 100;
                                                                }
                                                                if (this.field_y != 100 &&
                                                                  200 != this.field_y &&
                                                                  this.field_y != 300 &&
                                                                  this.field_y != 400) {
                                                                  if (this.field_y == 101 ||
                                                                    this.field_y == 0 ||
                                                                    this.field_y == 201 ||
                                                                    this.field_y == 301 ||
                                                                    this.field_y == 401 ||
                                                                    this.field_C == null) {
                                                                    this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                    this.playSound(165, true);
                                                                  }
                                                                  this.field_y = this.field_y + 1;
                                                                  var9 = 15;
                                                                  if (this.field_y > 100) {
                                                                    var9 = 7;
                                                                  }
                                                                  if (200 < this.field_y) {
                                                                    var9 = 3;
                                                                  }
                                                                  if (this.field_y > 300) {
                                                                    var9 = 1;
                                                                  }
                                                                  if (this.field_y > 400 ||
                                                                    (this.field_y & var9) == 0) {
                                                                    var10Lifetime1 = -128 + (this.field_v + HuffmanCodec.randomBelow(this.field_C, -2147483648, 256));
                                                                    var11Lifetime1 = 48 + (this.field_G + HuffmanCodec.randomBelow(this.field_C, -2147483648, 16));
                                                                    var12Lifetime1 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                    var5 = this.spawnFromHere(var10Lifetime1, (BattleUnit) null, (byte) 81, 135, var11Lifetime1, this.field_q);
                                                                    if (this.field_q.field_sb != null &&
                                                                      null != this.field_q.field_sb[CacheEntry.field_n[7][1]]) {
                                                                      IconHighlightPainter.playSample((int)(Math.random() * 500.0) + 200, false, this.field_q.field_sb[CacheEntry.field_n[7][1]], SceneWidgetNode.field_r[CacheEntry.field_n[7][1]] / 8);
                                                                    }
                                                                    ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(113, var12Lifetime1) >> 11;
                                                                    ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var12Lifetime1, -101) >> 11) + 32;
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  }
                                                                } else {
                                                                  MidiPcmStream.field_L.setDeque((byte) 75, this.field_q.field_Kb);
                                                                  var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.first(-43));
                                                                  while (true) {
                                                                    if (null != var9_ref_miLifetime2) {
                                                                      stackOut_2016_0 = var9_ref_miLifetime2;
                                                                      stackIn_2042_0 = stackOut_2016_0;
                                                                      stackIn_2017_0 = stackOut_2016_0;
                                                                      stackIn_2042_1 = -139;
                                                                      if (((SpellProjectile) (Object) stackIn_2017_0).isAlive(stackIn_2042_1) &&
                                                                        var9_ref_miLifetime2.field_t != this.field_t &&
                                                                        30 != var9_ref_miLifetime2.field_I &&
                                                                        var9_ref_miLifetime2.field_I != 84) {
                                                                        var10Lifetime1 = var9_ref_miLifetime2.field_v - this.field_v;
                                                                        var11Lifetime1 = var9_ref_miLifetime2.field_G - this.field_G;
                                                                        if (var9_ref_miLifetime2.field_F * var11Lifetime1 + var10Lifetime1 * var9_ref_miLifetime2.field_u < 0) {
                                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                                          if (var12Lifetime1 < 65536 &&
                                                                            var12Lifetime1 > 0) {
                                                                            var9_ref_miLifetime2.field_u = var9_ref_miLifetime2.field_u - Math.abs(var10Lifetime1) * var10Lifetime1 * 32 / var12Lifetime1;
                                                                          }
                                                                        }
                                                                      }
                                                                      var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                                      continue;
                                                                    }
                                                                    break;
                                                                  }
                                                                  stackIn_2042_0Lifetime1 = this;
                                                                  stackIn_2042_1Lifetime1 = -128 + this.field_v + (int)(Math.random() * 256.0);
                                                                  var5 = this.spawnFromHere(stackIn_2042_1Lifetime1, (BattleUnit) null, (byte) 81, 132, this.field_G + 48 + (int)(Math.random() * 16.0), this.field_q);
                                                                  var9 = (int)(Math.random() * 256.0);
                                                                  ((SpellProjectile) (var5)).field_u = 0;
                                                                  var10_double = 3.141592653589793 * (double)var9 / 128.0;
                                                                  ((SpellProjectile) (var5)).field_F = 32 + (int)(Math.cos(var10_double) * 32.0);
                                                                  ((SpellProjectile) (var5)).field_x = 1;
                                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                }
                                                                if (this.field_y < 500) {
                                                                  return;
                                                                }
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (var9 == 136) {
                                                                this.field_y = this.field_y + 1;
                                                                if (this.field_y > 480) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                var9 = 31 * this.field_y % 480;
                                                                var5 = this.spawnFromHere(-320, (BattleUnit) null, (byte) 81, 152, this.field_q.field_H - var9, this.field_q);
                                                                ((SpellProjectile) (var5)).field_F = -var9;
                                                                ((SpellProjectile) (var5)).field_u = 128;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                var5 = this.spawnFromHere(320 + this.field_q.field_y, (BattleUnit) null, (byte) 81, 152, this.field_q.field_H - var9, this.field_q);
                                                                ((SpellProjectile) (var5)).field_u = -128;
                                                                ((SpellProjectile) (var5)).field_F = -var9;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                return;
                                                              }
                                                              if (var9 == 134) {
                                                                if (this.field_t != null &&
                                                                  0 >= this.field_t.field_ib) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.field_y != 100 &&
                                                                  this.field_y != 200) {
                                                                  this.field_y = this.field_y + 1;
                                                                }
                                                                var7 = -1;
                                                                if (this.field_y == 102 ||
                                                                  this.field_y == 202 ||
                                                                  null == this.field_C) {
                                                                  this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                }
                                                                var7Lifetime4 = 132;
                                                                if (100 <= this.field_y) {
                                                                  if (this.field_y % 2 == 1 &&
                                                                    this.field_y > 75) {
                                                                    var7Lifetime4 = 152;
                                                                    if (var19 != 0 && (this.field_y % 2 == 1 &&
                                                                      this.field_y > 75)) {
                                                                      var7Lifetime4 = 152;
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (this.field_y % 2 == 1 &&
                                                                    this.field_y > 75) {
                                                                    var7Lifetime4 = 152;
                                                                  }
                                                                }
                                                                if (this.field_y >= 300) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                var8 = 1;
                                                                if (132 == var7Lifetime4) {
                                                                  var8 = 2 + (-(this.field_y / 100) + 5);
                                                                }
                                                                var9 = 0;
                                                                while (var9 < var8) {
                                                                  if (var19 != 0) {
                                                                    return;
                                                                  }
                                                                  if (var7Lifetime4 != -1) {
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, var7Lifetime4, this.field_G, this.field_q);
                                                                  }
                                                                  if (null != var5) {
                                                                    var10Lifetime1 = (int)(Math.random() * 8192.0);
                                                                    if (var7Lifetime4 != 132) {
                                                                      var10Lifetime1 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                    }
                                                                    ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-17, var10Lifetime1) >> 9;
                                                                    ((SpellProjectile) (var5)).field_F = -256 + (BevelBoxPainter.cosine(var10Lifetime1, -101) >> 9);
                                                                    if (var7Lifetime4 == 152) {
                                                                      ((SpellProjectile) (var5)).field_u = ((SpellProjectile) (var5)).field_u >> 1;
                                                                      ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F >> 1;
                                                                      ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F - 96;
                                                                      ((SpellProjectile) (var5)).field_y = HuffmanCodec.randomBelow(this.field_C, -2147483648, 200);
                                                                      ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_v - 2 * ((SpellProjectile) (var5)).field_u;
                                                                      ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                                                                    } else {
                                                                      ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F >> 2;
                                                                      ((SpellProjectile) (var5)).field_u = ((SpellProjectile) (var5)).field_u >> 1;
                                                                      ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F - 16;
                                                                      var11Lifetime1 = this.field_y * 48 / 500 + 48;
                                                                      ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_v + (int)((double)var11Lifetime1 * Math.random() - (double)(var11Lifetime1 / 2));
                                                                      ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_v - 2 * ((SpellProjectile) (var5)).field_u;
                                                                      ((SpellProjectile) (var5)).field_G = ((SpellProjectile) (var5)).field_G + 16;
                                                                      ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                                                                      ((SpellProjectile) (var5)).field_x = 1;
                                                                      ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_G << 4;
                                                                      ((SpellProjectile) (var5)).field_y = (int)(4.0 * Math.random() - 10.0);
                                                                    }
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  }
                                                                  var9++;
                                                                }
                                                                return;
                                                              }
                                                              if (var9 == 36) {
                                                                if (this.field_t != null &&
                                                                  this.field_t.isDead(-1)) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.field_G = -240;
                                                                this.field_x = this.field_x + 1;
                                                                if (100 < this.field_x) {
                                                                  this.field_x = this.field_x - 100;
                                                                }
                                                                var5 = this.spawnFromHere(this.field_v + ((int)(-50.0 + Math.random() * 100.0) + (int)(96.0 * Math.sin(0.01 * (6.28 * (double)this.field_x)))), (BattleUnit) null, (byte) 81, 112, 48 + (this.field_G + (int)(Math.random() * 8.0)), this.field_q);
                                                                ((SpellProjectile) (var5)).field_u = (int)(-256.0 + Math.random() * 512.0);
                                                                ((SpellProjectile) (var5)).field_F = -(int)(Math.random() * 512.0) + 192;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                if (this.field_y == 100) {
                                                                  return;
                                                                }
                                                                if (200 == this.field_y) {
                                                                  return;
                                                                }
                                                                if (this.field_y == 201 ||
                                                                  this.field_y == 101 ||
                                                                  this.field_y == 0 ||
                                                                  null == this.field_C) {
                                                                  this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                }
                                                                this.field_y = this.field_y + 1;
                                                                if (this.field_y == 300) {
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (this.field_y % 15 != 10) {
                                                                  return;
                                                                }
                                                                var9 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 320) - 160;
                                                                this.playSound(100, true);
                                                                var5 = this.spawnFromHere(this.field_v + var9, (BattleUnit) null, (byte) 81, 84, 48 + this.field_G, this.field_q);
                                                                ((SpellProjectile) (var5)).field_u = 0;
                                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                ((SpellProjectile) (var5)).field_y = 45;
                                                                ((SpellProjectile) (var5)).field_F = 256;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                return;
                                                              }
                                                              if (var9 != 19) {
                                                                if (62 == var9 &&
                                                                  var19 == 0) {
                                                                  if (this.field_t != null &&
                                                                    !this.field_t.isDead(-1)) {
                                                                    this.field_x = this.field_x + 1;
                                                                    if (this.field_y != 100 &&
                                                                      this.field_y != 200 &&
                                                                      this.field_y != 300 &&
                                                                      this.field_y != 400) {
                                                                      this.field_y = this.field_y + 1;
                                                                    }
                                                                    if (256 <= this.field_x) {
                                                                      this.field_x = this.field_x - 256;
                                                                    }
                                                                    var7Lifetime1 = -1;
                                                                    if (this.field_y == 102 ||
                                                                      this.field_y == 202 ||
                                                                      this.field_y == 302 ||
                                                                      this.field_y == 402 ||
                                                                      null == this.field_C) {
                                                                      this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                    }
                                                                    if (this.field_y == 10) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 110) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 115) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 210) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 215) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 220) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (310 == this.field_y) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 315) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (this.field_y == 320) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (325 == this.field_y) {
                                                                      var7Lifetime1 = 63;
                                                                    }
                                                                    if (410 == this.field_y) {
                                                                      var7Lifetime1 = 64;
                                                                    }
                                                                    if (500 == this.field_y) {
                                                                      this.remove(0);
                                                                      return;
                                                                    }
                                                                    if (var7Lifetime1 != -1) {
                                                                      var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, var7Lifetime1, -480, this.field_q);
                                                                    }
                                                                    if (var5 == null) {
                                                                      return;
                                                                    }
                                                                    var9 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                    ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(127, var9) >> 11;
                                                                    ((SpellProjectile) (var5)).field_F = 0;
                                                                    if (var7Lifetime1 == 64) {
                                                                      ((SpellProjectile) (var5)).field_u = 0;
                                                                    }
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    return;
                                                                  }
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if (var9 == 77 &&
                                                                  var19 == 0) {
                                                                  this.field_y = this.field_y + 1;
                                                                  if (this.field_y < this.field_t.field_ib) {
                                                                    return;
                                                                  }
                                                                  var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 101, this.field_G, this.field_q);
                                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  this.field_t.field_db = 1000 + this.field_q.field_H;
                                                                  if (this.field_t.field_ib >= 50) {
                                                                    if (this.field_t.field_ib < 100) {
                                                                      this.playTypeSound(1, (byte) 37, 9);
                                                                    } else {
                                                                      this.playTypeSound(0, (byte) 37, 9);
                                                                    }
                                                                  } else {
                                                                    this.playTypeSound(2, (byte) 37, 9);
                                                                  }
                                                                  this.applyAreaEffect(this.field_t.field_ib, this.field_t.field_ib + this.field_t.field_Y, this.field_t.field_ib * 2 + this.field_t.field_Y, 8);
                                                                  this.field_t.field_db = this.field_q.field_H + 128;
                                                                  this.field_t.field_x = 1;
                                                                  this.field_t.field_ib = 0;
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                if ((139 != var9 ||
                                                                  var19 != 0) &&
                                                                  var9 != 78) {
                                                                  if (2 == var9 &&
                                                                    var19 == 0) {
                                                                    this.field_y = this.field_y + 1;
                                                                    if (25 > this.field_y) {
                                                                      return;
                                                                    }
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 101, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.playTypeSound(0, (byte) 37, 9);
                                                                    this.applyAreaEffect(15, 256, 96, 8);
                                                                    this.remove(0);
                                                                    return;
                                                                  }
                                                                  if (var9 == 74 &&
                                                                    var19 == 0) {
                                                                    var9 = 20;
                                                                    this.field_y = this.field_y + 1;
                                                                    if (this.field_t.field_jb == 27) {
                                                                      var9 = 50;
                                                                    }
                                                                    if (null == this.field_C) {
                                                                      this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                    }
                                                                    if (var9 >= this.field_y &&
                                                                      this.field_t.field_x <= 0) {
                                                                      if (Math.abs(this.field_y) % 5 != 0) {
                                                                        return;
                                                                      }
                                                                      var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 0, this.field_G, this.field_q);
                                                                      ((SpellProjectile) (var5)).field_u = (this.field_u >> 1) + (HuffmanCodec.randomBelow(this.field_C, -2147483648, 65) - 32);
                                                                      ((SpellProjectile) (var5)).field_F = -32 + (this.field_F >> 1) + HuffmanCodec.randomBelow(this.field_C, -2147483648, 65);
                                                                      ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                      return;
                                                                    }
                                                                    this.remove(0);
                                                                    return;
                                                                  }
                                                                  if (var9 != 141) {
                                                                    this.detonate(6016, param3, param2, param0);
                                                                    if (var19 == 0) {
                                                                      return;
                                                                    }
                                                                    break regionExit1;
                                                                  }
                                                                  if (this.field_C == null) {
                                                                    this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                                  }
                                                                  this.field_y = this.field_y + 1;
                                                                  if (this.field_y % 5 == 4) {
                                                                    this.playTypeSound(1, (byte) 37, 7);
                                                                  }
                                                                  var9 = 90;
                                                                  if (this.field_y <= var9 && (null == this.field_t ||
                                                                    !(0 < this.field_t.field_x))) {
                                                                    if (this.field_y % 3 != 0) {
                                                                      return;
                                                                    }
                                                                    var5 = this.spawnFromHere(-15 + (this.field_v + HuffmanCodec.randomBelow(this.field_C, -2147483648, 31)), this.field_t, (byte) 81, 135, this.field_G, this.field_q);
                                                                    ((SpellProjectile) (var5)).field_u = 0 + (HuffmanCodec.randomBelow(this.field_C, -2147483648, 3) - 1);
                                                                    ((SpellProjectile) (var5)).field_F = 64 - (-HuffmanCodec.randomBelow(this.field_C, -2147483648, 31) + 15);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    return;
                                                                  }
                                                                  this.remove(0);
                                                                  return;
                                                                }
                                                                this.field_y = this.field_y + 1;
                                                                if (this.field_t != null) {
                                                                  this.field_t.field_gb = this;
                                                                }
                                                                if (this.field_y == 13) {
                                                                  if (5 == this.field_t.field_jb) {
                                                                    this.playTypeSound(1, (byte) 37, 3);
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 94, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(30, 256, 64, 8);
                                                                  }
                                                                  if (this.field_t.field_jb == 2) {
                                                                    this.playTypeSound(1, (byte) 37, 1);
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 86, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(30, 256, 64, 8);
                                                                  }
                                                                  if (this.field_t.field_jb == 9) {
                                                                    this.playTypeSound(0, (byte) 37, 5);
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 108, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(75, 256, 64, 8);
                                                                  }
                                                                  if (this.field_t.field_jb == 39) {
                                                                    this.playTypeSound(0, (byte) 37, 0);
                                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 163, this.field_G, this.field_q);
                                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                    this.applyAreaEffect(50, 64, 96, 8);
                                                                  }
                                                                }
                                                                if (this.field_y < 25) {
                                                                  return;
                                                                }
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (this.field_t != null &&
                                                                this.field_t.isDead(-1)) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              if (this.field_y != 100 &&
                                                                this.field_y != 200 &&
                                                                this.field_y != 300 &&
                                                                this.field_y != 400) {
                                                                this.field_y = this.field_y + 1;
                                                              }
                                                              if (102 == this.field_y ||
                                                                this.field_y == 202 ||
                                                                this.field_y == 302 ||
                                                                this.field_y == 402 ||
                                                                this.field_C == null) {
                                                                this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                              }
                                                              var7Lifetime2 = -1;
                                                              var7Lifetime3 = 87;
                                                              if (0.5 > Math.random()) {
                                                                var7Lifetime3 = 88;
                                                              }
                                                              if (this.field_y == 10) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (15 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 20) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 25) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 30) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 110) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (115 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 120) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 125) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (130 == this.field_y) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 210) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (215 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (220 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 225) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 230) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 212) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 217) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 222) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 227) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 232) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (310 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 315) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 320) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 325) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 330) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 312) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 317) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (322 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 327) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 332) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 314) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 319) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 324) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 329) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 334) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (402 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (404 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 406) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 408) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (409 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 410) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 415) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (420 == this.field_y) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 425) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (this.field_y == 430) {
                                                                var7Lifetime3 = 10;
                                                              }
                                                              if (412 == this.field_y) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 417) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 422) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 427) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y == 432) {
                                                                var7Lifetime3 = 67;
                                                              }
                                                              if (this.field_y % 100 != 0 &&
                                                                this.field_y % 10 == 9) {
                                                                var9 = this.field_y * 64 / 500 + 64;
                                                                var10Lifetime1 = this.field_q.field_H;
                                                                if (this.field_y < 100) {
                                                                  var10Lifetime1 = var10Lifetime1 - (64 + 64 * this.field_y / 500) * this.field_y / 100;
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
                                                                this.field_q.carveTerrainAndSprite(var10Lifetime1, -38, -(2 * var9) + this.field_v, LoginStackHelpers.field_e);
                                                              }
                                                              if (this.field_y >= 500) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                              var8Lifetime1 = 1;
                                                              if (var7Lifetime3 == 87 ||
                                                                var7Lifetime3 == 88) {
                                                                var8Lifetime1 = 7 - this.field_y / 100;
                                                              }
                                                              var9 = 0;
                                                              while (var8Lifetime1 > var9) {
                                                                if (var19 != 0) {
                                                                  return;
                                                                }
                                                                if (var7Lifetime3 != -1) {
                                                                  var10Lifetime1 = 64 + this.field_y * 64 / 500;
                                                                  if (this.field_y < 100) {
                                                                    var10Lifetime1 = this.field_y * (64 * this.field_y / 500 + 64) / 100;
                                                                  }
                                                                  var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, var7Lifetime3, -var10Lifetime1 + this.field_G, this.field_q);
                                                                }
                                                                if (var5 != null) {
                                                                  var10Lifetime1 = (int)(8192.0 * Math.random());
                                                                  if (87 != var7Lifetime3 &&
                                                                    var7Lifetime3 != 88) {
                                                                    var10Lifetime1 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                  }
                                                                  if (var7Lifetime3 == 10) {
                                                                    this.playSound(76, true);
                                                                  }
                                                                  if (var7Lifetime3 == 67) {
                                                                    this.playSound(83, true);
                                                                  }
                                                                  ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(123, var10Lifetime1) >> 9;
                                                                  ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var10Lifetime1, -101) >> 9) - 256;
                                                                  if (var7Lifetime3 == 10) {
                                                                    ((SpellProjectile) (var5)).field_u = ((SpellProjectile) (var5)).field_u >> 1;
                                                                    ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F - 64;
                                                                  }
                                                                  ((SpellProjectile) (var5)).field_w = this.field_w;
                                                                  if (67 == var7Lifetime3 ||
                                                                    var7Lifetime3 == 13) {
                                                                    ((SpellProjectile) (var5)).field_u = ((SpellProjectile) (var5)).field_u >> 2;
                                                                    ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F - 128;
                                                                    ((SpellProjectile) (var5)).field_y = HuffmanCodec.randomBelow(this.field_C, -2147483648, 200);
                                                                  }
                                                                  if (var7Lifetime3 == 87 ||
                                                                    var7Lifetime3 == 88) {
                                                                    ((SpellProjectile) (var5)).field_F = ((SpellProjectile) (var5)).field_F >> 2;
                                                                    ((SpellProjectile) (var5)).field_u = ((SpellProjectile) (var5)).field_u >> 2;
                                                                    var11Lifetime1 = 48 + this.field_y * 48 / 500;
                                                                    ((SpellProjectile) (var5)).field_v = ((SpellProjectile) (var5)).field_v + (int)((double)(-(var11Lifetime1 / 2)) + (double)var11Lifetime1 * Math.random());
                                                                    ((SpellProjectile) (var5)).field_G = ((SpellProjectile) (var5)).field_G + 16;
                                                                    ((SpellProjectile) (var5)).field_o = ((SpellProjectile) (var5)).field_v << 4;
                                                                    ((SpellProjectile) (var5)).field_z = ((SpellProjectile) (var5)).field_G << 4;
                                                                    if (var7Lifetime3 == 87) {
                                                                      ((SpellProjectile) (var5)).field_x = 1;
                                                                    }
                                                                    ((SpellProjectile) (var5)).field_y = (int)(-10.0 + Math.random() * 4.0);
                                                                  }
                                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                }
                                                                var9++;
                                                              }
                                                              return;
                                                            }
                                                            if (this.field_t == null) {
                                                              this.remove(0);
                                                              return;
                                                            }
                                                            if (5 == this.field_t.field_jb) {
                                                              this.field_v = this.field_t.field_lb;
                                                              if (this.field_t.field_db >= (this.field_q.field_H + 128)) {
                                                                this.remove(0);
                                                                return;
                                                              }
                                                            }
                                                            if (this.field_t.isDead(-1)) {
                                                              this.remove(0);
                                                              return;
                                                            }
                                                            this.field_G = -240;
                                                            if (this.field_y < 100) {
                                                              this.field_G = this.field_G - 2 * (-this.field_y + 100);
                                                            }
                                                            if (this.field_y > 400) {
                                                              this.field_G = this.field_G - (this.field_y * 2 - 800);
                                                            }
                                                            this.field_o = this.field_v << 4;
                                                            this.field_z = this.field_G << 4;
                                                            this.field_x = this.field_x + 1;
                                                            if (this.field_x > 100) {
                                                              this.field_x = this.field_x - 100;
                                                            }
                                                            if (100 != this.field_y &&
                                                              this.field_y != 200 &&
                                                              this.field_y != 300 &&
                                                              400 != this.field_y) {
                                                              if (this.field_y == 101 ||
                                                                this.field_y == 0 ||
                                                                this.field_y == 201 ||
                                                                this.field_y == 301 ||
                                                                this.field_y == 401 ||
                                                                this.field_C == null) {
                                                                this.field_C = new IsaacRandom(new int[]{this.field_q.field_Q, param0, this.field_v, this.field_G});
                                                              }
                                                              this.field_y = this.field_y + 1;
                                                              if (this.field_t.field_jb != 5 ||
                                                                this.field_y > 100) {
                                                                if (71 != this.field_I) {
                                                                  var9 = this.field_v - (-HuffmanCodec.randomBelow(this.field_C, -2147483648, 256) + 128);
                                                                  var10Lifetime1 = this.field_G - (-HuffmanCodec.randomBelow(this.field_C, -2147483648, 16) - 48);
                                                                  var11Lifetime1 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                  var5 = this.spawnFromHere(var9, (BattleUnit) null, (byte) 81, 46, var10Lifetime1, this.field_q);
                                                                  ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(125, var11Lifetime1) >> 11;
                                                                  ((SpellProjectile) (var5)).field_F = (BevelBoxPainter.cosine(var11Lifetime1, -104) >> 11) + 32;
                                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                } else {
                                                                  var9 = this.field_v + HuffmanCodec.randomBelow(this.field_C, -2147483648, 192) - 96;
                                                                  var10Lifetime1 = this.field_G + (48 + HuffmanCodec.randomBelow(this.field_C, -2147483648, 16));
                                                                  var5 = this.spawnFromHere(var9, (BattleUnit) null, (byte) 81, 46, var10Lifetime1, this.field_q);
                                                                  var11Lifetime1 = HuffmanCodec.randomBelow(this.field_C, -2147483648, 8192);
                                                                  ((SpellProjectile) (var5)).field_u = GradientBarPainter.sine(-2, var11Lifetime1) >> 11;
                                                                  ((SpellProjectile) (var5)).field_F = 32 + (BevelBoxPainter.cosine(var11Lifetime1, -128) >> 11);
                                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                                  if (100 != this.field_y &&
                                                                    this.field_y != 200 &&
                                                                    this.field_y != 300 &&
                                                                    400 != this.field_y) {
                                                                    this.field_y = this.field_y + 1;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (this.field_I != 71) {
                                                                MidiPcmStream.field_L.setDeque((byte) 100, this.field_q.field_Kb);
                                                                var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.first(-123));
                                                                while (true) {
                                                                  if (var9_ref_miLifetime2 != null) {
                                                                    stackOut_1870_0 = var9_ref_miLifetime2;
                                                                    stackIn_1893_0 = stackOut_1870_0;
                                                                    stackIn_1871_0 = stackOut_1870_0;
                                                                    stackIn_1893_1 = -139;
                                                                    if (var19 == 0) {
                                                                      if (((SpellProjectile) (Object) stackIn_1871_0).isAlive(stackIn_1893_1) &&
                                                                        var9_ref_miLifetime2.field_t != this.field_t &&
                                                                        30 != var9_ref_miLifetime2.field_I &&
                                                                        var9_ref_miLifetime2.field_I != 84) {
                                                                        var10Lifetime1 = var9_ref_miLifetime2.field_v - this.field_v;
                                                                        var11Lifetime1 = -this.field_G + var9_ref_miLifetime2.field_G;
                                                                        if (var9_ref_miLifetime2.field_F * var11Lifetime1 + var9_ref_miLifetime2.field_u * var10Lifetime1 < 0) {
                                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                                          if (var12Lifetime1 < 65536 &&
                                                                            0 < var12Lifetime1) {
                                                                            var9_ref_miLifetime2.field_u = var9_ref_miLifetime2.field_u + Math.abs(var10Lifetime1) * (32 * var10Lifetime1) / var12Lifetime1;
                                                                          }
                                                                        }
                                                                      }
                                                                      var9_ref_miLifetime2 = (SpellProjectile) (MidiPcmStream.field_L.next(-18502));
                                                                      continue;
                                                                    }
                                                                  } else {
                                                                    stackIn_1893_0 = this;
                                                                    stackIn_1893_1 = this.field_v + (int)(256.0 * Math.random()) - 128;
                                                                  }
                                                                  break;
                                                                }
                                                                var5 = this.spawnFromHere(stackIn_1893_1, (BattleUnit) null, (byte) 81, 95, this.field_G - (-48 - (int)(16.0 * Math.random())), this.field_q);
                                                                var9 = (int)(256.0 * Math.random());
                                                                var10_doubleLifetime1 = (double)var9 * 3.141592653589793 / 128.0;
                                                                ((SpellProjectile) (var5)).field_u = (int)(Math.sin(var10_doubleLifetime1) * 32.0);
                                                                ((SpellProjectile) (var5)).field_F = 32 + (int)(32.0 * Math.cos(var10_doubleLifetime1));
                                                                ((SpellProjectile) (var5)).field_x = 1;
                                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                              }
                                                            }
                                                            if (71 == this.field_I) {
                                                              if (this.field_y < 300) {
                                                                return;
                                                              }
                                                              this.field_y = this.field_y - 200;
                                                              return;
                                                            }
                                                            if (this.field_y < 500) {
                                                              return;
                                                            }
                                                            this.remove(0);
                                                            return;
                                                          }
                                                        }
                                                        if (!this.field_t.isDead(-1) &&
                                                          128 + this.field_q.field_H > this.field_t.field_db) {
                                                          this.field_t.field_gb = this;
                                                          if (this.field_t.field_x > 0) {
                                                            if (this == this.field_t.field_gb) {
                                                              this.field_t.field_gb = null;
                                                            }
                                                            this.remove(0);
                                                            return;
                                                          }
                                                          this.field_v = this.field_t.field_lb;
                                                          this.field_G = this.field_t.field_db;
                                                          if (this.field_t.field_z) {
                                                            if (this.field_t.field_kb < -4) {
                                                              this.field_t.field_kb = 1 + this.field_t.field_kb / 2;
                                                            }
                                                            if (this.field_t.field_eb < -16) {
                                                              this.field_t.field_eb = this.field_t.field_eb / 2 + 1;
                                                            }
                                                            if (4 < this.field_t.field_kb) {
                                                              this.field_t.field_kb = this.field_t.field_kb / 2 - 1;
                                                            }
                                                          }
                                                          this.field_o = this.field_v << 4;
                                                          this.field_z = this.field_G << 4;
                                                          if (var19 == 0) {
                                                            return;
                                                          }
                                                        } else {
                                                          if (~this.field_q.getCurrentPlayer(false) == ~this.field_t.field_T) {
                                                          }
                                                          this.remove(0);
                                                          return;
                                                        }
                                                      }
                                                      if (!this.field_t.isDead(-1) &&
                                                        (128 + this.field_q.field_H) > this.field_t.field_db) {
                                                        if (this.field_t.field_x > 0) {
                                                          this.field_y = this.field_y + this.field_t.field_x;
                                                          if (this.field_y > 50) {
                                                            this.field_t.field_x = -50 + this.field_y;
                                                            if (var19 != 0) {
                                                              this.field_t.field_x = 0;
                                                            }
                                                          } else {
                                                            this.field_t.field_x = 0;
                                                          }
                                                        }
                                                        if (this.field_y >= 50) {
                                                          this.remove(0);
                                                          return;
                                                        }
                                                        this.field_x = this.field_x + (this.field_y + 8);
                                                        if (256 <= this.field_x) {
                                                          this.field_x = this.field_x - 256;
                                                        }
                                                        this.field_G = this.field_t.field_db;
                                                        this.field_v = this.field_t.field_lb;
                                                        this.field_z = this.field_G << 4;
                                                        this.field_o = this.field_v << 4;
                                                        if (var19 == 0) {
                                                          return;
                                                        }
                                                      } else {
                                                        if (this.field_q.getCurrentPlayer(false) == this.field_t.field_T) {
                                                        }
                                                        this.remove(0);
                                                        return;
                                                      }
                                                    }
                                                    if (!this.field_t.isDead(-1) &&
                                                      this.field_t.field_db < (128 + this.field_q.field_H)) {
                                                      this.field_x = this.field_x + 16;
                                                      if (this.field_t.field_x > 0) {
                                                        this.field_t.field_x = 0;
                                                      }
                                                      if (this.field_x >= 256) {
                                                        this.field_x = this.field_x - 256;
                                                      }
                                                      this.field_G = this.field_t.field_db;
                                                      this.field_v = this.field_t.field_lb;
                                                      this.field_o = this.field_v << 4;
                                                      this.field_z = this.field_G << 4;
                                                      if (var19 == 0) {
                                                        return;
                                                      }
                                                    } else {
                                                      if (this.field_q.getCurrentPlayer(false) != this.field_t.field_T) {
                                                      }
                                                      this.remove(0);
                                                      return;
                                                    }
                                                  }
                                                  if (!this.field_t.isDead(-1) &&
                                                    128 + this.field_q.field_H > this.field_t.field_db) {
                                                    this.field_x = this.field_x + 1;
                                                    if (16 <= this.field_x) {
                                                      this.field_x = this.field_x - 16;
                                                    }
                                                    this.field_v = this.field_t.field_lb;
                                                    this.field_G = this.field_t.field_db;
                                                    this.field_z = this.field_G << 4;
                                                    this.field_o = this.field_v << 4;
                                                    if (this.field_y >= 250) {
                                                      return;
                                                    }
                                                    if (0 < this.field_y) {
                                                      this.field_y = this.field_y + 1;
                                                    }
                                                    MidiPcmStream.field_L.setDeque((byte) 107, this.field_q.field_Kb);
                                                    var9_ref_miLifetime2Lifetime1 = (SpellProjectile) (MidiPcmStream.field_L.first(-32));
                                                    while (var9_ref_miLifetime2Lifetime1 != null) {
                                                      if (var9_ref_miLifetime2Lifetime1.isAlive(-139) &&
                                                        var9_ref_miLifetime2Lifetime1.field_I != 30 &&
                                                        var9_ref_miLifetime2Lifetime1.field_I != 93 &&
                                                        var9_ref_miLifetime2Lifetime1.field_I != 84 &&
                                                        118 != var9_ref_miLifetime2Lifetime1.field_I &&
                                                        var9_ref_miLifetime2Lifetime1.field_I != 119) {
                                                        var10Lifetime1 = -this.field_v + var9_ref_miLifetime2Lifetime1.field_v;
                                                        var11Lifetime1 = var9_ref_miLifetime2Lifetime1.field_G - this.field_G;
                                                        if (-this.field_t.field_Y > var11Lifetime1 &&
                                                          Math.abs(var10Lifetime1) < Math.abs(var11Lifetime1) &&
                                                          var9_ref_miLifetime2Lifetime1.field_F * var11Lifetime1 + var9_ref_miLifetime2Lifetime1.field_u * var10Lifetime1 < 0) {
                                                          var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                          if (var12Lifetime1 < 65536) {
                                                            this.field_y = this.field_y + 1;
                                                            if (var12Lifetime1 > 0) {
                                                              var9_ref_miLifetime2Lifetime1.field_u = var9_ref_miLifetime2Lifetime1.field_u + var10Lifetime1 * (32 * Math.abs(var10Lifetime1)) / var12Lifetime1;
                                                              var9_ref_miLifetime2Lifetime1.field_F = var9_ref_miLifetime2Lifetime1.field_F + Math.abs(var11Lifetime1) * (var11Lifetime1 * 32) / var12Lifetime1;
                                                              if (0 < var10Lifetime1) {
                                                                var9_ref_miLifetime2Lifetime1.field_u = var9_ref_miLifetime2Lifetime1.field_u + 5;
                                                                if (var19 != 0) {
                                                                  var9_ref_miLifetime2Lifetime1.field_u = var9_ref_miLifetime2Lifetime1.field_u - 5;
                                                                }
                                                              } else {
                                                                var9_ref_miLifetime2Lifetime1.field_u = var9_ref_miLifetime2Lifetime1.field_u - 5;
                                                              }
                                                            }
                                                            if (var9_ref_miLifetime2Lifetime1.field_I == 46) {
                                                              var9_ref_miLifetime2Lifetime1.field_I = 95;
                                                              var9_ref_miLifetime2Lifetime1.field_y = 0;
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
                                                  if (~this.field_q.getCurrentPlayer(false) != ~this.field_t.field_T) {
                                                  }
                                                  this.remove(0);
                                                  return;
                                                }
                                                if (this.field_t.isDead(-1)) {
                                                  this.remove(0);
                                                  return;
                                                }
                                                this.field_x = this.field_x + 1;
                                                if (this.field_y == -1) {
                                                  this.field_y = 0;
                                                }
                                                if (this.field_x >= 16) {
                                                  this.field_x = this.field_x - 16;
                                                }
                                                while (this.field_G < this.field_q.field_H &&
                                                  !this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, -this.field_r + this.field_v, this.field_p)) {
                                                  this.field_z = this.field_z + 16;
                                                  this.field_G = this.field_z >> 4;
                                                  if (0 != this.field_y) {
                                                    continue;
                                                  }
                                                  this.field_y = -1;
                                                  if (var19 != 0) {
                                                    return;
                                                  }
                                                }
                                                if (this.field_q.field_H > this.field_G) {
                                                  if (this.field_y >= 250) {
                                                    return;
                                                  }
                                                  if (this.field_y > 0) {
                                                    this.field_y = this.field_y + 1;
                                                  }
                                                  if (this.field_q.spriteOverlapsTerrain(-this.field_r + this.field_G, 2, -this.field_r + this.field_v, this.field_p) &&
                                                    BitHelpers.field_b) {
                                                    var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 85, this.field_G, this.field_q);
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                    this.playTypeSound(1, (byte) 37, 0);
                                                    this.applyAreaEffect(50, 64, 32, 8);
                                                    this.field_y = 250;
                                                  }
                                                  MidiPcmStream.field_L.setDeque((byte) 31, this.field_q.field_Kb);
                                                  var9_ref_miLifetime3 = (SpellProjectile) (MidiPcmStream.field_L.first(-78));
                                                  while (var9_ref_miLifetime3 != null) {
                                                    if (var19 != 0) {
                                                      return;
                                                    }
                                                    if (var9_ref_miLifetime3.isAlive(-139) &&
                                                      30 != var9_ref_miLifetime3.field_I &&
                                                      var9_ref_miLifetime3.field_I != 93 &&
                                                      var9_ref_miLifetime3.field_I != 84 &&
                                                      118 != var9_ref_miLifetime3.field_I &&
                                                      var9_ref_miLifetime3.field_I != 119) {
                                                      var10Lifetime1 = -this.field_v + var9_ref_miLifetime3.field_v;
                                                      var11Lifetime1 = var9_ref_miLifetime3.field_G - this.field_G;
                                                      if (var11Lifetime1 < 0 &&
                                                        Math.abs(var10Lifetime1) < Math.abs(var11Lifetime1) &&
                                                        var9_ref_miLifetime3.field_F * var11Lifetime1 + var9_ref_miLifetime3.field_u * var10Lifetime1 < 0) {
                                                        var12Lifetime1 = var11Lifetime1 * var11Lifetime1 + var10Lifetime1 * var10Lifetime1;
                                                        if (var12Lifetime1 < 65536) {
                                                          this.field_y = this.field_y + 1;
                                                          if (0 < var12Lifetime1) {
                                                            var9_ref_miLifetime3.field_u = var9_ref_miLifetime3.field_u + 32 * var10Lifetime1 * Math.abs(var10Lifetime1) / var12Lifetime1;
                                                            var9_ref_miLifetime3.field_F = var9_ref_miLifetime3.field_F + Math.abs(var11Lifetime1) * 32 * var11Lifetime1 / var12Lifetime1;
                                                            if (var10Lifetime1 <= 0) {
                                                              var9_ref_miLifetime3.field_u = var9_ref_miLifetime3.field_u - 5;
                                                            } else {
                                                              var9_ref_miLifetime3.field_u = var9_ref_miLifetime3.field_u + 5;
                                                            }
                                                          }
                                                          if (var9_ref_miLifetime3.field_I == 46) {
                                                            var9_ref_miLifetime3.field_I = 95;
                                                            var9_ref_miLifetime3.field_H = 0;
                                                            var9_ref_miLifetime3.field_y = 0;
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
                                            if (null == this.field_t) {
                                              this.remove(0);
                                              return;
                                            }
                                            regionExit12: {
                                              this.field_t.field_gb = this;
                                              this.field_y = this.field_y + 1;
                                              if (0 == this.field_y % 2) {
                                                if (this.field_y % 16 == 0) {
                                                  this.playTypeSound(2, (byte) 37, 1);
                                                }
                                                var9 = param3 - this.field_t.field_lb;
                                                var10Lifetime1 = (this.field_t.field_Y >> 1) + (-this.field_t.field_db + param2);
                                                var11Lifetime1 = ConnectionState.greatestCommonDivisor(var10Lifetime1, var9, false);
                                                if (0 < var11Lifetime1 &&
                                                  this.field_t.field_x <= 0) {
                                                  if (this.field_I != 79) {
                                                    this.field_u = var9 * 96 / var11Lifetime1;
                                                    this.field_F = 96 * var10Lifetime1 / var11Lifetime1;
                                                    if (var19 != 0) {
                                                      this.field_F = 48 * var10Lifetime1 / var11Lifetime1;
                                                      this.field_u = var9 * 48 / var11Lifetime1;
                                                    }
                                                  } else {
                                                    this.field_F = 48 * var10Lifetime1 / var11Lifetime1;
                                                    this.field_u = var9 * 48 / var11Lifetime1;
                                                  }
                                                  if (this.field_u > 0) {
                                                    this.field_t.field_E = 1;
                                                    if (var19 != 0) {
                                                      this.field_t.field_E = -1;
                                                    }
                                                  } else {
                                                    this.field_t.field_E = -1;
                                                  }
                                                  this.field_q.eraseUnitMask(this.field_t, 0);
                                                  this.field_t.field_R = this.field_t.field_db << 4;
                                                  this.field_t.field_X = this.field_t.field_lb << 4;
                                                  this.field_z = this.field_F + this.field_t.field_R;
                                                  this.field_o = this.field_t.field_X + this.field_u;
                                                  this.field_G = this.field_z >> 4;
                                                  this.field_v = this.field_o >> 4;
                                                  this.field_t.field_db = this.field_G;
                                                  this.field_t.field_lb = this.field_v;
                                                  this.field_t.field_R = this.field_t.field_db << 4;
                                                  this.field_o = this.field_o + this.field_u;
                                                  this.field_t.field_X = this.field_t.field_lb << 4;
                                                  this.field_z = this.field_z + (this.field_F - (this.field_t.field_Y << 3));
                                                  if (this.field_I == 98) {
                                                    this.field_q.field_t = -(this.field_t.field_Y >> 1) + (this.field_t.field_db + var10Lifetime1);
                                                    this.field_q.field_mb = this.field_t.field_lb + var9;
                                                  }
                                                  this.field_G = this.field_z >> 4;
                                                  this.field_v = this.field_o >> 4;
                                                  var5 = this.spawnFromHere(this.field_v + (int)(-8.0 + 16.0 * Math.random()), (BattleUnit) null, (byte) 81, 90, this.field_G + (int)(Math.random() * 16.0 - 8.0), this.field_q);
                                                  this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  if (this.field_I == 79) {
                                                    this.field_G = this.field_G - 2;
                                                    this.applyAreaEffect(1, 32, 28, 8);
                                                    this.field_G = this.field_G + 2;
                                                    if (var19 == 0) {
                                                      break regionExit12;
                                                    }
                                                  }
                                                  if ((this.field_I == 98)) {
                                                    this.applyAreaEffect(10, 5, 36, 8);
                                                  }
                                                  break regionExit12;
                                                }
                                                this.remove(0);
                                                return;
                                              }
                                            }
                                            if (this.field_y <= 150) {
                                              if (this.field_y <= 50) {
                                                return;
                                              }
                                              if (this.field_I != 98) {
                                                return;
                                              }
                                            }
                                            if (this.field_I == 98) {
                                              this.field_t.field_eb = -64;
                                              this.field_t.field_kb = 16 * this.field_t.field_E;
                                            }
                                            this.remove(0);
                                            return;
                                          }
                                          var9 = 1;
                                          if (this.field_I == 30) {
                                            var9 = 2;
                                          }
                                          var10Lifetime1 = 0;
                                          while (var10Lifetime1 < var9) {
                                            if (var19 != 0) {
                                              return;
                                            }
                                            if (this.field_I == 93 &&
                                              this.field_y < 20) {
                                              this.field_y = this.field_y + 1;
                                              return;
                                            }
                                            if (this.field_y == 0) {
                                              this.applyAreaEffect(0, 0, 16, 8);
                                            }
                                            boolean decompiledFrameRemainder0 = true;
                                            if (20 == this.field_y ||
                                              this.field_y == 0 &&
                                              this.field_I == 30) {
                                              if (this.field_t != null) {
                                                this.field_q.eraseUnitMask(this.field_t, 0);
                                              }
                                              if (this.field_I == 30) {
                                                this.field_y = 1;
                                              } else {
                                                this.field_y = 21;
                                              }
                                              var11Lifetime1 = this.field_o;
                                              var12Lifetime1 = this.field_z;
                                              var13Lifetime1 = 0;
                                              while (var13Lifetime1 == 0) {
                                                if (this.field_q.isSolidAt(this.field_G, this.field_v + 2, (byte) -83) ||
                                                  this.field_q.isSolidAt(this.field_G, -2 + this.field_v, (byte) -83) ||
                                                  this.field_q.isSolidAt(this.field_G - 2, this.field_v, (byte) -83) ||
                                                  this.field_q.isSolidAt(2 + this.field_G, this.field_v, (byte) -83)) {
                                                  if (this.field_I == 30) {
                                                    this.playTypeSound(2, (byte) 37, 2);
                                                    this.applyAreaEffect(5, 64, 8, 8);
                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 100, this.field_G, this.field_q);
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                  var13Lifetime1 = 1;
                                                  if (93 == this.field_I) {
                                                    this.playTypeSound(0, (byte) 37, 2);
                                                    this.applyAreaEffect(75, 256, 32, 8);
                                                    var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 99, this.field_G, this.field_q);
                                                    this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                                  }
                                                }
                                                this.field_o = this.field_o + (this.field_u >> 1);
                                                this.field_z = this.field_z + (this.field_F >> 1);
                                                this.field_v = this.field_o >> 4;
                                                this.field_G = this.field_z >> 4;
                                                if (this.field_v < -640) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.field_v > this.field_q.field_y + 640) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.field_G > this.field_q.field_H) {
                                                  var13Lifetime1 = 1;
                                                }
                                                if (this.field_G >= -480) {
                                                  continue;
                                                }
                                                var13Lifetime1 = 1;
                                              }
                                              if (this.field_I == 30 &&
                                                null == this.field_t) {
                                                var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 31, this.field_G, this.field_q);
                                                ((SpellProjectile) (var5)).field_y = 950;
                                                ((SpellProjectile) (var5)).field_u = 0;
                                                ((SpellProjectile) (var5)).field_w = this.field_w;
                                                ((SpellProjectile) (var5)).field_F = 0;
                                                this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                              }
                                              if (null != this.field_t) {
                                                this.field_q.stampUnitMask(-87, this.field_t);
                                              }
                                              this.field_F = this.field_z - var12Lifetime1;
                                              this.field_u = this.field_o - var11Lifetime1;
                                              decompiledFrameRemainder0 = false;
                                            }
                                            else {
                                              this.field_y = this.field_y + 1;
                                              if ((this.field_y <= 30) &&
                                                (decompiledFrameRemainder0 = !(this.field_y <= 10))) {
                                                decompiledFrameRemainder0 = (this.field_I == 30);
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
                                        if (this.field_I == 61) {
                                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 109, this.field_G, this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                          if (this.field_t != null &&
                                            this.field_y < 25) {
                                            this.field_q.eraseUnitMask(this.field_t, 0);
                                          }
                                        }
                                        if (63 == this.field_I) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.field_v + (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 24.0), (BattleUnit) null, (byte) 81, 109, this.field_G + (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 32.0), this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                        }
                                        if (this.field_I == 64) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.field_v + (int)(48.0 * Math.sin((double)this.field_x * 3.14 / 128.0)), (BattleUnit) null, (byte) 81, 109, this.field_G + (int)(Math.cos((double)this.field_x * 3.14 / 128.0) * 64.0), this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                        }
                                        if (this.field_I == 66) {
                                          this.field_x = this.field_x + 12;
                                          var5 = this.spawnFromHere(this.field_v + (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 24.0), (BattleUnit) null, (byte) 81, 109, this.field_G + (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 64.0), this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                          var5 = this.spawnFromHere(this.field_v - (int)(Math.sin((double)this.field_x * 3.14 / 128.0) * 64.0), (BattleUnit) null, (byte) 81, 109, this.field_G - (int)(Math.cos(3.14 * (double)this.field_x / 128.0) * 24.0), this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                                          if (null != this.field_t &&
                                            this.field_y < 25) {
                                            this.field_q.eraseUnitMask(this.field_t, 0);
                                          }
                                        }
                                        this.field_o = this.field_o + this.field_u;
                                        this.field_z = this.field_z + this.field_F;
                                        this.field_G = this.field_z >> 4;
                                        this.field_v = this.field_o >> 4;
                                        this.field_F = this.field_F + 2;
                                        if (!this.field_q.spriteOverlapsTerrain(this.field_G - this.field_r, 2, -this.field_r + this.field_v, this.field_p)) {
                                          if (this.field_v < -640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.field_v > this.field_q.field_y + 640) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (this.field_G > this.field_q.field_H) {
                                            this.remove(0);
                                            return;
                                          }
                                          if (61 != this.field_I &&
                                            this.field_I != 66) {
                                            return;
                                          }
                                          if (this.field_t == null) {
                                            return;
                                          }
                                          if (this.field_y >= 25) {
                                            return;
                                          }
                                          this.field_q.stampUnitMask(-63, this.field_t);
                                          return;
                                        }
                                        var9 = -1;
                                        if (61 == this.field_I) {
                                          this.applyAreaEffect(45, 64, 80, 8);
                                          var9 = 108;
                                          this.playTypeSound(2, (byte) 37, 5);
                                        }
                                        if (63 == this.field_I) {
                                          var9 = 108;
                                          this.applyAreaEffect(25, 192, 80, 8);
                                          this.playTypeSound(1, (byte) 37, 5);
                                        }
                                        if (this.field_I == 64) {
                                          this.applyAreaEffect(50, 192, 192, 8);
                                          var9 = 108;
                                          this.playTypeSound(0, (byte) 37, 5);
                                        }
                                        if (this.field_I == 66) {
                                          this.applyAreaEffect(25, 32, 64, 8);
                                          var9 = 108;
                                          this.playTypeSound(2, (byte) 37, 5);
                                        }
                                        if (var9 != -1) {
                                          var5 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, var9, this.field_G, this.field_q);
                                          this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
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
                          this.field_F = this.field_F + 4;
                        }
                        this.field_o = this.field_o + this.field_u;
                        this.field_z = this.field_z + this.field_F;
                        this.field_v = this.field_o >> 4;
                        this.field_G = this.field_z >> 4;
                        this.field_y = this.field_y + 1;
                        if (4 < this.field_y) {
                          this.field_y = this.field_y - 4;
                          this.field_H = this.field_H + 1;
                        }
                        if (this.field_H < 8) {
                          return;
                        }
                        this.remove(0);
                        return;
                      }
                      this.field_y = this.field_y + 1;
                      if (this.field_y <= 32) {
                        return;
                      }
                      this.remove(0);
                      return;
                    }
                  }
                  this.field_x = this.field_x + 1;
                  if (this.field_y == 0) {
                    fieldTemp$0 = this.field_u;
                    this.field_u = this.field_u + 1;
                    if (20 < fieldTemp$0) {
                      this.field_y = 1;
                    }
                  }
                  if (1 == this.field_y) {
                    fieldTemp$1 = this.field_u;
                    this.field_u = this.field_u - 1;
                    if (fieldTemp$1 < -20) {
                      this.field_y = 0;
                    }
                  }
                  if (this.field_t != null) {
                    var9 = 0;
                    while (true) {
                      if (var9 < 10) {
                        stackIn_748_0 = this.field_t.field_X;
                        stackIn_748_1 = this.field_o;
                        if (var19 == 0) {
                          if (stackIn_748_0 < stackIn_748_1) {
                            this.field_o = this.field_o - 1;
                          }
                          if (this.field_t.field_X > this.field_o) {
                            this.field_o = this.field_o + 1;
                          }
                          if (this.field_z > this.field_t.field_R - 500) {
                            this.field_z = this.field_z - 1;
                          }
                          if (this.field_z < (-500 + this.field_t.field_R)) {
                            this.field_z = this.field_z + 1;
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
                      this.field_F = this.field_F - 1;
                    }
                    if (this.field_x > 2500) {
                      this.field_F = this.field_F - 1;
                      if (var19 != 0) {
                        this.field_F = this.field_F - 1;
                      }
                    }
                  } else {
                    this.field_F = this.field_F - 1;
                  }
                  this.field_o = this.field_o + this.field_u;
                  this.field_z = this.field_z + this.field_F;
                  this.field_G = this.field_z >> 4;
                  this.field_v = this.field_o >> 4;
                  if (this.field_x <= 3000) {
                    return;
                  }
                  this.remove(0);
                  return;
                }
                if (null != this.field_t &&
                  0 == this.field_y &&
                  this.field_I == 157) {
                  this.field_z = -(this.field_t.field_Y << 3) + this.field_t.field_R;
                  this.field_o = this.field_t.field_X;
                  this.field_y = 1;
                  this.field_v = this.field_o >> 4;
                  this.field_G = this.field_z >> 4;
                }
                var9 = 2048;
                if ((null == this.field_t ||
                  !this.field_t.isDead(-1)) && this.field_y != -1) {
                  boolean decompiledFrameCompleted0 = true;
                  if (null != this.field_t &&
                    this.field_I == 157) {
                    var10Lifetime1Lifetime1 = this.field_o;
                    var11Lifetime1Lifetime1 = this.field_z;
                    this.field_o = this.field_t.field_X;
                    this.field_v = this.field_o >> 4;
                    this.field_z = this.field_t.field_R - (this.field_t.field_Y << 3);
                    this.field_G = this.field_z >> 4;
                    if (~var10Lifetime1Lifetime1 != ~this.field_o ||
                      ~this.field_z != ~var11Lifetime1Lifetime1) {
                      MidiPcmStream.field_L.setDeque((byte) 38, this.field_q.field_r);
                      var12_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.first(-62));
                      while (var12_ref_mi != null) {
                        var13Lifetime1Lifetime1 = var12_ref_mi.field_o - var10Lifetime1Lifetime1;
                        var14Lifetime1Lifetime1 = var12_ref_mi.field_z - var11Lifetime1Lifetime1;
                        stackIn_594_0 = (var14Lifetime1Lifetime1 >> 4) * var14Lifetime1Lifetime1 + var13Lifetime1Lifetime1 * (var13Lifetime1Lifetime1 >> 4);
                        stackIn_594_1 = var9 * (var9 >> 4);
                        if (var19 != 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (stackIn_594_0 < stackIn_594_1) {
                          var12_ref_mi.field_z = this.field_z + var14Lifetime1Lifetime1;
                          var12_ref_mi.field_o = this.field_o + var13Lifetime1Lifetime1;
                          var12_ref_mi.field_v = var12_ref_mi.field_o >> 4;
                          var12_ref_mi.field_G = var12_ref_mi.field_z >> 4;
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
                  MidiPcmStream.field_L.setDeque((byte) 75, this.field_q.field_Kb);
                  var10_ref_mi = (SpellProjectile) (MidiPcmStream.field_L.first(-52));
                  while (null != var10_ref_mi) {
                    if (var10_ref_mi.shouldCameraFollow(-8209)) {
                      var11Lifetime1Lifetime1 = this.field_o - var10_ref_mi.field_o;
                      var12Lifetime1Lifetime1 = this.field_z - var10_ref_mi.field_z;
                      if (var9 * (var9 >> 4) > (var12Lifetime1Lifetime1 >> 4) * var12Lifetime1Lifetime1 + (var11Lifetime1Lifetime1 >> 4) * var11Lifetime1Lifetime1) {
                        this.field_q.field_h.addLast(var10_ref_mi, 15893);
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
                var10_ref_oc = new IntrusiveDequeCursor(this.field_q.field_r);
                var11_ref_miLifetime1 = (SpellProjectile) (var10_ref_oc.first(-123));
                while (var11_ref_miLifetime1 != null) {
                  var12Lifetime1Lifetime2 = -var11_ref_miLifetime1.field_o + this.field_o;
                  var13Lifetime1Lifetime2 = -var11_ref_miLifetime1.field_z + this.field_z;
                  if (var19 != 0) {
                    return;
                  }
                  if (((var9 >> 4) * var9) > (var13Lifetime1Lifetime2 * (var13Lifetime1Lifetime2 >> 4) + (var12Lifetime1Lifetime2 >> 4) * var12Lifetime1Lifetime2)) {
                    this.field_q.field_kb.addLast(var11_ref_miLifetime1, -1);
                  }
                  var11_ref_miLifetime1 = (SpellProjectile) (var10_ref_oc.next(-18502));
                }
                this.remove(0);
                return;
              }
              if (this.field_t != null &&
                !this.field_t.isDead(-1) && (this.field_I != 111 ||
                this.field_t.field_jb == 23 ||
                this.field_t.field_jb == 16)) {
                this.field_x = this.field_x + 1;
                if (this.field_t.field_s != null ||
                  111 == this.field_I) {
                  this.field_v = this.field_t.field_lb;
                  this.field_G = this.field_t.field_db - (this.field_t.field_Y >> 1);
                }
                if (this.field_x >= 32) {
                  this.field_x = this.field_x - 32;
                }
                var9 = 128;
                if (null != this.field_t &&
                  this.field_t.field_jb == 6) {
                  var9 = 64;
                }
                if (this.field_y >= 1) {
                  return;
                }
                MidiPcmStream.field_L.setDeque((byte) 27, this.field_q.field_i);
                var10_ref_mlLifetime1 = (BattleUnit) (MidiPcmStream.field_L.first(-99));
                while (null != var10_ref_mlLifetime1) {
                  if (var19 != 0) {
                    return;
                  }
                  if (this.field_t != var10_ref_mlLifetime1 ||
                    var10_ref_mlLifetime1.field_jb != 6 &&
                    (16 != var10_ref_mlLifetime1.field_jb &&
                    23 != var10_ref_mlLifetime1.field_jb ||
                    this.field_I == 55)) {
                    var11Lifetime2 = this.field_v - var10_ref_mlLifetime1.field_lb;
                    var12Lifetime2 = this.field_G + (-var10_ref_mlLifetime1.field_db + var10_ref_mlLifetime1.field_Y / 2);
                    if ((var10_ref_mlLifetime1.field_Y / 2 + var9) * (var9 + var10_ref_mlLifetime1.field_Y / 2) > var12Lifetime2 * var12Lifetime2 + var11Lifetime2 * var11Lifetime2 &&
                      35 != var10_ref_mlLifetime1.field_jb &&
                      var10_ref_mlLifetime1.field_ib > 0) {
                      var13Lifetime2 = this.field_v;
                      var14Lifetime2 = this.field_G;
                      this.field_v = var10_ref_mlLifetime1.field_lb;
                      this.field_G = var10_ref_mlLifetime1.field_db;
                      var5 = this.spawnFromHere(this.field_v, this.field_t, (byte) 81, 104, this.field_G - var10_ref_mlLifetime1.field_Y / 2, this.field_q);
                      this.field_q.onProjectileFinished(52, (SpellProjectile) (var5));
                      if (var11Lifetime2 < 0) {
                        this.field_v = this.field_v + 8;
                      } else {
                        this.field_v = this.field_v - 8;
                      }
                      this.field_G = this.field_G + 8;
                      this.applyAreaEffect(15, 32, 16, 8);
                      this.field_y = this.field_y + 1;
                      this.field_v = var13Lifetime2;
                      this.field_G = var14Lifetime2;
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
          if (!this.field_t.isDead(-1)) {
            this.field_v = this.field_t.field_lb;
            this.field_G = this.field_t.field_db;
            this.field_z = this.field_G << 4;
            this.field_o = this.field_v << 4;
            if (var19 == 0) {
              return;
            }
          }
          this.remove(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var5), "mi.NA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int getY(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -128 % ((-14 - param0) / 54);
          stackIn_1_0 = this.field_G;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.IA(" + param0 + ')');
        }
    }

    private final void initializeSprite(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 69 / ((param0 + 50) / 32);
          if (DateHelpers.field_a == null) {
            DateHelpers.field_a = new Sprite(15, 15);
            DateHelpers.field_a.makeRasterTarget();
            SoftwareRasterizer.fillCircle(7, 7, 7, 16777215);
          }
          this.field_p = DateHelpers.field_a;
          if (46 == this.field_I) {
            if (null == AudioShutdownHelpers.field_g) {
              AudioShutdownHelpers.field_g = new Sprite(16, 16);
              AudioShutdownHelpers.field_g.makeRasterTarget();
              SoftwareRasterizer.fillRectangle(6, 6, 7, 7, 16777214);
            }
            this.field_p = AudioShutdownHelpers.field_g;
          }
          if (this.field_I == 145) {
            this.field_p = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.field_I == 16) {
            this.field_p = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.field_I == 10) {
            this.field_p = ScreenSwitchHelpers.field_f[1].toRgbSprite();
          }
          if (this.field_I == 11) {
            this.field_p = ScreenSwitchHelpers.field_f[1].toRgbSprite();
          }
          if (13 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (12 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (this.field_I == 14) {
            this.field_p = ScreenSwitchHelpers.field_f[4].toRgbSprite();
          }
          if (67 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[2].toRgbSprite();
          }
          if (this.field_I == 17) {
            this.field_p = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.field_I == 18) {
            this.field_p = ScreenSwitchHelpers.field_f[3].toRgbSprite();
          }
          if (this.field_I == 0) {
            this.field_p = ScreenSwitchHelpers.field_f[12].toRgbSprite();
          }
          if (this.field_I == 24) {
            this.field_p = DualLinkDeque.field_b[2].toRgbSprite();
          }
          if (this.field_I == 26) {
            this.field_p = QuickChatPhrase.field_x[0];
          }
          if (this.field_I == 23) {
            this.field_p = DualLinkDeque.field_b[2].toRgbSprite();
          }
          if (this.field_I == 82) {
            this.field_p = ScreenSwitchHelpers.field_f[4].toRgbSprite();
          }
          if (this.field_I == 25) {
            this.field_p = DualLinkDeque.field_b[1].toRgbSprite();
          }
          if (this.field_I == 28) {
            this.field_p = QuickChatPhrase.field_x[0];
          }
          if (this.field_I == 21) {
            this.field_p = ScreenSwitchHelpers.field_f[5].toRgbSprite();
          }
          if (this.field_I == 44 ||
            this.field_I == 96) {
            this.field_p = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (45 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.field_I == 41) {
            this.field_p = ScreenSwitchHelpers.field_f[8].toRgbSprite();
          }
          if (this.field_I == 42) {
            this.field_p = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (this.field_I == 49) {
            this.field_p = FlagSumHelpers.field_f[1];
          }
          if (40 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[7].toRgbSprite();
          }
          if (76 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[9].toRgbSprite();
          }
          if (this.field_I == 43) {
            this.field_p = ScreenSwitchHelpers.field_f[10].toRgbSprite();
          }
          if (33 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[11].toRgbSprite();
          }
          if (53 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[13].toRgbSprite();
          }
          if (this.field_I == 54) {
            this.field_p = ScreenSwitchHelpers.field_f[14].toRgbSprite();
          }
          if (this.field_I == 50) {
            this.field_p = ScreenSwitchHelpers.field_f[15].toRgbSprite();
          }
          if (this.field_I == 52) {
            this.field_p = ScreenSwitchHelpers.field_f[15].toRgbSprite();
          }
          if (this.field_I == 133) {
            this.field_p = DualLinkDeque.field_b[12].toRgbSprite();
          }
          if (145 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[24].toRgbSprite();
          }
          if (this.field_I == 146) {
            this.field_p = ScreenSwitchHelpers.field_f[25].toRgbSprite();
          }
          if (this.field_I == 115) {
            this.field_p = ScreenSwitchHelpers.field_f[20].toRgbSprite();
          }
          if (this.field_I == 116) {
            this.field_p = ScreenSwitchHelpers.field_f[21].toRgbSprite();
          }
          if (this.field_I == 119) {
            this.field_p = ScreenSwitchHelpers.field_f[22].toRgbSprite();
          }
          if (120 == this.field_I) {
            this.field_p = DualLinkDeque.field_b[13].toRgbSprite();
          }
          if (this.field_I == 117) {
            this.field_p = ScreenSwitchHelpers.field_f[20].toRgbSprite();
          }
          if (this.field_I == 122) {
            this.field_p = ScreenSwitchHelpers.field_f[23].toRgbSprite();
          }
          if (this.field_I == 156) {
            this.field_p = ScreenSwitchHelpers.field_f[28].toRgbSprite();
          }
          if (this.field_I == 164) {
            this.field_p = ScreenSwitchHelpers.field_f[28].toRgbSprite();
          }
          if (159 == this.field_I) {
            this.field_p = ScreenSwitchHelpers.field_f[29].toRgbSprite();
          }
          if (this.field_I == 165) {
            this.field_p = DualLinkDeque.field_b[16].toRgbSprite();
          }
          if (this.field_I == 161) {
            this.field_p = DualLinkDeque.field_b[17].toRgbSprite();
          }
          if (this.field_I == 158) {
            this.field_p = DualLinkDeque.field_b[18].toRgbSprite();
          }
          if (this.field_I == 162) {
            this.field_p = DualLinkDeque.field_b[19].toRgbSprite();
          }
          if (this.field_I == 160) {
            this.field_p = FlagSumHelpers.field_f[3];
          }
          if (this.field_I == 165) {
            this.field_H = (1 + this.field_q.getRound((byte) -75) * 3) % (this.field_q.getPlayerCount(0) * 5) + 1 * this.field_q.getPlayerCount(0);
          }
          this.field_r = this.field_p.field_n >> 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.FA(" + param0 + ')');
        }
    }

    final SpellProjectile copyForBattle(int param0, Battle param1) {
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
          var3 = GameOptionType.acquireProjectile(param1, -108);
          stackIn_3_0 = var3;
          if (this.field_C == null) {
            stackIn_4_1 = null;
          } else {
            stackIn_4_1 = this.field_C.copy((byte) 64);
          }
          stackIn_3_0.field_C = stackIn_4_1;
          var3.field_I = this.field_I;
          var3.field_o = this.field_o;
          var3.field_v = this.field_v;
          var3.field_G = this.field_G;
          if (param0 != 21310) {
            field_m = (SceneWidget) null;
          }
          var3.field_z = this.field_z;
          var3.initializeSprite(44);
          var3.field_F = this.field_F;
          var3.field_H = this.field_H;
          var3.field_y = this.field_y;
          var3.field_u = this.field_u;
          stackIn_10_0 = var3;
          if (this.field_t == null) {
            stackIn_11_1 = null;
          } else {
            stackIn_11_1 = param1.getUnitByOwner(this.field_t.field_T, true);
          }
          stackIn_10_0.field_t = stackIn_11_1;
          var3.field_w = this.field_w;
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mi.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void applyAreaEffect(int param0, int param1, int param2, int param3) {
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
          if (null != this.field_t) {
            var5_int = this.field_t.field_u;
          }
          if ((this.field_I == 10 ||
            this.field_I == 11 ||
            this.field_I == 12 ||
            this.field_I == 13 ||
            this.field_I == 14 ||
            this.field_I == 67 ||
            15 == this.field_I) &&
            (null != this.field_t &&
            this.field_q.field_x[this.field_t.field_u] == 0)) {
            var6 = this.field_q.field_X[this.field_t.field_u] / 20;
            param2 = param2 + var6 * param2 / 5;
            param0 = param0 + var6 * param0 / 10;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.field_I == 0 ||
            this.field_I == 2 ||
            this.field_I == 3 ||
            147 == this.field_I) {
            EmailValidator.field_v.setDeque((byte) 116, this.field_q.field_Kb);
            var6_ref_mi = (SpellProjectile) (EmailValidator.field_v.first(param3 ^ -40));
            while (var6_ref_mi != null) {
              stackIn_52_0 = 148;
              stackIn_52_1 = var6_ref_mi.field_I;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_52_0 == stackIn_52_1 &&
                this.field_t == var6_ref_mi.field_t) {
                param1 += 16;
                param2 += 5;
                param0 += 5;
              }
              var6_ref_mi = (SpellProjectile) (EmailValidator.field_v.next(param3 - 18510));
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_52_0 = -71;
            stackIn_52_1 = ~this.field_I;
          }
          if (stackIn_52_0 != stackIn_52_1 &&
            this.field_I != 55 &&
            this.field_I != 111 &&
            this.field_I != 66 &&
            this.field_I != 24 &&
            this.field_I != 145 &&
            this.field_I != 138) {
            if (33 != this.field_I) {
              var6Lifetime1 = param2 * 2 / 3;
              if (this.field_I == 108) {
                var6Lifetime1 = param2;
              }
              if (0 == this.field_I) {
                var6Lifetime1 = param2;
              }
              if (this.field_I == 2) {
                var6Lifetime1 = param2;
              }
              if (this.field_I == 31) {
                var6Lifetime1 = var6Lifetime1 / 2;
              }
              if (16 > var6Lifetime1) {
                var6Lifetime1 = 16;
              }
              if (this.field_I == 30 ||
                this.field_I == 16) {
                var6Lifetime1 = param2;
              }
              this.field_q.refreshTerrainArea(this.field_v, var6Lifetime1, (byte) 51, this.field_G);
              if (var15 != 0) {
                this.field_G = this.field_G + 32;
                param2 += 32;
              }
            } else {
              this.field_G = this.field_G + 32;
              param2 += 32;
            }
            if (this.field_I == 43) {
              param2 += 16;
            }
            if (41 == this.field_I ||
              this.field_I == 13 ||
              this.field_I == 12) {
              param2 += 32;
              param1 += 32;
              this.field_G = this.field_G + 32;
            }
          }
          EmailValidator.field_v.setDeque((byte) 109, this.field_q.field_i);
          var6Lifetime2 = 1;
          if (param3 != 8) {
            this.field_F = -5;
          }
          var7 = (BattleUnit) (EmailValidator.field_v.first(-46));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var7 == null))) {
            var6Lifetime3 = 1;
            stackIn_347_0 = -1;
            stackIn_347_1 = ~var7.field_ib;
            if (var15 == 0) {
              if (stackIn_347_0 <= stackIn_347_1) {
                var6Lifetime3 = 0;
              }
              if ((this.field_I == 118 ||
                this.field_I == 78 ||
                this.field_I == 79 ||
                this.field_I == 98 ||
                this.field_I == 138) &&
                this.field_t == var7) {
                var6Lifetime3 = 0;
              }
              if ((0 == this.field_I ||
                2 == this.field_I ||
                this.field_I == 3 ||
                147 == this.field_I) &&
                (this.field_t == var7 &&
                this.field_t.field_jb != 20 &&
                this.field_t.field_jb != 27)) {
                var6Lifetime3 = 0;
              }
              if ((this.field_I == 55 ||
                this.field_I == 111) &&
                var7.field_jb == 35) {
                var6Lifetime3 = 0;
              }
              if (var6Lifetime3 == 0) {
                var6Lifetime3 = 1;
              } else {
                var8 = param1;
                if ((var7.field_U ||
                  16 == var7.field_jb) && 66 == this.field_I) {
                  var8 = 250;
                }
                var9 = var7.field_lb - this.field_v;
                var10 = -this.field_G + (var7.field_db - (var7.field_Y >> 1));
                var11 = ConnectionState.greatestCommonDivisor(var10, var9, false);
                if (var11 == 0) {
                  var9 = 0;
                  var10 = -1;
                  var11 = 1;
                }
                var12 = 0;
                var13 = 0;
                if (var11 >= (param2 >> 1) + (var7.field_Y >> 1)) {
                  if (!(((var7.field_Y >> 1) + param2) <= var11)) {
                    var13 = param0 * (var11 - (var7.field_Y >> 1)) / param2;
                    var12 = (var8 >> 1) + var8 * (var11 - ((param2 >> 1) + (var7.field_Y >> 1))) / param2;
                  }
                } else {
                  var13 = param0;
                  var12 = var8;
                  if (var13 > 5 &&
                    0 <= var5_int) {
                    this.field_q.field_ab[var5_int] = this.field_q.field_ab[var5_int] + 1;
                  }
                }
                if (var13 < param0 &&
                  param0 <= 5 &&
                  var11 < param2 + (var7.field_Y >> 1)) {
                  var13 = param0;
                }
                if (!this.field_q.field_M) {
                  if (0 == var7.field_jb) {
                    var13 = 0;
                  }
                  var12 = 0;
                }
                if (this.field_I == 161 &&
                  var7.field_jb != 37 &&
                  var7.field_jb != 12 &&
                  (16 + (var7.field_Y >> 1) + param2) > var11) {
                  var14 = var7;
                  var7 = (BattleUnit) (EmailValidator.field_v.first(param3 - 88));
                  while (var7 != null) {
                    if (var7.field_jb == 37) {
                      this.field_q.eraseUnitMask(var14, 0);
                      var14.field_lb = var7.field_lb;
                      var7.field_ib = 0;
                      var7.field_x = 1;
                      var14.field_X = var7.field_X;
                      var14.field_R = var7.field_R;
                      var14.field_z = true;
                      var14.field_db = var7.field_db;
                      this.playTypeSound(2, (byte) 37, 8);
                      return;
                    }
                    var7 = (BattleUnit) (EmailValidator.field_v.next(param3 ^ -18510));
                  }
                  this.playTypeSound(0, (byte) 37, 8);
                  return;
                }
                if ((this.field_I == 55 ||
                  111 == this.field_I) &&
                  param2 + (var7.field_Y >> 1) > var11) {
                  var13 = 15;
                }
                if (this.field_I == 78 &&
                  var11 < (var7.field_Y >> 1) + param2) {
                  var13 = 30;
                  if (9 == this.field_t.field_jb) {
                    var13 = 75;
                    if (~this.field_t.field_u == ~var7.field_u) {
                      if (var7.field_jb != 17) {
                      }
                      var13 = 0;
                    }
                  }
                  if (39 == this.field_t.field_jb) {
                    var13 = 50;
                    if (var7.field_T == this.field_t.field_u) {
                      var13 = 0;
                    }
                  }
                }
                if (this.field_I == 2 &&
                  var11 < (param2 + (var7.field_Y >> 1))) {
                  var13 = param0;
                }
                if (this.field_I == 16 &&
                  var11 < (var7.field_Y + param2)) {
                  var13 = 5;
                }
                if (this.field_I == 138) {
                  if (var11 < (param2 + (var7.field_Y >> 1))) {
                    var13 = param0;
                  } else {
                    var13 = 0;
                  }
                }
                if (this.field_I == 70 &&
                  ~this.field_t.field_u == ~var7.field_u) {
                  var12 = 0;
                  var13 = 0;
                }
                if (this.field_I == 55 &&
                  null != this.field_t &&
                  this.field_t.field_jb == 6 &&
                  var7 == this.field_t) {
                  var13 = 0;
                  var12 = 0;
                }
                if (var12 <= 0) {
                  if (this.field_I == 16 &&
                    !var7.field_z) {
                    var7.field_z = true;
                    var7.field_eb = 0;
                    var7.field_kb = 0;
                  }
                } else {
                  if (var7.field_jb == 7 ||
                    var7.field_jb == 27) {
                    var12 = var12 / 4;
                  }
                  if (!var7.field_z) {
                    var7.field_eb = 0;
                    var7.field_kb = 0;
                    var7.field_z = true;
                  }
                  var7.field_kb = var7.field_kb + var9 * var12 / var11;
                  var7.field_eb = var7.field_eb + ((var12 >> 1) * var10 / var11 - (var12 >> 1));
                  if (this.field_I == 15) {
                    var7.field_eb = var7.field_eb - 128;
                    if (var9 <= 0) {
                      var7.field_eb = var7.field_eb - 16;
                    } else {
                      var7.field_kb = var7.field_kb + 16;
                    }
                  }
                  if (this.field_I == 120 &&
                    12 != var7.field_jb) {
                    if (this.field_t != null) {
                      this.field_q.stampUnitMask(-107, this.field_t);
                    }
                    this.field_o = var7.field_X;
                    this.field_G = var7.field_db;
                    this.field_I = 121;
                    this.field_z = var7.field_R;
                    this.field_v = var7.field_lb;
                    this.field_t = var7;
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
            stackIn_347_0 = this.field_I;
            stackIn_347_1 = 161;
          }
          if (stackIn_347_0 == stackIn_347_1) {
            this.playTypeSound(2, (byte) 37, 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "mi.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static CoverageBitmapFont createCoverageFont(byte[] param0, int param1) {
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
          if (null == param0) {
            stackIn_2_0 = null;
            return (CoverageBitmapFont) (stackIn_2_0);
          }
          var2 = new CoverageBitmapFont(param0, BufferedMessage.field_l, SectorCacheStore.field_d, ChatLine.field_p, ServerMessage.field_i, PriceCaptionGlobals.field_c, AccountRegistrationPanel.field_I);
          if (param1 < 43) {
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
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void checkHeightEffects(int param0) {
        RuntimeException decompiledCaughtException = null;
        SpellProjectile var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 < 58) {
            SpellProjectile.releaseStatics(27);
          }
          if (this.field_G < this.field_q.field_H / 4) {
            if (this.field_G >= this.field_q.field_H / 5) {
              this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, -87, -this.field_r + this.field_v, ScreenSwitchHelpers.field_f[16].toRgbSprite());
              if (var3 == 0) {
                return;
              }
            }
            if (this.field_G < (this.field_q.field_H / 6)) {
              if (this.field_G < this.field_q.field_H / 7) {
                if (this.field_q.field_H / 8 > this.field_G) {
                  var2 = this.spawnFromHere(this.field_v, (BattleUnit) null, (byte) 81, 95, this.field_G, this.field_q);
                  this.field_q.onProjectileFinished(52, var2);
                  if (var3 == 0) {
                    return;
                  }
                }
                this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -97, -this.field_r + this.field_v, ScreenSwitchHelpers.field_f[19].toRgbSprite());
                if (var3 == 0) {
                  return;
                }
              }
              this.field_q.carveTerrainAndSprite(-this.field_r + this.field_G, -5, this.field_v - this.field_r, ScreenSwitchHelpers.field_f[18].toRgbSprite());
              if (var3 == 0) {
                return;
              }
            }
            this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -18, -this.field_r + this.field_v, ScreenSwitchHelpers.field_f[17].toRgbSprite());
            if (var3 == 0) {
              return;
            }
          }
          this.field_q.carveTerrainAndSprite(this.field_G - this.field_r, -34, -this.field_r + this.field_v, ScreenSwitchHelpers.field_f[6].toRgbSprite());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.EA(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 2) {
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
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "mi.W(" + param0 + ')');
        }
    }

    private final void onHitUnit(int param0, boolean param1, int param2, BattleUnit param3) {
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
          if (140 == this.field_I) {
            if (param3.field_jb == 28) {
              param3.field_J = false;
              param3.field_jb = 29;
              param3.buildSprites(12, true);
              param2 = 0;
              var5 = this.spawnFromHere(param3.field_lb, param3, (byte) 81, 137, param3.field_db - param3.field_Y / 2, this.field_q);
              this.field_q.onProjectileFinished(52, var5);
              decompiledFrameRemainder2 = (var8 != 0);
            }
            if (decompiledFrameRemainder2) {
              if (param3.field_jb != 29) {
                if (param3.field_jb == 30) {
                  param2 = 0;
                  if (var8 != 0) {
                    param3.field_jb = 30;
                    param3.field_J = false;
                    param3.buildSprites(12, true);
                    param2 = 0;
                    var5Lifetime2 = this.spawnFromHere(param3.field_lb, param3, (byte) 81, 137, param3.field_db - param3.field_Y / 2, this.field_q);
                    this.field_q.onProjectileFinished(52, var5Lifetime2);
                  }
                }
              } else {
                param3.field_jb = 30;
                param3.field_J = false;
                param3.buildSprites(12, true);
                param2 = 0;
                var5Lifetime2 = this.spawnFromHere(param3.field_lb, param3, (byte) 81, 137, param3.field_db - param3.field_Y / 2, this.field_q);
                this.field_q.onProjectileFinished(52, var5Lifetime2);
              }
            }
          }
          if ((20 == this.field_I ||
            this.field_I == 80 ||
            this.field_I == 165) &&
            param3.field_q > 0) {
            param2 = param2 * 2;
          }
          boolean decompiledFrameRemainder1 = true;
          if (this.field_I == 0 ||
            2 == this.field_I ||
            3 == this.field_I ||
            this.field_I == 77 ||
            this.field_I == 147) {
            if (param3.field_jb == 11) {
              param3.field_x = param3.field_x - param2;
              param2 = 0;
            }
            if (param3.field_jb == 27) {
              param3.field_x = -param2 / 2;
              param2 = 0;
            }
            decompiledFrameRemainder1 = (param3.field_jb == 20);
            if (decompiledFrameRemainder1) {
              param3.field_q = param3.field_q + param2;
              param2 = 0;
              if (param3.field_q > 100) {
                param3.field_q = 100;
              }
              decompiledFrameRemainder1 = (null != this.field_t);
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder1 = (this.field_t.field_jb == 27)) &&
                (decompiledFrameRemainder1 = (this.field_I == 2))) {
                var5Lifetime1 = this.spawnFromHere(param3.field_lb, param3, (byte) 81, 155, param3.field_db - param3.field_Y / 2, this.field_q);
                this.field_q.onProjectileFinished(52, var5Lifetime1);
                decompiledFrameRemainder1 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder1) {
            if ((this.field_I != 46) &&
              (decompiledFrameRemainder1 = (45 == this.field_I ||
              this.field_I == 76)) &&
              (decompiledFrameRemainder1 = (param3.field_jb == 22 ||
              param3.field_jb == 4 ||
              5 == param3.field_jb ||
              15 == param3.field_jb))) {
              param2 = 0;
              decompiledFrameRemainder1 = (var8 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (4 == param3.field_jb ||
                param3.field_jb == 5 ||
                param3.field_jb == 15) {
                param2 = -1;
                var5_int = 50;
                if (param3.field_jb == 5) {
                  var5_int = 100;
                }
                if (param3.field_jb == 15) {
                  var5_int = 150;
                }
                if (var5_int < -param3.field_x + (-param2 + param3.field_ib)) {
                  param2 = -var5_int + (param3.field_ib - param3.field_x);
                }
              }
              if (param3.field_jb == 22) {
                if (75 > param3.field_q) {
                  param3.field_q = param3.field_q + 1;
                }
                param2 = 0;
              }
            }
          }
          if (1 < param2) {
            var5_intLifetime1 = 1;
            if (param3.field_jb == 2) {
              param2 -= 10;
            }
            if (param3.field_jb == 27) {
              param2 -= 5;
            }
            if (1 == this.field_q.field_x[param3.field_u]) {
              param2 = param2 - this.field_q.field_X[param3.field_u] / 20;
            }
            if (this.field_q.field_x[param3.field_u] == 7) {
              if (this.field_I == 135) {
                var5_intLifetime1 = 0;
                param2 = param2 - this.field_q.field_X[param3.field_u] / 20;
              }
              if (this.field_I == 133) {
                param2 = param2 - this.field_q.field_X[param3.field_u] / 10;
                var5_intLifetime1 = 0;
              }
            }
            if (var5_intLifetime1 > param2) {
              param2 = var5_intLifetime1;
            }
          }
          if (param3.field_jb == 13 && (this.field_I == 16 ||
            this.field_I == 15)) {
            param2 = 0;
          }
          if (!param1) {
            return;
          }
          if ((param3.field_jb == 3 ||
            param3.field_jb == 14) &&
            (30 == this.field_I ||
            this.field_I == 31 ||
            this.field_I == 33 ||
            this.field_I == 70 ||
            this.field_I == 93)) {
            param2 = 0;
          }
          if (param3.field_U) {
            if (52 == this.field_I) {
              param3.recordDamage(124, param2, this.field_n);
              if (param0 >= 0) {
                this.field_q.field_K[param0] = this.field_q.field_K[param0] + param2;
              }
              if (param3.hasNoLinkedUnit(46)) {
                this.field_q.field_db[param3.field_T] = this.field_q.field_db[param3.field_T] + param2;
              }
              this.field_q.field_tb = this.field_q.field_tb + param2;
              param2 = 0;
            }
            if (this.field_I == 54 ||
              this.field_I == 55 ||
              this.field_I == 111) {
              param3.recordDamage(-19, -param2, this.field_n);
              if (0 <= param0) {
                this.field_q.field_g[param0] = this.field_q.field_g[param0] + param2;
              }
              if (param3.hasNoLinkedUnit(102)) {
                this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] - param2;
              }
              param2 = 0;
            }
          }
          if (param2 > 0 &&
            this.field_t != null &&
            !param3.field_U &&
            param3.field_jb != 2 &&
            param3.field_jb != 11 &&
            param3.field_jb != 25 &&
            param3.field_jb != 39 &&
            param3.field_jb != 6 &&
            param3.field_jb != 32) {
            if (52 == this.field_I) {
              if (param3 == this.field_t) {
                param2 = 0;
              }
              var5_intLifetime2 = param2;
              if (var5_intLifetime2 > this.field_t.field_ib) {
                var5_intLifetime2 = this.field_t.field_ib;
              }
              if (0 > var5_intLifetime2) {
                var5_intLifetime2 = 0;
              }
              this.field_t.field_x = this.field_t.field_x - var5_intLifetime2;
              this.field_q.field_g[param0] = this.field_q.field_g[param0] + var5_intLifetime2;
              if (param3.hasNoLinkedUnit(121)) {
                this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] + var5_intLifetime2;
              }
              if ((var8 != 0) &&
                (this.field_t.field_jb == 16)) {
                this.field_t.field_x = this.field_t.field_x - (param2 >> 1);
                this.field_q.field_p[param0] = this.field_q.field_p[param0] + (param2 >> 1);
                this.field_q.field_g[param0] = this.field_q.field_g[param0] + (param2 >> 1);
                if (param3.hasNoLinkedUnit(68)) {
                  this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] + (param2 >> 1);
                }
              }
            } else {
              if (this.field_t.field_jb == 16) {
                this.field_t.field_x = this.field_t.field_x - (param2 >> 1);
                this.field_q.field_p[param0] = this.field_q.field_p[param0] + (param2 >> 1);
                this.field_q.field_g[param0] = this.field_q.field_g[param0] + (param2 >> 1);
                if (param3.hasNoLinkedUnit(68)) {
                  this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] + (param2 >> 1);
                }
              }
            }
          }
          if (0 < param2 &&
            this.field_t != null &&
            null != this.field_t.field_s &&
            this.field_t.field_s.field_jb == 16 &&
            !param3.field_U &&
            2 != param3.field_jb &&
            param3.field_jb != 11 &&
            param3.field_jb != 25 &&
            39 != param3.field_jb &&
            param3.field_jb != 6 &&
            param3.field_jb != 32) {
            this.field_t.field_s.field_x = this.field_t.field_s.field_x - (param2 >> 1);
            this.field_q.field_p[param0] = this.field_q.field_p[param0] + (param2 >> 1);
            this.field_q.field_g[param0] = this.field_q.field_g[param0] + (param2 >> 1);
            if (param3.hasNoLinkedUnit(34)) {
              this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] + (param2 >> 1);
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_I == 66) {
            if (param3.field_jb == 2 ||
              param3.field_jb == 11 ||
              param3.field_jb == 25 ||
              param3.field_jb == 6 ||
              param3.field_jb == 11 ||
              param3.field_jb == 25 ||
              39 == param3.field_jb ||
              param3.field_jb == 6 ||
              param3.field_jb == 32) {
              param2 = 0;
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if ((decompiledFrameRemainder0) && (!param3.field_U &&
              param3.field_jb != 16)) {
              param2 = -param2;
              if (param3.field_p < -param2 + param3.field_ib) {
                param2 = -param3.field_p + param3.field_ib;
                if (0 < param2) {
                  param2 = 0;
                }
              }
            }
          }
          if (this.field_I == 61 ||
            this.field_I == 64 ||
            this.field_I == 63 ||
            this.field_I == 60 ||
            this.field_I == 66) {
            if (param3.field_U) {
              param2 = param2 * 2;
            }
            if (param3.hasNoLinkedUnit(62)) {
              if (this.field_q.field_x[param3.field_T] == 4 &&
                -param3.field_x + (-param2 + param3.field_ib) <= 0) {
                this.field_q.field_X[param3.field_T] = 0;
              }
              if (param3.field_jb == 16 &&
                66 == this.field_I) {
                this.field_q.refreshTerrainArea(this.field_v, 64, (byte) 51, this.field_G);
              }
            }
          }
          param3.recordDamage(-7, param2, this.field_n);
          if (0 >= param2) {
            if (param0 >= 0) {
              this.field_q.field_g[param0] = this.field_q.field_g[param0] - param2;
            }
            if (param3.hasNoLinkedUnit(93)) {
              this.field_q.field_s[param3.field_T] = this.field_q.field_s[param3.field_T] - param2;
            }
          } else {
            if (this.field_I == 31 &&
              param3.field_q > 0) {
              this.field_x = 0;
            }
            if (param3.hasNoLinkedUnit(118)) {
              this.field_q.field_db[param3.field_T] = this.field_q.field_db[param3.field_T] + param2;
            }
            if (param3.field_jb != 12 &&
              !this.field_w) {
              this.field_q.field_tb = this.field_q.field_tb + param2;
              if (param0 >= 0) {
                if (~param3.field_T != ~param0) {
                  this.field_q.field_K[param0] = this.field_q.field_K[param0] + param2;
                  if (var8 != 0) {
                    this.field_q.field_K[param0] = this.field_q.field_K[param0] - param2;
                  }
                } else {
                  this.field_q.field_K[param0] = this.field_q.field_K[param0] - param2;
                }
              }
            }
            if (!this.field_w) {
            }
            if (34 == param3.field_jb && (this.field_I == 145 ||
              this.field_I == 146)) {
              param3.field_ib = 0;
              param3.updateTurnLogic(param0, 104);
            }
            if (null == param3.field_s) {
              if (-param3.field_x + param3.field_ib > 0) {
                this.field_q.field_n[param3.field_T] = this.field_q.field_n[param3.field_T] + 1;
              }
              if (param0 >= 0) {
                if (~this.field_q.field_C == ~param3.field_T &&
                  ~param0 != ~this.field_q.field_C) {
                  this.field_q.field_Fb[param0] = this.field_q.field_Fb[param0] + param2;
                }
                if (~param3.field_T == ~this.field_q.field_bb &&
                  ~this.field_q.field_bb != ~param0) {
                  this.field_q.field_gb[param0] = this.field_q.field_gb[param0] + param2;
                }
              }
            }
            if (param0 >= 0 &&
              !this.field_w) {
              if (this.field_I == 77) {
                this.field_q.field_wb[param0] = this.field_q.field_wb[param0] + param2;
              }
              if (this.field_t.isFlyingType(-26)) {
                this.field_q.field_Nb[param0] = this.field_q.field_Nb[param0] + param2;
              }
              if (null != this.field_t.field_s) {
                this.field_q.field_T[param0] = this.field_q.field_T[param0] + param2;
              }
              if (null != this.field_t.field_s &&
                this.field_t.field_s != this.field_q.getUnitByOwner(this.field_q.getCurrentPlayer(false), param1)) {
              }
            }
          }
          if ((this.field_I == 23 ||
            this.field_I == 82) &&
            75 < param3.field_x) {
            param3.field_x = 75;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          regionExit1: {
            if ((this.field_I == 54 ||
              55 == this.field_I ||
              this.field_I == 53 ||
              this.field_I == 111) && (-param3.field_x + param3.field_ib <= 0 &&
              !param3.hasNoLinkedUnit(71) &&
              12 != param3.field_jb &&
              param3.field_jb != 2 &&
              param3.field_jb != 6 &&
              param3.field_jb != 11 &&
              param3.field_jb != 25 &&
              param3.field_jb != 32 &&
              param3.field_jb != 39 &&
              param3.field_q <= 0)) {
              var5_intLifetime3 = 1;
              if (17 == param3.field_jb ||
                param3.field_jb == 9) {
                var6 = new IntrusiveDequeCursor(this.field_q.field_Kb);
                var7 = (SpellProjectile) (var6.first(-77));
                while (var7 != null) {
                  stackIn_564_0 = var7.field_I;
                  stackIn_564_1 = 106;
                  if (var8 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_564_0 == stackIn_564_1 &&
                    param3 == var7.field_t) {
                    var5_intLifetime3 = 0;
                  }
                  var7 = (SpellProjectile) (var6.next(-18502));
                }
              }
              if ((decompiledFrameCompleted1) && (!param3.field_U &&
                var5_intLifetime3 != 0)) {
                if (param3.isFlyingType(-26)) {
                  param3.field_jb = 26;
                }
                if (param3.isAirborneOrHovering(32)) {
                  var6_int = -this.field_v + param3.field_s.field_lb;
                  var7_int = -(param3.field_s.field_Y / 2) + param3.field_Y / 2 + (param3.field_s.field_db - this.field_G);
                  if (((param3.field_s.field_Y + param3.field_Y) * (param3.field_s.field_Y + param3.field_Y) >> 2) <= (var7_int * var7_int + var6_int * var6_int)) {
                  }
                }
                param3.field_x = 0;
                param3.field_U = true;
                param3.field_s = this.field_q.getUnitByOwner(this.field_t.field_u, param1);
                param3.field_u = this.field_t.field_u;
                param3.field_J = false;
                param3.buildSprites(12, true);
                param3.field_ib = param3.field_ib / 4;
                if (param3.field_jb == 9) {
                  param3.field_jb = 7;
                  var6Lifetime1 = new IntrusiveDequeCursor(this.field_q.field_i);
                  var7_ref = (BattleUnit) (var6Lifetime1.first(-38));
                  while (var7_ref != null) {
                    stackIn_552_0 = var7_ref.field_s;
                    stackIn_552_1 = param3.field_s;
                    if (var8 == 0) {
                      if (stackIn_552_0 == stackIn_552_1 &&
                        var7_ref.field_U &&
                        17 == var7_ref.field_jb) {
                      }
                      var7_ref = (BattleUnit) (var6Lifetime1.next(-18502));
                      continue;
                    }
                    while (true) {
                      if (stackIn_552_0 == stackIn_552_1 &&
                        var7_ref.field_U &&
                        var7_ref.field_jb == 7) {
                      }
                      var7_ref = (BattleUnit) (var6Lifetime1.next(-18502));
                      break regionExit1;
                    }
                  }
                }
                if (param3.field_jb == 17) {
                  var6Lifetime1Lifetime1 = new IntrusiveDequeCursor(this.field_q.field_i);
                  var7_refLifetime1 = (BattleUnit) (var6Lifetime1Lifetime1.first(-62));
                  while (null != var7_refLifetime1) {
                    stackIn_563_0 = param3.field_s;
                    if (var8 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    stackIn_552_0Lifetime1 = stackIn_563_0;
                    stackIn_552_1Lifetime1 = var7_refLifetime1.field_s;
                    if (stackIn_552_0Lifetime1 == stackIn_552_1Lifetime1 &&
                      var7_refLifetime1.field_U &&
                      var7_refLifetime1.field_jb == 7) {
                    }
                    var7_refLifetime1 = (BattleUnit) (var6Lifetime1Lifetime1.next(-18502));
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            if (!this.field_q.field_Z) {
              return;
            }
            stackIn_563_0 = (BattleUnit) (param3);
          }
          if (decompiledFrameCompleted1) {
            stackIn_564_0 = -stackIn_563_0.field_x;
            stackIn_564_1 = param3.field_ib;
          }
          if (stackIn_564_0 + stackIn_564_1 < 0 &&
            param3.hasNoLinkedUnit(81) &&
            !param3.isTower((byte) 104) &&
            !this.field_w &&
            this.field_t != null &&
            Math.abs(-param3.field_X + this.field_t.field_X) > 10240) {
            this.field_q.field_Z = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_587_0 = var5_ref;
          stackIn_587_1 = new StringBuilder().append("mi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
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
          if (29 == this.field_I &&
            this.field_H == 0 &&
            this.field_y >= 30) {
            return false;
          }
          if (68 == this.field_I && (250 <= this.field_y ||
            0 == this.field_y)) {
            return false;
          }
          if (15 == this.field_I && (this.field_y >= 250 ||
            this.field_y == 0)) {
            return false;
          }
          if (this.field_I == 16 &&
            300 <= this.field_y) {
            return false;
          }
          if (this.field_I == 165 &&
            this.field_y >= 300) {
            return false;
          }
          if (this.field_I == 3 &&
            this.field_y >= 25) {
            return false;
          }
          if (this.field_I == 106) {
            return false;
          }
          if (this.field_I == 121) {
            return false;
          }
          if (this.field_I == 127) {
            return false;
          }
          if (148 == this.field_I) {
            return false;
          }
          if (this.field_I == 117) {
            return false;
          }
          if (this.field_I == 149) {
            return false;
          }
          if (param0 == ~this.field_I) {
            return false;
          }
          if (this.field_I == 107) {
            return false;
          }
          if (this.field_I == 126) {
            return false;
          }
          if (this.field_I == 69 && (this.field_y >= 250 ||
            this.field_y == 0)) {
            return false;
          }
          if (70 == this.field_I) {
            return false;
          }
          if (55 == this.field_I) {
            return false;
          }
          if (this.field_I == 111) {
            return false;
          }
          if (56 == this.field_I) {
            stackIn_118_0 = !(this.field_t.field_ib >= 250);
            return stackIn_118_0;
          }
          if (this.field_I == 157) {
            return false;
          }
          if (this.field_I == 168) {
            return false;
          }
          if (this.field_I == 123) {
            return false;
          }
          if ((this.field_I == 19 ||
            this.field_I == 142 ||
            this.field_I == 134 ||
            62 == this.field_I ||
            47 == this.field_I ||
            this.field_I == 71 ||
            this.field_I == 36) &&
            (this.field_y == 100 ||
            this.field_y == 200 ||
            300 == this.field_y ||
            this.field_y == 400)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "mi.GA(" + param0 + ')');
        }
    }

    private final void updateFlightSound(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        PcmSample var3 = null;
        RuntimeException var3_ref = null;
        try {
          if (this.field_q.field_sb != null) {
            var3 = this.field_q.field_sb[220];
            if ((this.field_I == 11 ||
              this.field_I == 44 ||
              this.field_I == 18) && (this.field_y > 25 &&
              this.field_y < 250)) {
              var3 = this.field_q.field_sb[226];
            }
            if (null == var3) {
              return;
            }
            this.field_J = this.field_J + 1;
            if (this.field_D == null ||
              this.field_D.isSamplePositionOutOfRange() ||
              this.field_J > 5) {
              this.field_J = 0;
              this.field_D = this.createFlightSoundStream(var3, 19227);
              if (this.field_D != null) {
                ValidationHelpWidget.playEffectStream(this.field_D, (byte) 68);
              }
            }
          }
          if (param1 != 34) {
            this.onHitUnit(34, true, -6, (BattleUnit) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3_ref), "mi.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawUnitMarkers(byte param0) {
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
          var5 = new IntrusiveDequeCursor(this.field_q.field_i);
          var6_ref_ml = (BattleUnit) (var5.first(-36));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_ref_ml == null))) {
            stackIn_14_0 = 0;
            if (var12 == 0) {
              if (stackIn_14_0 < var6_ref_ml.field_ib) {
                this.field_q.stampUnitMask(-114, var6_ref_ml);
              } else {
                this.field_q.eraseUnitMask(var6_ref_ml, 0);
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
          var7 = 36 % ((-26 - param0) / 51);
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
                        if (!this.field_q.spriteOverlapsTerrain(this.field_G - var11 - 8, 2, -8 + (var10 + this.field_v), var3)) {
                          this.field_q.carveTerrainAndSprite(-8 + (-var11 + this.field_G), -90, this.field_v + var10 - 8, var3);
                        }
                      } else if (!this.field_q.spriteOverlapsTerrain(-var11 + (this.field_G - 16), 2, this.field_v + var10 - 16, var4)) {
                        this.field_q.carveTerrainAndSprite(-16 - var11 + this.field_G, -11, this.field_v + var10 - 16, var4);
                      }
                    } else {
                      if (!this.field_q.spriteOverlapsTerrain(-8 - var11 + this.field_G, 2, var10 + this.field_v - 8, var2)) {
                        this.field_q.carveTerrainAndSprite(-8 + this.field_G - var11, -43, -8 + var10 + this.field_v, var2);
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
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.C(" + param0 + ')');
        }
    }

    final void draw(int param0, int param1, int param2) {
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
          if (this.field_y < 20) {
            if (!((this.field_I != 93) &&
              (91 != this.field_I) &&
              (this.field_I != 92) &&
              (this.field_I != 113))) {
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
                                                                                              var4_int = -47 % ((param1 - 8) / 33);
                                                                                              var5 = this.field_I;
                                                                                              if (var5 == 167) {
                                                                                                var5 = 86;
                                                                                                if ((this.field_x & 8) > 0) {
                                                                                                  var5++;
                                                                                                }
                                                                                                regionExit43: {
                                                                                                  var6_int = this.field_v - (-param2 + 20);
                                                                                                  var7 = param0 + this.field_G - 20;
                                                                                                  if (this.field_u > 0) {
                                                                                                    LoginLoadingHelpers.field_g[var5].drawTransparent(var6_int, var7);
                                                                                                    if (var16 == 0) {
                                                                                                      break regionExit43;
                                                                                                    }
                                                                                                  }
                                                                                                  LoginLoadingHelpers.field_g[var5].drawHorizontalFlip(var6_int, var7);
                                                                                                }
                                                                                                if (this.field_x < 200) {
                                                                                                  var8 = 65;
                                                                                                  var9 = this.field_q.getArenaTheme(-31497);
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
                                                                                                  if (this.field_u <= 0) {
                                                                                                    stackIn_474_2 = -4;
                                                                                                  } else {
                                                                                                    stackIn_474_2 = 0;
                                                                                                  }
                                                                                                  ((Sprite) (Object) stackIn_473_0).drawQuarterSize(stackIn_473_1 - (-stackIn_474_2 - (int)(10.0 * Math.cos(0.2 * (double)this.field_x))), var7 + (int)(5.0 * Math.sin((double)this.field_x * 0.2)));
                                                                                                  stackIn_477_0 = LoginLoadingHelpers.field_g[var8].copyFlippedHorizontal();
                                                                                                  stackIn_477_1 = 20 + var6_int;
                                                                                                  if (this.field_u <= 0) {
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
                                                                                                                                                      CheckboxPainter.field_p[this.field_H].draw(param2 + (this.field_v - 50), this.field_G + (param0 - 50));
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
                                                                                                                                                    HighscoreEntry.field_j[this.field_H].draw(-50 + (this.field_v + param2), -50 + (param0 + this.field_G));
                                                                                                                                                    if (var16 == 0) {
                                                                                                                                                      return;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                  if (DropdownItemList.field_cb == null) {
                                                                                                                                                    return;
                                                                                                                                                  }
                                                                                                                                                  DropdownItemList.field_cb[this.field_H].draw(-50 + (param2 + this.field_v), param0 + (this.field_G - 50));
                                                                                                                                                  if (var16 == 0) {
                                                                                                                                                    return;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                                if (DiskCacheRequest.field_H == null) {
                                                                                                                                                  return;
                                                                                                                                                }
                                                                                                                                                DiskCacheRequest.field_H[this.field_H].draw(this.field_v + param2 - 50, -50 + (param0 + this.field_G));
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
                                                                                                                                              HotspotRegion.field_i[this.field_H].draw(-8 + this.field_v + param2, -8 + param0 + this.field_G);
                                                                                                                                              if (var16 == 0) {
                                                                                                                                                return;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            if (null == ResizableModalPanel.field_db) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                            ResizableModalPanel.field_db[this.field_H].draw(param2 + (this.field_v - 64), -128 + param0 + this.field_q.field_H);
                                                                                                                                            if (var16 == 0) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                          if (this.field_F <= 0) {
                                                                                                                                            return;
                                                                                                                                          }
                                                                                                                                          var5 = 0;
                                                                                                                                          if ((this.field_q.field_N != null) &&
                                                                                                                                            (this.field_t != null) &&
                                                                                                                                            (this.field_t.field_s == null)) {
                                                                                                                                            var5 = this.field_q.field_N[this.field_t.field_T][5] | (this.field_q.field_N[this.field_t.field_T][3] << 16 | this.field_q.field_N[this.field_t.field_T][4] << 8);
                                                                                                                                          }
                                                                                                                                          var6_int = this.field_y - 64;
                                                                                                                                          while (this.field_y > var6_int) {
                                                                                                                                            var7 = var6_int * this.field_u / this.field_F + param2 + this.field_v;
                                                                                                                                            var8 = this.field_G + (param0 + var6_int);
                                                                                                                                            var9 = 14 * var6_int / this.field_F + 2;
                                                                                                                                            var10 = 8 + 24 * var6_int / this.field_F;
                                                                                                                                            if (var16 != 0) {
                                                                                                                                              return;
                                                                                                                                            }
                                                                                                                                            if (var10 > 32) {
                                                                                                                                              var10 = 32;
                                                                                                                                            }
                                                                                                                                            if (96 > -var6_int + this.field_F) {
                                                                                                                                              var10 = 32 + this.field_F + (-var6_int - 96);
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
                                                                                                                                        ScreenTransitionHelpers.field_e[this.field_H].draw(param2 + (this.field_v - 50), -50 + (this.field_G + param0));
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
                                                                                                                                      ArrayWidgetContainer.field_G[this.field_H].draw(-8 + this.field_v + param2, -8 + this.field_G + param0);
                                                                                                                                      if (var16 == 0) {
                                                                                                                                        return;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    var5 = ButtonMenuDialog.highestOneBit((int)Math.sqrt((double)(this.field_u * this.field_u + this.field_F * this.field_F)) / 15, (byte) 124);
                                                                                                                                    var5++;
                                                                                                                                    var6 = new int[var5];
                                                                                                                                    var6[0] = this.field_v + param2;
                                                                                                                                    var7_ref_int__ = new int[var5];
                                                                                                                                    var7_ref_int__[0] = this.field_G + param0;
                                                                                                                                    var6[-1 + var5] = -(this.field_u >> 4) + this.field_v + param2;
                                                                                                                                    var7_ref_int__[-1 + var5] = -(this.field_F >> 4) + (param0 + this.field_G);
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
                                                                                                                                      if (this.field_I != 112) {
                                                                                                                                        if (this.field_I != 93) {
                                                                                                                                          if (var5 - 1 > var10) {
                                                                                                                                            SoftwareRasterizer.drawLine(var6[var10], var7_ref_int__[var10], var6[var10 + 1], var7_ref_int__[var10 + 1], 16777215);
                                                                                                                                          }
                                                                                                                                          QuickChatPhraseCache.fillCircleMasked(8, (byte) 105, -(25 * (this.field_y * var10) / var5) + 255 >> 4, var6[var10], var7_ref_int__[var10]);
                                                                                                                                        } else {
                                                                                                                                          if (~(-1 + var5) < ~var10) {
                                                                                                                                            SoftwareRasterizer.drawLine(var6[var10], var7_ref_int__[var10], var6[1 + var10], var7_ref_int__[1 + var10], 16777215);
                                                                                                                                          }
                                                                                                                                          QuickChatPhraseCache.fillCircleMasked(8, (byte) 125, 255 - var10 * (this.field_y * 25 - 500) / var5 >> 4, var6[var10], var7_ref_int__[var10]);
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        if (-1 + var5 > var10) {
                                                                                                                                          SoftwareRasterizer.drawLineBlendedInclusive(var6[var10], var7_ref_int__[var10], var6[var10 + 1], var7_ref_int__[1 + var10], 16777215, -(this.field_y * 5 * var10 / var5) + 255 >> 4);
                                                                                                                                        }
                                                                                                                                        QuickChatPhraseCache.fillCircleMasked(8, (byte) 94, -(var10 * 5 * this.field_y / var5) + 255 >> 4, var6[var10], var7_ref_int__[var10]);
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
                                                                                                                                      QuickChatPhraseCache.fillCircleMasked(8, (byte) 66, 32, -16 + (param2 + this.field_v + (int)(Math.random() * 32.0)), param0 + this.field_G + ((int)(Math.random() * 32.0) - 16));
                                                                                                                                      var5++;
                                                                                                                                      if (var16 == 0) {
                                                                                                                                        continue;
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      QuickChatPhraseCache.fillCircleMasked(16, (byte) 62, 64, param2 + this.field_v, param0 + this.field_G);
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                  }
                                                                                                                                  if (var16 == 0) {
                                                                                                                                    return;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                var5 = (int)(96.0 * Math.sin(0.01 * (6.28 * (double)this.field_x)));
                                                                                                                                var6_int = (this.field_x & 12 & 15) >> 2;
                                                                                                                                FlagSumHelpers.field_f[4 + var6_int].drawTransparent(this.field_v + param2 + (-64 + var5), param0 + this.field_G);
                                                                                                                                FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparent(-64 + this.field_v + (param2 - var5), this.field_G + param0);
                                                                                                                                FlagSumHelpers.field_f[(3 & var6_int + 1) + 4].drawTransparentWithOpacity(-(6 * var5 / 10) + this.field_v + param2 - 64, this.field_G - (-param0 + 4), 192);
                                                                                                                                FlagSumHelpers.field_f[4 + (3 & var6_int + 2)].drawTransparentWithOpacity(var5 * 4 / 10 + (-64 + (this.field_v + param2)), this.field_G - (-param0 + 8), 128);
                                                                                                                                FlagSumHelpers.field_f[(var6_int + 3 & 3) + 4].drawTransparentWithOpacity(-64 + (param2 + this.field_v) - var5 * 2 / 10, this.field_G + param0 - 12, 96);
                                                                                                                                if (var16 == 0) {
                                                                                                                                  return;
                                                                                                                                }
                                                                                                                              }
                                                                                                                              var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.01) * 96.0);
                                                                                                                              var6_int = (15 & (this.field_x & 12)) >> 2;
                                                                                                                              FlagSumHelpers.field_f[4 + var6_int].drawTransparentWithOpacity(param2 + this.field_v - (64 - var5), this.field_G + param0, 64);
                                                                                                                              FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparentWithOpacity(-var5 - 64 + (param2 + this.field_v), param0 + this.field_G, 128);
                                                                                                                              FlagSumHelpers.field_f[(1 + var6_int & 3) + 4].drawTransparentWithOpacity(-(6 * var5 / 10) + param2 + this.field_v - 64, -4 + param0 + this.field_G, 96);
                                                                                                                              FlagSumHelpers.field_f[4 + (var6_int + 2 & 3)].drawTransparentWithOpacity(var5 * 4 / 10 + (this.field_v + param2 - 64), this.field_G + param0 - 8, 64);
                                                                                                                              FlagSumHelpers.field_f[(var6_int + 3 & 3) + 4].drawTransparentWithOpacity(-64 + (param2 + this.field_v - 2 * var5 / 10), -12 + this.field_G + param0, 32);
                                                                                                                              if (var16 == 0) {
                                                                                                                                return;
                                                                                                                              }
                                                                                                                            }
                                                                                                                            var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.02) * 64.0);
                                                                                                                            var6_int = 3 & (12 & this.field_x) >> 2;
                                                                                                                            FlagSumHelpers.field_f[var6_int + 4].drawTransparent(var5 + (-64 + param2 + this.field_v), param0 + this.field_G);
                                                                                                                            FlagSumHelpers.field_f[4 + (3 & var6_int + 3)].drawTransparent(-var5 + (-64 + (param2 + this.field_v)), param0 + this.field_G);
                                                                                                                            FlagSumHelpers.field_f[4 + (1 + var6_int & 3)].drawTransparentWithOpacity(-64 + (param2 + this.field_v - var5 * 6 / 10), this.field_G + param0 - 4, 192);
                                                                                                                            FlagSumHelpers.field_f[4 + (var6_int + 2 & 3)].drawTransparentWithOpacity(-64 + (this.field_v + param2) + 4 * var5 / 10, param0 + this.field_G - 8, 128);
                                                                                                                            FlagSumHelpers.field_f[4 + (3 & 3 + var6_int)].drawTransparentWithOpacity(-(2 * var5 / 10) + param2 + this.field_v - 64, this.field_G - (-param0 + 12), 96);
                                                                                                                            if (var16 == 0) {
                                                                                                                              return;
                                                                                                                            }
                                                                                                                          }
                                                                                                                          var5 = (int)(Math.sin((double)this.field_x * 6.28 * 0.01) * 96.0);
                                                                                                                          var6_int = (this.field_x & 12) >> 2 & 3;
                                                                                                                          FlagSumHelpers.field_f[4 + var6_int].drawTransparent(-64 + this.field_v - (-param2 - var5), this.field_G + param0);
                                                                                                                          FlagSumHelpers.field_f[4 + (var6_int + 3 & 3)].drawTransparent(-var5 + param2 + (this.field_v - 64), this.field_G + param0);
                                                                                                                          FlagSumHelpers.field_f[4 + (3 & var6_int + 1)].drawTransparentWithOpacity(this.field_v + param2 + (-64 - var5 * 6 / 10), this.field_G - (-param0 + 4), 192);
                                                                                                                          FlagSumHelpers.field_f[4 + (3 & var6_int + 2)].drawTransparentWithOpacity(this.field_v + param2 - 64 + var5 * 4 / 10, -8 + (this.field_G + param0), 128);
                                                                                                                          FlagSumHelpers.field_f[(3 + var6_int & 3) + 4].drawTransparentWithOpacity(param2 + this.field_v - (64 + var5 * 2 / 10), param0 + this.field_G - 12, 96);
                                                                                                                          if (var16 == 0) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        if (this.field_x >= 128) {
                                                                                                                          QuickChatPhraseCache.fillCircleMasked(128 + this.field_x, (byte) 63, 320 - this.field_x, param2 + this.field_v, this.field_G + param0);
                                                                                                                          if (var16 == 0) {
                                                                                                                            return;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        QuickChatPhraseCache.fillCircleMasked(256 - this.field_x + 128, (byte) 72, this.field_x + 64, this.field_v + param2, param0 + this.field_G);
                                                                                                                        if (var16 == 0) {
                                                                                                                          return;
                                                                                                                        }
                                                                                                                      }
                                                                                                                      ChatLine.field_c[7 & this.field_v + this.field_G * 3].draw(-12 + param2 + this.field_v, param0 + this.field_G - 12);
                                                                                                                      BufferedMessage.fillCircleOr(param0 + this.field_G, param2 + this.field_v, 256 - Math.abs(this.field_x), 2232, 16);
                                                                                                                      if (var16 == 0) {
                                                                                                                        return;
                                                                                                                      }
                                                                                                                    }
                                                                                                                    SoftwareRasterizer.fillRadialPaletteCircle(this.field_v + param2 << 4, param0 + this.field_G << 4, 112, 250 - this.field_x, StatusMessageHelpers.field_a);
                                                                                                                    if (var16 == 0) {
                                                                                                                      return;
                                                                                                                    }
                                                                                                                  }
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle(param2 + this.field_v << 4, param0 + this.field_G << 4, 112, 250, AccountCreationHelpers.field_g);
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle(-((this.field_F / 2 + this.field_u) / 4) + (param2 + this.field_v << 4), (param0 + this.field_G << 4) + (this.field_u / 2 - this.field_F) / 4, 80, 250, AccountCreationHelpers.field_g);
                                                                                                                  SoftwareRasterizer.fillRadialPaletteCircle((this.field_v + param2 << 4) + (-this.field_u + this.field_F / 2) / 4, -((this.field_u / 2 + this.field_F) / 4) + (param0 + this.field_G << 4), 80, 250, AccountCreationHelpers.field_g);
                                                                                                                  if (var16 == 0) {
                                                                                                                    return;
                                                                                                                  }
                                                                                                                }
                                                                                                                ScreenSwitchHelpers.field_f[0].draw(-this.field_r + param2 + this.field_v, -8 + this.field_G - (-param0 - this.field_r));
                                                                                                                if (var16 == 0) {
                                                                                                                  return;
                                                                                                                }
                                                                                                              }
                                                                                                              if ((0 == this.field_y) &&
                                                                                                                (this.field_u != 0) &&
                                                                                                                (this.field_F != 0)) {
                                                                                                                var5 = (int)(Math.atan2((double)this.field_u, (double)this.field_F) * 32368.0 / 3.141592653589793);
                                                                                                                if (0 > var5) {
                                                                                                                  var5 = var5 + 65536;
                                                                                                                }
                                                                                                                this.field_x = var5;
                                                                                                              }
                                                                                                              var5 = this.field_x;
                                                                                                              QuickChatPhrase.field_x[1].drawRotatedQuarterScale(4096, param0 + this.field_G, 41, param2 + this.field_v, var5);
                                                                                                              if (this.field_y <= 0) {
                                                                                                                return;
                                                                                                              }
                                                                                                              ChatPanel.field_a[(15 & this.field_y) >> 1].draw(-32 + this.field_v + param2, -32 + (param0 + this.field_G));
                                                                                                              if (var16 == 0) {
                                                                                                                return;
                                                                                                              }
                                                                                                            }
                                                                                                            if ((0 != this.field_u) &&
                                                                                                              (0 != this.field_F)) {
                                                                                                              var5 = (int)(32368.0 * Math.atan2((double)this.field_u, (double)this.field_F) / 3.141592653589793);
                                                                                                              if (0 > var5) {
                                                                                                                var5 = var5 + 65536;
                                                                                                              }
                                                                                                              this.field_x = var5;
                                                                                                            }
                                                                                                            var5 = this.field_x;
                                                                                                            QuickChatPhrase.field_x[8].drawRotatedQuarterScale(2048, param0 + this.field_G, 122, param2 + this.field_v, var5 + 32768);
                                                                                                            if (var16 == 0) {
                                                                                                              return;
                                                                                                            }
                                                                                                          }
                                                                                                          if ((0 != this.field_u) &&
                                                                                                            (this.field_F != 0)) {
                                                                                                            var5 = (int)(32368.0 * Math.atan2((double)this.field_u, (double)this.field_F) / 3.141592653589793);
                                                                                                            if (var5 < 0) {
                                                                                                              var5 = var5 + 65536;
                                                                                                            }
                                                                                                            this.field_x = var5;
                                                                                                          }
                                                                                                          var5 = this.field_x;
                                                                                                          this.field_p.drawRotatedQuarterScale(4096, this.field_G + param0, 122, this.field_v + param2, var5 + 32768);
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
                                                                                                        ArrayWidgetContainer.field_E[var5].drawScaledAlpha(param2 + (this.field_v - 128), -128 + this.field_G + param0, 256, 256, 64);
                                                                                                        if (var16 == 0) {
                                                                                                          return;
                                                                                                        }
                                                                                                      }
                                                                                                      regionExit70: {
                                                                                                        if ((this.field_t != null) &&
                                                                                                          (6 == this.field_t.field_jb)) {
                                                                                                          if (this.field_y < 1) {
                                                                                                            ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(-64 + (this.field_v + param2), this.field_G - (-param0 + 64), 128, 128, 64);
                                                                                                            if (var16 == 0) {
                                                                                                              break regionExit70;
                                                                                                            }
                                                                                                          }
                                                                                                          ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(this.field_v - (-param2 + 64), this.field_G + (param0 - 64), 128, 128, 32);
                                                                                                          if (var16 == 0) {
                                                                                                            break regionExit70;
                                                                                                          }
                                                                                                        }
                                                                                                        if (this.field_y >= 1) {
                                                                                                          ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(-128 + (param2 + this.field_v), this.field_G + (param0 - 128), 256, 256, 32);
                                                                                                          if (var16 == 0) {
                                                                                                            break regionExit70;
                                                                                                          }
                                                                                                        }
                                                                                                        ValueListWidget.field_J[this.field_x >> 2].drawScaledAlpha(this.field_v + param2 - 128, -128 + this.field_G + param0, 256, 256, 64);
                                                                                                      }
                                                                                                      var5 = 128;
                                                                                                      if ((null != this.field_t) &&
                                                                                                        (this.field_t.field_jb == 6)) {
                                                                                                        var5 = 64;
                                                                                                      }
                                                                                                      MidiPcmStream.field_L.setDeque((byte) 36, this.field_q.field_i);
                                                                                                      var6_ref = (BattleUnit) (MidiPcmStream.field_L.first(-68));
                                                                                                      while (var6_ref != null) {
                                                                                                        if (var16 != 0) {
                                                                                                          return;
                                                                                                        }
                                                                                                        if (((this.field_t != var6_ref) ||
                                                                                                          ((6 != var6_ref.field_jb) &&
                                                                                                          (!(!((var6_ref.field_jb != 16) &&
                                                                                                          (var6_ref.field_jb != 23))) ||
                                                                                                          (55 == this.field_I))))) {
                                                                                                          var7 = this.field_v - var6_ref.field_lb;
                                                                                                          var8 = this.field_G - var6_ref.field_db + var6_ref.field_Y / 2;
                                                                                                          if ((var7 * var7 + var8 * var8 < (var5 + var6_ref.field_Y / 2) * (var5 + var6_ref.field_Y / 2)) &&
                                                                                                            (var6_ref.field_jb != 35)) {
                                                                                                            var9 = var6_ref.getSize(-8323) / 2;
                                                                                                            var10 = param2 + var6_ref.field_lb;
                                                                                                            var11 = var6_ref.field_db + param0 - var9;
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
                                                                                                    ScreenSwitchHelpers.field_f[6].draw(-this.field_r + this.field_v + param2, -this.field_r + (param0 + this.field_G));
                                                                                                    if (var16 == 0) {
                                                                                                      return;
                                                                                                    }
                                                                                                  }
                                                                                                  if (this.field_p == null) {
                                                                                                    return;
                                                                                                  }
                                                                                                  this.field_p.drawTransparent(param2 + (this.field_v - this.field_r), this.field_G + param0 - this.field_r);
                                                                                                  return;
                                                                                                }
                                                                                              }
                                                                                              var5 = 0;
                                                                                              while (var5 < 5) {
                                                                                                var6_int = -320 - (-param2 + 64);
                                                                                                var7 = -128 + param0 + this.field_q.field_H;
                                                                                                var8_double = 4.0 * ((double)var5 * 3.14) + (double)this.field_y;
                                                                                                FlagSumHelpers.field_f[(this.field_y / 6 + var5) % 6 + 8].drawTransparent((int)(Math.sin(0.1 * var8_double) * 100.0) + var6_int, -(int)(80.0 * Math.cos(var8_double * 0.1)) + var7 + 60);
                                                                                                var6_int = -64 + (320 + this.field_q.field_y + param2);
                                                                                                FlagSumHelpers.field_f[(this.field_y / 6 + var5) % 6 + 8].drawHorizontalFlip(var6_int - (int)(100.0 * Math.sin(0.1 * var8_double)), var7 - ((int)(Math.cos(0.1 * var8_double) * 80.0) - 60));
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
                                                                                            var5 = param2 + this.field_v;
                                                                                            var6_int = this.field_G + param0;
                                                                                            LoginLoadingHelpers.field_g[128].drawTransparent(-20 + var5, var6_int - 32);
                                                                                            if (var16 == 0) {
                                                                                              return;
                                                                                            }
                                                                                          }
                                                                                          if (this.field_F >= 0) {
                                                                                            var5 = this.field_v + param2;
                                                                                            var6_int = param0 + this.field_G;
                                                                                            DualLinkDeque.field_b[14].draw(var5 - 16, -12 + var6_int);
                                                                                            if (var16 == 0) {
                                                                                              return;
                                                                                            }
                                                                                          }
                                                                                          var5 = param2 + this.field_v;
                                                                                          var6_int = param0 + this.field_G;
                                                                                          DualLinkDeque.field_b[15].draw(-16 + var5, -12 + var6_int);
                                                                                          if (var16 == 0) {
                                                                                            return;
                                                                                          }
                                                                                        }
                                                                                        if (this.field_y <= 50) {
                                                                                          return;
                                                                                        }
                                                                                        var5 = -50 + this.field_y;
                                                                                        if (var5 > 15) {
                                                                                          var5 = 30 - var5;
                                                                                        }
                                                                                        var6_int = 15 * this.field_u / 17 >> 4;
                                                                                        var7 = this.field_F * 15 / 17 >> 4;
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
                                                                                          ((IndexedSprite) (Object) stackIn_508_0[stackIn_512_1]).draw(-8 + this.field_v + param2 + var6_int * var8 / 23, var7 * var8 / 23 + this.field_G + (param0 - 8));
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
                                                                                      var5 = param2 + this.field_v;
                                                                                      var6_int = this.field_G + param0 - this.field_y;
                                                                                      this.field_p.drawTransparent(-8 + var5, -8 + var6_int);
                                                                                      if (var16 == 0) {
                                                                                        return;
                                                                                      }
                                                                                    }
                                                                                    if (this.field_y < 256) {
                                                                                      var5 = this.field_v + param2;
                                                                                      var6_int = -16 + (param0 + this.field_G);
                                                                                      var7 = 0;
                                                                                      do {
                                                                                        if (!(var7 < 8)) {
                                                                                          BufferedMessage.fillCircleOr(var6_int, var5, 256, 2232, 16);
                                                                                          var5 = this.field_v + param2 + this.field_u;
                                                                                          var6_int = -16 + this.field_F + (this.field_G + param0);
                                                                                          break;
                                                                                        }
                                                                                        var8_double = (double)(var7 * 32 + this.field_y) * 3.141592653589793 / 128.0;
                                                                                        ChatLine.field_c[var7].drawQuarterSize((int)(Math.sin(var8_double) * 14.0) + (-2 + var5), (int)(Math.cos(var8_double) * 14.0) + (-2 + var6_int));
                                                                                        var7++;
                                                                                      } while (var16 == 0);
                                                                                      var7 = 0;
                                                                                      do {
                                                                                        if (!(var7 < 8)) {
                                                                                          BufferedMessage.fillCircleOr(var6_int, var5, 256, 2232, 16);
                                                                                          break;
                                                                                        }
                                                                                        var8_double = 3.141592653589793 * (double)(32 * var7 - this.field_y) / 128.0;
                                                                                        ChatLine.field_c[var7].drawQuarterSize((int)(14.0 * Math.sin(var8_double)) + var5 - 2, -2 + var6_int + (int)(Math.cos(var8_double) * 14.0));
                                                                                        var7++;
                                                                                      } while (var16 == 0);
                                                                                      if (var16 == 0) {
                                                                                        return;
                                                                                      }
                                                                                    }
                                                                                    var5 = this.field_v + param2;
                                                                                    var6_int = -16 + (param0 + this.field_G);
                                                                                    var7 = 0;
                                                                                    do {
                                                                                      if (!(var7 < 8)) {
                                                                                        BufferedMessage.fillCircleOr(var6_int, var5, 32, 2232, 16);
                                                                                        var5 = param2 + this.field_v + this.field_u;
                                                                                        var6_int = -16 + this.field_F + param0 + this.field_G;
                                                                                        break;
                                                                                      }
                                                                                      var8_double = (double)(this.field_y + 32 * var7) * 3.141592653589793 / 128.0;
                                                                                      ChatLine.field_c[var7].drawQuarterSize((int)(14.0 * Math.sin(var8_double)) - 2 + var5, var6_int - (2 - (int)(14.0 * Math.cos(var8_double))));
                                                                                      var7++;
                                                                                    } while (var16 == 0);
                                                                                    var7 = 0;
                                                                                    do {
                                                                                      if (!(var7 < 8)) {
                                                                                        BufferedMessage.fillCircleOr(var6_int, var5, 32, 2232, 16);
                                                                                        break;
                                                                                      }
                                                                                      var8_double = 3.141592653589793 * (double)(var7 * 32 - this.field_y) / 128.0;
                                                                                      ChatLine.field_c[var7].drawQuarterSize((int)(Math.sin(var8_double) * 14.0) - 2 + var5, (int)(14.0 * Math.cos(var8_double)) + (-2 + var6_int));
                                                                                      var7++;
                                                                                    } while (var16 == 0);
                                                                                    if (var16 == 0) {
                                                                                      return;
                                                                                    }
                                                                                  }
                                                                                  var5 = this.field_y;
                                                                                  if (this.field_y > 118) {
                                                                                    var5 = (15104 - this.field_y * 118) / 10;
                                                                                  }
                                                                                  var6_int = -480 + param0;
                                                                                  while (true) {
                                                                                    if (var6_int < param0 + (this.field_G + 16)) {
                                                                                      QuickChatPhraseCache.fillCircleMasked(32, (byte) 99, var5 * 2, param2 + this.field_v, var6_int);
                                                                                      var6_int += 16;
                                                                                      if (var16 == 0) {
                                                                                        continue;
                                                                                      }
                                                                                    } else {
                                                                                      QuickChatPhraseCache.fillCircleMasked(var5 * 2, (byte) 103, 2 * var5, this.field_v + param2, this.field_G + param0);
                                                                                    }
                                                                                    break;
                                                                                  }
                                                                                  if (var16 == 0) {
                                                                                    return;
                                                                                  }
                                                                                }
                                                                                var5 = this.field_y;
                                                                                if (this.field_y > 118) {
                                                                                  var5 = (-(this.field_y * 118) + 15104) / 10;
                                                                                }
                                                                                {
                                                                                  boolean decompiledFrameCompleted0 = true;
                                                                                  if (this.field_y < 128) {
                                                                                    var6_int = -480 + param0;
                                                                                    while (~(16 + this.field_G + param0) < ~var6_int) {
                                                                                      QuickChatPhraseCache.fillCircleMasked(32, (byte) 81, 2 * var5, param2 + this.field_v, var6_int);
                                                                                      var6_int += 16;
                                                                                      if (var16 != 0) {
                                                                                        decompiledFrameCompleted0 = false;
                                                                                        break;
                                                                                      }
                                                                                      continue;
                                                                                    }
                                                                                    if (decompiledFrameCompleted0) {
                                                                                      BufferedMessage.fillCircleOr(param0 + this.field_G, param2 + this.field_v, var5 * 2, 2232, var5 * 2);
                                                                                    }
                                                                                  }
                                                                                }
                                                                                if (var16 == 0) {
                                                                                  return;
                                                                                }
                                                                              }
                                                                              if (this.field_t == null) {
                                                                                return;
                                                                              }
                                                                              var5 = this.field_x;
                                                                              if (this.field_x > 128) {
                                                                                var5 = -this.field_x + 256;
                                                                              }
                                                                              var6_int = this.field_t.field_Y >> 1;
                                                                              if (this.field_t.field_jb == 9) {
                                                                                var6_int = 24;
                                                                              }
                                                                              QuickChatPhraseCache.fillCircleMasked(var6_int, (byte) 62, var5, this.field_v + param2, -var6_int + (this.field_G + param0));
                                                                              if (var16 == 0) {
                                                                                return;
                                                                              }
                                                                            }
                                                                            if (null == this.field_t) {
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
                                                                                  var11 = this.field_t.field_lb + var8 + param2;
                                                                                  var12 = -(this.field_t.field_Y / 2) + var9 + (param0 + this.field_t.field_db);
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
                                                                          if (this.field_t == null) {
                                                                            return;
                                                                          }
                                                                          var5 = this.field_t.field_Y >> 1;
                                                                          var8 = 512 * SpriteState.field_v;
                                                                          var9 = 0;
                                                                          while (var9 < 16) {
                                                                            var6_int = (int)((double)(param2 + this.field_v) + Math.sin(0.12 * (double)SpriteState.field_v + 0.6 * (double)var9) * (double)var5);
                                                                            var7 = (int)((double)(param0 + this.field_G - var5) + Math.cos((double)SpriteState.field_v * 0.12 + (double)var9 * 0.6) * (double)var5);
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
                                                                        if (null == this.field_t) {
                                                                          return;
                                                                        }
                                                                        var5 = this.field_t.field_Y >> 1;
                                                                        var8 = 512 * SpriteState.field_v;
                                                                        var6_int = (int)((double)(this.field_v + param2) + Math.sin((double)SpriteState.field_v * 0.1 - 1.6) * (double)var5);
                                                                        var7 = (int)((double)(-var5 + param0 + this.field_G) + (double)var5 * Math.cos(0.09 * (double)SpriteState.field_v - 1.6));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(2000, var7, 127, var6_int, var8);
                                                                        var6_int = (int)((double)(this.field_v + param2) + (double)var5 * Math.sin((double)SpriteState.field_v * 0.1 - 0.8));
                                                                        var7 = (int)((double)(this.field_G + param0 - var5) + (double)var5 * Math.cos(-0.8 + 0.09 * (double)SpriteState.field_v));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(2500, var7, 124, var6_int, var8);
                                                                        var6_int = (int)((double)(this.field_v + param2) + Math.sin(0.1 * (double)SpriteState.field_v) * (double)var5);
                                                                        var7 = (int)((double)(-var5 + this.field_G + param0) + (double)var5 * Math.cos((double)SpriteState.field_v * 0.09));
                                                                        DualLinkDeque.field_b[13].toRgbSprite().drawRotatedQuarterScale(3000, var7, 123, var6_int, var8);
                                                                        if (var16 == 0) {
                                                                          return;
                                                                        }
                                                                      }
                                                                      var5 = 2000 * SpriteState.field_v;
                                                                      this.field_p.drawRotatedQuarterScale(4096, param0 + this.field_G, -43, param2 + this.field_v, var5);
                                                                      if (var16 == 0) {
                                                                        return;
                                                                      }
                                                                    }
                                                                    if (null == this.field_t) {
                                                                      return;
                                                                    }
                                                                    var5 = this.field_x;
                                                                    if (this.field_x > 128) {
                                                                      var5 = 256 - this.field_x;
                                                                    }
                                                                    QuickChatPhraseCache.fillCircleMasked(this.field_t.field_Y >> 1, (byte) 70, 128 + var5, this.field_v + param2, -(this.field_t.field_Y >> 1) + this.field_G + param0);
                                                                    var6_int = 0;
                                                                    while (3 > var6_int) {
                                                                      var7 = (int)(Math.sin((double)(this.field_x + var6_int * 256 / 3) * 3.141592653589793 / 128.0) * (double)(this.field_t.field_Y >> 1));
                                                                      var8 = (int)(Math.cos(3.141592653589793 * (double)(var6_int * 256 / 3 + this.field_x) / 128.0) * (double)(this.field_t.field_Y >> 1));
                                                                      QuickChatPhraseCache.fillCircleMasked(this.field_t.field_Y >> 2, (byte) 68, var5 + 128, var7 + (param2 + this.field_v), -(this.field_t.field_Y >> 1) + var8 + param0 + this.field_G);
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
                                                                  QuickChatPhraseCache.fillCircleMasked(32, (byte) 88, 256, this.field_v + param2, param0 + this.field_G);
                                                                  if (var16 == 0) {
                                                                    return;
                                                                  }
                                                                }
                                                                QuickChatPhraseCache.fillCircleMasked(64, (byte) 97, 256, this.field_v + param2, param0 + this.field_G);
                                                                if (var16 == 0) {
                                                                  return;
                                                                }
                                                              }
                                                              QuickChatPhraseCache.fillCircleMasked(16, (byte) 94, 256, param2 + this.field_v, param0 + this.field_G);
                                                              if (var16 == 0) {
                                                                return;
                                                              }
                                                            }
                                                            QuickChatPhraseCache.fillCircleMasked(8, (byte) 79, -(this.field_y << 3) + 256, param2 + this.field_v, this.field_G + param0);
                                                            if (var16 == 0) {
                                                              return;
                                                            }
                                                          }
                                                          QuickChatPhraseCache.fillCircleMasked(80, (byte) 120, -(this.field_y << 3) + 256, param2 + this.field_v, param0 + this.field_G);
                                                          if (this.field_y >= 32) {
                                                            return;
                                                          }
                                                          QuickChatPhraseCache.fillCircleMasked(32 * this.field_y + 60, (byte) 64, -(256 - (this.field_y << 3)), this.field_v + param2, param0 + this.field_G);
                                                          if (var16 == 0) {
                                                            return;
                                                          }
                                                        }
                                                        BufferedMessage.fillCircleOr(param0 + this.field_G, param2 + this.field_v, 256, 2232, 8);
                                                        if (var16 == 0) {
                                                          return;
                                                        }
                                                      }
                                                      BufferedMessage.fillCircleOr(param0 + this.field_G, this.field_v + param2, 256, 2232, 10);
                                                      if (this.field_y <= 225) {
                                                        return;
                                                      }
                                                      BufferedMessage.fillCircleOr(this.field_G + param0, this.field_v + param2, (256 * this.field_y - 57600) / 25, 2232, 96);
                                                      if (var16 == 0) {
                                                        return;
                                                      }
                                                    }
                                                    BufferedMessage.fillCircleOr(param0 + this.field_G, param2 + this.field_v, 256 * this.field_y / 25, 2232, 96);
                                                    if (var16 == 0) {
                                                      return;
                                                    }
                                                  }
                                                  if (this.field_t == null) {
                                                    return;
                                                  }
                                                  BufferedMessage.fillCircleOr(this.field_G + param0, this.field_v + param2, this.field_y * 256 / this.field_t.field_ib, 2232, this.field_t.field_Y + 2 * this.field_t.field_ib);
                                                  if (var16 == 0) {
                                                    return;
                                                  }
                                                }
                                                SoftwareRasterizer.fillCircleAlpha(param2 + this.field_v, param0 + this.field_G, 16, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(param2 + this.field_v, this.field_G + param0, 18, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(param2 + this.field_v, this.field_G + param0, 20, 0, 64);
                                                SoftwareRasterizer.fillCircleAlpha(this.field_v + param2, this.field_G + param0, 22, 0, 64);
                                                if (var16 == 0) {
                                                  return;
                                                }
                                              }
                                              if (null == DisplayNameForm.field_E) {
                                                return;
                                              }
                                              DisplayNameForm.field_E[this.field_H].draw(-50 + (this.field_v + param2), this.field_G - (-param0 + 50));
                                              if (var16 == 0) {
                                                return;
                                              }
                                            }
                                            if (DiskCacheWorker.field_a == null) {
                                              return;
                                            }
                                            DiskCacheWorker.field_a[this.field_H].draw(param2 + this.field_v - 50, -50 + param0 + this.field_G);
                                            if (var16 == 0) {
                                              return;
                                            }
                                          }
                                          if (null == MouseInputHandler.field_a) {
                                            return;
                                          }
                                          MouseInputHandler.field_a[this.field_H].draw(-50 + this.field_v + param2, -50 + param0 + this.field_G);
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
                                        PaletteSpriteHelpers.field_k[this.field_H].draw(-8 + (this.field_v + param2), this.field_G - (-param0 + 8));
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
                                      DebouncedValidator.field_b[this.field_H].draw(-8 + (param2 + this.field_v), -8 + (param0 + this.field_G));
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
                                    FadingModalPanel.field_M[this.field_H].draw(-8 + (this.field_v + param2), -8 + this.field_G + param0);
                                    if (var16 == 0) {
                                      return;
                                    }
                                  }
                                  if (null == AccountCreationHelpers.field_f) {
                                    return;
                                  }
                                  if (null == this.field_t) {
                                    return;
                                  }
                                  if (this.field_y < 250) {
                                    AccountCreationHelpers.field_f[this.field_x >> 2].draw(-25 + this.field_v + param2, -65 + (param0 + this.field_G));
                                    if (var16 == 0) {
                                      return;
                                    }
                                  }
                                  AccountCreationHelpers.field_f[this.field_x >> 2].drawAlpha(-25 + (param2 + this.field_v), param0 + (this.field_G - 65), 64);
                                  if (var16 == 0) {
                                    return;
                                  }
                                }
                                if (null == IterableNodeHashTable.field_a) {
                                  return;
                                }
                                if (this.field_t == null) {
                                  return;
                                }
                                if (this.field_y >= 250) {
                                  IterableNodeHashTable.field_a[this.field_x >> 1].draw(param2 + (this.field_v - 24), -(this.field_t.field_Y >> 1) + this.field_G - (-param0 + 32));
                                  if (var16 == 0) {
                                    return;
                                  }
                                }
                                IterableNodeHashTable.field_a[this.field_x >> 1].draw(param2 + this.field_v - 24, this.field_G + param0 + (-32 - (this.field_t.field_Y >> 1)));
                                if (var16 == 0) {
                                  return;
                                }
                              }
                              if (ChatPanel.field_a == null) {
                                return;
                              }
                              if (this.field_t == null) {
                                return;
                              }
                              if (5 > this.field_y) {
                                ChatPanel.field_a[this.field_x >> 1].draw(-32 + (param2 + this.field_v), this.field_G + param0 + (-32 - (this.field_t.field_Y >> 1)));
                                if (var16 == 0) {
                                  return;
                                }
                              }
                              ChatPanel.field_a[this.field_x >> 1].drawAlpha(-32 + (this.field_v + param2), this.field_G + (param0 + (-32 - (this.field_t.field_Y >> 1))), 64);
                              if (var16 == 0) {
                                return;
                              }
                            }
                            if (null == BirthDateEntryPanel.field_S) {
                              return;
                            }
                            if (this.field_y < 250) {
                              BirthDateEntryPanel.field_S[this.field_x >> 1].draw(param2 + this.field_v - 25, -64 + (this.field_G + param0));
                              if (var16 == 0) {
                                return;
                              }
                            }
                            BirthDateEntryPanel.field_S[this.field_x >> 1].drawAlpha(-25 + param2 + this.field_v, this.field_G + param0 - 64, 64);
                            if (var16 == 0) {
                              return;
                            }
                          }
                          if (StatusDialog.field_Tb == null) {
                            return;
                          }
                          StatusDialog.field_Tb[this.field_H].draw(-50 + param2 + this.field_v, -50 + (param0 + this.field_G));
                          if (var16 == 0) {
                            return;
                          }
                        }
                        if (null == ChatLine.field_l) {
                          return;
                        }
                        ChatLine.field_l[this.field_H].draw(param2 + this.field_v - 50, -50 + (this.field_G + param0));
                        if (var16 == 0) {
                          return;
                        }
                      }
                      if (null == MusicPatchNode.field_E) {
                        return;
                      }
                      MusicPatchNode.field_E[this.field_H].draw(this.field_v - (-param2 + 50), -50 + param0 + this.field_G);
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
                    UrlHelpers.field_c[this.field_H].draw(-8 + (param2 + this.field_v), -8 + (this.field_G + param0));
                    if (var16 == 0) {
                      return;
                    }
                  }
                  if (null == HuffmanCodec.field_j) {
                    return;
                  }
                  HuffmanCodec.field_j[this.field_H].draw(-50 + (param2 + this.field_v), param0 + this.field_G - 50);
                  if (var16 == 0) {
                    return;
                  }
                }
                if (null == BirthDateEntryPanel.field_N) {
                  return;
                }
                BirthDateEntryPanel.field_N[this.field_H].draw(this.field_v + param2 - 50, -50 + param0 + this.field_G);
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
              CookieHelpers.field_j[this.field_H].draw(param2 + (this.field_v - 8), -8 + this.field_G + param0);
              if (var16 == 0) {
                return;
              }
            }
            if (this.field_x != 0) {
              var5_double = Math.sqrt((double)(this.field_F * this.field_F + this.field_u * this.field_u));
              SoftwareRasterizer.fillCircleAlpha(this.field_v + param2, this.field_G + param0, 5, 35071, 96);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.field_u) / var5_double) + (double)(this.field_v + param2)), (int)(-((double)(6 * this.field_F) / var5_double) + (double)(param0 + this.field_G)), 4, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(8 * this.field_u) / var5_double) + (double)(param2 + this.field_v)), (int)((double)(param0 + this.field_G) - (double)(this.field_F * 8) / var5_double), 3, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.field_u * 10) / var5_double) + (double)(this.field_v + param2)), (int)(-((double)(this.field_F * 10) / var5_double) + (double)(this.field_G + param0)), 2, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.field_u * 12) / var5_double) + (double)(this.field_v + param2)), (int)(-((double)(12 * this.field_F) / var5_double) + (double)(this.field_G + param0)), 1, 35071, 64);
              SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.field_u) / var5_double) + (double)(this.field_v + param2)), (int)((double)(param0 + this.field_G) - (double)(this.field_F * 6) / var5_double), 3, 8978431, 32);
              SoftwareRasterizer.fillCircleAlpha((int)((double)(this.field_v + param2) - (double)(8 * this.field_u) / var5_double), (int)((double)(this.field_G + param0) - (double)(this.field_F * 8) / var5_double), 2, 8978431, 32);
              SoftwareRasterizer.fillCircleAlpha(param2 + this.field_v, param0 + this.field_G, 4, 8978431, 64);
              SoftwareRasterizer.fillCircleAlpha(this.field_v - (-param2 + 1), -1 + param0 + this.field_G, 2, 16777215, 32);
              return;
            }
            if (null == ResizableModalPanel.field_db) {
              return;
            }
            if (this.field_H < 0) {
              return;
            }
            ResizableModalPanel.field_db[this.field_H].drawScaled(-8 + (param2 + this.field_v), -8 + (this.field_G + param0), 16, 16);
            if (var16 == 0) {
              return;
            }
          }
          var5_double = Math.sqrt((double)(this.field_F * this.field_F + this.field_u * this.field_u));
          SoftwareRasterizer.fillCircleAlpha(param2 + this.field_v, this.field_G + param0, 6, 35071, 192);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.field_u) / var5_double) + (double)(this.field_v + param2)), (int)((double)(param0 + this.field_G) - (double)(6 * this.field_F) / var5_double), 5, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.field_u * 8) / var5_double) + (double)(param2 + this.field_v)), (int)((double)(param0 + this.field_G) - (double)(this.field_F * 8) / var5_double), 4, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(this.field_u * 10) / var5_double) + (double)(this.field_v + param2)), (int)((double)(this.field_G + param0) - (double)(this.field_F * 10) / var5_double), 3, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)((double)(this.field_v + param2) - (double)(this.field_u * 12) / var5_double), (int)((double)(this.field_G + param0) - (double)(12 * this.field_F) / var5_double), 2, 35071, 128);
          SoftwareRasterizer.fillCircleAlpha((int)(-((double)(6 * this.field_u) / var5_double) + (double)(param2 + this.field_v)), (int)((double)(param0 + this.field_G) - (double)(6 * this.field_F) / var5_double), 4, 8978431, 64);
          SoftwareRasterizer.fillCircleAlpha((int)((double)(param2 + this.field_v) - (double)(8 * this.field_u) / var5_double), (int)((double)(param0 + this.field_G) - (double)(8 * this.field_F) / var5_double), 3, 8978431, 64);
          SoftwareRasterizer.fillCircleAlpha(this.field_v + param2, param0 + this.field_G, 5, 8978431, 128);
          SoftwareRasterizer.fillCircleAlpha(-1 + this.field_v + param2, -1 + (this.field_G + param0), 3, 16777215, 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "mi.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawOrbitEffect(int param0) {
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
          if (param0 < 9) {
            this.field_x = 106;
          }
          var4 = 0;
          var5 = 64;
          if (this.field_t != null &&
            this.field_q.field_x[this.field_t.field_u] == 6) {
            var5 = var5 + this.field_q.field_X[this.field_t.field_u] * 16 / 20;
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
                        !this.field_q.spriteOverlapsTerrain(-var10 + (this.field_G - 8), 2, this.field_v - (-var9 + 8), var3)) {
                        this.field_q.carveTerrainAndSprite(-8 - var10 + this.field_G, -12, var9 + this.field_v - 8, var3);
                      }
                    } else {
                      if (!this.field_q.spriteOverlapsTerrain(-8 + (-var10 + this.field_G), 2, var9 + (this.field_v - 8), var2[var4])) {
                        this.field_q.carveTerrainAndSprite(-8 + (-var10 + this.field_G), -90, this.field_v + var9 - 8, var2[var4]);
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
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "mi.HA(" + param0 + ')');
        }
    }

    SpellProjectile(int param0, int param1, int param2, int param3, BattleUnit param4, Battle param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.initialize(-103, param0, param3, param2, param1, param5, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    SpellProjectile(Battle param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_q = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("mi.<init>(");
          if (param0 == null) {
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
