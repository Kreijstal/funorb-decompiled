/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BitPacketBuffer extends PacketBuffer {
    static int field_m;
    static ResourceArchive field_u;
    static ResourceArchive field_p;
    static long field_k;
    private int field_q;
    static int field_r;
    static PcmSampleStream[] field_o;
    private IsaacRandom field_n;
    static int field_t;
    static RgbSprite[] field_l;
    static int field_s;

    final int readCipheredByte(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == -76) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0] - this.field_n.nextInt(0) & 255;
        }
        field_u = (ResourceArchive) null;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1] - this.field_n.nextInt(0) & 255;
    }

    final void endBitAccess(int param0) {
        this.position = (this.field_q + 7) / param0;
    }

    final static void updateOptionLists(byte param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 56) {
            return;
          }
          if (null != SecondaryNodeDeque.field_b) {
            SecondaryNodeDeque.field_b.field_C.a(param1, false);
          }
          if (null == hd.field_a) {
            return;
          }
          hd.field_a.field_F.a(param1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("th.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void writeCipheredByte(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 + this.field_n.nextInt(param1));
    }

    final void beginBitAccess(int param0) {
        if (param0 != 10) {
          return;
        }
        this.field_q = 8 * this.position;
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        int var3 = this.field_q >> 3;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param1 != 26527) {
          field_r = 53;
        } else {
          var4 = -(7 & this.field_q) + 8;
          var5 = 0;
          this.field_q = this.field_q + param0;
          while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((bd.field_j[var4] & this.payload[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
          }
          if (param0 == var4) {
            var5 = var5 + (this.payload[var3] & bd.field_j[var4]);
          } else {
            var5 = var5 + (this.payload[var3] >> var4 - param0 & bd.field_j[param0]);
          }
          return var5;
        }
        var4Lifetime1 = -(7 & this.field_q) + 8;
        var5Lifetime1 = 0;
        this.field_q = this.field_q + param0;
        while (param0 > var4Lifetime1) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((bd.field_j[var4Lifetime1] & this.payload[incrementValue$1]) << -var4Lifetime1 + param0);
          param0 = param0 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (param0 == var4Lifetime1) {
          var5Lifetime1 = var5Lifetime1 + (this.payload[var3] & bd.field_j[var4Lifetime1]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (this.payload[var3] >> var4Lifetime1 - param0 & bd.field_j[param0]);
        }
        return var5Lifetime1;
    }

    BitPacketBuffer(byte[] param0) {
        super(param0);
    }

    final static int parseIntInRadix(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            stackIn_4_0 = LoginPanel.a(param2, param0, 18, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = 116;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("th.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_l = null;
        field_u = null;
        field_o = null;
        field_p = null;
        int var1 = -42 % ((-6 - param0) / 50);
    }

    final void readCipheredBytes(int param0, int param1, int param2, byte[] param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = -69 % ((-4 - param2) / 32);
          for (var6 = 0; param0 > var6; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var6 + param1] = (byte)(this.payload[fieldTemp$0] - this.field_n.nextInt(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("th.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void setCipherSeed(int[] param0, int param1) {
        try {
          int var3_int = 18 / ((param1 + 36) / 50);
          this.field_n = new IsaacRandom(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "th.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    BitPacketBuffer(int param0) {
        super(param0);
    }

    static {
        field_o = new PcmSampleStream[10];
    }
}
