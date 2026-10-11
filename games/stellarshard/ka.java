/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends gg {
    static int field_q;
    static int field_p;
    static pf field_n;
    int field_k;
    static String field_l;
    static ba field_m;
    static long field_o;
    byte[] field_r;

    final int h(int param0) {
        if (param0 != 26491) {
          return 2;
        }
        if (this.field_r[this.field_k] < 0) {
          return this.b(false) & 2147483647;
        }
        return this.c((byte) 100);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 != 0) {
          return;
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$3] = (byte)param1;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = stellarshard.field_B;
        while (this.field_k < param0) {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$0] = (byte) 0;
        }
        if (param1 == -18920) {
          return;
        }
        field_q = 77;
    }

    final String f(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        var2 = this.field_r[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (param0 != 94) {
          return (String) null;
        }
        var3 = this.field_k;
        do {
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
        } while (this.field_r[fieldTemp$1] != 0);
        var4 = this.field_k + (-var3 - 1);
        if (0 == var4) {
          return "";
        }
        return kk.a(var4, (byte) 121, var3, this.field_r);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)param1;
        if (param0) {
          field_p = 77;
        }
    }

    final String e(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_k;
        do {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
        } while (this.field_r[fieldTemp$0] != 0);
        var3 = -1 + (this.field_k - var2);
        if (var3 == 0) {
          return "";
        }
        if (param0 >= 78) {
          return kk.a(var3, (byte) 93, var2, this.field_r);
        }
        return (String) null;
    }

    final void a(int param0, long param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)(int)(param1 >> 16);
        if (param0 <= 9) {
          this.field_r = (byte[]) null;
          fieldTemp$3 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$3] = (byte)(int)(param1 >> 8);
          fieldTemp$4 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$4] = (byte)(int)param1;
          return;
        }
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$6] = (byte)(int)param1;
    }

    final boolean a(boolean param0) {
        this.field_k = this.field_k - 4;
        int var2 = jj.a(0, this.field_r, this.field_k, -107);
        int var3 = this.b(false);
        if (var3 == var2) {
          return true;
        }
        if (!param0) {
          return true;
        }
        return false;
    }

    final void c(int param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 > -110) {
          this.field_k = 36;
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$1] = (byte)param0;
          return;
        }
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)param0;
    }

    final byte g(int param0) {
        int var2 = 103 % ((param0 - 45) / 56);
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        return this.field_r[fieldTemp$0];
    }

    final String a(int param0) {
        if (this.field_r[this.field_k] == param0) {
          this.field_k = this.field_k + 1;
          return null;
        }
        return this.e((byte) 87);
    }

    final int c(int param0, byte param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (param1 != -3) {
          field_l = (String) null;
          var3 = jj.a(param0, this.field_r, this.field_k, -65);
          this.b(0, var3);
          return var3;
        }
        var3Lifetime1 = jj.a(param0, this.field_r, this.field_k, -65);
        this.b(0, var3Lifetime1);
        return var3Lifetime1;
    }

    final void a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        int var14 = stellarshard.field_B;
        try {
          var5_int = this.field_k;
          this.field_k = param2;
          var6 = (-param2 + param3) / 8;
          var7 = 0;
          int var8 = -113 % ((param0 - 29) / 33);
          while (var6 > var7) {
            var9 = this.b(false);
            var10 = this.b(false);
            var11 = -957401312;
            var12 = -1640531527;
            var13 = 32;
            while (true) {
              incrementValue$0 = var13;
              var13--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var10 = var10 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var11 + param1[(7205 & var11) >>> 11]);
              var11 = var11 - var12;
              var9 = var9 - (var11 + param1[3 & var11] ^ (var10 >>> 5 ^ var10 << 4) + var10);
            }
            this.field_k = this.field_k - 8;
            this.b(0, var9);
            this.b(0, var10);
            var7++;
          }
          this.field_k = var5_int;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ka.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int c(byte param0) {
        if (param0 < 21) {
          return 45;
        }
        this.field_k = this.field_k + 2;
        return (this.field_r[this.field_k - 2] << 8 & 65280) + (255 & this.field_r[this.field_k - 1]);
    }

    public static void a(byte param0) {
        field_n = null;
        field_l = null;
        field_m = null;
        int var1 = -51 / ((param0 + 64) / 48);
    }

    final void a(byte param0, int param1) {
        if (param1 >= 64) {
          if (16384 <= param1) {
            if (param0 < 3) {
              return;
            }
            throw new IllegalArgumentException();
          }
          if (param1 < -16384) {
            if (param0 < 3) {
              return;
            }
            throw new IllegalArgumentException();
          }
          this.c(param1 + 49152, -128);
          return;
        }
        if (param1 < -64) {
          if (16384 <= param1) {
            if (param0 < 3) {
              return;
            }
            throw new IllegalArgumentException();
          }
          if (param1 < -16384) {
            if (param0 < 3) {
              return;
            }
            throw new IllegalArgumentException();
          }
          this.c(param1 + 49152, -128);
          return;
        }
        this.a(false, param1 + 64);
    }

    final void b(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        if (param1 != -9799) {
          return;
        }
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_k = this.field_k + qi.a(this.field_r, param1 + 9689, this.field_k, 0, var4, param0.length());
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ka.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, java.math.BigInteger param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          if (param0) {
            this.field_r = (byte[]) null;
          }
          var4_int = this.field_k;
          this.field_k = 0;
          var5 = new byte[var4_int];
          this.a(0, (byte) -108, var4_int, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param1);
          var8 = var7.toByteArray();
          this.field_k = 0;
          this.c(var8.length, -123);
          this.a(var8.length, 0, (byte) -13, var8);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ka.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = stellarshard.field_B;
        try {
          if (param2 != -13) {
            return;
          }
          for (var5_int = param1; param1 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            this.field_r[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ka.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        var6 = stellarshard.field_B;
        try {
          if (param1 >= -99) {
            var7 = (String) null;
            this.a(true, (String) null);
          }
          for (var5_int = param0; var5_int < param2 + param0; var5_int++) {
            fieldTemp$0 = this.field_k;
            this.field_k = this.field_k + 1;
            param3[var5_int] = this.field_r[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ka.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int f(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 4) {
          this.field_k = 119;
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          return 255 & this.field_r[fieldTemp$0];
        }
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        return 255 & this.field_r[fieldTemp$1];
    }

    final long d(int param0) {
        if (param0 != 0) {
          return 47L;
        }
        long var2 = (long)this.b(false) & 4294967295L;
        long var4 = 4294967295L & (long)this.b(false);
        return var4 + (var2 << 32);
    }

    final void b(int param0, byte param1) {
        if (param1 <= 118) {
          return;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)param0;
    }

    final int d(byte param0) {
        int var2 = 255 & this.field_r[this.field_k];
        int var3 = -99 / ((58 - param0) / 37);
        if (var2 < 128) {
          return this.f(4);
        }
        return -32768 + this.c((byte) 24);
    }

    final int b(boolean param0) {
        this.field_k = this.field_k + 4;
        if (param0) {
          field_o = 122L;
          return (this.field_r[this.field_k - 1] & 255) + ((this.field_r[this.field_k - 2] << 8 & 65280) + ((this.field_r[-3 + this.field_k] & 255) << 16)) + (-16777216 & this.field_r[-4 + this.field_k] << 24);
        }
        return (this.field_r[this.field_k - 1] & 255) + ((this.field_r[this.field_k - 2] << 8 & 65280) + ((this.field_r[-3 + this.field_k] & 255) << 16)) + (-16777216 & this.field_r[-4 + this.field_k] << 24);
    }

    final void a(int param0, byte param1) {
        this.field_r[-param0 + this.field_k - 1] = (byte)param0;
        int var3 = 41 % ((param1 + 11) / 53);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var5 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$0] = (byte) 0;
          var5 = (CharSequence) ((Object) param1);
          this.field_k = this.field_k + qi.a(this.field_r, -53, this.field_k, 0, var5, param1.length());
          int var4 = 89 % ((37 - param0) / 39);
          fieldTemp$1 = this.field_k;
          this.field_k = this.field_k + 1;
          this.field_r[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ka.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        var10 = stellarshard.field_B;
        try {
          var3_int = this.field_k / 8;
          this.field_k = 0;
          if (param0 != 12) {
            this.field_r = (byte[]) null;
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.b(false);
            var6 = this.b(false);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param1[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[729808899 & var7 >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.field_k = this.field_k - 8;
            this.b(0, var5);
            this.b(0, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ka.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(boolean param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = stellarshard.field_B;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                90 >= var9) {
                var3_long = var3_long + (long)(2 - (-var9 + 65));
              } else if (var9 >= 97 &&
                122 >= var9) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                57 >= var9) {
                var3_long = var3_long + (long)(var9 - 20);
              } else {
                var3_long = var3_long + 1L;
              }
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            } else {
              if (var8 == 10) {
                var5 = var3_long;
                var3_long = 0L;
              }
            }
          }
          this.b(8, var3_long);
          if (param0) {
            return;
          }
          this.b(8, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("ka.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int e(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -64) {
          field_n = (pf) null;
          var2 = this.field_r[this.field_k] & 255;
          if (var2 >= 128) {
            return -49152 + this.c((byte) 43);
          }
          return this.f(4) - 64;
        }
        var2Lifetime1 = this.field_r[this.field_k] & 255;
        if (var2Lifetime1 >= 128) {
          return -49152 + this.c((byte) 43);
        }
        return this.f(4) - 64;
    }

    final int c(boolean param0) {
        this.field_k = this.field_k + 3;
        if (!param0) {
          this.c(true);
          return (255 & this.field_r[this.field_k - 1]) + ((this.field_r[-3 + this.field_k] << 16 & 16711680) + ((255 & this.field_r[-2 + this.field_k]) << 8));
        }
        return (255 & this.field_r[this.field_k - 1]) + ((this.field_r[-3 + this.field_k] << 16 & 16711680) + ((255 & this.field_r[-2 + this.field_k]) << 8));
    }

    ka(int param0) {
        this.field_k = 0;
        this.field_r = ee.a(param0, true);
    }

    private final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$1] = (byte)(int)(param1 >> 40);
        if (param0 != 8) {
          return;
        }
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$6] = (byte)(int)param1;
    }

    ka(byte[] param0) {
        try {
          this.field_k = 0;
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, long param1) {
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$5] = (byte)(int)(param1 >> 16);
        if (param0 < 116) {
          return;
        }
        int fieldTemp$6 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_r[fieldTemp$7] = (byte)(int)param1;
    }

    final void d(int param0, int param1) {
        this.field_r[-2 - param1 + this.field_k] = (byte)(param1 >> 8);
        this.field_r[-param1 + (this.field_k + param0)] = (byte)param1;
    }

    static {
        field_l = "Bounce gun";
    }
}
