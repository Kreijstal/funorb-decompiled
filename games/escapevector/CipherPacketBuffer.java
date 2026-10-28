/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static Sprite field_n;
    private int bitPosition;
    static String[] field_q;
    static String field_p;
    static long[] field_t;
    static String field_o;
    static boolean field_u;
    private IsaacRandom opcodeCipher;

    final void readCipheredBytes(byte[] destination, int guard, int length, int offset) {
        String stackIn_10_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (guard != 19583) {
            return;
          }
          for (int var5_int = 0; length > var5_int; var5_int++) {
            int fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[offset + var5_int] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(1736563940));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("c.QA(");
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    final static void m(int param0) {
        if (null != SocketJs5Transport.field_r) {
          SocketJs5Transport.field_r.advanceCounters((byte) 33);
        }
        int var1 = -128 / ((param0 - 16) / 38);
    }

    final void beginBitReading(int guard) {
        this.bitPosition = 8 * this.position;
        if (guard != -17928) {
          CipherPacketBuffer.releaseStatics(-97);
        }
    }

    final void endBitReading(int guard) {
        if (guard == -3879) {
          this.position = (this.bitPosition + 7) / 8;
          return;
        }
        this.readBits(-61, -116);
        this.position = (this.bitPosition + 7) / 8;
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (guard >= 105) {
          field_n = null;
          return;
        }
        CipherPacketBuffer.m(19);
        field_n = null;
    }

    final void writeCipheredOpcode(int opcode, boolean guard) {
        if (guard) {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.opcodeCipher.nextInt(1736563940) + opcode);
          return;
        }
    }

    final static void p(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          CipherPacketBuffer var1 = QuickChatDynamicCommand.outgoingPackets;
          while (SlidingSpriteTransition.isReflectionCheckReady((byte) -115)) {
            var1.writeCipheredOpcode(8, true);
            int fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            int var2 = fieldTemp$0;
            ResourceArchive.writeReflectionCheckResults(param0 ^ -25858, var1);
            QuickChatDynamicCommand.outgoingPackets.backpatchByteLength(82, var1.position - var2);
          }
          if (param0 == 11197) {
            return;
          }
          CipherPacketBuffer.p(-41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1_ref), "c.DB(" + param0 + ')');
        }
    }

    final void initializeCipher(int[] seed, byte guard) {
        if (guard < 80) {
          return;
        }
        try {
          this.opcodeCipher = new IsaacRandom(seed);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "c.RA(" + (seed != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final int readCipheredOpcode(int guard) {
        if (guard == 8) {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return 255 & this.payload[fieldTemp$0] - this.opcodeCipher.nextInt(1736563940);
        }
        field_u = false;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$1] - this.opcodeCipher.nextInt(1736563940);
    }

    final int readBits(int count, int byteBitWidth) {
        int var6 = EscapeVector.obfuscationControl;
        int var3 = this.bitPosition >> 3;
        int var4 = -(7 & this.bitPosition) + byteBitWidth;
        this.bitPosition = this.bitPosition + count;
        int var5 = 0;
        while (var4 < count) {
          int incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.payload[incrementValue$0] & LegacyWidgetStyle.field_ab[var4]) << -var4 + count);
          count = count - var4;
          var4 = 8;
        }
        if (var4 != count) {
          var5 = var5 + (this.payload[var3] >> var4 - count & LegacyWidgetStyle.field_ab[count]);
        } else {
          var5 = var5 + (LegacyWidgetStyle.field_ab[var4] & this.payload[var3]);
        }
        return var5;
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    static {
        field_q = new String[]{"virtual", "virtual", "virtual", "virtual"};
        field_t = new long[32];
        field_o = "Waiting for fonts";
        field_p = "Go Back";
    }
}
