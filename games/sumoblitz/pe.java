/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends sp implements ai {
    private oe field_A;
    static ri[] field_F;
    private wp[] field_C;
    static gj field_E;
    static String field_D;
    private String[] field_B;

    final static void a(int param0, float param1, String param2) {
        try {
          ur.field_R = param1;
          hn.field_k = param2;
          if (param0 != 20) {
            field_F = (ri[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        field_E = null;
        field_F = null;
        if (param0 != -18490) {
          field_F = (ri[]) null;
        }
        field_D = null;
    }

    final void a(String[] param0, boolean param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bv var4 = null;
        int var6 = 0;
        String[] var7 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_y.e(125);
          if (param0 != null &&
            0 != param0.length) {
            var3_int = param0.length;
            this.field_B = new String[var3_int];
            if (param1) {
              var7 = (String[]) null;
              this.a((String[]) null, true);
            }
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_B[var4_int] = kf.a((CharSequence) ((Object) param0[var4_int]), (byte) 38).replace(' ', ' ');
            }
            var4 = new bv(kw.field_b, 0, 1);
            this.field_C = new wp[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_C[var5] = new wp(this.field_B[var5], (qm) (this));
              this.field_C[var5].field_w = (mh) ((Object) var4);
              this.field_C[var5].field_t = ji.field_b;
              this.field_C[var5].a(103, 0, 16 * var5 + 20, 15, 80);
              this.a(this.field_C[var5], 64);
            }
            this.field_C[var3_int] = new wp(dt.field_h, (qm) (this));
            this.field_C[var3_int].field_w = (mh) ((Object) var4);
            this.field_C[var3_int].a(126, 0, 20 + 16 * var3_int + 16, 15, 100);
            this.a(this.field_C[var3_int], 89);
            return;
          }
          this.field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("pe.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    pe(oe param0) {
        super(0, 0, 0, 0, (mh) null);
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, (byte) 97, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_6_0 = this.a((byte) 125, param0);
            return stackIn_6_0;
          }
          if (param2 < 9) {
            this.a(-89, -18, (byte) -61, -116);
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(param0, false);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("pe.KA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(byte param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return rt.field_G[var4];
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 >= -34) {
          field_E = (gj) null;
        }
        stackIn_6_0 = (null != qk.field_O) && (kw.field_c.a(17704));
        return stackIn_6_0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        String var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          for (var6_int = 0; this.field_B.length > var6_int; var6_int++) {
            if (this.field_C[var6_int] == param2) {
              this.field_A.a(this.field_B[var6_int], 0);
            }
          }
          if (param1 != 710) {
            var8 = (String) null;
            pe.a(117, 1.4675142765045166f, (String) null);
          }
          if (param2 == this.field_C[this.field_B.length]) {
            this.field_A.a((byte) -86);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("pe.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ki param0, ki param1, int param2, ki param3) {
        ci.field_g = ri.b(param3, "", "fontalpha");
        g.field_a = gd.a(param1, (byte) -79, "font", "");
        mn.field_b = ri.b(param3, "", "fontglow");
        hu.field_c = g.field_a;
        wj.field_i = ri.b(param3, "", "smallfontalpha");
        qr.field_a = gd.a(param1, (byte) -39, "smallfont", "");
        au.field_j = ri.b(param3, "", "glowfontalpha");
        sv.field_a = qr.field_a;
        ld.field_F = ri.b(param3, "", "boldfontalpha");
        ma.field_b = gd.a(param1, (byte) -36, "boldfont", "");
        nw.field_f = ri.b(param3, "", "boldglowfontalpha");
        sq.field_b = ma.field_b;
        field_F = ri.b(param3, "", "menu_frame");
        rh.field_q = ri.b(param3, "", "tooltip_kit");
        hi.field_b = ri.b(param3, "", "achievements");
        gk.field_N = ri.a(param0, "basic", "unachieved");
        ud.field_p = ri.a(param0, "basic", "locked");
        ms.field_d = ri.a(param3, "", "titleimage");
        rc.field_i = ri.a(param3, "", "lock");
        hc.field_b = ri.a(param3, "", "heart");
        oi.field_d = ri.a(param3, "", "skull");
        tk.field_c = ri.b(param3, "", "slider");
        if (param2 != 20) {
          return;
        }
        try {
          jj.field_c = ri.b(param3, "", "statline_tab");
          rw.field_r = ri.b(param3, "", "statline_tab_flip");
          ok.field_d = ri.b(param3, "", "button_off");
          hh.field_a = ri.b(param3, "", "button_over");
          sk.field_c = ri.b(param3, "", "button_on");
          gq.field_o = ri.b(param3, "", "chargebar_vertical");
          cb.field_e = ri.a(param3, "", "congratulations");
          ve.field_k = ri.a(param3, "", "mouse");
          dt.field_n = ri.a(param3, "", "keyboard");
          rl.field_l = ri.b(param3, "", "player");
          kk.field_e = ri.b(param3, "", "mook");
          ks.field_w = ri.b(param3, "", "fast");
          fl.field_r = ri.b(param3, "", "sleeper");
          kr.field_b = ri.b(param3, "", "splitter");
          qk.field_V = ri.b(param3, "", "seeker");
          ph.field_a = ri.b(param3, "", "shadowdudes");
          jd.field_h = ri.b(param3, "", "mod_armour");
          bk.field_b = ri.b(param3, "", "mod_bomb");
          cd.field_c = ri.b(param3, "", "mod_spikes");
          lh.field_k = ri.a(param3, "", "zap");
          eu.field_a = ri.b(param3, "", "chargebar");
          bl.field_a = ri.a(param3, "", "bounceup");
          uj.field_c = ri.b(param3, "", "powerups");
          df.field_d = ri.a(param3, "", "particle");
          cl.field_v = ri.b(param3, "", "particles");
          kq.field_T = ri.a(param3, "", "particle_alpha");
          dq.field_v = ri.b(param3, "", "particles_alpha");
          kf.field_w = ri.b(param3, "", "particle_ring");
          bj.field_g = ri.a(param3, "", "particle_sprinkle");
          ks.field_t = ri.a(param3, "", "particle_star");
          rq.field_c = ri.a(param3, "", "particle_pixel");
          ue.field_p = ri.a(param3, "", "particle_pixel_alpha");
          pc.field_c = ri.a(param3, "", "ghost");
          no.field_c = ri.a(param3, "", "ghost_cloud");
          rt.field_E = ri.a(param3, "", "ghost_splatter");
          mn.field_c = ri.a(param3, "", "shadow");
          gw.field_C = ri.a(param3, "", "driftinglight");
          wf.field_a = ri.a(param3, "", "driftinglight_snow");
          ml.field_p = ri.a(param3, "", "driftinglight_rough");
          th.field_C = ri.a(param3, "", "shockwave");
          os.field_b = ri.b(param3, "", "lightningrod");
          sd.field_a = ri.b(param3, "", "lightningrod_lowgraphics");
          hp.field_n = ri.b(param3, "", "electricity");
          ni.field_h = ri.b(param3, "", "electricity_flip");
          rj.field_f = ri.a(param3, "", "attract");
          uu.field_o = ri.a(param3, "", "repulse");
          lr.field_c = ri.a(param3, "", "icepatch");
          ei.field_b = ri.b(param3, "", "attractor");
          rs.field_e = ri.a(param3, "", "bouncer");
          kq.field_S = ri.b(param3, "", "landmine");
          nn.field_a = ri.b(param3, "", "repeller");
          we.field_C = ri.b(param3, "", "accelerator");
          pc.field_b = ri.b(param3, "", "teleporter");
          mc.field_F = ri.b(param3, "", "ice");
          om.field_m = ri.b(param3, "", "zaptrap");
          ke.field_c = ri.a(param3, "reticule");
          tc.field_i = ri.a(param3, "", "reticule_flat");
          hc.field_a = ri.b(param3, "", "gravitywell");
          rl.field_o = ri.a(param3, "", "gravitywell_field");
          pq.field_F = ri.b(param3, "", "tutorial_images");
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pe.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -105, param3);
        if (0 != param3) {
          return;
        }
        vn var5 = kw.field_b;
        if (this.field_B != null) {
          var5.a(ia.field_a, param0 + this.field_r, this.field_v + param1, this.field_q, 20, 16777215, -1, 0, 0, var5.field_I + var5.field_s);
        }
        if (param2 > -35) {
          this.a(120, -19, (byte) -32, 10);
        }
    }

    static {
        field_D = "Orb Points";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static String $cfr$intArgs$a$c7de0d339b2a(int param0, boolean param1, boolean param2, boolean param3) {
        if (param0 != 26) {
          return (String) null;
        }
        int var4 = 0;
        if (param1) {
          var4 += 4;
        }
        if (param3) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        return rt.field_G[var4];
    }
}
