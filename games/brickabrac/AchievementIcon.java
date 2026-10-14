/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementIcon extends IntrusiveNode {
    static ResourceArchive field_s;
    int x;
    AchievementBrowserScreen owner;
    private RgbSprite cachedThumbnail;
    int width;
    int height;
    int remainingOffset;
    static String field_l;
    int transitionKeepMask;
    static ResourceArchive field_m;
    int achievementId;
    static String field_o;
    private boolean thumbnailIsPlaceholder;
    static int field_j;
    static ScrollPane field_q;
    int y;

    final static void drawRankingRow(int losses, int baselineY, String name, int wins, int rating, int textStyle, int winsShadowColor, int draws, int rankIndex) {
        int var9_int = 0;
        try {
          var9_int = losses + (wins + draws);
          if (var9_int != 0) {
            draws = (var9_int + 200 * draws) / (2 * var9_int);
            losses = (var9_int + 200 * losses) / (var9_int * 2);
            wins = (wins * 200 + var9_int) / (var9_int * 2);
          }
          if (-1 != rankIndex) {
            ob.field_D.drawRight(1 + rankIndex + ". ", qo.field_N + 54, baselineY, textStyle, -1);
          }
          ob.field_D.drawLeft(name, 54 + qo.field_N, baselineY, textStyle, -1);
          ob.field_D.drawRight(Integer.toString(rating), ResourceArchive.field_d[0], baselineY, textStyle, -1);
          ob.field_D.drawRight(var9_int < 50 ? Integer.toString(var9_int) : "50+", ResourceArchive.field_d[1], baselineY, textStyle, -1);
          ob.field_D.drawRight(wins + "%", ResourceArchive.field_d[2], baselineY, textStyle, winsShadowColor);
          ob.field_D.drawRight(losses + "%", ResourceArchive.field_d[3], baselineY, textStyle, -1);
          ob.field_D.drawRight(draws + "%", ResourceArchive.field_d[4], baselineY, textStyle, -1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "i.H(" + losses + ',' + baselineY + ',' + (name != null ? "{...}" : "null") + ',' + wins + ',' + rating + ',' + textStyle + ',' + winsShadowColor + ',' + draws + ',' + rankIndex + ')');
        }
    }

    public static void d(int param0) {
        field_s = null;
        field_o = null;
        field_m = null;
        if (param0 == 0) {
          field_l = null;
          field_q = null;
          return;
        }
        String var2 = (String) null;
        AchievementIcon.a(110, 111, (String) null);
        field_l = null;
        field_q = null;
    }

    final static byte[] decompressArchiveContainer(boolean obfuscationGuard, byte[] data) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (!obfuscationGuard) {
            field_l = (String) null;
          }
          var9 = new PacketBuffer(data);
          var3 = var9.readUnsignedByte(255);
          var4 = var9.readInt(255);
          if (0 <= var4 && (bq.maxArchiveContainerBytes == 0 ||
            !(var4 > bq.maxArchiveContainerBytes))) {
            if (var3 == 0) {
              var12 = new byte[var4];
              var10 = var12;
              var5_ref_byte__ = var10;
              var9.readBytes(0, var12, 126, var4);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var9.readInt(255);
            if (var5 >= 0 && (bq.maxArchiveContainerBytes == 0 ||
              !(var5 > bq.maxArchiveContainerBytes))) {
              var13 = new byte[var5];
              var11 = var13;
              var6 = var11;
              if (var3 == 1) {
                tc.a(var13, var5, data, var4, 9);
              } else {
                var7 = DualLinkIterator.archiveGzipInflater;
                synchronized (var7) {
                  DualLinkIterator.archiveGzipInflater.inflateGzip(var13, -20555, var9);
                }
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("i.E(").append(obfuscationGuard).append(',');
          if (data == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void sendIntArrayRequest(int opcode, IntArrayRequest request, int obfuscationGuard) {
        BitPacketBuffer var3 = null;
        try {
          var3 = TextFieldValidator.outgoingPackets;
          var3.writeCipheredOpcode(-13413, opcode);
          int var4 = 29 / ((-57 - obfuscationGuard) / 59);
          var3.writeByte(114, 2);
          var3.writeByte(-126, 0);
          var3.writeByte(73, request.requestId);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "i.I(" + opcode + ',' + (request != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void update(int obfuscationGuard) {
        int var2;
        int clientBranchFlag;
        int offsetStep;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        if (0 != this.remainingOffset) {
          var2 = 0;
          if (this.remainingOffset <= 0) {
            offsetStep = this.remainingOffset >> 2;
          } else {
            offsetStep = -(-this.remainingOffset >> 2);
          }
          this.remainingOffset = this.remainingOffset - offsetStep;
          this.x = this.x + offsetStep;
        } else {
          AlignedIconLabel.achievementTransitionMask = AlignedIconLabel.achievementTransitionMask & this.transitionKeepMask;
          if (bg.containsRectanglePoint(this.x, this.height, this.width, (byte) 47, po.pointerY, MusicPatch.pointerX, this.y)) {
            ValidationMessageWidget.hoveredAchievementId = this.achievementId;
            if (1 == BackgroundScene.pressedButton &&
              bg.containsRectanglePoint(this.x, this.height, this.width, (byte) 33, qo.pressY, tb.pressX, this.y)) {
              if (ValidationMessageWidget.selectedAchievementId != this.achievementId) {
                ValidationMessageWidget.selectedAchievementId = this.achievementId;
              } else {
                ValidationMessageWidget.selectedAchievementId = -1;
              }
              if (ValidationMessageWidget.selectedAchievementId != -1) {
                SoundCache.playUiSound(8, ta.uiSounds[0]);
              }
            }
          } else {
            if (1 == BackgroundScene.pressedButton &&
              bg.containsRectanglePoint(this.x, this.height, this.width, (byte) 33, qo.pressY, tb.pressX, this.y)) {
              if (ValidationMessageWidget.selectedAchievementId != this.achievementId) {
                ValidationMessageWidget.selectedAchievementId = this.achievementId;
              } else {
                ValidationMessageWidget.selectedAchievementId = -1;
              }
              if (ValidationMessageWidget.selectedAchievementId != -1) {
                SoundCache.playUiSound(8, ta.uiSounds[0]);
              }
            }
          }
        }
        if (obfuscationGuard <= -125) {
          return;
        }
        this.y = -78;
    }

    final static void updateDrawCaption(byte obfuscationGuard) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (IntArrayRequest.gameplayScreen.isSpectator(116)) {
          return;
        }
        if ((1 << IntArrayRequest.gameplayScreen.localPlayerId & IntArrayRequest.gameplayScreen.match.drawOfferPlayerMask) == 0) {
          if (IntArrayRequest.gameplayScreen.match.drawOfferPlayerMask != 0) {
            ag.buttonLabels[10] = er.field_a;
            if (obfuscationGuard != 32) {
              field_o = (String) null;
              return;
            }
            return;
          }
          ag.buttonLabels[10] = t.field_b;
          if (obfuscationGuard != 32) {
            field_o = (String) null;
            return;
          }
          return;
        }
        ag.buttonLabels[10] = fh.field_a;
        if (obfuscationGuard == 32) {
          return;
        }
        field_o = (String) null;
    }

    final static UsernameAvailabilityResult a(int param0, int param1, String param2) {
        UsernameAvailabilityResult var3 = null;
        RuntimeException var3_ref = null;
        IntArrayRequest var4 = null;
        UsernameAvailabilityResult stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new UsernameAvailabilityResult(false);
          var3.field_d = param0;
          var3.field_g = param2;
          if (param1 > -27) {
            var4 = (IntArrayRequest) null;
            AchievementIcon.sendIntArrayRequest(-57, (IntArrayRequest) null, 111);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void recycle(int obfuscationGuard) {
        if (obfuscationGuard == 1) {
          aa.achievementIconPool.addLast((IntrusiveNode) (this), (byte) 3);
          this.thumbnailIsPlaceholder = false;
          this.cachedThumbnail = null;
          this.owner = null;
          return;
        }
        IntArrayRequest var3 = (IntArrayRequest) null;
        AchievementIcon.sendIntArrayRequest(-1, (IntArrayRequest) null, 57);
        aa.achievementIconPool.addLast((IntrusiveNode) (this), (byte) 3);
        this.thumbnailIsPlaceholder = false;
        this.cachedThumbnail = null;
        this.owner = null;
    }

    final void draw(byte obfuscationGuard) {
        int var3;
        RgbSprite var6;
        RgbSprite var7;
        RgbSprite var10;
        IndexedSprite var11;
        IndexedSprite var12;
        IndexedSprite var13;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (DirectByteStorage.isBitSet(this.owner.achievementMask, this.achievementId, (byte) -75)) {
          if (this.achievementId == ValidationMessageWidget.selectedAchievementId) {
            pa.field_h[this.achievementId].f(this.x, this.y, 384);
            if (this.cachedThumbnail == null ||
              this.thumbnailIsPlaceholder) {
              var12 = IntrusiveHashTable.achievementSourceIcons[this.achievementId];
              this.cachedThumbnail = new RgbSprite(var12.canvasWidth / 4, var12.canvasHeight / 4);
              IndexedSpriteGeometry.pushSpriteRaster(-119, this.cachedThumbnail);
              var12.drawQuarter(0, 0);
              sc.popRaster(-89);
              this.thumbnailIsPlaceholder = false;
            }
          } else {
            if (this.achievementId == ValidationMessageWidget.hoveredAchievementId) {
              AchievementSubmission.field_l[this.achievementId].f(this.x, this.y, 256);
              if (this.cachedThumbnail == null ||
                this.thumbnailIsPlaceholder) {
                var11 = IntrusiveHashTable.achievementSourceIcons[this.achievementId];
                this.cachedThumbnail = new RgbSprite(var11.canvasWidth / 4, var11.canvasHeight / 4);
                IndexedSpriteGeometry.pushSpriteRaster(-119, this.cachedThumbnail);
                var11.drawQuarter(0, 0);
                sc.popRaster(-89);
                this.thumbnailIsPlaceholder = false;
              }
            } else {
              if (this.cachedThumbnail == null ||
                this.thumbnailIsPlaceholder) {
                var13 = IntrusiveHashTable.achievementSourceIcons[this.achievementId];
                this.cachedThumbnail = new RgbSprite(var13.canvasWidth / 4, var13.canvasHeight / 4);
                IndexedSpriteGeometry.pushSpriteRaster(-119, this.cachedThumbnail);
                var13.drawQuarter(0, 0);
                sc.popRaster(-89);
                this.thumbnailIsPlaceholder = false;
              }
            }
          }
        } else {
          if (ValidationMessageWidget.selectedAchievementId != this.achievementId) {
            if (ValidationMessageWidget.hoveredAchievementId != this.achievementId) {
              if (this.cachedThumbnail == null) {
                var6 = LevelCompleteScreen.field_F;
                this.cachedThumbnail = new RgbSprite(var6.canvasWidth / 4, var6.canvasHeight / 4);
                IndexedSpriteGeometry.pushSpriteRaster(-76, this.cachedThumbnail);
                var6.e(0, 0);
                sc.popRaster(-110);
                this.thumbnailIsPlaceholder = true;
              } else {
                if (!this.thumbnailIsPlaceholder) {
                  var7 = LevelCompleteScreen.field_F;
                  this.cachedThumbnail = new RgbSprite(var7.canvasWidth / 4, var7.canvasHeight / 4);
                  IndexedSpriteGeometry.pushSpriteRaster(-76, this.cachedThumbnail);
                  var7.e(0, 0);
                  sc.popRaster(-110);
                  this.thumbnailIsPlaceholder = true;
                }
              }
              if (obfuscationGuard < 87) {
                return;
              }
              this.cachedThumbnail.drawTransparent(this.x, this.y);
              return;
            }
            ToggleButtonWidget.field_L.f(this.x, this.y, 256);
          } else {
            ValidationStatus.field_c.f(this.x, this.y, 384);
          }
          if (this.cachedThumbnail == null) {
            var10 = LevelCompleteScreen.field_F;
            this.cachedThumbnail = new RgbSprite(var10.canvasWidth / 4, var10.canvasHeight / 4);
            IndexedSpriteGeometry.pushSpriteRaster(-76, this.cachedThumbnail);
            var10.e(0, 0);
            sc.popRaster(-110);
            this.thumbnailIsPlaceholder = true;
          } else {
            if (!this.thumbnailIsPlaceholder) {
              var10 = LevelCompleteScreen.field_F;
              this.cachedThumbnail = new RgbSprite(var10.canvasWidth / 4, var10.canvasHeight / 4);
              IndexedSpriteGeometry.pushSpriteRaster(-76, this.cachedThumbnail);
              var10.e(0, 0);
              sc.popRaster(-110);
              this.thumbnailIsPlaceholder = true;
            }
          }
        }
        if (obfuscationGuard < 87) {
          return;
        }
        this.cachedThumbnail.drawTransparent(this.x, this.y);
    }

    AchievementIcon() {
    }

    static {
        field_l = "Suggested names: ";
        field_o = "You have withdrawn your request to join.";
    }
}
