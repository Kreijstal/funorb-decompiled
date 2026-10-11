/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lva extends ci {
    private short[] field_r;
    int field_w;
    int field_n;
    boolean field_s;
    private byte[] field_p;
    int field_z;
    static nh[] field_m;
    static String field_o;
    static String field_v;
    static String field_y;
    static jea field_t;
    int field_x;
    int field_u;
    private short[] field_q;

    private final void c(int param0) {
        int var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 < this.field_x) {
          this.field_q = new short[this.field_n];
          this.field_r = new short[this.field_n];
          for (var2 = 0; this.field_n > var2; var2++) {
            this.field_q[var2] = (short)(int)(Math.pow((double)((float)this.field_x / 4096.0f), (double)var2) * 4096.0);
            this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
          }
        } else {
          if (null != this.field_q &&
            this.field_q.length == this.field_n) {
            this.field_r = new short[this.field_n];
            for (var2 = 0; this.field_n > var2; var2++) {
              this.field_r[var2] = (short)(int)Math.pow(2.0, (double)var2);
            }
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int dupTemp$0 = 0;
        boolean stackIn_16_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (1 != var4_int) {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  dupTemp$0 = param1.h(255);
                  this.field_w = dupTemp$0;
                  this.field_u = dupTemp$0;
                } else {
                  if (var4_int != 4) {
                    if (5 == var4_int) {
                      this.field_u = param1.h(255);
                    } else {
                      if (var4_int == 6) {
                        this.field_w = param1.h(255);
                      }
                    }
                  } else {
                    this.field_z = param1.h(255);
                  }
                }
              } else {
                this.field_x = param1.b(false);
                if (this.field_x < 0) {
                  this.field_q = new short[this.field_n];
                  for (var4_int = 0; var4_int < this.field_n; var4_int++) {
                    this.field_q[var4_int] = (short)param1.b(false);
                  }
                }
              }
            } else {
              this.field_n = param1.h(255);
            }
          } else {
            stackIn_16_1 = (param1.h(255) == 1);
            this.field_s = stackIn_16_1;
          }
          if (param0 != 107) {
            this.field_u = -71;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_31_0 = var4;
          stackIn_31_1 = new StringBuilder().append("lva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var7 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
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
        uia var20 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = sj.field_b[param2] * this.field_w;
          if (this.field_n == 1) {
            var8 = this.field_r[0] << 12;
            var9 = this.field_q[0];
            var12 = var8 * this.field_u >> 12;
            var11 = var8 * var5 >> 12;
            var13 = this.field_w * var8 >> 12;
            var15 = var11 >> 12;
            var16 = 1 + var15;
            if (var16 >= var13) {
              var16 = 0;
            }
            var11 = var11 & 4095;
            var17 = this.field_p[255 & var15] & 255;
            var14 = pba.field_b[var11];
            var18 = this.field_p[var16 & 255] & 255;
            if (!this.field_s) {
              for (var10 = 0; var10 < ns.field_g; var10++) {
                var4_int = ht.field_Fb[var10] * this.field_u;
                var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                param0[var10] = var9 * var6 >> 12;
              }
            } else {
              for (var10 = 0; ns.field_g > var10; var10++) {
                var4_int = ht.field_Fb[var10] * this.field_u;
                var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                var6 = var6 * var9 >> 12;
                param0[var10] = 2048 + (var6 >> 1);
              }
            }
          } else {
            var9 = this.field_q[0];
            if (var9 > 8 ||
              var9 < -8) {
              var8 = this.field_r[0] << 12;
              var12 = this.field_u * var8 >> 12;
              var11 = var5 * var8 >> 12;
              var13 = this.field_w * var8 >> 12;
              var15 = var11 >> 12;
              var16 = 1 + var15;
              var11 = var11 & 4095;
              if (var13 <= var16) {
                var16 = 0;
              }
              var18 = 255 & this.field_p[255 & var16];
              var17 = this.field_p[var15 & 255] & 255;
              var14 = pba.field_b[var11];
              for (var10 = 0; ns.field_g > var10; var10++) {
                var4_int = this.field_u * ht.field_Fb[var10];
                var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 12, var12, var18);
                param0[var10] = var6 * var9 >> 12;
              }
            }
            for (var7 = 1; this.field_n > var7; var7++) {
              var9 = this.field_q[var7];
              if (var9 > 8 ||
                var9 < -8) {
                var8 = this.field_r[var7] << 12;
                var12 = var8 * this.field_u >> 12;
                var11 = var8 * var5 >> 12;
                var13 = this.field_w * var8 >> 12;
                var15 = var11 >> 12;
                var16 = var15 + 1;
                var11 = var11 & 4095;
                if (var16 >= var13) {
                  var16 = 0;
                }
                var18 = this.field_p[255 & var16] & 255;
                var17 = this.field_p[255 & var15] & 255;
                var14 = pba.field_b[var11];
                if (this.field_s &&
                  this.field_n - 1 == var7) {
                  for (var10 = 0; ns.field_g > var10; var10++) {
                    var4_int = this.field_u * ht.field_Fb[var10];
                    var6 = this.a(var17, false, var14, var11, var8 * var4_int >> 12, var12, var18);
                    var6 = (var6 * var9 >> 12) + param0[var10];
                    param0[var10] = (var6 >> 1) + 2048;
                  }
                } else {
                  for (var10 = 0; var10 < ns.field_g; var10++) {
                    var4_int = this.field_u * ht.field_Fb[var10];
                    var6 = this.a(var17, false, var14, var11, var4_int * var8 >> 12, var12, var18);
                    param0[var10] = param0[var10] + (var9 * var6 >> 12);
                  }
                }
              }
            }
          }
          if (param1 != -1) {
            var20 = (uia) null;
            this.a((byte) 111, (uia) null, 5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("lva.I(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        if (param0 >= -34) {
          lva.d((byte) 124);
        }
        field_o = null;
        field_m = null;
        field_y = null;
        field_t = null;
        field_v = null;
    }

    final static boolean a(int param0, byte param1, int param2) {
        boolean stackIn_7_0 = false;
        if (param1 != -21) {
          field_v = (String) null;
        }
        stackIn_7_0 = (hh.a(param0, (byte) 5, param2)) || (upa.a(param2, 0, param0));
        return stackIn_7_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.field_p = pca.a(this.field_z, (byte) 109);
        if (param0 != 116) {
          this.b((byte) 55);
        }
        this.c(0);
        for (var2 = this.field_n - 1; var2 >= 1; var2--) {
          var3 = this.field_q[var2];
          if (var3 <= 8 &&
            var3 >= -8) {
            this.field_n = this.field_n - 1;
            continue;
          }
          break;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var4 = this.field_i.a((byte) -119, param1);
        int[] var3 = var4;
        if (param0 != 1) {
          this.field_q = (short[]) null;
        }
        if (this.field_i.field_d) {
          this.a(var4, param0 - 2, param1);
        }
        return var4;
    }

    final static void a(g[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        if (param1 >= param2) {
          return;
        }
        try {
          var4_int = param1;
          var5 = po.a(param2, var4_int, param1, (byte) -65, param0);
          lva.a(param0, param1, -1 + var5, param3);
          lva.a(param0, 1 + var5, param2, param3 + 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lva.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
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
        var18 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          return -28;
        }
        var13 = param4 >> 12;
        var12 = 1 + var13;
        var13 = var13 & 255;
        param4 = param4 & 4095;
        if (param5 <= var12) {
          var12 = 0;
        }
        var10 = -4096 + param3;
        var12 = var12 & 255;
        var11 = -4096 + param4;
        var15 = pba.field_b[param4];
        var14 = 3 & this.field_p[param0 + var13];
        if (var14 > 1) {
          if (var14 == 2) {
            stackIn_12_0 = param4 - param3;
          } else {
            stackIn_12_0 = -param4 - param3;
          }
          var8 = stackIn_12_0;
        } else {
          if (0 == var14) {
            stackIn_8_0 = param3 + param4;
          } else {
            stackIn_8_0 = -param4 + param3;
          }
          var8 = stackIn_8_0;
        }
        var14Lifetime1 = 3 & this.field_p[var12 + param0];
        if (var14Lifetime1 > 1) {
          if (2 == var14Lifetime1) {
            stackIn_21_0 = var11 - param3;
          } else {
            stackIn_21_0 = -param3 - var11;
          }
          var9 = stackIn_21_0;
        } else {
          if (var14Lifetime1 != 0) {
            stackIn_17_0 = -var11 + param3;
          } else {
            stackIn_17_0 = param3 + var11;
          }
          var9 = stackIn_17_0;
        }
        var16 = var8 + ((var9 - var8) * var15 >> 12);
        var14Lifetime2 = this.field_p[var13 + param6] & 3;
        if (1 >= var14Lifetime2) {
          if (var14Lifetime2 == 0) {
            stackIn_30_0 = param4 + var10;
          } else {
            stackIn_30_0 = -param4 + var10;
          }
          var8Lifetime1 = stackIn_30_0;
        } else {
          if (2 != var14Lifetime2) {
            stackIn_26_0 = -var10 - param4;
          } else {
            stackIn_26_0 = -var10 + param4;
          }
          var8Lifetime1 = stackIn_26_0;
        }
        var14Lifetime3 = this.field_p[param6 + var12] & 3;
        if (var14Lifetime3 <= 1) {
          if (0 != var14Lifetime3) {
            stackIn_39_0 = -var11 + var10;
          } else {
            stackIn_39_0 = var11 + var10;
          }
          var9Lifetime1 = stackIn_39_0;
        } else {
          if (2 == var14Lifetime3) {
            stackIn_35_0 = -var10 + var11;
          } else {
            stackIn_35_0 = -var11 - var10;
          }
          var9Lifetime1 = stackIn_35_0;
        }
        var17 = ((-var8Lifetime1 + var9Lifetime1) * var15 >> 12) + var8Lifetime1;
        return var16 + (param2 * (-var16 + var17) >> 12);
    }

    public lva() {
        super(0, true);
        this.field_s = true;
        this.field_z = 0;
        this.field_x = 1638;
        this.field_n = 4;
        this.field_p = new byte[512];
        this.field_u = 4;
        this.field_w = 4;
    }

    static {
        field_o = "Click or press F10 to open Quick Chat";
        field_y = "Arrow";
        field_v = "You cannot join this game - it is in progress";
    }
}
