/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kbb extends le {
    static String field_q;
    private int field_i;
    private int field_j;
    private int field_k;
    private int field_l;
    private int field_o;
    private int field_n;
    private int field_s;
    static int field_p;
    private int field_r;
    private int field_m;

    final static void a(asb param0, asb param1, asb param2, byte param3, asb param4) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          djb.field_s = new ima[5][];
          ok.field_b = new sw[5];
          ok.field_b[0] = tg.a(param3 + 14135, param1, "basic", "tinyfont_graphics2");
          djb.field_s[0] = ima.a(param2, "basic", "tinyfont_graphics2");
          ok.field_b[1] = tg.a(14223, param1, "basic", "antigrav_24_graphics2");
          djb.field_s[1] = ima.a(param2, "basic", "font_antigrav_24_alpha");
          ok.field_b[2] = tg.a(14223, param1, "basic", "antigrav_18_graphics2");
          djb.field_s[2] = ima.a(param2, "basic", "font_antigrav_18_alpha");
          ok.field_b[3] = tg.a(mgb.a((int) param3, 14295), param1, "basic", "calibri_11_graphics2");
          djb.field_s[3] = ima.a(param2, "basic", "font_calibri_11_alpha");
          ok.field_b[4] = tg.a(14223, param1, "basic", "calibri_12_graphics2");
          djb.field_s[4] = ima.a(param2, "basic", "font_calibri_12_alpha");
          if (param3 != 88) {
            return;
          }
          nkb.a(false, "Finished unpacking raw fonts");
          po.field_o = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("kbb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (1 == var4_int) {
              this.field_o = (param2.d((byte) -114) << 12) / 100;
            } else {
              if (var4_int == 2) {
                this.field_n = (param2.d((byte) -114) << 12) / 100;
              }
            }
          } else {
            this.field_j = param2.a(true);
          }
          if (param1 <= -60) {
            return;
          }
          this.b(108, 41, -61, 78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("kbb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_q = null;
        int var1 = -4 % ((-75 - param0) / 37);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_2 = 0;
        int stackIn_35_1 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_47_1 = 0;
        int stackIn_52_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_61_1 = 0;
        int stackIn_62_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var6Lifetime1;
        var11 = VoidHunters.field_G;
        stackIn_3_0 = (param1 < param2) ? param2 : param1;
        var5 = stackIn_3_0;
        stackIn_6_0 = (param1 <= param2) ? param1 : param2;
        var6 = stackIn_6_0;
        if (param0 > -10) {
          kbb.e((byte) 5);
        }
        stackIn_11_0 = (var5 < param3) ? param3 : var5;
        var5Lifetime1 = stackIn_11_0;
        stackIn_14_0 = (var6 <= param3) ? var6 : param3;
        var6Lifetime1 = stackIn_14_0;
        var7 = -var6Lifetime1 + var5Lifetime1;
        this.field_l = (var5Lifetime1 + var6Lifetime1) / 2;
        if (0 >= var7) {
          this.field_i = 0;
          if (this.field_l <= 0) {
            this.field_k = 0;
          } else {
            if (4096 <= this.field_l) {
              this.field_k = 0;
            } else {
              stackIn_61_1 = var7 << 12;
              if (this.field_l <= 2048) {
                stackIn_62_2 = this.field_l * 2;
              } else {
                stackIn_62_2 = -(this.field_l * 2) + 8192;
              }
              this.field_k = stackIn_61_1 / stackIn_62_2;
            }
          }
          return;
        }
        var8 = (-param2 + var5Lifetime1 << 12) / var7;
        var9 = (var5Lifetime1 - param1 << 12) / var7;
        var10 = (-param3 + var5Lifetime1 << 12) / var7;
        if (var5Lifetime1 == param2) {
          if (var6Lifetime1 != param1) {
            stackIn_19_1 = -var9 + 4096;
          } else {
            stackIn_19_1 = 20480 + var10;
          }
          this.field_i = stackIn_19_1;
          this.field_i = this.field_i / 6;
          if (this.field_l <= 0) {
            this.field_k = 0;
          } else {
            if (4096 <= this.field_l) {
              this.field_k = 0;
            } else {
              stackIn_28_1 = var7 << 12;
              if (this.field_l <= 2048) {
                stackIn_29_2 = this.field_l * 2;
              } else {
                stackIn_29_2 = -(this.field_l * 2) + 8192;
              }
              this.field_k = stackIn_28_1 / stackIn_29_2;
            }
          }
        } else {
          if (var5Lifetime1 != param1) {
            if (var6Lifetime1 != param2) {
              stackIn_47_1 = -var8 + 20480;
            } else {
              stackIn_47_1 = var9 + 12288;
            }
            this.field_i = stackIn_47_1;
            this.field_i = this.field_i / 6;
            if (this.field_l <= 0) {
              this.field_k = 0;
            } else {
              if (4096 <= this.field_l) {
                this.field_k = 0;
              } else {
                stackIn_52_1 = var7 << 12;
                if (this.field_l <= 2048) {
                  stackIn_53_2 = this.field_l * 2;
                } else {
                  stackIn_53_2 = -(this.field_l * 2) + 8192;
                }
                this.field_k = stackIn_52_1 / stackIn_53_2;
              }
            }
          } else {
            if (var6Lifetime1 != param3) {
              stackIn_35_1 = 12288 - var10;
            } else {
              stackIn_35_1 = 4096 + var8;
            }
            this.field_i = stackIn_35_1;
            this.field_i = this.field_i / 6;
            if (this.field_l <= 0) {
              this.field_k = 0;
            } else {
              if (4096 <= this.field_l) {
                this.field_k = 0;
              } else {
                stackIn_41_1 = var7 << 12;
                if (this.field_l <= 2048) {
                  stackIn_42_2 = this.field_l * 2;
                } else {
                  stackIn_42_2 = -(this.field_l * 2) + 8192;
                }
                this.field_k = stackIn_41_1 / stackIn_42_2;
              }
            }
          }
        }
        return;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int stackIn_3_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        var14 = VoidHunters.field_G;
        if (param2 <= 2048) {
          stackIn_3_0 = param2 * (param0 + 4096) >> 12;
        } else {
          stackIn_3_0 = param0 + param2 - (param0 * param2 >> 12);
        }
        var5 = stackIn_3_0;
        if (param3 != 4096) {
          return;
        }
        if (0 >= var5) {
          this.field_m = param2;
          this.field_s = param2;
          this.field_r = param2;
          return;
        }
        param1 = param1 * 6;
        var6 = param2 + param2 - var5;
        var7 = (-var6 + var5 << 12) / var5;
        var8 = param1 >> 12;
        var9 = -(var8 << 12) + param1;
        var10 = var5;
        var10 = var7 * var10 >> 12;
        var10 = var9 * var10 >> 12;
        var11 = var10 + var6;
        var12 = -var10 + var5;
        var13 = var8;
        if (var13 == 0) {
          this.field_s = var11;
          this.field_r = var5;
          this.field_m = var6;
          return;
        }
        if (var13 == 1) {
          this.field_r = var12;
          this.field_s = var5;
          this.field_m = var6;
          return;
        }
        if (2 == var13) {
          this.field_r = var6;
          this.field_s = var5;
          this.field_m = var11;
          return;
        }
        if (var13 == 3) {
          this.field_m = var5;
          this.field_s = var12;
          this.field_r = var6;
          return;
        }
        if (4 == var13) {
          this.field_m = var5;
          this.field_s = var6;
          this.field_r = var11;
          return;
        }
        if (var13 != 5) {
          return;
        }
        this.field_r = var5;
        this.field_m = var12;
        this.field_s = var6;
        return;
    }

    final int[][] a(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = VoidHunters.field_G;
        var20 = this.field_d.a(param1, (byte) -118);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (!this.field_d.field_g) {
          if (param0 != 255) {
            this.b(72, 53, 92, -63);
          }
          return var3;
        }
        var28 = this.a((byte) 108, 0, param1);
        var30 = var28[0];
        var29 = var28[1];
        var31 = var28[2];
        var8 = var20[0];
        var9 = var20[1];
        var10 = var20[2];
        for (var11 = 0; hob.field_d > var11; var11++) {
          this.a((byte) -44, var29[var11], var30[var11], var31[var11]);
          this.field_l = this.field_l + this.field_n;
          this.field_k = this.field_k + this.field_o;
          this.field_i = this.field_i + this.field_j;
          while (0 > this.field_i) {
            this.field_i = this.field_i + 4096;
          }
          while (4096 < this.field_i) {
            this.field_i = this.field_i - 4096;
          }
          if (this.field_k < 0) {
            this.field_k = 0;
          }
          if (this.field_k > 4096) {
            this.field_k = 4096;
          }
          if (this.field_l < 0) {
            this.field_l = 0;
          }
          if (this.field_l > 4096) {
            this.field_l = 4096;
          }
          this.b(this.field_k, this.field_i, this.field_l, 4096);
          var8[var11] = this.field_r;
          var9[var11] = this.field_s;
          var10[var11] = this.field_m;
        }
        if (param0 != 255) {
          this.b(72, 53, 92, -63);
        }
        return var3;
    }

    public kbb() {
        super(1, false);
        this.field_n = 0;
        this.field_o = 0;
        this.field_j = 0;
    }

    static {
    }
}
