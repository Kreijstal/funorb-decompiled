/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gb extends gg {
    static o[] field_k;
    static ef field_i;
    int field_m;
    static pc field_h;
    static int field_j;
    byte[] field_l;

    final long a(int param0) {
        long var2 = (long)this.e(true) & 4294967295L;
        if (param0 != 10526) {
          field_h = (pc) null;
        }
        long var4 = 4294967295L & (long)this.e(true);
        return var4 + (var2 << 32);
    }

    final void c(int param0, int param1) {
        int var3 = 16 % ((-52 - param0) / 49);
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)param1;
    }

    final int e(boolean param0) {
        if (!param0) {
          return -122;
        }
        this.field_m = this.field_m + 4;
        return ((this.field_l[this.field_m - 2] & 255) << 8) + ((-16777216 & this.field_l[-4 + this.field_m] << 24) + ((255 & this.field_l[-3 + this.field_m]) << 16) + (255 & this.field_l[this.field_m - 1]));
    }

    final static wg a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        wg stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 98) {
            gb.a('*', 15);
          }
          if (gf.field_Z == field_i) {
            stackIn_4_0 = null;
            return (wg) (stackIn_4_0);
          }
          if (field_i == da.field_d &&
            param0.equals(uh.field_r)) {
            field_i = el.field_p;
            stackIn_11_0 = a.field_h;
            return stackIn_11_0;
          }
          uh.field_r = param0;
          a.field_h = null;
          field_i = gf.field_Z;
          stackIn_9_0 = null;
          return (wg) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gb.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(int param0) {
        if (param0 != 6715) {
          return -126;
        }
        if (this.field_l[this.field_m] >= 0) {
          return this.i(59);
        }
        return 2147483647 & this.e(true);
    }

    final int c(boolean param0) {
        int var2 = this.field_l[this.field_m] & 255;
        if (param0) {
          this.b((byte) 69, 86);
        }
        if (var2 < 128) {
          return this.j(255);
        }
        return -32768 + this.i(-118);
    }

    private final void a(int param0, long param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(int)(param1 >> 48);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)(int)(param1 >> 40);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$2] = (byte)(int)(param1 >> 32);
        if (param0 != -37) {
          return;
        }
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$3] = (byte)(int)(param1 >> 24);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$4] = (byte)(int)(param1 >> 16);
        int fieldTemp$5 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$5] = (byte)(int)(param1 >> 8);
        int fieldTemp$6 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$6] = (byte)(int)param1;
    }

    final void a(int param0, String param1) {
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
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          if (param0 < 41) {
            field_j = 105;
          }
          var7 = param1.length();
          for (var8 = 19; 0 <= var8; var8--) {
            var3_long = var3_long * 38L;
            if (var8 < var7) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(-65 + (var9 + 2));
              } else {
                if (97 <= var9 &&
                  122 >= var9) {
                  var3_long = var3_long + (long)(2 + (var9 - 97));
                } else {
                  if (var9 >= 48 &&
                    57 >= var9) {
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
          this.a(-37, var3_long);
          this.a(-37, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("gb.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
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
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          for (var5_int = param1; param1 + param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            param3[var5_int] = this.field_l[fieldTemp$0];
          }
          if (param2 >= -109) {
            this.a(-27, 8L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gb.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        if ((-128 & param1) != 0) {
          if ((param1 & -16384) != 0) {
            if (0 != (-2097152 & param1)) {
              if ((-268435456 & param1) != 0) {
                this.c(-115, 128 | param1 >>> 28);
              }
              this.c(38, 128 | param1 >>> 21);
            }
            this.c(-128, param1 >>> 14 | 128);
          }
          this.c(param0 - 83, 128 | param1 >>> 7);
        }
        this.c(param0 + 97, 127 & param1);
        if (param0 != -25) {
          field_h = (pc) null;
        }
    }

    final void b(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 != -65) {
          field_j = 4;
        }
        while (param1 > this.field_m) {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$0] = (byte) 0;
        }
    }

    final int d(int param0) {
        int var2 = 101 / ((-54 - param0) / 41);
        int var3 = 255 & this.field_l[this.field_m];
        if (128 <= var3) {
          return this.i(91) - 49152;
        }
        return -64 + this.j(255);
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
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 8) {
            field_h = (pc) null;
          }
          for (var5_int = param3; var5_int < param3 + param1; var5_int++) {
            fieldTemp$0 = this.field_m;
            this.field_m = this.field_m + 1;
            this.field_l[fieldTemp$0] = param2[var5_int];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gb.NA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final int j(int param0) {
        if (param0 != 255) {
          this.a((byte) 56, -16);
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return 255 & this.field_l[fieldTemp$0];
    }

    final boolean k(int param0) {
        this.field_m = this.field_m - param0;
        int var2 = ki.a(-27129, this.field_l, this.field_m, 0);
        int var3 = this.e(true);
        if (var3 == var2) {
          return true;
        }
        return false;
    }

    final byte a(byte param0) {
        if (param0 != -14) {
          return (byte) -103;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        return this.field_l[fieldTemp$0];
    }

    final String g(int param0) {
        if (param0 <= 73) {
          field_j = -112;
        }
        if (0 == this.field_l[this.field_m]) {
          this.field_m = this.field_m + 1;
          return null;
        }
        return this.h(72);
    }

    final void a(boolean param0, int param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(param1 >> 8);
        if (!param0) {
          return;
        }
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)param1;
    }

    final String d(boolean param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        var2 = this.field_l[fieldTemp$0];
        if (0 != var2) {
          throw new IllegalStateException("");
        }
        var3 = this.field_m;
        do {
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
        } while (this.field_l[fieldTemp$1] != 0);
        if (param0) {
          return (String) null;
        }
        var4 = this.field_m - (var3 + 1);
        if (var4 == 0) {
          return "";
        }
        return vd.a(this.field_l, var3, var4, 160);
    }

    final int c(byte param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = SolKnight.field_L ? 1 : 0;
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        var2 = this.field_l[fieldTemp$0];
        if (param0 != 120) {
          return -115;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          var2 = this.field_l[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void a(byte param0, int[] param1) {
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
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = this.field_m / 8;
          this.field_m = 0;
          var4 = 0;
          while (true) {
            if (var4 >= var3_int) {
              if (param0 <= 21) {
                field_h = (pc) null;
              }
              return;
            }
            var5 = this.e(true);
            var6 = this.e(true);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (var6 + (var6 >>> 5 ^ var6 << 4) ^ var7 + param1[var7 & 3]);
                var7 = var7 + var8;
                var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ param1[(var7 & 6297) >>> 11] + var7);
                continue;
              }
              break;
            }
            this.field_m = this.field_m - 8;
            this.b(var5, false);
            this.b(var6, false);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gb.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        ua.field_H = 0;
        ri.field_f = param1;
        if (param2 >= -126) {
          field_h = (pc) null;
        }
        if (ri.field_f >= 0) {
          vd.field_d[ri.field_f].b(param0, 3367);
        }
    }

    final void b(int param0, String param1) {
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        int var3_int = param1.indexOf('\0');
        if (var3_int >= 0) {
          throw new IllegalArgumentException("");
        }
        if (param0 != -1955895016) {
          return;
        }
        try {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param1);
          this.field_m = this.field_m + ue.a(this.field_m, var4, param1.length(), 352, this.field_l, 0);
          fieldTemp$1 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gb.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_13_0 = false;
        if (param1 <= 119) {
          return false;
        }
        stackIn_13_0 = ((!(param0 < 48) &&
          !(param0 > 57)) ||
          (!(65 > param0) &&
          !(param0 > 90)) ||
          (!(param0 < 97) &&
          !(param0 > 122)));
        return stackIn_13_0;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 <= 16) {
          gb.a('$', -122);
        }
        int fieldTemp$5 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$7] = (byte)(int)param0;
    }

    final int b(boolean param0) {
        this.field_m = this.field_m + 3;
        if (param0) {
          return -116;
        }
        return ((255 & this.field_l[this.field_m - 3]) << 16) + (((this.field_l[this.field_m - 2] & 255) << 8) + (this.field_l[this.field_m - 1] & 255));
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)(int)(param0 >> 24);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$2] = (byte)(int)(param0 >> 16);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$3] = (byte)(int)(param0 >> 8);
        int fieldTemp$4 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$4] = (byte)(int)param0;
        if (param1 != 25576) {
          this.k(-66);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 < 64) {
          field_j = -15;
        }
        if (param0 < 64 &&
          param0 >= -64) {
          this.c(-116, param0 + 64);
          return;
        }
        if (16384 > param0 &&
          param0 >= -16384) {
          this.a(true, param0 + 49152);
          return;
        }
        throw new IllegalArgumentException();
    }

    final String h(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        if (param0 < 8) {
          this.a(80L, 109);
        }
        var2 = this.field_m;
        do {
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
        } while (this.field_l[fieldTemp$0] != 0);
        var3 = this.field_m - var2 - 1;
        if (0 != var3) {
          return vd.a(this.field_l, var2, var3, 160);
        }
        return "";
    }

    final void b(int param0, boolean param1) {
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$3] = (byte)param0;
        if (param1) {
          this.field_m = 84;
        }
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var4 = null;
        int fieldTemp$0 = 0;
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          var4 = (CharSequence) ((Object) param0);
          this.field_m = this.field_m + ue.a(this.field_m, var4, param0.length(), 352, this.field_l, param1);
          fieldTemp$0 = this.field_m;
          this.field_m = this.field_m + 1;
          this.field_l[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gb.AB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_l[-param1 + (this.field_m - param0)] = (byte)param1;
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
          if (param1 != 59769888) {
            this.a(false, 58);
          }
          this.a(var4_int, 0, -111, var5);
          var6 = new java.math.BigInteger(var5);
          var7 = var6.modPow(param2, param0);
          var8 = var7.toByteArray();
          this.field_m = 0;
          this.a(true, var8.length);
          this.a(8, var8.length, var8, 0);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gb.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_l[-param0 + (this.field_m - 2)] = (byte)(param0 >> 8);
        this.field_l[this.field_m + (-param0 - 1)] = (byte)param0;
        if (!param1) {
          String var4 = (String) null;
          this.a((String) null, -30);
        }
    }

    public static void f(int param0) {
        field_k = null;
        if (param0 != -11) {
          gb.a(false, -86, 67);
        }
        field_h = null;
        field_i = null;
    }

    final int i(int param0) {
        this.field_m = this.field_m + 2;
        int var2 = -76 / ((-63 - param0) / 36);
        return (255 & this.field_l[-1 + this.field_m]) + ((255 & this.field_l[-2 + this.field_m]) << 8);
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
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          var5_int = this.field_m;
          this.field_m = param1;
          var6 = (-param1 + param3) / 8;
          if (param2 != 5838) {
            return;
          }
          var7 = 0;
          while (true) {
            if (var7 >= var6) {
              this.field_m = var5_int;
              return;
            }
            var8 = this.e(true);
            var9 = this.e(true);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - ((var8 >>> 5 ^ var8 << 4) + var8 ^ var10 + param0[(6680 & var10) >>> 11]);
                var10 = var10 - var11;
                var8 = var8 - (param0[3 & var10] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                continue;
              }
              break;
            }
            this.field_m = this.field_m - 8;
            this.b(var8, false);
            this.b(var9, false);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gb.TA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void c(byte param0, int param1) {
        if (param0 > -10) {
          this.c((byte) -13, 19);
        }
        this.field_l[this.field_m + (-param1 - 4)] = (byte)(param1 >> 24);
        this.field_l[-3 + (-param1 + this.field_m)] = (byte)(param1 >> 16);
        this.field_l[-2 - param1 + this.field_m] = (byte)(param1 >> 8);
        this.field_l[-param1 + this.field_m - 1] = (byte)param1;
    }

    final int b(boolean param0, int param1) {
        if (!param0) {
          this.field_m = -7;
        }
        int var3 = ki.a(-27129, this.field_l, this.field_m, param1);
        this.b(var3, false);
        return var3;
    }

    final void d(int param0, int param1) {
        if (param1 != 2132504424) {
          this.field_m = 1;
        }
        int fieldTemp$0 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$0] = (byte)(param0 >> 16);
        int fieldTemp$1 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$1] = (byte)(param0 >> 8);
        int fieldTemp$2 = this.field_m;
        this.field_m = this.field_m + 1;
        this.field_l[fieldTemp$2] = (byte)param0;
    }

    gb(int param0) {
        this.field_m = 0;
        this.field_l = fl.a(param0, -1);
    }

    gb(byte[] param0) {
        try {
          this.field_m = 0;
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new pc();
        field_j = 0;
    }
}
