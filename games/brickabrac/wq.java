/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wq extends IntrusiveNode {
    int field_l;
    static int field_j;
    static String field_m;
    byte[] field_k;
    static String[] field_i;

    final void a(byte param0, int param1) {
        if (param0 != 47) {
          byte[] var4 = (byte[]) null;
          this.a(99, (byte[]) null, 100, 7);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> 16);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)param1;
    }

    public static void h(int param0) {
        field_i = null;
        if (param0 != 0) {
          field_j = -113;
        }
        field_m = null;
    }

    final int c(boolean param0) {
        if (param0) {
          this.field_l = -16;
        }
        if (0 <= this.field_k[this.field_l]) {
          return this.i(65280);
        }
        return 2147483647 & this.e(255);
    }

    final byte b(boolean param0) {
        if (!param0) {
          field_j = 8;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_k[fieldTemp$0];
    }

    final void b(int param0, byte param1) {
        if (param0 < 64 &&
          -64 <= param0) {
          this.a(80, param0 + 64);
          return;
        }
        if (param0 < 16384 &&
          -16384 <= param0) {
          this.b((byte) 121, 49152 + param0);
          return;
        }
        if (param1 < 110) {
          return;
        }
        throw new IllegalArgumentException();
    }

    final int e(int param0) {
        if (param0 != 255) {
          field_m = (String) null;
        }
        this.field_l = this.field_l + 4;
        return (255 & this.field_k[-1 + this.field_l]) + (((255 & this.field_k[this.field_l - 3]) << 16) + ((255 & this.field_k[this.field_l - 4]) << 24)) + (this.field_k[this.field_l - 2] << 8 & 65280);
    }

    final void a(java.math.BigInteger param0, java.math.BigInteger param1, int param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_l;
          this.field_l = 0;
          var5 = new byte[var4_int];
          this.a(0, var5, 110, var4_int);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param0, param1);
          var8 = var7.toByteArray();
          this.field_l = 0;
          this.b((byte) 126, var8.length);
          if (param2 != 19775) {
            this.field_l = -13;
          }
          this.a(var8, param2 - 19776, 0, var8.length);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wq.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int[] param1) {
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = this.field_l / 8;
          this.field_l = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              if (param0 != 18146) {
                this.k(-91);
              }
              return;
            }
            var5 = this.e(255);
            var6 = this.e(255);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + param1[3 & var7]);
                var7 = var7 + var8;
                var6 = var6 + (param1[(var7 & 6958) >>> 11] + var7 ^ (var5 >>> 5 ^ var5 << 4) + var5);
                continue;
              }
              break;
            }
            this.field_l = this.field_l - 8;
            this.a(var5, (byte) -79);
            this.a(var6, (byte) -79);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wq.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int c(int param0) {
        if (param0 != -1342) {
          this.k(54);
        }
        int var2 = this.field_k[this.field_l] & 255;
        if (var2 >= 128) {
          return this.i(65280) - 49152;
        }
        return this.l(255) - 64;
    }

    final String d(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_l;
        do {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
        } while (this.field_k[fieldTemp$0] != 0);
        var3 = param0 + (this.field_l - var2);
        if (var3 != 0) {
          return df.a(var3, -113, this.field_k, var2);
        }
        return "";
    }

    final void a(int param0, byte param1) {
        if (param1 != -79) {
          this.a((byte) 92, 64L);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)param0;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (~var3_int <= param1) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_l = this.field_l + hj.a(param0.length(), this.field_k, (byte) 86, this.field_l, var4, 0);
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wq.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void c(byte param0, int param1) {
        if (param0 > -26) {
          this.a(-112L, (byte) -53);
        }
        this.field_k[this.field_l + (-param1 - 4)] = (byte)(param1 >> 24);
        this.field_k[-3 - param1 + this.field_l] = (byte)(param1 >> 16);
        this.field_k[-2 - param1 + this.field_l] = (byte)(param1 >> 8);
        this.field_k[-1 + this.field_l - param1] = (byte)param1;
    }

    final void b(int param0, int param1) {
        if (param1 >= 0 &&
          param1 < 128) {
          this.a(-113, param1);
          return;
        }
        if (param0 >= ~param1 &&
          param1 < 32768) {
          this.b((byte) 109, param1 + 32768);
          return;
        }
        throw new IllegalArgumentException();
    }

    final String m(int param0) {
        if (this.field_k[this.field_l] == 0) {
          this.field_l = this.field_l + 1;
          return null;
        }
        if (param0 != 0) {
          return (String) null;
        }
        return this.d(-1);
    }

    final void e(byte param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((-16384 & param1) != 0) {
            if (0 != (param1 & -2097152)) {
              if (0 != (-268435456 & param1)) {
                this.a(-115, param1 >>> 28 | 128);
              }
              this.a(125, (270066403 | param1) >>> 21);
            }
            this.a(105, 128 | param1 >>> 14);
          }
          this.a(-100, param1 >>> 7 | 128);
        }
        this.a(-104, 127 & param1);
        if (param0 > -53) {
          this.e(-13);
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -1) {
            field_j = 69;
          }
          for (var5_int = param2; var5_int < param2 + param3; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_k[fieldTemp$0] = param0[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wq.RA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0) {
        this.field_l = this.field_l + 2;
        if (param0 <= 125) {
          field_m = (String) null;
        }
        int var2 = ((255 & this.field_k[-2 + this.field_l]) << 8) + (this.field_k[-1 + this.field_l] & 255);
        if (32767 < var2) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final void f(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != -74) {
          this.l(-125);
        }
        while (param1 > this.field_l) {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
        }
    }

    private final void a(byte param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> 48);
        if (param0 != -109) {
          field_j = -111;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> 32);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$6] = (byte)(int)param1;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var5_int = param0; var5_int < param0 + param3; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            param1[var5_int] = this.field_k[fieldTemp$0];
          }
          if (param2 <= 109) {
            this.a(-126, -11L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0, int param1) {
        this.field_k[-1 - param1 + this.field_l] = (byte)param1;
        if (param0 < 112) {
          this.e(-32);
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != -32) {
          field_i = (String[]) null;
        }
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)param0;
    }

    final int l(int param0) {
        if (param0 != 255) {
          this.a((byte) 71, 82L);
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return 255 & this.field_k[fieldTemp$0];
    }

    final int k(int param0) {
        if (param0 != -32768) {
          this.d((byte) 73);
        }
        int var2 = this.field_k[this.field_l] & 255;
        if (var2 >= 128) {
          return -32768 + this.i(65280);
        }
        return this.l(255);
    }

    final void a(int param0, String param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        try {
          var3_int = param1.indexOf('\0');
          if (param0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_k[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_l = this.field_l + hj.a(param1.length(), this.field_k, (byte) 86, this.field_l, var4, 0);
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
          this.field_k[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wq.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int[] param0, int param1, int param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int var7 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int var7Lifetime1;
        try {
          var5_int = this.field_l;
          this.field_l = param1;
          var6 = (-param1 + param2) / 8;
          for (var7 = 0; var7 < var6; var7++) {
            var8 = this.e(255);
            var9 = this.e(255);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 <= 0) {
                break;
              }
              var9 = var9 - (var8 + (var8 << 4 ^ var8 >>> 5) ^ param0[var10 >>> 11 & 367001603] + var10);
              var10 = var10 - var11;
              var8 = var8 - (var9 + (var9 >>> 5 ^ var9 << 4) ^ param0[3 & var10] + var10);
            }
            this.field_l = this.field_l - 8;
            this.a(var8, (byte) -79);
            this.a(var9, (byte) -79);
          }
          var7Lifetime1 = 103 / ((param3 + 1) / 55);
          this.field_l = var5_int;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wq.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(int)(param1 >> 56);
        if (param0 != -23054) {
          field_m = (String) null;
        }
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)(int)(param1 >> 48);
        int fieldTemp$2 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$2] = (byte)(int)(param1 >> 40);
        int fieldTemp$3 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$3] = (byte)(int)(param1 >> 32);
        int fieldTemp$4 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$4] = (byte)(int)(param1 >> 24);
        int fieldTemp$5 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$5] = (byte)(int)(param1 >> 16);
        int fieldTemp$6 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$6] = (byte)(int)(param1 >> 8);
        int fieldTemp$7 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$7] = (byte)(int)param1;
    }

    final void c(int param0, int param1) {
        if (param1 != 255) {
          this.field_l = 13;
        }
        this.field_k[-param0 + (this.field_l - 2)] = (byte)(param0 >> 8);
        this.field_k[this.field_l - param0 - 1] = (byte)param0;
    }

    final static tp[] a(String param0, mf param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tp[] stackIn_2_0 = null;
        tp[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param1.a(param0, false);
          var5 = param1.a(var4_int, -24, param2);
          if (param3 == -946715356) {
            stackIn_4_0 = ba.a(var4_int, var5, -59, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = (tp[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("wq.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
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
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final int i(int param0) {
        this.field_l = this.field_l + 2;
        if (param0 != 65280) {
          this.field_l = 113;
        }
        return (255 & this.field_k[-1 + this.field_l]) + (65280 & this.field_k[-2 + this.field_l] << 8);
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        var3 = 49 % ((param0 - 44) / 57);
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        var2 = this.field_k[fieldTemp$0];
        var4 = 0;
        while (var2 < 0) {
          var4 = (127 & var2 | var4) << 7;
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
          var2 = this.field_k[fieldTemp$1];
        }
        return var2 | var4;
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
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0) {
            this.field_k = (byte[]) null;
          }
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                90 >= var9) {
                var3_long = var3_long + (long)(-65 + (var9 + 2));
              } else {
                if (var9 >= 97 &&
                  var9 <= 122) {
                  var3_long = var3_long + (long)(-95 + var9);
                } else {
                  if (var9 >= 48 &&
                    57 >= var9) {
                    var3_long = var3_long + (long)(28 - (-var9 + 48));
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
          this.a((byte) -109, var3_long);
          this.a((byte) -109, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("wq.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int j(int param0) {
        this.field_l = this.field_l + 3;
        if (param0 != 48) {
          this.field_l = 59;
        }
        int var2 = (this.field_k[-1 + this.field_l] & 255) + (((255 & this.field_k[-2 + this.field_l]) << 8) + ((this.field_k[this.field_l - 3] & 255) << 16));
        if (var2 > 8388607) {
          var2 = var2 - 16777216;
        }
        return var2;
    }

    final String a(byte param0) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        int var2 = this.field_k[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        int var3 = this.c((byte) 110);
        if (param0 != 24) {
          this.d((byte) 106, 82);
        }
        if (var3 + this.field_l > this.field_k.length) {
          throw new IllegalStateException("");
        }
        String var4 = mj.a((byte) -116, var3, this.field_l, this.field_k);
        this.field_l = this.field_l + var3;
        return var4;
    }

    final int d(int param0, int param1) {
        int var3 = ba.a(this.field_k, 9, param1, this.field_l);
        if (param0 != 3) {
          this.c(46);
        }
        this.a(var3, (byte) -79);
        return var3;
    }

    final String f(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        var2 = this.field_k[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.field_l;
        if (param0 != 255) {
          this.a((byte) -99, -73);
        }
        do {
          fieldTemp$1 = this.field_l;
          this.field_l = this.field_l + 1;
        } while (0 != this.field_k[fieldTemp$1]);
        var4 = -1 + (-var3 + this.field_l);
        if (0 == var4) {
          return "";
        }
        return df.a(var4, 34, this.field_k, var3);
    }

    final boolean d(byte param0) {
        this.field_l = this.field_l - 4;
        int var2 = ba.a(this.field_k, param0 + 36, 0, this.field_l);
        int var3 = this.e(255);
        if (var2 == var3) {
          return true;
        }
        if (param0 != -27) {
          field_j = -56;
          return false;
        }
        return false;
    }

    final void b(byte param0, int param1) {
        if (param0 < 106) {
          return;
        }
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)(param1 >> 8);
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$1] = (byte)param1;
    }

    final int e(byte param0) {
        this.field_l = this.field_l + 3;
        if (param0 != -34) {
          return 20;
        }
        return (255 & this.field_k[this.field_l - 1]) + ((this.field_k[-3 + this.field_l] & 255) << 16) + (this.field_k[this.field_l - 2] << 8 & 65280);
    }

    final long g(int param0) {
        if (param0 != -32768) {
          this.f((byte) 23, -28);
        }
        long var2 = 4294967295L & (long)this.e(param0 ^ -32513);
        long var4 = (long)this.e(param0 + 33023) & 4294967295L;
        return var4 + (var2 << 32);
    }

    final void a(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_k[fieldTemp$0] = (byte)param1;
        int var3 = -41 / ((-67 - param0) / 32);
    }

    wq(int param0) {
        this.field_l = 0;
        this.field_k = gd.a(param0, (byte) 113);
    }

    wq(byte[] param0) {
        try {
          this.field_l = 0;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "This game option is only available to members.";
    }
}
