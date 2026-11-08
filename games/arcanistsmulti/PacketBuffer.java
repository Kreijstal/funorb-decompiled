/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] payload;
    static int field_m;
    static String field_h;
    static String field_k;
    int position;
    static String field_i;
    static Sprite field_l;

    final static SceneWidget f(byte param0) {
        if (param0 != -125) {
          field_i = (String) null;
        }
        return ja.d((byte) 90);
    }

    final int readUnsignedSmart(int param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 <= var2) {
          return -32768 + this.readUnsignedShort(-98);
        }
        return this.readUnsignedByte((byte) -119);
    }

    public static void releaseStatics(boolean param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (!param0) {
          field_i = (String) null;
        }
        field_k = null;
    }

    final int readUnsignedShortOrInt(byte param0) {
        if (param0 != -29) {
          this.readOptionalString(-102);
        }
        if (this.payload[this.position] < 0) {
          return this.readInt(param0 ^ 10669) & 2147483647;
        }
        return this.readUnsignedShort(-98);
    }

    final void writeInt(int value, byte obfuscationGuard) {
        if (obfuscationGuard != -101) {
          int[] var4 = (int[]) null;
          this.xteaEncrypt(41, (int[]) null);
        }
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
    }

    final void writeUnsignedSmart(int param0, byte param1) {
        if (param0 >= 0 &&
          param0 < 128) {
          this.writeByte(param0, (byte) -62);
          return;
        }
        if (param1 >= -95) {
          this.writeUnsignedSmart(-48, (byte) -23);
        }
        if (param0 >= 0 &&
          32768 > param0) {
          this.writeShort(32768 + param0, (byte) -100);
          return;
        }
        throw new IllegalArgumentException();
    }

    private final void writeSixByteValue(long param0, byte param1) {
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
        if (param1 != 12) {
          this.writeVarInt(21, -6);
        }
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

    final void readBytes(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 < 37) {
            this.appendCrc32(true, 13);
          }
          for (var5_int = param1; param1 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final long readLong(int obfuscationGuard) {
        if (obfuscationGuard != -943038560) {
          field_i = (String) null;
        }
        long var2 = 4294967295L & (long)this.readInt(-10674);
        long var4 = 4294967295L & (long)this.readInt(-10674);
        return (var2 << 32) + var4;
    }

    final int readSignedSmart(int param0) {
        if (param0 != -1) {
          field_h = (String) null;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 < 128) {
          return -64 + this.readUnsignedByte((byte) -99);
        }
        return -49152 + this.readUnsignedShort(-98);
    }

    final void xteaDecryptRange(int[] param0, int param1, int param2, int param3) {
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
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param1;
          var6 = (param2 - param1) / 8;
          if (param3 < 122) {
            field_m = -95;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(-10674);
            var9 = this.readInt(-10674);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param0[-469762045 & var10 >>> 11] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + param0[var10 & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, (byte) -101);
            this.writeInt(var9, (byte) -101);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wk.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void xteaEncrypt(int param0, int[] param1) {
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
        String var11 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              if (param0 < 75) {
                var11 = (String) null;
                this.writeBase38Name((byte) -5, (String) null);
              }
              return;
            }
            var5 = this.readInt(-10674);
            var6 = this.readInt(-10674);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (param1[3 & var7] + var7 ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param1[(var7 & 7037) >>> 11]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, (byte) -101);
            this.writeInt(var6, (byte) -101);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        IntrusiveDeque var1 = null;
        int var2 = 0;
        ml var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = rk.field_O.g((byte) 34);
          if (param0 != 13805) {
            PacketBuffer.releaseStatics(false);
          }
          var2 = 0;
          var3 = (ml) (var1.first(12623));
          while (var3 != null) {
            if (var3.field_jb == 11) {
              var2++;
            }
            var3 = (ml) (var1.next(0));
          }
          if (3 <= var2) {
            rk.field_O.a(0, 0, 0, 104, 6);
          } else {
            rk.field_O.a(0, 0, -1, param0 - 13767, 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref), "wk.AB(" + param0 + ')');
        }
    }

    final void writeLong(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 <= 34) {
          return;
        }
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

    final String readOptionalString(int obfuscationGuard) {
        if (0 == this.payload[this.position]) {
          this.position = this.position + 1;
          return null;
        }
        int var2 = 76 % ((58 - obfuscationGuard) / 32);
        return this.readString(-1);
    }

    final void writeMedium(byte obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 16);
        if (obfuscationGuard != -120) {
          field_h = (String) null;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)value;
    }

    final void writeVarInt(int obfuscationGuard, int value) {
        if ((value & -128) != 0) {
          if ((-16384 & value) != 0) {
            if ((-2097152 & value) != 0) {
              if (0 != (-268435456 & value)) {
                this.writeByte(value >>> 28 | 128, (byte) -12);
              }
              this.writeByte((value | 270515212) >>> 21, (byte) -103);
            }
            this.writeByte((2106311 | value) >>> 14, (byte) -67);
          }
          this.writeByte((value | 16401) >>> 7, (byte) -43);
        }
        if (obfuscationGuard != 10888) {
          return;
        }
        this.writeByte(value & 127, (byte) -44);
    }

    final void writeShortLengthAtMark(int length, int obfuscationGuard) {
        this.payload[this.position - length - 2] = (byte)(length >> 8);
        if (obfuscationGuard != -19571) {
          this.writeUnsignedSmart(44, (byte) -106);
        }
        this.payload[-length + (this.position - 1)] = (byte)length;
    }

    final void writeBytes(byte[] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var5_int = param1; var5_int < param1 + param3; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var5_int];
          }
          if (param2 != -86) {
            this.writeInt(114, (byte) 115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.WA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readUnsignedMedium(int obfuscationGuard) {
        if (obfuscationGuard != 11609) {
          PacketBuffer.releaseStatics(true);
        }
        this.position = this.position + 3;
        return (this.payload[-1 + this.position] & 255) + ((this.payload[this.position - 3] & 255) << 16) + ((this.payload[-2 + this.position] & 255) << 8);
    }

    final String readVersionedString(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        String var5;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (param0 != -32461) {
          var5 = (String) null;
          this.writeString((String) null, 112);
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var4 = this.position - (var3 + 1);
        if (var4 == 0) {
          return "";
        }
        return PatchEnvelopeSet.decodeCp1252String(var3, var4, (byte) -126, this.payload);
    }

    final String readString(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -var2 + (this.position - 1);
        if (obfuscationGuard == ~var3) {
          return "";
        }
        return PatchEnvelopeSet.decodeCp1252String(var2, var3, (byte) -124, this.payload);
    }

    final void writeBase38Name(byte param0, String param1) {
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
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 != 7) {
            this.appendCrc32(true, 75);
          }
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 - 63);
              } else if (var9 >= 97 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(-48 + var9 + 28);
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
          this.writeSixByteValue(var3_long, (byte) 12);
          this.writeSixByteValue(var5, (byte) 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("wk.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void k(int param0) {
        da.field_d = new AccountRegistrationPanel();
        g.field_e.setContent((byte) -92, (UiComponent) (da.field_d));
        if (param0 != 970210916) {
          field_i = (String) null;
        }
    }

    final int readUnsignedShort(int obfuscationGuard) {
        if (obfuscationGuard != -98) {
          return 125;
        }
        this.position = this.position + 2;
        return ((255 & this.payload[-2 + this.position]) << 8) + (255 & this.payload[this.position - 1]);
    }

    final int readVarInt(int obfuscationGuard) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        if (obfuscationGuard < 10) {
          this.position = -57;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void writeIntLengthAtMark(int obfuscationGuard, int length) {
        this.payload[this.position - (length + 4)] = (byte)(length >> 24);
        this.payload[-3 - length + this.position] = (byte)(length >> 16);
        this.payload[-2 + this.position - length] = (byte)(length >> 8);
        if (obfuscationGuard != 10089) {
          field_h = (String) null;
        }
        this.payload[-length + (this.position - 1)] = (byte)length;
    }

    final void writeFiveByteValue(byte obfuscationGuard, long value) {
        if (obfuscationGuard > -115) {
          this.readUnsignedMedium(-89);
        }
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
    }

    final void writeString(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != 23333) {
            String var4 = (String) null;
            this.writeVersionedString((String) null, (byte) 74);
          }
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + KeyboardInputHandler.a(0, this.payload, this.position, (byte) 89, var5, param0.length());
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wk.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void writeVersionedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        if (param1 >= -80) {
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
          this.position = this.position + KeyboardInputHandler.a(0, this.payload, this.position, (byte) 89, var4, param0.length());
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wk.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int readInt(int obfuscationGuard) {
        if (obfuscationGuard != -10674) {
          this.readUnsignedShortOrInt((byte) -7);
        }
        this.position = this.position + 4;
        return ((255 & this.payload[-2 + this.position]) << 8) + ((this.payload[this.position - 4] & 255) << 24) + (this.payload[this.position - 3] << 16 & 16711680) + (this.payload[-1 + this.position] & 255);
    }

    final int appendCrc32(boolean param0, int param1) {
        if (!param0) {
          return -101;
        }
        int var3 = db.crc32(this.position, false, this.payload, param1);
        this.writeInt(var3, (byte) -101);
        return var3;
    }

    final int readSignedShort(int obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard != 0) {
          field_i = (String) null;
        }
        int var2 = (this.payload[-1 + this.position] & 255) + (65280 & this.payload[-2 + this.position] << 8);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          da.measureCaptionWidths((byte) -101);
          int var2 = 122 % ((param0 + 21) / 48);
          for (var1_int = 0; var1_int < 17; var1_int++) {
            ArchiveProvider.field_f[var1_int] = new lc(var1_int);
          }
          mn.field_r = 13;
          CheckboxPainter.field_g = 13;
          qn.setTargetFrameRate(16, 50);
          sm.a(-107, 50);
          if (!lc.a((byte) 112)) {
            ce.field_i = tj.a(4, -21402);
            ci.field_d = AlternateUsernameCredentials.a(6, false);
          }
          Checkbox.a(2);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wk.FB(" + param0 + ')');
        }
    }

    final void padTo(int endPosition, byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = -8 % ((40 - obfuscationGuard) / 37);
        while (this.position < endPosition) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final int readUnsignedByte(byte obfuscationGuard) {
        int var2 = 69 / ((obfuscationGuard + 28) / 58);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = bb.a(param0, 56);
    }

    final void writeByte(int value, byte obfuscationGuard) {
        if (obfuscationGuard >= -2) {
          this.padTo(51, (byte) -125);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)value;
    }

    final void rsaEncrypt(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes((byte) 81, 0, var5, var4_int);
          var6 = new java.math.BigInteger(var5);
          if (param1 <= 71) {
            this.position = -16;
          }
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, (byte) -62);
          this.writeBytes(var8, 0, (byte) -86, var8.length);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wk.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeShort(int value, byte obfuscationGuard) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
        if (obfuscationGuard > -53) {
          PacketBuffer.d((byte) 112);
        }
    }

    final byte readByte(int obfuscationGuard) {
        if (obfuscationGuard != 6) {
          return (byte) 103;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeByteLengthAtMark(int length, byte obfuscationGuard) {
        this.payload[-length + (this.position - 1)] = (byte)length;
        if (obfuscationGuard != 43) {
          this.writeInt(120, (byte) 58);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        co.field_e[MouseInputHandler.field_b] = param2;
        ki.field_r[MouseInputHandler.field_b] = MouseInputHandler.field_b;
        nf.field_z[MouseInputHandler.field_b] = param4;
        if (!(ao.field_g <= param4)) {
          AlternateUsernameCredentials.field_m = param4;
        }
        if (param4 > tm.field_g) {
          qa.field_m = param4;
        }
        ConditionalTextValue.field_e[MouseInputHandler.field_b] = param1;
        tj.field_u[MouseInputHandler.field_b] = param5;
        PatchEnvelopeSet.field_o[MouseInputHandler.field_b] = param3;
        int var6 = param3 + param5 + param1;
        int var7 = ~var6 != param0 ? param1 * 1000 / var6 : 0;
        lm.field_i[MouseInputHandler.field_b] = var7;
        if (AlternateUsernameCredentials.field_m > var7) {
          AlternateUsernameCredentials.field_m = var7;
        }
        MouseInputHandler.field_b = MouseInputHandler.field_b + 1;
        if (!(var7 <= qa.field_m)) {
          qa.field_m = var7;
        }
    }

    final boolean verifyCrc32(boolean param0) {
        if (!param0) {
          field_k = (String) null;
        }
        this.position = this.position - 4;
        int var2 = db.crc32(this.position, !param0 ? true : false, this.payload, 0);
        int var3 = this.readInt(-10674);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    static {
        field_m = 0;
        field_h = "MOST USELESS - ";
        field_k = "This is a hidden Achievement. The requirements and rewards for it will be shown once it has been achieved.";
        field_i = "Name is available";
    }
}
