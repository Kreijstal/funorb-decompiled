/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    static RgbSprite field_t;
    private IsaacGenerator opcodeCipher;
    private int writeBitsRemaining;
    static String field_s;
    private int bitPosition;
    static int[] field_o;
    static LegacyEmailValidationError emailPartTooLong;
    static ConnectionPhase readyToSendHandshake;
    static int field_q;

    final void beginBitWrite(int obfuscationGuard) {
        this.data[this.position] = (byte) 0;
        this.writeBitsRemaining = 8;
        if (obfuscationGuard < 51) {
          this.finishBitWrite(126);
        }
    }

    BitPacketBuffer(byte[] data) {
        super(data);
    }

    final void initializeOpcodeCipher(int[] seed, int obfuscationGuard) {
        try {
          this.opcodeCipher = new IsaacGenerator(seed);
          int var3_int = -50 / ((obfuscationGuard - 22) / 37);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pi.UA(" + (seed != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void clearStaticReferences(int obfuscationGuard) {
        field_t = null;
        field_o = null;
        if (obfuscationGuard != 60) {
          field_s = (String) null;
        }
        emailPartTooLong = null;
        readyToSendHandshake = null;
        field_s = null;
    }

    BitPacketBuffer(int capacity) {
        super(capacity);
    }

    final void beginBitRead(int obfuscationGuard) {
        if (obfuscationGuard > -74) {
          readyToSendHandshake = (ConnectionPhase) null;
        }
        this.bitPosition = 8 * this.position;
    }

    final void writeCipheredOpcode(int obfuscationGuard, int opcode) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(opcode + this.opcodeCipher.nextInt(111));
        if (obfuscationGuard != -13413) {
          this.finishBitRead((byte) -89);
        }
    }

    final static void drawBoard(byte obfuscationGuard, int playerId, int scaleDivisor, int destinationY, MultiplayerMatch match, int destinationX) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        Paddle var7 = null;
        int var8 = 0;
        int var9 = 0;
        double var10_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        Ball var12_ref_vn = null;
        PowerUp var12_ref_ge = null;
        BubbleDistortion var12_ref_il = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        PlayerBoard var24 = null;
        Object var25 = null;
        Ball var26 = null;
        BallPulseEffect var27 = null;
        ScorePopup var28 = null;
        var22 = null;
        var23 = null;
        var25 = null;
        var21 = BrickABrac.field_J ? 1 : 0;
        try {
          var24 = match.playerBoards[playerId];
          var7 = var24.paddle;
          var8 = var24.boardWidth;
          var9 = var24.boardHeight;
          Rasterizer2D.setClip(destinationX, destinationY, destinationX + var8 / scaleDivisor, var9 / scaleDivisor + destinationY);
          if (var24.brickGroups != null) {
            ProducerFramebuffer.a(scaleDivisor, var24, playerId, match, destinationX, 30, destinationY);
          }
          if (var24.positionOrderTicks != -1) {
            var10_double = (double)(500 - var24.positionOrderTicks);
            var10_double = (var10_double / 666.0 + 1.0) * (var10_double / 10.0);
            var10_double = 30.0 * Math.sin(var10_double) + 60.0;
            Rasterizer2D.fillRectangleAlpha(destinationX, destinationY, var8 / scaleDivisor, var9 - scaleDivisor, 16724787, (int)var10_double);
          }
          stackIn_8_0 = (((match.playerMaskTwo | match.playerMaskOne | match.playerMaskThree) & 1 << playerId) == 0) ? 0 : 1;
          var10 = stackIn_8_0;
          if (var24.boardState == 2 &&
            var10 == 0) {
            var11 = var24.activeBalls.size(127);
            var12_ref_vn = (Ball) (var24.activeBalls.first(-7));
            while (var12_ref_vn != null) {
              var13 = var12_ref_vn.centerXHistory256.latestIndex;
              if (var12_ref_vn.contactCount < 40) {
                stackIn_16_0 = (18 + var12_ref_vn.contactCount) / (var11 * 3);
              } else {
                stackIn_16_0 = 19 / var11;
              }
              var14 = stackIn_16_0;
              var15 = (var12_ref_vn.contactCount + 3) * 256 / (var12_ref_vn.contactCount + 6);
              var16 = var15 / (1 + var14);
              var17 = var12_ref_vn.radius256;
              var18 = 0;
              while (var13 >= 0) {
                if (var18 < var14) {
                  var19 = var12_ref_vn.centerXHistory256.get(var13, 1);
                  var20 = var12_ref_vn.centerYHistory256.get(var13, 1);
                  Rasterizer2D.drawRadialGlow((destinationX << 4) + (var19 >> 4) / scaleDivisor, (var20 >> 4) / scaleDivisor + (destinationY << 4), var17 / scaleDivisor >> 4, var15, ArrayWidgetGroup.field_M);
                  var15 = var15 - var16;
                  var17 = var17 * 252 >> 8;
                  var13--;
                  var18++;
                  continue;
                }
                break;
              }
              if (var12_ref_vn.contactCount >= 40) {
                AchievementMaskRequest.a((var12_ref_vn.radius256 >> 8) / scaleDivisor + (destinationY + (var12_ref_vn.y256 >> 8) / scaleDivisor), 40 / scaleDivisor, 256, InteractiveGameClient.sine8192(100 * MembershipBenefitsScreen.clientTick, -4097) * 10 >> 16, 123, 20 / scaleDivisor, (var12_ref_vn.x256 >> 8) / scaleDivisor + destinationX + (var12_ref_vn.radius256 >> 8) / scaleDivisor);
                RasterEffectHelpers.drawBranchedGlow((var12_ref_vn.x256 + var12_ref_vn.radius256 >> 4) / scaleDivisor + (destinationX << 4), (destinationY << 4) + (var12_ref_vn.y256 + var12_ref_vn.radius256 >> 4) / scaleDivisor, (var12_ref_vn.radius256 >> 3) / scaleDivisor, 4, 3, PowerUpWarning.field_n, var24.simulationTick / 5);
              }
              IntNode.drawBall(var12_ref_vn, (byte) -119, scaleDivisor, destinationX, destinationY);
              var12_ref_vn = (Ball) (var24.activeBalls.next((byte) 116));
            }
            var26 = (Ball) (var24.queuedBalls.first(-76));
            while (var26 != null) {
              IntNode.drawBall(var26, (byte) -119, scaleDivisor, destinationX, destinationY);
              var26 = (Ball) (var24.queuedBalls.next((byte) 116));
            }
            var12_ref_ge = (PowerUp) (var24.fallingPowerUps.first(-113));
            while (var12_ref_ge != null) {
              ReflectionCheckHelpers.activePowerUpSprites[var12_ref_ge.typeId].drawTransparent(destinationX + (var12_ref_ge.x256 >> 8) / scaleDivisor, (var12_ref_ge.y256 >> 8) / scaleDivisor + destinationY);
              var12_ref_ge = (PowerUp) (var24.fallingPowerUps.next((byte) 116));
            }
            var12_ref_il = (BubbleDistortion) (var24.bubbles.first(-20));
            while (var12_ref_il != null) {
              RasterEffectHelpers.drawBubbleDistortion((var12_ref_il.x256 >> 4) / scaleDivisor + (destinationX << 4), (var12_ref_il.y256 >> 4) / scaleDivisor + (destinationY << 4), (var12_ref_il.radius256 >> 4) / scaleDivisor, var12_ref_il.distortionAmount);
              var12_ref_il = (BubbleDistortion) (var24.bubbles.next((byte) 116));
            }
          }
          if ((var24.boardState == 2 ||
            var24.boardState == 4 ||
            var24.boardState == 1) &&
            var10 == 0) {
            RichTextLayout.a(QuickChatHelpDialog.getLeverFrameIndex(match, playerId, 127, var24), var7, scaleDivisor, destinationY, (byte) 107, var24, destinationX);
          }
          var27 = (BallPulseEffect) (var24.ballPulses.first(-30));
          while (var27 != null) {
            var27.draw(scaleDivisor, destinationX, destinationY, true);
            var27 = (BallPulseEffect) (var24.ballPulses.next((byte) 116));
          }
          if (match.playerCount == 1 &&
            var24.boardState == 1) {
            var12 = 256;
            if (var24.stateTicks < 25) {
              var12 = var24.stateTicks * 256 / 25;
            } else {
              if (var24.stateTicks > 109) {
                var12 = 125 - var24.stateTicks;
                var12 = var12 * 256 / 15;
              }
            }
            Rasterizer2D.fillRectangleAlpha(7, 280, 510, 45, 0, 96 * var12 / 256);
            ScreenshotViewer.field_r.b(7 + (-ScreenshotViewer.field_r.width + 510) / 2, 260, var12);
          }
          if (3 == var24.boardState) {
            BoardPresentationHelpers.drawBoardEndOverlay((byte) -113, ClientException.gameOverMessageSprite, var8, var9, var24);
          }
          if (var24.boardState == 5) {
            BoardPresentationHelpers.drawBoardEndOverlay((byte) -104, UnderwaterBackground.gameCompletedMessageSprite, var8, var9, var24);
          }
          if (null != var24.displayedWarning) {
            BufferedFile.drawPowerUpWarning(destinationX, var24, var24.displayedWarning, scaleDivisor, 25, destinationY);
          }
          if (var24.pendingWarning != null) {
            BufferedFile.drawPowerUpWarning(destinationX, var24, var24.pendingWarning, scaleDivisor, 25, destinationY);
          }
          var28 = (ScorePopup) (var24.scorePopups.first(-81));
          if (obfuscationGuard < 14) {
            return;
          }
          while (var28 != null) {
            GameOverlayHelpers.drawScorePopup(var28, var24, 10030, destinationX, destinationY);
            var28 = (ScorePopup) (var24.scorePopups.next((byte) 116));
          }
          if (0 != (match.playerMaskThree & 1 << playerId)) {
            WidgetLayerStack.a(destinationX, var8, var9, (byte) 126, var24, destinationY, scaleDivisor);
          }
          if (0 != (1 << playerId & match.playerMaskTwo)) {
            GameRenderAudioHelpers.drawBoardMaskOverlay(destinationX, destinationY, var9, var24, var8, scaleDivisor, SpaceBackground.field_s.toLowerCase(), (byte) 123);
          }
          if ((match.playerMaskOne & 1 << playerId) != 0) {
            GameRenderAudioHelpers.drawBoardMaskOverlay(destinationX, destinationY, var9, var24, var8, scaleDivisor, CanvasInputCleanup.field_h.toLowerCase(), (byte) 76);
          }
          Rasterizer2D.resetClip();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("pi.FB(").append(obfuscationGuard).append(',').append(playerId).append(',').append(scaleDivisor).append(',').append(destinationY).append(',');
          if (match == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(destinationX).append(')').toString());
        }
    }

    final void writeBits(int bitCount, int obfuscationGuard, int value) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        value = value & IndexedSpriteHelpers.bitMasks[bitCount];
        if (obfuscationGuard != -17566) {
          this.finishBitRead((byte) 28);
        }
        while (this.writeBitsRemaining < bitCount) {
          bitCount = bitCount - this.writeBitsRemaining;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$1] = (byte)(this.data[fieldTemp$1] + (value >>> bitCount));
          this.data[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        }
        if (this.writeBitsRemaining == bitCount) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte)(this.data[fieldTemp$0] + value);
          this.data[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        } else {
          this.writeBitsRemaining = this.writeBitsRemaining - bitCount;
          this.data[this.position] = (byte)(this.data[this.position] + (value << this.writeBitsRemaining));
        }
    }

    final int readCipheredOpcode(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          emailPartTooLong = (LegacyEmailValidationError) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.data[fieldTemp$0] - this.opcodeCipher.nextInt(99);
    }

    final void finishBitRead(byte obfuscationGuard) {
        this.position = (this.bitPosition + 7) / 8;
        if (obfuscationGuard < 69) {
          RasterCacheSurface var3 = (RasterCacheSurface) null;
          BitPacketBuffer.a((RgbSprite) null, (RasterCacheSurface) null, 39, 118, (byte) 103, -79);
        }
    }

    final void readCipheredBytes(boolean obfuscationGuard, int destinationOffset, int length, byte[] destination) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 0;
          if (obfuscationGuard) {
            var7 = (byte[]) null;
            this.readCipheredBytes(true, 24, -63, (byte[]) null);
          }
          while (var5_int < length) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[destinationOffset + var5_int] = (byte)(this.data[fieldTemp$0] - this.opcodeCipher.nextInt(126));
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pi.GB(").append(obfuscationGuard).append(',').append(destinationOffset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(RgbSprite param0, RasterCacheSurface param1, int param2, int param3, byte param4, int param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-102, param1.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param1.width, param1.height, IntegerPowerHelpers.volcanicBackgroundColors[param2], 10792131);
          param0.drawTransparent((param1.width - param0.canvasWidth) / 2, -(75 / param3) - param0.canvasHeight + (param5 + param1.height));
          RasterStackHelpers.popRaster(-102);
          if (param4 < 6) {
            BitPacketBuffer.clearStaticReferences(102);
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pi.LB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int readBits(int bitCount, byte obfuscationGuard) {
        int previousByteIndex = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 84 % ((-27 - obfuscationGuard) / 58);
        int byteIndex = this.bitPosition >> 3;
        int availableBits = -(7 & this.bitPosition) + 8;
        int value = 0;
        this.bitPosition = this.bitPosition + bitCount;
        while (bitCount > availableBits) {
          previousByteIndex = byteIndex;
          byteIndex++;
          value = value + ((IndexedSpriteHelpers.bitMasks[availableBits] & this.data[previousByteIndex]) << bitCount - availableBits);
          bitCount = bitCount - availableBits;
          availableBits = 8;
        }
        if (availableBits == bitCount) {
          value = value + (this.data[byteIndex] & IndexedSpriteHelpers.bitMasks[availableBits]);
        } else {
          value = value + (this.data[byteIndex] >> -bitCount + availableBits & IndexedSpriteHelpers.bitMasks[bitCount]);
        }
        return value;
    }

    final void finishBitWrite(int obfuscationGuard) {
        if (8 > this.writeBitsRemaining) {
          this.writeBitsRemaining = 8;
          this.position = this.position + 1;
        }
        int var2 = 53 % ((obfuscationGuard + 14) / 35);
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        ScreenNavigationHelpers.quickChatChannel = 2;
        if (param0 != 21846) {
          return;
        }
        try {
          DualLinkNode.quickChatRecipient = param1;
          var5 = (CharSequence) ((Object) param1);
          QuickChatHelpDialog.field_Qb = ChatMessage.normalizePlayerName(var5, 96);
          CanvasResizeController.field_n = param2;
          QuickChatSineHelpers.activateDefaultQuickChatMenu((byte) -120);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pi.JB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_s = "Unpacking sound effects";
        emailPartTooLong = new LegacyEmailValidationError();
        readyToSendHandshake = new ConnectionPhase();
    }
}
