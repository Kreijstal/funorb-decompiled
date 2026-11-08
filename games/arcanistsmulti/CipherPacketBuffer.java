/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static boolean field_n;
    static String field_q;
    private int bitPosition;
    static SceneWidget field_p;
    static String field_r;
    private IsaacCipher opcodeCipher;
    static String field_s;

    final static ServerMessage createMessage(int param0, int param1, String param2) {
        ServerMessage var3 = null;
        RuntimeException var3_ref = null;
        ServerMessage stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ServerMessage(false);
          var3.field_e = param2;
          var3.field_a = param1;
          if (param0 != 0) {
            CipherPacketBuffer.releaseStatics(55);
          }
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ab.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void readEncryptedBytes(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != 108) {
            this.endBitAccess(-49);
          }
          for (var5_int = 0; param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[param2 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.opcodeCipher.nextValue(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ab.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_p = null;
        field_s = null;
        if (param0 != 21657) {
          field_s = (String) null;
          field_q = null;
          return;
        }
        field_q = null;
    }

    final void installCipher(int obfuscationGuard, int[] seed) {
        try {
          int var3_int = -46 / ((obfuscationGuard + 16) / 57);
          this.opcodeCipher = new IsaacCipher(seed);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "ab.C(" + obfuscationGuard + ',' + (seed != null ? "{...}" : "null") + ')');
        }
    }

    final void endBitAccess(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return;
        }
        this.position = (this.bitPosition + 7) / 8;
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final void writeOpcode(byte obfuscationGuard, int opcode) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(opcode + this.opcodeCipher.nextValue(false));
        if (obfuscationGuard > -11) {
          this.bitPosition = -103;
        }
    }

    final int readOpcode(byte obfuscationGuard) {
        int var2 = 124 / ((obfuscationGuard + 69) / 45);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0] - this.opcodeCipher.nextValue(false);
    }

    final int readBits(int obfuscationGuard, int bitCount) {
        int incrementValue$0 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = this.bitPosition >> 3;
        int var4 = -(7 & this.bitPosition) + 8;
        this.bitPosition = this.bitPosition + bitCount;
        int var5 = 0;
        while (var4 < bitCount) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.payload[incrementValue$0] & TextTableInitializer.field_d[var4]) << bitCount - var4);
          bitCount = bitCount - var4;
          var4 = 8;
        }
        if (var4 == bitCount) {
          var5 = var5 + (TextTableInitializer.field_d[var4] & this.payload[var3]);
        } else {
          var5 = var5 + (this.payload[var3] >> -bitCount + var4 & TextTableInitializer.field_d[bitCount]);
        }
        if (obfuscationGuard == 28089) {
          return var5;
        }
        String var7 = (String) null;
        CipherPacketBuffer.createMessage(6, -10, (String) null);
        return var5;
    }

    final void beginBitAccess(int obfuscationGuard) {
        this.bitPosition = 8 * this.position;
        if (obfuscationGuard < 26) {
          this.readBits(5, 58);
        }
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    static {
        field_q = "Previous";
        field_r = "Tips";
        field_s = "Firstly, you must learn how to look around the battlefield. Practise using the 'Arrow keys' to scroll around.";
    }
}
