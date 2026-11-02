/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static IndexedSprite field_f;
    int position;
    byte[] payload;

    final void writeInt(int param0, int param1) {
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
        if (param1 != -1615464796) {
          this.readUnsignedByte(-122);
        }
    }

    final void writeSignedSmart(byte param0, int param1) {
        if (param0 < 58) {
          String var4 = (String) null;
          this.a((String) null, -16);
        }
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(64 + param1, 0);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.b(49152 + param1, -122);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        if (param1 != 0) {
          this.writeLong(32, -12L);
        }
    }

    final void a(int param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = BachelorFridge.field_y;
        try {
          var3_int = 89 / ((-41 - param0) / 51);
          var4 = 0L;
          var6 = 0L;
          var8 = param1.length();
          for (var9 = 19; 0 <= var9; var9--) {
            var4 = var4 * 38L;
            if (var9 < var8) {
              var10 = param1.charAt(var9);
              if (65 <= var10 &&
                var10 <= 90) {
                var4 = var4 + (long)(var10 - 63);
              } else {
                if (var10 >= 97 &&
                  var10 <= 122) {
                  var4 = var4 + (long)(var10 + 2 - 97);
                } else {
                  if (var10 >= 48 &&
                    var10 <= 57) {
                    var4 = var4 + (long)(-48 + (var10 + 28));
                  } else {
                    var4 = var4 + 1L;
                  }
                }
              }
            }
            if (var9 == 10) {
              var6 = var4;
              var4 = 0L;
            }
          }
          this.a(var4, 10847);
          this.a(var6, 10847);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("lu.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int readUnsignedByte(int param0) {
        if (param0 != 16711935) {
          String var3 = (String) null;
          this.a((String) null, 67);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void writeMedium(int param0, int param1) {
        if (param0 != -1607631824) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param1;
    }

    final void encryptRsa(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(var5, var4_int, param1 ^ 128, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.b(var8.length, -118);
          this.a(param1, param1 - 122, var8.length, var8);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lu.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        int var4;
        var2 = 102 % ((param0 - 3) / 35);
        var3 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var4 = -var3 + (this.position - 1);
        if (0 == var4) {
          return "";
        }
        return gt.a(var3, this.payload, (byte) 104, var4);
    }

    final void writeString(byte param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param0 != -50) {
            this.payload = (byte[]) null;
          }
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + BoardChange.a(param1.length(), -56, this.position, var4, this.payload, 0);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lu.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int readSmartInt(byte param0) {
        int var2 = -58 / ((-76 - param0) / 45);
        if (0 > this.payload[this.position]) {
          return 2147483647 & this.readInt(-60);
        }
        return this.readUnsignedShort((byte) 57);
    }

    final int readSignedSmart(int param0) {
        if (param0 != -4095) {
          this.a(106, -5);
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return this.readUnsignedByte(16711935) - 64;
        }
        return this.readUnsignedShort((byte) 92) - 49152;
    }

    final int a(int param0, int param1) {
        int var3 = mk.a(this.payload, param0, -123, this.position);
        if (param1 != 19) {
          this.b(false);
        }
        this.writeInt(var3, -1615464796);
        return var3;
    }

    final void writeVarInt(int param0, byte param1) {
        if ((-128 & param0) != 0) {
          if (0 != (param0 & -16384)) {
            if ((param0 & -2097152) != 0) {
              if ((-268435456 & param0) != 0) {
                this.writeByte(128 | param0 >>> 28, 0);
              }
              this.writeByte(param0 >>> 21 | 128, 0);
            }
            this.writeByte(128 | param0 >>> 14, 0);
          }
          this.writeByte((param0 | 16411) >>> 7, 0);
        }
        if (param1 > -123) {
          field_f = (IndexedSprite) null;
        }
        this.writeByte(127 & param0, 0);
    }

    final void decryptXtea(int param0, int param1, int[] param2, int param3) {
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
        var13 = BachelorFridge.field_y;
        try {
          var5_int = this.position;
          if (param0 != 17654) {
            this.a(-29, -92);
          }
          this.position = param1;
          var6 = (-param1 + param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(127);
            var9 = this.readInt(83);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param2[(var10 & 6721) >>> 11] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ param2[var10 & 3] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, -1615464796);
            this.writeInt(var9, -1615464796);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("lu.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int readInt(int param0) {
        int var2 = -7 % ((-1 - param0) / 48);
        this.position = this.position + 4;
        return (255 & this.payload[this.position - 1]) + ((this.payload[this.position - 2] & 255) << 8) + (-16777216 & this.payload[this.position - 4] << 24) + (16711680 & this.payload[-3 + this.position] << 16);
    }

    final int readUnsignedShort(byte param0) {
        if (param0 < 44) {
          PacketBuffer.d((byte) 2);
        }
        this.position = this.position + 2;
        return ((this.payload[-2 + this.position] & 255) << 8) + (255 & this.payload[this.position - 1]);
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
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param1 >> 8);
        if (param0 != 1686281208) {
          return;
        }
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = FullHealAnimation.a(MassPoisonSpecial.a(param0, true), 120);
          if (var2 == null) {
            var2 = "";
          }
          if (param1 != 7995) {
            PacketBuffer.a(-44, 8, (byte) -11);
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("lu.RA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeSmart(int param0, boolean param1) {
        if (!param1) {
          field_f = (IndexedSprite) null;
        }
        if (param0 >= 0 &&
          param0 < 128) {
          this.writeByte(param0, 0);
          return;
        }
        if (param0 >= 0 &&
          param0 < 32768) {
          this.b(param0 + 32768, -126);
          return;
        }
        throw new IllegalArgumentException();
    }

    final String h(byte param0) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        int var2 = this.payload[fieldTemp$0];
        int var3 = 7 % ((58 - param0) / 61);
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        int var4 = this.readVarInt(-1);
        if (this.payload.length < this.position + var4) {
          throw new IllegalStateException("");
        }
        String var5 = ida.a(var4, this.payload, this.position, 258048);
        this.position = this.position + var4;
        return var5;
    }

    final int readSignedShort(byte param0) {
        this.position = this.position + 2;
        if (param0 != -85) {
          return -126;
        }
        int var2 = ((255 & this.payload[this.position - 2]) << 8) + (this.payload[this.position - 1] & 255);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final void encryptXtea(int[] param0, int param1) {
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
        var10 = BachelorFridge.field_y;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = param1;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt(param1 ^ 92);
            var6 = this.readInt(param1 + 78);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$2 = var9;
              var9--;
              if (0 < incrementValue$2) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param0[(7636 & var7) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, -1615464796);
            this.writeInt(var6, -1615464796);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lu.GB(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String readNullableString(byte param0) {
        int var2 = 124 / ((param0 + 3) / 50);
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(97);
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
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
        if (param0 != -1) {
          this.payload = (byte[]) null;
        }
        return var2 | var3;
    }

    final boolean verifyCrc(int param0) {
        this.position = this.position - param0;
        int var2 = mk.a(this.payload, 0, -111, this.position);
        int var3 = this.readInt(49);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1) {
          this.position = -52;
        }
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final static void a(int param0, int param1, byte param2) {
        uha var6 = null;
        uha var7 = null;
        BitPacketBuffer var4 = null;
        if (param0 != hja.field_i) {
          var6 = (uha) (FridgeScreen.field_g.a((long)hja.field_i, (byte) -87));
          var7 = var6;
          if (var7 != null) {
            var7.field_Cb = null;
          }
          hja.field_i = param0;
          var4 = sja.field_fb;
          var4.writeCipheredByte(param1, (byte) 113);
          var4.writeByte(3, 0);
          var4.writeByte(11, 0);
          var4.b(param0, -122);
        }
        int var3 = -23 % ((-24 - param2) / 57);
    }

    final long readLong(int param0) {
        if (param0 >= -93) {
          field_f = (IndexedSprite) null;
        }
        long var2 = 4294967295L & (long)this.readInt(78);
        long var4 = (long)this.readInt(-62) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void writeLengthShort(byte param0, int param1) {
        this.payload[-param1 + (this.position - 2)] = (byte)(param1 >> 8);
        this.payload[-param1 + this.position - 1] = (byte)param1;
        if (param0 != -88) {
          this.position = 60;
        }
    }

    final void writeLengthByte(byte param0, int param1) {
        this.payload[-1 + this.position - param1] = (byte)param1;
        int var3 = -126 / ((26 - param0) / 50);
    }

    final static void a(int param0, Sprite param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int[] param13, int param14, int param15, int param16) {
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_255_0 = 0;
        int stackIn_262_0 = 0;
        RuntimeException stackIn_277_0 = null;
        StringBuilder stackIn_277_1 = null;
        String stackIn_278_2 = null;
        StringBuilder stackIn_280_1 = null;
        String stackIn_281_2 = null;
        StringBuilder stackIn_283_1 = null;
        String stackIn_284_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        double var37 = 0.0;
        double var39 = 0.0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        int var67 = 0;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var45Lifetime1;
        int var45Lifetime2;
        int var46Lifetime1;
        int var46Lifetime2;
        int var47Lifetime1;
        int var47Lifetime2;
        int var50Lifetime1;
        int var50Lifetime2;
        int var51Lifetime1;
        int var51Lifetime2;
        int var52Lifetime1;
        int var52Lifetime2;
        int var53Lifetime1;
        int var53Lifetime2;
        int var54Lifetime1;
        int var54Lifetime2;
        int var55Lifetime1;
        int var55Lifetime2;
        int var56Lifetime1;
        int var56Lifetime2;
        int var57Lifetime1;
        int var57Lifetime2;
        int var58Lifetime1;
        int var58Lifetime2;
        int var59Lifetime1;
        int var59Lifetime2;
        int var60Lifetime1;
        int var60Lifetime2;
        int var61Lifetime1;
        int var61Lifetime2;
        int var62Lifetime1;
        int var62Lifetime2;
        int var63Lifetime1;
        int var63Lifetime2;
        int var64Lifetime1;
        int var64Lifetime2;
        int var65Lifetime1;
        int var65Lifetime2;
        int var66Lifetime1;
        int var66Lifetime2;
        int var45Lifetime3;
        int var46Lifetime3;
        int var47Lifetime3;
        int var50Lifetime3;
        int var51Lifetime3;
        int var52Lifetime3;
        int var53Lifetime3;
        int var54Lifetime3;
        int var55Lifetime3;
        int var56Lifetime3;
        int var57Lifetime3;
        int var58Lifetime3;
        int var59Lifetime3;
        int var60Lifetime3;
        int var61Lifetime3;
        int var62Lifetime3;
        int var63Lifetime3;
        int var64Lifetime3;
        int var65Lifetime3;
        int var66Lifetime3;
        int var47Lifetime1Lifetime1;
        int var47Lifetime2Lifetime1;
        var67 = BachelorFridge.field_y;
        try {
          if (0 != param5 &&
            param15 != 0) {
            var17_int = param1.field_q;
            param10 = param10 - (param1.field_t << 4);
            param14 = param14 - (param1.field_u << 4);
            var18 = param1.field_p;
            var19 = 0.00009587379924285257 * (double)(param6 & 65535);
            var21 = (int)Math.floor(0.5 + Math.sin(var19) * (double)param5);
            var22 = (int)Math.floor(Math.cos(var19) * (double)param5 + 0.5);
            var23 = (int)Math.floor(0.5 + (double)param15 * Math.sin(var19));
            var24 = (int)Math.floor(0.5 + Math.cos(var19) * (double)param15);
            var25 = var23 * -param14 + var22 * -param10;
            var26 = var24 * -param14 + -(-param10) * var21;
            var27 = var22 * (-param10 + (var17_int << 4)) + var23 * -param14;
            var28 = var21 * -((var17_int << 4) - param10) + var24 * -param14;
            var29 = ((var18 << 4) - param14) * var23 + -param10 * var22;
            var30 = -(-param10) * var21 + (-param14 + (var18 << 4)) * var24;
            if (param3 != -4) {
              return;
            }
            var31 = var22 * (-param10 + (var17_int << 4)) + (-param14 + (var18 << 4)) * var23;
            var32 = -((var17_int << 4) - param10) * var21 + var24 * ((var18 << 4) - param14);
            if (var27 <= var25) {
              var33 = var27;
              var34 = var25;
            } else {
              var34 = var27;
              var33 = var25;
            }
            if (var33 > var29) {
              var33 = var29;
            }
            if (var33 > var31) {
              var33 = var31;
            }
            if (var34 < var29) {
              var34 = var29;
            }
            if (var31 > var34) {
              var34 = var31;
            }
            if (var26 >= var28) {
              var35 = var28;
              var36 = var26;
            } else {
              var36 = var28;
              var35 = var26;
            }
            if (var35 > var30) {
              var35 = var30;
            }
            if (var36 < var30) {
              var36 = var30;
            }
            if (var35 > var32) {
              var35 = var32;
            }
            var34 = var34 + 4095 >> 12;
            if (var32 > var36) {
              var36 = var32;
            }
            var33 = var33 >> 12;
            var35 = var35 >> 12;
            var34 = var34 + param8;
            var35 = var35 + param12;
            var36 = var36 + 4095 >> 12;
            var33 = var33 + param8;
            var33 = var33 >> 4;
            var35 = var35 >> 4;
            var34 = 15 + var34 >> 4;
            var36 = var36 + param12;
            if (SoftwareRasterizer.field_f > var33) {
              var33 = SoftwareRasterizer.field_f;
            }
            if (var34 > SoftwareRasterizer.field_h) {
              var34 = SoftwareRasterizer.field_h;
            }
            var36 = var36 + 15 >> 4;
            if (SoftwareRasterizer.field_j > var35) {
              var35 = SoftwareRasterizer.field_j;
            }
            var34 = -var34 + var33;
            if (var36 > SoftwareRasterizer.field_k) {
              var36 = SoftwareRasterizer.field_k;
            }
            if (var34 >= 0) {
              return;
            }
            var36 = -var36 + var35;
            if (var36 >= 0) {
              return;
            }
            param4 = SoftwareRasterizer.field_i * var35 + var33;
            param0 = var34 + SoftwareRasterizer.field_i;
            var37 = 16777216.0 / (double)param5;
            var21Lifetime1 = (int)Math.floor(Math.sin(var19) * var37 + 0.5);
            var39 = 16777216.0 / (double)param15;
            var22Lifetime1 = (int)Math.floor(0.5 + var37 * Math.cos(var19));
            var23Lifetime1 = (int)Math.floor(0.5 + Math.sin(var19) * var39);
            var24Lifetime1 = (int)Math.floor(var39 * Math.cos(var19) + 0.5);
            var41 = -param8 + ((var33 << 4) + 8);
            var42 = -param12 + (var35 << 4) + 8;
            param7 = -(var21Lifetime1 * var42 >> 4) + (param10 << 8);
            param16 = (param14 << 8) + (var42 * var24Lifetime1 >> 4);
            var43 = var41 * var22Lifetime1 >> 4;
            var44 = var23Lifetime1 * var41 >> 4;
            var48 = var17_int << 12;
            var49 = var18 << 12;
            if (var22Lifetime1 < 0) {
              if (0 > var23Lifetime1) {
                var46 = var36;
                while (var46 != 0) {
                  boolean decompiledFrameRemainder1 = true;
                  var51 = param16 + var44;
                  var45 = var34;
                  var50 = var43 + param7;
                  var47 = -var48 + var50;
                  if (-var48 + var50 >= 0) {
                    if (var22Lifetime1 == 0) {
                      param4 = param4 - var45;
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      var47 = (var22Lifetime1 - var47) / var22Lifetime1;
                      var45 = var45 + var47;
                      var50 = var50 + var22Lifetime1 * var47;
                      param4 = param4 + var47;
                      var51 = var51 + var23Lifetime1 * var47;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    var47 = -var49 + var51;
                    if (-var49 + var51 >= 0) {
                      if (0 == var23Lifetime1) {
                        param4 = param4 - var45;
                        decompiledFrameRemainder1 = false;
                      }
                      else {
                        var47 = (-var47 + var23Lifetime1) / var23Lifetime1;
                        var51 = var51 + var23Lifetime1 * var47;
                        var50 = var50 + var47 * var22Lifetime1;
                        var45 = var45 + var47;
                        param4 = param4 + var47;
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      while (var45 != 0) {
                        if (var50 >= -4096 &&
                          var51 >= -4096) {
                          var53 = var51;
                          var52 = var50;
                          param2 = var50 >> 12;
                          param9 = var51 >> 12;
                          var53 = var53 & 4095;
                          var52 = var52 & 4095;
                          var62 = param9 * var17_int + param2;
                          if (0 > param9) {
                            var55 = 0;
                            var58 = 0;
                            var59 = 0;
                            var54 = 0;
                          } else {
                            if (var17_int - 1 > param2) {
                              var55 = param13[var62 + 1];
                              if (0 != var55) {
                                stackIn_241_0 = (-var53 + 4096) * var52;
                              } else {
                                stackIn_241_0 = 0;
                              }
                              var59 = stackIn_241_0;
                            } else {
                              var59 = 0;
                              var55 = 0;
                            }
                            if (param2 < 0) {
                              var58 = 0;
                              var54 = 0;
                            } else {
                              var54 = param13[var62];
                              if (var54 != 0) {
                                stackIn_246_0 = (-var52 + 4096) * (-var53 + 4096);
                              } else {
                                stackIn_246_0 = 0;
                              }
                              var58 = stackIn_246_0;
                            }
                          }
                          if (param9 < -1 + var18) {
                            if (0 > param2) {
                              var60 = 0;
                              var56 = 0;
                            } else {
                              var56 = param13[var62 + var17_int];
                              if (0 != var56) {
                                stackIn_255_0 = (-var52 + 4096) * var53;
                              } else {
                                stackIn_255_0 = 0;
                              }
                              var60 = stackIn_255_0;
                            }
                            if (param2 < -1 + var17_int) {
                              var57 = param13[1 + (var17_int + var62)];
                              if (var57 != 0) {
                                stackIn_262_0 = var52 * var53;
                              } else {
                                stackIn_262_0 = 0;
                              }
                              var61 = stackIn_262_0;
                            } else {
                              var57 = 0;
                              var61 = 0;
                            }
                          } else {
                            var57 = 0;
                            var61 = 0;
                            var60 = 0;
                            var56 = 0;
                          }
                          var58 = var58 >> 16;
                          var61 = var61 >> 16;
                          var59 = var59 >> 16;
                          var60 = var60 >> 16;
                          var66 = var58 + var59 + var60 + var61;
                          if (var66 < 256) {
                            if (var66 >= 128) {
                              var63 = (16711935 & var54) * var58 + var59 * (var55 & 16711935);
                              var64 = var58 * (var54 & 65280) + var59 * (65280 & var55);
                              var63 = var63 + (var61 * (var57 & 16711935) + var60 * (16711935 & var56));
                              var64 = var64 + (var60 * (65280 & var56) + (65280 & var57) * var61);
                              var65 = (65535 & var63) / var66 + ((var63 >>> 16) / var66 << 16) + (var64 / var66 & 65280);
                              if (var65 == 0) {
                                var65 = 1;
                              }
                              param11[param4] = var65;
                            }
                          } else {
                            var63 = (16711935 & var54) * var58 + var59 * (var55 & 16711935);
                            var64 = var59 * (65280 & var55) + (65280 & var54) * var58;
                            var63 = var63 + ((16711935 & var57) * var61 + (var56 & 16711935) * var60);
                            var64 = var64 + ((65280 & var57) * var61 + var60 * (var56 & 65280));
                            var65 = (-419495681 & var63 >>> 8) + ((var64 & 16711716) >>> 8);
                            if (var65 == 0) {
                              var65 = 1;
                            }
                            param11[param4] = var65;
                          }
                          var45++;
                          param4++;
                          var51 = var51 + var23Lifetime1;
                          var50 = var50 + var22Lifetime1;
                          continue;
                        }
                        break;
                      }
                      param4 = param4 - var45;
                    }
                  }
                  param4 = param4 + param0;
                  var46++;
                  param7 = param7 - var21Lifetime1;
                  param16 = param16 + var24Lifetime1;
                }
                return;
              }
              var46Lifetime3 = var36;
              while (0 != var46Lifetime3) {
                boolean decompiledFrameRemainder0 = true;
                var45Lifetime3 = var34;
                var51Lifetime3 = param16 + var44;
                var50Lifetime3 = param7 + var43;
                var47Lifetime3 = var50Lifetime3 - var48;
                if (var50Lifetime3 - var48 >= 0) {
                  if (var22Lifetime1 == 0) {
                    param4 = param4 - var45Lifetime3;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var47Lifetime3 = (-var47Lifetime3 + var22Lifetime1) / var22Lifetime1;
                    var50Lifetime3 = var50Lifetime3 + var22Lifetime1 * var47Lifetime3;
                    var51Lifetime3 = var51Lifetime3 + var47Lifetime3 * var23Lifetime1;
                    var45Lifetime3 = var45Lifetime3 + var47Lifetime3;
                    param4 = param4 + var47Lifetime3;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var47Lifetime3 = var51Lifetime3 + 4096;
                  if (0 > var51Lifetime3 + 4096) {
                    if (0 == var23Lifetime1) {
                      param4 = param4 - var45Lifetime3;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var47Lifetime3 = (-1 + (var23Lifetime1 - var47Lifetime3)) / var23Lifetime1;
                      var51Lifetime3 = var51Lifetime3 + var47Lifetime3 * var23Lifetime1;
                      var45Lifetime3 = var45Lifetime3 + var47Lifetime3;
                      param4 = param4 + var47Lifetime3;
                      var50Lifetime3 = var50Lifetime3 + var22Lifetime1 * var47Lifetime3;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    while (var45Lifetime3 != 0) {
                      if (var50Lifetime3 >= -4096) {
                        param9 = var51Lifetime3 >> 12;
                        if (var18 > var51Lifetime3 >> 12) {
                          var52Lifetime3 = var50Lifetime3;
                          param2 = var50Lifetime3 >> 12;
                          var53Lifetime3 = var51Lifetime3;
                          var52Lifetime3 = var52Lifetime3 & 4095;
                          var62Lifetime3 = param2 + var17_int * param9;
                          var53Lifetime3 = var53Lifetime3 & 4095;
                          if (-1 + var18 <= param9) {
                            var57Lifetime3 = 0;
                            var56Lifetime3 = 0;
                            var60Lifetime3 = 0;
                            var61Lifetime3 = 0;
                          } else {
                            if (var17_int - 1 <= param2) {
                              var61Lifetime3 = 0;
                              var57Lifetime3 = 0;
                            } else {
                              var57Lifetime3 = param13[1 + var17_int + var62Lifetime3];
                              if (var57Lifetime3 == 0) {
                                stackIn_185_0 = 0;
                              } else {
                                stackIn_185_0 = var52Lifetime3 * var53Lifetime3;
                              }
                              var61Lifetime3 = stackIn_185_0;
                            }
                            if (0 > param2) {
                              var60Lifetime3 = 0;
                              var56Lifetime3 = 0;
                            } else {
                              var56Lifetime3 = param13[var62Lifetime3 + var17_int];
                              if (var56Lifetime3 != 0) {
                                stackIn_191_0 = var53Lifetime3 * (-var52Lifetime3 + 4096);
                              } else {
                                stackIn_191_0 = 0;
                              }
                              var60Lifetime3 = stackIn_191_0;
                            }
                          }
                          if (0 > param9) {
                            var54Lifetime3 = 0;
                            var58Lifetime3 = 0;
                            var59Lifetime3 = 0;
                            var55Lifetime3 = 0;
                          } else {
                            if (param2 >= 0) {
                              var54Lifetime3 = param13[var62Lifetime3];
                              if (var54Lifetime3 == 0) {
                                stackIn_200_0 = 0;
                              } else {
                                stackIn_200_0 = (-var52Lifetime3 + 4096) * (4096 - var53Lifetime3);
                              }
                              var58Lifetime3 = stackIn_200_0;
                            } else {
                              var58Lifetime3 = 0;
                              var54Lifetime3 = 0;
                            }
                            if (param2 < -1 + var17_int) {
                              var55Lifetime3 = param13[1 + var62Lifetime3];
                              if (var55Lifetime3 == 0) {
                                stackIn_206_0 = 0;
                              } else {
                                stackIn_206_0 = (4096 - var53Lifetime3) * var52Lifetime3;
                              }
                              var59Lifetime3 = stackIn_206_0;
                            } else {
                              var55Lifetime3 = 0;
                              var59Lifetime3 = 0;
                            }
                          }
                          var58Lifetime3 = var58Lifetime3 >> 16;
                          var59Lifetime3 = var59Lifetime3 >> 16;
                          var61Lifetime3 = var61Lifetime3 >> 16;
                          var60Lifetime3 = var60Lifetime3 >> 16;
                          var66Lifetime3 = var60Lifetime3 + var58Lifetime3 + (var59Lifetime3 + var61Lifetime3);
                          if (var66Lifetime3 < 256) {
                            if (var66Lifetime3 >= 128) {
                              var63Lifetime3 = var58Lifetime3 * (var54Lifetime3 & 16711935) + (16711935 & var55Lifetime3) * var59Lifetime3;
                              var63Lifetime3 = var63Lifetime3 + ((16711935 & var57Lifetime3) * var61Lifetime3 + var60Lifetime3 * (var56Lifetime3 & 16711935));
                              var64Lifetime3 = var58Lifetime3 * (var54Lifetime3 & 65280) + var59Lifetime3 * (var55Lifetime3 & 65280);
                              var64Lifetime3 = var64Lifetime3 + ((var57Lifetime3 & 65280) * var61Lifetime3 + (65280 & var56Lifetime3) * var60Lifetime3);
                              var65Lifetime3 = (65280 & var64Lifetime3 / var66Lifetime3) + ((var63Lifetime3 >>> 16) / var66Lifetime3 << 16) + (var63Lifetime3 & 65535) / var66Lifetime3;
                              if (var65Lifetime3 == 0) {
                                var65Lifetime3 = 1;
                              }
                              param11[param4] = var65Lifetime3;
                            }
                          } else {
                            var63Lifetime3 = (16711935 & var55Lifetime3) * var59Lifetime3 + (var54Lifetime3 & 16711935) * var58Lifetime3;
                            var63Lifetime3 = var63Lifetime3 + (var61Lifetime3 * (var57Lifetime3 & 16711935) + (var56Lifetime3 & 16711935) * var60Lifetime3);
                            var64Lifetime3 = (var55Lifetime3 & 65280) * var59Lifetime3 + (var54Lifetime3 & 65280) * var58Lifetime3;
                            var64Lifetime3 = var64Lifetime3 + ((65280 & var57Lifetime3) * var61Lifetime3 + (65280 & var56Lifetime3) * var60Lifetime3);
                            var65Lifetime3 = (var63Lifetime3 >>> 8 & 956236031) + ((var64Lifetime3 & 16711808) >>> 8);
                            if (0 == var65Lifetime3) {
                              var65Lifetime3 = 1;
                            }
                            param11[param4] = var65Lifetime3;
                          }
                          var51Lifetime3 = var51Lifetime3 + var23Lifetime1;
                          param4++;
                          var50Lifetime3 = var50Lifetime3 + var22Lifetime1;
                          var45Lifetime3++;
                          continue;
                        }
                      }
                      break;
                    }
                    param4 = param4 - var45Lifetime3;
                  }
                }
                var46Lifetime3++;
                param16 = param16 + var24Lifetime1;
                param7 = param7 - var21Lifetime1;
                param4 = param4 + param0;
              }
              return;
            }
            if (var21Lifetime1 < 0 &&
              var23Lifetime1 < 0) {
              var46Lifetime1 = var36;
              while (var46Lifetime1 != 0) {
                boolean decompiledFrameRemainder3 = true;
                var50Lifetime1 = var43 + param7;
                var51Lifetime1 = var44 + param16;
                var45Lifetime1 = var34;
                var47Lifetime1 = var50Lifetime1 + 4096;
                if (var50Lifetime1 + 4096 < 0) {
                  if (var22Lifetime1 == 0) {
                    param4 = param4 - var45Lifetime1;
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    var47Lifetime1 = (var22Lifetime1 + (-1 - var47Lifetime1)) / var22Lifetime1;
                    var51Lifetime1 = var51Lifetime1 + var23Lifetime1 * var47Lifetime1;
                    var50Lifetime1 = var50Lifetime1 + var22Lifetime1 * var47Lifetime1;
                    param4 = param4 + var47Lifetime1;
                    var45Lifetime1 = var45Lifetime1 + var47Lifetime1;
                  }
                }
                if (decompiledFrameRemainder3) {
                  var47Lifetime1Lifetime1 = -var49 + var51Lifetime1;
                  if (-var49 + var51Lifetime1 >= 0) {
                    if (var23Lifetime1 == 0) {
                      param4 = param4 - var45Lifetime1;
                      decompiledFrameRemainder3 = false;
                    }
                    else {
                      var47Lifetime1Lifetime1 = (-var47Lifetime1Lifetime1 + var23Lifetime1) / var23Lifetime1;
                      param4 = param4 + var47Lifetime1Lifetime1;
                      var51Lifetime1 = var51Lifetime1 + var23Lifetime1 * var47Lifetime1Lifetime1;
                      var50Lifetime1 = var50Lifetime1 + var22Lifetime1 * var47Lifetime1Lifetime1;
                      var45Lifetime1 = var45Lifetime1 + var47Lifetime1Lifetime1;
                    }
                  }
                  if (decompiledFrameRemainder3) {
                    while (var45Lifetime1 != 0) {
                      if (var51Lifetime1 >= -4096) {
                        param2 = var50Lifetime1 >> 12;
                        if (var17_int > var50Lifetime1 >> 12) {
                          var52Lifetime1 = var50Lifetime1;
                          var53Lifetime1 = var51Lifetime1;
                          param9 = var51Lifetime1 >> 12;
                          var52Lifetime1 = var52Lifetime1 & 4095;
                          var53Lifetime1 = var53Lifetime1 & 4095;
                          var62Lifetime1 = var17_int * param9 + param2;
                          if (param9 >= -1 + var18) {
                            var60Lifetime1 = 0;
                            var61Lifetime1 = 0;
                            var56Lifetime1 = 0;
                            var57Lifetime1 = 0;
                          } else {
                            if (param2 < -1 + var17_int) {
                              var57Lifetime1 = param13[var17_int + var62Lifetime1 + 1];
                              if (0 != var57Lifetime1) {
                                stackIn_70_0 = var52Lifetime1 * var53Lifetime1;
                              } else {
                                stackIn_70_0 = 0;
                              }
                              var61Lifetime1 = stackIn_70_0;
                            } else {
                              var61Lifetime1 = 0;
                              var57Lifetime1 = 0;
                            }
                            if (0 > param2) {
                              var56Lifetime1 = 0;
                              var60Lifetime1 = 0;
                            } else {
                              var56Lifetime1 = param13[var62Lifetime1 + var17_int];
                              if (var56Lifetime1 != 0) {
                                stackIn_75_0 = var53Lifetime1 * (4096 - var52Lifetime1);
                              } else {
                                stackIn_75_0 = 0;
                              }
                              var60Lifetime1 = stackIn_75_0;
                            }
                          }
                          if (param9 < 0) {
                            var55Lifetime1 = 0;
                            var58Lifetime1 = 0;
                            var54Lifetime1 = 0;
                            var59Lifetime1 = 0;
                          } else {
                            if (param2 >= 0) {
                              var54Lifetime1 = param13[var62Lifetime1];
                              if (var54Lifetime1 != 0) {
                                stackIn_84_0 = (4096 - var52Lifetime1) * (4096 - var53Lifetime1);
                              } else {
                                stackIn_84_0 = 0;
                              }
                              var58Lifetime1 = stackIn_84_0;
                            } else {
                              var54Lifetime1 = 0;
                              var58Lifetime1 = 0;
                            }
                            if (param2 >= -1 + var17_int) {
                              var55Lifetime1 = 0;
                              var59Lifetime1 = 0;
                            } else {
                              var55Lifetime1 = param13[1 + var62Lifetime1];
                              if (var55Lifetime1 == 0) {
                                stackIn_89_0 = 0;
                              } else {
                                stackIn_89_0 = (4096 - var53Lifetime1) * var52Lifetime1;
                              }
                              var59Lifetime1 = stackIn_89_0;
                            }
                          }
                          var61Lifetime1 = var61Lifetime1 >> 16;
                          var60Lifetime1 = var60Lifetime1 >> 16;
                          var58Lifetime1 = var58Lifetime1 >> 16;
                          var59Lifetime1 = var59Lifetime1 >> 16;
                          var66Lifetime1 = var61Lifetime1 + var59Lifetime1 + (var58Lifetime1 + var60Lifetime1);
                          if (var66Lifetime1 < 256) {
                            if (var66Lifetime1 >= 128) {
                              var63Lifetime1 = var58Lifetime1 * (16711935 & var54Lifetime1) + var59Lifetime1 * (var55Lifetime1 & 16711935);
                              var63Lifetime1 = var63Lifetime1 + ((16711935 & var57Lifetime1) * var61Lifetime1 + var60Lifetime1 * (var56Lifetime1 & 16711935));
                              var64Lifetime1 = (65280 & var55Lifetime1) * var59Lifetime1 + var58Lifetime1 * (65280 & var54Lifetime1);
                              var64Lifetime1 = var64Lifetime1 + (var60Lifetime1 * (65280 & var56Lifetime1) + (65280 & var57Lifetime1) * var61Lifetime1);
                              var65Lifetime1 = (var63Lifetime1 & 65535) / var66Lifetime1 + (var64Lifetime1 / var66Lifetime1 & 65280) + ((var63Lifetime1 >>> 16) / var66Lifetime1 << 16);
                              if (var65Lifetime1 == 0) {
                                var65Lifetime1 = 1;
                              }
                              param11[param4] = var65Lifetime1;
                            }
                          } else {
                            var63Lifetime1 = (var55Lifetime1 & 16711935) * var59Lifetime1 + (16711935 & var54Lifetime1) * var58Lifetime1;
                            var64Lifetime1 = var58Lifetime1 * (65280 & var54Lifetime1) + var59Lifetime1 * (var55Lifetime1 & 65280);
                            var63Lifetime1 = var63Lifetime1 + ((16711935 & var56Lifetime1) * var60Lifetime1 + (16711935 & var57Lifetime1) * var61Lifetime1);
                            var64Lifetime1 = var64Lifetime1 + (var60Lifetime1 * (var56Lifetime1 & 65280) + var61Lifetime1 * (var57Lifetime1 & 65280));
                            var65Lifetime1 = ((16711735 & var64Lifetime1) >>> 8) + ((var63Lifetime1 & -16711692) >>> 8);
                            if (var65Lifetime1 == 0) {
                              var65Lifetime1 = 1;
                            }
                            param11[param4] = var65Lifetime1;
                          }
                          var50Lifetime1 = var50Lifetime1 + var22Lifetime1;
                          param4++;
                          var51Lifetime1 = var51Lifetime1 + var23Lifetime1;
                          var45Lifetime1++;
                          continue;
                        }
                      }
                      break;
                    }
                    param4 = param4 - var45Lifetime1;
                  }
                }
                var46Lifetime1++;
                param4 = param4 + param0;
                param7 = param7 - var21Lifetime1;
                param16 = param16 + var24Lifetime1;
              }
              return;
            }
            var46Lifetime2 = var36;
            while (var46Lifetime2 != 0) {
              boolean decompiledFrameRemainder2 = true;
              var45Lifetime2 = var34;
              var51Lifetime2 = var44 + param16;
              var50Lifetime2 = var43 + param7;
              var47Lifetime2 = var50Lifetime2 + 4096;
              if (var50Lifetime2 + 4096 < 0) {
                if (var22Lifetime1 == 0) {
                  param4 = param4 - var45Lifetime2;
                  decompiledFrameRemainder2 = false;
                }
                else {
                  var47Lifetime2 = (-1 + (var22Lifetime1 - var47Lifetime2)) / var22Lifetime1;
                  var45Lifetime2 = var45Lifetime2 + var47Lifetime2;
                  var50Lifetime2 = var50Lifetime2 + var47Lifetime2 * var22Lifetime1;
                  var51Lifetime2 = var51Lifetime2 + var23Lifetime1 * var47Lifetime2;
                  param4 = param4 + var47Lifetime2;
                }
              }
              if (decompiledFrameRemainder2) {
                var47Lifetime2Lifetime1 = var51Lifetime2 + 4096;
                if (0 > var51Lifetime2 + 4096) {
                  if (var23Lifetime1 == 0) {
                    param4 = param4 - var45Lifetime2;
                    decompiledFrameRemainder2 = false;
                  }
                  else {
                    var47Lifetime2Lifetime1 = (var23Lifetime1 + (-1 - var47Lifetime2Lifetime1)) / var23Lifetime1;
                    var45Lifetime2 = var45Lifetime2 + var47Lifetime2Lifetime1;
                    param4 = param4 + var47Lifetime2Lifetime1;
                    var50Lifetime2 = var50Lifetime2 + var22Lifetime1 * var47Lifetime2Lifetime1;
                    var51Lifetime2 = var51Lifetime2 + var23Lifetime1 * var47Lifetime2Lifetime1;
                  }
                }
                if (decompiledFrameRemainder2) {
                  while (0 != var45Lifetime2) {
                    param2 = var50Lifetime2 >> 12;
                    if (var50Lifetime2 >> 12 < var17_int) {
                      param9 = var51Lifetime2 >> 12;
                      if (var18 > var51Lifetime2 >> 12) {
                        var62Lifetime2 = param2 + param9 * var17_int;
                        var52Lifetime2 = var50Lifetime2;
                        var53Lifetime2 = var51Lifetime2;
                        var53Lifetime2 = var53Lifetime2 & 4095;
                        var52Lifetime2 = var52Lifetime2 & 4095;
                        if (0 > param9) {
                          var59Lifetime2 = 0;
                          var58Lifetime2 = 0;
                          var55Lifetime2 = 0;
                          var54Lifetime2 = 0;
                        } else {
                          if (param2 >= var17_int - 1) {
                            var55Lifetime2 = 0;
                            var59Lifetime2 = 0;
                          } else {
                            var55Lifetime2 = param13[1 + var62Lifetime2];
                            if (var55Lifetime2 == 0) {
                              stackIn_126_0 = 0;
                            } else {
                              stackIn_126_0 = (-var53Lifetime2 + 4096) * var52Lifetime2;
                            }
                            var59Lifetime2 = stackIn_126_0;
                          }
                          if (param2 < 0) {
                            var58Lifetime2 = 0;
                            var54Lifetime2 = 0;
                          } else {
                            var54Lifetime2 = param13[var62Lifetime2];
                            if (var54Lifetime2 == 0) {
                              stackIn_132_0 = 0;
                            } else {
                              stackIn_132_0 = (-var52Lifetime2 + 4096) * (4096 - var53Lifetime2);
                            }
                            var58Lifetime2 = stackIn_132_0;
                          }
                        }
                        if (param9 < var18 - 1) {
                          if (0 <= param2) {
                            var56Lifetime2 = param13[var62Lifetime2 + var17_int];
                            if (var56Lifetime2 == 0) {
                              stackIn_142_0 = 0;
                            } else {
                              stackIn_142_0 = var53Lifetime2 * (-var52Lifetime2 + 4096);
                            }
                            var60Lifetime2 = stackIn_142_0;
                          } else {
                            var56Lifetime2 = 0;
                            var60Lifetime2 = 0;
                          }
                          if (param2 >= -1 + var17_int) {
                            var57Lifetime2 = 0;
                            var61Lifetime2 = 0;
                          } else {
                            var57Lifetime2 = param13[1 + var62Lifetime2 + var17_int];
                            if (var57Lifetime2 == 0) {
                              stackIn_147_0 = 0;
                            } else {
                              stackIn_147_0 = var52Lifetime2 * var53Lifetime2;
                            }
                            var61Lifetime2 = stackIn_147_0;
                          }
                        } else {
                          var56Lifetime2 = 0;
                          var57Lifetime2 = 0;
                          var60Lifetime2 = 0;
                          var61Lifetime2 = 0;
                        }
                        var58Lifetime2 = var58Lifetime2 >> 16;
                        var61Lifetime2 = var61Lifetime2 >> 16;
                        var60Lifetime2 = var60Lifetime2 >> 16;
                        var59Lifetime2 = var59Lifetime2 >> 16;
                        var66Lifetime2 = var61Lifetime2 + (var60Lifetime2 + var59Lifetime2 + var58Lifetime2);
                        if (256 <= var66Lifetime2) {
                          var63Lifetime2 = (16711935 & var55Lifetime2) * var59Lifetime2 + (16711935 & var54Lifetime2) * var58Lifetime2;
                          var64Lifetime2 = (65280 & var55Lifetime2) * var59Lifetime2 + var58Lifetime2 * (65280 & var54Lifetime2);
                          var63Lifetime2 = var63Lifetime2 + ((var57Lifetime2 & 16711935) * var61Lifetime2 + (16711935 & var56Lifetime2) * var60Lifetime2);
                          var64Lifetime2 = var64Lifetime2 + (var61Lifetime2 * (65280 & var57Lifetime2) + var60Lifetime2 * (var56Lifetime2 & 65280));
                          var65Lifetime2 = (989790463 & var63Lifetime2 >>> 8) + ((16711850 & var64Lifetime2) >>> 8);
                          if (0 == var65Lifetime2) {
                            var65Lifetime2 = 1;
                          }
                          param11[param4] = var65Lifetime2;
                        } else {
                          if (128 <= var66Lifetime2) {
                            var63Lifetime2 = (var54Lifetime2 & 16711935) * var58Lifetime2 + (16711935 & var55Lifetime2) * var59Lifetime2;
                            var63Lifetime2 = var63Lifetime2 + (var61Lifetime2 * (var57Lifetime2 & 16711935) + (var56Lifetime2 & 16711935) * var60Lifetime2);
                            var64Lifetime2 = var59Lifetime2 * (var55Lifetime2 & 65280) + var58Lifetime2 * (var54Lifetime2 & 65280);
                            var64Lifetime2 = var64Lifetime2 + (var61Lifetime2 * (var57Lifetime2 & 65280) + (65280 & var56Lifetime2) * var60Lifetime2);
                            var65Lifetime2 = (65535 & var63Lifetime2) / var66Lifetime2 + ((var63Lifetime2 >>> 16) / var66Lifetime2 << 16) + (65280 & var64Lifetime2 / var66Lifetime2);
                            if (var65Lifetime2 == 0) {
                              var65Lifetime2 = 1;
                            }
                            param11[param4] = var65Lifetime2;
                          }
                        }
                        var50Lifetime2 = var50Lifetime2 + var22Lifetime1;
                        param4++;
                        var45Lifetime2++;
                        var51Lifetime2 = var51Lifetime2 + var23Lifetime1;
                        continue;
                      }
                    }
                    break;
                  }
                  param4 = param4 - var45Lifetime2;
                }
              }
              param4 = param4 + param0;
              var46Lifetime2++;
              param16 = param16 + var24Lifetime1;
              param7 = param7 - var21Lifetime1;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_277_0 = var17;
          stackIn_277_1 = new StringBuilder().append("lu.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_278_2 = "null";
          } else {
            stackIn_278_2 = "{...}";
          }
          stackIn_280_1 = ((StringBuilder) (Object) stackIn_277_1).append(stackIn_278_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_281_2 = "null";
          } else {
            stackIn_281_2 = "{...}";
          }
          stackIn_283_1 = ((StringBuilder) (Object) stackIn_280_1).append(stackIn_281_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_284_2 = "null";
          } else {
            stackIn_284_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_277_0), ((StringBuilder) (Object) stackIn_283_1).append(stackIn_284_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final void a(int param0, long param1) {
        if (param0 != 4096) {
          this.payload = (byte[]) null;
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

    final int a(int param0) {
        this.position = this.position + param0;
        return (this.payload[this.position - 3] << 16 & 16711680) - (-(this.payload[-2 + this.position] << 8 & 65280) - (255 & this.payload[this.position - 1]));
    }

    final void b(int param0, int param1) {
        if (param1 >= -110) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1, int param2, byte[] param3) {
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
          for (var5_int = param0; param0 + param2 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
          }
          if (param1 > -71) {
            PacketBuffer.a(7, 17, (byte) 45);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lu.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_f = null;
        if (param0 != -19) {
          PacketBuffer.d((byte) -30);
        }
    }

    private final void a(long param0, int param1) {
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
        if (param1 != 10847) {
          this.payload = (byte[]) null;
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = sd.a(param0, 5000);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        if (param1 <= 63) {
          return;
        }
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + BoardChange.a(param0.length(), -113, this.position, var4, this.payload, 0);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lu.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
          return (byte) -48;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
          if (param2 != 128) {
            this.b(false);
          }
          for (var5_int = param3; param3 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("lu.EA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, byte param1) {
        this.payload[-4 + this.position - param0] = (byte)(param0 >> 24);
        this.payload[this.position - (param0 + 3)] = (byte)(param0 >> 16);
        this.payload[this.position - param0 - 2] = (byte)(param0 >> 8);
        int var3 = -22 / ((-33 - param1) / 54);
        this.payload[-1 + (this.position - param0)] = (byte)param0;
    }

    final String i(int param0) {
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
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.position);
        if (var4 == param0) {
          return "";
        }
        return gt.a(var3, this.payload, (byte) 104, var4);
    }

    final int h(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 != 16711935) {
          this.b(96, (byte) 59);
        }
        if (var2 >= 128) {
          return -32768 + this.readUnsignedShort((byte) 120);
        }
        return this.readUnsignedByte(16711935);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "lu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
