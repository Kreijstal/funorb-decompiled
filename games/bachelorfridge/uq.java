/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uq extends sna {
    private sna field_wb;
    private sna field_Fb;
    private int field_vb;
    private sna field_yb;
    long field_Eb;
    private daa field_Db;
    static kv[] field_zb;
    private sna[] field_Bb;
    private sna field_Gb;
    private sna field_Ab;
    private sna field_xb;
    private StringBuilder field_Cb;

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        daa stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        sna stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = BachelorFridge.field_y;
        this.a(19842, param0);
        if (this.field_yb != null) {
          this.field_yb.field_Z = this.field_Cb.toString();
          this.field_yb.field_kb = (this.field_sb - this.field_yb.field_jb.a(this.field_yb.field_Z)) / 2;
          this.field_yb.field_sb = this.field_sb - this.field_yb.field_kb;
          if (this.field_Db != null &&
            this.field_Db.field_R != 0) {
            stackIn_7_0 = this.field_Db;
            stackIn_8_1 = !(this.field_Db.field_t);
            stackIn_7_0.field_t = stackIn_8_1;
          }
          for (var3 = 0; cja.field_v > var3; var3++) {
            if (this.field_Bb[var3] != null) {
              stackIn_16_0 = this.field_Bb[var3];
              stackIn_17_1 = !(this.field_Cb.length() <= 0);
              stackIn_16_0.field_u = stackIn_17_1;
              if (this.field_Bb[var3].field_u &&
                this.field_Bb[var3].field_R != 0) {
                return var3;
              }
            }
          }
        }
        if (!param1) {
          this.field_wb = (sna) null;
        }
        if (this.field_Fb.field_R != 0) {
          return -1;
        }
        if (param0 &&
          lf.field_c != 0 &&
          0 == this.field_R) {
          return -1;
        }
        return this.field_vb;
    }

    private final int a(int param0, sna param1, byte param2, String param3, sna param4, int param5) {
        sna var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -44) {
            field_zb = (kv[]) null;
          }
          var7 = new sna(0L, param4, 0, param5, param0, 24, param3);
          param5 += 32;
          param1.a(-1, var7);
          stackIn_3_0 = param5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("uq.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, sna param2, int param3, sna param4) {
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
          var6_int = param2.field_jb.a(param2.field_Z, -(2 * param2.field_L) + param1, param2.field_B);
          param2.a(var6_int, param3 + 44810, param1, 0, param0);
          if (param3 != -13403) {
            stackIn_2_0 = 89;
            return stackIn_2_0;
          }
          param0 = param0 + (0 + var6_int);
          param4.a(-1, param2);
          stackIn_4_0 = param0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("uq.DA(").append(param0).append(',').append(param1).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final String h(byte param0) {
        if (param0 != 82) {
          return (String) null;
        }
        return this.field_Cb.toString();
    }

    final static void h(int param0) {
        baa.e(17035);
        hba.a(true, wha.field_a);
        gs.field_f = null;
        int var1 = 3;
        int var2 = 0;
        int var3 = 2;
        int var4 = 1;
        int var5 = 3;
        String[] var6 = new String[]{gaa.field_l};
        if (param0 != -28716) {
          uq.h(-43);
        }
        int var7 = 0;
        op var8 = new op(var1, var2, var3, var4, var5, var6);
        eaa var9 = mg.field_m.field_e.field_m;
        rk[] var10 = new rk[var9.g(param0 + 28716)];
        var9.a((byte) 88, var10);
        gj var11 = new gj(var8, var7, var10, false);
        hp.field_c = 0;
        dj.field_c = var11;
        hia.c((byte) -124);
        qi.a((byte) 78);
        kaa.field_m = -1;
        sia.field_h = true;
        dh.a((byte) 58, var2);
    }

    public static void f(int param0) {
        if (param0 < 7) {
          return;
        }
        field_zb = null;
    }

    final boolean f(byte param0) {
        if (this.field_vb != -2) {
          return false;
        }
        if (gf.field_k == 13) {
          this.field_vb = -1;
        }
        if (param0 >= -101) {
          this.h((byte) -125);
          return true;
        }
        return true;
    }

    uq(int param0, int param1, int param2, int param3, int param4, sna param5, sna param6, sna param7, sna param8, daa param9, sna param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        daa stackIn_6_1;
        daa stackIn_6_2;
        long stackIn_6_3;
        daa stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        daa stackIn_8_1;
        daa stackIn_8_2;
        String stackIn_8_5;
        sna stackIn_14_0 = null;
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
        int var15_int = 0;
        sna[] var15 = null;
        RuntimeException var15_ref = null;
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
        sna[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        daa stackIn_8_1Lifetime1;
        daa stackIn_8_2Lifetime1;
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
        this.field_vb = -2;
        try {
          this.field_Eb = param12;
          this.field_Gb = new sna(0L, param6, dka.field_D.toUpperCase());
          this.field_Gb.field_N = 1;
          this.a(-1, this.field_Gb);
          this.field_Fb = new sna(0L, param7);
          this.field_Gb.a(-1, this.field_Fb);
          this.field_Ab = new sna(0L, (sna) null);
          this.a(-1, this.field_Ab);
          if (param11 != null) {
            this.field_wb = new sna(0L, param8, dia.field_D);
            this.field_wb.field_N = 1;
            this.field_wb.field_gb = 11184810;
            this.field_Ab.a(-1, this.field_wb);
            this.field_xb = new sna(0L, param8, vj.field_q);
            this.field_xb.field_gb = 11184810;
            this.field_xb.field_N = 1;
            this.field_Ab.a(-1, this.field_xb);
            this.field_yb = new sna(0L, param8);
            this.field_yb.field_gb = 16764006;
            this.field_Ab.a(-1, this.field_yb);
            this.field_yb.field_pb = "|";
            if (!(hka.field_i < 5) ||
              !(hea.field_r < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (daa) (param9);
                if (7 > hka.field_i) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (hea.field_r < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = lq.field_z;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = nw.field_r;
              }
              this.field_Db = new daa(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Ab.a(-1, this.field_Db);
            }
            var28 = new sna[3];
            var15 = var28;
            var28[0] = new sna(0L, (sna) null);
            this.field_Ab.a(-1, var28[0]);
            var28[1] = new sna(0L, (sna) null);
            this.field_Ab.a(-1, var28[1]);
            var28[2] = new sna(0L, (sna) null);
            this.field_Ab.a(-1, var28[2]);
            this.field_Bb = new sna[cja.field_v];
            for (var16 = 0; var16 < cja.field_v; var16++) {
              if (null != lw.field_k[var16]) {
                this.field_Bb[var16] = new sna(0L, param10, lw.field_k[var16]);
                this.field_Bb[var16].field_N = 0;
                stackIn_14_0 = this.field_Bb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_u = stackIn_15_1;
                this.field_Ab.a(-1, this.field_Bb[var16]);
              }
            }
            this.field_Cb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Cb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_jb.a(oe.field_a);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_jb.a(nr.field_y);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_jb.a(ur.field_p);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; cja.field_v > var17Lifetime4; var17Lifetime4++) {
              if (null != this.field_Bb[var17Lifetime4]) {
                var18 = this.field_Bb[var17Lifetime4].e(-1);
                if (var16Lifetime2 < var18) {
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
            var18Lifetime3 = this.a(var16Lifetime2, var28[0], (byte) -57, oe.field_a, param6, var18Lifetime3);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[6], -13403, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[9], -13403, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[5], -13403, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[7], -13403, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[15], -13403, var28[0]);
            var18Lifetime3 = this.a(var18Lifetime3, var16Lifetime2, this.field_Bb[4], -13403, var28[0]);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var16Lifetime2, var28[1], (byte) -75, nr.field_y, param6, var18Lifetime4);
            var18Lifetime4 = this.a(var18Lifetime4, var16Lifetime2, this.field_Bb[16], -13403, var28[1]);
            var18Lifetime4 = this.a(var18Lifetime4, var16Lifetime2, this.field_Bb[17], -13403, var28[1]);
            var18Lifetime4 = this.a(var18Lifetime4, var16Lifetime2, this.field_Bb[18], -13403, var28[1]);
            var18Lifetime4 = this.a(var18Lifetime4, var16Lifetime2, this.field_Bb[19], -13403, var28[1]);
            var18Lifetime4 = this.a(var18Lifetime4, var16Lifetime2, this.field_Bb[20], -13403, var28[1]);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var16Lifetime2, var28[2], (byte) -117, ur.field_p, param6, var18Lifetime5);
            var18Lifetime5 = this.a(var18Lifetime5, var16Lifetime2, this.field_Bb[13], -13403, var28[2]);
            var18Lifetime5 = this.a(var18Lifetime5, var16Lifetime2, this.field_Bb[21], -13403, var28[2]);
            var18Lifetime5 = this.a(var18Lifetime5, var16Lifetime2, this.field_Bb[11], -13403, var28[2]);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.field_Gb.e(-1);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.field_Db != null) {
              var20Lifetime2 = this.field_Db.a((byte) -108, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Gb.a(24, 31407, var19 + 26, 0, 0);
            this.field_Fb.a(15, 31407, 15, this.field_Gb.field_sb - 20, 5);
            var21 = 10;
            this.field_wb.a(rg.field_h * 2, 31407, var19, 13, var21);
            var21 = var21 + 2 * rg.field_h;
            this.field_xb.a(2 * rg.field_h, 31407, var19, 13, var21);
            var21 = var21 + (10 + rg.field_h * 2);
            this.field_yb.a(rg.field_h, 31407, 0, 0, var21);
            var21 = var21 + (rg.field_h + 10);
            if (null != this.field_Db) {
              var20Lifetime3 = this.field_Db.a((byte) -118, 4);
              this.field_Db.a((byte) -42, rg.field_h, 13 + (var19 - var20Lifetime3) / 2, 4, var20Lifetime3, var21);
              var21 = var21 + (10 + rg.field_h);
            }
            var28[0].a(var17Lifetime5, 31407, var16Lifetime2, 13, var21);
            var28[1].a(var17Lifetime5, 31407, var16Lifetime2, 13 - (-var16Lifetime2 - 13), var21);
            var28[2].a(var17Lifetime5, 31407, var16Lifetime2, 13 + var16Lifetime2 * 2 + 26, var21);
            var22 = var21;
            this.field_Ab.a(var22 + (var17Lifetime5 + 10), 31407, 13 + (13 + var19), 0, 24);
            this.field_Ab.field_eb = mu.a(11579568, 3, this.field_Ab.field_p, 8421504, 2105376, (byte) 17);
            var23 = var19 + 13 + 13;
            var24 = 10 + (24 + var22 + var17Lifetime5);
            var25 = oi.a(param2, var23, param0, -21264);
            var26 = nga.a(var24, param1, (byte) 127, param3);
            this.a(var24, 31407, var23, var25, var26);
            return;
          }
          this.field_wb = new sna(0L, param8, eha.field_r);
          this.field_wb.field_gb = 11184810;
          this.field_wb.field_N = 1;
          this.field_Ab.a(-1, this.field_wb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_wb.field_jb.b(this.field_wb.field_Z, var15_int);
          this.field_wb.a(var17Lifetime1 * rg.field_h, 31407, var15_int, 13, var16Lifetime1);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * rg.field_h;
          this.field_Ab.a(var16Lifetime1 + 10, 31407, 26 + var15_int, 0, 24);
          this.field_Ab.field_eb = mu.a(11579568, 3, this.field_Ab.field_p, 8421504, 2105376, (byte) 17);
          var18Lifetime1 = 13 + var15_int + 13;
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = oi.a(param2, var18Lifetime1, param0, -21264);
          var21Lifetime1 = nga.a(var19Lifetime1, param1, (byte) 124, param3);
          this.a(var19Lifetime1, 31407, var18Lifetime1, var20Lifetime1, var21Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("uq.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static void g(byte param0) {
        mg.field_m = new mu();
        Random discarded$0 = new Random();
        int var1 = 63 % ((-7 - param0) / 47);
    }

    final boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return false;
        }
        stackIn_6_0 = (null != this.field_Db) && (this.field_Db.field_t);
        return stackIn_6_0;
    }

    static {
    }
}
