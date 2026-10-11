/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends cr {
    private cr field_Lb;
    private cr field_Jb;
    private cr field_Sb;
    static boolean field_Ib;
    private int field_Tb;
    private cr[] field_Qb;
    static String field_Pb;
    private cr field_Hb;
    private cr field_Nb;
    private sm field_Ob;
    private cr field_Rb;
    private StringBuilder field_Mb;
    long field_Kb;

    private final int a(int param0, cr param1, String param2, int param3, int param4, cr param5) {
        cr var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new cr((long)param4, param5, 0, param0, param3, 24, param2);
          param0 += 32;
          param1.b(var7, param4 + 121);
          stackIn_1_0 = param0;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("cb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean k(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 22719) {
          this.field_Lb = (cr) null;
        }
        stackIn_6_0 = (null != this.field_Ob) && (this.field_Ob.field_V);
        return stackIn_6_0;
    }

    private final int a(int param0, int param1, cr param2, int param3, cr param4) {
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
          var6_int = param2.field_z.a(param2.field_S, param0 - 2 * param2.field_R, param2.field_qb);
          param2.a(114, param0, var6_int, param3, 0);
          if (param1 < 103) {
            stackIn_2_0 = -25;
            return stackIn_2_0;
          }
          param4.b(param2, 125);
          param3 = param3 + (0 + var6_int);
          stackIn_4_0 = param3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("cb.C(").append(param0).append(',').append(param1).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        sm stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        cr stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        this.a(0, param1);
        if (null != this.field_Sb) {
          this.field_Sb.field_S = this.field_Mb.toString();
          this.field_Sb.field_wb = (this.field_Fb - this.field_Sb.field_z.c(this.field_Sb.field_S)) / 2;
          this.field_Sb.field_Fb = this.field_Fb - this.field_Sb.field_wb;
          if (this.field_Ob != null &&
            0 != this.field_Ob.field_tb) {
            stackIn_7_0 = this.field_Ob;
            stackIn_8_1 = !(this.field_Ob.field_V);
            stackIn_7_0.field_V = stackIn_8_1;
          }
          for (var3 = 0; var3 < kq.field_Jb; var3++) {
            if (this.field_Qb[var3] != null) {
              stackIn_16_0 = this.field_Qb[var3];
              stackIn_17_1 = !(this.field_Mb.length() <= 0);
              stackIn_16_0.field_lb = stackIn_17_1;
              if (this.field_Qb[var3].field_lb &&
                this.field_Qb[var3].field_tb != 0) {
                return var3;
              }
            }
          }
        }
        if (this.field_Rb.field_tb != 0) {
          return -1;
        }
        if (param1 &&
          kf.field_c != 0 &&
          this.field_tb == 0) {
          return -1;
        }
        if (param0 == 13721) {
          return this.field_Tb;
        }
        return -105;
    }

    final String l(int param0) {
        if (param0 != 4) {
          return (String) null;
        }
        return this.field_Mb.toString();
    }

    final boolean c(boolean param0) {
        if (param0) {
          this.c(false);
        }
        if (this.field_Tb != -2) {
          return false;
        }
        if (de.field_f != 13) {
          return true;
        }
        this.field_Tb = -1;
        return true;
    }

    cb(int param0, int param1, int param2, int param3, int param4, cr param5, cr param6, cr param7, cr param8, sm param9, cr param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        sm stackIn_6_1;
        sm stackIn_6_2;
        long stackIn_6_3;
        sm stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        sm stackIn_8_1;
        sm stackIn_8_2;
        String stackIn_8_5;
        cr stackIn_14_0 = null;
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
        cr[] var15 = null;
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
        cr[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        sm stackIn_8_1Lifetime1;
        sm stackIn_8_2Lifetime1;
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
        this.field_Tb = -2;
        try {
          this.field_Kb = param12;
          this.field_Hb = new cr(0L, param6, ol.field_z.toUpperCase());
          this.field_Hb.field_O = 1;
          this.b(this.field_Hb, 124);
          this.field_Rb = new cr(0L, param7);
          this.field_Hb.b(this.field_Rb, 127);
          this.field_Nb = new cr(0L, (cr) null);
          this.b(this.field_Nb, 120);
          if (param11 != null) {
            this.field_Lb = new cr(0L, param8, oh.field_E);
            this.field_Lb.field_A = 11184810;
            this.field_Lb.field_O = 1;
            this.field_Nb.b(this.field_Lb, 118);
            this.field_Jb = new cr(0L, param8, tl.field_a);
            this.field_Jb.field_O = 1;
            this.field_Jb.field_A = 11184810;
            this.field_Nb.b(this.field_Jb, 125);
            this.field_Sb = new cr(0L, param8);
            this.field_Sb.field_A = 16764006;
            this.field_Nb.b(this.field_Sb, 126);
            this.field_Sb.field_J = "|";
            if (!(uh.field_oc < 5) ||
              !(fn.field_z < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (sm) (param9);
                if (uh.field_oc < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (fn.field_z < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = hm.field_z;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = tb.field_c;
              }
              this.field_Ob = new sm(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Nb.b(this.field_Ob, 120);
            }
            var28 = new cr[3];
            var15 = var28;
            var28[0] = new cr(0L, (cr) null);
            this.field_Nb.b(var28[0], 118);
            var28[1] = new cr(0L, (cr) null);
            this.field_Nb.b(var28[1], 125);
            var28[2] = new cr(0L, (cr) null);
            this.field_Nb.b(var28[2], 126);
            this.field_Qb = new cr[kq.field_Jb];
            for (var16 = 0; var16 < kq.field_Jb; var16++) {
              if (wj.field_c[var16] != null) {
                this.field_Qb[var16] = new cr(0L, param10, wj.field_c[var16]);
                this.field_Qb[var16].field_O = 0;
                stackIn_14_0 = this.field_Qb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_lb = stackIn_15_1;
                this.field_Nb.b(this.field_Qb[var16], 120);
              }
            }
            this.field_Mb = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_Mb.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_z.c(sk.field_c);
            if (var17 > var16Lifetime2) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_z.c(lh.field_e);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_z.c(hl.field_o);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; kq.field_Jb > var17Lifetime4; var17Lifetime4++) {
              if (null != this.field_Qb[var17Lifetime4]) {
                var18 = this.field_Qb[var17Lifetime4].j(-21391);
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
            var18Lifetime3 = this.a(var18Lifetime3, var28[0], sk.field_c, var16Lifetime2, 0, param6);
            var18Lifetime3 = this.a(var16Lifetime2, 116, this.field_Qb[6], var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(var16Lifetime2, 117, this.field_Qb[9], var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(var16Lifetime2, 119, this.field_Qb[5], var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(var16Lifetime2, 107, this.field_Qb[7], var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(var16Lifetime2, 107, this.field_Qb[15], var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(var16Lifetime2, 120, this.field_Qb[4], var18Lifetime3, var28[0]);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var18Lifetime4, var28[1], lh.field_e, var16Lifetime2, 0, param6);
            var18Lifetime4 = this.a(var16Lifetime2, 107, this.field_Qb[16], var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(var16Lifetime2, 122, this.field_Qb[17], var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(var16Lifetime2, 110, this.field_Qb[18], var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(var16Lifetime2, 109, this.field_Qb[19], var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(var16Lifetime2, 120, this.field_Qb[20], var18Lifetime4, var28[1]);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var18Lifetime5, var28[2], hl.field_o, var16Lifetime2, 0, param6);
            var18Lifetime5 = this.a(var16Lifetime2, 114, this.field_Qb[13], var18Lifetime5, var28[2]);
            var18Lifetime5 = this.a(var16Lifetime2, 112, this.field_Qb[21], var18Lifetime5, var28[2]);
            var18Lifetime5 = this.a(var16Lifetime2, 107, this.field_Qb[11], var18Lifetime5, var28[2]);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.field_Hb.j(-21391);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.field_Ob != null) {
              var20Lifetime2 = this.field_Ob.c(4, 0);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Hb.a(111, var19 + 26, 24, 0, 0);
            this.field_Rb.a(97, 15, 15, 5, this.field_Hb.field_Fb - 20);
            var21 = 10;
            this.field_Lb.a(114, var19, r.field_f * 2, var21, 13);
            var21 = var21 + r.field_f * 2;
            this.field_Jb.a(84, var19, 2 * r.field_f, var21, 13);
            var21 = var21 + (2 * r.field_f + 10);
            this.field_Sb.a(101, 0, r.field_f, var21, 0);
            var21 = var21 + (r.field_f + 10);
            if (this.field_Ob != null) {
              var20Lifetime3 = this.field_Ob.c(4, 0);
              this.field_Ob.a(var20Lifetime3, var21, r.field_f, -36, 4, 13 + (-var20Lifetime3 + var19) / 2);
              var21 = var21 + (r.field_f + 10);
            }
            var28[0].a(78, var16Lifetime2, var17Lifetime5, var21, 13);
            var28[1].a(91, var16Lifetime2, var17Lifetime5, var21, var16Lifetime2 + 13 + 13);
            var28[2].a(94, var16Lifetime2, var17Lifetime5, var21, 39 + 2 * var16Lifetime2);
            var22 = var21;
            this.field_Nb.a(87, 13 - (-var19 - 13), 10 + var22 + var17Lifetime5, 24, 0);
            this.field_Nb.field_Bb = vl.a(this.field_Nb.field_db, 3, 0, 2105376, 11579568, 8421504);
            var23 = 13 + var19 + 13;
            var24 = var17Lifetime5 + (24 + var22) + 10;
            var25 = jf.a(var23, param2, param0, 1);
            var26 = dm.a(param3, 0, var24, param1);
            this.a(92, var23, var24, var26, var25);
            return;
          }
          this.field_Lb = new cr(0L, param8, sd.field_H);
          this.field_Lb.field_O = 1;
          this.field_Lb.field_A = 11184810;
          this.field_Nb.b(this.field_Lb, 123);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Lb.field_z.b(this.field_Lb.field_S, var15_int);
          this.field_Lb.a(115, var15_int, var17Lifetime1 * r.field_f, var16Lifetime1, 13);
          var16Lifetime1 = var16Lifetime1 + r.field_f * var17Lifetime1;
          this.field_Nb.a(109, 13 + (var15_int + 13), var16Lifetime1 + 10, 24, 0);
          this.field_Nb.field_Bb = vl.a(this.field_Nb.field_db, 3, 0, 2105376, 11579568, 8421504);
          var18Lifetime1 = 13 + (var15_int + 13);
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = jf.a(var18Lifetime1, param2, param0, 1);
          var21Lifetime1 = dm.a(param3, 0, var19Lifetime1, param1);
          this.a(83, var18Lifetime1, var19Lifetime1, var21Lifetime1, var20Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("cb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw wn.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_Pb = null;
        if (param0) {
          cb.b(false);
        }
    }

    static {
        field_Pb = "This game has been updated! Please reload this page.";
    }
}
