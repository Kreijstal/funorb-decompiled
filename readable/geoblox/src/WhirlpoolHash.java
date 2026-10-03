/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class WhirlpoolHash {
    private long[] hashWords;
    static ob field_d;
    private byte[] blockBuffer;
    private byte[] messageBitLength;
    private long[] roundScratch;
    private int bufferedBitCount;
    private long[] messageWords;
    private long[] roundKey;
    private int bufferBytePosition;
    static java.util.zip.CRC32 field_f;
    private long[] cipherState;

    public static void b(int param0) {
        field_d = null;
        int var1 = -34 % ((param0 - 31) / 51);
        field_f = null;
    }

    private final void processBlock(int methodGuard) {
        long hashWordSnapshot = 0L;
        long messageWordSnapshot = 0L;
        int wordIndexOrRound;
        int blockByteOffsetOrWordIndex;
        int keyByteIndexOrStateStartSnapshot;
        int byteShift;
        int unusedClientGuardSnapshot;
        int stateByteIndex;
        unusedClientGuardSnapshot = Geoblox.field_C;
        if (methodGuard < 103) {
          return;
        }
        wordIndexOrRound = 0;
        blockByteOffsetOrWordIndex = 0;
        while (wordIndexOrRound < 8) {
          this.messageWords[wordIndexOrRound] = f.xorLong(cj.andLong((long)this.blockBuffer[7 + blockByteOffsetOrWordIndex], 255L), f.xorLong(f.xorLong(f.xorLong(f.xorLong(cj.andLong(1095216660480L, (long)this.blockBuffer[blockByteOffsetOrWordIndex + 3] << 32), f.xorLong(cj.andLong(255L, (long)this.blockBuffer[blockByteOffsetOrWordIndex + 2]) << 40, f.xorLong(cj.andLong((long)this.blockBuffer[blockByteOffsetOrWordIndex + 1] << 48, 71776119061217280L), (long)this.blockBuffer[blockByteOffsetOrWordIndex] << 56))), cj.andLong((long)this.blockBuffer[4 + blockByteOffsetOrWordIndex] << 24, 4278190080L)), cj.andLong(16711680L, (long)this.blockBuffer[blockByteOffsetOrWordIndex + 5] << 16)), cj.andLong((long)this.blockBuffer[blockByteOffsetOrWordIndex + 6] << 8, 65280L)));
          blockByteOffsetOrWordIndex += 8;
          wordIndexOrRound++;
        }
        for (wordIndexOrRound = 0; wordIndexOrRound < 8; wordIndexOrRound++) {
          hashWordSnapshot = this.hashWords[wordIndexOrRound];
          messageWordSnapshot = this.messageWords[wordIndexOrRound];
          this.roundKey[wordIndexOrRound] = hashWordSnapshot;
          this.cipherState[wordIndexOrRound] = f.xorLong(messageWordSnapshot, hashWordSnapshot);
        }
        for (wordIndexOrRound = 1; 10 >= wordIndexOrRound; wordIndexOrRound++) {
          for (blockByteOffsetOrWordIndex = 0; blockByteOffsetOrWordIndex < 8; blockByteOffsetOrWordIndex++) {
            this.roundScratch[blockByteOffsetOrWordIndex] = 0L;
            keyByteIndexOrStateStartSnapshot = 0;
            byteShift = 56;
            while (keyByteIndexOrStateStartSnapshot < 8) {
              this.roundScratch[blockByteOffsetOrWordIndex] = f.xorLong(this.roundScratch[blockByteOffsetOrWordIndex], ByteArrayBuffer.whirlpoolTables[keyByteIndexOrStateStartSnapshot][cd.andInt(255, (int)(this.roundKey[cd.andInt(7, blockByteOffsetOrWordIndex - keyByteIndexOrStateStartSnapshot)] >>> byteShift))]);
              byteShift -= 8;
              keyByteIndexOrStateStartSnapshot++;
            }
          }
          for (blockByteOffsetOrWordIndex = 0; blockByteOffsetOrWordIndex < 8; blockByteOffsetOrWordIndex++) {
            this.roundKey[blockByteOffsetOrWordIndex] = this.roundScratch[blockByteOffsetOrWordIndex];
          }
          this.roundKey[0] = f.xorLong(this.roundKey[0], ByteArrayBuffer.whirlpoolRoundConstants[wordIndexOrRound]);
          for (blockByteOffsetOrWordIndex = 0; blockByteOffsetOrWordIndex < 8; blockByteOffsetOrWordIndex++) {
            this.roundScratch[blockByteOffsetOrWordIndex] = this.roundKey[blockByteOffsetOrWordIndex];
            stateByteIndex = 0;
            keyByteIndexOrStateStartSnapshot = stateByteIndex;
            byteShift = 56;
            while (stateByteIndex < 8) {
              this.roundScratch[blockByteOffsetOrWordIndex] = f.xorLong(this.roundScratch[blockByteOffsetOrWordIndex], ByteArrayBuffer.whirlpoolTables[stateByteIndex][cd.andInt(255, (int)(this.cipherState[cd.andInt(-stateByteIndex + blockByteOffsetOrWordIndex, 7)] >>> byteShift))]);
              stateByteIndex++;
              byteShift -= 8;
            }
          }
          for (blockByteOffsetOrWordIndex = 0; 8 > blockByteOffsetOrWordIndex; blockByteOffsetOrWordIndex++) {
            this.cipherState[blockByteOffsetOrWordIndex] = this.roundScratch[blockByteOffsetOrWordIndex];
          }
        }
        for (wordIndexOrRound = 0; wordIndexOrRound < 8; wordIndexOrRound++) {
          this.hashWords[wordIndexOrRound] = f.xorLong(this.hashWords[wordIndexOrRound], f.xorLong(this.cipherState[wordIndexOrRound], this.messageWords[wordIndexOrRound]));
        }
        return;
    }

    final void updateBits(byte[] source, long remainingBitCount, int methodGuard) {
        RuntimeException hashUpdateFailureBeforeDescription = null;
        StringBuilder hashUpdateMessagePrefix = null;
        String sourceDescription = null;
        RuntimeException caughtHashUpdateFailure = null;
        int sourceByteIndex = 0;
        RuntimeException hashUpdateFailureForContext = null;
        int sourceBitShift = 0;
        int bufferPartialByteBits = 0;
        int shiftedSourceByte = 0;
        long bitLengthToAccumulate = 0L;
        int lengthByteIndex = 0;
        int lengthCarry = 0;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.field_C;
        try {
          sourceByteIndex = 0;
          sourceBitShift = 7 & 8 - (7 & (int)remainingBitCount);
          bufferPartialByteBits = 7 & this.bufferedBitCount;
          bitLengthToAccumulate = remainingBitCount;
          lengthByteIndex = 31;
          lengthCarry = methodGuard;
          while (lengthByteIndex >= 0) {
            lengthCarry = lengthCarry + ((255 & (int)bitLengthToAccumulate) + (this.messageBitLength[lengthByteIndex] & 255));
            this.messageBitLength[lengthByteIndex] = (byte)lengthCarry;
            lengthCarry = lengthCarry >>> 8;
            bitLengthToAccumulate = bitLengthToAccumulate >>> 8;
            lengthByteIndex--;
          }
          while (true) {
            if (8L < remainingBitCount) {
              shiftedSourceByte = 255 & source[sourceByteIndex] << sourceBitShift | (source[sourceByteIndex + 1] & 255) >>> -sourceBitShift + 8;
              if (shiftedSourceByte >= 0) {
                if (256 > shiftedSourceByte) {
                  this.blockBuffer[this.bufferBytePosition] = (byte)lb.orInt((int) this.blockBuffer[this.bufferBytePosition], shiftedSourceByte >>> bufferPartialByteBits);
                  this.bufferedBitCount = this.bufferedBitCount + (-bufferPartialByteBits + 8);
                  this.bufferBytePosition = this.bufferBytePosition + 1;
                  if (512 == this.bufferedBitCount) {
                    this.processBlock(methodGuard ^ 111);
                    this.bufferBytePosition = 0;
                    this.bufferedBitCount = 0;
                  }
                  this.blockBuffer[this.bufferBytePosition] = (byte)cd.andInt(255, shiftedSourceByte << -bufferPartialByteBits + 8);
                  remainingBitCount = remainingBitCount - 8L;
                  this.bufferedBitCount = this.bufferedBitCount + bufferPartialByteBits;
                  sourceByteIndex++;
                  continue;
                }
              }
              throw new RuntimeException("LOGIC ERROR");
            }
            if (remainingBitCount <= 0L) {
              shiftedSourceByte = 0;
            } else {
              shiftedSourceByte = source[sourceByteIndex] << sourceBitShift & 255;
              this.blockBuffer[this.bufferBytePosition] = (byte)lb.orInt((int) this.blockBuffer[this.bufferBytePosition], shiftedSourceByte >>> bufferPartialByteBits);
            }
            if (8L > remainingBitCount + (long)bufferPartialByteBits) {
              this.bufferedBitCount = (int)((long)this.bufferedBitCount + remainingBitCount);
            } else {
              remainingBitCount = remainingBitCount - (long)(8 - bufferPartialByteBits);
              this.bufferBytePosition = this.bufferBytePosition + 1;
              this.bufferedBitCount = this.bufferedBitCount + (-bufferPartialByteBits + 8);
              if (this.bufferedBitCount == 512) {
                this.processBlock(118);
                this.bufferedBitCount = 0;
                this.bufferBytePosition = 0;
              }
              this.blockBuffer[this.bufferBytePosition] = (byte)cd.andInt(shiftedSourceByte << -bufferPartialByteBits + 8, 255);
              this.bufferedBitCount = this.bufferedBitCount + (int)remainingBitCount;
            }
            return;
          }
        } catch (java.lang.RuntimeException hashUpdateFailure) {
          caughtHashUpdateFailure = hashUpdateFailure;
          hashUpdateFailureForContext = caughtHashUpdateFailure;
          hashUpdateFailureBeforeDescription = (RuntimeException) (hashUpdateFailureForContext);
          hashUpdateMessagePrefix = new StringBuilder().append("ge.G(");
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) hashUpdateFailureBeforeDescription), ((StringBuilder) (Object) hashUpdateMessagePrefix).append(sourceDescription).append(',').append(remainingBitCount).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 12) {
            field_d = (ob) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = vg.field_b.equals(oe.a(var3, 12));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var2);
          stackIn_6_1 = new StringBuilder().append("ge.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void finishDigest(byte[] destination, int destinationOffset, boolean skipResetGuard) {
        int extraBlockPaddingIndex = 0;
        int finalBlockPaddingIndex = 0;
        RuntimeException digestFailureBeforeDescription = null;
        StringBuilder digestMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtDigestFailure = null;
        int hashWordIndex = 0;
        RuntimeException digestFailureForContext = null;
        int destinationByteIndex = 0;
        long hashWord = 0L;
        int unusedClientGuardSnapshot = 0;
        unusedClientGuardSnapshot = Geoblox.field_C;
        try {
          L0: {
            this.blockBuffer[this.bufferBytePosition] = (byte)lb.orInt((int) this.blockBuffer[this.bufferBytePosition], 128 >>> cd.andInt(this.bufferedBitCount, 7));
            this.bufferBytePosition = this.bufferBytePosition + 1;
            if (this.bufferBytePosition > 32) {
              while (this.bufferBytePosition < 64) {
                extraBlockPaddingIndex = this.bufferBytePosition;
                this.bufferBytePosition = this.bufferBytePosition + 1;
                this.blockBuffer[extraBlockPaddingIndex] = (byte) 0;
              }
              this.processBlock(116);
              this.bufferBytePosition = 0;
              break L0;
            }
          }
          if (!skipResetGuard) {
            this.reset(-38);
          }
          while (this.bufferBytePosition < 32) {
            finalBlockPaddingIndex = this.bufferBytePosition;
            this.bufferBytePosition = this.bufferBytePosition + 1;
            this.blockBuffer[finalBlockPaddingIndex] = (byte) 0;
          }
          sf.a(this.messageBitLength, 0, this.blockBuffer, 32, 32);
          this.processBlock(117);
          hashWordIndex = 0;
          destinationByteIndex = destinationOffset;
          while (hashWordIndex < 8) {
            hashWord = this.hashWords[hashWordIndex];
            destination[destinationByteIndex] = (byte)(int)(hashWord >>> 56);
            destination[1 + destinationByteIndex] = (byte)(int)(hashWord >>> 48);
            destination[2 + destinationByteIndex] = (byte)(int)(hashWord >>> 40);
            destination[destinationByteIndex + 3] = (byte)(int)(hashWord >>> 32);
            destination[destinationByteIndex + 4] = (byte)(int)(hashWord >>> 24);
            destination[destinationByteIndex + 5] = (byte)(int)(hashWord >>> 16);
            destination[6 + destinationByteIndex] = (byte)(int)(hashWord >>> 8);
            destination[destinationByteIndex + 7] = (byte)(int)hashWord;
            hashWordIndex++;
            destinationByteIndex += 8;
          }
          return;
        } catch (java.lang.RuntimeException digestFailure) {
          caughtDigestFailure = digestFailure;
          digestFailureForContext = caughtDigestFailure;
          digestFailureBeforeDescription = (RuntimeException) (digestFailureForContext);
          digestMessagePrefix = new StringBuilder().append("ge.C(");
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) digestFailureBeforeDescription), ((StringBuilder) (Object) digestMessagePrefix).append(destinationDescription).append(',').append(destinationOffset).append(',').append(skipResetGuard).append(')').toString());
        }
    }

    final static int advanceArchiveHandshake(byte methodGuard) {
        try {
            int connectFailureBeforeReturn = 0;
            int timeoutStatusBeforeReturn = 0;
            int replyFailureBeforeReturn = 0;
            int successBeforeReturn = 0;
            Throwable caughtHandshakeFailure = null;
            int replyCode = 0;
            IOException handshakeIoFailure = null;
            String unusedGuardTextSnapshot = null;
            ByteArrayBuffer handshakePacket = null;
            if (wg.archiveNetworkClient.failureCount >= 4) {
              if (wg.archiveNetworkClient.failureCode == -1) {
                return 3;
              }
              if (wg.archiveNetworkClient.failureCode != -2) {
                return 1;
              }
              return 4;
            }
            try {
              if (qh.archiveHandshakeStage == 0) {
                gj.archiveConnectTask = ph.archiveTaskDispatcher.requestSocket(vg.archivePort, GameplaySession.archiveHost, false);
                qh.archiveHandshakeStage = qh.archiveHandshakeStage + 1;
              }
              if (qh.archiveHandshakeStage == 1) {
                if (gj.archiveConnectTask.status == 2) {
                  connectFailureBeforeReturn = eb.handleArchiveHandshakeFailure(-1, 28625);
                  return connectFailureBeforeReturn;
                }
                if (1 == gj.archiveConnectTask.status) {
                  qh.archiveHandshakeStage = qh.archiveHandshakeStage + 1;
                }
              }
              if (methodGuard != -74) {
                unusedGuardTextSnapshot = (String) null;
                WhirlpoolHash.a((String) null, (byte) -15);
              }
              if (2 == qh.archiveHandshakeStage) {
                li.archiveHandshakeSocket = new BufferedSocket((java.net.Socket) (gj.archiveConnectTask.result), ph.archiveTaskDispatcher);
                handshakePacket = new ByteArrayBuffer(13);
                ke.writeConnectionHeader(pc.archiveLanguageId, true, hc.archiveClientId, ArchiveIndex.archiveServerNumber, handshakePacket);
                handshakePacket.writeByte((byte) -54, 15);
                handshakePacket.writeIntBE((byte) 95, ag.archiveGameCrc);
                li.archiveHandshakeSocket.enqueueWrite(100, 0, 13, handshakePacket.bytes);
                qh.archiveHandshakeStage = qh.archiveHandshakeStage + 1;
                eb.archiveHandshakeDeadlineMillis = 30000L + oa.a(methodGuard - 12446);
              }
              if (qh.archiveHandshakeStage == 3) {
                if (0 < li.archiveHandshakeSocket.available((byte) 78)) {
                  replyCode = li.archiveHandshakeSocket.readByte(-17422);
                  if (replyCode != 0) {
                    replyFailureBeforeReturn = eb.handleArchiveHandshakeFailure(replyCode, 28625);
                    return replyFailureBeforeReturn;
                  }
                  qh.archiveHandshakeStage = qh.archiveHandshakeStage + 1;
                } else {
                  if (oa.a(-12520) > eb.archiveHandshakeDeadlineMillis) {
                    timeoutStatusBeforeReturn = eb.handleArchiveHandshakeFailure(-2, methodGuard ^ -28569);
                    return timeoutStatusBeforeReturn;
                  }
                }
              }
              if (4 != qh.archiveHandshakeStage) {
                return -1;
              }
              wg.archiveNetworkClient.attachSocket(li.archiveHandshakeSocket, false, si.archiveUseControlOpcode2);
              gj.archiveConnectTask = null;
              qh.archiveHandshakeStage = 0;
              li.archiveHandshakeSocket = null;
              successBeforeReturn = 0;
              return successBeforeReturn;
            } catch (java.io.IOException handshakeIOException) {
              caughtHandshakeFailure = handshakeIOException;
              handshakeIoFailure = (IOException) (Object) caughtHandshakeFailure;
              return eb.handleArchiveHandshakeFailure(-3, 28625);
            }
        } catch (RuntimeException | Error uncheckedHandshakeFailure) {
            throw uncheckedHandshakeFailure;
        } catch (Throwable checkedHandshakeFailure) {
            throw new RuntimeException(checkedHandshakeFailure);
        }
    }

    final void reset(int methodGuard) {
        int lengthByteIndexOrHashWordIndex = 0;
        int unusedClientGuardSnapshot = Geoblox.field_C;
        for (lengthByteIndexOrHashWordIndex = 0; lengthByteIndexOrHashWordIndex < 32; lengthByteIndexOrHashWordIndex++) {
            this.messageBitLength[lengthByteIndexOrHashWordIndex] = (byte) 0;
        }
        this.blockBuffer[0] = (byte) 0;
        this.bufferedBitCount = 0;
        this.bufferBytePosition = 0;
        for (lengthByteIndexOrHashWordIndex = 0; 8 > lengthByteIndexOrHashWordIndex; lengthByteIndexOrHashWordIndex++) {
            this.hashWords[lengthByteIndexOrHashWordIndex] = 0L;
        }
        if (methodGuard <= 51) {
            this.bufferBytePosition = 101;
        }
    }

    WhirlpoolHash() {
        this.hashWords = new long[8];
        this.blockBuffer = new byte[64];
        this.messageBitLength = new byte[32];
        this.bufferBytePosition = 0;
        this.bufferedBitCount = 0;
        this.cipherState = new long[8];
        this.roundKey = new long[8];
        this.messageWords = new long[8];
        this.roundScratch = new long[8];
    }

    static {
        field_f = new java.util.zip.CRC32();
    }
}
