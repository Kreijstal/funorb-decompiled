/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Explosion extends DualNode {
    private Projectile projectile;
    static int field_P;
    private CombatWorld world;
    private int durationTicks;
    private int field_N;
    int field_G;
    int worldX;
    int worldY;
    int velocityX;
    static RgbSprite field_L;
    static String field_Q;
    private boolean field_R;
    boolean field_O;
    static RgbSprite field_B;
    static RgbSprite[] field_S;
    int velocityY;
    static String field_E;
    int field_K;
    private int field_y;
    private Sentinel[] affectedSentinels;
    static String field_W;
    int field_U;
    int field_F;
    private int ageTicks;
    static NodeDeque field_A;
    static RgbSprite[] field_J;
    static SceneWidget field_C;
    static fm field_D;

    final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        if (!ka.field_V) {
          return;
        }
        var4 = param1 + (this.worldX >> 8);
        var5 = param0 + (this.worldY >> 8);
        var6 = 2 % ((param2 - 30) / 54);
        var7 = (this.ageTicks + (-this.ageTicks + this.durationTicks) / 4) * this.field_U / this.durationTicks;
        var8 = var7 >> 4;
        var9 = this.durationTicks / 2;
        var10 = 2500;
        if (null != this.projectile) {
          var10 = this.projectile.field_O * 25;
          if (var10 > 2500) {
            var10 = 2500;
          }
        }
        if (0 < var8) {
          boolean decompiledFrameRemainder0 = true;
          if (this.projectile != null &&
            300 < this.projectile.field_O) {
            if (this.ageTicks < var9) {
              qh.b(var10 * this.ageTicks * 10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
              decompiledFrameRemainder0 = (SteelSentinels.obfuscationControl != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (this.ageTicks < (2 * var9))) {
              qh.b(10 * (2 * var9 - this.ageTicks) * var10 / var9, var5 << 4, 15, var4 << 4, var8 << 4);
              return;
            }
          }
        }
        return;
    }

    final static RgbSprite[] g(int param0) {
        RgbSprite[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        byte[] var10 = null;
        int[] var11 = null;
        int stackIn_13_0 = 0;
        var7 = SteelSentinels.obfuscationControl;
        if (param0 != 7) {
          return (RgbSprite[]) null;
        }
        var1 = new RgbSprite[rl.field_d];
        var2 = 0;
        scanLoop1: while (true) {
          if (rl.field_d > var2) {
            var3 = le.field_L[var2] * ca.field_r[var2];
            var10 = dl.field_L[var2];
            var11 = new int[var3];
            var9 = var11;
            var5 = var9;
            stackIn_13_0 = 0;
            if (var7 != 0) {
              break scanLoop1;
            }
            var6 = stackIn_13_0;
            while (var3 > var6) {
              var5[var6] = ba.field_d[ec.a((int) var10[var6], 255)];
              var6++;
            }
            var1[var2] = new RgbSprite(un.field_n, eb.field_n, rl.field_a[var2], oa.field_M[var2], le.field_L[var2], ca.field_r[var2], var11);
            var2++;
            continue scanLoop1;
          }
          stackIn_13_0 = 9324;
          break;
        }
        NodeHashTable.a(stackIn_13_0);
        return var1;
    }

    final void advanceExplosion(boolean obfuscationGuard) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        double stackIn_51_0 = 0.0;
        int stackIn_52_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        NodeIterator var4_ref_jc = null;
        double var5_double = 0.0;
        Projectile var5_ref_wl = null;
        int var5 = 0;
        int var6 = 0;
        Sentinel var7_ref_mb = null;
        Object var7_ref = null;
        ParticleEffect var7_ref_qb = null;
        int var7 = 0;
        double var8_double = 0.0;
        int var8_int = 0;
        Sentinel var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        NodeIterator var14 = null;
        Sentinel[] var15 = null;
        IsaacRandom var16 = null;
        Sentinel var17 = null;
        int stackIn_25_0Lifetime1;
        int stackIn_25_1Lifetime1;
        int var7Lifetime1;
        int var8_intLifetime1;
        var13 = SteelSentinels.obfuscationControl;
        var2 = 0;
        while (true) {
          stackIn_2_0 = this.field_N;
          stackIn_2_1 = var2;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_2_0 >= stackIn_2_1) {
            this.worldY = this.worldY + this.velocityY;
            this.worldX = this.worldX + this.velocityX;
            stackIn_266_0 = ~this.world.terrain.getGroundHeightAt((byte) -105, this.worldX >> 4);
            stackIn_266_1 = ~-(this.worldY >> 4);
            if (var13 == 0) {
              if (stackIn_266_0 < stackIn_266_1) {
                this.worldY = -(this.world.terrain.getGroundHeightAt((byte) -124, this.worldX >> 4) << 4);
              }
              var3 = this.field_G * this.ageTicks / (this.durationTicks * 2);
              if (var3 == 0 &&
                0 < this.ageTicks) {
                var3 = 1;
              }
              this.ageTicks = this.ageTicks + 1;
              var4 = this.ageTicks * this.field_G / (this.durationTicks * 2);
              if (this.projectile != null &&
                this.affectedSentinels != null && (this.projectile.effectType == 7 ||
                this.projectile.sourceWeaponType == 9) && (this.ageTicks & 63) == 0) {
                var14 = new NodeIterator(this.world.sentinels);
                var6 = 0;
                var7_ref_mb = (Sentinel) (var14.b(2));
                while (var7_ref_mb != null) {
                  stackIn_25_0 = var6;
                  stackIn_25_1 = this.affectedSentinels.length;
                  if (stackIn_25_0 == stackIn_25_1) {
                    var15 = this.affectedSentinels;
                    this.affectedSentinels = new Sentinel[this.world.sentinels.size((byte) -128)];
                    ii.a(var15, 0, this.affectedSentinels, 0, var6);
                  }
                  this.affectedSentinels[var6] = var7_ref_mb;
                  var6++;
                  var7_ref_mb = (Sentinel) (var14.d(2));
                }
                while (true) {
                  stackIn_25_0Lifetime1 = ~var6;
                  stackIn_25_1Lifetime1 = ~this.affectedSentinels.length;
                  if (stackIn_25_0Lifetime1 <= stackIn_25_1Lifetime1) {
                    break;
                  }
                  this.affectedSentinels[var6] = null;
                  var6++;
                }
              }
              if (var4 == 0) {
                var4 = 1;
              }
              if (!this.world.field_h) {
                while (var4 > var3) {
                  var5_double = 3.141592653589793 * Math.random() * 2.0;
                  var7_ref = null;
                  stackIn_2_0 = 0;
                  stackIn_2_1 = this.field_K;
                  if (stackIn_2_0 == stackIn_2_1) {
                    var8_double = (Math.random() * (double)(-this.ageTicks + this.durationTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks + 1.0;
                    var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                    var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                    var7_ref_qb = ArticulatedPart.createParticle(1, 0, this.world, 126, this.worldY + var11 / 2, this.field_R, 150, 0, var10 / 2 + this.worldX, this.field_y);
                    this.world.pendingParticles.addLast(3, var7_ref_qb);
                    if (10 > this.ageTicks) {
                      var12 = 25;
                      var7_ref_qb = ArticulatedPart.createParticle(10, (int)((double)(var12 * var10) / var8_double), this.world, 95, var11 + this.worldY, this.field_R, 100, (int)((double)(var12 * var11) / var8_double), var10 + this.worldX, this.field_y);
                      this.world.pendingParticles.addLast(3, var7_ref_qb);
                    }
                    var7_ref_qb = ArticulatedPart.createParticle(0, var10 >> 4, this.world, 94, this.worldY + var11 / 2, this.field_R, 300, -(10 * this.ageTicks) + (var11 >> 4), var10 / 2 + this.worldX, this.field_y);
                    this.world.pendingParticles.addLast(3, var7_ref_qb);
                  } else {
                    if (this.field_K != 1) {
                      if (this.field_K == 2) {
                        var8_double = (Math.random() * (double)(this.durationTicks - this.ageTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                        var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                        var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                        var7_ref_qb = ArticulatedPart.createParticle(1, 0, this.world, 125, var11 / 2 + this.worldY, this.field_R, 50, 0, this.worldX + var10 / 2, this.field_y);
                        this.world.pendingParticles.addLast(3, var7_ref_qb);
                        var12 = 0;
                        while (var12 < 5) {
                          var7_ref_qb = ArticulatedPart.createParticle(0, (int)(-64.0 + 128.0 * Math.random()) + (var10 >> 5), this.world, 117, this.worldY + var11 / 2, this.field_R, 200, (var11 >> 5) + (int)(128.0 * Math.random() - 64.0), this.worldX + var10 / 2, this.field_y);
                          var12++;
                        }
                        if (this.projectile.sourceWeaponType != 32 &&
                          this.projectile.sourceWeaponType != -2) {
                          fc.a((byte) -69, 91, this.worldX);
                        }
                        this.world.pendingParticles.addLast(3, var7_ref_qb);
                      } else {
                        if (this.field_K == 3) {
                          var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                          var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                          var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                          var7_ref_qb = ArticulatedPart.createParticle(4, 0, this.world, 95, this.worldY + var11, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                          this.world.pendingParticles.addLast(3, var7_ref_qb);
                        } else {
                          if (4 != this.field_K) {
                            if (5 == this.field_K) {
                              var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                              var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                              var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                              var7_ref_qb = ArticulatedPart.createParticle(5, 0, this.world, 104, this.worldY - (-(var11 / 256) + 3584), this.field_R, 100, 0, this.worldX + var10 / 256, this.field_y);
                              this.world.pendingParticles.addLast(3, var7_ref_qb);
                              var10 = (int)(Math.sin((double)var3 * 0.2) * var8_double) << 4;
                              var11 = (int)(var8_double * Math.cos((double)var3 * 0.2)) << 4;
                              var7_ref_qb = ArticulatedPart.createParticle(5, 0, this.world, 95, this.worldY + var11, this.field_R, 100, 0, this.worldX + var10, this.field_y);
                              this.world.pendingParticles.addLast(3, var7_ref_qb);
                            } else {
                              if (this.field_K != 6) {
                                if (this.field_K == 7) {
                                  var8_double = Math.random() * (double)((-this.ageTicks + this.durationTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                  var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                  var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                  var7_ref_qb = ArticulatedPart.createParticle(4, 0, this.world, 112, var11 + this.worldY, this.field_R, 100, 0, this.worldX + var10, this.field_y);
                                  this.world.pendingParticles.addLast(3, var7_ref_qb);
                                } else {
                                  if (8 == this.field_K) {
                                    var8_double = (double)(this.ageTicks * this.field_U / this.durationTicks);
                                    var10 = (int)(var8_double * Math.sin(0.2 * (double)var3)) << 4;
                                    var11 = (int)(var8_double * Math.cos(0.2 * (double)var3)) << 4;
                                    var7_ref_qb = ArticulatedPart.createParticle(5, 0, this.world, 99, this.worldY + var11, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                                    this.world.pendingParticles.addLast(3, var7_ref_qb);
                                    var7_ref_qb = ArticulatedPart.createParticle(5, 0, this.world, 113, -var11 + this.worldY, this.field_R, 100, 0, this.worldX - var10, this.field_y);
                                    this.world.pendingParticles.addLast(3, var7_ref_qb);
                                  } else {
                                    if (this.field_K == 9) {
                                      var8_double = Math.random() * (double)((-this.ageTicks + this.durationTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                      stackIn_51_0 = var8_double;
                                      if (Math.sin(var5_double) < 0.0) {
                                        stackIn_52_1 = -1;
                                      } else {
                                        stackIn_52_1 = 1;
                                      }
                                      var10 = (int)(stackIn_51_0 * (double)stackIn_52_1) << 4;
                                      var7_ref_qb = ArticulatedPart.createParticle(0, 0, this.world, 102, 0, this.field_R, 50, 0, this.worldX + var10, this.field_y);
                                      this.world.pendingParticles.addLast(3, var7_ref_qb);
                                    }
                                  }
                                }
                              } else {
                                var8_double = Math.random() * (double)(this.ageTicks + (this.durationTicks - this.ageTicks) / 4) * (double)this.field_U / (double)this.durationTicks;
                                var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                                var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                var7_ref_qb = ArticulatedPart.createParticle(0, 0, this.world, 111, var11 + this.worldY, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                                var7_ref_qb.velocityY = (int)(2000.0 * -Math.random());
                                this.world.pendingParticles.addLast(3, var7_ref_qb);
                              }
                            }
                          } else {
                            var8_double = (Math.random() * (double)(-this.ageTicks + this.durationTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                            var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                            var7_ref_qb = ArticulatedPart.createParticle(1, 0, this.world, 114, this.worldY + var11, this.field_R, 150, 0, this.worldX + var10, this.field_y);
                            this.world.pendingParticles.addLast(3, var7_ref_qb);
                            var7_ref_qb = ArticulatedPart.createParticle(0, var10 >> 5, this.world, 115, this.worldY + var11 / 2, this.field_R, 300, var11 >> 5, this.worldX + var10 / 2, this.field_y);
                            this.world.pendingParticles.addLast(3, var7_ref_qb);
                          }
                        }
                      }
                    } else {
                      var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                      var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                      var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                      var7_ref_qb = ArticulatedPart.createParticle(3, 0, this.world, 104, this.worldY + var11, this.field_R, 50, 0, var10 + this.worldX, this.field_y);
                      this.world.pendingParticles.addLast(3, var7_ref_qb);
                    }
                  }
                  var3++;
                }
              }
              var2++;
              continue;
            }
          } else {
            if (obfuscationGuard) {
              return;
            }
            this.field_F = this.field_U * (this.ageTicks + (-this.ageTicks + this.durationTicks) / 4) / this.durationTicks;
            if (this.field_O) {
              var2 = this.field_F * this.field_F;
              var16 = new IsaacRandom(new int[]{this.world.simulationTick, this.worldX, this.worldY});
              var4_ref_jc = new NodeIterator(this.world.field_db);
              var5_ref_wl = (Projectile) (var4_ref_jc.b(2));
              while (var5_ref_wl != null) {
                var6 = -var5_ref_wl.worldX + this.worldX >> 4;
                var7 = -var5_ref_wl.worldY + this.worldY >> 4;
                stackIn_266_0 = ~var5_ref_wl.effectType;
                stackIn_266_1 = -3;
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if ((stackIn_266_0 == stackIn_266_1 ||
                  var5_ref_wl.effectType == 3 ||
                  var5_ref_wl.effectType == 20) &&
                  (var5_ref_wl.sourceWeaponType != 32 &&
                  var2 >= (var7 * var7 + var6 * var6))) {
                  if (null != var5_ref_wl.sourceSentinel &&
                    this.projectile.sourceSentinel != var5_ref_wl.sourceSentinel) {
                    this.projectile.sourceSentinel.field_ob = this.projectile.sourceSentinel.field_ob + 1;
                  }
                  var5_ref_wl.field_bb = true;
                  if (var5_ref_wl.effectType != 20) {
                    var5_ref_wl.field_T = true;
                  }
                  var5_ref_wl.sourceSentinel = this.projectile.sourceSentinel;
                }
                if (8 == var5_ref_wl.effectType &&
                  var6 * var6 + var7 * var7 <= var2 &&
                  8 >= var16.nextIntBounded(93, 100)) {
                  var5_ref_wl.field_bb = true;
                  if (null != var5_ref_wl.sourceSentinel &&
                    var5_ref_wl.sourceSentinel != this.projectile.sourceSentinel) {
                    this.projectile.sourceSentinel.field_ob = this.projectile.sourceSentinel.field_ob + 1;
                  }
                  var5_ref_wl.sourceSentinel = this.projectile.sourceSentinel;
                }
                var5_ref_wl = (Projectile) (var4_ref_jc.d(2));
              }
            }
            if (decompiledFrameCompleted1) {
              if (this.affectedSentinels != null &&
                this.projectile.field_O > 0) {
                var2 = 0;
                while (this.affectedSentinels.length > var2) {
                  var17 = this.affectedSentinels[var2];
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  regionExit1: {
                    if (var17 != null) {
                      stackIn_111_0 = (this.field_R) ? 0 : 1;
                      if (var17.field_u) {
                        stackIn_114_1 = 0;
                      } else {
                        stackIn_114_1 = 1;
                      }
                      if ((stackIn_111_0 == stackIn_114_1 ||
                        this.world.terrain.getSurfaceProfileAt((byte) 127, var17.worldX >> 4) == this.world.terrain.getSecondaryHeightAt(false, var17.worldX >> 4)) && (var17.field_o == -1 ||
                        this.projectile.sourceWeaponType == var17.field_o ||
                        var13 != 0)) {
                        var4 = this.worldX - var17.worldX >> 4;
                        var5 = 768 + (-var17.worldY + this.worldY) >> 4;
                        if (Math.abs(var4) <= this.field_F &&
                          this.field_F * this.field_F >= var4 * var4 + var5 * var5) {
                          if (9 == this.projectile.effectType &&
                            this.projectile.sourceSentinel != null) {
                            if (1 == this.projectile.sourceSentinel.field_fb) {
                              var17.velocityY = var17.velocityY - 80000 / var17.maximumArmour;
                              var17.velocityX = var17.velocityX + 400000 * this.projectile.sourceSentinel.field_E / var17.maximumArmour;
                            }
                            if (2 == this.projectile.sourceSentinel.field_fb) {
                              if (this.projectile.sourceSentinel.worldX <= var17.worldX) {
                                var17.velocityX = var17.velocityX + 200000 / var17.maximumArmour;
                              }
                              var17.velocityY = var17.velocityY - 200000 / var17.maximumArmour;
                              if (var17.worldX < this.projectile.sourceSentinel.worldX) {
                                var17.velocityX = var17.velocityX - 200000 / var17.maximumArmour;
                              }
                            }
                            if (this.projectile.sourceSentinel.field_fb == 3) {
                              var17.velocityY = var17.velocityY - 160000 / var17.maximumArmour;
                              var17.velocityX = var17.velocityX + 80000 * this.projectile.sourceSentinel.field_E / var17.maximumArmour;
                            }
                          }
                          this.affectedSentinels[var2] = null;
                          var6 = ik.a(var5 * var5 + var4 * var4, -117);
                          if (var6 > this.field_U / 2 &&
                            this.projectile.effectType != 9) {
                            var7Lifetime1 = this.projectile.field_O * (this.field_U - var6) / (this.field_U / 2);
                            if (1 > var7Lifetime1) {
                              var7Lifetime1 = 1;
                            }
                          } else {
                            var7Lifetime1 = this.projectile.field_O;
                          }
                          if (this.projectile.effectType == 9) {
                            var7Lifetime1 = this.projectile.field_O;
                            var17.field_S = var17.field_S - this.projectile.field_kb;
                            if (this.projectile.field_kb > var17.field_mc &&
                              var17.h(-128)) {
                              var17.field_mc = this.projectile.field_kb;
                            }
                            if (this.projectile.field_kb > 0 &&
                              var17.charge > 0 &&
                              var17.h(-122)) {
                              var17.consumeCharge(true, Math.min(var17.charge, this.projectile.field_kb / 50));
                            }
                            if (var17.field_S < 0) {
                              var17.field_S = 0;
                            }
                            if (0 < var17.armour) {
                              var17.a((byte) 40, this.projectile);
                            }
                            if (!(var17.armour > 0) ||
                              this.projectile.sourceSentinel == null) {
                              if (!(var17.armour <= 0) &&
                                null == this.projectile.sourceSentinel &&
                                !(var17.field_z > 0)) {
                                var17.reduceArmour(128, var7Lifetime1);
                              }
                            } else {
                              var8_int = var7Lifetime1;
                              if (var8_int > var17.armour) {
                                var8_int = var17.armour;
                              }
                              if (var8_int < 0) {
                                var8_int = 0;
                              }
                              boolean decompiledFrameRemainder0 = true;
                              if (var17.field_Nb != 8 &&
                                var17.field_z <= 0) {
                                if (~this.projectile.sourceSentinel.teamId == ~var17.teamId) {
                                  if ((this.projectile.sourceSentinel != var17)) {
                                    this.projectile.sourceSentinel.b(-(this.world.field_l * (var8_int * var17.field_lb / var17.maximumArmour)), 26511);
                                  }
                                  decompiledFrameRemainder0 = false;
                                }
                                else {
                                  this.projectile.sourceSentinel.b(this.world.field_l * (var8_int * var17.field_lb / var17.maximumArmour), 26511);
                                  this.projectile.sourceSentinel.field_Ac = this.projectile.sourceSentinel.field_Ac + var8_int;
                                }
                              }
                              if (var17.field_z <= 0) {
                                var17.reduceArmour(128, var7Lifetime1);
                              }
                            }
                            if ((!(!var17.field_Lb)) &&
                              (!(var17.hasModuleType(29, -27)))) {
                              var17.field_Dc = 200;
                            }
                            break regionExit1;
                          }
                          var17.field_S = var17.field_S - var7Lifetime1 * this.projectile.field_kb / this.projectile.field_O;
                          if (var17.field_S < 0) {
                            var17.field_S = 0;
                          }
                          if (0 < var17.field_S) {
                            fc.a((byte) 114, 27, this.worldX);
                          }
                          var17.field_S = var17.field_S - var7Lifetime1;
                          var17.field_P = 100;
                          if (0 > var17.field_S) {
                            if (this.projectile.effectType != 1 &&
                              this.projectile.effectType != 2 &&
                              this.projectile.effectType != 3 &&
                              this.projectile.effectType != 20) {
                              fc.a((byte) 91, 55, this.worldX);
                            } else {
                              fc.a((byte) -100, 51, this.worldX);
                              var8_intLifetime1 = var17.addModuleBonuses(0, 33);
                              var17.field_S = var17.field_S >> var8_intLifetime1;
                            }
                            if (var17.armour > 0) {
                              var17.a((byte) 68, this.projectile);
                            }
                            if (var17.armour > 0 &&
                              this.projectile.sourceSentinel != null) {
                              var8 = this.projectile.sourceSentinel;
                              if (this.projectile.sourceSentinel != this.projectile.field_G &&
                                null != this.projectile.field_G && (~this.projectile.field_G.teamId != ~this.projectile.sourceSentinel.teamId &&
                                var17.teamId == this.projectile.sourceSentinel.teamId ||
                                var17 == this.projectile.sourceSentinel)) {
                                var8 = this.projectile.field_G;
                              }
                              var9 = -var17.field_S;
                              if (var17.armour < var9) {
                                var9 = var17.armour;
                              }
                              if (0 > var9) {
                                var9 = 0;
                              }
                              if (var17.field_Nb != 8 &&
                                var17.field_z <= 0) {
                                if (var17.teamId != var8.teamId) {
                                  var8.b(this.world.field_l * (var17.field_lb * var9 / var17.maximumArmour), 26511);
                                  var8.field_Ac = var8.field_Ac + var9;
                                } else {
                                  if (var17 != var8) {
                                    var8.b(-(this.world.field_l * (var17.field_lb * var9 / var17.maximumArmour)), 26511);
                                  }
                                }
                              }
                              if (var17.field_z <= 0) {
                                var17.reduceArmour(128, -var17.field_S);
                                if (var17.armour <= 0 &&
                                  var17.field_Nb != 8 &&
                                  this.projectile.field_bb &&
                                  this.projectile.field_G != var8 &&
                                  ~var8.teamId != ~var17.teamId) {
                                }
                                if (var17.armour <= 0 && (var17.field_Nb == 0 ||
                                  11 == var17.field_Nb) && (32 == this.projectile.sourceWeaponType &&
                                  this.projectile.field_G == var8)) {
                                  var8.field_y = var8.field_y + 1;
                                }
                              }
                            } else {
                              if (0 < var17.armour &&
                                this.projectile.sourceSentinel == null &&
                                var17.field_z <= 0) {
                                var17.reduceArmour(128, -var17.field_S);
                              }
                            }
                            if (var17.h(-122) &&
                              var17.field_mc < var7Lifetime1 * this.projectile.field_kb / this.projectile.field_O) {
                              var17.field_mc = this.projectile.field_kb * var7Lifetime1 / this.projectile.field_O;
                            }
                            if (var7Lifetime1 * this.projectile.field_kb / this.projectile.field_O > 0 &&
                              var17.charge > 0 &&
                              var17.h(-122)) {
                              var17.consumeCharge(true, Math.min(var17.charge, var7Lifetime1 * this.projectile.field_kb / this.projectile.field_O / 50));
                            }
                            if (var17.hasModuleType(26, -27) &&
                              var17.field_S < 0) {
                              var17.field_S = Math.min(-var17.field_S, var17.field_Q);
                            } else {
                              var17.field_S = 0;
                            }
                            if (var17.field_Lb &&
                              !var17.hasModuleType(29, -27) &&
                              3 != di.field_g) {
                              var17.field_Dc = 200;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_266_0 = ~this.field_N;
                stackIn_266_1 = -1;
              }
            }
          }
          if ((decompiledFrameCompleted0) &&
            (stackIn_266_0 < stackIn_266_1)) {
            this.field_N = this.field_N - 1;
          }
          if (this.durationTicks < this.ageTicks) {
            this.world.pendingRemovals.addLast((byte) 82, (DualNode) (this));
          }
          return;
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_L = null;
        field_Q = null;
        field_J = null;
        field_C = null;
        field_E = null;
        if (param0 != -2107133436) {
          field_P = -126;
        }
        field_W = null;
        field_D = null;
        field_B = null;
        field_A = null;
    }

    final static void c(byte param0) {
        kc.field_y = null;
        int var1 = -122 / ((-17 - param0) / 41);
    }

    Explosion(int worldX, int worldY, int velocityX, int velocityY, int durationTicks, CombatWorld world, Sentinel[] affectedSentinels, Projectile projectile) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          this.affectedSentinels = affectedSentinels;
          this.velocityY = velocityY;
          this.durationTicks = durationTicks;
          this.velocityX = velocityX;
          this.worldX = worldX;
          this.world = world;
          this.ageTicks = 0;
          this.projectile = projectile;
          this.worldY = worldY;
          this.field_y = this.worldX;
          if (null != this.projectile) {
            this.field_R = this.projectile.field_ob;
          }
          this.field_K = 0;
          this.field_G = 5;
          this.field_N = 5;
          if (this.durationTicks < 1) {
            this.durationTicks = 1;
          }
          this.field_U = 64;
          this.field_F = this.field_U * (this.ageTicks + (this.durationTicks - this.ageTicks) / 4) / this.durationTicks;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_9_0 = var9;
          stackIn_9_1 = new StringBuilder().append("jb.<init>(").append(worldX).append(',').append(worldY).append(',').append(velocityX).append(',').append(velocityY).append(',').append(durationTicks).append(',');
          if (world == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (affectedSentinels == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (projectile == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_P = 0;
        field_E = "<col=156080>SOLARITE CUBES: </col>";
        field_Q = "Names cannot contain consecutive spaces";
        field_W = "Type your password again to make sure it's correct";
        field_A = new NodeDeque();
        field_D = new fm(6, 0, 4, 2);
    }
}
