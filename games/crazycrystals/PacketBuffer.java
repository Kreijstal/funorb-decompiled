/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    static boolean field_j;
    static byte[][] field_g;
    static String field_i;
    byte[] payload;

    public static void e(byte param0) {
        field_i = null;
        if (param0 > -54) {
          String var2 = (String) null;
          PacketBuffer.a((String) null, (nj) null, (PuzzleTile) null, (byte) -17, (String) null);
        }
        field_g = (byte[][]) null;
    }

    final int readUnsignedShortOrInt(byte param0) {
        if (param0 > -117) {
          field_j = false;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort((byte) -7);
        }
        return this.readInt((byte) -92) & 2147483647;
    }

    private final void writeLong56(long param0, byte param1) {
        if (param1 != -95) {
          field_g = (byte[][]) null;
        }
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
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param0;
    }

    final void writeLong(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 48);
        if (param1 != 13) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param0;
    }

    final void backpatchIntLength(int param0, boolean param1) {
        this.payload[this.position - param0 - 4] = (byte)(param0 >> 24);
        if (param1) {
          field_i = (String) null;
        }
        this.payload[-3 + this.position - param0] = (byte)(param0 >> 16);
        this.payload[this.position + (-param0 - 2)] = (byte)(param0 >> 8);
        this.payload[-1 - param0 + this.position] = (byte)param0;
    }

    final void writeByte(boolean param0, int param1) {
        if (!param0) {
          this.writeShort(-83, -27);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
    }

    final void writePrefixedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param1 > -90) {
            field_g = (byte[][]) null;
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + fo.encodeCp1252Subsequence(this.position, this.payload, param0.length(), var4, (byte) 123, 0);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void backpatchByteLength(byte param0, int param1) {
        this.payload[-1 - param1 + this.position] = (byte)param1;
        if (param0 <= 32) {
          String var4 = (String) null;
          this.writePrefixedString((String) null, (byte) 126);
        }
    }

    final int readSignedSmart(int param0) {
        if (param0 != 0) {
          this.payload = (byte[]) null;
        }
        int var2 = this.payload[this.position] & 255;
        if (128 > var2) {
          return this.readUnsignedByte(param0 + 255) - 64;
        }
        return this.readUnsignedShort((byte) -7) - 49152;
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != 21815) {
            PacketBuffer.e((byte) 24);
          }
          NetworkArchiveRequest.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readUnsignedByte(int param0) {
        if (param0 != 255) {
          return 39;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        byte[] var4;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        if (param0 < 107) {
          var4 = (byte[]) null;
          this.writeBytes(-105, 89, -3, (byte[]) null);
        }
        var3 = this.position - var2 - 1;
        if (var3 != 0) {
          return gd.decodeCp1252String((byte) 5, this.payload, var2, var3);
        }
        return "";
    }

    final void decryptXteaRange(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int var13 = CrazyCrystals.field_B;
        try {
          var5_int = this.position;
          this.position = param1;
          var6 = (param2 - param1) / param0;
          for (var7 = 0; var7 < var6; var7++) {
            var8 = this.readInt((byte) 3);
            var9 = this.readInt((byte) 127);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var9 = var9 - (param3[(7390 & var10) >>> 11] + var10 ^ var8 + (var8 << 4 ^ var8 >>> 5));
              var10 = var10 - var11;
              var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ param3[3 & var10] + var10);
            }
            this.position = this.position - 8;
            this.writeInt(var8, -16384);
            this.writeInt(var9, -16384);
          }
          this.position = var5_int;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.KA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = CrazyCrystals.field_B;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        var4 = 109 / ((28 - param0) / 36);
        while (var2 < 0) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final long readLong(boolean param0) {
        if (!param0) {
          this.backpatchShortLength(41, 78);
        }
        long var2 = 4294967295L & (long)this.readInt((byte) -22);
        long var4 = (long)this.readInt((byte) -61) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final void writeVarInt(int param0, boolean param1) {
        if ((param0 & -128) != 0) {
          if (0 != (param0 & -16384)) {
            if (0 != (-2097152 & param0)) {
              if (0 != (-268435456 & param0)) {
                this.writeByte(true, 128 | param0 >>> 28);
              }
              this.writeByte(true, 128 | param0 >>> 21);
            }
            this.writeByte(true, param0 >>> 14 | 128);
          }
          this.writeByte(true, (param0 | 16395) >>> 7);
        }
        if (param1) {
          this.readInt((byte) 78);
        }
        this.writeByte(true, param0 & 127);
    }

    final void padZerosTo(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (param0 != 105) {
          this.writeMedium((byte) -102, 86);
        }
        while (param1 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final int readInt(byte param0) {
        int var2 = 43 % ((70 - param0) / 56);
        this.position = this.position + 4;
        return (-16777216 & this.payload[this.position - 4] << 24) + ((255 & this.payload[-3 + this.position]) << 16) + (65280 & this.payload[this.position - 2] << 8) + (255 & this.payload[this.position - 1]);
    }

    final int readUnsignedMedium(boolean param0) {
        if (param0) {
          this.position = -74;
        }
        this.position = this.position + 3;
        return ((255 & this.payload[-2 + this.position]) << 8) + ((16711680 & this.payload[-3 + this.position] << 16) + (this.payload[-1 + this.position] & 255));
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 16);
        if (param1 != -16384) {
          field_i = (String) null;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
    }

    final void applyRsa(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(var4_int, var5, (byte) -115, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(-161478600, var8.length);
          this.writeBytes(param1, var8.length, 114, var8);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeSignedSmart(int param0, byte param1) {
        if (param0 < 64 &&
          param0 >= -64) {
          this.writeByte(true, 64 + param0);
          return;
        }
        if (param1 <= 104) {
          return;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.writeShort(-161478600, param0 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void encryptXtea(int param0, int[] param1) {
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
        var10 = CrazyCrystals.field_B;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param0 != -268435456) {
            return;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt((byte) 126);
            var6 = this.readInt((byte) 127);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[3 & var7] ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[977272835 & var7 >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, -16384);
            this.writeInt(var6, -16384);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ng.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int readUnsignedShort(byte param0) {
        if (param0 != -7) {
          this.verifyCrc32(99);
        }
        this.position = this.position + 2;
        return (this.payload[-2 + this.position] << 8 & 65280) + (255 & this.payload[-1 + this.position]);
    }

    final void writeString(String param0, byte param1) {
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        int var3_int = param0.indexOf('\0');
        if (param1 != -23) {
          return;
        }
        try {
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + fo.encodeCp1252Subsequence(this.position, this.payload, param0.length(), var4, (byte) 118, 0);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readUnsignedSmart(boolean param0) {
        if (param0) {
          String var3 = (String) null;
          PacketBuffer.a((String) null, 16);
        }
        int var2 = 255 & this.payload[this.position];
        if (128 > var2) {
          return this.readUnsignedByte(255);
        }
        return this.readUnsignedShort((byte) -7) - 32768;
    }

    final String readNullableString(int param0) {
        if (param0 != 0) {
          this.position = -87;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(108);
    }

    final void writeBytes(int param0, int param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          var5_int = param0;
          if (param2 < 70) {
            return;
          }
          while (param1 + param0 > var5_int) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ng.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
        if (param0 != -161478600) {
          field_i = (String) null;
        }
    }

    final boolean verifyCrc32(int param0) {
        this.position = this.position - 4;
        if (param0 >= -60) {
          return false;
        }
        int var2 = pf.computeCrc32(0, this.payload, this.position, -1);
        int var3 = this.readInt((byte) 126);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final static nj a(String param0, nj param1, PuzzleTile param2, byte param3, String param4) {
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        nj stackIn_3_0 = null;
        nj stackIn_16_0 = null;
        nj stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = CrazyCrystals.field_B;
        try {
          var8 = rn.a(param4, (byte) -53);
          var9 = var8;
          if (param3 != -83) {
            stackIn_3_0 = (nj) null;
            return stackIn_3_0;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param1 != null &&
            null != param1.field_a &&
            param0.equals(param1.field_b) &&
            param1.field_o.length == var8.length) {
            for (var6 = 0; var9.length > var6; var6++) {
              if (!var9[var6].equals(param1.field_o[var6])) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              param1.field_i = true;
              if (300 > param1.field_f) {
                param1.field_f = 300;
              }
              param1.field_a = param2;
              stackIn_16_0 = (nj) (param1);
              return stackIn_16_0;
            }
          }
          stackIn_18_0 = new nj(param2, param0, var9);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ng.UA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void readBytes(int param0, byte[] param1, byte param2, int param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          var5_int = 85 % ((44 - param2) / 37);
          for (var6 = param3; var6 < param0 + param3; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var6] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ng.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int appendCrc32(int param0, byte param1) {
        if (param1 >= -54) {
          return -11;
        }
        int var3 = pf.computeCrc32(param0, this.payload, this.position, -1);
        this.writeInt(var3, -16384);
        return var3;
    }

    final void backpatchShortLength(int param0, int param1) {
        if (param0 != 977272835) {
          return;
        }
        this.payload[-2 + this.position - param1] = (byte)(param1 >> 8);
        this.payload[this.position + (-param1 - 1)] = (byte)param1;
    }

    final void writeLong40(long param0, boolean param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
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
        if (param1) {
          this.writeLong56(-8L, (byte) -15);
        }
    }

    final void writeMedium(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        if (param0 < 38) {
          this.readByte((byte) -92);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final String readPrefixedString(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        if (param0 < 7) {
          return (String) null;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.position);
        if (var4 == 0) {
          return "";
        }
        return gd.decodeCp1252String((byte) 71, this.payload, var3, var4);
    }

    final byte readByte(byte param0) {
        int var2 = -103 % ((param0 - 49) / 57);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void writeBase38String(int param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 != -16614) {
            return;
          }
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + var9 - 65);
              } else {
                if (var9 >= 97 &&
                  122 >= var9) {
                  var3_long = var3_long + (long)(-97 + var9 + 2);
                } else {
                  if (48 <= var9 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(28 + (var9 - 48));
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
          this.writeLong56(var3_long, (byte) -95);
          this.writeLong56(var5, (byte) -95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("ng.EB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = h.a((byte) 26, param0);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "ng.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Reload game";
    }
}
