/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_a;
    static Object field_c;
    private int field_d;
    private int field_b;

    final static void a(cn param0, String param1, int param2, int param3) {
        int var13_int = 0;
        String var20 = null;
        oc var14 = null;
        String var21 = null;
        oc var15 = null;
        String var22 = null;
        int var17 = 0;
        Object var19 = null;
        int var18 = TombRacer.field_G ? 1 : 0;
        sra var19_ref = (sra) (Object) dma.field_l;
        var19_ref.a(param2, (byte) 47, param1);
        dd.field_b = new oc[13];
        oc var5 = gha.a("", "characters/models/deaths/gibs", 33, param0);
        oc var6 = gha.a("", "characters/models/props/jadeidol", 122, param0);
        oc var7 = gha.a("", "characters/models/props/jadeidol2", 48, param0);
        oc var8 = gha.a("", "characters/models/deaths/ashes", -112, param0);
        oc var9 = gha.a("", "characters/models/props/gun", 57, param0);
        oc var10 = gha.a("", "characters/models/props/key", 97, param0);
        oc var11 = gha.a("", "characters/models/deaths/henryj_ashes", -118, param0);
        oc var12 = gha.a("", "characters/models/deaths/henryj_gibs", 104, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        for (var13_int = 0; var13_int > -14; var13_int++) {
            var20 = gn.field_w[var13_int];
            if (-10 != var13_int) {
                // if_icmpeq L210
                var14 = gha.a("", "characters/models/deaths/" + var20 + "_gibs", -128, param0);
            } else {
                var14 = var12;
            }
            dd.field_b[var13_int] = new oc(new oc[9], 9);
        }
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        hl.field_c = new oc[13];
        for (var13_int = 0; 13 > var13_int; var13_int++) {
            var21 = gn.field_w[var13_int];
            var15 = gha.a("", "characters/models/deaths/body_parts/" + var21 + "_inhalf", -123, param0);
            hl.field_c[var13_int] = new oc(new oc[2], 2);
        }
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        mh.field_K = new oc[13];
        for (var13_int = 0; -14 < (var13_int ^ -1); var13_int++) {
            var22 = gn.field_w[var13_int];
            var15 = gha.a("", "characters/models/deaths/body_parts/" + var22 + "_beheaded", -113, param0);
            mh.field_K[var13_int] = new oc(new oc[2], 2);
        }
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        ea.field_l = new oc[115];
        ea.field_l[0] = gha.a("", "objects/wheeledblock/wheeledblock", -112, param0);
        ea.field_l[109] = gha.a("", "objects/mirrorblock/mirrorblock_immovable", -126, param0);
        ea.field_l[1] = gha.a("", "objects/mirrorblock/mirrorblock", 67, param0);
        ea.field_l[2] = gha.a("", "objects/rotatorblocks/rotatorblock", 78, param0);
        ea.field_l[3] = gha.a("", "objects/rotatorblocks/rotatorblock_floatingasifbymagic", -109, param0);
        ea.field_l[4] = gha.a("", "objects/block/block", -117, param0);
        ea.field_l[5] = gha.a("", "objects/crumblyblock/crumblyblock", -117, param0);
        ea.field_l[6] = gha.a("", "objects/faceblock/faceblock", -113, param0);
        ea.field_l[7] = gha.a("", "objects/gunblock/gunblock", -120, param0);
        ea.field_l[8] = gha.a("", "objects/targetblock/targetblock", 115, param0);
        ea.field_l[9] = gha.a("", "objects/keyholeblock/models/keyholeblock", -116, param0);
        ea.field_l[10] = gha.a("", "objects/keyholeblock/models/keyholeblock_for_anim", -125, param0);
        ea.field_l[12] = gha.a("", "objects/dartspitter/dartspitter", 54, param0);
        ea.field_l[11] = gha.a("", "objects/firespitter/firespitter", 55, param0);
        ea.field_l[13] = gha.a("", "objects/sawbladethrower/sawbladethrower", -120, param0);
        ea.field_l[14] = gha.a("", "objects/laserhead/laserhead_green", -124, param0);
        ea.field_l[15] = gha.a("", "objects/laserhead/laserhead_white", 34, param0);
        ea.field_l[16] = gha.a("", "objects/laserhead/laserhead_red", -116, param0);
        ea.field_l[17] = gha.a("", "objects/boulder/boulder", 0, param0);
        ea.field_l[23] = gha.a("", "objects/tower/tower", -128, param0);
        ea.field_l[24] = gha.a("", "objects/cauldron/cauldron", -116, param0);
        ea.field_l[25] = gha.a("", "objects/cauldron/cauldron_active", 122, param0);
        ea.field_l[26] = gha.a("", "objects/portal/portal", 75, param0);
        ea.field_l[27] = gha.a("", "objects/mirror/mirror", -116, param0);
        ea.field_l[28] = gha.a("", "pits/chasmkit/pitblackness", 7, param0);
        ea.field_l[29] = gha.a("", "pits/chasmkit/chasm_innercorner_brick", 90, param0);
        ea.field_l[30] = gha.a("", "pits/chasmkit/chasm_corner_brick", 79, param0);
        ea.field_l[31] = gha.a("", "pits/chasmkit/chasm_straight_brick1", 23, param0);
        ea.field_l[32] = gha.a("", "pits/chasmkit/chasm_straight_brick2", 24, param0);
        ea.field_l[33] = gha.a("", "pits/chasmkit/chasm_straight_brick3", 23, param0);
        ea.field_l[34] = gha.a("", "pits/chasmkit/chasm_straight_brick4", 51, param0);
        ea.field_l[35] = gha.a("", "pits/chasmkit/chasm_straight_brick5", -120, param0);
        ea.field_l[36] = gha.a("", "pits/chasmkit/chasm_straight_brick6", 60, param0);
        ea.field_l[37] = gha.a("", "pits/chasmkit/chasm_straight_brick7", -121, param0);
        ea.field_l[38] = gha.a("", "pits/chasmkit/chasm_straight_brick8", -121, param0);
        ea.field_l[39] = gha.a("", "pits/chasmkit/chasm_straight_brick9", 71, param0);
        ea.field_l[40] = gha.a("", "pits/shallowpitkit/shallowpit_side1", -115, param0);
        ea.field_l[41] = gha.a("", "pits/shallowpitkit/shallowpit_side2", -122, param0);
        ea.field_l[42] = gha.a("", "pits/shallowpitkit/shallowpit_corner1", 56, param0);
        ea.field_l[43] = gha.a("", "pits/shallowpitkit/shallowpit_corner2", 86, param0);
        ea.field_l[44] = gha.a("", "pits/shallowpitkit/shallowpit_centre", 57, param0);
        ea.field_l[47] = gha.a("", "objects/brazier/brazier", -109, param0);
        ea.field_l[48] = gha.a("", "objects/torch/torch", -122, param0);
        ea.field_l[49] = gha.a("", "objects/torch/torchtop", -125, param0);
        ea.field_l[50] = gha.a("", "objects/spittingtorch/spittingtorch", -109, param0);
        ea.field_l[51] = gha.a("", "platforms/crumbling/platform1", -116, param0);
        ea.field_l[52] = gha.a("", "platforms/crumbling/platform2", -127, param0);
        ea.field_l[53] = gha.a("", "platforms/crumbling/platform3", 51, param0);
        ea.field_l[110] = gha.a("", "platforms/crumbling_grey/platform1_grey", -125, param0);
        ea.field_l[111] = gha.a("", "platforms/crumbling_grey/platform2_grey", 112, param0);
        ea.field_l[112] = gha.a("", "platforms/crumbling_grey/platform3_grey", -125, param0);
        ea.field_l[54] = gha.a("", "platforms/kit/side1", -124, param0);
        ea.field_l[55] = gha.a("", "platforms/kit/side2", 125, param0);
        ea.field_l[56] = gha.a("", "platforms/kit/side3", 42, param0);
        ea.field_l[57] = gha.a("", "platforms/kit/corner1", -128, param0);
        ea.field_l[58] = gha.a("", "platforms/kit/corner2", 5, param0);
        ea.field_l[59] = gha.a("", "platforms/kit/corner3", 80, param0);
        ea.field_l[60] = gha.a("", "platforms/kit/center1", 29, param0);
        ea.field_l[61] = gha.a("", "platforms/kit/center2", -127, param0);
        ea.field_l[62] = gha.a("", "platforms/ropebridge/bridge_end_1", 81, param0);
        ea.field_l[63] = gha.a("", "platforms/ropebridge/bridge_tile_1", 83, param0);
        ea.field_l[64] = gha.a("", "platforms/ropebridge/bridge_tile_2", -128, param0);
        ea.field_l[65] = gha.a("", "platforms/ropebridge/bridge_tile_3", 15, param0);
        ea.field_l[21] = gha.a("", "objects/pressurepads/small_once_off", 69, param0);
        ea.field_l[93] = gha.a("", "objects/pressurepads/small_once_nearly", -109, param0);
        ea.field_l[22] = gha.a("", "objects/pressurepads/small_once_on", -114, param0);
        ea.field_l[96] = gha.a("", "objects/pressurepads/small_sensor_off", 107, param0);
        ea.field_l[97] = gha.a("", "objects/pressurepads/small_sensor_nearly", 99, param0);
        ea.field_l[98] = gha.a("", "objects/pressurepads/small_sensor_on", -118, param0);
        ea.field_l[45] = gha.a("", "objects/pressurepads/big_once_off", 68, param0);
        ea.field_l[105] = gha.a("", "objects/pressurepads/big_once_nearly", -123, param0);
        ea.field_l[46] = gha.a("", "objects/pressurepads/big_once_on", 108, param0);
        ea.field_l[106] = gha.a("", "objects/pressurepads/big_sensor_off", -115, param0);
        ea.field_l[107] = gha.a("", "objects/pressurepads/big_sensor_nearly", -109, param0);
        ea.field_l[108] = gha.a("", "objects/pressurepads/big_sensor_on", -128, param0);
        ea.field_l[104] = gha.a("", "objects/pressurepads/kit_end_sensor_off", 15, param0);
        ea.field_l[102] = gha.a("", "objects/pressurepads/kit_end_sensor_nearly", -126, param0);
        ea.field_l[100] = gha.a("", "objects/pressurepads/kit_end_sensor_on", 117, param0);
        ea.field_l[103] = gha.a("", "objects/pressurepads/kit_mid_sensor_off", -122, param0);
        ea.field_l[101] = gha.a("", "objects/pressurepads/kit_mid_sensor_nearly", -118, param0);
        ea.field_l[99] = gha.a("", "objects/pressurepads/kit_mid_sensor_on", -112, param0);
        ea.field_l[69] = gha.a("", "objects/pressurepads/kit_end_once_off", 41, param0);
        ea.field_l[95] = gha.a("", "objects/pressurepads/kit_end_once_nearly", -114, param0);
        ea.field_l[67] = gha.a("", "objects/pressurepads/kit_end_once_on", -111, param0);
        ea.field_l[68] = gha.a("", "objects/pressurepads/kit_mid_once_off", -113, param0);
        ea.field_l[94] = gha.a("", "objects/pressurepads/kit_mid_once_nearly", 111, param0);
        ea.field_l[66] = gha.a("", "objects/pressurepads/kit_mid_once_on", -111, param0);
        ea.field_l[70] = gha.a("", "objects/bigblock/bigblock", -126, param0);
        ea.field_l[71] = gha.a("", "pits/chasmkit/chasm_deeper", -119, param0);
        ea.field_l[72] = gha.a("", "pits/chasmkit/chasm_deeper_corner", 119, param0);
        ea.field_l[73] = gha.a("", "pits/chasmkit/chasm_deeper_innercorner", -110, param0);
        ea.field_l[74] = gha.a("", "objects/crusher/crusher", 88, param0);
        ea.field_l[75] = gha.a("", "objects/trapdoor/trapdoor", -111, param0);
        ea.field_l[76] = gha.a("", "objects/sawblade/sawblade", 101, param0);
        ea.field_l[77] = gha.a("", "objects/pillar/pillar", -124, param0);
        ea.field_l[78] = gha.a("", "objects/pillar/pillar2", 99, param0);
        ea.field_l[79] = gha.a("", "objects/pillar/pillar3", -110, param0);
        ea.field_l[80] = gha.a("", "pits/chasmkit/lava_a", 0, param0);
        ea.field_l[81] = gha.a("", "pits/chasmkit/lava_b", 1, param0);
        ea.field_l[82] = gha.a("", "pits/chasmkit/lava_c", 45, param0);
        ea.field_l[83] = gha.a("", "pits/chasmkit/lava_d", -109, param0);
        ea.field_l[84] = gha.a("", "pits/chasmkit/lava_e", -120, param0);
        ea.field_l[85] = gha.a("", "pits/chasmkit/lava_f", 50, param0);
        ea.field_l[86] = gha.a("", "pits/chasmkit/lava_g", -119, param0);
        ea.field_l[87] = gha.a("", "pits/chasmkit/lava_h", 38, param0);
        ea.field_l[88] = gha.a("", "pits/chasmkit/lava_i", 23, param0);
        ea.field_l[89] = gha.a("", "pits/chasmkit/lava_rocks", -111, param0);
        ea.field_l[90] = gha.a("", "pits/chasmkit/chasm_deeper_lava", -123, param0);
        ea.field_l[91] = gha.a("", "pits/chasmkit/chasm_deeper_corner_lava", 48, param0);
        ea.field_l[92] = gha.a("", "pits/chasmkit/chasm_deeper_innercorner_lava", -126, param0);
        ea.field_l[113] = gha.a("", "pits/chasmkit/chasm_straight_impassable1_lip", -121, param0);
        ea.field_l[114] = gha.a("", "pits/chasmkit/chasm_straight_impassable2_lip", 67, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        vk.field_e = new oc[26];
        vk.field_e[0] = gha.a("", "walls/wallkit/wall_straight_1a", 85, param0);
        vk.field_e[1] = gha.a("", "walls/wallkit/wall_straight_1b", 124, param0);
        vk.field_e[2] = gha.a("", "walls/wallkit/wall_straight_2a", -127, param0);
        vk.field_e[3] = gha.a("", "walls/wallkit/wall_straight_2b", -128, param0);
        vk.field_e[4] = gha.a("", "walls/wallkit/wall_2sided_a", 21, param0);
        vk.field_e[5] = gha.a("", "walls/wallkit/wall_2sided_b", 24, param0);
        vk.field_e[6] = gha.a("", "walls/wallkit/wall_3sided_a", 109, param0);
        vk.field_e[7] = gha.a("", "walls/wallkit/wall_3sided_b", -121, param0);
        vk.field_e[8] = gha.a("", "walls/wallkit/wall_4sided_pillar_1", 106, param0);
        vk.field_e[9] = gha.a("", "walls/wallkit/wall_4sided_pillar_2", 46, param0);
        vk.field_e[10] = gha.a("", "walls/wallkit/wall_corner_1", -125, param0);
        vk.field_e[11] = gha.a("", "walls/wallkit/wall_corner_2", -109, param0);
        vk.field_e[12] = gha.a("", "walls/wallkit/wall_end_pillar_left", 115, param0);
        vk.field_e[13] = gha.a("", "walls/wallkit/wall_end_pillar_right", -113, param0);
        vk.field_e[14] = gha.a("", "walls/wallkit/wall_top", -124, param0);
        vk.field_e[15] = gha.a("", "walls/wallkit/wall_top_innercorner", -125, param0);
        vk.field_e[16] = gha.a("", "walls/wallkit/wall_top_blank", 93, param0);
        vk.field_e[17] = gha.a("", "walls/wallkit/wall_top_fadestraight", 90, param0);
        vk.field_e[19] = gha.a("", "walls/wallkit/wall_top_fadeoutercorner", -119, param0);
        vk.field_e[18] = gha.a("", "walls/wallkit/wall_top_fadeinnercorner", 104, param0);
        vk.field_e[20] = gha.a("", "walls/wallkit/door_3x1_left", -124, param0);
        vk.field_e[21] = gha.a("", "walls/wallkit/door_3x1_right", -119, param0);
        vk.field_e[22] = gha.a("", "walls/wallkit/door_3x1_lintel", -126, param0);
        vk.field_e[23] = gha.a("", "walls/wallkit/door_4x1_left", 115, param0);
        vk.field_e[24] = gha.a("", "walls/wallkit/door_4x1_right", -128, param0);
        vk.field_e[25] = gha.a("", "walls/wallkit/door_4x1_lintel", -117, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        dq.field_h = new oc[8];
        dq.field_h[0] = gha.a("", "objects/coin/coin", -110, param0);
        dq.field_h[1] = gha.a("", "objects/bagoloot/bagoloot", -126, param0);
        dq.field_h[2] = gha.a("", "objects/jadeidol/static_jade_idol", 94, param0);
        dq.field_h[3] = gha.a("", "objects/lantern/lantern", -115, param0);
        dq.field_h[4] = gha.a("", "objects/key/static_key", -121, param0);
        dq.field_h[5] = gha.a("", "objects/gun/static_gun", -116, param0);
        dq.field_h[6] = gha.a("", "objects/ripmarker/ripmarker", -118, param0);
        dq.field_h[7] = gha.a("", "objects/speedboost/speedboost", -114, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        gta.field_f = new oc[5];
        gta.field_f[1] = gha.a("", "objects/plants/plant_01_green", 58, param0);
        gta.field_f[0] = gha.a("", "objects/plants/plant_01_red", 51, param0);
        gta.field_f[2] = gha.a("", "objects/plants/plant_02", 15, param0);
        gta.field_f[3] = gha.a("", "objects/plants/flower", 86, param0);
        gta.field_f[4] = gha.a("", "objects/plants/hangingmoss1", -118, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        cba.field_b = new oc[26];
        cba.field_b[0] = gha.a("", "floortiles/brickfloor1a", 74, param0);
        cba.field_b[1] = gha.a("", "floortiles/brickfloor1b", 118, param0);
        cba.field_b[2] = gha.a("", "floortiles/brickfloor1c", -112, param0);
        cba.field_b[3] = gha.a("", "floortiles/brickfloor1d", -112, param0);
        cba.field_b[4] = gha.a("", "floortiles/brickfloor2a", -121, param0);
        cba.field_b[5] = gha.a("", "floortiles/brickfloor2b", 121, param0);
        cba.field_b[6] = gha.a("", "floortiles/brickfloor2c", 119, param0);
        cba.field_b[7] = gha.a("", "floortiles/brickfloor2d", 41, param0);
        cba.field_b[8] = gha.a("", "floortiles/brickfloor3a", -128, param0);
        cba.field_b[9] = gha.a("", "floortiles/brickfloor3b", 116, param0);
        cba.field_b[10] = gha.a("", "floortiles/brickfloor3c", 113, param0);
        cba.field_b[11] = gha.a("", "floortiles/brickfloor3d", -112, param0);
        cba.field_b[12] = gha.a("", "floortiles/brickfloor4a", 126, param0);
        cba.field_b[13] = gha.a("", "floortiles/brickfloor4b", -127, param0);
        cba.field_b[14] = gha.a("", "floortiles/brickfloor4c", 79, param0);
        cba.field_b[15] = gha.a("", "floortiles/brickfloor4d", 40, param0);
        cba.field_b[16] = gha.a("", "floortiles/sand1", 78, param0);
        cba.field_b[17] = gha.a("", "floortiles/sand2", -118, param0);
        cba.field_b[18] = gha.a("", "floortiles/overlaytiles/sandoverlay_straight", 73, param0);
        cba.field_b[19] = gha.a("", "floortiles/overlaytiles/sandoverlay_innercorner", -118, param0);
        cba.field_b[20] = gha.a("", "floortiles/overlaytiles/sandoverlay_outercorner", 37, param0);
        cba.field_b[21] = gha.a("", "floortiles/overlaytiles/shadow_edge", 62, param0);
        cba.field_b[22] = gha.a("", "floortiles/overlaytiles/shadow_corner", -125, param0);
        cba.field_b[23] = gha.a("", "floortiles/overlaytiles/shadow_outercorner", 33, param0);
        cba.field_b[25] = gha.a("", "floortiles/overlaytiles/fadetoblack_2x2", -121, param0);
        param2++;
        var19_ref.a(param2, (byte) 47, param1);
        an.field_g = new oc[5];
        oc var13 = gha.a("", "monsters/skeleton/new_skeleton", -126, param0);
        var14 = gha.a("", "monsters/skeleton/new_skeleton_nojoints", -125, param0);
        var15 = gha.a("", "monsters/skeleton/new_skeleton_bandaged", 115, param0);
        oc var16 = gha.a("", "monsters/skeleton/new_skeleton_scorched", 46, param0);
        an.field_g[0] = new oc(new oc[1], 1);
        an.field_g[1] = new oc(new oc[1], 1);
        an.field_g[2] = new oc(new oc[1], 1);
        an.field_g[3] = new oc(new oc[1], 1);
        an.field_g[4] = gha.a("", "monsters/snakes/snake_kingsnake", 33, param0);
        nj.field_p = new oc[17];
        nj.field_p[0] = gha.a("", "effects/projectile_blade", 116, param0);
        nj.field_p[1] = gha.a("", "effects/projectile_bullet", -122, param0);
        nj.field_p[2] = gha.a("", "effects/projectile_dart", -113, param0);
        nj.field_p[14] = gha.a("", "effects/billboard_fire", 92, param0);
        nj.field_p[15] = gha.a("", "effects/flamethrower/flamethrower_particle", 92, param0);
        nj.field_p[16] = gha.a("", "effects/flamethrower/flamethrower_particle_java", -127, param0);
        nj.field_p[3] = gha.a("", "effects/particle_laser_red", -115, param0);
        nj.field_p[4] = gha.a("", "effects/particle_laser_white", -124, param0);
        nj.field_p[5] = gha.a("", "effects/particle_rock1", 49, param0);
        nj.field_p[6] = gha.a("", "effects/particle_rock2", -116, param0);
        nj.field_p[7] = gha.a("", "effects/particle_rock3", -118, param0);
        nj.field_p[8] = gha.a("", "effects/bubbles/models/cauldron_bubbles", 65, param0);
        nj.field_p[9] = gha.a("", "effects/bubbles/models/lava_bubbles", 53, param0);
        nj.field_p[10] = gha.a("", "objects/youarehere/youarehere_green", -110, param0);
        nj.field_p[11] = gha.a("", "objects/youarehere/youarehere_blue", -119, param0);
        nj.field_p[12] = gha.a("", "objects/youarehere/youarehere_red", 110, param0);
        nj.field_p[13] = gha.a("", "objects/youarehere/youarehere_yellow", 91, param0);
        tba.field_l = gha.a("", "test/javatextures", -117, param0);
        if (param3 > -48) {
            ui.a(57);
        }
        bca.field_a = new int[tba.field_l.field_r.length];
        for (var17 = 0; tba.field_l.field_r.length > var17; var17++) {
            bca.field_a[var17] = tba.field_l.field_r[var17];
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -116 / ((param1 - -4) / 43);
        if (pka.field_b <= param3) {
            if (!(param3 > ss.field_c)) {
                param0 = rp.a(hc.field_h, -16226, gca.field_d, param0);
                param4 = rp.a(hc.field_h, -16226, gca.field_d, param4);
                dfa.a(param3, param4, param0, param2, 0);
            }
        }
    }

    final gpa a(int param0, boolean param1) {
        gpa var3 = null;
        int var4 = 0;
        L0: {
          if (param1) {
            var3 = new gpa(((ui) this).field_b);
            ((ui) this).field_b = ((ui) this).field_b + 1;
            break L0;
          } else {
            var3 = new gpa(((ui) this).field_d);
            ((ui) this).field_d = ((ui) this).field_d + 1;
            if ((((ui) this).field_d ^ -1) <= -257) {
              ((ui) this).field_d = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        var4 = -76 / ((10 - param0) / 55);
        return var3;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 4) {
            Object var2 = null;
            ui.a((cn) null, (String) null, -10, 115);
        }
    }

    final void a(byte param0) {
        ((ui) this).field_b = 1024;
        int var2 = 114 / ((param0 - -4) / 53);
        ((ui) this).field_d = 0;
    }

    public ui() {
        ((ui) this).field_b = 1024;
        ((ui) this).field_d = 0;
    }

    static {
    }
}
