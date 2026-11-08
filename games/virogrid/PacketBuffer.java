/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static int field_m;
    static int[] field_i;
    static String field_j;
    int position;
    byte[] payload;
    static Js5Archive field_k;
    static IndexedSprite[] field_h;

    final String readOptionalString(int param0) {
        if (param0 < 50) {
          String var3 = (String) null;
          this.writeZeroPrefixedString((String) null, (byte) 65);
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(-120);
    }

    final void writeBytes(byte[] param0, int param1, int param2, byte param3) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = -77 % ((param3 + 49) / 55);
          for (var6 = param2; param2 + param1 > var6; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("jc.V(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int readLargeSmart(boolean param0) {
        if (!param0) {
          this.payload = (byte[]) null;
        }
        if (this.payload[this.position] < 0) {
          return this.readInt((byte) 119) & 2147483647;
        }
        return this.readUnsignedShort((byte) -49);
    }

    final void writeZeroPrefixedString(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          int var4 = 119 % ((param1 - 57) / 47);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + DualLinkDequeIterator.encodeWindowsCodePageText(param0.length(), this.position, -125, 0, this.payload, var5);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jc.FA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void encryptRsa(java.math.BigInteger param0, java.math.BigInteger param1, byte param2) {
        byte[] var8 = null;
        int var4_int = this.position;
        this.position = 0;
        byte[] var5 = new byte[var4_int];
        this.readBytes(0, var4_int, true, var5);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        if (param2 < 83) {
          return;
        }
        try {
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort((byte) -57, var8.length);
          this.writeBytes(var8, var8.length, 0, (byte) 26);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jc.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void writeString(String param0, byte param1) {
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
          this.position = this.position + DualLinkDequeIterator.encodeWindowsCodePageText(param0.length(), this.position, -122, 0, this.payload, var4);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
          if (param1 > -34) {
            this.position = 100;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.UA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 > -116) {
          this.writeInt(-7, (byte) 122);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = this.position - var2 - 1;
        if (var3 == 0) {
          return "";
        }
        return TextDecodeHelpers.decodeWindowsCodePageText(var3, (byte) -94, var2, this.payload);
    }

    final void decryptXteaRange(int param0, int[] param1, int param2, int param3) {
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
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param3;
          var6 = (-param3 + param0) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              if (param2 != 9843) {
                return;
              }
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) 102);
            var9 = this.readInt((byte) 122);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param1[(6784 & var10) >>> 11] + var10);
                var10 = var10 - var11;
                var8 = var8 - (param1[var10 & 3] + var10 ^ var9 + (var9 >>> 5 ^ var9 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, (byte) -42);
            this.writeInt(var9, (byte) -42);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("jc.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void writeLong(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int var4 = -110 % ((20 - param0) / 34);
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
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param1;
    }

    final void readBytes(int param0, int param1, boolean param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          for (var5_int = param0; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
          }
          if (!param2) {
            field_m = 124;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jc.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int readInt(byte param0) {
        if (param0 <= 90) {
          String var3 = (String) null;
          this.writeZeroPrefixedString((String) null, (byte) 58);
        }
        this.position = this.position + 4;
        return ((this.payload[this.position - 2] & 255) << 8) + (((this.payload[-3 + this.position] & 255) << 16) + ((this.payload[this.position - 4] << 24 & -16777216) + (this.payload[this.position - 1] & 255)));
    }

    private final void writeLong56(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 != 65280) {
          return;
        }
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

    final byte readByte(byte param0) {
        int var2 = 49 / ((-17 - param0) / 51);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void padToPosition(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        if (param1 != 0) {
          this.position = 10;
        }
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final void backpatchByteLength(int param0, int param1) {
        this.payload[param1 + (-param0 + this.position)] = (byte)param0;
    }

    final void backpatchShortLength(int param0, int param1) {
        this.payload[-2 - param0 + this.position] = (byte)(param0 >> 8);
        this.payload[-param0 + this.position - 1] = (byte)param0;
        if (param1 != -3991) {
          field_j = (String) null;
        }
    }

    final int readUnsignedShort(byte param0) {
        int var2 = 48 / ((-5 - param0) / 38);
        this.position = this.position + 2;
        return (65280 & this.payload[this.position - 2] << 8) + (this.payload[this.position - 1] & 255);
    }

    final int readMedium(int param0) {
        if (param0 != -25842) {
          this.backpatchShortLength(-62, -66);
        }
        this.position = this.position + 3;
        return ((this.payload[this.position - 3] & 255) << 16) + (65280 & this.payload[-2 + this.position] << 8) + (255 & this.payload[-1 + this.position]);
    }

    final int readSignedSmart(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 < 45) {
          field_h = (IndexedSprite[]) null;
        }
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -80) - 49152;
        }
        return -64 + this.readUnsignedByte(11132);
    }

    final boolean verifyChecksum(int param0) {
        this.position = this.position - 4;
        if (param0 != -29449) {
          this.writeShort((byte) 19, -57);
        }
        int var2 = ChecksumHelpers.computeCrc32(this.position, 0, this.payload, -26459);
        int var3 = this.readInt((byte) 104);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final void writeMedium(int param0, boolean param1) {
        if (param1) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final long readLong(byte param0) {
        if (param0 != -60) {
          this.writeMedium(69, true);
        }
        long var2 = (long)this.readInt((byte) 127) & 4294967295L;
        long var4 = 4294967295L & (long)this.readInt((byte) 120);
        return var4 + (var2 << 32);
    }

    final void writeBase38Name(String param0, byte param1) {
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
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 < 40) {
            field_m = -8;
          }
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 - 63);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 + var9 - 97);
                } else {
                  if (var9 >= 48 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(var9 + 28 - 48);
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
          this.writeLong56(65280, var3_long);
          this.writeLong56(65280, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("jc.AA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = ByteArrayPool.acquireByteArray(false, param0);
    }

    final int writeCrc32(byte param0, int param1) {
        if (param0 != -111) {
          this.writeLong40(-93L, -50);
        }
        int var3 = ChecksumHelpers.computeCrc32(this.position, param1, this.payload, -26459);
        this.writeInt(var3, (byte) -42);
        return var3;
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_i = null;
        field_k = null;
        if (param0 != 110) {
          field_h = (IndexedSprite[]) null;
        }
        field_j = null;
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
        if (param1 != -42) {
          this.payload = (byte[]) null;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
    }

    final static boolean isLocalPlayerName(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            PacketBuffer.releaseStatics((byte) -127);
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = MidiNote.field_n.equals(DisplayNameHelpers.normalizeDisplayName(var3, param1));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jc.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeShort(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int var3 = -102 / ((param0 + 1) / 56);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = param0;
        while (0 > var2) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final String readZeroPrefixedString(int param0) {
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
        if (param0 != 15070) {
          this.position = -81;
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.position);
        if (var4 != 0) {
          return TextDecodeHelpers.decodeWindowsCodePageText(var4, (byte) -126, var3, this.payload);
        }
        return "";
    }

    final void writeLong40(long param0, int param1) {
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
        if (param1 != 65280) {
          this.readUnsignedSmart(true);
        }
    }

    final static long encodeBase37(CharSequence param0, byte param1) {
        int var5 = 0;
        long var2_long = 0L;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_3_0 = 0L;
        long stackIn_24_0 = 0L;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 >= -103) {
            stackIn_3_0 = -11L;
            return stackIn_3_0;
          }
          var2_long = 0L;
          var4 = param0.length();
          for (var5 = 0; var5 < var4; var5++) {
            var2_long = var2_long * 37L;
            var6 = param0.charAt(var5);
            if (65 <= var6 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(var6 + 1 - 65);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 - (-var6 + 97));
            } else {
              if (var6 >= 48 &&
                57 >= var6) {
                var2_long = var2_long + (long)(var6 + 27 - 48);
              }
            }
            if (var2_long < 177917621779460413L) {
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (0L != var2_long) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_24_0 = var2_long;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("jc.CA(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readUnsignedSmart(boolean param0) {
        if (param0) {
          int[] var3 = (int[]) null;
          this.decryptXteaRange(57, (int[]) null, 95, 88);
        }
        int var2 = 255 & this.payload[this.position];
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -84) - 32768;
        }
        return this.readUnsignedByte(11132);
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
        int var3 = -47 % ((param1 + 6) / 59);
    }

    final void backpatchIntLength(int param0, int param1) {
        this.payload[-4 + (-param1 + this.position)] = (byte)(param1 >> 24);
        this.payload[-param1 + (this.position - 3)] = (byte)(param1 >> 16);
        this.payload[-2 + (this.position - param1)] = (byte)(param1 >> 8);
        if (param0 < 16) {
          this.writeLong40(17L, 99);
        }
        this.payload[this.position - param1 - 1] = (byte)param1;
    }

    final void encryptXtea(int param0, int[] param1) {
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
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          var4 = 0;
          if (param0 != 32768) {
            return;
          }
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt((byte) 113);
            var6 = this.readInt((byte) 103);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ var7 + param1[(7492 & var7) >>> 11]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var5, (byte) -42);
            this.writeInt(var6, (byte) -42);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jc.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeVarInt(int param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((param1 & -16384) != 0) {
            if (0 != (-2097152 & param1)) {
              if ((param1 & -268435456) != 0) {
                this.writeByte(128 | param1 >>> 28, 111);
              }
              this.writeByte((param1 | 269426657) >>> 21, 60);
            }
            this.writeByte((param1 | 2101247) >>> 14, 77);
          }
          this.writeByte(128 | param1 >>> 7, 108);
        }
        this.writeByte(param1 & 127, param0 ^ 37462360);
        if (param0 != -37462290) {
          field_h = (IndexedSprite[]) null;
        }
    }

    final void writeSignedSmart(int param0, byte param1) {
        int var3 = 126 / ((param1 - 15) / 36);
        if (param0 < 64 &&
          param0 >= -64) {
          this.writeByte(64 + param0, -74);
          return;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.writeShort((byte) 127, param0 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readUnsignedByte(int param0) {
        if (param0 != 11132) {
          byte[] var3 = (byte[]) null;
          this.writeBytes((byte[]) null, -80, -57, (byte) 68);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
    }

    final void writeSmart(int param0, int param1) {
        if (param0 >= 0 &&
          128 > param0) {
          this.writeByte(param0, 103);
          return;
        }
        if (param0 >= 0 &&
          param0 < 32768) {
          this.writeShort((byte) -99, param0 + 32768);
          return;
        }
        if (param1 != 30408) {
          byte[] var4 = (byte[]) null;
          this.readBytes(87, 92, false, (byte[]) null);
        }
        throw new IllegalArgumentException();
    }

    static {
        field_m = 5;
        field_j = "Please log in as a subscribing member to access this feature.";
        field_i = new int[256];
    }
}
