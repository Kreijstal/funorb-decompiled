/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    private long[] hashState;
    static int[][] unitDefinitions;
    private int bufferedBits;
    private long[] cipherState;
    private int bufferPosition;
    private byte[] bitLength;
    static int[] field_f;
    private long[] roundKey;
    private long[] blockWords;
    static ClientUiComponent field_h;
    static boolean field_g;
    private long[] roundTemporary;
    private byte[] inputBlock;

    final static void d(int param0) {
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (FullscreenFocusCanvas.gameplayController.field_u) {
          if (0 == (1 << FullscreenFocusCanvas.gameplayController.controlledPlayerId & FullscreenFocusCanvas.gameplayController.battlefield.field_i)) {
            if (FullscreenFocusCanvas.gameplayController.battlefield.field_i != 0) {
              DisplacedUnitMarker.field_t[12] = CampaignUnitOverride.field_c;
            } else {
              if ((1 << FullscreenFocusCanvas.gameplayController.controlledPlayerId | FullscreenFocusCanvas.gameplayController.field_hb) != (1 << FullscreenFocusCanvas.gameplayController.battlefield.playerCount) - 1) {
                DisplacedUnitMarker.field_t[12] = BoundedUrlRequest.field_e;
              } else {
                DisplacedUnitMarker.field_t[12] = TabbedPanel.field_Nb;
              }
            }
          } else {
            DisplacedUnitMarker.field_t[12] = ti.field_a;
          }
        } else {
          if (0 != (1 << FullscreenFocusCanvas.gameplayController.controlledPlayerId & FullscreenFocusCanvas.gameplayController.battlefield.field_i)) {
            DisplacedUnitMarker.field_t[12] = is.field_c;
          } else {
            if (FullscreenFocusCanvas.gameplayController.battlefield.field_i != 0) {
              DisplacedUnitMarker.field_t[12] = BitmapTextWidgetPainter.field_s;
            } else {
              if (-1 + (1 << FullscreenFocusCanvas.gameplayController.battlefield.playerCount) != (1 << FullscreenFocusCanvas.gameplayController.controlledPlayerId | FullscreenFocusCanvas.gameplayController.field_hb)) {
                DisplacedUnitMarker.field_t[12] = db.field_h;
              } else {
                DisplacedUnitMarker.field_t[12] = ji.field_b;
              }
            }
          }
        }
        if (param0 != 7242) {
          WhirlpoolHasher.writeWatchedRoomRequest(119, -40, (byte) -61);
        }
    }

    final void updateBits(byte obfuscationGuard, long bitCount, byte[] input) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int inputIndex = 0;
        RuntimeException var5 = null;
        int sourceBitGap = 0;
        int bufferBitOffset = 0;
        int alignedByte = 0;
        long remainingLengthBits = 0L;
        int lengthByteIndex = 0;
        int lengthCarry = 0;
        int obfuscationControl = 0;
        int tailByte;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          inputIndex = 0;
          sourceBitGap = 8 - ((int)bitCount & 7) & 7;
          bufferBitOffset = 7 & this.bufferedBits;
          remainingLengthBits = bitCount;
          if (obfuscationGuard > 0) {
            WhirlpoolHasher.a(-47);
          }
          lengthByteIndex = 31;
          lengthCarry = 0;
          while (lengthByteIndex >= 0) {
            lengthCarry = lengthCarry + ((this.bitLength[lengthByteIndex] & 255) + (255 & (int)remainingLengthBits));
            this.bitLength[lengthByteIndex] = (byte)lengthCarry;
            lengthCarry = lengthCarry >>> 8;
            remainingLengthBits = remainingLengthBits >>> 8;
            lengthByteIndex--;
          }
          while (bitCount > 8L) {
            alignedByte = input[inputIndex] << sourceBitGap & 255 | (255 & input[1 + inputIndex]) >>> -sourceBitGap + 8;
            if (0 <= alignedByte &&
              alignedByte < 256) {
              this.inputBlock[this.bufferPosition] = (byte)AccountRegistrationDialog.bitwiseOr((int) this.inputBlock[this.bufferPosition], alignedByte >>> bufferBitOffset);
              this.bufferPosition = this.bufferPosition + 1;
              this.bufferedBits = this.bufferedBits + (8 - bufferBitOffset);
              if (this.bufferedBits == 512) {
                this.compressBlock(-11);
                this.bufferedBits = 0;
                this.bufferPosition = 0;
              }
              this.inputBlock[this.bufferPosition] = (byte)rn.bitwiseAnd(255, alignedByte << -bufferBitOffset + 8);
              inputIndex++;
              this.bufferedBits = this.bufferedBits + bufferBitOffset;
              bitCount = bitCount - 8L;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (bitCount <= 0L) {
            tailByte = 0;
          } else {
            tailByte = input[inputIndex] << sourceBitGap & 255;
            this.inputBlock[this.bufferPosition] = (byte)AccountRegistrationDialog.bitwiseOr((int) this.inputBlock[this.bufferPosition], tailByte >>> bufferBitOffset);
          }
          if (bitCount + (long)bufferBitOffset >= 8L) {
            this.bufferedBits = this.bufferedBits + (8 - bufferBitOffset);
            bitCount = bitCount - (long)(8 - bufferBitOffset);
            this.bufferPosition = this.bufferPosition + 1;
            if (this.bufferedBits == 512) {
              this.compressBlock(-11);
              this.bufferedBits = 0;
              this.bufferPosition = 0;
            }
            this.inputBlock[this.bufferPosition] = (byte)rn.bitwiseAnd(255, tailByte << -bufferBitOffset + 8);
            this.bufferedBits = this.bufferedBits + (int)bitCount;
          } else {
            this.bufferedBits = (int)((long)this.bufferedBits + bitCount);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("bw.C(").append(obfuscationGuard).append(',').append(bitCount).append(',');
          if (input == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aj var4 = null;
        wj var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (aj) (GameEvent.field_r.first((byte) 110));
          while (var4 != null) {
            BirthDateChatEnableForm.a((byte) -71, var4, param1);
            var4 = (aj) (GameEvent.field_r.next((byte) 123));
          }
          var5 = (wj) (BattleCharacter.field_c.first((byte) 117));
          while (var5 != null) {
            gn.a(param1, var5, 0);
            var5 = (wj) (BattleCharacter.field_c.next((byte) 123));
          }
          if (param0 < 120) {
            unitDefinitions = (int[][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "bw.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void reset(int obfuscationGuard) {
        int lengthByteIndex = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int hashWordIndex;
        for (lengthByteIndex = 0; 32 > lengthByteIndex; lengthByteIndex++) {
          this.bitLength[lengthByteIndex] = (byte) 0;
        }
        this.bufferedBits = 0;
        this.inputBlock[0] = (byte) 0;
        if (obfuscationGuard != 200) {
          this.blockWords = (long[]) null;
        }
        this.bufferPosition = 0;
        for (hashWordIndex = 0; hashWordIndex < 8; hashWordIndex++) {
          this.hashState[hashWordIndex] = 0L;
        }
    }

    final static void writeWatchedRoomRequest(int packetOpcode, int roomId, byte obfuscationGuard) {
        LobbyRoom var6 = null;
        LobbyRoom var7 = null;
        CipherPacketBuffer var4 = null;
        if (roomId != oo.watchedRoomId) {
          var6 = (LobbyRoom) (ClippedWidgetContainer.lobbyRoomsById.get((byte) -27, (long)oo.watchedRoomId));
          var7 = var6;
          oo.watchedRoomId = roomId;
          if (var7 != null) {
            var7.playerNames = null;
          }
          var4 = EmailValidator.outgoingPacket;
          var4.writeCipheredOpcode(obfuscationGuard ^ -32211, packetOpcode);
          var4.writeByte(1, 3);
          var4.writeByte(1, 11);
          var4.writeShort(true, roomId);
        }
        if (obfuscationGuard != -116) {
          unitDefinitions = (int[][]) null;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -28911) {
          return;
        }
        unitDefinitions = (int[][]) null;
        field_h = null;
    }

    private final void compressBlock(int obfuscationGuard) {
        long hashWord = 0L;
        long blockWord = 0L;
        int blockWordIndex;
        int inputByteIndex;
        int keyTableIndex;
        int keyByteShift;
        int obfuscationControl;
        int cipherTableIndex;
        int initialStateIndex;
        int round;
        int feedForwardIndex;
        int keyTransformIndex;
        int unusedCipherTableStart;
        int cipherByteShift;
        int keyCopyIndex;
        int cipherTransformIndex;
        int cipherCopyIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        blockWordIndex = 0;
        inputByteIndex = 0;
        while (blockWordIndex < 8) {
          this.blockWords[blockWordIndex] = BufferedFile.a(we.a((long)this.inputBlock[7 + inputByteIndex], 255L), BufferedFile.a(we.a((long)this.inputBlock[inputByteIndex + 6], 255L) << 8, BufferedFile.a(BufferedFile.a(BufferedFile.a(BufferedFile.a(BufferedFile.a((long)this.inputBlock[inputByteIndex] << 56, we.a((long)this.inputBlock[inputByteIndex + 1] << 48, 71776119061217280L)), we.a((long)this.inputBlock[inputByteIndex + 2], 255L) << 40), we.a((long)this.inputBlock[3 + inputByteIndex], 255L) << 32), we.a(255L, (long)this.inputBlock[4 + inputByteIndex]) << 24), we.a((long)this.inputBlock[inputByteIndex + 5], 255L) << 16)));
          blockWordIndex++;
          inputByteIndex += 8;
        }
        for (initialStateIndex = 0; initialStateIndex < 8; initialStateIndex++) {
          hashWord = this.hashState[initialStateIndex];
          blockWord = this.blockWords[initialStateIndex];
          this.roundKey[initialStateIndex] = hashWord;
          this.cipherState[initialStateIndex] = BufferedFile.a(blockWord, hashWord);
        }
        for (round = 1; round <= 10; round++) {
          for (keyTransformIndex = 0; 8 > keyTransformIndex; keyTransformIndex++) {
            this.roundTemporary[keyTransformIndex] = 0L;
            keyTableIndex = 0;
            keyByteShift = 56;
            while (keyTableIndex < 8) {
              this.roundTemporary[keyTransformIndex] = BufferedFile.a(this.roundTemporary[keyTransformIndex], ClientConnectionState.whirlpoolRoundTables[keyTableIndex][rn.bitwiseAnd(255, (int)(this.roundKey[rn.bitwiseAnd(7, keyTransformIndex - keyTableIndex)] >>> keyByteShift))]);
              keyByteShift -= 8;
              keyTableIndex++;
            }
          }
          for (keyCopyIndex = 0; keyCopyIndex < 8; keyCopyIndex++) {
            this.roundKey[keyCopyIndex] = this.roundTemporary[keyCopyIndex];
          }
          this.roundKey[0] = BufferedFile.a(this.roundKey[0], ClientConnectionState.whirlpoolRoundConstants[round]);
          for (cipherTransformIndex = 0; cipherTransformIndex < 8; cipherTransformIndex++) {
            this.roundTemporary[cipherTransformIndex] = this.roundKey[cipherTransformIndex];
            cipherTableIndex = 0;
            unusedCipherTableStart = cipherTableIndex;
            cipherByteShift = 56;
            while (cipherTableIndex < 8) {
              this.roundTemporary[cipherTransformIndex] = BufferedFile.a(this.roundTemporary[cipherTransformIndex], ClientConnectionState.whirlpoolRoundTables[cipherTableIndex][rn.bitwiseAnd((int)(this.cipherState[rn.bitwiseAnd(cipherTransformIndex - cipherTableIndex, 7)] >>> cipherByteShift), 255)]);
              cipherByteShift -= 8;
              cipherTableIndex++;
            }
          }
          for (cipherCopyIndex = 0; cipherCopyIndex < 8; cipherCopyIndex++) {
            this.cipherState[cipherCopyIndex] = this.roundTemporary[cipherCopyIndex];
          }
        }
        if (obfuscationGuard != -11) {
          this.reset(65);
        }
        for (feedForwardIndex = 0; feedForwardIndex < 8; feedForwardIndex++) {
          this.hashState[feedForwardIndex] = BufferedFile.a(this.hashState[feedForwardIndex], BufferedFile.a(this.blockWords[feedForwardIndex], this.cipherState[feedForwardIndex]));
        }
    }

    WhirlpoolHasher() {
        this.bufferedBits = 0;
        this.bitLength = new byte[32];
        this.hashState = new long[8];
        this.bufferPosition = 0;
        this.blockWords = new long[8];
        this.roundKey = new long[8];
        this.cipherState = new long[8];
        this.roundTemporary = new long[8];
        this.inputBlock = new byte[64];
    }

    final void finishDigest(byte[] output, int outputOffset, boolean obfuscationGuard) {
        int overflowPaddingIndex = 0;
        int lengthPaddingIndex = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int hashWordIndex = 0;
        RuntimeException var4 = null;
        int digestByteIndex = 0;
        long hashWord = 0L;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.inputBlock[this.bufferPosition] = (byte)AccountRegistrationDialog.bitwiseOr((int) this.inputBlock[this.bufferPosition], 128 >>> rn.bitwiseAnd(this.bufferedBits, 7));
          this.bufferPosition = this.bufferPosition + 1;
          if (32 < this.bufferPosition) {
            while (64 > this.bufferPosition) {
              overflowPaddingIndex = this.bufferPosition;
              this.bufferPosition = this.bufferPosition + 1;
              this.inputBlock[overflowPaddingIndex] = (byte) 0;
            }
            this.compressBlock(-11);
            this.bufferPosition = 0;
          }
          while (this.bufferPosition < 32) {
            lengthPaddingIndex = this.bufferPosition;
            this.bufferPosition = this.bufferPosition + 1;
            this.inputBlock[lengthPaddingIndex] = (byte) 0;
          }
          if (!obfuscationGuard) {
            WhirlpoolHasher.a(54, 79);
          }
          vm.a(this.bitLength, 0, this.inputBlock, 32, 32);
          this.compressBlock(-11);
          hashWordIndex = 0;
          digestByteIndex = outputOffset;
          while (hashWordIndex < 8) {
            hashWord = this.hashState[hashWordIndex];
            output[digestByteIndex] = (byte)(int)(hashWord >>> 56);
            output[1 + digestByteIndex] = (byte)(int)(hashWord >>> 48);
            output[digestByteIndex + 2] = (byte)(int)(hashWord >>> 40);
            output[digestByteIndex + 3] = (byte)(int)(hashWord >>> 32);
            output[4 + digestByteIndex] = (byte)(int)(hashWord >>> 24);
            output[digestByteIndex + 5] = (byte)(int)(hashWord >>> 16);
            output[6 + digestByteIndex] = (byte)(int)(hashWord >>> 8);
            output[digestByteIndex + 7] = (byte)(int)hashWord;
            digestByteIndex += 8;
            hashWordIndex++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bw.E(");
          if (output == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(outputOffset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_f = new int[]{0, 108, 28, 12, 110, 69};
        unitDefinitions = new int[][]{new int[]{0, -1, 1, 6, 5, 5, 1, 1, 50, 0, 512, 0, 19}, new int[]{4, -1, 2, 6, 20, 7, 1, 1, 400, 0, 0, 0, -1}, new int[]{1, -1, 2, 4, 20, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{2, -1, 3, 6, 7, 3, 2, 3, 125, 0, 512, 0, 19}, new int[]{4, -1, 5, 6, 40, 7, 1, 2, 750, 2, 0, 0, 11}, new int[]{1, -1, 4, 4, 35, 3, 1, 1, 300, 1, 0, 0, -1}, new int[]{1, -1, 4, 6, 30, 3, 1, 1, 400, 0, 6144, 0, 21}, new int[]{5, -1, 5, 7, 5, 3, 1, 1, 200, 0, 1152, 0, -1}, new int[]{1, 0, 1, 6, 10, 5, 1, 1, 100, 0, 0, 0, -1}, new int[]{4, 0, 1, 6, 5, 7, 1, 1, 100, 0, 0, 0, -1}, new int[]{5, 0, 1, 6, 10, 3, 1, 1, 150, 0, 38, 0, 0}, new int[]{3, 0, 3, 3, 20, 3, 3, 5, 250, 0, 0, 0, -1}, new int[]{1, 0, 2, 5, 25, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{0, 0, 3, 8, 30, 3, 1, 1, 350, 0, 0, 0, -1}, new int[]{2, 0, 4, 9, 25, 5, 1, 3, 300, 0, 0, 3, -1}, new int[]{1, 0, 3, 4, 40, 3, 1, 1, 350, 0, 0, 3, -1}, new int[]{2, 0, 2, 6, 20, 5, 2, 3, 200, 0, 0, 2, -1}, new int[]{5, 0, 4, 6, 20, 3, 1, 1, 300, 0, 1030, 4, 22}, new int[]{4, 0, 5, 8, 40, 7, 1, 3, 800, 1, 0, 5, 11}, new int[]{1, 1, 1, 6, 10, 5, 1, 1, 100, 0, 0, 0, -1}, new int[]{0, 1, 1, 5, 15, 1, 1, 1, 100, 0, 256, 0, 18}, new int[]{5, 1, 1, 6, 10, 3, 1, 1, 150, 0, 8, 0, 2}, new int[]{3, 1, 3, 3, 20, 3, 3, 5, 250, 0, 0, 0, -1}, new int[]{1, 1, 2, 5, 25, 3, 1, 1, 250, 0, 0, 0, -1}, new int[]{1, 1, 4, 4, 50, 3, 1, 1, 450, 1, 0, 0, -1}, new int[]{2, 1, 2, 6, 20, 5, 2, 3, 200, 0, 0, 2, -1}, new int[]{0, 1, 3, 8, 30, 3, 1, 1, 350, 0, 0, 3, -1}, new int[]{0, 1, 3, 3, 10, 1, 1, 1, 100, 0, 4097, 3, 9}, new int[]{4, 1, 4, 6, 30, 7, 1, 3, 600, 0, 0, 4, 11}, new int[]{7, 1, 5, 3, 50, 3, 1, 1, 750, 0, 0, 5, 13}, new int[]{0, 2, 2, 10, 15, 5, 1, 1, 200, 0, 0, 0, -1}, new int[]{0, 2, 1, 8, 10, 5, 1, 1, 150, 0, 0, 0, -1}, new int[]{5, 2, 1, 6, 10, 3, 1, 1, 150, 0, 20, 0, 1}, new int[]{1, 2, 2, 4, 20, 3, 1, 1, 175, 0, 0, 0, -1}, new int[]{1, 2, 3, 4, 10, 3, 1, 1, 250, 0, 1024, 3, -1}, new int[]{1, 2, 4, 4, 40, 5, 1, 1, 400, 1, 0, 0, -1}, new int[]{1, 2, 2, 6, 25, 5, 1, 1, 250, 0, 0, 2, -1}, new int[]{1, 2, 4, 3, 45, 5, 1, 1, 400, 1, 0, 4, -1}, new int[]{4, 2, 3, 10, 20, 7, 1, 1, 450, 0, 0, 0, -1}, new int[]{6, 2, 4, 1, 5, 1, 0, 0, 100, 0, 1025, 4, 8}, new int[]{7, 2, 5, 4, 45, 3, 1, 1, 700, 0, 1, 5, 14}, new int[]{4, 3, 2, 10, 5, 7, 1, 1, 150, 0, 0, 0, -1}, new int[]{0, 3, 1, 5, 15, 3, 1, 1, 150, 0, 0, 0, -1}, new int[]{5, 3, 3, 6, 20, 5, 1, 1, 300, 0, 0, 12, 5}, new int[]{1, 3, 3, 6, 30, 5, 1, 1, 300, 0, 0, 0, -1}, new int[]{0, 3, 3, 6, 8, 3, 1, 1, 50, 0, 0, 12, -1}, new int[]{0, 3, 2, 8, 20, 5, 1, 1, 250, 0, 0, 0, -1}, new int[]{1, 3, 2, 6, 25, 5, 1, 1, 250, 0, 0, 0, -1}, new int[]{2, 3, 2, 6, 25, 5, 2, 4, 300, 0, 0, 8, -1}, new int[]{1, 3, 4, 6, 40, 5, 1, 1, 400, 0, 0, 16, -1}, new int[]{0, 3, 4, 8, 35, 5, 1, 1, 400, 0, 0, 0, -1}, new int[]{1, 3, 5, 6, 25, 3, 1, 1, 750, 0, 1, 20, 7}, new int[]{1, 4, 1, 5, 5, 5, 1, 1, 50, 0, 0, 0, -1}, new int[]{5, 4, 1, 5, 10, 5, 1, 1, 150, 0, 0, 0, 3}, new int[]{1, 4, 1, 3, 20, 3, 1, 1, 175, 1, 0, 0, -1}, new int[]{1, 4, 2, 4, 25, 3, 1, 1, 225, 1, 0, 0, -1}, new int[]{1, 4, 4, 4, 30, 3, 1, 1, 300, 1, 4096, 16, 20}, new int[]{1, 4, 2, 6, 15, 4, 1, 1, 150, 0, 2048, 12, 10}, new int[]{5, 4, 3, 3, 20, 3, 1, 1, 300, 1, 0, 12, 16}, new int[]{1, 4, 3, 3, 40, 5, 1, 1, 500, 1, 0, 0, 4}, new int[]{1, 4, 4, 5, 30, 5, 1, 1, 275, 0, 0, 0, -1}, new int[]{1, 4, 3, 7, 20, 3, 1, 1, 200, 1, 0, 12, -1}, new int[]{7, 4, 5, 3, 55, 5, 1, 1, 800, 2, 0, 20, 12}, new int[]{5, 5, 4, 3, 50, 4, 1, 1, 600, 2, 0, 16, 17}, new int[]{0, 5, 1, 6, 15, 3, 1, 1, 150, 0, 0, 0, -1}, new int[]{1, 5, 3, 3, 35, 2, 1, 1, 300, 0, 320, 0, 18}, new int[]{4, 5, 2, 7, 10, 7, 1, 1, 200, 0, 65, 8, 6}, new int[]{2, 5, 2, 6, 20, 7, 2, 3, 200, 0, 0, 0, -1}, new int[]{1, 5, 1, 6, 10, 3, 1, 1, 100, 0, 0, 0, -1}, new int[]{1, 5, 2, 6, 25, 5, 1, 1, 250, 0, 0, 8, -1}, new int[]{0, 5, 1, 3, 20, 3, 1, 1, 200, 0, 4096, 0, 20}, new int[]{3, 5, 3, 4, 30, 5, 3, 5, 450, 0, 64, 12, 6}, new int[]{5, 5, 4, 6, 25, 4, 1, 1, 350, 1, 1, 0, -1}, new int[]{7, 5, 5, 3, 45, 5, 1, 1, 700, 1, 1, 20, 15}, new int[]{4, -1, 5, 6, 99, 7, 1, 3, 2000, 2, 0, 0, 11}, new int[]{1, 2, 3, 4, 20, 3, 2, 7, 250, 0, 1024, 3, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{4, -1, 5, 6, 40, 7, 1, 2, 750, 2, 0, 0, 11}, new int[]{3, 0, 3, 3, 30, 3, 3, 5, 250, 2, 0, 0, -1}, new int[]{1, 2, 2, 6, 40, 5, 1, 1, 250, 2, 0, 2, -1}, new int[]{1, 0, 2, 6, 45, 5, 1, 1, 250, 2, 0, 0, -1}, new int[]{2, 0, 2, 6, 30, 5, 2, 3, 200, 2, 0, 2, -1}, new int[]{1, 2, 2, 6, 45, 5, 1, 1, 250, 2, 0, 2, -1}, new int[]{1, 0, 4, 5, 30, 5, 1, 1, 275, 2, 0, 0, -1}, new int[]{5, 1, 1, 6, 30, 3, 1, 1, 150, 2, 8, 0, 2}};
    }
}
