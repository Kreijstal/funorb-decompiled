/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IsaacPacketBuffer extends PacketBuffer {
    private int writeBitsRemaining;
    private int readBitPosition;
    private IsaacCipher cipher;

    final void writeBits(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        param1 = param1 & SetMissionDebrisVotingChancestep.field_q[param2];
        while (this.writeBitsRemaining < param2) {
          param2 = param2 - this.writeBitsRemaining;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(this.payload[fieldTemp$1] + (param1 >>> param2));
          this.payload[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        }
        if (this.writeBitsRemaining == param2) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.payload[fieldTemp$0] + param1);
          this.payload[this.position] = (byte) 0;
          this.writeBitsRemaining = 8;
        } else {
          this.writeBitsRemaining = this.writeBitsRemaining - param2;
          this.payload[this.position] = (byte)(this.payload[this.position] + (param1 << this.writeBitsRemaining));
        }
        if (param0 == -632) {
          return;
        }
        this.writeBitsRemaining = -63;
    }

    final void endBitRead(byte param0) {
        this.position = (this.readBitPosition + 7) / 8;
        if (param0 > -31) {
          this.cipher = (IsaacCipher) null;
        }
    }

    final int readIsaacByte(int param0) {
        int fieldTemp$0 = 0;
        if (param0 == 255) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return 255 & this.payload[fieldTemp$0] - this.cipher.nextInt((byte) -41);
        }
        this.endBitRead((byte) -108);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$1] - this.cipher.nextInt((byte) -41);
    }

    final static ArbProgram compileArbProgram(byte param0, OpenGlToolkit param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ArbProgram stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        ArbProgram stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 115) {
            stackIn_2_0 = (ArbProgram) null;
            return stackIn_2_0;
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          jaggl.OpenGL.glBindProgramARB(param2, var4_int);
          jaggl.OpenGL.glProgramStringARB(param2, 34933, param3);
          jaggl.OpenGL.glGetIntegerv(34379, lp.field_b, 0);
          if (lp.field_b[0] != -1) {
            jaggl.OpenGL.glBindProgramARB(param2, 0);
            stackIn_6_0 = null;
            return (ArbProgram) (stackIn_6_0);
          }
          jaggl.OpenGL.glBindProgramARB(param2, 0);
          stackIn_8_0 = new ArbProgram(param1, param2, var4_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("faa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int readBits(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = VoidHunters.field_G;
        int var3 = this.readBitPosition >> 3;
        int var4 = 8 - (7 & this.readBitPosition);
        int var5 = param0;
        this.readBitPosition = this.readBitPosition + param1;
        while (var4 < param1) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.payload[incrementValue$0] & SetMissionDebrisVotingChancestep.field_q[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 != var4) {
          var5 = var5 + (this.payload[var3] >> -param1 + var4 & SetMissionDebrisVotingChancestep.field_q[param1]);
        } else {
          var5 = var5 + (this.payload[var3] & SetMissionDebrisVotingChancestep.field_q[var4]);
        }
        return var5;
    }

    IsaacPacketBuffer(byte[] param0) {
        super(param0);
    }

    final void writeIsaacByte(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 == 24335) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(param1 + this.cipher.nextInt((byte) -41));
          return;
        }
        this.cipher = (IsaacCipher) null;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 + this.cipher.nextInt((byte) -41));
    }

    IsaacPacketBuffer(int param0) {
        super(param0);
    }

    final void endBitWrite(int param0) {
        if (this.writeBitsRemaining < 8) {
          this.position = this.position + 1;
          this.writeBitsRemaining = 8;
        }
        if (param0 == 32712) {
          return;
        }
        this.cipher = (IsaacCipher) null;
    }

    final void initializeCipher(int param0, int[] param1) {
        try {
          this.cipher = new IsaacCipher(param1);
          if (param0 != 18794) {
            this.endBitWrite(-43);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "faa.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void beginBitRead(int param0) {
        this.readBitPosition = 8 * this.position;
        if (param0 != -23497) {
          this.endBitWrite(-90);
        }
    }

    final void beginBitWrite(int param0) {
        this.payload[this.position] = (byte) 0;
        if (param0 > -66) {
          return;
        }
        this.writeBitsRemaining = 8;
    }

    final void readIsaacBytes(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (param2 != -50) {
            this.readIsaacByte(39);
          }
          for (var5_int = 0; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int + param1] = (byte)(this.payload[fieldTemp$0] - this.cipher.nextInt((byte) -41));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("faa.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
