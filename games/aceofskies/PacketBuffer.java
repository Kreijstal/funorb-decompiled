/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] payload;
    static long field_e;
    static int field_h;
    static int[] field_k;
    static String[] field_i;
    static RendererBitmapFont field_j;
    int position;

    final void f(int param0, int param1) {
        this.payload[-4 + this.position - param0] = (byte)(param0 >> 24);
        if (param1 != 28494) {
          return;
        }
        this.payload[-3 + (-param0 + this.position)] = (byte)(param0 >> 16);
        this.payload[-param0 + this.position - 2] = (byte)(param0 >> 8);
        this.payload[this.position + (-param0 - 1)] = (byte)param0;
    }

    final void patchByteLength(int payloadLength, byte obfuscationGuard) {
        this.payload[-payloadLength + this.position - 1] = (byte)payloadLength;
        if (obfuscationGuard <= 57) {
          field_j = (RendererBitmapFont) null;
        }
    }

    final static byte[] a(boolean param0, Object param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        af var5 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var3_int = -6 / ((param2 + 4) / 41);
          if (!(param1 instanceof byte[])) {
            if (!(param1 instanceof af)) {
              throw new IllegalArgumentException();
            }
            var5 = (af) (param1);
            stackIn_12_0 = var5.b(-126);
            return stackIn_12_0;
          }
          var4 = (byte[]) (param1);
          if (!param0) {
            stackIn_9_0 = var4;
            return stackIn_9_0;
          }
          stackIn_7_0 = fg.a(var4, (byte) 107);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("rb.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int readUnsignedShort(byte obfuscationGuard) {
        this.position = this.position + 2;
        if (obfuscationGuard != 0) {
          this.e(25);
        }
        return (65280 & this.payload[this.position - 2] << 8) + (this.payload[this.position - 1] & 255);
    }

    private final void a(int param0, long param1) {
        if (param0 != 1874191960) {
          this.writeShort(-53, 18);
        }
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

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        if (param0 > -37) {
          return;
        }
        try {
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + fs.a(false, param1.length(), var4, this.payload, this.position, 0);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rb.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void writeShort(int value, int obfuscationGuard) {
        if (obfuscationGuard != 23385) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
    }

    final void a(boolean param0, int param1) {
        if (param0) {
          field_h = -82;
        }
        this.payload[-2 + (this.position - param1)] = (byte)(param1 >> 8);
        this.payload[-param1 + (this.position - 1)] = (byte)param1;
    }

    final String e(byte param0) {
        if (param0 > -90) {
          field_h = 72;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readNullTerminatedText(-17883);
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(0, 7186, var4_int, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param1);
          var8 = var7.toByteArray();
          this.position = param0;
          this.writeShort(var8.length, 23385);
          this.a(true, var8.length, 0, var8);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rb.IA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int appendCrc32(int startPosition, int obfuscationGuard) {
        int var3 = cl.a(startPosition, this.payload, this.position, (byte) -105);
        this.writeInt((byte) 67, var3);
        if (obfuscationGuard <= 10) {
          field_k = (int[]) null;
        }
        return var3;
    }

    final int a(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 0;
        if (param0 < 103) {
          field_k = (int[]) null;
        }
        while (0 > var2) {
          var3 = (127 & var2 | var3) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int readSignedSmart(byte obfuscationGuard) {
        int var2 = this.payload[this.position] & 255;
        if (obfuscationGuard < 70) {
          this.readUnsignedSmart(-48);
        }
        if (var2 < 128) {
          return this.readUnsignedByte(-126) - 64;
        }
        return this.readUnsignedShort((byte) 0) - 49152;
    }

    final long readLong(byte obfuscationGuard) {
        long var2 = 4294967295L & (long)this.readInt((byte) 110);
        int var4 = 45 % ((10 - obfuscationGuard) / 42);
        long var5 = (long)this.readInt((byte) 109) & 4294967295L;
        return (var2 << 32) + var5;
    }

    final int readUnsignedSmart(int obfuscationGuard) {
        int var2 = this.payload[this.position] & 255;
        if (obfuscationGuard < ~var2) {
          return this.readUnsignedByte(-88);
        }
        return this.readUnsignedShort((byte) 0) - 32768;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
          field_k = (int[]) null;
        }
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(-1336879960, param1 + 64);
          return;
        }
        if (16384 > param1 &&
          param1 >= -16384) {
          this.writeShort(49152 + param1, 23385);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(int[] param0, int param1) {
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
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param1 != 2097272037) {
            field_e = -7L;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.readInt((byte) 115);
            var6 = this.readInt((byte) 124);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param0[var7 & 3] + var7);
                var7 = var7 + var8;
                var6 = var6 + (param0[(7186 & var7) >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) 81, var5);
            this.writeInt((byte) 110, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("rb.M(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, int param2, int param3) {
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
        var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param0;
          var6 = (-param0 + param3) / 8;
          if (param2 != 1515088773) {
            return;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) 115);
            var9 = this.readInt((byte) 111);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param1[var10 >>> 11 & -1054867453] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param1[3 & var10] ^ var9 + (var9 >>> 5 ^ var9 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) 56, var8);
            this.writeInt((byte) 106, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("rb.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte readByte(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          field_e = 104L;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final boolean e(int param0) {
        if (param0 != 6103) {
          this.a((byte) -90, 19L);
        }
        this.position = this.position - 4;
        int var2 = cl.a(0, this.payload, this.position, (byte) -105);
        int var3 = this.readInt((byte) 111);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final int readUnsignedByte(int obfuscationGuard) {
        int var2 = 62 % ((obfuscationGuard + 8) / 35);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
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
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 7186) {
            return;
          }
          for (var5_int = param0; var5_int < param0 + param2; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rb.OA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String d(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var2 = -128 % ((param0 - 12) / 44);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var3 = this.payload[fieldTemp$0];
        if (var3 != 0) {
          throw new IllegalStateException("");
        }
        var4 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var5 = this.position - var4 - 1;
        if (0 == var5) {
          return "";
        }
        return hf.a(-111, var5, var4, this.payload);
    }

    final void b(int param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = (long)param0;
          var7 = param1.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (2 + var9));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-97 + (2 + var9));
                } else {
                  if (48 <= var9 &&
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
          this.a(param0 + 1874191960, var3_long);
          this.a(1874191960, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("rb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          for (var5_int = param2; var5_int < param2 + param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rb.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, Object param1, rk param2) {
        int var3_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (null == param2.field_j) {
            return;
          }
          var4 = -115 / ((param0 + 59) / 49);
          for (var3_int = 0; 50 > var3_int; var3_int++) {
            if (null != param2.field_j.peekEvent()) {
              IntrusiveNode.a(1L, false);
              continue;
            }
            break;
          }
          try {
            if (param1 != null) {
              param2.field_j.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("rb.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void writeLong(byte obfuscationGuard, long value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 56);
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
        if (obfuscationGuard != -102) {
          this.a(-122, 55L);
        }
    }

    PacketBuffer(int capacity) {
        this.payload = kd.a(capacity, (byte) 120);
        this.position = 0;
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + fs.a(param0, param1.length(), var4, this.payload, this.position, 0);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String readNullTerminatedText(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        rk var4;
        if (obfuscationGuard != -17883) {
          var4 = (rk) null;
          PacketBuffer.a(-24, (Object) null, (rk) null);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = this.position - var2 - 1;
        if (var3 == 0) {
          return "";
        }
        return hf.a(-124, var3, var2, this.payload);
    }

    final static void i(int param0) {
        oi.a(4, 20665);
        int var1 = -84 % ((param0 - 3) / 35);
    }

    final void d(int param0, int param1) {
        if ((-128 & param1) != 0) {
          if ((-16384 & param1) != 0) {
            if (0 != (param1 & -2097152)) {
              if (0 != (param1 & -268435456)) {
                this.writeByte(-1336879960, 128 | param1 >>> 28);
              }
              this.writeByte(-1336879960, (269036666 | param1) >>> 21);
            }
            this.writeByte(-1336879960, (2098139 | param1) >>> 14);
          }
          this.writeByte(-1336879960, (16467 | param1) >>> 7);
        }
        this.writeByte(-1336879960, param1 & 127);
        int var3 = 103 / ((param0 - 34) / 41);
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 >= -48) {
          this.writeShort(-103, -118);
        }
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

    final void writeByte(int obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)value;
        if (obfuscationGuard != -1336879960) {
          this.position = 58;
        }
    }

    final int c(byte param0) {
        if (param0 <= 120) {
          return -93;
        }
        if (0 <= this.payload[this.position]) {
          return this.readUnsignedShort((byte) 0);
        }
        return 2147483647 & this.readInt((byte) 112);
    }

    final int readInt(byte obfuscationGuard) {
        this.position = this.position + 4;
        if (obfuscationGuard <= 106) {
          return 125;
        }
        return (255 & this.payload[-1 + this.position]) + ((65280 & this.payload[-2 + this.position] << 8) + (16711680 & this.payload[this.position - 3] << 16)) + (-16777216 & this.payload[this.position - 4] << 24);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        java.math.BigInteger var5;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        while (this.position < param0) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        if (param1 <= 57) {
          var5 = (java.math.BigInteger) null;
          this.a(-106, (java.math.BigInteger) null, (java.math.BigInteger) null);
        }
    }

    PacketBuffer(byte[] payload) {
        try {
          this.position = 0;
          this.payload = payload;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (payload != null ? "{...}" : "null") + ')');
        }
    }

    final void writeInt(byte obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 16);
        if (obfuscationGuard <= 19) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(value >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)value;
    }

    final int readUnsignedMedium(byte obfuscationGuard) {
        this.position = this.position + 3;
        if (obfuscationGuard >= -66) {
          this.appendCrc32(127, -15);
        }
        return (255 & this.payload[this.position - 1]) + (((255 & this.payload[-2 + this.position]) << 8) + (this.payload[-3 + this.position] << 16 & 16711680));
    }

    final void writeMedium(int obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 8);
        if (obfuscationGuard != 0) {
          this.writeShort(69, -13);
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)value;
    }

    static {
        field_i = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_h = -1;
    }
}
