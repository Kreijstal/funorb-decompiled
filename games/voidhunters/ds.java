/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ds extends ksa {
    static int field_g;
    int field_e;
    static int field_d;
    byte[] field_h;
    static String field_f;

    final int f(int param0) {
        if (param0 < 28) {
          return -68;
        }
        int var2 = this.field_h[this.field_e] & 255;
        if (var2 >= 128) {
          return this.e(1869) - 32768;
        }
        return this.e((byte) -110);
    }

    final int n(int param0) {
        if (param0 != -24099) {
          field_f = (String) null;
        }
        if (this.field_h[this.field_e] < 0) {
          return this.h(112) & 2147483647;
        }
        return this.e(param0 ^ -22896);
    }

    final void a(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 + (var9 - 97));
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
            if (10 == var8) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          if (param0 != -53) {
            return;
          }
          this.a(var3_long, false);
          this.a(var5, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("ds.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final int d(int param0) {
        if (param0 != 0) {
          this.g(101, -115);
        }
        int var2 = 255 & this.field_h[this.field_e];
        if (var2 < 128) {
          return -64 + this.e((byte) -89);
        }
        return this.e(1869) - 49152;
    }

    final void b(int param0, int param1) {
        if (param1 < 115) {
          this.e((byte) -63);
        }
        if (param0 < 64 &&
          param0 >= -64) {
          this.c(0, param0 + 64);
          return;
        }
        if (param0 < 16384 &&
          param0 >= -16384) {
          this.a(param0 + 49152, true);
          return;
        }
        throw new IllegalArgumentException();
    }

    final int l(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != 11436) {
          this.field_e = -36;
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        var2 = this.field_h[fieldTemp$0];
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          var2 = this.field_h[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(int param0, int[] param1, int param2, boolean param3) {
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
        var13 = VoidHunters.field_G;
        try {
          var5_int = this.field_e;
          this.field_e = param0;
          var6 = (param2 - param0) / 8;
          if (param3) {
            this.field_h = (byte[]) null;
          }
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_e = var5_int;
              return;
            }
            var8 = this.h(82);
            var9 = this.h(17);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + param1[(var10 & 7618) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ var10 + param1[var10 & 3]);
                continue;
              }
              break;
            }
            this.field_e = this.field_e - 8;
            this.d(var8, 332614536);
            this.d(var9, 332614536);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ds.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        if (param0 != 0) {
          this.a(false, 53);
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)param1;
    }

    final int i(int param0) {
        this.field_e = this.field_e + 4;
        if (param0 != 11468) {
          return 54;
        }
        return (this.field_h[this.field_e - 4] & 255) + (16711680 & this.field_h[this.field_e - 2] << 16) + (-16777216 & this.field_h[this.field_e - 1] << 24) + (65280 & this.field_h[-3 + this.field_e] << 8);
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.field_e = this.field_e + ac.a(0, param0, param1.length(), var4, this.field_h, this.field_e);
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ds.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = VoidHunters.field_G;
        if (param1 != 66) {
          field_f = (String) null;
        }
        while (param0 > this.field_e) {
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = (byte) 0;
        }
    }

    final void e(int param0, int param1) {
        this.field_h[-1 + (-param0 + this.field_e)] = (byte)param0;
        if (param1 != -129) {
          this.d((byte) -76);
        }
    }

    final byte d(byte param0) {
        if (param0 != -114) {
          this.a(1, (byte) -81);
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        return this.field_h[fieldTemp$0];
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (param1 <= 88) {
          return;
        }
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$7] = (byte)(int)param0;
    }

    final int g(int param0, int param1) {
        int var3 = k.a((byte) -69, this.field_e, this.field_h, param1);
        this.d(var3, 332614536);
        if (param0 != 1595) {
          this.c(-60);
        }
        return var3;
    }

    final void b(byte param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_e = this.field_e + ac.a(0, true, param1.length(), var4, this.field_h, this.field_e);
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_h[fieldTemp$1] = (byte)param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ds.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final long k(int param0) {
        if (param0 != 255) {
          field_g = 3;
        }
        long var2 = 4294967295L & (long)this.h(21);
        long var4 = (long)this.h(41) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void a(int param0, byte param1) {
        if (param1 != 125) {
          this.field_e = 30;
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)param0;
    }

    private final void a(long param0, boolean param1) {
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param0 >> 40);
        if (param1) {
          return;
        }
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(int param0, byte[] param1, byte param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          for (var5_int = param0; var5_int < param3 + param0; var5_int++) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            param1[var5_int] = this.field_h[fieldTemp$0];
          }
          if (param2 != -59) {
            this.b(-9, (byte) 15);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ds.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int[] param0, byte param1) {
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
        var10 = VoidHunters.field_G;
        try {
          if (param1 < 126) {
            field_d = 30;
          }
          var3_int = this.field_e / 8;
          this.field_e = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.h(70);
            var6 = this.h(103);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (0 < incrementValue$0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param0[1140850691 & var7 >>> 11] ^ (var5 << 4 ^ var5 >>> 5) + var5);
                continue;
              }
              break;
            }
            this.field_e = this.field_e - 8;
            this.d(var5, 332614536);
            this.d(var6, 332614536);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ds.NA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int var3 = -47 % ((-77 - param1) / 46);
        this.field_h[-2 + this.field_e - param0] = (byte)(param0 >> 8);
        this.field_h[-1 - param0 + this.field_e] = (byte)param0;
    }

    final int e(byte param0) {
        if (param0 >= -86) {
          return 118;
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        return this.field_h[fieldTemp$0] & 255;
    }

    final void a(int param0, boolean param1) {
        if (!param1) {
          byte[] var4 = (byte[]) null;
          this.a(90, (byte[]) null, (byte) 40, -7);
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, long param1) {
        if (param0 < 78) {
          this.a(32L, true);
        }
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$4] = (byte)(int)param1;
    }

    ds(int param0) {
        this.field_e = 0;
        this.field_h = fia.a(110, param0);
    }

    final void f(int param0, int param1) {
        if (param0 != -16384) {
          this.field_e = -11;
        }
        if ((-128 & param1) != 0) {
          if ((-16384 & param1) != 0) {
            if ((-2097152 & param1) != 0) {
              if ((param1 & -268435456) != 0) {
                this.c(0, 128 | param1 >>> 28);
              }
              this.c(param0 + 16384, (270522806 | param1) >>> 21);
            }
            this.c(0, 128 | param1 >>> 14);
          }
          this.c(0, (param1 | 16466) >>> 7);
        }
        this.c(0, 127 & param1);
    }

    final void a(boolean param0, int param1) {
        this.field_h[this.field_e - param1 - 4] = (byte)(param1 >> 24);
        if (param0) {
          return;
        }
        this.field_h[-3 + (this.field_e - param1)] = (byte)(param1 >> 16);
        this.field_h[this.field_e - param1 - 2] = (byte)(param1 >> 8);
        this.field_h[-1 + (-param1 + this.field_e)] = (byte)param1;
    }

    final String g(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        byte[] var5;
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        var2 = this.field_h[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.field_e;
        if (param0 != -1609246200) {
          var5 = (byte[]) null;
          this.a(-12, (byte[]) null, -30, 85);
        }
        do {
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
        } while (0 != this.field_h[fieldTemp$1]);
        var4 = -1 + this.field_e - var3;
        if (var4 != 0) {
          return tja.a(var3, 0, var4, this.field_h);
        }
        return "";
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)param1;
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)(param1 >> 16);
        int fieldTemp$3 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$3] = (byte)(param1 >> 24);
        if (param0 < 81) {
          this.field_h = (byte[]) null;
        }
    }

    final boolean c(int param0) {
        this.field_e = this.field_e - 4;
        if (param0 != -2780) {
          return false;
        }
        int var2 = k.a((byte) -69, this.field_e, this.field_h, 0);
        int var3 = this.h(26);
        if (var3 != var2) {
          return false;
        }
        return true;
    }

    final int e(int param0) {
        if (param0 != 1869) {
          java.math.BigInteger var3 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, (java.math.BigInteger) null, 34);
        }
        this.field_e = this.field_e + 2;
        return (255 & this.field_h[this.field_e - 1]) + ((this.field_h[this.field_e - 2] & 255) << 8);
    }

    public static void j(int param0) {
        field_f = null;
        int var1 = 47 % ((param0 - 65) / 40);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_e;
        if (param2 != 16711680) {
          return;
        }
        try {
          this.field_e = 0;
          var5 = new byte[var4_int];
          this.a(0, var5, (byte) -59, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.field_e = 0;
          this.a(var8.length, true);
          this.a(0, var8, -1, var8.length);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ds.S(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          var5_int = param0;
          if (param2 != -1) {
            this.a(-8, -51L);
          }
          while (param3 + param0 > var5_int) {
            fieldTemp$0 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_h[fieldTemp$0] = param1[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ds.WA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int h(int param0) {
        this.field_e = this.field_e + 4;
        if (param0 <= 15) {
          this.c(-31);
        }
        return (this.field_h[-3 + this.field_e] << 16 & 16711680) + ((255 & this.field_h[-4 + this.field_e]) << 24) + (65280 & this.field_h[this.field_e - 2] << 8) + (this.field_h[this.field_e - 1] & 255);
    }

    ds(byte[] param0) {
        try {
          this.field_e = 0;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ds.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String m(int param0) {
        if (this.field_h[this.field_e] == 0) {
          this.field_e = this.field_e + 1;
          return null;
        }
        if (param0 != 0) {
          this.g(35, 57);
        }
        return this.a(-1);
    }

    final void d(int param0, int param1) {
        int fieldTemp$0 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != 332614536) {
          this.a(-48L, false);
        }
        int fieldTemp$3 = this.field_e;
        this.field_e = this.field_e + 1;
        this.field_h[fieldTemp$3] = (byte)param0;
    }

    final String a(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_e;
        do {
          fieldTemp$0 = this.field_e;
          this.field_e = this.field_e + 1;
        } while (this.field_h[fieldTemp$0] != 0);
        var3 = param0 + (this.field_e - var2);
        if (var3 == 0) {
          return "";
        }
        return tja.a(var2, param0 + 1, var3, this.field_h);
    }

    final int a(boolean param0) {
        if (!param0) {
          return 78;
        }
        this.field_e = this.field_e + 2;
        int var2 = ((255 & this.field_h[this.field_e - 2]) << 8) + (this.field_h[-1 + this.field_e] & 255);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final int c(byte param0) {
        this.field_e = this.field_e + 3;
        if (param0 >= -24) {
          return 122;
        }
        return (255 & this.field_h[this.field_e - 1]) + ((255 & this.field_h[-2 + this.field_e]) << 8) + (this.field_h[-3 + this.field_e] << 16 & 16711680);
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0 &&
          128 > param1) {
          this.c(0, param1);
          return;
        }
        if (param1 >= 0 &&
          param1 < 32768) {
          this.a(param1 + 32768, true);
          return;
        }
        if (param0 <= 99) {
          this.a(-18, -103L);
        }
        throw new IllegalArgumentException();
    }

    static {
        field_g = 0;
        field_d = 4000;
        field_f = "Offer draw";
    }
}
