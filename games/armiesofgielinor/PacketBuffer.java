/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] payload;
    int position;
    static QuickChatCommandDefinition field_l;
    static String field_r;
    static PlatformTaskService field_s;
    static String field_m;
    static String field_p;
    static byte[][][] field_k;
    static int field_n;

    final void a(int param0, String param1) {
        int var8 = 0;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 > -26) {
            return;
          }
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-63 + var9);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 + (var9 - 97));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-20 + var9);
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (10 == var8) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a((byte) 96, var3_long);
          this.a((byte) 112, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("vh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void writeLong40(boolean obfuscationGuard, long value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(value >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(value >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(value >> 16);
        if (!obfuscationGuard) {
          field_n = -23;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(value >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)value;
    }

    final void writeLong(long value, int obfuscationGuard) {
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
        if (obfuscationGuard != 38359632) {
          int[] var5 = (int[]) null;
          this.decryptXteaRange((int[]) null, -11, -67, -35);
        }
    }

    final void writeIntLengthPrefix(int obfuscationGuard, int length) {
        this.payload[-length + this.position - 4] = (byte)(length >> 24);
        this.payload[this.position - (length + 3)] = (byte)(length >> 16);
        this.payload[-length + this.position - 2] = (byte)(length >> 8);
        this.payload[obfuscationGuard - length + this.position] = (byte)length;
    }

    final void writeBytes(byte[] source, int sourceOffset, int length, int obfuscationGuard) {
        int var6 = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 122 % ((obfuscationGuard - 32) / 47);
          for (var6 = sourceOffset; length + sourceOffset > var6; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = source[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vh.OA(");
          if (source == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(sourceOffset).append(',').append(length).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void writeByte(int obfuscationGuard, int value) {
        if (obfuscationGuard != 1) {
          field_r = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)value;
    }

    final int readInt(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return -27;
        }
        this.position = this.position + 4;
        return (this.payload[this.position - 1] & 255) + ((255 & this.payload[this.position - 2]) << 8) + ((-16777216 & this.payload[-4 + this.position] << 24) + (this.payload[-3 + this.position] << 16 & 16711680));
    }

    final String readNullTerminatedString(int obfuscationGuard) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (obfuscationGuard != 1) {
          this.readUnsignedSmart(28);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = -1 + (this.position - var2);
        if (var3 != 0) {
          return BattlefieldTheme.decodeSingleByteText(var2, var3, -101, this.payload);
        }
        return "";
    }

    final String c(byte param0) {
        if (param0 >= -73) {
          return (String) null;
        }
        if (this.payload[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        return this.readNullTerminatedString(1);
    }

    final void encryptXtea(byte obfuscationGuard, int[] key) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int blockCount = 0;
        RuntimeException var3 = null;
        int blockIndex = 0;
        int leftWord = 0;
        int rightWord = 0;
        int sum = 0;
        int delta = 0;
        int roundsRemaining = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          blockCount = this.position / 8;
          this.position = 0;
          if (obfuscationGuard != 31) {
            return;
          }
          blockIndex = 0;
          while (true) {
            if (blockCount <= blockIndex) {
              return;
            }
            leftWord = this.readInt(1);
            rightWord = this.readInt(1);
            sum = 0;
            delta = -1640531527;
            roundsRemaining = 32;
            while (true) {
              incrementValue$0 = roundsRemaining;
              roundsRemaining--;
              if (incrementValue$0 > 0) {
                leftWord = leftWord + (rightWord + (rightWord << 4 ^ rightWord >>> 5) ^ key[3 & sum] + sum);
                sum = sum + delta;
                rightWord = rightWord + (sum + key[(sum & 8001) >>> 11] ^ leftWord + (leftWord >>> 5 ^ leftWord << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) -105, leftWord);
            this.writeInt((byte) -58, rightWord);
            blockIndex++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vh.IA(").append(obfuscationGuard).append(',');
          if (key == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int readSignedSmart(int obfuscationGuard) {
        if (obfuscationGuard <= 44) {
          field_n = -101;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return -49152 + this.readUnsignedShort((byte) -104);
        }
        return this.readUnsignedByte(0) - 64;
    }

    final int readUnsignedShort(byte obfuscationGuard) {
        if (obfuscationGuard != -104) {
          return 93;
        }
        this.position = this.position + 2;
        return ((255 & this.payload[this.position - 2]) << 8) + (this.payload[this.position - 1] & 255);
    }

    final void writeUnsignedSmart(boolean obfuscationGuard, int value) {
        if (!obfuscationGuard) {
          return;
        }
        if (value >= 0 &&
          128 > value) {
          this.writeByte(1, value);
          return;
        }
        if (0 <= value &&
          value < 32768) {
          this.writeShort(true, 32768 + value);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void l(int param0) {
        if (null != this.payload) {
          od.a(-30001, this.payload);
        }
        this.payload = null;
        if (param0 <= 99) {
          field_k = (byte[][][]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 >= param5) {
            return;
          }
          if (param4 <= 1 + param0) {
            return;
          }
          if (param0 + 5 < param4 &&
            param1 != param3) {
            var7_int = (param1 >> 1) + (param3 >> 1) + (param3 & param1 & 1);
            var8 = param0;
            var9 = param1;
            var10 = param3;
            for (var11 = param0; param4 > var11; var11++) {
              var12 = vt.field_m[var11];
              if (!param6) {
                stackIn_24_0 = EffectPresentation.field_h[var12];
              } else {
                stackIn_24_0 = NumericDateInputWidget.field_U[var12];
              }
              var13 = stackIn_24_0;
              if (var13 <= var7_int) {
                if (var10 < var13) {
                  var10 = var13;
                }
              } else {
                vt.field_m[var11] = vt.field_m[var8];
                incrementValue$0 = var8;
                var8++;
                vt.field_m[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            PacketBuffer.a(param0, param1, false, var9, var8, param5, param6);
            PacketBuffer.a(var8, var10, param2, param3, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = -1 + param4; var7_intLifetime1 > param0; var7_intLifetime1--) {
            for (var8Lifetime1 = param0; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = vt.field_m[var8Lifetime1];
              var10Lifetime1 = vt.field_m[1 + var8Lifetime1];
              if (BattlefieldTheme.a(param6, var10Lifetime1, var9Lifetime1, -27)) {
                vt.field_m[var8Lifetime1] = var10Lifetime1;
                vt.field_m[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7), "vh.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void i(byte param0) {
        FixInvisibleUnitsConsoleCommand.g(76);
        dh.d(-1);
        Spell.field_b = null;
        int var1 = -111 % ((-16 - param0) / 46);
        e.closeQuickChatMenu((byte) -117);
    }

    final byte readByte(byte obfuscationGuard) {
        int var2 = 120 % ((53 - obfuscationGuard) / 44);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final static RgbSprite a(int param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RgbSprite stackIn_5_0 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kp.decodeSpriteSheetFromArchive(false, param1, param2, param3)) {
            stackIn_2_0 = null;
            return (RgbSprite) (stackIn_2_0);
          }
          if (param0 == -1) {
            stackIn_7_0 = bj.e(12722);
            return stackIn_7_0;
          }
          stackIn_5_0 = (RgbSprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("vh.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if (param0 != 0) {
          return;
        }
        this.payload[-param1 + this.position - 2] = (byte)(param1 >> 8);
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
    }

    final long readLong(byte obfuscationGuard) {
        long var2 = 4294967295L & (long)this.readInt(1);
        long var4 = 4294967295L & (long)this.readInt(1);
        if (obfuscationGuard != -2) {
          return 69L;
        }
        return (var2 << 32) + var4;
    }

    final void decryptXteaRange(int[] key, int endOffset, int startOffset, int obfuscationGuard) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int savedPosition = 0;
        RuntimeException var5 = null;
        int blockCount = 0;
        int blockIndex = 0;
        int leftWord = 0;
        int rightWord = 0;
        int sum = 0;
        int delta = 0;
        int roundsRemaining = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          savedPosition = this.position;
          this.position = startOffset;
          blockCount = (endOffset - startOffset) / 8;
          blockIndex = 0;
          while (true) {
            if (blockCount <= blockIndex) {
              this.position = savedPosition;
              if (obfuscationGuard != -12366) {
                this.payload = (byte[]) null;
              }
              return;
            }
            leftWord = this.readInt(obfuscationGuard ^ -12365);
            rightWord = this.readInt(obfuscationGuard + 12367);
            sum = -957401312;
            delta = -1640531527;
            roundsRemaining = 32;
            while (true) {
              incrementValue$0 = roundsRemaining;
              roundsRemaining--;
              if (incrementValue$0 > 0) {
                rightWord = rightWord - (sum + key[-1948254205 & sum >>> 11] ^ (leftWord << 4 ^ leftWord >>> 5) + leftWord);
                sum = sum - delta;
                leftWord = leftWord - ((rightWord >>> 5 ^ rightWord << 4) + rightWord ^ sum + key[sum & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.writeInt((byte) -118, leftWord);
            this.writeInt((byte) -119, rightWord);
            blockIndex++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vh.S(");
          if (key == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(endOffset).append(',').append(startOffset).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void writeVarInt(int obfuscationGuard, int value) {
        if (obfuscationGuard != -49) {
          return;
        }
        if ((-128 & value) != 0) {
          if ((value & -16384) != 0) {
            if (0 != (-2097152 & value)) {
              if ((value & -268435456) != 0) {
                this.writeByte(1, value >>> 28 | 128);
              }
              this.writeByte(1, (value | 268669197) >>> 21);
            }
            this.writeByte(1, (2106399 | value) >>> 14);
          }
          this.writeByte(1, (value | 16422) >>> 7);
        }
        this.writeByte(1, 127 & value);
    }

    final int b(byte param0, int param1) {
        int var3 = ClientUiNode.a(this.position, this.payload, param1, -8779);
        this.writeInt((byte) -87, var3);
        if (param0 != -39) {
          this.c((byte) -110, 112);
        }
        return var3;
    }

    final void writeNullTerminatedString(String text, int obfuscationGuard) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = text.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (obfuscationGuard != 13851) {
            byte[] var4 = (byte[]) null;
            this.writeBytes((byte[]) null, -81, 60, -69);
          }
          var5 = (CharSequence) ((Object) text);
          this.position = this.position + GameplayController.a(this.payload, 0, var5, text.length(), this.position, (byte) 114);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vh.DA(" + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int readVarInt(int obfuscationGuard) {
        int continuationByteIndex = 0;
        int nextByte;
        int guardRemainder;
        int value;
        int unusedObfuscationControl;
        unusedObfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        guardRemainder = 106 % ((obfuscationGuard - 50) / 41);
        int firstByteIndex = this.position;
        this.position = this.position + 1;
        nextByte = this.payload[firstByteIndex];
        value = 0;
        while (nextByte < 0) {
          value = (nextByte & 127 | value) << 7;
          continuationByteIndex = this.position;
          this.position = this.position + 1;
          nextByte = this.payload[continuationByteIndex];
        }
        return nextByte | value;
    }

    final int readUnsignedByte(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          return -34;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void writeByteLengthPrefix(int length, int obfuscationGuard) {
        if (obfuscationGuard != 5930) {
          return;
        }
        this.payload[this.position - (length + 1)] = (byte)length;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
          if (param1 != 413740432) {
            field_m = (String) null;
          }
          var4 = (CharSequence) ((Object) param0);
          this.position = this.position + GameplayController.a(this.payload, 0, var4, param0.length(), this.position, (byte) 113);
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vh.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != 4215) {
          field_k = (byte[][][]) null;
        }
        this.position = this.position - 4;
        int var2 = ClientUiNode.a(this.position, this.payload, 0, -8779);
        int var3 = this.readInt(1);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final void c(byte param0, int param1) {
        if (param0 != 60) {
          this.writeUnsignedSmart(false, 84);
        }
        if (param1 < 64 &&
          param1 >= -64) {
          this.writeByte(1, param1 + 64);
          return;
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.writeShort(true, param1 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int readUnsignedMedium(byte obfuscationGuard) {
        if (obfuscationGuard != -13) {
          this.position = -28;
        }
        this.position = this.position + 3;
        return (this.payload[-3 + this.position] << 16 & 16711680) + ((this.payload[-2 + this.position] << 8 & 65280) + (this.payload[-1 + this.position] & 255));
    }

    final String readNullCircumfixedString(byte obfuscationGuard) {
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
        var3 = this.position;
        if (obfuscationGuard != 121) {
          return (String) null;
        }
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return BattlefieldTheme.decodeSingleByteText(var3, var4, obfuscationGuard - 231, this.payload);
        }
        return "";
    }

    final void encryptRsa(int obfuscationGuard, java.math.BigInteger exponent, java.math.BigInteger modulus) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          if (obfuscationGuard != -5247) {
            String var9 = (String) null;
            this.a(-2, (String) null);
          }
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.readBytes(0, var4_int, 0, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(exponent, modulus);
          var8 = var7.toByteArray();
          this.position = 0;
          this.writeShort(true, var8.length);
          this.writeBytes(var8, 0, var8.length, 115);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vh.TA(" + obfuscationGuard + ',' + (exponent != null ? "{...}" : "null") + ',' + (modulus != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int var4 = 65 / ((47 - param0) / 43);
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

    final int readLargeSmart(byte obfuscationGuard) {
        if (obfuscationGuard < 91) {
          return -51;
        }
        if (this.payload[this.position] >= 0) {
          return this.readUnsignedShort((byte) -104);
        }
        return 2147483647 & this.readInt(1);
    }

    final byte[] copyWrittenBytes(byte obfuscationGuard) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        byte[] var2 = new byte[this.position];
        int var3 = 0;
        if (obfuscationGuard >= -27) {
          this.readSignedSmart(97);
        }
        while (var3 < this.position) {
          var2[var3] = this.payload[var3];
          var3++;
        }
        return var2;
    }

    PacketBuffer(int param0) {
        this.position = 0;
        this.payload = od.a(param0, 50);
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.payload = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void readBytes(int obfuscationGuard, int length, int destinationOffset, byte[] destination) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 0) {
            this.writeIntLengthPrefix(74, 42);
          }
          for (var5_int = destinationOffset; var5_int < destinationOffset + length; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            destination[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vh.EA(").append(obfuscationGuard).append(',').append(length).append(',').append(destinationOffset).append(',');
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void writeInt(byte obfuscationGuard, int value) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(value >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(value >> 8);
        if (obfuscationGuard >= -46) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)value;
    }

    final void writeShort(boolean enabled, int value) {
        if (!enabled) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(value >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)value;
    }

    final int readUnsignedSmart(int obfuscationGuard) {
        int var2 = this.payload[this.position] & 255;
        if (obfuscationGuard != -23470) {
          return 108;
        }
        if (var2 >= 128) {
          return this.readUnsignedShort((byte) -104) - 32768;
        }
        return this.readUnsignedByte(0);
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 != 58) {
          return;
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)param0;
    }

    public static void f(int param0) {
        field_k = (byte[][][]) null;
        if (param0 <= 49) {
          field_m = (String) null;
        }
        field_l = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_m = null;
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        while (param0 > this.position) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        }
        var3 = 34 / ((19 - param1) / 60);
    }

    static {
        field_l = new QuickChatCommandDefinition(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
