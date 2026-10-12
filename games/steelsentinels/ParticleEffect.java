/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ParticleEffect extends DualNode {
    static boolean field_J;
    int durationTicks;
    int velocityX;
    boolean usesSurfaceProfile;
    int worldY;
    int field_P;
    static SceneWidget field_K;
    int effectType;
    int velocityY;
    static String[][] field_y;
    static fm field_H;
    CombatWorld world;
    int ageTicks;
    int worldX;
    static SceneWidget field_E;
    static String field_C;
    static IndexedSprite[] field_L;
    static String field_N;

    public static void h(int param0) {
        field_E = null;
        field_L = null;
        field_y = (String[][]) null;
        field_H = null;
        field_K = null;
        field_N = null;
        if (param0 == -185837884) {
          field_C = null;
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        RgbSprite[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var11 = SteelSentinels.obfuscationControl;
        try {
          var6 = pd.field_Q;
          if (PartInstruction.field_g > 0) {
            var6 = bg.field_C;
          }
          var7 = 8 * a.field_c / 50 % var6.length;
          de.a(-param1 + param4, param3 - param1, vh.field_b, param0 + 2 * param1, 160, (byte) -31, param1 * 2 + param5);
          var6[var7].e(param4, param3, 2254472);
          SoftwareRaster.d(16, 4, -4 + param4, param3 - 4, 8 + param0, param5 + 8);
          if (param2 < 26) {
            var12 = (String) null;
            ParticleEffect.a(112, -62, (String) null, 84, (String) null);
          }
          var6[var7].e(param4, param3, 17561);
          SoftwareRaster.d(8, 2, -4 + param4, param3 - 4, 8 + param0, param5 + 8);
          var6[var7].a(param4, param3, 255);
          var8 = param0 + 2 * param1;
          var9 = 2 * param1 + param5;
          var10 = a.field_c / 10 % 2;
          while (var10 < var8) {
            SoftwareRaster.f(param4 + (-param1 + var10), param3 - param1, var9, 0, 100);
            var10 += 2;
            if (var11 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var6_ref), "qb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void drawParticle(int screenOffsetX, int screenOffsetY, boolean alternateRenderPass, byte obfuscationGuard) {
        ek stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        int stackIn_56_3;
        int stackIn_56_4;
        int stackIn_57_5;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var8Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var10 = SteelSentinels.obfuscationControl;
        var5 = (this.worldX >> 8) + screenOffsetX;
        var6 = -124 / ((-25 - obfuscationGuard) / 54);
        var7 = (this.worldY >> 8) + screenOffsetY;
        if (var5 >= -32 &&
          var5 <= 672 &&
          var7 >= -32 &&
          var7 <= 672) {
          var8 = this.ageTicks * 8 / this.durationTicks;
          if (var8 < 0) {
            var8 = 0;
          }
          if (var8 > 7) {
            var8 = 7;
          }
          if (this.effectType != 0) {
            if (this.effectType != 1) {
              if (this.effectType != 3) {
                if (this.effectType == 2) {
                  if (!alternateRenderPass) {
                    return;
                  }
                  var8 = Math.max(0, Math.min(15, 16 * this.ageTicks / this.durationTicks));
                  var9 = 2;
                  cc.field_pc[var8].c(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (this.effectType == 4) {
                  if (alternateRenderPass) {
                    return;
                  }
                  var9 = 16;
                  bm.field_S[var8].d(-var9 + var5, -var9 + var7, var9 * 2, 2 * var9, 128);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (this.effectType != 5) {
                  if (this.effectType == 6) {
                    if (alternateRenderPass) {
                      return;
                    }
                    var9 = 2;
                    bm.field_S[var8].d(-var9 + var5, var7 - var9, var9 * 2, 2 * var9, 128);
                    if (var10 == 0) {
                      return;
                    }
                  }
                  if (7 == this.effectType) {
                    if (alternateRenderPass) {
                      return;
                    }
                    var9 = 1;
                    vi.field_gb[var8].d(-var9 + var5, var7 - var9, 2 * var9, var9 * 2, 128);
                    if (var10 == 0) {
                      return;
                    }
                  }
                  if (this.effectType != 8) {
                    if (this.effectType == 9) {
                      if (alternateRenderPass) {
                        return;
                      }
                      var9 = 4;
                      vi.field_gb[7 - var8].a(-var9 + var5, -var9 + var7, var9 * 2, var9 * 2, 200 - this.ageTicks * 200 / this.durationTicks);
                      if (var10 == 0) {
                        return;
                      }
                    }
                    if (12 == this.effectType) {
                      if (alternateRenderPass) {
                        return;
                      }
                      var9 = 2;
                      bm.field_S[2 & var8].d(var5 - var9, -var9 + var7, 2 * var9, 2 * var9, -(this.ageTicks * 250 / this.durationTicks) + 250);
                      if (var10 == 0) {
                        return;
                      }
                    }
                    if (this.effectType != 13) {
                      if (this.effectType != 14) {
                        return;
                      }
                      if (alternateRenderPass) {
                        return;
                      }
                      var9 = (500 - 2 * this.ageTicks) / 125;
                      SoftwareRaster.a(var5 << 4, var7 << 4, var9 << 4, 31, hc.field_W);
                      if (var10 == 0) {
                        return;
                      }
                    }
                    if (alternateRenderPass) {
                      return;
                    }
                    var9 = 16;
                    SoftwareRaster.a(var5 << 4, var7 << 4, var9 << 4, 249, hc.field_X);
                    if (var10 == 0) {
                      return;
                    }
                  }
                  if (alternateRenderPass) {
                    return;
                  }
                  var8 = Math.max(0, Math.min(15, 16 * this.ageTicks / this.durationTicks));
                  var9 = 4;
                  cc.field_pc[var8].c(var5 - var9, var7 - var9, var9 * 2, 2 * var9);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (alternateRenderPass) {
                  return;
                }
                var9 = 4;
                bm.field_S[var8].d(-var9 + var5, -var9 + var7, 2 * var9, 2 * var9, 128);
                if (var10 == 0) {
                  return;
                }
              }
              if (alternateRenderPass) {
                return;
              }
              var9Lifetime3 = 2;
              vi.field_gb[var8].d(var5 - var9Lifetime3, var7 - var9Lifetime3, var9Lifetime3 * 2, 2 * var9Lifetime3, 128);
              if (var10 == 0) {
                return;
              }
            }
            if (alternateRenderPass) {
              return;
            }
            var9Lifetime2 = 16;
            vi.field_gb[var8].d(var5 - var9Lifetime2, var7 - var9Lifetime2, var9Lifetime2 * 2, 2 * var9Lifetime2, 128);
            if (var10 == 0) {
              return;
            }
          }
          if (alternateRenderPass) {
            var8Lifetime1 = Math.max(0, Math.min(15, this.ageTicks * 16 / this.durationTicks));
            var9Lifetime1 = 17;
            stackIn_56_0 = cc.field_pc[var8Lifetime1];
            stackIn_56_1 = -var9Lifetime1 + var5;
            stackIn_56_2 = -var9Lifetime1 + var7;
            stackIn_56_3 = 2 * var9Lifetime1;
            stackIn_56_4 = var9Lifetime1 * 2;
            if (this.durationTicks / 2 > this.ageTicks) {
              stackIn_57_5 = 255;
            } else {
              stackIn_57_5 = 505 - this.ageTicks * 500 / this.durationTicks;
            }
            ((ek) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_57_5);
          }
          return;
        }
    }

    final void detachWorld(int obfuscationGuard) {
        if (obfuscationGuard != -15809) {
          field_H = (fm) null;
        }
        this.world = null;
    }

    final static boolean g(int param0) {
        if (param0 != 2) {
          ParticleEffect.a(-13, 21, (byte) 84, -39, 29, 95);
        }
        return wb.field_c == null ? kc.field_q : true;
    }

    final void advanceParticle(byte obfuscationGuard) {
        ParticleEffect spawnedParticle;
        int obfuscationControl;
        String unusedString;
        obfuscationControl = SteelSentinels.obfuscationControl;
        if (this.world == null) {
          return;
        }
        this.worldX = this.worldX + this.velocityX;
        this.worldY = this.worldY + this.velocityY;
        if (obfuscationGuard < 1) {
          unusedString = (String) null;
          ParticleEffect.a(-116, -34, (String) null, -4, (String) null);
        }
        if (200 > this.ageTicks) {
          this.ageTicks = this.ageTicks + (int)(Math.random() * 4.0);
        }
        if (this.world.terrain.getTerrainType(110) != 4) {
          boolean decompiledFrameRemainder0 = true;
          if (!this.usesSurfaceProfile) {
            if (!(this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) <= -(this.worldY >> 4))) {
              if ((this.world.terrain.getTerrainType(51) != 2 ||
                !(this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) > 2048)) &&
                (decompiledFrameRemainder0 = ((this.effectType != 2 &&
                3 != this.effectType &&
                this.effectType != 9 &&
                10 != this.effectType &&
                this.effectType != 6) ||
                this.world.terrain.getSurfaceProfileAt((byte) 126, this.worldX >> 4) != this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4)))) {
                this.worldY = -(this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4) << 4);
                decompiledFrameRemainder0 = (obfuscationControl != 0);
              }
              if (decompiledFrameRemainder0) {
                this.worldX = this.worldX - this.velocityX;
                this.velocityX = 0;
                if ((obfuscationControl != 0) &&
                  (this.world.terrain.getSurfaceProfileAt((byte) 122, this.worldX >> 4) < -(this.worldY >> 4))) {
                  if (this.effectType != 2 &&
                    this.effectType != 3 &&
                    this.effectType != 9 &&
                    this.effectType != 10 &&
                    this.effectType != 6 ||
                    this.world.terrain.getSurfaceProfileAt((byte) 127, this.worldX >> 4) != this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4)) {
                    this.worldY = -(this.world.terrain.getSurfaceProfileAt((byte) 118, this.worldX >> 4) << 4);
                  }
                  if (this.world.terrain.getSurfaceProfileAt((byte) 120, this.worldX >> 4) == this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4)) {
                    this.usesSurfaceProfile = false;
                  }
                }
              }
            }
          } else {
            if (this.world.terrain.getSurfaceProfileAt((byte) 122, this.worldX >> 4) < -(this.worldY >> 4)) {
              if (this.effectType != 2 &&
                this.effectType != 3 &&
                this.effectType != 9 &&
                this.effectType != 10 &&
                this.effectType != 6 ||
                this.world.terrain.getSurfaceProfileAt((byte) 127, this.worldX >> 4) != this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4)) {
                this.worldY = -(this.world.terrain.getSurfaceProfileAt((byte) 118, this.worldX >> 4) << 4);
              }
              if (this.world.terrain.getSurfaceProfileAt((byte) 120, this.worldX >> 4) == this.world.terrain.getSecondaryHeightAt(false, this.worldX >> 4)) {
                this.usesSurfaceProfile = false;
              }
            }
          }
          if (this.world.terrain.getGroundHeightAt((byte) -96, this.worldX >> 4) > -(this.worldY >> 4)) {
            this.worldY = -(this.world.terrain.getGroundHeightAt((byte) -128, this.worldX >> 4) << 4);
          }
        }
        if (this.effectType != 10) {
          this.velocityX = this.velocityX * 9 / 10;
          this.velocityY = this.velocityY * 9 / 10;
          if (obfuscationControl != 0) {
            this.velocityY = this.velocityY + this.world.gravityAcceleration;
            spawnedParticle = ArticulatedPart.createParticle(9, 0, this.world, 105, this.worldY, this.usesSurfaceProfile, 100, 0, this.worldX, this.field_P);
            this.world.pendingParticles.addLast(3, spawnedParticle);
          }
        } else {
          this.velocityY = this.velocityY + this.world.gravityAcceleration;
          spawnedParticle = ArticulatedPart.createParticle(9, 0, this.world, 105, this.worldY, this.usesSurfaceProfile, 100, 0, this.worldX, this.field_P);
          this.world.pendingParticles.addLast(3, spawnedParticle);
        }
        this.ageTicks = this.ageTicks + 1;
        if (this.ageTicks > this.durationTicks) {
          this.world.pendingRemovals.addLast((byte) 110, (DualNode) (this));
        }
    }

    final static void a(int param0, int param1, String param2, int param3, String param4) {
        try {
          vd.field_d.field_zb = vd.field_d.field_zb + wh.field_e.field_zb;
          vd.field_d.field_Db = param4;
          vd.field_d.field_S = param2;
          vd.field_d.field_nb = param1;
          int var5_int = -48 % ((-12 - param0) / 61);
          wh.field_e.field_Y = wh.field_e.field_Y + wh.field_e.field_zb;
          wh.field_e.field_zb = param3;
          vd.field_d.field_zb = vd.field_d.field_zb - wh.field_e.field_zb;
          wh.field_e.field_Y = wh.field_e.field_Y - wh.field_e.field_zb;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "qb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    ParticleEffect() {
    }

    final static void a(ArticulatedPart param0, SceneWidget param1, byte param2, boolean param3, int param4, int param5) {
        Object stackIn_304_0 = null;
        StringBuilder stackIn_304_1 = null;
        String stackIn_305_2 = null;
        StringBuilder stackIn_307_1 = null;
        String stackIn_308_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var6 = null;
        RgbSprite var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RgbSprite[] var13 = null;
        int var8Lifetime1;
        var12 = SteelSentinels.obfuscationControl;
        try {
          var6 = null;
          if (param3 &&
            param0.componentId >= 0 &&
            param0.field_Q != 1) {
            var13 = hl.field_p;
            var6 = var13;
            if (var13.length <= param0.componentId) {
              var6 = null;
            }
          }
          if (var6 != null &&
            null != ((Object[]) (var6))[param0.componentId]) {
            param1.field_Pb = (RgbSprite) (((Object[]) (var6))[param0.componentId]);
            return;
          }
          var7 = new RgbSprite(param4, param5);
          param1.field_Pb = var7;
          if (var6 != null) {
            ((Object[]) (var6))[param0.componentId] = var7;
          }
          if (param2 != -93) {
            field_C = (String) null;
          }
          param1.field_Pb.d();
          if (param0.field_Q != 1) {
            var8 = param4 / 2;
            var9 = param5 / 2;
            if (param0.field_Q == 16) {
              var8 -= 10;
            }
            var10 = hj.field_w;
            if (param0.componentId == 31) {
              var8 -= 20;
            }
            if (64 == param0.field_Q) {
              var8 -= 20;
              var9 += 7;
              hj.field_w = 2048;
            }
            if (param0.field_Q == 128) {
              var8 += 5;
            }
            if (param0.field_Q == 256) {
              var8 += 10;
            }
            if (param0.field_Q == 2) {
              var8 -= 10;
              var9 += 10;
            }
            if (param0.componentId == 95) {
              var8 -= 20;
            }
            if (4 == param0.field_Q) {
              var9 -= 20;
              hj.field_w = 3072;
            }
            if (param0.componentId == 76) {
              var8 -= 20;
              param0 = NodeDeque.a(102, (byte) 67);
            }
            if (66 == param0.componentId) {
              var8 -= 20;
              param0 = NodeDeque.a(99, (byte) 67);
            }
            if (param0.field_Q == 2048) {
              var9 -= 20;
              hj.field_w = 2048;
            }
            if (param0.componentId == 80) {
              var8 -= 10;
              var9 += 10;
            }
            if (param0.field_Q == 8) {
              var9 += 20;
            }
            if (param0.componentId == 59) {
              var9 -= 25;
            }
            if (param0.componentId == 71) {
              var9 -= 15;
            }
            if (77 == param0.componentId) {
              var9 -= 10;
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
                                                                                        {
                                                                                          boolean decompiledFrameRemainder13 = true;
                                                                                          {
                                                                                            boolean decompiledFrameRemainder12 = true;
                                                                                            {
                                                                                              boolean decompiledFrameRemainder11 = true;
                                                                                              {
                                                                                                boolean decompiledFrameRemainder10 = true;
                                                                                                {
                                                                                                  boolean decompiledFrameRemainder9 = true;
                                                                                                  {
                                                                                                    boolean decompiledFrameRemainder8 = true;
                                                                                                    {
                                                                                                      boolean decompiledFrameRemainder7 = true;
                                                                                                      {
                                                                                                        boolean decompiledFrameRemainder6 = true;
                                                                                                        {
                                                                                                          boolean decompiledFrameRemainder5 = true;
                                                                                                          {
                                                                                                            boolean decompiledFrameRemainder4 = true;
                                                                                                            {
                                                                                                              boolean decompiledFrameRemainder3 = true;
                                                                                                              {
                                                                                                                boolean decompiledFrameRemainder2 = true;
                                                                                                                {
                                                                                                                  boolean decompiledFrameRemainder1 = true;
                                                                                                                  {
                                                                                                                    boolean decompiledFrameRemainder0 = true;
                                                                                                                    var11 = param0.componentId;
                                                                                                                    if (1 != var11) {
                                                                                                                      decompiledFrameRemainder0 = !(53 == var11 &&
                                                                                                                        var12 == 0);
                                                                                                                      if (decompiledFrameRemainder0) {
                                                                                                                        decompiledFrameRemainder1 = !(60 == var11 &&
                                                                                                                          var12 == 0);
                                                                                                                        if (decompiledFrameRemainder1) {
                                                                                                                          decompiledFrameRemainder2 = (var11 != 61);
                                                                                                                          if (decompiledFrameRemainder2) {
                                                                                                                            decompiledFrameRemainder3 = !(var11 == 64 &&
                                                                                                                              var12 == 0);
                                                                                                                            if (decompiledFrameRemainder3) {
                                                                                                                              decompiledFrameRemainder4 = (68 != var11);
                                                                                                                              if (decompiledFrameRemainder4) {
                                                                                                                                decompiledFrameRemainder5 = !(var11 == 74 &&
                                                                                                                                  var12 == 0);
                                                                                                                                if (decompiledFrameRemainder5) {
                                                                                                                                  decompiledFrameRemainder6 = (var11 != 78);
                                                                                                                                  if (decompiledFrameRemainder6) {
                                                                                                                                    decompiledFrameRemainder7 = !(var11 == 82 &&
                                                                                                                                      var12 == 0);
                                                                                                                                    if (decompiledFrameRemainder7) {
                                                                                                                                      decompiledFrameRemainder8 = (var11 != 87);
                                                                                                                                      if (decompiledFrameRemainder8) {
                                                                                                                                        decompiledFrameRemainder9 = !(var11 == 91 &&
                                                                                                                                          var12 == 0);
                                                                                                                                        if (decompiledFrameRemainder9) {
                                                                                                                                          decompiledFrameRemainder10 = !(95 == var11 &&
                                                                                                                                            var12 == 0);
                                                                                                                                          if (decompiledFrameRemainder10) {
                                                                                                                                            decompiledFrameRemainder11 = (var11 != 2);
                                                                                                                                            if (decompiledFrameRemainder11) {
                                                                                                                                              decompiledFrameRemainder12 = (var11 != 56);
                                                                                                                                              if (decompiledFrameRemainder12) {
                                                                                                                                                decompiledFrameRemainder13 = !(var11 == 66 &&
                                                                                                                                                  var12 == 0);
                                                                                                                                                if (decompiledFrameRemainder13) {
                                                                                                                                                  decompiledFrameRemainder13 = (var11 != 99);
                                                                                                                                                  if (decompiledFrameRemainder13) {
                                                                                                                                                    if (var11 == 70 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit38;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 76) {
                                                                                                                                                      break regionExit37;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 102) {
                                                                                                                                                      break regionExit37;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 85) {
                                                                                                                                                      break regionExit36;
                                                                                                                                                    }
                                                                                                                                                    if (80 == var11 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit35;
                                                                                                                                                    }
                                                                                                                                                    if (89 == var11) {
                                                                                                                                                      break regionExit34;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 93) {
                                                                                                                                                      break regionExit33;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 3 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit32;
                                                                                                                                                    }
                                                                                                                                                    if (54 == var11) {
                                                                                                                                                      break regionExit31;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 67) {
                                                                                                                                                      break regionExit30;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 71 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit29;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 73) {
                                                                                                                                                      break regionExit28;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 77 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit27;
                                                                                                                                                    }
                                                                                                                                                    if (81 == var11 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit26;
                                                                                                                                                    }
                                                                                                                                                    if (86 == var11) {
                                                                                                                                                      break regionExit25;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 90) {
                                                                                                                                                      break regionExit24;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 83 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit23;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 28 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit22;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 29 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit21;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 30) {
                                                                                                                                                      break regionExit20;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 31 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit19;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 35) {
                                                                                                                                                      break regionExit18;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 32) {
                                                                                                                                                      break regionExit17;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 33 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit16;
                                                                                                                                                    }
                                                                                                                                                    if (34 == var11) {
                                                                                                                                                      break regionExit15;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 38 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit14;
                                                                                                                                                    }
                                                                                                                                                    if (43 == var11 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit13;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 48) {
                                                                                                                                                      break regionExit12;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 52) {
                                                                                                                                                      break regionExit11;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 46) {
                                                                                                                                                      break regionExit10;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 45 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit9;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 44) {
                                                                                                                                                      break regionExit8;
                                                                                                                                                    }
                                                                                                                                                    if (47 == var11 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit7;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 36 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit6;
                                                                                                                                                    }
                                                                                                                                                    if (37 == var11) {
                                                                                                                                                      break regionExit5;
                                                                                                                                                    }
                                                                                                                                                    if (51 == var11 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit4;
                                                                                                                                                    }
                                                                                                                                                    if (var11 == 50 &&
                                                                                                                                                      var12 == 0) {
                                                                                                                                                      break regionExit3;
                                                                                                                                                    }
                                                                                                                                                    if (var11 != 49) {
                                                                                                                                                      break regionExit1;
                                                                                                                                                    }
                                                                                                                                                    if (var12 == 0) {
                                                                                                                                                      break regionExit2;
                                                                                                                                                    }
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    if (decompiledFrameRemainder13) {
                                                                                                                      if (decompiledFrameRemainder12) {
                                                                                                                        if (decompiledFrameRemainder11) {
                                                                                                                          if (decompiledFrameRemainder10) {
                                                                                                                            if (decompiledFrameRemainder9) {
                                                                                                                              if (decompiledFrameRemainder8) {
                                                                                                                                if (decompiledFrameRemainder7) {
                                                                                                                                  if (decompiledFrameRemainder6) {
                                                                                                                                    if (decompiledFrameRemainder5) {
                                                                                                                                      if (decompiledFrameRemainder4) {
                                                                                                                                        if (decompiledFrameRemainder3) {
                                                                                                                                          if (decompiledFrameRemainder2) {
                                                                                                                                            if (decompiledFrameRemainder1) {
                                                                                                                                              if (decompiledFrameRemainder0) {
                                                                                                                                                var8 += 5;
                                                                                                                                                var9 -= 8;
                                                                                                                                                if (var12 == 0) {
                                                                                                                                                  break regionExit1;
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                  if (decompiledFrameRemainder13) {
                                                                                                                    if (decompiledFrameRemainder12) {
                                                                                                                      if (decompiledFrameRemainder11) {
                                                                                                                        if (decompiledFrameRemainder10) {
                                                                                                                          if (decompiledFrameRemainder9) {
                                                                                                                            if (decompiledFrameRemainder8) {
                                                                                                                              if (decompiledFrameRemainder7) {
                                                                                                                                if (decompiledFrameRemainder6) {
                                                                                                                                  if (decompiledFrameRemainder5) {
                                                                                                                                    if (decompiledFrameRemainder4) {
                                                                                                                                      if (decompiledFrameRemainder3) {
                                                                                                                                        if (decompiledFrameRemainder2) {
                                                                                                                                          if (decompiledFrameRemainder1) {
                                                                                                                                            var9 += 2;
                                                                                                                                            var8 -= 7;
                                                                                                                                            if (var12 == 0) {
                                                                                                                                              break regionExit1;
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                if (decompiledFrameRemainder13) {
                                                                                                                  if (decompiledFrameRemainder12) {
                                                                                                                    if (decompiledFrameRemainder11) {
                                                                                                                      if (decompiledFrameRemainder10) {
                                                                                                                        if (decompiledFrameRemainder9) {
                                                                                                                          if (decompiledFrameRemainder8) {
                                                                                                                            if (decompiledFrameRemainder7) {
                                                                                                                              if (decompiledFrameRemainder6) {
                                                                                                                                if (decompiledFrameRemainder5) {
                                                                                                                                  if (decompiledFrameRemainder4) {
                                                                                                                                    if (decompiledFrameRemainder3) {
                                                                                                                                      if (decompiledFrameRemainder2) {
                                                                                                                                        var9 -= 4;
                                                                                                                                        var8 += 10;
                                                                                                                                        if (var12 == 0) {
                                                                                                                                          break regionExit1;
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              if (decompiledFrameRemainder13) {
                                                                                                                if (decompiledFrameRemainder12) {
                                                                                                                  if (decompiledFrameRemainder11) {
                                                                                                                    if (decompiledFrameRemainder10) {
                                                                                                                      if (decompiledFrameRemainder9) {
                                                                                                                        if (decompiledFrameRemainder8) {
                                                                                                                          if (decompiledFrameRemainder7) {
                                                                                                                            if (decompiledFrameRemainder6) {
                                                                                                                              if (decompiledFrameRemainder5) {
                                                                                                                                if (decompiledFrameRemainder4) {
                                                                                                                                  if (decompiledFrameRemainder3) {
                                                                                                                                    var9 -= 5;
                                                                                                                                    var8 -= 4;
                                                                                                                                    if (var12 == 0) {
                                                                                                                                      break regionExit1;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                            if (decompiledFrameRemainder13) {
                                                                                                              if (decompiledFrameRemainder12) {
                                                                                                                if (decompiledFrameRemainder11) {
                                                                                                                  if (decompiledFrameRemainder10) {
                                                                                                                    if (decompiledFrameRemainder9) {
                                                                                                                      if (decompiledFrameRemainder8) {
                                                                                                                        if (decompiledFrameRemainder7) {
                                                                                                                          if (decompiledFrameRemainder6) {
                                                                                                                            if (decompiledFrameRemainder5) {
                                                                                                                              if (decompiledFrameRemainder4) {
                                                                                                                                var9 -= 6;
                                                                                                                                if (var12 == 0) {
                                                                                                                                  break regionExit1;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          if (decompiledFrameRemainder13) {
                                                                                                            if (decompiledFrameRemainder12) {
                                                                                                              if (decompiledFrameRemainder11) {
                                                                                                                if (decompiledFrameRemainder10) {
                                                                                                                  if (decompiledFrameRemainder9) {
                                                                                                                    if (decompiledFrameRemainder8) {
                                                                                                                      if (decompiledFrameRemainder7) {
                                                                                                                        if (decompiledFrameRemainder6) {
                                                                                                                          if (decompiledFrameRemainder5) {
                                                                                                                            var8 += 4;
                                                                                                                            var9 -= 10;
                                                                                                                            if (var12 == 0) {
                                                                                                                              break regionExit1;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        if (decompiledFrameRemainder13) {
                                                                                                          if (decompiledFrameRemainder12) {
                                                                                                            if (decompiledFrameRemainder11) {
                                                                                                              if (decompiledFrameRemainder10) {
                                                                                                                if (decompiledFrameRemainder9) {
                                                                                                                  if (decompiledFrameRemainder8) {
                                                                                                                    if (decompiledFrameRemainder7) {
                                                                                                                      if (decompiledFrameRemainder6) {
                                                                                                                        var9 -= 10;
                                                                                                                        var8 -= 8;
                                                                                                                        if (var12 == 0) {
                                                                                                                          break regionExit1;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      if (decompiledFrameRemainder13) {
                                                                                                        if (decompiledFrameRemainder12) {
                                                                                                          if (decompiledFrameRemainder11) {
                                                                                                            if (decompiledFrameRemainder10) {
                                                                                                              if (decompiledFrameRemainder9) {
                                                                                                                if (decompiledFrameRemainder8) {
                                                                                                                  if (decompiledFrameRemainder7) {
                                                                                                                    var9 -= 2;
                                                                                                                    if (var12 == 0) {
                                                                                                                      break regionExit1;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    if (decompiledFrameRemainder13) {
                                                                                                      if (decompiledFrameRemainder12) {
                                                                                                        if (decompiledFrameRemainder11) {
                                                                                                          if (decompiledFrameRemainder10) {
                                                                                                            if (decompiledFrameRemainder9) {
                                                                                                              if (decompiledFrameRemainder8) {
                                                                                                                var8 -= 4;
                                                                                                                var9 += 9;
                                                                                                                if (var12 == 0) {
                                                                                                                  break regionExit1;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  if (decompiledFrameRemainder13) {
                                                                                                    if (decompiledFrameRemainder12) {
                                                                                                      if (decompiledFrameRemainder11) {
                                                                                                        if (decompiledFrameRemainder10) {
                                                                                                          if (decompiledFrameRemainder9) {
                                                                                                            var9 -= 3;
                                                                                                            if (var12 == 0) {
                                                                                                              break regionExit1;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                                if (decompiledFrameRemainder13) {
                                                                                                  if (decompiledFrameRemainder12) {
                                                                                                    if (decompiledFrameRemainder11) {
                                                                                                      if (decompiledFrameRemainder10) {
                                                                                                        hj.field_w = 3000;
                                                                                                        var8 += 8;
                                                                                                        if (var12 == 0) {
                                                                                                          break regionExit1;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              if (decompiledFrameRemainder13) {
                                                                                                if (decompiledFrameRemainder12) {
                                                                                                  if (decompiledFrameRemainder11) {
                                                                                                    var9 += 10;
                                                                                                    hj.field_w = 3300;
                                                                                                    var8 += 4;
                                                                                                    if (var12 == 0) {
                                                                                                      break regionExit1;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            if (decompiledFrameRemainder13) {
                                                                                              if (decompiledFrameRemainder12) {
                                                                                                var8 -= 7;
                                                                                                var9 += 8;
                                                                                                if (var12 == 0) {
                                                                                                  break regionExit1;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          if (decompiledFrameRemainder13) {
                                                                                            var9--;
                                                                                            hj.field_w = 2500;
                                                                                            if (var12 == 0) {
                                                                                              break regionExit1;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var9 += 4;
                                                                                        hj.field_w = 2500;
                                                                                        if (var12 == 0) {
                                                                                          break regionExit1;
                                                                                        }
                                                                                      }
                                                                                      var9 += 4;
                                                                                      var8 -= 4;
                                                                                      if (var12 == 0) {
                                                                                        break regionExit1;
                                                                                      }
                                                                                    }
                                                                                    hj.field_w = 2700;
                                                                                    if (var12 == 0) {
                                                                                      break regionExit1;
                                                                                    }
                                                                                  }
                                                                                  var9 += 10;
                                                                                  if (var12 == 0) {
                                                                                    break regionExit1;
                                                                                  }
                                                                                }
                                                                                var8 += 4;
                                                                                var9 += 2;
                                                                                if (var12 == 0) {
                                                                                  break regionExit1;
                                                                                }
                                                                              }
                                                                              var9 += 8;
                                                                              var8 += 6;
                                                                              hj.field_w = 1600;
                                                                              if (var12 == 0) {
                                                                                break regionExit1;
                                                                              }
                                                                            }
                                                                            var9 += 2;
                                                                            hj.field_w = 1024;
                                                                            var8 -= 2;
                                                                            if (var12 == 0) {
                                                                              break regionExit1;
                                                                            }
                                                                          }
                                                                          var8 += 12;
                                                                          var9 -= 4;
                                                                          if (var12 == 0) {
                                                                            break regionExit1;
                                                                          }
                                                                        }
                                                                        var9 -= 14;
                                                                        if (var12 == 0) {
                                                                          break regionExit1;
                                                                        }
                                                                      }
                                                                      var9 -= 10;
                                                                      var8 += 12;
                                                                      if (var12 == 0) {
                                                                        break regionExit1;
                                                                      }
                                                                    }
                                                                    var9 -= 8;
                                                                    var8 -= 15;
                                                                    if (var12 == 0) {
                                                                      break regionExit1;
                                                                    }
                                                                  }
                                                                  hj.field_w = 2900;
                                                                  if (var12 == 0) {
                                                                    break regionExit1;
                                                                  }
                                                                }
                                                                var9 -= 4;
                                                                var8 += 13;
                                                                if (var12 == 0) {
                                                                  break regionExit1;
                                                                }
                                                              }
                                                              hj.field_w = 3000;
                                                              var9 -= 2;
                                                              if (var12 == 0) {
                                                                break regionExit1;
                                                              }
                                                            }
                                                            hj.field_w = 2300;
                                                            var8 += 25;
                                                            if (var12 == 0) {
                                                              break regionExit1;
                                                            }
                                                          }
                                                          var9 -= 6;
                                                          if (var12 == 0) {
                                                            break regionExit1;
                                                          }
                                                        }
                                                        var8 += 8;
                                                        if (var12 == 0) {
                                                          break regionExit1;
                                                        }
                                                      }
                                                      var8 += 4;
                                                      if (var12 == 0) {
                                                        break regionExit1;
                                                      }
                                                    }
                                                    var8 += 3;
                                                    if (var12 == 0) {
                                                      break regionExit1;
                                                    }
                                                  }
                                                  var8 += 3;
                                                  var9 -= 4;
                                                  if (var12 == 0) {
                                                    break regionExit1;
                                                  }
                                                }
                                                var8 -= 3;
                                                hj.field_w = 2800;
                                                if (var12 == 0) {
                                                  break regionExit1;
                                                }
                                              }
                                              hj.field_w = 3500;
                                              var8 -= 2;
                                              if (var12 == 0) {
                                                break regionExit1;
                                              }
                                            }
                                            hj.field_w = 2800;
                                            var8 -= 10;
                                            if (var12 == 0) {
                                              break regionExit1;
                                            }
                                          }
                                          var8 -= 3;
                                          hj.field_w = 3800;
                                          if (var12 == 0) {
                                            break regionExit1;
                                          }
                                        }
                                        var8 -= 4;
                                        hj.field_w = 3800;
                                        if (var12 == 0) {
                                          break regionExit1;
                                        }
                                      }
                                      hj.field_w = 3900;
                                      var8 -= 2;
                                      if (var12 == 0) {
                                        break regionExit1;
                                      }
                                    }
                                    var8 += 8;
                                    if (var12 == 0) {
                                      break regionExit1;
                                    }
                                  }
                                  var9--;
                                  var8 += 4;
                                  if (var12 == 0) {
                                    break regionExit1;
                                  }
                                }
                                var8 += 3;
                                hj.field_w = 1800;
                                if (var12 == 0) {
                                  break regionExit1;
                                }
                              }
                              var8 += 4;
                              hj.field_w = 1800;
                              if (var12 == 0) {
                                break regionExit1;
                              }
                            }
                            var8 += 2;
                            hj.field_w = 1550;
                            if (var12 == 0) {
                              break regionExit1;
                            }
                          }
                          var9 -= 2;
                          var8 += 7;
                          if (var12 == 0) {
                            break regionExit1;
                          }
                        }
                        var8 += 4;
                        if (var12 == 0) {
                          break regionExit1;
                        }
                      }
                      hj.field_w = 3600;
                      if (var12 == 0) {
                        break regionExit1;
                      }
                    }
                    hj.field_w = 3600;
                    if (var12 == 0) {
                      break regionExit1;
                    }
                  }
                  hj.field_w = 3600;
                  if (var12 == 0) {
                    break regionExit1;
                  }
                }
                hj.field_w = 3600;
                if (var12 == 0) {
                  break regionExit1;
                }
              }
              var8 += 3;
              hj.field_w = 2200;
            }
            if ((3086 & param0.field_Q) != 0 &&
              param4 > 100) {
              var8 -= 5;
            }
            param0.a(0, false, var8, var9, (byte) 49, 16384);
            hj.field_w = var10;
            if (var12 == 0) {
              sb.field_bb.b((byte) 123);
              return;
            }
          }
          var8Lifetime1 = hj.field_w;
          if (param0.componentId == 0) {
            hj.field_w = 1200;
          }
          if (55 == param0.componentId) {
            hj.field_w = 1200;
          }
          if (57 == param0.componentId) {
            hj.field_w = 1300;
          }
          if (param0.componentId == 62) {
            hj.field_w = 1400;
          }
          if (65 == param0.componentId) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 69) {
            hj.field_w = 1400;
          }
          if (72 == param0.componentId) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 75) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 79) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 84) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 88) {
            hj.field_w = 1000;
          }
          if (param0.componentId == 92) {
            hj.field_w = 700;
          }
          param0.a(0, false, param4 / 2, param5, (byte) 49, 0);
          hj.field_w = var8Lifetime1;
          sb.field_bb.b((byte) 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_304_0 = var6;
          stackIn_304_1 = new StringBuilder().append("qb.D(");
          if (param0 == null) {
            stackIn_305_2 = "null";
          } else {
            stackIn_305_2 = "{...}";
          }
          stackIn_307_1 = ((StringBuilder) (Object) stackIn_304_1).append(stackIn_305_2).append(',');
          if (param1 == null) {
            stackIn_308_2 = "null";
          } else {
            stackIn_308_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_304_0), ((StringBuilder) (Object) stackIn_307_1).append(stackIn_308_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_y = new String[][]{new String[]{"Tactical<br>Two-second delay before actions", "Action<br>Very little delay before actions.<br><col=ff0000>This mode is only recommended if you have a good internet connection.</col>"}, new String[]{"Only the default versions of the Slave, Aquila and Golem are allowed within smaller battles.", "Any sentinel with a tech value in the standard range may participate.", "Any sentinel with any tech value may participate in large battles.", "High-tech designs are allowed within larger battles.", "All designs of sentinel are available for massive battles."}, new String[]{"War Zone<br>Join in the eternal solarite war.<br>Anything goes in this massive free-for-all arena!<br>Free-for-all", "Lost World<br>Your team has ten minutes to claim victory before the battle in orbit reaches the surface!<br>Top vs bottom teams", "City<br>This pitted landscape is all that remains of a once mighty metropolis.<br>Collect the MGFN technology and hold it for extra points.<br>Free-for-all", "Moon<br>A crashed cruiser occupies this world. Use its shields for defence and earn extra points while you occupy it.<br>Free-for-all", "Star Fleet<br>Bring your team victory in an epic struggle against the opposing star cruiser!<br>Reach the enemy ship then return safely to help your team win.<br>Top vs bottom team, Capture the Flag", "Co-op Campaign<br>Take your sentinel to aid in the epic fight to maintain the flow of solarite.<br>2-player, Unrated only"}};
        field_H = new fm(10, 2, 2, 0);
        field_C = "Enter multiplayer lobby";
        field_N = "Confirm Password: ";
    }
}
