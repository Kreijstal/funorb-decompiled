/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hd {
    static int field_yb;
    static int field_Bb;
    private StringBuilder field_Db;
    private hd field_Lb;
    private hd field_Cb;
    static String field_Hb;
    private hd field_Nb;
    private hd[] field_Jb;
    static int field_Kb;
    private om field_zb;
    static String field_Ib;
    long field_Eb;
    private hd field_Ab;
    private hd field_Fb;
    static int field_Mb;
    private int field_Ob;
    private hd field_Gb;

    final static tv a(int param0, int param1, byte param2, int param3) {
        boolean stackIn_47_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        tv var8_ref_tv;
        int var9;
        tv var9_ref_tv;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = Kickabout.field_G;
        pw.field_G.field_Ab.field_jb.b(22997);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = vb.field_j - 1; var7 >= 0; var7--) {
          var8_ref_tv = fu.field_b[var7];
          var9 = 0;
          if (!iw.field_l &&
            var5 < at.field_Hb) {
            var10_int = r.a(0, var8_ref_tv.field_c);
            if (var10_int <= var8_ref_tv.b(80) && (var8_ref_tv.field_m ||
              !hi.a(param2 ^ 26, var8_ref_tv.field_q))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (var8_ref_tv.field_s == null ||
              wj.field_z) {
              if (var8_ref_tv.field_s != null) {
              }
              var10 = ob.a((byte) -92, var8_ref_tv);
              var11 = var10 + hu.c(var8_ref_tv.field_g);
              var12 = qa.a(var8_ref_tv, 31100);
              var8_ref_tv.field_s = new hd(0L, vv.field_o, var11);
              var6 = var6 + param1;
              var8_ref_tv.field_s.field_X = nl.field_i;
              var8_ref_tv.field_s.field_ub = -(8355711 & var12 >> 1) + var12 + (8355711 & vv.field_o.field_ub >> 1);
              var8_ref_tv.field_s.field_ab = var12 - (((16711423 & var12) >> 1) - ((vv.field_o.field_ab & 16711422) >> 1));
              var8_ref_tv.field_s.field_y = var12;
            }
            var5++;
          } else {
            var8_ref_tv.field_s = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; vb.field_j > var8; var8++) {
          var9_ref_tv = fu.field_b[var8];
          if (null != var9_ref_tv.field_s) {
            pw.field_G.field_Ab.a((byte) -105, var9_ref_tv.field_s);
            var9_ref_tv.field_s.a(true, var9_ref_tv.field_s.g((byte) -44), param3, var7Lifetime1, param1);
            var7Lifetime1 = var7Lifetime1 + param1;
            if (var9_ref_tv.field_s.field_sb != 0) {
              var4 = var9_ref_tv;
            }
          }
        }
        var8Lifetime1 = var6 - var7Lifetime1 + pw.field_G.field_Ab.field_L + pw.field_G.field_Ab.field_mb;
        pw.field_G.field_Ab.field_mb = pw.field_G.field_Ab.field_mb - var8Lifetime1;
        pw.field_G.field_Ab.field_J = pw.field_G.field_Ab.field_J + var8Lifetime1;
        if (wj.field_z) {
          pw.field_G.field_Ab.field_mb = var7Lifetime1;
        }
        if (param2 != 26) {
          return (tv) null;
        }
        pw.field_G.field_Ab.field_L = var7Lifetime1 - pw.field_G.field_Ab.field_mb;
        if (wj.field_z) {
          dg.field_a = true;
          pw.field_G.field_Ab.field_J = -pw.field_G.field_Ab.field_mb + pw.field_G.field_zb.field_mb;
          wj.field_z = false;
          pw.field_G.field_Ab.field_v = 0;
        }
        if (vg.field_Wb &&
          mu.field_Y != null) {
          dg.field_a = true;
        }
        var9Lifetime1 = -pw.field_G.field_Ab.field_mb + (-pw.field_G.field_Ab.field_L + pw.field_G.field_zb.field_mb);
        if (dg.field_a) {
          pw.field_G.field_Ab.field_v = var9Lifetime1 - pw.field_G.field_Ab.field_J;
        }
        pw.field_G.a(param1, param0 * param1 * 2, true, param2 ^ 26);
        stackIn_47_0 = (pw.field_G.field_Ab.field_J + pw.field_G.field_Ab.field_v == var9Lifetime1);
        dg.field_a = stackIn_47_0;
        return (tv) (var4);
    }

    final static void a(byte param0, String param1) {
        try {
          ek.field_M = param1;
          qd.b(38, 12);
          if (param0 != -51) {
            field_Ib = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "rb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 26) {
          this.field_Lb = (hd) null;
        }
        stackIn_6_0 = (null != this.field_zb) && (this.field_zb.field_I);
        return stackIn_6_0;
    }

    public static void c(boolean param0) {
        field_Ib = null;
        field_Hb = null;
        if (!param0) {
          field_Mb = -83;
        }
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        om stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        hd stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        int var4;
        var4 = Kickabout.field_G;
        this.b(param1, param0);
        if (null != this.field_Fb) {
          this.field_Fb.field_E = this.field_Db.toString();
          this.field_Fb.field_s = (this.field_q - this.field_Fb.field_X.a(this.field_Fb.field_E)) / 2;
          if (null != this.field_zb &&
            0 != this.field_zb.field_sb) {
            stackIn_6_0 = this.field_zb;
            stackIn_7_1 = !(this.field_zb.field_I);
            stackIn_6_0.field_I = stackIn_7_1;
          }
          this.field_Fb.field_q = -this.field_Fb.field_s + this.field_q;
          for (var3 = 0; var3 < ob.field_B; var3++) {
            if (this.field_Jb[var3] != null) {
              stackIn_15_0 = this.field_Jb[var3];
              stackIn_16_1 = !(this.field_Db.length() <= 0);
              stackIn_15_0.field_lb = stackIn_16_1;
              if (this.field_Jb[var3].field_lb &&
                0 != this.field_Jb[var3].field_sb) {
                return var3;
              }
            }
          }
        }
        if (this.field_Ab.field_sb != 0) {
          return -1;
        }
        if (param0 &&
          0 != wj.field_A &&
          this.field_sb == 0) {
          return -1;
        }
        return this.field_Ob;
    }

    final String a(int param0) {
        if (param0 != -15596) {
          this.field_Ob = -119;
        }
        return this.field_Db.toString();
    }

    private final int a(int param0, String param1, int param2, hd param3, hd param4, byte param5) {
        hd var7 = null;
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
          var7 = new hd(0L, param3, 0, param0, param2, 24, param1);
          param0 += 32;
          param4.a((byte) -106, var7);
          if (param5 < 4) {
            this.b(-117);
          }
          stackIn_3_0 = param0;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_6_0 = var7_ref;
          stackIn_6_1 = new StringBuilder().append("rb.J(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -46) {
          return true;
        }
        return param1 == 6 ? true : false;
    }

    rb(int param0, int param1, int param2, int param3, int param4, hd param5, hd param6, hd param7, hd param8, om param9, hd param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        om stackIn_6_1;
        om stackIn_6_2;
        long stackIn_6_3;
        om stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        om stackIn_8_1;
        om stackIn_8_2;
        String stackIn_8_5;
        hd stackIn_14_0 = null;
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
        hd[] var15 = null;
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
        hd[] var28 = null;
        Object stackIn_6_0Lifetime1;
        Object stackIn_8_0Lifetime1;
        om stackIn_8_1Lifetime1;
        om stackIn_8_2Lifetime1;
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
        this.field_Ob = -2;
        try {
          this.field_Eb = param12;
          this.field_Gb = new hd(0L, param6, fi.field_c.toUpperCase());
          this.field_Gb.field_A = 1;
          this.a((byte) -110, this.field_Gb);
          this.field_Ab = new hd(0L, param7);
          this.field_Gb.a((byte) -116, this.field_Ab);
          this.field_Nb = new hd(0L, (hd) null);
          this.a((byte) -111, this.field_Nb);
          if (param11 != null) {
            this.field_Cb = new hd(0L, param8, cf.field_Ib);
            this.field_Cb.field_A = 1;
            this.field_Cb.field_y = 11184810;
            this.field_Nb.a((byte) -110, this.field_Cb);
            this.field_Lb = new hd(0L, param8, nc.field_d);
            this.field_Lb.field_y = 11184810;
            this.field_Lb.field_A = 1;
            this.field_Nb.a((byte) -116, this.field_Lb);
            this.field_Fb = new hd(0L, param8);
            this.field_Fb.field_y = 16764006;
            this.field_Nb.a((byte) -105, this.field_Fb);
            this.field_Fb.field_V = "|";
            if (!(bl.field_c < 5) ||
              !(tk.field_Ib < 2)) {
              L3: {
                stackIn_6_0 = this;
                stackIn_6_1 = null;
                stackIn_6_2 = null;
                stackIn_6_3 = 0L;
                stackIn_6_4 = (om) (param9);
                if (bl.field_c < 7) {
                  stackIn_7_0 = this;
                  stackIn_6_0Lifetime1 = stackIn_7_0;
                  if (2 > tk.field_Ib) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_5 = vv.field_s;
                    break L3;
                  }
                }
                stackIn_8_0Lifetime1 = this;
                stackIn_8_1Lifetime1 = null;
                stackIn_8_2Lifetime1 = null;
                stackIn_8_5 = mc.field_h;
              }
              this.field_zb = new om(stackIn_6_3, stackIn_6_4, stackIn_8_5);
              this.field_Nb.a((byte) -118, (hd) (this.field_zb));
            }
            var28 = new hd[3];
            var15 = var28;
            var28[0] = new hd(0L, (hd) null);
            this.field_Nb.a((byte) -105, var28[0]);
            var28[1] = new hd(0L, (hd) null);
            this.field_Nb.a((byte) -111, var28[1]);
            var28[2] = new hd(0L, (hd) null);
            this.field_Nb.a((byte) -127, var28[2]);
            this.field_Jb = new hd[ob.field_B];
            for (var16 = 0; ob.field_B > var16; var16++) {
              if (null != bh.field_i[var16]) {
                this.field_Jb[var16] = new hd(0L, param10, bh.field_i[var16]);
                this.field_Jb[var16].field_A = 0;
                stackIn_14_0 = this.field_Jb[var16];
                stackIn_15_1 = (param11 != null);
                stackIn_14_0.field_lb = stackIn_15_1;
                this.field_Nb.a((byte) -124, this.field_Jb[var16]);
              }
            }
            this.field_Db = new StringBuilder(12);
            if (null != param11) {
              discarded$0 = this.field_Db.append(param11);
            }
            var16Lifetime2 = 0;
            var17 = param6.field_X.a(ce.field_F);
            if (var16Lifetime2 < var17) {
              var16Lifetime2 = var17;
            }
            var17Lifetime2 = param6.field_X.a(cj.field_H);
            if (var17Lifetime2 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime2;
            }
            var17Lifetime3 = param6.field_X.a(tk.field_Hb);
            if (var17Lifetime3 > var16Lifetime2) {
              var16Lifetime2 = var17Lifetime3;
            }
            for (var17Lifetime4 = 0; var17Lifetime4 < ob.field_B; var17Lifetime4++) {
              if (this.field_Jb[var17Lifetime4] != null) {
                var18 = this.field_Jb[var17Lifetime4].g((byte) -40);
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
            var18Lifetime3 = this.a(var18Lifetime3, ce.field_F, var16Lifetime2, param6, var28[0], (byte) 9);
            var18Lifetime3 = this.a(-6305, this.field_Jb[6], var16Lifetime2, var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(-6305, this.field_Jb[9], var16Lifetime2, var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(-6305, this.field_Jb[5], var16Lifetime2, var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(-6305, this.field_Jb[7], var16Lifetime2, var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(-6305, this.field_Jb[15], var16Lifetime2, var18Lifetime3, var28[0]);
            var18Lifetime3 = this.a(-6305, this.field_Jb[4], var16Lifetime2, var18Lifetime3, var28[0]);
            if (var17Lifetime5 < var18Lifetime3) {
              var17Lifetime5 = var18Lifetime3;
            }
            var18Lifetime4 = 0;
            var18Lifetime4 = this.a(var18Lifetime4, cj.field_H, var16Lifetime2, param6, var28[1], (byte) 119);
            var18Lifetime4 = this.a(-6305, this.field_Jb[16], var16Lifetime2, var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(-6305, this.field_Jb[17], var16Lifetime2, var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(-6305, this.field_Jb[18], var16Lifetime2, var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(-6305, this.field_Jb[19], var16Lifetime2, var18Lifetime4, var28[1]);
            var18Lifetime4 = this.a(-6305, this.field_Jb[20], var16Lifetime2, var18Lifetime4, var28[1]);
            if (var17Lifetime5 < var18Lifetime4) {
              var17Lifetime5 = var18Lifetime4;
            }
            var18Lifetime5 = 0;
            var18Lifetime5 = this.a(var18Lifetime5, tk.field_Hb, var16Lifetime2, param6, var28[2], (byte) 127);
            var18Lifetime5 = this.a(-6305, this.field_Jb[13], var16Lifetime2, var18Lifetime5, var28[2]);
            var18Lifetime5 = this.a(-6305, this.field_Jb[21], var16Lifetime2, var18Lifetime5, var28[2]);
            var18Lifetime5 = this.a(-6305, this.field_Jb[11], var16Lifetime2, var18Lifetime5, var28[2]);
            if (var18Lifetime5 > var17Lifetime5) {
              var17Lifetime5 = var18Lifetime5;
            }
            var19 = 26 + var16Lifetime2 * 3;
            var20 = this.field_Gb.g((byte) 108);
            if (var19 < var20) {
              var19 = var20;
            }
            if (null != this.field_zb) {
              var20Lifetime2 = this.field_zb.b(0, 4);
              if (var20Lifetime2 > var19) {
                var19 = var20Lifetime2;
              }
            }
            this.field_Gb.a(true, var19 + 13 + 13, 0, 0, 24);
            this.field_Ab.a(true, 15, -20 + this.field_Gb.field_q, 5, 15);
            var21 = 10;
            this.field_Cb.a(true, var19, 13, var21, 2 * sh.field_c);
            var21 = var21 + sh.field_c * 2;
            this.field_Lb.a(true, var19, 13, var21, 2 * sh.field_c);
            var21 = var21 + (10 + 2 * sh.field_c);
            this.field_Fb.a(true, 0, 0, var21, sh.field_c);
            var21 = var21 + (10 + sh.field_c);
            if (null != this.field_zb) {
              var20Lifetime3 = this.field_zb.b(0, 4);
              this.field_zb.a(4, var21, sh.field_c, var20Lifetime3, 13 + (var19 - var20Lifetime3) / 2, -10481);
              var21 = var21 + (10 + sh.field_c);
            }
            var28[0].a(true, var16Lifetime2, 13, var21, var17Lifetime5);
            var28[1].a(true, var16Lifetime2, var16Lifetime2 + 13 + 13, var21, var17Lifetime5);
            var28[2].a(true, var16Lifetime2, 26 + (13 + var16Lifetime2 * 2), var21, var17Lifetime5);
            var22 = var21;
            this.field_Nb.a(true, 13 + (13 + var19), 0, 24, 10 + var22 + var17Lifetime5);
            this.field_Nb.field_R = fs.a(this.field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 127);
            var23 = var19 + 13 + 13;
            var24 = 10 + (var17Lifetime5 + 24) + var22;
            var25 = ou.b(var23, param0, param2, 127);
            var26 = nj.a(param1, param3, var24, 29079);
            this.a(true, var23, var25, var26, var24);
            return;
          }
          this.field_Cb = new hd(0L, param8, sl.field_Bb);
          this.field_Cb.field_y = 11184810;
          this.field_Cb.field_A = 1;
          this.field_Nb.a((byte) -110, this.field_Cb);
          var15_int = 226;
          var16Lifetime1 = 10;
          var17Lifetime1 = this.field_Cb.field_X.b(this.field_Cb.field_E, var15_int);
          this.field_Cb.a(true, var15_int, 13, var16Lifetime1, var17Lifetime1 * sh.field_c);
          var16Lifetime1 = var16Lifetime1 + var17Lifetime1 * sh.field_c;
          this.field_Nb.a(true, 13 + var15_int + 13, 0, 24, var16Lifetime1 + 10);
          this.field_Nb.field_R = fs.a(this.field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 96);
          var18Lifetime1 = var15_int + 13 + 13;
          var19Lifetime1 = var16Lifetime1 + 34;
          var20Lifetime1 = ou.b(var18Lifetime1, param0, param2, 127);
          var21Lifetime1 = nj.a(param1, param3, var19Lifetime1, 29079);
          this.a(true, var18Lifetime1, var20Lifetime1, var21Lifetime1, var19Lifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_51_0 = var15_ref;
          stackIn_51_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param12).append(')').toString());
        }
    }

    private final int a(int param0, hd param1, int param2, int param3, hd param4) {
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
          param3 += 8;
          if (param0 != -6305) {
            this.field_Db = (StringBuilder) null;
          }
          var6_int = param1.field_X.c(param1.field_E, -(2 * param1.field_kb) + param2, param1.field_xb);
          param1.a(true, param2, 0, param3, var6_int);
          param3 = param3 + (0 + var6_int);
          param4.a((byte) -120, param1);
          stackIn_3_0 = param3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("rb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final boolean h(byte param0) {
        if (this.field_Ob != -2) {
          return false;
        }
        if (cc.field_e == 13) {
          this.field_Ob = -1;
        }
        if (param0 != 37) {
          this.field_Cb = (hd) null;
          return true;
        }
        return true;
    }

    static {
        field_Bb = 20;
        field_Hb = "Spectate";
        field_Kb = 33;
        field_Ib = "null";
        field_Mb = 4;
    }
}
