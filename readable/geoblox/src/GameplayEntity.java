/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameplayEntity extends DualLinkNode {
    int entityCategoryKey;
    private int interpolatedPaletteColor;
    private int paletteGreenDelta;
    GameplayEntity[] relatedEntities;
    float positionX;
    boolean detachedFromBoard;
    int relatedEntityCount;
    float spriteAngleRadians;
    int remainingLifetimeTicks;
    IntrusiveDeque entityQueue;
    int entityId;
    private int paletteRedDelta;
    int spriteVariantIndex;
    int initialLifetimeTicks;
    private int entityUpdateTick;
    int entitySpriteKindId;
    boolean touchesAvatar;
    int sameVariantEntityCount;
    int matchCooldownTicks;
    static IntrusiveDeque field_A;
    Sprite entitySprite;
    int animationFrameIndex;
    float velocityY;
    float positionY;
    private int paletteBlueDelta;
    static d field_D;
    float velocityX;
    int sameCategoryEntityCount;

    final void drawBoardRotatedEntity(int param0) {
        float entityOffsetX;
        float entityOffsetY;
        int rotatedEntityX;
        int rotatedEntityY;
        int var6;
        var6 = Geoblox.field_C;
        entityOffsetX = this.positionX - 320.0f;
        entityOffsetY = this.positionY - 240.0f;
        rotatedEntityX = (int)((double)entityOffsetX * Math.cos((double)el.gameplaySession.boardAngleRadians) - (double)entityOffsetY * Math.sin((double)el.gameplaySession.boardAngleRadians) + 320.0);
        if (param0 == -16096) {
          L0: {
            rotatedEntityY = (int)(Math.sin((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX + (double)entityOffsetY * Math.cos((double)el.gameplaySession.boardAngleRadians) + 240.0);
            if (this.entitySpriteKindId != 2) {
              if (1 != this.entitySpriteKindId) {
                vf.spriteScratchRaster.e();
                SoftwareRasterizer.c();
                this.entitySprite.c(-this.entitySprite.field_s + vf.spriteScratchRaster.field_s >> 1, vf.spriteScratchRaster.field_o + -this.entitySprite.field_o >> 1);
                k.a(0, 0, vf.spriteScratchRaster.field_s, -27085, vf.spriteScratchRaster.field_o);
                sh.field_y.a(param0 + 16351);
                vf.spriteScratchRaster.rotateSmooth(vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, rotatedEntityX << 4, rotatedEntityY << 4, (int)(65535.0 * ((double)(-el.gameplaySession.boardAngleRadians + this.spriteAngleRadians) / 6.283185307179586)), 4096);
                break L0;
              }
            }
            if (1 == this.entitySpriteKindId) {
              vf.spriteScratchRaster.e();
              SoftwareRasterizer.c();
              this.entitySprite.b(-this.entitySprite.field_s + vf.spriteScratchRaster.field_s >> 1, vf.spriteScratchRaster.field_o - this.entitySprite.field_o >> 1, this.interpolatedPaletteColor);
              k.a(0, 0, vf.spriteScratchRaster.field_s, -27085, vf.spriteScratchRaster.field_o);
              sh.field_y.a(param0 + 16351);
              vf.spriteScratchRaster.rotateSmooth(vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, rotatedEntityX << 4, rotatedEntityY << 4, (int)(65535.0 * ((double)(-el.gameplaySession.boardAngleRadians + this.spriteAngleRadians) / 6.283185307179586)), 4096);
            } else {
              this.entitySprite.b(-(this.entitySprite.field_s >> 1) + rotatedEntityX, rotatedEntityY + -(this.entitySprite.field_o >> 1));
            }
          }
          return;
        } else {
          return;
        }
    }

    final void drawEntityIdOnBoardMask(int param0) {
        vf.spriteScratchRaster.e();
        SoftwareRasterizer.c();
        this.entitySprite.rotateSmooth(this.entitySprite.field_s << 3, this.entitySprite.field_o << 3, vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)(65535.0 * ((double)this.spriteAngleRadians / 6.283185307179586)), 4096);
        bk.boardOwnershipRaster.e();
        vf.spriteScratchRaster.a(-(vf.spriteScratchRaster.field_s / 2) + (int)this.positionX, (int)this.positionY + -(vf.spriteScratchRaster.field_o / param0), this.entityId - -1);
        sh.field_y.a(255);
        bk.boardOwnershipRaster.e();
        i.avatarMaskRaster.a(320 + el.gameplaySession.boardMaskOffsetX, 240 - -el.gameplaySession.boardMaskOffsetY, 16777215);
        sh.field_y.a(param0 + 253);
    }

    final void drawFadingEntity(int param0) {
        float entityOffsetX;
        float entityOffsetY;
        float boardAngle;
        int rotatedEntityX;
        int rotatedEntityY;
        int sentinelDivisionGuard;
        int entityDrawX;
        int entityDrawY;
        int fadeOpacity;
        int controlFlowGuard;
        L0: {
          controlFlowGuard = Geoblox.field_C;
          entityOffsetX = this.positionX - 320.0f;
          entityOffsetY = this.positionY - 240.0f;
          boardAngle = el.gameplaySession.boardAngleRadians;
          rotatedEntityX = (int)(320.0 + ((double)entityOffsetX * Math.cos((double)boardAngle) - Math.sin((double)boardAngle) * (double)entityOffsetY));
          rotatedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)boardAngle) + Math.cos((double)boardAngle) * (double)entityOffsetY));
          if (this.entitySpriteKindId != 1) {
            if (2 != this.entitySpriteKindId) {
              vf.spriteScratchRaster.e();
              SoftwareRasterizer.c();
              this.entitySprite.rotateSmooth(this.entitySprite.field_s << 3, this.entitySprite.field_o << 3, vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)(((double)this.spriteAngleRadians - (double)boardAngle / 6.283185307179586) * 65535.0), 4096);
              break L0;
            }
          }
          if (this.entitySpriteKindId != 1) {
            vf.spriteScratchRaster.e();
            SoftwareRasterizer.c();
            this.entitySprite.b(-(this.entitySprite.field_s >> 1) + (vf.spriteScratchRaster.field_s >> 1), (vf.spriteScratchRaster.field_o >> 1) - (this.entitySprite.field_o >> 1));
          } else {
            wl.field_a.e();
            SoftwareRasterizer.c();
            this.entitySprite.b(-this.entitySprite.field_s + wl.field_a.field_s >> 1, -this.entitySprite.field_o + wl.field_a.field_o >> 1, this.interpolatedPaletteColor);
            vf.spriteScratchRaster.e();
            SoftwareRasterizer.c();
            wl.field_a.rotateSmooth(wl.field_a.field_s << 3, wl.field_a.field_o << 3, vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)(65535.0 * (-((double)boardAngle / 6.283185307179586) + (double)this.spriteAngleRadians)), 4096);
          }
        }
        sentinelDivisionGuard = 2 % ((-23 - param0) / 60);
        sh.field_y.a(255);
        entityDrawX = rotatedEntityX + -(vf.spriteScratchRaster.field_s >> 1);
        entityDrawY = rotatedEntityY - (vf.spriteScratchRaster.field_o >> 1);
        fadeOpacity = (int)(0.5 + Math.sin((double)(this.remainingLifetimeTicks + -this.initialLifetimeTicks + this.initialLifetimeTicks >> 4)) * (double)(100 * (this.initialLifetimeTicks - this.remainingLifetimeTicks)) / (double)this.initialLifetimeTicks) - (-(100 * (this.initialLifetimeTicks - this.remainingLifetimeTicks) / this.initialLifetimeTicks) - 56);
        if (fadeOpacity > 256) {
          fadeOpacity = 256;
        } else {
          if (fadeOpacity < 0) {
            fadeOpacity = 0;
          }
        }
        vf.spriteScratchRaster.d(entityDrawX, entityDrawY, fadeOpacity);
    }

    final static void h(int param0) {
        af.avatarFrameStepTicks = 0;
        ul.field_a = null;
        gg.field_b = 0;
        g.field_j = 0;
        pa.avatarFeedbackHoldTicks = 0;
        jf.avatarTintFadeTicks = 0;
        uf.avatarFeedbackFrameIndex = param0;
        ha.avatarShockFrameIndex = 0;
        rj.avatarTintColor = 5167632;
        MenuScreen.avatarFeedbackFrameBase = 0;
        gi.avatarBlinkClockTicks = 0;
        nd.avatarFeedbackModeId = 0;
        wa.avatarShockEffectTicks = 0;
    }

    public static void e(byte param0) {
        field_A = null;
        field_D = null;
        int var1 = 106 % ((33 - param0) / 39);
    }

    private final void updatePaletteChannelDeltas(int param0) {
        int var2 = -121 % ((-63 - param0) / 39);
        this.paletteRedDelta = -(jg.field_h[GameScreen.selectedThemeId][this.animationFrameIndex] >> 16 & 255) + (255 & jg.field_h[GameScreen.selectedThemeId][(this.animationFrameIndex + 1) % 7] >> 16);
        this.paletteGreenDelta = -(jg.field_h[GameScreen.selectedThemeId][this.animationFrameIndex] >> 8 & 255) + ((jg.field_h[GameScreen.selectedThemeId][(1 + this.animationFrameIndex) % 7] & 65448) >> 8);
        this.paletteBlueDelta = -(jg.field_h[GameScreen.selectedThemeId][this.animationFrameIndex] & 255) + (jg.field_h[GameScreen.selectedThemeId][(1 + this.animationFrameIndex) % 7] & 255);
    }

    final void eraseEntityPixels(int param0) {
        int incrementValue$0 = 0;
        int clipLeftX;
        int clipTopY;
        int clippedWidth;
        int clippedHeight;
        int framebufferIndex;
        int rowSkip;
        int negativeColumnCounter;
        int controlFlowGuard;
        int[] framebufferPixels;
        controlFlowGuard = Geoblox.field_C;
        clipLeftX = (int)this.positionX - ((vf.spriteScratchRaster.field_s >> 1) - -4);
        clipTopY = -4 + -(vf.spriteScratchRaster.field_o >> 1) + (int)this.positionY;
        clippedWidth = 8 + vf.spriteScratchRaster.field_s;
        clippedHeight = 8 + vf.spriteScratchRaster.field_o;
        if (clipLeftX < 0) {
          clippedWidth = clippedWidth + clipLeftX;
          clipLeftX = 0;
        }
        if (clipTopY < 0) {
          clippedHeight = clippedHeight + clipTopY;
          clipTopY = 0;
        }
        if (bk.boardOwnershipRaster.width < clippedWidth + clipLeftX) {
          clippedWidth = -clipLeftX + bk.boardOwnershipRaster.width;
        }
        if (clippedHeight + clipTopY > bk.boardOwnershipRaster.height) {
          clippedHeight = bk.boardOwnershipRaster.height - clipTopY;
        }
        if (param0 >= 78) {
          framebufferIndex = clipLeftX + bk.boardOwnershipRaster.width * clipTopY;
          rowSkip = -clippedWidth + bk.boardOwnershipRaster.width;
          framebufferPixels = bk.boardOwnershipRaster.pixels;
          L4: while (true) {
            incrementValue$0 = clippedHeight;
            clippedHeight--;
            if (incrementValue$0 <= 0) {
              return;
            } else {
              negativeColumnCounter = -clippedWidth;
              L5: while (true) {
                if (negativeColumnCounter >= 0) {
                  framebufferIndex = framebufferIndex + rowSkip;
                  continue L4;
                } else {
                  if (~framebufferPixels[framebufferIndex] == ~(this.entityId - -1)) {
                    framebufferPixels[framebufferIndex] = 0;
                    framebufferIndex++;
                    negativeColumnCounter++;
                    continue L5;
                  } else {
                    framebufferIndex++;
                    negativeColumnCounter++;
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

    final void rotateEntityAroundBoard(float rotationDeltaRadians, int param1) {
        double velocityNormalizationScale = 0.0;
        if (param1 > -79) {
            this.rotateEntityAroundBoard(0.2609390318393707f, 75);
        }
        float positionOffsetX = this.positionX - 320.0f;
        float positionOffsetY = this.positionY - 240.0f;
        this.positionX = (float)((double)positionOffsetX * Math.cos((double)rotationDeltaRadians) - Math.sin((double)rotationDeltaRadians) * (double)positionOffsetY) + 320.0f;
        this.positionY = (float)(Math.sin((double)rotationDeltaRadians) * (double)positionOffsetX + (double)positionOffsetY * Math.cos((double)rotationDeltaRadians)) + 240.0f;
        this.velocityY = 240.0f - this.positionY;
        this.velocityX = 320.0f - this.positionX;
        if (this.velocityX * this.velocityX + this.velocityY * this.velocityY > og.entityMotionSpeed * og.entityMotionSpeed) {
            velocityNormalizationScale = (double)og.entityMotionSpeed / Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
            this.velocityX = (float)((double)this.velocityX * velocityNormalizationScale);
            this.velocityY = (float)((double)this.velocityY * velocityNormalizationScale);
        }
        if (!(this.entitySpriteKindId == 2)) {
            this.spriteAngleRadians = this.spriteAngleRadians - rotationDeltaRadians;
        }
    }

    private final void selectEntitySprite(byte param0) {
        int var3;
        var3 = Geoblox.field_C;
        if (param0 < 83) {
          this.drawBoardRotatedEntity(18);
        }
        if (0 == this.entitySpriteKindId) {
          this.entitySprite = ke.field_a[GameScreen.selectedThemeId][this.entityCategoryKey][this.spriteVariantIndex];
        } else {
          if (this.entitySpriteKindId == 4) {
            this.spriteVariantIndex = -1;
            this.entitySprite = fc.field_g[0];
            this.entityCategoryKey = -1;
          } else {
            if (this.entitySpriteKindId == 3) {
              this.entityCategoryKey = -1;
              this.spriteVariantIndex = -1;
              this.entitySprite = hb.field_d[0];
            } else {
              if (1 == this.entitySpriteKindId) {
                this.entitySprite = s.field_G[GameScreen.selectedThemeId][this.entityCategoryKey];
                this.spriteVariantIndex = -1;
                this.interpolatedPaletteColor = jg.field_h[GameScreen.selectedThemeId][this.animationFrameIndex];
                this.updatePaletteChannelDeltas(53);
              } else {
                if (2 != this.entitySpriteKindId) {
                  if (8 == this.entitySpriteKindId) {
                    this.entitySprite = ej.field_a[this.animationFrameIndex];
                    this.entityCategoryKey = -1;
                  }
                } else {
                  this.entitySprite = MenuScreen.field_m[GameScreen.selectedThemeId][this.spriteVariantIndex][this.animationFrameIndex];
                  this.entityCategoryKey = -1;
                }
              }
            }
          }
        }
    }

    final void drawEntityIdOnPointerMask(byte param0) {
        vf.spriteScratchRaster.e();
        SoftwareRasterizer.c();
        this.entitySprite.rotateSmooth(this.entitySprite.field_s << 3, this.entitySprite.field_o << 3, vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)((double)(this.spriteAngleRadians - el.gameplaySession.boardAngleRadians) / 6.283185307179586 * 65535.0), 4096);
        if (param0 <= 46) {
            this.paletteBlueDelta = 17;
        }
        vf.spriteScratchRaster.g(this.entityId - -1);
        SecondaryDeque.contactProbeRaster.e();
        vf.spriteScratchRaster.a(-SecondaryDeque.contactProbeOffsetX + -(vf.spriteScratchRaster.field_s >> 1) + ng.field_G, -(vf.spriteScratchRaster.field_o >> 1) + (td.field_E + -SecondaryDeque.contactProbeOffsetY), 1 + this.entityId);
        sh.field_y.a(255);
    }

    final void integrateEntityVelocity(byte param0) {
        this.positionX = this.positionX + this.velocityX;
        this.positionY = this.positionY + this.velocityY;
        if (param0 != -59) {
            this.sameVariantEntityCount = -29;
        }
    }

    private final void resetEntityAnimation(int param0) {
        this.entityQueue = null;
        this.entityUpdateTick = 0;
        this.touchesAvatar = false;
        this.animationFrameIndex = 0;
        this.selectEntitySprite((byte) 99);
        this.detachedFromBoard = false;
        this.matchCooldownTicks = 0;
        int var2 = 62 % ((param0 - 67) / 32);
    }

    final static int alignBitOffset(int param0, int bitOffset) {
        int paddingToByteBoundary = 0;
        if (!((bitOffset & 7) == 0)) {
            paddingToByteBoundary = -(bitOffset & 7) + 8;
        }
        if (param0 != 1221916132) {
            return 89;
        }
        int byteAlignedBitOffset = paddingToByteBoundary + bitOffset;
        return byteAlignedBitOffset;
    }

    final void advanceEntityAnimation(boolean param0) {
        int kind2AnimationFrame = 0;
        int kind8AnimationFrame = 0;
        int kind5AnimationFrame = 0;
        int kind6AnimationFrame = 0;
        int kind3AnimationFrame = 0;
        int kind7AnimationFrame = 0;
        int kind4AnimationFrame = 0;
        float paletteBlendFraction;
        int var3;
        var3 = Geoblox.field_C;
        this.entityUpdateTick = this.entityUpdateTick + 1;
        this.remainingLifetimeTicks = this.remainingLifetimeTicks - 1;
        if (!param0) {
          this.positionY = -0.09870309382677078f;
        }
        if (this.entitySpriteKindId != 5) {
          if (this.entitySpriteKindId != 1) {
            if (this.entitySpriteKindId == 2) {
              if (this.entityUpdateTick % 24 == 0) {
                kind2AnimationFrame = this.animationFrameIndex;
                this.animationFrameIndex = this.animationFrameIndex + 1;
                this.entitySprite = MenuScreen.field_m[GameScreen.selectedThemeId][this.spriteVariantIndex][kind2AnimationFrame];
                this.animationFrameIndex = this.animationFrameIndex % 4;
              }
            } else {
              if (8 == this.entitySpriteKindId) {
                if (this.entityUpdateTick % 24 == 0) {
                  kind8AnimationFrame = this.animationFrameIndex;
                  this.animationFrameIndex = this.animationFrameIndex + 1;
                  this.entitySprite = ej.field_a[kind8AnimationFrame];
                  this.animationFrameIndex = this.animationFrameIndex % 4;
                }
              }
            }
          } else {
            paletteBlendFraction = 0.019999999552965164f * (float)(this.entityUpdateTick % 50);
            this.interpolatedPaletteColor = (int)((float)this.paletteBlueDelta * paletteBlendFraction) + jg.field_h[GameScreen.selectedThemeId][this.animationFrameIndex] + (((int)(paletteBlendFraction * (float)this.paletteRedDelta) << 16) + ((int)((float)this.paletteGreenDelta * paletteBlendFraction) << 8));
            if (this.entityUpdateTick % 50 == 49) {
              this.animationFrameIndex = this.animationFrameIndex + 1;
              this.animationFrameIndex = this.animationFrameIndex % 7;
              this.updatePaletteChannelDeltas(-107);
            }
          }
        } else {
          if (this.entityUpdateTick % 20 == 0) {
            kind5AnimationFrame = this.animationFrameIndex;
            this.animationFrameIndex = this.animationFrameIndex + 1;
            this.entitySprite = mi.field_B[kind5AnimationFrame];
            this.animationFrameIndex = this.animationFrameIndex % 4;
          }
        }
        if (this.entitySpriteKindId != 4) {
          if (7 != this.entitySpriteKindId) {
            if (this.entitySpriteKindId != 3) {
              if (this.entitySpriteKindId == 6) {
                this.remainingLifetimeTicks = this.remainingLifetimeTicks - 1;
                if (this.remainingLifetimeTicks < 0) {
                  if (this.entityUpdateTick % 24 == 0) {
                    if (4 > this.animationFrameIndex) {
                      kind6AnimationFrame = this.animationFrameIndex;
                      this.animationFrameIndex = this.animationFrameIndex + 1;
                      this.entitySprite = vj.field_a[kind6AnimationFrame];
                    }
                  }
                }
              }
            } else {
              if ((this.entityUpdateTick & 255) >= 49) {
                this.animationFrameIndex = 0;
              } else {
                if ((this.entityUpdateTick & 15) == 0) {
                  kind3AnimationFrame = this.animationFrameIndex;
                  this.animationFrameIndex = this.animationFrameIndex + 1;
                  this.entitySprite = hb.field_d[kind3AnimationFrame];
                  if (this.animationFrameIndex == 4) {
                    this.animationFrameIndex = 0;
                  }
                }
              }
            }
          } else {
            if (this.entityUpdateTick % 20 == 0) {
              kind7AnimationFrame = this.animationFrameIndex;
              this.animationFrameIndex = this.animationFrameIndex + 1;
              this.entitySprite = hg.field_b[kind7AnimationFrame];
              this.animationFrameIndex = this.animationFrameIndex % 4;
            }
          }
        } else {
          if ((255 & this.entityUpdateTick) < 49) {
            if ((15 & this.entityUpdateTick) == 0) {
              kind4AnimationFrame = this.animationFrameIndex;
              this.animationFrameIndex = this.animationFrameIndex + 1;
              this.entitySprite = fc.field_g[kind4AnimationFrame];
              if (this.animationFrameIndex == 4) {
                this.animationFrameIndex = 0;
              }
            }
          } else {
            this.animationFrameIndex = 0;
          }
        }
    }

    final void removeRelatedEntity(GameplayEntity relatedEntity, int startingChildIndex) {
        int relatedEntitySearchIndex = 0;
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
            L1: for (relatedEntitySearchIndex = startingChildIndex; relatedEntitySearchIndex < this.relatedEntityCount; relatedEntitySearchIndex++) {
              if (this.relatedEntities[relatedEntitySearchIndex] == relatedEntity) {
                this.relatedEntities[relatedEntitySearchIndex] = null;
                if (this.spriteVariantIndex == relatedEntity.spriteVariantIndex) {
                  this.sameVariantEntityCount = this.sameVariantEntityCount - 1;
                }
                this.relatedEntityCount = this.relatedEntityCount - 1;
                if (relatedEntity.entityCategoryKey == this.entityCategoryKey) {
                  this.sameCategoryEntityCount = this.sameCategoryEntityCount - 1;
                }
                if (5 > relatedEntitySearchIndex) {
                  sf.a(this.relatedEntities, 1 + relatedEntitySearchIndex, this.relatedEntities, relatedEntitySearchIndex, this.relatedEntityCount + -relatedEntitySearchIndex);
                }
                this.relatedEntities[this.relatedEntityCount] = null;
              } else {
                continue L1;
              }
              break;
            }
            if (this.sameVariantEntityCount <= this.relatedEntityCount) {
              if (this.relatedEntityCount >= this.sameCategoryEntityCount) {
                break L0;
              }
            }
            throw new IllegalStateException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = (RuntimeException) (var3);

          stackIn_23_1 = new StringBuilder().append("ja.HA(");

          if (relatedEntity == null) {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(startingChildIndex).append(')').toString());
        }
    }

    final void eraseEntityTrail(int param0) {
        int incrementValue$0 = 0;
        float entityOffsetX;
        float entityOffsetY;
        int rotatedEntityX;
        int rotatedEntityY;
        int clipLeftX;
        int clipTopY;
        int clippedSpriteWidth;
        int clippedSpriteHeight;
        int framebufferIndex;
        int framebufferRowSkip;
        int negativeColumnCounter;
        int var14;
        int[] backgroundPixels;
        var14 = Geoblox.field_C;
        entityOffsetX = -320.0f + this.positionX;
        entityOffsetY = -240.0f + this.positionY;
        rotatedEntityX = (int)(Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetX - (double)entityOffsetY * Math.sin((double)el.gameplaySession.boardAngleRadians) + 320.0);
        rotatedEntityY = (int)((double)entityOffsetX * Math.sin((double)el.gameplaySession.boardAngleRadians) + Math.cos((double)el.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 240.0);
        clipLeftX = -(vf.spriteScratchRaster.field_s / 2) + (rotatedEntityX - 4 + -SecondaryDeque.contactProbeOffsetX);
        clipTopY = -SecondaryDeque.contactProbeOffsetY + -4 + (rotatedEntityY - vf.spriteScratchRaster.field_o / 2);
        clippedSpriteWidth = vf.spriteScratchRaster.field_s - -8;
        if (clipLeftX < 0) {
          clippedSpriteWidth = clippedSpriteWidth + clipLeftX;
          clipLeftX = 0;
        }
        clippedSpriteHeight = 8 + vf.spriteScratchRaster.field_o;
        if (SecondaryDeque.contactProbeRaster.width < clipLeftX + clippedSpriteWidth) {
          clippedSpriteWidth = -clipLeftX + SecondaryDeque.contactProbeRaster.width;
        }
        if (clipTopY < 0) {
          clippedSpriteHeight = clippedSpriteHeight + clipTopY;
          clipTopY = 0;
        }
        if (clipTopY + clippedSpriteHeight > SecondaryDeque.contactProbeRaster.height) {
          clippedSpriteHeight = SecondaryDeque.contactProbeRaster.height - clipTopY;
        }
        framebufferIndex = SecondaryDeque.contactProbeRaster.width * clipTopY + clipLeftX;
        if (param0 != 30383) {
          this.entityCategoryKey = -47;
        }
        framebufferRowSkip = -clippedSpriteWidth + SecondaryDeque.contactProbeRaster.width;
        backgroundPixels = SecondaryDeque.contactProbeRaster.pixels;
        L5: while (true) {
          incrementValue$0 = clippedSpriteHeight;
          clippedSpriteHeight--;
          if (0 >= incrementValue$0) {
            return;
          } else {
            negativeColumnCounter = -clippedSpriteWidth;
            L6: while (true) {
              if (0 <= negativeColumnCounter) {
                framebufferIndex = framebufferIndex + framebufferRowSkip;
                continue L5;
              } else {
                if (~(this.entityId - -1) == ~backgroundPixels[framebufferIndex]) {
                  backgroundPixels[framebufferIndex] = 0;
                  framebufferIndex++;
                  negativeColumnCounter++;
                  continue L6;
                } else {
                  framebufferIndex++;
                  negativeColumnCounter++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    final void configureEntitySprite(int methodGuard, int entityCategoryKey, int spriteVariantIndex, int entitySpriteKindId) {
        if (methodGuard != 320) {
            this.spriteAngleRadians = -1.9950387477874756f;
        }
        if (!(this.entitySpriteKindId != 2)) {
            this.matchCooldownTicks = 60;
        }
        this.spriteVariantIndex = spriteVariantIndex;
        this.entitySpriteKindId = entitySpriteKindId;
        this.entityCategoryKey = entityCategoryKey;
        this.selectEntitySprite((byte) 84);
    }

    final void initializeEntityMotion(int param0, float positionX, int param2, float velocityX, int spriteVariantIndex, int lifetimeTicks, float param6, float positionY, float velocityY, int entityCategoryKey, float param10) {
        this.remainingLifetimeTicks = lifetimeTicks;
        this.initialLifetimeTicks = lifetimeTicks;
        this.positionX = positionX;
        this.entityCategoryKey = entityCategoryKey;
        this.positionY = positionY;
        this.spriteVariantIndex = spriteVariantIndex;
        this.velocityY = velocityY;
        this.entitySpriteKindId = param2;
        this.velocityX = velocityX;
        double velocityNormalizationScale = (double)og.entityMotionSpeed / Math.sqrt((double)(velocityX * velocityX + velocityY * velocityY));
        this.velocityX = (float)((double)this.velocityX * velocityNormalizationScale);
        this.velocityY = (float)((double)this.velocityY * velocityNormalizationScale);
        int var14 = -96 / ((param0 - -19) / 53);
        this.spriteAngleRadians = 0.0f;
        this.sameCategoryEntityCount = 0;
        this.sameVariantEntityCount = 0;
        this.relatedEntityCount = 0;
        this.resetEntityAnimation(103);
    }

    final static void registerAudioStream(boolean param0, PcmSampleStream param1) {
        try {
            qa.field_f.addLast(-74, new je(param1, param1));
            ge.field_d.a(param1);
            if (param0) {
                PcmSampleStream var3 = (PcmSampleStream) null;
                GameplayEntity.registerAudioStream(false, (PcmSampleStream) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ja.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawEntityAtPosition(int param0) {
        if (param0 != 1643839728) {
            this.entityId = -123;
        }
        if (this.entitySpriteKindId == 1) {
            vf.spriteScratchRaster.e();
            SoftwareRasterizer.c();
            this.entitySprite.b(vf.spriteScratchRaster.field_s + -this.entitySprite.field_s >> 1, -this.entitySprite.field_o + vf.spriteScratchRaster.field_o >> 1, this.interpolatedPaletteColor);
            oc.boardSceneRaster.e();
            vf.spriteScratchRaster.rotateSmooth(vf.spriteScratchRaster.field_s << 3, vf.spriteScratchRaster.field_o << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
        } else {
            oc.boardSceneRaster.e();
            this.entitySprite.rotateSmooth(this.entitySprite.field_s << 3, this.entitySprite.field_o << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void drawRotatedEntityOnCurrentRaster(int param0) {
        if (param0 != 1915952803) {
            GameplayEntity var3 = (GameplayEntity) null;
            this.removeRelatedEntity((GameplayEntity) null, -128);
        }
        this.entitySprite.rotateSmooth(this.entitySprite.field_s << 3, this.entitySprite.field_o << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
    }

    GameplayEntity(int param0, int param1, int param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
        this.relatedEntities = new GameplayEntity[6];
        this.interpolatedPaletteColor = 0;
        this.relatedEntityCount = 0;
        this.entityQueue = null;
        this.entityUpdateTick = 0;
        this.sameVariantEntityCount = 0;
        this.spriteAngleRadians = 0.0f;
        this.animationFrameIndex = 0;
        this.sameCategoryEntityCount = 0;
        this.positionY = param4;
        this.entityId = param9;
        this.velocityX = param5;
        this.spriteVariantIndex = param0;
        this.velocityY = param6;
        this.entityCategoryKey = param1;
        this.entitySpriteKindId = param2;
        this.positionX = param3;
        this.resetEntityAnimation(99);
    }

    static {
        field_A = new IntrusiveDeque();
    }
}
