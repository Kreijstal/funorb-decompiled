/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements Runnable {
    static ar field_m;
    private ak field_e;
    static int field_b;
    static String field_n;
    static int field_a;
    static String field_i;
    static int field_l;
    static String field_k;
    static int field_g;
    private Thread field_h;
    static int field_c;
    int field_d;
    private boolean field_j;
    static int field_f;

    private final void a(nq param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_e;
          synchronized (var3) {
            this.field_e.a(false, param0);
            this.field_d = this.field_d + 1;
            this.field_e.notifyAll();
          }
          if (param1 != 0) {
            t.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("t.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          r var2 = (r) null;
          t.a((fp) null, 44, 108, (r) null);
        }
        field_n = null;
        field_m = null;
        field_i = null;
        field_k = null;
    }

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          int var5 = 0;
          nq var7 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2 = null;
          Exception var2_ref = null;
          String var6 = null;
          var5 = Vertigo2.field_L ? 1 : 0;
          while (!this.field_j) {
            var2 = this.field_e;
            synchronized (var2) {
              var7 = (nq) (this.field_e.a(-112));
              if (var7 != null) {
                this.field_d = this.field_d - 1;
                decompiledRegionSelector0 = 1;
              } else {
                try {
                  this.field_e.wait();
                } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                }
                decompiledRegionSelector0 = 0;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              continue;
            }
            try {
              if (var7.field_B == 2) {
                var7.field_F.a(var7.field_L.length, (int)var7.field_n, var7.field_L, (byte) -84);
                var7.field_z = false;
              } else {
                if (3 == var7.field_B) {
                  var7.field_L = var7.field_F.a((int)var7.field_n, 27176);
                  var7.field_z = false;
                } else {
                  var7.field_z = false;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              ke.a((Throwable) ((Object) var2_ref), (String) null, 0);
              var7.field_z = false;
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        try {
          this.field_j = true;
          synchronized (this.field_e) {
            this.field_e.notifyAll();
          }
          if (param0 > -8) {
            r var4 = (r) null;
            t.a((fp) null, 6, 3, (r) null);
          }
          try {
            this.field_h.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        int var1;
        r var2;
        if (sp.field_V &&
          vj.field_h) {
          return;
        }
        if (null == hj.field_e) {
          hj.field_e = hm.a(4, true);
        }
        if (null == bs.field_Xb) {
          bs.field_Xb = ol.a(106, 5, 0, 1);
        }
        if (hj.field_e != null &&
          hj.field_e.field_o) {
          jq.field_e = jq.field_e & ~hj.field_e.field_p;
          ml.field_z = ml.field_z | hj.field_e.field_p;
          sp.field_V = true;
          hj.field_e = null;
        }
        if (bs.field_Xb != null &&
          bs.field_Xb.field_p) {
          var1 = -1 + bs.field_Xb.field_o[0];
          vj.field_h = true;
          bs.field_Xb = null;
          if (field_l < var1) {
            field_l = var1;
          }
        }
        if (param0 != 44) {
          var2 = (r) null;
          t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
        }
        if (sp.field_V &&
          vj.field_h) {
          le.a(468713154);
          jn.a(param0 ^ 41);
          if (lc.field_b == 9 &&
            jq.field_e == 0) {
            lc.field_b = 5;
            gj.a((byte) -123, false, am.field_n, 5);
          }
        }
    }

    final static void a(fp param0, int param1, int param2, r param3) {
        try {
          sq.field_e = param2 * el.b(true) / 1000;
          hi.a(param3, 56);
          jl.a(param3, (byte) -85);
          ao.a(param1 - 1513236, param3);
          uc.a((byte) 73);
          bs.a((byte) -12);
          if (param1 != 1513239) {
            field_f = 65;
          }
          hm.field_F = -sq.field_e + 0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "t.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 < 26) {
          r var6 = (r) null;
          t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
        }
        hq.field_r = param2;
        jm.field_G = param3;
        ml.field_v = param0;
        cd.field_a = param1;
    }

    final nq a(boolean param0, qh param1, int param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nq var6 = null;
        int var8 = 0;
        nq stackIn_8_0 = null;
        nq stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        nq stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = new nq();
          var4.field_B = 1;
          var5 = this.field_e;
          synchronized (var5) {
            var6 = (nq) (this.field_e.b((byte) -50));
            while (var6 != null) {
              if (~var6.field_n == ~(long)param2 &&
                var6.field_F == param1 &&
                2 == var6.field_B) {
                var4.field_L = var6.field_L;
                var4.field_z = false;
                stackIn_8_0 = var4;
                return stackIn_8_0;
              }
              var6 = (nq) (this.field_e.a(true));
            }
          }
          var4.field_L = param1.a(param2, 27176);
          stackIn_16_0 = var4;
          stackIn_17_1 = (param0);
          stackIn_16_0.field_u = stackIn_17_1;
          var4.field_z = false;
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("t.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final nq a(qh param0, int param1, byte param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nq stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -57 % ((3 - param2) / 35);
          var4 = new nq();
          var4.field_n = (long)param1;
          var4.field_u = false;
          var4.field_B = 3;
          var4.field_F = param0;
          this.a(var4, 0);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("t.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(u[] param0, int[] param1, r param2, r param3, boolean param4) {
        er[] dupTemp$0 = null;
        er[] dupTemp$1 = null;
        er[] dupTemp$2 = null;
        er[] dupTemp$3 = null;
        u[] var5 = null;
        u[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        u[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        cr stackIn_22_0;
        r stackIn_22_1;
        String stackIn_22_2;
        String stackIn_22_3;
        boolean stackIn_23_4 = false;
        cr stackIn_25_0;
        r stackIn_25_1;
        String stackIn_25_2;
        String stackIn_25_3;
        boolean stackIn_26_4 = false;
        cr stackIn_28_0;
        r stackIn_28_1;
        String stackIn_28_2;
        String stackIn_28_3;
        boolean stackIn_29_4 = false;
        cr stackIn_31_0;
        r stackIn_31_1;
        String stackIn_31_2;
        String stackIn_31_3;
        boolean stackIn_32_4 = false;
        cr stackIn_34_0;
        r stackIn_34_1;
        String stackIn_34_2;
        String stackIn_34_3;
        boolean stackIn_35_4 = false;
        cr stackIn_37_0;
        r stackIn_37_1;
        String stackIn_37_2;
        String stackIn_37_3;
        boolean stackIn_38_4 = false;
        cr stackIn_40_0;
        r stackIn_40_1;
        String stackIn_40_2;
        String stackIn_40_3;
        boolean stackIn_41_4 = false;
        cr stackIn_43_0;
        r stackIn_43_1;
        String stackIn_43_2;
        String stackIn_43_3;
        boolean stackIn_44_4 = false;
        cr stackIn_46_0;
        r stackIn_46_1;
        String stackIn_46_2;
        String stackIn_46_3;
        boolean stackIn_47_4 = false;
        cr stackIn_49_0;
        r stackIn_49_1;
        String stackIn_49_2;
        String stackIn_49_3;
        boolean stackIn_50_4 = false;
        cr stackIn_52_0;
        r stackIn_52_1;
        String stackIn_52_2;
        String stackIn_52_3;
        boolean stackIn_53_4 = false;
        cr stackIn_55_0;
        r stackIn_55_1;
        String stackIn_55_2;
        String stackIn_55_3;
        boolean stackIn_56_4 = false;
        r stackIn_58_0 = null;
        String stackIn_58_1 = null;
        String stackIn_58_2 = null;
        boolean stackIn_59_3 = false;
        cr stackIn_61_0;
        r stackIn_61_1;
        String stackIn_61_2;
        String stackIn_61_3;
        boolean stackIn_62_4;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        co var7 = null;
        cr var8 = null;
        cr var9 = null;
        cr var10 = null;
        cr var11 = null;
        er[] var12 = null;
        er[] var13 = null;
        er[] var14 = null;
        cr var15 = null;
        er[] var16 = null;
        er[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = Vertigo2.field_L ? 1 : 0;
        try {
          var20 = oh.a((byte) -39, "crowns", "lobby", param3);
          var5 = var20;
          eh.field_e = var20.length;
          if (param0 != null) {
            var6 = new u[param0.length + eh.field_e];
            for (var7_int = 0; eh.field_e > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; var7_intLifetime3 < param0.length; var7_intLifetime3++) {
              var6[var7_intLifetime3 + eh.field_e] = param0[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; var7_intLifetime1 < eh.field_e; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param0 != null) {
            if (param1 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param0.length; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + eh.field_e] = param1[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param0.length; var7_intLifetime2++) {
                var6_array[eh.field_e + var7_intLifetime2] = param0[var7_intLifetime2].field_h;
              }
            }
          }
          nl.field_k = 2;
          r.field_j = 2;
          r.field_f = 15;
          ia.field_G = 4;
          hc.field_b = 11;
          var7 = w.a(param2, param3, "largefont", "lobby", 121);
          li.field_e = w.a(param2, param3, "generalfont", "lobby", 104);
          kb.field_c = w.a(param2, param3, "chatfont", "lobby", 121);
          var7.a(var5, var24);
          li.field_e.a(var5, var24);
          kb.field_c.a(var5, var24);
          var8 = new cr(0L, (cr) null);
          var8.field_z = (cc) ((Object) var7);
          var8.field_qb = r.field_f;
          var8.field_A = 16777215;
          var9 = var8;
          var8.field_ab = 1;
          var9.field_O = 1;
          var10 = new cr(0L, (cr) null);
          var10.field_z = (cc) ((Object) li.field_e);
          var10.field_qb = r.field_f;
          var10.field_A = 16777215;
          var10.field_ab = 1;
          var11 = var10;
          var11.field_O = 1;
          j.field_q = new cr(0L, var8);
          j.field_q.field_Bb = hq.a(gk.a(param3, "lobby", "heading", true), 202);
          rq.field_t = new cr(0L, (cr) null);
          rq.field_t.field_Bb = ml.a((byte) -13, 8421504, false, 4210752, 120, param4);
          lk.field_a = new cr(0L, (cr) null);
          lk.field_a.field_Bb = vl.a(114, 3, 0, 1, 6316128, 6316128);
          vf.field_B = new cr(0L, (cr) null);
          vf.field_B.field_Bb = hq.a(gk.a(param3, "lobby", "popup", true), 202);
          var12 = hq.a(gk.a(param3, "lobby", "popup_mouseover", true), 202);
          var13 = gk.a(param3, "lobby", "button", true);
          var14 = hq.a(gk.a(param3, "lobby", "tab_active", true), 202);
          ji.field_s = new cr(0L, var8);
          ji.field_s.field_Bb = var14;
          eh.field_a = new cr(0L, (cr) null);
          eh.field_a.field_Db = tn.a("closebutton", param3, -82, "lobby");
          eh.field_a.field_W = tn.a("closebutton_mouseover", param3, -90, "lobby");
          gn.field_f = new cr(0L, var8);
          gn.field_f.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 40, true);
          db.field_t = new cr(0L, var10);
          db.field_t.field_R = 2;
          db.field_t.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 30, false);
          kl.field_Ib = new cr(0L, var10);
          kl.field_Ib.field_R = 2;
          kl.field_Ib.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, false);
          sa.field_a = new cr(0L, var10);
          sa.field_a.field_R = 2;
          sa.field_a.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, true);
          ee.field_b = new cr(0L, (cr) null);
          ee.field_b.field_qb = r.field_f;
          ee.field_b.field_ab = 1;
          ee.field_b.field_A = 13421772;
          ee.field_b.field_z = (cc) ((Object) li.field_e);
          ja.field_e = new cr(0L, ee.field_b);
          ja.field_e.field_H = 16777215;
          ja.field_e.field_B = 16777215;
          ja.field_e.field_A = 16764006;
          ja.field_e.field_D = 8421504;
          ja.field_e.field_K = 16777215;
          var15 = new cr(0L, ja.field_e);
          var15.field_z = (cc) ((Object) var7);
          var15.field_qb = r.field_f;
          var15.field_A = 16777215;
          pn.field_N = new cr(0L, ee.field_b);
          pn.field_N.field_Bb = ml.a((byte) -13, 2236962, false, 2236962, 16, false);
          pn.field_N.field_R = 2;
          fm.field_e = new cr(0L, ee.field_b);
          fm.field_e.field_Bb = ml.a((byte) -13, 1513239, false, 1513239, 16, false);
          fm.field_e.field_R = 2;
          tm.field_b = new cr(0L, pn.field_N);
          tm.field_b.a(ja.field_e, -46);
          el.field_b = new cr(0L, fm.field_e);
          el.field_b.a(ja.field_e, -104);
          var16 = gk.a(param3, "lobby", "button_mouseover", true);
          ar.field_c = new kq(vf.field_B, var12, ee.field_b, ja.field_e, 3, 2, r.field_j, 3, r.field_f);
          bq.field_B = new cr(0L, ja.field_e);
          bq.field_B.field_bb = 1;
          bq.field_B.field_Y = 1;
          bq.field_B.field_Cb = 1;
          bq.field_B.field_Q = var16;
          bq.field_B.field_Bb = var13;
          bq.field_B.field_Gb = 1;
          bq.field_B.field_cb = gk.a(param3, "lobby", "button_mouseheld", true);
          stackIn_22_0 = bq.field_B;
          stackIn_22_1 = (r) (param3);
          stackIn_22_2 = "lobby";
          stackIn_22_3 = "button_active";
          stackIn_23_4 = !(param4);
          stackIn_22_0.field_T = gk.a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_23_4);
          stackIn_25_0 = bq.field_B;
          stackIn_25_1 = (r) (param3);
          stackIn_25_2 = "lobby";
          stackIn_25_3 = "button_disabled";
          stackIn_26_4 = !(param4);
          stackIn_25_0.field_gb = gk.a(stackIn_25_1, stackIn_25_2, stackIn_25_3, stackIn_26_4);
          bq.field_B.field_O = 1;
          qr.field_m = new cr(0L, ja.field_e);
          qr.field_m.field_O = 1;
          stackIn_28_0 = qr.field_m;
          stackIn_28_1 = (r) (param3);
          stackIn_28_2 = "lobby";
          stackIn_28_3 = "tab_inactive";
          stackIn_29_4 = !(param4);
          stackIn_28_0.field_Bb = hq.a(gk.a(stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_29_4), 202);
          stackIn_31_0 = qr.field_m;
          stackIn_31_1 = (r) (param3);
          stackIn_31_2 = "lobby";
          stackIn_31_3 = "tab_mouseover";
          stackIn_32_4 = !(param4);
          stackIn_31_0.field_Q = hq.a(gk.a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_32_4), 202);
          qr.field_m.field_T = var14;
          ab.field_d = new cr(0L, (cr) null);
          ab.field_d.field_Bb = vl.a(206, 3, 0, -1, 1856141, 1127256);
          dj.field_b = new cr(0L, (cr) null);
          dj.field_b.field_Bb = vl.a(290, 3, 0, -1, 11579568, 6052956);
          fb.field_u = new cr(0L, var15);
          fb.field_u.field_bb = 1;
          fb.field_u.field_Gb = 1;
          fb.field_u.field_O = 1;
          fb.field_u.field_Y = 1;
          fb.field_u.field_Cb = 1;
          ub.field_t = new cr(0L, fb.field_u);
          uk.field_e = new cr(0L, ja.field_e);
          uk.field_e.field_Cb = 1;
          uk.field_e.field_O = 1;
          uk.field_e.field_Y = 1;
          uk.field_e.field_Gb = 1;
          uk.field_e.field_bb = 1;
          sc.field_c = new cr(0L, uk.field_e);
          gh.field_b = new cr(0L, uk.field_e);
          vc.field_b = new cr(0L, fb.field_u);
          ip.field_a = new cr(0L, uk.field_e);
          ca.field_f = new cr(0L, uk.field_e);
          tr.field_l = new cr(0L, uk.field_e);
          uk.field_e.field_Bb = hq.a(gk.a(param3, "lobby", "smallbutton", true), 202);
          uk.field_e.field_Q = hq.a(gk.a(param3, "lobby", "smallbutton_mouseover", true), 202);
          dupTemp$0 = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
          uk.field_e.field_T = dupTemp$0;
          uk.field_e.field_cb = dupTemp$0;
          stackIn_34_0 = uk.field_e;
          stackIn_34_1 = (r) (param3);
          stackIn_34_2 = "lobby";
          stackIn_34_3 = "smallbutton_disabled";
          stackIn_35_4 = !(param4);
          stackIn_34_0.field_gb = hq.a(gk.a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_35_4), 202);
          ub.field_t.field_Bb = hq.a(gk.a(param3, "lobby", "mediumbutton", true), 202);
          ub.field_t.field_Q = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseover", true), 202);
          ub.field_t.field_cb = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseheld", true), 202);
          fb.field_u.field_Bb = hq.a(gk.a(param3, "lobby", "bigbutton", true), 202);
          fb.field_u.field_Q = hq.a(gk.a(param3, "lobby", "bigbutton_mouseover", true), 202);
          stackIn_37_0 = fb.field_u;
          stackIn_37_1 = (r) (param3);
          stackIn_37_2 = "lobby";
          stackIn_37_3 = "bigbutton_mouseheld";
          stackIn_38_4 = !(param4);
          stackIn_37_0.field_cb = hq.a(gk.a(stackIn_37_1, stackIn_37_2, stackIn_37_3, stackIn_38_4), 202);
          fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled", true), 202);
          sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton", true), 202);
          stackIn_40_0 = sc.field_c;
          stackIn_40_1 = (r) (param3);
          stackIn_40_2 = "lobby";
          stackIn_40_3 = "greenbutton_mouseover";
          stackIn_41_4 = !(param4);
          stackIn_40_0.field_Q = hq.a(gk.a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4), 202);
          stackIn_43_0 = sc.field_c;
          stackIn_43_1 = (r) (param3);
          stackIn_43_2 = "lobby";
          stackIn_43_3 = "greenbutton_mouseheld";
          stackIn_44_4 = !(param4);
          stackIn_43_0.field_cb = hq.a(gk.a(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_44_4), 202);
          gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton", true), 202);
          gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover", true), 202);
          stackIn_46_0 = gh.field_b;
          stackIn_46_1 = (r) (param3);
          stackIn_46_2 = "lobby";
          stackIn_46_3 = "redbutton_mouseheld";
          stackIn_47_4 = !(param4);
          stackIn_46_0.field_cb = hq.a(gk.a(stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_47_4), 202);
          vc.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "backbutton", true), 202);
          vc.field_b.field_Q = hq.a(gk.a(param3, "lobby", "backbutton_mouseover", true), 202);
          vc.field_b.field_cb = hq.a(gk.a(param3, "lobby", "backbutton_mouseheld", true), 202);
          vc.field_b.field_gb = hq.a(gk.a(param3, "lobby", "backbutton_disabled", true), 202);
          tr.field_l.field_Bb = hq.a(gk.a(param3, "lobby", "gameoptionbutton", true), 202);
          stackIn_49_0 = tr.field_l;
          stackIn_49_1 = (r) (param3);
          stackIn_49_2 = "lobby";
          stackIn_49_3 = "gameoptionbutton_mouseover";
          stackIn_50_4 = !(param4);
          stackIn_49_0.field_Q = hq.a(gk.a(stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_50_4), 202);
          dupTemp$1 = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
          tr.field_l.field_T = dupTemp$1;
          tr.field_l.field_cb = dupTemp$1;
          tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled", true), 202);
          ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton", true), 202);
          ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover", true), 202);
          dupTemp$2 = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
          ip.field_a.field_T = dupTemp$2;
          ip.field_a.field_cb = dupTemp$2;
          stackIn_52_0 = ca.field_f;
          stackIn_52_1 = (r) (param3);
          stackIn_52_2 = "lobby";
          stackIn_52_3 = "chatfilterbutton";
          stackIn_53_4 = !(param4);
          stackIn_52_0.field_Bb = hq.a(gk.a(stackIn_52_1, stackIn_52_2, stackIn_52_3, stackIn_53_4), 202);
          stackIn_55_0 = ca.field_f;
          stackIn_55_1 = (r) (param3);
          stackIn_55_2 = "lobby";
          stackIn_55_3 = "chatfilterbutton_mouseover";
          stackIn_56_4 = !(param4);
          stackIn_55_0.field_Q = hq.a(gk.a(stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_56_4), 202);
          dupTemp$3 = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
          ca.field_f.field_T = dupTemp$3;
          ca.field_f.field_cb = dupTemp$3;
          stackIn_58_0 = (r) (param3);
          stackIn_58_1 = "lobby";
          stackIn_58_2 = "checkbox";
          stackIn_59_3 = !(param4);
          var17 = gk.a(stackIn_58_0, stackIn_58_1, stackIn_58_2, stackIn_59_3);
          fr.field_a = new sm(0L, var17[1], var17[0], 1, ja.field_e, (String) null);
          tb.field_a = new cr(0L, (cr) null);
          tb.field_a.field_Bb = rh.a(tn.a("slideregion", param3, -90, "lobby"), -27140);
          tb.field_a.field_Q = rh.a(tn.a("slideregion_mouseover", param3, -95, "lobby"), -27140);
          tb.field_a.field_cb = rh.a(tn.a("slideregion_mouseheld", param3, -77, "lobby"), -27140);
          tb.field_a.field_gb = rh.a(tn.a("slideregion_disabled", param3, -89, "lobby"), -27140);
          sj.field_c = new cr(0L, (cr) null);
          sj.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "dragbar", true), 202);
          stackIn_61_0 = sj.field_c;
          stackIn_61_1 = (r) (param3);
          stackIn_61_2 = "lobby";
          stackIn_61_3 = "dragbar_mouseover";
          stackIn_62_4 = !(param4);
          stackIn_61_0.field_Q = hq.a(gk.a(stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_62_4), 202);
          sj.field_c.field_cb = hq.a(gk.a(param3, "lobby", "dragbar_mouseheld", true), 202);
          sj.field_c.field_gb = hq.a(gk.a(param3, "lobby", "dragbar_disabled", true), 202);
          ad.field_e = new cr(0L, (cr) null);
          ad.field_e.field_Db = tn.a("upbutton", param3, -73, "lobby");
          ad.field_e.field_W = tn.a("upbutton_mouseover", param3, -107, "lobby");
          ad.field_e.field_Ab = tn.a("upbutton_mouseheld", param3, -100, "lobby");
          ad.field_e.field_I = tn.a("upbutton_disabled", param3, -80, "lobby");
          lc.field_e = new cr(0L, (cr) null);
          lc.field_e.field_Db = tn.a("downbutton", param3, -101, "lobby");
          lc.field_e.field_W = tn.a("downbutton_mouseover", param3, -77, "lobby");
          lc.field_e.field_Ab = tn.a("downbutton_mouseheld", param3, -114, "lobby");
          lc.field_e.field_I = tn.a("downbutton_disabled", param3, -99, "lobby");
          ol.field_H = new ie(0L, ad.field_e, lc.field_e, tb.field_a, sj.field_c);
          pb.field_b = new dm(0L, (cr) null, ua.field_c, ol.field_H, uk.field_e, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_66_0 = var5_ref;
          stackIn_66_1 = new StringBuilder().append("t.F(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_69_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param3 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param4).append(')').toString());
        }
    }

    final nq a(int param0, int param1, qh param2, byte[] param3) {
        nq var5 = null;
        RuntimeException var5_ref = null;
        nq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new nq();
          var5.field_B = 2;
          var5.field_n = (long)param1;
          var5.field_u = false;
          var5.field_F = param2;
          if (param0 != -19932) {
            field_i = (String) null;
          }
          var5.field_L = param3;
          this.a(var5, 0);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("t.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    t(jj param0) {
        wk var2 = null;
        this.field_e = new ak();
        this.field_d = 0;
        this.field_j = false;
        try {
          var2 = param0.a(5, (Runnable) (this), 0);
          while (0 == var2.field_b) {
            um.a(true, 10L);
          }
          if (var2.field_b == 2) {
            throw new RuntimeException();
          }
          this.field_h = (Thread) (var2.field_d);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Unable to delete name - system busy";
        field_k = "Clan";
        field_a = 0;
        field_b = 0;
        field_i = "Level select";
        field_f = field_a;
        field_m = null;
        field_g = 49;
    }
}
