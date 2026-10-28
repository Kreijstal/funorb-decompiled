/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class BufferedRandomAccessFile {
    private long readStart;
    private long position;
    static String field_c;
    private long physicalLength;
    private long filePosition;
    private long writeStart;
    private byte[] writeBuffer;
    private long length;
    private byte[] readBuffer;
    private int writeLength;
    private int readLength;
    private BoundedRandomAccessFile file;

    final void write(boolean guard, int sourceOffset, byte[] source, int length) throws IOException {
        String stackIn_55_2 = null;
        Throwable decompiledCaughtException = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          try {
            if (this.length < (this.position + (long)length)) {
              this.length = (long)length + this.position;
            }
            if (this.writeStart != -1L) {
              if (!(this.writeStart <= this.position)) {
                this.flush(118);
              } else if (((long)this.writeLength + this.writeStart) < this.position) {
                this.flush(118);
              }
            }
            if (this.writeStart != -1L &&
              this.position + (long)length > this.writeStart + (long)this.writeBuffer.length) {
              int var5_int = (int)(this.writeStart - this.position + (long)this.writeBuffer.length);
              ArraySupport.copy(source, sourceOffset, this.writeBuffer, (int)(this.position - this.writeStart), var5_int);
              sourceOffset = sourceOffset + var5_int;
              this.position = this.position + (long)var5_int;
              length = length - var5_int;
              this.writeLength = this.writeBuffer.length;
              this.flush(115);
            }
            if (this.writeBuffer.length < length) {
              if (~this.filePosition != ~this.position) {
                this.file.seek(this.position, 1);
                this.filePosition = this.position;
              }
              this.file.write(source, length, sourceOffset, -15814);
              this.filePosition = this.filePosition + (long)length;
              if (this.physicalLength < this.filePosition) {
                this.physicalLength = this.filePosition;
              }
              long var5_long = -1L;
              if (this.readStart <= this.position &&
                this.readStart + (long)this.readLength > this.position) {
                var5_long = this.position;
              } else if (this.readStart >= this.position &&
                this.readStart < ((long)length + this.position)) {
                var5_long = this.readStart;
              }
              long var7 = -1L;
              if ((this.position + (long)length) > this.readStart &&
                ((long)this.readLength + this.readStart) >= (this.position + (long)length)) {
                var7 = (long)length + this.position;
              } else if ((this.readStart + (long)this.readLength) > this.position &&
                ((long)this.readLength + this.readStart) <= ((long)length + this.position)) {
                var7 = this.readStart + (long)this.readLength;
              }
              if (var5_long > -1L &&
                var5_long < var7) {
                int var9 = (int)(var7 - var5_long);
                ArraySupport.copy(source, (int)(var5_long + (long)sourceOffset - this.position), this.readBuffer, (int)(var5_long - this.readStart), var9);
              }
              this.position = this.position + (long)length;
              return;
            }
            if (length > 0) {
              if (this.writeStart == -1L) {
                this.writeStart = this.position;
              }
              ArraySupport.copy(source, sourceOffset, this.writeBuffer, (int)(this.position - this.writeStart), length);
              this.position = this.position + (long)length;
              if (this.position - this.writeStart > (long)this.writeLength) {
                this.writeLength = (int)(this.position - this.writeStart);
              }
              return;
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
          if (!guard) {
            this.readBuffer = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_54_0 = var5_ref;
          StringBuilder stackIn_54_1 = new StringBuilder().append("rg.B(").append(guard).append(',').append(sourceOffset).append(',');
          if (source == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(length).append(')').toString());
        }
    }

    final void close(byte guard) throws IOException {
        if (guard != -111) {
          field_c = (String) null;
        }
        this.flush(125);
        this.file.close(0);
    }

    private final void flush(int guard) throws IOException {
        int var7 = EscapeVector.obfuscationControl;
        if (this.writeStart != -1L) {
          if (this.writeStart != this.filePosition) {
            this.file.seek(this.writeStart, 1);
            this.filePosition = this.writeStart;
          }
          this.file.write(this.writeBuffer, this.writeLength, 0, -15814);
          this.filePosition = this.filePosition + (long)this.writeLength;
          if (this.physicalLength < this.filePosition) {
            this.physicalLength = this.filePosition;
          }
          long var2_long = -1L;
          if (this.writeStart >= this.readStart &&
            this.readStart + (long)this.readLength > this.writeStart) {
            var2_long = this.writeStart;
          } else if (this.readStart >= this.writeStart &&
            this.readStart < (this.writeStart + (long)this.writeLength)) {
            var2_long = this.readStart;
          }
          long var4 = -1L;
          if (((long)this.writeLength + this.writeStart) > this.readStart &&
            (long)this.readLength + this.readStart >= this.writeStart + (long)this.writeLength) {
            var4 = (long)this.writeLength + this.writeStart;
          } else if (this.writeStart < (this.readStart + (long)this.readLength) &&
            (this.readStart + (long)this.readLength) <= (this.writeStart + (long)this.writeLength)) {
            var4 = this.readStart + (long)this.readLength;
          }
          if (var2_long > -1L &&
            var2_long < var4) {
            int var6 = (int)(-var2_long + var4);
            ArraySupport.copy(this.writeBuffer, (int)(-this.writeStart + var2_long), this.readBuffer, (int)(-this.readStart + var2_long), var6);
          }
          this.writeLength = 0;
          this.writeStart = -1L;
        }
        int var2 = 81 / ((56 - guard) / 50);
    }

    final void seek(int guard, long position) throws IOException {
        if (guard != 0) {
          return;
        }
        if (position < 0L) {
          throw new IOException();
        }
        this.position = position;
    }

    final long length(int guard) {
        if (guard != 16034) {
          BufferedRandomAccessFile.releaseStatics((byte) -75);
        }
        return this.length;
    }

    private final void fillReadBuffer(boolean guard) throws IOException {
        int var4 = EscapeVector.obfuscationControl;
        this.readLength = 0;
        if (this.position != this.filePosition) {
          this.file.seek(this.position, 1);
          this.filePosition = this.position;
        }
        this.readStart = this.position;
        if (!guard) {
          return;
        }
        while (this.readBuffer.length > this.readLength) {
          int var2 = this.readBuffer.length - this.readLength;
          if (var2 > 200000000) {
            var2 = 200000000;
          }
          int var3 = this.file.read(var2, (byte) 127, this.readBuffer, this.readLength);
          if (var3 == -1) {
            break;
          }
          this.readLength = this.readLength + var3;
          this.filePosition = this.filePosition + (long)var3;
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        int var1 = -78 / ((-11 - guard) / 41);
    }

    final void readFully(int destinationOffset, int length, byte guard, byte[] destination) throws IOException {
        String stackIn_61_2 = null;
        Throwable decompiledCaughtException = null;
        int var14 = EscapeVector.obfuscationControl;
        try {
          try {
            if (guard != 101) {
              return;
            }
            if (destinationOffset + length > destination.length) {
              throw new ArrayIndexOutOfBoundsException(length + (destinationOffset - destination.length));
            }
            if (this.writeStart != -1L &&
              this.position >= this.writeStart &&
              (long)this.writeLength + this.writeStart >= (long)length + this.position) {
              ArraySupport.copy(this.writeBuffer, (int)(-this.writeStart + this.position), destination, destinationOffset, length);
              this.position = this.position + (long)length;
              return;
            }
            long var5_long = this.position;
            int var7 = destinationOffset;
            int var8 = length;
            if (this.readStart <= this.position &&
              this.position < this.readStart + (long)this.readLength) {
              int var9_int = (int)(-this.position + this.readStart + (long)this.readLength);
              if (length < var9_int) {
                var9_int = length;
              }
              ArraySupport.copy(this.readBuffer, (int)(this.position - this.readStart), destination, destinationOffset, var9_int);
              destinationOffset = destinationOffset + var9_int;
              length = length - var9_int;
              this.position = this.position + (long)var9_int;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (length > this.readBuffer.length) {
              this.file.seek(this.position, 1);
              this.filePosition = this.position;
              while (length > 0) {
                int var9_intLifetime1 = this.file.read(length, (byte) 125, destination, destinationOffset);
                if (var9_intLifetime1 == -1) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                destinationOffset = destinationOffset + var9_intLifetime1;
                this.position = this.position + (long)var9_intLifetime1;
                length = length - var9_intLifetime1;
                this.filePosition = this.filePosition + (long)var9_intLifetime1;
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0 &&
              length > 0) {
              this.fillReadBuffer(true);
              int var9_intLifetime1Lifetime1 = length;
              if (var9_intLifetime1Lifetime1 > this.readLength) {
                var9_intLifetime1Lifetime1 = this.readLength;
              }
              ArraySupport.copy(this.readBuffer, 0, destination, destinationOffset, var9_intLifetime1Lifetime1);
              this.position = this.position + (long)var9_intLifetime1Lifetime1;
              length = length - var9_intLifetime1Lifetime1;
              destinationOffset = destinationOffset + var9_intLifetime1Lifetime1;
            }
            if (this.writeStart != -1L) {
              if (this.writeStart > this.position) {
                int stackIn_29_0 = 0;
                int stackIn_29_1 = length;
                if (stackIn_29_0 < stackIn_29_1) {
                  int var9_intLifetime2 = destinationOffset + (int)(this.writeStart - this.position);
                  if (var9_intLifetime2 > destinationOffset + length) {
                    var9_intLifetime2 = length + destinationOffset;
                  }
                  while (destinationOffset < var9_intLifetime2) {
                    int incrementValue$0 = destinationOffset;
                    destinationOffset++;
                    destination[incrementValue$0] = (byte) 0;
                    length--;
                    this.position = this.position + 1L;
                  }
                }
              }
              long var9 = -1L;
              long var11 = -1L;
              if (var5_long <= this.writeStart &&
                this.writeStart < var5_long + (long)var8) {
                var9 = this.writeStart;
              } else if (this.writeStart <= var5_long &&
                var5_long < ((long)this.writeLength + this.writeStart)) {
                var9 = var5_long;
              }
              if (var5_long < ((long)this.writeLength + this.writeStart) &&
                this.writeStart + (long)this.writeLength <= var5_long + (long)var8) {
                var11 = (long)this.writeLength + this.writeStart;
              } else if (var5_long + (long)var8 > this.writeStart &&
                (this.writeStart + (long)this.writeLength) >= ((long)var8 + var5_long)) {
                var11 = var5_long + (long)var8;
              }
              if (var9 > -1L &&
                var11 > var9) {
                int var13 = (int)(var11 - var9);
                ArraySupport.copy(this.writeBuffer, (int)(-this.writeStart + var9), destination, var7 + (int)(var9 - var5_long), var13);
                if (this.position < var11) {
                  length = (int)((long)length - (var11 - this.position));
                  this.position = var11;
                }
              }
            }
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            IOException var5 = (IOException) (Object) decompiledCaughtException;
            this.filePosition = -1L;
            throw var5;
          }
          if (length > 0) {
            throw new EOFException();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          RuntimeException var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          RuntimeException stackIn_60_0 = var5_ref;
          StringBuilder stackIn_60_1 = new StringBuilder().append("rg.J(").append(destinationOffset).append(',').append(length).append(',').append(guard).append(',');
          if (destination == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(')').toString());
        }
    }

    final static short[] readPackedShortArray(CipherPacketBuffer input, int countBits, short[] retained, int complementedNullCount) {
        int var7 = 0;
        String stackIn_20_2 = null;
        String stackIn_23_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var4_int = input.readBits(countBits, 8);
          if (~var4_int == complementedNullCount) {
            return null;
          }
          if (retained == null ||
            var4_int != retained.length) {
            retained = new short[var4_int];
          }
          int var5 = input.readBits(4, 8);
          int var6 = (short)input.readBits(16, 8);
          if (0 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              retained[var7] = (short)(var6 + input.readBits(var5, 8));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              retained[var7] = (short)var6;
            }
          }
          short[] stackIn_16_0 = (short[]) (retained);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var4;
          StringBuilder stackIn_19_1 = new StringBuilder().append("rg.H(");
          if (input == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          StringBuilder stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(countBits).append(',');
          if (retained == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(complementedNullCount).append(')').toString());
        }
    }

    final static boolean pollIncomingPacket(int[] packetLengths, int guard) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (ThreeSliceButtonPainter.field_t != AccountFormStage.field_d) {
            return false;
          }
          var2_long = MonotonicClockSupport.monotonicMillis(128);
          if (guard < 101) {
            return true;
          }
          if (LoginCredentials.field_a != 0 &&
            GameAppletShell.field_a < 0) {
            DelayedServerPacket var4_ref_dm = (DelayedServerPacket) (ModalPanel.field_L.first(false));
            if (var4_ref_dm != null &&
              var4_ref_dm.readyAtMillis < var2_long) {
              var4_ref_dm.unlink((byte) -67);
              EmailSyntaxValidator.field_r = var4_ref_dm.payload.length;
              QuickChatDynamicCommand.incomingPackets.position = 0;
              for (int var5_int = 0; var5_int < EmailSyntaxValidator.field_r; var5_int++) {
                QuickChatDynamicCommand.incomingPackets.payload[var5_int] = var4_ref_dm.payload[var5_int];
              }
              NetworkGameClient.oldestIncomingOpcode = ArchiveIndex.field_t;
              ArchiveIndex.field_t = LoginPromptSupport.field_b;
              LoginPromptSupport.field_b = LegacyStyleNode.field_v;
              LegacyStyleNode.field_v = var4_ref_dm.opcode;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (packetLengths == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(guard).append(')').toString());
        }
        int stackIn_22_0 = GameAppletShell.field_a;
        try {
          while (true) {
            if (stackIn_22_0 < 0) {
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (!Checkbox.readIncomingBytes(30000, 1)) {
                return false;
              }
              GameAppletShell.field_a = QuickChatDynamicCommand.incomingPackets.readCipheredOpcode(8);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              EmailSyntaxValidator.field_r = packetLengths[GameAppletShell.field_a];
            }
            if (!ArchiveKeyRequest.hasCompletePacket(10550)) {
              return false;
            }
            if (LoginCredentials.field_a == 0) {
              NetworkGameClient.oldestIncomingOpcode = ArchiveIndex.field_t;
              ArchiveIndex.field_t = LoginPromptSupport.field_b;
              LoginPromptSupport.field_b = LegacyStyleNode.field_v;
              LegacyStyleNode.field_v = GameAppletShell.field_a;
              GameAppletShell.field_a = -1;
              return true;
            }
            int var4 = LoginCredentials.field_a;
            if (AppletViewportState.networkDelayJitterMillis != 0.0) {
              var4 = (int)((double)var4 + QuitPageSupport.field_a.nextGaussian() * AppletViewportState.networkDelayJitterMillis);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            DelayedServerPacket var5 = new DelayedServerPacket(var2_long + (long)var4, GameAppletShell.field_a, new byte[EmailSyntaxValidator.field_r]);
            for (int var6 = 0; var6 < EmailSyntaxValidator.field_r; var6++) {
              var5.payload[var6] = QuickChatDynamicCommand.incomingPackets.payload[var6];
            }
            ModalPanel.field_L.addLast(-12328, var5);
            GameAppletShell.field_a = -1;
            stackIn_22_0 = GameAppletShell.field_a;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_42_0 = var2;
          stackIn_42_1 = new StringBuilder().append("rg.A(");
          if (packetLengths == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(guard).append(')').toString());
        }
    }

    final void readFully(byte guard, byte[] destination) throws IOException {
        try {
          if (guard < 31) {
            this.length(-37);
          }
          this.readFully(0, destination.length, (byte) 101, destination);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "rg.G(" + guard + ',' + (destination != null ? "{...}" : "null") + ')');
        }
    }

    BufferedRandomAccessFile(BoundedRandomAccessFile file, int readCapacity, int writeCapacity) throws IOException {
        this.readStart = -1L;
        this.writeStart = -1L;
        this.writeLength = 0;
        try {
          this.file = file;
          long dupTemp$0 = file.length(-26510);
          this.physicalLength = dupTemp$0;
          this.length = dupTemp$0;
          this.position = 0L;
          this.readBuffer = new byte[readCapacity];
          this.writeBuffer = new byte[writeCapacity];
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "rg.<init>(" + (file != null ? "{...}" : "null") + ',' + readCapacity + ',' + writeCapacity + ')');
        }
    }

    final static NameAvailabilityResult nameAvailabilitySuggestions(String[] suggestions, byte guard) {
        String stackIn_8_2 = null;
        try {
          if (guard > -53) {
            NameAvailabilityResult stackIn_2_0 = (NameAvailabilityResult) null;
            return stackIn_2_0;
          }
          NameAvailabilityResult var2 = new NameAvailabilityResult(false);
          var2.nameSuggestions = suggestions;
          NameAvailabilityResult stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var2_ref;
          StringBuilder stackIn_7_1 = new StringBuilder().append("rg.F(");
          if (suggestions == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_c = "Names cannot contain consecutive spaces";
    }
}
