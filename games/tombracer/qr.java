/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class qr extends ae implements tpa {
    ae field_x;
    static da field_v;
    static String[] field_u;
    static ft field_w;

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c(97);
    }

    final static boolean c(int param0, int param1, int param2) {
        boolean stackIn_5_0 = false;
        boolean stackIn_10_0 = false;
        if (param0 != 458752) {
          qr.a(95);
        }
        stackIn_5_0 = ((458752 & param2) != 0);
        stackIn_10_0 = !(!stackIn_5_0 | cga.a(param2, -83, param1)) || (uu.a(true, param2, param1));
        return stackIn_10_0;
    }

    private final boolean b(ae param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3815994) {
            return false;
          }
          stackIn_8_0 = (this.field_x != null) && (!this.field_x.b((byte) -34)) && (this.field_x.a(param0, false));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qr.M(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_v = (da) null;
          }
          stackIn_6_0 = (null != this.field_x) && (this.field_x.a(param0, false));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qr.S(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -107, param0, param1, param2)) {
            this.a(1, param2, param1, param0);
            this.a(param1, param0, param2, 0);
          }
          if (param3 != 0) {
            field_u = (String[]) null;
          }
          stackIn_6_0 = (StringBuilder) (param2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("qr.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(byte param0) {
        int var2 = -122 % ((-38 - param0) / 60);
        if (null != this.field_x) {
          this.field_x.f((byte) 107);
        }
    }

    final static void a(boolean param0, int[] param1, hja[] param2, cn param3, cn param4) {
        iu[] dupTemp$0 = null;
        iu[] dupTemp$1 = null;
        iu[] dupTemp$2 = null;
        iu[] dupTemp$3 = null;
        hja[] var5 = null;
        hja[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        hja[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        hea var7 = null;
        jea var8 = null;
        jea var9 = null;
        jea var10 = null;
        jea var11 = null;
        iu[] var12 = null;
        iu[] var13 = null;
        iu[] var14 = null;
        jea var15 = null;
        iu[] var16 = null;
        iu[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          var20 = tw.a((byte) -69, "crowns", "lobby", param4);
          var5 = var20;
          csa.field_n = var20.length;
          if (param2 != null) {
            var6 = new hja[param2.length + csa.field_n];
            for (var7_int = 0; var7_int < csa.field_n; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; param2.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[csa.field_n + var7_intLifetime3] = param2[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; var7_intLifetime1 < csa.field_n; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param2 != null) {
            if (param1 == null) {
              for (var7_intLifetime2 = 0; param2.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[csa.field_n + var7_intLifetime2] = param2[var7_intLifetime2].field_f;
              }
            } else {
              for (var7_intLifetime2 = 0; param2.length > var7_intLifetime2; var7_intLifetime2++) {
                var6_array[var7_intLifetime2 + csa.field_n] = param1[var7_intLifetime2];
              }
            }
          }
          pda.field_c = 2;
          hsa.field_a = 11;
          di.field_a = 15;
          wg.field_i = 2;
          mna.field_d = 4;
          var7 = jta.a((byte) 123, "largefont", param4, "lobby", param3);
          qw.field_f = jta.a((byte) 118, "generalfont", param4, "lobby", param3);
          kw.field_e = jta.a((byte) 127, "chatfont", param4, "lobby", param3);
          var7.a(var5, var24);
          qw.field_f.a(var5, var24);
          kw.field_e.a(var5, var24);
          var8 = new jea(0L, (jea) null);
          var8.field_P = di.field_a;
          var8.field_ib = 16777215;
          var8.field_H = (il) ((Object) var7);
          var8.field_bb = 1;
          var9 = var8;
          var9.field_z = 1;
          var10 = new jea(0L, (jea) null);
          var10.field_P = di.field_a;
          var10.field_ib = 16777215;
          var10.field_H = (il) ((Object) qw.field_f);
          var11 = var10;
          var10.field_bb = 1;
          var11.field_z = 1;
          uda.field_s = new jea(0L, var8);
          uda.field_s.field_w = rfa.a(uka.a(param4, "lobby", 5, "heading"), 126);
          joa.field_d = new jea(0L, (jea) null);
          joa.field_d.field_w = tba.a(-74, false, 120, 8421504, 4210752, false);
          ji.field_g = new jea(0L, (jea) null);
          ji.field_g.field_w = hca.c(114, 1, 3, 6316128, -111, 6316128);
          lw.field_a = new jea(0L, (jea) null);
          lw.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "popup"), 113);
          var12 = rfa.a(uka.a(param4, "lobby", 5, "popup_mouseover"), 122);
          var13 = uka.a(param4, "lobby", 5, "button");
          var14 = rfa.a(uka.a(param4, "lobby", 5, "tab_active"), 113);
          oba.field_f = new jea(0L, var8);
          oba.field_f.field_w = var14;
          cga.field_g = new jea(0L, (jea) null);
          cga.field_g.field_R = nia.a(param4, "lobby", "closebutton", 125);
          cga.field_g.field_rb = nia.a(param4, "lobby", "closebutton_mouseover", -112);
          sm.field_r = new jea(0L, var8);
          sm.field_r.field_w = tba.a(-67, true, 40, 3815994, 2039583, true);
          ooa.field_f = new jea(0L, var10);
          ooa.field_f.field_x = 2;
          ooa.field_f.field_w = tba.a(-75, false, 30, 3815994, 2039583, true);
          cs.field_a = new jea(0L, var10);
          cs.field_a.field_x = 2;
          cs.field_a.field_w = tba.a(-116, false, 30, 3815994, 2039583, false);
          hma.field_b = new jea(0L, var10);
          hma.field_b.field_x = 2;
          hma.field_b.field_w = tba.a(-104, true, 30, 3815994, 2039583, false);
          kua.field_i = new jea(0L, (jea) null);
          kua.field_i.field_ib = 13421772;
          kua.field_i.field_P = di.field_a;
          kua.field_i.field_H = (il) ((Object) qw.field_f);
          kua.field_i.field_bb = 1;
          dja.field_p = new jea(0L, kua.field_i);
          dja.field_p.field_ab = 16777215;
          dja.field_p.field_hb = 8421504;
          dja.field_p.field_gb = 16777215;
          dja.field_p.field_ib = 16764006;
          dja.field_p.field_N = 16777215;
          var15 = new jea(0L, dja.field_p);
          var15.field_ib = 16777215;
          var15.field_H = (il) ((Object) var7);
          var15.field_P = di.field_a;
          tka.field_q = new jea(0L, kua.field_i);
          tka.field_q.field_w = tba.a(-103, param0, 16, 2236962, 2236962, false);
          tka.field_q.field_x = 2;
          una.field_j = new jea(0L, kua.field_i);
          una.field_j.field_w = tba.a(-73, false, 16, 1513239, 1513239, false);
          una.field_j.field_x = 2;
          iea.field_g = new jea(0L, tka.field_q);
          iea.field_g.a(false, dja.field_p);
          lta.field_a = new jea(0L, una.field_j);
          lta.field_a.a(param0, dja.field_p);
          var16 = uka.a(param4, "lobby", 5, "button_mouseover");
          eq.field_n = new ola(lw.field_a, var12, kua.field_i, dja.field_p, 3, 2, pda.field_c, 3, di.field_a);
          qi.field_M = new jea(0L, dja.field_p);
          qi.field_M.field_fb = 1;
          qi.field_M.field_ob = 1;
          qi.field_M.field_v = 1;
          qi.field_M.field_w = var13;
          qi.field_M.field_C = var16;
          qi.field_M.field_W = 1;
          qi.field_M.field_db = uka.a(param4, "lobby", 5, "button_mouseheld");
          qi.field_M.field_n = uka.a(param4, "lobby", 5, "button_active");
          qi.field_M.field_M = uka.a(param4, "lobby", 5, "button_disabled");
          qi.field_M.field_z = 1;
          up.field_a = new jea(0L, dja.field_p);
          up.field_a.field_z = 1;
          up.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "tab_inactive"), 113);
          up.field_a.field_C = rfa.a(uka.a(param4, "lobby", 5, "tab_mouseover"), 113);
          up.field_a.field_n = var14;
          js.field_d = new jea(0L, (jea) null);
          js.field_d.field_w = hca.c(206, -1, 3, 1856141, -113, 1127256);
          cfa.field_c = new jea(0L, (jea) null);
          cfa.field_c.field_w = hca.c(290, -1, 3, 11579568, -120, 6052956);
          hg.field_g = new jea(0L, var15);
          hg.field_g.field_W = 1;
          hg.field_g.field_v = 1;
          hg.field_g.field_fb = 1;
          hg.field_g.field_ob = 1;
          hg.field_g.field_z = 1;
          dp.field_i = new jea(0L, hg.field_g);
          jk.field_g = new jea(0L, dja.field_p);
          jk.field_g.field_W = 1;
          jk.field_g.field_v = 1;
          jk.field_g.field_fb = 1;
          jk.field_g.field_ob = 1;
          jk.field_g.field_z = 1;
          bua.field_g = new jea(0L, jk.field_g);
          kv.field_b = new jea(0L, jk.field_g);
          ssa.field_g = new jea(0L, hg.field_g);
          jq.field_o = new jea(0L, jk.field_g);
          dn.field_a = new jea(0L, jk.field_g);
          qja.field_j = new jea(0L, jk.field_g);
          jk.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "smallbutton"), 124);
          jk.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_mouseover"), 127);
          dupTemp$0 = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_active"), 114);
          jk.field_g.field_n = dupTemp$0;
          jk.field_g.field_db = dupTemp$0;
          jk.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "smallbutton_disabled"), 127);
          dp.field_i.field_w = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton"), 125);
          dp.field_i.field_C = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton_mouseover"), 115);
          dp.field_i.field_db = rfa.a(uka.a(param4, "lobby", 5, "mediumbutton_mouseheld"), 114);
          hg.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "bigbutton"), 127);
          hg.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_mouseover"), 118);
          hg.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_mouseheld"), 122);
          hg.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "bigbutton_disabled"), 124);
          bua.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "greenbutton"), 124);
          bua.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "greenbutton_mouseover"), 116);
          bua.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "greenbutton_mouseheld"), 123);
          kv.field_b.field_w = rfa.a(uka.a(param4, "lobby", 5, "redbutton"), 113);
          kv.field_b.field_C = rfa.a(uka.a(param4, "lobby", 5, "redbutton_mouseover"), 123);
          kv.field_b.field_db = rfa.a(uka.a(param4, "lobby", 5, "redbutton_mouseheld"), 116);
          ssa.field_g.field_w = rfa.a(uka.a(param4, "lobby", 5, "backbutton"), 125);
          ssa.field_g.field_C = rfa.a(uka.a(param4, "lobby", 5, "backbutton_mouseover"), 117);
          ssa.field_g.field_db = rfa.a(uka.a(param4, "lobby", 5, "backbutton_mouseheld"), 123);
          ssa.field_g.field_M = rfa.a(uka.a(param4, "lobby", 5, "backbutton_disabled"), 116);
          qja.field_j.field_w = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton"), 118);
          qja.field_j.field_C = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_mouseover"), 113);
          dupTemp$1 = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_active"), 118);
          qja.field_j.field_n = dupTemp$1;
          qja.field_j.field_db = dupTemp$1;
          qja.field_j.field_M = rfa.a(uka.a(param4, "lobby", 5, "gameoptionbutton_disabled"), 125);
          jq.field_o.field_w = rfa.a(uka.a(param4, "lobby", 5, "chatbutton"), 116);
          jq.field_o.field_C = rfa.a(uka.a(param4, "lobby", 5, "chatbutton_mouseover"), 119);
          dupTemp$2 = rfa.a(uka.a(param4, "lobby", 5, "chatbutton_active"), 119);
          jq.field_o.field_n = dupTemp$2;
          jq.field_o.field_db = dupTemp$2;
          dn.field_a.field_w = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton"), 112);
          dn.field_a.field_C = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton_mouseover"), 112);
          dupTemp$3 = rfa.a(uka.a(param4, "lobby", 5, "chatfilterbutton_active"), 118);
          dn.field_a.field_n = dupTemp$3;
          dn.field_a.field_db = dupTemp$3;
          var17 = uka.a(param4, "lobby", 5, "checkbox");
          kt.field_F = new ta(0L, var17[1], var17[0], 1, dja.field_p, (String) null);
          lr.field_b = new jea(0L, (jea) null);
          lr.field_b.field_w = wpa.a((byte) -118, nia.a(param4, "lobby", "slideregion", 115));
          lr.field_b.field_C = wpa.a((byte) -60, nia.a(param4, "lobby", "slideregion_mouseover", 75));
          lr.field_b.field_db = wpa.a((byte) -118, nia.a(param4, "lobby", "slideregion_mouseheld", 123));
          lr.field_b.field_M = wpa.a((byte) -87, nia.a(param4, "lobby", "slideregion_disabled", 106));
          ie.field_h = new jea(0L, (jea) null);
          ie.field_h.field_w = rfa.a(uka.a(param4, "lobby", 5, "dragbar"), 122);
          ie.field_h.field_C = rfa.a(uka.a(param4, "lobby", 5, "dragbar_mouseover"), 121);
          ie.field_h.field_db = rfa.a(uka.a(param4, "lobby", 5, "dragbar_mouseheld"), 113);
          ie.field_h.field_M = rfa.a(uka.a(param4, "lobby", 5, "dragbar_disabled"), 116);
          pk.field_s = new jea(0L, (jea) null);
          pk.field_s.field_R = nia.a(param4, "lobby", "upbutton", -121);
          pk.field_s.field_rb = nia.a(param4, "lobby", "upbutton_mouseover", -87);
          pk.field_s.field_U = nia.a(param4, "lobby", "upbutton_mouseheld", 71);
          pk.field_s.field_B = nia.a(param4, "lobby", "upbutton_disabled", 71);
          jqa.field_b = new jea(0L, (jea) null);
          jqa.field_b.field_R = nia.a(param4, "lobby", "downbutton", 119);
          jqa.field_b.field_rb = nia.a(param4, "lobby", "downbutton_mouseover", -73);
          jqa.field_b.field_U = nia.a(param4, "lobby", "downbutton_mouseheld", 56);
          jqa.field_b.field_B = nia.a(param4, "lobby", "downbutton_disabled", 113);
          fe.field_F = new oj(0L, pk.field_s, jqa.field_b, lr.field_b, ie.field_h);
          aaa.field_d = new hla(0L, (jea) null, rfa.field_C, fe.field_F, jk.field_g, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_26_0 = var5_ref;
          stackIn_26_1 = new StringBuilder().append("qr.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 != -1) {
            this.d((byte) -80);
          }
          stackIn_7_0 = (null != this.field_x) && (this.field_x.b((byte) -34)) && (this.field_x.a(param0, param1, param2, param3, param4, param5, -1));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("qr.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    ae b(boolean param0) {
        ae var2 = this.field_x;
        if (var2 != null &&
          var2.b((byte) -34)) {
          return var2;
        }
        if (!param0) {
          return null;
        }
        field_v = (da) null;
        return null;
    }

    String d(byte param0) {
        String var3_ref_String = null;
        String var2 = super.d((byte) 112);
        if (this.field_x != null) {
          var3_ref_String = this.field_x.d((byte) 51);
          if (var3_ref_String != null) {
            return var3_ref_String;
          }
        }
        int var3 = -32 / ((param0 + 58) / 60);
        return var2;
    }

    final static void d(int param0) {
        if (param0 != -7694) {
          field_w = (ft) null;
        }
        rma.a(true, faa.field_g, osa.field_p, (byte) 119);
        bga.field_d = true;
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (vka.A(param0 ^ 108)) && ((8 & pk.field_C) == 0);
        return stackIn_6_0;
    }

    private final boolean a(ae param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 14) {
            return true;
          }
          stackIn_8_0 = (null != this.field_x) && (!this.field_x.b((byte) -34)) && (this.field_x.a(param0, false));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qr.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 70) {
            return false;
          }
          stackIn_7_0 = (null != this.field_x) && (this.field_x.a(111, this.field_i + param1, param2 + this.field_n, param3, param4, param5, param6));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_10_0 = var8;
          stackIn_10_1 = new StringBuilder().append("qr.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    void c(int param0) {
        if (param0 < 91) {
          this.field_x = (ae) null;
        }
        if (null != this.field_x) {
          this.field_x.c((byte) 124);
        }
    }

    final static boolean d(int param0, int param1, int param2) {
        if (param2 != 32) {
          field_v = (da) null;
        }
        return 0 != (param0 & 32) ? true : false;
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        StringBuilder discarded$4 = null;
        int var5_int = 0;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$5 = null;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          discarded$4 = param2.append('\n');
          for (var5_int = param3; param1 >= var5_int; var5_int++) {
            discarded$6 = param2.append(' ');
          }
          if (this.field_x == null) {
            discarded$5 = param2.append("null");
          } else {
            this.field_x.a(param1 + 1, param0, param2, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qr.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 != -34) {
          return false;
        }
        return this.b(false) != null ? true : false;
    }

    void a(byte param0, ae param1, int param2, int param3, int param4, int param5) {
        cn var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param0 != 59) {
            var8 = (cn) null;
            qr.a(false, (int[]) null, (hja[]) null, (cn) null, (cn) null);
          }
          if (null != this.field_x) {
            this.field_x.a((byte) 59, param1, param2, this.field_i + param3, param4 + this.field_n, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("qr.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (param0) {
          return 77;
        }
        return null != this.field_x ? this.field_x.a(false) : 0;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_x &&
            this.field_x.b((byte) -34) &&
            this.field_x.a(param0, param1, param2, true)) {
            return true;
          }
          if (!param3) {
            this.b((byte) -68);
          }
          var5_int = param2;
          if (var5_int != 80) {
            return false;
          }
          if (!oj.field_tb[81]) {
            stackIn_13_0 = this.a(param1, 71);
          } else {
            stackIn_13_0 = this.b(param1, 3815994);
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qr.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, ae param2, int param3) {
        ae var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.a(param0, param1 + 0, param2, param3);
          if (param1 != 2097152) {
            var6 = (ae) null;
            this.a(55, -69, -121, 107, (ae) null, -94, -43);
          }
          if (this.field_x != null) {
            this.field_x.a(this.field_i + param0, 2097152, param2, this.field_n + param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qr.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        field_u = null;
        field_v = null;
        field_w = null;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param3 == 0 &&
          null != this.field_r) {
          this.field_r.a((ae) (this), param0, 16777215, param1, true);
        }
        if (null != this.field_x) {
          this.field_x.a(this.field_i + param0, param1 + this.field_n, 0, param3);
        }
        if (param2 != 0) {
          cn var6 = (cn) null;
          qr.a(false, (int[]) null, (hja[]) null, (cn) null, (cn) null);
        }
    }

    qr(int param0, int param1, int param2, int param3, isa param4, qc param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    static {
        field_u = new String[]{"<%0> was sliced", "<%0> was diced", "<%0> was chopped", "<%0> was buzzed by a saw", "<%0> was hacked by a saw", "<%0> didn't see the saw", "<%0> was cut down to size", "<%0> failed the first trial"};
        field_w = new ft(1);
    }
}
