/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends k {
    private int field_n;
    private short[] field_q;
    static String field_u;
    static qia field_k;
    static kv[] field_y;
    private boolean field_l;
    private short[] field_p;
    private byte[] field_s;
    private int field_x;
    private int field_v;
    static po field_r;
    private int field_t;
    private int field_w;
    static String field_o;
    static String field_m;

    private final void d(int param0) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        if (param0 < 123) {
          this.field_w = -41;
        }
        if (this.field_t > 0) {
          this.field_q = new short[this.field_n];
          this.field_p = new short[this.field_n];
          for (var2 = 0; this.field_n > var2; var2++) {
            this.field_q[var2] = (short)(int)(4096.0 * Math.pow((double)((float)this.field_t / 4096.0f), (double)var2));
            this.field_p[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (this.field_q != null &&
            this.field_q.length == this.field_n) {
            this.field_p = new short[this.field_n];
            for (var2 = 0; this.field_n > var2; var2++) {
              this.field_p[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
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
        var18 = BachelorFridge.field_y;
        var13 = param0 >> 12;
        var12 = 1 + var13;
        var13 = var13 & 255;
        param0 = param0 & 4095;
        if (param1 <= var12) {
          var12 = 0;
        }
        var10 = -4096 + param5;
        var12 = var12 & 255;
        var11 = -4096 + param0;
        var14 = this.field_s[param4 + var13] & 3;
        var15 = pja.field_g[param0];
        if (param6 <= ~var14) {
          if (var14 != 0) {
            stackIn_11_0 = -param0 + param5;
          } else {
            stackIn_11_0 = param5 + param0;
          }
          var8 = stackIn_11_0;
        } else {
          if (2 != var14) {
            stackIn_7_0 = -param5 - param0;
          } else {
            stackIn_7_0 = param0 - param5;
          }
          var8 = stackIn_7_0;
        }
        var14Lifetime1 = 3 & this.field_s[var12 + param4];
        if (var14Lifetime1 <= 1) {
          if (var14Lifetime1 != 0) {
            stackIn_20_0 = param5 - var11;
          } else {
            stackIn_20_0 = param5 + var11;
          }
          var9 = stackIn_20_0;
        } else {
          if (var14Lifetime1 != 2) {
            stackIn_16_0 = -var11 - param5;
          } else {
            stackIn_16_0 = -param5 + var11;
          }
          var9 = stackIn_16_0;
        }
        var14Lifetime2 = this.field_s[param3 + var13] & 3;
        var16 = ((var9 - var8) * var15 >> 12) + var8;
        if (1 >= var14Lifetime2) {
          if (0 != var14Lifetime2) {
            stackIn_29_0 = -param0 + var10;
          } else {
            stackIn_29_0 = param0 + var10;
          }
          var8Lifetime1 = stackIn_29_0;
        } else {
          if (var14Lifetime2 == 2) {
            stackIn_25_0 = -var10 + param0;
          } else {
            stackIn_25_0 = -var10 - param0;
          }
          var8Lifetime1 = stackIn_25_0;
        }
        var14Lifetime3 = this.field_s[var12 + param3] & 3;
        if (var14Lifetime3 <= 1) {
          if (var14Lifetime3 == 0) {
            stackIn_38_0 = var10 + var11;
          } else {
            stackIn_38_0 = -var11 + var10;
          }
          var9Lifetime1 = stackIn_38_0;
        } else {
          if (var14Lifetime3 == 2) {
            stackIn_34_0 = -var10 + var11;
          } else {
            stackIn_34_0 = -var10 - var11;
          }
          var9Lifetime1 = stackIn_34_0;
        }
        var17 = var8Lifetime1 + (var15 * (var9Lifetime1 - var8Lifetime1) >> 12);
        return var16 + ((var17 - var16) * param2 >> 12);
    }

    final void d(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        this.field_s = rba.a(this.field_v, -123);
        this.d(param0 ^ -61);
        if (param0 != -68) {
          discarded$1 = this.a(-16, -33, -101, 0, 61, 126, 106);
        }
        for (var2 = this.field_n - 1; var2 >= 1; var2--) {
          var3 = this.field_q[var2];
          if (8 >= var3 &&
            var3 >= -8) {
            this.field_n = this.field_n - 1;
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int[] param1, int param2) {
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
        var19 = BachelorFridge.field_y;
        try {
          var5 = tj.field_f[param2] * this.field_x;
          if (this.field_n == 1) {
            var8 = this.field_p[0] << 12;
            var9 = this.field_q[0];
            var13 = var8 * this.field_x >> 12;
            var12 = this.field_w * var8 >> 12;
            var11 = var8 * var5 >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            var11 = var11 & 4095;
            if (var16 >= var13) {
              var16 = 0;
            }
            var18 = 255 & this.field_s[var16 & 255];
            var14 = pja.field_g[var11];
            var17 = this.field_s[255 & var15] & 255;
            if (!this.field_l) {
              for (var10 = 0; var10 < hh.field_d; var10++) {
                var4_int = jq.field_k[var10] * this.field_w;
                var6 = this.a(var4_int * var8 >> 12, var12, var14, var18, var17, var11, param0 - 257);
                param1[var10] = var9 * var6 >> 12;
              }
            } else {
              for (var10 = 0; var10 < hh.field_d; var10++) {
                var4_int = this.field_w * jq.field_k[var10];
                var6 = this.a(var8 * var4_int >> 12, var12, var14, var18, var17, var11, -2);
                var6 = var9 * var6 >> 12;
                param1[var10] = 2048 + (var6 >> 1);
              }
            }
          } else {
            var9 = this.field_q[0];
            if (var9 > 8 ||
              var9 < -8) {
              var8 = this.field_p[0] << 12;
              var13 = var8 * this.field_x >> 12;
              var11 = var5 * var8 >> 12;
              var12 = this.field_w * var8 >> 12;
              var15 = var11 >> 12;
              var16 = var15 + 1;
              var11 = var11 & 4095;
              if (var16 >= var13) {
                var16 = 0;
              }
              var14 = pja.field_g[var11];
              var18 = this.field_s[var16 & 255] & 255;
              var17 = this.field_s[var15 & 255] & 255;
              for (var10 = 0; var10 < hh.field_d; var10++) {
                var4_int = this.field_w * jq.field_k[var10];
                var6 = this.a(var4_int * var8 >> 12, var12, var14, var18, var17, var11, -2);
                param1[var10] = var9 * var6 >> 12;
              }
            }
            for (var7 = 1; this.field_n > var7; var7++) {
              var9 = this.field_q[var7];
              if (var9 > 8 ||
                var9 < -8) {
                var8 = this.field_p[var7] << 12;
                var11 = var8 * var5 >> 12;
                var12 = var8 * this.field_w >> 12;
                var13 = var8 * this.field_x >> 12;
                var15 = var11 >> 12;
                var16 = 1 + var15;
                var11 = var11 & 4095;
                if (var13 <= var16) {
                  var16 = 0;
                }
                var17 = this.field_s[var15 & 255] & 255;
                var18 = 255 & this.field_s[var16 & 255];
                var14 = pja.field_g[var11];
                if (this.field_l &&
                  -1 + this.field_n == var7) {
                  for (var10 = 0; var10 < hh.field_d; var10++) {
                    var4_int = this.field_w * jq.field_k[var10];
                    var6 = this.a(var4_int * var8 >> 12, var12, var14, var18, var17, var11, -2);
                    var6 = (var9 * var6 >> 12) + param1[var10];
                    param1[var10] = 2048 + (var6 >> 1);
                  }
                } else {
                  for (var10 = 0; var10 < hh.field_d; var10++) {
                    var4_int = this.field_w * jq.field_k[var10];
                    var6 = this.a(var8 * var4_int >> 12, var12, var14, var18, var17, var11, -2);
                    param1[var10] = param1[var10] + (var9 * var6 >> 12);
                  }
                }
              }
            }
          }
          if (param0 != 255) {
            this.field_w = -73;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[] a(int param0, int param1) {
        int[] var4 = this.field_j.a(param0, ~param1);
        int[] var3 = var4;
        if (this.field_j.field_m) {
          this.a(255, var4, param0);
        }
        if (param1 != 0) {
          this.field_l = false;
        }
        return var4;
    }

    public static void b(boolean param0) {
        field_o = null;
        field_r = null;
        field_m = null;
        field_y = null;
        if (!param0) {
          return;
        }
        field_u = null;
        field_k = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int dupTemp$0 = 0;
        boolean stackIn_18_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            this.field_n = -61;
          }
          var4_int = param2;
          if (0 == var4_int) {
            stackIn_18_1 = (param1.b(16711935) == 1);
            this.field_l = stackIn_18_1;
          } else {
            if (1 != var4_int) {
              if (var4_int == 2) {
                this.field_t = param1.c((byte) -85);
                if (0 > this.field_t) {
                  this.field_q = new short[this.field_n];
                  for (var4_int = 0; this.field_n > var4_int; var4_int++) {
                    this.field_q[var4_int] = (short)param1.c((byte) -85);
                  }
                }
              } else {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    if (var4_int != 5) {
                      if (var4_int == 6) {
                        this.field_x = param1.b(16711935);
                      }
                    } else {
                      this.field_w = param1.b(16711935);
                    }
                  } else {
                    this.field_v = param1.b(param0 + 16712006);
                  }
                } else {
                  dupTemp$0 = param1.b(16711935);
                  this.field_x = dupTemp$0;
                  this.field_w = dupTemp$0;
                }
              }
            } else {
              this.field_n = param1.b(16711935);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("dc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    public dc() {
        super(0, true);
        this.field_n = 4;
        this.field_s = new byte[512];
        this.field_x = 4;
        this.field_l = true;
        this.field_v = 0;
        this.field_t = 1638;
        this.field_w = 4;
    }

    static {
        field_u = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_k = new qia();
        field_o = "***Failed!***";
    }
}
