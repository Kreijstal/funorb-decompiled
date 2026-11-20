/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ModelData {
    short[] field_w;
    byte[] field_r;
    NativeModelIntTriple[] nativeIntTriples;
    short[] field_t;
    int[] field_L;
    short[] field_u;
    static long lastNetworkReadTimeMillis;
    int field_D;
    int[] field_f;
    ModelFaceAttachment[] faceAttachments;
    byte[] field_e;
    int[] vertexLabels;
    byte[] field_m;
    short[] faceVertexB;
    short[] field_i;
    short[] field_z;
    int[] vertexY;
    byte[] field_M;
    byte[] field_J;
    short[] faceVertexA;
    int field_B;
    int[] field_I;
    byte[] field_E;
    int[] vertexZ;
    int field_s;
    int[] field_a;
    short[] faceVertexC;
    byte field_d;
    NativeModelIntValue[] nativeIntValues;
    int[] faceLabels;
    int[] vertexX;
    int[] field_F;
    short[] field_H;
    byte[] field_n;
    short[] field_b;
    int[] field_C;
    int faceCount;
    static int field_h;

    final int[][] groupFaceAttachmentIndices(int param0) {
        int var4_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] var2;
        int var3;
        int[][] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[][] var10;
        int[] var11;
        int[][] var12;
        int[][] var12Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = VoidHunters.field_G;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        if (param0 >= -90) {
          this.field_t = (short[]) null;
        }
        var3 = 0;
        for (var4_int = 0; var4_int < this.faceAttachments.length; var4_int++) {
          var5 = this.faceAttachments[var4_int].label;
          if (var5 >= 0) {
            if (var3 < var5) {
              var3 = var5;
            }
            var8[var5] = var8[var5] + 1;
          }
        }
        var12 = new int[var3 + 1][];
        var10 = var12;
        var4 = var10;
        for (var5Lifetime1 = 0; var5Lifetime1 <= var3; var5Lifetime1++) {
          array$2 = new int[var11[var5Lifetime1]];
          var4[var5Lifetime1] = array$2;
          var11[var5Lifetime1] = 0;
        }
        for (var5Lifetime2 = 0; var5Lifetime2 < this.faceAttachments.length; var5Lifetime2++) {
          var6 = this.faceAttachments[var5Lifetime2].label;
          if (var6 >= 0) {
            var12Lifetime1 = var10;
            dupTemp$0 = var2[var6];
            arrayValue$1 = var12Lifetime1[var6];
            var2[var6] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var5Lifetime2;
          }
        }
        return var4;
    }

    final int[][] groupVertexIndices(byte param0, boolean param1) {
        int var6_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int stackIn_3_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int[][] var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int[] var11;
        int[][] var12;
        int[] var13;
        int[][] var14;
        int[][] var14Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = VoidHunters.field_G;
        var13 = new int[256];
        var11 = var13;
        var10 = var11;
        var3 = var10;
        var4 = 0;
        if (!param1) {
          stackIn_3_0 = this.field_D;
        } else {
          stackIn_3_0 = this.field_s;
        }
        var5 = stackIn_3_0;
        if (param0 != -37) {
          this.groupFaceAttachmentIndices(-13);
        }
        for (var6_int = 0; var5 > var6_int; var6_int++) {
          var7 = this.vertexLabels[var6_int];
          if (var7 >= 0) {
            if (var4 < var7) {
              var4 = var7;
            }
            var10[var7] = var10[var7] + 1;
          }
        }
        var14 = new int[1 + var4][];
        var12 = var14;
        var6 = var12;
        for (var7Lifetime1 = 0; var4 >= var7Lifetime1; var7Lifetime1++) {
          array$2 = new int[var13[var7Lifetime1]];
          var6[var7Lifetime1] = array$2;
          var13[var7Lifetime1] = 0;
        }
        var7Lifetime2 = 0;
        while (true) {
          var14Lifetime1 = var12;
          if (var7Lifetime2 >= var5) {
            return var6;
          }
          var8 = this.vertexLabels[var7Lifetime2];
          if (var8 >= 0) {
            dupTemp$0 = var3[var8];
            arrayValue$1 = var14Lifetime1[var8];
            var3[var8] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var7Lifetime2;
          }
          var7Lifetime2++;
        }
    }

    final int[][] groupFaceIndices(int param0) {
        int var4_int = 0;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] var2;
        int var3;
        int[][] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] var9;
        int[][] var10;
        int[] var11;
        int[][] var12;
        int[][] var12Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        var7 = VoidHunters.field_G;
        var11 = new int[256];
        var9 = var11;
        var8 = var9;
        var2 = var8;
        var3 = 0;
        for (var4_int = 0; var4_int < this.faceCount; var4_int++) {
          var5 = this.faceLabels[var4_int];
          if (var5 >= 0) {
            var8[var5] = var8[var5] + 1;
            if (var5 > var3) {
              var3 = var5;
            }
          }
        }
        var12 = new int[var3 + 1][];
        var10 = var12;
        var4 = var10;
        for (var5Lifetime1 = param0; var3 >= var5Lifetime1; var5Lifetime1++) {
          array$2 = new int[var11[var5Lifetime1]];
          var4[var5Lifetime1] = array$2;
          var11[var5Lifetime1] = 0;
        }
        for (var5Lifetime2 = 0; this.faceCount > var5Lifetime2; var5Lifetime2++) {
          var6 = this.faceLabels[var5Lifetime2];
          if (var6 >= 0) {
            var12Lifetime1 = var10;
            dupTemp$0 = var2[var6];
            arrayValue$1 = var12Lifetime1[var6];
            var2[var6] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var5Lifetime2;
          }
        }
        return var4;
    }

    final static void loadGameSprites(ResourceArchive param0, int param1, ResourceArchive param2) {
        ArgbSprite var8 = null;
        IndexedSpriteData[] var9 = null;
        IndexedSpriteData[] var10 = null;
        IndexedSpriteData[] var11 = null;
        IndexedSpriteData[] var12 = null;
        IndexedSpriteData[] var6 = null;
        IndexedSpriteData[] var7 = null;
        try {
          var8 = new ArgbSprite(param0.fetchNamedFile("box_bottom.png", true, ""), (java.awt.Component) ((Object) SetThrusterBindingMoveAndTurnHasOppositeMove.getActiveCanvas((byte) 75)));
          var8.trimTransparentBorders();
          OpenGlVertexBufferObject.field_j = (Sprite) ((Object) var8);
          SetPointDefenceLaserAimarc.field_r = new IndexedSpriteData[138];
          SetPointDefenceLaserAimarc.field_r[0] = IndexedSpriteData.loadFirst(param2, "basic", "objective_icon_attack");
          SetPointDefenceLaserAimarc.field_r[1] = IndexedSpriteData.loadFirst(param2, "basic", "objective_icon_defend");
          SetPointDefenceLaserAimarc.field_r[2] = IndexedSpriteData.loadFirst(param2, "basic", "objective_icon_move");
          SetPointDefenceLaserAimarc.field_r[3] = IndexedSpriteData.loadFirst(param2, "basic", "objective_icon_grab");
          SetPointDefenceLaserAimarc.field_r[4] = IndexedSpriteData.loadFirst(param2, "basic", "tear_drop");
          SetPointDefenceLaserAimarc.field_r[5] = IndexedSpriteData.loadFirst(param2, "basic", "rightmouse");
          SetPointDefenceLaserAimarc.field_r[6] = IndexedSpriteData.loadFirst(param2, "basic", "stars");
          SetPointDefenceLaserAimarc.field_r[7] = IndexedSpriteData.loadFirst(param2, "basic", "star_field");
          SetPointDefenceLaserAimarc.field_r[8] = IndexedSpriteData.loadFirst(param2, "basic", "nebula1");
          SetPointDefenceLaserAimarc.field_r[9] = IndexedSpriteData.loadFirst(param2, "basic", "nebula2");
          SetPointDefenceLaserAimarc.field_r[10] = IndexedSpriteData.loadFirst(param2, "basic", "nebula3");
          SetPointDefenceLaserAimarc.field_r[11] = IndexedSpriteData.loadFirst(param2, "basic", "chassis1");
          SetPointDefenceLaserAimarc.field_r[12] = IndexedSpriteData.loadFirst(param2, "basic", "chassis1_glow");
          SetPointDefenceLaserAimarc.field_r[13] = IndexedSpriteData.loadFirst(param2, "basic", "chassis2");
          SetPointDefenceLaserAimarc.field_r[14] = IndexedSpriteData.loadFirst(param2, "basic", "chassis2_glow");
          SetPointDefenceLaserAimarc.field_r[15] = IndexedSpriteData.loadFirst(param2, "basic", "chassis3");
          SetPointDefenceLaserAimarc.field_r[16] = IndexedSpriteData.loadFirst(param2, "basic", "chassis3_glow");
          SetPointDefenceLaserAimarc.field_r[17] = IndexedSpriteData.loadFirst(param2, "basic", "chassis4");
          SetPointDefenceLaserAimarc.field_r[18] = IndexedSpriteData.loadFirst(param2, "basic", "chassis4_glow");
          SetPointDefenceLaserAimarc.field_r[19] = IndexedSpriteData.loadFirst(param2, "basic", "chassis5");
          SetPointDefenceLaserAimarc.field_r[20] = IndexedSpriteData.loadFirst(param2, "basic", "chassis5_glow");
          SetPointDefenceLaserAimarc.field_r[21] = IndexedSpriteData.loadFirst(param2, "basic", "chassis6");
          SetPointDefenceLaserAimarc.field_r[22] = IndexedSpriteData.loadFirst(param2, "basic", "chassis6_glow");
          SetPointDefenceLaserAimarc.field_r[23] = IndexedSpriteData.loadFirst(param2, "basic", "chassis7");
          SetPointDefenceLaserAimarc.field_r[24] = IndexedSpriteData.loadFirst(param2, "basic", "chassis7_glow");
          SetPointDefenceLaserAimarc.field_r[25] = IndexedSpriteData.loadFirst(param2, "basic", "chassis8");
          SetPointDefenceLaserAimarc.field_r[26] = IndexedSpriteData.loadFirst(param2, "basic", "chassis8_glow");
          SetPointDefenceLaserAimarc.field_r[27] = IndexedSpriteData.loadFirst(param2, "basic", "chassis9");
          SetPointDefenceLaserAimarc.field_r[28] = IndexedSpriteData.loadFirst(param2, "basic", "chassis9_glow");
          var9 = IndexedSpriteData.loadAll(param2, "basic", "box_pack");
          GetSalvoRepairTimeMultiplier.a(SetPointDefenceLaserAimarc.field_r, 31, var9, -25801);
          SetPointDefenceLaserAimarc.field_r[40] = IndexedSpriteData.loadFirst(param2, "basic", "icon_frame_lrg");
          SetPointDefenceLaserAimarc.field_r[41] = IndexedSpriteData.loadFirst(param2, "basic", "icon_frame_lrg_select");
          SetPointDefenceLaserAimarc.field_r[42] = IndexedSpriteData.loadFirst(param2, "basic", "icon_frame_sml");
          SetPointDefenceLaserAimarc.field_r[43] = IndexedSpriteData.loadFirst(param2, "basic", "icon_frame_sml_select");
          SetPointDefenceLaserAimarc.field_r[44] = IndexedSpriteData.loadFirst(param2, "basic", "energy_bar");
          SetPointDefenceLaserAimarc.field_r[45] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assault");
          SetPointDefenceLaserAimarc.field_r[46] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assault2");
          SetPointDefenceLaserAimarc.field_r[47] = IndexedSpriteData.loadFirst(param2, "basic", "icon_convoy");
          SetPointDefenceLaserAimarc.field_r[48] = IndexedSpriteData.loadFirst(param2, "basic", "icon_convoy2");
          SetPointDefenceLaserAimarc.field_r[49] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assassin");
          SetPointDefenceLaserAimarc.field_r[50] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assassin2");
          SetPointDefenceLaserAimarc.field_r[51] = IndexedSpriteData.loadFirst(param2, "basic", "icon_blitz");
          SetPointDefenceLaserAimarc.field_r[52] = IndexedSpriteData.loadFirst(param2, "basic", "icon_blitz2");
          SetPointDefenceLaserAimarc.field_r[53] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assault_double");
          SetPointDefenceLaserAimarc.field_r[54] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assault2_double");
          SetPointDefenceLaserAimarc.field_r[55] = IndexedSpriteData.loadFirst(param2, "basic", "icon_convoy_double");
          SetPointDefenceLaserAimarc.field_r[56] = IndexedSpriteData.loadFirst(param2, "basic", "icon_convoy2_double");
          SetPointDefenceLaserAimarc.field_r[57] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assassin_double");
          SetPointDefenceLaserAimarc.field_r[58] = IndexedSpriteData.loadFirst(param2, "basic", "icon_assassin2_double");
          SetPointDefenceLaserAimarc.field_r[59] = IndexedSpriteData.loadFirst(param2, "basic", "icon_hoard");
          int var5 = 15 % ((51 - param1) / 62);
          SetPointDefenceLaserAimarc.field_r[60] = IndexedSpriteData.loadFirst(param2, "basic", "icon_hoard2");
          SetPointDefenceLaserAimarc.field_r[61] = IndexedSpriteData.loadFirst(param2, "basic", "icon_scavenge");
          SetPointDefenceLaserAimarc.field_r[62] = IndexedSpriteData.loadFirst(param2, "basic", "icon_scavenge2");
          SetPointDefenceLaserAimarc.field_r[63] = IndexedSpriteData.loadFirst(param2, "basic", "icon_resnet");
          SetPointDefenceLaserAimarc.field_r[64] = IndexedSpriteData.loadFirst(param2, "basic", "icon_resnet2");
          SetPointDefenceLaserAimarc.field_r[65] = IndexedSpriteData.loadFirst(param2, "basic", "icon_hold");
          SetPointDefenceLaserAimarc.field_r[66] = IndexedSpriteData.loadFirst(param2, "basic", "icon_hold2");
          SetPointDefenceLaserAimarc.field_r[67] = IndexedSpriteData.loadFirst(param2, "basic", "icon_arena");
          SetPointDefenceLaserAimarc.field_r[68] = IndexedSpriteData.loadFirst(param2, "basic", "icon_arena2");
          SetPointDefenceLaserAimarc.field_r[69] = IndexedSpriteData.loadFirst(param2, "basic", "icon_showdown");
          SetPointDefenceLaserAimarc.field_r[70] = IndexedSpriteData.loadFirst(param2, "basic", "icon_showdown2");
          SetPointDefenceLaserAimarc.field_r[71] = IndexedSpriteData.loadFirst(param2, "basic", "map_width_increase");
          SetPointDefenceLaserAimarc.field_r[72] = IndexedSpriteData.loadFirst(param2, "basic", "map_width_increase_small");
          SetPointDefenceLaserAimarc.field_r[73] = IndexedSpriteData.loadFirst(param2, "basic", "map_width_decrease");
          SetPointDefenceLaserAimarc.field_r[74] = IndexedSpriteData.loadFirst(param2, "basic", "map_width_decrease_small");
          SetPointDefenceLaserAimarc.field_r[75] = IndexedSpriteData.loadFirst(param2, "basic", "map_height_increase");
          SetPointDefenceLaserAimarc.field_r[76] = IndexedSpriteData.loadFirst(param2, "basic", "map_height_increase_small");
          SetPointDefenceLaserAimarc.field_r[77] = IndexedSpriteData.loadFirst(param2, "basic", "map_height_decrease");
          SetPointDefenceLaserAimarc.field_r[78] = IndexedSpriteData.loadFirst(param2, "basic", "map_height_decrease_small");
          SetPointDefenceLaserAimarc.field_r[79] = IndexedSpriteData.loadFirst(param2, "basic", "more_asteroids");
          SetPointDefenceLaserAimarc.field_r[80] = IndexedSpriteData.loadFirst(param2, "basic", "more_asteroids_small");
          SetPointDefenceLaserAimarc.field_r[81] = IndexedSpriteData.loadFirst(param2, "basic", "more_nebula");
          SetPointDefenceLaserAimarc.field_r[82] = IndexedSpriteData.loadFirst(param2, "basic", "more_nebula_small");
          SetPointDefenceLaserAimarc.field_r[83] = IndexedSpriteData.loadFirst(param2, "basic", "more_powerplants");
          SetPointDefenceLaserAimarc.field_r[84] = IndexedSpriteData.loadFirst(param2, "basic", "more_powerplants_small");
          SetPointDefenceLaserAimarc.field_r[85] = IndexedSpriteData.loadFirst(param2, "basic", "more_shields");
          SetPointDefenceLaserAimarc.field_r[86] = IndexedSpriteData.loadFirst(param2, "basic", "more_shields_small");
          SetPointDefenceLaserAimarc.field_r[87] = IndexedSpriteData.loadFirst(param2, "basic", "more_missile_defence");
          SetPointDefenceLaserAimarc.field_r[88] = IndexedSpriteData.loadFirst(param2, "basic", "more_missile_defence_small");
          SetPointDefenceLaserAimarc.field_r[89] = IndexedSpriteData.loadFirst(param2, "basic", "more_armour");
          SetPointDefenceLaserAimarc.field_r[90] = IndexedSpriteData.loadFirst(param2, "basic", "more_armour_small");
          SetPointDefenceLaserAimarc.field_r[91] = IndexedSpriteData.loadFirst(param2, "basic", "more_hull_pieces");
          SetPointDefenceLaserAimarc.field_r[92] = IndexedSpriteData.loadFirst(param2, "basic", "more_hull_pieces_small");
          SetPointDefenceLaserAimarc.field_r[93] = IndexedSpriteData.loadFirst(param2, "basic", "more_sawblades");
          SetPointDefenceLaserAimarc.field_r[94] = IndexedSpriteData.loadFirst(param2, "basic", "more_sawblades_small");
          SetPointDefenceLaserAimarc.field_r[95] = IndexedSpriteData.loadFirst(param2, "basic", "more_special_weapons");
          SetPointDefenceLaserAimarc.field_r[96] = IndexedSpriteData.loadFirst(param2, "basic", "more_special_weapons_small");
          SetPointDefenceLaserAimarc.field_r[97] = IndexedSpriteData.loadFirst(param2, "basic", "more_thrusters");
          SetPointDefenceLaserAimarc.field_r[98] = IndexedSpriteData.loadFirst(param2, "basic", "more_thrusters_small");
          SetPointDefenceLaserAimarc.field_r[99] = IndexedSpriteData.loadFirst(param2, "basic", "more_weapons");
          SetPointDefenceLaserAimarc.field_r[100] = IndexedSpriteData.loadFirst(param2, "basic", "more_weapons_small");
          SetPointDefenceLaserAimarc.field_r[101] = IndexedSpriteData.loadFirst(param2, "basic", "icon_box");
          var10 = IndexedSpriteData.loadAll(param2, "basic", "icons_hud");
          GetSalvoRepairTimeMultiplier.a(SetPointDefenceLaserAimarc.field_r, 102, var10, -25801);
          var11 = IndexedSpriteData.loadAll(param2, "basic", "self_destruct");
          GetSalvoRepairTimeMultiplier.a(SetPointDefenceLaserAimarc.field_r, 112, var11, -25801);
          SetPointDefenceLaserAimarc.field_r[115] = IndexedSpriteData.loadFirst(param2, "basic", "chat");
          var12 = IndexedSpriteData.loadAll(param2, "basic", "frame_outer");
          GetSalvoRepairTimeMultiplier.a(SetPointDefenceLaserAimarc.field_r, 116, var12, -25801);
          SetPointDefenceLaserAimarc.field_r[125] = IndexedSpriteData.loadFirst(param2, "basic", "button_off");
          SetPointDefenceLaserAimarc.field_r[126] = IndexedSpriteData.loadFirst(param2, "basic", "button_on");
          SetPointDefenceLaserAimarc.field_r[127] = IndexedSpriteData.loadFirst(param2, "basic", "buttonbig_off");
          SetPointDefenceLaserAimarc.field_r[128] = IndexedSpriteData.loadFirst(param2, "basic", "buttonbig_on");
          SetPointDefenceLaserAimarc.field_r[129] = IndexedSpriteData.loadFirst(param2, "basic", "buttonsmall_off");
          SetPointDefenceLaserAimarc.field_r[130] = IndexedSpriteData.loadFirst(param2, "basic", "buttonsmall_on");
          var6 = IndexedSpriteData.loadAll(param2, "basic", "slide_bars");
          SetPointDefenceLaserAimarc.field_r[132] = var6[1];
          SetPointDefenceLaserAimarc.field_r[131] = var6[0];
          var7 = IndexedSpriteData.loadAll(param2, "basic", "slide_buttons");
          SetPointDefenceLaserAimarc.field_r[135] = var7[1];
          SetPointDefenceLaserAimarc.field_r[134] = var7[2];
          SetPointDefenceLaserAimarc.field_r[136] = var7[0];
          SetPointDefenceLaserAimarc.field_r[133] = var7[3];
          SetPointDefenceLaserAimarc.field_r[137] = IndexedSpriteData.loadFirst(param2, "basic", "logo");
          GetDebrisThrowable.a(false, "Finished unpacking raw sprites");
          AgeValidator.field_g = true;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "cbb.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private ModelData() throws Throwable {
        throw new Error();
    }

    static {
        field_h = 66;
    }
}
