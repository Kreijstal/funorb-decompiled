/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wk extends pg {
    byte[] field_j;
    static int field_m;
    static String field_h;
    static String field_k;
    int field_g;
    static String field_i;
    static qb field_l;

    final static kc f(byte param0) {
        if (param0 != -125) {
          field_i = (String) null;
        }
        return ja.d((byte) 90);
    }

    final int f(int param0) {
        int var2 = this.field_j[this.field_g] & 255;
        if (param0 <= var2) {
          return -32768 + this.n(-98);
        }
        return this.e((byte) -119);
    }

    public static void b(boolean param0) {
        field_h = null;
        field_i = null;
        field_l = null;
        if (!param0) {
          field_i = (String) null;
        }
        field_k = null;
    }

    final int a(byte param0) {
        if (param0 != -29) {
          this.g(-102);
        }
        if (this.field_j[this.field_g] < 0) {
          return this.d(param0 ^ 10669) & 2147483647;
        }
        return this.n(-98);
    }

    final void a(int param0, byte param1) {
        if (param1 != -101) {
          int[] var4 = (int[]) null;
          this.a(41, (int[]) null);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 24);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)(param0 >> 16);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$2] = (byte)(param0 >> 8);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$3] = (byte)param0;
    }

    final void d(int param0, byte param1) {
        if (param0 >= 0 &&
          param0 < 128) {
          this.f(param0, (byte) -62);
          return;
        }
        if (param1 >= -95) {
          this.d(-48, (byte) -23);
        }
        if (param0 >= 0 &&
          32768 > param0) {
          this.c(32768 + param0, (byte) -100);
          return;
        }
        throw new IllegalArgumentException();
    }

    private final void b(long param0, byte param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 24);
        if (param1 != 12) {
          this.b(21, -6);
        }
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param0 >> 16);
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param0 >> 8);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$6] = (byte)(int)param0;
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 < 37) {
            this.a(true, 13);
          }
          for (var5_int = param1; param1 + param3 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            param2[var5_int] = this.field_j[fieldTemp$0];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final long c(int param0) {
        if (param0 != -943038560) {
          field_i = (String) null;
        }
        long var2 = 4294967295L & (long)this.d(-10674);
        long var4 = 4294967295L & (long)this.d(-10674);
        return (var2 << 32) + var4;
    }

    final int i(int param0) {
        if (param0 != -1) {
          field_h = (String) null;
        }
        int var2 = this.field_j[this.field_g] & 255;
        if (var2 < 128) {
          return -64 + this.e((byte) -99);
        }
        return -49152 + this.n(-98);
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
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = this.field_g;
          this.field_g = param1;
          var6 = (param2 - param1) / 8;
          if (param3 < 122) {
            field_m = -95;
          }
          var7 = 0;
          while (true) {
            if (var6 <= var7) {
              this.field_g = var5_int;
              return;
            }
            var8 = this.d(-10674);
            var9 = this.d(-10674);
            var10 = -957401312;
            var11 = -1640531527;
            var12 = 32;
            while (true) {
              incrementValue$0 = var12;
              var12--;
              if (incrementValue$0 > 0) {
                var9 = var9 - (param0[-469762045 & var10 >>> 11] + var10 ^ (var8 >>> 5 ^ var8 << 4) + var8);
                var10 = var10 - var11;
                var8 = var8 - (var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + param0[var10 & 3]);
                continue;
              }
              break;
            }
            this.field_g = this.field_g - 8;
            this.a(var8, (byte) -101);
            this.a(var9, (byte) -101);
            var7++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("wk.Q(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
        String var11 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_int = this.field_g / 8;
          this.field_g = 0;
          var4 = 0;
          while (true) {
            if (var3_int <= var4) {
              if (param0 < 75) {
                var11 = (String) null;
                this.a((byte) -5, (String) null);
              }
              return;
            }
            var5 = this.d(-10674);
            var6 = this.d(-10674);
            var7 = 0;
            var8 = -1640531527;
            var9 = 32;
            while (true) {
              incrementValue$0 = var9;
              var9--;
              if (incrementValue$0 > 0) {
                var5 = var5 + (param1[3 & var7] + var7 ^ (var6 >>> 5 ^ var6 << 4) + var6);
                var7 = var7 + var8;
                var6 = var6 + ((var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + param1[(var7 & 7037) >>> 11]);
                continue;
              }
              break;
            }
            this.field_g = this.field_g - 8;
            this.a(var5, (byte) -101);
            this.a(var6, (byte) -101);
            var4++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void j(int param0) {
        vn var1 = null;
        int var2 = 0;
        ml var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var1 = rk.field_O.g((byte) 34);
          if (param0 != 13805) {
            wk.b(false);
          }
          var2 = 0;
          var3 = (ml) (var1.b(12623));
          while (var3 != null) {
            if (var3.field_jb == 11) {
              var2++;
            }
            var3 = (ml) (var1.a(0));
          }
          if (3 <= var2) {
            rk.field_O.a(0, 0, 0, 104, 6);
          } else {
            rk.field_O.a(0, 0, -1, param0 - 13767, 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "wk.AB(" + param0 + ')');
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param0 >> 56);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param0 >> 48);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param0 >> 40);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param0 >> 32);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$4] = (byte)(int)(param0 >> 24);
        if (param1 <= 34) {
          return;
        }
        int fieldTemp$5 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$5] = (byte)(int)(param0 >> 16);
        int fieldTemp$6 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$6] = (byte)(int)(param0 >> 8);
        int fieldTemp$7 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$7] = (byte)(int)param0;
    }

    final String g(int param0) {
        if (0 == this.field_j[this.field_g]) {
          this.field_g = this.field_g + 1;
          return null;
        }
        int var2 = 76 % ((58 - param0) / 32);
        return this.l(-1);
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(param1 >> 16);
        if (param0 != -120) {
          field_h = (String) null;
        }
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)(param1 >> 8);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$2] = (byte)param1;
    }

    final void b(int param0, int param1) {
        if ((param1 & -128) != 0) {
          if ((-16384 & param1) != 0) {
            if ((-2097152 & param1) != 0) {
              if (0 != (-268435456 & param1)) {
                this.f(param1 >>> 28 | 128, (byte) -12);
              }
              this.f((param1 | 270515212) >>> 21, (byte) -103);
            }
            this.f((2106311 | param1) >>> 14, (byte) -67);
          }
          this.f((param1 | 16401) >>> 7, (byte) -43);
        }
        if (param0 != 10888) {
          return;
        }
        this.f(param1 & 127, (byte) -44);
    }

    final void a(int param0, int param1) {
        this.field_j[this.field_g - param0 - 2] = (byte)(param0 >> 8);
        if (param1 != -19571) {
          this.d(44, (byte) -106);
        }
        this.field_j[-param0 + (this.field_g - 1)] = (byte)param0;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var5_int = param1; var5_int < param1 + param3; var5_int++) {
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            this.field_j[fieldTemp$0] = param0[var5_int];
          }
          if (param2 != -86) {
            this.a(114, (byte) 115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wk.WA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int h(int param0) {
        if (param0 != 11609) {
          wk.b(true);
        }
        this.field_g = this.field_g + 3;
        return (this.field_j[-1 + this.field_g] & 255) + ((this.field_j[this.field_g - 3] & 255) << 16) + ((this.field_j[-2 + this.field_g] & 255) << 8);
    }

    final String e(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        String var5;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        var2 = this.field_j[fieldTemp$0];
        if (var2 != 0) {
          throw new IllegalStateException("");
        }
        if (param0 != -32461) {
          var5 = (String) null;
          this.a((String) null, 112);
        }
        var3 = this.field_g;
        do {
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
        } while (0 != this.field_j[fieldTemp$1]);
        var4 = this.field_g - (var3 + 1);
        if (var4 == 0) {
          return "";
        }
        return ba.a(var3, var4, (byte) -126, this.field_j);
    }

    final String l(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        var2 = this.field_g;
        do {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
        } while (this.field_j[fieldTemp$0] != 0);
        var3 = -var2 + (this.field_g - 1);
        if (param0 == ~var3) {
          return "";
        }
        return ba.a(var2, var3, (byte) -124, this.field_j);
    }

    final void a(byte param0, String param1) {
        int var8 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3_long = 0L;
          var5 = 0L;
          var7 = param1.length();
          if (param0 != 7) {
            this.a(true, 75);
          }
          for (var8 = 19; var8 >= 0; var8--) {
            boolean decompiledFrameRemainder0 = true;
            var3_long = var3_long * 38L;
            if (var7 > var8) {
              var9 = param1.charAt(var8);
              if (var9 >= 65 &&
                var9 <= 90) {
                var3_long = var3_long + (long)(var9 - 63);
              } else if (var9 >= 97 &&
                var9 <= 122) {
                var3_long = var3_long + (long)(var9 + 2 - 97);
              } else if (var9 >= 48 &&
                var9 <= 57) {
                var3_long = var3_long + (long)(-48 + var9 + 28);
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
          this.b(var3_long, (byte) 12);
          this.b(var5, (byte) 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("wk.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void k(int param0) {
        da.field_d = new ln();
        g.field_e.a((byte) -92, (qm) (da.field_d));
        if (param0 != 970210916) {
          field_i = (String) null;
        }
    }

    final int n(int param0) {
        if (param0 != -98) {
          return 125;
        }
        this.field_g = this.field_g + 2;
        return ((255 & this.field_j[-2 + this.field_g]) << 8) + (255 & this.field_j[this.field_g - 1]);
    }

    final int a(int param0) {
        int fieldTemp$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        var2 = this.field_j[fieldTemp$0];
        if (param0 < 10) {
          this.field_g = -57;
        }
        var3 = 0;
        while (var2 < 0) {
          var3 = (var2 & 127 | var3) << 7;
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
          var2 = this.field_j[fieldTemp$1];
        }
        return var3 | var2;
    }

    final void c(int param0, int param1) {
        this.field_j[this.field_g - (param1 + 4)] = (byte)(param1 >> 24);
        this.field_j[-3 - param1 + this.field_g] = (byte)(param1 >> 16);
        this.field_j[-2 + this.field_g - param1] = (byte)(param1 >> 8);
        if (param0 != 10089) {
          field_h = (String) null;
        }
        this.field_j[-param1 + (this.field_g - 1)] = (byte)param1;
    }

    final void a(byte param0, long param1) {
        if (param0 > -115) {
          this.h(-89);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(int)(param1 >> 32);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)(int)(param1 >> 24);
        int fieldTemp$2 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$2] = (byte)(int)(param1 >> 16);
        int fieldTemp$3 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$3] = (byte)(int)(param1 >> 8);
        int fieldTemp$4 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$4] = (byte)(int)param1;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        CharSequence var5 = null;
        int fieldTemp$0 = 0;
        try {
          if (param1 != 23333) {
            String var4 = (String) null;
            this.a((String) null, (byte) 74);
          }
          var3_int = param0.indexOf('\0');
          if (0 <= var3_int) {
            throw new IllegalArgumentException("");
          }
          var5 = (CharSequence) ((Object) param0);
          this.field_g = this.field_g + ji.a(0, this.field_j, this.field_g, (byte) 89, var5, param0.length());
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wk.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int var3_int = 0;
        int fieldTemp$0 = 0;
        CharSequence var4 = null;
        int fieldTemp$1 = 0;
        if (param1 >= -80) {
          return;
        }
        try {
          var3_int = param0.indexOf('\0');
          if (var3_int >= 0) {
            throw new IllegalArgumentException("");
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
          var4 = (CharSequence) ((Object) param0);
          this.field_g = this.field_g + ji.a(0, this.field_j, this.field_g, (byte) 89, var4, param0.length());
          fieldTemp$1 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_j[fieldTemp$1] = (byte) 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wk.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int d(int param0) {
        if (param0 != -10674) {
          this.a((byte) -7);
        }
        this.field_g = this.field_g + 4;
        return ((255 & this.field_j[-2 + this.field_g]) << 8) + ((this.field_j[this.field_g - 4] & 255) << 24) + (this.field_j[this.field_g - 3] << 16 & 16711680) + (this.field_j[-1 + this.field_g] & 255);
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          return -101;
        }
        int var3 = db.a(this.field_g, false, this.field_j, param1);
        this.a(var3, (byte) -101);
        return var3;
    }

    final int m(int param0) {
        this.field_g = this.field_g + 2;
        if (param0 != 0) {
          field_i = (String) null;
        }
        int var2 = (this.field_j[-1 + this.field_g] & 255) + (65280 & this.field_j[-2 + this.field_g] << 8);
        if (var2 > 32767) {
          var2 = var2 - 65536;
        }
        return var2;
    }

    final static void d(byte param0) {
        int var1_int = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          da.a((byte) -101);
          int var2 = 122 % ((param0 + 21) / 48);
          for (var1_int = 0; var1_int < 17; var1_int++) {
            tl.field_f[var1_int] = new lc(var1_int);
          }
          mn.field_r = 13;
          si.field_g = 13;
          qn.a(16, 50);
          sm.a(-107, 50);
          if (!lc.a((byte) 112)) {
            ce.field_i = tj.a(4, -21402);
            ci.field_d = ld.a(6, false);
          }
          bk.a(2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wk.FB(" + param0 + ')');
        }
    }

    final void e(int param0, byte param1) {
        int fieldTemp$0 = 0;
        int var3;
        int var4;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var3 = -8 % ((40 - param1) / 37);
        while (this.field_g < param0) {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          this.field_j[fieldTemp$0] = (byte) 0;
        }
    }

    final int e(byte param0) {
        int var2 = 69 / ((param0 + 28) / 58);
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_j[fieldTemp$0] & 255;
    }

    wk(int param0) {
        this.field_g = 0;
        this.field_j = bb.a(param0, 56);
    }

    final void f(int param0, byte param1) {
        if (param1 >= -2) {
          this.e(51, (byte) -125);
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)param0;
    }

    final void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2) {
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        try {
          var4_int = this.field_g;
          this.field_g = 0;
          var5 = new byte[var4_int];
          this.a((byte) 81, 0, var5, var4_int);
          var6 = new java.math.BigInteger(var5);
          if (param1 <= 71) {
            this.field_g = -16;
          }
          var7 = var6.modPow(param0, param2);
          var8 = var7.toByteArray();
          this.field_g = 0;
          this.c(var8.length, (byte) -62);
          this.a(var8, 0, (byte) -86, var8.length);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wk.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0, byte param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$0] = (byte)(param0 >> 8);
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_j[fieldTemp$1] = (byte)param0;
        if (param1 > -53) {
          wk.d((byte) 112);
        }
    }

    final byte o(int param0) {
        if (param0 != 6) {
          return (byte) 103;
        }
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_j[fieldTemp$0];
    }

    wk(byte[] param0) {
        try {
          this.field_j = param0;
          this.field_g = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1) {
        this.field_j[-param0 + (this.field_g - 1)] = (byte)param0;
        if (param1 != 43) {
          this.a(120, (byte) 58);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        co.field_e[je.field_b] = param2;
        ki.field_r[je.field_b] = je.field_b;
        nf.field_z[je.field_b] = param4;
        if (!(ao.field_g <= param4)) {
          ld.field_m = param4;
        }
        if (param4 > tm.field_g) {
          qa.field_m = param4;
        }
        hc.field_e[je.field_b] = param1;
        tj.field_u[je.field_b] = param5;
        ba.field_o[je.field_b] = param3;
        int var6 = param3 + param5 + param1;
        int var7 = ~var6 != param0 ? param1 * 1000 / var6 : 0;
        lm.field_i[je.field_b] = var7;
        if (ld.field_m > var7) {
          ld.field_m = var7;
        }
        je.field_b = je.field_b + 1;
        if (!(var7 <= qa.field_m)) {
          qa.field_m = var7;
        }
    }

    final boolean c(boolean param0) {
        if (!param0) {
          field_k = (String) null;
        }
        this.field_g = this.field_g - 4;
        int var2 = db.a(this.field_g, !param0 ? true : false, this.field_j, 0);
        int var3 = this.d(-10674);
        if (var2 == var3) {
          return true;
        }
        return false;
    }

    static {
        field_m = 0;
        field_h = "MOST USELESS - ";
        field_k = "This is a hidden Achievement. The requirements and rewards for it will be shown once it has been achieved.";
        field_i = "Name is available";
    }
}
