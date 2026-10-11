/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static int field_I;
    static int field_w;
    private IsaacRandom opcodeCipher;
    static String field_x;
    static int[] field_D;
    static SceneWidget field_H;
    static String field_y;
    private int readBitPosition;
    static tg field_z;
    static String field_G;
    static String field_C;
    static String field_E;
    static boolean field_B;

    final void writeCipheredOpcode(int opcode, byte obfuscationGuard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(opcode + this.opcodeCipher.nextInt(-96));
        if (obfuscationGuard != -117) {
          field_y = (String) null;
        }
    }

    public static void e(boolean param0) {
        field_y = null;
        field_D = null;
        field_G = null;
        field_z = null;
        field_H = null;
        if (!param0) {
          return;
        }
        field_x = null;
        field_E = null;
        field_C = null;
    }

    final void readCipheredBytes(int destinationOffset, int length, byte[] destination, int obfuscationGuard) {
        int byteIndex = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.obfuscationControl;
        try {
          if (obfuscationGuard < 49) {
            field_E = (String) null;
          }
          for (byteIndex = 0; byteIndex < length; byteIndex++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[destinationOffset + byteIndex] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(-93));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("kj.EB(").append(destinationOffset).append(',').append(length).append(',');
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static int j(int param0) {
        gb.field_c.a(false);
        if (!ne.field_N.d((byte) 125)) {
          return qh.d((byte) -107);
        }
        if (param0 <= 9) {
          CipherPacketBuffer.j(-98);
          return 0;
        }
        return 0;
    }

    final void endBitReading(byte obfuscationGuard) {
        if (obfuscationGuard != -3) {
          CipherPacketBuffer.j(53);
          this.position = (7 + this.readBitPosition) / 8;
          return;
        }
        this.position = (7 + this.readBitPosition) / 8;
    }

    final void initializeOpcodeCipher(int obfuscationGuard, int[] seed) {
        try {
          if (obfuscationGuard != -1833430685) {
            field_B = true;
          }
          this.opcodeCipher = new IsaacRandom(seed);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "kj.WA(" + obfuscationGuard + ',' + (seed != null ? "{...}" : "null") + ')');
        }
    }

    final void beginBitReading(boolean obfuscationGuard) {
        this.readBitPosition = this.position * 8;
        if (obfuscationGuard) {
          CipherPacketBuffer.j(-27);
        }
    }

    final int readBits(int obfuscationGuard, int bitCount) {
        int consumedByteIndex = 0;
        int var7 = SteelSentinels.obfuscationControl;
        int byteIndex = this.readBitPosition >> 3;
        int bitsAvailable = -(this.readBitPosition & 7) + 8;
        this.readBitPosition = this.readBitPosition + bitCount;
        int value = 0;
        while (bitCount > bitsAvailable) {
          consumedByteIndex = byteIndex;
          byteIndex++;
          value = value + ((this.payload[consumedByteIndex] & DualNode.bitMasks[bitsAvailable]) << bitCount - bitsAvailable);
          bitCount = bitCount - bitsAvailable;
          bitsAvailable = 8;
        }
        int guardArithmetic = 64 % ((obfuscationGuard + 27) / 36);
        if (bitCount != bitsAvailable) {
          value = value + (this.payload[byteIndex] >> bitsAvailable - bitCount & DualNode.bitMasks[bitCount]);
        } else {
          value = value + (this.payload[byteIndex] & DualNode.bitMasks[bitsAvailable]);
        }
        return value;
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final int readCipheredOpcode(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return -93;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(-102);
    }

    static {
        field_w = 0;
        field_x = "Game Over";
        field_D = new int[]{107, 30, 33, 32, 26, -1, -1, -1, -1, -1};
        field_G = "Highscores";
        field_C = "This password is part of your Player Name, and would be easy to guess";
        field_y = "Sound: ";
        field_E = "Connection timed out. Please try using a different server.";
    }
}
