/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    static int field_j;
    static String field_m;
    byte[] data;
    static String[] field_i;

    final void writeMedium(byte obfuscationGuard, int value) {
        if (obfuscationGuard != 47) {
          byte[] var4 = (byte[]) null;
          this.readBytes(99, (byte[]) null, 100, 7);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(value >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(value >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)value;
    }

    public static void clearStaticStrings(int obfuscationGuard) {
        field_i = null;
        if (obfuscationGuard != 0) {
          field_j = -113;
        }
        field_m = null;
    }

    final int readLargeSmart(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.position = -16;
        }
        if (0 <= this.data[this.position]) {
          return this.readUnsignedShort(65280);
        }
        return 2147483647 & this.readInt(255);
    }

    final byte readByte(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          field_j = 8;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.data[fieldTemp$0];
    }

    final void writeSignedSmart(int value, byte obfuscationGuard) {
        if (value < 64 &&
          -64 <= value) {
          this.writeByte(80, value + 64);
          return;
        }
        if (value < 16384 &&
          -16384 <= value) {
          this.writeShort((byte) 121, 49152 + value);
          return;
        }
        if (obfuscationGuard < 110) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readInt(int obfuscationGuard) {
        if (obfuscationGuard != 255) {
          field_m = (String) null;
        }
        this.position = this.position + 4;
        return (255 & this.data[-1 + this.position]) + (((255 & this.data[this.position - 3]) << 16) + ((255 & this.data[this.position - 4]) << 24)) + (this.data[this.position - 2] << 8 & 65280);
    }

    final void applyRsa(java.math.BigInteger exponent, java.math.BigInteger modulus, int obfuscationGuard) {
        int inputLength = 0;
        byte[] inputBytes = null;
        java.math.BigInteger plaintext = null;
        java.math.BigInteger ciphertext = null;
        byte[] outputBytes = null;
        try {
          inputLength = this.position;
          this.position = 0;
          inputBytes = new byte[inputLength];
          this.readBytes(0, inputBytes, 110, inputLength);
          plaintext = new java.math.BigInteger(inputBytes);
          ciphertext = plaintext.modPow(exponent, modulus);
          outputBytes = ciphertext.toByteArray();
          this.position = 0;
          this.writeShort((byte) 126, outputBytes.length);
          if (obfuscationGuard != 19775) {
            this.position = -13;
          }
          this.writeBytes(outputBytes, obfuscationGuard - 19776, 0, outputBytes.length);
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "wq.FA(" + (exponent != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void encryptBlocks(int obfuscationGuard, int[] key) {
        int roundsBeforeDecrement = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String keySummary = null;
        RuntimeException caughtFailure = null;
        int blockCount = 0;
        RuntimeException failure = null;
        int blockIndex = 0;
        int leftWord = 0;
        int rightWord = 0;
        int roundSum = 0;
        int roundDelta = 0;
        int roundsRemaining = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          blockCount = this.position / 8;
          this.position = 0;
          blockIndex = 0;
          while (true) {
            if (blockIndex >= blockCount) {
              if (obfuscationGuard != 18146) {
                this.readUnsignedSmart(-91);
              }
              return;
            }
            leftWord = this.readInt(255);
            rightWord = this.readInt(255);
            roundSum = 0;
            roundDelta = -1640531527;
            roundsRemaining = 32;
            while (true) {
              roundsBeforeDecrement = roundsRemaining;
              roundsRemaining--;
              if (roundsBeforeDecrement > 0) {
                leftWord = leftWord + (rightWord + (rightWord << 4 ^ rightWord >>> 5) ^ roundSum + key[3 & roundSum]);
                roundSum = roundSum + roundDelta;
                rightWord = rightWord + (key[(roundSum & 6958) >>> 11] + roundSum ^ (leftWord >>> 5 ^ leftWord << 4) + leftWord);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(leftWord, (byte) -79);
            this.writeInt(rightWord, (byte) -79);
            blockIndex++;
          }
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("wq.HA(").append(obfuscationGuard).append(',');
          if (key == null) {
            keySummary = "null";
          } else {
            keySummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(keySummary).append(')').toString());
        }
    }

    final int readSignedSmart(int obfuscationGuard) {
        if (obfuscationGuard != -1342) {
          this.readUnsignedSmart(54);
        }
        int var2 = this.data[this.position] & 255;
        if (var2 >= 128) {
          return this.readUnsignedShort(65280) - 49152;
        }
        return this.readUnsignedByte(255) - 64;
    }

    final String readCp1252String(int terminatorAdjustment) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.data[fieldTemp$0] != 0);
        var3 = terminatorAdjustment + (this.position - var2);
        if (var3 != 0) {
          return AccountDateHelpers.decodeCp1252(var3, -113, this.data, var2);
        }
        return "";
    }

    final void writeInt(int value, byte obfuscationGuard) {
        if (obfuscationGuard != -79) {
          this.writeLong56((byte) 92, 64L);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(value >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(value >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(value >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)value;
    }

    final void writeCp1252String(String text, int obfuscationGuard) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = text.indexOf('\0');
          if (~var3_int <= obfuscationGuard) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) text);
          this.position = this.position + ScrollPaneWithFooter.encodeCp1252(text.length(), this.data, (byte) 86, this.position, var4, 0);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wq.OA(" + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void backfillIntLength(byte obfuscationGuard, int length) {
        if (obfuscationGuard > -26) {
          this.writeLong40(-112L, (byte) -53);
        }
        this.data[this.position + (-length - 4)] = (byte)(length >> 24);
        this.data[-3 - length + this.position] = (byte)(length >> 16);
        this.data[-2 - length + this.position] = (byte)(length >> 8);
        this.data[-1 + this.position - length] = (byte)length;
    }

    final void writeUnsignedSmart(int obfuscationGuard, int value) {
        if (value >= 0 &&
          value < 128) {
          this.writeByte(-113, value);
          return;
        }
        if (obfuscationGuard >= ~value &&
          value < 32768) {
          this.writeShort((byte) 109, value + 32768);
          return;
        }
        throw new IllegalArgumentException();
    }

    final String readNullableCp1252String(int obfuscationGuard) {
        if (this.data[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (obfuscationGuard != 0) {
          return (String) null;
        }
        return this.readCp1252String(-1);
    }

    final void writeVarInt(byte obfuscationGuard, int value) {
        if ((value & -128) != 0) {
          if ((-16384 & value) != 0) {
            if (0 != (value & -2097152)) {
              if (0 != (-268435456 & value)) {
                this.writeByte(-115, value >>> 28 | 128);
              }
              this.writeByte(125, (270066403 | value) >>> 21);
            }
            this.writeByte(105, 128 | value >>> 14);
          }
          this.writeByte(-100, value >>> 7 | 128);
        }
        this.writeByte(-104, 127 & value);
        if (obfuscationGuard > -53) {
          this.readInt(-13);
        }
    }

    final void writeBytes(byte[] source, int obfuscationGuard, int sourceOffset, int length) {
        int sourceIndex = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -1) {
            field_j = 69;
          }
          for (sourceIndex = sourceOffset; sourceIndex < sourceOffset + length; sourceIndex++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.data[fieldTemp$0] = source[sourceIndex];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wq.RA(");
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(',').append(sourceOffset).append(',').append(length).append(')').toString());
        }
    }

    final int readShort(int obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard <= 125) {
          field_m = (String) null;
        }
        int var2 = ((255 & this.data[-2 + this.position]) << 8) + (this.data[-1 + this.position] & 255);
        if (32767 < var2) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final void padToPosition(byte obfuscationGuard, int endPosition) {
        int paddingIndex = 0;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -74) {
          this.readUnsignedByte(-125);
        }
        while (endPosition > this.position) {
          paddingIndex = this.position;
          this.position = this.position + 1;
          this.data[paddingIndex] = (byte) 0;
        }
    }

    private final void writeLong56(byte obfuscationGuard, long value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(value >> 48);
        if (obfuscationGuard != -109) {
          field_j = -111;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(value >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(value >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(value >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)(value >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$5] = (byte)(int)(value >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$6] = (byte)(int)value;
    }

    final void readBytes(int destinationOffset, byte[] destination, int obfuscationGuard, int length) {
        int destinationIndex = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          for (destinationIndex = destinationOffset; destinationIndex < destinationOffset + length; destinationIndex++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[destinationIndex] = this.data[fieldTemp$0];
          }
          if (obfuscationGuard <= 109) {
            this.writeLong(-126, -11L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wq.F(").append(destinationOffset).append(',');
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(',').append(length).append(')').toString());
        }
    }

    final void backfillByteLength(byte obfuscationGuard, int length) {
        this.data[-1 - length + this.position] = (byte)length;
        if (obfuscationGuard < 112) {
          this.readInt(-32);
        }
    }

    final void writeLong40(long value, byte obfuscationGuard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(value >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(value >> 24);
        if (obfuscationGuard != -32) {
          field_i = (String[]) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(value >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(value >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)value;
    }

    final int readUnsignedByte(int obfuscationGuard) {
        if (obfuscationGuard != 255) {
          this.writeLong56((byte) 71, 82L);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.data[fieldTemp$0];
    }

    final int readUnsignedSmart(int obfuscationGuard) {
        if (obfuscationGuard != -32768) {
          this.verifyCrc32((byte) 73);
        }
        int var2 = this.data[this.position] & 255;
        if (var2 >= 128) {
          return -32768 + this.readUnsignedShort(65280);
        }
        return this.readUnsignedByte(255);
    }

    final void writePrefixedCp1252String(int obfuscationGuard, String text) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = text.indexOf('\0');
          if (obfuscationGuard <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) text);
          this.position = this.position + ScrollPaneWithFooter.encodeCp1252(text.length(), this.data, (byte) 86, this.position, var4, 0);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wq.BA(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void decryptBlocks(int[] key, int startOffset, int endOffset, byte obfuscationGuard) {
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int var7Lifetime1;
        try {
          var5_int = this.position;
          this.position = startOffset;
          var6 = (-startOffset + endOffset) / 8;
          for (var7 = 0; var7 < var6; var7++) {
            var8 = this.readInt(255);
            var9 = this.readInt(255);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var9 = var9 - (var8 + (var8 << 4 ^ var8 >>> 5) ^ key[var10 >>> 11 & 367001603] + var10);
              var10 = var10 - var11;
              var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ key[3 & var10] + var10);
            }
            this.position = this.position - 8;
            this.writeInt(var8, (byte) -79);
            this.writeInt(var9, (byte) -79);
          }
          var7Lifetime1 = 103 / ((obfuscationGuard + 1) / 55);
          this.position = var5_int;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wq.O(" + (key != null ? "{...}" : "null") + ',' + startOffset + ',' + endOffset + ',' + obfuscationGuard + ')');
        }
    }

    final void writeLong(int obfuscationGuard, long value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(value >> 56);
        if (obfuscationGuard != -23054) {
          field_m = (String) null;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(value >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(value >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(value >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)(value >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$5] = (byte)(int)(value >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$6] = (byte)(int)(value >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$7] = (byte)(int)value;
    }

    final void backfillShortLength(int length, int obfuscationGuard) {
        if (obfuscationGuard != 255) {
          this.position = 13;
        }
        this.data[-length + (this.position - 2)] = (byte)(length >> 8);
        this.data[this.position - length - 1] = (byte)length;
    }

    final static IndexedSprite[] a(String param0, ResourceArchive param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        IndexedSprite[] stackIn_2_0 = null;
        IndexedSprite[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.getGroupId(param0, false);
          var5 = param1.getFileId(var4_int, -24, param2);
          if (param3 == -946715356) {
            stackIn_4_0 = ba.a(var4_int, var5, -59, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (IndexedSprite[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wq.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedShort(int obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard != 65280) {
          this.position = 113;
        }
        return (255 & this.data[-1 + this.position]) + (65280 & this.data[-2 + this.position] << 8);
    }

    final int readVarInt(byte obfuscationGuard) {
        int fieldTemp$1 = 0;
        int currentByte;
        int var3;
        int value;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var3 = 49 % ((obfuscationGuard - 44) / 57);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        currentByte = this.data[fieldTemp$0];
        value = 0;
        while (currentByte < 0) {
          value = (127 & currentByte | value) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          currentByte = this.data[fieldTemp$1];
        }
        return currentByte | value;
    }

    final void writeBase38Name(boolean obfuscationGuard, String name) {
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard) {
            this.data = (byte[]) null;
          }
          var3_long = 0L;
          var5 = 0L;
          var7 = name.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = name.charAt(var8);
              if (var9 >= 65 &&
                90 >= var9) {
                var3_long = var3_long + (long)(-65 + (var9 + 2));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-95 + var9);
                } else {
                  if (var9 >= 48 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(28 - (-var9 + 48));
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.writeLong56((byte) -109, var3_long);
          this.writeLong56((byte) -109, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("wq.K(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int readMedium(int obfuscationGuard) {
        this.position = this.position + 3;
        if (obfuscationGuard != 48) {
          this.position = 59;
        }
        int var2 = (this.data[-1 + this.position] & 255) + (((255 & this.data[-2 + this.position]) << 8) + ((this.data[this.position - 3] & 255) << 16));
        if (var2 > 8388607) {
          var2 = var2 - 16777216;
        }
        return var2;
    }

    final String readLegacyUtf8String(byte obfuscationGuard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        int var2 = this.data[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        int var3 = this.readVarInt((byte) 110);
        if (obfuscationGuard != 24) {
          this.backfillByteLength((byte) 106, 82);
        }
        if (var3 + this.position > this.data.length) {
          throw new IllegalStateException("");
        }
        String var4 = LegacyUtf8Decoder.decode((byte) -116, var3, this.position, this.data);
        this.position = this.position + var3;
        return var4;
    }

    final int appendCrc32(int obfuscationGuard, int startOffset) {
        int var3 = ba.computeCrc32(this.data, 9, startOffset, this.position);
        if (obfuscationGuard != 3) {
          this.readSignedSmart(46);
        }
        this.writeInt(var3, (byte) -79);
        return var3;
    }

    final String readPrefixedCp1252String(int obfuscationGuard) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.data[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        if (obfuscationGuard != 255) {
          this.writeMedium((byte) -99, -73);
        }
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.data[fieldTemp$1]);
        var4 = -1 + (-var3 + this.position);
        if (0 == var4) {
          return "";
        }
        return AccountDateHelpers.decodeCp1252(var4, 34, this.data, var3);
    }

    final boolean verifyCrc32(byte obfuscationGuard) {
        this.position = this.position - 4;
        int var2 = ba.computeCrc32(this.data, obfuscationGuard + 36, 0, this.position);
        int var3 = this.readInt(255);
        if (var2 == var3) {
          return true;
        }
        if (obfuscationGuard != -27) {
          field_j = -56;
          return false;
        }
        return false;
    }

    final void writeShort(byte obfuscationGuard, int value) {
        if (obfuscationGuard < 106) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)value;
    }

    final int readUnsignedMedium(byte obfuscationGuard) {
        this.position = this.position + 3;
        if (obfuscationGuard != -34) {
          return 20;
        }
        return (255 & this.data[this.position - 1]) + ((this.data[-3 + this.position] & 255) << 16) + (this.data[this.position - 2] << 8 & 65280);
    }

    final long readLong(int obfuscationGuard) {
        if (obfuscationGuard != -32768) {
          this.padToPosition((byte) 23, -28);
        }
        long var2 = 4294967295L & (long)this.readInt(obfuscationGuard ^ -32513);
        long var4 = (long)this.readInt(obfuscationGuard + 33023) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final void writeByte(int obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)value;
        int var3 = -41 / ((-67 - obfuscationGuard) / 32);
    }

    PacketBuffer(int capacity) {
        this.position = 0;
        this.data = ByteArrayPoolHelpers.acquireByteArray(capacity, (byte) 113);
    }

    PacketBuffer(byte[] data) {
        try {
          this.position = 0;
          this.data = data;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "wq.<init>(" + (data != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This game option is only available to members.";
    }
}
