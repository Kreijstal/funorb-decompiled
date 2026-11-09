/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static char[] field_m;
    static int field_l;
    static boolean[] field_o;
    byte[] payload;
    int position;
    static qn field_k;

    final void writeBase38Name(String name, int guard) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = name.length();
          var8 = 19;
          if (guard < 19) {
            this.readLargeSmart(118);
          }
          while (var8 >= 0) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = name.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else if (97 <= var9 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(var9 - 20);
              } else {
                var3_long = var3_long + 1L;
              }
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            } else {
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            }
            var8--;
          }
          this.writeLong56(var3_long, 116);
          this.writeLong56(var5, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("fs.K(");
          if (name == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(guard).append(')').toString());
        }
    }

    final void writeBytes(byte[] source, byte guard, int length, int offset) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -123) {
            this.position = 98;
          }
          for (var5_int = offset; length + offset > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = source[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fs.GA(");
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    final static float quinticSmoothStep(byte guard, float value) {
        if (guard != 124) {
          field_l = 20;
        }
        return value * (value * value) * (value * (-15.0f + 6.0f * value) + 10.0f);
    }

    final static void a(PlatformTaskDispatcher param0, int param1, int param2, String param3, byte param4, int param5, int param6, int param7, int param8) {
        RasterStateFrame.field_q = param2;
        if (param4 != -56) {
          return;
        }
        try {
          Js5Client.field_a = param3;
          ReflectionCheck.field_l = param7;
          SingleChildWidget.field_x = param1;
          CompactMeshGeometry.field_u = param0;
          ValidatedTextInputWidget.field_P = param5;
          HuffmanDecoder.field_e = param8;
          bt.field_d = param6;
          jk.field_b = (Js5Client) ((Object) new SocketJs5Client());
          FadingWidget.field_D = new CacheIoWorker(param0);
          LegacyOpenGlSpecularEffect.field_i = new ArchiveCatalog(jk.field_b, FadingWidget.field_D);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void writeCp1252String(String value, byte guard) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = value.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) value);
          this.position = this.position + MusicPatchEnvelope.a(0, this.payload, (byte) -110, var5, value.length(), this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          int var4 = 123 / ((guard + 7) / 60);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.KA(" + (value != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final int readUnsignedByte(int guard) {
        if (guard != -31302) {
          this.readCp1252String(-78);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final String readCircumfixedString(int guard) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
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
        } while (0 != this.payload[fieldTemp$1]);
        var5 = 83 / ((guard - 0) / 48);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return SoftLruCache.decodeCp1252(this.payload, var3, var4, 26564);
        }
        return "";
    }

    final int readInt(boolean guard) {
        this.position = this.position + 4;
        if (!guard) {
          this.payload = (byte[]) null;
        }
        return (this.payload[this.position - 1] & 255) + (((this.payload[this.position - 3] & 255) << 16) + ((this.payload[-4 + this.position] & 255) << 24)) + (65280 & this.payload[-2 + this.position] << 8);
    }

    final int appendCrc32(int start, boolean guard) {
        if (guard) {
          this.payload = (byte[]) null;
        }
        int var3 = ReflectionCheck.crc32(this.payload, start, this.position, 1001);
        this.writeInt(48, var3);
        return var3;
    }

    final void writeLong40(long value, int guard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(value >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)value;
        if (guard != 1105594440) {
          field_k = (qn) null;
        }
    }

    final void patchByteLength(int length, int guard) {
        this.payload[this.position - (length + 1)] = (byte)length;
        if (guard != -13745) {
          field_m = (char[]) null;
        }
    }

    final void decryptXteaRange(int end, byte guard, int start, int[] key) {
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
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = start;
          var6 = (-start + end) / 8;
          if (guard != 127) {
            return;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(true);
            var9 = this.readInt(true);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 + key[-178257917 & var10 >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + key[3 & var10]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(48, var8);
            this.writeInt(48, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("fs.N(").append(end).append(',').append(guard).append(',').append(start).append(',');
          if (key == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void writeVarInt(int value, int guard) {
        if ((-128 & value) != 0) {
          if ((value & -16384) != 0) {
            if ((value & -2097152) != 0) {
              if ((value & -268435456) != 0) {
                this.writeByte((byte) 115, value >>> 28 | 128);
              }
              this.writeByte((byte) 90, (268682394 | value) >>> 21);
            }
            this.writeByte((byte) 64, (2099807 | value) >>> 14);
          }
          this.writeByte((byte) 120, (value | 16498) >>> 7);
        }
        this.writeByte((byte) 17, 127 & value);
        if (guard >= -4) {
          field_l = -52;
        }
    }

    final void writeMedium(int value, int guard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)value;
        int var3 = -16 / ((guard - 43) / 34);
    }

    final boolean verifyTrailingCrc32(byte guard) {
        this.position = this.position - 4;
        int var2 = ReflectionCheck.crc32(this.payload, 0, this.position, guard + 1010);
        if (guard != -9) {
          String var4 = (String) null;
          PacketBuffer.a((PlatformTaskDispatcher) null, -93, 108, (String) null, (byte) 18, 23, 21, 60, 76);
        }
        int var3 = this.readInt(true);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final byte[] copyWrittenBytes(byte guard) {
        int var3 = 0;
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard != 120) {
          return (byte[]) null;
        }
        byte[] var5 = new byte[this.position];
        byte[] var2 = var5;
        for (var3 = 0; var3 < this.position; var3++) {
          var5[var3] = this.payload[var3];
        }
        return var2;
    }

    final void encryptRsa(byte guard, java.math.BigInteger modulus, java.math.BigInteger exponent) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var5, var4_int, 0, (byte) -59);
          if (guard <= 115) {
            field_l = 79;
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(exponent, modulus);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(-123, var8.length);
          this.writeBytes(var8, (byte) -123, var8.length, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.AA(" + guard + ',' + (modulus != null ? "{...}" : "null") + ',' + (exponent != null ? "{...}" : "null") + ')');
        }
    }

    private final void writeLong56(long value, int guard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 32);
        if (guard <= 104) {
          this.writeInt(25, -112);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(value >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(value >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(value >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)value;
    }

    final int readUnsignedMedium(byte guard) {
        if (guard <= 120) {
          return -109;
        }
        this.position = this.position + 3;
        return ((255 & this.payload[-2 + this.position]) << 8) + ((16711680 & this.payload[this.position - 3] << 16) + (255 & this.payload[-1 + this.position]));
    }

    final long readLong(byte guard) {
        if (guard < 100) {
          return 61L;
        }
        long var2 = 4294967295L & (long)this.readInt(true);
        long var4 = 4294967295L & (long)this.readInt(true);
        return var4 + (var2 << 32);
    }

    final void patchIntLength(boolean guard, int length) {
        this.payload[-4 + this.position - length] = (byte)(length >> 24);
        if (!guard) {
          this.readByte(true);
        }
        this.payload[-3 + (-length + this.position)] = (byte)(length >> 16);
        this.payload[-length + this.position - 2] = (byte)(length >> 8);
        this.payload[-1 + (this.position - length)] = (byte)length;
    }

    final void writeCircumfixedString(String value, byte guard) {
        int var4 = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          int var3_int = -25 % ((guard + 46) / 53);
          var4 = value.indexOf('\0');
          if (0 <= var4) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var5 = (CharSequence) ((Object) value);
          this.position = this.position + MusicPatchEnvelope.a(0, this.payload, (byte) -124, var5, value.length(), this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.RA(" + (value != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void writeLong(boolean guard, long value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 56);
        if (guard) {
          this.writeLong(true, 72L);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(value >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(value >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(value >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(value >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)value;
    }

    final int readUnsignedShort(int guard) {
        this.position = this.position + 2;
        if (guard != 255) {
          this.writeLong56(124L, -47);
        }
        return (this.payload[this.position - 2] << 8 & 65280) + (255 & this.payload[this.position - 1]);
    }

    final void writeShort(int guard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
        int var3 = -45 / ((guard - 57) / 59);
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        field_m = null;
        if (param0 > -10) {
          field_l = 23;
        }
        field_k = null;
    }

    final void padTo(byte guard, int endPosition) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        while (this.position < endPosition) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (guard != -3) {
          field_o = (boolean[]) null;
        }
    }

    final String readCp1252String(int terminatorAdjustment) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = this.position - var2 + terminatorAdjustment;
        if (var3 != 0) {
          return SoftLruCache.decodeCp1252(this.payload, var2, var3, 26564);
        }
        return "";
    }

    final void patchShortLength(int guard, int length) {
        if (guard != 0) {
          field_m = (char[]) null;
        }
        this.payload[-2 + (this.position - length)] = (byte)(length >> 8);
        this.payload[-1 + this.position - length] = (byte)length;
    }

    final byte readByte(boolean guard) {
        if (!guard) {
          return (byte) -80;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    PacketBuffer(int capacity) {
        this.position = 0;
        this.payload = jo.a(-44, capacity);
    }

    final void writeSignedSmart(int value, byte guard) {
        if (value < 64 &&
          value >= -64) {
          this.writeByte((byte) 108, value + 64);
          return;
        }
        if (value < 16384 &&
          -16384 <= value) {
          this.writeShort(120, 49152 + value);
          return;
        }
        if (guard >= 0) {
          this.writeLong40(58L, -106);
        }
        throw new IllegalArgumentException();
    }

    final int readVarInt(byte guard) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (guard < 75) {
          this.position = -23;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int readLargeSmart(int guard) {
        if (guard != 0) {
          return 40;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(255);
        }
        return this.readInt(true) & 2147483647;
    }

    final void writeByte(byte guard, int value) {
        if (guard < 14) {
          this.readByte(false);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)value;
    }

    final void writeInt(int guard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(value >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)value;
        if (guard != 48) {
          field_o = (boolean[]) null;
        }
    }

    PacketBuffer(byte[] bytes) {
        try {
          this.payload = bytes;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fs.<init>(" + (bytes != null ? "{...}" : "null") + ')');
        }
    }

    final String readNullableString(byte guard) {
        int var2 = -125 % ((guard + 56) / 44);
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readCp1252String(-1);
    }

    final int readSignedSmart(int guard) {
        if (guard != -2858) {
          field_m = (char[]) null;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 < 128) {
          return this.readUnsignedByte(guard ^ 29036) - 64;
        }
        return -49152 + this.readUnsignedShort(guard + 3113);
    }

    final void readBytes(byte[] destination, int length, int offset, byte guard) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard > -5) {
            return;
          }
          for (var5_int = offset; var5_int < offset + length; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("fs.JA(");
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(length).append(',').append(offset).append(',').append(guard).append(')').toString());
        }
    }

    final void encryptXtea(int[] key, int guard) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          if (guard < 82) {
            return;
          }
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt(true);
            var6 = this.readInt(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + key[3 & var7] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                var7 = var7 + var8;
                var6 = var6 + (key[-513802237 & var7 >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(48, var5);
            this.writeInt(48, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("fs.CA(");
          if (key == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    final int readUnsignedSmart(boolean guard) {
        if (guard) {
          return -85;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return this.readUnsignedByte(-31302);
        }
        return -32768 + this.readUnsignedShort(255);
    }

    static {
        field_o = new boolean[8];
        field_m = new char[]{(char)91, (char)93, (char)35};
        field_l = 0;
    }
}
