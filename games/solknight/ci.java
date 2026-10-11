/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ci extends gf implements ka {
    static String[] field_mb;
    static int field_jb;
    static int field_sb;
    static String[] field_gb;
    private boolean field_lb;
    static int field_ib;
    private mg field_nb;
    private boolean field_rb;
    static int[] field_pb;
    private c field_kb;
    private boolean field_ob;
    static int[] field_qb;
    private boolean field_hb;

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          if (param4 <= 121) {
            return;
          }
          var5_int = param3 + param0;
          var6 = param1 + param2;
          if (mi.field_b < param3) {
            stackIn_6_0 = param3;
          } else {
            stackIn_6_0 = mi.field_b;
          }
          var7 = stackIn_6_0;
          if (param1 <= mi.field_l) {
            stackIn_9_0 = mi.field_l;
          } else {
            stackIn_9_0 = param1;
          }
          var8 = stackIn_9_0;
          if (var5_int >= mi.field_k) {
            stackIn_12_0 = mi.field_k;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < mi.field_e) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = mi.field_e;
          }
          var10 = stackIn_15_0;
          if (param3 >= mi.field_b &&
            mi.field_k > param3) {
            var11 = param3 + mi.field_a * var8;
            var12 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              mi.field_f[var11] = 16777215;
              var11 = var11 + mi.field_a * 2;
            }
          }
          if (mi.field_l <= param1 &&
            var6 < mi.field_e) {
            var11Lifetime1 = var7 + mi.field_a * param1;
            var12Lifetime1 = 1 + var9 - var7 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              mi.field_f[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= mi.field_b &&
            var5_int < mi.field_k) {
            var11Lifetime2 = var5_int + mi.field_a * (var8 + (1 & -param3 + var5_int));
            var12Lifetime2 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              mi.field_f[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * mi.field_a;
            }
          }
          if (mi.field_l <= param1) {
            if (mi.field_e <= var6) {
              return;
            }
            var11Lifetime3 = (1 & var6 - param1) + (var7 + var6 * mi.field_a);
            var12Lifetime3 = var9 + (1 - var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                break;
              }
              mi.field_f[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var5), "ci.MB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void m(int param0) {
        this.field_kb.a((byte) -128, 4210752, 2121792);
        lj var2 = new lj(this, this.field_nb, pc.field_a);
        if (param0 <= 118) {
          this.field_nb = (mg) null;
        }
        var2.a(15, kf.field_F, 1);
        this.c(-3399, var2);
    }

    public static void g(byte param0) {
        field_qb = null;
        field_pb = null;
        field_gb = null;
        int var1 = -57 / ((2 - param0) / 35);
        field_mb = null;
    }

    final void f(boolean param0) {
        aa var3;
        if (!this.field_J) {
          return;
        }
        this.field_J = false;
        if (this.field_ob) {
          fj.a((byte) 85);
        } else {
          if (this.field_rb) {
            ie.b(-102);
          }
        }
        if (!param0) {
          var3 = (aa) null;
          ci.a(47, true, 62, (aa) null, true);
        }
    }

    ci(i param0, mg param1, String param2, boolean param3, boolean param4) {
        super(param0, new lj((ci) null, param1, param2), 77, 10, 10);
        try {
          this.field_lb = false;
          this.field_ob = param3 ? true : false;
          this.field_hb = false;
          this.field_nb = param1;
          this.field_rb = param4 ? true : false;
          this.field_kb = new c(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_kb.field_B = true;
          this.a(this.field_kb, 5411);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public void a(int param0, int param1, int param2, pj param3, boolean param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (!this.field_lb) {
            kj.a(ia.g(97), 108, "tochangedisplayname.ws");
          } else {
            h.a(3, true);
            this.f(true);
          }
          if (!param4) {
            field_gb = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ci.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte[] param0, int param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, gb param6) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var7_int = ah.a(param1, (byte) -122);
          if (null == f.field_e) {
            f.field_e = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = f.field_e.nextInt();
          }
          if (lc.field_k == null ||
            !(var7_int <= lc.field_k.field_l.length)) {
            lc.field_k = new gb(var7_int);
          }
          lc.field_k.field_m = 0;
          lc.field_k.a(param2, param1, param0, param4);
          lc.field_k.b((byte) -65, var7_int);
          lc.field_k.a((byte) 97, var13);
          if (null == ee.field_h ||
            !(ee.field_h.field_l.length >= 100)) {
            ee.field_h = new gb(100);
          }
          ee.field_h.field_m = 0;
          ee.field_h.c(19, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            ee.field_h.b(var13[var11], false);
            var11++;
          }
          ee.field_h.a(true, param1);
          ee.field_h.a(param5, 59769888, param3);
          param6.a(8, ee.field_h.field_m, ee.field_h.field_l, 0);
          param6.a(param2 ^ 0, lc.field_k.field_m, lc.field_k.field_l, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_21_0 = var7;
          stackIn_21_1 = new StringBuilder().append("ci.KB(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param6 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final static void a(da param0, boolean param1, da param2, da param3) {
        int var11_int = 0;
        da stackIn_3_0 = null;
        String stackIn_3_1 = null;
        boolean stackIn_4_2 = false;
        da stackIn_6_0 = null;
        String stackIn_6_1 = null;
        boolean stackIn_7_2 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        od[] var5 = null;
        od[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        od[] var10 = null;
        o var11 = null;
        o var12 = null;
        int var13 = 0;
        da var14 = null;
        od[] var15 = null;
        o var16 = null;
        int[][] var17 = null;
        o var18 = null;
        o var19 = null;
        int[][] var20 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = SolKnight.field_L ? 1 : 0;
        try {
          fi.field_a = ik.a(param3, -18362, "frame_top", "commonui");
          qk.field_l = ik.a(param3, -18362, "frame_bottom", "commonui");
          fa.field_b = rb.a("jagex_logo_grey", "commonui", param3, (byte) -125);
          vk.field_i = ik.a(param3, -18362, "button", "commonui");
          gb.field_k = nh.a(param3, "validation", 0, "commonui");
          stackIn_3_0 = (da) (param0);
          stackIn_3_1 = "commonui";
          stackIn_4_2 = !(param1);
          jh.field_g = (mg) ((Object) si.a(stackIn_3_0, stackIn_3_1, stackIn_4_2, "arezzo12", param3));
          stackIn_6_0 = (da) (param0);
          stackIn_6_1 = "commonui";
          stackIn_7_2 = !(param1);
          ua.field_G = (mg) ((Object) si.a(stackIn_6_0, stackIn_6_1, stackIn_7_2, "arezzo14", param3));
          uc.field_g = (mg) ((Object) si.a(param0, "commonui", true, "arezzo14bold", param3));
          var18 = new o(param2.a(4, "button.gif", ""), (java.awt.Component) ((Object) dc.field_q));
          ve.a(param3, -97, "dropdown", "commonui");
          var5 = dj.a(8108, "screen_options", param3, "commonui");
          md.field_s = new od[4];
          r.field_i = new od[4];
          jl.field_g = new od[4];
          var6 = new od[][]{md.field_s, r.field_i, jl.field_g};
          var20 = new int[4][];
          var17 = var20;
          var7 = var17;
          var7[0] = var5[0].field_m;
          for (var8 = 1; var8 < var20.length; var8++) {
            var7[var8] = (int[]) ((Object) var20[0].clone());
          }
          var8Lifetime1 = var5[0].field_n[0];
          var20[2][var8Lifetime1] = 16777215;
          var20[1][var8Lifetime1] = 2394342;
          var20[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            var10 = var15;
            for (var11_int = 0; var15.length > var11_int; var11_int++) {
              var15[var11_int] = bl.a(var5[var9], var20[var11_int], (byte) 100);
            }
          }
          if (param1) {
            var14 = (da) null;
            ci.a((da) null, false, (da) null, (da) null);
          }
          var9Lifetime1 = var18.field_t;
          fl.b((byte) 91);
          var18.a();
          mi.c(0, 0, mi.field_a, mi.field_d);
          var16 = new o(var9Lifetime1, var9Lifetime1);
          var19 = var16;
          var19.a();
          var18.c(0, 0);
          var11 = new o(var9Lifetime1, var9Lifetime1);
          var11.a();
          var18.c(var9Lifetime1 - var18.field_p, 0);
          var12 = new o(-(var9Lifetime1 * 2) + var18.field_p, var9Lifetime1);
          var12.a();
          var18.c(-var9Lifetime1, 0);
          mf.e(4096);
          vk.field_i = new o[]{var16, var12, var11};
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ci.TB(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 60 % ((31 - param1) / 56);
          if (param2 != 13) {
            stackIn_4_0 = super.a(param0, (byte) 90, param2, param3);
            return stackIn_4_0;
          }
          this.f(true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ci.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1) {
        gg var2 = null;
        int var3 = 0;
        ob var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 >= -26) {
            return;
          }
          var4 = (ob) (he.field_d.a((byte) 51));
          while (var4 != null) {
            vg.a(param1, var4, 118);
            var4 = (ob) (he.field_d.b(-84));
          }
          var2 = bc.field_J.a((byte) 51);
          while (var2 != null) {
            wi.c(1, param1);
            var2 = bc.field_J.b(-104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "ci.GB(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -61) {
            stackIn_4_0 = la.a(125, 0, param0.length, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ci.JB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, aa param3, boolean param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          ed.field_a[0] = ib.field_i.nextInt();
          ed.field_a[1] = ib.field_i.nextInt();
          ed.field_a[2] = (int)(i.field_H >> 32);
          ic.field_z.field_m = 0;
          ed.field_a[3] = (int)i.field_H;
          ic.field_z.b(ed.field_a[0], false);
          ic.field_z.b(ed.field_a[1], false);
          ic.field_z.b(ed.field_a[2], false);
          ic.field_z.b(ed.field_a[3], false);
          vh.a(ic.field_z, 107);
          ic.field_z.a(true, param2);
          param3.a(-12518, ic.field_z);
          id.field_c.field_m = 0;
          if (param1) {
            id.field_c.c(param0 ^ -25840, 18);
          } else {
            id.field_c.c(param0 ^ 25812, 16);
          }
          id.field_c.field_m = id.field_c.field_m + 2;
          var5_int = id.field_c.field_m;
          id.field_c.b(al.field_n, false);
          id.field_c.a(wk.field_b, (byte) 63);
          var6 = 0;
          if (cl.field_m) {
            var6 = var6 | 1;
          }
          if (b.field_b) {
            var6 = var6 | 4;
          }
          if (param4) {
            var6 = var6 | 8;
          }
          if (null != ri.field_a) {
            var6 = var6 | 16;
          }
          if (param0 != -25776) {
            field_sb = 30;
          }
          id.field_c.c(-110, var6);
          var7 = hh.a(false, ia.g(param0 ^ 25799));
          if (var7 == null) {
            var7 = "";
          }
          id.field_c.a(var7, 0);
          if (null != ri.field_a) {
            id.field_c.b(param0 ^ 1955918408, ri.field_a);
          }
          al.a(ic.field_z, id.field_c, (byte) 110, nc.field_d, qa.field_p);
          id.field_c.a(id.field_c.field_m - var5_int, true);
          qf.a(0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ci.NB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(String param0, int param1, byte param2) {
        boolean stackIn_9_1 = false;
        lj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_14_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        lj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lj var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (this.field_hb) {
            return;
          }
          if (param2 > -40) {
            this.m(13);
          }
          stackIn_9_1 = (param1 == 256);
          this.field_lb = stackIn_9_1;
          this.field_hb = true;
          this.field_kb.a((byte) -118, 4210752, 8405024);
          var6 = new lj(this, this.field_nb, param0);
          var4 = var6;
          if (param1 == 5) {
            var6.a(11, cl.field_k, 1);
            var6.a(17, ph.field_e, 1);
          } else {
            if (param1 == 256) {
              var6.a(0, gg.field_c, (dg) (this));
            } else {
              stackIn_13_0 = var6;
              stackIn_13_1 = -1;
              if (!this.field_ob) {
                stackIn_14_2 = u.field_e;
              } else {
                stackIn_14_2 = gg.field_c;
              }
              ((lj) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2, 1);
            }
          }
          if (param1 != 3) {
            if (param1 == 4) {
              var6.a(8, mf.field_l, 1);
            } else {
              if (param1 != 6) {
                if (param1 == 9) {
                  var6.a(0, gh.field_r, (dg) (this));
                }
              } else {
                var6.a(9, ik.field_d, 1);
              }
            }
          } else {
            var6.a(7, qd.field_a, 1);
          }
          this.c(-3399, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("ci.HB(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_mb = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_gb = new String[]{"Pluto", "Neptune", "Uranus", "Saturn", "Jupiter", "Asteroid Defence Grid", "Mars", "Earth"};
        field_pb = new int[8192];
        field_qb = new int[128];
    }
}
