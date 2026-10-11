/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gi extends ck {
    byte[] field_t;
    static ja field_q;
    int field_p;
    static String field_v;
    static int[] field_s;
    static boolean field_r;
    static boolean field_u;
    static gh field_o;

    final void a(int param0, String param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3_int = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
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
          fieldTemp$2 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_t[fieldTemp$2] = (byte) 0;
          var5 = (CharSequence) ((Object) param1);
          this.field_p = this.field_p + rc.a(param1.length(), var5, 0, -122, this.field_t, this.field_p);
          fieldTemp$3 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_t[fieldTemp$3] = (byte) 0;
          if (param0 != 13588) {
            var4 = (byte[]) null;
            this.a(45, (byte) -56, -56, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gi.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void b(byte param0, int param1) {
        int var3 = -83 / ((param0 - 30) / 44);
        this.field_t[-1 + (-param1 + this.field_p)] = (byte)param1;
    }

    final int i(int param0) {
        this.field_p = this.field_p + 4;
        if (param0 != 0) {
          field_r = false;
        }
        return (this.field_t[-1 + this.field_p] & 255) + ((-16777216 & this.field_t[-4 + this.field_p] << 24) - (-((this.field_t[this.field_p - 3] & 255) << 16) - (65280 & this.field_t[-2 + this.field_p] << 8)));
    }

    final void a(String param0, byte param1) {
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
        var10 = SteelSentinels.field_G;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param0.length();
          if (param1 > -64) {
            this.c(11, 50);
          }
          for (var8 = 19; var8 >= 0; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (2 + var9));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
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
          }
          this.a(28904, var3_long);
          this.a(28904, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("gi.DA(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 <= 5) {
          return 55;
        }
        int var2 = this.field_t[this.field_p] & 255;
        if (var2 >= 128) {
          return -49152 + this.c((byte) -60);
        }
        return -64 + this.f((byte) -120);
    }

    final void c(byte param0, int param1) {
        if (param0 > -105) {
          this.a((byte) -36);
        }
        if ((-128 & param1) != 0) {
          if ((param1 & -16384) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((-268435456 & param1) != 0) {
                this.a((byte) 122, param1 >>> 28 | 128);
              }
              this.a((byte) 120, (param1 | 269415161) >>> 21);
            }
            this.a((byte) 115, (2112853 | param1) >>> 14);
          }
          this.a((byte) 109, 128 | param1 >>> 7);
        }
        this.a((byte) 124, 127 & param1);
    }

    final String h(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_p;
        if (param0 != 1) {
          this.g((byte) -73);
        }
        do {
          fieldTemp$0 = this.field_p;
          this.field_p = this.field_p + 1;
        } while (0 != this.field_t[fieldTemp$0]);
        var3 = -1 - var2 + this.field_p;
        if (0 == var3) {
          return "";
        }
        return ub.a((byte) 37, var2, this.field_t, var3);
    }

    final boolean a(byte param0) {
        this.field_p = this.field_p - 4;
        int var2 = ok.a(0, this.field_t, this.field_p, (byte) 109);
        if (param0 >= -27) {
          return false;
        }
        int var3 = this.i(0);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    public static void d(int param0) {
        field_s = null;
        field_q = null;
        if (param0 > -119) {
          gi.h((byte) 76);
        }
        field_v = null;
        field_o = null;
    }

    final int f(byte param0) {
        if (param0 >= -53) {
          field_q = (ja) null;
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        return 255 & this.field_t[fieldTemp$0];
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)param1;
        if (param0 <= 107) {
          this.a((byte) 58, -61);
        }
    }

    final static boolean h(byte param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -25 / ((param0 + 3) / 35);
        stackIn_4_0 = (vb.b(-99)) && ((8 & dm.field_a) == 0);
        return stackIn_4_0;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        try {
          var5_int = param2;
          if (param1 != -122) {
            field_q = (ja) null;
          }
          while (param0 + param2 > var5_int) {
            fieldTemp$0 = this.field_p;
            this.field_p = this.field_p + 1;
            this.field_t[fieldTemp$0] = param3[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gi.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        if (param0 != 30) {
          return;
        }
        this.field_t[this.field_p - param1 - 2] = (byte)(param1 >> 8);
        this.field_t[-1 + (-param1 + this.field_p)] = (byte)param1;
    }

    final String g(int param0) {
        if (param0 > -60) {
          return (String) null;
        }
        if (0 == this.field_t[this.field_p]) {
          this.field_p = this.field_p + 1;
          return null;
        }
        return this.h(1);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = SteelSentinels.field_G;
        while (param1 > this.field_p) {
          fieldTemp$0 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_t[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -2) {
          field_u = true;
        }
    }

    final void a(int param0, int param1) {
        if (param0 >= 0 &&
          param0 < 128) {
          this.a((byte) 108, param0);
          return;
        }
        if (0 <= param0 &&
          param0 < 32768) {
          this.d(param0 + 32768, param1 - 32725);
          return;
        }
        if (param1 != 32768) {
          field_u = true;
        }
        throw new IllegalArgumentException();
    }

    final String e(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        var2 = this.field_t[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.field_p;
        do {
          fieldTemp$1 = this.field_p;
          this.field_p = this.field_p + 1;
        } while (this.field_t[fieldTemp$1] != 0);
        var5 = -76 % ((48 - param0) / 62);
        var4 = -1 + this.field_p - var3;
        if (var4 != 0) {
          return ub.a((byte) 37, var3, this.field_t, var4);
        }
        return "";
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
        var10 = SteelSentinels.field_G;
        try {
          var3_int = this.field_p / 8;
          this.field_p = 0;
          if (param1 >= -103) {
            this.field_p = 106;
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.i(0);
            var6 = this.i(0);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (param0[3 & var7] + var7 ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ param0[1327497219 & var7 >>> 11] + var7);
                continue;
              }
              break;
            }
            this.field_p = this.field_p - 8;
            this.b(true, var5);
            this.b(true, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gi.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    gi(int param0) {
        this.field_t = ni.a(param0, (byte) -45);
        this.field_p = 0;
    }

    final void d(int param0, int param1) {
        if (param1 <= 0) {
          this.g(92);
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)param0;
    }

    final void b(boolean param0, int param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$2] = (byte)(param1 >> 8);
        if (!param0) {
          this.e(-78);
        }
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$3] = (byte)param1;
    }

    final void a(String param0, int param1) {
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        int var3_int = param0.indexOf('\0');
        if (param1 > -60) {
          return;
        }
        try {
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_p = this.field_p + rc.a(param0.length(), var4, 0, -112, this.field_t, this.field_p);
          fieldTemp$0 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_t[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "gi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 120) {
          return;
        }
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$4] = (byte)(int)param0;
    }

    final void e(int param0, int param1) {
        if (param0 != 31) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, -2);
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$2] = (byte)param1;
    }

    final int c(byte param0) {
        if (param0 != -60) {
          return 19;
        }
        this.field_p = this.field_p + 2;
        return (65280 & this.field_t[this.field_p - 2] << 8) + (255 & this.field_t[-1 + this.field_p]);
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
        var6 = SteelSentinels.field_G;
        try {
          if (param2 != 28) {
            field_u = true;
          }
          for (var5_int = param0; param3 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_p;
            this.field_p = this.field_p + 1;
            param1[var5_int] = this.field_t[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gi.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte d(byte param0) {
        if (param0 != -2) {
          field_s = (int[]) null;
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        return this.field_t[fieldTemp$0];
    }

    final long g(byte param0) {
        if (param0 >= -70) {
          return 51L;
        }
        long var2 = (long)this.i(0) & 4294967295L;
        long var4 = (long)this.i(0) & 4294967295L;
        return (var2 << 32) + var4;
    }

    gi(byte[] param0) {
        try {
          this.field_p = 0;
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(boolean param0) {
        int var2 = this.field_t[this.field_p] & 255;
        if (param0) {
          return 34;
        }
        if (128 > var2) {
          return this.f((byte) -128);
        }
        return this.c((byte) -60) - 32768;
    }

    final int c(boolean param0) {
        if (!param0) {
          field_q = (ja) null;
        }
        if (this.field_t[this.field_p] >= 0) {
          return this.c((byte) -60);
        }
        return 2147483647 & this.i(0);
    }

    final void a(boolean param0, int param1) {
        this.field_t[-4 - param1 + this.field_p] = (byte)(param1 >> 24);
        this.field_t[this.field_p - (param1 + 3)] = (byte)(param1 >> 16);
        if (!param0) {
          field_u = true;
        }
        this.field_t[-2 - param1 + this.field_p] = (byte)(param1 >> 8);
        this.field_t[-param1 + this.field_p - 1] = (byte)param1;
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
        var13 = SteelSentinels.field_G;
        try {
          var5_int = this.field_p;
          this.field_p = param0;
          var6 = (param2 - param0) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (param1 != 32203) {
                return;
              }
              this.field_p = var5_int;
              return;
            }
            var8 = this.i(0);
            var9 = this.i(0);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 >>> 5 ^ var8 << 4) ^ param3[var10 >>> 11 & 1417674755] + var10);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ var10 + param3[3 & var10]);
                continue;
              }
              break;
            }
            this.field_p = this.field_p - 8;
            this.b(true, var8);
            this.b(true, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gi.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = this.field_p;
          this.field_p = 0;
          var5 = new byte[var4_int];
          this.a(0, var5, 28, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.field_p = 0;
          this.d(var8.length, 60);
          this.a(var8.length, (byte) -122, 0, var8);
          if (param2 != -10048) {
            field_r = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("gi.K(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param1 >> 16);
        if (param0 != -28875) {
          return;
        }
        int fieldTemp$6 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$7] = (byte)(int)param1;
    }

    final int a(boolean param0) {
        if (param0) {
          field_s = (int[]) null;
        }
        this.field_p = this.field_p + 3;
        return (16711680 & this.field_t[-3 + this.field_p] << 16) + ((this.field_t[this.field_p - 2] & 255) << 8) + (this.field_t[-1 + this.field_p] & 255);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 != 28904) {
          field_u = true;
        }
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_t[fieldTemp$6] = (byte)(int)param1;
    }

    final int e(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = SteelSentinels.field_G;
        if (param0 <= 3) {
          this.field_t = (byte[]) null;
        }
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        var2 = this.field_t[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.field_p;
          this.field_p = this.field_p + 1;
          var2 = this.field_t[fieldTemp$1];
        }
        return var2 | var3;
    }

    final int f(int param0, int param1) {
        int var3 = ok.a(param1, this.field_t, this.field_p, (byte) 109);
        if (param0 > -46) {
          field_s = (int[]) null;
        }
        this.b(true, var3);
        return var3;
    }

    static {
        field_v = "Type your email address again to make sure it's correct";
        field_q = new ja();
        field_s = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
