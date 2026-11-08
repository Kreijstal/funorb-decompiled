/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] field_f;
    static int[] field_e;
    static MeshData[] field_m;
    static String field_j;
    int field_n;
    static Sprite[] field_h;
    static Sprite field_g;
    static int field_i;
    static String field_k;
    static boolean field_l;

    final void writeBytes(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          for (var5_int = param0; var5_int < param0 + param1; var5_int++) {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_f[fieldTemp$0] = param3[var5_int];
          }
          if (param2 != 1991220144) {
            field_j = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("iw.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String readCircumfixedString(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        var2 = this.field_f[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        if (param0 != 17) {
          this.readUnsignedSmart(68);
        }
        var3 = this.field_n;
        do {
          fieldTemp$1 = this.field_n;
          this.field_n = this.field_n + 1;
        } while (this.field_f[fieldTemp$1] != 0);
        var4 = this.field_n - (var3 + 1);
        if (var4 == 0) {
          return "";
        }
        return PainterStyle.decodeCp1252((byte) -123, var4, var3, this.field_f);
    }

    final void writeMedium(int param0, byte param1) {
        if (param1 <= 10) {
          return;
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$2] = (byte)param0;
    }

    final byte readByte(byte param0) {
        if (param0 > -45) {
          field_h = (Sprite[]) null;
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_f[fieldTemp$0];
    }

    final static void setAccountMenuMode(int param0) {
        IndexedSpriteState.setAccountMenuMode(38, param0);
    }

    final int readInt(int param0) {
        this.field_n = this.field_n + param0;
        return (this.field_f[-1 + this.field_n] & 255) + ((-16777216 & this.field_f[this.field_n - 4] << 24) + ((255 & this.field_f[-3 + this.field_n]) << 16)) + ((255 & this.field_f[-2 + this.field_n]) << 8);
    }

    final void writeCircumfixedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.field_n = this.field_n + CachedListingRow.encodeCp1252(param0.length(), var4, this.field_n, this.field_f, 0, 79);
          if (param1 >= -124) {
            field_i = 16;
          }
          fieldTemp$1 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "iw.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void backpatchIntLength(int param0, int param1) {
        this.field_f[-4 + (this.field_n - param0)] = (byte)(param0 >> 24);
        int var3 = -55 / ((71 - param1) / 33);
        this.field_f[this.field_n - param0 - 3] = (byte)(param0 >> 16);
        this.field_f[-2 + (-param0 + this.field_n)] = (byte)(param0 >> 8);
        this.field_f[this.field_n - (param0 + 1)] = (byte)param0;
    }

    final int readUnsignedShortOrInt(byte param0) {
        int var2 = 82 % ((55 - param0) / 41);
        if (0 <= this.field_f[this.field_n]) {
          return this.readUnsignedShort((byte) 81);
        }
        return 2147483647 & this.readInt(4);
    }

    final void padToPosition(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Kickabout.field_G;
        while (param1 > this.field_n) {
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
        }
        if (param0 <= 42) {
          this.readUnsignedShortOrInt((byte) 118);
        }
    }

    final int readUnsignedByte(byte param0) {
        if (param0 > -104) {
          byte[] var3 = (byte[]) null;
          this.readBytes((byte[]) null, 107, (byte) 79, -98);
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_f[fieldTemp$0] & 255;
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)param1;
        if (param0 < 101) {
          field_g = (Sprite) null;
        }
    }

    final void writeLong(long param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (param1 != -1781890008) {
          field_h = (Sprite[]) null;
        }
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$7] = (byte)(int)param0;
    }

    final void readBytes(byte[] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        var6 = Kickabout.field_G;
        try {
          if (param2 != -6) {
            var7 = (int[]) null;
            this.xteaDecryptRange(105, (int[]) null, false, -34);
          }
          for (var5_int = param1; var5_int < param3 + param1; var5_int++) {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            param0[var5_int] = this.field_f[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("iw.PA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)param1;
        if (param0 != -1207444472) {
          field_i = -106;
        }
    }

    final int readSignedMedium(int param0) {
        this.field_n = this.field_n + 3;
        int var2 = (255 & this.field_f[-1 + this.field_n]) + ((this.field_f[this.field_n - 2] << 8 & param0) + ((this.field_f[-3 + this.field_n] & 255) << 16));
        if (var2 > 8388607) {
          var2 = var2 - 16777216;
        }
        return var2;
    }

    final boolean verifyCrc32(int param0) {
        this.field_n = this.field_n - 4;
        int var2 = RotaryDialWidget.a(this.field_n, -109, this.field_f, param0);
        int var3 = this.readInt(4);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final void writeVarInt(int param0, int param1) {
        if (param1 != (param0 & -128)) {
          if ((-16384 & param0) != 0) {
            if ((-2097152 & param0) != 0) {
              if ((param0 & -268435456) != 0) {
                this.writeByte(param1 ^ 105, param0 >>> 28 | 128);
              }
              this.writeByte(104, 128 | param0 >>> 21);
            }
            this.writeByte(114, param0 >>> 14 | 128);
          }
          this.writeByte(param1 ^ 126, param0 >>> 7 | 128);
        }
        this.writeByte(121, param0 & 127);
    }

    final void backpatchShortLength(int param0, int param1) {
        this.field_f[-2 - param0 + this.field_n] = (byte)(param0 >> 8);
        if (param1 != 62) {
          field_e = (int[]) null;
        }
        this.field_f[this.field_n - (param0 + 1)] = (byte)param0;
    }

    final long readLong(byte param0) {
        long var2 = (long)this.readInt(4) & 4294967295L;
        if (param0 != -124) {
          return -101L;
        }
        long var4 = (long)this.readInt(param0 + 128) & 4294967295L;
        return var4 + (var2 << 32);
    }

    private final void writeLong56(byte param0, long param1) {
        if (param0 < 97) {
          this.writeSignedSmart(125, 122);
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(byte param0, long param1) {
        if (param0 < 2) {
          this.readCircumfixedString(-37);
        }
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$4] = (byte)(int)param1;
    }

    final int readUnsignedMedium(int param0) {
        this.field_n = this.field_n + 3;
        if (param0 > -82) {
          this.readSignedMedium(-58);
        }
        return (255 & this.field_f[-1 + this.field_n]) + ((65280 & this.field_f[this.field_n - 2] << 8) + (16711680 & this.field_f[-3 + this.field_n] << 16));
    }

    final String readNullableString(boolean param0) {
        if (this.field_f[this.field_n] == 0) {
          this.field_n = this.field_n + 1;
          return null;
        }
        if (!param0) {
          return (String) null;
        }
        return this.readString(-98);
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        int var4;
        var2 = this.field_n;
        var3 = -112 % ((param0 + 48) / 47);
        do {
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
        } while (0 != this.field_f[fieldTemp$0]);
        var4 = -1 + (this.field_n - var2);
        if (var4 == 0) {
          return "";
        }
        return PainterStyle.decodeCp1252((byte) -123, var4, var2, this.field_f);
    }

    final int readUnsignedShort(byte param0) {
        this.field_n = this.field_n + 2;
        if (param0 != 81) {
          field_m = (MeshData[]) null;
        }
        return (255 & this.field_f[-1 + this.field_n]) + (this.field_f[-2 + this.field_n] << 8 & 65280);
    }

    final void xteaDecryptRange(int param0, int[] param1, boolean param2, int param3) {
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
        var13 = Kickabout.field_G;
        try {
          var5_int = this.field_n;
          this.field_n = param3;
          var6 = (-param3 + param0) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (!param2) {
                this.readUnsignedShort((byte) 126);
              }
              this.field_n = var5_int;
              return;
            }
            var8 = this.readInt(4);
            var9 = this.readInt(4);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 + param1[1293942787 & var10 >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ param1[var10 & 3] + var10);
                continue;
              }
              break;
            }
            this.field_n = this.field_n - 8;
            this.writeInt(-52, var8);
            this.writeInt(-69, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("iw.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_j = null;
        field_e = null;
        field_g = null;
        field_k = null;
        field_m = null;
        if (param0 != 88) {
          LobbyPlayerRow var2 = (LobbyPlayerRow) null;
          PacketBuffer.a((byte) 23, (LobbyPlayerRow) null);
        }
    }

    final void backpatchByteLength(int param0, int param1) {
        if (param0 != 62) {
          field_h = (Sprite[]) null;
        }
        this.field_f[-param1 + (this.field_n - 1)] = (byte)param1;
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        var2 = -62 % ((param0 - 77) / 37);
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        var3 = this.field_f[fieldTemp$0];
        var4 = 0;
        while (0 > var3) {
          var4 = (var3 & 127 | var4) << 7;
          fieldTemp$1 = this.field_n;
          this.field_n = this.field_n + 1;
          var3 = this.field_f[fieldTemp$1];
        }
        return var4 | var3;
    }

    final static void pushSpriteRaster(int param0, Sprite param1) {
        try {
          int var2_int = 120 % ((param0 - 9) / 46);
          ClientUiOverlay.pushRasterState(-12974);
          SoftwareRasterizer.setRasterBuffer(param1.field_y, param1.field_o, param1.field_v);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "iw.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$1] = (byte)(param1 >> 16);
        if (param0 >= -28) {
          this.field_f = (byte[]) null;
        }
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_f[fieldTemp$3] = (byte)param1;
    }

    final void writeUnsignedSmart(int param0, int param1) {
        if (param1 >= 0 &&
          128 > param1) {
          this.writeByte(120, param1);
          return;
        }
        int var3 = -21 / ((param0 - 9) / 55);
        if (param1 >= 0 &&
          param1 < 32768) {
          this.writeShort(-1207444472, param1 + 32768);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readSignedSmart(int param0) {
        int var2 = 103 % ((param0 + 61) / 49);
        int var3 = 255 & this.field_f[this.field_n];
        if (var3 < 128) {
          return -64 + this.readUnsignedByte((byte) -113);
        }
        return this.readUnsignedShort((byte) 81) - 49152;
    }

    final void writeBase38Password(byte param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Kickabout.field_G;
        try {
          var5 = -44 % ((-30 - param0) / 39);
          var3_long = 0L;
          var6 = 0L;
          var8 = param1.length();
          for (var9 = 19; var9 >= 0; var9--) {
            var3_long = var3_long * 38L;
            if (var9 < var8) {
              var10 = param1.charAt(var9);
              if (65 <= var10 &&
                var10 <= 90) {
                var3_long = var3_long + (long)(var10 + 2 - 65);
              } else {
                if (var10 >= 97 &&
                  122 >= var10) {
                  var3_long = var3_long + (long)(2 + var10 - 97);
                } else {
                  if (var10 >= 48 &&
                    57 >= var10) {
                    var3_long = var3_long + (long)(-48 + var10 + 28);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var9 == 10) {
              var6 = var3_long;
              var3_long = 0L;
            }
          }
          this.writeLong56((byte) 108, var3_long);
          this.writeLong56((byte) 100, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("iw.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int appendCrc32(int param0, boolean param1) {
        if (param1) {
          this.writeMedium(86, (byte) 85);
        }
        int var3 = RotaryDialWidget.a(this.field_n, 117, this.field_f, param0);
        this.writeInt(-37, var3);
        return var3;
    }

    final long h(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var3;
        long var4;
        int var6;
        var6 = Kickabout.field_G;
        param1--;
        if (param1 >= 0 &&
          7 >= param1) {
          var3 = param1 * 8;
          var4 = 0L;
          if (param0 <= 101) {
            field_i = 9;
          }
          while (var3 >= 0) {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            var4 = var4 | ((long)this.field_f[fieldTemp$0] & 255L) << var3;
            var3 -= 8;
          }
          return var4;
        }
        throw new IllegalArgumentException();
    }

    PacketBuffer(int param0) {
        this.field_n = 0;
        this.field_f = ByteArrayPool.allocateBytes(param0, false);
    }

    final void writeString(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.field_n = this.field_n + CachedListingRow.encodeCp1252(param1.length(), var4, this.field_n, this.field_f, 0, 72);
          if (param0 != 14190) {
            this.field_n = 119;
          }
          fieldTemp$0 = this.field_n;
          this.field_n = this.field_n + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "iw.MA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, LobbyPlayerRow param1) {
        LobbyPlayerRow var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = Kickabout.field_G;
        try {
          param1.unlink((byte) -109);
          var3 = -54 / ((param0 + 29) / 55);
          var2 = (LobbyPlayerRow) (PasswordFieldPainter.field_B.first(24009));
          while (var2 != null) {
            if (var2.a(param1, (byte) -82)) {
              var2 = (LobbyPlayerRow) (PasswordFieldPainter.field_B.next(33));
              continue;
            }
            break;
          }
          if (var2 == null) {
            PasswordFieldPainter.field_B.addLast(param1, 3);
          } else {
            SocialListLayoutSupport.insertNodeBefore(var2, 16737894, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("iw.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void rsaEncrypt(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          if (param2 != 38) {
            field_g = (Sprite) null;
          }
          var4_int = this.field_n;
          this.field_n = 0;
          var5 = new byte[var4_int];
          this.readBytes(var5, 0, (byte) -6, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          this.field_n = 0;
          this.writeShort(-1207444472, var8.length);
          this.writeBytes(0, var8.length, 1991220144, var8);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "iw.IA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void xteaEncrypt(int[] param0, byte param1) {
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
        var10 = Kickabout.field_G;
        try {
          var3_int = this.field_n / 8;
          this.field_n = 0;
          var4 = 0;
          if (param1 != 53) {
            return;
          }
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt(4);
            var6 = this.readInt(4);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + (param0[(6790 & var7) >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.field_n = this.field_n - 8;
            this.writeInt(-84, var5);
            this.writeInt(-31, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("iw.CB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeSignedSmart(int param0, int param1) {
        int var3 = 98 / ((param0 + 10) / 35);
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(115, param1 + 64);
          return;
        }
        if (16384 > param1 &&
          param1 >= -16384) {
          this.writeShort(-1207444472, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readUnsignedSmart(int param0) {
        int var2 = 255 & this.field_f[this.field_n];
        if (param0 != -32768) {
          return -25;
        }
        if (128 > var2) {
          return this.readUnsignedByte((byte) -105);
        }
        return -32768 + this.readUnsignedShort((byte) 81);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.field_f = param0;
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "iw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new MeshData[5];
        field_e = new int[73];
        field_j = "This player is already in an auction";
        field_k = "Camera Attached";
        field_l = true;
        field_e[36] = 36;
        field_e[25] = 25;
        field_e[11] = 11;
        field_e[63] = 63;
        field_e[67] = 67;
        field_e[29] = 29;
        field_e[34] = 34;
        field_e[51] = 51;
        field_e[65] = 65;
        field_e[59] = 59;
        field_e[30] = 30;
        field_e[12] = 12;
        field_e[66] = 66;
        field_e[47] = 47;
        field_e[56] = 56;
        field_e[1] = 1;
        field_e[46] = 46;
        field_e[52] = 52;
        field_e[13] = 13;
        field_e[28] = 28;
        field_e[61] = 61;
        field_e[26] = 26;
        field_e[14] = 14;
        field_e[44] = 44;
        field_e[37] = 37;
        field_e[10] = 10;
        field_e[40] = 40;
        field_e[60] = 60;
        field_e[45] = 45;
        field_e[38] = 38;
        field_e[3] = 3;
        field_e[16] = 16;
        field_e[31] = 31;
        field_e[64] = 64;
        field_e[72] = 72;
        field_e[9] = 9;
        field_e[48] = 48;
        field_e[24] = 24;
        field_e[33] = 33;
        field_e[70] = 70;
        field_e[22] = 22;
        field_e[27] = 27;
        field_e[6] = 6;
        field_e[4] = 4;
        field_e[41] = 41;
        field_e[35] = 35;
        field_e[42] = 42;
        field_e[50] = 50;
        field_e[18] = 18;
        field_e[69] = 69;
        field_e[15] = 15;
        field_e[43] = 43;
        field_e[53] = 53;
        field_e[49] = 49;
        field_e[58] = 58;
        field_e[8] = 8;
        field_e[55] = 55;
        field_e[5] = 5;
        field_e[23] = 23;
        field_e[0] = 0;
        field_e[57] = 57;
        field_e[68] = 68;
        field_e[54] = 54;
        field_e[20] = 20;
        field_e[32] = 32;
        field_e[17] = 17;
        field_e[2] = 2;
        field_e[21] = 21;
        field_e[71] = 71;
        field_e[39] = 39;
        field_e[62] = 62;
        field_e[19] = 19;
        field_e[7] = 7;
    }
}
