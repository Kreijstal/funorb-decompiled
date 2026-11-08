/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static String achievements;
    static String statusWantsARematch;
    static PcmSample field_q;
    static String muLobbyFriendRm;
    static int[] field_p;
    static String mpXHaswon;
    static AsyncRequest field_u;
    int position;
    static UiComponent field_s;
    static String spectateXsGame;
    static String muAllPlayersHaveLeft;
    byte[] payload;
    static int field_l;

    final void readBytes(int offset, byte obfuscationGuard, byte[] destination, int length) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (obfuscationGuard > -113) {
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
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ge.V(").append(offset).append(',').append(obfuscationGuard).append(',');
          if (destination == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(length).append(')').toString());
        }
    }

    final int readUnsignedMedium(int obfuscationGuard) {
        if (obfuscationGuard <= 43) {
          this.readMedium(-98);
        }
        this.position = this.position + 3;
        return (this.payload[this.position - 1] & 255) + ((this.payload[this.position - 3] << 16 & 16711680) + ((255 & this.payload[-2 + this.position]) << 8));
    }

    final void writeBytes(byte[] source, byte obfuscationGuard, int offset, int length) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (obfuscationGuard != 0) {
            statusWantsARematch = (String) null;
          }
          for (var5_int = offset; var5_int < length + offset; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = source[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ge.PA(");
          if (source == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(offset).append(',').append(length).append(')').toString());
        }
    }

    final boolean verifyChecksum(boolean param0) {
        this.position = this.position - 4;
        if (param0) {
          this.verifyChecksum(true);
        }
        int var2 = ClientException.crc32(0, this.position, -1, this.payload);
        int var3 = this.readInt(true);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final int readSignedSmart(int param0) {
        if (param0 >= -2) {
          return 77;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return -64 + this.readUnsignedByte(-60);
        }
        return this.readUnsignedShort(-1034) - 49152;
    }

    final String readNullableString(int param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 < 106) {
          this.writeShort((byte) -12, -102);
        }
        return this.readNullTerminatedString(-112);
    }

    final int readMedium(int obfuscationGuard) {
        this.position = this.position + 3;
        int var2 = (65280 & this.payload[-2 + this.position] << 8) + (((255 & this.payload[-3 + this.position]) << 16) + (this.payload[this.position - 1] & 255));
        if (var2 > 8388607) {
          var2 = var2 - 16777216;
        }
        if (obfuscationGuard != 0) {
          return 110;
        }
        return var2;
    }

    final void writeLong(long value, byte obfuscationGuard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 48);
        if (obfuscationGuard >= -75) {
          return;
        }
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

    private final void writeLong56(long value, int obfuscationGuard) {
        int var4 = 122 % ((30 - obfuscationGuard) / 51);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 32);
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

    final int readUnsignedByte(int obfuscationGuard) {
        if (obfuscationGuard >= -59) {
          this.readUnsignedByte(-3);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final int readUnsignedSmart(byte param0) {
        if (param0 != -115) {
          String var3 = (String) null;
          this.writeBase38Name((String) null, 68);
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return this.readUnsignedByte(-82);
        }
        return this.readUnsignedShort(-1034) - 32768;
    }

    final void writeBase38Name(String name, int obfuscationGuard) {
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
        try {
          var3_long = 0L;
          var5 = 0L;
          if (obfuscationGuard < 77) {
            return;
          }
          var7 = name.length();
          for (var8 = 19; 0 <= var8; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = name.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + (var9 - 65));
              } else if (97 <= var9 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(-97 + var9 + 2);
              } else if (48 <= var9 &&
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
          this.writeLong56(var3_long, -47);
          this.writeLong56(var5, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("ge.K(");
          if (name == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void xteaEncrypt(int obfuscationGuard, int[] key) {
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
        String var10 = null;
        try {
          if (obfuscationGuard != 32052) {
            var10 = (String) null;
            this.writeBase38Name((String) null, 85);
          }
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
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
                var5 = var5 + (var7 + key[3 & var7] ^ var6 + (var6 >>> 5 ^ var6 << 4));
                var7 = var7 + var8;
                var6 = var6 + (var7 + key[(6753 & var7) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(true, var5);
            this.writeInt(true, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ge.KA(").append(obfuscationGuard).append(',');
          if (key == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void writeMedium(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 <= 37) {
          this.position = 87;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var4 = 22 % ((param0 - 0) / 63);
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void writeInt(boolean param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        if (!param0) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 4109) {
          muLobbyFriendRm = (String) null;
        }
        achievements = null;
        muLobbyFriendRm = null;
        field_s = null;
        mpXHaswon = null;
        statusWantsARematch = null;
        field_u = null;
        muAllPlayersHaveLeft = null;
        field_p = null;
        field_q = null;
        spectateXsGame = null;
    }

    final int readInt(boolean obfuscationGuard) {
        this.position = this.position + 4;
        if (!obfuscationGuard) {
          return 15;
        }
        return (255 & this.payload[this.position - 1]) + (65280 & this.payload[-2 + this.position] << 8) + (this.payload[-4 + this.position] << 24 & -16777216) + (16711680 & this.payload[-3 + this.position] << 16);
    }

    final void writeIntLengthPrefix(int param0, byte param1) {
        this.payload[-4 + (this.position - param0)] = (byte)(param0 >> 24);
        this.payload[this.position - param0 - 3] = (byte)(param0 >> 16);
        if (param1 > -90) {
          int[] var4 = (int[]) null;
          this.xteaDecryptRange(125, -118, (int[]) null, -41);
        }
        this.payload[-2 + (-param0 + this.position)] = (byte)(param0 >> 8);
        this.payload[-param0 + this.position - 1] = (byte)param0;
    }

    final void writeVarInt(int param0, int param1) {
        if (param1 != -32768) {
          return;
        }
        if ((param0 & -128) != 0) {
          if (0 != (-16384 & param0)) {
            if ((-2097152 & param0) != 0) {
              if ((param0 & -268435456) != 0) {
                this.writeByte(param0 >>> 28 | 128, false);
              }
              this.writeByte(128 | param0 >>> 21, false);
            }
            this.writeByte(128 | param0 >>> 14, false);
          }
          this.writeByte(param0 >>> 7 | 128, false);
        }
        this.writeByte(param0 & 127, false);
    }

    final int appendChecksum(int param0, int param1) {
        int var3 = ClientException.crc32(param1, this.position, param0, this.payload);
        this.writeInt(true, var3);
        return var3;
    }

    final void writeShort(byte obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
        if (obfuscationGuard != -81) {
          String var4 = (String) null;
          this.writeNullCircumfixedString(false, (String) null);
        }
    }

    final long readLong(int obfuscationGuard) {
        long var2 = 4294967295L & (long)this.readInt(true);
        if (obfuscationGuard != -412303328) {
          field_s = (UiComponent) null;
        }
        long var4 = (long)this.readInt(true) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void padWithZeros(int param0, byte param1) {
        int fieldTemp$0 = 0;
        if (param1 != -8) {
          return;
        }
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final void encryptRsa(java.math.BigInteger exponent, int obfuscationGuard, java.math.BigInteger modulus) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(0, (byte) -128, var5, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(exponent, modulus);
          var8 = var7.toByteArray();
          this.position = 0;
          if (obfuscationGuard <= 39) {
            String var9 = (String) null;
            this.writeNullCircumfixedString(true, (String) null);
          }
          this.writeShort((byte) -81, var8.length);
          this.writeBytes(var8, (byte) 0, 0, var8.length);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.L(" + (exponent != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (modulus != null ? "{...}" : "null") + ')');
        }
    }

    final void writeByte(int param0, boolean param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        if (param1) {
          this.readSmartInt(-68);
        }
    }

    final int readShort(byte obfuscationGuard) {
        this.position = this.position + 2;
        int var2 = (this.payload[-1 + this.position] & 255) + ((this.payload[this.position - 2] & 255) << 8);
        if (32767 < var2) {
          var2 = var2 - 65536;
        }
        if (obfuscationGuard > -76) {
          this.readInt(true);
        }
        return var2;
    }

    final String readNullTerminatedString(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (obfuscationGuard >= -10) {
          return (String) null;
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -var2 + this.position - 1;
        if (0 != var3) {
          return RankingsScreen.decodeWindows1252(var3, -7510, this.payload, var2);
        }
        return "";
    }

    final static void computeTriangleBarycentrics(float[] param0, int[] param1, int[] param2, float[] param3, int[] param4, int[] param5, int[] param6, byte param7, int[] param8) {
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var9_float = (float)param4[0];
        float var10 = (float)param6[0];
        float var11 = (float)param1[0];
        float var12 = (float)param4[1] - var9_float;
        float var13 = -var10 + (float)param6[1];
        float var14 = (float)param1[1] - var11;
        float var15 = -var9_float + (float)param4[2];
        float var16 = -var10 + (float)param6[2];
        float var17 = (float)param1[2] - var11;
        float var18 = -var9_float + (float)param5[0];
        float var19 = (float)param8[0] - var10;
        float var20 = -var11 + (float)param2[0];
        float var21 = (float)param5[1] - var9_float;
        float var22 = -var10 + (float)param8[1];
        float var23 = -var11 + (float)param2[1];
        float var24 = (float)param5[2] - var9_float;
        float var25 = -var10 + (float)param8[2];
        float var26 = -var11 + (float)param2[2];
        float var30Lifetime1;
        float var31Lifetime1;
        float var32Lifetime1;
        float var33Lifetime1;
        if (param7 < 23) {
          return;
        }
        try {
          var27 = var17 * var13 - var14 * var16;
          var28 = -(var12 * var17) + var15 * var14;
          var29 = var12 * var16 - var15 * var13;
          var30 = -(var17 * var28) + var29 * var16;
          var31 = var27 * var17 - var29 * var15;
          var32 = -(var27 * var16) + var15 * var28;
          var33 = 1.0f / (var31 * var13 + var12 * var30 + var14 * var32);
          param0[1] = var33 * (var32 * var23 + (var30 * var21 + var22 * var31));
          param0[0] = (var32 * var20 + (var18 * var30 + var31 * var19)) * var33;
          param0[2] = var33 * (var32 * var26 + (var31 * var25 + var30 * var24));
          var30Lifetime1 = var13 * var29 - var28 * var14;
          var32Lifetime1 = -(var13 * var27) + var28 * var12;
          var31Lifetime1 = var14 * var27 - var29 * var12;
          var33Lifetime1 = 1.0f / (var15 * var30Lifetime1 + var16 * var31Lifetime1 + var32Lifetime1 * var17);
          param3[0] = var33Lifetime1 * (var30Lifetime1 * var18 + var31Lifetime1 * var19 + var32Lifetime1 * var20);
          param3[1] = var33Lifetime1 * (var22 * var31Lifetime1 + var30Lifetime1 * var21 + var23 * var32Lifetime1);
          param3[2] = (var31Lifetime1 * var25 + var24 * var30Lifetime1 + var26 * var32Lifetime1) * var33Lifetime1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.AA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeUnsignedSmart(byte param0, int param1) {
        if (param1 >= 0 &&
          128 > param1) {
          this.writeByte(param1, false);
          return;
        }
        if (param0 != -49) {
          muAllPlayersHaveLeft = (String) null;
        }
        if (0 <= param1 &&
          param1 < 32768) {
          this.writeShort((byte) -81, param1 + 32768);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void writeShortLengthPrefix(int param0, byte param1) {
        this.payload[this.position + (-param0 - 2)] = (byte)(param0 >> 8);
        if (param1 != -92) {
          String var4 = (String) null;
          this.writeBase38Name((String) null, 44);
        }
        this.payload[-1 + (this.position - param0)] = (byte)param0;
    }

    final String readString(int param0) {
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
        if (param0 != 10762) {
          return (String) null;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.position);
        if (0 != var4) {
          return RankingsScreen.decodeWindows1252(var4, param0 - 18272, this.payload, var3);
        }
        return "";
    }

    final void writeNullCircumfixedString(boolean obfuscationGuard, String text) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = text.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) text);
          this.position = this.position + UiComponentNode.encodeCp1252(this.payload, var4, -24984, text.length(), 0, this.position);
          if (obfuscationGuard) {
            this.payload = (byte[]) null;
          }
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.EA(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void writeLong40(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != 24136) {
          this.readSignedSmart(-128);
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

    final int readUnsignedShort(int obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard != -1034) {
          field_s = (UiComponent) null;
        }
        return (this.payload[-2 + this.position] << 8 & 65280) + (this.payload[this.position - 1] & 255);
    }

    final int readSmartInt(int param0) {
        int var2 = -95 / ((9 - param0) / 59);
        if (0 > this.payload[this.position]) {
          return this.readInt(true) & 2147483647;
        }
        return this.readUnsignedShort(-1034);
    }

    PacketBuffer(int capacity) {
        this.payload = ByteArrayPool.acquireByteArray(capacity, -1);
        this.position = 0;
    }

    PacketBuffer(byte[] payload) {
        try {
          this.position = 0;
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.<init>(" + (payload != null ? "{...}" : "null") + ')');
        }
    }

    final void writeSignedSmart(int param0, int param1) {
        if (param1 < 64 &&
          -64 <= param1) {
          this.writeByte(param1 + 64, false);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.writeShort((byte) -81, 49152 + param1);
          return;
        }
        if (param0 > -84) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final static String formatChatPrefix(byte obfuscationGuard, ChatMessage message) {
        String stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        Object var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        String var6 = null;
        String var3Lifetime1;
        Object var3_refLifetime1;
        String var3Lifetime2;
        var4 = Pool.field_O;
        try {
          if (obfuscationGuard != -24) {
            var5 = (int[]) null;
            PacketBuffer.computeTriangleBarycentrics((float[]) null, (int[]) null, (int[]) null, (float[]) null, (int[]) null, (int[]) null, (int[]) null, (byte) 9, (int[]) null);
          }
          var2 = null;
          if (null != message.field_j) {
            var6 = message.field_j;
            var3 = var6;
            var3Lifetime2 = var6;
            var2 = var6;
            if (1 == message.field_h) {
              var2 = "<img=0>" + var6;
            }
            if (message.field_h == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3_ref = var2;
              var3_refLifetime1 = var2;
            }
          }
          var3Lifetime1 = "";
          if (message.field_p == 2) {
            if (!message.field_g) {
              if (message.field_m == 0 &&
                message.field_e == 0) {
                var3Lifetime1 = AccountWelcomePanel.substituteTemplateArguments(new String[]{(String) (var2)}, -1, SpriteSheetLoadSupport.privatequickchatToX);
              } else {
                var3Lifetime1 = AccountWelcomePanel.substituteTemplateArguments(new String[]{(String) (var2)}, -1, UiComponent.privatequickchatFromX);
              }
            }
          } else {
            if (message.field_p == 0 &&
              JaggrabDownloader.field_l) {
              var3Lifetime1 = "[" + BirthDateValidator.muChatLobby + "] ";
            }
            if (message.field_p == 1) {
              var3Lifetime1 = "[" + AccountWelcomePanel.substituteTemplateArguments(new String[]{message.field_n}, -1, ChatInputSupport.xsGame) + "] ";
            }
            if (message.field_p == 4 &&
              null != PlayerContextMenu.field_g) {
              var3Lifetime1 = "[" + PlayerContextMenu.field_g + "] ";
            }
            if (message.field_p == 3) {
              var3Lifetime1 = "[#" + message.field_n + "] ";
            }
            if (!message.field_g) {
              var3Lifetime1 = var3Lifetime1 + (String) (var2) + ": ";
            }
          }
          stackIn_31_0 = var3Lifetime1;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ge.U(").append(obfuscationGuard).append(',');
          if (message == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void writeNullTerminatedString(int obfuscationGuard, String text) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (obfuscationGuard != -9946) {
            field_q = (PcmSample) null;
          }
          var3_int = text.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) text);
          this.position = this.position + UiComponentNode.encodeCp1252(this.payload, var4, obfuscationGuard - 15038, text.length(), 0, this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.JA(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    final void xteaDecryptRange(int end, int start, int[] key, int obfuscationGuard) {
        int var5_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        try {
          int var6 = -28 / ((obfuscationGuard + 39) / 41);
          var5_int = this.position;
          this.position = start;
          var7 = (end - start) / 8;
          for (var8 = 0; var7 > var8; var8++) {
            var9 = this.readInt(true);
            var10 = this.readInt(true);
            var11 = -957401312;
            var12 = -1640531527;
            var13 = 32;
            while (true) {
              incrementValue$0 = var13;
              var13--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var10 = var10 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ var11 + key[(var11 & 8044) >>> 11]);
              var11 = var11 - var12;
              var9 = var9 - (var11 + key[var11 & 3] ^ (var10 << 4 ^ var10 >>> 5) + var10);
            }
            this.position = this.position - 8;
            this.writeInt(true, var9);
            this.writeInt(true, var10);
          }
          this.position = var5_int;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ge.R(" + end + ',' + start + ',' + (key != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final void writeByteLengthPrefix(int param0, boolean param1) {
        this.payload[-1 - param0 + this.position] = (byte)param0;
        if (!param1) {
          achievements = (String) null;
        }
    }

    final byte readByte(byte obfuscationGuard) {
        if (obfuscationGuard != 105) {
          return (byte) -27;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    static {
        achievements = "Achievements";
        muLobbyFriendRm = "Remove friend";
        mpXHaswon = "<%0> has won!";
        spectateXsGame = "Spectate <%0>'s game";
        muAllPlayersHaveLeft = "All players have left <%0>'s game.";
        statusWantsARematch = "Wants a rematch.";
        field_p = new int[8192];
    }
}
