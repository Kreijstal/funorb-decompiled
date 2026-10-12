/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Projectile extends DualNode {
    boolean field_bb;
    int effectType;
    private boolean field_gb;
    private int field_L;
    Sentinel sourceSentinel;
    boolean field_W;
    int worldY;
    Sentinel[] affectedSentinels;
    private int initialDirectionX;
    int velocityY;
    boolean field_ab;
    int field_kb;
    private CombatWorld world;
    private boolean field_P;
    boolean field_ob;
    Sentinel targetSentinel;
    boolean field_I;
    static rf field_N;
    int worldX;
    private int initialDirectionY;
    boolean field_E;
    int field_M;
    int ageTicks;
    private boolean field_mb;
    static String field_Y;
    int targetWorldX;
    int velocityX;
    private boolean applyGravity;
    boolean field_V;
    private int field_ib;
    static String field_R;
    int field_O;
    int field_hb;
    int sourceWeaponType;
    static boolean field_lb;
    static int field_D;
    static byte[] field_db;
    int field_z;
    static SceneWidget field_J;
    int targetWorldY;
    int field_jb;
    Sentinel field_G;
    boolean field_T;

    private final boolean g(int param0, int param1) {
        int var3;
        ParticleEffect var4;
        if (param0 < 80) {
          this.field_T = false;
        }
        boolean decompiledFrameRemainder0 = true;
        this.g(1354276);
        if (10 != this.sourceWeaponType &&
          this.sourceWeaponType != 21) {
          this.applyGravity = false;
          this.field_L = 32;
          if (this.sourceWeaponType == 35 &&
            !this.field_V &&
            !this.world.field_h &&
            (3 & param1 + this.ageTicks) == 0 &&
            0 == (this.field_hb & 7)) {
            var3 = 5 - Math.abs(-50 + this.field_hb) / 10;
            var4 = ArticulatedPart.createParticle(14, (int)((double)(-this.velocityY) * ((double)(-var3) + Math.random() * (double)(var3 * 2))), this.world, 87, this.worldY, this.field_ob, 8, (int)((double)this.velocityX * ((double)(-var3) + (double)(var3 * 2) * Math.random())), this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var4);
          }
          if (this.sourceWeaponType == 35 &&
            !this.field_V &&
            this.ageTicks == 8 &&
            (7 & this.field_hb) != 0) {
            this.world.pendingRemovals.addLast((byte) 44, (DualNode) (this));
            return true;
          }
          if (this.sourceWeaponType != 30) {
            return false;
          }
          decompiledFrameRemainder0 = (this.ageTicks == 4);
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameRemainder0 = ((this.field_hb & 3) != 0))) {
            if (!this.field_I) {
              this.world.pendingRemovals.addLast((byte) 74, (DualNode) (this));
            } else {
              this.field_T = true;
            }
            return true;
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_L = 32;
        }
        return false;
    }

    final void a(int param0, int param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        ArticulatedPart var8_ref_nk;
        int var9;
        int[] var10;
        int var10_int;
        int var11;
        int[] var11_ref_int__;
        int var12;
        int var13;
        int var14;
        int[] var15;
        int var16_int;
        double var16;
        double var18;
        int var20;
        int var21;
        int var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int var16_intLifetime1;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        int var16_intLifetime1Lifetime1;
        int var16_intLifetime1Lifetime2;
        int var16_intLifetime1Lifetime3;
        var22 = SteelSentinels.obfuscationControl;
        var4 = param1 + (this.worldX >> 8);
        var5 = param0 + (this.worldY >> 8);
        var6 = 8;
        var7 = (int)(65536.0 * Math.atan2((double)(-this.velocityX), (double)(-this.velocityY)) / 6.283185307179586);
        if (19 == this.effectType) {
          SoftwareRaster.b(var4, var5, 100, 16777215, 16);
        }
        if (param2 != 4) {
          discarded$0 = this.g(-67, 19);
        }
        if (this.effectType >= 12 &&
          16 >= this.effectType) {
          if (this.velocityX != 1) {
            sb.field_W.a(-(sb.field_W.field_z / 2) + var4, -(sb.field_W.field_B / 2) + var5);
          } else {
            hb.field_e.a(var4 - sb.field_W.field_z / 2, var5 - sb.field_W.field_B / 2);
          }
        }
        if (var4 < -32) {
          return;
        }
        if (672 >= var4 &&
          var5 >= -32 &&
          672 >= var5) {
          if (this.effectType != 2) {
            if (this.effectType != 4) {
              if (this.effectType == 6) {
                var8 = 2000;
                var9 = var8 >> 7;
                var26 = new int[1024];
                var24 = var26;
                var10 = var24;
                var11 = 0;
                while (true) {
                  if (var11 < 512) {
                    var12 = var11 / 6;
                    var13 = var11 / 5;
                    var14 = var11 / 4;
                    stackIn_94_0 = ~var11;
                    stackIn_94_1 = -449;
                    if (stackIn_94_0 < stackIn_94_1) {
                      var14 = var14 + 4 * (-192 + var11 - 256) / 2;
                      var13 = var13 + (-256 + (var11 - 192)) * 4 / 3;
                      var12 = var12 + (var11 - 192 - 256) * 4 / 4;
                    }
                    if (var14 > 255) {
                      var14 = 255;
                    }
                    if (var13 > 255) {
                      var13 = 255;
                    }
                    if (255 < var12) {
                      var12 = 255;
                    }
                    var10[var11] = var12 * 65536 - (-(256 * var13) - 1 * var14);
                    var11++;
                    continue;
                  }
                  qh.b(10000, var5 << 4, 15, var4 << 4, var9 << 4);
                  SoftwareRaster.a(var4 << 4, var5 << 4, var9 << 4, 500, var26);
                  stackIn_94_0Lifetime1 = ~this.sourceWeaponType;
                  stackIn_94_1Lifetime1 = -19;
                  if (stackIn_94_0Lifetime1 == stackIn_94_1Lifetime1) {
                    var11 = (int)(Math.cos(0.2 * (double)this.ageTicks) * 150.0);
                    var12 = (int)(Math.sin((double)this.ageTicks * 0.2) * 150.0);
                    SoftwareRaster.a((var4 << 4) + var11, var12 + (var5 << 4), var9 << 3, 250, var26);
                    SoftwareRaster.a((var4 << 4) - var11, (var5 << 4) - var12, var9 << 3, 250, var26);
                    break;
                  }
                  if (this.sourceWeaponType != 31) {
                    break;
                  }
                  var11 = (int)(Math.cos((double)this.ageTicks * 0.2) * 150.0);
                  var12 = (int)(150.0 * Math.sin(0.2 * (double)this.ageTicks));
                  SoftwareRaster.a(var11 + (var4 << 4), (var5 << 4) + var12, var9 << 3, 250, var26);
                  SoftwareRaster.a((var4 << 4) - var11, -var12 + (var5 << 4), var9 << 3, 250, var26);
                  var11 = var11 * 2;
                  var12 = var12 * 2;
                  SoftwareRaster.a(var12 + (var4 << 4), (var5 << 4) - var11, var9 << 3, 250, var26);
                  SoftwareRaster.a(-var12 + (var4 << 4), (var5 << 4) + var11, var9 << 3, 250, var26);
                  return;
                }
              }
            } else {
              if (this.field_L != 32) {
                var8 = 120;
                var9 = 49;
                var10_int = 1114111;
                var11_ref_int__ = pe.field_o;
                if (this.sourceWeaponType == 17) {
                  var8 = 120;
                  var10_int = 8978431;
                }
                if (this.sourceWeaponType == 30) {
                  var8 = 120;
                  var10_int = 16777215;
                }
                if (this.sourceWeaponType == 35) {
                  var8 = 180;
                  var11_ref_int__ = pe.field_N;
                  var9 = 99;
                }
                if (this.sourceWeaponType == 21) {
                  var11_ref_int__ = pe.field_N;
                  var8 = 96;
                }
                if (this.sourceWeaponType == 10) {
                  var8 = 64;
                  var11_ref_int__ = pe.field_N;
                }
                if (this.sourceWeaponType != 21 &&
                  this.sourceWeaponType != 10) {
                  var8 = var8 * 2;
                  var8 = var8 - 32 * this.ageTicks;
                  if (var8 < 0) {
                    var8 = 0;
                  }
                }
                var12 = var8 >> 5;
                var13 = -((this.field_L + 2) * this.velocityX >> 4);
                var14 = -((this.field_L + 2) * this.velocityY >> 4);
                if (var12 < 2) {
                  var12 = 2;
                }
                if (this.sourceWeaponType == 17) {
                  var14 = var14 / 2;
                  var13 = var13 / 2;
                }
                if (ka.field_V &&
                  3 > var12) {
                  var12 = 3;
                }
                var25 = new int[var12];
                var23 = var25;
                var15 = var23;
                for (var16_int = 0; var16_int < var25.length; var16_int++) {
                  var15[var16_int] = var11_ref_int__[var16_int * (127 * this.field_hb / var9) / var25.length];
                }
                if (this.sourceWeaponType != 21) {
                  if (this.sourceWeaponType == 17) {
                    var5 = var5 << 4;
                    var4 = var4 << 4;
                    var13 = var13 >> 2;
                    var14 = var14 >> 2;
                    for (var16_intLifetime1 = 15; var16_intLifetime1 > 0; var16_intLifetime1--) {
                      SoftwareRaster.a(var4, var5, 32 + var16_intLifetime1 * 3, 2 * var16_intLifetime1 + 1, hc.field_W);
                      var5 = var5 + var14;
                      var4 = var4 + var13;
                    }
                    return;
                  }
                  if (this.sourceWeaponType == 10) {
                    var5 = var5 << 4;
                    var14 = var14 >> 3;
                    var4 = var4 << 4;
                    var13 = var13 >> 3;
                    for (var16_intLifetime1Lifetime1 = 15; var16_intLifetime1Lifetime1 > 0; var16_intLifetime1Lifetime1--) {
                      SoftwareRaster.a(var4, var5, 32 + var16_intLifetime1Lifetime1 * 3, 1 + var16_intLifetime1Lifetime1 * 2, hc.field_eb);
                      var5 = var5 + var14;
                      var4 = var4 + var13;
                    }
                    return;
                  }
                  if (35 == this.sourceWeaponType &&
                    this.ageTicks > 8) {
                    var14 = var14 >> 3;
                    var5 = var5 << 4;
                    var4 = var4 << 4;
                    var13 = var13 >> 3;
                    for (var16_intLifetime1Lifetime2 = 15; var16_intLifetime1Lifetime2 > 0; var16_intLifetime1Lifetime2--) {
                      SoftwareRaster.a(var4, var5, 32 + var16_intLifetime1Lifetime2 * 3, var16_intLifetime1Lifetime2 * 2 + 1, hc.field_eb);
                      var4 = var4 + var13;
                      var5 = var5 + var14;
                    }
                    return;
                  }
                  if (this.sourceWeaponType == 30 &&
                    this.ageTicks > 4) {
                    var13 = var13 >> 3;
                    var14 = var14 >> 3;
                    var4 = var4 << 4;
                    var5 = var5 << 4;
                    for (var16_intLifetime1Lifetime3 = 15; 0 < var16_intLifetime1Lifetime3; var16_intLifetime1Lifetime3--) {
                      SoftwareRaster.a(var4, var5, 32 + var16_intLifetime1Lifetime3 * 3, 1 + 2 * var16_intLifetime1Lifetime3, hc.field_W);
                      var4 = var4 + var13;
                      var5 = var5 + var14;
                    }
                    return;
                  }
                  if (2 < var12) {
                    this.a(var14, var5, param2 - 3, var12, var13, var4, var10_int, var25);
                    return;
                  }
                  SoftwareRaster.f(var4, var5, (var13 >> 4) + var4, (var14 >> 4) + var5, var10_int, 192);
                  return;
                }
                var16 = 0.5 * Math.random() + 0.25;
                var18 = 0.5 * Math.random() - 0.25;
                var20 = (int)(var16 * (double)var13 + var18 * (double)var14);
                var21 = (int)((double)var14 * var16 - (double)var13 * var18);
                this.a(var14, var5, 1, var12 - 1, var13, var4, var10_int, var25);
                this.a(var21, var5, 1, var12, var20, var4, var10_int, var25);
                this.a(var14 - var21, var5 + var21 / 16, 1, var12, -var20 + var13, var4 + var20 / 16, var10_int, var25);
                return;
              }
            }
          } else {
            var8_ref_nk = NodeDeque.a(17 + this.sourceWeaponType, (byte) 67);
            if (var8_ref_nk != null) {
              var8_ref_nk.sprite.a(var8_ref_nk.sprite.field_g << 3, var8_ref_nk.sprite.field_d << 3, var4 << 4, var5 << 4, var7, 1024);
              if (this.sourceWeaponType == 32) {
                var9 = 3 * var6 / 2;
                b.field_n[0 + this.world.simulationTick / 10 % 6].d(-(this.velocityX >> 6) - var9 + var4, -(this.velocityY >> 6) + var5 - var9, var9 * 2, var9 * 2, 192);
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        Sentinel var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        double var16;
        double var18;
        double var20;
        double var22;
        double var24;
        int var26;
        int var9Lifetime1;
        int var9Lifetime2;
        var26 = SteelSentinels.obfuscationControl;
        if (param0 < 78) {
          return;
        }
        for (var3 = 0; this.affectedSentinels.length > var3; var3++) {
          boolean decompiledFrameRemainder0 = true;
          var4 = this.affectedSentinels[var3];
          if (var4 != null && (this.sourceSentinel != var4 ||
            this.effectType != 7)) {
            var5 = this.worldX - var4.worldX;
            var6 = (var4.field_Db << 3) + (-var4.worldY + this.worldY);
            if (Math.abs(var5) <= (var4.field_Ub << 3) &&
              Math.abs(var6) <= var4.field_Db << 3 && (var4 != this.sourceSentinel ||
              this.ageTicks > 10) && var4.armour > 0) {
              var7 = this.field_O * this.velocityX * this.field_L / (10 * var4.maximumArmour);
              var8 = this.field_L * this.field_O * this.velocityX / (var4.maximumArmour * 10);
              if (0 == this.effectType ||
                this.effectType == 5) {
                var8 = var8 / 2;
                var7 = var7 / 2;
              }
              if ((14 == this.sourceWeaponType ||
                this.sourceWeaponType == 28) &&
                20 > this.ageTicks) {
                var8 = 0;
                var7 = 0;
              }
              if (var4.hasModuleType(31, -27) &&
                !var4.field_Lb) {
                var8 = var8 / 2;
                var7 = var7 / 2;
              }
              if (var4.hasModuleType(29, -27) &&
                var4.field_Lb) {
                var7 = var7 / 2;
                var8 = var8 / 2;
              }
              if (var4.chassis.componentId == 109) {
                var8 = 0;
                var7 = 0;
              }
              if (var4.field_z > 0) {
                var8 = 0;
                var7 = 0;
              }
              if (this.effectType != 4 &&
                0 == var4.field_oc) {
                var4.velocityY = var4.velocityY + var8;
                var4.velocityX = var4.velocityX + var7;
              }
              this.field_T = true;
              if (!this.field_gb &&
                this.sourceSentinel != null) {
                if ((this.effectType == 2 ||
                  this.effectType == 1) &&
                  (var4.field_Lb &&
                  var4.field_Rb <= 0)) {
                }
                if (3 == this.effectType &&
                  var4.field_Lb &&
                  var4.field_Rb > 0) {
                }
                this.field_gb = true;
                if (2 == this.effectType) {
                  this.sourceSentinel.field_p = this.sourceSentinel.field_p + 1;
                }
              }
              if ((0 != var7 ||
                var8 != 0) &&
                !var4.field_Lb) {
                var4.field_Rb = 25;
              }
              this.affectedSentinels[var3] = null;
              if (-1 == var4.field_o ||
                ~var4.field_o == ~this.sourceWeaponType) {
                var4.field_S = var4.field_S - this.field_kb;
                if (this.field_kb > 0 &&
                  var4.charge > 0 &&
                  var4.h(-126)) {
                  var4.consumeCharge(true, Math.min(this.field_kb / 50, var4.charge));
                }
                var4.field_P = 100;
                if (var4.field_S < 0) {
                  var4.field_S = 0;
                }
                if (4 != this.effectType &&
                  6 != this.effectType &&
                  7 != this.effectType) {
                  if (0 < var4.armour &&
                    var4.field_z <= 0) {
                    var4.a((byte) 76, this);
                  }
                  if (0 < var4.armour &&
                    this.sourceSentinel != null) {
                    if (this.effectType != 7 &&
                      this.effectType != 0 &&
                      5 != this.effectType) {
                      if (this.effectType != 1 &&
                        this.effectType != 2 &&
                        this.effectType != 3 &&
                        this.effectType != 20) {
                        fc.a((byte) -128, 55, this.worldX);
                      } else {
                        fc.a((byte) -74, 51, this.worldX);
                        var9 = var4.addModuleBonuses(0, 33);
                        this.field_O = this.field_O >> var9;
                      }
                    } else {
                      fc.a((byte) 41, 49, this.worldX);
                      var9 = var4.addModuleBonuses(0, 32);
                      this.field_O = this.field_O >> var9;
                    }
                    if (this.sourceWeaponType == 15 &&
                      this.field_jb <= this.ageTicks &&
                      this.field_E) {
                      this.field_O = this.field_O * 4;
                    }
                    if ((this.sourceWeaponType == 14 ||
                      this.sourceWeaponType == 28) &&
                      this.ageTicks < 20) {
                      this.field_O = this.field_O / 4;
                    }
                    if (var4.field_z <= 0 &&
                      var4.armour > 0) {
                      var4.reduceArmour(128, this.field_O);
                      if (this.sourceWeaponType == 32 &&
                        0 >= var4.armour && (var4.field_Nb == 0 ||
                        var4.field_Nb == 11) && this.sourceSentinel != null) {
                        this.sourceSentinel.field_y = this.sourceSentinel.field_y + 1;
                      }
                    }
                    var9Lifetime2 = this.field_O;
                    if (var9Lifetime2 > var4.armour) {
                      var9Lifetime2 = var4.armour;
                    }
                    if (var9Lifetime2 < 0) {
                      var9Lifetime2 = 0;
                    }
                    if (var4.hasModuleType(26, -27)) {
                      var4.field_S = Math.min(var4.field_Q, var4.field_S + var9Lifetime2);
                    }
                    if (8 != var4.field_Nb) {
                      if (var4.teamId == this.sourceSentinel.teamId) {
                        if (var4.field_z <= 0 &&
                          this.sourceSentinel != var4) {
                          this.sourceSentinel.b(-(this.world.field_l * (var9Lifetime2 * var4.field_lb / var4.maximumArmour)), 26511);
                        }
                      } else {
                        if (var4.field_z <= 0) {
                          this.sourceSentinel.b(this.world.field_l * (var4.field_lb * var9Lifetime2 / var4.maximumArmour), 26511);
                          this.sourceSentinel.field_Ac = this.sourceSentinel.field_Ac + var9Lifetime2;
                        }
                        if (!this.field_V &&
                          this.field_jb <= this.ageTicks && (null == this.targetSentinel ||
                          3 != this.effectType)) {
                          this.sourceSentinel.field_db = this.sourceSentinel.field_db + 1;
                          if (0 <= this.sourceSentinel.field_q) {
                            this.sourceSentinel.field_q = 100;
                          }
                        }
                      }
                    }
                    if (var9Lifetime2 <= 0 &&
                      var4.armour > 0 ||
                      38 == var4.activeModuleType) {
                      this.field_gb = false;
                      this.field_T = false;
                      if (var5 == 0 &&
                        var6 == 0) {
                        this.velocityY = -this.velocityY / 2;
                        this.velocityX = -this.velocityX / 2;
                      } else {
                        var10 = Math.abs((double)var4.field_Ub / (double)var4.field_Db);
                        var12 = (double)var5 * var10;
                        var14 = (double)var6;
                        var16 = Math.sqrt(var12 * var12 + var14 * var14);
                        if (0.0 != var16) {
                          var14 = var14 / var16;
                          var12 = var12 / var16;
                        }
                        var18 = -var14;
                        var20 = var12;
                        var22 = (double)this.velocityX * var12 + var14 * (double)this.velocityY;
                        var24 = (double)this.velocityY * var20 + var18 * (double)this.velocityX;
                        var24 = -var24;
                        this.velocityX = (int)(var22 * var12 + var24 * var18);
                        this.velocityY = (int)(var22 * var14 + var24 * var20);
                        this.velocityX = this.velocityX / 2;
                        this.velocityY = this.velocityY / 2;
                      }
                      this.field_O = this.field_O / 2;
                    }
                  } else {
                    if (var4.armour > 0 &&
                      this.sourceSentinel == null &&
                      0 >= var4.field_z) {
                      var4.reduceArmour(128, this.field_O);
                    }
                  }
                  if (this.field_kb > var4.field_mc &&
                    var4.h(-125)) {
                    var4.field_mc = this.field_kb;
                  }
                  if ((!(!var4.field_Lb)) &&
                    (!(var4.hasModuleType(29, -27)))) {
                    var4.field_Dc = 200;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (0 < var4.field_S) {
                    fc.a((byte) -99, 27, this.worldX);
                  }
                  var4.field_S = var4.field_S - this.field_O;
                  if (var4.field_S < 0) {
                    fc.a((byte) 41, 50, this.worldX);
                    if (var4.armour > 0 &&
                      var4.field_z <= 0) {
                      var4.a((byte) 125, this);
                    }
                    if (var4.armour > 0 &&
                      null != this.sourceSentinel) {
                      var9Lifetime1 = -var4.field_S;
                      if (var4.armour < var9Lifetime1) {
                        var9Lifetime1 = var4.armour;
                      }
                      if (var9Lifetime1 < 0) {
                        var9Lifetime1 = 0;
                      }
                      if (var4.field_Nb != 8 &&
                        var4.field_z <= 0) {
                        if (var4.teamId == this.sourceSentinel.teamId) {
                          if (this.sourceSentinel != var4) {
                            this.sourceSentinel.b(-(this.world.field_l * (var9Lifetime1 * var4.field_lb / var4.maximumArmour)), 26511);
                          }
                        } else {
                          this.sourceSentinel.field_Ac = this.sourceSentinel.field_Ac + var9Lifetime1;
                          this.sourceSentinel.b(this.world.field_l * (var9Lifetime1 * var4.field_lb / var4.maximumArmour), 26511);
                        }
                      }
                      if (!(var4.field_z > 0)) {
                        var4.reduceArmour(128, -var4.field_S);
                        if (var4.armour <= 0 &&
                          this.sourceWeaponType == 32 && (var4.field_Nb == 0 ||
                          var4.field_Nb == 11)) {
                          this.sourceSentinel.field_y = this.sourceSentinel.field_y + 1;
                        }
                        if (var4.hasModuleType(26, -27) &&
                          var4.field_S < 0) {
                          var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                        } else {
                          var4.field_S = 0;
                        }
                      }
                    } else {
                      if (var4.armour > 0 &&
                        null == this.sourceSentinel) {
                        if (var4.field_z <= 0) {
                          var4.reduceArmour(128, -var4.field_S);
                        }
                        if (var4.hasModuleType(26, -27) &&
                          0 > var4.field_S) {
                          var4.field_S = Math.min(-var4.field_S, var4.field_Q);
                        } else {
                          var4.field_S = 0;
                        }
                      }
                    }
                    if (this.field_kb > var4.field_mc &&
                      var4.h(-125)) {
                      var4.field_mc = this.field_kb;
                    }
                    if (var4.field_Lb &&
                      !var4.hasModuleType(29, -27)) {
                      var4.field_Dc = 200;
                    }
                  }
                }
              }
            }
          }
        }
        return;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 > -93) {
          return;
        }
        this.a(param1, param0, param2, true, param4, (byte) -114);
    }

    final static int a(int[] param0, int param1, boolean param2, ArticulatedPart param3) {
        int var5 = 0;
        int incrementValue$1 = 0;
        PartInstruction[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        PartInstruction[] var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        PartInstruction[] var4Lifetime1;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var4 = new PartInstruction[]{};
          var7 = param3.a(var4, -21636, -1);
          var4Lifetime1 = var7;
          for (var5 = 0; var5 < var7.length; var5++) {
            if (var7[var5] != null &&
              -1 != var7[var5].field_q) {
              incrementValue$1 = param1;
              param1++;
              param0[incrementValue$1] = ec.a(var7[var5].field_q, 1008);
            }
          }
          if (!param2) {
            field_J = (SceneWidget) null;
          }
          stackIn_11_0 = param1;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("wl.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, byte param5) {
        Explosion stackIn_27_0;
        Explosion stackIn_27_1;
        int stackIn_27_2;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        CombatWorld stackIn_27_7;
        Explosion stackIn_28_0 = null;
        Explosion stackIn_28_1 = null;
        Sentinel[] stackIn_28_8 = null;
        Explosion var7;
        int var8;
        var8 = SteelSentinels.obfuscationControl;
        if (this.field_I) {
          this.field_T = true;
        }
        if (this.sourceSentinel != null &&
          this.sourceSentinel.activeModuleType == 41) {
          param4 = param4 * 2;
          param0 = param0 * 2;
          param1 = param1 * 4;
        }
        if (this.field_V) {
          return;
        }
        if (this.field_I) {
          return;
        }
        if (this.sourceWeaponType != 32 &&
          this.sourceWeaponType != -2) {
          if (this.sourceWeaponType != 8) {
            if (50 > param4) {
              fc.a((byte) 92, 86, this.worldX);
            } else {
              if (100 <= param4) {
                if (param4 >= 150) {
                  if (param4 >= 200) {
                    if (param4 >= 250) {
                      fc.a((byte) -102, 54, this.worldX);
                    } else {
                      fc.a((byte) -120, 53, this.worldX);
                    }
                  } else {
                    fc.a((byte) -103, 89, this.worldX);
                  }
                } else {
                  fc.a((byte) -89, 88, this.worldX);
                }
              } else {
                fc.a((byte) 69, 87, this.worldX);
              }
            }
          } else {
            fc.a((byte) 27, 17, this.worldX);
          }
        }
        stackIn_27_0 = null;
        stackIn_27_1 = null;
        stackIn_27_2 = this.worldX;
        stackIn_27_3 = this.worldY;
        stackIn_27_4 = 0;
        stackIn_27_5 = 0;
        stackIn_27_6 = param4;
        stackIn_27_7 = this.world;
        if (!param3) {
          stackIn_28_0 = null;
          stackIn_28_1 = null;
          stackIn_28_8 = null;
        } else {
          stackIn_28_0 = null;
          stackIn_28_1 = null;
          stackIn_28_8 = this.affectedSentinels;
        }
        var7 = new Explosion(stackIn_27_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, this);
        if (param5 >= -96) {
          this.field_G = (Sentinel) null;
        }
        var7.field_G = param1;
        var7.field_U = param0;
        var7.field_O = this.field_W;
        var7.field_K = param2;
        this.world.explosions.addLast(3, var7);
        return;
    }

    final static java.applet.Applet d(byte param0) {
        if (fb.field_o != null) {
          return fb.field_o;
        }
        if (param0 != -21) {
          field_J = (SceneWidget) null;
        }
        return (java.applet.Applet) ((Object) km.field_m);
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -57 % ((-11 - param0) / 36);
          var3 = (CharSequence) ((Object) param1);
          stackIn_1_0 = ng.field_r.equals(ui.a(1, var3));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("wl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final boolean a(int param0, byte param1) {
        int var3;
        ParticleEffect var4;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        var3 = -42 / ((10 - param1) / 61);
        this.field_L = 32;
        if (!this.world.field_h &&
          !this.field_V) {
          var4 = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 112, this.worldY, this.field_ob, 10, -this.velocityY / 2, this.worldX, this.worldX);
          this.world.pendingParticles.addLast(3, var4);
        }
        if (50 > this.field_hb) {
          this.field_hb = this.field_hb * 6;
        }
        this.ageTicks = this.ageTicks + 1;
        if (this.ageTicks <= this.field_hb &&
          !this.field_P) {
          return false;
        }
        if (0 == this.sourceWeaponType) {
          this.a(2, 500, 2, -99, 100);
        } else {
          if (this.sourceWeaponType == 11) {
            this.a(10, 750, 2, -125, 500);
          }
        }
        if (this.field_I) {
          this.field_T = true;
        } else {
          this.world.pendingRemovals.addLast((byte) 92, (DualNode) (this));
        }
        return true;
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ParticleEffect var10 = null;
        this.field_L = param0;
        if (!this.world.field_h) {
          if (this.field_V) {
            return false;
          }
          var3 = 100;
          var4 = 0.5;
          if (3 == this.sourceWeaponType) {
            var4 = 0.5;
            var3 = 100;
          }
          if (this.sourceWeaponType == 16) {
            var4 = 0.4;
            var3 = 100;
          }
          if (29 == this.sourceWeaponType) {
            var3 = 200;
            var4 = 0.3;
          }
          var6 = (int)Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
          var7 = (int)(Math.sin((double)(this.ageTicks * this.field_L + param1) * var4) * (double)var3);
          if (var6 > 0) {
            var8 = this.velocityY * var7 / var6;
            var9 = var7 * -this.velocityX / var6;
            var10 = ArticulatedPart.createParticle(6, var8, this.world, 88, this.worldY, this.field_ob, 100, var9, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var10);
          }
        }
        return false;
    }

    private final boolean e(int param0, int param1) {
        ParticleEffect var3;
        int var4;
        ParticleEffect var3Lifetime1;
        ParticleEffect var3Lifetime2;
        boolean decompiledFrameRemainder0 = true;
        var4 = SteelSentinels.obfuscationControl;
        this.g(1354276);
        this.field_L = 8;
        if (!this.world.field_h &&
          !this.field_V &&
          param0 == 0) {
          if (this.sourceWeaponType == 18 &&
            (15 & this.field_L * this.world.simulationTick + param0) == 0) {
            if ((this.world.simulationTick & 3) == 0) {
              var3 = ArticulatedPart.createParticle(5, -this.velocityY / 2, this.world, 94, this.worldY, this.field_ob, 200, this.velocityX / 2, this.worldX, this.worldX);
              this.world.pendingParticles.addLast(param1 ^ 30, var3);
            } else {
              if ((2 == (3 & this.world.simulationTick))) {
                var3Lifetime2 = ArticulatedPart.createParticle(5, this.velocityY / 2, this.world, 104, this.worldY, this.field_ob, 200, -this.velocityX / 2, this.worldX, this.worldX);
                this.world.pendingParticles.addLast(3, var3Lifetime2);
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (31 == this.sourceWeaponType) {
              if ((7 & this.world.simulationTick) != 0) {
                if (4 == (7 & this.world.simulationTick)) {
                  var3Lifetime1 = ArticulatedPart.createParticle(4, this.velocityY, this.world, 98, this.worldY, this.field_ob, 200, -this.velocityX, this.worldX, this.worldX);
                  this.world.pendingParticles.addLast(param1 - 26, var3Lifetime1);
                }
              } else {
                var3Lifetime1 = ArticulatedPart.createParticle(4, -this.velocityY, this.world, param1 + 63, this.worldY, this.field_ob, 200, this.velocityX, this.worldX, this.worldX);
                this.world.pendingParticles.addLast(3, var3Lifetime1);
              }
            }
          }
        }
        if (param1 == 29) {
          return false;
        }
        field_R = (String) null;
        return false;
    }

    private final boolean d(int param0, int param1) {
        boolean stackIn_27_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_47_0 = 0;
        boolean stackIn_56_1 = false;
        boolean stackOut_33_0;
        boolean stackOut_26_0;
        int var3;
        int var4_int;
        ParticleEffect var4;
        int var5;
        int var6_int;
        ParticleEffect var6;
        int var7;
        Projectile var8;
        IsaacRandom var9;
        Projectile var10;
        int var4_intLifetime1;
        int var5Lifetime1;
        ParticleEffect var4Lifetime1;
        ParticleEffect var6Lifetime1;
        ParticleEffect var6Lifetime2;
        int stackIn_47_0Lifetime1;
        var7 = SteelSentinels.obfuscationControl;
        var3 = 200;
        if (0 == this.ageTicks &&
          0 == param0) {
          this.targetWorldY = this.targetWorldY - this.worldY;
          this.targetWorldX = this.targetWorldX - this.worldX;
        }
        if (this.ageTicks < 10) {
          var4_int = this.targetWorldX;
          var5 = this.targetWorldY;
          var6_int = 10 * (int)Math.sqrt((double)(var4_int / 100 * var4_int + var5 / 100 * var5));
          if (1 > var6_int) {
            var6_int = 1;
          }
          this.velocityY = var3 * this.ageTicks * var5 / (var6_int * 10);
          if (this.sourceWeaponType != 32 && (null == this.sourceSentinel ||
            0 == this.sourceSentinel.field_Nb)) {
            this.applyGravity = false;
          }
          this.velocityX = var4_int * (this.ageTicks * var3) / (10 * var6_int);
        } else {
          if (this.ageTicks >= 20) {
            if (this.sourceWeaponType == 9 &&
              30 == this.ageTicks) {
              this.field_T = true;
            }
            if (this.sourceWeaponType == 19 &&
              this.ageTicks == 30) {
              this.field_T = true;
              var9 = new IsaacRandom(new int[]{this.world.simulationTick});
              if (!this.field_V) {
                for (var5 = 0; var5 < 7; var5++) {
                  var10 = new Projectile(this.worldX, this.worldY, this.velocityX, this.velocityY, this.field_hb, this.field_L, 2, this.world, this.sourceSentinel, this.field_O / 2, this.field_ib, this.sourceWeaponType);
                  var10.ageTicks = 31;
                  var10.field_ab = this.field_ab;
                  var10.field_V = this.field_V;
                  var10.field_kb = this.field_kb;
                  stackOut_33_0 = this.field_V;
                  stackIn_47_0 = stackOut_33_0 ? 1 : 0;
                  stackIn_34_0 = stackOut_33_0;
                  if (stackIn_34_0) {
                    var10.affectedSentinels = null;
                  }
                  var10.velocityX = var10.velocityX + (jh.sine16(8192 * var5 / 7 + this.world.simulationTick, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                  var10.velocityY = var10.velocityY + (kg.cosine16(var5 * 8192 / 7 + this.world.simulationTick, (byte) -98) * wc.a((byte) -61, var9, 16) >> 15);
                  this.world.field_db.addLast(3, var10);
                }
              } else {
                if (!this.field_I) {
                  for (var5 = 0; var5 < 7; var5++) {
                    var8 = new Projectile(this.worldX, this.worldY, this.velocityX, this.velocityY, this.field_hb, this.field_L, 2, this.world, this.sourceSentinel, this.field_O / 2, this.field_ib, this.sourceWeaponType);
                    var8.field_ab = this.field_ab;
                    var8.ageTicks = 31;
                    var8.field_V = this.field_V;
                    stackOut_26_0 = this.field_V;
                    stackIn_47_0 = stackOut_26_0 ? 1 : 0;
                    stackIn_27_0 = stackOut_26_0;
                    if (stackIn_27_0) {
                      var8.affectedSentinels = null;
                    }
                    var8.field_kb = this.field_kb;
                    var8.velocityX = var8.velocityX + (jh.sine16(8192 * var5 / 7 + this.world.simulationTick, 4096) * wc.a((byte) -61, var9, 16) >> 15);
                    var8.velocityY = var8.velocityY + (kg.cosine16(8192 * var5 / 7 + this.world.simulationTick, (byte) -94) * wc.a((byte) -61, var9, 16) >> 15);
                    pm.field_db.addLast(3, var8);
                  }
                }
              }
            }
          } else {
            var4_int = (int)Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
            if (1 > var4_int) {
              var4_int = 1;
            }
            this.velocityY = var3 * this.velocityY / var4_int;
            this.velocityX = this.velocityX * var3 / var4_int;
            if (32 != this.sourceWeaponType && (this.sourceSentinel == null ||
              0 == this.sourceSentinel.field_Nb)) {
              this.applyGravity = false;
            }
          }
        }
        this.field_L = 12;
        stackIn_47_0Lifetime1 = -33;
        if (stackIn_47_0Lifetime1 == ~this.sourceWeaponType &&
          this.ageTicks > 10) {
          if (!this.world.field_h &&
            !this.field_V &&
            (1 & this.world.simulationTick + param0) == 0) {
            var4_intLifetime1 = -(this.velocityX * 20) + this.worldX;
            var5Lifetime1 = this.worldY - 20 * this.velocityY;
            var6 = ArticulatedPart.createParticle(1, -this.velocityY - this.velocityX, this.world, 99, var5Lifetime1, this.field_ob, 50, -this.velocityY + this.velocityX, var4_intLifetime1, this.worldX);
            this.world.pendingParticles.addLast(param1 - 47, var6);
            var6Lifetime1 = ArticulatedPart.createParticle(1, -this.velocityX + this.velocityY, this.world, 106, var5Lifetime1, this.field_ob, 50, -this.velocityX - this.velocityY, var4_intLifetime1, this.worldX);
            this.world.pendingParticles.addLast(3, var6Lifetime1);
            var6Lifetime2 = ArticulatedPart.createParticle(0, -this.velocityX / 2, this.world, param1 ^ 72, var5Lifetime1, this.field_ob, 250, -this.velocityY / 2, var4_intLifetime1, this.worldX);
            this.world.pendingParticles.addLast(3, var6Lifetime2);
          }
          stackIn_56_1 = (this.ageTicks % 2 == 0);
          this.applyGravity = stackIn_56_1;
        } else {
          if (!this.world.field_h &&
            !this.field_V &&
            0 == (this.world.simulationTick + param0 & 1)) {
            var4 = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 108, this.worldY, this.field_ob, 50, -this.velocityY / 2, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var4);
            var4Lifetime1 = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 101, this.worldY, this.field_ob, 250, -this.velocityY / 2, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var4Lifetime1);
          }
        }
        if (param1 == 50) {
        }
        return false;
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = hk.a('_', "", param1, param2);
          var3 = ri.a(-1, param2);
          stackIn_5_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wl.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean f(int param0, int param1) {
        boolean stackIn_39_1 = false;
        boolean stackIn_68_0 = false;
        ParticleEffect var3;
        int var4;
        int var6;
        Projectile var7;
        IsaacRandom var8;
        Projectile var9;
        IsaacRandom var10;
        ParticleEffect var3Lifetime1;
        boolean stackIn_68_0Lifetime1;
        var6 = SteelSentinels.obfuscationControl;
        if (this.field_L == 0 ||
          this.field_L == 7) {
          this.field_L = 8;
        }
        if (this.sourceWeaponType == 15) {
          this.field_L = 16;
        }
        if (param1 != -29) {
          this.field_L = -44;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.sourceWeaponType == 2 && (this.ageTicks > this.field_z ||
          this.field_bb)) {
          if (this.field_bb) {
            this.velocityX = 0;
            this.velocityY = 0;
          } else {
            this.velocityY = this.velocityY / 2;
            this.velocityX = this.velocityX / 2;
          }
          this.field_T = true;
          if (!this.field_V) {
            var10 = new IsaacRandom(new int[]{this.world.simulationTick, this.worldX, this.worldY});
            for (var4 = 0; var4 < this.field_M; var4++) {
              var9 = new Projectile(this.worldX, this.worldY, this.velocityX, this.velocityY, this.field_hb, this.field_L, 8, this.world, this.sourceSentinel, this.field_O, this.field_ib, this.sourceWeaponType);
              var9.field_ab = this.field_ab;
              var9.field_G = this.field_G;
              var9.field_V = this.field_V;
              var9.field_kb = this.field_kb;
              stackIn_68_0 = this.field_V;
              if (stackIn_68_0) {
                var9.affectedSentinels = null;
              }
              var9.velocityX = var9.velocityX + (jh.sine16(8192 * var4 / 10 + this.world.simulationTick, 4096) * wc.a((byte) -61, var10, 64) >> 16);
              var9.velocityY = var9.velocityY + (kg.cosine16(this.world.simulationTick + var4 * 8192 / 10, (byte) -98) * wc.a((byte) -61, var10, 48) >> 16);
              this.world.field_db.addLast(3, var9);
            }
          } else {
            if (!this.field_I) {
              var8 = new IsaacRandom(new int[]{this.world.simulationTick, this.worldX, this.worldY});
              for (var4 = 0; this.field_M > var4; var4++) {
                var7 = new Projectile(this.worldX, this.worldY, this.velocityX, this.velocityY, this.field_hb, this.field_L, 8, this.world, this.sourceSentinel, this.field_O, this.field_ib, this.sourceWeaponType);
                var7.field_V = this.field_V;
                var7.field_ab = this.field_ab;
                stackIn_68_0 = this.field_V;
                if (stackIn_68_0) {
                  var7.affectedSentinels = null;
                }
                var7.field_kb = this.field_kb;
                var7.velocityX = var7.velocityX + (jh.sine16(this.world.simulationTick + 8192 * var4 / 10, 4096) * wc.a((byte) -61, var8, 64) >> 16);
                var7.velocityY = var7.velocityY + (kg.cosine16(this.world.simulationTick + 8192 * var4 / 10, (byte) -108) * wc.a((byte) -61, var8, 48) >> 16);
                pm.field_db.addLast(param1 + 32, var7);
              }
            }
          }
          stackIn_68_0Lifetime1 = this.world.field_h;
          if ((!(stackIn_68_0Lifetime1)) &&
            (!(this.field_V))) {
            var3 = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 107, this.worldY, this.field_ob, 25, -this.velocityY / 2, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var3);
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          if (this.sourceWeaponType == 2) {
            stackIn_39_1 = (this.field_L != 3);
            this.applyGravity = stackIn_39_1;
            if (this.field_L == 2 ||
              this.field_L == 8) {
              this.field_L = 4;
            }
            if (!this.world.field_h &&
              !this.field_V) {
              var3Lifetime1 = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 97, this.worldY, this.field_ob, 25, -this.velocityY / 2, this.worldX, this.worldX);
              this.world.pendingParticles.addLast(3, var3Lifetime1);
            }
          } else {
            if (14 != this.sourceWeaponType &&
              this.sourceWeaponType != 28) {
              if (!(this.world.field_h)) {
                if (this.field_V) {
                  return false;
                }
                var3Lifetime1 = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 110, this.worldY, this.field_ob, 5, -this.velocityY / 2, this.worldX, this.worldX);
                this.world.pendingParticles.addLast(3, var3Lifetime1);
                if (this.sourceWeaponType == 27) {
                  var3Lifetime1 = ArticulatedPart.createParticle(8, -this.velocityX / 2, this.world, param1 + 123, this.worldY, this.field_ob, 25, -this.velocityY / 2, this.worldX, this.worldX);
                  this.world.pendingParticles.addLast(3, var3Lifetime1);
                } else {
                  var3Lifetime1 = ArticulatedPart.createParticle(8, -this.velocityX / 2, this.world, 99, this.worldY, this.field_ob, 10, -this.velocityY / 2, this.worldX, this.worldX);
                  if (this.sourceWeaponType == 15 &&
                    this.ageTicks >= this.field_jb &&
                    null != this.sourceSentinel &&
                    this.field_E) {
                    var3Lifetime1.effectType = 3;
                  }
                  this.world.pendingParticles.addLast(3, var3Lifetime1);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.applyGravity = true;
              this.field_L = 16;
              if (!this.world.field_h &&
                !this.field_V) {
                if (this.sourceWeaponType == 28 &&
                  3 > this.ageTicks) {
                  var3Lifetime1 = ArticulatedPart.createParticle(1, -this.velocityX / 2, this.world, 120, this.worldY, this.field_ob, 35 - this.ageTicks * 10, -this.velocityY / 2, this.worldX, this.worldX);
                  this.world.pendingParticles.addLast(param1 ^ -32, var3Lifetime1);
                } else {
                  if (this.ageTicks >= 1) {
                    var3Lifetime1 = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, param1 + 119, this.worldY, this.field_ob, 5, -this.velocityY / 2, this.worldX, this.worldX);
                    this.world.pendingParticles.addLast(3, var3Lifetime1);
                  } else {
                    var3Lifetime1 = ArticulatedPart.createParticle(1, -this.velocityX / 2, this.world, 125, this.worldY, this.field_ob, 18 - this.ageTicks * 8, -this.velocityY / 2, this.worldX, this.worldX);
                    this.world.pendingParticles.addLast(3, var3Lifetime1);
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final boolean b(int param0, byte param1) {
        boolean discarded$0 = false;
        ParticleEffect var3 = null;
        if (param1 > -107) {
          discarded$0 = this.b(31, (byte) -17);
        }
        this.applyGravity = 0 == (1 & param0) ? true : false;
        this.field_L = 2;
        if (!this.world.field_h &&
          !this.field_V) {
          var3 = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 112, this.worldY, this.field_ob, 25, -this.velocityY / 2, this.worldX, this.worldX);
          this.world.pendingParticles.addLast(3, var3);
        }
        if (this.sourceWeaponType == 2 &&
          this.field_bb) {
          if (this.field_T) {
            return false;
          }
          this.a(5, 256, 4, -113, 50);
          this.field_T = true;
        }
        return false;
    }

    final static void c(byte param0) {
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var2 = null;
        int[] var1 = null;
        if (oa.a(0, true)) {
          var2 = ao.field_B;
          var1 = var2;
          var2[1] = vn.a(var2[1], 64);
          var3 = ao.field_A;
          var1 = var3;
          var3[1] = ec.a(var3[1], -65);
        } else {
          var4 = ao.field_B;
          var1 = var4;
          var4[1] = ec.a(var4[1], -65);
          var5 = ao.field_A;
          var1 = var5;
          var5[1] = vn.a(var5[1], 64);
        }
        if (param0 < 7) {
          field_N = (rf) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ArticulatedPart var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var22 = SteelSentinels.obfuscationControl;
        try {
          if (param0 + param4 < 0) {
            param5 = param5 + (param4 >> 4);
            param1 = param1 + (param0 >> 4);
            param4 = -param4;
            param0 = -param0;
          }
          var9_int = SoftwareRaster.field_i;
          var10 = SoftwareRaster.field_b;
          var11 = SoftwareRaster.field_l;
          var12 = SoftwareRaster.field_d;
          if (param2 != 1) {
            var23 = (ArticulatedPart) null;
            Projectile.a((int[]) null, -55, false, (ArticulatedPart) null);
          }
          var13 = SoftwareRaster.field_c;
          var25 = SoftwareRaster.field_g;
          var24 = var25;
          var17 = var24;
          if (!this.field_W &&
            this.sourceWeaponType != 35 &&
            this.sourceWeaponType != 4) {
            SoftwareRaster.e(param5, param1, param3 - 1, 16777215);
            SoftwareRaster.c(param5, param1, param3 - 1, param6);
          }
          if (param4 <= param0) {
            param5 = param5 << 16;
            var10 = var10 - param3;
            var9_int = var9_int + param3;
            param0 = param0 >> 4;
            param5 = param5 + 32768;
            param4 = param4 << 12;
            var18 = (int)Math.floor(0.5 + (double)param4 / (double)param0);
            param0 = param0 + param1;
            if (var12 <= param0) {
              param0 = -1 + var12;
            }
            if (var11 > param1) {
              param5 = param5 + (var11 - param1) * var18;
              param1 = var11;
            }
            while (param0 >= param1) {
              var19 = param5 >> 16;
              param5 = param5 + var18;
              if (var9_int <= var19 &&
                var10 > var19) {
                var14 = var13 * param1 + var19 - param3;
                for (var20 = 0; param3 > var20; var20++) {
                  var14++;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (param6 & 16711935) + (var15 & 16711935);
                  var15 = (65536 & -var21 + var16) + (16777472 & var21);
                  var17[var14] = vn.a(-var15 + var16, var15 - (var15 >>> 8));
                }
                var14 = var14 + param3;
                for (var20 = 1; var20 < param3; var20++) {
                  var14--;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & var15) + (16711935 & param6);
                  var15 = (-var21 + var16 & 65536) + (var21 & 16777472);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), -var15 + var16);
                }
              }
              param1++;
            }
            return;
          }
          param1 = param1 << 16;
          var12 = var12 - param3;
          var11 = var11 + param3;
          param1 = param1 + 32768;
          param0 = param0 << 12;
          param4 = param4 >> 4;
          var18 = (int)Math.floor(0.5 + (double)param0 / (double)param4);
          param4 = param4 + param5;
          if (param5 < var9_int) {
            param1 = param1 + (-param5 + var9_int) * var18;
            param5 = var9_int;
          }
          if (var10 <= param4) {
            param4 = -1 + var10;
            while (param5 <= param4) {
              var19 = param1 >> 16;
              param1 = param1 + var18;
              if (var11 <= var19 &&
                var19 < var12) {
                var14 = -(var13 * param3) + (param5 + var13 * var19);
                for (var20 = 0; var20 < param3; var20++) {
                  var14 = var14 + var13;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & param6) + (var15 & 16711935);
                  var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
                }
                var14 = var14 + param3 * var13;
                for (var20 = 1; param3 > var20; var20++) {
                  param6 = param7[var20];
                  var14 = var14 - var13;
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (var15 & 16711935) + (16711935 & param6);
                  var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                  var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
                }
              }
              param5++;
            }
            return;
          }
          if (param5 <= param4) {
            var19 = param1 >> 16;
            param1 = param1 + var18;
            if (var11 <= var19 &&
              var19 < var12) {
              var14 = -(var13 * param3) + (param5 + var13 * var19);
              for (var20 = 0; var20 < param3; var20++) {
                var14 = var14 + var13;
                param6 = param7[var20];
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (16711935 & param6) + (var15 & 16711935);
                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
              }
              while (true) {
                var14 = var14 + param3 * var13;
                for (var20 = 1; param3 > var20; var20++) {
                  param6 = param7[var20];
                  var14 = var14 - var13;
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (var15 & 16711935) + (16711935 & param6);
                  var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                  var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
                }
                do {
                  param5++;
                  if (param5 > param4) {
                    return;
                  }
                  var19 = param1 >> 16;
                  param1 = param1 + var18;
                } while (var11 > var19 ||
                  var19 >= var12);
                var14 = -(var13 * param3) + (param5 + var13 * var19);
                for (var20 = 0; var20 < param3; var20++) {
                  var14 = var14 + var13;
                  param6 = param7[var20];
                  var15 = var25[var14];
                  var16 = param6 + var15;
                  var21 = (16711935 & param6) + (var15 & 16711935);
                  var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                  var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
                }
              }
            }
            while (true) {
              param5++;
              if (param5 > param4) {
                return;
              }
              var19 = param1 >> 16;
              param1 = param1 + var18;
              if (var11 > var19) {
                continue;
              }
              if (var19 >= var12) {
                continue;
              }
              var14 = -(var13 * param3) + (param5 + var13 * var19);
              for (var20 = 0; var20 < param3; var20++) {
                var14 = var14 + var13;
                param6 = param7[var20];
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (16711935 & param6) + (var15 & 16711935);
                var15 = (16777472 & var21) + (-var21 + var16 & 65536);
                var17[var14] = vn.a(var15 - (var15 >>> 8), var16 - var15);
              }
              var14 = var14 + param3 * var13;
              for (var20 = 1; param3 > var20; var20++) {
                param6 = param7[var20];
                var14 = var14 - var13;
                var15 = var25[var14];
                var16 = param6 + var15;
                var21 = (var15 & 16711935) + (16711935 & param6);
                var15 = (65536 & -var21 + var16) + (var21 & 16777472);
                var17[var14] = vn.a(var16 - var15, var15 - (var15 >>> 8));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_52_0 = var9;
          stackIn_52_1 = new StringBuilder().append("wl.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static boolean j(int param0) {
        if (param0 != 16777215) {
          return true;
        }
        return jn.field_b == nj.field_ab ? true : false;
    }

    private final boolean advanceGuidedMotion(byte obfuscationGuard, int substepIndex) {
        int maximumSpeed;
        int velocityOrTargetDeltaX;
        ParticleEffect coastingTrail;
        int velocityOrTargetDeltaY;
        int speedOrTargetAngle;
        ParticleEffect launchTrail;
        int heading;
        int headingDelta;
        int speed;
        ParticleEffect guidedTrail;
        int obfuscationControl;
        ParticleEffect secondaryLaunchTrail;
        ParticleEffect secondaryGuidedTrail;
        obfuscationControl = SteelSentinels.obfuscationControl;
        if (obfuscationGuard >= -1) {
          this.ageTicks = 101;
        }
        maximumSpeed = 300;
        if (this.ageTicks < 20) {
          velocityOrTargetDeltaX = this.velocityX;
          velocityOrTargetDeltaY = this.velocityY;
          speedOrTargetAngle = (int)Math.sqrt((double)(velocityOrTargetDeltaY * velocityOrTargetDeltaY + velocityOrTargetDeltaX * velocityOrTargetDeltaX));
          if (1 > speedOrTargetAngle) {
            speedOrTargetAngle = 1;
          }
          this.applyGravity = false;
          this.velocityX = (this.ageTicks + 5) * (velocityOrTargetDeltaX * maximumSpeed) / (speedOrTargetAngle * 25);
          this.velocityY = velocityOrTargetDeltaY * ((this.ageTicks + 5) * maximumSpeed) / (speedOrTargetAngle * 25);
          if (!this.world.field_h &&
            !this.field_V &&
            (this.world.simulationTick + substepIndex & 1) == 0) {
            launchTrail = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 95, this.worldY, this.field_ob, 200, -this.velocityY / 2, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, launchTrail);
            secondaryLaunchTrail = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 113, this.worldY, this.field_ob, 50, -this.velocityY / 2, this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, secondaryLaunchTrail);
          }
        } else {
          if (this.ageTicks < 128) {
            if (null != this.targetSentinel) {
              if (this.targetSentinel.field_pc) {
                this.targetSentinel = null;
              } else {
                this.targetWorldX = this.targetSentinel.worldX;
                this.targetWorldY = -(this.targetSentinel.field_Db << 3) + this.targetSentinel.worldY;
              }
            }
            velocityOrTargetDeltaX = (-this.worldX + this.targetWorldX) / 10;
            velocityOrTargetDeltaY = (-this.worldY + this.targetWorldY) / 10;
            speedOrTargetAngle = ResourceArchive.atan2Angle8192(velocityOrTargetDeltaY, 200, velocityOrTargetDeltaX);
            heading = ResourceArchive.atan2Angle8192(this.velocityY, 200, this.velocityX);
            headingDelta = -4096 + (8191 & -heading + (speedOrTargetAngle + 4096));
            speed = kk.approximateVectorLength(this.velocityY, this.velocityX, -22967);
            if (headingDelta >= -1024 &&
              1024 >= headingDelta) {
              if (300 > speed) {
                speed += 5;
              }
            } else {
              if (speed < 300) {
                speed += 5;
              }
              if (speed > 300) {
                speed -= 5;
              }
            }
            if (headingDelta > 16) {
              headingDelta = 16;
            }
            if (headingDelta < -16) {
              headingDelta = -16;
            }
            if (velocityOrTargetDeltaX * this.velocityX < 0 &&
              this.initialDirectionX * this.velocityX > 0 &&
              this.initialDirectionY * this.velocityY > 0 &&
              null != this.targetSentinel &&
              this.velocityY * (this.velocityX * headingDelta) < 0) {
              headingDelta = -headingDelta;
            }
            heading = heading + headingDelta;
            this.velocityX = kg.cosine16(heading, (byte) -127) * speed >> 16;
            this.velocityY = jh.sine16(heading, 4096) * speed >> 16;
            this.applyGravity = false;
            if (!this.world.field_h &&
              !this.field_V) {
              if (0 != (this.world.simulationTick + substepIndex & 1)) {
                this.field_L = 4;
                return false;
              }
              guidedTrail = ArticulatedPart.createParticle(2, -this.velocityX / 2, this.world, 102, this.worldY, this.field_ob, 200, -this.velocityY / 2, this.worldX, this.worldX);
              this.world.pendingParticles.addLast(3, guidedTrail);
              secondaryGuidedTrail = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 107, this.worldY, this.field_ob, 50, -this.velocityY / 2, this.worldX, this.worldX);
              this.world.pendingParticles.addLast(3, secondaryGuidedTrail);
            }
          } else {
            if (!this.world.field_h &&
              !this.field_V &&
              0 == (this.world.simulationTick + substepIndex & 1)) {
              coastingTrail = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 120, this.worldY, this.field_ob, 50, -this.velocityY / 2, this.worldX, this.worldX);
              this.world.pendingParticles.addLast(3, coastingTrail);
            }
          }
        }
        this.field_L = 4;
        return false;
    }

    final void advanceProjectile(int obfuscationGuard) {
        boolean stackIn_3_1 = false;
        Sentinel stackIn_44_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_151_0 = 0;
        int stackIn_151_1 = 0;
        boolean stackIn_183_0 = false;
        int stackIn_188_0 = 0;
        int stackIn_306_0;
        int stackIn_306_1;
        CombatWorld stackIn_306_2;
        int stackIn_306_3;
        int stackIn_306_4;
        boolean stackIn_306_5;
        int stackIn_307_6;
        int stackIn_316_0;
        int stackIn_316_1;
        CombatWorld stackIn_316_2;
        int stackIn_316_3;
        int stackIn_316_4;
        boolean stackIn_316_5;
        int stackIn_317_6;
        int stackIn_456_0 = 0;
        int stackIn_456_1 = 0;
        boolean stackOut_182_0;
        int var2;
        double var2_double;
        Sentinel var2_ref_mb;
        Object var3;
        int var3_int;
        Sentinel var3_ref;
        ParticleEffect var3_ref2;
        Projectile var3_ref3;
        int var4;
        Sentinel var4_ref_mb;
        ParticleEffect var4_ref_qb;
        int var5;
        Projectile var5_ref_wl;
        int var6;
        ParticleEffect var7;
        int var7_int;
        int var8;
        int var9;
        Projectile var10;
        IsaacRandom var11;
        NodeIterator var12;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var2Lifetime3;
        double var2_doubleLifetime1;
        int var3_intLifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var2Lifetime2Lifetime1;
        int var2Lifetime2Lifetime2;
        int var3_intLifetime2Lifetime1;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        Sentinel var3_refLifetime1;
        ParticleEffect var3_ref2Lifetime1;
        Projectile var3_ref3Lifetime1;
        ParticleEffect var4_ref_qbLifetime1;
        ParticleEffect var7Lifetime1;
        ParticleEffect var3_ref2Lifetime2;
        ParticleEffect var3_ref2Lifetime3;
        ParticleEffect var3_ref2Lifetime1Lifetime1;
        int stackIn_70_0Lifetime1;
        int stackIn_73_0Lifetime1;
        int stackIn_73_1Lifetime1;
        int stackIn_100_0Lifetime1;
        int stackIn_100_1Lifetime1;
        int stackIn_151_0Lifetime1;
        int stackIn_151_1Lifetime1;
        int stackIn_188_0Lifetime1;
        int stackIn_456_0Lifetime1;
        int stackIn_456_0Lifetime2;
        int stackIn_456_1Lifetime1;
        int stackIn_456_1Lifetime2;
        int var5Lifetime3;
        int var2Lifetime2Lifetime3;
        int var4Lifetime1Lifetime3;
        int var4Lifetime1Lifetime4;
        var3 = null;
        var9 = SteelSentinels.obfuscationControl;
        this.applyGravity = true;
        stackIn_3_1 = !(this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) <= -(this.worldY >> 4));
        this.field_ob = stackIn_3_1;
        if (19 == this.effectType) {
          this.worldY = -this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
          this.ageTicks = this.ageTicks + 1;
          if (this.ageTicks < 250) {
            this.worldY = this.worldY - (-250 + this.ageTicks) * ((this.ageTicks - 250) * 10);
          }
          if (this.ageTicks >= 400 &&
            this.ageTicks < 450) {
            var2 = 900000 - 2000 * this.ageTicks;
            this.worldY = this.worldY - var2;
            var3_int = this.ageTicks * 25 - 10000;
            this.a(5, 50 + var3_int, 3, -108, 10);
            this.worldY = this.worldY + var2;
          }
          if (this.ageTicks == 450) {
            this.a(4000, 0, 3, false, 50, (byte) -115);
          }
          if (this.ageTicks > 450) {
            var2Lifetime3 = 2 * (1 & this.ageTicks) - 1;
            var3_intLifetime3 = 750 * (var2Lifetime3 * (this.ageTicks - 450));
            this.worldX = this.worldX + var3_intLifetime3;
            this.worldY = -this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
            this.a(100, 256, 4, -124, 5 * this.ageTicks - 2250 + 50);
            this.worldY = -this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4;
            this.worldX = this.worldX - var3_intLifetime3;
          }
          if (this.ageTicks >= 500) {
            this.ageTicks = 0;
          }
          return;
        }
        if (this.effectType >= 12 &&
          this.effectType <= 16) {
          if (this.ageTicks == 0) {
            fc.a((byte) -110, 81, -1);
          }
          if (0 == (61 & this.ageTicks)) {
            fc.a((byte) 37, 2, this.worldX);
          }
          this.ageTicks = this.ageTicks + 1;
          var2Lifetime1 = 5100;
          if (this.velocityX == 1) {
            this.worldX = (this.world.terrain.getProfileLength(9) + 2 * var2Lifetime1) * this.ageTicks / 500 - var2Lifetime1 << 4;
          } else {
            this.worldX = -var2Lifetime1 + (2 * var2Lifetime1 + this.world.terrain.getProfileLength(99)) * (500 - this.ageTicks) / 500 << 4;
          }
          this.worldY = -(30000 * Math.abs(-250 + this.ageTicks) / 250) - 150000;
          if (this.effectType == 13 ||
            this.effectType == 15) {
            this.ageTicks = this.ageTicks + 1;
            this.worldY = -(30000 * this.ageTicks / 500) - 100000;
          }
          if (this.effectType == 16) {
            this.worldY = 400 * (this.ageTicks * this.ageTicks * 1800 / 250000) - 180000;
            if (this.ageTicks == 180) {
              this.world.field_b = 1;
              this.world.field_R = 1550;
              fc.a((byte) 104, 60, -1);
            }
            if (this.ageTicks > 250) {
              this.world.pendingRemovals.addLast((byte) 82, (DualNode) (this));
              var3_ref = (Sentinel) (this.world.sentinels.first(13058));
              while (var3_ref != null) {
                stackIn_73_0 = 0;
                stackIn_73_1 = var3_ref.armour;
                if (stackIn_73_0 < stackIn_73_1) {
                  var3_ref.velocityY = -3000;
                  stackIn_44_0 = var3_ref;
                  if (var3_ref.worldX <= this.worldX) {
                    stackIn_45_1 = -3000;
                  } else {
                    stackIn_45_1 = 3000;
                  }
                  stackIn_44_0.velocityX = stackIn_45_1;
                  var3_ref.clearArmour(128);
                  var3_ref.field_pc = false;
                }
                var3_ref = (Sentinel) (this.world.sentinels.next((byte) -96));
              }
            } else {
              if (this.ageTicks == 250) {
                var3_intLifetime1 = this.worldX;
                var4 = this.worldY;
                if ((this.ageTicks & 31) == 5) {
                  this.a(50, 2000, 0, -99, 20);
                }
                this.worldY = this.worldY - 10000;
                this.worldX = this.worldX - 25000;
                if ((this.ageTicks & 31) == 0) {
                  this.a(50, 2000, 0, obfuscationGuard - 111, 20);
                }
                this.worldX = this.worldX + 50000;
                this.worldY = this.worldY + 30000;
                if ((31 & this.ageTicks) == 10) {
                  this.a(50, 2000, 0, -102, 20);
                }
                this.worldY = var4;
                this.worldX = var3_intLifetime1;
                fc.a((byte) 80, 104, -1);
              }
            }
          }
          var3_refLifetime1 = (Sentinel) (this.world.sentinels.first(13058));
          while (true) {
            if (var3_refLifetime1 != null) {
              stackIn_70_0 = var3_refLifetime1.armour;
              if (stackIn_70_0 > 0 &&
                !var3_refLifetime1.field_pc &&
                var3_refLifetime1.field_Lb &&
                var3_refLifetime1.worldY < 25000 + this.worldY &&
                Math.abs(-this.worldX + var3_refLifetime1.worldX) < 65000) {
                var3_refLifetime1.field_dc = true;
                var3_refLifetime1.clearArmour(128);
                var3_refLifetime1.velocityX = this.velocityX * 3000;
              }
              var3_refLifetime1 = (Sentinel) (this.world.sentinels.next((byte) -101));
              continue;
            }
            break;
          }
          stackIn_70_0Lifetime1 = this.world.field_h ? 1 : 0;
          if (stackIn_70_0Lifetime1 == 0) {
            stackIn_73_0Lifetime1 = 1;
            stackIn_73_1Lifetime1 = 0;
            var3_ref2 = ArticulatedPart.createParticle(stackIn_73_0Lifetime1, stackIn_73_1Lifetime1, this.world, 116, this.worldY + 29000, false, 50, 100, this.worldX + 9000 * this.velocityX, this.worldX);
            this.world.pendingParticles.addLast(obfuscationGuard ^ -4, var3_ref2);
            var3_ref2Lifetime2 = ArticulatedPart.createParticle(1, 0, this.world, 101, this.worldY + 32000, false, 50, 100, this.worldX + 15000 * this.velocityX, this.worldX);
            this.world.pendingParticles.addLast(3, var3_ref2Lifetime2);
            var3_ref2Lifetime3 = ArticulatedPart.createParticle(1, 0, this.world, obfuscationGuard + 112, this.worldY + 35000, false, 50, 100, this.worldX + 21000 * this.velocityX, this.worldX);
            this.world.pendingParticles.addLast(3, var3_ref2Lifetime3);
          }
          boolean decompiledFrameRemainder0 = true;
          if (12 != this.effectType) {
            if (13 != this.effectType &&
              this.effectType != 15) {
              if (((this.effectType == 14)) &&
                (((7 & this.ageTicks) == 0)) &&
                (!(this.ageTicks <= 250))) {
                var10 = new Projectile(-(this.velocityX * 48000) + this.worldX, this.worldY + 8000, this.velocityX * -50, 25, 1, 1, 3, this.world, (Sentinel) null, 50, 0, 6);
                var10.field_ab = true;
                this.world.projectiles.addLast(3, var10);
                fc.a((byte) 27, 14, this.worldX);
                var10.targetSentinel = null;
                var4_ref_mb = (Sentinel) (this.world.sentinels.first(obfuscationGuard ^ -13059));
                while (var4_ref_mb != null) {
                  stackIn_100_0 = -1;
                  stackIn_100_1 = ~var4_ref_mb.armour;
                  if (stackIn_100_0 > stackIn_100_1 &&
                    !var4_ref_mb.field_pc) {
                    if (!var4_ref_mb.field_Lb) {
                      var4_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -74));
                      continue;
                    }
                    if (var10.targetSentinel == null ||
                      !(Math.abs(var4_ref_mb.worldX - var10.worldX) >= Math.abs(var10.targetSentinel.worldX - var10.worldX))) {
                      var10.targetSentinel = var4_ref_mb;
                      var10.targetWorldX = var10.targetSentinel.worldX;
                      var10.targetWorldY = var10.targetSentinel.worldY;
                    }
                  }
                  var4_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -74));
                }
                var10.targetSentinel = null;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var3_ref3 = new Projectile(-(this.velocityX * 30000) + this.worldX, this.worldY + 29000, 300 * this.velocityX, 200, 50, 1, 4, this.world, (Sentinel) null, 10, 0, 17);
              var3_ref3.field_ab = true;
              this.world.projectiles.addLast(3, var3_ref3);
              if (this.ageTicks % 50 == 0) {
                fc.a((byte) 110, 67, this.worldX);
              }
            }
          } else {
            if (0 == (31 & this.ageTicks) &&
              this.ageTicks > 250) {
              var3_ref3 = new Projectile(-(this.velocityX * 24000) + this.worldX, 23000 + this.worldY, this.velocityX * -50, 50, 1, 1, 6, this.world, (Sentinel) null, 500, 0, 31);
              var3_ref3.field_ab = true;
              this.world.projectiles.addLast(3, var3_ref3);
              fc.a((byte) -117, 62, this.worldX);
            }
          }
          stackIn_100_0Lifetime1 = ~this.ageTicks;
          stackIn_100_1Lifetime1 = -501;
          if (stackIn_100_0Lifetime1 > stackIn_100_1Lifetime1) {
            return;
          }
          this.velocityX = -this.velocityX;
          this.ageTicks = -500;
          if (this.effectType == 12) {
            this.effectType = 13;
          } else {
            if (this.effectType == 14) {
              this.effectType = 13;
            } else {
              if (13 == this.effectType) {
                this.world.pendingRemovals.addLast((byte) 79, (DualNode) (this));
              } else {
                if (this.effectType == 16) {
                  this.world.pendingRemovals.addLast((byte) 89, (DualNode) (this));
                }
              }
            }
          }
          return;
        }
        regionExit1: {
          if (this.effectType != 17) {
            if (this.effectType == 11) {
              if (!this.world.field_h &&
                this.ageTicks < 125) {
                var2_double = Math.random() * 3.14;
                var4Lifetime1 = (int)(1024.0 * Math.sin(var2_double));
                var5 = (int)(1024.0 * Math.cos(var2_double));
                var6 = -(this.ageTicks / 4) + (50 - (int)(Math.random() * (double)this.ageTicks / 4.0));
                var7 = ArticulatedPart.createParticle(4, var4Lifetime1, this.world, 100, -(var6 * var5) + this.worldY, this.field_ob, 50, var5, -(var4Lifetime1 * var6) + this.worldX, this.worldX);
                this.world.pendingParticles.addLast(3, var7);
              }
              boolean decompiledFrameRemainder2 = true;
              if (100 <= this.ageTicks &&
                this.ageTicks < 1000) {
                var2Lifetime2 = this.worldX + (this.ageTicks - 100) * (this.field_ib - this.worldX) / 400;
                if (80000 > Math.abs(var2Lifetime2 - this.field_ib) && (this.velocityX == 1 &&
                  (this.world.field_v & 1) == 0 ||
                  this.velocityX == -1 &&
                  (this.world.field_v & 2) == 0)) {
                  var11 = new IsaacRandom(new int[]{this.world.simulationTick});
                  var4Lifetime1Lifetime4 = 0;
                  while (7 > var4Lifetime1Lifetime4) {
                    var5_ref_wl = new Projectile(var2Lifetime2, this.worldY - (40 * this.ageTicks - 4000), 0, 0, this.field_hb, this.field_L, 6, this.world, this.sourceSentinel, 500, this.field_ib, 31);
                    var5_ref_wl.field_ab = this.field_ab;
                    var5_ref_wl.field_V = this.field_V;
                    var5_ref_wl.ageTicks = 31;
                    stackOut_182_0 = this.field_V;
                    stackIn_188_0 = stackOut_182_0 ? 1 : 0;
                    stackIn_183_0 = stackOut_182_0;
                    if (stackIn_183_0) {
                      var5_ref_wl.affectedSentinels = null;
                    }
                    var5_ref_wl.field_kb = this.field_kb;
                    var5_ref_wl.velocityX = var5_ref_wl.velocityX + (jh.sine16(8192 * var4Lifetime1Lifetime4 / 7 + this.world.simulationTick, obfuscationGuard ^ -4097) * wc.a((byte) -61, var11, 16) >> 13);
                    var5_ref_wl.velocityX = Math.abs(var5_ref_wl.velocityX) * -this.velocityX;
                    var5_ref_wl.velocityY = var5_ref_wl.velocityY + (kg.cosine16(var4Lifetime1Lifetime4 * 8192 / 7 + this.world.simulationTick, (byte) -95) * wc.a((byte) -61, var11, 16) >> 13);
                    this.world.field_db.addLast(3, var5_ref_wl);
                    var4Lifetime1Lifetime4++;
                  }
                  stackIn_188_0Lifetime1 = this.velocityX;
                  if (stackIn_188_0Lifetime1 == 1) {
                    this.world.field_v = this.world.field_v | 1;
                  }
                  if (this.world.field_b == 0) {
                    this.world.field_b = 1;
                  }
                  this.ageTicks = 1000;
                  if ((-1 == this.velocityX)) {
                    this.world.field_v = this.world.field_v | 2;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  if (!this.world.field_h) {
                    var3_ref2Lifetime1 = ArticulatedPart.createParticle(4, 0, this.world, obfuscationGuard ^ -99, -((this.ageTicks - 100) * 40) + this.worldY, this.field_ob, 50, -500 + (this.world.simulationTick & 1) * 1000, var2Lifetime2, this.worldX);
                    this.world.pendingParticles.addLast(3, var3_ref2Lifetime1);
                    var3_ref2Lifetime1 = ArticulatedPart.createParticle(1, 0, this.world, 125, this.worldY - (-100 + this.ageTicks) * 40, this.field_ob, 100, 0, var2Lifetime2, this.worldX);
                    this.world.pendingParticles.addLast(3, var3_ref2Lifetime1);
                  }
                }
              }
              this.ageTicks = this.ageTicks + 1;
              if (this.ageTicks == 500 && (this.velocityX == 1 &&
                0 == (this.world.field_v & 16) ||
                this.velocityX == -1 &&
                (32 & this.world.field_v) == 0)) {
                this.worldY = this.worldY - 16000;
                this.worldX = this.field_ib;
                this.a(1000, 5000, 0, -102, 200);
                if (this.velocityX != 1) {
                  if (this.velocityX == -1) {
                    if (0 != (this.world.field_v & 8)) {
                      this.worldX = this.worldX + 25000;
                      this.worldY = this.worldY + 10000;
                      this.world.field_v = this.world.field_v | 32;
                      this.a(2000, 5000, 0, -127, 400);
                      this.worldX = this.worldX - 50000;
                      this.worldY = this.worldY - 30000;
                      this.a(2000, 5000, 0, obfuscationGuard ^ 126, 500);
                      this.world.g(-124, 1);
                    }
                    if ((2 & this.world.field_v) != 0) {
                      this.world.field_v = this.world.field_v | 8;
                    }
                    this.world.field_v = this.world.field_v | 2;
                  }
                } else {
                  if ((this.world.field_v & 4) != 0) {
                    this.world.field_v = this.world.field_v | 16;
                    this.worldX = this.worldX - 25000;
                    this.worldY = this.worldY + 10000;
                    this.a(2000, 5000, 0, obfuscationGuard ^ 117, 400);
                    this.worldY = this.worldY - 30000;
                    this.worldX = this.worldX + 50000;
                    this.a(2000, 5000, 0, -100, 500);
                    this.world.g(obfuscationGuard - 116, 0);
                  }
                  if ((1 & this.world.field_v) != 0) {
                    this.world.field_v = this.world.field_v | 4;
                  }
                  this.world.field_v = this.world.field_v | 1;
                }
                this.ageTicks = 1000;
              }
              if (this.ageTicks >= 1000) {
                if (null != this.sourceSentinel) {
                  this.sourceSentinel.field_vb = this.sourceSentinel.field_vb + 10000;
                  this.sourceSentinel.field_Ab = this.sourceSentinel.field_Ab + 10000;
                  this.sourceSentinel.field_Fc = 50;
                  if (-1 == this.world.field_g) {
                    this.world.field_g = this.sourceSentinel.playerId;
                  }
                  this.sourceSentinel.field_qc = this.sourceSentinel.field_qc + 1;
                }
                this.world.pendingRemovals.addLast((byte) 124, (DualNode) (this));
              }
              return;
            }
            var2Lifetime2Lifetime3 = 0;
            scanLoop2: while (true) {
              if (this.field_L >= var2Lifetime2Lifetime3) {
                this.worldX = this.worldX + this.velocityX;
                this.worldY = this.worldY + this.velocityY;
                stackIn_456_0 = this.effectType;
                stackIn_456_1 = 4;
                if ((stackIn_456_0 == stackIn_456_1 ||
                  5 == this.effectType) &&
                  this.worldY < -180000) {
                  this.field_T = true;
                }
                boolean decompiledFrameRemainder1 = true;
                if (this.effectType != 4) {
                  if (this.effectType != 2) {
                    if (this.effectType != 7) {
                      if (this.effectType == 0) {
                        if (this.c(obfuscationGuard ^ -3, var2Lifetime2Lifetime3)) {
                          return;
                        }
                      } else {
                        if (this.effectType != 1 &&
                          this.effectType != 20) {
                          if (8 == this.effectType) {
                            if (this.b(var2Lifetime2Lifetime3, (byte) -114)) {
                              return;
                            }
                            decompiledFrameRemainder1 = false;
                          }
                          else {
                            if ((5 == this.effectType) &&
                              (decompiledFrameRemainder1 = !(!this.b(obfuscationGuard ^ -9, var2Lifetime2Lifetime3)))) {
                              return;
                            }
                            if (decompiledFrameRemainder1) {
                              if ((this.effectType == 6) &&
                                (decompiledFrameRemainder1 = !(!this.e(var2Lifetime2Lifetime3, obfuscationGuard + 30)))) {
                                return;
                              }
                              if ((decompiledFrameRemainder1) &&
                                (decompiledFrameRemainder1 = (3 == this.effectType)) &&
                                (decompiledFrameRemainder1 = !(!this.advanceGuidedMotion((byte) -102, var2Lifetime2Lifetime3)))) {
                                return;
                              }
                            }
                          }
                        }
                        if ((decompiledFrameRemainder1) &&
                          (this.f(var2Lifetime2Lifetime3, -29))) {
                          return;
                        }
                      }
                    } else {
                      if (this.a(var2Lifetime2Lifetime3, (byte) -95)) {
                        return;
                      }
                    }
                  } else {
                    if (this.d(var2Lifetime2Lifetime3, 50)) {
                      return;
                    }
                  }
                } else {
                  if (this.g(97, var2Lifetime2Lifetime3)) {
                    return;
                  }
                }
                if (this.affectedSentinels != null) {
                  this.a(obfuscationGuard + 92, var2Lifetime2Lifetime3);
                }
                if (!this.field_T && (!this.world.b(this.worldX, obfuscationGuard - 4) ||
                  !(this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) > -(this.worldY >> 4)) ||
                  !(this.world.terrain.getSurfaceProfileAt((byte) 121, this.worldX >> 4) < -(this.worldY >> 4))) && this.world.terrain.getGroundHeightAt((byte) -107, this.worldX >> 4) <= -(this.worldY >> 4)) {
                  if (this.field_T &&
                    this.field_I) {
                    break scanLoop2;
                  }
                  if (!this.field_T) {
                    var2Lifetime2Lifetime3++;
                    continue;
                  }
                  this.field_L = var2Lifetime2Lifetime3;
                  if (null == this.sourceSentinel) {
                    break scanLoop2;
                  }
                  if (this.effectType != 2) {
                    break scanLoop2;
                  }
                  if (this.field_gb) {
                    break scanLoop2;
                  }
                  this.sourceSentinel.field_p = 0;
                  break scanLoop2;
                }
                if (this.sourceSentinel != null &&
                  !this.field_V &&
                  !this.field_T &&
                  this.field_jb <= this.ageTicks && (this.targetSentinel == null ||
                  3 != this.effectType)) {
                  this.sourceSentinel.field_q = -200;
                  this.sourceSentinel.field_sb = this.sourceSentinel.field_sb + 1;
                }
                if (0 == this.effectType) {
                  if (this.sourceWeaponType != 1) {
                    if (12 == this.sourceWeaponType) {
                      this.a(64, 3, 1, false, 20, (byte) -103);
                    } else {
                      if (this.sourceWeaponType == 26) {
                        this.a(96, 6, 1, false, 30, (byte) -118);
                      }
                    }
                  } else {
                    this.a(64, 1, 1, false, 10, (byte) -116);
                  }
                  if (!this.field_I) {
                    this.world.pendingRemovals.addLast((byte) 36, (DualNode) (this));
                  } else {
                    this.field_T = true;
                  }
                } else {
                  if (this.effectType != 7) {
                    if (this.effectType != 4) {
                      if (1 != this.effectType &&
                        this.effectType != 20) {
                        if (this.effectType == 8) {
                          if (2 == this.sourceWeaponType) {
                            this.a(5, 256, 4, -108, 50);
                          } else {
                            if (this.sourceWeaponType == 19) {
                              this.a(15, 500, 0, -126, 25);
                            }
                          }
                          if (!this.field_I) {
                            this.world.pendingRemovals.addLast((byte) 83, (DualNode) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (this.effectType == 6) {
                          if (this.sourceWeaponType != 5) {
                            if (18 == this.sourceWeaponType) {
                              this.a(200, 750, 3, -112, 75);
                            } else {
                              if (this.sourceWeaponType == 31) {
                                this.a(500, 1000, 3, -98, 100);
                              }
                            }
                          } else {
                            this.a(25, 500, 3, obfuscationGuard - 111, 50);
                          }
                          if (!this.field_I) {
                            this.world.pendingRemovals.addLast((byte) 66, (DualNode) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (this.effectType != 2) {
                          if (3 == this.effectType) {
                            if (this.sourceWeaponType == 6) {
                              this.a(25, 300, 0, -115, 25);
                            } else {
                              if (34 == this.sourceWeaponType) {
                                this.a(200, 500, 0, obfuscationGuard ^ 97, 75);
                              }
                            }
                            if (this.field_I) {
                              this.field_T = true;
                              return;
                            }
                            this.world.pendingRemovals.addLast((byte) 76, (DualNode) (this));
                            return;
                          }
                          if (5 != this.effectType) {
                            if (this.field_I) {
                              this.field_T = true;
                              return;
                            }
                            this.world.pendingRemovals.addLast((byte) 75, (DualNode) (this));
                            return;
                          }
                          if (this.sourceWeaponType == 3) {
                            this.a(50, 2, 0, false, 5, (byte) -121);
                          } else {
                            if (this.sourceWeaponType == 16) {
                              this.a(100, 4, 0, false, 5, (byte) -114);
                            } else {
                              if (this.sourceWeaponType == 29) {
                                this.a(150, 8, 0, false, 5, (byte) -98);
                              }
                            }
                          }
                          if (!this.field_I) {
                            this.world.pendingRemovals.addLast((byte) 115, (DualNode) (this));
                            return;
                          }
                          this.field_T = true;
                          return;
                        }
                        if (9 != this.sourceWeaponType) {
                          if (this.sourceWeaponType != 7) {
                            if (8 != this.sourceWeaponType) {
                              if (this.sourceWeaponType == 20) {
                                this.a(200, 1500, 0, obfuscationGuard - 108, 150);
                              } else {
                                if (this.sourceWeaponType == 33) {
                                  this.a(400, 2500, 0, obfuscationGuard - 119, 200);
                                } else {
                                  if (this.sourceWeaponType != 19) {
                                    if (this.sourceWeaponType == 32) {
                                      if (!this.field_I &&
                                        !this.field_V) {
                                        fc.a((byte) 45, 104, this.worldX);
                                      }
                                      this.a(250, 1500, 0, -96, 50);
                                      this.a(5000, 5000, 2, -95, 500);
                                      this.a(5000, 2500, 3, obfuscationGuard ^ 117, 500);
                                      if (this.world.field_b == 0 &&
                                        !this.field_V) {
                                        this.world.field_b = 1;
                                      }
                                    }
                                  } else {
                                    this.a(10, 256, 0, -103, 10);
                                  }
                                }
                              }
                            } else {
                              this.a(50, 1000, 8, -103, 25);
                            }
                          } else {
                            this.a(25, 1000, 0, -100, 50);
                          }
                        } else {
                          this.field_W = true;
                          this.a(500, 1000, 2, -122, 1500);
                        }
                        if (this.field_I) {
                          this.field_T = true;
                          return;
                        }
                        this.world.pendingRemovals.addLast((byte) 80, (DualNode) (this));
                        return;
                      }
                      if (this.sourceWeaponType != 2) {
                        if (this.sourceWeaponType != 13) {
                          if (this.sourceWeaponType != 15) {
                            if (14 != this.sourceWeaponType) {
                              if (this.sourceWeaponType != 28) {
                                if (27 == this.sourceWeaponType) {
                                  this.a(20, 512, 0, obfuscationGuard ^ 100, 50);
                                }
                              } else {
                                if (this.ageTicks < 20) {
                                  this.field_O = this.field_O / 2;
                                  this.a(10, 100, 0, -107, 50);
                                } else {
                                  this.a(40, 1500, 0, obfuscationGuard - 118, 50);
                                }
                              }
                            } else {
                              if (this.ageTicks < 20) {
                                this.field_O = this.field_O / 2;
                                this.a(10, 32, 0, -110, 25);
                              } else {
                                this.a(20, 750, 0, -124, 25);
                              }
                            }
                          } else {
                            if (this.ageTicks >= this.field_jb &&
                              null != this.sourceSentinel &&
                              this.field_E) {
                              this.a(32, 5, 0, false, 25, (byte) -126);
                            } else {
                              this.a(32, 5, 0, false, 25, (byte) -107);
                            }
                          }
                        } else {
                          this.a(10, 32, 0, -101, 50);
                        }
                      } else {
                        this.a(1, 32, 1, obfuscationGuard - 101, 5);
                      }
                      if (!this.field_I) {
                        this.world.pendingRemovals.addLast((byte) 92, (DualNode) (this));
                      } else {
                        this.field_T = true;
                      }
                    } else {
                      if (this.sourceWeaponType != 10) {
                        if (this.sourceWeaponType == 21) {
                          this.a(1500, 3, 2, false, 20, (byte) -105);
                        } else {
                          if (!this.field_T) {
                            if (!this.world.field_h &&
                              !this.field_V) {
                              var3_ref2Lifetime1Lifetime1 = ArticulatedPart.createParticle(2, 0, this.world, 114, -(this.world.terrain.getGroundHeightAt((byte) -109, this.worldX >> 4) << 4) - 8, this.field_ob, 250, 0, this.worldX, this.worldX);
                              this.world.pendingParticles.addLast(obfuscationGuard ^ -4, var3_ref2Lifetime1Lifetime1);
                            }
                            if (!this.world.field_h &&
                              !this.field_V) {
                              stackIn_316_0 = 13;
                              stackIn_316_1 = -this.velocityX / 2;
                              stackIn_316_2 = this.world;
                              stackIn_316_3 = obfuscationGuard ^ -112;
                              stackIn_316_4 = this.worldY;
                              stackIn_316_5 = this.field_ob;
                              if (this.sourceWeaponType == 17) {
                                stackIn_317_6 = 100;
                              } else {
                                stackIn_317_6 = 20;
                              }
                              var3_ref2Lifetime1Lifetime1 = ArticulatedPart.createParticle(stackIn_316_0, stackIn_316_1, stackIn_316_2, stackIn_316_3, stackIn_316_4, stackIn_316_5, stackIn_317_6, -this.velocityY / 2, this.worldX, this.worldX);
                              this.world.pendingParticles.addLast(3, var3_ref2Lifetime1Lifetime1);
                            }
                          } else {
                            this.a(32, 1, 1, false, 10, (byte) -98);
                            if (!this.world.field_h &&
                              !this.field_V) {
                              stackIn_306_0 = 13;
                              stackIn_306_1 = -this.velocityX / 2;
                              stackIn_306_2 = this.world;
                              stackIn_306_3 = obfuscationGuard + 121;
                              stackIn_306_4 = this.worldY;
                              stackIn_306_5 = this.field_ob;
                              if (this.sourceWeaponType == 17) {
                                stackIn_307_6 = 100;
                              } else {
                                stackIn_307_6 = 20;
                              }
                              var3_ref2Lifetime1Lifetime1 = ArticulatedPart.createParticle(stackIn_306_0, stackIn_306_1, stackIn_306_2, stackIn_306_3, stackIn_306_4, stackIn_306_5, stackIn_307_6, -this.velocityY / 2, this.worldX, this.worldX);
                              this.world.pendingParticles.addLast(3, var3_ref2Lifetime1Lifetime1);
                            }
                          }
                        }
                      } else {
                        this.a(32, 1, 2, false, 10, (byte) -99);
                      }
                      if (!this.field_I) {
                        this.world.pendingRemovals.addLast((byte) 100, (DualNode) (this));
                      } else {
                        this.field_T = true;
                      }
                    }
                  } else {
                    if (this.sourceWeaponType == 0) {
                      this.a(2, 500, 2, obfuscationGuard - 117, 100);
                    } else {
                      if (11 == this.sourceWeaponType) {
                        this.a(10, 750, 2, -122, 500);
                      }
                    }
                    if (!this.field_I) {
                      this.world.pendingRemovals.addLast((byte) 77, (DualNode) (this));
                      break regionExit1;
                    }
                    this.field_T = true;
                  }
                }
                return;
              }
              break;
            }
            if (this.field_W &&
              !this.field_V) {
              var12 = new NodeIterator(this.world.field_db);
              var3_ref3Lifetime1 = (Projectile) (var12.b(obfuscationGuard ^ -3));
              while (var3_ref3Lifetime1 != null) {
                var4Lifetime1Lifetime3 = this.worldX - var3_ref3Lifetime1.worldX;
                var5Lifetime3 = this.worldY - var3_ref3Lifetime1.worldY;
                stackIn_456_0Lifetime1 = 2;
                stackIn_456_1Lifetime1 = var3_ref3Lifetime1.effectType;
                if ((stackIn_456_0Lifetime1 == stackIn_456_1Lifetime1 ||
                  var3_ref3Lifetime1.effectType == 3 ||
                  var3_ref3Lifetime1.effectType == 20) &&
                  (var3_ref3Lifetime1.sourceWeaponType != 32 &&
                  Math.abs(var4Lifetime1Lifetime3) <= 256 &&
                  Math.abs(var5Lifetime3) <= 256)) {
                  if (20 != var3_ref3Lifetime1.effectType) {
                    var3_ref3Lifetime1.field_T = true;
                  }
                  if (this.sourceSentinel != null &&
                    this.sourceSentinel != var3_ref3Lifetime1.sourceSentinel) {
                    this.sourceSentinel.field_ob = this.sourceSentinel.field_ob + 1;
                  }
                  var3_ref3Lifetime1.sourceSentinel = this.sourceSentinel;
                  if (this.effectType == 7) {
                    this.field_P = true;
                  }
                  var3_ref3Lifetime1.field_bb = true;
                }
                var3_ref3Lifetime1 = (Projectile) (var12.d(obfuscationGuard ^ -3));
              }
            }
            stackIn_456_0Lifetime2 = obfuscationGuard;
            stackIn_456_1Lifetime2 = ~this.field_L;
            if (stackIn_456_0Lifetime2 > stackIn_456_1Lifetime2) {
              this.field_L = this.field_L - 1;
            }
            if (this.applyGravity) {
              this.velocityY = this.velocityY + this.world.gravityAcceleration;
              if (this.effectType == 4) {
                this.velocityY = this.velocityY + 3 * this.world.gravityAcceleration;
              }
            }
            this.ageTicks = this.ageTicks + 1;
            if (this.worldX >= -128 &&
              this.worldX <= (this.world.terrain.getProfileLength(obfuscationGuard - 126) << 4) + 128) {
              return;
            }
            if (this.field_I) {
              this.field_T = true;
            } else {
              this.world.pendingRemovals.addLast((byte) 42, (DualNode) (this));
            }
            return;
          }
          if (this.targetSentinel == null) {
            var2_ref_mb = (Sentinel) (this.world.sentinels.first(13058));
            while (var2_ref_mb != null) {
              if (var2_ref_mb.armour > 0 &&
                !var2_ref_mb.field_pc && ((var2_ref_mb.teamId == 1 &&
                -1 == this.velocityX ||
                0 == var2_ref_mb.teamId &&
                this.velocityX == 1) &&
                (this.targetSentinel == null ||
                !(Math.abs(var2_ref_mb.worldX - this.worldX) >= Math.abs(this.targetSentinel.worldX - this.worldX))))) {
                this.targetSentinel = var2_ref_mb;
                this.targetWorldX = this.targetSentinel.worldX;
                this.targetWorldY = this.targetSentinel.worldY;
              }
              var2_ref_mb = (Sentinel) (this.world.sentinels.next((byte) -93));
            }
            if (this.targetSentinel == null) {
              this.world.pendingRemovals.addLast((byte) 97, (DualNode) (this));
            }
            return;
          }
          if (!(this.targetSentinel.armour > 0) ||
            this.targetSentinel.field_Hb) {
            this.world.pendingRemovals.addLast((byte) 40, (DualNode) (this));
          }
          if (!this.world.field_h &&
            this.ageTicks < 125) {
            var2_doubleLifetime1 = Math.random() * 3.14;
            var4Lifetime1Lifetime1 = (int)(Math.sin(var2_doubleLifetime1) * 1024.0);
            var5Lifetime1 = (int)(1024.0 * Math.cos(var2_doubleLifetime1));
            var6Lifetime1 = -(this.ageTicks / 4) + 50 - (int)(Math.random() * (double)this.ageTicks / 4.0);
            var7Lifetime1 = ArticulatedPart.createParticle(4, var4Lifetime1Lifetime1, this.world, obfuscationGuard ^ -119, -(var5Lifetime1 * var6Lifetime1) + this.worldY, this.field_ob, 50, var5Lifetime1, -(var4Lifetime1Lifetime1 * var6Lifetime1) + this.worldX, this.worldX);
            this.world.pendingParticles.addLast(3, var7Lifetime1);
          }
          if (this.ageTicks >= 100 &&
            this.ageTicks < 1000) {
            this.worldX = this.worldX + this.velocityX * 1000;
            var2Lifetime2Lifetime1 = (-100 + this.ageTicks) * (this.targetSentinel.worldX - this.worldX) / 900 + this.worldX;
            var3_intLifetime2 = (-100 + this.ageTicks) * (-this.worldY + this.targetSentinel.worldY) / 900 + this.worldY;
            if (!this.world.field_h) {
              var4_ref_qb = ArticulatedPart.createParticle(4, 0, this.world, 125, var3_intLifetime2, this.field_ob, 50, 1000 * (1 & this.world.simulationTick) - 500, var2Lifetime2Lifetime1, this.worldX);
              this.world.pendingParticles.addLast(obfuscationGuard + 4, var4_ref_qb);
              var4_ref_qbLifetime1 = ArticulatedPart.createParticle(1, 0, this.world, 125, var3_intLifetime2, this.field_ob, 100, 0, var2Lifetime2Lifetime1, this.worldX);
              this.world.pendingParticles.addLast(3, var4_ref_qbLifetime1);
            }
          }
          this.ageTicks = this.ageTicks + 1;
          if (this.ageTicks >= 1000) {
            this.worldX = this.targetSentinel.worldX;
            this.worldY = this.targetSentinel.worldY;
            this.a(1000, 5000, 0, obfuscationGuard - 121, 200);
            var2Lifetime2Lifetime2 = -1;
            var3_intLifetime2Lifetime1 = 0;
            while (var3_intLifetime2Lifetime1 < 2) {
              var4Lifetime1Lifetime2 = this.world.terrain.spawnPositions[var3_intLifetime2Lifetime1];
              var5Lifetime2 = -1080;
              var6Lifetime2 = 4800;
              var7_int = (this.worldX >> 4) - var4Lifetime1Lifetime2;
              var8 = (this.worldY >> 4) - var5Lifetime2;
              stackIn_151_0 = var6Lifetime2 * var6Lifetime2;
              stackIn_151_1 = var7_int * var7_int + var8 * var8;
              if (stackIn_151_0 > stackIn_151_1) {
                var2Lifetime2Lifetime2 = var3_intLifetime2Lifetime1;
              }
              var3_intLifetime2Lifetime1++;
            }
            stackIn_151_0Lifetime1 = -2;
            stackIn_151_1Lifetime1 = ~this.velocityX;
            if (stackIn_151_0Lifetime1 == stackIn_151_1Lifetime1 &&
              1 == var2Lifetime2Lifetime2) {
              if ((this.world.field_v & 8) != 0) {
                this.worldY = this.worldY + 10000;
                this.worldX = this.worldX + 25000;
                this.world.field_v = this.world.field_v | 32;
                this.a(2000, 5000, 0, -122, 400);
                this.worldX = this.worldX - 50000;
                this.worldY = this.worldY - 30000;
                this.a(2000, 5000, 0, -104, 500);
                this.world.g(-121, 1);
              }
              this.world.field_v = this.world.field_v | 8;
              this.world.field_v = this.world.field_v | 2;
            } else {
              if (this.velocityX == -1 &&
                var2Lifetime2Lifetime2 == 0) {
                if (0 != (4 & this.world.field_v)) {
                  this.worldX = this.worldX - 25000;
                  this.worldY = this.worldY + 10000;
                  this.world.field_v = this.world.field_v | 16;
                  this.a(2000, 5000, 0, -128, 400);
                  this.worldX = this.worldX + 50000;
                  this.worldY = this.worldY - 30000;
                  this.a(2000, 5000, 0, obfuscationGuard ^ 95, 500);
                  this.world.g(-116, 0);
                }
                this.world.field_v = this.world.field_v | 4;
                this.world.field_v = this.world.field_v | 1;
              }
            }
            this.world.pendingRemovals.addLast((byte) 125, (DualNode) (this));
            return;
          }
        }
    }

    public static void h(int param0) {
        field_Y = null;
        field_R = null;
        field_J = null;
        field_db = null;
        if (param0 != 31554) {
          field_Y = (String) null;
        }
        field_N = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int incrementValue$1 = 0;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var24Lifetime2;
        int var24Lifetime1Lifetime1;
        var14 = (param0 << 4) - param13;
        var15 = param11;
        var16 = param1;
        var17 = param2;
        for (var18 = param8; var18 < param9; var18++) {
          if (var16 < param5) {
            var19 = (var18 << 4) - param12;
            var20 = (var16 << param4) / param6;
            var21 = ff.field_kb[var20] * param10 >> 15;
            var22 = var18 + (var19 * var21 + 131072 >> 18);
            if (var22 > 639) {
              var22 = 639;
            }
            var23 = param0 + (var14 * var21 + 131072 >> 18);
            if (var23 < 0) {
              var23 = 0;
            }
            var24 = SoftwareRaster.field_g[var23 * 640 + var22];
            var25 = 64 + (ff.field_ib[var20] * param10 >> 17);
            if (var25 < 0) {
              var25 = -var25;
            }
            var26 = (var24 & 16711935) * var25;
            var25 = (var24 & 65280) * var25;
            var24Lifetime2 = (var26 & 1069563840) + (var25 & 4177920);
            var26 = (var26 & -1073692672) + (var25 & 12582912);
            var26 = (var26 | var26 >>> 1) & 1077952512;
            incrementValue$1 = var15;
            var15++;
            SoftwareRaster.field_g[incrementValue$1] = (var24Lifetime2 | var26 - (var26 >>> 8)) >>> 6;
            var16 = var16 + var17;
            var17 = var17 + param3;
            continue;
          }
          break;
        }
        var15Lifetime1 = param11;
        var16Lifetime1 = param1;
        var17Lifetime1 = param2;
        for (var18Lifetime1 = param8 - 1; var18Lifetime1 >= param7; var18Lifetime1--) {
          var17Lifetime1 = var17Lifetime1 - param3;
          var16Lifetime1 = var16Lifetime1 - var17Lifetime1;
          if (var16Lifetime1 >= param5) {
            return;
          }
          var19Lifetime1 = (var18Lifetime1 << 4) - param12;
          var20Lifetime1 = (var16Lifetime1 << param4) / param6;
          var21Lifetime1 = ff.field_kb[var20Lifetime1] * param10 >> 15;
          var22Lifetime1 = var18Lifetime1 + (var19Lifetime1 * var21Lifetime1 + 131072 >> 18);
          if (var22Lifetime1 < 0) {
            var22Lifetime1 = 0;
          }
          var23Lifetime1 = param0 + (var14 * var21Lifetime1 + 131072 >> 18);
          if (var23Lifetime1 < 0) {
            var23Lifetime1 = 0;
          }
          var24Lifetime1 = SoftwareRaster.field_g[var23Lifetime1 * 640 + var22Lifetime1];
          var25Lifetime1 = 64 + (ff.field_ib[var20Lifetime1] * param10 >> 17);
          if (var25Lifetime1 < 0) {
            var25Lifetime1 = -var25Lifetime1;
          }
          var26Lifetime1 = (var24Lifetime1 & 16711935) * var25Lifetime1;
          var25Lifetime1 = (var24Lifetime1 & 65280) * var25Lifetime1;
          var24Lifetime1Lifetime1 = (var26Lifetime1 & 1069563840) + (var25Lifetime1 & 4177920);
          var26Lifetime1 = (var26Lifetime1 & -1073692672) + (var25Lifetime1 & 12582912);
          var26Lifetime1 = (var26Lifetime1 | var26Lifetime1 >>> 1) & 1077952512;
          var15Lifetime1--;
          SoftwareRaster.field_g[var15Lifetime1] = (var24Lifetime1Lifetime1 | var26Lifetime1 - (var26Lifetime1 >>> 8)) >>> 6;
        }
    }

    private final void g(int param0) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        boolean stackIn_20_1 = false;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int stackIn_15_0Lifetime1;
        int stackIn_15_1Lifetime1;
        var9 = SteelSentinels.obfuscationControl;
        if (param0 != 1354276) {
          this.field_P = true;
        }
        var2 = 0;
        if (3 == this.world.terrain.getTerrainType(103)) {
          var3 = this.world.terrain.getProfileLength(-123) >> 1;
          var4 = 600;
          var5 = 5120;
          var6 = -var3 + (this.worldX >> 4);
          var7 = -var4 + (this.worldY >> 4);
          if (var6 * var6 + var7 * var7 < var5 * var5) {
            var2 = 1;
          }
        } else {
          if (this.world.terrain.getTerrainType(52) == 4) {
            for (var3 = 0; var3 < 2; var3++) {
              stackIn_15_0 = 0;
              stackIn_15_1 = var3 + 1 & this.world.field_v;
              if (stackIn_15_0 == stackIn_15_1) {
                var4 = this.world.terrain.spawnPositions[var3];
                var5 = -1080;
                var6 = 4800;
                var7 = -var4 + (this.worldX >> 4);
                var8 = (this.worldY >> 4) - var5;
                if (var7 * var7 + var8 * var8 < var6 * var6) {
                  var2 = 1;
                }
              }
            }
          }
        }
        stackIn_15_0Lifetime1 = this.field_mb ? 1 : 0;
        stackIn_15_1Lifetime1 = var2;
        if (stackIn_15_0Lifetime1 != stackIn_15_1Lifetime1) {
          this.field_T = true;
        }
        stackIn_20_1 = (var2 != 0);
        this.field_mb = stackIn_20_1;
    }

    private final boolean c(int param0, int param1) {
        ParticleEffect var3 = null;
        if (param0 != 2) {
          return true;
        }
        this.field_L = 10;
        if (!this.world.field_h &&
          !this.field_V) {
          var3 = ArticulatedPart.createParticle(3, -this.velocityX / 2, this.world, 108, this.worldY, this.field_ob, 10, -this.velocityY / 2, this.worldX, this.worldX);
          var3.ageTicks = 10 * this.ageTicks / this.field_hb;
          this.world.pendingParticles.addLast(param0 ^ 1, var3);
        }
        if (this.ageTicks <= this.field_hb) {
        } else {
          if (!this.field_I) {
            this.world.pendingRemovals.addLast((byte) 127, (DualNode) (this));
          } else {
            this.field_T = true;
            return true;
          }
          return true;
        }
        this.applyGravity = false;
        return false;
    }

    Projectile(int param0, int param1, int param2, int param3, int param4, int param5, int param6, CombatWorld param7, Sentinel param8, int param9, int param10, int param11) {
        int incrementValue$0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_1 = 0;
        int stackIn_17_1 = 0;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        NodeIterator var14 = null;
        Sentinel var15 = null;
        this.field_M = 10;
        this.field_z = 50;
        try {
          this.worldY = param1;
          this.field_L = param5;
          this.sourceWeaponType = param11;
          this.world = param7;
          this.sourceSentinel = param8;
          this.field_G = param8;
          this.field_O = param9;
          this.worldX = param0;
          this.effectType = param6;
          this.ageTicks = 0;
          this.field_ib = param10;
          if (param3 >= 0) {
            if (param3 == 0) {
              stackIn_6_1 = 0;
            } else {
              stackIn_6_1 = 1;
            }
          } else {
            stackIn_6_1 = -1;
          }
          this.initialDirectionY = stackIn_6_1;
          if (param2 >= 0) {
            if (param2 != 0) {
              stackIn_11_1 = 1;
            } else {
              stackIn_11_1 = 0;
            }
          } else {
            stackIn_11_1 = -1;
          }
          this.initialDirectionX = stackIn_11_1;
          this.velocityX = param2;
          this.field_hb = param4;
          this.velocityY = param3;
          this.targetWorldX = this.worldX;
          this.targetWorldY = this.worldY;
          this.g(1354276);
          if (this.sourceSentinel != null) {
            this.field_ob = this.sourceSentinel.field_u;
          }
          this.field_kb = 0;
          this.field_T = false;
          if (this.effectType != 5 &&
            15 != this.sourceWeaponType) {
            stackIn_17_1 = 75;
          } else {
            stackIn_17_1 = 42;
          }
          this.field_jb = stackIn_17_1 * 4 / this.world.gravityAcceleration;
          this.field_bb = false;
          this.field_gb = false;
          this.field_W = false;
          stackIn_22_1 = (this.sourceWeaponType == 15) && (null != this.sourceSentinel) && (this.sourceSentinel.field_q > 0);
          this.field_E = stackIn_22_1;
          this.affectedSentinels = new Sentinel[this.world.sentinels.size((byte) -128)];
          var13_int = 0;
          var14 = new NodeIterator(this.world.sentinels);
          var15 = (Sentinel) (var14.b(2));
          while (var15 != null) {
            if (var15.chassis.componentId != nn.field_c[0] ||
              null == this.sourceSentinel ||
              nn.field_c[0] != this.sourceSentinel.chassis.componentId) {
              incrementValue$0 = var13_int;
              var13_int++;
              this.affectedSentinels[incrementValue$0] = var15;
            }
            var15 = (Sentinel) (var14.d(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_32_0 = var13;
          stackIn_32_1 = new StringBuilder().append("wl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param8 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    static {
        field_N = new rf();
        field_Y = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
        field_db = new byte[520];
        field_lb = false;
        field_R = "This game has been updated! Please reload this page.";
        field_D = 0;
    }
}
