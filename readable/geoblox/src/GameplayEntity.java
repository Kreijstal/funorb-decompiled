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
    static IntrusiveDeque pendingAchievementSubmissions;
    Sprite entitySprite;
    int animationFrameIndex;
    float velocityY;
    float positionY;
    private int paletteBlueDelta;
    static PlatformTaskDispatcher sessionTaskDispatcher;
    float velocityX;
    int sameCategoryEntityCount;

    final void drawBoardRotatedEntity(int methodGuard) {
        float entityOffsetX;
        float entityOffsetY;
        int rotatedEntityX;
        int rotatedEntityY;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        entityOffsetX = this.positionX - 320.0f;
        entityOffsetY = this.positionY - 240.0f;
        rotatedEntityX = (int)((double)entityOffsetX * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) - (double)entityOffsetY * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + 320.0);
        if (methodGuard != -16096) {
          return;
        }
        rotatedEntityY = (int)(Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetX + (double)entityOffsetY * Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) + 240.0);
        if ((this.entitySpriteKindId != 2) &&
            (1 != this.entitySpriteKindId)) {
          HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          this.entitySprite.drawUnmasked(-this.entitySprite.fullWidth + HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight - this.entitySprite.fullHeight >> 1);
          NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
          SingleChildWidget.mainRasterBuffer.setAsRasterTarget(methodGuard + 16351);
          HotspotTextWidget.spriteScratchRaster.rotateSmooth(HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, rotatedEntityX << 4, rotatedEntityY << 4, (int)(65535.0 * ((double)(-UiWidget.gameplaySession.boardAngleRadians + this.spriteAngleRadians) / 6.283185307179586)), 4096);
        } else {
          if (1 == this.entitySpriteKindId) {
            HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            this.entitySprite.drawGrayModulated(-this.entitySprite.fullWidth + HotspotTextWidget.spriteScratchRaster.fullWidth >> 1, HotspotTextWidget.spriteScratchRaster.fullHeight - this.entitySprite.fullHeight >> 1, this.interpolatedPaletteColor);
            NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, HotspotTextWidget.spriteScratchRaster.fullWidth, -27085, HotspotTextWidget.spriteScratchRaster.fullHeight);
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(methodGuard + 16351);
            HotspotTextWidget.spriteScratchRaster.rotateSmooth(HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, rotatedEntityX << 4, rotatedEntityY << 4, (int)(65535.0 * ((double)(-UiWidget.gameplaySession.boardAngleRadians + this.spriteAngleRadians) / 6.283185307179586)), 4096);
          } else {
            this.entitySprite.draw(-(this.entitySprite.fullWidth >> 1) + rotatedEntityX, rotatedEntityY - (this.entitySprite.fullHeight >> 1));
          }
        }
    }

    final void drawEntityIdOnBoardMask(int verticalDivisor) {
        HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        this.entitySprite.rotateSmooth(this.entitySprite.fullWidth << 3, this.entitySprite.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * ((double)this.spriteAngleRadians / 6.283185307179586)), 4096);
        LogoPreparationSupport.boardOwnershipRaster.setAsRasterTarget();
        HotspotTextWidget.spriteScratchRaster.drawSilhouette(-(HotspotTextWidget.spriteScratchRaster.fullWidth / 2) + (int)this.positionX, (int)this.positionY - HotspotTextWidget.spriteScratchRaster.fullHeight / verticalDivisor, this.entityId + 1);
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        LogoPreparationSupport.boardOwnershipRaster.setAsRasterTarget();
        MeshDepthSupport.avatarMaskRaster.drawSilhouette(320 + UiWidget.gameplaySession.boardMaskOffsetX, 240 + UiWidget.gameplaySession.boardMaskOffsetY, 16777215);
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(verticalDivisor + 253);
    }

    final void drawFadingEntity(int methodGuard) {
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
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        entityOffsetX = this.positionX - 320.0f;
        entityOffsetY = this.positionY - 240.0f;
        boardAngle = UiWidget.gameplaySession.boardAngleRadians;
        rotatedEntityX = (int)(320.0 + ((double)entityOffsetX * Math.cos((double)boardAngle) - Math.sin((double)boardAngle) * (double)entityOffsetY));
        rotatedEntityY = (int)(240.0 + ((double)entityOffsetX * Math.sin((double)boardAngle) + Math.cos((double)boardAngle) * (double)entityOffsetY));
        if ((this.entitySpriteKindId != 1) &&
            (2 != this.entitySpriteKindId)) {
          HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
          SoftwareRasterizer.clearFramebuffer();
          this.entitySprite.rotateSmooth(this.entitySprite.fullWidth << 3, this.entitySprite.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)(((double)this.spriteAngleRadians - (double)boardAngle / 6.283185307179586) * 65535.0), 4096);
        } else {
          if (this.entitySpriteKindId != 1) {
            HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            this.entitySprite.draw(-(this.entitySprite.fullWidth >> 1) + (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1), (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) - (this.entitySprite.fullHeight >> 1));
          } else {
            KeyboardInputListener.field_a.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            this.entitySprite.drawGrayModulated(-this.entitySprite.fullWidth + KeyboardInputListener.field_a.fullWidth >> 1, -this.entitySprite.fullHeight + KeyboardInputListener.field_a.fullHeight >> 1, this.interpolatedPaletteColor);
            HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            KeyboardInputListener.field_a.rotateSmooth(KeyboardInputListener.field_a.fullWidth << 3, KeyboardInputListener.field_a.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)(65535.0 * (-((double)boardAngle / 6.283185307179586) + (double)this.spriteAngleRadians)), 4096);
          }
        }
        sentinelDivisionGuard = 2 % ((-23 - methodGuard) / 60);
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
        entityDrawX = rotatedEntityX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1);
        entityDrawY = rotatedEntityY - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1);
        fadeOpacity = (int)(0.5 + Math.sin((double)(this.remainingLifetimeTicks - this.initialLifetimeTicks + this.initialLifetimeTicks >> 4)) * (double)(100 * (this.initialLifetimeTicks - this.remainingLifetimeTicks)) / (double)this.initialLifetimeTicks) - (-(100 * (this.initialLifetimeTicks - this.remainingLifetimeTicks) / this.initialLifetimeTicks) - 56);
        if (fadeOpacity > 256) {
          fadeOpacity = 256;
        } else {
          if (fadeOpacity < 0) {
            fadeOpacity = 0;
          }
        }
        HotspotTextWidget.spriteScratchRaster.drawAlpha(entityDrawX, entityDrawY, fadeOpacity);
    }

    final static void resetAvatarFeedbackState(int initialFrameIndex) {
        CacheFileState.avatarFrameStepTicks = 0;
        MatchCandidateSupport.currentAvatarCryFrame = null;
        NameCharacterSupport.avatarCryPhase = 0;
        PasswordValidator.avatarCryFrameCursor = 0;
        LimitedRandomAccessFile.avatarFeedbackHoldTicks = 0;
        MultiHandleSliderRenderer.avatarTintFadeTicks = 0;
        DiskCacheWorker.avatarFeedbackFrameIndex = initialFrameIndex;
        IndexedSpriteState.avatarShockFrameIndex = 0;
        DisplayModeInfo.avatarTintColor = 5167632;
        MenuScreen.avatarFeedbackFrameBase = 0;
        IterableNodeHashTable.avatarBlinkClockTicks = 0;
        TextValidationFailure.avatarFeedbackModeId = 0;
        WidgetTheme.avatarShockEffectTicks = 0;
    }

    public static void e(byte param0) {
        pendingAchievementSubmissions = null;
        sessionTaskDispatcher = null;
        int var1 = 106 % ((33 - param0) / 39);
    }

    private final void updatePaletteChannelDeltas(int methodGuard) {
        int sentinelDivisionGuard = -121 % ((-63 - methodGuard) / 39);
        this.paletteRedDelta = -(SocketConnector.themeCycleColors[GameScreen.selectedThemeId][this.animationFrameIndex] >> 16 & 255) + (255 & SocketConnector.themeCycleColors[GameScreen.selectedThemeId][(this.animationFrameIndex + 1) % 7] >> 16);
        this.paletteGreenDelta = -(SocketConnector.themeCycleColors[GameScreen.selectedThemeId][this.animationFrameIndex] >> 8 & 255) + ((SocketConnector.themeCycleColors[GameScreen.selectedThemeId][(1 + this.animationFrameIndex) % 7] & 65448) >> 8);
        this.paletteBlueDelta = -(SocketConnector.themeCycleColors[GameScreen.selectedThemeId][this.animationFrameIndex] & 255) + (SocketConnector.themeCycleColors[GameScreen.selectedThemeId][(1 + this.animationFrameIndex) % 7] & 255);
    }

    final void eraseEntityPixels(int methodGuard) {
        int rowHeightBeforeDecrement = 0;
        int negativeColumnCounter = 0;
        int clipLeftX;
        int clipTopY;
        int clippedWidth;
        int clippedHeight;
        int framebufferIndex;
        int rowSkip;
        int controlFlowGuard;
        int[] framebufferPixels;
        controlFlowGuard = Geoblox.clientControlFlowFlag;
        clipLeftX = (int)this.positionX - ((HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) + 4);
        clipTopY = -4 - (HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + (int)this.positionY;
        clippedWidth = 8 + HotspotTextWidget.spriteScratchRaster.fullWidth;
        clippedHeight = 8 + HotspotTextWidget.spriteScratchRaster.fullHeight;
        if (clipLeftX < 0) {
          clippedWidth = clippedWidth + clipLeftX;
          clipLeftX = 0;
        }
        if (clipTopY < 0) {
          clippedHeight = clippedHeight + clipTopY;
          clipTopY = 0;
        }
        if (LogoPreparationSupport.boardOwnershipRaster.width < clippedWidth + clipLeftX) {
          clippedWidth = -clipLeftX + LogoPreparationSupport.boardOwnershipRaster.width;
        }
        if (clippedHeight + clipTopY > LogoPreparationSupport.boardOwnershipRaster.height) {
          clippedHeight = LogoPreparationSupport.boardOwnershipRaster.height - clipTopY;
        }
        if (methodGuard < 78) {
          return;
        }
        framebufferIndex = clipLeftX + LogoPreparationSupport.boardOwnershipRaster.width * clipTopY;
        rowSkip = -clippedWidth + LogoPreparationSupport.boardOwnershipRaster.width;
        framebufferPixels = LogoPreparationSupport.boardOwnershipRaster.pixels;
        while (true) {
          rowHeightBeforeDecrement = clippedHeight;
          clippedHeight--;
          if (rowHeightBeforeDecrement <= 0) {
            return;
          }
          for (negativeColumnCounter = -clippedWidth; negativeColumnCounter < 0; negativeColumnCounter++) {
            if (~framebufferPixels[framebufferIndex] != ~(this.entityId + 1)) {
              framebufferIndex++;
              continue;
            }
            framebufferPixels[framebufferIndex] = 0;
            framebufferIndex++;
          }
          framebufferIndex = framebufferIndex + rowSkip;
          continue;
        }
    }

    final void rotateEntityAroundBoard(float rotationDeltaRadians, int methodGuard) {
        double velocityNormalizationScale = 0.0;
        if (methodGuard > -79) {
            this.rotateEntityAroundBoard(0.2609390318393707f, 75);
        }
        float positionOffsetX = this.positionX - 320.0f;
        float positionOffsetY = this.positionY - 240.0f;
        this.positionX = (float)((double)positionOffsetX * Math.cos((double)rotationDeltaRadians) - Math.sin((double)rotationDeltaRadians) * (double)positionOffsetY) + 320.0f;
        this.positionY = (float)(Math.sin((double)rotationDeltaRadians) * (double)positionOffsetX + (double)positionOffsetY * Math.cos((double)rotationDeltaRadians)) + 240.0f;
        this.velocityY = 240.0f - this.positionY;
        this.velocityX = 320.0f - this.positionX;
        if (this.velocityX * this.velocityX + this.velocityY * this.velocityY > TextTemplateDefinition.entityMotionSpeed * TextTemplateDefinition.entityMotionSpeed) {
            velocityNormalizationScale = (double)TextTemplateDefinition.entityMotionSpeed / Math.sqrt((double)(this.velocityX * this.velocityX + this.velocityY * this.velocityY));
            this.velocityX = (float)((double)this.velocityX * velocityNormalizationScale);
            this.velocityY = (float)((double)this.velocityY * velocityNormalizationScale);
        }
        if (!(this.entitySpriteKindId == 2)) {
            this.spriteAngleRadians = this.spriteAngleRadians - rotationDeltaRadians;
        }
    }

    private final void selectEntitySprite(byte methodGuard) {
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        if (methodGuard < 83) {
          this.drawBoardRotatedEntity(18);
        }
        if (0 == this.entitySpriteKindId) {
          this.entitySprite = ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[GameScreen.selectedThemeId][this.entityCategoryKey][this.spriteVariantIndex];
        } else {
          if (this.entitySpriteKindId == 4) {
            this.spriteVariantIndex = -1;
            this.entitySprite = EndingAnimationSupport.blackOrbFrames[0];
            this.entityCategoryKey = -1;
          } else {
            if (this.entitySpriteKindId == 3) {
              this.entityCategoryKey = -1;
              this.spriteVariantIndex = -1;
              this.entitySprite = DialRenderer.silverStarFrames[0];
            } else {
              if (1 == this.entitySpriteKindId) {
                this.entitySprite = Under13TermsPanel.geometrySpritesByThemeAndCategory[GameScreen.selectedThemeId][this.entityCategoryKey];
                this.spriteVariantIndex = -1;
                this.interpolatedPaletteColor = SocketConnector.themeCycleColors[GameScreen.selectedThemeId][this.animationFrameIndex];
                this.updatePaletteChannelDeltas(53);
              } else {
                if (2 != this.entitySpriteKindId) {
                  if (8 == this.entitySpriteKindId) {
                    this.entitySprite = RatingPresentationResources.amorphousCrackFrames[this.animationFrameIndex];
                    this.entityCategoryKey = -1;
                  }
                } else {
                  this.entitySprite = MenuScreen.amorphousFramesByThemeAndVariant[GameScreen.selectedThemeId][this.spriteVariantIndex][this.animationFrameIndex];
                  this.entityCategoryKey = -1;
                }
              }
            }
          }
        }
    }

    final void drawEntityIdOnPointerMask(byte methodGuard) {
        HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
        SoftwareRasterizer.clearFramebuffer();
        this.entitySprite.rotateSmooth(this.entitySprite.fullWidth << 3, this.entitySprite.fullHeight << 3, HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)((double)(this.spriteAngleRadians - UiWidget.gameplaySession.boardAngleRadians) / 6.283185307179586 * 65535.0), 4096);
        if (methodGuard <= 46) {
            this.paletteBlueDelta = 17;
        }
        HotspotTextWidget.spriteScratchRaster.addOutline(this.entityId + 1);
        SecondaryDeque.contactProbeRaster.setAsRasterTarget();
        HotspotTextWidget.spriteScratchRaster.drawSilhouette(-SecondaryDeque.contactProbeOffsetX - (HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) + DialogLayer.rotatedEntityScreenX, -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + (ValidationIconWidget.rotatedEntityScreenY - SecondaryDeque.contactProbeOffsetY), 1 + this.entityId);
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
    }

    final void integrateEntityVelocity(byte methodGuard) {
        this.positionX = this.positionX + this.velocityX;
        this.positionY = this.positionY + this.velocityY;
        if (methodGuard != -59) {
            this.sameVariantEntityCount = -29;
        }
    }

    private final void resetEntityAnimation(int methodGuard) {
        this.entityQueue = null;
        this.entityUpdateTick = 0;
        this.touchesAvatar = false;
        this.animationFrameIndex = 0;
        this.selectEntitySprite((byte) 99);
        this.detachedFromBoard = false;
        this.matchCooldownTicks = 0;
        int sentinelDivisionGuard = 62 % ((methodGuard - 67) / 32);
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

    final void advanceEntityAnimation(boolean preservePositionY) {
        int kind2AnimationFrame = 0;
        int kind8AnimationFrame = 0;
        int kind5AnimationFrame = 0;
        int kind6AnimationFrame = 0;
        int kind3AnimationFrame = 0;
        int kind7AnimationFrame = 0;
        int kind4AnimationFrame = 0;
        float paletteBlendFraction;
        int clientControlFlowGuard;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        this.entityUpdateTick = this.entityUpdateTick + 1;
        this.remainingLifetimeTicks = this.remainingLifetimeTicks - 1;
        if (!preservePositionY) {
          this.positionY = -0.09870309382677078f;
        }
        if (this.entitySpriteKindId != 5) {
          if (this.entitySpriteKindId != 1) {
            if (this.entitySpriteKindId == 2) {
              if (this.entityUpdateTick % 24 == 0) {
                kind2AnimationFrame = this.animationFrameIndex;
                this.animationFrameIndex = this.animationFrameIndex + 1;
                this.entitySprite = MenuScreen.amorphousFramesByThemeAndVariant[GameScreen.selectedThemeId][this.spriteVariantIndex][kind2AnimationFrame];
                this.animationFrameIndex = this.animationFrameIndex % 4;
              }
            } else {
              if ((8 == this.entitySpriteKindId) &&
                  (this.entityUpdateTick % 24 == 0)) {
                kind8AnimationFrame = this.animationFrameIndex;
                this.animationFrameIndex = this.animationFrameIndex + 1;
                this.entitySprite = RatingPresentationResources.amorphousCrackFrames[kind8AnimationFrame];
                this.animationFrameIndex = this.animationFrameIndex % 4;
              }
            }
          } else {
            paletteBlendFraction = 0.019999999552965164f * (float)(this.entityUpdateTick % 50);
            this.interpolatedPaletteColor = (int)((float)this.paletteBlueDelta * paletteBlendFraction) + SocketConnector.themeCycleColors[GameScreen.selectedThemeId][this.animationFrameIndex] + (((int)(paletteBlendFraction * (float)this.paletteRedDelta) << 16) + ((int)((float)this.paletteGreenDelta * paletteBlendFraction) << 8));
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
            this.entitySprite = VisualPropertyOverrides.sparkleFrames[kind5AnimationFrame];
            this.animationFrameIndex = this.animationFrameIndex % 4;
          }
        }
        if (this.entitySpriteKindId != 4) {
          if (7 != this.entitySpriteKindId) {
            if (this.entitySpriteKindId != 3) {
              if (this.entitySpriteKindId == 6) {
                this.remainingLifetimeTicks = this.remainingLifetimeTicks - 1;
                if ((this.remainingLifetimeTicks < 0) &&
                    (this.entityUpdateTick % 24 == 0) &&
                    (4 > this.animationFrameIndex)) {
                  kind6AnimationFrame = this.animationFrameIndex;
                  this.animationFrameIndex = this.animationFrameIndex + 1;
                  this.entitySprite = SessionTextState.bangFrames[kind6AnimationFrame];
                }
              }
            } else {
              if ((this.entityUpdateTick & 255) >= 49) {
                this.animationFrameIndex = 0;
              } else {
                if ((this.entityUpdateTick & 15) == 0) {
                  kind3AnimationFrame = this.animationFrameIndex;
                  this.animationFrameIndex = this.animationFrameIndex + 1;
                  this.entitySprite = DialRenderer.silverStarFrames[kind3AnimationFrame];
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
              this.entitySprite = LoginPasswordSupport.blackOrbImplosionFrames[kind7AnimationFrame];
              this.animationFrameIndex = this.animationFrameIndex % 4;
            }
          }
        } else {
          if ((255 & this.entityUpdateTick) < 49) {
            if ((15 & this.entityUpdateTick) == 0) {
              kind4AnimationFrame = this.animationFrameIndex;
              this.animationFrameIndex = this.animationFrameIndex + 1;
              this.entitySprite = EndingAnimationSupport.blackOrbFrames[kind4AnimationFrame];
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
        RuntimeException caughtNeighborRemovalFailure = null;
        int clientControlFlowGuard = 0;
        RuntimeException neighborRemovalFailureForContext = null;
        StringBuilder neighborRemovalMessagePrefix = null;
        String relatedEntityArgumentDescription = null;
        RuntimeException caughtNeighborRemovalException = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          for (relatedEntitySearchIndex = startingChildIndex; relatedEntitySearchIndex < this.relatedEntityCount; relatedEntitySearchIndex++) {
            if (this.relatedEntities[relatedEntitySearchIndex] != relatedEntity) {
              continue;
            }
            this.relatedEntities[relatedEntitySearchIndex] = null;
            if (this.spriteVariantIndex == relatedEntity.spriteVariantIndex) {
              this.sameVariantEntityCount = this.sameVariantEntityCount - 1;
            }
            this.relatedEntityCount = this.relatedEntityCount - 1;
            if (relatedEntity.entityCategoryKey == this.entityCategoryKey) {
              this.sameCategoryEntityCount = this.sameCategoryEntityCount - 1;
            }
            if (5 > relatedEntitySearchIndex) {
              ArrayOperations.copyReferences(this.relatedEntities, 1 + relatedEntitySearchIndex, this.relatedEntities, relatedEntitySearchIndex, this.relatedEntityCount - relatedEntitySearchIndex);
            }
            this.relatedEntities[this.relatedEntityCount] = null;
            break;
          }
          if ((this.sameVariantEntityCount <= this.relatedEntityCount) &&
              (this.relatedEntityCount >= this.sameCategoryEntityCount)) {
            return;
          }
          throw new IllegalStateException("");
        } catch (java.lang.RuntimeException neighborRemovalException) {
          caughtNeighborRemovalException = neighborRemovalException;
          caughtNeighborRemovalFailure = caughtNeighborRemovalException;
          neighborRemovalFailureForContext = caughtNeighborRemovalFailure;
          neighborRemovalMessagePrefix = new StringBuilder().append("ja.HA(");
          if (relatedEntity == null) {
            relatedEntityArgumentDescription = "null";
          } else {
            relatedEntityArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) neighborRemovalFailureForContext), ((StringBuilder) (Object) neighborRemovalMessagePrefix).append(relatedEntityArgumentDescription).append(',').append(startingChildIndex).append(')').toString());
        }
    }

    final void eraseEntityTrail(int methodGuard) {
        int rowHeightBeforeDecrement = 0;
        int negativeColumnCounter = 0;
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
        int clientControlFlowGuard;
        int[] backgroundPixels;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        entityOffsetX = -320.0f + this.positionX;
        entityOffsetY = -240.0f + this.positionY;
        rotatedEntityX = (int)(Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetX - (double)entityOffsetY * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + 320.0);
        rotatedEntityY = (int)((double)entityOffsetX * Math.sin((double)UiWidget.gameplaySession.boardAngleRadians) + Math.cos((double)UiWidget.gameplaySession.boardAngleRadians) * (double)entityOffsetY + 240.0);
        clipLeftX = -(HotspotTextWidget.spriteScratchRaster.fullWidth / 2) + (rotatedEntityX - 4 - SecondaryDeque.contactProbeOffsetX);
        clipTopY = -SecondaryDeque.contactProbeOffsetY - 4 + (rotatedEntityY - HotspotTextWidget.spriteScratchRaster.fullHeight / 2);
        clippedSpriteWidth = HotspotTextWidget.spriteScratchRaster.fullWidth + 8;
        if (clipLeftX < 0) {
          clippedSpriteWidth = clippedSpriteWidth + clipLeftX;
          clipLeftX = 0;
        }
        clippedSpriteHeight = 8 + HotspotTextWidget.spriteScratchRaster.fullHeight;
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
        if (methodGuard != 30383) {
          this.entityCategoryKey = -47;
        }
        framebufferRowSkip = -clippedSpriteWidth + SecondaryDeque.contactProbeRaster.width;
        backgroundPixels = SecondaryDeque.contactProbeRaster.pixels;
        while (true) {
          rowHeightBeforeDecrement = clippedSpriteHeight;
          clippedSpriteHeight--;
          if (0 >= rowHeightBeforeDecrement) {
            return;
          }
          for (negativeColumnCounter = -clippedSpriteWidth; 0 > negativeColumnCounter; negativeColumnCounter++) {
            if (~(this.entityId + 1) != ~backgroundPixels[framebufferIndex]) {
              framebufferIndex++;
              continue;
            }
            backgroundPixels[framebufferIndex] = 0;
            framebufferIndex++;
          }
          framebufferIndex = framebufferIndex + framebufferRowSkip;
          continue;
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

    final void initializeEntityMotion(int methodGuard, float positionX, int spriteKindId, float velocityX, int spriteVariantIndex, int lifetimeTicks, float unusedFloatArgument1, float positionY, float velocityY, int entityCategoryKey, float unusedFloatArgument2) {
        this.remainingLifetimeTicks = lifetimeTicks;
        this.initialLifetimeTicks = lifetimeTicks;
        this.positionX = positionX;
        this.entityCategoryKey = entityCategoryKey;
        this.positionY = positionY;
        this.spriteVariantIndex = spriteVariantIndex;
        this.velocityY = velocityY;
        this.entitySpriteKindId = spriteKindId;
        this.velocityX = velocityX;
        double velocityNormalizationScale = (double)TextTemplateDefinition.entityMotionSpeed / Math.sqrt((double)(velocityX * velocityX + velocityY * velocityY));
        this.velocityX = (float)((double)this.velocityX * velocityNormalizationScale);
        this.velocityY = (float)((double)this.velocityY * velocityNormalizationScale);
        int sentinelDivisionGuard = -96 / ((methodGuard + 19) / 53);
        this.spriteAngleRadians = 0.0f;
        this.sameCategoryEntityCount = 0;
        this.sameVariantEntityCount = 0;
        this.relatedEntityCount = 0;
        this.resetEntityAnimation(103);
    }

    final static void registerAudioStream(boolean param0, PcmSampleStream param1) {
        try {
            PrefixCodeDecoder.field_f.addLast(-74, new TrackedPcmStream(param1, param1));
            WhirlpoolHash.field_d.a(param1);
            if (param0) {
                PcmSampleStream var3 = (PcmSampleStream) null;
                GameplayEntity.registerAudioStream(false, (PcmSampleStream) null);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ja.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawEntityAtPosition(int methodGuard) {
        if (methodGuard != 1643839728) {
            this.entityId = -123;
        }
        if (this.entitySpriteKindId == 1) {
            HotspotTextWidget.spriteScratchRaster.setAsRasterTarget();
            SoftwareRasterizer.clearFramebuffer();
            this.entitySprite.drawGrayModulated(HotspotTextWidget.spriteScratchRaster.fullWidth - this.entitySprite.fullWidth >> 1, -this.entitySprite.fullHeight + HotspotTextWidget.spriteScratchRaster.fullHeight >> 1, this.interpolatedPaletteColor);
            SpriteCheckboxRenderer.boardSceneRaster.setAsRasterTarget();
            HotspotTextWidget.spriteScratchRaster.rotateSmooth(HotspotTextWidget.spriteScratchRaster.fullWidth << 3, HotspotTextWidget.spriteScratchRaster.fullHeight << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
        } else {
            SpriteCheckboxRenderer.boardSceneRaster.setAsRasterTarget();
            this.entitySprite.rotateSmooth(this.entitySprite.fullWidth << 3, this.entitySprite.fullHeight << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
        }
    }

    final void drawRotatedEntityOnCurrentRaster(int methodGuard) {
        if (methodGuard != 1915952803) {
            GameplayEntity unusedEntitySnapshot = (GameplayEntity) null;
            this.removeRelatedEntity((GameplayEntity) null, -128);
        }
        this.entitySprite.rotateSmooth(this.entitySprite.fullWidth << 3, this.entitySprite.fullHeight << 3, (int)this.positionX << 4, (int)this.positionY << 4, (int)((double)this.spriteAngleRadians / 6.283185307179586 * 65535.0), 4096);
    }

    GameplayEntity(int spriteVariantIndex, int entityCategoryKey, int spriteKindId, float positionX, float positionY, float velocityX, float velocityY, float unusedFloatArgument1, float unusedFloatArgument2, int entityId) {
        this.relatedEntities = new GameplayEntity[6];
        this.interpolatedPaletteColor = 0;
        this.relatedEntityCount = 0;
        this.entityQueue = null;
        this.entityUpdateTick = 0;
        this.sameVariantEntityCount = 0;
        this.spriteAngleRadians = 0.0f;
        this.animationFrameIndex = 0;
        this.sameCategoryEntityCount = 0;
        this.positionY = positionY;
        this.entityId = entityId;
        this.velocityX = velocityX;
        this.spriteVariantIndex = spriteVariantIndex;
        this.velocityY = velocityY;
        this.entityCategoryKey = entityCategoryKey;
        this.entitySpriteKindId = spriteKindId;
        this.positionX = positionX;
        this.resetEntityAnimation(99);
    }

    static {
        pendingAchievementSubmissions = new IntrusiveDeque();
    }
}
