/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static boolean field_a;
    static byte[] field_d;
    TabStrip field_b;
    static ContextMenuItem[][] field_c;

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$1 = 0;
        int var7 = 0;
        int var8 = 0;
        ResourceArchive var9 = null;
        ef var10 = null;
        ef var11 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Kickabout.field_G;
        try {
          HelpTipDialog.field_I = new AnimationClip[5][17];
          hq.field_b = new AnimationClip[5];
          GameKeyHandler.a(param1, param3, (byte) -69);
          var10 = new ef(0);
          var11 = var10;
          while (!var11.g((byte) 103)) {
          }
          pe.a((byte) 82, var10);
          HelpTipDialog.field_I[0][0] = new AnimationClip(param2, "characters", "ka_tank_aggressive_tackle");
          HelpTipDialog.field_I[0][1] = new AnimationClip(param2, "characters", "ka_tank_fall");
          HelpTipDialog.field_I[0][2] = new AnimationClip(param2, "characters", "ka_tank_fall_stand");
          HelpTipDialog.field_I[0][3] = new AnimationClip(param2, "characters", "ka_tank_idle");
          HelpTipDialog.field_I[0][4] = new AnimationClip(param2, "characters", "ka_striker_kick");
          HelpTipDialog.field_I[0][5] = new AnimationClip(param2, "characters", "ka_tank_run");
          HelpTipDialog.field_I[0][6] = new AnimationClip(param2, "characters", "ka_tank_tackle_stand");
          HelpTipDialog.field_I[0][8] = new AnimationClip(param2, "characters", "ka_tank_diving_header");
          HelpTipDialog.field_I[0][16] = new AnimationClip(param2, "characters", "ka_tank_aeroplane");
          HelpTipDialog.field_I[0][9] = new AnimationClip(param2, "characters", "ka_tank_celebrate_new");
          sk.a(94, 6, 1);
          HelpTipDialog.field_I[3][0] = new AnimationClip(param2, "characters", "ka_scout_aggressive_tackle");
          if (param0 != 20113) {
            var9 = (ResourceArchive) null;
            rf.a(103, (ResourceArchive) null, (ResourceArchive) null, (ResourceArchive) null);
          }
          HelpTipDialog.field_I[3][1] = new AnimationClip(param2, "characters", "ka_scout_fall");
          HelpTipDialog.field_I[3][2] = new AnimationClip(param2, "characters", "ka_scout_fall_stand");
          HelpTipDialog.field_I[3][3] = new AnimationClip(param2, "characters", "ka_scout_idle");
          HelpTipDialog.field_I[3][5] = new AnimationClip(param2, "characters", "ka_scout_run");
          HelpTipDialog.field_I[3][6] = new AnimationClip(param2, "characters", "ka_scout_tackle_stand");
          HelpTipDialog.field_I[3][7] = new AnimationClip(param2, "characters", "ka_scout_tackle_delay");
          HelpTipDialog.field_I[3][16] = new AnimationClip(param2, "characters", "ka_scout_aeroplane");
          HelpTipDialog.field_I[3][9] = new AnimationClip(param2, "characters", "ka_scout_celebrate_new");
          sk.a(-113, 6, 2);
          HelpTipDialog.field_I[2][0] = new AnimationClip(param2, "characters", "ka_specialist_aggressive_tackle");
          HelpTipDialog.field_I[2][1] = new AnimationClip(param2, "characters", "ka_specialist_fall");
          HelpTipDialog.field_I[2][2] = new AnimationClip(param2, "characters", "ka_specialist_fall_stand");
          HelpTipDialog.field_I[2][3] = new AnimationClip(param2, "characters", "ka_specialist_idle");
          HelpTipDialog.field_I[2][5] = new AnimationClip(param2, "characters", "ka_specialist_run");
          HelpTipDialog.field_I[2][6] = new AnimationClip(param2, "characters", "ka_specialist_tackle_stand");
          HelpTipDialog.field_I[2][16] = new AnimationClip(param2, "characters", "ka_specialist_aeroplane");
          HelpTipDialog.field_I[2][9] = new AnimationClip(param2, "characters", "ka_specialist_celebrate_new");
          sk.a(param0 ^ -20164, 6, 3);
          HelpTipDialog.field_I[1][0] = new AnimationClip(param2, "characters", "ka_striker_aggressive_tackle");
          HelpTipDialog.field_I[1][1] = new AnimationClip(param2, "characters", "ka_striker_fall");
          HelpTipDialog.field_I[1][2] = new AnimationClip(param2, "characters", "ka_striker_fall_stand");
          HelpTipDialog.field_I[1][3] = new AnimationClip(param2, "characters", "ka_striker_idle");
          HelpTipDialog.field_I[1][5] = new AnimationClip(param2, "characters", "ka_striker_run");
          HelpTipDialog.field_I[1][6] = new AnimationClip(param2, "characters", "ka_striker_tackle_stand");
          HelpTipDialog.field_I[1][16] = new AnimationClip(param2, "characters", "ka_striker_aeroplane");
          HelpTipDialog.field_I[1][9] = new AnimationClip(param2, "characters", "ka_striker_celebrate_new");
          sk.a(80, 6, 4);
          HelpTipDialog.field_I[4][10] = new AnimationClip(param2, "characters", "ka_keeper_basic_catch");
          HelpTipDialog.field_I[4][11] = new AnimationClip(param2, "characters", "ka_keeper_l_dive_stand");
          HelpTipDialog.field_I[4][12] = new AnimationClip(param2, "characters", "ka_keeper_l_dive_static");
          HelpTipDialog.field_I[4][13] = new AnimationClip(param2, "characters", "ka_keeper_r_dive_stand");
          HelpTipDialog.field_I[4][14] = new AnimationClip(param2, "characters", "ka_keeper_r_dive_static");
          HelpTipDialog.field_I[4][3] = new AnimationClip(param2, "characters", "ka_keeper_idle");
          HelpTipDialog.field_I[4][4] = new AnimationClip(param2, "characters", "ka_keeper_kick");
          HelpTipDialog.field_I[4][5] = new AnimationClip(param2, "characters", "ka_keeper_run");
          HelpTipDialog.field_I[4][15] = new AnimationClip(param2, "characters", "ka_keeper_l_shuffle");
          HelpTipDialog.field_I[4][0] = new AnimationClip(param2, "characters", "ka_keeper_aggressive_tackle");
          HelpTipDialog.field_I[4][6] = new AnimationClip(param2, "characters", "ka_keeper_tackle_stand");
          sk.a(89, 6, 5);
          hq.field_b[0] = new AnimationClip(param2, "fans", "fan01_cheer");
          hq.field_b[1] = new AnimationClip(param2, "fans", "fan02_cheer");
          hq.field_b[2] = new AnimationClip(param2, "fans", "fan03_cheer");
          hq.field_b[3] = new AnimationClip(param2, "fans", "fan04_cheer");
          hq.field_b[4] = new AnimationClip(param2, "fans", "fan05_cheer");
          for (var5 = 0; var5 < 5; var5++) {
            for (var6 = 0; var6 < 17; var6++) {
              var7 = 0;
              while (HelpTipDialog.field_I[var5][var6] == null) {
                incrementValue$1 = var7;
                var7++;
                HelpTipDialog.field_I[var5][var6] = HelpTipDialog.field_I[incrementValue$1][var6];
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("rf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_b.a(true, param3, param0, var6, var7, param2, param1);
        du.field_f.setBounds(true, TriangleMesh.field_R.field_q, 0, 0, sh.field_c);
        int var8 = 17 % ((-10 - param4) / 63);
        AlphaContainer.field_E.setBounds(true, -2 - TeamSelectionAgent.field_f + (TriangleMesh.field_R.field_q - 80) - 2, 0, 2 + sh.field_c, 18);
        ph.field_f.setBounds(true, 82 + TeamSelectionAgent.field_f, -80 + (-TeamSelectionAgent.field_f + TriangleMesh.field_R.field_q) - 2, sh.field_c + 2, 18);
        ei.field_d.a(TeamSelectionAgent.field_f, -sh.field_c + (TriangleMesh.field_R.field_mb - 22), 20, 20 + sh.field_c + 2, TriangleMesh.field_R.field_q, 92, 2, 0);
        TournamentChampionDialog.field_F.a(2, TeamSelectionAgent.field_f, (byte) 19, 20);
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var4Lifetime2;
        int var3Lifetime4;
        int var4Lifetime1Lifetime1;
        var6 = Kickabout.field_G;
        try {
          var13 = new int[256];
          for (var2 = 0; var2 < var13.length; var2++) {
            var3 = Math.min(255, 3 * var2 >> 1);
            if (var3 <= 128) {
              stackIn_6_0 = var3 << 1;
            } else {
              stackIn_6_0 = 511 - (var3 << 1);
            }
            var3Lifetime4 = stackIn_6_0;
            for (var4 = 0; var4 < 3; var4++) {
              var3Lifetime4 = var3Lifetime4 * var3Lifetime4 >> 8;
            }
            var13[var2] = var3Lifetime4;
          }
          var14 = new int[256];
          for (var3Lifetime1 = 0; var3Lifetime1 < var14.length; var3Lifetime1++) {
            var4Lifetime1 = Math.min(255, 5 * var3Lifetime1 >> 2);
            if (var4Lifetime1 < 128) {
              stackIn_17_0 = var4Lifetime1 << 1;
            } else {
              stackIn_17_0 = -(var4Lifetime1 << 1) + 511;
            }
            var4Lifetime1Lifetime1 = stackIn_17_0;
            for (var5 = 0; 3 > var5; var5++) {
              var4Lifetime1Lifetime1 = var4Lifetime1Lifetime1 * var4Lifetime1Lifetime1 >> 8;
            }
            var14[var3Lifetime1] = var4Lifetime1Lifetime1;
          }
          kj.field_b = new byte[210][];
          PlayerStatSortCriterion.field_n = new int[16];
          TrinketUnlockNotice.field_a = new byte[16][];
          for (var3Lifetime2 = 0; var3Lifetime2 < 210; var3Lifetime2++) {
            kj.field_b[var3Lifetime2] = eo.a(var13, var3Lifetime2, 210);
          }
          var4Lifetime2 = -20 % ((param0 + 71) / 47);
          for (var3Lifetime3 = 0; var3Lifetime3 < 16; var3Lifetime3++) {
            PlayerStatSortCriterion.field_n[var3Lifetime3] = (-(90 * var3Lifetime3) + 1440 >> 4) + 72;
            TrinketUnlockNotice.field_a[var3Lifetime3] = eo.a(var14, var3Lifetime3, 16, PlayerStatSortCriterion.field_n[var3Lifetime3]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "rf.C(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 16) {
          field_c = (ContextMenuItem[][]) null;
        }
        return (param0 & -param0) == param0 ? true : false;
    }

    final static void a(hr param0, int param1, boolean param2) {
        CipherPacketBuffer var5 = null;
        int var4 = 0;
        try {
          if (!param2) {
            field_c = (ContextMenuItem[][]) null;
          }
          var5 = or.field_d;
          var5.b(param1, (byte) -75);
          var5.field_n = var5.field_n + 1;
          var4 = var5.field_n;
          var5.writeByte(125, 1);
          var5.writeByte(113, param0.field_j);
          var5.writeSignedSmart(-109, param0.field_i);
          var5.writeInt(-65, param0.field_e);
          var5.writeInt(-84, param0.field_l);
          var5.writeInt(-74, param0.field_n);
          var5.writeInt(-75, param0.field_g);
          var5.appendCrc32(var4, !param2 ? true : false);
          var5.backpatchByteLength(62, var5.field_n - var4);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "rf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_c = (ContextMenuItem[][]) null;
        if (param0 >= -58) {
          return;
        }
        field_d = null;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = ei.sine(param0, (byte) -23);
        int var4 = we.cosine(param0, false);
        int var5 = ei.sine(param2, (byte) -23);
        int var6 = we.cosine(param2, false);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var11 = 94 % ((param1 + 46) / 59);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    rf(String param0, UiLayoutNode param1) {
        String[] var3 = null;
        UiLayoutNode[] var4 = null;
        try {
          var3 = new String[]{param0, ConsoleExpression.field_n, TrinketTile.field_Jb};
          var4 = new UiLayoutNode[]{param1, TriangleMesh.field_R, (UiLayoutNode) ((Object) TournamentChampionDialog.field_F)};
          this.field_b = new TabStrip(0L, MatchingTextValidator.field_n, var3, MouseInputHandler.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "rf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = false;
    }
}
