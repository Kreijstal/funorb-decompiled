/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends km {
    private km field_Kb;
    private km[] field_Hb;
    private int field_Nb;
    private StringBuilder field_Ib;
    private km field_Qb;
    private km field_Eb;
    long field_Mb;
    private en field_Jb;
    static String field_Pb;
    private km field_Ob;
    private km field_Fb;
    static ml field_Lb;
    private km field_Gb;

    public static void g(int param0) {
        field_Lb = null;
        field_Pb = null;
        if (param0 != 0) {
          field_Pb = (String) null;
        }
    }

    private final int a(km param0, km param1, int param2, int param3, int param4) {
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
          param3 += 8;
          var6_int = param1.field_C.a(param1.field_V, -(2 * param1.field_z) + param4, param1.field_fb);
          param1.a(0, var6_int, param4, (byte) -66, param3);
          param3 = param3 + (var6_int - 0);
          if (param2 < 37) {
            stackIn_2_0 = 122;
            return stackIn_2_0;
          }
          param0.a(0, param1);
          stackIn_4_0 = param3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("bg.C(");
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
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    bg(int param0, int param1, int param2, int param3, int param4, km param5, km param6, km param7, km param8, en param9, km param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        en stackIn_6_1;
        en stackIn_6_2;
        long stackIn_6_3;
        en stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        en stackIn_8_1;
        en stackIn_8_2;
        String stackIn_8_5;
        km stackIn_14_0 = null;
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
        km[] var15 = null;
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
        km[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        en stackIn_8_1Lifetime1;
        en stackIn_8_2Lifetime1;
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
        this.field_Nb = -2;
        try {
          this.field_Mb = param12;
          this.field_Ob = new km(0L, param6, we.field_i.toUpperCase());
          this.field_Ob.field_lb = 1;
          this.a(0, this.field_Ob);
          this.field_Qb = new km(0L, param7);
          this.field_Ob.a(0, this.field_Qb);
          this.field_Gb = new km(0L, (km) null);
          this.a(0, this.field_Gb);
          if (param11 != null) {
            this.field_Fb = new km(0L, param8, qa.field_f);
            this.field_Fb.field_lb = 1;
            this.field_Fb.field_E = 11184810;
            this.field_Gb.a(0, this.field_Fb);
            this.field_Eb = new km(0L, param8, jf.field_l);
            this.field_Eb.field_lb = 1;
            this.field_Eb.field_E = 11184810;
            this.field_Gb.a(0, this.field_Eb);
            this.field_Kb = new km(0L, param8);
            this.field_Kb.field_E = 16764006;
            this.field_Gb.a(0, this.field_Kb);
            this.field_Kb.field_eb = "|";
            if (!(og.field_s < 5) ||
              !(hd.field_d < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (en) (param9);
                if (og.field_s < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (hd.field_d < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = ai.field_i;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = ne.field_d;
              }
              this.field_Jb = new en(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Gb.a(0, this.field_Jb);
            }
            var28 = new km[3];
            var15 = var28;
            var28[0] = new km(0L, (km) null);
            this.field_Gb.a(0, var28[0]);
            var28[1] = new km(0L, (km) null);
            this.field_Gb.a(0, var28[1]);
            var28[2] = new km(0L, (km) null);
            this.field_Gb.a(0, var28[2]);
            this.field_Hb = new km[ad.field_c];
            for (var16 = 0; var16 < ad.field_c; var16++) {
              if (null != se.field_f[var16]) {
                this.field_Hb[var16] = new km(0L, param10, se.field_f[var16]);
                this.field_Hb[var16].field_lb = 0;
                stackIn_14_0 = this.field_Hb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_Y = stackIn_15_1;
                this.field_Gb.a(0, this.field_Hb[var16]);
              }
            }
            this.field_Ib = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Ib.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_C.a(jg.field_c);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_C.a(hn.field_s);
            if (var16Lifetime2 < var17Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_C.a(gd.field_p);
            if (var16Lifetime2 < var17Lifetime3) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < ad.field_c; var17Lifetime4++) {
              if (this.field_Hb[var17Lifetime4] != null) {
                var18 = this.field_Hb[var17Lifetime4].c((byte) 33);
                if (var16Lifetime2 < var18) {
                  var16Lifetime2 = var18;
                }
              }
            }
            if (140 < var16Lifetime2) {
              var16Lifetime2 = 140;
            }
            var17Lifetime5 = 0;
            var18Lifetime2 = 0;
            var18Lifetime3 = 0;
            var18Lifetime3 = this.a(var18Lifetime3, -61, var28[0], var16Lifetime2, jg.field_c, param6);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[6], 99, var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[9], 108, var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[5], 124, var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[7], 56, var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[15], 92, var18Lifetime3, var16Lifetime2);
            var18Lifetime3 = this.a(var28[0], this.field_Hb[4], 45, var18Lifetime3, var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var18Lifetime4, -40, var28[1], var16Lifetime2, hn.field_s, param6);
            var18Lifetime4 = this.a(var28[1], this.field_Hb[16], 69, var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], this.field_Hb[17], 41, var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], this.field_Hb[18], 58, var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], this.field_Hb[19], 81, var18Lifetime4, var16Lifetime2);
            var18Lifetime4 = this.a(var28[1], this.field_Hb[20], 102, var18Lifetime4, var16Lifetime2);
            if (var18Lifetime4 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var18Lifetime5, -97, var28[2], var16Lifetime2, gd.field_p, param6);
            var18Lifetime5 = this.a(var28[2], this.field_Hb[13], 56, var18Lifetime5, var16Lifetime2);
            var18Lifetime5 = this.a(var28[2], this.field_Hb[21], 71, var18Lifetime5, var16Lifetime2);
            var18Lifetime5 = this.a(var28[2], this.field_Hb[11], 65, var18Lifetime5, var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.field_Ob.c((byte) 40);
            if (var20 > var19) {
              var19 = var20;
            }
            if (null != this.field_Jb) {
              var20Lifetime2 = this.field_Jb.a((byte) -126, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Ob.a(0, 24, var19 + 26, (byte) -117, 0);
            this.field_Qb.a(this.field_Ob.field_K - 20, 15, 15, (byte) -119, 5);
            var21 = 10;
            this.field_Fb.a(13, pg.field_e * 2, var19, (byte) -110, var21);
            var21 = var21 + 2 * pg.field_e;
            this.field_Eb.a(13, pg.field_e * 2, var19, (byte) -41, var21);
            var21 = var21 + (10 + 2 * pg.field_e);
            this.field_Kb.a(0, pg.field_e, 0, (byte) -83, var21);
            var21 = var21 + (pg.field_e + 10);
            if (this.field_Jb != null) {
              var20Lifetime3 = this.field_Jb.a((byte) -128, 4);
              this.field_Jb.a(var20Lifetime3, 4, 13 + (var19 - var20Lifetime3) / 2, (byte) -127, pg.field_e, var21);
              var21 = var21 + (10 + pg.field_e);
            }
            var28[0].a(13, var17Lifetime5, var16Lifetime2, (byte) -95, var21);
            var28[1].a(26 + var16Lifetime2, var17Lifetime5, var16Lifetime2, (byte) -108, var21);
            var28[2].a(39 + var16Lifetime2 * 2, var17Lifetime5, var16Lifetime2, (byte) -60, var21);
            var22 = var21;
            this.field_Gb.a(0, var22 - (-var17Lifetime5 - 10), 13 + (var19 + 13), (byte) -92, 24);
            this.field_Gb.field_vb = ne.a(this.field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
            var23 = var19 + 26;
            var24 = var22 + 24 + var17Lifetime5 + 10;
            var25 = sh.b(0, param2, param0, var23);
            var26 = p.a(-1, var24, param1, param3);
            this.a(var25, var24, var23, (byte) -124, var26);
            return;
          }
          this.field_Fb = new km(0L, param8, ji.field_a);
          this.field_Fb.field_E = 11184810;
          this.field_Fb.field_lb = 1;
          this.field_Gb.a(0, this.field_Fb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Fb.field_C.b(this.field_Fb.field_V, var15_int);
          this.field_Fb.a(13, pg.field_e * var17Lifetime1, var15_int, (byte) -78, var16Lifetime1);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * pg.field_e;
          this.field_Gb.a(0, var16Lifetime1 + 10, 13 + (13 + var15_int), (byte) -45, 24);
          this.field_Gb.field_vb = ne.a(this.field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
          var18Lifetime1 = var15_int + 26;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = sh.b(0, param2, param0, var18Lifetime1);
          var21Lifetime1 = p.a(-1, var19Lifetime1, param1, param3);
          this.a(var20Lifetime1, var19Lifetime1, var18Lifetime1, (byte) -104, var21Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("bg.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw kg.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final static boolean f(byte param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -82 / ((45 - param0) / 61);
        stackIn_4_0 = (oj.field_Ub != null) && (ug.field_a.a(false));
        return stackIn_4_0;
    }

    final boolean h(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 140) {
          this.field_Gb = (km) null;
        }
        stackIn_6_0 = (this.field_Jb != null) && (this.field_Jb.field_xb);
        return stackIn_6_0;
    }

    final boolean d(boolean param0) {
        if (param0) {
          bg.g(-40);
        }
        if (this.field_Nb != -2) {
          return false;
        }
        if (um.field_Gb == 13) {
          this.field_Nb = -1;
          return true;
        }
        return true;
    }

    final String e(byte param0) {
        if (param0 != -72) {
          return (String) null;
        }
        return this.field_Ib.toString();
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        en stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        km stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var4;
        var4 = Virogrid.field_F ? 1 : 0;
        this.a(param1, (byte) 119);
        if (null != this.field_Kb) {
          this.field_Kb.field_V = this.field_Ib.toString();
          this.field_Kb.field_tb = (this.field_K - this.field_Kb.field_C.a(this.field_Kb.field_V)) / 2;
          if (this.field_Jb != null &&
            0 != this.field_Jb.field_nb) {
            stackIn_6_0 = this.field_Jb;
            stackIn_7_1 = !(this.field_Jb.field_xb);
            stackIn_6_0.field_xb = stackIn_7_1;
          }
          this.field_Kb.field_K = -this.field_Kb.field_tb + this.field_K;
          for (var3 = 0; var3 < ad.field_c; var3++) {
            if (null != this.field_Hb[var3]) {
              stackIn_15_0 = this.field_Hb[var3];
              stackIn_16_1 = !(this.field_Ib.length() <= 0);
              stackIn_15_0.field_Y = stackIn_16_1;
              if (this.field_Hb[var3].field_Y &&
                this.field_Hb[var3].field_nb != 0) {
                return var3;
              }
            }
          }
        }
        if (this.field_Qb.field_nb != 0) {
          return -1;
        }
        if (param0 != 2105376) {
          return 9;
        }
        if (param1 &&
          0 != oi.field_g &&
          this.field_nb == 0) {
          return -1;
        }
        return this.field_Nb;
    }

    private final int a(int param0, int param1, km param2, int param3, String param4, km param5) {
        int discarded$1 = 0;
        km var7 = null;
        RuntimeException var7_ref = null;
        km var8 = null;
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
          var7 = new km(0L, param5, 0, param0, param3, 24, param4);
          param0 += 32;
          if (param1 >= -10) {
            var8 = (km) null;
            discarded$1 = this.a((km) null, (km) null, -49, 28, 48);
          }
          param2.a(0, var7);
          stackIn_3_0 = param0;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("bg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_Pb = "Suggested names: ";
    }
}
