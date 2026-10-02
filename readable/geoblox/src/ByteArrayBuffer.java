/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ByteArrayBuffer extends IntrusiveNode {
    static long[][] field_g;
    static long[] field_h;
    int position;
    byte[] bytes;
    static int field_i;

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

    final static Sprite a(int param0, int param1, int param2, rh param3) {
        RuntimeException var4 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mf.decodeSpritesFromArchive(param2, param0, 126, param3)) {
            return null;
          }
          if (param1 != 19) {
            field_i = -57;
          }
          stackIn_6_0 = AwtRasterBuffer.buildFirstRgbSpriteFromDecodedSheet((byte) -60);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = (RuntimeException) (var4);
          stackIn_9_1 = new StringBuilder().append("qc.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean verifyTrailingCrc32(byte methodGuard) {
        this.position = this.position - 4;
        if (methodGuard != 20) {
            this.readZeroPrefixedNullTerminatedText(-46);
        }
        int computedCrc32 = oe.computeCrc32(this.position, this.bytes, methodGuard - 138, 0);
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
        unusedClientGuardSnapshot = Geoblox.field_C;
        try {
          accumulatedChunk = 0L;
          if (resetPositionGuard) {
            this.position = -109;
          }
          trailingTextChunk = 0L;
          textLength = text.length();
          L1: for (characterIndex = 19; characterIndex >= 0; characterIndex--) {
            accumulatedChunk = accumulatedChunk * 38L;
            if (textLength > characterIndex) {
              L3: {
                characterCode = text.charAt(characterIndex);
                if (characterCode >= 65) {
                  if (90 >= characterCode) {
                    accumulatedChunk = accumulatedChunk + (long)(-63 + characterCode);
                    break L3;
                  }
                }
                if (characterCode >= 97) {
                  if (characterCode <= 122) {
                    accumulatedChunk = accumulatedChunk + (long)(-97 + (2 + characterCode));
                    break L3;
                  }
                }
                if (characterCode >= 48) {
                  if (characterCode <= 57) {
                    accumulatedChunk = accumulatedChunk + (long)(-48 + characterCode + 28);
                    break L3;
                  }
                }
                accumulatedChunk = accumulatedChunk + 1L;
              }
              if (characterIndex != 10) {
                continue L1;
              }
            } else {
              if (characterIndex != 10) {
                continue L1;
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
          textWriteFailureBeforeDescription = (RuntimeException) (textWriteFailureForContext);
          textWriteMessagePrefix = new StringBuilder().append("qc.IA(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) textWriteFailureBeforeDescription), ((StringBuilder) (Object) textWriteMessagePrefix).append(textDescription).append(',').append(resetPositionGuard).append(')').toString());
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
        L1: while (currentSignedByte < 0) {
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
        rh unusedNullArchiveSnapshot;
        if (methodGuard != 27425) {
          unusedNullArchiveSnapshot = (rh) null;
          ByteArrayBuffer.a(-4, 95, -17, (rh) null);
        }
        int prefixByteIndex = this.position;
        this.position = this.position + 1;
        prefixByte = this.bytes[prefixByteIndex];
        if (prefixByte != 0) {
          throw new IllegalStateException("");
        }
        {
          textStart = this.position;
          L1: while (true) {
            textByteIndex = this.position;
            this.position = this.position + 1;
            if (this.bytes[textByteIndex] != 0) {
              continue L1;
            }
            {
              textLength = -textStart + (this.position - 1);
              if (textLength != 0) {
                return bc.decodeTextSlice(methodGuard ^ -27439, this.bytes, textStart, textLength);
              }
              return "";
            }
          }
        }
    }

    final void backpatchLengthShortBE(int length, boolean preserveHashTables) {
        if (!preserveHashTables) {
            field_g = (long[][]) null;
        }
        this.bytes[this.position + (-length - 2)] = (byte)(length >> 8);
        this.bytes[this.position + (-length - 1)] = (byte)length;
    }

    final void writeShortBE(int value, int methodGuard) {
        int highByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[highByteIndex] = (byte)(value >> 8);
        if (methodGuard != 28695) {
            ByteArrayBuffer.a(true, 22);
        }
        int lowByteIndex = this.position;
        this.position = this.position + 1;
        this.bytes[lowByteIndex] = (byte)value;
    }

    final static void g(int param0) {
        if (param0 != 0) {
            return;
        }
        hk.field_C.b(new AccountWelcomePanel(), param0 - 110);
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
            this.position = this.position + hi.a(textForEncoding, this.bytes, characterStart, text.length(), this.position, 98);
            terminatorByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[terminatorByteIndex] = (byte) 0;
        } catch (RuntimeException textWriteFailure) {
            throw t.a((Throwable) ((Object) textWriteFailure), "qc.HA(" + (text != null ? "{...}" : "null") + ',' + characterStart + ')');
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

    final static void a(float param0, String param1, boolean param2, byte param3) {
        try {
            if (vg.field_i == null) {
                vg.field_i = new rl(kd.field_e, ff.field_d);
                kd.field_e.a(false, vg.field_i);
            }
            vg.field_i.a(param2, param1, param3 ^ -92, param0);
            SoftwareRasterizer.clearFramebuffer();
            if (param3 != -40) {
                field_g = (long[][]) null;
            }
            pi.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qc.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final long readLongBE(int methodGuard) {
        long highUnsignedWord = 4294967295L & (long)this.readIntBE((byte) -113);
        if (methodGuard != 2901) {
            field_h = (long[]) null;
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

    final static void a(boolean param0, int param1) {
        ph var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var3 = (ph) ((Object) el.field_p.firstForIteration(0));
          L0: while (var3 != null) {
            rl.a(param1, 534, var3);
            var3 = (ph) ((Object) el.field_p.nextForIteration(1));
          }
          if (!param0) {
            field_i = -54;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "qc.PA(" + param0 + ',' + param1 + ')');
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
          L1: while (sourceIndex < sourceOffset + length) {
            bufferByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[bufferByteIndex] = source[sourceIndex];
            sourceIndex++;
          }
          return;
        } catch (java.lang.RuntimeException copyFailure) {
          caughtCopyFailure = copyFailure;
          copyFailureForContext = caughtCopyFailure;
          copyFailureBeforeDescription = (RuntimeException) (copyFailureForContext);
          copyMessagePrefix = new StringBuilder().append("qc.JA(").append(length).append(',').append(methodGuard).append(',');
          if (source == null) {
            arrayDescription = "null";
          } else {
            arrayDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) copyFailureBeforeDescription), ((StringBuilder) (Object) copyMessagePrefix).append(arrayDescription).append(',').append(sourceOffset).append(')').toString());
        }
    }

    final int appendCrc32(int methodGuard, int startPosition) {
        if (methodGuard <= 4) {
            return -122;
        }
        int computedCrc32 = oe.computeCrc32(this.position, this.bytes, -37, startPosition);
        this.writeIntBE((byte) 95, computedCrc32);
        return computedCrc32;
    }

    final static byte a(char param0, boolean param1) {
        int var2;
        L0: {
          L1: {
            if (0 < param0) {
              if (param0 < 128) {
                break L1;
              }
            }
            if (param0 >= 160) {
              if (255 >= param0) {
                break L1;
              }
            }
            if (param0 == 8364) {
              var2 = -128;
              break L0;
            }
            if (param0 == 8218) {
              var2 = -126;
              break L0;
            }
            if (402 == param0) {
              var2 = -125;
              break L0;
            }
            if (param0 == 8222) {
              var2 = -124;
              break L0;
            }
            if (param0 == 8230) {
              var2 = -123;
              break L0;
            }
            if (8224 == param0) {
              var2 = -122;
              break L0;
            }
            if (8225 == param0) {
              var2 = -121;
              break L0;
            }
            if (param0 == 710) {
              var2 = -120;
              break L0;
            }
            if (8240 == param0) {
              var2 = -119;
              break L0;
            }
            if (param0 == 352) {
              var2 = -118;
              break L0;
            }
            if (param0 == 8249) {
              var2 = -117;
              break L0;
            }
            if (param0 == 338) {
              var2 = -116;
              break L0;
            }
            if (param0 == 381) {
              var2 = -114;
              break L0;
            }
            if (param0 == 8216) {
              var2 = -111;
              break L0;
            }
            if (8217 == param0) {
              var2 = -110;
              break L0;
            }
            if (param0 == 8220) {
              var2 = -109;
              break L0;
            }
            if (param0 == 8221) {
              var2 = -108;
              break L0;
            }
            if (param0 == 8226) {
              var2 = -107;
              break L0;
            }
            if (param0 == 8211) {
              var2 = -106;
              break L0;
            }
            if (param0 == 8212) {
              var2 = -105;
              break L0;
            }
            if (param0 == 732) {
              var2 = -104;
              break L0;
            }
            if (param0 == 8482) {
              var2 = -103;
              break L0;
            }
            if (param0 == 353) {
              var2 = -102;
              break L0;
            }
            if (param0 == 8250) {
              var2 = -101;
              break L0;
            }
            if (param0 == 339) {
              var2 = -100;
              break L0;
            }
            if (param0 == 382) {
              var2 = -98;
              break L0;
            }
            if (param0 != 376) {
              var2 = 63;
              break L0;
            }
            var2 = -97;
            break L0;
          }
          var2 = (byte)param0;
        }
        if (param1) {
          return (byte) var2;
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
        mb unusedNullTextInputSnapshot = null;
        try {
          destinationIndex = destinationOffset;
          if (methodGuard != 29915) {
            unusedNullTextInputSnapshot = (mb) null;
            ByteArrayBuffer.a((mb) null, (mb) null, 35);
          }
          L1: while (destinationOffset + length > destinationIndex) {
            bufferByteIndex = this.position;
            this.position = this.position + 1;
            destination[destinationIndex] = this.bytes[bufferByteIndex];
            destinationIndex++;
          }
          return;
        } catch (java.lang.RuntimeException copyFailure) {
          caughtCopyFailure = copyFailure;
          copyFailureForContext = caughtCopyFailure;
          copyFailureBeforeDescription = (RuntimeException) (copyFailureForContext);
          copyMessagePrefix = new StringBuilder().append("qc.LA(").append(methodGuard).append(',').append(length).append(',');
          if (destination == null) {
            arrayDescription = "null";
          } else {
            arrayDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) copyFailureBeforeDescription), ((StringBuilder) (Object) copyMessagePrefix).append(arrayDescription).append(',').append(destinationOffset).append(')').toString());
        }
    }

    final void backpatchLengthByte(int methodGuard, int length) {
        this.bytes[-length + (this.position - 1)] = (byte)length;
        if (methodGuard != 11700) {
            ByteArrayBuffer.g(-24);
        }
    }

    final void a(int[] param0, byte param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        mb var10 = null;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param1 != -33) {
            var10 = (mb) null;
            ByteArrayBuffer.a((mb) null, (mb) null, 109);
          }
          var4 = 0;
          L1: while (true) {
            if (var3_int <= var4) {
              return;
            }
            {
              var5 = this.readIntBE((byte) -69);
              var6 = this.readIntBE((byte) -34);
              var7 = 0;
              var8 = -1640531527;
              var9 = 32;
              L2: while (true) {
                incrementValue$0 = var9;
                var9--;
                if (0 < incrementValue$0) {
                  var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ var7 + param0[3 & var7]);
                  var7 = var7 + var8;
                  var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param0[(var7 & 7480) >>> 11]);
                  continue L2;
                }
                this.position = this.position - 8;
                this.writeIntBE((byte) 95, var5);
                this.writeIntBE((byte) 95, var6);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = (RuntimeException) (var3);
          stackIn_11_1 = new StringBuilder().append("qc.GA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
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

    final void a(byte param0, int[] param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          var5_int = this.position;
          if (param0 > -63) {
            this.readUnsignedMediumBE(3);
          }
          this.position = param2;
          var6 = (-param2 + param3) / 8;
          var7 = 0;
          L1: while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              return;
            }
            {
              var8 = this.readIntBE((byte) -36);
              var9 = this.readIntBE((byte) -103);
              var10 = -957401312;
              var11 = -1640531527;
              var12 = 32;
              L2: while (true) {
                incrementValue$0 = var12;
                var12--;
                if (incrementValue$0 > 0) {
                  var9 = var9 - (var10 + param1[(7701 & var10) >>> 11] ^ var8 + (var8 << 4 ^ var8 >>> 5));
                  var10 = var10 - var11;
                  var8 = var8 - (var10 + param1[var10 & 3] ^ (var9 >>> 5 ^ var9 << 4) + var9);
                  continue L2;
                }
                this.position = this.position - 8;
                this.writeIntBE((byte) 95, var8);
                this.writeIntBE((byte) 95, var9);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("qc.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_h = null;
        field_g = (long[][]) null;
        if (param0 != 0) {
            mb var2 = (mb) null;
            ByteArrayBuffer.a((mb) null, (mb) null, -47);
        }
    }

    final void writeVariableIntBE(byte methodGuard, int value) {
        if (!((value & -128) == 0)) {
            if ((-16384 & value) != 0) {
                if (0 != (value & -2097152)) {
                    if (!((-268435456 & value) == 0)) {
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
            field_g = (long[][]) null;
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
            this.a(91, (java.math.BigInteger) null, (java.math.BigInteger) null);
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
            field_h = (long[]) null;
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
            if (!(zeroCharacterIndex < 0)) {
                throw new IllegalArgumentException("");
            }
            prefixByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[prefixByteIndex] = (byte) 0;
            textForEncoding = (CharSequence) ((Object) text);
            this.position = this.position + hi.a(textForEncoding, this.bytes, 0, text.length(), this.position, 98);
            terminatorByteIndex = this.position;
            this.position = this.position + 1;
            this.bytes[terminatorByteIndex] = (byte) 0;
        } catch (RuntimeException textWriteFailure) {
            throw t.a((Throwable) ((Object) textWriteFailure), "qc.VA(" + (text != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void padZerosToPosition(byte methodGuard, int endPosition) {
        int paddingByteIndex = 0;
        L0: while (this.position < endPosition) {
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
        if (value < 16384) {
            if (!(value < -16384)) {
                this.writeShortBE(49152 + value, 28695);
                return;
            }
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
            this.a(31, (java.math.BigInteger) null, (java.math.BigInteger) null);
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
        L0: while (true) {
          textByteIndex = this.position;
          this.position = this.position + 1;
          if (0 != this.bytes[textByteIndex]) {
            continue L0;
          }
          {
            textLength = this.position + (-textStart - 1);
            if (textLength == 0) {
              return "";
            }
            if (methodGuard < 94) {
              field_i = 68;
            }
            return bc.decodeTextSlice(-45, this.bytes, textStart, textLength);
          }
        }
    }

    final int readSignedSmart(int methodGuard) {
        int sentinelRemainder = 57 % ((-26 - methodGuard) / 54);
        int nextUnsignedByte = 255 & this.bytes[this.position];
        if (nextUnsignedByte < 128) {
            return this.readUnsignedByte((byte) 34) - 64;
        }
        return -49152 + this.readUnsignedShortBE(true);
    }

    final static int a(mb param0, mb param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 2 / ((param2 + 41) / 54);
          var4 = (String) null;
          stackIn_1_0 = pf.a(0, 0, param0, param1, (String) null, false, 94);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var3);
          stackIn_4_1 = new StringBuilder().append("qc.N(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
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

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
            var4_int = this.position;
            this.position = 0;
            var5 = new byte[var4_int];
            this.readBytes(param0 ^ 29915, var4_int, var5, 0);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param1);
            var8 = var7.toByteArray();
            this.position = param0;
            this.writeShortBE(var8.length, 28695);
            this.writeBytes(var8.length, -97, var8, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qc.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ByteArrayBuffer(int capacity) {
        this.bytes = oi.a(false, capacity);
        this.position = 0;
    }

    ByteArrayBuffer(byte[] bytes) {
        try {
            this.bytes = bytes;
            this.position = 0;
        } catch (RuntimeException constructionFailure) {
            throw t.a((Throwable) ((Object) constructionFailure), "qc.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var14 = 0;
        long stackIn_5_0 = 0L;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        field_g = new long[8][256];
        field_h = new long[11];
        var0 = 0;
        L0: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((var0 & 1) != 0) {
            stackIn_5_0 = (long)(var1 & 255);
          } else {
            stackIn_5_0 = (long)(var1 >>> 8);
          }
          var2 = stackIn_5_0;
          var4 = var2 << 1;
          if (var4 >= 256L) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var6 ^ var2;
          var10 = var6 << 1;
          if (var10 >= 256L) {
            var10 = var10 ^ 285L;
          }
          var12 = var2 ^ var10;
          field_g[0][var0] = ue.a(var12, ue.a(var4 << 8, ue.a(var8 << 16, ue.a(ue.a(ue.a(var6 << 40, ue.a(var2 << 56, var2 << 48)), var2 << 32), var10 << 24))));
          for (var14 = 1; var14 < 8; var14++) {
            field_g[var14][var0] = ue.a(field_g[var14 - 1][var0] >>> 8, field_g[-1 + var14][var0] << 56);
          }
          var0++;
        }
        field_h[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
          var1 = var0 * 8 - 8;
          field_h[var0] = f.a(f.a(f.a(cj.a(16711680L, field_g[5][5 + var1]), f.a(cj.a(4278190080L, field_g[4][var1 + 4]), f.a(f.a(f.a(cj.a(field_g[0][var1], -72057594037927936L), cj.a(field_g[1][1 + var1], 71776119061217280L)), cj.a(280375465082880L, field_g[2][2 + var1])), cj.a(field_g[3][var1 + 3], 1095216660480L)))), cj.a(field_g[6][var1 + 6], 65280L)), cj.a(255L, field_g[7][var1 + 7]));
        }
    }
}
