/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    static AccountRequestState field_m;
    static boolean field_g;
    int position;
    static String field_h;
    byte[] payload;
    static FullscreenFocusCanvas field_k;
    static int field_f;
    static IntrusiveDeque field_l;

    final void writeByte(int param0, int param1) {
        if (param1 > -3) {
          field_m = (AccountRequestState) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param0;
    }

    final int readUnsignedByte(byte param0) {
        if (param0 != 90) {
          String var3 = (String) null;
          this.writeString((String) null, -65);
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$0];
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
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = -102 % ((param1 - 53) / 53);
          var3_int = this.position / 8;
          this.position = 0;
          var5 = 0;
          while (true) {
            if (var5 >= var3_int) {
              return;
            }
            var6 = this.readInt(0);
            var7 = this.readInt(0);
            var8 = 0;
            var9 = -1640531527;
            var10 = 32;
            while (true) {
              incrementValue$2 = var10;
              var10--;
              if (0 < incrementValue$2) {
                var6 = var6 + ((var7 >>> 5 ^ var7 << 4) + var7 ^ param0[3 & var8] + var8);
                var8 = var8 + var9;
                var7 = var7 + ((var6 << 4 ^ var6 >>> 5) + var6 ^ param0[1648361475 & var8 >>> 11] + var8);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var6, -1);
            this.writeInt(var7, -1);
            var5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mg.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void writeMedium(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 <= 100) {
          this.verifyCrc32(47);
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    final int readUnsignedMedium(byte param0) {
        this.position = this.position + 3;
        if (param0 != -30) {
          String var3 = (String) null;
          this.writePrefixedString(false, (String) null);
        }
        return ((this.payload[-3 + this.position] & 255) << 16) + ((this.payload[-2 + this.position] << 8 & 65280) + (255 & this.payload[-1 + this.position]));
    }

    final void writeLong(long param0, int param1) {
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
        if (param1 != -16943) {
          field_k = (FullscreenFocusCanvas) null;
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

    public static void clearDeclaredStaticReferences(int param0) {
        field_k = null;
        if (param0 != 10) {
          PacketBuffer.clearDeclaredStaticReferences(-9);
        }
        field_l = null;
        field_h = null;
        field_m = null;
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
        if (param0 < 77) {
          this.writeSignedSmart(-19, -48);
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$1] != 0);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return GrowableIntArray.decodeCp1252String(var4, var3, 0, this.payload);
        }
        return "";
    }

    final void writeBytes(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -11) {
            return;
          }
          for (var5_int = param0; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String readNullableString(int param0) {
        if (param0 == ~this.payload[this.position]) {
          this.position = this.position + 1;
          return null;
        }
        return this.readString(param0 ^ -3);
    }

    final void backpatchShortLength(int param0, int param1) {
        this.payload[param1 + (-param0 + this.position)] = (byte)(param0 >> 8);
        this.payload[this.position - (param0 + 1)] = (byte)param0;
    }

    final int readUnsignedSmart(int param0) {
        if (param0 <= 118) {
          return 9;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return -32768 + this.readUnsignedShort(98203176);
        }
        return this.readUnsignedByte((byte) 90);
    }

    final static void d(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = nk.field_q;
        synchronized (var1) {
          of.field_G = db.field_f;
          nl.field_d = nl.field_d + 1;
          ua.field_a = bl.field_g;
          if (param0 >= -13) {
            PacketBuffer.a(-118, (byte) -31);
          }
          DiskCacheWorker.field_d = ic.field_g;
          kd.field_d = GameAppletShell.field_m;
          GameAppletShell.field_m = false;
          gi.field_e = SectorCacheStore.field_c;
          AccountCreationResultPanel.field_fb = vg.field_p;
          bg.field_c = id.field_b;
          SectorCacheStore.field_c = 0;
          lg.field_a = sd.field_c;
        }
    }

    final int readVarInt(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var3 = param0;
        while (0 > var2) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var3 | var2;
    }

    final static int a(int param0, byte param1) {
        int var2;
        if (param1 > -19) {
          return -63;
        }
        var2 = param0;
        if (param0 == 11) {
          var2 = 10;
        } else {
          if (param0 == 7 &&
            ok.a(0, false)) {
            var2 = 11;
          }
        }
        return var2;
    }

    final void backpatchIntLength(int param0, int param1) {
        if (param1 != 1) {
          this.readUnsignedShortOrInt(true);
        }
        this.payload[-4 + this.position - param0] = (byte)(param0 >> 24);
        this.payload[-3 + (-param0 + this.position)] = (byte)(param0 >> 16);
        this.payload[-param0 + (this.position - 2)] = (byte)(param0 >> 8);
        this.payload[-1 + this.position - param0] = (byte)param0;
    }

    final void writePrefixedString(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0) {
            field_g = false;
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + ue.encodeCp1252Subsequence(param1.length(), var4, (byte) -86, 0, this.payload, this.position);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int readSignedSmart(boolean param0) {
        if (!param0) {
          return -10;
        }
        int var2 = this.payload[this.position] & 255;
        if (128 <= var2) {
          return -49152 + this.readUnsignedShort(98203176);
        }
        return -64 + this.readUnsignedByte((byte) 90);
    }

    final void readBytes(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = param2;
          if (param0 < 90) {
            return;
          }
          while (var5_int < param2 + param3) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param1[var5_int] = this.payload[fieldTemp$0];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mg.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte readByte(int param0) {
        if (param0 != -20398) {
          this.position = -110;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final void padZerosTo(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -115) {
          return;
        }
        while (this.position < param1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
    }

    final void writeString(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != -6528) {
            this.payload = (byte[]) null;
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + ue.encodeCp1252Subsequence(param0.length(), var4, (byte) -86, 0, this.payload, this.position);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mg.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long readLong(byte param0) {
        long var2 = (long)this.readInt(0) & 4294967295L;
        if (param0 != -89) {
          this.backpatchShortLength(61, -62);
        }
        long var4 = 4294967295L & (long)this.readInt(0);
        return var4 + (var2 << 32);
    }

    final String readString(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        if (param0 != 2) {
          this.appendCrc32(-29, -98);
        }
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.payload[fieldTemp$0] != 0);
        var3 = -1 - var2 + this.position;
        if (var3 == 0) {
          return "";
        }
        return GrowableIntArray.decodeCp1252String(var3, var2, param0 - 2, this.payload);
    }

    final void writeBase38String(byte param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var7 = -105 % ((-7 - param0) / 62);
          var3_long = 0L;
          var5 = 0L;
          var8 = param1.length();
          for (var9 = 19; var9 >= 0; var9--) {
            var3_long = var3_long * 38L;
            if (var9 < var8) {
              var10 = param1.charAt(var9);
              if (var10 >= 65 &&
                90 >= var10) {
                var3_long = var3_long + (long)(2 + var10 - 65);
              } else {
                if (var10 >= 97 &&
                  122 >= var10) {
                  var3_long = var3_long + (long)(var10 + 2 - 97);
                } else {
                  if (48 <= var10 &&
                    57 >= var10) {
                    var3_long = var3_long + (long)(-48 + (28 + var10));
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var9 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.writeLong56(-3357, var3_long);
          this.writeLong56(-3357, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("mg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int readUnsignedShort(int param0) {
        this.position = this.position + 2;
        if (param0 != 98203176) {
          field_g = true;
        }
        return (this.payload[this.position - 1] & 255) + (this.payload[-2 + this.position] << 8 & 65280);
    }

    final void decryptXteaRange(int param0, int param1, boolean param2, int[] param3) {
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
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param0;
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (param2) {
                this.payload = (byte[]) null;
              }
              this.position = var5_int;
              return;
            }
            var8 = this.readInt(0);
            var9 = this.readInt(0);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[(6167 & var10) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt(var8, -1);
            this.writeInt(var9, -1);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
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
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != -3357) {
          this.writeShort((byte) 14, -76);
        }
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)param1;
    }

    final void writeShort(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
        if (param0 != -60) {
          this.writeLong56(-11, 63L);
        }
    }

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
        if (param1 != -1) {
          byte[] var4 = (byte[]) null;
          this.readBytes((byte) -60, (byte[]) null, -13, 28);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param0;
    }

    final void backpatchByteLength(byte param0, int param1) {
        this.payload[-1 + this.position - param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int appendCrc32(int param0, int param1) {
        if (param0 != -18951) {
          return 41;
        }
        int var3 = sd.computeCrc32(param1, this.payload, this.position, 0);
        this.writeInt(var3, param0 + 18950);
        return var3;
    }

    final boolean verifyCrc32(int param0) {
        this.position = this.position - 4;
        int var2 = sd.computeCrc32(0, this.payload, this.position, 0);
        int var3 = this.readInt(0);
        if (var3 == var2) {
          return true;
        }
        if (param0 != 9982) {
          return false;
        }
        return false;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = ByteArrayPoolSupport.acquireByteArray(param0, (byte) 121);
    }

    final int readUnsignedShortOrInt(boolean param0) {
        if (!param0) {
          byte[] var3 = (byte[]) null;
          this.readBytes((byte) -88, (byte[]) null, -94, -42);
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort(98203176);
        }
        return this.readInt(0) & 2147483647;
    }

    final void writeSignedSmart(int param0, int param1) {
        if (param0 != -1) {
          this.backpatchByteLength((byte) 106, -63);
        }
        if (param1 < 64 &&
          -64 <= param1) {
          this.writeByte(64 + param1, param0 - 102);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.writeShort((byte) -60, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void writeVarInt(byte param0, int param1) {
        if (param0 > -31) {
          return;
        }
        if ((param1 & -128) != 0) {
          if ((param1 & -16384) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.writeByte(128 | param1 >>> 28, -102);
              }
              this.writeByte(param1 >>> 21 | 128, -4);
            }
            this.writeByte(128 | param1 >>> 14, -106);
          }
          this.writeByte(128 | param1 >>> 7, -90);
        }
        this.writeByte(param1 & 127, -70);
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
          this.readBytes((byte) 91, var5, 0, var4_int);
          if (param2 != 27551) {
            this.backpatchShortLength(59, 73);
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort((byte) -60, var8.length);
          this.writeBytes(0, var8.length, (byte) -11, var8);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mg.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.payload = param0;
          this.position = 0;
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int readInt(int param0) {
        this.position = this.position + 4;
        if (param0 != 0) {
          this.payload = (byte[]) null;
        }
        return ((this.payload[this.position - 2] & 255) << 8) + ((255 & this.payload[-3 + this.position]) << 16) + (((255 & this.payload[this.position - 4]) << 24) + (this.payload[-1 + this.position] & 255));
    }

    final void writeLong40(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 < 99) {
          return;
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

    static {
        field_h = "Awesomo";
        field_m = new AccountRequestState();
        field_f = 64;
        field_l = new IntrusiveDeque();
    }
}
