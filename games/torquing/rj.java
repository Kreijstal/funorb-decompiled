/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj extends am {
    static String field_y;
    private int field_D;
    private byte[] field_s;
    private int field_A;
    private boolean field_B;
    private int field_u;
    private int field_C;
    private short[] field_t;
    static cf field_v;
    private int field_z;
    private short[] field_x;
    static int field_w;

    final static void a(int param0, String param1, t param2) {
        try {
          hf.field_a = param1;
          if (param0 >= -43) {
            t var4 = (t) null;
            rj.a(87, (String) null, (t) null);
          }
          jd.field_D = param2;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "rj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var8Lifetime1;
        int var9Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var18 = Torquing.field_u;
        var13 = param1 >> 12;
        var12 = var13 + 1;
        var13 = var13 & 255;
        if (param0 <= var12) {
          var12 = 0;
        }
        param1 = param1 & 4095;
        var10 = param2 - param5;
        var12 = var12 & 255;
        var11 = -4096 + param1;
        var15 = cf.field_a[param1];
        var14 = this.field_s[param4 + var13] & 3;
        if (var14 <= 1) {
          if (0 == var14) {
            stackIn_10_0 = param1 + param2;
          } else {
            stackIn_10_0 = param2 - param1;
          }
          var8 = stackIn_10_0;
        } else {
          if (2 == var14) {
            stackIn_6_0 = param1 - param2;
          } else {
            stackIn_6_0 = -param2 - param1;
          }
          var8 = stackIn_6_0;
        }
        var14Lifetime1 = 3 & this.field_s[var12 + param4];
        if (var14Lifetime1 <= 1) {
          if (var14Lifetime1 == 0) {
            stackIn_19_0 = var11 + param2;
          } else {
            stackIn_19_0 = -var11 + param2;
          }
          var9 = stackIn_19_0;
        } else {
          if (var14Lifetime1 != 2) {
            stackIn_15_0 = -var11 - param2;
          } else {
            stackIn_15_0 = var11 - param2;
          }
          var9 = stackIn_15_0;
        }
        var14Lifetime2 = this.field_s[var13 + param6] & 3;
        var16 = var8 + ((-var8 + var9) * var15 >> 12);
        if (var14Lifetime2 <= 1) {
          if (0 != var14Lifetime2) {
            stackIn_28_0 = -param1 + var10;
          } else {
            stackIn_28_0 = var10 + param1;
          }
          var8Lifetime1 = stackIn_28_0;
        } else {
          if (var14Lifetime2 == 2) {
            stackIn_24_0 = -var10 + param1;
          } else {
            stackIn_24_0 = -param1 - var10;
          }
          var8Lifetime1 = stackIn_24_0;
        }
        var14Lifetime3 = 3 & this.field_s[var12 + param6];
        if (var14Lifetime3 <= 1) {
          if (var14Lifetime3 != 0) {
            stackIn_37_0 = -var11 + var10;
          } else {
            stackIn_37_0 = var11 + var10;
          }
          var9Lifetime1 = stackIn_37_0;
        } else {
          if (var14Lifetime3 != 2) {
            stackIn_33_0 = -var10 - var11;
          } else {
            stackIn_33_0 = -var10 + var11;
          }
          var9Lifetime1 = stackIn_33_0;
        }
        var17 = var8Lifetime1 + ((-var8Lifetime1 + var9Lifetime1) * var15 >> 12);
        return var16 + (param3 * (-var16 + var17) >> 12);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3;
        int var4;
        var4 = Torquing.field_u;
        this.field_s = i.b(10758, this.field_A);
        if (param0 <= 123) {
          this.field_s = (byte[]) null;
        }
        this.a(false);
        for (var2 = -1 + this.field_C; var2 >= 1; var2--) {
          var3 = this.field_x[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.field_C = this.field_C - 1;
            continue;
          }
          break;
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        var3 = Torquing.field_u;
        if (param0) {
          this.a((byte) -6, 28);
        }
        if (0 < this.field_z) {
          this.field_t = new short[this.field_C];
          this.field_x = new short[this.field_C];
          for (var2 = 0; this.field_C > var2; var2++) {
            this.field_x[var2] = (short)(int)(Math.pow((double)((float)this.field_z / 4096.0f), (double)var2) * 4096.0);
            this.field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (this.field_x != null &&
            this.field_x.length == this.field_C) {
            this.field_t = new short[this.field_C];
            for (var2 = 0; this.field_C > var2; var2++) {
              this.field_t[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = this.field_l.a(param1, 25657);
        int[] var3 = var4;
        if (param0 < 86) {
          return (int[]) null;
        }
        if (this.field_l.field_b) {
          this.a(true, var4, param1);
        }
        return var4;
    }

    final void a(fj param0, int param1, int param2) {
        int dupTemp$0 = 0;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            this.field_A = 54;
          }
          var4_int = param2;
          if (0 == var4_int) {
            stackIn_18_1 = (param0.i((byte) -101) == 1);
            this.field_B = stackIn_18_1;
          } else {
            if (var4_int != 1) {
              if (var4_int == 2) {
                this.field_z = param0.g(65536);
                if (0 <= this.field_z) {
                  return;
                }
                this.field_x = new short[this.field_C];
                for (var4_int = 0; var4_int < this.field_C; var4_int++) {
                  this.field_x[var4_int] = (short)param0.g(65536);
                }
              } else {
                if (3 == var4_int) {
                  dupTemp$0 = param0.i((byte) -101);
                  this.field_u = dupTemp$0;
                  this.field_D = dupTemp$0;
                  return;
                }
                if (var4_int == 4) {
                  this.field_A = param0.i((byte) -101);
                  return;
                }
                if (var4_int == 5) {
                  this.field_D = param0.i((byte) -101);
                  return;
                }
                if (var4_int == 6) {
                  this.field_u = param0.i((byte) -101);
                  return;
                }
              }
            } else {
              this.field_C = param0.i((byte) -101);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_32_0 = var4;
          stackIn_32_1 = new StringBuilder().append("rj.H(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_v = null;
        if (param0 > -101) {
          rj.g((byte) 114);
        }
        field_y = null;
    }

    public rj() {
        super(0, true);
        this.field_s = new byte[512];
        this.field_u = 4;
        this.field_D = 4;
        this.field_C = 4;
        this.field_B = true;
        this.field_z = 1638;
        this.field_A = 0;
    }

    private final void a(boolean param0, int[] param1, int param2) {
        int var7 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = Torquing.field_u;
        try {
          var5 = dp.field_a[param2] * this.field_u;
          if (this.field_C == 1) {
            var9 = this.field_x[0];
            var8 = this.field_t[0] << 12;
            var12 = var8 * this.field_D >> 12;
            var11 = var8 * var5 >> 12;
            var13 = var8 * this.field_u >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            var11 = var11 & 4095;
            if (var13 <= var16) {
              var16 = 0;
            }
            var14 = cf.field_a[var11];
            var17 = this.field_s[var15 & 255] & 255;
            var18 = this.field_s[var16 & 255] & 255;
            if (!this.field_B) {
              for (var10 = 0; var10 < ci.field_c; var10++) {
                var4_int = this.field_D * q.field_b[var10];
                var6 = this.a(var12, var4_int * var8 >> 12, var11, var14, var17, 4096, var18);
                param1[var10] = var6 * var9 >> 12;
              }
            } else {
              for (var10 = 0; ci.field_c > var10; var10++) {
                var4_int = this.field_D * q.field_b[var10];
                var6 = this.a(var12, var4_int * var8 >> 12, var11, var14, var17, 4096, var18);
                var6 = var9 * var6 >> 12;
                param1[var10] = (var6 >> 1) + 2048;
              }
            }
          } else {
            var9 = this.field_x[0];
            if (8 < var9 ||
              var9 < -8) {
              var8 = this.field_t[0] << 12;
              var13 = var8 * this.field_u >> 12;
              var11 = var5 * var8 >> 12;
              var12 = var8 * this.field_D >> 12;
              var15 = var11 >> 12;
              var16 = var15 + 1;
              var11 = var11 & 4095;
              if (var16 >= var13) {
                var16 = 0;
              }
              var17 = this.field_s[var15 & 255] & 255;
              var14 = cf.field_a[var11];
              var18 = 255 & this.field_s[var16 & 255];
              for (var10 = 0; ci.field_c > var10; var10++) {
                var4_int = q.field_b[var10] * this.field_D;
                var6 = this.a(var12, var4_int * var8 >> 12, var11, var14, var17, 4096, var18);
                param1[var10] = var6 * var9 >> 12;
              }
            }
            for (var7 = 1; var7 < this.field_C; var7++) {
              var9 = this.field_x[var7];
              if (var9 > 8 ||
                var9 < -8) {
                var8 = this.field_t[var7] << 12;
                var13 = this.field_u * var8 >> 12;
                var11 = var5 * var8 >> 12;
                var12 = var8 * this.field_D >> 12;
                var15 = var11 >> 12;
                var16 = var15 + 1;
                if (var13 <= var16) {
                  var16 = 0;
                }
                var11 = var11 & 4095;
                var14 = cf.field_a[var11];
                var18 = 255 & this.field_s[var16 & 255];
                var17 = this.field_s[255 & var15] & 255;
                if (this.field_B &&
                  var7 == this.field_C - 1) {
                  for (var10 = 0; ci.field_c > var10; var10++) {
                    var4_int = this.field_D * q.field_b[var10];
                    var6 = this.a(var12, var8 * var4_int >> 12, var11, var14, var17, 4096, var18);
                    var6 = param1[var10] + (var6 * var9 >> 12);
                    param1[var10] = 2048 + (var6 >> 1);
                  }
                } else {
                  for (var10 = 0; var10 < ci.field_c; var10++) {
                    var4_int = this.field_D * q.field_b[var10];
                    var6 = this.a(var12, var4_int * var8 >> 12, var11, var14, var17, 4096, var18);
                    param1[var10] = param1[var10] + (var6 * var9 >> 12);
                  }
                }
              }
            }
          }
          if (!param0) {
            this.a((byte) -49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("rj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_v = new cf(16);
    }
}
