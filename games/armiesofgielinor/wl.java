/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends tj {
    static String field_J;
    static RgbSprite field_N;
    static String[] field_M;
    static je field_K;
    static int field_E;
    static NodeDeque field_F;
    private int field_H;
    gk field_G;
    static String field_I;
    boolean field_L;

    final static io a(kl param0, int param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        io stackIn_5_0 = null;
        io stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param0.c(param1, (byte) 81);
          var3 = var4;
          if (var4 == null) {
            stackIn_2_0 = null;
            return (io) (stackIn_2_0);
          }
          if (param2) {
            stackIn_7_0 = new io(var4);
            return stackIn_7_0;
          }
          stackIn_5_0 = (io) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("wl.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 95) {
          field_K = (je) null;
        }
        this.a(te.field_l - param0 >> 1, param0, ij.field_x - param2 >> 1, 8192, param2);
    }

    public static void f(byte param0) {
        field_I = null;
        field_M = null;
        field_N = null;
        int var1 = -89 % ((8 - param0) / 57);
        field_K = null;
        field_F = null;
        field_J = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 == this.field_H) {
          return;
        }
        if (this.field_H >= 256) {
          if (param3 != 0) {
            return;
          }
          this.b(this.field_B + param0, 1851680193, param1 + this.field_p);
          super.a(param0, param1, (byte) -121, param3);
          return;
        }
        if (TutorialLayout.field_b == null ||
          !(this.field_l <= TutorialLayout.field_b.pixelWidth) ||
          !(TutorialLayout.field_b.pixelHeight >= this.field_w)) {
          TutorialLayout.field_b = new RgbSprite(this.field_l, this.field_w);
        }
        CombatSandbox.a(TutorialLayout.field_b, 3);
        SoftwareRaster.b();
        this.b(0, 1851680193, 0);
        super.a(-param0 - this.field_B, -param1 - this.field_p, (byte) -106, param3);
        rf.b(-18862);
        if (param2 >= -82) {
          field_J = (String) null;
        }
        TutorialLayout.field_b.e(this.field_B + param0, this.field_p + param1, this.field_H);
    }

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (param0 < 0 ||
          param0 >= 65536) {
          param0 = param0 >>> 16;
          var2 += 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (param0 >= 16) {
          param0 = param0 >>> 4;
          var2 += 4;
        }
        if (param1 != -13337) {
          field_K = (je) null;
        }
        if (param0 >= 4) {
          param0 = param0 >>> 2;
          var2 += 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    boolean a(byte param0) {
        int var2;
        int var3;
        boolean stackIn_12_0 = false;
        var2 = this.g((byte) 122);
        var3 = -this.field_H + var2;
        if (0 < var3) {
          this.field_H = this.field_H + (-1 + (var3 + 8)) / 8;
        }
        if (param0 != -1) {
          field_K = (je) null;
        }
        if (var3 < 0) {
          this.field_H = this.field_H + (var3 - 15) / 16;
        }
        stackIn_12_0 = (this.field_H == 0) && (var2 == 0) && (!this.field_L);
        return stackIn_12_0;
    }

    final kb e(byte param0) {
        int discarded$0 = 0;
        kb var2 = super.e((byte) 66);
        if (var2 != null) {
          return var2;
        }
        if (param0 < 24) {
          discarded$0 = this.g((byte) -91);
        }
        return (kb) (this);
    }

    final static void a(int param0, boolean param1) {
        int var2;
        String var3;
        kl var4;
        int stackIn_6_0 = 0;
        boolean stackIn_13_0 = false;
        String stackIn_22_0 = null;
        boolean stackIn_25_0 = false;
        String stackIn_25_1 = null;
        boolean stackIn_26_2 = false;
        if (fj.field_c) {
          stackIn_6_0 = (hf.field_c) ? 1 : 0;
        } else {
          stackIn_6_0 = 0;
        }
        var2 = stackIn_6_0;
        if (param0 < 9) {
          var4 = (kl) null;
          wl.a((kl) null, -105, true);
        }
        stackIn_13_0 = (param1) && (sq.c((byte) -103)) && (var2 == 0);
        tq.a(stackIn_13_0, false);
        if (null != rd.field_j) {
          rd.field_j.b(0, param1);
        }
        if (null != bc.field_a) {
          bc.field_a.b(0, param1);
        }
        fe.b(0, 0, so.field_b.field_a, so.field_b.field_g, dq.field_i, nd.field_b, 0, 0);
        if (var2 != 0) {
          if (!qa.field_F) {
            stackIn_22_0 = CampaignMenu.field_q;
          } else {
            stackIn_22_0 = l.field_d;
          }
          var3 = stackIn_22_0;
          stackIn_25_0 = false;
          stackIn_25_1 = var3;
          stackIn_26_2 = (param1) && (sq.c((byte) -103));
          RevivalEvent.a(stackIn_25_0, stackIn_25_1, stackIn_26_2);
        }
    }

    private final int g(byte param0) {
        if (param0 != 122) {
          this.field_H = -92;
        }
        return !this.field_L ? 0 : this == this.field_G.a((byte) 89) ? 256 : 0;
    }

    boolean k(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        this.field_H = this.g((byte) 122);
        var2 = -85 / ((param0 + 1) / 44);
        stackIn_4_0 = (this.field_H == 0) && (!this.field_L);
        return stackIn_4_0;
    }

    abstract void b(int param0, int param1, int param2);

    wl(gk param0, int param1, int param2) {
        super(te.field_l - param1 >> 1, ij.field_x - param2 >> 1, param1, param2, (kh) null);
        try {
          this.field_G = param0;
          this.field_L = false;
          this.field_H = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var1_intLifetime1;
        try {
          qc.field_h.a(param0);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            AiActionCandidate.field_u[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            CampaignMission.field_r[var1_intLifetime1] = 0L;
          }
          kb.field_A = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "wl.GA(" + param0 + ')');
        }
    }

    static {
        field_J = "Use this alternative as your account name";
        field_M = new String[]{"trinket_armour_camouflage", "trinket_armour_dragonscale", "trinket_armour_enchanted", "trinket_armour_padded", "trinket_armour_plate", "trinket_armour_runic", "trinket_armour_sacrificial", "trinket_magic", "trinket_melee", "trinket_ranged", "trinket_aerial_talons", "trinket_flame", "trinket_flag", "trinket_grappling_hook", "trinket_soul_stone", "trinket_waders_and_elidin_boots", "trinket_fortify", "trinket_revolt", "trinket_curse", "trinket_potion", "trinket_cyclops_eyedrops", "trinket_elven_lozenge", "trinket_ogre_charcoal", "trinket_kalphite_eggsack", "trinket_goblin_hallucinogen", "trinket_vampire_blood", "trinket_mitosis", "trinket_prayer", "trinket_prayer_kbd_restore", "trinket_raise_single_dead", "trinket_raise_area_dead", "trinket_spiritual_barrier", "trinket_landscaping_build_bridge", "trinket_landscaping_forest_haven", "trinket_landscaping_mountain_crumble", "trinket_landscaping_river_haven", "trinket_landscaping_swamp_haven", "trinket_spell_harming_magicbolt", "trinket_spell_harming_rain_of_fire", "trinket_prayer_aura", "trinket_prayer_ray", "trinket_teleport", "trinket_interface_collapse", "trinket_interface_expand", "trinket_interface_collapse_short", "trinket_interface_expand_short", "trinket_ring_of_life_reappear"};
    }
}
