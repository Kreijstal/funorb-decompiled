/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPackedColour implements noa {
    private int red;
    private int channelBits;
    private int blue;
    private int alpha;
    static apa field_b;
    private boolean includesAlpha;
    private int green;
    static String field_a;

    final int getColour(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 == -43946608) {
          var2 = this.blue | (this.red << 16 | this.green << 8);
          if (this.includesAlpha) {
            var2 = this.alpha << 24 | var2;
          }
          return var2;
        }
        BitPacketBuffer var3 = (BitPacketBuffer) null;
        this.encode(8, (BitPacketBuffer) null);
        var2Lifetime1 = this.blue | (this.red << 16 | this.green << 8);
        if (this.includesAlpha) {
          var2Lifetime1 = this.alpha << 24 | var2Lifetime1;
        }
        return var2Lifetime1;
    }

    private final void decode(int param0, int param1, BitPacketBuffer param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = 1 << 8 - this.channelBits;
          var5 = -1 + var4_int;
          this.red = var4_int * param2.readBits((byte) 44, this.channelBits);
          if (0 < this.red) {
            this.red = this.red + var5;
          }
          this.green = var4_int * param2.readBits((byte) 44, this.channelBits);
          if (this.green > 0) {
            this.green = this.green + var5;
          }
          this.blue = param2.readBits((byte) 44, this.channelBits) * var4_int;
          if (0 < this.blue) {
            this.blue = this.blue + var5;
          }
          if (this.includesAlpha) {
            this.alpha = param2.readBits((byte) 44, this.channelBits) * var4_int;
          }
          if (param0 != 8) {
            field_b = (apa) null;
          }
          if (0 >= this.alpha) {
            return;
          }
          this.alpha = this.alpha + var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("jaa.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final void setColour(boolean param0, int param1) {
        this.red = param1 >> 16 ^ 255;
        this.blue = 255 ^ param1;
        this.alpha = param1 >> 24 ^ 255;
        if (!param0) {
          this.green = (65398 ^ param1) >> 8;
          return;
        }
    }

    BitPackedColour(boolean param0, int param1) {
        this.channelBits = param1;
        this.includesAlpha = param0 ? true : false;
    }

    final void encode(int param0, BitPacketBuffer param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1 << -this.channelBits + 8;
          var4 = var3_int - 1;
          param1.writeBits((byte) -128, RandomBrickOperator.max(param0, -var4 + this.red, param0 ^ 2) / var3_int, this.channelBits);
          param1.writeBits((byte) 61, RandomBrickOperator.max(0, -var4 + this.green, 2) / var3_int, this.channelBits);
          param1.writeBits((byte) -128, RandomBrickOperator.max(0, -var4 + this.blue, 2) / var3_int, this.channelBits);
          if (!this.includesAlpha) {
            return;
          }
          param1.writeBits((byte) -127, RandomBrickOperator.max(0, this.alpha - var4, 2) / var3_int, this.channelBits);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jaa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String decodeText(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 24) {
            stackIn_4_0 = MaskBlendOperator.decodeCp1252(param1, 0, param1.length, 255);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jaa.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    BitPackedColour(boolean param0, int param1, int param2, BitPacketBuffer param3) {
        try {
          this.includesAlpha = param0 ? true : false;
          this.channelBits = param1;
          this.decode(8, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "jaa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Send private message";
    }
}
