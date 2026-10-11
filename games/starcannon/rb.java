/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rb extends rf {
    int field_g;
    static ge field_h;
    byte[] field_f;
    static int field_i;

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        if (!param1) {
          this.g(63);
        }
        while (param0 > this.field_g) {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = StarCannon.field_A;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (65 <= var9 &&
                90 >= var9) {
                var3_long = var3_long + (long)(-63 + var9);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(2 - (-var9 + 97));
                } else {
                  if (var9 >= 48 &&
                    var9 <= 57) {
                    var3_long = var3_long + (long)(-48 + (var9 + 28));
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
          this.a(65, var3_long);
          this.a(-127, var5);
          if (param0 != -86) {
            this.f((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("rb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int d(byte param0) {
        int var2 = this.field_f[this.field_g] & 255;
        if (param0 <= 17) {
          this.f((byte) 10);
        }
        if (var2 < 128) {
          return -64 + this.j(7909);
        }
        return -49152 + this.i(-1174051992);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int var4 = -20 / ((-54 - param0) / 33);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$6] = (byte)(int)param1;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        java.applet.Applet var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 65) {
            var3 = (java.applet.Applet) null;
            rb.a((java.applet.Applet) null, 75);
          }
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) ((Object) var2);
            if (0L != ik.a(var4, (byte) 109)) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("rb.GA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 >= -67) {
          this.a(90, 18);
        }
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$3] = (byte)param1;
    }

    final void b(int param0, int param1) {
        this.field_f[-1 + (this.field_g - param0)] = (byte)param0;
        if (param1 != 31700) {
          field_i = 5;
        }
    }

    final int g(int param0) {
        int var2 = -39 % ((-27 - param0) / 60);
        this.field_g = this.field_g + 3;
        return (65280 & this.field_f[this.field_g - 2] << 8) + ((16711680 & this.field_f[this.field_g - 3] << 16) + (255 & this.field_f[-1 + this.field_g]));
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = this.field_g;
        this.field_g = 0;
        byte[] var5 = new byte[var4_int];
        this.a(var4_int, (byte) 88, var5, 0);
        java.math.BigInteger var6 = new java.math.BigInteger(var5);
        java.math.BigInteger var7 = var6.modPow(param0, param1);
        byte[] var8 = var7.toByteArray();
        this.field_g = 0;
        this.c(var8.length, param2 + 8093);
        if (param2 != -8399) {
          return;
        }
        try {
          this.a(var8, var8.length, -20144, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rb.OA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -39) {
          this.a((byte) -99, 27);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$2] = (byte)param0;
    }

    final int d(int param0) {
        int var2 = 255 & this.field_f[this.field_g];
        if (var2 < param0) {
          return this.j(7909);
        }
        return this.i(-1174051992) - 32768;
    }

    final void a(byte param0, long param1) {
        if (param0 > -41) {
          return;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$4] = (byte)(int)param1;
    }

    final byte a(boolean param0) {
        if (param0) {
          field_i = -29;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_f[fieldTemp$0];
    }

    final void a(byte param0, int param1) {
        if (param0 != 88) {
          field_i = 116;
        }
        this.field_f[-2 - param1 + this.field_g] = (byte)(param1 >> 8);
        this.field_f[-1 + (this.field_g - param1)] = (byte)param1;
    }

    final static boolean e(byte param0) {
        if (param0 != -72) {
          field_i = 68;
          return true;
        }
        return true;
    }

    final int b(byte param0, int param1) {
        if (param0 > -46) {
          return -57;
        }
        int var3 = rj.a(param1, this.field_g, (byte) 123, this.field_f);
        this.c((byte) -89, var3);
        return var3;
    }

    final void a(int[] param0, int param1, int param2, int param3) {
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
        var13 = StarCannon.field_A;
        try {
          var5_int = this.field_g;
          this.field_g = param3;
          if (param2 > -30) {
            this.a(false);
          }
          var6 = (-param3 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_g = var5_int;
              return;
            }
            var8 = this.f((byte) -128);
            var9 = this.f((byte) -123);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 << 4 ^ var8 >>> 5) + var8 ^ param0[-310378493 & var10 >>> 11] + var10);
                var10 = var10 - var11;
                var8 = var8 - (var10 + param0[3 & var10] ^ var9 + (var9 >>> 5 ^ var9 << 4));
                continue;
              }
              break;
            }
            this.field_g = this.field_g - 8;
            this.c((byte) -69, var8);
            this.c((byte) -75, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("rb.JA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final String b(byte param0) {
        if (this.field_f[this.field_g] == 0) {
          this.field_g = this.field_g + 1;
          return null;
        }
        int var2 = 118 % ((-18 - param0) / 37);
        return this.a(-38);
    }

    final String a(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_g;
        if (param0 >= -7) {
          this.a(15, 52L);
        }
        do {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
        } while (0 != this.field_f[fieldTemp$0]);
        var3 = -1 + (this.field_g - var2);
        if (var3 != 0) {
          return va.a(var2, 105, this.field_f, var3);
        }
        return "";
    }

    final int i(int param0) {
        this.field_g = this.field_g + 2;
        if (param0 != -1174051992) {
          this.j(82);
        }
        return (this.field_f[-2 + this.field_g] << 8 & 65280) + (255 & this.field_f[-1 + this.field_g]);
    }

    final boolean f(int param0) {
        this.field_g = this.field_g - 4;
        int var2 = rj.a(param0, this.field_g, (byte) 94, this.field_f);
        int var3 = this.f((byte) -89);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    final void a(boolean param0, long param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(int)(param1 >> 56);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$4] = (byte)(int)(param1 >> 24);
        if (!param0) {
          return;
        }
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$7] = (byte)(int)param1;
    }

    final String h(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        var2 = this.field_f[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        if (param0 != -12287) {
          this.field_f = (byte[]) null;
        }
        var3 = this.field_g;
        do {
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
        } while (0 != this.field_f[fieldTemp$1]);
        var4 = -1 + (-var3 + this.field_g);
        if (var4 != 0) {
          return va.a(var3, param0 + 12372, this.field_f, var4);
        }
        return "";
    }

    final void a(int param0, int param1) {
        if (param1 >= -49) {
          return;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          for (var5_int = param3; var5_int < param3 + param1; var5_int++) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_f[fieldTemp$0] = param0[var5_int];
          }
          if (param2 != -20144) {
            field_h = (ge) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rb.PA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_h = null;
        if (param0 != -59) {
          field_i = -113;
        }
    }

    final int j(int param0) {
        if (param0 != 7909) {
          this.a((byte) 45, -105);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_f[fieldTemp$0] & 255;
    }

    final void b(boolean param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        if (param0) {
          return;
        }
        try {
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.field_g = this.field_g + o.a(this.field_g, param1.length(), var4, 0, (byte) -80, this.field_f);
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rb.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        try {
          var3_int = this.field_g / 8;
          if (param0 > -22) {
            var10 = (byte[]) null;
            this.a((byte[]) null, -6, -89, 118);
          }
          this.field_g = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.f((byte) -121);
            var6 = this.f((byte) -107);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[var7 & 3] ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 << 4 ^ var5 >>> 5) ^ param1[-1736441853 & var7 >>> 11] + var7);
                continue;
              }
              break;
            }
            this.field_g = this.field_g - 8;
            this.c((byte) -102, var5);
            this.c((byte) -95, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("rb.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 88) {
            this.field_f = (byte[]) null;
          }
          for (var5_int = param3; var5_int < param0 + param3; var5_int++) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            param2[var5_int] = this.field_f[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rb.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, String param1) {
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        if (param0) {
          return;
        }
        try {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_g = this.field_g + o.a(this.field_g, param1.length(), var4, 0, (byte) -84, this.field_f);
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_f[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rb.BB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(param0 >> 8);
        if (param1 != -306) {
          this.c((byte) 114, -102);
        }
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$1] = (byte)param0;
    }

    rb(int param0) {
        this.field_f = mc.a(65536, param0);
        this.field_g = 0;
    }

    final int e(int param0) {
        int var2 = 109 % ((param0 - 12) / 47);
        if (this.field_f[this.field_g] >= 0) {
          return this.i(-1174051992);
        }
        return 2147483647 & this.f((byte) -109);
    }

    rb(byte[] param0) {
        try {
          this.field_g = 0;
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final long c(byte param0) {
        long var2 = (long)this.f((byte) -126) & 4294967295L;
        if (param0 != 5) {
          field_i = 82;
        }
        long var4 = 4294967295L & (long)this.f((byte) -104);
        return var4 + (var2 << 32);
    }

    final int f(byte param0) {
        this.field_g = this.field_g + 4;
        if (param0 >= -78) {
          return -5;
        }
        return ((this.field_f[this.field_g - 2] & 255) << 8) + (this.field_f[-4 + this.field_g] << 24 & -16777216) - (-((255 & this.field_f[this.field_g - 3]) << 16) - (this.field_f[-1 + this.field_g] & 255));
    }

    final void d(int param0, int param1) {
        if (param1 < 64 &&
          param1 >= -64) {
          this.a(64 + param1, -66);
          return;
        }
        if (param0 != 5918) {
          field_i = 25;
        }
        if (16384 > param1 &&
          -16384 <= param1) {
          this.c(49152 + param1, -306);
          return;
        }
        throw new IllegalArgumentException();
    }

    static {
        field_h = new ge();
    }
}
