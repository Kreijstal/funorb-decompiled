/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SwitchableIdAllocator {
    static int field_a;
    static Object field_c;
    private int nextLocalId;
    private int nextGlobalId;

    final static void a(ResourceArchive param0, String param1, int param2, int param3) {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var17 = 0;
        ModelData var5 = null;
        ModelData var6 = null;
        ModelData var7 = null;
        ModelData var8 = null;
        ModelData var9 = null;
        ModelData var10 = null;
        ModelData var11 = null;
        ModelData var12 = null;
        int var13_int = 0;
        ModelData var13 = null;
        ModelData var14 = null;
        ModelData var15 = null;
        ModelData var16 = null;
        int var18 = 0;
        Object var19 = null;
        GameAssetLoader var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var13_intLifetime1;
        int var13_intLifetime2;
        var19 = null;
        var18 = TombRacer.field_G ? 1 : 0;
        try {
          var19_ref = (GameAssetLoader) (OpenGlCubeTexture.field_l);
          var19_ref.drawLoadingProgress(param2, (byte) 47, param1);
          SoftReferenceCache.field_b = new ModelData[13];
          var5 = DecodableArrayReader.loadModelData("", "characters/models/deaths/gibs", 33, param0);
          var6 = DecodableArrayReader.loadModelData("", "characters/models/props/jadeidol", 122, param0);
          var7 = DecodableArrayReader.loadModelData("", "characters/models/props/jadeidol2", 48, param0);
          var8 = DecodableArrayReader.loadModelData("", "characters/models/deaths/ashes", -112, param0);
          var9 = DecodableArrayReader.loadModelData("", "characters/models/props/gun", 57, param0);
          var10 = DecodableArrayReader.loadModelData("", "characters/models/props/key", 97, param0);
          var11 = DecodableArrayReader.loadModelData("", "characters/models/deaths/henryj_ashes", -118, param0);
          var12 = DecodableArrayReader.loadModelData("", "characters/models/deaths/henryj_gibs", 104, param0);
          incrementValue$9 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$9, (byte) 47, param1);
          for (var13_int = 0; var13_int < 13; var13_int++) {
            var20 = FadingDialog.field_w[var13_int];
            if (var13_int != 9 &&
              0 != var13_int) {
              var14 = DecodableArrayReader.loadModelData("", "characters/models/deaths/" + var20 + "_gibs", -128, param0);
            } else {
              var14 = var12;
            }
            SoftReferenceCache.field_b[var13_int] = new ModelData(new ModelData[]{DecodableArrayReader.loadModelData("", "characters/models/" + var20, 81, param0), var14, var11, var5, var8, var9, var10, var6, var7}, 9);
          }
          incrementValue$10 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$10, (byte) 47, param1);
          OpenGlBuffer.field_c = new ModelData[13];
          for (var13_intLifetime1 = 0; 13 > var13_intLifetime1; var13_intLifetime1++) {
            var21 = FadingDialog.field_w[var13_intLifetime1];
            var15 = DecodableArrayReader.loadModelData("", "characters/models/deaths/body_parts/" + var21 + "_inhalf", -123, param0);
            OpenGlBuffer.field_c[var13_intLifetime1] = new ModelData(new ModelData[]{var15, var5}, 2);
          }
          incrementValue$11 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$11, (byte) 47, param1);
          DoorwayComponent.field_K = new ModelData[13];
          for (var13_intLifetime2 = 0; var13_intLifetime2 < 13; var13_intLifetime2++) {
            var22 = FadingDialog.field_w[var13_intLifetime2];
            var15 = DecodableArrayReader.loadModelData("", "characters/models/deaths/body_parts/" + var22 + "_beheaded", -113, param0);
            DoorwayComponent.field_K[var13_intLifetime2] = new ModelData(new ModelData[]{var15, var5}, 2);
          }
          incrementValue$12 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$12, (byte) 47, param1);
          C2SActionPacket.field_l = new ModelData[115];
          C2SActionPacket.field_l[0] = DecodableArrayReader.loadModelData("", "objects/wheeledblock/wheeledblock", -112, param0);
          C2SActionPacket.field_l[109] = DecodableArrayReader.loadModelData("", "objects/mirrorblock/mirrorblock_immovable", -126, param0);
          C2SActionPacket.field_l[1] = DecodableArrayReader.loadModelData("", "objects/mirrorblock/mirrorblock", 67, param0);
          C2SActionPacket.field_l[2] = DecodableArrayReader.loadModelData("", "objects/rotatorblocks/rotatorblock", 78, param0);
          C2SActionPacket.field_l[3] = DecodableArrayReader.loadModelData("", "objects/rotatorblocks/rotatorblock_floatingasifbymagic", -109, param0);
          C2SActionPacket.field_l[4] = DecodableArrayReader.loadModelData("", "objects/block/block", -117, param0);
          C2SActionPacket.field_l[5] = DecodableArrayReader.loadModelData("", "objects/crumblyblock/crumblyblock", -117, param0);
          C2SActionPacket.field_l[6] = DecodableArrayReader.loadModelData("", "objects/faceblock/faceblock", -113, param0);
          C2SActionPacket.field_l[7] = DecodableArrayReader.loadModelData("", "objects/gunblock/gunblock", -120, param0);
          C2SActionPacket.field_l[8] = DecodableArrayReader.loadModelData("", "objects/targetblock/targetblock", 115, param0);
          C2SActionPacket.field_l[9] = DecodableArrayReader.loadModelData("", "objects/keyholeblock/models/keyholeblock", -116, param0);
          C2SActionPacket.field_l[10] = DecodableArrayReader.loadModelData("", "objects/keyholeblock/models/keyholeblock_for_anim", -125, param0);
          C2SActionPacket.field_l[12] = DecodableArrayReader.loadModelData("", "objects/dartspitter/dartspitter", 54, param0);
          C2SActionPacket.field_l[11] = DecodableArrayReader.loadModelData("", "objects/firespitter/firespitter", 55, param0);
          C2SActionPacket.field_l[13] = DecodableArrayReader.loadModelData("", "objects/sawbladethrower/sawbladethrower", -120, param0);
          C2SActionPacket.field_l[14] = DecodableArrayReader.loadModelData("", "objects/laserhead/laserhead_green", -124, param0);
          C2SActionPacket.field_l[15] = DecodableArrayReader.loadModelData("", "objects/laserhead/laserhead_white", 34, param0);
          C2SActionPacket.field_l[16] = DecodableArrayReader.loadModelData("", "objects/laserhead/laserhead_red", -116, param0);
          C2SActionPacket.field_l[17] = DecodableArrayReader.loadModelData("", "objects/boulder/boulder", 0, param0);
          C2SActionPacket.field_l[23] = DecodableArrayReader.loadModelData("", "objects/tower/tower", -128, param0);
          C2SActionPacket.field_l[24] = DecodableArrayReader.loadModelData("", "objects/cauldron/cauldron", -116, param0);
          C2SActionPacket.field_l[25] = DecodableArrayReader.loadModelData("", "objects/cauldron/cauldron_active", 122, param0);
          C2SActionPacket.field_l[26] = DecodableArrayReader.loadModelData("", "objects/portal/portal", 75, param0);
          C2SActionPacket.field_l[27] = DecodableArrayReader.loadModelData("", "objects/mirror/mirror", -116, param0);
          C2SActionPacket.field_l[28] = DecodableArrayReader.loadModelData("", "pits/chasmkit/pitblackness", 7, param0);
          C2SActionPacket.field_l[29] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_innercorner_brick", 90, param0);
          C2SActionPacket.field_l[30] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_corner_brick", 79, param0);
          C2SActionPacket.field_l[31] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick1", 23, param0);
          C2SActionPacket.field_l[32] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick2", 24, param0);
          C2SActionPacket.field_l[33] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick3", 23, param0);
          C2SActionPacket.field_l[34] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick4", 51, param0);
          C2SActionPacket.field_l[35] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick5", -120, param0);
          C2SActionPacket.field_l[36] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick6", 60, param0);
          C2SActionPacket.field_l[37] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick7", -121, param0);
          C2SActionPacket.field_l[38] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick8", -121, param0);
          C2SActionPacket.field_l[39] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_brick9", 71, param0);
          C2SActionPacket.field_l[40] = DecodableArrayReader.loadModelData("", "pits/shallowpitkit/shallowpit_side1", -115, param0);
          C2SActionPacket.field_l[41] = DecodableArrayReader.loadModelData("", "pits/shallowpitkit/shallowpit_side2", -122, param0);
          C2SActionPacket.field_l[42] = DecodableArrayReader.loadModelData("", "pits/shallowpitkit/shallowpit_corner1", 56, param0);
          C2SActionPacket.field_l[43] = DecodableArrayReader.loadModelData("", "pits/shallowpitkit/shallowpit_corner2", 86, param0);
          C2SActionPacket.field_l[44] = DecodableArrayReader.loadModelData("", "pits/shallowpitkit/shallowpit_centre", 57, param0);
          C2SActionPacket.field_l[47] = DecodableArrayReader.loadModelData("", "objects/brazier/brazier", -109, param0);
          C2SActionPacket.field_l[48] = DecodableArrayReader.loadModelData("", "objects/torch/torch", -122, param0);
          C2SActionPacket.field_l[49] = DecodableArrayReader.loadModelData("", "objects/torch/torchtop", -125, param0);
          C2SActionPacket.field_l[50] = DecodableArrayReader.loadModelData("", "objects/spittingtorch/spittingtorch", -109, param0);
          C2SActionPacket.field_l[51] = DecodableArrayReader.loadModelData("", "platforms/crumbling/platform1", -116, param0);
          C2SActionPacket.field_l[52] = DecodableArrayReader.loadModelData("", "platforms/crumbling/platform2", -127, param0);
          C2SActionPacket.field_l[53] = DecodableArrayReader.loadModelData("", "platforms/crumbling/platform3", 51, param0);
          C2SActionPacket.field_l[110] = DecodableArrayReader.loadModelData("", "platforms/crumbling_grey/platform1_grey", -125, param0);
          C2SActionPacket.field_l[111] = DecodableArrayReader.loadModelData("", "platforms/crumbling_grey/platform2_grey", 112, param0);
          C2SActionPacket.field_l[112] = DecodableArrayReader.loadModelData("", "platforms/crumbling_grey/platform3_grey", -125, param0);
          C2SActionPacket.field_l[54] = DecodableArrayReader.loadModelData("", "platforms/kit/side1", -124, param0);
          C2SActionPacket.field_l[55] = DecodableArrayReader.loadModelData("", "platforms/kit/side2", 125, param0);
          C2SActionPacket.field_l[56] = DecodableArrayReader.loadModelData("", "platforms/kit/side3", 42, param0);
          C2SActionPacket.field_l[57] = DecodableArrayReader.loadModelData("", "platforms/kit/corner1", -128, param0);
          C2SActionPacket.field_l[58] = DecodableArrayReader.loadModelData("", "platforms/kit/corner2", 5, param0);
          C2SActionPacket.field_l[59] = DecodableArrayReader.loadModelData("", "platforms/kit/corner3", 80, param0);
          C2SActionPacket.field_l[60] = DecodableArrayReader.loadModelData("", "platforms/kit/center1", 29, param0);
          C2SActionPacket.field_l[61] = DecodableArrayReader.loadModelData("", "platforms/kit/center2", -127, param0);
          C2SActionPacket.field_l[62] = DecodableArrayReader.loadModelData("", "platforms/ropebridge/bridge_end_1", 81, param0);
          C2SActionPacket.field_l[63] = DecodableArrayReader.loadModelData("", "platforms/ropebridge/bridge_tile_1", 83, param0);
          C2SActionPacket.field_l[64] = DecodableArrayReader.loadModelData("", "platforms/ropebridge/bridge_tile_2", -128, param0);
          C2SActionPacket.field_l[65] = DecodableArrayReader.loadModelData("", "platforms/ropebridge/bridge_tile_3", 15, param0);
          C2SActionPacket.field_l[21] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_once_off", 69, param0);
          C2SActionPacket.field_l[93] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_once_nearly", -109, param0);
          C2SActionPacket.field_l[22] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_once_on", -114, param0);
          C2SActionPacket.field_l[96] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_sensor_off", 107, param0);
          C2SActionPacket.field_l[97] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_sensor_nearly", 99, param0);
          C2SActionPacket.field_l[98] = DecodableArrayReader.loadModelData("", "objects/pressurepads/small_sensor_on", -118, param0);
          C2SActionPacket.field_l[45] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_once_off", 68, param0);
          C2SActionPacket.field_l[105] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_once_nearly", -123, param0);
          C2SActionPacket.field_l[46] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_once_on", 108, param0);
          C2SActionPacket.field_l[106] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_sensor_off", -115, param0);
          C2SActionPacket.field_l[107] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_sensor_nearly", -109, param0);
          C2SActionPacket.field_l[108] = DecodableArrayReader.loadModelData("", "objects/pressurepads/big_sensor_on", -128, param0);
          C2SActionPacket.field_l[104] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_sensor_off", 15, param0);
          C2SActionPacket.field_l[102] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_sensor_nearly", -126, param0);
          C2SActionPacket.field_l[100] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_sensor_on", 117, param0);
          C2SActionPacket.field_l[103] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_sensor_off", -122, param0);
          C2SActionPacket.field_l[101] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_sensor_nearly", -118, param0);
          C2SActionPacket.field_l[99] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_sensor_on", -112, param0);
          C2SActionPacket.field_l[69] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_once_off", 41, param0);
          C2SActionPacket.field_l[95] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_once_nearly", -114, param0);
          C2SActionPacket.field_l[67] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_end_once_on", -111, param0);
          C2SActionPacket.field_l[68] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_once_off", -113, param0);
          C2SActionPacket.field_l[94] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_once_nearly", 111, param0);
          C2SActionPacket.field_l[66] = DecodableArrayReader.loadModelData("", "objects/pressurepads/kit_mid_once_on", -111, param0);
          C2SActionPacket.field_l[70] = DecodableArrayReader.loadModelData("", "objects/bigblock/bigblock", -126, param0);
          C2SActionPacket.field_l[71] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper", -119, param0);
          C2SActionPacket.field_l[72] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper_corner", 119, param0);
          C2SActionPacket.field_l[73] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper_innercorner", -110, param0);
          C2SActionPacket.field_l[74] = DecodableArrayReader.loadModelData("", "objects/crusher/crusher", 88, param0);
          C2SActionPacket.field_l[75] = DecodableArrayReader.loadModelData("", "objects/trapdoor/trapdoor", -111, param0);
          C2SActionPacket.field_l[76] = DecodableArrayReader.loadModelData("", "objects/sawblade/sawblade", 101, param0);
          C2SActionPacket.field_l[77] = DecodableArrayReader.loadModelData("", "objects/pillar/pillar", -124, param0);
          C2SActionPacket.field_l[78] = DecodableArrayReader.loadModelData("", "objects/pillar/pillar2", 99, param0);
          C2SActionPacket.field_l[79] = DecodableArrayReader.loadModelData("", "objects/pillar/pillar3", -110, param0);
          C2SActionPacket.field_l[80] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_a", 0, param0);
          C2SActionPacket.field_l[81] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_b", 1, param0);
          C2SActionPacket.field_l[82] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_c", 45, param0);
          C2SActionPacket.field_l[83] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_d", -109, param0);
          C2SActionPacket.field_l[84] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_e", -120, param0);
          C2SActionPacket.field_l[85] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_f", 50, param0);
          C2SActionPacket.field_l[86] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_g", -119, param0);
          C2SActionPacket.field_l[87] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_h", 38, param0);
          C2SActionPacket.field_l[88] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_i", 23, param0);
          C2SActionPacket.field_l[89] = DecodableArrayReader.loadModelData("", "pits/chasmkit/lava_rocks", -111, param0);
          C2SActionPacket.field_l[90] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper_lava", -123, param0);
          C2SActionPacket.field_l[91] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper_corner_lava", 48, param0);
          C2SActionPacket.field_l[92] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_deeper_innercorner_lava", -126, param0);
          C2SActionPacket.field_l[113] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_impassable1_lip", -121, param0);
          C2SActionPacket.field_l[114] = DecodableArrayReader.loadModelData("", "pits/chasmkit/chasm_straight_impassable2_lip", 67, param0);
          incrementValue$13 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$13, (byte) 47, param1);
          CourseLayoutFactory.field_e = new ModelData[26];
          CourseLayoutFactory.field_e[0] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_straight_1a", 85, param0);
          CourseLayoutFactory.field_e[1] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_straight_1b", 124, param0);
          CourseLayoutFactory.field_e[2] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_straight_2a", -127, param0);
          CourseLayoutFactory.field_e[3] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_straight_2b", -128, param0);
          CourseLayoutFactory.field_e[4] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_2sided_a", 21, param0);
          CourseLayoutFactory.field_e[5] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_2sided_b", 24, param0);
          CourseLayoutFactory.field_e[6] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_3sided_a", 109, param0);
          CourseLayoutFactory.field_e[7] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_3sided_b", -121, param0);
          CourseLayoutFactory.field_e[8] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_4sided_pillar_1", 106, param0);
          CourseLayoutFactory.field_e[9] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_4sided_pillar_2", 46, param0);
          CourseLayoutFactory.field_e[10] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_corner_1", -125, param0);
          CourseLayoutFactory.field_e[11] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_corner_2", -109, param0);
          CourseLayoutFactory.field_e[12] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_end_pillar_left", 115, param0);
          CourseLayoutFactory.field_e[13] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_end_pillar_right", -113, param0);
          CourseLayoutFactory.field_e[14] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top", -124, param0);
          CourseLayoutFactory.field_e[15] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top_innercorner", -125, param0);
          CourseLayoutFactory.field_e[16] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top_blank", 93, param0);
          CourseLayoutFactory.field_e[17] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top_fadestraight", 90, param0);
          CourseLayoutFactory.field_e[19] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top_fadeoutercorner", -119, param0);
          CourseLayoutFactory.field_e[18] = DecodableArrayReader.loadModelData("", "walls/wallkit/wall_top_fadeinnercorner", 104, param0);
          CourseLayoutFactory.field_e[20] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_3x1_left", -124, param0);
          CourseLayoutFactory.field_e[21] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_3x1_right", -119, param0);
          CourseLayoutFactory.field_e[22] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_3x1_lintel", -126, param0);
          CourseLayoutFactory.field_e[23] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_4x1_left", 115, param0);
          CourseLayoutFactory.field_e[24] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_4x1_right", -128, param0);
          CourseLayoutFactory.field_e[25] = DecodableArrayReader.loadModelData("", "walls/wallkit/door_4x1_lintel", -117, param0);
          incrementValue$14 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$14, (byte) 47, param1);
          ColourRowCacheEntry.field_h = new ModelData[8];
          ColourRowCacheEntry.field_h[0] = DecodableArrayReader.loadModelData("", "objects/coin/coin", -110, param0);
          ColourRowCacheEntry.field_h[1] = DecodableArrayReader.loadModelData("", "objects/bagoloot/bagoloot", -126, param0);
          ColourRowCacheEntry.field_h[2] = DecodableArrayReader.loadModelData("", "objects/jadeidol/static_jade_idol", 94, param0);
          ColourRowCacheEntry.field_h[3] = DecodableArrayReader.loadModelData("", "objects/lantern/lantern", -115, param0);
          ColourRowCacheEntry.field_h[4] = DecodableArrayReader.loadModelData("", "objects/key/static_key", -121, param0);
          ColourRowCacheEntry.field_h[5] = DecodableArrayReader.loadModelData("", "objects/gun/static_gun", -116, param0);
          ColourRowCacheEntry.field_h[6] = DecodableArrayReader.loadModelData("", "objects/ripmarker/ripmarker", -118, param0);
          ColourRowCacheEntry.field_h[7] = DecodableArrayReader.loadModelData("", "objects/speedboost/speedboost", -114, param0);
          incrementValue$15 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$15, (byte) 47, param1);
          HardwareFaceNormal.field_f = new ModelData[5];
          HardwareFaceNormal.field_f[1] = DecodableArrayReader.loadModelData("", "objects/plants/plant_01_green", 58, param0);
          HardwareFaceNormal.field_f[0] = DecodableArrayReader.loadModelData("", "objects/plants/plant_01_red", 51, param0);
          HardwareFaceNormal.field_f[2] = DecodableArrayReader.loadModelData("", "objects/plants/plant_02", 15, param0);
          HardwareFaceNormal.field_f[3] = DecodableArrayReader.loadModelData("", "objects/plants/flower", 86, param0);
          HardwareFaceNormal.field_f[4] = DecodableArrayReader.loadModelData("", "objects/plants/hangingmoss1", -118, param0);
          incrementValue$16 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$16, (byte) 47, param1);
          EllipseShapeDecoder.field_b = new ModelData[26];
          EllipseShapeDecoder.field_b[0] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor1a", 74, param0);
          EllipseShapeDecoder.field_b[1] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor1b", 118, param0);
          EllipseShapeDecoder.field_b[2] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor1c", -112, param0);
          EllipseShapeDecoder.field_b[3] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor1d", -112, param0);
          EllipseShapeDecoder.field_b[4] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor2a", -121, param0);
          EllipseShapeDecoder.field_b[5] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor2b", 121, param0);
          EllipseShapeDecoder.field_b[6] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor2c", 119, param0);
          EllipseShapeDecoder.field_b[7] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor2d", 41, param0);
          EllipseShapeDecoder.field_b[8] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor3a", -128, param0);
          EllipseShapeDecoder.field_b[9] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor3b", 116, param0);
          EllipseShapeDecoder.field_b[10] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor3c", 113, param0);
          EllipseShapeDecoder.field_b[11] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor3d", -112, param0);
          EllipseShapeDecoder.field_b[12] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor4a", 126, param0);
          EllipseShapeDecoder.field_b[13] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor4b", -127, param0);
          EllipseShapeDecoder.field_b[14] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor4c", 79, param0);
          EllipseShapeDecoder.field_b[15] = DecodableArrayReader.loadModelData("", "floortiles/brickfloor4d", 40, param0);
          EllipseShapeDecoder.field_b[16] = DecodableArrayReader.loadModelData("", "floortiles/sand1", 78, param0);
          EllipseShapeDecoder.field_b[17] = DecodableArrayReader.loadModelData("", "floortiles/sand2", -118, param0);
          EllipseShapeDecoder.field_b[18] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/sandoverlay_straight", 73, param0);
          EllipseShapeDecoder.field_b[19] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/sandoverlay_innercorner", -118, param0);
          EllipseShapeDecoder.field_b[20] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/sandoverlay_outercorner", 37, param0);
          EllipseShapeDecoder.field_b[21] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/shadow_edge", 62, param0);
          EllipseShapeDecoder.field_b[22] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/shadow_corner", -125, param0);
          EllipseShapeDecoder.field_b[23] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/shadow_outercorner", 33, param0);
          EllipseShapeDecoder.field_b[25] = DecodableArrayReader.loadModelData("", "floortiles/overlaytiles/fadetoblack_2x2", -121, param0);
          incrementValue$17 = param2;
          param2++;
          var19_ref.drawLoadingProgress(incrementValue$17, (byte) 47, param1);
          TriangleMesh.field_g = new ModelData[5];
          var13 = DecodableArrayReader.loadModelData("", "monsters/skeleton/new_skeleton", -126, param0);
          var14 = DecodableArrayReader.loadModelData("", "monsters/skeleton/new_skeleton_nojoints", -125, param0);
          var15 = DecodableArrayReader.loadModelData("", "monsters/skeleton/new_skeleton_bandaged", 115, param0);
          var16 = DecodableArrayReader.loadModelData("", "monsters/skeleton/new_skeleton_scorched", 46, param0);
          TriangleMesh.field_g[0] = new ModelData(new ModelData[]{var13}, 1);
          TriangleMesh.field_g[1] = new ModelData(new ModelData[]{var14}, 1);
          TriangleMesh.field_g[2] = new ModelData(new ModelData[]{var15}, 1);
          TriangleMesh.field_g[3] = new ModelData(new ModelData[]{var16}, 1);
          TriangleMesh.field_g[4] = DecodableArrayReader.loadModelData("", "monsters/snakes/snake_kingsnake", 33, param0);
          ControllerLocomotor.field_p = new ModelData[17];
          ControllerLocomotor.field_p[0] = DecodableArrayReader.loadModelData("", "effects/projectile_blade", 116, param0);
          ControllerLocomotor.field_p[1] = DecodableArrayReader.loadModelData("", "effects/projectile_bullet", -122, param0);
          ControllerLocomotor.field_p[2] = DecodableArrayReader.loadModelData("", "effects/projectile_dart", -113, param0);
          ControllerLocomotor.field_p[14] = DecodableArrayReader.loadModelData("", "effects/billboard_fire", 92, param0);
          ControllerLocomotor.field_p[15] = DecodableArrayReader.loadModelData("", "effects/flamethrower/flamethrower_particle", 92, param0);
          ControllerLocomotor.field_p[16] = DecodableArrayReader.loadModelData("", "effects/flamethrower/flamethrower_particle_java", -127, param0);
          ControllerLocomotor.field_p[3] = DecodableArrayReader.loadModelData("", "effects/particle_laser_red", -115, param0);
          ControllerLocomotor.field_p[4] = DecodableArrayReader.loadModelData("", "effects/particle_laser_white", -124, param0);
          ControllerLocomotor.field_p[5] = DecodableArrayReader.loadModelData("", "effects/particle_rock1", 49, param0);
          ControllerLocomotor.field_p[6] = DecodableArrayReader.loadModelData("", "effects/particle_rock2", -116, param0);
          ControllerLocomotor.field_p[7] = DecodableArrayReader.loadModelData("", "effects/particle_rock3", -118, param0);
          ControllerLocomotor.field_p[8] = DecodableArrayReader.loadModelData("", "effects/bubbles/models/cauldron_bubbles", 65, param0);
          ControllerLocomotor.field_p[9] = DecodableArrayReader.loadModelData("", "effects/bubbles/models/lava_bubbles", 53, param0);
          ControllerLocomotor.field_p[10] = DecodableArrayReader.loadModelData("", "objects/youarehere/youarehere_green", -110, param0);
          ControllerLocomotor.field_p[11] = DecodableArrayReader.loadModelData("", "objects/youarehere/youarehere_blue", -119, param0);
          ControllerLocomotor.field_p[12] = DecodableArrayReader.loadModelData("", "objects/youarehere/youarehere_red", 110, param0);
          ControllerLocomotor.field_p[13] = DecodableArrayReader.loadModelData("", "objects/youarehere/youarehere_yellow", 91, param0);
          MonochromeRowCacheEntry.field_l = DecodableArrayReader.loadModelData("", "test/javatextures", -117, param0);
          if (param3 > -48) {
            SwitchableIdAllocator.releaseStatics(57);
          }
          VariantMask.field_a = new int[MonochromeRowCacheEntry.field_l.field_r.length];
          for (var17 = 0; MonochromeRowCacheEntry.field_l.field_r.length > var17; var17++) {
            VariantMask.field_a[var17] = MonochromeRowCacheEntry.field_l.field_r[var17];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ui.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -116 / ((param1 + 4) / 43);
        if (DialogOverlayDrawing.field_b <= param3 &&
          !(param3 > DiskCacheWorker.field_c)) {
          param0 = CharacterPreview.clamp(LineShape.field_h, -16226, HardwareModelBillboardState.field_d, param0);
          param4 = CharacterPreview.clamp(LineShape.field_h, -16226, HardwareModelBillboardState.field_d, param4);
          GameScreen.drawVerticalSpan(param3, param4, param0, param2, 0);
        }
    }

    final SwitchableId allocate(int param0, boolean param1) {
        SwitchableId var3;
        int var4;
        if (param1) {
          var3 = new SwitchableId(this.nextGlobalId);
          this.nextGlobalId = this.nextGlobalId + 1;
        } else {
          var3 = new SwitchableId(this.nextLocalId);
          this.nextLocalId = this.nextLocalId + 1;
          if (this.nextLocalId >= 256) {
            this.nextLocalId = 0;
          }
        }
        var4 = -76 / ((10 - param0) / 55);
        return var3;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != 4) {
          String var2 = (String) null;
          SwitchableIdAllocator.a((ResourceArchive) null, (String) null, -10, 115);
        }
    }

    final void reset(byte param0) {
        this.nextGlobalId = 1024;
        int var2 = 114 / ((param0 + 4) / 53);
        this.nextLocalId = 0;
    }

    public SwitchableIdAllocator() {
        this.nextGlobalId = 1024;
        this.nextLocalId = 0;
    }

    static {
    }
}
