/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static String field_i;
    static String field_l;
    byte[] payload;
    int position;
    static int field_k;

    final String readMarkedString(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        if (param0 >= -103) {
          this.readNullableString(-91);
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -var3 + (this.position - 1);
        if (var4 != 0) {
          return StellarBombEvent.a(this.payload, var4, var3, -119);
        }
        return "";
    }

    final void writeMarkedString(byte param0, String param1) {
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf('\0');
        if (0 <= var3_int) {
          throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte) 0;
        if (param0 != 95) {
          return;
        }
        try {
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + kd.a(param1.length(), 0, (byte) -97, this.position, this.payload, var4);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ob.WA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void patchLengthInt(int param0, int param1) {
        this.payload[-4 + (-param0 + this.position)] = (byte)(param0 >> 24);
        this.payload[param1 + this.position - param0] = (byte)(param0 >> 16);
        this.payload[-param0 + this.position - 2] = (byte)(param0 >> 8);
        this.payload[this.position + (-param0 - 1)] = (byte)param0;
    }

    final void writeByte(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        if (param1 >= -54) {
          this.patchLengthInt(-6, -58);
        }
    }

    final void padZerosTo(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 > -92) {
          this.position = 119;
        }
    }

    final int writeChecksum(int param0, int param1) {
        if (param1 > -22) {
          this.readLong(102);
        }
        int var3 = bs.a(this.position, this.payload, (byte) -76, param0);
        this.writeInt(11135, var3);
        return var3;
    }

    final int readSignedSmart(byte param0) {
        int var2 = 97 % ((-36 - param0) / 54);
        int var3 = 255 & this.payload[this.position];
        if (var3 < 128) {
          return this.readUnsignedByte(-92) - 64;
        }
        return -49152 + this.readUnsignedShort(-20976);
    }

    final int readVariableInt(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          return -106;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (0 > var2) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final static int g(byte param0) {
        if (param0 != -24) {
          field_i = (String) null;
        }
        return jm.field_t;
    }

    final byte readSignedByte(int param0) {
        if (param0 != -2852) {
          field_k = -67;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void writeSmart(int param0, int param1) {
        if (param1 >= 0 &&
          param1 < 128) {
          this.writeByte(param1, (byte) -91);
          return;
        }
        if (param1 >= 0 &&
          param1 < 32768) {
          this.writeShort(param1 + 32768, 255);
          return;
        }
        if (param0 != 0) {
          java.math.BigInteger var4 = (java.math.BigInteger) null;
          this.rsaEncrypt((java.math.BigInteger) null, (java.math.BigInteger) null, (byte) -21);
        }
        throw new IllegalArgumentException();
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 != 11135) {
          int[] var4 = (int[]) null;
          this.xteaEncryptAll((int[]) null, 22);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final void readBytes(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != 17469032) {
            return;
          }
          for (var5_int = param1; param1 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ob.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int readUnsignedShort(int param0) {
        if (param0 != -20976) {
          field_l = (String) null;
        }
        this.position = this.position + 2;
        return (this.payload[this.position - 2] << 8 & 65280) + (this.payload[-1 + this.position] & 255);
    }

    final int readLargeSmart(boolean param0) {
        if (!param0) {
          return -53;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(-20976);
        }
        return 2147483647 & this.readInt(16711680);
    }

    final int readUnsignedByte(int param0) {
        if (param0 > -52) {
          field_i = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final void writeShort(int param0, int param1) {
        if (param1 != 255) {
          this.writeByte(-34, (byte) 29);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final void writeString(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + kd.a(param0.length(), 0, (byte) -97, this.position, this.payload, var4);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)param1;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ob.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void writeLong48(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int var4 = -103 % ((param0 - 17) / 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
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
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 16);
        if (param0 != -16426) {
          return;
        }
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
    }

    final void writeBytes(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 != 22186) {
            field_l = (String) null;
          }
          for (var5_int = param0; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ob.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        if (param0 != -1) {
          this.writeByte(-120, (byte) 104);
        }
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = this.position - var2 - 1;
        if (var3 == 0) {
          return "";
        }
        return StellarBombEvent.a(this.payload, var3, var2, -116);
    }

    final int readMedium(int param0) {
        if (param0 != 255) {
          this.payload = (byte[]) null;
        }
        this.position = this.position + 3;
        return (this.payload[this.position - 1] & 255) + (this.payload[this.position - 2] << 8 & 65280) + (this.payload[-3 + this.position] << 16 & 16711680);
    }

    final void xteaDecryptRange(int param0, int[] param1, byte param2, int param3) {
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
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var5_int = this.position;
          if (param2 > -9) {
            this.position = 115;
          }
          this.position = param0;
          var6 = (-param0 + param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(16711680);
            var9 = this.readInt(16711680);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param1[var10 >>> 11 & -1910505469] + var10);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ param1[3 & var10] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(11135, var8);
            this.writeInt(11135, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ob.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writePackedName(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 != -120) {
            this.payload = (byte[]) null;
          }
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                90 >= var9) {
                var3_long = var3_long + (long)(-63 + var9);
              } else if (var9 >= 97 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(-97 + (var9 + 2));
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(-48 + (28 + var9));
              } else {
                var3_long = var3_long + 1L;
              }
              decompiledFrameRemainder0 = (var8 == 10);
            } else {
              decompiledFrameRemainder0 = (var8 == 10);
            }
            if (decompiledFrameRemainder0) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.writeLong48((byte) 91, var3_long);
          this.writeLong48((byte) -73, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("ob.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void writeLong40(int param0, long param1) {
        if (param0 != 1729379144) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param1;
    }

    final long readLong(int param0) {
        if (param0 < 19) {
          field_i = (String) null;
        }
        long var2 = (long)this.readInt(16711680) & 4294967295L;
        long var4 = (long)this.readInt(16711680) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final String readNullableString(int param0) {
        if (param0 != 1910283844) {
          return (String) null;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(-1);
    }

    public static void a(byte param0) {
        if (param0 != 78) {
          return;
        }
        field_l = null;
        field_i = null;
    }

    final void writeVariableInt(byte param0, int param1) {
        if (param0 != 108) {
          this.readUnsignedShort(-17);
        }
        if (0 != (param1 & -128)) {
          if ((param1 & -16384) != 0) {
            if ((-2097152 & param1) != 0) {
              if ((-268435456 & param1) != 0) {
                this.writeByte(param1 >>> 28 | 128, (byte) -72);
              }
              this.writeByte(param1 >>> 21 | 128, (byte) -78);
            }
            this.writeByte((2107852 | param1) >>> 14, (byte) -78);
          }
          this.writeByte(param1 >>> 7 | 128, (byte) -93);
        }
        this.writeByte(127 & param1, (byte) -103);
    }

    final void patchLengthShort(int param0, int param1) {
        this.payload[-2 + (this.position - param1)] = (byte)(param1 >> 8);
        if (param0 != -549342136) {
          int[] var4 = (int[]) null;
          this.xteaDecryptRange(-59, (int[]) null, (byte) 20, -30);
        }
        this.payload[this.position - param1 - 1] = (byte)param1;
    }

    final int readInt(int param0) {
        if (param0 != 16711680) {
          return -6;
        }
        this.position = this.position + 4;
        return ((255 & this.payload[this.position - 2]) << 8) + (this.payload[-3 + this.position] << 16 & 16711680) + ((this.payload[-4 + this.position] & 255) << 24) + (this.payload[this.position - 1] & 255);
    }

    final void xteaEncryptAll(int[] param0, int param1) {
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
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = this.position / 8;
          if (param1 < 105) {
            return;
          }
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt(16711680);
            var6 = this.readInt(16711680);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + ((var5 >>> 5 ^ var5 << 4) + var5 ^ param0[-1430257661 & var7 >>> 11] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(11135, var5);
            this.writeInt(11135, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ob.CA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, GameSession param1) {
        try {
          int var2_int = -35 % ((param0 + 60) / 50);
          kb.field_x = 1;
          hm.field_q = null;
          oq.field_a = param1;
          ei.field_e = -1;
          WeightedLruCache.field_g = null;
          e.field_f = -1;
          ByteArrayNode.field_k = -1;
          AttackTask.field_o = -1;
          md.a((byte) 73, 16777215, 8);
          md.a((byte) 112, 16777215, 11);
          uq.field_m = new rl(wg.field_e);
          aj.field_a = new IntrusiveDeque();
          StellarBombEvent.field_h = new IntrusiveDeque();
          is.field_b = false;
          tl.field_u = false;
          SliderWidget.field_L = false;
          ImageProducerRasterBuffer.field_i = 0;
          WhirlpoolHasher.field_g = false;
          ListContent.field_g = false;
          VictoryChecker.field_j = false;
          AchievementProgress.field_k = false;
          js.field_b = new sq[8];
          wl.field_a = new TutorialMapGenerator();
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ob.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void rsaEncrypt(java.math.BigInteger param0, java.math.BigInteger param1, byte param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var4_int, 0, 17469032, var5);
          if (param2 >= -48) {
            this.readUnsignedSmart(-64);
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, 255);
          this.writeBytes(0, var8.length, var8, 22186);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ob.TA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int readUnsignedSmart(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 != -1282738780) {
          this.writeLong40(104, -89L);
        }
        if (var2 < 128) {
          return this.readUnsignedByte(-57);
        }
        return -32768 + this.readUnsignedShort(-20976);
    }

    final boolean verifyChecksum(byte param0) {
        this.position = this.position - 4;
        int var2 = bs.a(this.position, this.payload, (byte) -83, 0);
        if (param0 <= 54) {
          this.writeLong48((byte) -45, 52L);
        }
        int var3 = this.readInt(16711680);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final void patchLengthByte(int param0, byte param1) {
        this.payload[-param0 + (this.position - 1)] = (byte)param0;
        if (param1 <= 117) {
          this.patchLengthInt(-85, 42);
        }
    }

    PacketBuffer(int param0) {
        this.payload = lr.a(param0, 101);
        this.position = 0;
    }

    final void writeMedium(boolean param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
        if (!param0) {
          this.position = -118;
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "<%0> wants to draw.";
        field_l = "Enter name of player to add to list";
    }
}
