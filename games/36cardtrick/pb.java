/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pb extends qb {
    byte[] field_g;
    static kc field_k;
    static int field_j;
    int field_i;
    static boolean field_h;

    final void f(int param0, int param1) {
        this.field_g[-1 + (this.field_i - param0)] = (byte)param0;
        if (param1 == 8049) {
          return;
        }
        this.field_g = (byte[]) null;
    }

    final int e(boolean param0) {
        if (!param0) {
          this.f(35, -38);
          this.field_i = this.field_i + 3;
          return ((255 & this.field_g[-2 + this.field_i]) << 8) + ((this.field_g[-3 + this.field_i] << 16 & 16711680) + (255 & this.field_g[this.field_i - 1]));
        }
        this.field_i = this.field_i + 3;
        return ((255 & this.field_g[-2 + this.field_i]) << 8) + ((this.field_g[-3 + this.field_i] << 16 & 16711680) + (255 & this.field_g[this.field_i - 1]));
    }

    final byte a(boolean param0) {
        int fieldTemp$0 = 0;
        if (!param0) {
          this.b(-119, -24);
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_g[fieldTemp$0];
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_g[fieldTemp$1];
    }

    private final void b(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int var4 = -33 / ((param1 + 31) / 52);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$6] = (byte)(int)param0;
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
        int[] var14 = null;
        var13 = Main.field_T;
        try {
          var5_int = this.field_i;
          this.field_i = param0;
          if (param2 > -107) {
            var14 = (int[]) null;
            this.a((int[]) null, 32);
          }
          var6 = (-param0 + param1) / 8;
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_i = var5_int;
              return;
            }
            var8 = this.e((byte) 126);
            var9 = this.e((byte) 126);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (var10 + param3[343932931 & var10 >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                var10 = var10 - var11;
                var8 = var8 - (param3[var10 & 3] + var10 ^ (var9 << 4 ^ var9 >>> 5) + var9);
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.a(-246, var8);
            this.a(-246, var9);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 56);
        if (param1 != 98) {
          return;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$7] = (byte)(int)param0;
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
          this.a(param2 + 15893, var5, 0, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param1, param0);
          var8 = var7.toByteArray();
          this.field_i = 0;
          this.e(var8.length, 26040);
          if (param2 != -15792) {
            field_k = (kc) null;
          }
          this.a(var8.length, 0, var8, (byte) -113);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.HA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        h.a(param0, (byte) 52, "");
        if (param1 < 4) {
          return;
        }
        try {
          wh.a(param0, 63);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        var2 = this.field_g[fieldTemp$0];
        var3 = 10 / ((33 - param0) / 53);
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        var4 = this.field_i;
        do {
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_g[fieldTemp$1] != 0);
        var5 = -var4 + this.field_i - 1;
        if (var5 != 0) {
          return bd.a(255, var4, this.field_g, var5);
        }
        return "";
    }

    final void d(int param0, int param1) {
        this.field_g[-param0 + (this.field_i - 2)] = (byte)(param0 >> 8);
        this.field_g[-1 - param0 + this.field_i] = (byte)param0;
        if (param1 == -27308) {
          return;
        }
        String var4 = (String) null;
        this.a(-105, (String) null);
    }

    final int b(int param0, byte param1) {
        int var3 = ml.a(this.field_g, param0, this.field_i, param1 ^ 12014);
        this.a(-246, var3);
        if (param1 != 5) {
          field_k = (kc) null;
          return var3;
        }
        return var3;
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          if (param0 != 744825352) {
            this.d(80);
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_g[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_i = this.field_i + hi.a(param1.length(), 0, this.field_g, var4, this.field_i, false);
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_g[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(li param0, int param1) {
        try {
          if (param1 != 13427) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            pb.a((java.applet.Applet) null, (byte) -39);
          }
          bg.field_tb.a(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.GA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)param0;
        if (param1 == 60) {
          return;
        }
        field_k = (kc) null;
    }

    final int b(boolean param0) {
        if (param0) {
          return 99;
        }
        if (0 <= this.field_g[this.field_i]) {
          return this.d((byte) 72);
        }
        return 2147483647 & this.e((byte) 126);
    }

    final void b(String param0, int param1) {
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          var3_long = 0L;
          if (param1 != 15045) {
            field_h = false;
          }
          var5 = 0L;
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + var9 + 2);
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-97 + (var9 + 2));
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
            if (var8 == 10) {
              var5 = var3_long;
              var3_long = 0L;
            }
          }
          this.b(var3_long, 87);
          this.b(var5, -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("pb.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(byte param0) {
        this.field_i = this.field_i + 2;
        if (param0 != 72) {
          field_k = (kc) null;
          return ((this.field_g[-2 + this.field_i] & 255) << 8) + (this.field_g[-1 + this.field_i] & 255);
        }
        return ((this.field_g[-2 + this.field_i] & 255) << 8) + (this.field_g[-1 + this.field_i] & 255);
    }

    final int f(int param0) {
        int var2 = -93 / ((-40 - param0) / 54);
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        return this.field_g[fieldTemp$0] & 255;
    }

    final long d(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var2Lifetime1;
        long var4Lifetime1;
        if (!param0) {
          int[] var6 = (int[]) null;
          this.a((int[]) null, -115);
          var2 = (long)this.e((byte) 125) & 4294967295L;
          var4 = (long)this.e((byte) 125) & 4294967295L;
          return var4 + (var2 << 32);
        }
        var2Lifetime1 = (long)this.e((byte) 125) & 4294967295L;
        var4Lifetime1 = (long)this.e((byte) 125) & 4294967295L;
        return var4Lifetime1 + (var2Lifetime1 << 32);
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
        var6 = Main.field_T;
        try {
          if (param0 <= 1) {
            this.f((byte) 15);
          }
          for (var5_int = param2; param2 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            param1[var5_int] = this.field_g[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("pb.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)(int)param0;
        if (param1 > 94) {
          return;
        }
        this.f((byte) 48);
    }

    final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        if (param0 != -1) {
          field_h = false;
          this.field_i = this.field_i - 4;
          var2 = ml.a(this.field_g, 0, this.field_i, 12011);
          var3 = this.e((byte) 124);
          if (var2 == var3) {
            return true;
          }
          return false;
        }
        this.field_i = this.field_i - 4;
        var2Lifetime1 = ml.a(this.field_g, 0, this.field_i, 12011);
        var3Lifetime1 = this.e((byte) 124);
        if (var2Lifetime1 == var3Lifetime1) {
          return true;
        }
        return false;
    }

    final int a(int param0) {
        int var2 = 255 & this.field_g[this.field_i];
        if (param0 != 0) {
          this.c(false);
          if (var2 >= 128) {
            return this.d((byte) 72) - 32768;
          }
          return this.f(-107);
        }
        if (var2 >= 128) {
          return this.d((byte) 72) - 32768;
        }
        return this.f(-107);
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != 19235) {
            this.a(-127L, -81);
          }
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_i = this.field_i + hi.a(param0.length(), 0, this.field_g, var4, this.field_i, false);
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_g[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Main.field_T;
        try {
          var5_int = param1;
          if (param3 > -73) {
            this.b(51L, -75);
          }
          while (var5_int < param0 + param1) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$0] = param2[var5_int];
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pb.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 < 56) {
          field_h = true;
          field_k = null;
          return;
        }
        field_k = null;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0 != -124) {
                field_h = false;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(fh.a(param1, var2, -1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pb.U(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String f(byte param0) {
        if (this.field_g[this.field_i] == 0) {
          this.field_i = this.field_i + 1;
          return null;
        }
        if (param0 != 29) {
          return (String) null;
        }
        return this.c(false);
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 != -9469) {
          field_h = true;
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_g[fieldTemp$0] = (byte)param1;
          return;
        }
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)param1;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = Main.field_T;
        try {
          var3_int = this.field_i / param1;
          this.field_i = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              return;
            }
            var5 = this.e((byte) 124);
            var6 = this.e((byte) 126);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$2 = var9;
              var9--;
              if (0 < incrementValue$2) {
                var5 = var5 + ((var6 >>> 5 ^ var6 << 4) + var6 ^ var7 + param0[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + ((var5 >>> 5 ^ var5 << 4) + var5 ^ param0[(var7 & 7068) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.field_i = this.field_i - 8;
            this.a(param1 ^ -254, var5);
            this.a(param1 - 254, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pb.CA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final String c(boolean param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        String var4;
        var2 = this.field_i;
        do {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
        } while (this.field_g[fieldTemp$0] != 0);
        var3 = -1 + (this.field_i - var2);
        if (0 == var3) {
          return "";
        }
        if (!param0) {
          return bd.a(255, var2, this.field_g, var3);
        }
        var4 = (String) null;
        this.a((String) null, 84);
        return bd.a(255, var2, this.field_g, var3);
    }

    final int b(byte param0) {
        int var2 = this.field_g[this.field_i] & 255;
        if (param0 != 59) {
          this.b((byte) 40);
          if (128 <= var2) {
            return this.d((byte) 72) - 49152;
          }
          return -64 + this.f(80);
        }
        if (128 <= var2) {
          return this.d((byte) 72) - 49152;
        }
        return -64 + this.f(80);
    }

    final void e(int param0, int param1) {
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)param0;
        if (param1 == 26040) {
          return;
        }
        String var4 = (String) null;
        this.b((String) null, 9);
    }

    final int e(byte param0) {
        if (param0 <= 123) {
          return 14;
        }
        this.field_i = this.field_i + 4;
        return (16711680 & this.field_g[this.field_i - 3] << 16) + (((this.field_g[this.field_i - 4] & 255) << 24) + ((255 & this.field_g[this.field_i - 2]) << 8)) + (255 & this.field_g[this.field_i - 1]);
    }

    final void a(int param0, int param1) {
        int fieldTemp$3 = 0;
        int fieldTemp$0 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$1] = (byte)(param1 >> 16);
        int fieldTemp$2 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$2] = (byte)(param1 >> 8);
        if (param0 != -246) {
          field_k = (kc) null;
          fieldTemp$3 = this.field_i;
          this.field_i = this.field_i + 1;
          this.field_g[fieldTemp$3] = (byte)param1;
          return;
        }
        int fieldTemp$4 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_g[fieldTemp$4] = (byte)param1;
    }

    pb(int param0) {
        this.field_g = nh.a(-61, param0);
        this.field_i = 0;
    }

    pb(byte[] param0) {
        try {
          this.field_i = 0;
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "pb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var4;
        var4 = Main.field_T;
        if (param0 == 1442653008) {
          while (this.field_i < param1) {
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$1] = (byte) 0;
          }
        } else {
          this.b(false);
          while (this.field_i < param1) {
            fieldTemp$0 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_g[fieldTemp$0] = (byte) 0;
          }
        }
    }

    static {
        field_h = false;
    }
}
