/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static ci field_f;
    private int[] field_e;
    private boolean field_h;
    private int field_b;
    static int[] field_d;
    private int field_g;
    static String field_a;
    static int[] field_c;

    final static void a(int param0, int param1, int param2, int param3, int param4, rm param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        he stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        he var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        rm var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = Confined.field_J ? 1 : 0;
        try {
          var45 = param5;
          if (var45.field_P != null &&
            var45.field_A > 1) {
            var61 = var45.field_P;
            fc.a(-1257536924, 0, bd.field_g, 0, var61);
          } else {
            wb.a(-60);
          }
          var55 = new int[param5.field_g];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param5.field_g];
          var64 = tf.field_m;
          var63 = sd.field_c;
          var62 = w.field_R;
          if (param1 <= 46) {
            field_a = (String) null;
          }
          for (var13 = 0; var13 < param5.field_g; var13++) {
            var14 = param4 * var62[var13] + (var63[var13] * param0 + param6 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (0 > var14) {
              stackIn_17_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_17_0 = var14 + 128;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = param3 * var64[var13] + param7 * var63[var13] + param2 * var62[var13] >> 8;
            stackIn_19_0 = oj.field_D;
            if (0 <= var15) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < ei.field_jb) {
            var14Lifetime1 = tl.field_i[var44];
            var15Lifetime1 = param5.field_z[var14Lifetime1];
            var16 = param5.field_m[var14Lifetime1];
            var17 = param5.field_J[var14Lifetime1];
            if (tf.field_m.length <= param5.field_j[var14Lifetime1]) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param5.field_j[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (param5.field_l[var14Lifetime1] >= tf.field_m.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param5.field_l[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param5.field_o[var14Lifetime1] < tf.field_m.length) {
              stackIn_32_0 = param5.field_o[var14Lifetime1];
            } else {
              stackIn_32_0 = -1;
            }
            var20 = stackIn_32_0;
            if (im.field_a != null &&
              param5.field_a != null &&
              param5.field_a.length > var14Lifetime1 &&
              -1 != param5.field_a[var14Lifetime1] &&
              im.field_a.length > param5.field_a[var14Lifetime1]) {
              stackIn_40_0 = im.field_a[param5.field_a[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = qf.field_a[var15Lifetime1];
            var23 = db.field_x[var15Lifetime1];
            var24 = qf.field_a[var16];
            var25 = db.field_x[var16];
            var26 = qf.field_a[var17];
            var27 = db.field_x[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 == null) {
                stackIn_50_0 = 8355711;
              } else {
                stackIn_50_0 = var21.field_a;
              }
              var30 = stackIn_50_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (var28 * var31 & -16711707) >>> 8 | (16711867 & var28 * var32) >>> 8;
              var33 = var33 + var29 * 65793;
              da.a(var26, var22, var23, (byte) -122, var27, var24, (var33 & 16711422) >> 1, var25);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 != null) {
                stackIn_46_0 = var21.field_a;
              } else {
                stackIn_46_0 = 8355711;
              }
              var34 = stackIn_46_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = (var28 * var35 & -16711825) >>> 8 | (16711793 & var28 * var36) >>> 8;
              var38 = var29 * var36 >>> 8 & 889257728 | (var29 * var35 & -16711738) >>> 8;
              var37 = var37 + 65793 * var31;
              var39 = var36 * var30 >>> 8 & -285147392 | (var30 * var35 & -16711732) >>> 8;
              var38 = var38 + 65793 * var32;
              var39 = var39 + var33 * 65793;
              tb.a(var38 >> 16, var23, 255 & var39, var25, var39 >> 16, 255 & var37, var39 >> 8 & 255, 255 & var37 >> 8, var24, 255 & var38, var27, var22, var26, -77, var38 >> 8 & 255, var37 >> 16);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("wl.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        if (param0 < 0 ||
          this.field_g < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.field_g) {
          lj.a(this.field_e, param0 + 1, this.field_e, param0, this.field_g - param0);
        }
        if (param1 >= -83) {
          field_f = (ci) null;
        }
        this.field_g = this.field_g - 1;
    }

    final static void a(int param0) {
        try {
          if (null != bg.field_b) {
            try {
              bg.field_b.a((byte) 123, 0L);
              bg.field_b.a(24, (byte) 9, e.field_c.field_n, e.field_c.field_m);
            } catch (Exception exception) {
            }
          }
          e.field_c.field_n = e.field_c.field_n + 24;
          if (param0 != 1607962024) {
            field_f = (ci) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0) {
          return;
        }
        field_a = null;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        var3 = this.field_e.length;
        if (param1 <= 25) {
          return 95;
        }
        while (param0 >= var3) {
          if (!this.field_h) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    final int a(int param0, int param1) {
        if (this.field_g < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 != 27656) {
          field_a = (String) null;
        }
        return this.field_e[param0];
    }

    final static void a(int param0, boolean param1, boolean param2) {
        String var4 = (String) null;
        gk.$cfr$intArgs$a$c13c9cd76cbe(param1, (String) null, -116, param2);
        if (param0 > -14) {
          field_f = (ci) null;
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.b(param0, 95)];
        int[] var3 = var4;
        if (param1 != -9407) {
          this.c(10, -1);
        }
        lj.a(this.field_e, 0, var4, 0, this.field_e.length);
        this.field_e = var4;
    }

    final int a(byte param0) {
        if (param0 <= 86) {
          return 33;
        }
        return 1 + this.field_g;
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 > this.field_g) {
          this.field_g = param2;
        }
        if (param2 >= this.field_e.length) {
          this.c(param2, param1 ^ -287652375);
        }
        if (param1 != 287645352) {
          this.c(122, -120);
        }
        this.field_e[param2] = param0;
    }

    final void a(byte param0, int param1) {
        if (param0 > -51) {
          field_d = (int[]) null;
        }
        this.a(param1, 287645352, 1 + this.field_g);
    }

    private wl() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new ci();
        field_d = new int[8192];
        field_a = "Unpacking graphics";
        field_c = new int[]{1, 3, 15, 6, 17, 11, 1, 1, 1, 7, 1, 5, 9, 1, 1, 1, 1, 1};
    }
}
