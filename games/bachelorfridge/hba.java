/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hba extends vja {
    static ws field_x;
    boolean field_t;
    static String field_v;
    static String field_u;
    int field_w;

    hba(int param0, nq param1, int param2, int param3, boolean param4, boolean param5, boolean param6, boolean param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_w = param3;
          this.field_t = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hba.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    hba(int param0, lu param1) {
        super(param0, param1);
        try {
          if (!this.field_n) {
            this.field_t = 0 != (128 & param1.b(16711935)) ? true : false;
          }
          this.field_w = param1.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hba.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(op param0, boolean param1) {
        aga var3 = this.field_l.a(11, param0);
        if (this.field_r ||
          this.field_n ||
          this.field_t) {
          var3.d(this.field_k, (byte) -115);
          return;
        }
        try {
          var3.a(param1, this.field_w, this.field_q);
          super.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hba.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, vr param1) {
        ee[] var10 = null;
        ee dupTemp$0 = null;
        ee[] var11 = null;
        ee[] var4 = null;
        int var5_int = 0;
        ee[] var12 = null;
        ee[] var5 = null;
        kv[] var6 = null;
        kv[] var7 = null;
        kv[] var8 = null;
        int var6_int = 0;
        int var9 = BachelorFridge.field_y;
        ee[] var5Lifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var6_intLifetime5;
        int var6_intLifetime6;
        try {
          System.gc();
          ula.field_h = wfa.a("mini_stat_bg", param1, "basic", (byte) -35);
          mp.field_s = hca.a("basic", param1, -93, "stats_tabs");
          wfa.a("splat_stat", param1, "basic", (byte) 105);
          bt.field_r = pi.a(param1, -8845, "basic", "stars");
          kla.a(bt.field_r, 122);
          lp.field_q = wfa.a("options_slime_b", param1, "basic", (byte) -15);
          nna.field_w = wfa.a("chat_splat", param1, "basic", (byte) -75);
          qn.field_g = wfa.a("clock_splat", param1, "basic", (byte) 121);
          fb.field_r = wfa.a("top_bar", param1, "basic", (byte) 70);
          eja.field_w = wfa.a("bottom_bar", param1, "basic", (byte) 86);
          uga.field_C = wfa.a("bubble_number", param1, "basic", (byte) 100);
          ica.field_t = wfa.a("end_button", param1, "basic", (byte) 87);
          fla.field_s = wfa.a("end_button_held", param1, "basic", (byte) -122);
          hk.a("basic_frame", param1, -84, "basic");
          wd.field_w = hk.a("button_frame", param1, 87, "basic");
          bla.field_p = hk.a("button_frame_hover", param1, -115, "basic");
          op.field_I = hk.a("button_frame_pressed", param1, 74, "basic");
          hh.field_b = pi.a(param1, -8845, "basic", "move_icons");
          nia.field_l = pi.a(param1, -8845, "basic", "icon_frames");
          hl.field_D = hh.field_b;
          fe.field_j = new kv(16, 16);
          fe.field_j.b();
          hh.field_b[2].f(0, 0);
          hga.field_U.a((byte) -45);
          ve.field_m = new kv[4][];
          ve.field_m[0] = pi.a(param1, -8845, "basic", "powerup_hp");
          ve.field_m[1] = pi.a(param1, -8845, "basic", "powerup_speed");
          ve.field_m[2] = pi.a(param1, -8845, "basic", "powerup_attack");
          ve.field_m[3] = pi.a(param1, -8845, "basic", "powerup_special");
          am.field_M = pi.a(param1, -8845, "basic", "status_icons");
          gha.field_h = bla.a(29611, "basic", "doughnut", param1)[0];
          var10 = bla.a(29611, "basic", "special_tiles_ones", param1);
          qq.field_i = new ee[3];
          dupTemp$0 = var10[6];
          il.field_b = dupTemp$0;
          ge.field_K = dupTemp$0;
          nha.field_a = var10[4];
          il.field_a = var10[15];
          en.field_a = var10[3];
          ho.field_j = new ee[]{var10[13], var10[14]};
          fw.field_f = var10[5];
          ff.field_u = var10[0];
          uu.field_vb = var10[1];
          qq.field_i[0] = var10[17];
          qq.field_i[2] = var10[19];
          qq.field_i[1] = var10[18];
          cba.field_c = new ee[]{var10[23], var10[24], var10[25]};
          iw.field_b = new ee[]{var10[26], var10[27], var10[28]};
          sv.field_c = var10[29];
          it.field_i = var10[32];
          eka.field_g = new ee[][]{new ee[]{var10[34], var10[35]}, new ee[]{var10[36], var10[37]}, new ee[]{var10[38], var10[39]}};
          ena.field_l = var10[33];
          rw.field_a = var10[31];
          Object var2 = null;
          var11 = bla.a(29611, "basic", "special_tiles_twos", param1);
          kka.field_f = var11[0];
          hna.field_h = var11[1];
          de.field_F = var11[2];
          de.field_F.d();
          hr.field_c = var11[3];
          nv.field_wb = var11[5];
          od.field_C = var11[4];
          aea.field_k = new kv(256, 256);
          aea.field_k.b();
          var11[6].a(0, 0);
          var11[7].a(128, 0);
          hga.field_U.a((byte) 119);
          pfa.field_g = var11[8];
          co.field_b = new ee[5];
          co.field_b[4] = var11[13];
          co.field_b[1] = var11[10];
          co.field_b[2] = var11[11];
          co.field_b[3] = var11[12];
          co.field_b[0] = var11[9];
          lf.field_b = new ee[3];
          lf.field_b[2] = var11[16];
          lf.field_b[1] = var11[15];
          lf.field_b[0] = var11[14];
          Object var3 = null;
          mla.field_b = pi.a(param1, -8845, "basic", "snowflakes");
          du.field_b = ch.a(param1, -1, "basic", "cat_head");
          lu.field_f = ch.a(param1, -1, "basic", "cat_eyes");
          ou.field_d = bla.a(29611, "basic", "cat_paw", param1);
          vi.field_f = ch.a(param1, -1, "basic", "cat_leg");
          var4 = bla.a(29611, "basic", "fish", param1);
          aw.field_v = new ee[3][3];
          if (!param0) {
            field_u = (String) null;
          }
          for (var5_int = 0; var5_int < 3; var5_int++) {
            for (var6_int = 0; var6_int < 3; var6_int++) {
              aw.field_v[var5_int][var6_int] = var4[3 * var5_int + var6_int];
            }
          }
          ala.field_a = pi.a(param1, -8845, "basic", "spinners");
          var12 = bla.a(29611, "basic", "milk_jam", param1);
          var5 = var12;
          ld.field_l = new ee[7];
          for (var6_intLifetime1 = 0; var6_intLifetime1 < 7; var6_intLifetime1++) {
            ld.field_l[var6_intLifetime1] = var12[var6_intLifetime1];
          }
          pk.field_b = new ee[7];
          for (var6_intLifetime2 = 0; var6_intLifetime2 < 7; var6_intLifetime2++) {
            pk.field_b[var6_intLifetime2] = var5[7 + var6_intLifetime2];
          }
          ls.field_a = gw.a("basic", "box_shadows", param1, -42);
          var5Lifetime1 = null;
          as.field_a = new kv[ls.field_a.length];
          for (var6_intLifetime3 = 0; var6_intLifetime3 < ls.field_a.length; var6_intLifetime3++) {
            as.field_a[var6_intLifetime3] = ls.field_a[var6_intLifetime3].h();
          }
          sj.field_k = bla.a(29611, "basic", "win_takenhold", param1);
          ela.field_j = bla.a(29611, "basic", "win_ctf", param1);
          pm.field_v = bla.a(29611, "basic", "fly_small", param1);
          hb.field_k = new ee[2];
          for (var6_intLifetime4 = 0; var6_intLifetime4 < pm.field_v.length; var6_intLifetime4++) {
            hb.field_k[var6_intLifetime4] = pm.field_v[var6_intLifetime4].b();
          }
          hha.field_y = bla.a(29611, "basic", "maggot_small", param1);
          ik.field_h = new ee[hha.field_y.length];
          for (var6_intLifetime5 = 0; var6_intLifetime5 < hha.field_y.length; var6_intLifetime5++) {
            ik.field_h[var6_intLifetime5] = hha.field_y[var6_intLifetime5].b();
          }
          rla.field_k = wfa.a("target", param1, "basic", (byte) -124);
          bfa.field_b = pi.a(param1, -8845, "basic", "select_drop");
          vma.field_j = new kv[bfa.field_b.length];
          for (var6_intLifetime6 = 0; bfa.field_b.length > var6_intLifetime6; var6_intLifetime6++) {
            vma.field_j[var6_intLifetime6] = (kv) ((Object) ((pa) (bfa.field_b[var6_intLifetime6])).i());
            vma.field_j[var6_intLifetime6].e();
            lp.a((byte) -92, vma.field_j[var6_intLifetime6]);
          }
          sia.field_g = wfa.a("hp_meter", param1, "basic", (byte) -11);
          lga.field_k = wfa.a("status_frame", param1, "basic", (byte) 64);
          nna.field_v = hca.a("basic", param1, -64, "char_select_bg");
          tp.field_x = wfa.a("selected_dot", param1, "basic", (byte) 110);
          pw.field_y = wfa.a("creatureviewer_button", param1, "basic", (byte) 103);
          fk.field_s = wfa.a("stamina", param1, "basic", (byte) 66);
          vaa.field_b = wfa.a("speed", param1, "basic", (byte) 81);
          dt.field_a = wfa.a("fisticuffs", param1, "basic", (byte) 67);
          in.field_b = wfa.a("flingstuff", param1, "basic", (byte) 69);
          gq.field_E = wfa.a("action_bg", param1, "basic", (byte) 117);
          ph.field_C = hca.a("basic", param1, 76, "move_phase");
          fv.field_y = hca.a("basic", param1, 103, "action_phase");
          wga.field_r = hca.a("basic", param1, -85, "suddendeath");
          nca.field_a = bla.a(29611, "basic", "tiles_shadows", param1);
          kn.field_g = wfa.a("skull", param1, "basic", (byte) 117);
          vc.field_d = new kv[9];
          var6 = pi.a(param1, -8845, "basic", "arena_objects_1");
          var7 = pi.a(param1, -8845, "basic", "arena_objects_2");
          var8 = pi.a(param1, -8845, "basic", "arena_objects_3");
          vc.field_d[0] = (kv) ((Object) ((pa) (var6[0])).i());
          vc.field_d[1] = (kv) ((Object) ((pa) (var6[1])).i());
          vc.field_d[2] = (kv) ((Object) ((pa) (var6[2])).i());
          vc.field_d[3] = (kv) ((Object) ((pa) (var6[3])).i());
          vc.field_d[4] = (kv) ((Object) ((pa) (var6[4])).i());
          vc.field_d[5] = (kv) ((Object) ((pa) (var6[5])).i());
          vc.field_d[6] = (kv) ((Object) ((pa) (var7[0])).i());
          vc.field_d[7] = (kv) ((Object) ((pa) (var7[1])).i());
          vc.field_d[8] = (kv) ((Object) ((pa) (var8[0])).i());
          ip.field_f = pi.a(param1, -8845, "basic", "combat_dummy");
          mba.field_d = pi.a(param1, -8845, "basic", "toonsplosion");
          ed.field_f = pi.a(param1, -8845, "basic", "v_particles");
          iga.field_a = pi.a(param1, -8845, "basic", "p_particles");
          lw.field_b = pi.a(param1, -8845, "basic", "goo_particles");
          qna.field_l = pi.a(param1, -8845, "basic", "heal_particles");
          un.field_m = wfa.a("swipe", param1, "basic", (byte) 78);
          qga.field_r = (kv) ((Object) ((pa) (un.field_m)).i());
          qga.field_r.e();
          wfa.a("hit_star", param1, "basic", (byte) -23);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hba.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, lu param1) {
        try {
          super.a((byte) -38, param1);
          if (!this.field_n) {
            param1.d(this.field_t ? 128 : 0, 0);
          }
          if (param0 >= -12) {
            field_x = (ws) null;
          }
          param1.d(this.field_w, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hba.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(byte param0) {
        field_x = null;
        field_u = null;
        field_v = null;
        if (param0 != 92) {
          hba.e((byte) -83);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = BachelorFridge.field_y;
        try {
          param1--;
          param4--;
          var5_int = param4 - param3;
          while (param1 < var5_int) {
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
            param1++;
            param2[param1] = param0;
          }
          while (param1 < param4) {
            param1++;
            param2[param1] = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("hba.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        ba stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 5) {
            stackIn_4_0 = new ba(param1, this);
            return (at) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (at) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hba.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param1, (byte) 119);
          var3 = param1.b(16711935);
          var4 = param1.b(16711935);
          var5 = 75 % ((63 - param0) / 58);
          stackIn_1_0 = new bj(var2, var3, var4);
          return (pp) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("hba.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = BachelorFridge.field_y;
        try {
          id.field_i = new js(4);
          for (var1_int = 0; jk.field_k.length > var1_int; var1_int++) {
            id.field_i.a((long)jk.field_k[var1_int].toLowerCase().hashCode(), (byte) 69, new ji(var1_int));
          }
          if (param0 != 7) {
            field_v = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "hba.B(" + param0 + ')');
        }
    }

    static {
        field_x = new ws();
        field_v = "Add <%0> to ignore list";
        field_u = "No options available";
    }
}
