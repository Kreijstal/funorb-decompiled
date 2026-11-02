/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends IntrusiveNode {
    byte[] field_h;
    int field_j;
    static he[] field_i;
    static he field_k;

    final void b(int param0, int param1) {
        this.field_h[-4 + (this.field_j - param0)] = (byte)(param0 >> 24);
        int var3 = 51 / ((param1 + 32) / 49);
        this.field_h[this.field_j - (param0 + 3)] = (byte)(param0 >> 16);
        this.field_h[-param0 + this.field_j - 2] = (byte)(param0 >> 8);
        this.field_h[-1 - param0 + this.field_j] = (byte)param0;
    }

    final long a(byte param0) {
        long var2 = (long)this.h(57) & 4294967295L;
        long var4 = (long)this.h(125) & 4294967295L;
        if (param0 != -53) {
          return 37L;
        }
        return var4 + (var2 << 32);
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        String var5;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        var2 = this.field_h[fieldTemp$0];
        var3 = 0;
        if (param0 != 58) {
          var5 = (String) null;
          this.a(23, (String) null);
        }
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
          var2 = this.field_h[fieldTemp$1];
        }
        return var2 | var3;
    }

    final void a(int param0, int param1) {
        this.field_h[param0 - param1 + this.field_j] = (byte)(param1 >> 8);
        this.field_h[-1 + (-param1 + this.field_j)] = (byte)param1;
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1) {
          return;
        }
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)param0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)param0;
        if (param1 != -17402) {
          field_i = (he[]) null;
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param1 >> 8);
        if (param0 != 1992910808) {
          return;
        }
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)param1;
    }

    final String i(int param0) {
        if (this.field_h[this.field_j] == 0) {
          this.field_j = this.field_j + 1;
          return null;
        }
        if (param0 != 715718304) {
          return (String) null;
        }
        return this.b((byte) -60);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 != 128) {
            return;
          }
          for (var5_int = param0; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            param3[var5_int] = this.field_h[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("od.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int j(int param0) {
        if (param0 != -788751192) {
          return -114;
        }
        this.field_j = this.field_j + 2;
        return ((255 & this.field_h[this.field_j - 2]) << 8) + (255 & this.field_h[this.field_j - 1]);
    }

    final byte n(int param0) {
        int var2 = 89 / ((9 - param0) / 59);
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_h[fieldTemp$0];
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_j;
          this.field_j = param2;
          var5 = new byte[var4_int];
          this.b(0, var4_int, 128, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.field_j = 0;
          this.c(var8.length, param2 ^ -17402);
          this.a(var8.length, 0, 29211, var8);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "od.V(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, String param1) {
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte) 0;
        if (param0 != -23805) {
          return;
        }
        try {
          var4 = (CharSequence) ((Object) param1);
          this.field_j = this.field_j + ge.a(this.field_h, this.field_j, 0, param1.length(), var4, -124);
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_h[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "od.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          return -42;
        }
        if (this.field_h[this.field_j] >= 0) {
          return this.j(-788751192);
        }
        return this.h(-88) & 2147483647;
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 16);
        int var3 = 33 / ((param1 - 53) / 50);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)param0;
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
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_int = this.field_j / 8;
          this.field_j = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              if (param1 != 7221) {
                this.g(-78);
              }
              return;
            }
            var5 = this.h(param1 - 7219);
            var6 = this.h(98);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (param0[654311427 & var7 >>> 11] + var7 ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.field_j = this.field_j - 8;
            this.a(var5, (byte) 126);
            this.a(var6, (byte) 105);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("od.UA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != 4) {
          od.d(-59);
        }
        field_k = null;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$7] = (byte)(int)param0;
        int var4 = 10 / ((42 - param1) / 60);
    }

    final int g(int param0) {
        if (param0 != -1) {
          this.n(9);
        }
        this.field_j = this.field_j + 3;
        return ((255 & this.field_h[this.field_j - 3]) << 16) + (65280 & this.field_h[-2 + this.field_j] << 8) + (255 & this.field_h[this.field_j - 1]);
    }

    final void b(int param0, String param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          var8 = 19;
          if (param0 != 1) {
            this.field_h = (byte[]) null;
          }
          while (var8 >= 0) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (65 <= var9 &&
                90 >= var9) {
                var3_long = var3_long + (long)(-63 + var9);
              } else {
                if (97 <= var9 &&
                  122 >= var9) {
                  var3_long = var3_long + (long)(2 + var9 - 97);
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
            if (10 == var8) {
              var5 = var3_long;
              var3_long = 0L;
            }
            var8--;
          }
          this.a(var3_long, 113);
          this.a(var5, param0 - 88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("od.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void c(int param0, byte param1) {
        if (param1 > -81) {
          return;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)param0;
    }

    final void b(int param0, byte param1) {
        this.field_h[this.field_j - (param0 + 1)] = (byte)param0;
        if (param1 != 87) {
          this.a(-36, 79);
        }
    }

    final int l(int param0) {
        if (param0 != 31760) {
          this.field_h = (byte[]) null;
        }
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        return this.field_h[fieldTemp$0] & 255;
    }

    final void a(String param0, int param1) {
        int fieldTemp$1 = 0;
        int var3_int = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
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
          var5 = (CharSequence) ((Object) param0);
          this.field_j = this.field_j + ge.a(this.field_h, this.field_j, 0, param0.length(), var5, -125);
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_h[fieldTemp$1] = (byte) 0;
          if (param1 != -1) {
            var4 = (byte[]) null;
            this.b(88, 90, -54, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("od.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int[] param0, boolean param1, int param2, int param3) {
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
        String var14 = null;
        var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = this.field_j;
          this.field_j = param2;
          var6 = (-param2 + param3) / 8;
          if (!param1) {
            var14 = (String) null;
            this.a((String) null, -6);
          }
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_j = var5_int;
              return;
            }
            var8 = this.h(106);
            var9 = this.h(12);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param0[-1421869053 & var10 >>> 11] + var10 ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (param0[3 & var10] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.field_j = this.field_j - 8;
            this.a(var8, (byte) -112);
            this.a(var9, (byte) 119);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("od.RA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int d(int param0, byte param1) {
        int var4 = -46 / ((83 - param1) / 33);
        int var3 = ml.a(this.field_h, param0, this.field_j, false);
        this.a(var3, (byte) -125);
        return var3;
    }

    private final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$6] = (byte)(int)param0;
        int var4 = -21 % ((-8 - param1) / 63);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        java.math.BigInteger var5;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        while (param1 > this.field_j) {
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          this.field_h[fieldTemp$0] = (byte) 0;
        }
        if (param0 > -25) {
          var5 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, (java.math.BigInteger) null, -51);
        }
    }

    final int f(int param0) {
        int var2 = this.field_h[this.field_j] & 255;
        if (param0 != 2350) {
          field_i = (he[]) null;
        }
        if (var2 < 128) {
          return -64 + this.l(31760);
        }
        return this.j(param0 - 788753542) - 49152;
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
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param2 != 29211) {
            field_i = (he[]) null;
          }
          for (var5_int = param1; param1 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            this.field_h[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("od.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean m(int param0) {
        this.field_j = this.field_j - 4;
        int var2 = ml.a(this.field_h, param0, this.field_j, false);
        int var3 = this.h(param0 - 120);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    od(int param0) {
        this.field_j = 0;
        this.field_h = sc.a(-16705, param0);
    }

    od(byte[] param0) {
        try {
          this.field_h = param0;
          this.field_j = 0;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        if (param0 != 7021) {
          byte[] var3 = (byte[]) null;
          this.b(64, 105, -79, (byte[]) null);
        }
        int var2 = this.field_h[this.field_j] & 255;
        if (var2 < 128) {
          return this.l(param0 + 24739);
        }
        return -32768 + this.j(-788751192);
    }

    final static void a(int param0, PcmSampleStream param1) {
        if (param0 != -1630758008) {
          return;
        }
        try {
          ff.field_O.a(new ml(param1, param1), 255);
          ej.field_a.a(param1);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "od.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int h(int param0) {
        int var2 = -44 % ((param0 + 46) / 32);
        this.field_j = this.field_j + 4;
        return (255 & this.field_h[-1 + this.field_j]) + (((255 & this.field_h[this.field_j - 2]) << 8) + (this.field_h[-4 + this.field_j] << 24 & -16777216)) + (this.field_h[-3 + this.field_j] << 16 & 16711680);
    }

    final void c(byte param0, int param1) {
        if ((-128 & param1) != 0) {
          if ((param1 & -16384) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.c(param1 >>> 28 | 128, (byte) -108);
              }
              this.c(128 | param1 >>> 21, (byte) -107);
            }
            this.c((2099811 | param1) >>> 14, (byte) -115);
          }
          this.c(128 | param1 >>> 7, (byte) -98);
        }
        int var3 = 101 / ((-47 - param0) / 62);
        this.c(127 & param1, (byte) -107);
    }

    final String b(byte param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_j;
        if (param0 >= -25) {
          return (String) null;
        }
        do {
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
        } while (this.field_h[fieldTemp$0] != 0);
        var3 = -1 + (-var2 + this.field_j);
        if (var3 != 0) {
          return p.a(var3, (byte) 79, this.field_h, var2);
        }
        return "";
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        var2 = this.field_h[fieldTemp$0];
        if (param0 >= -21) {
          return (String) null;
        }
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var3 = this.field_j;
        do {
          fieldTemp$1 = this.field_j;
          this.field_j = this.field_j + 1;
        } while (this.field_h[fieldTemp$1] != 0);
        var4 = this.field_j + (-var3 - 1);
        if (var4 != 0) {
          return p.a(var4, (byte) 79, this.field_h, var3);
        }
        return "";
    }

    final void b(byte param0, int param1) {
        if (64 > param1 &&
          param1 >= -64) {
          this.c(param1 + 64, (byte) -121);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.c(49152 + param1, -17402);
          return;
        }
        int var3 = -78 % ((42 - param0) / 51);
        throw new IllegalArgumentException();
    }

    static {
    }
}
