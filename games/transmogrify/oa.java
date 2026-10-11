/*
 * Decompiled by CFR-JS 0.4.0.
 */
class oa extends wf {
    static String field_i;
    int field_h;
    static tf field_l;
    static int field_j;
    byte[] field_g;
    static qj field_k;
    static we[] field_m;

    final int i(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        if (param0 != 17783) {
          return 60;
        }
        fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_g[fieldTemp$0];
        var3 = 0;
        while (0 > var2) {
          var3 = (var3 | 127 & var2) << 7;
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          var2 = this.field_g[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 >= -3) {
            field_k = (qj) null;
          }
          for (var5_int = param3; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            this.field_g[fieldTemp$0] = param1[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oa.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, boolean param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)param0;
        if (!param1) {
          this.c((byte) 104);
        }
    }

    final void a(byte param0, int param1) {
        this.field_g[this.field_h - (param1 + 1)] = (byte)param1;
        if (param0 != -42) {
          this.b(-65, 48L);
        }
    }

    final long e(byte param0) {
        long var2 = 4294967295L & (long)this.c((byte) -128);
        int var6 = -53 % ((param0 - 16) / 55);
        long var4 = (long)this.c((byte) -104) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = Transmogrify.field_A ? 1 : 0;
        while (param1 > this.field_h) {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$0] = (byte) 0;
        }
        if (param0 != -30190) {
          this.field_h = -28;
        }
    }

    final static boolean f(byte param0) {
        int var1 = -82 % ((param0 + 57) / 51);
        return vh.a(ha.b(81), 0);
    }

    final void g(int param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.f(6389, 64 + param1);
          return;
        }
        if (param0 != -21770) {
          this.h(64);
        }
        if (param1 < 16384 &&
          -16384 <= param1) {
          this.c(param1 + 49152, -159688920);
          return;
        }
        throw new IllegalArgumentException();
    }

    final static mi a(int param0, ci param1, ci param2, int param3, int param4) {
        RuntimeException var5 = null;
        mi stackIn_2_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -123) {
            stackIn_2_0 = (mi) null;
            return stackIn_2_0;
          }
          if (!rl.a(param4, 0, param3, param2)) {
            return null;
          }
          stackIn_7_0 = ea.a(param1.a((byte) -93, param4, param3), 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("oa.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 != 2) {
            this.d(97, 26);
          }
          for (var5_int = param3; param3 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            param2[var5_int] = this.field_g[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("oa.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final int h(int param0) {
        if (param0 != -16777216) {
          oa.f((byte) -10);
        }
        if (this.field_g[this.field_h] >= 0) {
          return this.a((byte) -111);
        }
        return 2147483647 & this.c((byte) -104);
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        var2 = this.field_g[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (param0 < 25) {
          this.g(-108, 29);
        }
        var3 = this.field_h;
        do {
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (this.field_g[fieldTemp$1] != 0);
        var4 = -var3 + this.field_h - 1;
        if (var4 != 0) {
          return cc.a(var3, 15923, var4, this.field_g);
        }
        return "";
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
          if (param1 < 122) {
            this.c(18, 97);
          }
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.field_h = this.field_h + rb.a(this.field_h, var4, this.field_g, param0.length(), (byte) -116, 0);
          fieldTemp$1 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oa.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        int var4_int = this.field_h;
        this.field_h = 0;
        if (param1 > -115) {
          return;
        }
        try {
          var5 = new byte[var4_int];
          this.a(var4_int, 2, var5, 0);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.field_h = 0;
          this.c(var8.length, -159688920);
          this.a((byte) -11, var8, var8.length, 0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oa.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 + 2 - 65);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-97 + (2 + var9));
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
          this.a(1543687520, var3_long);
          this.a(1543687520, var5);
          if (param0 <= 105) {
            field_j = -123;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("oa.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        int var4 = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          int var3_int = 64 / ((param0 + 47) / 60);
          var4 = param1.indexOf('\0');
          if (var4 >= 0) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param1);
          this.field_h = this.field_h + rb.a(this.field_h, var5, this.field_g, param1.length(), (byte) -116, 0);
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
          this.field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oa.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int k(int param0) {
        int var2 = 255 & this.field_g[this.field_h];
        if (param0 > var2) {
          return -64 + this.d((byte) 47);
        }
        return this.a((byte) -93) - 49152;
    }

    final int g(byte param0) {
        if (param0 != 124) {
          java.math.BigInteger var3 = (java.math.BigInteger) null;
          this.a((java.math.BigInteger) null, -98, (java.math.BigInteger) null);
        }
        this.field_h = this.field_h + 3;
        return (this.field_g[-2 + this.field_h] << 8 & 65280) + ((this.field_g[-3 + this.field_h] << 16 & 16711680) + (this.field_g[-1 + this.field_h] & 255));
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
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = this.field_h / 8;
          this.field_h = 0;
          if (param1 <= 98) {
            return;
          }
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.c((byte) -123);
            var6 = this.c((byte) -116);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ param0[3 & var7] + var7);
                var7 = var7 + var8;
                var6 = var6 + (var7 + param0[(7221 & var7) >>> 11] ^ (var5 << 4 ^ var5 >>> 5) + var5);
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.a(-126, var5);
            this.a(-105, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("oa.FA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final byte b(boolean param0) {
        if (!param0) {
          this.c(125, -50);
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return this.field_g[fieldTemp$0];
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 != 12248) {
          this.field_g = (byte[]) null;
        }
        var2 = this.field_h;
        do {
          fieldTemp$0 = this.field_h;
          this.field_h = this.field_h + 1;
        } while (this.field_g[fieldTemp$0] != 0);
        var3 = -var2 + this.field_h - 1;
        if (var3 != 0) {
          return cc.a(var2, 15923, var3, this.field_g);
        }
        return "";
    }

    final int f(int param0) {
        int var2 = 255 & this.field_g[this.field_h];
        if (param0 >= -24) {
          this.f(75);
        }
        if (var2 < 128) {
          return this.d((byte) 115);
        }
        return -32768 + this.a((byte) -99);
    }

    final void i(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 <= 43) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, false, -55, 109);
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)param0;
    }

    final void j(int param0, int param1) {
        this.field_g[-param1 + this.field_h - 4] = (byte)(param1 >> 24);
        this.field_g[-3 + (-param1 + this.field_h)] = (byte)(param1 >> 16);
        this.field_g[-2 - param1 + this.field_h] = (byte)(param1 >> 8);
        this.field_g[this.field_h - param1 - 1] = (byte)param1;
        if (param0 != 567) {
          field_i = (String) null;
        }
    }

    final int a(byte param0) {
        this.field_h = this.field_h + 2;
        if (param0 >= -84) {
          this.b(-26, -89L);
        }
        return ((this.field_g[-2 + this.field_h] & 255) << 8) + (255 & this.field_g[this.field_h - 1]);
    }

    final boolean d(int param0) {
        if (param0 != 5432) {
          byte[] var4 = (byte[]) null;
          this.a((byte) -26, (byte[]) null, -22, -93);
        }
        this.field_h = this.field_h - 4;
        int var2 = sg.a(0, (byte) -22, this.field_h, this.field_g);
        int var3 = this.c((byte) -106);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final int d(byte param0) {
        if (param0 < 21) {
          return 90;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        return 255 & this.field_g[fieldTemp$0];
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)param1;
        if (param0 != 6389) {
          this.field_h = 49;
        }
    }

    final void e(int param0, int param1) {
        if (0 != (-128 & param0)) {
          if ((-16384 & param0) != 0) {
            if ((-2097152 & param0) != 0) {
              if ((param0 & -268435456) != 0) {
                this.f(param1 ^ -268429067, param0 >>> 28 | 128);
              }
              this.f(param1 ^ -268429067, (269616035 | param0) >>> 21);
            }
            this.f(6389, (2098829 | param0) >>> 14);
          }
          this.f(param1 + 268441845, (16481 | param0) >>> 7);
        }
        if (param1 != -268435456) {
          field_j = -120;
        }
        this.f(6389, 127 & param0);
    }

    final int c(byte param0) {
        if (param0 >= -103) {
          return 54;
        }
        this.field_h = this.field_h + 4;
        return (65280 & this.field_g[this.field_h - 2] << 8) + (this.field_g[this.field_h - 4] << 24 & -16777216) + ((this.field_g[this.field_h - 3] << 16 & 16711680) + (this.field_g[-1 + this.field_h] & 255));
    }

    oa(int param0) {
        this.field_g = vk.a(param0, -86);
        this.field_h = 0;
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -159688920) {
          field_l = (tf) null;
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 >> 24);
        if (param0 >= -94) {
          field_k = (qj) null;
        }
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)param1;
    }

    final int d(int param0, int param1) {
        if (param1 != -1323322296) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, 127);
        }
        int var3 = sg.a(param0, (byte) -103, this.field_h, this.field_g);
        this.a(-127, var3);
        return var3;
    }

    final String j(int param0) {
        if (param0 != -1640531527) {
          field_j = 89;
        }
        if (0 == this.field_g[this.field_h]) {
          this.field_h = this.field_h + 1;
          return null;
        }
        return this.g(12248);
    }

    final void b(int param0, int param1) {
        this.field_g[-2 + this.field_h - param1] = (byte)(param1 >> 8);
        this.field_g[this.field_h + (-param1 - 1)] = (byte)param1;
        if (param0 >= -108) {
          byte[] var4 = (byte[]) null;
          this.a(15, 46, (byte[]) null, -117);
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
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1) {
            field_k = (qj) null;
          }
          var5_int = this.field_h;
          this.field_h = param2;
          var6 = (-param2 + param3) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_h = var5_int;
              return;
            }
            var8 = this.c((byte) -127);
            var9 = this.c((byte) -113);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var8 + (var8 >>> 5 ^ var8 << 4) ^ var10 + param0[(6389 & var10) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - ((var9 >>> 5 ^ var9 << 4) + var9 ^ param0[3 & var10] + var10);
                continue;
              }
              break;
            }
            this.field_h = this.field_h - 8;
            this.a(-118, var8);
            this.a(-121, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("oa.N(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    oa(byte[] param0) {
        try {
          this.field_h = 0;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 != 1543687520) {
          this.a((byte) -86, -99);
        }
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(int param0, long param1) {
        if (param0 != 1908720528) {
          field_i = (String) null;
        }
        int fieldTemp$0 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_h;
        this.field_h = this.field_h + 1;
        this.field_g[fieldTemp$7] = (byte)(int)param1;
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = -75 % ((6 - param0) / 40);
        field_i = null;
    }

    static {
        field_i = "Account created successfully!";
        field_j = 0;
        field_l = new tf(2, 4, 4, 0);
    }
}
