/*
 * Decompiled by CFR-JS 0.4.0.
 */
class va extends wl {
    static rc field_l;
    static ok field_o;
    byte[] field_k;
    int field_m;
    static vd field_i;
    static kl field_n;
    static ji field_j;

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1) {
          field_l = (rc) null;
        }
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$2] = (byte)param0;
    }

    final void a(String param0, int param1) {
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
        var10 = wizardrun.field_H;
        try {
          var3_long = 0L;
          var5 = 0L;
          if (param1 != -66) {
            return;
          }
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + (var9 - 65));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 + var9 - 97);
                } else {
                  if (48 <= var9 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(var9 - 20);
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
          this.a(param1 - 17663, var3_long);
          this.a(-17729, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("va.N(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
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
        var7 = wizardrun.field_H;
        try {
          var5_int = -119 % ((-47 - param3) / 41);
          for (var6 = param1; param2 + param1 > var6; var6++) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_k[fieldTemp$0] = param0[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("va.TA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 != 0) {
          this.c(44, -40);
        }
        var2 = this.field_m;
        do {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
        } while (this.field_k[fieldTemp$0] != 0);
        var3 = this.field_m - var2 - 1;
        if (var3 == 0) {
          return "";
        }
        return bi.a(var2, var3, this.field_k, false);
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)param1;
        if (param0 != 11) {
          field_i = (vd) null;
        }
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0 != 1290648728) {
          byte[] var5 = (byte[]) null;
          this.a(true, -58, (byte[]) null, 44);
        }
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$7] = (byte)(int)param1;
    }

    final void a(boolean param0, int[] param1, int param2, int param3) {
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
        var13 = wizardrun.field_H;
        try {
          var5_int = this.field_m;
          this.field_m = param2;
          if (param0) {
            return;
          }
          var6 = (-param2 + param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_m = var5_int;
              return;
            }
            var8 = this.i(255);
            var9 = this.i(255);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (0 < incrementValue$0) {
                var9 = var9 - (param1[1470103555 & var10 >>> 11] + var10 ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param1[3 & var10] ^ var9 + (var9 >>> 5 ^ var9 << 4));
                continue;
              }
              break;
            }
            this.field_m = this.field_m - 8;
            this.f(var8, 613003928);
            this.f(var9, 613003928);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("va.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(int param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.b((byte) 11, 64 + param1);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.b(-1947079288, 49152 + param1);
          return;
        }
        if (param0 != 1710370149) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((param1 & -16384) != 0) {
            if (0 != (param1 & -2097152)) {
              if ((param1 & -268435456) != 0) {
                this.b((byte) 11, 128 | param1 >>> 28);
              }
              this.b((byte) 11, 128 | param1 >>> 21);
            }
            this.b((byte) 11, (param1 | 2107542) >>> 14);
          }
          this.b((byte) 11, (16440 | param1) >>> 7);
        }
        if (param0 != -117) {
          this.field_k = (byte[]) null;
        }
        this.b((byte) 11, param1 & 127);
    }

    final long e(byte param0) {
        if (param0 != 0) {
          return 72L;
        }
        long var2 = (long)this.i(255) & 4294967295L;
        long var4 = 4294967295L & (long)this.i(255);
        return (var2 << 32) + var4;
    }

    final int a(int param0) {
        int var2 = 255 & this.field_k[this.field_m];
        if (param0 != 20479) {
          return -111;
        }
        if (128 <= var2) {
          return -49152 + this.j(-14477);
        }
        return this.f(255) - 64;
    }

    final String c(int param0) {
        if (param0 == ~this.field_k[this.field_m]) {
          this.field_m = this.field_m + 1;
          return null;
        }
        return this.d(0);
    }

    final int d(byte param0) {
        if (param0 <= 73) {
          return 26;
        }
        this.field_m = this.field_m + 3;
        return ((255 & this.field_k[-3 + this.field_m]) << 16) + (this.field_k[-2 + this.field_m] << 8 & 65280) + (255 & this.field_k[this.field_m - 1]);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)param1;
        if (param0 != -1947079288) {
          field_j = (ji) null;
        }
    }

    final int f(int param0) {
        if (param0 != 255) {
          field_l = (rc) null;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return 255 & this.field_k[fieldTemp$0];
    }

    final void a(boolean param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        try {
          if (!param0) {
            return;
          }
          for (var5_int = param3; var5_int < param3 + param1; var5_int++) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            param2[var5_int] = this.field_k[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("va.IA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(String param0, boolean param1) {
        int fieldTemp$0 = 0;
        int var3_int = param0.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        CharSequence var4 = (CharSequence) ((Object) param0);
        this.field_m = this.field_m + pg.a(8220, this.field_k, 0, var4, this.field_m, param0.length());
        if (param1) {
          return;
        }
        try {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "va.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String h(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        var2 = this.field_k[fieldTemp$0];
        if (param0 != 727059944) {
          return (String) null;
        }
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_m;
        do {
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
        } while (this.field_k[fieldTemp$1] != 0);
        var4 = -1 - var3 + this.field_m;
        if (0 == var4) {
          return "";
        }
        return bi.a(var3, var4, this.field_k, false);
    }

    final static void a(int param0, String param1) {
        if (param0 != -2) {
          return;
        }
        try {
          sf.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "va.OA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_k[this.field_m - (param0 + 1)] = (byte)param0;
        if (param1 >= -43) {
          this.e(108, -51);
        }
    }

    public static void g(byte param0) {
        field_o = null;
        field_n = null;
        field_l = null;
        int var1 = -88 % ((param0 - 78) / 38);
        field_i = null;
        field_j = null;
    }

    final int g(int param0) {
        if (param0 != 11681) {
          field_j = (ji) null;
        }
        int var2 = this.field_k[this.field_m] & 255;
        if (var2 >= 128) {
          return -32768 + this.j(param0 ^ -5422);
        }
        return this.f(255);
    }

    va(int param0) {
        this.field_m = 0;
        this.field_k = ej.a(param0, 1);
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = wizardrun.field_H;
        if (param1 <= 122) {
          this.d(-54);
        }
        while (this.field_m < param0) {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
        }
    }

    final int i(int param0) {
        this.field_m = this.field_m + 4;
        if (param0 != 255) {
          this.field_k = (byte[]) null;
        }
        return (this.field_k[-1 + this.field_m] & 255) + (((this.field_k[this.field_m - 3] & 255) << 16) + (-16777216 & this.field_k[this.field_m - 4] << 24) + ((255 & this.field_k[this.field_m - 2]) << 8));
    }

    final void b(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (param0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_m = this.field_m + pg.a(8220, this.field_k, 0, var4, this.field_m, param1.length());
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "va.BB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 613003928) {
          return;
        }
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$3] = (byte)param0;
    }

    final void a(boolean param0, int[] param1) {
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
        var10 = wizardrun.field_H;
        try {
          if (param0) {
            this.e((byte) -74);
          }
          var3_int = this.field_m / 8;
          this.field_m = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.i(255);
            var6 = this.i(255);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[var7 & 3] ^ (var6 << 4 ^ var6 >>> 5) + var6);
                var7 = var7 + var8;
                var6 = var6 + (param1[(7920 & var7) >>> 11] + var7 ^ var5 + (var5 << 4 ^ var5 >>> 5));
                continue;
              }
              break;
            }
            this.field_m = this.field_m - 8;
            this.f(var5, 613003928);
            this.f(var6, 613003928);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("va.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != -88) {
          return -55;
        }
        if (this.field_k[this.field_m] >= 0) {
          return this.j(-14477);
        }
        return 2147483647 & this.i(255);
    }

    final void b(int param0, byte param1) {
        this.field_k[-4 + (this.field_m - param0)] = (byte)(param0 >> 24);
        this.field_k[-3 + (this.field_m - param0)] = (byte)(param0 >> 16);
        this.field_k[-param0 + (this.field_m - 2)] = (byte)(param0 >> 8);
        if (param1 > -20) {
          String var4 = (String) null;
          va.a(27, (String) null);
        }
        this.field_k[-1 + (-param0 + this.field_m)] = (byte)param0;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$4] = (byte)(int)param0;
        if (param1 <= 101) {
          field_j = (ji) null;
        }
    }

    final byte k(int param0) {
        if (param0 != 0) {
          this.field_m = 10;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return this.field_k[fieldTemp$0];
    }

    final int j(int param0) {
        if (param0 != -14477) {
          return -34;
        }
        this.field_m = this.field_m + 2;
        return (255 & this.field_k[-1 + this.field_m]) + (this.field_k[-2 + this.field_m] << 8 & 65280);
    }

    final int e(int param0, int param1) {
        if (param1 != -1182887024) {
          this.d(-77);
        }
        int var3 = gh.a(this.field_k, 107, param0, this.field_m);
        this.f(var3, 613003928);
        return var3;
    }

    final void a(int param0, byte param1) {
        this.field_k[-2 - param0 + this.field_m] = (byte)(param0 >> 8);
        this.field_k[-1 + (this.field_m - param0)] = (byte)param0;
        if (param1 != -67) {
          this.d(73);
        }
    }

    private final void a(int param0, long param1) {
        if (param0 != -17729) {
          return;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_k[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_m;
          this.field_m = 0;
          var5 = new byte[var4_int];
          this.a(true, var4_int, var5, 0);
          var6 = new java.math.BigInteger(var5);
          if (param1 <= 17) {
            this.d(5, -27);
          }
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.field_m = 0;
          this.b(-1947079288, var8.length);
          this.a(var8, 0, var8.length, -3);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "va.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = wizardrun.field_H;
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        var2 = this.field_k[fieldTemp$0];
        if (param0 != -90) {
          field_l = (rc) null;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          var2 = this.field_k[fieldTemp$1];
        }
        return var3 | var2;
    }

    final boolean e(int param0) {
        if (param0 != -6142) {
          byte[] var4 = (byte[]) null;
          this.a((byte[]) null, 113, 122, -33);
        }
        this.field_m = this.field_m - 4;
        int var2 = gh.a(this.field_k, 116, 0, this.field_m);
        int var3 = this.i(255);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    va(byte[] param0) {
        try {
          this.field_k = param0;
          this.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "va.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new rc();
        field_o = new ok();
    }
}
