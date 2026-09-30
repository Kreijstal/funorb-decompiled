/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayEntity_ja extends rc {
    int entityCategoryKey_field_C;
    private int interpolatedPaletteColor_field_q;
    private int paletteGreenDelta_field_x;
    GameplayEntity_ja[] relatedEntities_field_n;
    float positionX_field_o;
    boolean field_B;
    int relatedEntityCount_field_L;
    float spriteAngleRadians_field_u;
    int remainingLifetimeTicks_field_r;
    tf entityQueue_field_K;
    int entityId_field_H;
    private int paletteRedDelta_field_s;
    int spriteVariantIndex_field_M;
    int initialLifetimeTicks_field_p;
    private int entityUpdateTick_field_I;
    int field_z;
    boolean field_t;
    int sameVariantEntityCount_field_m;
    int field_E;
    static tf field_A;
    Sprite_dm entitySprite_field_J;
    int animationFrameIndex_field_G;
    float velocityY_field_F;
    float positionY_field_v;
    private int paletteBlueDelta_field_y;
    static d field_D;
    float velocityX_field_w;
    int sameCategoryEntityCount_field_N;

    final void drawBoardRotatedEntity_g(int param0) {
        float entityOffsetX_var2;
        float entityOffsetY_var3;
        int rotatedEntityX_var4;
        int rotatedEntityY_var5;
        int var6;
        var6 = Geoblox.field_C;
        entityOffsetX_var2 = this.positionX_field_o - 320.0f;
        entityOffsetY_var3 = this.positionY_field_v - 240.0f;
        rotatedEntityX_var4 = (int)((double)entityOffsetX_var2 * Math.cos((double)el.gameplaySession_field_o.boardAngleRadians_field_J) - (double)entityOffsetY_var3 * Math.sin((double)el.gameplaySession_field_o.boardAngleRadians_field_J) + 320.0);
        if (param0 == -16096) {
          L0: {
            L1: {
              rotatedEntityY_var5 = (int)(Math.sin((double)el.gameplaySession_field_o.boardAngleRadians_field_J) * (double)entityOffsetX_var2 + (double)entityOffsetY_var3 * Math.cos((double)el.gameplaySession_field_o.boardAngleRadians_field_J) + 240.0);
              if (this.field_z == 2) {
                break L1;
              } else {
                if (1 == this.field_z) {
                  break L1;
                } else {
                  vf.field_L.e();
                  SoftwareRasterizer_vb.c();
                  this.entitySprite_field_J.c(-this.entitySprite_field_J.field_s + vf.field_L.field_s >> 215276737, vf.field_L.field_o + -this.entitySprite_field_J.field_o >> 930476833);
                  k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
                  sh.field_y.a(param0 + 16351);
                  vf.field_L.rotateSmooth_a(vf.field_L.field_s << -24802045, vf.field_L.field_o << 1089501283, rotatedEntityX_var4 << 1543501028, rotatedEntityY_var5 << -2087203164, (int)(65535.0 * ((double)(-el.gameplaySession_field_o.boardAngleRadians_field_J + this.spriteAngleRadians_field_u) / 6.283185307179586)), 4096);
                  break L0;
                }
              }
            }
            if (1 == this.field_z) {
              vf.field_L.e();
              SoftwareRasterizer_vb.c();
              this.entitySprite_field_J.b(-this.entitySprite_field_J.field_s + vf.field_L.field_s >> -1223154047, vf.field_L.field_o - this.entitySprite_field_J.field_o >> -1804143071, this.interpolatedPaletteColor_field_q);
              k.a(0, 0, vf.field_L.field_s, -27085, vf.field_L.field_o);
              sh.field_y.a(param0 + 16351);
              vf.field_L.rotateSmooth_a(vf.field_L.field_s << -1881785341, vf.field_L.field_o << 794425251, rotatedEntityX_var4 << 1750603908, rotatedEntityY_var5 << -1690760316, (int)(65535.0 * ((double)(-el.gameplaySession_field_o.boardAngleRadians_field_J + this.spriteAngleRadians_field_u) / 6.283185307179586)), 4096);
              break L0;
            } else {
              this.entitySprite_field_J.b(-(this.entitySprite_field_J.field_s >> 2075460897) + rotatedEntityX_var4, rotatedEntityY_var5 + -(this.entitySprite_field_J.field_o >> 2079278081));
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void k(int param0) {
        vf.field_L.e();
        SoftwareRasterizer_vb.c();
        this.entitySprite_field_J.rotateSmooth_a(this.entitySprite_field_J.field_s << 1057923171, this.entitySprite_field_J.field_o << -1595923197, vf.field_L.field_s << -694542845, vf.field_L.field_o << 1500789091, (int)(65535.0 * ((double)this.spriteAngleRadians_field_u / 6.283185307179586)), 4096);
        bk.field_a.e();
        vf.field_L.a(-(vf.field_L.field_s / 2) + (int)this.positionX_field_o, (int)this.positionY_field_v + -(vf.field_L.field_o / param0), this.entityId_field_H - -1);
        sh.field_y.a(255);
        bk.field_a.e();
        i.field_a.a(320 + el.gameplaySession_field_o.field_w, 240 - -el.gameplaySession_field_o.field_u, 16777215);
        sh.field_y.a(param0 + 253);
    }

    final void drawFadingEntity_n(int param0) {
        float entityOffsetX_var2;
        float entityOffsetY_var3;
        float boardAngle_var4;
        int rotatedEntityX_var5;
        int rotatedEntityY_var6;
        int sentinelDivisionGuard_var7;
        int entityDrawX_var8;
        int entityDrawY_var9;
        int fadeOpacity_var10;
        int controlFlowGuard_var11;
        L0: {
          L1: {
            controlFlowGuard_var11 = Geoblox.field_C;
            entityOffsetX_var2 = this.positionX_field_o - 320.0f;
            entityOffsetY_var3 = this.positionY_field_v - 240.0f;
            boardAngle_var4 = el.gameplaySession_field_o.boardAngleRadians_field_J;
            rotatedEntityX_var5 = (int)(320.0 + ((double)entityOffsetX_var2 * Math.cos((double)boardAngle_var4) - Math.sin((double)boardAngle_var4) * (double)entityOffsetY_var3));
            rotatedEntityY_var6 = (int)(240.0 + ((double)entityOffsetX_var2 * Math.sin((double)boardAngle_var4) + Math.cos((double)boardAngle_var4) * (double)entityOffsetY_var3));
            if (-2 == (this.field_z ^ -1)) {
              break L1;
            } else {
              if (2 == this.field_z) {
                break L1;
              } else {
                vf.field_L.e();
                SoftwareRasterizer_vb.c();
                this.entitySprite_field_J.rotateSmooth_a(this.entitySprite_field_J.field_s << -575346205, this.entitySprite_field_J.field_o << 1794565923, vf.field_L.field_s << 776884707, vf.field_L.field_o << -188441693, (int)(((double)this.spriteAngleRadians_field_u - (double)boardAngle_var4 / 6.283185307179586) * 65535.0), 4096);
                break L0;
              }
            }
          }
          if (this.field_z != 1) {
            vf.field_L.e();
            SoftwareRasterizer_vb.c();
            this.entitySprite_field_J.b(-(this.entitySprite_field_J.field_s >> -1792337183) + (vf.field_L.field_s >> 339525793), (vf.field_L.field_o >> -1789028991) - (this.entitySprite_field_J.field_o >> -1848667231));
            break L0;
          } else {
            wl.field_a.e();
            SoftwareRasterizer_vb.c();
            this.entitySprite_field_J.b(-this.entitySprite_field_J.field_s + wl.field_a.field_s >> -1143695199, -this.entitySprite_field_J.field_o + wl.field_a.field_o >> -1986067391, this.interpolatedPaletteColor_field_q);
            vf.field_L.e();
            SoftwareRasterizer_vb.c();
            wl.field_a.rotateSmooth_a(wl.field_a.field_s << 992968611, wl.field_a.field_o << 1388040003, vf.field_L.field_s << -967057565, vf.field_L.field_o << 1628733635, (int)(65535.0 * (-((double)boardAngle_var4 / 6.283185307179586) + (double)this.spriteAngleRadians_field_u)), 4096);
            break L0;
          }
        }
        L2: {
          sentinelDivisionGuard_var7 = 2 % ((-23 - param0) / 60);
          sh.field_y.a(255);
          entityDrawX_var8 = rotatedEntityX_var5 + -(vf.field_L.field_s >> -2050048063);
          entityDrawY_var9 = rotatedEntityY_var6 - (vf.field_L.field_o >> -2142432031);
          fadeOpacity_var10 = (int)(0.5 + Math.sin((double)(this.remainingLifetimeTicks_field_r + -this.initialLifetimeTicks_field_p + this.initialLifetimeTicks_field_p >> 1305235300)) * (double)(100 * (this.initialLifetimeTicks_field_p - this.remainingLifetimeTicks_field_r)) / (double)this.initialLifetimeTicks_field_p) - (-(100 * (this.initialLifetimeTicks_field_p - this.remainingLifetimeTicks_field_r) / this.initialLifetimeTicks_field_p) - 56);
          if (-257 > (fadeOpacity_var10 ^ -1)) {
            fadeOpacity_var10 = 256;
            break L2;
          } else {
            if (fadeOpacity_var10 >= 0) {
              break L2;
            } else {
              fadeOpacity_var10 = 0;
              break L2;
            }
          }
        }
        vf.field_L.d(entityDrawX_var8, entityDrawY_var9, fadeOpacity_var10);
    }

    final static void h(int param0) {
        af.field_c = 0;
        ul.field_a = null;
        gg.field_b = 0;
        g.field_j = 0;
        pa.field_g = 0;
        jf.field_j = 0;
        uf.field_b = param0;
        ha.field_g = 0;
        rj.field_c = 5167632;
        MenuScreen_ka.field_h = 0;
        gi.field_e = 0;
        nd.field_a = 0;
        wa.field_a = 0;
    }

    public static void e(byte param0) {
        field_A = null;
        field_D = null;
        int var1 = 106 % ((33 - param0) / 39);
    }

    private final void updatePaletteChannelDeltas_m(int param0) {
        int var2 = -121 % ((-63 - param0) / 39);
        this.paletteRedDelta_field_s = -(jg.field_h[GameScreen_c.selectedThemeId_field_ab][this.animationFrameIndex_field_G] >> 1643839728 & 255) + (255 & jg.field_h[GameScreen_c.selectedThemeId_field_ab][(this.animationFrameIndex_field_G + 1) % 7] >> 2056894992);
        this.paletteGreenDelta_field_x = -(jg.field_h[GameScreen_c.selectedThemeId_field_ab][this.animationFrameIndex_field_G] >> -1693987608 & 255) + ((jg.field_h[GameScreen_c.selectedThemeId_field_ab][(1 + this.animationFrameIndex_field_G) % 7] & 65448) >> -742490392);
        this.paletteBlueDelta_field_y = -(jg.field_h[GameScreen_c.selectedThemeId_field_ab][this.animationFrameIndex_field_G] & 255) + (jg.field_h[GameScreen_c.selectedThemeId_field_ab][(1 + this.animationFrameIndex_field_G) % 7] & 255);
    }

    final void eraseEntityPixels_f(int param0) {
        int incrementValue$0 = 0;
        int clipLeftX_var2;
        int clipTopY_var3;
        int clippedWidth_var4;
        int clippedHeight_var5;
        int framebufferIndex_var6;
        int rowSkip_var7;
        int negativeColumnCounter_var9;
        int controlFlowGuard_var10;
        int[] framebufferPixels_var14;
        L0: {
          controlFlowGuard_var10 = Geoblox.field_C;
          clipLeftX_var2 = (int)this.positionX_field_o - ((vf.field_L.field_s >> -659585983) - -4);
          clipTopY_var3 = -4 + -(vf.field_L.field_o >> -1594034399) + (int)this.positionY_field_v;
          clippedWidth_var4 = 8 + vf.field_L.field_s;
          clippedHeight_var5 = 8 + vf.field_L.field_o;
          if (-1 >= (clipLeftX_var2 ^ -1)) {
            break L0;
          } else {
            clippedWidth_var4 = clippedWidth_var4 + clipLeftX_var2;
            clipLeftX_var2 = 0;
            break L0;
          }
        }
        L1: {
          if ((clipTopY_var3 ^ -1) <= -1) {
            break L1;
          } else {
            clippedHeight_var5 = clippedHeight_var5 + clipTopY_var3;
            clipTopY_var3 = 0;
            break L1;
          }
        }
        L2: {
          if (bk.field_a.width_field_r < clippedWidth_var4 + clipLeftX_var2) {
            clippedWidth_var4 = -clipLeftX_var2 + bk.field_a.width_field_r;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (clippedHeight_var5 + clipTopY_var3 > bk.field_a.height_field_m) {
            clippedHeight_var5 = bk.field_a.height_field_m - clipTopY_var3;
            break L3;
          } else {
            break L3;
          }
        }
        if (param0 >= 78) {
          framebufferIndex_var6 = clipLeftX_var2 + bk.field_a.width_field_r * clipTopY_var3;
          rowSkip_var7 = -clippedWidth_var4 + bk.field_a.width_field_r;
          framebufferPixels_var14 = bk.field_a.pixels_field_v;
          L4: while (true) {
            incrementValue$0 = clippedHeight_var5;
            clippedHeight_var5--;
            if (-1 <= (incrementValue$0 ^ -1)) {
              return;
            } else {
              negativeColumnCounter_var9 = -clippedWidth_var4;
              L5: while (true) {
                if ((negativeColumnCounter_var9 ^ -1) <= -1) {
                  framebufferIndex_var6 = framebufferIndex_var6 + rowSkip_var7;
                  continue L4;
                } else {
                  if ((framebufferPixels_var14[framebufferIndex_var6] ^ -1) == (this.entityId_field_H - -1 ^ -1)) {
                    framebufferPixels_var14[framebufferIndex_var6] = 0;
                    framebufferIndex_var6++;
                    negativeColumnCounter_var9++;
                    continue L5;
                  } else {
                    framebufferIndex_var6++;
                    negativeColumnCounter_var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void rotateEntityAroundBoard_a(float rotationDeltaRadians_param0, int param1) {
        double velocityNormalizationScale_var5 = 0.0;
        if (param1 > -79) {
            this.rotateEntityAroundBoard_a(0.2609390318393707f, 75);
        }
        float positionOffsetX_var3 = this.positionX_field_o - 320.0f;
        float positionOffsetY_var4 = this.positionY_field_v - 240.0f;
        this.positionX_field_o = (float)((double)positionOffsetX_var3 * Math.cos((double)rotationDeltaRadians_param0) - Math.sin((double)rotationDeltaRadians_param0) * (double)positionOffsetY_var4) + 320.0f;
        this.positionY_field_v = (float)(Math.sin((double)rotationDeltaRadians_param0) * (double)positionOffsetX_var3 + (double)positionOffsetY_var4 * Math.cos((double)rotationDeltaRadians_param0)) + 240.0f;
        this.velocityY_field_F = 240.0f - this.positionY_field_v;
        this.velocityX_field_w = 320.0f - this.positionX_field_o;
        if (this.velocityX_field_w * this.velocityX_field_w + this.velocityY_field_F * this.velocityY_field_F > og.field_r * og.field_r) {
            velocityNormalizationScale_var5 = (double)og.field_r / Math.sqrt((double)(this.velocityX_field_w * this.velocityX_field_w + this.velocityY_field_F * this.velocityY_field_F));
            this.velocityX_field_w = (float)((double)this.velocityX_field_w * velocityNormalizationScale_var5);
            this.velocityY_field_F = (float)((double)this.velocityY_field_F * velocityNormalizationScale_var5);
        }
        if (!((this.field_z ^ -1) == -3)) {
            this.spriteAngleRadians_field_u = this.spriteAngleRadians_field_u - rotationDeltaRadians_param0;
        }
    }

    private final void selectEntitySprite_g(byte param0) {
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          if (param0 >= 83) {
            break L0;
          } else {
            this.drawBoardRotatedEntity_g(18);
            break L0;
          }
        }
        L1: {
          if (0 == this.field_z) {
            this.entitySprite_field_J = ke.field_a[GameScreen_c.selectedThemeId_field_ab][this.entityCategoryKey_field_C][this.spriteVariantIndex_field_M];
            break L1;
          } else {
            if (-5 == (this.field_z ^ -1)) {
              this.spriteVariantIndex_field_M = -1;
              this.entitySprite_field_J = fc.field_g[0];
              this.entityCategoryKey_field_C = -1;
              break L1;
            } else {
              if (this.field_z == 3) {
                this.entityCategoryKey_field_C = -1;
                this.spriteVariantIndex_field_M = -1;
                this.entitySprite_field_J = hb.field_d[0];
                break L1;
              } else {
                if (1 == this.field_z) {
                  this.entitySprite_field_J = s.field_G[GameScreen_c.selectedThemeId_field_ab][this.entityCategoryKey_field_C];
                  this.spriteVariantIndex_field_M = -1;
                  this.interpolatedPaletteColor_field_q = jg.field_h[GameScreen_c.selectedThemeId_field_ab][this.animationFrameIndex_field_G];
                  this.updatePaletteChannelDeltas_m(53);
                  break L1;
                } else {
                  if (2 != this.field_z) {
                    if (8 == this.field_z) {
                      this.entitySprite_field_J = ej.field_a[this.animationFrameIndex_field_G];
                      this.entityCategoryKey_field_C = -1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    this.entitySprite_field_J = MenuScreen_ka.field_m[GameScreen_c.selectedThemeId_field_ab][this.spriteVariantIndex_field_M][this.animationFrameIndex_field_G];
                    this.entityCategoryKey_field_C = -1;
                    break L1;
                  }
                }
              }
            }
          }
        }
    }

    final void h(byte param0) {
        vf.field_L.e();
        SoftwareRasterizer_vb.c();
        this.entitySprite_field_J.rotateSmooth_a(this.entitySprite_field_J.field_s << 704850723, this.entitySprite_field_J.field_o << -2106424349, vf.field_L.field_s << -1535551901, vf.field_L.field_o << 2122077027, (int)((double)(this.spriteAngleRadians_field_u - el.gameplaySession_field_o.boardAngleRadians_field_J) / 6.283185307179586 * 65535.0), 4096);
        if (param0 <= 46) {
            this.paletteBlueDelta_field_y = 17;
        }
        vf.field_L.g(this.entityId_field_H - -1);
        wd.field_b.e();
        vf.field_L.a(-wd.field_a + -(vf.field_L.field_s >> 811012289) + ng.field_G, -(vf.field_L.field_o >> 2111671105) + (td.field_E + -wd.field_d), 1 + this.entityId_field_H);
        sh.field_y.a(255);
    }

    final void integrateEntityVelocity_f(byte param0) {
        this.positionX_field_o = this.positionX_field_o + this.velocityX_field_w;
        this.positionY_field_v = this.positionY_field_v + this.velocityY_field_F;
        if (param0 != -59) {
            this.sameVariantEntityCount_field_m = -29;
        }
    }

    private final void i(int param0) {
        this.entityQueue_field_K = null;
        this.entityUpdateTick_field_I = 0;
        this.field_t = false;
        this.animationFrameIndex_field_G = 0;
        this.selectEntitySprite_g((byte) 99);
        this.field_B = false;
        this.field_E = 0;
        int var2 = 62 % ((param0 - 67) / 32);
    }

    final static int alignBitOffset_b(int param0, int bitOffset_param1) {
        int paddingToByteBoundary_var2 = 0;
        if (!((bitOffset_param1 & 7) == 0)) {
            paddingToByteBoundary_var2 = -(bitOffset_param1 & 7) + 8;
        }
        if (param0 != 1221916132) {
            return 89;
        }
        int byteAlignedBitOffset_var3 = paddingToByteBoundary_var2 + bitOffset_param1;
        return byteAlignedBitOffset_var3;
    }

    final void advanceEntityAnimation_b(boolean param0) {
        int frameIndexBeforeIncrement_fieldTemp$0 = 0;
        int frameIndexBeforeIncrement_fieldTemp$1 = 0;
        int frameIndexBeforeIncrement_fieldTemp$2 = 0;
        int frameIndexBeforeIncrement_fieldTemp$3 = 0;
        int frameIndexBeforeIncrement_fieldTemp$4 = 0;
        int frameIndexBeforeIncrement_fieldTemp$5 = 0;
        int frameIndexBeforeIncrement_fieldTemp$6 = 0;
        float paletteBlendFraction_var2;
        int var3;
        L0: {
          var3 = Geoblox.field_C;
          this.entityUpdateTick_field_I = this.entityUpdateTick_field_I + 1;
          this.remainingLifetimeTicks_field_r = this.remainingLifetimeTicks_field_r - 1;
          if (param0) {
            break L0;
          } else {
            this.positionY_field_v = -0.09870309382677078f;
            break L0;
          }
        }
        L1: {
          if ((this.field_z ^ -1) != -6) {
            if (this.field_z != 1) {
              if (this.field_z == 2) {
                if (this.entityUpdateTick_field_I % 24 != 0) {
                  break L1;
                } else {
                  frameIndexBeforeIncrement_fieldTemp$0 = this.animationFrameIndex_field_G;
                  this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                  this.entitySprite_field_J = MenuScreen_ka.field_m[GameScreen_c.selectedThemeId_field_ab][this.spriteVariantIndex_field_M][frameIndexBeforeIncrement_fieldTemp$0];
                  this.animationFrameIndex_field_G = this.animationFrameIndex_field_G % 4;
                  break L1;
                }
              } else {
                if (8 != this.field_z) {
                  break L1;
                } else {
                  if (this.entityUpdateTick_field_I % 24 == 0) {
                    frameIndexBeforeIncrement_fieldTemp$1 = this.animationFrameIndex_field_G;
                    this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                    this.entitySprite_field_J = ej.field_a[frameIndexBeforeIncrement_fieldTemp$1];
                    this.animationFrameIndex_field_G = this.animationFrameIndex_field_G % 4;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            } else {
              paletteBlendFraction_var2 = 0.019999999552965164f * (float)(this.entityUpdateTick_field_I % 50);
              this.interpolatedPaletteColor_field_q = (int)((float)this.paletteBlueDelta_field_y * paletteBlendFraction_var2) + jg.field_h[GameScreen_c.selectedThemeId_field_ab][this.animationFrameIndex_field_G] + (((int)(paletteBlendFraction_var2 * (float)this.paletteRedDelta_field_s) << 1248854992) + ((int)((float)this.paletteGreenDelta_field_x * paletteBlendFraction_var2) << 461902984));
              if (-50 != (this.entityUpdateTick_field_I % 50 ^ -1)) {
                break L1;
              } else {
                this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                this.animationFrameIndex_field_G = this.animationFrameIndex_field_G % 7;
                this.updatePaletteChannelDeltas_m(-107);
                break L1;
              }
            }
          } else {
            if (this.entityUpdateTick_field_I % 20 == 0) {
              frameIndexBeforeIncrement_fieldTemp$2 = this.animationFrameIndex_field_G;
              this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
              this.entitySprite_field_J = mi.field_B[frameIndexBeforeIncrement_fieldTemp$2];
              this.animationFrameIndex_field_G = this.animationFrameIndex_field_G % 4;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if ((this.field_z ^ -1) != -5) {
            if (7 != this.field_z) {
              if ((this.field_z ^ -1) != -4) {
                if (-7 == (this.field_z ^ -1)) {
                  this.remainingLifetimeTicks_field_r = this.remainingLifetimeTicks_field_r - 1;
                  if ((this.remainingLifetimeTicks_field_r ^ -1) <= -1) {
                    break L2;
                  } else {
                    if (-1 != (this.entityUpdateTick_field_I % 24 ^ -1)) {
                      break L2;
                    } else {
                      if (4 > this.animationFrameIndex_field_G) {
                        frameIndexBeforeIncrement_fieldTemp$3 = this.animationFrameIndex_field_G;
                        this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                        this.entitySprite_field_J = vj.field_a[frameIndexBeforeIncrement_fieldTemp$3];
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                if ((this.entityUpdateTick_field_I & 255 ^ -1) <= -50) {
                  this.animationFrameIndex_field_G = 0;
                  break L2;
                } else {
                  if ((this.entityUpdateTick_field_I & 15) == 0) {
                    frameIndexBeforeIncrement_fieldTemp$4 = this.animationFrameIndex_field_G;
                    this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                    this.entitySprite_field_J = hb.field_d[frameIndexBeforeIncrement_fieldTemp$4];
                    if (-5 == (this.animationFrameIndex_field_G ^ -1)) {
                      this.animationFrameIndex_field_G = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            } else {
              if (this.entityUpdateTick_field_I % 20 == 0) {
                frameIndexBeforeIncrement_fieldTemp$5 = this.animationFrameIndex_field_G;
                this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                this.entitySprite_field_J = hg.field_b[frameIndexBeforeIncrement_fieldTemp$5];
                this.animationFrameIndex_field_G = this.animationFrameIndex_field_G % 4;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            if ((255 & this.entityUpdateTick_field_I) < 49) {
              if ((15 & this.entityUpdateTick_field_I) != 0) {
                break L2;
              } else {
                frameIndexBeforeIncrement_fieldTemp$6 = this.animationFrameIndex_field_G;
                this.animationFrameIndex_field_G = this.animationFrameIndex_field_G + 1;
                this.entitySprite_field_J = fc.field_g[frameIndexBeforeIncrement_fieldTemp$6];
                if ((this.animationFrameIndex_field_G ^ -1) != -5) {
                  break L2;
                } else {
                  this.animationFrameIndex_field_G = 0;
                  break L2;
                }
              }
            } else {
              this.animationFrameIndex_field_G = 0;
              break L2;
            }
          }
        }
    }

    final void removeRelatedEntity_a(GameplayEntity_ja relatedEntity_param0, int startingChildIndex_param1) {
        int relatedEntitySearchIndex_var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            relatedEntitySearchIndex_var3_int = startingChildIndex_param1;
            L1: while (true) {
              L2: {
                if (relatedEntitySearchIndex_var3_int >= this.relatedEntityCount_field_L) {
                  break L2;
                } else {
                  if (this.relatedEntities_field_n[relatedEntitySearchIndex_var3_int] == relatedEntity_param0) {
                    L3: {
                      this.relatedEntities_field_n[relatedEntitySearchIndex_var3_int] = null;
                      if (this.spriteVariantIndex_field_M == relatedEntity_param0.spriteVariantIndex_field_M) {
                        this.sameVariantEntityCount_field_m = this.sameVariantEntityCount_field_m - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      this.relatedEntityCount_field_L = this.relatedEntityCount_field_L - 1;
                      if (relatedEntity_param0.entityCategoryKey_field_C == this.entityCategoryKey_field_C) {
                        this.sameCategoryEntityCount_field_N = this.sameCategoryEntityCount_field_N - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (5 > relatedEntitySearchIndex_var3_int) {
                        sf.a(this.relatedEntities_field_n, 1 + relatedEntitySearchIndex_var3_int, this.relatedEntities_field_n, relatedEntitySearchIndex_var3_int, this.relatedEntityCount_field_L + -relatedEntitySearchIndex_var3_int);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.relatedEntities_field_n[this.relatedEntityCount_field_L] = null;
                    break L2;
                  } else {
                    relatedEntitySearchIndex_var3_int++;
                    continue L1;
                  }
                }
              }
              L6: {
                if (this.sameVariantEntityCount_field_m > this.relatedEntityCount_field_L) {
                  break L6;
                } else {
                  if (this.relatedEntityCount_field_L < this.sameCategoryEntityCount_field_N) {
                    break L6;
                  } else {
                    break L0;
                  }
                }
              }
              throw new IllegalStateException("");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("ja.HA(");

            if (relatedEntity_param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + startingChildIndex_param1 + ')');
        }
    }

    final void eraseEntityTrail_j(int param0) {
        int incrementValue$0 = 0;
        float entityOffsetX_var2;
        float entityOffsetY_var3;
        int rotatedEntityX_var4;
        int rotatedEntityY_var5;
        int clipLeftX_var6;
        int clipTopY_var7;
        int clippedSpriteWidth_var8;
        int clippedSpriteHeight_var9;
        int framebufferIndex_var10;
        int framebufferRowSkip_var11;
        int negativeColumnCounter_var13;
        int var14;
        int[] backgroundPixels_var18;
        L0: {
          var14 = Geoblox.field_C;
          entityOffsetX_var2 = -320.0f + this.positionX_field_o;
          entityOffsetY_var3 = -240.0f + this.positionY_field_v;
          rotatedEntityX_var4 = (int)(Math.cos((double)el.gameplaySession_field_o.boardAngleRadians_field_J) * (double)entityOffsetX_var2 - (double)entityOffsetY_var3 * Math.sin((double)el.gameplaySession_field_o.boardAngleRadians_field_J) + 320.0);
          rotatedEntityY_var5 = (int)((double)entityOffsetX_var2 * Math.sin((double)el.gameplaySession_field_o.boardAngleRadians_field_J) + Math.cos((double)el.gameplaySession_field_o.boardAngleRadians_field_J) * (double)entityOffsetY_var3 + 240.0);
          clipLeftX_var6 = -(vf.field_L.field_s / 2) + (rotatedEntityX_var4 - 4 + -wd.field_a);
          clipTopY_var7 = -wd.field_d + -4 + (rotatedEntityY_var5 - vf.field_L.field_o / 2);
          clippedSpriteWidth_var8 = vf.field_L.field_s - -8;
          if (clipLeftX_var6 < 0) {
            clippedSpriteWidth_var8 = clippedSpriteWidth_var8 + clipLeftX_var6;
            clipLeftX_var6 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          clippedSpriteHeight_var9 = 8 + vf.field_L.field_o;
          if (wd.field_b.width_field_r >= clipLeftX_var6 + clippedSpriteWidth_var8) {
            break L1;
          } else {
            clippedSpriteWidth_var8 = -clipLeftX_var6 + wd.field_b.width_field_r;
            break L1;
          }
        }
        L2: {
          if (clipTopY_var7 < 0) {
            clippedSpriteHeight_var9 = clippedSpriteHeight_var9 + clipTopY_var7;
            clipTopY_var7 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (clipTopY_var7 + clippedSpriteHeight_var9 <= wd.field_b.height_field_m) {
            break L3;
          } else {
            clippedSpriteHeight_var9 = wd.field_b.height_field_m - clipTopY_var7;
            break L3;
          }
        }
        L4: {
          framebufferIndex_var10 = wd.field_b.width_field_r * clipTopY_var7 + clipLeftX_var6;
          if (param0 == 30383) {
            break L4;
          } else {
            this.entityCategoryKey_field_C = -47;
            break L4;
          }
        }
        framebufferRowSkip_var11 = -clippedSpriteWidth_var8 + wd.field_b.width_field_r;
        backgroundPixels_var18 = wd.field_b.pixels_field_v;
        L5: while (true) {
          incrementValue$0 = clippedSpriteHeight_var9;
          clippedSpriteHeight_var9--;
          if (0 >= incrementValue$0) {
            return;
          } else {
            negativeColumnCounter_var13 = -clippedSpriteWidth_var8;
            L6: while (true) {
              if (0 <= negativeColumnCounter_var13) {
                framebufferIndex_var10 = framebufferIndex_var10 + framebufferRowSkip_var11;
                continue L5;
              } else {
                if ((this.entityId_field_H - -1 ^ -1) == (backgroundPixels_var18[framebufferIndex_var10] ^ -1)) {
                  backgroundPixels_var18[framebufferIndex_var10] = 0;
                  framebufferIndex_var10++;
                  negativeColumnCounter_var13++;
                  continue L6;
                } else {
                  framebufferIndex_var10++;
                  negativeColumnCounter_var13++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final void configureEntitySprite_a(int param0, int entityCategoryKey_param1, int spriteVariantIndex_param2, int param3) {
        if (param0 != 320) {
            this.spriteAngleRadians_field_u = -1.9950387477874756f;
        }
        if (!((this.field_z ^ -1) != -3)) {
            this.field_E = 60;
        }
        this.spriteVariantIndex_field_M = spriteVariantIndex_param2;
        this.field_z = param3;
        this.entityCategoryKey_field_C = entityCategoryKey_param1;
        this.selectEntitySprite_g((byte) 84);
    }

    final void initializeEntityMotion_a(int param0, float positionX_param1, int param2, float velocityX_param3, int spriteVariantIndex_param4, int lifetimeTicks_param5, float param6, float positionY_param7, float velocityY_param8, int entityCategoryKey_param9, float param10) {
        this.remainingLifetimeTicks_field_r = lifetimeTicks_param5;
        this.initialLifetimeTicks_field_p = lifetimeTicks_param5;
        this.positionX_field_o = positionX_param1;
        this.entityCategoryKey_field_C = entityCategoryKey_param9;
        this.positionY_field_v = positionY_param7;
        this.spriteVariantIndex_field_M = spriteVariantIndex_param4;
        this.velocityY_field_F = velocityY_param8;
        this.field_z = param2;
        this.velocityX_field_w = velocityX_param3;
        double velocityNormalizationScale_var12 = (double)og.field_r / Math.sqrt((double)(velocityX_param3 * velocityX_param3 + velocityY_param8 * velocityY_param8));
        this.velocityX_field_w = (float)((double)this.velocityX_field_w * velocityNormalizationScale_var12);
        this.velocityY_field_F = (float)((double)this.velocityY_field_F * velocityNormalizationScale_var12);
        int var14 = -96 / ((param0 - -19) / 53);
        this.spriteAngleRadians_field_u = 0.0f;
        this.sameCategoryEntityCount_field_N = 0;
        this.sameVariantEntityCount_field_m = 0;
        this.relatedEntityCount_field_L = 0;
        this.i(103);
    }

    final static void registerAudioStream_a(boolean param0, PcmSampleStream_kl param1) {
        try {
            qa.field_f.a(-74, new je(param1, param1));
            ge.field_d.a(param1);
            if (param0) {
                PcmSampleStream_kl var3 = (PcmSampleStream_kl) null;
                GameplayEntity_ja.registerAudioStream_a(false, (PcmSampleStream_kl) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ja.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawEntityAtPosition_e(int param0) {
        if (param0 != 1643839728) {
            this.entityId_field_H = -123;
        }
        if (this.field_z == 1) {
            vf.field_L.e();
            SoftwareRasterizer_vb.c();
            this.entitySprite_field_J.b(vf.field_L.field_s + -this.entitySprite_field_J.field_s >> -936547679, -this.entitySprite_field_J.field_o + vf.field_L.field_o >> 1499284289, this.interpolatedPaletteColor_field_q);
            oc.field_d.e();
            vf.field_L.rotateSmooth_a(vf.field_L.field_s << 286727555, vf.field_L.field_o << 1802933699, (int)this.positionX_field_o << 1890832772, (int)this.positionY_field_v << -1798453980, (int)((double)this.spriteAngleRadians_field_u / 6.283185307179586 * 65535.0), 4096);
        } else {
            oc.field_d.e();
            this.entitySprite_field_J.rotateSmooth_a(this.entitySprite_field_J.field_s << 110214051, this.entitySprite_field_J.field_o << 1713102179, (int)this.positionX_field_o << 1221916132, (int)this.positionY_field_v << 1904089668, (int)((double)this.spriteAngleRadians_field_u / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void l(int param0) {
        if (param0 != 1915952803) {
            GameplayEntity_ja var3 = (GameplayEntity_ja) null;
            this.removeRelatedEntity_a((GameplayEntity_ja) null, -128);
        }
        this.entitySprite_field_J.rotateSmooth_a(this.entitySprite_field_J.field_s << 1915952803, this.entitySprite_field_J.field_o << -752445533, (int)this.positionX_field_o << -1251278300, (int)this.positionY_field_v << 67106404, (int)((double)this.spriteAngleRadians_field_u / 6.283185307179586 * 65535.0), 4096);
    }

    GameplayEntity_ja(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        this.relatedEntities_field_n = new GameplayEntity_ja[6];
        this.interpolatedPaletteColor_field_q = 0;
        this.relatedEntityCount_field_L = 0;
        this.entityQueue_field_K = null;
        this.entityUpdateTick_field_I = 0;
        this.sameVariantEntityCount_field_m = 0;
        this.spriteAngleRadians_field_u = 0.0f;
        this.animationFrameIndex_field_G = 0;
        this.sameCategoryEntityCount_field_N = 0;
        this.positionY_field_v = param4;
        this.entityId_field_H = param9;
        this.velocityX_field_w = param5;
        this.spriteVariantIndex_field_M = param0;
        this.velocityY_field_F = param6;
        this.entityCategoryKey_field_C = param1;
        this.field_z = param2;
        this.positionX_field_o = param3;
        this.i(99);
    }

    static {
        field_A = new tf();
    }
}
