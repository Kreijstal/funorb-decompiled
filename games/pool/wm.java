/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends vh {
    static ai field_Xb;
    private vh[] field_Vb;
    static String field_cc;
    private StringBuilder field_ec;
    private vh field_Zb;
    long field_Lb;
    static na field_Pb;
    private vh field_Rb;
    private wg field_dc;
    private vh field_Mb;
    private vh field_Ob;
    private vh field_Sb;
    private vh field_Tb;
    private int field_bc;
    static String field_Qb;
    static char[] field_Wb;
    static String field_Yb;
    static int[][] field_ac;
    static int[] field_Ub;
    static int field_Nb;

    private final int a(vh param0, int param1, int param2, vh param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param2 += 8;
          if (param1 > -125) {
            wm.f((byte) -116);
          }
          var6_int = param0.field_I.b(param0.field_nb, -(param0.field_tb * 2) + param4, param0.field_M);
          param0.b(param2, 2147483647, 0, param4, var6_int);
          param3.a(-93, param0);
          param2 = param2 + (var6_int - 0);
          stackIn_3_0 = param2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("wm.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    final boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -10459) {
          this.a(true, 67);
        }
        stackIn_6_0 = (null != this.field_dc) && (this.field_dc.field_Ib);
        return stackIn_6_0;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        wg stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        vh stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var4;
        var4 = Pool.field_O;
        this.a(param0, false);
        if (this.field_Rb != null) {
          this.field_Rb.field_nb = this.field_ec.toString();
          this.field_Rb.field_qb = (this.field_gb - this.field_Rb.field_I.b(this.field_Rb.field_nb)) / 2;
          if (this.field_dc != null &&
            this.field_dc.field_R != 0) {
            stackIn_6_0 = this.field_dc;
            stackIn_7_1 = !(this.field_dc.field_Ib);
            stackIn_6_0.field_Ib = stackIn_7_1;
          }
          this.field_Rb.field_gb = -this.field_Rb.field_qb + this.field_gb;
          for (var3 = 0; var3 < cd.field_a; var3++) {
            if (this.field_Vb[var3] != null) {
              stackIn_15_0 = this.field_Vb[var3];
              stackIn_16_1 = !(this.field_ec.length() <= 0);
              stackIn_15_0.field_pb = stackIn_16_1;
              if (this.field_Vb[var3].field_pb &&
                this.field_Vb[var3].field_R != 0) {
                return var3;
              }
            }
          }
        }
        if (this.field_Zb.field_R != 0) {
          return -1;
        }
        if (param0 &&
          ne.field_s != 0 &&
          this.field_R == 0) {
          return -1;
        }
        if (param1 == -27403) {
          return this.field_bc;
        }
        return 85;
    }

    final static oa a(Throwable param0, String param1) {
        oa var2 = null;
        if (param0 instanceof oa) {
          var2 = (oa) ((Object) param0);
          var2.field_i = var2.field_i + ' ' + param1;
        } else {
          var2 = new oa(param0, param1);
        }
        return var2;
    }

    wm(int param0, int param1, int param2, int param3, int param4, vh param5, vh param6, vh param7, vh param8, wg param9, vh param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        wg stackIn_6_1;
        wg stackIn_6_2;
        long stackIn_6_3;
        wg stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        wg stackIn_8_1;
        wg stackIn_8_2;
        String stackIn_8_5;
        vh stackIn_14_0 = null;
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
        vh[] var15 = null;
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
        vh[] var27 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        wg stackIn_8_1Lifetime1;
        wg stackIn_8_2Lifetime1;
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
        this.field_bc = -2;
        try {
          this.field_Lb = param12;
          this.field_Ob = new vh(0L, param6, oh.field_a.toUpperCase());
          this.field_Ob.field_Fb = 1;
          this.a(66, this.field_Ob);
          this.field_Zb = new vh(0L, param7);
          this.field_Ob.a(-118, this.field_Zb);
          this.field_Tb = new vh(0L, (vh) null);
          this.a(-107, this.field_Tb);
          if (param11 != null) {
            this.field_Mb = new vh(0L, param8, dq.field_b);
            this.field_Mb.field_N = 11184810;
            this.field_Mb.field_Fb = 1;
            this.field_Tb.a(11, this.field_Mb);
            this.field_Sb = new vh(0L, param8, pq.field_r);
            this.field_Sb.field_N = 11184810;
            this.field_Sb.field_Fb = 1;
            this.field_Tb.a(-101, this.field_Sb);
            this.field_Rb = new vh(0L, param8);
            this.field_Rb.field_N = 16764006;
            this.field_Tb.a(112, this.field_Rb);
            this.field_Rb.field_kb = "|";
            if (!(ta.field_f < 5) ||
              !(hq.field_i < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (wg) (param9);
                if (ta.field_f < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (hq.field_i < 2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = tq.field_w;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = er.field_T;
              }
              this.field_dc = new wg(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Tb.a(-121, this.field_dc);
            }
            var27 = new vh[3];
            var15 = var27;
            var27[0] = new vh(0L, (vh) null);
            this.field_Tb.a(-101, var27[0]);
            var27[1] = new vh(0L, (vh) null);
            this.field_Tb.a(-118, var27[1]);
            var27[2] = new vh(0L, (vh) null);
            this.field_Tb.a(-117, var27[2]);
            this.field_Vb = new vh[cd.field_a];
            for (var16 = 0; var16 < cd.field_a; var16++) {
              if (cm.field_L[var16] != null) {
                this.field_Vb[var16] = new vh(0L, param10, cm.field_L[var16]);
                this.field_Vb[var16].field_Fb = 0;
                stackIn_14_0 = this.field_Vb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_pb = stackIn_15_1;
                this.field_Tb.a(-128, this.field_Vb[var16]);
              }
            }
            this.field_ec = new StringBuilder(12);
            if (param11 != null) {
              discarded$0 = this.field_ec.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_I.b(qe.field_B);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_I.b(qa.field_m);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_I.b(hd.field_K);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; cd.field_a > var17Lifetime4; var17Lifetime4++) {
              if (this.field_Vb[var17Lifetime4] != null) {
                var18 = this.field_Vb[var17Lifetime4].b(true);
                if (var18 > var16Lifetime2) {
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
            var18Lifetime3 = this.a(qe.field_B, var18Lifetime3, var27[0], (byte) -124, param6, var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[6], -126, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[9], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[5], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[7], -128, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[15], -127, var18Lifetime3, var27[0], var16Lifetime2);
            var18Lifetime3 = this.a(this.field_Vb[4], -127, var18Lifetime3, var27[0], var16Lifetime2);
            if (var18Lifetime3 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(qa.field_m, var18Lifetime4, var27[1], (byte) -114, param6, var16Lifetime2);
            var18Lifetime4 = this.a(this.field_Vb[16], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.a(this.field_Vb[17], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.a(this.field_Vb[18], -128, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.a(this.field_Vb[19], -126, var18Lifetime4, var27[1], var16Lifetime2);
            var18Lifetime4 = this.a(this.field_Vb[20], -128, var18Lifetime4, var27[1], var16Lifetime2);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(hd.field_K, var18Lifetime5, var27[2], (byte) -124, param6, var16Lifetime2);
            var18Lifetime5 = this.a(this.field_Vb[13], -128, var18Lifetime5, var27[2], var16Lifetime2);
            var18Lifetime5 = this.a(this.field_Vb[21], -127, var18Lifetime5, var27[2], var16Lifetime2);
            var18Lifetime5 = this.a(this.field_Vb[11], -127, var18Lifetime5, var27[2], var16Lifetime2);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 3 * var16Lifetime2 + 26;
            var20 = this.field_Ob.b(true);
            if (var19 < var20) {
              var19 = var20;
            }
            if (this.field_dc != null) {
              var20Lifetime2 = this.field_dc.b(4, 2154);
              if (var19 < var20Lifetime2) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Ob.b(0, 2147483647, 0, 13 + var19 + 13, 24);
            this.field_Zb.b(5, 2147483647, -20 + this.field_Ob.field_gb, 15, 15);
            var21 = 10;
            this.field_Mb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
            var21 = var21 + ad.field_x * 2;
            this.field_Sb.b(var21, 2147483647, 13, var19, ad.field_x * 2);
            var21 = var21 + (ad.field_x * 2 + 10);
            this.field_Rb.b(var21, 2147483647, 0, 0, ad.field_x);
            var21 = var21 + (10 + ad.field_x);
            if (null != this.field_dc) {
              var20Lifetime3 = this.field_dc.b(4, 2154);
              this.field_dc.a(var21, 13 + (-var20Lifetime3 + var19) / 2, ad.field_x, false, var20Lifetime3, 4);
              var21 = var21 + (ad.field_x + 10);
            }
            var27[0].b(var21, 2147483647, 13, var16Lifetime2, var17Lifetime5);
            var27[1].b(var21, 2147483647, 13 + (var16Lifetime2 + 13), var16Lifetime2, var17Lifetime5);
            var27[2].b(var21, 2147483647, 13 - (-(2 * var16Lifetime2) - 26), var16Lifetime2, var17Lifetime5);
            var22 = var21;
            this.field_Tb.b(24, 2147483647, 0, 13 + (13 + var19), 10 + var22 + var17Lifetime5);
            this.field_Tb.field_F = rp.a(32450, 3, 2105376, this.field_Tb.field_Db, 11579568, 8421504);
            var23 = 13 + var19 + 13;
            var24 = 10 + var17Lifetime5 + (var22 + 24);
            var25 = de.a(var23, param2, param0, 0);
            var26 = sh.a(var24, param1, -1, param3);
            this.b(var26, 2147483647, var25, var23, var24);
            return;
          }
          this.field_Mb = new vh(0L, param8, th.field_d);
          this.field_Mb.field_Fb = 1;
          this.field_Mb.field_N = 11184810;
          this.field_Tb.a(123, this.field_Mb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Mb.field_I.b(this.field_Mb.field_nb, var15_int);
          this.field_Mb.b(var16Lifetime1, 2147483647, 13, var15_int, ad.field_x * var17Lifetime1);
          var16Lifetime1 = var16Lifetime1 + ad.field_x * var17Lifetime1;
          this.field_Tb.b(24, 2147483647, 0, 13 + var15_int + 13, var16Lifetime1 + 10);
          this.field_Tb.field_F = rp.a(32450, 3, 2105376, this.field_Tb.field_Db, 11579568, 8421504);
          var18Lifetime1 = var15_int + 13 + 13;
          var19Lifetime1 = 34 + var16Lifetime1;
          var20Lifetime1 = de.a(var18Lifetime1, param2, param0, 0);
          var21Lifetime1 = sh.a(var19Lifetime1, param1, -1, param3);
          this.b(var21Lifetime1, 2147483647, var20Lifetime1, var18Lifetime1, var19Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw wm.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    final boolean f(int param0) {
        if (this.field_bc != -2) {
          return false;
        }
        if (param0 == qi.field_a) {
          this.field_bc = -1;
          return true;
        }
        return true;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        bc.field_b.field_v = 0;
        bc.field_b.a(12, false);
        bc.field_b.a(true, lc.field_P.nextInt());
        if (param0 >= -116) {
          field_Wb = (char[]) null;
        }
        bc.field_b.a(true, lc.field_P.nextInt());
        bc.field_b.a(param3, false);
        bc.field_b.a(param2, false);
        bc.field_b.a((byte) -81, param1);
        bc.field_b.a(rb.field_l, 124, ei.field_q);
        ej.field_j.b(false, 18);
        int fieldTemp$0 = ej.field_j.field_v + 1;
        ej.field_j.field_v = ej.field_j.field_v + 1;
        int var4 = fieldTemp$0;
        ej.field_j.a(bc.field_b.field_t, (byte) 0, 0, bc.field_b.field_v);
        ej.field_j.b(-var4 + ej.field_j.field_v, true);
    }

    public static void f(byte param0) {
        field_cc = null;
        field_Qb = null;
        field_Wb = null;
        field_Ub = null;
        int var1 = 74 % ((param0 - 12) / 52);
        field_Pb = null;
        field_Yb = null;
        field_Xb = null;
        field_ac = (int[][]) null;
    }

    final String h(int param0) {
        if (param0 != 1) {
          this.field_bc = -13;
        }
        return this.field_ec.toString();
    }

    private final int a(String param0, int param1, vh param2, byte param3, vh param4, int param5) {
        int discarded$1 = 0;
        vh var7 = null;
        RuntimeException var7_ref = null;
        vh var8 = null;
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
          var7 = new vh(0L, param4, 0, param1, param5, 24, param0);
          if (param3 > -98) {
            var8 = (vh) null;
            discarded$1 = this.a((String) null, -118, (vh) null, (byte) -47, (vh) null, -97);
          }
          param2.a(-111, var7);
          param1 += 32;
          stackIn_3_0 = param1;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("wm.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 18) {
            wm.f((byte) 15);
          }
          if (!param0) {
            stackIn_6_0 = qp.field_ec.b(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = qa.field_t.b(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wm.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Xb = null;
        field_cc = "(Including <%0>)";
        field_Qb = "Email: ";
        field_Pb = new na();
        field_Wb = new char[]{(char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122};
        field_ac = new int[64][3];
        field_Yb = "Funorb Pool";
    }
}
