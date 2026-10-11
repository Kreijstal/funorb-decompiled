/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf extends kd {
    int field_h;
    static int field_i;
    byte[] field_j;

    final void d(int param0, int param1) {
        int var3 = -42 / ((param1 + 24) / 58);
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)param0;
    }

    final void a(int param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_h;
          this.field_h = 0;
          var5 = new byte[var4_int];
          if (param0 > -92) {
            this.f(22, 54);
          }
          this.a(123, var4_int, 0, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param1);
          var8 = var7.toByteArray();
          this.field_h = 0;
          this.e(92, var8.length);
          this.a(0, var8, 255, var8.length);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "wf.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = (long)param0;
          var7 = param1.length();
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-63 + var9);
              } else if (var9 >= 97 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(-97 + var9 + 2);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(-48 + (28 + var9));
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
          this.a(-17131, var3_long);
          this.a(param0 - 17131, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("wf.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final byte e(boolean param0) {
        if (!param0) {
          field_i = 88;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_j[fieldTemp$0];
    }

    final int h(byte param0) {
        if (param0 > -33) {
          return 40;
        }
        int var2 = this.field_j[this.field_h] & 255;
        if (var2 < 128) {
          return this.d(true);
        }
        return -32768 + this.b(-1698573656);
    }

    final int d(byte param0) {
        this.field_h = this.field_h + 4;
        if (param0 != 19) {
          this.e(-33, 27);
        }
        return (this.field_j[this.field_h - 1] & 255) + ((this.field_j[this.field_h - 2] & 255) << 8) + ((16711680 & this.field_j[-3 + this.field_h] << 16) + (-16777216 & this.field_j[-4 + this.field_h] << 24));
    }

    final long f(byte param0) {
        int var2 = 70 / ((-39 - param0) / 40);
        long var3 = 4294967295L & (long)this.d((byte) 19);
        long var5 = 4294967295L & (long)this.d((byte) 19);
        return (var3 << 32) + var5;
    }

    final void a(int param0, int param1, int param2, int[] param3) {
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
        var13 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = this.field_h;
          if (param0 != 4) {
            this.field_h = 48;
          }
          this.field_h = param2;
          var6 = (-param2 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_h = var5_int;
              return;
            }
            var8 = this.d((byte) 19);
            var9 = this.d((byte) 19);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + param3[var10 >>> 11 & -85983229]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param3[3 & var10]);
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.f(var8, -32287);
            this.f(var9, -32287);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wf.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != 50) {
          return -3;
        }
        if (this.field_j[this.field_h] < 0) {
          return 2147483647 & this.d((byte) 19);
        }
        return this.b(-1698573656);
    }

    final void b(int param0, byte param1) {
        this.field_j[-param0 + this.field_h - 2] = (byte)(param0 >> 8);
        if (param1 != 26) {
          this.field_h = 29;
        }
        this.field_j[this.field_h - param0 - 1] = (byte)param0;
    }

    final void a(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
          if (param0 != -38) {
            field_i = 51;
          }
          var4 = (CharSequence) ((Object) param1);
          this.field_h = this.field_h + nl.a(param1.length(), 0, (byte) -80, this.field_j, var4, this.field_h);
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "wf.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(byte param0) {
        if (0 == this.field_j[this.field_h]) {
          this.field_h = this.field_h + 1;
          return null;
        }
        if (param0 > -46) {
          this.field_h = -125;
        }
        return this.c(false);
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 < 77) {
            this.field_h = -24;
          }
          for (var5_int = param2; param2 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            param3[var5_int] = this.field_j[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wf.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (param1 != -14820) {
          this.a(-40L, -80);
        }
        this.field_j[-4 - param0 + this.field_h] = (byte)(param0 >> 24);
        this.field_j[this.field_h - param0 - 3] = (byte)(param0 >> 16);
        this.field_j[-param0 + this.field_h - 2] = (byte)(param0 >> 8);
        this.field_j[this.field_h - (param0 + 1)] = (byte)param0;
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int[] var7 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 != 255) {
            var7 = (int[]) null;
            this.a(50, -31, -30, (int[]) null);
          }
          for (var5_int = param0; var5_int < param0 + param3; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_j[fieldTemp$0] = param1[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wf.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void e(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 != 82) {
          return;
        }
        while (param0 > this.field_h) {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final int c(byte param0) {
        int var2 = 255 & this.field_j[this.field_h];
        if (param0 != -10) {
          this.field_h = 56;
        }
        if (128 <= var2) {
          return -49152 + this.b(-1698573656);
        }
        return this.d(true) - 64;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 687419600) {
          this.c(-56);
        }
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$4] = (byte)(int)param0;
    }

    final void c(int param0, byte param1) {
        if ((-128 & param0) != 0) {
          if ((-16384 & param0) != 0) {
            if ((param0 & -2097152) != 0) {
              if ((param0 & -268435456) != 0) {
                this.c(param0 >>> 28 | 128, -1);
              }
              this.c(param0 >>> 21 | 128, -1);
            }
            this.c(param0 >>> 14 | 128, -1);
          }
          this.c((param0 | 16409) >>> 7, -1);
        }
        this.c(127 & param0, -1);
        int var3 = -83 / ((param1 + 37) / 45);
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)param0;
        if (param1 != -1) {
          this.field_j = (byte[]) null;
        }
    }

    final int a(int param0) {
        if (param0 < 59) {
          return 108;
        }
        this.field_h = this.field_h + 3;
        return (this.field_j[-1 + this.field_h] & 255) + ((255 & this.field_j[-2 + this.field_h]) << 8) + (16711680 & this.field_j[this.field_h - 3] << 16);
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_h = this.field_h + nl.a(param0.length(), 0, (byte) -107, this.field_j, var4, this.field_h);
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_j[fieldTemp$0] = (byte)param1;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "wf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != -17131) {
          String var5 = (String) null;
          wf.a((sh) null, (String) null, true, (String) null);
        }
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$6] = (byte)(int)param1;
    }

    final void e(int param0, int param1) {
        if (param0 <= 49) {
          return;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)param1;
    }

    final boolean c(int param0) {
        this.field_h = this.field_h - param0;
        int var2 = oh.a(0, this.field_j, false, this.field_h);
        int var3 = this.d((byte) 19);
        if (var2 != var3) {
          return false;
        }
        return true;
    }

    final void a(int param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.c(param1 + 64, -1);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.e(80, 49152 + param1);
          return;
        }
        if (param0 < 100) {
          field_i = -41;
        }
        throw new IllegalArgumentException();
    }

    final void a(int param0, int[] param1) {
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
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = this.field_h / 8;
          this.field_h = 0;
          if (param0 != -661454965) {
            this.field_j = (byte[]) null;
          }
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.d((byte) 19);
            var6 = this.d((byte) 19);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param1[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param1[(var7 & 6359) >>> 11]);
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.f(var5, -32287);
            this.f(var6, param0 + 661422678);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wf.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int g(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Lexicominos.field_L ? 1 : 0;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_j[fieldTemp$0];
        if (param0 > -72) {
          field_i = -94;
        }
        var3 = 0;
        while (0 > var2) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          var2 = this.field_j[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$7] = (byte)(int)param0;
        if (param1 != 37) {
          this.field_j = (byte[]) null;
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != -32287) {
          return;
        }
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_j[fieldTemp$3] = (byte)param0;
    }

    final int a(int param0, byte param1) {
        int var3 = oh.a(param0, this.field_j, false, this.field_h);
        if (param1 < 11) {
          this.field_h = -95;
        }
        this.f(var3, -32287);
        return var3;
    }

    final String c(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_h;
        do {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (this.field_j[fieldTemp$0] != 0);
        if (param0) {
          return (String) null;
        }
        var3 = -1 + (this.field_h - var2);
        if (var3 == 0) {
          return "";
        }
        return dc.a(var3, this.field_j, (byte) 16, var2);
    }

    final static jb[] a(sh param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jb[] stackIn_2_0 = null;
        jb[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            stackIn_2_0 = (jb[]) null;
            return stackIn_2_0;
          }
          var4_int = param0.c(param1, (byte) -89);
          var5 = param0.a(param3, -27964, var4_int);
          stackIn_4_0 = oc.a(param0, var5, var4_int, 20);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wf.IA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void d(int param0, byte param1) {
        if (param1 >= -117) {
          this.field_h = 73;
        }
        this.field_j[this.field_h - param0 - 1] = (byte)param0;
    }

    final String d(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_j[fieldTemp$0];
        if (param0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.field_h;
        do {
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (this.field_j[fieldTemp$1] != 0);
        var4 = this.field_h + (-var3 - 1);
        if (var4 != 0) {
          return dc.a(var4, this.field_j, (byte) 16, var3);
        }
        return "";
    }

    final int b(int param0) {
        this.field_h = this.field_h + 2;
        if (param0 != -1698573656) {
          field_i = -127;
        }
        return (this.field_j[-1 + this.field_h] & 255) + ((this.field_j[-2 + this.field_h] & 255) << 8);
    }

    final int d(boolean param0) {
        if (!param0) {
          this.a(-39, 20);
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_j[fieldTemp$0] & 255;
    }

    wf(int param0) {
        this.field_j = ph.a(-126, param0);
        this.field_h = 0;
    }

    wf(byte[] param0) {
        try {
          this.field_j = param0;
          this.field_h = 0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "wf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
