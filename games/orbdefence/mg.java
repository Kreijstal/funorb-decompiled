/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mg extends ca {
    static va field_m;
    static boolean field_g;
    int field_i;
    static String field_h;
    byte[] field_j;
    static ea field_k;
    static int field_f;
    static im field_l;

    final void a(int param0, int param1) {
        if (param1 > -3) {
          field_m = (va) null;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)param0;
    }

    final int b(byte param0) {
        if (param0 != 90) {
          String var3 = (String) null;
          this.a((String) null, -65);
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return 255 & this.field_j[fieldTemp$0];
    }

    final void a(int[] param0, int param1) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = -102 % ((param1 - 53) / 53);
          var3_int = this.field_i / 8;
          this.field_i = 0;
          var5 = 0;
          while (true) {
            if (var5 >= var3_int) {
              return;
            }
            var6 = this.l(0);
            var7 = this.l(0);
            var8 = 0;
            var9 = -1640531527;
            var10 = 32;
            while (true) {
              incrementValue$2 = var10;
              var10--;
              if (0 < incrementValue$2) {
                var6 = var6 + ((var7 >>> 5 ^ var7 << 4) + var7 ^ param0[3 & var8] + var8);
                var8 = var8 + var9;
                var7 = var7 + ((var6 << 4 ^ var6 >>> 5) + var6 ^ param0[1648361475 & var8 >>> 11] + var8);
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.b(var6, -1);
            this.b(var7, -1);
            var5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("mg.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 8);
        if (param1 <= 100) {
          this.h(47);
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)param0;
    }

    final int a(byte param0) {
        this.field_i = this.field_i + 3;
        if (param0 != -30) {
          String var3 = (String) null;
          this.a(false, (String) null);
        }
        return ((this.field_j[-3 + this.field_i] & 255) << 16) + ((this.field_j[-2 + this.field_i] << 8 & 65280) + (255 & this.field_j[-1 + this.field_i]));
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 != -16943) {
          field_k = (ea) null;
        }
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$7] = (byte)(int)param0;
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != 10) {
          mg.c(-9);
        }
        field_l = null;
        field_h = null;
        field_m = null;
    }

    final String f(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_j[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (param0 < 77) {
          this.f(-19, -48);
        }
        var3 = this.field_i;
        do {
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_j[fieldTemp$1] != 0);
        var4 = -1 + this.field_i - var3;
        if (var4 != 0) {
          return tj.a(var4, var3, 0, this.field_j);
        }
        return "";
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 != -11) {
            return;
          }
          for (var5_int = param0; param0 + param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$0] = param3[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("mg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String i(int param0) {
        if (param0 == ~this.field_j[this.field_i]) {
          this.field_i = this.field_i + 1;
          return null;
        }
        return this.g(param0 ^ -3);
    }

    final void d(int param0, int param1) {
        this.field_j[param1 + (-param0 + this.field_i)] = (byte)(param0 >> 8);
        this.field_j[this.field_i - (param0 + 1)] = (byte)param0;
    }

    final int e(int param0) {
        if (param0 <= 118) {
          return 9;
        }
        int var2 = this.field_j[this.field_i] & 255;
        if (var2 >= 128) {
          return -32768 + this.j(98203176);
        }
        return this.b((byte) 90);
    }

    final static void d(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = nk.field_q;
        synchronized (var1) {
          of.field_G = db.field_f;
          nl.field_d = nl.field_d + 1;
          ua.field_a = bl.field_g;
          if (param0 >= -13) {
            mg.a(-118, (byte) -31);
          }
          vl.field_d = ic.field_g;
          kd.field_d = tf.field_m;
          tf.field_m = false;
          gi.field_e = eh.field_c;
          ig.field_fb = vg.field_p;
          bg.field_c = id.field_b;
          eh.field_c = 0;
          lg.field_a = sd.field_c;
        }
    }

    final int k(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_j[fieldTemp$0];
        var3 = param0;
        while (0 > var2) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          var2 = this.field_j[fieldTemp$1];
        }
        return var3 | var2;
    }

    final static int a(int param0, byte param1) {
        int var2;
        if (param1 > -19) {
          return -63;
        }
        var2 = param0;
        if (param0 == 11) {
          var2 = 10;
        } else {
          if (param0 == 7 &&
            ok.a(0, false)) {
            var2 = 11;
          }
        }
        return var2;
    }

    final void g(int param0, int param1) {
        if (param1 != 1) {
          this.d(true);
        }
        this.field_j[-4 + this.field_i - param0] = (byte)(param0 >> 24);
        this.field_j[-3 + (-param0 + this.field_i)] = (byte)(param0 >> 16);
        this.field_j[-param0 + (this.field_i - 2)] = (byte)(param0 >> 8);
        this.field_j[-1 + this.field_i - param0] = (byte)param0;
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0) {
            field_g = false;
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_i = this.field_i + ue.a(param1.length(), var4, (byte) -86, 0, this.field_j, this.field_i);
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "mg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(boolean param0) {
        if (!param0) {
          return -10;
        }
        int var2 = this.field_j[this.field_i] & 255;
        if (128 <= var2) {
          return -49152 + this.j(98203176);
        }
        return -64 + this.b((byte) 90);
    }

    final void a(byte param0, byte[] param1, int param2, int param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = param2;
          if (param0 < 90) {
            return;
          }
          while (var5_int < param2 + param3) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            param1[var5_int] = this.field_j[fieldTemp$0];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("mg.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final byte d(int param0) {
        if (param0 != -20398) {
          this.field_i = -110;
        }
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_j[fieldTemp$0];
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != -115) {
          return;
        }
        while (this.field_i < param1) {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != -6528) {
            this.field_j = (byte[]) null;
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_i = this.field_i + ue.a(param0.length(), var4, (byte) -86, 0, this.field_j, this.field_i);
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "mg.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final long c(byte param0) {
        long var2 = (long)this.l(0) & 4294967295L;
        if (param0 != -89) {
          this.d(61, -62);
        }
        long var4 = 4294967295L & (long)this.l(0);
        return var4 + (var2 << 32);
    }

    final String g(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_i;
        if (param0 != 2) {
          this.e(-29, -98);
        }
        do {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_j[fieldTemp$0] != 0);
        var3 = -1 - var2 + this.field_i;
        if (var3 == 0) {
          return "";
        }
        return tj.a(var3, var2, param0 - 2, this.field_j);
    }

    final void a(byte param0, String param1) {
        int var9 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          var7 = -105 % ((-7 - param0) / 62);
          var3_long = 0L;
          var5 = 0L;
          var8 = param1.length();
          for (var9 = 19; var9 >= 0; var9--) {
            var3_long = var3_long * 38L;
            if (var9 < var8) {
              var10 = param1.charAt(var9);
              if (var10 >= 65 &&
                90 >= var10) {
                var3_long = var3_long + (long)(2 + var10 - 65);
              } else {
                if (var10 >= 97 &&
                  122 >= var10) {
                  var3_long = var3_long + (long)(var10 + 2 - 97);
                } else {
                  if (48 <= var10 &&
                    57 >= var10) {
                    var3_long = var3_long + (long)(-48 + (28 + var10));
                  } else {
                    var3_long = var3_long + 1L;
                  }
                }
              }
            }
            if (var9 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.a(-3357, var3_long);
          this.a(-3357, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("mg.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int j(int param0) {
        this.field_i = this.field_i + 2;
        if (param0 != 98203176) {
          field_g = true;
        }
        return (this.field_j[this.field_i - 1] & 255) + (this.field_j[-2 + this.field_i] << 8 & 65280);
    }

    final void a(int param0, int param1, boolean param2, int[] param3) {
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
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = this.field_i;
          this.field_i = param0;
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              if (param2) {
                this.field_j = (byte[]) null;
              }
              this.field_i = var5_int;
              return;
            }
            var8 = this.l(0);
            var9 = this.l(0);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[(6167 & var10) >>> 11] ^ var8 + (var8 >>> 5 ^ var8 << 4));
                var10 = var10 - var11;
                var8 = var8 - (var10 + param3[3 & var10] ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.b(var8, -1);
            this.b(var9, -1);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mg.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param1 >> 16);
        if (param0 != -3357) {
          this.b((byte) 14, -76);
        }
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$6] = (byte)(int)param1;
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)param1;
        if (param0 != -60) {
          this.a(-11, 63L);
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(param0 >> 8);
        if (param1 != -1) {
          byte[] var4 = (byte[]) null;
          this.a((byte) -60, (byte[]) null, -13, 28);
        }
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)param0;
    }

    final void c(byte param0, int param1) {
        this.field_j[-1 + this.field_i - param1] = (byte)param1;
        int var3 = -29 % ((param0 - 66) / 46);
    }

    final int e(int param0, int param1) {
        if (param0 != -18951) {
          return 41;
        }
        int var3 = sd.a(param1, this.field_j, this.field_i, 0);
        this.b(var3, param0 + 18950);
        return var3;
    }

    final boolean h(int param0) {
        this.field_i = this.field_i - 4;
        int var2 = sd.a(0, this.field_j, this.field_i, 0);
        int var3 = this.l(0);
        if (var3 == var2) {
          return true;
        }
        if (param0 != 9982) {
          return false;
        }
        return false;
    }

    mg(int param0) {
        this.field_i = 0;
        this.field_j = q.a(param0, (byte) 121);
    }

    final int d(boolean param0) {
        if (!param0) {
          byte[] var3 = (byte[]) null;
          this.a((byte) -88, (byte[]) null, -94, -42);
        }
        if (this.field_j[this.field_i] >= 0) {
          return this.j(98203176);
        }
        return this.l(0) & 2147483647;
    }

    final void f(int param0, int param1) {
        if (param0 != -1) {
          this.c((byte) 106, -63);
        }
        if (param1 < 64 &&
          -64 <= param1) {
          this.a(64 + param1, param0 - 102);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.b((byte) -60, 49152 + param1);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void a(byte param0, int param1) {
        if (param0 > -31) {
          return;
        }
        if ((param1 & -128) != 0) {
          if ((param1 & -16384) != 0) {
            if ((param1 & -2097152) != 0) {
              if ((param1 & -268435456) != 0) {
                this.a(128 | param1 >>> 28, -102);
              }
              this.a(param1 >>> 21 | 128, -4);
            }
            this.a(128 | param1 >>> 14, -106);
          }
          this.a(128 | param1 >>> 7, -90);
        }
        this.a(param1 & 127, -70);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_i;
          this.field_i = 0;
          var5 = new byte[var4_int];
          this.a((byte) 91, var5, 0, var4_int);
          if (param2 != 27551) {
            this.d(59, 73);
          }
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          this.field_i = 0;
          this.b((byte) -60, var8.length);
          this.a(0, var8.length, (byte) -11, var8);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "mg.I(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    mg(byte[] param0) {
        try {
          this.field_j = param0;
          this.field_i = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int l(int param0) {
        this.field_i = this.field_i + 4;
        if (param0 != 0) {
          this.field_j = (byte[]) null;
        }
        return ((this.field_j[this.field_i - 2] & 255) << 8) + ((255 & this.field_j[-3 + this.field_i]) << 16) + (((255 & this.field_j[this.field_i - 4]) << 24) + (this.field_j[-1 + this.field_i] & 255));
    }

    final void b(int param0, long param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> 24);
        if (param0 < 99) {
          return;
        }
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_j[fieldTemp$4] = (byte)(int)param1;
    }

    static {
        field_h = "Awesomo";
        field_m = new va();
        field_f = 64;
        field_l = new im();
    }
}
