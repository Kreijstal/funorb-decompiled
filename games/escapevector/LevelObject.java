/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelObject extends IntrusiveNode {
    boolean glowActive;
    Sprite collisionSprite;
    static String field_q;
    int spriteFrame;
    int x;
    int objectId;
    private int displayOffsetX;
    private int displayOffsetY;
    boolean triggersCountdown;
    boolean missionTarget;
    int y;
    private Sprite displaySprite;
    int shotCooldownTicks;
    int objectType;

    private final void drawTargetHighlight(boolean guard, int cameraX, int cameraY) {
        try {
          int pulsePeriod = 100;
          int pulseTick = BoundedRandomAccessFile.activeSession.elapsedTicks % pulsePeriod;
          if (null == this.collisionSprite) {
            return;
          }
          int spriteWidth = this.collisionSprite.fullWidth;
          int spriteHeight = this.collisionSprite.fullHeight;
          int highlightWidth = spriteWidth + (pulsePeriod - pulseTick) * 2 * spriteWidth / pulsePeriod;
          int highlightHeight = (-pulseTick + pulsePeriod) * spriteHeight * 2 / pulsePeriod + spriteHeight;
          if (guard) {
            this.drawTargetHighlight(false, -79, -121);
          }
          int alpha = pulseTick * 128 / pulsePeriod;
          int color = 16711680;
          int screenTop = this.y + (-cameraY - (highlightHeight - spriteHeight) / 2);
          int screenBottom = highlightHeight + screenTop;
          int viewportHeight = 480;
          if (screenBottom >= 0 &&
            screenTop < viewportHeight) {
            int screenLeft = -cameraX + this.x - (highlightWidth - spriteWidth) / 2;
            int screenRight = highlightWidth + screenLeft;
            int worldWidth = BoundedRandomAccessFile.activeSession.worldWidth;
            SoftwareRasterizer.drawRectangleAlpha(screenLeft, screenTop, highlightWidth, highlightHeight, color, alpha);
            if (screenLeft > 0 &&
              worldWidth <= screenRight) {
              return;
            }
            if (0 < screenLeft) {
              screenLeft = screenLeft - worldWidth;
              if (EscapeVector.obfuscationControl != 0) {
                screenLeft = screenLeft + worldWidth;
              }
            } else {
              screenLeft = screenLeft + worldWidth;
            }
            SoftwareRasterizer.drawRectangleAlpha(screenLeft, screenTop, highlightWidth, highlightHeight, color, alpha);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var4 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var4), "sa.J(" + guard + ',' + cameraX + ',' + cameraY + ')');
        }
    }

    final static void d(byte param0) {
        try {
          try {
            if (param0 != 27) {
              LevelObject.d((byte) -32);
            }
            SpriteFactorySupport.field_a = new IntrusiveDeque();
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var1 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var1), "sa.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final SpriteOffset getDisplayOffset(boolean guard) {
        try {
          ObjectSpriteSet[] var2 = LoadingProgressDialog.objectSpriteSets(false);
          if (!guard) {
            SpriteOffset stackIn_2_0 = (SpriteOffset) null;
            return stackIn_2_0;
          }
          if (var2 != null) {
            SpriteOffset stackIn_7_0 = var2[this.objectType].a((byte) 120, this.spriteFrame);
            return stackIn_7_0;
          }
          Object stackIn_5_0 = null;
          return (SpriteOffset) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.A(" + guard + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, Sprite[] param3, int param4, int param5, Sprite[] param6, int param7, int param8, BitmapFont param9, int param10, boolean param11) {
        String stackIn_7_2 = null;
        String stackIn_11_2 = null;
        String stackIn_15_2 = null;
        try {
          di.a(param3, param8, param5, param10, param0, param5, param9, param1, param6, param11, param8, param4, param9, (byte) -41, param7);
          if (param2) {
            field_q = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_6_0 = runtimeException;
          StringBuilder stackIn_6_1 = new StringBuilder().append("sa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param10).append(',').append(param11).append(')').toString());
        }
    }

    private final Sprite getDisplaySprite(int guard) {
        try {
          if (guard != 0) {
            LevelObject.a(22, (byte) 101);
          }
          ObjectSpriteSet[] var2 = LoadingProgressDialog.objectSpriteSets(false);
          if (null == var2) {
            Object stackIn_7_0 = null;
            return (Sprite) (stackIn_7_0);
          }
          Sprite stackIn_9_0 = var2[this.objectType].a(-125, this.spriteFrame);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2_ref = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2_ref), "sa.I(" + guard + ')');
        }
    }

    LevelObject(int objectId, int objectType, int x, int y, boolean missionTarget, boolean triggersCountdown, int spriteFrame) {
        this(objectId, objectType, x, y);
        try {
          this.triggersCountdown = triggersCountdown;
          this.spriteFrame = spriteFrame;
          this.missionTarget = missionTarget;
          this.refreshSprites(-7012);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + objectId + ',' + objectType + ',' + x + ',' + y + ',' + missionTarget + ',' + triggersCountdown + ',' + spriteFrame + ')');
        }
    }

    final void stampTerrain(boolean guard, GameplaySession session) {
        int stackIn_31_0 = 0;
        String stackIn_39_2 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          int sourcePixelIndex = 0;
          int sourceRow = 0;
          while (true) {
            int stackIn_5_0 = ~this.collisionSprite.height;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_5_0 < ~sourceRow) {
              int rowY = sourceRow + (this.y + this.collisionSprite.offsetY);
              int tileY = rowY >> 5;
              rowY = rowY & 31;
              stackIn_31_0 = 0;
              decompiledFrameRemainder0 = (obfuscationControl == 0);
              if (decompiledFrameRemainder0) {
                int sourceColumn = stackIn_31_0;
                while (sourceColumn < this.collisionSprite.width) {
                  int pixelX = sourceColumn + (this.collisionSprite.offsetX + this.x);
                  int tileX = pixelX >> 5;
                  stackIn_5_0 = pixelX & 31;
                  int bitColumn = stackIn_5_0;
                  while (tileX < 0) {
                    tileX = tileX + session.tilesWide;
                  }
                  tileX = tileX % session.tilesWide;
                  if (this.collisionSprite.pixels[sourcePixelIndex] != 0) {
                    int[] tileRows = session.terrainMasks[tileX + session.tilesWide * tileY];
                    if (QuickChatPhraseDefinition.fullTileMask != tileRows) {
                      if (null == tileRows) {
                        int[] newTileRows = new int[32];
                        tileRows = newTileRows;
                        session.terrainMasks[tileX + tileY * session.tilesWide] = newTileRows;
                      }
                      tileRows[rowY] = MatchingTextValidator.a(tileRows[rowY], 1 << bitColumn);
                    }
                  }
                  sourcePixelIndex++;
                  sourceColumn++;
                }
                sourceRow++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_31_0 = guard ? 1 : 0;
            }
            if (stackIn_31_0 != 1) {
              this.objectId = -96;
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_38_0 = var3;
          StringBuilder stackIn_38_1 = new StringBuilder().append("sa.E(").append(guard).append(',');
          if (session == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final void drawObject(int cameraY, byte guard, int cameraX) {
        Object var4 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          var4 = null;
          int glowOffsetX = 0;
          int glowOffsetY = 0;
          int leftPadding = 0;
          int topPadding = 0;
          int var9 = 0;
          if (this.glowActive) {
            int glowAlpha = this.glowAlpha((byte) 54);
            if (glowAlpha > 0) {
              glowOffsetX = this.displayOffsetX;
              var4 = this.displaySprite;
              glowOffsetY = this.displayOffsetY;
              if (glowOffsetX < 0) {
                leftPadding = -glowOffsetX;
              }
              if (glowOffsetY < 0) {
                topPadding = -glowOffsetY;
              }
            }
          }
          int screenY = this.y - cameraY;
          if (screenY < 480 + topPadding &&
            screenY > -this.collisionSprite.fullHeight) {
            int screenX = -cameraX + (this.x + BoundedRandomAccessFile.activeSession.worldWidth + BoundedRandomAccessFile.activeSession.worldWidth) - leftPadding;
            int drawWidth = this.collisionSprite.fullWidth + leftPadding + leftPadding;
            screenX = screenX + drawWidth;
            screenX = screenX % BoundedRandomAccessFile.activeSession.worldWidth;
            screenX = screenX - drawWidth;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (screenX >= 640))) {
              if (obfuscationControl == 0) {
                if (null != var4) {
                  this.collisionSprite.drawTransparent(screenX + leftPadding, screenY);
                  ((Sprite) (var4)).drawAdditive(glowOffsetX + screenX + leftPadding, screenY + glowOffsetY, this.glowAlpha((byte) 122));
                } else {
                  this.collisionSprite.drawTransparent(screenX, screenY);
                }
                screenX = screenX + BoundedRandomAccessFile.activeSession.worldWidth;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0 &&
              guard <= 106) {
              this.drawTargetHighlight(false, -48, -24);
            }
            if (this.missionTarget) {
              this.drawTargetHighlight(false, cameraX, cameraY);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) (var4), "sa.L(" + cameraY + ',' + guard + ',' + cameraX + ')');
        }
    }

    private final int glowAlpha(byte guard) {
        try {
          if (guard < 36) {
            field_q = (String) null;
          }
          if (this.objectType == 2) {
            int var2_int = -42 + this.shotCooldownTicks;
            if (var2_int <= 0) {
              int stackIn_14_0 = 0;
              return stackIn_14_0;
            }
            int stackIn_16_0 = 16 * var2_int;
            return stackIn_16_0;
          }
          double var2_double = (double)(BoundedRandomAccessFile.activeSession.shieldPulsePhase / 8);
          if (kg.a((byte) -98, this.objectType)) {
            var2_double = (double)(BoundedRandomAccessFile.activeSession.elapsedTicks % 100) / 100.0;
          }
          double var4 = Math.cos(3.141592653589793 * var2_double) + 2.0;
          int stackIn_9_0 = (int)(var4 * var4 * 28.0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.M(" + guard + ')');
        }
    }

    private final void refreshSprites(int guard) {
        this.collisionSprite = TextWidgetPainter.a(this.spriteFrame, (byte) -39, this.objectType);
        this.displaySprite = this.getDisplaySprite(0);
        SpriteOffset var2 = this.getDisplayOffset(true);
        if (guard != -7012) {
          return;
        }
        if (var2 == null) {
          return;
        }
        try {
          this.displayOffsetX = var2.x;
          this.displayOffsetY = var2.y;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.H(" + guard + ')');
        }
    }

    LevelObject(int objectId, int objectType, int x, int y, boolean missionTarget, boolean triggersCountdown) {
        this(objectId, objectType, x, y);
        try {
          this.missionTarget = missionTarget;
          this.triggersCountdown = triggersCountdown;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + objectId + ',' + objectType + ',' + x + ',' + y + ',' + missionTarget + ',' + triggersCountdown + ')');
        }
    }

    final static void a(int param0, byte param1) {
        try {
          try {
            if (EmailSyntaxValidator.a(param0, -2)) {
              DialogueScreen var2 = new DialogueScreen(SeekerMine.field_n, SpriteCheckboxPainter.field_c, SpriteLoadTask.field_j, true);
              GradientOutlineTextPainter.enqueueDialogue(1820, var2);
            }
            if (param1 >= -69) {
              return;
            }
            if (param0 == 2) {
              String var2_ref = "vengeance_intro";
              String var3 = "scene";
              Sprite[] var4 = AccountNoticeDialog.field_cb;
              String[] var5 = LegacyMenuColumn.field_o;
              DialogueScreen var6 = new DialogueScreen(var2_ref, var3, var4, var5, true);
              GradientOutlineTextPainter.enqueueDialogue(1820, var6);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            RuntimeException var2_ref2 = decompiledCaughtParameter0;
            throw t.a((Throwable) ((Object) var2_ref2), "sa.D(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean countsAsInfrastructure(byte guard) {
        try {
          if (ResourceArchive.isPowerupType(this.objectType, -64)) {
            return false;
          }
          if (1 == this.objectType) {
            return false;
          }
          if (5 == this.objectType) {
            return false;
          }
          if (this.objectType == 6) {
            return false;
          }
          if (guard != -5) {
            return false;
          }
          if (this.objectType == 7) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var2 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var2), "sa.F(" + guard + ')');
        }
    }

    final void removeFromTerrain(GameplaySession session, byte guard) {
        String stackIn_49_2 = null;
        int obfuscationControl = EscapeVector.obfuscationControl;
        try {
          if (this.collisionSprite == null) {
            return;
          }
          int sourcePixelIndex = 0;
          if (guard < 58) {
            this.refreshSprites(-105);
          }
          int sourceRow = 0;
          scanLoop1: while (true) {
            int stackIn_9_0 = this.collisionSprite.height;
            if (stackIn_9_0 > sourceRow) {
              int rowY = sourceRow + this.collisionSprite.offsetY + this.y;
              int tileY = rowY >> 5;
              rowY = rowY & 31;
              if (obfuscationControl != 0) {
                return;
              }
              int sourceColumn = 0;
              while (sourceColumn < this.collisionSprite.width) {
                int pixelX = sourceColumn + (this.x + this.collisionSprite.offsetX);
                int tileX = pixelX >> 5;
                stackIn_9_0 = pixelX & 31;
                int bitColumn = stackIn_9_0;
                while (0 > tileX) {
                  tileX = tileX + session.tilesWide;
                }
                tileX = tileX % session.tilesWide;
                if (null != BoundedRandomAccessFile.activeSession.dynamicTerrain) {
                  BoundedRandomAccessFile.activeSession.dynamicTerrain.invalidateTileNeighborhood(tileX, tileY, true);
                }
                if (0 != this.collisionSprite.pixels[sourcePixelIndex]) {
                  int[] tileRows = session.terrainMasks[session.tilesWide * tileY + tileX];
                  if (tileRows != null) {
                    if (QuickChatPhraseDefinition.fullTileMask == tileRows) {
                      int[] newTileRows = new int[32];
                      tileRows = newTileRows;
                      session.terrainMasks[session.tilesWide * tileY + tileX] = newTileRows;
                      int fillRow = 0;
                      while (fillRow < 32) {
                        tileRows[fillRow] = -1;
                        fillRow++;
                      }
                    }
                    tileRows[rowY] = SpriteCheckboxPainter.bitwiseAnd(tileRows[rowY], ~(1 << bitColumn));
                  }
                }
                sourcePixelIndex++;
                sourceColumn++;
              }
              sourceRow++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var3 = decompiledCaughtParameter0;
          RuntimeException stackIn_48_0 = var3;
          StringBuilder stackIn_48_1 = new StringBuilder().append("sa.C(");
          if (session == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        try {
          if (guard) {
            LevelObject.a(77, 13, true, (Sprite[]) null, -108, -59, (Sprite[]) null, -14, -30, (BitmapFont) null, -40, true);
          }
          field_q = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException var1 = decompiledCaughtParameter0;
          throw t.a((Throwable) ((Object) var1), "sa.G(" + guard + ')');
        }
    }

    LevelObject(int objectId, int objectType, int x, int y) {
        boolean stackIn_6_1 = false;
        this.shotCooldownTicks = 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.y = y;
          this.x = x;
          this.objectId = objectId;
          this.objectType = objectType;
          Object stackIn_3_0 = this;
          if (objectType != 2) {
            Object stackIn_5_0 = this;
            Object stackIn_3_0Lifetime1 = stackIn_5_0;
            if (!kg.a((byte) -125, this.objectType)) {
              stackIn_6_1 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_6_1 = true;
          }
          this.glowActive = stackIn_6_1;
          this.triggersCountdown = false;
          this.missionTarget = false;
          this.spriteFrame = 0;
          this.refreshSprites(-7012);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "sa.<init>(" + objectId + ',' + objectType + ',' + x + ',' + y + ')');
        }
    }

    static {
        field_q = "Enter the cave, find the container,<br>and land next to it to attach your tether.";
    }
}
