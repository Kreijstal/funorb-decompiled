/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o {
    static n field_g;
    static om field_e;
    static int field_f;
    static String field_a;
    static mm field_b;
    static th field_h;
    static int field_d;
    static dk field_c;

    final static boolean d(int param0) {
        if (param0 != -572695519) {
          return false;
        }
        return dp.field_v.a(false);
    }

    final static void c(int param0) {
        ta.uiSounds[2] = GameScreen.field_e.a("BaB_move_thruster_loop", "", (byte) 115);
        ta.uiSounds[5] = GameScreen.field_e.a("BaB_plasma_ball_charged", "", (byte) 116);
        ta.uiSounds[6] = GameScreen.field_e.a("BaB_plasma_ball_fire", "", (byte) 108);
        ta.uiSounds[10] = GameScreen.field_e.a("BaB_teleport_00", "", (byte) 108);
        ta.uiSounds[11] = GameScreen.field_e.a("BaB_transform_block", "", (byte) 111);
        ta.uiSounds[13] = GameScreen.field_e.a("BaB_indestructable_block_destroy", "", (byte) 110);
        NanoGameClock.field_p[0] = GameScreen.field_e.a("BaB_indestructable_block_00", "", (byte) 124);
        NanoGameClock.field_p[1] = GameScreen.field_e.a("BaB_indestructable_block_01", "", (byte) 108);
        NanoGameClock.field_p[2] = GameScreen.field_e.a("BaB_indestructable_block_02", "", (byte) 117);
        if (param0 <= 122) {
          o.c(-9);
        }
        NanoGameClock.field_p[3] = GameScreen.field_e.a("BaB_indestructable_block_03", "", (byte) 118);
        ef.field_a[5] = GameScreen.field_e.a("bab_powerup_extralife", "", (byte) 115);
        ef.field_a[7] = GameScreen.field_e.a("bab_powerup_paddle_shrink", "", (byte) 127);
        ef.field_a[9] = GameScreen.field_e.a("bab_powerup_wipeout", "", (byte) 109);
        ef.field_a[10] = GameScreen.field_e.a("bab_powerup_multiball", "", (byte) 126);
        ef.field_a[12] = GameScreen.field_e.a("bab_powerup_flight_control", "", (byte) 122);
        ef.field_a[14] = GameScreen.field_e.a("bab_powerup_stickypaddle_acquire", "", (byte) 121);
        ef.field_a[16] = GameScreen.field_e.a("bab_powerup_more_bricks", "", (byte) 109);
        ef.field_a[17] = GameScreen.field_e.a("bab_powerup_paddle_grow", "", (byte) 111);
        ef.field_a[18] = ta.uiSounds[5];
        ta.uiSounds[8] = GameScreen.field_e.a("bab_interface_pixeled_transition", "", (byte) 109);
        fr.field_e[0] = GameScreen.field_e.a((byte) -103, "bab_wall_generic_alt1_00", "");
        fr.field_e[1] = GameScreen.field_e.a((byte) 67, "bab_wall_generic_alt1_01", "");
        fr.field_e[2] = GameScreen.field_e.a((byte) 96, "bab_wall_generic_alt1_02", "");
        fr.field_e[3] = GameScreen.field_e.a((byte) 25, "bab_wall_generic_alt1_03", "");
        fr.field_e[4] = GameScreen.field_e.a((byte) -97, "bab_wall_generic_alt1_04", "");
        fr.field_e[5] = GameScreen.field_e.a((byte) -120, "bab_wall_generic_alt1_05", "");
        fr.field_e[6] = GameScreen.field_e.a((byte) 97, "bab_wall_generic_alt1_06", "");
        fr.field_e[7] = GameScreen.field_e.a((byte) -96, "bab_wall_generic_alt1_07", "");
        mh.field_ob[0] = GameScreen.field_e.a((byte) 87, "bab_paddle_generic_00", "");
        mh.field_ob[1] = GameScreen.field_e.a((byte) -123, "bab_paddle_generic_01", "");
        mh.field_ob[2] = GameScreen.field_e.a((byte) 27, "bab_paddle_generic_02", "");
        mh.field_ob[3] = GameScreen.field_e.a((byte) -110, "bab_paddle_generic_03", "");
        mh.field_ob[4] = GameScreen.field_e.a((byte) -96, "bab_paddle_generic_04", "");
        mh.field_ob[5] = GameScreen.field_e.a((byte) 28, "bab_paddle_generic_05", "");
        mh.field_ob[6] = GameScreen.field_e.a((byte) 108, "bab_paddle_generic_06", "");
        mh.field_ob[7] = GameScreen.field_e.a((byte) 24, "bab_paddle_generic_07", "");
        ef.field_a[3] = GameScreen.field_e.a((byte) -116, "bab_powerup_reverse", "");
        ef.field_a[4] = GameScreen.field_e.a((byte) 74, "bab_powerup_superball", "");
        ef.field_a[6] = GameScreen.field_e.a((byte) 53, "bab_powerup_distort_screen", "");
        ef.field_a[8] = GameScreen.field_e.a((byte) -101, "bab_powerup_trampoline", "");
        ef.field_a[11] = GameScreen.field_e.a((byte) -108, "bab_powerup_more_speed", "");
        ef.field_a[13] = GameScreen.field_e.a((byte) -96, "bab_powerup_less_speed", "");
        ef.field_a[15] = GameScreen.field_e.a((byte) 127, "bab_powerup_weak_ball", "");
        ta.uiSounds[7] = GameScreen.field_e.a((byte) -128, "BaB_ball_out_of_play", "");
        ta.uiSounds[12] = GameScreen.field_e.a((byte) -112, "bab_powerup_stickypaddle_stick", "");
        ta.uiSounds[0] = GameScreen.field_e.a((byte) -102, "bab_interface_mouseover", "");
        ta.uiSounds[1] = GameScreen.field_e.a((byte) -116, "bab_interface_sfx_volume", "");
        ta.uiSounds[9] = GameScreen.field_e.a((byte) -99, "bab_achievement", "");
        ta.uiSounds[15] = GameScreen.field_e.a((byte) -104, "BaB_aaaaannnnd_go_FX", "");
        ta.uiSounds[14] = GameScreen.field_e.a((byte) -105, "BaB_get_ready_FX", "");
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_a = null;
        if (param0 == 31583) {
          field_e = null;
          field_c = null;
          field_h = null;
          return;
        }
        o.d(-14);
        field_e = null;
        field_c = null;
        field_h = null;
    }

    final static void a(int param0) {
        int var1 = pe.a((byte) -89);
        int var2 = ClientException.b(param0 + 29830);
        IntKeyIndex.field_c.a((hn.field_a << 1) + var1, var2 + (bh.field_vb << 1), -hn.field_a + np.field_b, false, -bh.field_vb + CachedArchiveSource.field_r);
        if (param0 == -24435) {
          cp.h(param0 ^ 8147);
          return;
        }
        field_b = (mm) null;
        cp.h(param0 ^ 8147);
    }

    static {
        field_a = "Destroy the flashing bricks to get power-ups!";
        field_g = new n();
        field_h = new th(6, 0, 4, 2);
        field_d = 0;
    }
}
