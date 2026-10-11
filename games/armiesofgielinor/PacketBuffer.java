/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    byte[] payload;
    int position;
    static me field_l;
    static String field_r;
    static hd field_s;
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
          throw ig.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (!param0) {
          field_n = -23;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$4] = (byte)(int)param1;
    }

    final void a(long param0, int param1) {
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
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$7] = (byte)(int)param0;
        if (param1 != 38359632) {
          int[] var5 = (int[]) null;
          this.a((int[]) null, -11, -67, -35);
        }
    }

    final void d(int param0, int param1) {
        this.payload[-param1 + this.position - 4] = (byte)(param1 >> 24);
        this.payload[this.position - (param1 + 3)] = (byte)(param1 >> 16);
        this.payload[-param1 + this.position - 2] = (byte)(param1 >> 8);
        this.payload[param0 - param1 + this.position] = (byte)param1;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
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
          var5_int = 122 % ((param3 - 32) / 47);
          for (var6 = param1; param2 + param1 > var6; var6++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.payload[fieldTemp$0] = param0[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vh.OA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (param0 != 1) {
          field_r = (String) null;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)param1;
    }

    final int i(int param0) {
        if (param0 != 1) {
          return -27;
        }
        this.position = this.position + 4;
        return (this.payload[this.position - 1] & 255) + ((255 & this.payload[this.position - 2]) << 8) + ((-16777216 & this.payload[-4 + this.position] << 24) + (this.payload[-3 + this.position] << 16 & 16711680));
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 != 1) {
          this.e(28);
        }
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$0]);
        var3 = -1 + (this.position - var2);
        if (var3 != 0) {
          return co.a(var2, var3, -101, this.payload);
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
        return this.g(1);
    }

    final void a(byte param0, int[] param1) {
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
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param0 != 31) {
            return;
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.i(1);
            var6 = this.i(1);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[(var7 & 8001) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a((byte) -105, var5);
            this.a((byte) -58, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vh.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 <= 44) {
          field_n = -101;
        }
        int var2 = this.payload[this.position] & 255;
        if (var2 >= 128) {
          return -49152 + this.e((byte) -104);
        }
        return this.k(0) - 64;
    }

    final int e(byte param0) {
        if (param0 != -104) {
          return 93;
        }
        this.position = this.position + 2;
        return ((255 & this.payload[this.position - 2]) << 8) + (this.payload[this.position - 1] & 255);
    }

    final void a(boolean param0, int param1) {
        if (!param0) {
          return;
        }
        if (param1 >= 0 &&
          128 > param1) {
          this.b(1, param1);
          return;
        }
        if (0 <= param1 &&
          param1 < 32768) {
          this.b(true, 32768 + param1);
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
                stackIn_24_0 = no.field_U[var12];
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
              if (co.a(param6, var10Lifetime1, var9Lifetime1, -27)) {
                vt.field_m[var8Lifetime1] = var10Lifetime1;
                vt.field_m[var8Lifetime1 + 1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "vh.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void i(byte param0) {
        ot.g(76);
        dh.d(-1);
        Spell.field_b = null;
        int var1 = -111 % ((-16 - param0) / 46);
        e.a((byte) -117);
    }

    final byte a(byte param0) {
        int var2 = 120 % ((53 - param0) / 44);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0];
    }

    final static RgbSprite a(int param0, int param1, kl param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RgbSprite stackIn_5_0 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kp.a(false, param1, param2, param3)) {
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
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        if (param0 != 0) {
          return;
        }
        this.payload[-param1 + this.position - 2] = (byte)(param1 >> 8);
        this.payload[-1 + (-param1 + this.position)] = (byte)param1;
    }

    final long j(byte param0) {
        long var2 = 4294967295L & (long)this.i(1);
        long var4 = 4294967295L & (long)this.i(1);
        if (param0 != -2) {
          return 69L;
        }
        return (var2 << 32) + var4;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
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
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = this.position;
          this.position = param2;
          var6 = (param1 - param2) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              if (param3 != -12366) {
                this.payload = (byte[]) null;
              }
              return;
            }
            var8 = this.i(param3 ^ -12365);
            var9 = this.i(param3 + 12367);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param0[-1948254205 & var10 >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param0[var10 & 3]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.a((byte) -118, var8);
            this.a((byte) -119, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("vh.S(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        if (param0 != -49) {
          return;
        }
        if ((-128 & param1) != 0) {
          if ((param1 & -16384) != 0) {
            if (0 != (-2097152 & param1)) {
              if ((param1 & -268435456) != 0) {
                this.b(1, param1 >>> 28 | 128);
              }
              this.b(1, (param1 | 268669197) >>> 21);
            }
            this.b(1, (2106399 | param1) >>> 14);
          }
          this.b(1, (param1 | 16422) >>> 7);
        }
        this.b(1, 127 & param1);
    }

    final int b(byte param0, int param1) {
        int var3 = im.a(this.position, this.payload, param1, -8779);
        this.a((byte) -87, var3);
        if (param0 != -39) {
          this.c((byte) -110, 112);
        }
        return var3;
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (param1 != 13851) {
            byte[] var4 = (byte[]) null;
            this.a((byte[]) null, -81, 60, -69);
          }
          var5 = (CharSequence) ((Object) param0);
          this.position = this.position + GameplayController.a(this.payload, 0, var5, param0.length(), this.position, (byte) 114);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "vh.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = 106 % ((param0 - 50) / 41);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.payload[fieldTemp$0];
        var4 = 0;
        while (var2 < 0) {
          var4 = (var2 & 127 | var4) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var2 = this.payload[fieldTemp$1];
        }
        return var2 | var4;
    }

    final int k(int param0) {
        if (param0 != 0) {
          return -34;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.payload[fieldTemp$0] & 255;
    }

    final void e(int param0, int param1) {
        if (param1 != 5930) {
          return;
        }
        this.payload[this.position - (param0 + 1)] = (byte)param0;
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
          throw ig.a((Throwable) ((Object) runtimeException), "vh.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != 4215) {
          field_k = (byte[][][]) null;
        }
        this.position = this.position - 4;
        int var2 = im.a(this.position, this.payload, 0, -8779);
        int var3 = this.i(1);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final void c(byte param0, int param1) {
        if (param0 != 60) {
          this.a(false, 84);
        }
        if (param1 < 64 &&
          param1 >= -64) {
          this.b(1, param1 + 64);
          return;
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.b(true, param1 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int d(byte param0) {
        if (param0 != -13) {
          this.position = -28;
        }
        this.position = this.position + 3;
        return (this.payload[-3 + this.position] << 16 & 16711680) + ((this.payload[-2 + this.position] << 8 & 65280) + (this.payload[-1 + this.position] & 255));
    }

    final String h(byte param0) {
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
        if (param0 != 121) {
          return (String) null;
        }
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (0 != this.payload[fieldTemp$1]);
        var4 = -1 + this.position - var3;
        if (var4 != 0) {
          return co.a(var3, var4, param0 - 231, this.payload);
        }
        return "";
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          if (param0 != -5247) {
            String var9 = (String) null;
            this.a(-2, (String) null);
          }
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(0, var4_int, 0, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param2);
          var8 = var7.toByteArray();
          this.position = 0;
          this.b(true, var8.length);
          this.a(var8, 0, var8.length, 115);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "vh.TA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
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

    final int f(byte param0) {
        if (param0 < 91) {
          return -51;
        }
        if (this.payload[this.position] >= 0) {
          return this.e((byte) -104);
        }
        return 2147483647 & this.i(1);
    }

    final byte[] g(byte param0) {
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        byte[] var2 = new byte[this.position];
        int var3 = 0;
        if (param0 >= -27) {
          this.a(97);
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
          throw ig.a((Throwable) ((Object) runtimeException), "vh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != 0) {
            this.d(74, 42);
          }
          for (var5_int = param2; var5_int < param2 + param1; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param3[var5_int] = this.payload[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("vh.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 >= -46) {
          return;
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)param1;
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)param1;
    }

    final int e(int param0) {
        int var2 = this.payload[this.position] & 255;
        if (param0 != -23470) {
          return 108;
        }
        if (var2 >= 128) {
          return this.e((byte) -104) - 32768;
        }
        return this.k(0);
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
        field_l = new me(4, 1, 1, 1);
        field_r = "Restart Mission";
        field_m = "Waiting for music";
        field_p = "Quicksaving...";
    }
}
