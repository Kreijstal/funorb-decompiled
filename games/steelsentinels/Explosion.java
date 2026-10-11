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
        uh.a(stackIn_13_0);
        return var1;
    }

    final void advanceExplosion(boolean obfuscationGuard) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        double stackIn_50_0 = 0.0;
        double stackIn_51_0 = 0.0;
        double stackIn_52_0 = 0.0;
        int stackIn_52_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_266_0 = 0;
        int stackIn_266_1 = 0;
        int statePc = 0;
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
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = SteelSentinels.obfuscationControl;
                    var2 = 0;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    stackIn_2_0 = this.field_N;
                    stackIn_2_1 = var2;
                    statePc = 2;
                    continue scanLoop1;
                }
                case 2: {
                    if (stackIn_2_0 < stackIn_2_1) {
                        statePc = 71;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 3. */
                        {
                            this.worldY = this.worldY + this.velocityY;
                            this.worldX = this.worldX + this.velocityX;
                            stackIn_266_0 = ~this.world.terrain.getGroundHeightAt((byte) -105, this.worldX >> 4);
                            stackIn_4_0 = stackIn_266_0;
                            stackIn_266_1 = ~-(this.worldY >> 4);
                            stackIn_4_1 = stackIn_266_1;
                            if (var13 != 0) {
                                statePc = 266;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 4. */
                                {
                                    if (stackIn_4_0 >= stackIn_4_1) {
                                        statePc = 6;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 5. */
                                        {
                                            this.worldY = -(this.world.terrain.getGroundHeightAt((byte) -124, this.worldX >> 4) << 4);
                                            statePc = 6;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 6: {
                    var3 = this.field_G * this.ageTicks / (this.durationTicks * 2);
                    if (var3 != 0) {
                        statePc = 10;
                    } else {
                        statePc = 7;
                    }
                    continue scanLoop1;
                }
                case 7: {
                    if (0 < this.ageTicks) {
                        /* Inlined CFG state: 9. */
                        {
                            var3 = 1;
                            statePc = 10;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 10;
                        continue scanLoop1;
                    }
                }
                case 10: {
                    this.ageTicks = this.ageTicks + 1;
                    var4 = this.ageTicks * this.field_G / (this.durationTicks * 2);
                    if (this.projectile == null) {
                        statePc = 29;
                    } else {
                        statePc = 11;
                    }
                    continue scanLoop1;
                }
                case 11: {
                    if (this.affectedSentinels == null) {
                        statePc = 29;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 12. */
                        {
                            if (this.projectile.effectType == 7) {
                                statePc = 15;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 13. */
                                {
                                    if (this.projectile.sourceWeaponType != 9) {
                                        statePc = 29;
                                    } else {
                                        statePc = 15;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 15: {
                    if ((this.ageTicks & 63) != 0) {
                        statePc = 29;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 16. */
                        {
                            var14 = new NodeIterator(this.world.sentinels);
                            var6 = 0;
                            var7_ref_mb = (Sentinel) (var14.b(2));
                            statePc = 17;
                            continue scanLoop1;
                        }
                    }
                }
                case 17: {
                    if (var7_ref_mb == null) {
                        statePc = 24;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 18. */
                        {
                            stackIn_25_0 = var6;
                            stackIn_19_0 = stackIn_25_0;
                            stackIn_25_1 = this.affectedSentinels.length;
                            stackIn_19_1 = stackIn_25_1;
                            if (var13 != 0) {
                                statePc = 25;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 19. */
                                {
                                    if (stackIn_19_0 == stackIn_19_1) {
                                        /* Inlined CFG state: 21. */
                                        {
                                            var15 = this.affectedSentinels;
                                            this.affectedSentinels = new Sentinel[this.world.sentinels.size((byte) -128)];
                                            ii.a(var15, 0, this.affectedSentinels, 0, var6);
                                            statePc = 22;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        statePc = 22;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    }
                }
                case 22: {
                    this.affectedSentinels[var6] = var7_ref_mb;
                    var6++;
                    var7_ref_mb = (Sentinel) (var14.d(2));
                    if (var13 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 24;
                    }
                    continue scanLoop1;
                }
                case 24: {
                    stackIn_25_0 = ~var6;
                    stackIn_25_1 = ~this.affectedSentinels.length;
                    statePc = 25;
                    continue scanLoop1;
                }
                case 25: {
                    if (stackIn_25_0 <= stackIn_25_1) {
                        statePc = 29;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 26. */
                        {
                            this.affectedSentinels[var6] = null;
                            var6++;
                            if (var13 != 0) {
                                statePc = 31;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 27. */
                                {
                                    if (var13 == 0) {
                                        statePc = 24;
                                    } else {
                                        statePc = 29;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 29: {
                    if (var4 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue scanLoop1;
                }
                case 31: {
                    var4 = 1;
                    statePc = 32;
                    continue scanLoop1;
                }
                case 32: {
                    if (!this.world.field_h) {
                        statePc = 34;
                    } else {
                        statePc = 70;
                    }
                    continue scanLoop1;
                }
                case 34: {
                    if (var4 <= var3) {
                        statePc = 70;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 35. */
                        {
                            var5_double = 3.141592653589793 * Math.random() * 2.0;
                            var7_ref = null;
                            stackIn_2_0 = 0;
                            stackIn_36_0 = stackIn_2_0;
                            stackIn_2_1 = this.field_K;
                            stackIn_36_1 = stackIn_2_1;
                            if (var13 != 0) {
                                statePc = 2;
                            } else {
                                statePc = 36;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 36: {
                    if (stackIn_36_0 == stackIn_36_1) {
                        /* Inlined CFG state: 66. */
                        {
                            var8_double = (Math.random() * (double)(-this.ageTicks + this.durationTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks + 1.0;
                            var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                            var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                            var7_ref_qb = ArticulatedPart.a(1, 0, this.world, 126, this.worldY + var11 / 2, this.field_R, 150, 0, var10 / 2 + this.worldX, this.field_y);
                            this.world.field_O.addLast(3, var7_ref_qb);
                            if (10 <= this.ageTicks) {
                                statePc = 68;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 67. */
                                {
                                    var12 = 25;
                                    var7_ref_qb = ArticulatedPart.a(10, (int)((double)(var12 * var10) / var8_double), this.world, 95, var11 + this.worldY, this.field_R, 100, (int)((double)(var12 * var11) / var8_double), var10 + this.worldX, this.field_y);
                                    this.world.field_O.addLast(3, var7_ref_qb);
                                    statePc = 68;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 37. */
                        {
                            if (this.field_K != 1) {
                                /* Inlined CFG state: 39. */
                                {
                                    if (this.field_K == 2) {
                                        /* Inlined CFG state: 57. */
                                        {
                                            var8_double = (Math.random() * (double)(this.durationTicks - this.ageTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                            var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                            var7_ref_qb = ArticulatedPart.a(1, 0, this.world, 125, var11 / 2 + this.worldY, this.field_R, 50, 0, this.worldX + var10 / 2, this.field_y);
                                            this.world.field_O.addLast(3, var7_ref_qb);
                                            var12 = 0;
                                            statePc = 58;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 40. */
                                        {
                                            if (this.field_K == 3) {
                                                /* Inlined CFG state: 56. */
                                                {
                                                    var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                                    var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                                                    var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                                    var7_ref_qb = ArticulatedPart.a(4, 0, this.world, 95, this.worldY + var11, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                                                    this.world.field_O.addLast(3, var7_ref_qb);
                                                    statePc = 69;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 41. */
                                                {
                                                    if (4 != this.field_K) {
                                                        statePc = 43;
                                                    } else {
                                                        statePc = 42;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                /* Inlined CFG state: 38. */
                                {
                                    var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                    var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                    var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                    var7_ref_qb = ArticulatedPart.a(3, 0, this.world, 104, this.worldY + var11, this.field_R, 50, 0, var10 + this.worldX, this.field_y);
                                    this.world.field_O.addLast(3, var7_ref_qb);
                                    statePc = 69;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 42: {
                    var8_double = (Math.random() * (double)(-this.ageTicks + this.durationTicks) / 4.0 + (double)this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                    var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                    var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                    var7_ref_qb = ArticulatedPart.a(1, 0, this.world, 114, this.worldY + var11, this.field_R, 150, 0, this.worldX + var10, this.field_y);
                    this.world.field_O.addLast(3, var7_ref_qb);
                    var7_ref_qb = ArticulatedPart.a(0, var10 >> 5, this.world, 115, this.worldY + var11 / 2, this.field_R, 300, var11 >> 5, this.worldX + var10 / 2, this.field_y);
                    this.world.field_O.addLast(3, var7_ref_qb);
                    statePc = 69;
                    continue scanLoop1;
                }
                case 43: {
                    if (5 == this.field_K) {
                        /* Inlined CFG state: 55. */
                        {
                            var8_double = Math.random() * (double)((this.durationTicks - this.ageTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                            var11 = (int)(var8_double * Math.cos(var5_double)) << 4;
                            var7_ref_qb = ArticulatedPart.a(5, 0, this.world, 104, this.worldY - (-(var11 / 256) + 3584), this.field_R, 100, 0, this.worldX + var10 / 256, this.field_y);
                            this.world.field_O.addLast(3, var7_ref_qb);
                            var10 = (int)(Math.sin((double)var3 * 0.2) * var8_double) << 4;
                            var11 = (int)(var8_double * Math.cos((double)var3 * 0.2)) << 4;
                            var7_ref_qb = ArticulatedPart.a(5, 0, this.world, 95, this.worldY + var11, this.field_R, 100, 0, this.worldX + var10, this.field_y);
                            this.world.field_O.addLast(3, var7_ref_qb);
                            statePc = 69;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 44. */
                        {
                            if (this.field_K != 6) {
                                /* Inlined CFG state: 46. */
                                {
                                    if (this.field_K == 7) {
                                        /* Inlined CFG state: 54. */
                                        {
                                            var8_double = Math.random() * (double)((-this.ageTicks + this.durationTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                                            var10 = (int)(Math.sin(var5_double) * var8_double) << 4;
                                            var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                            var7_ref_qb = ArticulatedPart.a(4, 0, this.world, 112, var11 + this.worldY, this.field_R, 100, 0, this.worldX + var10, this.field_y);
                                            this.world.field_O.addLast(3, var7_ref_qb);
                                            statePc = 69;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        /* Inlined CFG state: 47. */
                                        {
                                            if (8 == this.field_K) {
                                                /* Inlined CFG state: 53. */
                                                {
                                                    var8_double = (double)(this.ageTicks * this.field_U / this.durationTicks);
                                                    var10 = (int)(var8_double * Math.sin(0.2 * (double)var3)) << 4;
                                                    var11 = (int)(var8_double * Math.cos(0.2 * (double)var3)) << 4;
                                                    var7_ref_qb = ArticulatedPart.a(5, 0, this.world, 99, this.worldY + var11, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                                                    this.world.field_O.addLast(3, var7_ref_qb);
                                                    var7_ref_qb = ArticulatedPart.a(5, 0, this.world, 113, -var11 + this.worldY, this.field_R, 100, 0, this.worldX - var10, this.field_y);
                                                    this.world.field_O.addLast(3, var7_ref_qb);
                                                    statePc = 69;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 48. */
                                                {
                                                    if (this.field_K != 9) {
                                                        statePc = 69;
                                                    } else {
                                                        statePc = 49;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                /* Inlined CFG state: 45. */
                                {
                                    var8_double = Math.random() * (double)(this.ageTicks + (this.durationTicks - this.ageTicks) / 4) * (double)this.field_U / (double)this.durationTicks;
                                    var10 = (int)(var8_double * Math.sin(var5_double)) << 4;
                                    var11 = (int)(Math.cos(var5_double) * var8_double) << 4;
                                    var7_ref_qb = ArticulatedPart.a(0, 0, this.world, 111, var11 + this.worldY, this.field_R, 100, 0, var10 + this.worldX, this.field_y);
                                    var7_ref_qb.velocityY = (int)(2000.0 * -Math.random());
                                    this.world.field_O.addLast(3, var7_ref_qb);
                                    statePc = 69;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 49: {
                    var8_double = Math.random() * (double)((-this.ageTicks + this.durationTicks) / 4 + this.ageTicks) * (double)this.field_U / (double)this.durationTicks;
                    stackIn_51_0 = var8_double;
                    stackIn_50_0 = stackIn_51_0;
                    if (Math.sin(var5_double) < 0.0) {
                        /* Inlined CFG state: 51. */
                        {
                            stackIn_52_0 = stackIn_51_0;
                            stackIn_52_1 = -1;
                            statePc = 52;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 50. */
                        {
                            stackIn_52_0 = stackIn_50_0;
                            stackIn_52_1 = 1;
                            statePc = 52;
                            continue scanLoop1;
                        }
                    }
                }
                case 52: {
                    var10 = (int)(stackIn_52_0 * (double)stackIn_52_1) << 4;
                    var7_ref_qb = ArticulatedPart.a(0, 0, this.world, 102, 0, this.field_R, 50, 0, this.worldX + var10, this.field_y);
                    this.world.field_O.addLast(3, var7_ref_qb);
                    statePc = 69;
                    continue scanLoop1;
                }
                case 58: {
                    if (var12 >= 5) {
                        statePc = 62;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 59. */
                        {
                            var7_ref_qb = ArticulatedPart.a(0, (int)(-64.0 + 128.0 * Math.random()) + (var10 >> 5), this.world, 117, this.worldY + var11 / 2, this.field_R, 200, (var11 >> 5) + (int)(128.0 * Math.random() - 64.0), this.worldX + var10 / 2, this.field_y);
                            var12++;
                            if (var13 != 0) {
                                statePc = 69;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 60. */
                                {
                                    if (var13 == 0) {
                                        statePc = 58;
                                    } else {
                                        statePc = 62;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 62: {
                    if (this.projectile.sourceWeaponType == 32) {
                        statePc = 65;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 63. */
                        {
                            if (this.projectile.sourceWeaponType == -2) {
                                statePc = 65;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 64. */
                                {
                                    fc.a((byte) -69, 91, this.worldX);
                                    statePc = 65;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 65: {
                    this.world.field_O.addLast(3, var7_ref_qb);
                    statePc = 69;
                    continue scanLoop1;
                }
                case 68: {
                    var7_ref_qb = ArticulatedPart.a(0, var10 >> 4, this.world, 94, this.worldY + var11 / 2, this.field_R, 300, -(10 * this.ageTicks) + (var11 >> 4), var10 / 2 + this.worldX, this.field_y);
                    this.world.field_O.addLast(3, var7_ref_qb);
                    statePc = 69;
                    continue scanLoop1;
                }
                case 69: {
                    var3++;
                    if (var13 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 70;
                    }
                    continue scanLoop1;
                }
                case 70: {
                    var2++;
                    if (var13 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 71;
                    }
                    continue scanLoop1;
                }
                case 71: {
                    if (!obfuscationGuard) {
                        /* Inlined CFG state: 73. */
                        {
                            this.field_F = this.field_U * (this.ageTicks + (-this.ageTicks + this.durationTicks) / 4) / this.durationTicks;
                            if (!this.field_O) {
                                statePc = 101;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 74. */
                                {
                                    var2 = this.field_F * this.field_F;
                                    var16 = new IsaacRandom(new int[]{this.world.simulationTick, this.worldX, this.worldY});
                                    var4_ref_jc = new NodeIterator(this.world.field_db);
                                    var5_ref_wl = (Projectile) (var4_ref_jc.b(2));
                                    statePc = 75;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 72. */
                        {
                            return;
                        }
                    }
                }
                case 75: {
                    if (var5_ref_wl == null) {
                        statePc = 101;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 76. */
                        {
                            var6 = -var5_ref_wl.worldX + this.worldX >> 4;
                            var7 = -var5_ref_wl.worldY + this.worldY >> 4;
                            stackIn_266_0 = ~var5_ref_wl.effectType;
                            stackIn_77_0 = stackIn_266_0;
                            stackIn_266_1 = -3;
                            stackIn_77_1 = stackIn_266_1;
                            if (var13 != 0) {
                                statePc = 266;
                            } else {
                                statePc = 77;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 77: {
                    if (stackIn_77_0 == stackIn_77_1) {
                        statePc = 81;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 78. */
                        {
                            if (var5_ref_wl.effectType == 3) {
                                statePc = 81;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 79. */
                                {
                                    if (var5_ref_wl.effectType != 20) {
                                        statePc = 92;
                                    } else {
                                        statePc = 81;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 81: {
                    if (var5_ref_wl.sourceWeaponType == 32) {
                        statePc = 92;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 82. */
                        {
                            if (~var2 <= ~(var7 * var7 + var6 * var6)) {
                                /* Inlined CFG state: 84. */
                                {
                                    if (null == var5_ref_wl.sourceSentinel) {
                                        statePc = 88;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 85. */
                                        {
                                            if (this.projectile.sourceSentinel != var5_ref_wl.sourceSentinel) {
                                                /* Inlined CFG state: 87. */
                                                {
                                                    this.projectile.sourceSentinel.field_ob = this.projectile.sourceSentinel.field_ob + 1;
                                                    statePc = 88;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                statePc = 88;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } else {
                                statePc = 92;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 88: {
                    var5_ref_wl.field_bb = true;
                    if (var5_ref_wl.effectType != 20) {
                        /* Inlined CFG state: 90. */
                        {
                            var5_ref_wl.field_T = true;
                            statePc = 91;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 91;
                        continue scanLoop1;
                    }
                }
                case 91: {
                    var5_ref_wl.sourceSentinel = this.projectile.sourceSentinel;
                    statePc = 92;
                    continue scanLoop1;
                }
                case 92: {
                    if (8 != var5_ref_wl.effectType) {
                        statePc = 100;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 93. */
                        {
                            if (var6 * var6 + var7 * var7 > var2) {
                                statePc = 100;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 94. */
                                {
                                    if (8 < var16.a(93, 100)) {
                                        statePc = 100;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 95. */
                                        {
                                            var5_ref_wl.field_bb = true;
                                            if (null == var5_ref_wl.sourceSentinel) {
                                                statePc = 99;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 96. */
                                                {
                                                    if (var5_ref_wl.sourceSentinel != this.projectile.sourceSentinel) {
                                                        statePc = 98;
                                                    } else {
                                                        statePc = 99;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 98: {
                    this.projectile.sourceSentinel.field_ob = this.projectile.sourceSentinel.field_ob + 1;
                    statePc = 99;
                    continue scanLoop1;
                }
                case 99: {
                    var5_ref_wl.sourceSentinel = this.projectile.sourceSentinel;
                    statePc = 100;
                    continue scanLoop1;
                }
                case 100: {
                    var5_ref_wl = (Projectile) (var4_ref_jc.d(2));
                    if (var13 == 0) {
                        statePc = 75;
                    } else {
                        statePc = 101;
                    }
                    continue scanLoop1;
                }
                case 101: {
                    if (this.affectedSentinels == null) {
                        statePc = 265;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 102. */
                        {
                            if (this.projectile.field_O > 0) {
                                /* Inlined CFG state: 104. */
                                {
                                    var2 = 0;
                                    statePc = 105;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 265;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 105: {
                    if (this.affectedSentinels.length <= var2) {
                        statePc = 265;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 106. */
                        {
                            var17 = this.affectedSentinels[var2];
                            if (var13 != 0) {
                                statePc = 268;
                            } else {
                                statePc = 107;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 107: {
                    if (var17 == null) {
                        statePc = 264;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 108. */
                        {
                            if (this.field_R) {
                                /* Inlined CFG state: 110. */
                                {
                                    stackIn_111_0 = 0;
                                    statePc = 111;
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 109. */
                                {
                                    stackIn_111_0 = 1;
                                    statePc = 111;
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 111: {
                    stackIn_113_0 = stackIn_111_0;
                    stackIn_112_0 = stackIn_113_0;
                    if (var17.field_u) {
                        /* Inlined CFG state: 113. */
                        {
                            stackIn_114_0 = stackIn_113_0;
                            stackIn_114_1 = 0;
                            statePc = 114;
                            continue scanLoop1;
                        }
                    } else {
                        /* Inlined CFG state: 112. */
                        {
                            stackIn_114_0 = stackIn_112_0;
                            stackIn_114_1 = 1;
                            statePc = 114;
                            continue scanLoop1;
                        }
                    }
                }
                case 114: {
                    if (stackIn_114_0 == stackIn_114_1) {
                        statePc = 117;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 115. */
                        {
                            if (this.world.terrain.getSurfaceProfileAt((byte) 127, var17.worldX >> 4) == this.world.terrain.getSecondaryHeightAt(false, var17.worldX >> 4)) {
                                statePc = 117;
                            } else {
                                statePc = 264;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 117: {
                    if (var17.field_o == -1) {
                        statePc = 121;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 118. */
                        {
                            if (this.projectile.sourceWeaponType == var17.field_o) {
                                statePc = 121;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 119. */
                                {
                                    if (var13 == 0) {
                                        statePc = 264;
                                    } else {
                                        statePc = 121;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 121: {
                    var4 = this.worldX - var17.worldX >> 4;
                    var5 = 768 + (-var17.worldY + this.worldY) >> 4;
                    if (Math.abs(var4) > this.field_F) {
                        statePc = 264;
                    } else {
                        statePc = 122;
                    }
                    continue scanLoop1;
                }
                case 122: {
                    if (this.field_F * this.field_F < var4 * var4 + var5 * var5) {
                        statePc = 264;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 123. */
                        {
                            if (9 != this.projectile.effectType) {
                                statePc = 135;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 124. */
                                {
                                    if (this.projectile.sourceSentinel == null) {
                                        statePc = 135;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 125. */
                                        {
                                            if (1 != this.projectile.sourceSentinel.field_fb) {
                                                statePc = 127;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 126. */
                                                {
                                                    var17.velocityY = var17.velocityY - 80000 / var17.maximumArmour;
                                                    var17.velocityX = var17.velocityX + 400000 * this.projectile.sourceSentinel.field_E / var17.maximumArmour;
                                                    statePc = 127;
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 127: {
                    if (2 == this.projectile.sourceSentinel.field_fb) {
                        /* Inlined CFG state: 129. */
                        {
                            if (this.projectile.sourceSentinel.worldX > var17.worldX) {
                                statePc = 131;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 130. */
                                {
                                    var17.velocityX = var17.velocityX + 200000 / var17.maximumArmour;
                                    statePc = 131;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        statePc = 133;
                        continue scanLoop1;
                    }
                }
                case 131: {
                    var17.velocityY = var17.velocityY - 200000 / var17.maximumArmour;
                    if (var17.worldX >= this.projectile.sourceSentinel.worldX) {
                        statePc = 133;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 132. */
                        {
                            var17.velocityX = var17.velocityX - 200000 / var17.maximumArmour;
                            statePc = 133;
                            continue scanLoop1;
                        }
                    }
                }
                case 133: {
                    if (this.projectile.sourceSentinel.field_fb != 3) {
                        statePc = 135;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 134. */
                        {
                            var17.velocityY = var17.velocityY - 160000 / var17.maximumArmour;
                            var17.velocityX = var17.velocityX + 80000 * this.projectile.sourceSentinel.field_E / var17.maximumArmour;
                            statePc = 135;
                            continue scanLoop1;
                        }
                    }
                }
                case 135: {
                    this.affectedSentinels[var2] = null;
                    var6 = ik.a(var5 * var5 + var4 * var4, -117);
                    if (var6 <= this.field_U / 2) {
                        statePc = 139;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 136. */
                        {
                            if (this.projectile.effectType == 9) {
                                statePc = 139;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 137. */
                                {
                                    var7 = this.projectile.field_O * (this.field_U - var6) / (this.field_U / 2);
                                    if (1 <= var7) {
                                        statePc = 140;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 138. */
                                        {
                                            var7 = 1;
                                            if (var13 == 0) {
                                                statePc = 140;
                                            } else {
                                                statePc = 139;
                                            }
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 139: {
                    var7 = this.projectile.field_O;
                    statePc = 140;
                    continue scanLoop1;
                }
                case 140: {
                    if (this.projectile.effectType != 9) {
                        statePc = 183;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 141. */
                        {
                            var7 = this.projectile.field_O;
                            var17.field_S = var17.field_S - this.projectile.field_kb;
                            if (~this.projectile.field_kb >= ~var17.field_mc) {
                                statePc = 145;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 142. */
                                {
                                    if (var17.h(-128)) {
                                        /* Inlined CFG state: 144. */
                                        {
                                            var17.field_mc = this.projectile.field_kb;
                                            statePc = 145;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        statePc = 145;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    }
                }
                case 145: {
                    if (this.projectile.field_kb <= 0) {
                        statePc = 150;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 146. */
                        {
                            if (var17.charge <= 0) {
                                statePc = 150;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 147. */
                                {
                                    if (var17.h(-122)) {
                                        /* Inlined CFG state: 149. */
                                        {
                                            var17.consumeCharge(true, Math.min(var17.charge, this.projectile.field_kb / 50));
                                            statePc = 150;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        statePc = 150;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    }
                }
                case 150: {
                    if (var17.field_S >= 0) {
                        statePc = 152;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 151. */
                        {
                            var17.field_S = 0;
                            statePc = 152;
                            continue scanLoop1;
                        }
                    }
                }
                case 152: {
                    if (0 >= var17.armour) {
                        statePc = 154;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 153. */
                        {
                            var17.a((byte) 40, this.projectile);
                            statePc = 154;
                            continue scanLoop1;
                        }
                    }
                }
                case 154: {
                    if (var17.armour <= 0) {
                        statePc = 157;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 155. */
                        {
                            if (this.projectile.sourceSentinel != null) {
                                statePc = 162;
                            } else {
                                statePc = 157;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 157: {
                    if (var17.armour <= 0) {
                        statePc = 178;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 158. */
                        {
                            if (null != this.projectile.sourceSentinel) {
                                statePc = 178;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 159. */
                                {
                                    if (var17.field_z > 0) {
                                        statePc = 178;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 160. */
                                        {
                                            var17.reduceArmour(128, var7);
                                            if (var13 == 0) {
                                                statePc = 178;
                                            } else {
                                                statePc = 162;
                                            }
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 162: {
                    var8_int = var7;
                    if (var8_int <= var17.armour) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue scanLoop1;
                }
                case 163: {
                    var8_int = var17.armour;
                    statePc = 164;
                    continue scanLoop1;
                }
                case 164: {
                    if (var8_int < 0) {
                        /* Inlined CFG state: 166. */
                        {
                            var8_int = 0;
                            statePc = 167;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 167;
                        continue scanLoop1;
                    }
                }
                case 167: {
                    if (var17.field_Nb != 8) {
                        /* Inlined CFG state: 169. */
                        {
                            if (var17.field_z <= 0) {
                                /* Inlined CFG state: 171. */
                                {
                                    if (~this.projectile.sourceSentinel.teamId != ~var17.teamId) {
                                        statePc = 175;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 172. */
                                        {
                                            if (this.projectile.sourceSentinel == var17) {
                                                statePc = 176;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 173. */
                                                {
                                                    this.projectile.sourceSentinel.b(-(this.world.field_l * (var8_int * var17.field_lb / var17.maximumArmour)), 26511);
                                                    if (var13 == 0) {
                                                        statePc = 176;
                                                    } else {
                                                        statePc = 175;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                statePc = 176;
                                continue scanLoop1;
                            }
                        }
                    } else {
                        statePc = 176;
                        continue scanLoop1;
                    }
                }
                case 175: {
                    this.projectile.sourceSentinel.b(this.world.field_l * (var8_int * var17.field_lb / var17.maximumArmour), 26511);
                    this.projectile.sourceSentinel.field_Ac = this.projectile.sourceSentinel.field_Ac + var8_int;
                    statePc = 176;
                    continue scanLoop1;
                }
                case 176: {
                    if (var17.field_z > 0) {
                        statePc = 178;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 177. */
                        {
                            var17.reduceArmour(128, var7);
                            statePc = 178;
                            continue scanLoop1;
                        }
                    }
                }
                case 178: {
                    if (var17.field_Lb) {
                        /* Inlined CFG state: 180. */
                        {
                            if (!var17.hasModuleType(29, -27)) {
                                /* Inlined CFG state: 182. */
                                {
                                    var17.field_Dc = 200;
                                    if (var13 == 0) {
                                        statePc = 264;
                                    } else {
                                        statePc = 183;
                                    }
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 264;
                                continue scanLoop1;
                            }
                        }
                    } else {
                        statePc = 264;
                        continue scanLoop1;
                    }
                }
                case 183: {
                    var17.field_S = var17.field_S - var7 * this.projectile.field_kb / this.projectile.field_O;
                    if (var17.field_S >= 0) {
                        statePc = 185;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 184. */
                        {
                            var17.field_S = 0;
                            statePc = 185;
                            continue scanLoop1;
                        }
                    }
                }
                case 185: {
                    if (0 >= var17.field_S) {
                        statePc = 187;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 186. */
                        {
                            fc.a((byte) 114, 27, this.worldX);
                            statePc = 187;
                            continue scanLoop1;
                        }
                    }
                }
                case 187: {
                    var17.field_S = var17.field_S - var7;
                    var17.field_P = 100;
                    if (0 > var17.field_S) {
                        /* Inlined CFG state: 189. */
                        {
                            if (this.projectile.effectType == 1) {
                                statePc = 195;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 190. */
                                {
                                    if (this.projectile.effectType == 2) {
                                        statePc = 195;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 191. */
                                        {
                                            if (this.projectile.effectType == 3) {
                                                statePc = 195;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 192. */
                                                {
                                                    if (this.projectile.effectType == 20) {
                                                        statePc = 195;
                                                    } else {
                                                        statePc = 193;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        statePc = 264;
                        continue scanLoop1;
                    }
                }
                case 193: {
                    fc.a((byte) 91, 55, this.worldX);
                    if (var13 == 0) {
                        statePc = 196;
                    } else {
                        statePc = 195;
                    }
                    continue scanLoop1;
                }
                case 195: {
                    fc.a((byte) -100, 51, this.worldX);
                    var8_int = var17.addModuleBonuses(0, 33);
                    var17.field_S = var17.field_S >> var8_int;
                    statePc = 196;
                    continue scanLoop1;
                }
                case 196: {
                    if (var17.armour > 0) {
                        /* Inlined CFG state: 198. */
                        {
                            var17.a((byte) 68, this.projectile);
                            statePc = 199;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 199;
                        continue scanLoop1;
                    }
                }
                case 199: {
                    if (var17.armour <= 0) {
                        statePc = 240;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 200. */
                        {
                            if (this.projectile.sourceSentinel == null) {
                                statePc = 240;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 201. */
                                {
                                    var8 = this.projectile.sourceSentinel;
                                    if (this.projectile.sourceSentinel == this.projectile.field_G) {
                                        statePc = 209;
                                    } else {
                                        statePc = 202;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 202: {
                    if (null == this.projectile.field_G) {
                        statePc = 209;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 203. */
                        {
                            if (~this.projectile.field_G.teamId == ~this.projectile.sourceSentinel.teamId) {
                                statePc = 206;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 204. */
                                {
                                    if (var17.teamId == this.projectile.sourceSentinel.teamId) {
                                        statePc = 208;
                                    } else {
                                        statePc = 206;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 206: {
                    if (var17 != this.projectile.sourceSentinel) {
                        statePc = 209;
                    } else {
                        statePc = 208;
                    }
                    continue scanLoop1;
                }
                case 208: {
                    var8 = this.projectile.field_G;
                    statePc = 209;
                    continue scanLoop1;
                }
                case 209: {
                    var9 = -var17.field_S;
                    if (var17.armour >= var9) {
                        statePc = 211;
                    } else {
                        statePc = 210;
                    }
                    continue scanLoop1;
                }
                case 210: {
                    var9 = var17.armour;
                    statePc = 211;
                    continue scanLoop1;
                }
                case 211: {
                    if (0 > var9) {
                        /* Inlined CFG state: 213. */
                        {
                            var9 = 0;
                            statePc = 214;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 214;
                        continue scanLoop1;
                    }
                }
                case 214: {
                    if (var17.field_Nb != 8) {
                        /* Inlined CFG state: 216. */
                        {
                            if (var17.field_z > 0) {
                                statePc = 223;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 217. */
                                {
                                    if (var17.teamId == var8.teamId) {
                                        statePc = 220;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 218. */
                                        {
                                            var8.b(this.world.field_l * (var17.field_lb * var9 / var17.maximumArmour), 26511);
                                            var8.field_Ac = var8.field_Ac + var9;
                                            if (var13 == 0) {
                                                statePc = 223;
                                            } else {
                                                statePc = 220;
                                            }
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        statePc = 223;
                        continue scanLoop1;
                    }
                }
                case 220: {
                    if (var17 != var8) {
                        /* Inlined CFG state: 222. */
                        {
                            var8.b(-(this.world.field_l * (var17.field_lb * var9 / var17.maximumArmour)), 26511);
                            statePc = 223;
                            continue scanLoop1;
                        }
                    } else {
                        statePc = 223;
                        continue scanLoop1;
                    }
                }
                case 223: {
                    if (var17.field_z <= 0) {
                        /* Inlined CFG state: 225. */
                        {
                            var17.reduceArmour(128, -var17.field_S);
                            if (var17.armour > 0) {
                                statePc = 231;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 226. */
                                {
                                    if (var17.field_Nb == 8) {
                                        statePc = 231;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 227. */
                                        {
                                            if (!this.projectile.field_bb) {
                                                statePc = 231;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 228. */
                                                {
                                                    if (this.projectile.field_G == var8) {
                                                        statePc = 231;
                                                    } else {
                                                        statePc = 229;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        statePc = 239;
                        continue scanLoop1;
                    }
                }
                case 229: {
                    if (~var8.teamId != ~var17.teamId) {
                        statePc = 231;
                    } else {
                        statePc = 231;
                    }
                    continue scanLoop1;
                }
                case 231: {
                    if (var17.armour > 0) {
                        statePc = 239;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 232. */
                        {
                            if (var17.field_Nb == 0) {
                                statePc = 235;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 233. */
                                {
                                    if (11 != var17.field_Nb) {
                                        statePc = 239;
                                    } else {
                                        statePc = 235;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 235: {
                    if (32 != this.projectile.sourceWeaponType) {
                        statePc = 239;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 236. */
                        {
                            if (this.projectile.field_G == var8) {
                                /* Inlined CFG state: 238. */
                                {
                                    var8.field_y = var8.field_y + 1;
                                    statePc = 239;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 239;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 239: {
                    if (var13 == 0) {
                        statePc = 244;
                    } else {
                        statePc = 240;
                    }
                    continue scanLoop1;
                }
                case 240: {
                    if (0 >= var17.armour) {
                        statePc = 244;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 241. */
                        {
                            if (this.projectile.sourceSentinel != null) {
                                statePc = 244;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 242. */
                                {
                                    if (var17.field_z > 0) {
                                        statePc = 244;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 243. */
                                        {
                                            var17.reduceArmour(128, -var17.field_S);
                                            statePc = 244;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 244: {
                    if (!var17.h(-122)) {
                        statePc = 248;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 245. */
                        {
                            if (var17.field_mc < var7 * this.projectile.field_kb / this.projectile.field_O) {
                                /* Inlined CFG state: 247. */
                                {
                                    var17.field_mc = this.projectile.field_kb * var7 / this.projectile.field_O;
                                    statePc = 248;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 248;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 248: {
                    if (var7 * this.projectile.field_kb / this.projectile.field_O <= 0) {
                        statePc = 253;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 249. */
                        {
                            if (var17.charge <= 0) {
                                statePc = 253;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 250. */
                                {
                                    if (var17.h(-122)) {
                                        /* Inlined CFG state: 252. */
                                        {
                                            var17.consumeCharge(true, Math.min(var17.charge, var7 * this.projectile.field_kb / this.projectile.field_O / 50));
                                            statePc = 253;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        statePc = 253;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    }
                }
                case 253: {
                    if (!var17.hasModuleType(26, -27)) {
                        statePc = 257;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 254. */
                        {
                            if (var17.field_S >= 0) {
                                statePc = 257;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 255. */
                                {
                                    var17.field_S = Math.min(-var17.field_S, var17.field_Q);
                                    if (var13 == 0) {
                                        statePc = 258;
                                    } else {
                                        statePc = 257;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 257: {
                    var17.field_S = 0;
                    statePc = 258;
                    continue scanLoop1;
                }
                case 258: {
                    if (var17.field_Lb) {
                        /* Inlined CFG state: 260. */
                        {
                            if (var17.hasModuleType(29, -27)) {
                                statePc = 264;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 261. */
                                {
                                    if (3 != di.field_g) {
                                        /* Inlined CFG state: 263. */
                                        {
                                            var17.field_Dc = 200;
                                            statePc = 264;
                                            continue scanLoop1;
                                        }
                                    } else {
                                        statePc = 264;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } else {
                        statePc = 264;
                        continue scanLoop1;
                    }
                }
                case 264: {
                    var2++;
                    if (var13 == 0) {
                        statePc = 105;
                    } else {
                        statePc = 265;
                    }
                    continue scanLoop1;
                }
                case 265: {
                    stackIn_266_0 = ~this.field_N;
                    stackIn_266_1 = -1;
                    statePc = 266;
                    continue scanLoop1;
                }
                case 266: {
                    if (stackIn_266_0 >= stackIn_266_1) {
                        statePc = 268;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 267. */
                        {
                            this.field_N = this.field_N - 1;
                            statePc = 268;
                            continue scanLoop1;
                        }
                    }
                }
                case 268: {
                    if (this.durationTicks >= this.ageTicks) {
                        statePc = 270;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 269. */
                        {
                            this.world.field_J.a((byte) 82, (DualNode) (this));
                            statePc = 270;
                            continue scanLoop1;
                        }
                    }
                }
                case 270: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
