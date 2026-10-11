/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    byte[] field_z;
    int[] field_i;
    short[] field_K;
    private boolean field_d;
    short[] field_E;
    int[] field_I;
    short[] field_M;
    short[] field_c;
    int[] field_q;
    short[] field_p;
    short[] field_x;
    int[] field_f;
    short[] field_J;
    short[] field_H;
    int[] field_O;
    byte field_m;
    int field_C;
    int[] field_t;
    int field_l;
    int field_G;
    short[] field_a;
    int field_D;
    short[] field_g;
    short field_n;
    int field_j;
    short[] field_L;
    short field_o;
    short[] field_A;
    short[] field_y;
    static th field_u;
    static ja[] field_N;
    int field_r;
    short[] field_b;
    short[] field_F;
    int[] field_e;
    int[] field_h;
    short[] field_v;
    short[] field_k;
    short[] field_s;
    short field_B;
    int[] field_w;

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          sj.a(up.field_d, -891231071, param0, true, lj.field_n, 0, ab.field_j);
          for (var2_int = 0; var2_int < lj.field_n; var2_int++) {
            la.field_c[var2_int + param0] = var2_int;
          }
          if (param1 > -27) {
            field_u = (th) null;
          }
          sj.a(ba.field_m, -891231071, param0 + param0, false, param0 + lj.field_n, param0, mj.field_Ub);
          if (param0 < lj.field_n) {
            lj.field_n = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "md.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_N = null;
        if (param0 != 119) {
          return;
        }
        field_u = null;
    }

    final void a(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_d) {
          return;
        }
        this.field_d = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        if (param0 >= -20) {
          md.a(-5, 114);
        }
        var7 = -32768;
        for (var8 = 0; this.field_n > var8; var8++) {
          var9 = this.field_k[var8];
          var10 = this.field_E[var8];
          if (var5 < var9) {
            var5 = var9;
          }
          if (var9 < var2) {
            var2 = var9;
          }
          if (var10 > var6) {
            var6 = var10;
          }
          var11 = this.field_v[var8];
          if (var3 > var10) {
            var3 = var10;
          }
          if (var11 > var7) {
            var7 = var11;
          }
          if (var4 > var11) {
            var4 = var11;
          }
        }
        this.field_G = var3;
        this.field_D = var5;
        this.field_C = var2;
        this.field_j = var7;
        this.field_l = var6;
        this.field_r = var4;
    }

    final static ml a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        ml var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_3_0 = null;
        ml stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (bh.field_f == null) {
            stackIn_3_0 = null;
            return (ml) (stackIn_3_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = tg.a(var7, false);
          var3 = 24 / ((47 - param0) / 43);
          if (var2 == null) {
            var2 = param1;
          }
          var4 = (ml) (bh.field_f.a((long)var2.hashCode(), -22877));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_Hb);
            var5 = tg.a(var8, false);
            if (var5 == null) {
              var5 = var4.field_Hb;
            }
            if (var5.equals(var2)) {
              stackIn_15_0 = var4;
              return stackIn_15_0;
            }
            var4 = (ml) (bh.field_f.b((byte) 68));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("md.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var6 = 0; var6 < this.field_n; var6++) {
          this.field_k[var6] = (short)(param0 * this.field_k[var6] / param1);
          this.field_E[var6] = (short)(this.field_E[var6] * param2 / param1);
          this.field_v[var6] = (short)(param3 * this.field_v[var6] / param1);
        }
        if (param4 != 2122) {
          this.field_v = (short[]) null;
        }
        this.a(255);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        for (var5 = 0; var5 < this.field_n; var5++) {
          this.field_k[var5] = (short)(this.field_k[var5] + param2);
          this.field_E[var5] = (short)(this.field_E[var5] + param3);
          this.field_v[var5] = (short)(this.field_v[var5] + param0);
        }
        this.a(255);
        if (param1 != 3) {
          this.field_t = (int[]) null;
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -9159) {
            field_N = (ja[]) null;
          }
          stackIn_3_0 = md.a(param0, 10, -31, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("md.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(ml param0, byte param1, ml param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != -49) {
            field_N = (ja[]) null;
          }
          var3_int = param0.field_Mb - param2.field_Mb;
          if (param0.field_Nb != ta.field_ob) {
            if (param0.field_Nb == null) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param2.field_Nb == ta.field_ob) {
            var3_int += 200;
          } else {
            if (null == param2.field_Nb) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("md.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(String[] args, int param1, int[] param2, ul param3, String[] param4, ja[][] param5, ja[][] param6, String[][] param7, byte[] param8, int param9, boolean param10, byte[] param11, String[] param12, int param13, String[][] param14) {
        mo[] array$0 = null;
        mo[] array$1 = null;
        mo[] array$2 = null;
        int var19 = 0;
        cj stackIn_5_0;
        cj stackIn_5_1;
        long stackIn_5_2;
        cj stackIn_5_3;
        cj stackIn_6_0 = null;
        cj stackIn_6_1 = null;
        String stackIn_6_4 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        cj var16 = null;
        int var17_int = 0;
        cj var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        Object var20 = null;
        int var21 = 0;
        CharSequence var22 = null;
        cj var24 = null;
        cj var25 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        var21 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          cf.field_f = args;
          qp.field_s = param4;
          ZombieDawnMulti.field_L = param5;
          qo.field_r = param2;
          um.field_b = param12;
          i.field_e = param1;
          ul.field_m = param14;
          ch.field_c = param11;
          ng.field_b = param8;
          um.field_g = param6;
          kp.field_n = param7;
          r.field_f = param13;
          qp.field_u = pb.a("lobby", param3, -256, "gameprivacy");
          ke.field_i = pb.a("lobby", param3, -256, "ratedgame");
          na.field_G = pb.a("lobby", param3, -256, "opentome");
          we.field_j = pb.a("lobby", param3, -256, "allowspectators");
          t.field_c = new String[5];
          t.field_c[2] = al.field_W;
          t.field_c[3] = dm.field_Xb;
          t.field_c[4] = vo.field_s;
          t.field_c[0] = vb.field_g;
          t.field_c[1] = ka.field_m;
          pd.field_b = new cj(0L, (cj) null);
          dm.field_ac = new cj(0L, vd.field_a, qd.field_r);
          mo.field_Hb = new cj(0L, pn.field_g, cg.field_j);
          hf.field_e = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
          pd.field_b.a((byte) 50, dm.field_ac);
          if (tb.field_u) {
            pd.field_b.a((byte) 50, mo.field_Hb);
          }
          pd.field_b.a((byte) 50, hf.field_e);
          hf.field_e.field_Jb.b((byte) -32, vo.field_m);
          hf.field_e.field_Jb.field_lb = 1;
          var24 = hf.field_e.field_Jb;
          var25 = var24;
          var25.field_R = 1;
          ql.field_b = new cj(0L, vo.field_m);
          ql.field_b.field_R = 1;
          kj.field_u = new cj(0L, ai.field_c, e.field_b.toUpperCase());
          ro.field_O = new cj(0L, ed.field_d, uo.field_j.toUpperCase());
          ml.field_Lb = new cj(0L, cg.field_f);
          k.field_g = new cj(0L, vd.field_a, vh.field_Nb);
          ud.field_M = new cj(0L, al.field_fb, kb.field_p);
          tk.field_l = new cj(0L, al.field_fb, ck.field_b);
          sc.field_d = new cj(0L, al.field_fb, jl.field_t);
          da.field_h = new cj(0L, al.field_fb, op.field_k);
          bp.field_w = new cj(0L, pn.field_g, fd.field_N);
          ek.field_H = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
          ia.field_t = new cj(0L, he.field_i, sn.field_Gb.toUpperCase());
          ia.field_t.field_Z = tb.field_u;
          stackIn_5_0 = null;
          stackIn_5_1 = null;
          stackIn_5_2 = 0L;
          stackIn_5_3 = he.field_i;
          if (!tb.field_u) {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = cn.field_C;
          } else {
            stackIn_6_0 = null;
            stackIn_6_1 = null;
            stackIn_6_4 = ff.field_t;
          }
          pl.field_L = new cj(stackIn_5_2, stackIn_5_3, ((String) (Object) stackIn_6_4).toUpperCase());
          cm.field_a = new cj(0L, (cj) null);
          cm.field_a.a((byte) 50, ro.field_O);
          if (!param10) {
            var22 = (CharSequence) null;
            md.a((CharSequence) null, -24);
          }
          cm.field_a.a((byte) 50, ml.field_Lb);
          ml.field_Lb.a((byte) 50, k.field_g);
          ml.field_Lb.a((byte) 50, ud.field_M);
          ml.field_Lb.a((byte) 50, tk.field_l);
          if (tb.field_u) {
            ml.field_Lb.a((byte) 50, sc.field_d);
          }
          ml.field_Lb.a((byte) 50, da.field_h);
          ml.field_Lb.a((byte) 50, bp.field_w);
          ml.field_Lb.a((byte) 50, ek.field_H);
          if (tb.field_u) {
            cm.field_a.a((byte) 50, ia.field_t);
          }
          cm.field_a.a((byte) 50, pl.field_L);
          sc.field_j = new cj(0L, vo.field_m);
          sc.field_j.field_lb = 0;
          sc.field_j.field_R = 1;
          kn.field_a = new cj(0L, kb.field_n, ji.field_e.toUpperCase());
          lm.field_gb = new cj(0L, wa.field_a);
          lm.field_gb.a((byte) 50, sc.field_j);
          lm.field_gb.a((byte) 50, kn.field_a);
          sk.field_i = new cj(0L, nc.field_e);
          sk.field_i.b((byte) -32, vo.field_m);
          var16 = sk.field_i;
          sk.field_i.field_lb = 1;
          var16.field_R = 1;
          ga.field_r = new cj(0L, (cj) null);
          fn.field_h = new cj(0L, vo.field_m);
          fn.field_h.field_R = 1;
          ie.field_jb = new cj(0L, vd.field_a, qd.field_r);
          bf.field_h = new cj(0L, pn.field_g, cg.field_j);
          bf.field_n = new tq(0L, new cj(0L, (cj) null), nc.field_e, td.field_f);
          ga.field_r.a((byte) 50, fn.field_h);
          ga.field_r.a((byte) 50, ie.field_jb);
          if (tb.field_u) {
            ga.field_r.a((byte) 50, bf.field_h);
          }
          ga.field_r.a((byte) 50, bf.field_n);
          jp.field_b = new cj(0L, ai.field_c, pi.field_b.toUpperCase());
          gg.field_m = new cj(0L, ed.field_d);
          dl.field_a = new cj(0L, cg.field_f);
          ik.field_d = new cj(0L, hd.field_x, vb.field_d.toUpperCase());
          mi.field_Ib = new cj[4 + param9];
          ma.field_b = new mo[param9 + 4][];
          mi.field_Ib[0] = new cj(0L, m.field_B, kg.field_f);
          ma.field_b[0] = new mo[6];
          for (var17_int = 0; 5 > var17_int; var17_int++) {
            ma.field_b[0][1 + var17_int] = new mo(0L, uq.field_d, (cj) null, cm.field_b, qp.field_u[var17_int], t.field_c[var17_int]);
          }
          if (qo.field_r.length >= 2) {
            mi.field_Ib[1] = new cj(0L, m.field_B, gi.field_n);
            array$0 = new mo[1 + qo.field_r.length];
            ma.field_b[1] = array$0;
            ma.field_b[1][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
            for (var17_intLifetime1 = 0; var17_intLifetime1 < qo.field_r.length; var17_intLifetime1++) {
              ma.field_b[1][1 + var17_intLifetime1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, Integer.toString(qo.field_r[var17_intLifetime1]));
            }
          }
          mi.field_Ib[2] = new cj(0L, m.field_B, qj.field_j);
          ma.field_b[2] = new mo[]{new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[0], be.field_f), new mo(0L, uq.field_d, (cj) null, cm.field_b, we.field_j[1], wf.field_k)};
          if (r.field_f > 1) {
            mi.field_Ib[3] = new cj(0L, m.field_B, gj.field_d);
            array$1 = new mo[r.field_f + 1];
            ma.field_b[3] = array$1;
            ma.field_b[3][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
            for (var17_intLifetime2 = 0; var17_intLifetime2 < r.field_f; var17_intLifetime2++) {
              ma.field_b[3][1 + var17_intLifetime2] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, um.field_b[var17_intLifetime2]);
            }
          }
          for (var17_intLifetime3 = 0; param9 > var17_intLifetime3; var17_intLifetime3++) {
            mi.field_Ib[4 + var17_intLifetime3] = new cj(0L, m.field_B, cf.field_f[var17_intLifetime3]);
            array$2 = new mo[1 + tq.b(255, (int) ng.field_b[var17_intLifetime3])];
            ma.field_b[var17_intLifetime3 + 4] = array$2;
            ma.field_b[var17_intLifetime3 + 4][0] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) null, hi.field_Mb);
            for (var18 = 0; var18 < (255 & ng.field_b[var17_intLifetime3]); var18++) {
              if (ZombieDawnMulti.field_L != null) {
                if (null == ZombieDawnMulti.field_L[var17_intLifetime3]) {
                  var19_ref = null;
                } else {
                  var19_ref = ZombieDawnMulti.field_L[var17_intLifetime3][var18];
                }
              } else {
                var19_ref = null;
              }
              if (null == ul.field_m) {
                var20 = null;
              } else {
                if (ul.field_m[var17_intLifetime3] == null) {
                  var20 = null;
                } else {
                  var20 = ul.field_m[var17_intLifetime3][var18];
                }
              }
              ma.field_b[var17_intLifetime3 + 4][var18 + 1] = new mo(0L, uq.field_d, (cj) null, cm.field_b, (ja) (var19_ref), (String) (var20));
            }
          }
          for (var17_intLifetime4 = 0; param9 + 4 > var17_intLifetime4; var17_intLifetime4++) {
            if (mi.field_Ib[var17_intLifetime4] != null) {
              mi.field_Ib[var17_intLifetime4].field_J = 11;
            }
            if (null != ma.field_b[var17_intLifetime4]) {
              for (var18Lifetime1 = 0; ma.field_b[var17_intLifetime4].length > var18Lifetime1; var18Lifetime1++) {
                if (null != ma.field_b[var17_intLifetime4][var18Lifetime1] &&
                  ma.field_b[var17_intLifetime4][var18Lifetime1].field_Mb != null) {
                  ma.field_b[var17_intLifetime4][var18Lifetime1].field_Mb.field_J = 11;
                }
              }
            }
          }
          en.field_b = new cj(0L, he.field_i);
          gb.field_a = new cj(0L, he.field_i);
          eb.field_B = new cj(0L, qc.field_u);
          eb.field_B.b((byte) -32, vo.field_m);
          eb.field_B.field_lb = 1;
          var17 = eb.field_B;
          var17.field_R = 1;
          fc.field_a = new cj(0L, (cj) null);
          fc.field_a.a((byte) 50, gg.field_m);
          fc.field_a.a((byte) 50, dl.field_a);
          dl.field_a.a((byte) 50, ik.field_d);
          for (var18Lifetime2 = 0; 4 + param9 > var18Lifetime2; var18Lifetime2++) {
            if ((var18Lifetime2 != 1 ||
              !(qo.field_r.length < 2)) && (var18Lifetime2 != 3 ||
              !(r.field_f <= 1))) {
              dl.field_a.a((byte) 50, mi.field_Ib[var18Lifetime2]);
              for (var19 = 0; ma.field_b[var18Lifetime2].length > var19; var19++) {
                if (null != ma.field_b[var18Lifetime2][var19]) {
                  dl.field_a.a((byte) 50, ma.field_b[var18Lifetime2][var19]);
                }
              }
            }
          }
          fc.field_a.a((byte) 50, en.field_b);
          fc.field_a.a((byte) 50, gb.field_a);
          fc.field_a.a((byte) 50, eb.field_B);
          mq.field_l = new cj(0L, kc.field_c, p.field_c.toUpperCase());
          pg.field_a = new cj(0L, kb.field_n, qq.field_d.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_77_0 = var15;
          stackIn_77_1 = new StringBuilder().append("md.F(");
          if (args == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (param3 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param4 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param5 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param6 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          stackIn_95_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',');
          if (param7 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          stackIn_98_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',');
          if (param8 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_101_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          stackIn_104_1 = ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',');
          if (param12 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        this.field_d = false;
        if (param0 != 255) {
          md.b((byte) 18);
        }
    }

    final static int a(CharSequence param0, int param1, int param2, boolean param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            if (param2 >= -12) {
              md.a((String[]) null, -25, (int[]) null, (ul) null, (String[]) null, (ja[][]) null, (ja[][]) null, (String[][]) null, (byte[]) null, -121, true, (byte[]) null, (String[]) null, 73, (String[][]) null);
            }
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param3))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  122 >= var9) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param1 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param1 * var6;
                if (var6 != var10 / param1) {
                  throw new NumberFormatException();
                }
                var5 = 1;
                var6 = var10;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("md.J(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    md() {
        this.field_d = false;
        this.field_m = (byte) 0;
    }

    static {
        field_u = new th();
    }
}
