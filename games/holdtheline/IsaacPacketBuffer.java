/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacPacketBuffer extends PacketBuffer {
    static IsaacPacketBuffer field_p;
    private int readBitPosition;
    private int writeBitsRemaining;
    static String field_s;
    private IsaacRandom cipher;
    static int[] field_u;

    final void endBitWriting(byte param0) {
        if (8 > this.writeBitsRemaining) {
          this.position = this.position + 1;
          this.writeBitsRemaining = 8;
        }
        if (param0 != 0) {
          field_s = (String) null;
        }
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = HoldTheLine.field_D;
        int var3 = this.readBitPosition >> 3;
        int var4 = 8 - (this.readBitPosition & param1);
        int var5 = 0;
        this.readBitPosition = this.readBitPosition + param0;
        while (param0 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((vd.field_c[var4] & this.payload[incrementValue$0]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (param0 != var4) {
          var5 = var5 + (this.payload[var3] >> -param0 + var4 & vd.field_c[param0]);
        } else {
          var5 = var5 + (vd.field_c[var4] & this.payload[var3]);
        }
        return var5;
    }

    public static void clearSharedReferences(int param0) {
        field_p = null;
        field_s = null;
        int var1 = 121 / ((29 - param0) / 58);
        field_u = null;
    }

    final void readCipheredBytes(byte[] param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        try {
          for (var5_int = 0; var5_int < param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[param2 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.cipher.nextInt(256));
          }
          if (!param3) {
            field_p = (IsaacPacketBuffer) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("da.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeCipheredOpcode(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 + this.cipher.nextInt(Vector2i.xor((int) param0, 289)));
        if (param0 != 33) {
          this.readBitPosition = -105;
        }
    }

    final void writeBits(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var4;
        int var5;
        var5 = HoldTheLine.field_D;
        param2 = param2 & vd.field_c[param1];
        var4 = 39 % ((14 - param0) / 57);
        while (this.writeBitsRemaining < param1) {
          param1 = param1 - this.writeBitsRemaining;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(this.payload[fieldTemp$1] + (param2 >>> param1));
          this.payload[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        }
        if (param1 != this.writeBitsRemaining) {
          this.writeBitsRemaining = this.writeBitsRemaining - param1;
          this.payload[this.position] = (byte)(this.payload[this.position] + (param2 << this.writeBitsRemaining));
        } else {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.payload[fieldTemp$0] + param2);
          this.payload[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        }
    }

    final void endBitReading(int param0) {
        if (param0 > -6) {
          this.cipher = (IsaacRandom) null;
        }
        this.position = (this.readBitPosition + 7) / 8;
    }

    final void beginBitWriting(byte param0) {
        this.payload[this.position] = (byte)param0;
        this.writeBitsRemaining = 8;
    }

    final static void a(boolean param0, String param1, int param2) {
        ResourceArchive.field_g = param0;
        DelayedServerPacket.field_k = true;
        if (param2 != 22676) {
          return;
        }
        try {
          sb.field_c = new AccountProgressDialog(ka.field_b, DisplayNameForm.field_I, param1, ArchiveCatalog.field_o, ResourceArchive.field_g);
          ka.field_b.a(sb.field_c, false);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "da.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void seedCipher(int[] param0, boolean param1) {
        try {
          this.cipher = new IsaacRandom(param0);
          if (param1) {
            this.readCipheredOpcode((byte) 92);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "da.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void beginBitReading(boolean param0) {
        if (!param0) {
          field_u = (int[]) null;
        }
        this.readBitPosition = this.position * 8;
    }

    IsaacPacketBuffer(int param0) {
        super(param0);
    }

    final int readCipheredOpcode(byte param0) {
        int var2 = 82 % ((param0 - 21) / 52);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] - this.cipher.nextInt(256) & 255;
    }

    IsaacPacketBuffer(byte[] param0) {
        super(param0);
    }

    static {
        field_s = "Resume";
    }
}
