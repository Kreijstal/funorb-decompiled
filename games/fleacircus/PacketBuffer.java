/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    static int field_j;
    byte[] payload;

    final void writeByte(int param0, int param1) {
        if (param0 != -11) {
          this.backpatchByteLength((byte) -92, 81);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = -1 + (this.position - var2);
        if (var3 != param0) {
          return pg.decodeCp1252String(var3, var2, this.payload, 0);
        }
        return "";
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          var5_int = param1;
          if (param2 >= -56) {
            return;
          }
          while (var5_int < param3 + param1) {
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
          stackIn_8_1 = new StringBuilder().append("ni.U(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean verifyCrc32(int param0) {
        if (param0 > -110) {
          this.position = 56;
        }
        this.position = this.position - 4;
        int var2 = uj.computeCrc32(false, 0, this.position, this.payload);
        int var3 = this.readInt((byte) 122);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final static dj a(int param0, int param1, ResourceArchive param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        dj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ha.a(param3, -32180, param4, param0)) {
            return null;
          }
          if (param1 != -2974) {
            field_j = 12;
          }
          stackIn_6_0 = bk.a(-26395, param2.getFile(param4, (byte) 121, param0));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ni.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    final void backpatchIntLength(int param0, boolean param1) {
        this.payload[-4 + this.position - param0] = (byte)(param0 >> 24);
        this.payload[-3 - param0 + this.position] = (byte)(param0 >> 16);
        this.payload[-param0 + (this.position - 2)] = (byte)(param0 >> 8);
        this.payload[-1 + (this.position - param0)] = (byte)param0;
        if (param1) {
          this.payload = (byte[]) null;
        }
    }

    final void writeShort(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int var3 = -47 / ((18 - param0) / 57);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
    }

    final static String a(int param0, char param1, byte param2) {
        int var4 = 0;
        int var5 = fleas.field_A ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param2 <= 24) {
          field_j = -49;
        }
        for (var4 = 0; param0 > var4; var4++) {
          var6[var4] = param1;
        }
        return new String(var6);
    }

    final long readLong(int param0) {
        long var2 = (long)this.readInt((byte) 123) & 4294967295L;
        long var4 = (long)this.readInt((byte) -113) & 4294967295L;
        if (param0 >= -58) {
          this.readUnsignedByte(false);
        }
        return (var2 << 32) + var4;
    }

    final static String d(boolean param0) {
        String var1 = "";
        if (null != lg.field_b) {
          var1 = lg.field_b.j(-1);
        }
        if (!param0) {
          field_j = -77;
        }
        if (var1.length() == 0) {
          var1 = ProxyAuthenticationRequiredException.c(10158);
        }
        if (var1.length() == 0) {
          var1 = gg.field_a;
        }
        return var1;
    }

    final int readUnsignedShort(byte param0) {
        this.position = this.position + 2;
        int var2 = 85 / ((5 - param0) / 53);
        return (this.payload[this.position - 1] & 255) + (this.payload[this.position - 2] << 8 & 65280);
    }

    final void applyRsa(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var5, 0, -57, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          int var9 = -100 / ((param2 - 32) / 33);
          this.position = 0;
          this.writeShort((byte) 103, var8.length);
          this.writeBytes(var8, var8.length, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ni.LA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final String readPrefixedString(int param0) {
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
        if (param0 > -51) {
          field_j = 127;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return pg.decodeCp1252String(var4, var3, this.payload, 0);
        }
        return "";
    }

    final int readUnsignedShortOrInt(byte param0) {
        if (param0 <= 53) {
          return 78;
        }
        if (this.payload[this.position] < 0) {
          return 2147483647 & this.readInt((byte) -62);
        }
        return this.readUnsignedShort((byte) -53);
    }

    final void backpatchByteLength(byte param0, int param1) {
        if (param0 > -27) {
          this.readUnsignedSmart(-55);
        }
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
    }

    private final void writeLong56(boolean param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        if (!param0) {
          this.position = 96;
        }
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

    final void writeVarInt(int param0, boolean param1) {
        if (0 != (-128 & param0)) {
          if ((param0 & -16384) != 0) {
            if ((param0 & -2097152) != 0) {
              if (0 != (-268435456 & param0)) {
                this.writeByte(-11, 128 | param0 >>> 28);
              }
              this.writeByte(-11, param0 >>> 21 | 128);
            }
            this.writeByte(-11, 128 | param0 >>> 14);
          }
          this.writeByte(-11, param0 >>> 7 | 128);
        }
        if (!param1) {
          return;
        }
        this.writeByte(-11, param0 & 127);
    }

    final void writeString(int param0, String param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.position = this.position + DiskCacheWorker.encodeCp1252Subsequence(0, this.payload, param1.length(), var5, -109, this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          int var4 = -75 / ((57 - param0) / 54);
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ni.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void backpatchShortLength(byte param0, int param1) {
        if (param0 < 117) {
          this.readLong(99);
        }
        this.payload[-2 + this.position - param1] = (byte)(param1 >> 8);
        this.payload[-param1 + (this.position - 1)] = (byte)param1;
    }

    final void writeInt(int param0, byte param1) {
        if (param1 > -14) {
          this.writeByte(99, -17);
        }
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
    }

    final int readUnsignedMedium(boolean param0) {
        this.position = this.position + 3;
        if (!param0) {
          return -121;
        }
        return (16711680 & this.payload[this.position - 3] << 16) - (-(65280 & this.payload[this.position - 2] << 8) - (255 & this.payload[-1 + this.position]));
    }

    final int readUnsignedByte(boolean param0) {
        if (param0) {
          return 3;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void writeBase38String(String param0, byte param1) {
        int var8 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        try {
          if (param1 != 94) {
            this.position = 64;
          }
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + var9 - 65);
              } else if (var9 >= 97 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(-97 + (var9 + 2));
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(28 + (var9 - 48));
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
          this.writeLong56(true, var3_long);
          this.writeLong56(true, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ni.M(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readSignedSmart(int param0) {
        int var2 = param0 & this.payload[this.position];
        if (var2 >= 128) {
          return -49152 + this.readUnsignedShort((byte) 82);
        }
        return this.readUnsignedByte(false) - 64;
    }

    final void writeLong40(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != -39) {
          this.readUnsignedShort((byte) 35);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param0;
    }

    final void writeBytes(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (param3 != 0) {
            return;
          }
          for (var5_int = param2; param2 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ni.FA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writePrefixedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          int var4 = -40 % ((-3 - param1) / 39);
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + DiskCacheWorker.encodeCp1252Subsequence(0, this.payload, param0.length(), var5, -111, this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ni.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readVarInt(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (!param0) {
          this.backpatchIntLength(108, true);
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (127 & var2 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int readUnsignedSmart(int param0) {
        if (param0 != -13583) {
          field_j = 28;
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -53) - 32768;
        }
        return this.readUnsignedByte(false);
    }

    final void encryptXtea(int param0, int[] param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = param0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt((byte) 123);
            var6 = this.readInt((byte) 124);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$2 = var9;
              var9--;
              if (0 < incrementValue$2) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param1[var7 & 3] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[var7 >>> 11 & 759169027] ^ (var5 << 4 ^ var5 >>> 5) + var5);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, (byte) -54);
            this.writeInt(var6, (byte) -22);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ni.SA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void padZerosTo(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = fleas.field_A ? 1 : 0;
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 != 0) {
          this.payload = (byte[]) null;
        }
    }

    final void writeMedium(boolean param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        if (param0) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final String readNullableString(byte param0) {
        if (param0 != -115) {
          this.position = 77;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(param0 ^ -115);
    }

    final void writeSignedSmart(int param0, int param1) {
        if (64 > param1 &&
          -64 <= param1) {
          this.writeByte(param0 + 24202, 64 + param1);
          return;
        }
        if (param0 != -24213) {
          this.writeLong56(true, -123L);
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.writeShort((byte) 107, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void decryptXteaRange(int[] param0, int param1, int param2, int param3) {
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
        var13 = fleas.field_A ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param1;
          var6 = (-param1 + param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (param2 != -1) {
                this.readString(-4);
              }
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) -35);
            var9 = this.readInt((byte) 22);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param0[var10 >>> 11 & -1547698173] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, (byte) -118);
            this.writeInt(var9, (byte) -108);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ni.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pf.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte readByte(int param0) {
        if (param0 > -17) {
          return (byte) 18;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final int appendCrc32(int param0, int param1) {
        int var3 = uj.computeCrc32(false, param0, this.position, this.payload);
        if (param1 != -30532) {
          this.position = -52;
        }
        this.writeInt(var3, (byte) -73);
        return var3;
    }

    final int readInt(byte param0) {
        this.position = this.position + 4;
        int var2 = 41 / ((86 - param0) / 36);
        return ((this.payload[this.position - 2] & 255) << 8) + (((this.payload[this.position - 3] & 255) << 16) + (-16777216 & this.payload[-4 + this.position] << 24) + (this.payload[-1 + this.position] & 255));
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
        int var4 = 94 / ((param0 - 37) / 35);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 24);
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

    PacketBuffer(int param0) {
        this.payload = gf.a(-101, param0);
        this.position = 0;
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.wrapClientException((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = 0;
    }
}
