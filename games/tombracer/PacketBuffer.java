/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    byte[] payload;
    static String field_f;

    final void encryptXtea(byte param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -48) {
            this.readLong(107);
          }
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt(-51);
            var6 = this.readInt(param0 ^ 120);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + param1[var7 >>> 11 & -866123773]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, (byte) 0);
            this.writeInt(var6, (byte) -98);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uia.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int readShort(boolean param0) {
        this.position = this.position + 2;
        int var2 = (this.payload[this.position - 1] & 255) + (65280 & this.payload[-2 + this.position] << 8);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        if (param0) {
          return 56;
        }
        return var2;
    }

    final void writeInt(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
        int var3 = 125 % ((43 - param1) / 33);
    }

    final void readBytes(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param1;
          if (param2 >= -79) {
            return;
          }
          while (param1 + param3 > var5_int) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uia.BA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte readByte(byte param0) {
        if (param0 < 27) {
          return (byte) -82;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final int readVarInt(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = -48 % ((-58 - param0) / 58);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var3 = this.payload[fieldTemp$0];
        var4 = 0;
        while (0 > var3) {
          var4 = (var4 | var3 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var3 = this.payload[fieldTemp$1];
        }
        return var3 | var4;
    }

    final void writeIntLE(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0 != -35) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(param1 >> 24);
    }

    final String readString(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        if (param0 != -76) {
          this.readByte((byte) -16);
        }
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = this.position - (var2 + 1);
        if (var3 != 0) {
          return MaskBlendOperator.decodeCp1252(this.payload, var2, var3, 255);
        }
        return "";
    }

    final void rsaEncryptContents(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var5, 0, -102, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(-1477662136, var8.length);
          if (param0 <= 87) {
            this.readShort(false);
          }
          this.writeBytes(0, var8, var8.length, 107);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uia.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void backpatchIntLength(int param0, int param1) {
        this.payload[this.position - param0 - 4] = (byte)(param0 >> 24);
        this.payload[-3 + (-param0 + this.position)] = (byte)(param0 >> 16);
        if (param1 != 22726) {
          int[] var4 = (int[]) null;
          this.encryptXtea((byte) 83, (int[]) null);
        }
        this.payload[-2 + (-param0 + this.position)] = (byte)(param0 >> 8);
        this.payload[this.position - param0 - 1] = (byte)param0;
    }

    final int readUnsignedMedium(int param0) {
        this.position = this.position + 3;
        if (param0 != -32768) {
          return 55;
        }
        return ((this.payload[-2 + this.position] & 255) << 8) + (this.payload[-3 + this.position] << 16 & 16711680) + (255 & this.payload[this.position - 1]);
    }

    final void writeLong(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (param0 != 1736565456) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
    }

    final void writeUnsignedSmart(int param0, byte param1) {
        if (0 <= param0 &&
          128 > param0) {
          this.writeByte(param0, 0);
          return;
        }
        int var3 = -126 % ((param1 + 18) / 58);
        if (param0 >= 0 &&
          32768 > param0) {
          this.writeShort(-1477662136, 32768 + param0);
          return;
        }
        throw new IllegalArgumentException();
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        if (!param0) {
          field_f = (String) null;
        }
    }

    final void backpatchShortLength(int param0, byte param1) {
        this.payload[-2 + (this.position - param0)] = (byte)(param0 >> 8);
        this.payload[-param0 + (this.position - 1)] = (byte)param0;
        int var3 = -48 % ((param1 - 56) / 42);
    }

    final void decryptXteaRange(int param0, int param1, int[] param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -84984444) {
            this.writeByte(54, 87);
          }
          var5_int = this.position;
          this.position = param3;
          var6 = (-param3 + param0) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(-88);
            var9 = this.readInt(-102);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param2[(7261 & var10) >>> 11] + var10 ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ param2[var10 & 3] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, (byte) -9);
            this.writeInt(var9, (byte) 95);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("uia.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeBase38Name(String param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 - 63);
              } else {
                if (var9 >= 97 &&
                  122 >= var9) {
                  var3_long = var3_long + (long)(-95 + var9);
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + (28 + var9));
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.writeLong56(var3_long, -106);
          if (param1 >= -122) {
            this.payload = (byte[]) null;
          }
          this.writeLong56(var5, -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("uia.JA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = fba.acquireByteArray(param0, 0);
    }

    final void padZerosTo(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 716148936) {
          return;
        }
        while (this.position < param1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final void writeSignedSmart(int param0, int param1) {
        if (param0 != -5338) {
          return;
        }
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(64 + param1, 0);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.writeShort(-1477662136, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readUnsignedSmart(byte param0) {
        if (param0 != -46) {
          return -59;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return -32768 + this.readUnsignedShort(param0 + 168);
        }
        return this.readUnsignedByte(255);
    }

    final void writeBytes(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param0;
          if (param3 < 52) {
            this.position = -97;
          }
          while (var5_int < param2 + param0) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param1[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("uia.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedShort(int param0) {
        if (param0 <= 120) {
          field_f = (String) null;
        }
        this.position = this.position + 2;
        return (this.payload[-2 + this.position] << 8 & 65280) + (this.payload[-1 + this.position] & 255);
    }

    final void backpatchByteLength(int param0, byte param1) {
        this.payload[-1 - param0 + this.position] = (byte)param0;
        int var3 = -105 % ((-62 - param1) / 33);
    }

    final void writeMedium(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int var3 = 1 % ((param0 + 36) / 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final String readVersionedString(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        if (param0 <= 113) {
          field_f = (String) null;
        }
        var4 = this.position - (var3 + 1);
        if (var4 != 0) {
          return MaskBlendOperator.decodeCp1252(this.payload, var3, var4, 255);
        }
        return "";
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeShortLE(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        int var3 = -23 / ((73 - param1) / 46);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
    }

    final long readLong(int param0) {
        if (param0 != 290646880) {
          return 127L;
        }
        long var2 = (long)this.readInt(-81) & 4294967295L;
        long var4 = 4294967295L & (long)this.readInt(111);
        return var4 + (var2 << 32);
    }

    final int readSignedSmart(byte param0) {
        if (param0 >= -127) {
          return 93;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return -49152 + this.readUnsignedShort(127);
        }
        return -64 + this.readUnsignedByte(255);
    }

    private final void writeLong56(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 > -37) {
          field_f = (String) null;
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param0;
    }

    final void writeLong40(boolean param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (!param0) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param1;
    }

    final void writeString(String param0, boolean param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + UsernameSuggestionsPanel.encodeCp1252(this.position, param0.length(), this.payload, 0, var4, (byte) -4);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
          if (param1) {
            this.payload = (byte[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uia.GB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readUnsignedShortOrInt(int param0) {
        if (param0 != -48) {
          return 3;
        }
        if (this.payload[this.position] < 0) {
          return this.readInt(-16) & 2147483647;
        }
        return this.readUnsignedShort(param0 ^ -82);
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        if (param1 != 0) {
          byte[] var4 = (byte[]) null;
          this.writeBytes(13, (byte[]) null, 70, -102);
        }
    }

    final int readInt(int param0) {
        this.position = this.position + 4;
        int var2 = -60 / ((param0 - 44) / 50);
        return ((255 & this.payload[-2 + this.position]) << 8) + ((-16777216 & this.payload[this.position - 4] << 24) + ((255 & this.payload[-3 + this.position]) << 16) + (255 & this.payload[this.position - 1]));
    }

    final int appendCrc32(int param0, int param1) {
        int var3 = PitSnake.computeCrc32(this.payload, this.position, 80, param0);
        this.writeInt(var3, (byte) -60);
        if (param1 != 64) {
          field_f = (String) null;
        }
        return var3;
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
        if (param0 != -1477662136) {
          this.readVersionedString(64);
        }
    }

    final boolean verifyCrc32(byte param0) {
        this.position = this.position - 4;
        int var2 = PitSnake.computeCrc32(this.payload, this.position, param0 ^ -27, 0);
        int var3 = this.readInt(-56);
        if (param0 != 114) {
          this.readNullableString(20);
        }
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final void writeVersionedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)param1;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + UsernameSuggestionsPanel.encodeCp1252(this.position, param0.length(), this.payload, 0, var4, (byte) -4);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uia.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readUnsignedByte(int param0) {
        if (param0 != 255) {
          field_f = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final String readNullableString(int param0) {
        if (param0 != -28690) {
          return (String) null;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString((byte) -76);
    }

    final void writeVarInt(int param0, int param1) {
        int var3 = -74 % ((78 - param1) / 41);
        if ((param0 & -128) != 0) {
          if (0 != (param0 & -16384)) {
            if ((-2097152 & param0) != 0) {
              if ((-268435456 & param0) != 0) {
                this.writeByte(param0 >>> 28 | 128, 0);
              }
              this.writeByte(param0 >>> 21 | 128, 0);
            }
            this.writeByte(param0 >>> 14 | 128, 0);
          }
          this.writeByte(128 | param0 >>> 7, 0);
        }
        this.writeByte(param0 & 127, 0);
    }

    static {
        field_f = "Open";
    }
}
