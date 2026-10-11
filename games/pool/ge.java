/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ge extends ma {
    static String field_o;
    static String field_n;
    static jg field_q;
    static String field_m;
    static int[] field_p;
    static String field_r;
    static le field_u;
    int field_v;
    static vh field_s;
    static String field_w;
    static String field_x;
    byte[] field_t;
    static int field_l;

    final void a(int param0, byte param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 > -113) {
            return;
          }
          for (var5_int = param0; var5_int < param0 + param3; var5_int++) {
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            param2[var5_int] = this.field_t[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ge.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final int f(int param0) {
        if (param0 <= 43) {
          this.l(-98);
        }
        this.field_v = this.field_v + 3;
        return (this.field_t[this.field_v - 1] & 255) + ((this.field_t[this.field_v - 3] << 16 & 16711680) + ((255 & this.field_t[-2 + this.field_v]) << 8));
    }

    final void a(byte[] param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 0) {
            field_n = (String) null;
          }
          for (var5_int = param2; var5_int < param3 + param2; var5_int++) {
            fieldTemp$0 = this.field_v;
            this.field_v = this.field_v + 1;
            this.field_t[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ge.PA(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        this.field_v = this.field_v - 4;
        if (param0) {
          this.a(true);
        }
        int var2 = oa.a(0, this.field_v, -1, this.field_t);
        int var3 = this.b(true);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final int i(int param0) {
        if (param0 >= -2) {
          return 77;
        }
        int var2 = this.field_t[this.field_v] & 255;
        if (var2 < 128) {
          return -64 + this.g(-60);
        }
        return this.d(-1034) - 49152;
    }

    final String m(int param0) {
        if (this.field_t[this.field_v] == 0) {
          this.field_v = this.field_v + 1;
          return null;
        }
        if (param0 < 106) {
          this.a((byte) -12, -102);
        }
        return this.j(-112);
    }

    final int l(int param0) {
        this.field_v = this.field_v + 3;
        int var2 = (65280 & this.field_t[-2 + this.field_v] << 8) + (((255 & this.field_t[-3 + this.field_v]) << 16) + (this.field_t[this.field_v - 1] & 255));
        if (var2 > 8388607) {
          var2 = var2 - 16777216;
        }
        if (param0 != 0) {
          return 110;
        }
        return var2;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> 48);
        if (param1 >= -75) {
          return;
        }
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param0 >> 24);
        int fieldTemp$5 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$7] = (byte)(int)param0;
    }

    private final void a(long param0, int param1) {
        int var4 = 122 % ((30 - param1) / 51);
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$6] = (byte)(int)param0;
    }

    final int g(int param0) {
        if (param0 >= -59) {
          this.g(-3);
        }
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        return 255 & this.field_t[fieldTemp$0];
    }

    final int c(byte param0) {
        if (param0 != -115) {
          String var3 = (String) null;
          this.a((String) null, 68);
        }
        int var2 = this.field_t[this.field_v] & 255;
        if (var2 < 128) {
          return this.g(-82);
        }
        return this.d(-1034) - 32768;
    }

    final void a(String param0, int param1) {
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
        try {
          var3_long = 0L;
          var5 = 0L;
          if (param1 < 77) {
            return;
          }
          var7 = param0.length();
          for (var8 = 19; 0 <= var8; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param0.charAt(var8);
              if (65 <= var9 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(2 + (var9 - 65));
              } else if (97 <= var9 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(-97 + var9 + 2);
              } else if (48 <= var9 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(28 + (var9 - 48));
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
          this.a(var3_long, -47);
          this.a(var5, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("ge.K(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int[] param1) {
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
        String var10 = null;
        try {
          if (param0 != 32052) {
            var10 = (String) null;
            this.a((String) null, 85);
          }
          var3_int = this.field_v / 8;
          this.field_v = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              return;
            }
            var5 = this.b(true);
            var6 = this.b(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var7 + param1[3 & var7] ^ var6 + (var6 >>> 5 ^ var6 << 4));
                var7 = var7 + var8;
                var6 = var6 + (var7 + param1[(6753 & var7) >>> 11] ^ var5 + (var5 >>> 5 ^ var5 << 4));
                continue;
              }
              break;
            }
            this.field_v = this.field_v - 8;
            this.a(true, var5);
            this.a(true, var6);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ge.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param0 >> 16);
        if (param1 <= 37) {
          this.field_v = 87;
        }
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)param0;
    }

    final int k(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        var2 = this.field_t[fieldTemp$0];
        var4 = 22 % ((param0 - 0) / 63);
        var3 = 0;
        while (var2 < 0) {
          var3 = (var3 | var2 & 127) << 7;
          fieldTemp$1 = this.field_v;
          this.field_v = this.field_v + 1;
          var2 = this.field_t[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 24);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(param1 >> 16);
        if (!param0) {
          return;
        }
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(param1 >> 8);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)param1;
    }

    public static void e(int param0) {
        if (param0 != 4109) {
          field_m = (String) null;
        }
        field_o = null;
        field_m = null;
        field_s = null;
        field_r = null;
        field_n = null;
        field_u = null;
        field_x = null;
        field_p = null;
        field_q = null;
        field_w = null;
    }

    final int b(boolean param0) {
        this.field_v = this.field_v + 4;
        if (!param0) {
          return 15;
        }
        return (255 & this.field_t[this.field_v - 1]) + (65280 & this.field_t[-2 + this.field_v] << 8) + (this.field_t[-4 + this.field_v] << 24 & -16777216) + (16711680 & this.field_t[-3 + this.field_v] << 16);
    }

    final void a(int param0, byte param1) {
        this.field_t[-4 + (this.field_v - param0)] = (byte)(param0 >> 24);
        this.field_t[this.field_v - param0 - 3] = (byte)(param0 >> 16);
        if (param1 > -90) {
          int[] var4 = (int[]) null;
          this.a(125, -118, (int[]) null, -41);
        }
        this.field_t[-2 + (-param0 + this.field_v)] = (byte)(param0 >> 8);
        this.field_t[-param0 + this.field_v - 1] = (byte)param0;
    }

    final void a(int param0, int param1) {
        if (param1 != -32768) {
          return;
        }
        if ((param0 & -128) != 0) {
          if (0 != (-16384 & param0)) {
            if ((-2097152 & param0) != 0) {
              if ((param0 & -268435456) != 0) {
                this.a(param0 >>> 28 | 128, false);
              }
              this.a(128 | param0 >>> 21, false);
            }
            this.a(128 | param0 >>> 14, false);
          }
          this.a(param0 >>> 7 | 128, false);
        }
        this.a(param0 & 127, false);
    }

    final int d(int param0, int param1) {
        int var3 = oa.a(param1, this.field_v, param0, this.field_t);
        this.a(true, var3);
        return var3;
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)param1;
        if (param0 != -81) {
          String var4 = (String) null;
          this.a(false, (String) null);
        }
    }

    final long h(int param0) {
        long var2 = 4294967295L & (long)this.b(true);
        if (param0 != -412303328) {
          field_s = (vh) null;
        }
        long var4 = (long)this.b(true) & 4294967295L;
        return (var2 << 32) + var4;
    }

    final void b(int param0, byte param1) {
        int fieldTemp$0 = 0;
        if (param1 != -8) {
          return;
        }
        while (param0 > this.field_v) {
          fieldTemp$0 = this.field_v;
          this.field_v = this.field_v + 1;
          this.field_t[fieldTemp$0] = (byte) 0;
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_v;
          this.field_v = 0;
          var5 = new byte[var4_int];
          this.a(0, (byte) -128, var5, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.field_v = 0;
          if (param1 <= 39) {
            String var9 = (String) null;
            this.a(true, (String) null);
          }
          this.a((byte) -81, var8.length);
          this.a(var8, (byte) 0, 0, var8.length);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)param0;
        if (param1) {
          this.c(-68);
        }
    }

    final int d(byte param0) {
        this.field_v = this.field_v + 2;
        int var2 = (this.field_t[-1 + this.field_v] & 255) + ((this.field_t[this.field_v - 2] & 255) << 8);
        if (32767 < var2) {
          var2 = var2 - 65536;
        }
        if (param0 > -76) {
          this.b(true);
        }
        return var2;
    }

    final String j(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 >= -10) {
          return (String) null;
        }
        var2 = this.field_v;
        do {
          fieldTemp$0 = this.field_v;
          this.field_v = this.field_v + 1;
        } while (this.field_t[fieldTemp$0] != 0);
        var3 = -var2 + this.field_v - 1;
        if (0 != var3) {
          return tl.a(var3, -7510, this.field_t, var2);
        }
        return "";
    }

    final static void a(float[] param0, int[] param1, int[] param2, float[] param3, int[] param4, int[] param5, int[] param6, byte param7, int[] param8) {
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        float var30 = 0.0f;
        float var31 = 0.0f;
        float var32 = 0.0f;
        float var33 = 0.0f;
        float var9_float = (float)param4[0];
        float var10 = (float)param6[0];
        float var11 = (float)param1[0];
        float var12 = (float)param4[1] - var9_float;
        float var13 = -var10 + (float)param6[1];
        float var14 = (float)param1[1] - var11;
        float var15 = -var9_float + (float)param4[2];
        float var16 = -var10 + (float)param6[2];
        float var17 = (float)param1[2] - var11;
        float var18 = -var9_float + (float)param5[0];
        float var19 = (float)param8[0] - var10;
        float var20 = -var11 + (float)param2[0];
        float var21 = (float)param5[1] - var9_float;
        float var22 = -var10 + (float)param8[1];
        float var23 = -var11 + (float)param2[1];
        float var24 = (float)param5[2] - var9_float;
        float var25 = -var10 + (float)param8[2];
        float var26 = -var11 + (float)param2[2];
        float var30Lifetime1;
        float var31Lifetime1;
        float var32Lifetime1;
        float var33Lifetime1;
        if (param7 < 23) {
          return;
        }
        try {
          var27 = var17 * var13 - var14 * var16;
          var28 = -(var12 * var17) + var15 * var14;
          var29 = var12 * var16 - var15 * var13;
          var30 = -(var17 * var28) + var29 * var16;
          var31 = var27 * var17 - var29 * var15;
          var32 = -(var27 * var16) + var15 * var28;
          var33 = 1.0f / (var31 * var13 + var12 * var30 + var14 * var32);
          param0[1] = var33 * (var32 * var23 + (var30 * var21 + var22 * var31));
          param0[0] = (var32 * var20 + (var18 * var30 + var31 * var19)) * var33;
          param0[2] = var33 * (var32 * var26 + (var31 * var25 + var30 * var24));
          var30Lifetime1 = var13 * var29 - var28 * var14;
          var32Lifetime1 = -(var13 * var27) + var28 * var12;
          var31Lifetime1 = var14 * var27 - var29 * var12;
          var33Lifetime1 = 1.0f / (var15 * var30Lifetime1 + var16 * var31Lifetime1 + var32Lifetime1 * var17);
          param3[0] = var33Lifetime1 * (var30Lifetime1 * var18 + var31Lifetime1 * var19 + var32Lifetime1 * var20);
          param3[1] = var33Lifetime1 * (var22 * var31Lifetime1 + var30Lifetime1 * var21 + var23 * var32Lifetime1);
          param3[2] = (var31Lifetime1 * var25 + var24 * var30Lifetime1 + var26 * var32Lifetime1) * var33Lifetime1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.AA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(byte param0, int param1) {
        if (param1 >= 0 &&
          128 > param1) {
          this.a(param1, false);
          return;
        }
        if (param0 != -49) {
          field_x = (String) null;
        }
        if (0 <= param1 &&
          param1 < 32768) {
          this.a((byte) -81, param1 + 32768);
          return;
        }
        throw new IllegalArgumentException();
    }

    final void c(int param0, byte param1) {
        this.field_t[this.field_v + (-param0 - 2)] = (byte)(param0 >> 8);
        if (param1 != -92) {
          String var4 = (String) null;
          this.a((String) null, 44);
        }
        this.field_t[-1 + (this.field_v - param0)] = (byte)param0;
    }

    final String a(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        var2 = this.field_t[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        if (param0 != 10762) {
          return (String) null;
        }
        var3 = this.field_v;
        do {
          fieldTemp$1 = this.field_v;
          this.field_v = this.field_v + 1;
        } while (this.field_t[fieldTemp$1] != 0);
        var4 = -1 + (-var3 + this.field_v);
        if (0 != var4) {
          return tl.a(var4, param0 - 18272, this.field_t, var3);
        }
        return "";
    }

    final void a(boolean param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_v;
          this.field_v = this.field_v + 1;
          this.field_t[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_v = this.field_v + o.a(this.field_t, var4, -24984, param1.length(), 0, this.field_v);
          if (param0) {
            this.field_t = (byte[]) null;
          }
          fieldTemp$1 = this.field_v;
          this.field_v = this.field_v + 1;
          this.field_t[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(long param0, int param1) {
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$0] = (byte)(int)(param0 >> 32);
        if (param1 != 24136) {
          this.i(-128);
        }
        int fieldTemp$1 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_v;
        this.field_v = this.field_v + 1;
        this.field_t[fieldTemp$4] = (byte)(int)param0;
    }

    final int d(int param0) {
        this.field_v = this.field_v + 2;
        if (param0 != -1034) {
          field_s = (vh) null;
        }
        return (this.field_t[-2 + this.field_v] << 8 & 65280) + (this.field_t[this.field_v - 1] & 255);
    }

    final int c(int param0) {
        int var2 = -95 / ((9 - param0) / 59);
        if (0 > this.field_t[this.field_v]) {
          return this.b(true) & 2147483647;
        }
        return this.d(-1034);
    }

    ge(int param0) {
        this.field_t = ja.a(param0, -1);
        this.field_v = 0;
    }

    ge(byte[] param0) {
        try {
          this.field_v = 0;
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, int param1) {
        if (param1 < 64 &&
          -64 <= param1) {
          this.a(param1 + 64, false);
          return;
        }
        if (param1 < 16384 &&
          param1 >= -16384) {
          this.a((byte) -81, 49152 + param1);
          return;
        }
        if (param0 > -84) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final static String a(byte param0, pn param1) {
        String stackIn_31_0 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        Object var3_ref = null;
        int var4 = 0;
        int[] var5 = null;
        String var6 = null;
        String var3Lifetime1;
        Object var3_refLifetime1;
        String var3Lifetime2;
        var4 = Pool.field_O;
        try {
          if (param0 != -24) {
            var5 = (int[]) null;
            ge.a((float[]) null, (int[]) null, (int[]) null, (float[]) null, (int[]) null, (int[]) null, (int[]) null, (byte) 9, (int[]) null);
          }
          var2 = null;
          if (null != param1.field_j) {
            var6 = param1.field_j;
            var3 = var6;
            var3Lifetime2 = var6;
            var2 = var6;
            if (1 == param1.field_h) {
              var2 = "<img=0>" + var6;
            }
            if (param1.field_h == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3_ref = var2;
              var3_refLifetime1 = var2;
            }
          }
          var3Lifetime1 = "";
          if (param1.field_p == 2) {
            if (!param1.field_g) {
              if (param1.field_m == 0 &&
                param1.field_e == 0) {
                var3Lifetime1 = nr.a(new String[]{(String) (var2)}, -1, jl.field_a);
              } else {
                var3Lifetime1 = nr.a(new String[]{(String) (var2)}, -1, vh.field_S);
              }
            }
          } else {
            if (param1.field_p == 0 &&
              ej.field_l) {
              var3Lifetime1 = "[" + sn.field_l + "] ";
            }
            if (param1.field_p == 1) {
              var3Lifetime1 = "[" + nr.a(new String[]{param1.field_n}, -1, th.field_c) + "] ";
            }
            if (param1.field_p == 4 &&
              null != kn.field_g) {
              var3Lifetime1 = "[" + kn.field_g + "] ";
            }
            if (param1.field_p == 3) {
              var3Lifetime1 = "[#" + param1.field_n + "] ";
            }
            if (!param1.field_g) {
              var3Lifetime1 = var3Lifetime1 + (String) (var2) + ": ";
            }
          }
          stackIn_31_0 = var3Lifetime1;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ge.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw wm.a((Throwable) (stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          if (param0 != -9946) {
            field_q = (jg) null;
          }
          var3_int = param1.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param1);
          this.field_v = this.field_v + o.a(this.field_t, var4, param0 - 15038, param1.length(), 0, this.field_v);
          fieldTemp$0 = this.field_v;
          this.field_v = this.field_v + 1;
          this.field_t[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int[] param2, int param3) {
        int var5_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int incrementValue$0 = 0;
        try {
          int var6 = -28 / ((param3 + 39) / 41);
          var5_int = this.field_v;
          this.field_v = param1;
          var7 = (param0 - param1) / 8;
          for (var8 = 0; var7 > var8; var8++) {
            var9 = this.b(true);
            var10 = this.b(true);
            var11 = -957401312;
            var12 = -1640531527;
            var13 = 32;
            while (true) {
              incrementValue$0 = var13;
              var13--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var10 = var10 - ((var9 << 4 ^ var9 >>> 5) + var9 ^ var11 + param2[(var11 & 8044) >>> 11]);
              var11 = var11 - var12;
              var9 = var9 - (var11 + param2[var11 & 3] ^ (var10 << 4 ^ var10 >>> 5) + var10);
            }
            this.field_v = this.field_v - 8;
            this.a(true, var9);
            this.a(true, var10);
          }
          this.field_v = var5_int;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ge.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        this.field_t[-1 - param0 + this.field_v] = (byte)param0;
        if (!param1) {
          field_o = (String) null;
        }
    }

    final byte e(byte param0) {
        if (param0 != 105) {
          return (byte) -27;
        }
        int fieldTemp$0 = this.field_v;
        this.field_v = this.field_v + 1;
        return this.field_t[fieldTemp$0];
    }

    static {
        field_o = "Achievements";
        field_m = "Remove friend";
        field_r = "<%0> has won!";
        field_w = "Spectate <%0>'s game";
        field_x = "All players have left <%0>'s game.";
        field_n = "Wants a rematch.";
        field_p = new int[8192];
    }
}
