/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends rg {
    int[] field_C;
    private String[] field_A;
    private int[] field_z;
    static long field_y;
    static int[] field_B;
    private int[][] field_x;
    static kf[] field_D;
    static int field_E;
    static int field_G;
    static String field_F;
    static boolean[] field_w;

    final String e(int param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Pool.field_O;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_A) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_A[param0]);
        for (var3 = 1; this.field_A.length > var3; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_A[var3]);
        }
        return var2.toString();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        if (this.field_C != null) {
          for (var2 = 0; this.field_C.length > var2; var2++) {
            this.field_C[var2] = md.a(this.field_C[var2], 32768);
          }
        }
        if (!param0) {
          field_y = 55L;
        }
    }

    final static void a(int param0, int param1) {
        nk.field_h = param0;
        if (param1 != 3815994) {
          return;
        }
        if (null != tl.field_N) {
          tl.field_N.a(param0, (byte) -46);
        }
        if (qo.field_C != null) {
          qo.field_C.b(param0, param1 - 3804437);
        }
    }

    ap() {
    }

    final static short[] a(short[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        short[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -73) {
            field_w = (boolean[]) null;
          }
          stackIn_3_0 = sk.a((byte) -123, param2, param0, (short) 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ap.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, ge param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          if (param0 != -20678) {
            field_D = (kf[]) null;
          }
          while (true) {
            var3_int = param1.g(param0 ^ 20652);
            if (var3_int == 0) {
              return;
            }
            this.a(var3_int, param1, (byte) -17);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ap.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_B = null;
        if (param0 != -111) {
          short[] var2 = (short[]) null;
          ap.a((short[]) null, (byte) -77, 7);
        }
        field_F = null;
        field_w = null;
        field_D = null;
    }

    final static void a(di param0, boolean param1, qb[] param2, int[] param3, di param4) {
        dd[] dupTemp$0 = null;
        dd[] dupTemp$1 = null;
        dd[] dupTemp$2 = null;
        dd[] dupTemp$3 = null;
        qb[] var5 = null;
        qb[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        qb[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        an var7 = null;
        vh var8 = null;
        vh var9 = null;
        vh var10 = null;
        vh var11 = null;
        dd[] var12 = null;
        dd[] var13 = null;
        dd[] var14 = null;
        vh var15 = null;
        dd[] var16 = null;
        dd[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = Pool.field_O;
        try {
          var20 = gr.a(param4, "lobby", -24155, "crowns");
          var5 = var20;
          gf.field_a = var20.length;
          if (param2 != null) {
            var6 = new qb[param2.length + gf.field_a];
            for (var7_int = 0; gf.field_a > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param2.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + gf.field_a] = param2[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; gf.field_a > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param2 != null) {
            if (param3 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + gf.field_a] = param3[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param2.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + gf.field_a] = param2[var7_intLifetime2].field_b;
              }
            }
          }
          kj.field_j = 4;
          wh.field_b = 11;
          tk.field_i = 2;
          ad.field_x = 15;
          ja.field_b = 2;
          var7 = he.a(param4, "largefont", 0, param0, "lobby");
          ae.field_a = he.a(param4, "generalfont", 0, param0, "lobby");
          ol.field_c = he.a(param4, "chatfont", 0, param0, "lobby");
          var7.a(var5, var24);
          ae.field_a.a(var5, var24);
          ol.field_c.a(var5, var24);
          var8 = new vh(0L, (vh) null);
          var8.field_I = (lr) ((Object) var7);
          var8.field_M = ad.field_x;
          var8.field_N = 16777215;
          var9 = var8;
          var8.field_cb = 1;
          var9.field_Fb = 1;
          var10 = new vh(0L, (vh) null);
          var10.field_M = ad.field_x;
          var10.field_N = 16777215;
          var10.field_I = (lr) ((Object) ae.field_a);
          var10.field_cb = 1;
          var11 = var10;
          var11.field_Fb = 1;
          rl.field_d = new vh(0L, var8);
          rl.field_d.field_F = up.a(aj.a(0, "lobby", param4, "heading"), 12519);
          md.field_d = new vh(0L, (vh) null);
          md.field_d.field_F = qi.a(8421504, 4210752, false, 120, -86, false);
          ag.field_f = new vh(0L, (vh) null);
          ag.field_f.field_F = rp.a(32450, 3, 1, 114, 6316128, 6316128);
          wa.field_qb = new vh(0L, (vh) null);
          wa.field_qb.field_F = up.a(aj.a(0, "lobby", param4, "popup"), 12519);
          var12 = up.a(aj.a(0, "lobby", param4, "popup_mouseover"), 12519);
          var13 = aj.a(0, "lobby", param4, "button");
          var14 = up.a(aj.a(0, "lobby", param4, "tab_active"), 12519);
          dg.field_J = new vh(0L, var8);
          dg.field_J.field_F = var14;
          qg.field_f = new vh(0L, (vh) null);
          qg.field_f.field_hb = pf.a("lobby", (byte) 115, "closebutton", param4);
          qg.field_f.field_xb = pf.a("lobby", (byte) 101, "closebutton_mouseover", param4);
          bh.field_b = new vh(0L, var8);
          bh.field_b.field_F = qi.a(3815994, 2039583, true, 40, -86, true);
          lf.field_d = new vh(0L, var10);
          lf.field_d.field_tb = 2;
          lf.field_d.field_F = qi.a(3815994, 2039583, false, 30, -111, true);
          f.field_e = new vh(0L, var10);
          f.field_e.field_tb = 2;
          f.field_e.field_F = qi.a(3815994, 2039583, false, 30, -123, false);
          sd.field_Q = new vh(0L, var10);
          sd.field_Q.field_tb = 2;
          sd.field_Q.field_F = qi.a(3815994, 2039583, true, 30, -107, false);
          uo.field_Lb = new vh(0L, (vh) null);
          uo.field_Lb.field_cb = 1;
          uo.field_Lb.field_I = (lr) ((Object) ae.field_a);
          uo.field_Lb.field_N = 13421772;
          uo.field_Lb.field_M = ad.field_x;
          ei.field_A = new vh(0L, uo.field_Lb);
          ei.field_A.field_P = 16777215;
          ei.field_A.field_K = 16777215;
          ei.field_A.field_N = 16764006;
          ei.field_A.field_Bb = 16777215;
          ei.field_A.field_zb = 8421504;
          var15 = new vh(0L, ei.field_A);
          var15.field_M = ad.field_x;
          var15.field_N = 16777215;
          var15.field_I = (lr) ((Object) var7);
          pa.field_M = new vh(0L, uo.field_Lb);
          pa.field_M.field_F = qi.a(2236962, 2236962, false, 16, -125, false);
          pa.field_M.field_tb = 2;
          kq.field_a = new vh(0L, uo.field_Lb);
          kq.field_a.field_F = qi.a(1513239, 1513239, false, 16, -97, false);
          kq.field_a.field_tb = 2;
          tm.field_d = new vh(0L, pa.field_M);
          tm.field_d.a((byte) -87, ei.field_A);
          ge.field_s = new vh(0L, kq.field_a);
          ge.field_s.a((byte) -87, ei.field_A);
          var16 = aj.a(0, "lobby", param4, "button_mouseover");
          ko.field_c = new vq(wa.field_qb, var12, uo.field_Lb, ei.field_A, 3, 2, ja.field_b, 3, ad.field_x);
          ug.field_x = new vh(0L, ei.field_A);
          ug.field_x.field_O = 1;
          ug.field_x.field_Z = 1;
          ug.field_x.field_Gb = var16;
          ug.field_x.field_H = 1;
          ug.field_x.field_F = var13;
          ug.field_x.field_Q = 1;
          ug.field_x.field_X = aj.a(0, "lobby", param4, "button_mouseheld");
          ug.field_x.field_Kb = aj.a(0, "lobby", param4, "button_active");
          ug.field_x.field_Y = aj.a(0, "lobby", param4, "button_disabled");
          ug.field_x.field_Fb = 1;
          bb.field_c = new vh(0L, ei.field_A);
          bb.field_c.field_Fb = 1;
          bb.field_c.field_F = up.a(aj.a(0, "lobby", param4, "tab_inactive"), 12519);
          bb.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "tab_mouseover"), 12519);
          bb.field_c.field_Kb = var14;
          ea.field_u = new vh(0L, (vh) null);
          ea.field_u.field_F = rp.a(32450, 3, -1, 206, 1856141, 1127256);
          ri.field_P = new vh(0L, (vh) null);
          ri.field_P.field_F = rp.a(32450, 3, -1, 290, 11579568, 6052956);
          mg.field_c = new vh(0L, var15);
          mg.field_c.field_O = 1;
          mg.field_c.field_Fb = 1;
          mg.field_c.field_H = 1;
          mg.field_c.field_Q = 1;
          mg.field_c.field_Z = 1;
          rp.field_d = new vh(0L, mg.field_c);
          j.field_a = new vh(0L, ei.field_A);
          j.field_a.field_Q = 1;
          j.field_a.field_Fb = 1;
          j.field_a.field_H = 1;
          j.field_a.field_Z = 1;
          j.field_a.field_O = 1;
          p.field_i = new vh(0L, j.field_a);
          lh.field_g = new vh(0L, j.field_a);
          tg.field_d = new vh(0L, mg.field_c);
          i.field_l = new vh(0L, j.field_a);
          cq.field_d = new vh(0L, j.field_a);
          ef.field_c = new vh(0L, j.field_a);
          j.field_a.field_F = up.a(aj.a(0, "lobby", param4, "smallbutton"), 12519);
          j.field_a.field_Gb = up.a(aj.a(0, "lobby", param4, "smallbutton_mouseover"), 12519);
          dupTemp$0 = up.a(aj.a(0, "lobby", param4, "smallbutton_active"), 12519);
          j.field_a.field_Kb = dupTemp$0;
          j.field_a.field_X = dupTemp$0;
          j.field_a.field_Y = up.a(aj.a(0, "lobby", param4, "smallbutton_disabled"), 12519);
          rp.field_d.field_F = up.a(aj.a(0, "lobby", param4, "mediumbutton"), 12519);
          rp.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "mediumbutton_mouseover"), 12519);
          rp.field_d.field_X = up.a(aj.a(0, "lobby", param4, "mediumbutton_mouseheld"), 12519);
          mg.field_c.field_F = up.a(aj.a(0, "lobby", param4, "bigbutton"), 12519);
          mg.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "bigbutton_mouseover"), 12519);
          mg.field_c.field_X = up.a(aj.a(0, "lobby", param4, "bigbutton_mouseheld"), 12519);
          mg.field_c.field_Y = up.a(aj.a(0, "lobby", param4, "bigbutton_disabled"), 12519);
          p.field_i.field_F = up.a(aj.a(0, "lobby", param4, "greenbutton"), 12519);
          p.field_i.field_Gb = up.a(aj.a(0, "lobby", param4, "greenbutton_mouseover"), 12519);
          p.field_i.field_X = up.a(aj.a(0, "lobby", param4, "greenbutton_mouseheld"), 12519);
          lh.field_g.field_F = up.a(aj.a(0, "lobby", param4, "redbutton"), 12519);
          lh.field_g.field_Gb = up.a(aj.a(0, "lobby", param4, "redbutton_mouseover"), 12519);
          lh.field_g.field_X = up.a(aj.a(0, "lobby", param4, "redbutton_mouseheld"), 12519);
          tg.field_d.field_F = up.a(aj.a(0, "lobby", param4, "backbutton"), 12519);
          tg.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "backbutton_mouseover"), 12519);
          tg.field_d.field_X = up.a(aj.a(0, "lobby", param4, "backbutton_mouseheld"), 12519);
          tg.field_d.field_Y = up.a(aj.a(0, "lobby", param4, "backbutton_disabled"), 12519);
          ef.field_c.field_F = up.a(aj.a(0, "lobby", param4, "gameoptionbutton"), 12519);
          ef.field_c.field_Gb = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_mouseover"), 12519);
          if (param1) {
            return;
          }
          dupTemp$1 = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_active"), 12519);
          ef.field_c.field_Kb = dupTemp$1;
          ef.field_c.field_X = dupTemp$1;
          ef.field_c.field_Y = up.a(aj.a(0, "lobby", param4, "gameoptionbutton_disabled"), 12519);
          i.field_l.field_F = up.a(aj.a(0, "lobby", param4, "chatbutton"), 12519);
          i.field_l.field_Gb = up.a(aj.a(0, "lobby", param4, "chatbutton_mouseover"), 12519);
          dupTemp$2 = up.a(aj.a(0, "lobby", param4, "chatbutton_active"), 12519);
          i.field_l.field_Kb = dupTemp$2;
          i.field_l.field_X = dupTemp$2;
          cq.field_d.field_F = up.a(aj.a(0, "lobby", param4, "chatfilterbutton"), 12519);
          cq.field_d.field_Gb = up.a(aj.a(0, "lobby", param4, "chatfilterbutton_mouseover"), 12519);
          dupTemp$3 = up.a(aj.a(0, "lobby", param4, "chatfilterbutton_active"), 12519);
          cq.field_d.field_Kb = dupTemp$3;
          cq.field_d.field_X = dupTemp$3;
          var17 = aj.a(0, "lobby", param4, "checkbox");
          e.field_e = new wg(0L, var17[1], var17[0], 1, ei.field_A, (String) null);
          n.field_R = new vh(0L, (vh) null);
          n.field_R.field_F = hb.a(-32344, pf.a("lobby", (byte) 121, "slideregion", param4));
          n.field_R.field_Gb = hb.a(-32344, pf.a("lobby", (byte) 74, "slideregion_mouseover", param4));
          n.field_R.field_X = hb.a(-32344, pf.a("lobby", (byte) 47, "slideregion_mouseheld", param4));
          n.field_R.field_Y = hb.a(-32344, pf.a("lobby", (byte) 95, "slideregion_disabled", param4));
          gr.field_y = new vh(0L, (vh) null);
          gr.field_y.field_F = up.a(aj.a(0, "lobby", param4, "dragbar"), 12519);
          gr.field_y.field_Gb = up.a(aj.a(0, "lobby", param4, "dragbar_mouseover"), 12519);
          gr.field_y.field_X = up.a(aj.a(0, "lobby", param4, "dragbar_mouseheld"), 12519);
          gr.field_y.field_Y = up.a(aj.a(0, "lobby", param4, "dragbar_disabled"), 12519);
          uc.field_a = new vh(0L, (vh) null);
          uc.field_a.field_hb = pf.a("lobby", (byte) 86, "upbutton", param4);
          uc.field_a.field_xb = pf.a("lobby", (byte) 111, "upbutton_mouseover", param4);
          uc.field_a.field_G = pf.a("lobby", (byte) 64, "upbutton_mouseheld", param4);
          uc.field_a.field_ab = pf.a("lobby", (byte) 97, "upbutton_disabled", param4);
          kg.field_r = new vh(0L, (vh) null);
          kg.field_r.field_hb = pf.a("lobby", (byte) 73, "downbutton", param4);
          kg.field_r.field_xb = pf.a("lobby", (byte) 88, "downbutton_mouseover", param4);
          kg.field_r.field_G = pf.a("lobby", (byte) 105, "downbutton_mouseheld", param4);
          kg.field_r.field_ab = pf.a("lobby", (byte) 94, "downbutton_disabled", param4);
          iq.field_f = new db(0L, uc.field_a, kg.field_r, n.field_R, gr.field_y);
          em.field_J = new ao(0L, (vh) null, ub.field_n, iq.field_f, j.field_a, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("ap.G(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    private final void a(int param0, ge param1, byte param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hj var7 = null;
        int var9 = 0;
        var9 = Pool.field_O;
        try {
          if (param2 >= -16) {
            field_F = (String) null;
          }
          if (param0 != 1) {
            if (param0 == 2) {
              var4_int = param1.g(-105);
              this.field_C = new int[var4_int];
              for (var5 = 0; var4_int > var5; var5++) {
                this.field_C[var5] = param1.d(-1034);
              }
            } else if (param0 == 3) {
              var4_int = param1.g(-107);
              this.field_x = new int[var4_int][];
              this.field_z = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                var6 = param1.d(-1034);
                var7 = tm.a(var6, -124);
                if (var7 != null) {
                  this.field_z[var5] = var6;
                  array$0 = new int[var7.field_b];
                  this.field_x[var5] = array$0;
                  for (var8 = 0; var8 < var7.field_b; var8++) {
                    this.field_x[var5][var8] = param1.d(-1034);
                  }
                }
              }
            } else {
              if (4 != param0) {
                return;
              }
            }
          } else {
            this.field_A = jc.a(30634, param1.j(-25), '<');
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ap.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_B = new int[8192];
        field_F = "Retry";
        field_G = 320;
        field_w = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    }
}
