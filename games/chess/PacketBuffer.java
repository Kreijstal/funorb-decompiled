/*
 * Decompiled by CFR-JS 0.4.0.
 */
class PacketBuffer extends IntrusiveNode {
    int position;
    byte[] data;
    static int field_n;
    static String[] field_m;
    static int[] field_j;
    static ci field_k;

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 1392038664) {
          byte[] var5 = (byte[]) null;
          this.a((byte[]) null, (byte) -79, -52, -88);
        }
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)param0;
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.position;
        do {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
        } while (this.data[fieldTemp$0] != 0);
        var3 = this.position - var2 - 1;
        if (param0 != var3) {
          return gh.a(this.data, var2, param0 ^ -161, var3);
        }
        return "";
    }

    final int readInt(byte obfuscationGuard) {
        if (obfuscationGuard > -90) {
          return 37;
        }
        this.position = this.position + 4;
        return (this.data[-1 + this.position] & 255) + (-16777216 & this.data[-4 + this.position] << 24) + (16711680 & this.data[this.position - 3] << 16) + ((255 & this.data[-2 + this.position]) << 8);
    }

    final int b(int param0, byte param1) {
        int var3 = ci.a(-92, this.data, param0, this.position);
        this.d(var3, (byte) -81);
        if (param1 > -122) {
          return 116;
        }
        return var3;
    }

    final boolean e(int param0) {
        if (param0 > -112) {
          field_j = (int[]) null;
        }
        this.position = this.position - 4;
        int var2 = ci.a(-124, this.data, 0, this.position);
        int var3 = this.readInt((byte) -96);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final int h(int param0) {
        if (param0 >= -98) {
          this.d(61);
        }
        if (this.data[this.position] < 0) {
          return 2147483647 & this.readInt((byte) -116);
        }
        return this.f(674914976);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          if (param0 >= -93) {
            this.a(-72, 103);
          }
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + wm.a(param1.length(), 0, var4, this.position, this.data, (byte) -122);
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "p.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, byte param1) {
        int var3 = -22 % ((-5 - param1) / 46);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)param0;
    }

    final static boolean a(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gm.a(param1, (byte) -86)) {
            return false;
          }
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (~var3_int <= param2) {
            return false;
          }
          if (!cg.a(2, param1)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("p.M(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0 &&
          param1 < 128) {
          this.c(param1, (byte) 115);
          return;
        }
        if (param0 > -114) {
          this.c((byte) -69);
        }
        if (0 <= param1 &&
          param1 < 32768) {
          this.b(32768 + param1, 97);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int j(int param0) {
        if (param0 <= 103) {
          field_k = (ci) null;
        }
        int var2 = 255 & this.data[this.position];
        if (var2 >= 128) {
          return this.f(674914976) - 32768;
        }
        return this.i(-77);
    }

    final int k(int param0) {
        if (param0 != 1389913160) {
          java.math.BigInteger var3 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, (java.math.BigInteger) null, (byte) -30);
        }
        this.position = this.position + 3;
        return (this.data[this.position - 1] & 255) + ((this.data[-3 + this.position] << 16 & 16711680) + ((255 & this.data[this.position - 2]) << 8));
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Chess.field_G;
        var2 = 8 / ((param0 - 10) / 48);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var3 = this.data[fieldTemp$0];
        var4 = 0;
        while (0 > var3) {
          var4 = (127 & var3 | var4) << 7;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          var3 = this.data[fieldTemp$1];
        }
        return var4 | var3;
    }

    final void a(boolean param0, String param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3_int = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$2] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.position = this.position + wm.a(param1.length(), 0, var4, this.position, this.data, (byte) -122);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$3] = (byte) 0;
          if (!param0) {
            this.e(118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("p.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        int var2 = this.data[this.position] & 255;
        if (param0) {
          return -44;
        }
        if (var2 < 128) {
          return this.i(-127) - 64;
        }
        return -49152 + this.f(674914976);
    }

    final byte readByte(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          field_n = -36;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return this.data[fieldTemp$0];
    }

    final void c(byte param0, int param1) {
        if (64 > param1 &&
          param1 >= -64) {
          this.c(64 + param1, (byte) 88);
          return;
        }
        int var3 = 127 / ((param0 + 75) / 47);
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.b(49152 + param1, 118);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          for (var5_int = param3; var5_int < param3 + param0; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param2[var5_int] = this.data[fieldTemp$0];
          }
          if (param1 <= 118) {
            PacketBuffer.a(68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("p.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int[] param1, byte param2, int param3) {
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
        var13 = Chess.field_G;
        try {
          var5_int = this.position;
          this.position = param0;
          if (param2 != -67) {
            return;
          }
          var6 = (param3 - param0) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.position = var5_int;
              return;
            }
            var8 = this.readInt((byte) -112);
            var9 = this.readInt((byte) -112);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + param1[(7807 & var10) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ param1[3 & var10] + var10);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var8, (byte) -81);
            this.d(var9, (byte) -81);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("p.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.position;
          this.position = 0;
          var5 = new byte[var4_int];
          this.a(var4_int, (byte) 121, var5, 0);
          if (param2 < 65) {
            field_n = 81;
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.position = 0;
          this.b(var8.length, 94);
          this.a(var8, (byte) -45, 0, var8.length);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "p.NA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 > -116) {
          field_m = (String[]) null;
        }
        field_m = null;
    }

    final void a(String param0, boolean param1) {
        int var8 = 0;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = Chess.field_G;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (var9 + 2));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-95 + var9);
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + (28 + var9));
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
          this.a(var3_long, (byte) 108);
          this.a(var5, (byte) 105);
          if (param1) {
            field_j = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("p.WA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final String b(boolean param0) {
        if (this.data[this.position] == 0) {
          this.position = this.position + 1;
          return null;
        }
        if (!param0) {
          this.e(-68);
        }
        return this.d(0);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Chess.field_G;
        if (param0 != -54) {
          return;
        }
        while (this.position < param1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.data[fieldTemp$0] = (byte) 0;
        }
    }

    final String d(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        if (param0) {
          return (String) null;
        }
        fieldTemp$0 = this.position;
        this.position = this.position + 1;
        var2 = this.data[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.position;
        do {
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
        } while (this.data[fieldTemp$1] != 0);
        var4 = -1 + this.position - var3;
        if (var4 == 0) {
          return "";
        }
        return gh.a(this.data, var3, -161, var4);
    }

    final int i(int param0) {
        if (param0 > -76) {
          return -11;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        return 255 & this.data[fieldTemp$0];
    }

    final void a(int param0, byte param1) {
        this.data[-param0 + this.position - 4] = (byte)(param0 >> 24);
        this.data[-param0 + this.position - 3] = (byte)(param0 >> 16);
        if (param1 >= -52) {
          java.math.BigInteger var4 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, (java.math.BigInteger) null, (byte) -100);
        }
        this.data[-param0 + this.position - 2] = (byte)(param0 >> 8);
        this.data[-1 - param0 + this.position] = (byte)param0;
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
        String var11 = null;
        var10 = Chess.field_G;
        try {
          var3_int = this.position / 8;
          this.position = 0;
          if (param1 != 12246) {
            var11 = (String) null;
            this.a(false, (String) null);
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.readInt((byte) -126);
            var6 = this.readInt((byte) -126);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + ((var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + param0[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ var7 + param0[(var7 & 6559) >>> 11]);
                continue;
              }
              break;
            }
            this.position = this.position - 8;
            this.d(var5, (byte) -81);
            this.d(var6, (byte) -81);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("p.W(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final long d(byte param0) {
        long var2 = (long)this.readInt((byte) -112) & 4294967295L;
        long var4 = (long)this.readInt((byte) -97) & 4294967295L;
        int var6 = -78 / ((param0 - 51) / 63);
        return (var2 << 32) + var4;
    }

    private final void a(long param0, byte param1) {
        if (param1 <= 97) {
          return;
        }
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$6] = (byte)(int)param0;
    }

    final void d(int param0, int param1) {
        this.data[this.position - param0 - 2] = (byte)(param0 >> 8);
        int var3 = -101 % ((11 - param1) / 53);
        this.data[this.position - param0 - 1] = (byte)param0;
    }

    final int f(int param0) {
        if (param0 != 674914976) {
          this.data = (byte[]) null;
        }
        this.position = this.position + 2;
        return (65280 & this.data[this.position - 2] << 8) + (255 & this.data[-1 + this.position]);
    }

    final void a(boolean param0, int param1) {
        if (0 != (param1 & -128)) {
          if ((param1 & -16384) != 0) {
            if ((-2097152 & param1) != 0) {
              if ((param1 & -268435456) != 0) {
                this.c(param1 >>> 28 | 128, (byte) -101);
              }
              this.c((269442810 | param1) >>> 21, (byte) -81);
            }
            this.c((param1 | 2103779) >>> 14, (byte) -62);
          }
          this.c(128 | param1 >>> 7, (byte) -62);
        }
        if (param0) {
          this.d(79, -43);
        }
        this.c(127 & param1, (byte) -62);
    }

    final void a(int param0, int param1) {
        this.data[param1 - param0 + this.position] = (byte)param0;
    }

    final static j a(int param0) {
        int var1_int = 0;
        j var2 = null;
        int var3 = 0;
        j stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        var3 = Chess.field_G;
        try {
          var1_int = 0;
          while (true) {
            var2 = ak.field_u.a(var1_int, 0);
            if (!var2.field_w) {
              var1_int++;
              continue;
            }
            break;
          }
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          if (param0 == -16385) {
            return null;
          }
          PacketBuffer.f((byte) 110);
          return null;
        }
    }

    PacketBuffer(int param0) {
        this.data = ql.a((byte) -2, param0);
        this.position = 0;
    }

    final int c(boolean param0) {
        this.position = this.position + 2;
        int var2 = (255 & this.data[this.position - 1]) + ((255 & this.data[-2 + this.position]) << 8);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        if (!param0) {
          return 119;
        }
        return var2;
    }

    final void d(int param0, byte param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != -81) {
          this.i(-46);
        }
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)param0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)param1;
        int var3 = 105 % ((param0 - 68) / 54);
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          for (var5_int = param2; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            this.data[fieldTemp$0] = param0[var5_int];
          }
          if (param1 != -45) {
            this.f(17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("p.U(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)param0;
        if (param1 < 85) {
          this.d(5, -35);
        }
    }

    PacketBuffer(byte[] param0) {
        try {
          this.position = 0;
          this.data = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "p.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0 >= -68) {
          this.b(-59, -100);
        }
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.position;
        this.position = this.position + 1;
        this.data[fieldTemp$7] = (byte)(int)param1;
    }

    static {
        field_j = new int[]{180000, 150000, 120000, 90000, 60000, 30000, 15000};
    }
}
