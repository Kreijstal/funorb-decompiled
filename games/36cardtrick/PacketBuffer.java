/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] payload;
    static RgbSprite field_k;
    static int field_j;
    int position;
    static boolean field_h;

    final void backpatchByteLength(int param0, int param1) {
        this.payload[-1 + (this.position - param0)] = (byte)param0;
        if (param1 == 8049) {
          return;
        }
        this.payload = (byte[]) null;
    }

    final int readUnsignedMedium(boolean param0) {
        if (!param0) {
          this.backpatchByteLength(35, -38);
          this.position = this.position + 3;
          return ((255 & this.payload[-2 + this.position]) << 8) + ((this.payload[-3 + this.position] << 16 & 16711680) + (255 & this.payload[this.position - 1]));
        }
        this.position = this.position + 3;
        return ((255 & this.payload[-2 + this.position]) << 8) + ((this.payload[-3 + this.position] << 16 & 16711680) + (255 & this.payload[this.position - 1]));
    }

    final byte readByte(boolean param0) {
        int fieldTemp$0 = 0;
        if (!param0) {
          this.writeByte(-119, -24);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return this.payload[fieldTemp$0];
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$1];
    }

    private final void writeLong56(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int var4 = -33 / ((param1 + 31) / 52);
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

    final void decryptXteaRange(int param0, int param1, int param2, int[] param3) {
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
        int[] var14 = null;
        var13 = Main.field_T;
        try {
          var5_int = this.position;
          this.position = param0;
          if (param2 > -107) {
            var14 = (int[]) null;
            this.encryptXtea((int[]) null, 32);
          }
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) 126);
            var9 = this.readInt((byte) 126);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[343932931 & var10 >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (param3[var10 & 3] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(-246, var8);
            this.writeInt(-246, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void writeLong(long param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (param1 != 98) {
          return;
        }
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
          this.readBytes(param2 + 15893, var5, 0, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(var8.length, 26040);
          if (param2 != -15792) {
            field_k = (RgbSprite) null;
          }
          this.writeBytes(var8.length, 0, var8, (byte) -113);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        h.a(param0, (byte) 52, "");
        if (param1 < 4) {
          return;
        }
        try {
          wh.a(param0, 63);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String readPrefixedString(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = 10 / ((33 - param0) / 53);
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var4 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var5 = -var4 + this.position - 1;
        if (var5 != 0) {
          return bd.a(255, var4, this.payload, var5);
        }
        return "";
    }

    final void backpatchShortLength(int param0, int param1) {
        this.payload[-param0 + (this.position - 2)] = (byte)(param0 >> 8);
        this.payload[-1 - param0 + this.position] = (byte)param0;
        if (param1 == -27308) {
          return;
        }
        String var4 = (String) null;
        this.writePrefixedString(-105, (String) null);
    }

    final int appendCrc32(int param0, byte param1) {
        int var3 = ml.computeCrc32(this.payload, param0, this.position, param1 ^ 12014);
        this.writeInt(-246, var3);
        if (param1 != 5) {
          field_k = (RgbSprite) null;
          return var3;
        }
        return var3;
    }

    final void writePrefixedString(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != 744825352) {
            this.readPrefixedString(80);
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + hi.a(param1.length(), 0, this.payload, var4, this.position, false);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(RawPcmStream param0, int param1) {
        try {
          if (param1 != 13427) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            PacketBuffer.a((java.applet.Applet) null, (byte) -39);
          }
          AccountCreationResultPanel.field_tb.a(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void writeMedium(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
        if (param1 == 60) {
          return;
        }
        field_k = (RgbSprite) null;
    }

    final int readUnsignedShortOrInt(boolean param0) {
        if (param0) {
          return 99;
        }
        if (0 <= this.payload[this.position]) {
          return this.readUnsignedShort((byte) 72);
        }
        return 2147483647 & this.readInt((byte) 126);
    }

    final void writeBase38String(String param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          var3_long = 0L;
          if (param1 != 15045) {
            field_h = false;
          }
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-97 + (var9 + 2));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(28 + var9 - 48);
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
          this.writeLong56(var3_long, 87);
          this.writeLong56(var5, -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("pb.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final int readUnsignedShort(byte param0) {
        this.position = this.position + 2;
        if (param0 != 72) {
          field_k = (RgbSprite) null;
          return ((this.payload[-2 + this.position] & 255) << 8) + (this.payload[-1 + this.position] & 255);
        }
        return ((this.payload[-2 + this.position] & 255) << 8) + (this.payload[-1 + this.position] & 255);
    }

    final int readUnsignedByte(int param0) {
        int var2 = -93 / ((-40 - param0) / 54);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final long readLong(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var2Lifetime1;
        long var4Lifetime1;
        if (!param0) {
          int[] var6 = (int[]) null;
          this.encryptXtea((int[]) null, -115);
          var2 = (long)this.readInt((byte) 125) & 4294967295L;
          var4 = (long)this.readInt((byte) 125) & 4294967295L;
          return var4 + (var2 << 32);
        }
        var2Lifetime1 = (long)this.readInt((byte) 125) & 4294967295L;
        var4Lifetime1 = (long)this.readInt((byte) 125) & 4294967295L;
        return var4Lifetime1 + (var2Lifetime1 << 32);
    }

    final void readBytes(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          if (param0 <= 1) {
            this.readNullableString((byte) 15);
          }
          for (var5_int = param2; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pb.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
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
        if (param1 > 94) {
          return;
        }
        this.readNullableString((byte) 48);
    }

    final boolean verifyCrc32(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != -1) {
          field_h = false;
          this.position = this.position - 4;
          var2 = ml.computeCrc32(this.payload, 0, this.position, 12011);
          var3 = this.readInt((byte) 124);
          if (var2 == var3) {
            return true;
          }
          return false;
        }
        this.position = this.position - 4;
        var2Lifetime1 = ml.computeCrc32(this.payload, 0, this.position, 12011);
        var3Lifetime1 = this.readInt((byte) 124);
        if (var2Lifetime1 == var3Lifetime1) {
          return true;
        }
        return false;
    }

    final int readUnsignedSmart(int param0) {
        int var2 = 255 & this.payload[this.position];
        if (param0 != 0) {
          this.readString(false);
          if (var2 >= 128) {
            return this.readUnsignedShort((byte) 72) - 32768;
          }
          return this.readUnsignedByte(-107);
        }
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) 72) - 32768;
        }
        return this.readUnsignedByte(-107);
    }

    final void writeString(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != 19235) {
            this.writeLong40(-127L, -81);
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + hi.a(param0.length(), 0, this.payload, var4, this.position, false);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void writeBytes(int param0, int param1, byte[] param2, byte param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          var5_int = param1;
          if (param3 > -73) {
            this.writeLong56(51L, -75);
          }
          while (var5_int < param0 + param1) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param2[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pb.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void resetStaticState(byte param0) {
        if (param0 < 56) {
          field_h = true;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != -124) {
                field_h = false;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(fh.a(param1, var2, -1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pb.U(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String readNullableString(byte param0) {
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (param0 != 29) {
          return (String) null;
        }
        return this.readString(false);
    }

    final void writeByte(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 != -9469) {
          field_h = true;
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)param1;
          return;
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
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
        var10 = Main.field_T;
        try {
          var3_int = this.position / param1;
          this.position = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt((byte) 124);
            var6 = this.readInt((byte) 126);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$2 = var9;
              var9--;
              if (0 < incrementValue$2) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + ((var5 >>> 5 ^ var5 << 4) + var5 ^ param0[(var7 & 7068) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(param1 ^ -254, var5);
            this.writeInt(param1 - 254, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pb.CA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String readString(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        String var4;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 + (this.position - var2);
        if (0 == var3) {
          return "";
        }
        if (!param0) {
          return bd.a(255, var2, this.payload, var3);
        }
        var4 = (String) null;
        this.writeString((String) null, 84);
        return bd.a(255, var2, this.payload, var3);
    }

    final int readSignedSmart(byte param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 != 59) {
          this.readSignedSmart((byte) 40);
          if (128 <= var2) {
            return this.readUnsignedShort((byte) 72) - 49152;
          }
          return -64 + this.readUnsignedByte(80);
        }
        if (128 <= var2) {
          return this.readUnsignedShort((byte) 72) - 49152;
        }
        return -64 + this.readUnsignedByte(80);
    }

    final void writeShort(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param0;
        if (param1 == 26040) {
          return;
        }
        String var4 = (String) null;
        this.writeBase38String((String) null, 9);
    }

    final int readInt(byte param0) {
        if (param0 <= 123) {
          return 14;
        }
        this.position = this.position + 4;
        return (16711680 & this.payload[this.position - 3] << 16) + (((this.payload[this.position - 4] & 255) << 24) + ((255 & this.payload[this.position - 2]) << 8)) + (255 & this.payload[this.position - 1]);
    }

    final void writeInt(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 != -246) {
          field_k = (RgbSprite) null;
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)param1;
          return;
        }
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)param1;
    }

    PacketBuffer(int param0) {
        this.payload = nh.a(-61, param0);
        this.position = 0;
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "pb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void padZerosTo(int param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var4;
        var4 = Main.field_T;
        if (param0 == 1442653008) {
          while (this.position < param1) {
            fieldTemp$1 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$1] = (byte) 0;
          }
        } else {
          this.readUnsignedShortOrInt(false);
          while (this.position < param1) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = (byte) 0;
          }
        }
    }

    static {
        field_h = false;
    }
}
