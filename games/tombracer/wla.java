/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wla extends jea {
    private jea field_zb;
    private int field_Gb;
    private jea[] field_yb;
    private jea field_xb;
    private jea field_Fb;
    private jea field_Bb;
    private jea field_tb;
    static ur field_Eb;
    long field_Db;
    static int field_ub;
    private jea field_wb;
    private StringBuilder field_vb;
    private ta field_Ab;
    static volatile boolean field_Cb;

    private final int a(int param0, int param1, jea param2, int param3, jea param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0 += 8;
          if (param1 != 13) {
            stackIn_2_0 = -113;
            return stackIn_2_0;
          }
          var6_int = param4.field_H.a(param4.field_r, -(2 * param4.field_x) + param3, param4.field_P);
          param4.a(param3, var6_int, -23776, param0, 0);
          param0 = param0 + (var6_int - 0);
          param2.b(-125, param4);
          stackIn_4_0 = param0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("wla.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_Eb = null;
        if (!param0) {
          field_Cb = true;
        }
    }

    final String f(int param0) {
        int var2 = -32 / ((-45 - param0) / 61);
        return this.field_vb.toString();
    }

    wla(int param0, int param1, int param2, int param3, int param4, jea param5, jea param6, jea param7, jea param8, ta param9, jea param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        jea[] var15 = null;
        int var15_int = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        jea[] var28 = null;
        Object stackIn_7_0;
        ta stackIn_7_1;
        ta stackIn_7_2;
        long stackIn_7_3;
        ta stackIn_7_4;
        Object stackIn_8_0;
        ta stackIn_8_1;
        ta stackIn_8_2;
        String stackIn_8_5;
        jea stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        Object stackIn_7_0Lifetime1;
        ta stackIn_7_1Lifetime1;
        ta stackIn_7_2Lifetime1;
        Object stackIn_8_0Lifetime1;
        ta stackIn_8_1Lifetime1;
        ta stackIn_8_2Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime2;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var20Lifetime2;
        int var20Lifetime3;
        this.field_Gb = -2;
        try {
          this.field_Db = param12;
          this.field_zb = new jea(0L, param6, gfa.field_m.toUpperCase());
          this.field_zb.field_z = 1;
          this.b(-126, this.field_zb);
          this.field_Fb = new jea(0L, param7);
          this.field_zb.b(-123, this.field_Fb);
          this.field_wb = new jea(0L, (jea) null);
          this.b(-127, this.field_wb);
          if (param11 != null) {
            this.field_Bb = new jea(0L, param8, fpa.field_a);
            this.field_Bb.field_ib = 11184810;
            this.field_Bb.field_z = 1;
            this.field_wb.b(-122, this.field_Bb);
            this.field_tb = new jea(0L, param8, nla.field_b);
            this.field_tb.field_ib = 11184810;
            this.field_tb.field_z = 1;
            this.field_wb.b(-122, this.field_tb);
            this.field_xb = new jea(0L, param8);
            this.field_xb.field_ib = 16764006;
            this.field_wb.b(-125, this.field_xb);
            this.field_xb.field_sb = "|";
            if (!(rja.field_e < 5) ||
              !(ld.field_e < 2)) {
              L3: {
                stackIn_7_0 = this;
                stackIn_7_1 = null;
                stackIn_7_2 = null;
                stackIn_7_3 = 0L;
                stackIn_7_4 = (ta) (param9);
                if (rja.field_e < 7) {
                  stackIn_7_0Lifetime1 = this;
                  stackIn_7_1Lifetime1 = null;
                  stackIn_7_2Lifetime1 = null;
                  if (ld.field_e < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = pl.field_c;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = ur.field_b;
              }
              this.field_Ab = new ta(stackIn_7_3, stackIn_7_4, stackIn_8_5);
              this.field_wb.b(-125, this.field_Ab);
            }
            var28 = new jea[3];
            var15 = var28;
            var28[0] = new jea(0L, (jea) null);
            this.field_wb.b(-123, var28[0]);
            var28[1] = new jea(0L, (jea) null);
            this.field_wb.b(-122, var28[1]);
            var28[2] = new jea(0L, (jea) null);
            this.field_wb.b(-127, var28[2]);
            this.field_yb = new jea[rh.field_n];
            for (var16 = 0; rh.field_n > var16; var16++) {
              if (null != aca.field_h[var16]) {
                this.field_yb[var16] = new jea(0L, param10, aca.field_h[var16]);
                this.field_yb[var16].field_z = 0;
                stackIn_14_0 = this.field_yb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_X = stackIn_15_1;
                this.field_wb.b(-128, this.field_yb[var16]);
              }
            }
            this.field_vb = new StringBuilder(12);
            if (null != param11) {
              discarded$1 = this.field_vb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_H.b(ai.field_c);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_H.b(qba.field_b);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_H.b(lo.field_o);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < rh.field_n; var17Lifetime4++) {
              if (this.field_yb[var17Lifetime4] != null) {
                var18 = this.field_yb[var17Lifetime4].b((byte) 69);
                if (var18 > var16Lifetime2) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (var16Lifetime2 > 140) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(param6, ai.field_c, var16Lifetime2, var18Lifetime3, 8421504, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[6]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[9]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[5]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[7]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[15]);
            var18Lifetime3 = this.a(var18Lifetime3, 13, var28[0], var16Lifetime2, this.field_yb[4]);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(param6, qba.field_b, var16Lifetime2, var18Lifetime4, 8421504, var28[1]);
            var18Lifetime4 = this.a(var18Lifetime4, 13, var28[1], var16Lifetime2, this.field_yb[16]);
            var18Lifetime4 = this.a(var18Lifetime4, 13, var28[1], var16Lifetime2, this.field_yb[17]);
            var18Lifetime4 = this.a(var18Lifetime4, 13, var28[1], var16Lifetime2, this.field_yb[18]);
            var18Lifetime4 = this.a(var18Lifetime4, 13, var28[1], var16Lifetime2, this.field_yb[19]);
            var18Lifetime4 = this.a(var18Lifetime4, 13, var28[1], var16Lifetime2, this.field_yb[20]);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(param6, lo.field_o, var16Lifetime2, var18Lifetime5, 8421504, var28[2]);
            var18Lifetime5 = this.a(var18Lifetime5, 13, var28[2], var16Lifetime2, this.field_yb[13]);
            var18Lifetime5 = this.a(var18Lifetime5, 13, var28[2], var16Lifetime2, this.field_yb[21]);
            var18Lifetime5 = this.a(var18Lifetime5, 13, var28[2], var16Lifetime2, this.field_yb[11]);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + 3 * var16Lifetime2;
            var20 = this.field_zb.b((byte) 69);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.field_Ab) {
              var20Lifetime2 = this.field_Ab.a((byte) 95, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_zb.a(13 + (13 + var19), 24, -23776, 0, 0);
            this.field_Fb.a(15, 15, -23776, 5, -20 + this.field_zb.field_G);
            var21 = 10;
            this.field_Bb.a(var19, 2 * di.field_a, -23776, var21, 13);
            var21 = var21 + di.field_a * 2;
            this.field_tb.a(var19, 2 * di.field_a, -23776, var21, 13);
            var21 = var21 + (10 + 2 * di.field_a);
            this.field_xb.a(0, di.field_a, -23776, var21, 0);
            var21 = var21 + (di.field_a + 10);
            if (null != this.field_Ab) {
              var20Lifetime3 = this.field_Ab.a((byte) 95, 4);
              this.field_Ab.a(var20Lifetime3, var21, (byte) -110, 4, di.field_a, 13 + (-var20Lifetime3 + var19) / 2);
              var21 = var21 + (10 + di.field_a);
            }
            var28[0].a(var16Lifetime2, var17Lifetime5, -23776, var21, 13);
            var28[1].a(var16Lifetime2, var17Lifetime5, -23776, var21, 13 + (13 + var16Lifetime2));
            var28[2].a(var16Lifetime2, var17Lifetime5, -23776, var21, 26 + (2 * var16Lifetime2 + 13));
            var22 = var21;
            this.field_wb.a(var19 + 26, 10 + (var17Lifetime5 + var22), -23776, 24, 0);
            this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -125, 8421504);
            var23 = 13 + (13 + var19);
            var24 = 10 + var17Lifetime5 + (var22 + 24);
            var25 = bt.a((byte) -8, var23, param2, param0);
            var26 = hsa.a(param3, var24, param1, (byte) -99);
            this.a(var23, var24, -23776, var26, var25);
            return;
          }
          this.field_Bb = new jea(0L, param8, rh.field_r);
          this.field_Bb.field_z = 1;
          this.field_Bb.field_ib = 11184810;
          this.field_wb.b(-126, this.field_Bb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Bb.field_H.a(this.field_Bb.field_r, var15_int);
          this.field_Bb.a(var15_int, di.field_a * var17Lifetime1, -23776, var16Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * di.field_a;
          this.field_wb.a(26 + var15_int, var16Lifetime1 + 10, -23776, 24, 0);
          this.field_wb.field_w = hca.c(this.field_wb.field_t, 2105376, 3, 11579568, -121, 8421504);
          var18Lifetime1 = 13 + var15_int + 13;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = bt.a((byte) -8, var18Lifetime1, param2, param0);
          var21Lifetime1 = hsa.a(param3, var19Lifetime1, param1, (byte) 53);
          this.a(var18Lifetime1, var19Lifetime1, -23776, var21Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("wla.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',');
          if (param6 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_57_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param7 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          stackIn_60_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',');
          if (param8 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          stackIn_63_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',');
          if (param9 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',');
          if (param10 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param11 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final boolean c(boolean param0) {
        boolean stackIn_6_0 = false;
        if (param0) {
          this.b(false);
        }
        stackIn_6_0 = (null != this.field_Ab) && (this.field_Ab.field_cb);
        return stackIn_6_0;
    }

    private final int a(jea param0, String param1, int param2, int param3, int param4, jea param5) {
        jea var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 8421504) {
            stackIn_2_0 = -60;
            return stackIn_2_0;
          }
          var7 = new jea(0L, param0, 0, param3, param2, 24, param1);
          param3 += 32;
          param5.b(param4 ^ -8421632, var7);
          stackIn_4_0 = param3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("wla.A(");
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean b(boolean param0) {
        if (this.field_Gb != -2) {
          return false;
        }
        if (fna.field_h == 13) {
          this.field_Gb = -1;
        }
        if (!param0) {
          return true;
        }
        return true;
    }

    final int d(int param0, boolean param1) {
        int var3 = 0;
        ta stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        jea stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        this.c(44, param1);
        if (null != this.field_xb) {
          this.field_xb.field_r = this.field_vb.toString();
          this.field_xb.field_qb = (this.field_G - this.field_xb.field_H.b(this.field_xb.field_r)) / 2;
          this.field_xb.field_G = -this.field_xb.field_qb + this.field_G;
          if (this.field_Ab != null &&
            this.field_Ab.field_y != 0) {
            stackIn_6_0 = this.field_Ab;
            stackIn_7_1 = !(this.field_Ab.field_cb);
            stackIn_6_0.field_cb = stackIn_7_1;
          }
          for (var3 = 0; var3 < rh.field_n; var3++) {
            if (null != this.field_yb[var3]) {
              stackIn_15_0 = this.field_yb[var3];
              stackIn_16_1 = !(this.field_vb.length() <= 0);
              stackIn_15_0.field_X = stackIn_16_1;
              if (this.field_yb[var3].field_X &&
                this.field_yb[var3].field_y != 0) {
                return var3;
              }
            }
          }
        }
        if (param0 != ~this.field_Fb.field_y) {
          return -1;
        }
        if (param1 &&
          hf.field_b != 0 &&
          this.field_y == 0) {
          return -1;
        }
        return this.field_Gb;
    }

    static {
        field_Eb = new ur(2);
        field_Cb = false;
    }
}
