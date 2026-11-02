/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    private int bitPosition;
    private static long[] field_j;
    private IsaacRandom cipher;
    static String field_i;
    static lm field_n;
    static String field_k;

    BitPacketBuffer(int param0) {
        super(param0);
    }

    final void endBitAccess(byte param0) {
        this.position = (7 + this.bitPosition) / 8;
        if (param0 != -86) {
          this.endBitAccess((byte) 113);
        }
    }

    final void writeCipheredByte(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 + this.cipher.nextInt(28602));
        if (param1 <= 96) {
          this.startBitAccess(-110);
        }
    }

    BitPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void seedCipher(int[] param0, int param1) {
        if (param1 != 8829) {
          return;
        }
        try {
          this.cipher = new IsaacRandom(param0);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "pf.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readBits(int param0, byte param1) {
        int incrementValue$0 = 0;
        int var7 = BachelorFridge.field_y;
        int var4 = 5 / ((-10 - param1) / 54);
        int var3 = this.bitPosition >> 3;
        int var5 = -(7 & this.bitPosition) + 8;
        this.bitPosition = this.bitPosition + param0;
        int var6 = 0;
        while (var5 < param0) {
          incrementValue$0 = var3;
          var3++;
          var6 = var6 + ((this.payload[incrementValue$0] & wj.field_n[var5]) << param0 - var5);
          param0 = param0 - var5;
          var5 = 8;
        }
        if (var5 != param0) {
          var6 = var6 + (this.payload[var3] >> var5 - param0 & wj.field_n[param0]);
        } else {
          var6 = var6 + (wj.field_n[var5] & this.payload[var3]);
        }
        return var6;
    }

    final void startBitAccess(int param0) {
        this.bitPosition = this.position * 8;
        if (param0 != 1) {
          field_n = (lm) null;
        }
    }

    final int readCipheredByte(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 694) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.cipher.nextInt(28602) & 255;
        }
        this.endBitAccess((byte) -2);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.cipher.nextInt(28602) & 255;
    }

    public static void l(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != -6199) {
          return;
        }
        field_n = null;
        field_k = null;
    }

    final void readCipheredBytes(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        try {
          for (var5_int = 0; param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[param2 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.cipher.nextInt(28602));
          }
          if (param3 == -31908) {
            return;
          }
          this.bitPosition = -58;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pf.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_j = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_j[var2] = var0;
        }
        field_i = "Options";
        field_k = "Who can join";
    }
}
