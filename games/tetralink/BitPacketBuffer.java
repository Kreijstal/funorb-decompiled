/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    static ClientProtocolStage field_z;
    private int bitPosition;
    private IsaacCipher cipher;
    static String field_x;
    static String field_v;

    final void beginBitAccess(boolean param0) {
        this.bitPosition = 8 * this.position;
        if (!param0) {
          this.beginBitAccess(false);
        }
    }

    final int readBits(int param0, byte param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var5 = 0;
        int var6 = TetraLink.field_J;
        int var3 = this.bitPosition >> 3;
        int var4 = 8 - (this.bitPosition & 7);
        int var5Lifetime1;
        if (param1 != -112) {
          this.bitPosition = -52;
        } else {
          this.bitPosition = this.bitPosition + param0;
          var5 = 0;
          while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.payload[incrementValue$0] & RasterEffectHelpers.field_a[var4]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (var4 == param0) {
            var5 = var5 + (this.payload[var3] & RasterEffectHelpers.field_a[var4]);
          } else {
            var5 = var5 + (this.payload[var3] >> -param0 + var4 & RasterEffectHelpers.field_a[param0]);
          }
          return var5;
        }
        this.bitPosition = this.bitPosition + param0;
        var5Lifetime1 = 0;
        while (param0 > var4) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((this.payload[incrementValue$1] & RasterEffectHelpers.field_a[var4]) << param0 - var4);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 == param0) {
          var5Lifetime1 = var5Lifetime1 + (this.payload[var3] & RasterEffectHelpers.field_a[var4]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.payload[var3] >> -param0 + var4 & RasterEffectHelpers.field_a[param0]);
        }
        return var5Lifetime1;
    }

    final void readCipheredBytes(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          if (param0 < 28) {
            return;
          }
          for (var5_int = 0; var5_int < param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[param2 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.cipher.nextInt(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readCipheredByte(boolean param0) {
        int fieldTemp$0 = 0;
        if (param0) {
          this.writeCipheredByte(-44, (byte) -67);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.cipher.nextInt(0) & 255;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.cipher.nextInt(0) & 255;
    }

    final void endBitAccess(byte param0) {
        this.position = (this.bitPosition + 7) / 8;
        if (param0 <= 57) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          BitPacketBuffer.readBooleanBit(89, (BitPacketBuffer) null);
        }
    }

    final static boolean readBooleanBit(int param0, BitPacketBuffer param1) {
        RuntimeException var2 = null;
        BitPacketBuffer var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 53) {
            var3 = (BitPacketBuffer) null;
            BitPacketBuffer.readBooleanBit(116, (BitPacketBuffer) null);
          }
          stackIn_5_0 = (1 == param1.readBits(1, (byte) -112));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    BitPacketBuffer(byte[] param0) {
        super(param0);
    }

    BitPacketBuffer(int param0) {
        super(param0);
    }

    final void setCipherSeed(int[] param0, byte param1) {
        try {
          this.cipher = new IsaacCipher(param0);
          if (param1 != 33) {
            this.beginBitAccess(true);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "bc.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void writeCipheredByte(int param0, byte param1) {
        int fieldTemp$0 = 0;
        if (param1 != -92) {
          field_v = (String) null;
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.cipher.nextInt(IsaacCipher.bitXor((int) param1, -92)) + param0);
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(this.cipher.nextInt(IsaacCipher.bitXor((int) param1, -92)) + param0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 29313) {
          BitPacketBuffer.releaseStatics(84);
          field_z = null;
          field_v = null;
          field_x = null;
          return;
        }
        field_z = null;
        field_v = null;
        field_x = null;
    }

    static {
        field_z = new ClientProtocolStage();
        field_x = "Quick Chat lobby";
        field_v = "<%0> wants to draw.";
    }
}
