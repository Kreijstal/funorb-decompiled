/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ByteArrayBuffer extends IntrusiveNode {
    static long[][] whirlpoolTables;
    static long[] whirlpoolRoundConstants;
    int position;
    byte[] bytes;
    static int receivedSocialSettingMiddle;

    final void writeMediumBE(int methodGuard, int value) {
        int highByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[highByteIndex] = (byte)(value >> 16);
        int middleByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[middleByteIndex] = (byte)(value >> 8);
        int lowByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[lowByteIndex] = (byte)value;
        int sentinelRemainder = -20 % ((methodGuard - 62) / 60);
    }

    final void writeByte(byte methodGuard, int value) {
        int byteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[byteIndex] = (byte)value;
        int sentinelQuotient = 65 / ((methodGuard - 67) / 54);
    }

    final static Sprite loadFirstRgbSprite(int groupId, int methodGuard, int fileId, ResourceArchive archive) {
        RuntimeException loadFailureForContext = null;
        Sprite spriteBeforeReturn = null;
        RuntimeException loadFailureBeforeDescription = null;
        StringBuilder loadMessagePrefix = null;
        String archiveDescription = null;
        RuntimeException caughtLoadFailure = null;
        try {
          if (!SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 126, archive)) {
            return null;
          }
          if (methodGuard != 19) {
            receivedSocialSettingMiddle = -57;
          }
          spriteBeforeReturn = AwtRasterBuffer.buildFirstRgbSpriteFromDecodedSheet((byte) -60);
          return spriteBeforeReturn;
        } catch (java.lang.RuntimeException loadFailure) {
          caughtLoadFailure = loadFailure;
          loadFailureForContext = caughtLoadFailure;
          loadFailureBeforeDescription = loadFailureForContext;
          loadMessagePrefix = new StringBuilder().append("qc.F(").append(groupId).append(',').append(methodGuard).append(',').append(fileId).append(',');
          if (archive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loadFailureBeforeDescription), ((StringBuilder) (Object) loadMessagePrefix).append(archiveDescription).append(')').toString());
        }
    }

    final boolean verifyTrailingCrc32(byte methodGuard) {
        this.position = this.position - 4;
        if (methodGuard != 20) {
            this.readZeroPrefixedNullTerminatedText(-46);
        }
        int computedCrc32 = ResizableDialog.computeCrc32(this.position, this.bytes, methodGuard - 138, 0);
        int storedCrc32 = this.readIntBE((byte) -85);
        if (computedCrc32 == storedCrc32) {
            return true;
        }
        return false;
    }

    final void writeBase38Text(String text, boolean resetPositionGuard) {
        int characterIndex = 0;
        RuntimeException textWriteFailureBeforeDescription = null;
        StringBuilder textWriteMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtTextWriteFailure = null;
        long accumulatedChunk = 0L;
        RuntimeException textWriteFailureForContext = null;
        long trailingTextChunk = 0L;
        int textLength = 0;
        int characterCode = 0;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.clientControlFlowFlag;
        try {
          accumulatedChunk = 0L;
          if (resetPositionGuard) {
            this.position = -109;
          }
          trailingTextChunk = 0L;
          textLength = text.length();
          for (characterIndex = 19; characterIndex >= 0; characterIndex--) {
            accumulatedChunk = accumulatedChunk * 38L;
            if (textLength > characterIndex) {
              characterCode = text.charAt(characterIndex);
              if (characterCode >= 65 &&
                  90 >= characterCode) {
                accumulatedChunk = accumulatedChunk + (long)(-63 + characterCode);
              } else if (characterCode >= 97 &&
                  characterCode <= 122) {
                accumulatedChunk = accumulatedChunk + (long)(-97 + (2 + characterCode));
              } else if (characterCode >= 48 &&
                  characterCode <= 57) {
                accumulatedChunk = accumulatedChunk + (long)(-48 + characterCode + 28);
              } else {
                accumulatedChunk = accumulatedChunk + 1L;
              }
              if (characterIndex != 10) {
                continue;
              }
            } else {
              if (characterIndex != 10) {
                continue;
              }
            }
            trailingTextChunk = accumulatedChunk;
            accumulatedChunk = 0L;
          }
          this.writeLong56BE(-109, accumulatedChunk);
          this.writeLong56BE(-47, trailingTextChunk);
          return;
        } catch (java.lang.RuntimeException textWriteFailure) {
          caughtTextWriteFailure = textWriteFailure;
          textWriteFailureForContext = caughtTextWriteFailure;
          textWriteFailureBeforeDescription = textWriteFailureForContext;
          textWriteMessagePrefix = new StringBuilder().append("qc.IA(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textWriteFailureBeforeDescription), ((StringBuilder) (Object) textWriteMessagePrefix).append(textDescription).append(',').append(resetPositionGuard).append(')').toString());
        }
    }

    final void backpatchLengthIntBE(int length, int methodGuard) {
        this.bytes[-4 + (this.position - length)] = (byte)(length >> 24);
        if (methodGuard != 0) {
            this.appendCrc32(13, 61);
        }
        this.bytes[-length + (this.position - 3)] = (byte)(length >> 16);
        this.bytes[this.position + (-length - 2)] = (byte)(length >> 8);
        this.bytes[-length + (this.position - 1)] = (byte)length;
    }

    final int readVariableIntBE(byte methodGuard) {
        int continuationByteIndex = 0;
        int currentSignedByte;
        int accumulatedValue;
        if (methodGuard >= -107) {
          this.readNullableNullTerminatedText((byte) -107);
        }
        int firstByteIndex = this.position;
        this.position = this.position + 1;
        currentSignedByte = this.bytes[firstByteIndex];
        accumulatedValue = 0;
        while (currentSignedByte < 0) {
          accumulatedValue = (127 & currentSignedByte | accumulatedValue) << 7;
          continuationByteIndex = this.position;
          this.position = this.position + 1;
          currentSignedByte = this.bytes[continuationByteIndex];
        }
        return accumulatedValue | currentSignedByte;
    }

    final String readZeroPrefixedNullTerminatedText(int methodGuard) {
        int textByteIndex = 0;
        int prefixByte;
        int textStart;
        int textLength;
        ResourceArchive unusedNullArchiveSnapshot;
        if (methodGuard != 27425) {
          unusedNullArchiveSnapshot = (ResourceArchive) null;
          ByteArrayBuffer.loadFirstRgbSprite(-4, 95, -17, (ResourceArchive) null);
        }
        int prefixByteIndex = this.position;
        this.position = this.position + 1;
        prefixByte = this.bytes[prefixByteIndex];
        if (prefixByte != 0) {
          throw new IllegalStateException("");
        }
        textStart = this.position;
        do {
          textByteIndex = this.position;
          this.position = this.position + 1;
        } while (this.bytes[textByteIndex] != 0);
        textLength = -textStart + (this.position - 1);
        if (textLength != 0) {
          return ByteTextDecodingSupport.decodeTextSlice(methodGuard ^ -27439, this.bytes, textStart, textLength);
        }
        return "";
    }

    final void backpatchLengthShortBE(int length, boolean preserveHashTables) {
        if (!preserveHashTables) {
            whirlpoolTables = (long[][]) null;
        }
        this.bytes[this.position + (-length - 2)] = (byte)(length >> 8);
        this.bytes[this.position + (-length - 1)] = (byte)length;
    }

    final void writeShortBE(int value, int methodGuard) {
        int highByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[highByteIndex] = (byte)(value >> 8);
        if (methodGuard != 28695) {
            ByteArrayBuffer.resendByteShortQueries(true, 22);
        }
        int lowByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[lowByteIndex] = (byte)value;
    }

    final static void openAccountWelcomePanel(int methodGuard) {
        if (methodGuard != 0) {
            return;
        }
        ButtonWidget.accountContentDialog.replaceContent(new AccountWelcomePanel(), methodGuard - 110);
    }

    final void writeNullTerminatedText(String text, int characterStart) {
        int zeroCharacterIndex = 0;
        CharSequence textForEncoding = null;
        int terminatorByteIndex = 0;
        try {
            zeroCharacterIndex = text.indexOf(' ');
            if (zeroCharacterIndex >= 0) {
                throw new IllegalArgumentException("");
            }
            textForEncoding = (CharSequence) ((Object) text);
            this.position = this.position + DisplayNamePanel.encodeTextSlice(textForEncoding, this.bytes, characterStart, text.length(), this.position, 98);
            terminatorByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[terminatorByteIndex] = (byte) 0;
        } catch (RuntimeException textWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textWriteFailure), "qc.HA(" + (text != null ? "{...}" : "null") + ',' + characterStart + ')');
        }
    }

    final String readNullableNullTerminatedText(byte methodGuard) {
        if (0 == this.bytes[this.position]) {
            this.position = this.position + 1;
            return null;
        }
        if (methodGuard != 53) {
            this.writeLong40BE((byte) 4, 25L);
        }
        return this.readNullTerminatedText((byte) 125);
    }

    final static void drawLoadingProgressDialog(float scaledProgress, String statusText, boolean sessionExitRequested, byte methodGuard) {
        try {
            if (SecondaryNodeHashTable.accountProgressDialog == null) {
                SecondaryNodeHashTable.accountProgressDialog = new ProgressDialog(ClientFlowState.accountDialogLayer, TextWidgetRenderer.unreadTicketMessage);
                ClientFlowState.accountDialogLayer.showDialog(false, SecondaryNodeHashTable.accountProgressDialog);
            }
            SecondaryNodeHashTable.accountProgressDialog.updateProgress(sessionExitRequested, statusText, methodGuard ^ -92, scaledProgress);
            SoftwareRasterizer.clearFramebuffer();
            if (methodGuard != -40) {
                whirlpoolTables = (long[][]) null;
            }
            ValidationMessageWidget.renderAccountDialogLayer(true, false);
        } catch (RuntimeException progressDialogFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) progressDialogFailure), "qc.L(" + scaledProgress + ',' + (statusText != null ? "{...}" : "null") + ',' + sessionExitRequested + ',' + methodGuard + ')');
        }
    }

    final long readLongBE(int methodGuard) {
        long highUnsignedWord = 4294967295L & (long)this.readIntBE((byte) -113);
        if (methodGuard != 2901) {
            whirlpoolRoundConstants = (long[]) null;
        }
        long lowUnsignedWord = (long)this.readIntBE((byte) -113) & 4294967295L;
        return lowUnsignedWord + (highUnsignedWord << 32);
    }

    final void writeLong40BE(byte methodGuard, long value) {
        int byte32Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte32Index] = (byte)(int)(value >> 32);
        int byte24Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte24Index] = (byte)(int)(value >> 24);
        int byte16Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte16Index] = (byte)(int)(value >> 16);
        int byte8Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte8Index] = (byte)(int)(value >> 8);
        int byte0Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte0Index] = (byte)(int)value;
        if (methodGuard > -125) {
            this.bytes = (byte[]) null;
        }
    }

    final static void resendByteShortQueries(boolean methodGuard, int packetOpcode) {
        ByteShortQuery var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var3 = (ByteShortQuery) ((Object) UiWidget.pendingByteShortQueries.firstForIteration(0));
          while (var3 != null) {
            ProgressDialog.writeByteShortQuery(packetOpcode, 534, var3);
            var3 = (ByteShortQuery) ((Object) UiWidget.pendingByteShortQueries.nextForIteration(1));
          }
          if (!methodGuard) {
            receivedSocialSettingMiddle = -54;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "qc.PA(" + methodGuard + ',' + packetOpcode + ')');
        }
    }

    final void writeBytes(int length, int methodGuard, byte[] source, int sourceOffset) {
        int bufferByteIndex = 0;
        RuntimeException copyFailureBeforeDescription = null;
        StringBuilder copyMessagePrefix = null;
        String arrayDescription = null;
        RuntimeException caughtCopyFailure = null;
        int sourceIndex = 0;
        RuntimeException copyFailureForContext = null;
        String unusedNullTextSnapshot = null;
        try {
          sourceIndex = sourceOffset;
          if (methodGuard != -97) {
            unusedNullTextSnapshot = (String) null;
            this.writeNullTerminatedText((String) null, 75);
          }
          while (sourceIndex < sourceOffset + length) {
            bufferByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[bufferByteIndex] = source[sourceIndex];
            sourceIndex++;
          }
          return;
        } catch (java.lang.RuntimeException copyFailure) {
          caughtCopyFailure = copyFailure;
          copyFailureForContext = caughtCopyFailure;
          copyFailureBeforeDescription = copyFailureForContext;
          copyMessagePrefix = new StringBuilder().append("qc.JA(").append(length).append(',').append(methodGuard).append(',');
          if (source == null) {
            arrayDescription = "null";
          } else {
            arrayDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) copyFailureBeforeDescription), ((StringBuilder) (Object) copyMessagePrefix).append(arrayDescription).append(',').append(sourceOffset).append(')').toString());
        }
    }

    final int appendCrc32(int methodGuard, int startPosition) {
        if (methodGuard <= 4) {
            return -122;
        }
        int computedCrc32 = ResizableDialog.computeCrc32(this.position, this.bytes, -37, startPosition);
        this.writeIntBE((byte) 95, computedCrc32);
        return computedCrc32;
    }

    final static byte encodeTextCharacter(char character, boolean returnEncodedByte) {
        int encodedByte;
        encodedTextCharacter: {
          if ((0 >= character ||
                character >= 128) &&
              (character < 160 ||
                255 < character)) {
            if (character == 8364) {
              encodedByte = -128;
              break encodedTextCharacter;
            }
            if (character == 8218) {
              encodedByte = -126;
              break encodedTextCharacter;
            }
            if (402 == character) {
              encodedByte = -125;
              break encodedTextCharacter;
            }
            if (character == 8222) {
              encodedByte = -124;
              break encodedTextCharacter;
            }
            if (character == 8230) {
              encodedByte = -123;
              break encodedTextCharacter;
            }
            if (8224 == character) {
              encodedByte = -122;
              break encodedTextCharacter;
            }
            if (8225 == character) {
              encodedByte = -121;
              break encodedTextCharacter;
            }
            if (character == 710) {
              encodedByte = -120;
              break encodedTextCharacter;
            }
            if (8240 == character) {
              encodedByte = -119;
              break encodedTextCharacter;
            }
            if (character == 352) {
              encodedByte = -118;
              break encodedTextCharacter;
            }
            if (character == 8249) {
              encodedByte = -117;
              break encodedTextCharacter;
            }
            if (character == 338) {
              encodedByte = -116;
              break encodedTextCharacter;
            }
            if (character == 381) {
              encodedByte = -114;
              break encodedTextCharacter;
            }
            if (character == 8216) {
              encodedByte = -111;
              break encodedTextCharacter;
            }
            if (8217 == character) {
              encodedByte = -110;
              break encodedTextCharacter;
            }
            if (character == 8220) {
              encodedByte = -109;
              break encodedTextCharacter;
            }
            if (character == 8221) {
              encodedByte = -108;
              break encodedTextCharacter;
            }
            if (character == 8226) {
              encodedByte = -107;
              break encodedTextCharacter;
            }
            if (character == 8211) {
              encodedByte = -106;
              break encodedTextCharacter;
            }
            if (character == 8212) {
              encodedByte = -105;
              break encodedTextCharacter;
            }
            if (character == 732) {
              encodedByte = -104;
              break encodedTextCharacter;
            }
            if (character == 8482) {
              encodedByte = -103;
              break encodedTextCharacter;
            }
            if (character == 353) {
              encodedByte = -102;
              break encodedTextCharacter;
            }
            if (character == 8250) {
              encodedByte = -101;
              break encodedTextCharacter;
            }
            if (character == 339) {
              encodedByte = -100;
              break encodedTextCharacter;
            }
            if (character == 382) {
              encodedByte = -98;
              break encodedTextCharacter;
            }
            if (character != 376) {
              encodedByte = 63;
              break encodedTextCharacter;
            }
            encodedByte = -97;
            break encodedTextCharacter;
          }
          encodedByte = (byte)character;
        }
        if (returnEncodedByte) {
          return (byte) encodedByte;
        }
        return (byte) 50;
    }

    final void readBytes(int methodGuard, int length, byte[] destination, int destinationOffset) {
        int bufferByteIndex = 0;
        RuntimeException copyFailureBeforeDescription = null;
        StringBuilder copyMessagePrefix = null;
        String arrayDescription = null;
        RuntimeException caughtCopyFailure = null;
        int destinationIndex = 0;
        RuntimeException copyFailureForContext = null;
        LoginTextValue unusedNullTextInputSnapshot = null;
        try {
          destinationIndex = destinationOffset;
          if (methodGuard != 29915) {
            unusedNullTextInputSnapshot = (LoginTextValue) null;
            ByteArrayBuffer.advanceAccountLookupRequest((LoginTextValue) null, (LoginTextValue) null, 35);
          }
          while (destinationOffset + length > destinationIndex) {
            bufferByteIndex = this.position;
            this.position = this.position + 1;
            destination[destinationIndex] = this.bytes[bufferByteIndex];
            destinationIndex++;
          }
          return;
        } catch (java.lang.RuntimeException copyFailure) {
          caughtCopyFailure = copyFailure;
          copyFailureForContext = caughtCopyFailure;
          copyFailureBeforeDescription = copyFailureForContext;
          copyMessagePrefix = new StringBuilder().append("qc.LA(").append(methodGuard).append(',').append(length).append(',');
          if (destination == null) {
            arrayDescription = "null";
          } else {
            arrayDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) copyFailureBeforeDescription), ((StringBuilder) (Object) copyMessagePrefix).append(arrayDescription).append(',').append(destinationOffset).append(')').toString());
        }
    }

    final void backpatchLengthByte(int methodGuard, int length) {
        this.bytes[-length + (this.position - 1)] = (byte)length;
        if (methodGuard != 11700) {
            ByteArrayBuffer.openAccountWelcomePanel(-24);
        }
    }

    final void encryptXteaBlocks(int[] key, byte methodGuard) {
        int cyclesBeforeDecrement = 0;
        RuntimeException cryptoFailureBeforeDescription = null;
        StringBuilder cryptoMessagePrefix = null;
        String keyDescription = null;
        RuntimeException caughtCryptoFailure = null;
        int blockCount = 0;
        RuntimeException cryptoFailureForContext = null;
        int blockIndex = 0;
        int leftWord = 0;
        int rightWord = 0;
        int cycleSum = 0;
        int delta = 0;
        int cyclesRemaining = 0;
        LoginTextValue unusedNullTextInputSnapshot = null;
        try {
          blockCount = this.position / 8;
          this.position = 0;
          if (methodGuard != -33) {
            unusedNullTextInputSnapshot = (LoginTextValue) null;
            ByteArrayBuffer.advanceAccountLookupRequest((LoginTextValue) null, (LoginTextValue) null, 109);
          }
          blockIndex = 0;
          xteaEncryptBlocks: while (true) {
            if (blockCount <= blockIndex) {
              return;
            }
            leftWord = this.readIntBE((byte) -69);
            rightWord = this.readIntBE((byte) -34);
            cycleSum = 0;
            delta = -1640531527;
            cyclesRemaining = 32;
            while (true) {
              cyclesBeforeDecrement = cyclesRemaining;
              cyclesRemaining--;
              if (0 < cyclesBeforeDecrement) {
                leftWord = leftWord + ((rightWord >>> 5 ^ rightWord << 4) + rightWord ^ cycleSum + key[3 & cycleSum]);
                cycleSum = cycleSum + delta;
                rightWord = rightWord + (leftWord + (leftWord << 4 ^ leftWord >>> 5) ^ cycleSum + key[(cycleSum & 7480) >>> 11]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeIntBE((byte) 95, leftWord);
            this.writeIntBE((byte) 95, rightWord);
            blockIndex++;
            continue xteaEncryptBlocks;
          }
        } catch (java.lang.RuntimeException cryptoFailure) {
          caughtCryptoFailure = cryptoFailure;
          cryptoFailureForContext = caughtCryptoFailure;
          cryptoFailureBeforeDescription = cryptoFailureForContext;
          cryptoMessagePrefix = new StringBuilder().append("qc.GA(");
          if (key == null) {
            keyDescription = "null";
          } else {
            keyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cryptoFailureBeforeDescription), ((StringBuilder) (Object) cryptoMessagePrefix).append(keyDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final int readUnsignedShortBE(boolean readBytes) {
        this.position = this.position + 2;
        if (!readBytes) {
            return 58;
        }
        return (this.bytes[-2 + this.position] << 8 & 65280) + (255 & this.bytes[-1 + this.position]);
    }

    final int readUnsignedShortOrInt(byte methodGuard) {
        if (methodGuard != -27) {
            return 95;
        }
        if (this.bytes[this.position] >= 0) {
            return this.readUnsignedShortBE(true);
        }
        return 2147483647 & this.readIntBE((byte) -114);
    }

    final void decryptXteaRange(byte methodGuard, int[] key, int startPosition, int endPosition) {
        int cyclesBeforeDecrement = 0;
        RuntimeException cryptoFailureBeforeDescription = null;
        StringBuilder cryptoMessagePrefix = null;
        String keyDescription = null;
        RuntimeException caughtCryptoFailure = null;
        int savedPosition = 0;
        RuntimeException cryptoFailureForContext = null;
        int blockCount = 0;
        int blockIndex = 0;
        int leftWord = 0;
        int rightWord = 0;
        int cycleSum = 0;
        int delta = 0;
        int cyclesRemaining = 0;
        try {
          savedPosition = this.position;
          if (methodGuard > -63) {
            this.readUnsignedMediumBE(3);
          }
          this.position = startPosition;
          blockCount = (-startPosition + endPosition) / 8;
          blockIndex = 0;
          xteaDecryptBlocks: while (true) {
            if (blockIndex >= blockCount) {
              this.position = savedPosition;
              return;
            }
            leftWord = this.readIntBE((byte) -36);
            rightWord = this.readIntBE((byte) -103);
            cycleSum = -957401312;
            delta = -1640531527;
            cyclesRemaining = 32;
            while (true) {
              cyclesBeforeDecrement = cyclesRemaining;
              cyclesRemaining--;
              if (cyclesBeforeDecrement > 0) {
                rightWord = rightWord - (cycleSum + key[(7701 & cycleSum) >>> 11] ^ leftWord + (leftWord << 4 ^ leftWord >>> 5));
                cycleSum = cycleSum - delta;
                leftWord = leftWord - (cycleSum + key[cycleSum & 3] ^ (rightWord >>> 5 ^ rightWord << 4) + rightWord);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeIntBE((byte) 95, leftWord);
            this.writeIntBE((byte) 95, rightWord);
            blockIndex++;
            continue xteaDecryptBlocks;
          }
        } catch (java.lang.RuntimeException cryptoFailure) {
          caughtCryptoFailure = cryptoFailure;
          cryptoFailureForContext = caughtCryptoFailure;
          cryptoFailureBeforeDescription = cryptoFailureForContext;
          cryptoMessagePrefix = new StringBuilder().append("qc.G(").append(methodGuard).append(',');
          if (key == null) {
            keyDescription = "null";
          } else {
            keyDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cryptoFailureBeforeDescription), ((StringBuilder) (Object) cryptoMessagePrefix).append(keyDescription).append(',').append(startPosition).append(',').append(endPosition).append(')').toString());
        }
    }

    public static void clearWhirlpoolTables(int methodGuard) {
        whirlpoolRoundConstants = null;
        whirlpoolTables = (long[][]) null;
        if (methodGuard != 0) {
            LoginTextValue unusedNullTextInputSnapshot = (LoginTextValue) null;
            ByteArrayBuffer.advanceAccountLookupRequest((LoginTextValue) null, (LoginTextValue) null, -47);
        }
    }

    final void writeVariableIntBE(byte methodGuard, int value) {
        if ((value & -128) != 0) {
            if ((-16384 & value) != 0) {
                if (0 != (value & -2097152)) {
                    if ((-268435456 & value) != 0) {
                        this.writeByte((byte) 126, value >>> 28 | 128);
                    }
                    this.writeByte((byte) -96, 128 | value >>> 21);
                }
                this.writeByte((byte) 127, (value | 2097436) >>> 14);
            }
            this.writeByte((byte) -121, value >>> 7 | 128);
        }
        this.writeByte((byte) 124, 127 & value);
        if (methodGuard >= -95) {
            this.writeMediumBE(-109, -43);
        }
    }

    private final void writeLong56BE(int methodGuard, long value) {
        int byte48Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte48Index] = (byte)(int)(value >> 48);
        int byte40Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte40Index] = (byte)(int)(value >> 40);
        int byte32Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte32Index] = (byte)(int)(value >> 32);
        int byte24Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte24Index] = (byte)(int)(value >> 24);
        int byte16Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte16Index] = (byte)(int)(value >> 16);
        int byte8Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte8Index] = (byte)(int)(value >> 8);
        if (methodGuard >= -41) {
            whirlpoolTables = (long[][]) null;
        }
        int byte0Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte0Index] = (byte)(int)value;
    }

    final void writeLongBE(byte methodGuard, long value) {
        int byte56Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte56Index] = (byte)(int)(value >> 56);
        int byte48Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte48Index] = (byte)(int)(value >> 48);
        int byte40Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte40Index] = (byte)(int)(value >> 40);
        int byte32Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte32Index] = (byte)(int)(value >> 32);
        int byte24Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte24Index] = (byte)(int)(value >> 24);
        int byte16Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte16Index] = (byte)(int)(value >> 16);
        if (methodGuard <= 57) {
            java.math.BigInteger unusedNullBigIntegerSnapshot = (java.math.BigInteger) null;
            this.replaceWithModPowResult(91, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        int byte8Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte8Index] = (byte)(int)(value >> 8);
        int byte0Index = this.position;
        this.position = this.position + 1;
        this.bytes[byte0Index] = (byte)(int)value;
    }

    final int readUnsignedMediumBE(int methodGuard) {
        if (methodGuard <= 85) {
            whirlpoolRoundConstants = (long[]) null;
        }
        this.position = this.position + 3;
        return (this.bytes[-1 + this.position] & 255) + (((this.bytes[this.position - 2] & 255) << 8) + ((this.bytes[this.position - 3] & 255) << 16));
    }

    final void writeZeroPrefixedNullTerminatedText(String text, byte methodGuard) {
        int prefixByteIndex = 0;
        CharSequence textForEncoding = null;
        int terminatorByteIndex = 0;
        int zeroCharacterIndex = text.indexOf(' ');
        if (methodGuard != -126) {
            return;
        }
        try {
            if (zeroCharacterIndex >= 0) {
                throw new IllegalArgumentException("");
            }
            prefixByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[prefixByteIndex] = (byte) 0;
            textForEncoding = (CharSequence) ((Object) text);
            this.position = this.position + DisplayNamePanel.encodeTextSlice(textForEncoding, this.bytes, 0, text.length(), this.position, 98);
            terminatorByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[terminatorByteIndex] = (byte) 0;
        } catch (RuntimeException textWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textWriteFailure), "qc.VA(" + (text != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void padZerosToPosition(byte methodGuard, int endPosition) {
        int paddingByteIndex = 0;
        while (this.position < endPosition) {
          paddingByteIndex = this.position;
          this.position = this.position + 1;
          this.bytes[paddingByteIndex] = (byte) 0;
        }
        if (methodGuard > -45) {
          this.readUnsignedMediumBE(93);
        }
    }

    final void writeSignedSmart(int value, int methodGuard) {
        if (value < 64 && value >= -64) {
            this.writeByte((byte) 125, 64 + value);
            return;
        }
        if (value < 16384 &&
            value >= -16384) {
            this.writeShortBE(49152 + value, 28695);
            return;
        }
        if (methodGuard != -5962) {
            this.readUnsignedShortOrInt((byte) -105);
        }
        throw new IllegalArgumentException();
    }

    final byte readSignedByte(byte methodGuard) {
        if (methodGuard <= 71) {
            this.backpatchLengthByte(105, -48);
        }
        int byteIndex = this.position;
        this.position = this.position + 1;
        return this.bytes[byteIndex];
    }

    final void writeIntBE(byte methodGuard, int value) {
        int highestByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[highestByteIndex] = (byte)(value >> 24);
        int upperMiddleByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[upperMiddleByteIndex] = (byte)(value >> 16);
        int lowerMiddleByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[lowerMiddleByteIndex] = (byte)(value >> 8);
        if (methodGuard != 95) {
            this.readSignedSmart(-7);
        }
        int lowestByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[lowestByteIndex] = (byte)value;
    }

    final int readIntBE(byte methodGuard) {
        this.position = this.position + 4;
        if (methodGuard >= -25) {
            return 62;
        }
        return (65280 & this.bytes[-2 + this.position] << 8) + (-16777216 & this.bytes[-4 + this.position] << 24) - (-((255 & this.bytes[-3 + this.position]) << 16) - (this.bytes[this.position - 1] & 255));
    }

    final int readUnsignedByte(byte methodGuard) {
        if (methodGuard != 34) {
            java.math.BigInteger unusedNullBigIntegerSnapshot = (java.math.BigInteger) null;
            this.replaceWithModPowResult(31, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
        int byteIndex = this.position;
        this.position = this.position + 1;
        return 255 & this.bytes[byteIndex];
    }

    final String readNullTerminatedText(byte methodGuard) {
        int textByteIndex = 0;
        int textStart;
        int textLength;
        textStart = this.position;
        do {
          textByteIndex = this.position;
          this.position = this.position + 1;
        } while (0 != this.bytes[textByteIndex]);
        textLength = this.position + (-textStart - 1);
        if (textLength == 0) {
          return "";
        }
        if (methodGuard < 94) {
          receivedSocialSettingMiddle = 68;
        }
        return ByteTextDecodingSupport.decodeTextSlice(-45, this.bytes, textStart, textLength);
    }

    final int readSignedSmart(int methodGuard) {
        int sentinelRemainder = 57 % ((-26 - methodGuard) / 54);
        int nextUnsignedByte = 255 & this.bytes[this.position];
        if (nextUnsignedByte < 128) {
            return this.readUnsignedByte((byte) 34) - 64;
        }
        return -49152 + this.readUnsignedShortBE(true);
    }

    final static int advanceAccountLookupRequest(LoginTextValue loginIdentifierValue, LoginTextValue emailValue, int methodGuard) {
        int guardQuotient = 0;
        RuntimeException requestFailureForContext = null;
        String unusedNullPasswordSnapshot = null;
        int requestResultBeforeReturn = 0;
        RuntimeException requestFailureBeforeDescription = null;
        StringBuilder requestMessagePrefix = null;
        String identifierDescription = null;
        StringBuilder messageBeforeEmail = null;
        String emailDescription = null;
        RuntimeException caughtRequestFailure = null;
        try {
          guardQuotient = 2 / ((methodGuard + 41) / 54);
          unusedNullPasswordSnapshot = (String) null;
          requestResultBeforeReturn = LoginPanel.advanceAccountCreationOrLookupRequest(0, 0, loginIdentifierValue, emailValue, (String) null, false, 94);
          return requestResultBeforeReturn;
        } catch (java.lang.RuntimeException requestFailure) {
          caughtRequestFailure = requestFailure;
          requestFailureForContext = caughtRequestFailure;
          requestFailureBeforeDescription = requestFailureForContext;
          requestMessagePrefix = new StringBuilder().append("qc.N(");
          if (loginIdentifierValue == null) {
            identifierDescription = "null";
          } else {
            identifierDescription = "{...}";
          }
          messageBeforeEmail = ((StringBuilder) (Object) requestMessagePrefix).append(identifierDescription).append(',');
          if (emailValue == null) {
            emailDescription = "null";
          } else {
            emailDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) requestFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeEmail).append(emailDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final int readUnsignedSmart(int methodGuard) {
        if (methodGuard != 1) {
            return 3;
        }
        int nextUnsignedByte = 255 & this.bytes[this.position];
        if (nextUnsignedByte < 128) {
            return this.readUnsignedByte((byte) 34);
        }
        return this.readUnsignedShortBE(true) - 32768;
    }

    final void replaceWithModPowResult(int resultPositionGuard, java.math.BigInteger modulus, java.math.BigInteger exponent) {
        int payloadLength = 0;
        byte[] payload = null;
        java.math.BigInteger signedPayloadInteger = null;
        java.math.BigInteger transformedInteger = null;
        byte[] transformedBytes = null;
        try {
            payloadLength = this.position;
            this.position = 0;
            payload = new byte[payloadLength];
            this.readBytes(resultPositionGuard ^ 29915, payloadLength, payload, 0);
            signedPayloadInteger = new java.math.BigInteger(payload);
            transformedInteger = signedPayloadInteger.modPow(exponent, modulus);
            transformedBytes = transformedInteger.toByteArray();
            this.position = resultPositionGuard;
            this.writeShortBE(transformedBytes.length, 28695);
            this.writeBytes(transformedBytes.length, -97, transformedBytes, 0);
        } catch (RuntimeException modPowFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) modPowFailure), "qc.CB(" + resultPositionGuard + ',' + (modulus != null ? "{...}" : "null") + ',' + (exponent != null ? "{...}" : "null") + ')');
        }
    }

    ByteArrayBuffer(int capacity) {
        this.bytes = ByteArrayPoolSupport.acquireByteArray(false, capacity);
        this.position = 0;
    }

    ByteArrayBuffer(byte[] bytes) {
        try {
            this.bytes = bytes;
            this.position = 0;
        } catch (RuntimeException constructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailure), "qc.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int tableRotationIndex = 0;
        long substitutionByteBeforeMerge = 0L;
        int substitutionIndexOrRound;
        int packedSubstitutionPairOrRoundByteOffset;
        long substitutionByte;
        long substitutionTimes2;
        long substitutionTimes4;
        long substitutionTimes5;
        long substitutionTimes8;
        long substitutionTimes9;
        whirlpoolTables = new long[8][256];
        whirlpoolRoundConstants = new long[11];
        substitutionIndexOrRound = 0;
        whirlpoolTableEntries: while (substitutionIndexOrRound < 256) {
          packedSubstitutionPairOrRoundByteOffset = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(substitutionIndexOrRound / 2);
          if ((substitutionIndexOrRound & 1) != 0) {
            substitutionByteBeforeMerge = (long)(packedSubstitutionPairOrRoundByteOffset & 255);
          } else {
            substitutionByteBeforeMerge = (long)(packedSubstitutionPairOrRoundByteOffset >>> 8);
          }
          substitutionByte = substitutionByteBeforeMerge;
          substitutionTimes2 = substitutionByte << 1;
          if (substitutionTimes2 >= 256L) {
            substitutionTimes2 = substitutionTimes2 ^ 285L;
          }
          substitutionTimes4 = substitutionTimes2 << 1;
          if (substitutionTimes4 >= 256L) {
            substitutionTimes4 = substitutionTimes4 ^ 285L;
          }
          substitutionTimes5 = substitutionTimes4 ^ substitutionByte;
          substitutionTimes8 = substitutionTimes4 << 1;
          if (substitutionTimes8 >= 256L) {
            substitutionTimes8 = substitutionTimes8 ^ 285L;
          }
          substitutionTimes9 = substitutionByte ^ substitutionTimes8;
          whirlpoolTables[0][substitutionIndexOrRound] = PcmResampler.orLong(substitutionTimes9, PcmResampler.orLong(substitutionTimes2 << 8, PcmResampler.orLong(substitutionTimes5 << 16, PcmResampler.orLong(PcmResampler.orLong(PcmResampler.orLong(substitutionTimes4 << 40, PcmResampler.orLong(substitutionByte << 56, substitutionByte << 48)), substitutionByte << 32), substitutionTimes8 << 24))));
          for (tableRotationIndex = 1; tableRotationIndex < 8; tableRotationIndex++) {
            whirlpoolTables[tableRotationIndex][substitutionIndexOrRound] = PcmResampler.orLong(whirlpoolTables[tableRotationIndex - 1][substitutionIndexOrRound] >>> 8, whirlpoolTables[-1 + tableRotationIndex][substitutionIndexOrRound] << 56);
          }
          substitutionIndexOrRound++;
        }
        whirlpoolRoundConstants[0] = 0L;
        for (substitutionIndexOrRound = 1; substitutionIndexOrRound <= 10; substitutionIndexOrRound++) {
          packedSubstitutionPairOrRoundByteOffset = substitutionIndexOrRound * 8 - 8;
          whirlpoolRoundConstants[substitutionIndexOrRound] = MessageDialog.xorLong(MessageDialog.xorLong(MessageDialog.xorLong(FrameTimer.andLong(16711680L, whirlpoolTables[5][5 + packedSubstitutionPairOrRoundByteOffset]), MessageDialog.xorLong(FrameTimer.andLong(4278190080L, whirlpoolTables[4][packedSubstitutionPairOrRoundByteOffset + 4]), MessageDialog.xorLong(MessageDialog.xorLong(MessageDialog.xorLong(FrameTimer.andLong(whirlpoolTables[0][packedSubstitutionPairOrRoundByteOffset], -72057594037927936L), FrameTimer.andLong(whirlpoolTables[1][1 + packedSubstitutionPairOrRoundByteOffset], 71776119061217280L)), FrameTimer.andLong(280375465082880L, whirlpoolTables[2][2 + packedSubstitutionPairOrRoundByteOffset])), FrameTimer.andLong(whirlpoolTables[3][packedSubstitutionPairOrRoundByteOffset + 3], 1095216660480L)))), FrameTimer.andLong(whirlpoolTables[6][packedSubstitutionPairOrRoundByteOffset + 6], 65280L)), FrameTimer.andLong(255L, whirlpoolTables[7][packedSubstitutionPairOrRoundByteOffset + 7]));
        }
    }
}
