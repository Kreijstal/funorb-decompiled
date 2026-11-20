/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    private byte[] blockBuffer;
    private long[] roundScratch;
    static int field_h;
    private long[] blockWords;
    private byte[] messageBitLength;
    private long[] hash;
    private long[] roundKey;
    private int bufferByteCount;
    static String field_i;
    private int bufferBitCount;
    private long[] cipherState;

    final static void readArchiveKeyReply(byte param0) {
        ArchiveKeyRequest var1 = (ArchiveKeyRequest) (TutorialPage.field_a.first((byte) 87));
        if (var1 == null) {
          ServerConnectionState.closeServerConnection(-28036);
          return;
        }
        IsaacPacketBuffer var2 = RoadStripRenderer.field_e;
        if (param0 <= 68) {
          return;
        }
        var1.key = new int[]{var2.readInt(45), var2.readInt(-72), var2.readInt(-47), var2.readInt(79)};
        var1.unlink(0);
    }

    final void finishDigest(int param0, byte[] param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Sprite var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          this.blockBuffer[this.bufferByteCount] = (byte)BitwiseIntegerOperations.orInts((int) this.blockBuffer[this.bufferByteCount], 128 >>> LoginChoicePanel.andInts(7, this.bufferBitCount));
          this.bufferByteCount = this.bufferByteCount + 1;
          if (this.bufferByteCount > 32) {
            while (this.bufferByteCount < 64) {
              fieldTemp$0 = this.bufferByteCount;
              this.bufferByteCount = this.bufferByteCount + 1;
              this.blockBuffer[fieldTemp$0] = (byte) 0;
            }
            this.processBlock(true);
            this.bufferByteCount = 0;
          }
          while (this.bufferByteCount < 32) {
            fieldTemp$1 = this.bufferByteCount;
            this.bufferByteCount = this.bufferByteCount + 1;
            this.blockBuffer[fieldTemp$1] = (byte) 0;
          }
          ArrayOperations.copyBytes(this.messageBitLength, 0, this.blockBuffer, 32, 32);
          this.processBlock(true);
          var4_int = 0;
          var5 = param2;
          while (8 > var4_int) {
            var6 = this.hash[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[2 + var5] = (byte)(int)(var6 >>> 40);
            param1[var5 + 3] = (byte)(int)(var6 >>> 32);
            param1[4 + var5] = (byte)(int)(var6 >>> 24);
            param1[5 + var5] = (byte)(int)(var6 >>> 16);
            param1[6 + var5] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          if (param0 != 6934) {
            var9 = (Sprite) null;
            WhirlpoolHasher.drawScreenBlendedSprite(-73, -103, -36, (Sprite) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void reset(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.messageBitLength[var2] = (byte) 0;
        }
        this.blockBuffer[0] = (byte) 0;
        if (param0) {
          return;
        }
        this.bufferBitCount = 0;
        this.bufferByteCount = 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.hash[var2Lifetime1] = 0L;
        }
    }

    final static void setPopupAnchor(int param0, int param1, int param2) {
        Vector2f.field_i = param1;
        if (param0 > -32) {
          field_h = 30;
        }
        NanoTickClock.field_i = param2;
    }

    final static void configureMenuFonts(BitmapFont param0, BitmapFont param1, byte param2, int param3) {
        CheckboxWidget.field_G = param1;
        PlayerDataProtocol.field_a = param0;
        if (param2 > -39) {
          return;
        }
        try {
          IndexedSpriteState.field_j = param3;
          WhirlpoolHasher.setPopupAnchor(-90, SoftwareRasterizer.height / 2, SoftwareRasterizer.width / 2);
          StraightRoadSegment.setUiFontMetrics(param1.capitalHeight, param0.capitalHeight, param0.capitalHeight + param0.descent, param1.descent + param1.capitalHeight, (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "pa.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void drawScreenBlendedSprite(int param0, int param1, int param2, Sprite param3) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = HoldTheLine.field_D;
        try {
          var4_int = 0;
          var5 = 0;
          var6 = param3.width;
          var7 = param3.height;
          if (param1 < 0) {
            var6 = var6 + param1;
            var4_int = var4_int - param1;
            param1 = 0;
          }
          if (var6 + param1 > 640) {
            var6 = 640 - param1;
          }
          if (param0 < 0) {
            var7 = var7 + param0;
            var5 = var5 - param0;
            param0 = 0;
          }
          if (param0 + var7 > 480) {
            var7 = -param0 + 480;
          }
          var8 = var4_int + (param3.canvasWidth * (var5 + (var7 - 1)) - 1);
          var9 = (-1 + var7 + param0) * SoftwareRasterizer.width + param1 - 1;
          var13 = var7;
          while (var13 > 0) {
            for (var12 = var6; var12 > 0; var12--) {
              var9++;
              var11 = SoftwareRasterizer.pixels[var9];
              var8++;
              var10 = param3.pixels[var8];
              if (var10 != 0) {
                if (0 != var11) {
                  var15 = 255 & var11 >> 8;
                  var18 = var10 >> 8 & 255;
                  var14 = (var11 & 16711680) >> 16;
                  var19 = 255 & var10;
                  var16 = 255 & var11;
                  var17 = var10 >> 16 & 255;
                  var14 = var14 + (var17 - (var17 * var14 >> 8) - 1);
                  var16 = var16 + (-(var16 * var19 >> 8) + (var19 - 1));
                  var15 = var15 + (-1 - (var15 * var18 >> 8) + var18);
                  SoftwareRasterizer.pixels[var9] = BitwiseIntegerOperations.orInts(BitwiseIntegerOperations.orInts(var14 << 16, var15 << 8), var16);
                } else {
                  SoftwareRasterizer.pixels[var9] = var10;
                }
              }
            }
            var13--;
            var8 = var8 - (param3.canvasWidth + var6);
            var9 = var9 - (var6 + SoftwareRasterizer.width);
          }
          if (param2 <= 97) {
            field_h = -97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void processBlock(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = HoldTheLine.field_D;
        if (!param0) {
          return;
        }
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.blockWords[var2] = GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(ViewportSizingController.andLong(65280L, (long)this.blockBuffer[var3 + 6] << 8), GameKeyHandler.xorLongs(ViewportSizingController.andLong((long)this.blockBuffer[5 + var3] << 16, 16711680L), GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(GameKeyHandler.xorLongs(GameKeyHandler.xorLongs((long)this.blockBuffer[var3] << 56, ViewportSizingController.andLong(255L, (long)this.blockBuffer[1 + var3]) << 48), ViewportSizingController.andLong((long)this.blockBuffer[2 + var3], 255L) << 40), ViewportSizingController.andLong(1095216660480L, (long)this.blockBuffer[3 + var3] << 32)), ViewportSizingController.andLong((long)this.blockBuffer[4 + var3] << 24, 4278190080L)))), ViewportSizingController.andLong(255L, (long)this.blockBuffer[var3 + 7]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.hash[var2Lifetime1];
          arrayValue$1 = this.blockWords[var2Lifetime1];
          this.roundKey[var2Lifetime1] = dupTemp$0;
          this.cipherState[var2Lifetime1] = GameKeyHandler.xorLongs(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.roundScratch[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.roundScratch[var3Lifetime1] = GameKeyHandler.xorLongs(this.roundScratch[var3Lifetime1], WhirlpoolTables.roundTables[var4][LoginChoicePanel.andInts((int)(this.roundKey[LoginChoicePanel.andInts(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.roundKey[var3Lifetime1Lifetime1] = this.roundScratch[var3Lifetime1Lifetime1];
          }
          this.roundKey[0] = GameKeyHandler.xorLongs(this.roundKey[0], WhirlpoolTables.roundConstants[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.roundScratch[var3Lifetime1Lifetime2] = this.roundKey[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.roundScratch[var3Lifetime1Lifetime2] = GameKeyHandler.xorLongs(this.roundScratch[var3Lifetime1Lifetime2], WhirlpoolTables.roundTables[var7][LoginChoicePanel.andInts((int)(this.cipherState[LoginChoicePanel.andInts(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.cipherState[var3Lifetime1Lifetime3] = this.roundScratch[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.hash[var2Lifetime3] = GameKeyHandler.xorLongs(this.hash[var2Lifetime3], GameKeyHandler.xorLongs(this.cipherState[var2Lifetime3], this.blockWords[var2Lifetime3]));
        }
        return;
    }

    public static void clearSharedReferences(boolean param0) {
        field_i = null;
        if (!param0) {
          WhirlpoolHasher.clearSharedReferences(false);
        }
    }

    final void updateBits(byte[] param0, byte param1, long param2) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var9Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          var5_int = 0;
          var6 = -73 / ((-14 - param1) / 44);
          var7 = 7 & -(7 & (int)param2) + 8;
          var8 = this.bufferBitCount & 7;
          var10 = param2;
          var12 = 31;
          var13 = 0;
          while (var12 >= 0) {
            var13 = var13 + (((int)var10 & 255) + (255 & this.messageBitLength[var12]));
            this.messageBitLength[var12] = (byte)var13;
            var10 = var10 >>> 8;
            var13 = var13 >>> 8;
            var12--;
          }
          while (param2 > 8L) {
            var9 = 255 & param0[var5_int] << var7 | (255 & param0[1 + var5_int]) >>> -var7 + 8;
            if (var9 >= 0 &&
              var9 < 256) {
              this.blockBuffer[this.bufferByteCount] = (byte)BitwiseIntegerOperations.orInts((int) this.blockBuffer[this.bufferByteCount], var9 >>> var8);
              this.bufferByteCount = this.bufferByteCount + 1;
              this.bufferBitCount = this.bufferBitCount + (-var8 + 8);
              if (this.bufferBitCount == 512) {
                this.processBlock(true);
                this.bufferByteCount = 0;
                this.bufferBitCount = 0;
              }
              this.blockBuffer[this.bufferByteCount] = (byte)LoginChoicePanel.andInts(var9 << -var8 + 8, 255);
              param2 = param2 - 8L;
              var5_int++;
              this.bufferBitCount = this.bufferBitCount + var8;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param2) {
            stackIn_15_0 = 255;
            stackIn_15_1 = param0[var5_int] << var7;
            var9Lifetime1 = stackIn_15_0 & stackIn_15_1;
            this.blockBuffer[this.bufferByteCount] = (byte)BitwiseIntegerOperations.orInts((int) this.blockBuffer[this.bufferByteCount], var9Lifetime1 >>> var8);
          } else {
            var9Lifetime1 = 0;
          }
          if (param2 + (long)var8 < 8L) {
            this.bufferBitCount = (int)((long)this.bufferBitCount + param2);
          } else {
            param2 = param2 - (long)(-var8 + 8);
            this.bufferBitCount = this.bufferBitCount + (8 - var8);
            this.bufferByteCount = this.bufferByteCount + 1;
            if (this.bufferBitCount == 512) {
              this.processBlock(true);
              this.bufferByteCount = 0;
              this.bufferBitCount = 0;
            }
            this.blockBuffer[this.bufferByteCount] = (byte)LoginChoicePanel.andInts(var9Lifetime1 << 8 - var8, 255);
            this.bufferBitCount = this.bufferBitCount + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("pa.I(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    WhirlpoolHasher() {
        this.blockBuffer = new byte[64];
        this.roundScratch = new long[8];
        this.hash = new long[8];
        this.blockWords = new long[8];
        this.bufferBitCount = 0;
        this.roundKey = new long[8];
        this.bufferByteCount = 0;
        this.cipherState = new long[8];
        this.messageBitLength = new byte[32];
    }

    static {
        field_i = "Brake/reverse";
    }
}
