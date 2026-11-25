/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PrivateChatMessage extends ChatMessage {
    static AccountRequestState field_l;
    private String field_m;
    static String field_j;
    static String field_n;
    static int field_o;
    static int field_k;
    private String field_i;

    final void write(PacketBuffer param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.writeMarkedString((byte) 95, this.field_m);
          if (param1 <= 67) {
            PrivateChatMessage.a((QuickChatMenu) null, false);
          }
          param0.writePackedName((byte) -120, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ee.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(QuickChatMenu param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param1) {
            field_l = (AccountRequestState) null;
          }
          SectorCacheStore.field_f.addChild(4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ee.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(PacketBuffer param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.position;
          var4 = AchievementProgress.a((byte) 86, (CharSequence) ((Object) param2));
          param0.writeSmart(0, var4.length);
          if (param1 >= -36) {
            PrivateChatMessage.clearStatics(true);
          }
          param0.position = param0.position + DiskArchiveRequest.field_v.encode(var4, param0.position, -6309, param0.payload, 0, var4.length);
          stackIn_4_0 = -var3_int + param0.position;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ee.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static int intOr(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "ee.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static void loadGameText(int param0, Archive param1) {
        class GameTextLoader {
            RuntimeException stackIn_1731_0;
            StringBuilder stackIn_1731_1;
            String stackIn_1732_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int var5;
            int param0;
            Archive param1;
            boolean finished;
            GameTextLoader(int initialParam0, Archive initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1731_0 = null;
                this.stackIn_1731_1 = null;
                this.stackIn_1732_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
                this.var5 = 0;
            }
            void loadMenusAndInstructionOverview() throws java.lang.RuntimeException {
                ArrayWidgetGroup.field_D = param1;
                var2 = GameTextResources.loadGameTextResource("text_game_name", 96);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_benefits,0", 104);
                if (null != var2) {
                  OpacityWidget.field_B[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_benefits,1", 100);
                if (null != var2) {
                  OpacityWidget.field_B[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_benefits,2", 115);
                if (var2 != null) {
                  OpacityWidget.field_B[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,0", 95);
                if (var2 != null) {
                  ud.field_a[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,1", 120);
                if (null != var2) {
                  ud.field_a[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,2", 108);
                if (null != var2) {
                  ud.field_a[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,3", 120);
                if (var2 != null) {
                  ud.field_a[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,4", 121);
                if (null != var2) {
                  ud.field_a[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,5", 97);
                if (null != var2) {
                  ud.field_a[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,6", 107);
                if (var2 != null) {
                  ud.field_a[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,7", 109);
                if (var2 != null) {
                  ud.field_a[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,8", 117);
                if (var2 != null) {
                  ud.field_a[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,9", 106);
                if (var2 != null) {
                  ud.field_a[9] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,10", 117);
                if (var2 != null) {
                  ud.field_a[10] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,11", 107);
                if (var2 != null) {
                  ud.field_a[11] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,12", 100);
                if (var2 != null) {
                  ud.field_a[12] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,13", 119);
                if (null != var2) {
                  ud.field_a[13] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,14", 96);
                if (var2 != null) {
                  ud.field_a[14] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,15", 127);
                if (null != var2) {
                  ud.field_a[15] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,16", 100);
                if (var2 != null) {
                  ud.field_a[16] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,17", 95);
                if (null != var2) {
                  ud.field_a[17] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,18", 122);
                if (var2 != null) {
                  ud.field_a[18] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,19", 102);
                if (null != var2) {
                  ud.field_a[19] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,20", 114);
                if (var2 != null) {
                  ud.field_a[20] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,21", 95);
                if (null != var2) {
                  ud.field_a[21] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,22", 122);
                if (null != var2) {
                  ud.field_a[22] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,23", 105);
                if (null != var2) {
                  ud.field_a[23] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_names,24", 107);
                if (var2 != null) {
                  ud.field_a[24] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_no_achievement", 127);
                if (var2 != null) {
                  VictoryChecker.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,0", 119);
                if (null != var2) {
                  ul.field_Qb[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,1", 99);
                if (var2 != null) {
                  ul.field_Qb[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,2", 108);
                if (null != var2) {
                  ul.field_Qb[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,3", 103);
                if (null != var2) {
                  ul.field_Qb[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,4", 115);
                if (var2 != null) {
                  ul.field_Qb[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,5", 126);
                if (var2 != null) {
                  ul.field_Qb[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,6", 121);
                if (var2 != null) {
                  ul.field_Qb[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,7", 125);
                if (var2 != null) {
                  ul.field_Qb[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,8", 116);
                if (null != var2) {
                  ul.field_Qb[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,9", 125);
                if (null != var2) {
                  ul.field_Qb[9] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,10", 115);
                if (null != var2) {
                  ul.field_Qb[10] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,11", 108);
                if (var2 != null) {
                  ul.field_Qb[11] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,12", 108);
                if (var2 != null) {
                  ul.field_Qb[12] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,13", 118);
                if (null != var2) {
                  ul.field_Qb[13] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,14", 118);
                if (null != var2) {
                  ul.field_Qb[14] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,15", 102);
                if (null != var2) {
                  ul.field_Qb[15] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,16", 103);
                if (var2 != null) {
                  ul.field_Qb[16] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,17", 123);
                if (null != var2) {
                  ul.field_Qb[17] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,18", 104);
                if (null != var2) {
                  ul.field_Qb[18] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,19", 117);
                if (null != var2) {
                  ul.field_Qb[19] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,20", 117);
                if (var2 != null) {
                  ul.field_Qb[20] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,21", 115);
                if (null != var2) {
                  ul.field_Qb[21] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,22", 124);
                if (null != var2) {
                  ul.field_Qb[22] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,23", 106);
                if (null != var2) {
                  ul.field_Qb[23] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievement_criteria,24", 106);
                if (var2 != null) {
                  ul.field_Qb[24] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("achievements_rated_only", 110);
                if (var2 != null) {
                  HitRegion.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,0", 98);
                if (null != var2) {
                  CellVertex.field_d[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,1", 100);
                if (var2 != null) {
                  CellVertex.field_d[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,2", 113);
                if (var2 != null) {
                  CellVertex.field_d[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,3", 99);
                if (var2 != null) {
                  CellVertex.field_d[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,4", 124);
                if (null != var2) {
                  CellVertex.field_d[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptlabels,5", 98);
                if (null != var2) {
                  CellVertex.field_d[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,0", 100);
                if (var2 != null) {
                  Dialog.field_J[1][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,1", 101);
                if (null != var2) {
                  Dialog.field_J[1][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,2", 115);
                if (null != var2) {
                  Dialog.field_J[1][2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,3", 108);
                if (null != var2) {
                  Dialog.field_J[1][3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,4", 97);
                if (var2 != null) {
                  Dialog.field_J[1][4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,5", 107);
                if (null != var2) {
                  Dialog.field_J[1][5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,1,6", 107);
                if (var2 != null) {
                  Dialog.field_J[1][6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,2,0", 108);
                if (null != var2) {
                  Dialog.field_J[2][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,2,1", 116);
                if (null != var2) {
                  Dialog.field_J[2][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,2,2", 106);
                if (null != var2) {
                  Dialog.field_J[2][2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,2,3", 122);
                if (var2 != null) {
                  Dialog.field_J[2][3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,3,0", 122);
                if (var2 != null) {
                  Dialog.field_J[3][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,3,1", 119);
                if (null != var2) {
                  Dialog.field_J[3][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,3,2", 104);
                if (null != var2) {
                  Dialog.field_J[3][2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,3,3", 120);
                if (null != var2) {
                  Dialog.field_J[3][3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,3,4", 111);
                if (null != var2) {
                  Dialog.field_J[3][4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,4,0", 97);
                if (null != var2) {
                  Dialog.field_J[4][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gameoptnames,4,1", 100);
                if (var2 != null) {
                  Dialog.field_J[4][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gametypeTooltips,0", 118);
                if (null != var2) {
                  DialogRoot.field_E[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gametypeTooltips,1", 115);
                if (null != var2) {
                  DialogRoot.field_E[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gametypeTooltips,2", 110);
                if (var2 != null) {
                  DialogRoot.field_E[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("gametypeTooltips,3", 108);
                if (null != var2) {
                  DialogRoot.field_E[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("rulesetTooltips,0", 127);
                if (null != var2) {
                  SectorCacheStore.field_c[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("rulesetTooltips,1", 122);
                if (null != var2) {
                  SectorCacheStore.field_c[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,0", 112);
                if (null != var2) {
                  IntList.field_f[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,1", 101);
                if (var2 != null) {
                  IntList.field_f[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,2", 102);
                if (null != var2) {
                  IntList.field_f[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,3", 124);
                if (null != var2) {
                  IntList.field_f[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,4", 95);
                if (var2 != null) {
                  IntList.field_f[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("empire_names,5", 119);
                if (var2 != null) {
                  IntList.field_f[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("resource_names,0", 121);
                if (var2 != null) {
                  MusicCrossfadeStream.field_x[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("resource_names,1", 117);
                if (null != var2) {
                  MusicCrossfadeStream.field_x[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("resource_names,2", 124);
                if (null != var2) {
                  MusicCrossfadeStream.field_x[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("resource_names,3", 117);
                if (var2 != null) {
                  MusicCrossfadeStream.field_x[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("project_names,0", 123);
                if (var2 != null) {
                  UiTextSupport.field_d[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("project_names,1", 101);
                if (var2 != null) {
                  UiTextSupport.field_d[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("project_names,2", 97);
                if (var2 != null) {
                  UiTextSupport.field_d[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("project_names,3", 114);
                if (null != var2) {
                  UiTextSupport.field_d[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,0", 124);
                if (null != var2) {
                  UnderageAccountInfoPanel.field_J[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,1", 99);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,2", 119);
                if (null != var2) {
                  UnderageAccountInfoPanel.field_J[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,3", 105);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,4", 122);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,5", 114);
                if (null != var2) {
                  UnderageAccountInfoPanel.field_J[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,6", 112);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,7", 103);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,8", 105);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,9", 116);
                if (null != var2) {
                  UnderageAccountInfoPanel.field_J[9] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("instructions_tabnames,10", 122);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_J[10] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO0,0", 95);
                if (null != var2) {
                  MusicVoice.field_w[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO0,1", 118);
                if (null != var2) {
                  MusicVoice.field_w[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO1_START", 111);
                if (null != var2) {
                  AttackTask.field_r = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO1_END", 111);
                if (var2 != null) {
                  IntArrayReadRequest.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO2_START", 117);
                if (var2 != null) {
                  RandomAccessCacheFile.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO2_END", 111);
                if (var2 != null) {
                  DiplomacyNotice.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO3_START", 103);
                if (var2 != null) {
                  GameRules.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO4_START", 115);
                if (null != var2) {
                  AccountCreationForm.field_P = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("TEXT_INTRO4_END", 112);
                if (var2 != null) {
                  SoundEffectDefinition.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_skipintro", 121);
                if (var2 != null) {
                  MenuInputState.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_playerinfo", 113);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_territoryinfo", 118);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_unplaced", 97);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_tooltip_garrison", 119);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_tooltip_required", 118);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_tooltip_departing", 125);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_tooltip_arriving", 126);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_offer", 118);
                if (null != var2) {
                  FullscreenFocusCanvas.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_accept", 114);
                if (var2 != null) {
                  ContentDialog.field_hb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_awaiting", 123);
                if (null != var2) {
                  LobbyRoomEntry.field_gc = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_ineffect", 98);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_expires", 123);
                if (var2 != null) {
                  ClientOverlayDrawSupport.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_one_turn", 95);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("pact_turns", 107);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_select_src", 103);
                if (var2 != null) {
                  ScrollPane.field_Bb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_select_dest", 123);
                if (null != var2) {
                  LoginRequestSupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_placement", 123);
                if (null != var2) {
                  wp.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_defensegrid", 115);
                if (var2 != null) {
                  WeightedLruCache.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_terraform", 106);
                if (null != var2) {
                  DerelictMapReader.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_flare", 125);
                if (var2 != null) {
                  SocketConnector.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_select_gate_src", 113);
                if (null != var2) {
                  DialPainter.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_select_gate_dest", 111);
                if (null != var2) {
                  TextFieldValidator.field_k = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("hint_cancel", 97);
                if (null != var2) {
                  vo.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_waitingforplayer", 126);
                if (var2 != null) {
                  ContentDialog.field_Y = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_waitingforplayers", 126);
                if (null != var2) {
                  NanoFrameTimer.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_youhavebeendefeated", 102);
                if (null != var2) {
                  MenuList.field_A = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_victory", 108);
                if (var2 != null) {
                  MatchingTextValidator.field_o = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_defeat", 119);
                if (var2 != null) {
                  GameScreen.field_L = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_peace_short", 123);
                if (var2 != null) {
                  ReflectionQueueSupport.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_peace", 120);
                if (null != var2) {
                  StrongCacheEntry.field_v = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_peace2", 105);
                if (null != var2) {
                  StatusContent.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_peace3", 110);
                if (null != var2) {
                  IntrusiveNode.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_playerHasWon", 95);
                if (null != var2) {
                  TertiaryLinkNode.field_t = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_togglestats", 99);
                if (var2 != null) {
                  WhirlpoolHasher.field_p = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_togglestats2", 123);
                if (null != var2) {
                  BattleSnapshot.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_esctoexit", 105);
                if (null != var2) {
                  uo.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_defeated", 96);
                if (var2 != null) {
                  AccountInputSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_resigned", 116);
                if (var2 != null) {
                  IntNode.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_join_final", 118);
                if (null != var2) {
                  IntroRenderSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_join", 97);
                if (null != var2) {
                  ReflectionQueueSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_decimal", 117);
                if (null != var2) {
                  BufferedCacheFile.field_j = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_ordinal", 104);
                if (null != var2) {
                  ProgressDialog.field_hb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name", 112);
                if (null != var2) {
                  StringList.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name_first", 114);
                if (null != var2) {
                  ArrayWidgetGroup.field_H = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turnObjective", 105);
                if (null != var2) {
                  RasterStateFrame.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turnOnePoint", 123);
                if (null != var2) {
                  vs.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turnPoints", 95);
                if (null != var2) {
                  IsolationistAi.field_s = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turnFewerShips", 101);
                if (var2 != null) {
                  TutorialScene.field_p = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,0", 119);
                if (var2 != null) {
                  ScrollBar.field_Bb[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,1", 122);
                if (var2 != null) {
                  ScrollBar.field_Bb[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,2", 116);
                if (null != var2) {
                  ScrollBar.field_Bb[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,3", 125);
                if (null != var2) {
                  ScrollBar.field_Bb[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,4", 126);
                if (var2 != null) {
                  ScrollBar.field_Bb[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,5", 99);
                if (null != var2) {
                  ScrollBar.field_Bb[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,6", 121);
                if (null != var2) {
                  ScrollBar.field_Bb[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,7", 99);
                if (var2 != null) {
                  ScrollBar.field_Bb[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,8", 109);
                if (null != var2) {
                  ScrollBar.field_Bb[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,9", 95);
                if (null != var2) {
                  ScrollBar.field_Bb[9] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,10", 123);
                if (var2 != null) {
                  ScrollBar.field_Bb[10] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,11", 108);
                if (null != var2) {
                  ScrollBar.field_Bb[11] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,12", 111);
                if (null != var2) {
                  ScrollBar.field_Bb[12] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,13", 126);
                if (null != var2) {
                  ScrollBar.field_Bb[13] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,14", 96);
                if (var2 != null) {
                  ScrollBar.field_Bb[14] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,15", 126);
                if (null != var2) {
                  ScrollBar.field_Bb[15] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,16", 122);
                if (null != var2) {
                  ScrollBar.field_Bb[16] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,17", 127);
                if (null != var2) {
                  ScrollBar.field_Bb[17] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,18", 122);
                if (null != var2) {
                  ScrollBar.field_Bb[18] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,19", 119);
                if (null != var2) {
                  ScrollBar.field_Bb[19] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,20", 107);
                if (var2 != null) {
                  ScrollBar.field_Bb[20] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name1,21", 121);
                if (var2 != null) {
                  ScrollBar.field_Bb[21] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,0", 113);
                if (null != var2) {
                  BattleEvent.field_x[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,1", 116);
                if (var2 != null) {
                  BattleEvent.field_x[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,2", 125);
                if (null != var2) {
                  BattleEvent.field_x[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,3", 98);
                if (null != var2) {
                  BattleEvent.field_x[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,4", 101);
                if (var2 != null) {
                  BattleEvent.field_x[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,5", 112);
                if (var2 != null) {
                  BattleEvent.field_x[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,6", 120);
                if (null != var2) {
                  BattleEvent.field_x[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,7", 122);
                if (var2 != null) {
                  BattleEvent.field_x[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,8", 108);
                if (null != var2) {
                  BattleEvent.field_x[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,9", 95);
                if (var2 != null) {
                  BattleEvent.field_x[9] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,10", 99);
                if (var2 != null) {
                  BattleEvent.field_x[10] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,11", 111);
                if (null != var2) {
                  BattleEvent.field_x[11] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,12", 111);
                if (var2 != null) {
                  BattleEvent.field_x[12] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,13", 97);
                if (null != var2) {
                  BattleEvent.field_x[13] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,14", 126);
                if (var2 != null) {
                  BattleEvent.field_x[14] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,15", 98);
                if (var2 != null) {
                  BattleEvent.field_x[15] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,16", 118);
                if (null != var2) {
                  BattleEvent.field_x[16] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,17", 118);
                if (null != var2) {
                  BattleEvent.field_x[17] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("turn_name2,18", 126);
                if (var2 != null) {
                  BattleEvent.field_x[18] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("derelict", 122);
                if (var2 != null) {
                  AccountBooleanRequest.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions0", 116);
                if (var2 != null) {
                  vc.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_glossary1", 120);
                if (null != var2) {
                  GameAssetSetupSupport.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_glossary2", 102);
                if (var2 != null) {
                  CellVertex.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_playerstatus", 107);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_time", 126);
                if (null != var2) {
                  ClientSessionSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_wormhole", 95);
                if (var2 != null) {
                  VerticalMenuSlider.field_u = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_tooltip", 126);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_frame", 122);
                if (null != var2) {
                  StarLink.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_ready", 122);
                if (null != var2) {
                  ClientDrawingSupport.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_zoom", 109);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_mv_order", 121);
                if (null != var2) {
                  ProgressDialog.field_kb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_sf_outgoing", 96);
                if (null != var2) {
                  StripedProgressWidget.field_K = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_sf_garrison", 100);
                if (var2 != null) {
                  AccountNameValidationSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_sf_name", 117);
                if (var2 != null) {
                  ProxySocketConnector.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_sf_resources", 103);
                if (null != var2) {
                  AccountRequestResult.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_sf_incoming", 109);
                if (null != var2) {
                  Star.field_q = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_icon_occupied", 110);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_icon_terraformed", 101);
            }
            void loadInstructionsAndFleetControls() throws java.lang.RuntimeException {
                if (var2 != null) {
                  DelayedInboundPacket.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_icon_neutral", 111);
                if (null != var2) {
                  LabeledChildWidget.field_F = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_icon_homeworld", 126);
                if (var2 != null) {
                  MenuComponent.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_placement", 97);
                if (null != var2) {
                  WhirlpoolHasher.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_movement", 112);
                if (null != var2) {
                  LoginForm.field_N = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_projects", 105);
                if (var2 != null) {
                  IntArrayReadRequest.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_fleetsize", 95);
                if (null != var2) {
                  DebouncedValidator.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_endturn", 125);
                if (null != var2) {
                  WhirlpoolHasher.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_hotkeys", 104);
                if (var2 != null) {
                  DraggableWidget.field_F = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_stats", 104);
                if (null != var2) {
                  ScrollPane.field_Cb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_project_metal", 118);
                if (null != var2) {
                  StandardMapGenerator.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_project_biomass", 114);
                if (var2 != null) {
                  WidgetStyle.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_project_energy", 112);
                if (null != var2) {
                  ClientOverlayDrawSupport.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_project_exotics", 125);
                if (null != var2) {
                  ArchiveNetworkClient.field_o = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation", 120);
                if (var2 != null) {
                  ResizingDialog.field_N = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_fleetmove", 106);
                if (null != var2) {
                  ListContent.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_combat", 108);
                if (var2 != null) {
                  AccountInputSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_damaged", 103);
                if (null != var2) {
                  LobbyUiSetupSupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_retreating", 125);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_captured", 110);
                if (var2 != null) {
                  wq.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_lost", 124);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_building", 99);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_animation_project", 111);
                if (var2 != null) {
                  ClientOverlayDrawSupport.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_gametype", 99);
                if (var2 != null) {
                  ObjectList.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_classic", 116);
                if (null != var2) {
                  DualLinkNode.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_instructions_classic_stellarbomb", 107);
                if (null != var2) {
                  DefendTask.field_v = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animating_none", 105);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animating_moves", 115);
                if (var2 != null) {
                  MeshData.field_N = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animating_combat", 102);
                if (var2 != null) {
                  TertiaryListSequence.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animating_results", 115);
                if (var2 != null) {
                  MouseWheelInput.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animating_collapse", 96);
                if (var2 != null) {
                  StripedProgressWidget.field_G = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_offeredpactto", 97);
                if (var2 != null) {
                  ud.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_offeredpactby", 120);
                if (var2 != null) {
                  AiTask.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_signedwithyou", 116);
                if (null != var2) {
                  ClientOverlayDrawSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_youhavesigned", 108);
                if (null != var2) {
                  AchievementProgress.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_xy_signed", 110);
                if (var2 != null) {
                  VerticalMenuSlider.field_A = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_yourpactexpired", 122);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_xy_pactexpired", 118);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_you_have_been_defeated", 105);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_x_has_been_defeated", 96);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_insufficient_garrison", 101);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_garrison_ships_retreating", 118);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_garrison_ships_could_not_retreat", 116);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_gate_you", 119);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_gate_x", 99);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_net_you", 108);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_net_x", 110);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_terraform_you", 120);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_terraform_x", 99);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb", 120);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_you", 121);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_lost", 104);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_lost_one", 121);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_lost_none", 105);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_lost_defnet", 124);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_destroyed", 110);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_destroyed_one", 96);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_destroyed_none", 123);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_destroyed_defnet", 100);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_jumps_prevented2", 109);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_project_bomb_jumps_prevented1", 108);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_ships_arrived", 121);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_ships_constructed", 119);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_held", 106);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_held_ships_lost_damaged", 124);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_held_ships_lost", 103);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_held_ships_damaged", 96);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_held_ships_lost_none", 126);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_lost", 97);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_lost_ships_lost_retreating", 107);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_lost_ships_lost", 109);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_system_lost_ships_retreating", 119);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_successful", 113);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_successful_neutral", 116);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_failed", 126);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_failed_neutral", 95);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_ships_lost_retreating", 120);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_ships_lost", 107);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_ships_retreating", 100);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_attack_ships_lost_none", 97);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_spectator_system_taken", 113);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_spectator_system_held", 115);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("msg_combat_also_involved", 96);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_continue", 114);
                if (var2 != null) {
                  wm.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_continue2", 112);
                if (null != var2) {
                  IntValueWriteRequest.field_k = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_continue3", 110);
                if (var2 != null) {
                  StatefulWidgetTheme.field_v = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_continuekey", 108);
                if (null != var2) {
                  ul.field_Ob = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_balanced", 121);
                if (var2 != null) {
                  DirectByteArrayStorage.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_shortfall1", 127);
                if (var2 != null) {
                  TutorialTextSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_shortfall2a", 104);
                if (var2 != null) {
                  IntValueWriteRequest.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_shortfall2b", 119);
                if (null != var2) {
                  ClientRasterSupport.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_retreating_single", 109);
                if (null != var2) {
                  VerticalMenuSlider.field_H = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_retreating_multiple", 100);
                if (null != var2) {
                  wl.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_lost_none", 102);
                if (null != var2) {
                  IndexedSpriteState.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_lost_single", 123);
                if (var2 != null) {
                  ChatCompositionSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_lost_multiple", 113);
                if (var2 != null) {
                  TextReplacementContext.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_capture_all", 110);
                if (null != var2) {
                  SecondaryNodeHashTable.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tutorial_exit", 99);
                if (var2 != null) {
                  SpriteWipeSupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_territories", 103);
                if (null != var2) {
                  ShatteredPlansClient.field_L = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_uioptions", 99);
                if (var2 != null) {
                  ObjectList.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_fleetinfo", 106);
                if (var2 != null) {
                  ChatPanelSetupSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_diplomacy", 109);
                if (var2 != null) {
                  DropTargetWidget.field_B = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_projects", 110);
                if (null != var2) {
                  MouseWheelInput.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_messages", 98);
                if (null != var2) {
                  uq.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tabname_victory", 113);
                if (var2 != null) {
                  AccountNoticeKind.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("messages_replay", 100);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("messages_none", 121);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("messages_counter", 106);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("message_incoming_offers", 122);
                if (null != var2) {
                  ul.field_Ab = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_farzoom", 101);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_enemyproduction", 101);
                if (var2 != null) {
                  QuickChatHelpSupport.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_rates", 127);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_types", 102);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_resource", 104);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_sort", 109);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_showall", 117);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_garrison", 107);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_endturn", 112);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_animation", 119);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_enable", 121);
                if (var2 != null) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_fast", 100);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ships", 110);
                if (null != var2) {
                  BirthDateValidator.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_production", 105);
                if (var2 != null) {
                  Bzip2State.field_s = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_systems", 114);
                if (var2 != null) {
                  ClientInputSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_overview", 114);
                if (null != var2) {
                  ListContent.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ready", 109);
                if (null != var2) {
                  EmailValidator.field_v = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_pending", 124);
                if (null != var2) {
                  SpriteState.field_s = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_notavailable", 114);
                if (var2 != null) {
                  SocketArchiveNetworkClient.field_t = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_percentage", 122);
                if (null != var2) {
                  ResizingDialog.field_O = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ordinals,0", 113);
                if (var2 != null) {
                  BirthDateConfirmationForm.field_I[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ordinals,1", 105);
                if (null != var2) {
                  BirthDateConfirmationForm.field_I[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var3 = -15 % ((42 - param0) / 35);
                var2 = GameTextResources.loadGameTextResource("text_ordinals,2", 123);
                if (null != var2) {
                  BirthDateConfirmationForm.field_I[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ordinals,3", 120);
                if (null != var2) {
                  BirthDateConfirmationForm.field_I[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ordinals,4", 98);
                if (null != var2) {
                  BirthDateConfirmationForm.field_I[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_ordinals,5", 125);
                if (var2 != null) {
                  BirthDateConfirmationForm.field_I[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_error", 111);
                if (var2 != null) {
                  wc.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_max_total_fleet_size", 109);
                if (null != var2) {
                  AccountNoticeKind.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_ships_destroyed", 116);
                if (var2 != null) {
                  QuickChatParameterType.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_ships_lost", 114);
                if (var2 != null) {
                  LinkPainter.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_avg_move_size", 127);
                if (null != var2) {
                  DialogRoot.field_D = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_max_production", 107);
                if (var2 != null) {
                  CheckboxWidget.field_D = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_ships_constructed", 116);
                if (null != var2) {
                  ClientException.field_g = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_projects_used", 121);
                if (var2 != null) {
                  ChatMessage.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_research_wasted", 95);
                if (var2 != null) {
                  DialWidget.field_J = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_attacks_successful", 118);
                if (var2 != null) {
                  GameAssetSetupSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_attacks_failed", 114);
                if (null != var2) {
                  SecondaryNodeHashTable.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_defences_successful", 117);
                if (var2 != null) {
                  Dialog.field_H = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_defences_failed", 123);
                if (null != var2) {
                  StarSoundState.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_efficiency", 103);
                if (null != var2) {
                  SocialListPanel.field_zb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_fluidity", 114);
                if (null != var2) {
                  PlayerReportPanel.field_Eb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_aggressiveness", 115);
                if (null != var2) {
                  MenuTextResources.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_solidity", 106);
                if (var2 != null) {
                  DelegatingCanvas.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_max_total_fleet_size", 109);
                if (null != var2) {
                  MenuLabel.field_v = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_ships_destroyed", 121);
                if (null != var2) {
                  MenuInputState.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_ships_lost", 105);
                if (null != var2) {
                  ChatHistoryEntry.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_avg_move_size", 117);
                if (var2 != null) {
                  wa.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_max_production", 104);
                if (null != var2) {
                  vs.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_ships_constructed", 101);
                if (null != var2) {
                  IntArrayReadRequest.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_projects_used", 119);
                if (null != var2) {
                  LobbyLayoutSupport.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_research_wasted", 116);
                if (var2 != null) {
                  VictoryChecker.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_attacks_successful", 116);
                if (var2 != null) {
                  StarAbandonedEvent.field_s = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_attacks_failed", 99);
                if (null != var2) {
                  Star.field_P = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_defences_successful", 102);
                if (null != var2) {
                  IntroGlowPoint.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_defences_failed", 127);
                if (null != var2) {
                  vo.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_efficiency", 108);
                if (var2 != null) {
                  vs.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_fluidity", 117);
                if (var2 != null) {
                  ClientRasterSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_aggressiveness", 121);
                if (null != var2) {
                  RoundedFrameSupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_stat_desc_solidity", 104);
                if (var2 != null) {
                  MenuTransitionSupport.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("rated_membersonly", 109);
                if (var2 != null) {
                  IntroGlowPoint.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_skirmish", 119);
                if (null != var2) {
                  wm.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_totalplayers", 126);
                if (var2 != null) {
                  BytePayloadNode.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_human_players", 118);
                if (null != var2) {
                  ValidationMessageWidget.field_Q = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_map_hex", 121);
                if (null != var2) {
                  TutorialConditionalText.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_map_sol", 95);
                if (null != var2) {
                  RichTextLayout.field_n = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_map_points", 96);
                if (null != var2) {
                  ue.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_map_derelicts", 101);
                if (null != var2) {
                  StatusMessagePanel.field_I = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_garrison_yes", 114);
                if (var2 != null) {
                  CheckboxWidgetPainter.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_garrison_no", 106);
                if (null != var2) {
                  SliderPainter.field_k = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_skirmish_start", 95);
                if (var2 != null) {
                  field_j = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("track_name_new", 96);
                if (var2 != null) {
                  uq.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("track_name_old", 112);
                if (var2 != null) {
                  TerritoryResourcePanelSupport.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_showChat", 101);
                if (null != var2) {
                  ByteArrayNode.field_l = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("text_hideChat", 115);
                if (var2 != null) {
                  DualLinkDeque.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,0,0", 107);
                if (null != var2) {
                  DefensiveAi.field_s[0][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,1,0", 113);
                if (var2 != null) {
                  DefensiveAi.field_s[1][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,2,0", 113);
                if (var2 != null) {
                  DefensiveAi.field_s[2][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,3,0", 108);
                if (var2 != null) {
                  DefensiveAi.field_s[3][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,4,0", 119);
                if (null != var2) {
                  DefensiveAi.field_s[4][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,5,0", 123);
                if (null != var2) {
                  DefensiveAi.field_s[5][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,6,0", 109);
                if (var2 != null) {
                  DefensiveAi.field_s[6][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,7,0", 117);
                if (null != var2) {
                  DefensiveAi.field_s[7][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,8,0", 96);
                if (var2 != null) {
                  DefensiveAi.field_s[8][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,9,0", 103);
                if (var2 != null) {
                  DefensiveAi.field_s[9][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,10,0", 107);
                if (var2 != null) {
                  DefensiveAi.field_s[10][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,11,0", 120);
                if (var2 != null) {
                  DefensiveAi.field_s[11][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,12,0", 111);
                if (null != var2) {
                  DefensiveAi.field_s[12][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,13,0", 118);
                if (var2 != null) {
                  DefensiveAi.field_s[13][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,14,0", 120);
                if (null != var2) {
                  DefensiveAi.field_s[14][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,15,0", 125);
                if (null != var2) {
                  DefensiveAi.field_s[15][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,16,0", 118);
                if (var2 != null) {
                  DefensiveAi.field_s[16][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,17,0", 97);
                if (null != var2) {
                  DefensiveAi.field_s[17][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,18,0", 100);
                if (null != var2) {
                  DefensiveAi.field_s[18][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,19,0", 114);
                if (null != var2) {
                  DefensiveAi.field_s[19][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,19,1", 98);
                if (var2 != null) {
                  DefensiveAi.field_s[19][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,20,0", 124);
                if (var2 != null) {
                  DefensiveAi.field_s[20][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,21,0", 95);
                if (null != var2) {
                  DefensiveAi.field_s[21][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,22,0", 114);
                if (null != var2) {
                  DefensiveAi.field_s[22][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,23,0", 114);
                if (null != var2) {
                  DefensiveAi.field_s[23][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,24,0", 112);
                if (var2 != null) {
                  DefensiveAi.field_s[24][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,24,1", 103);
                if (null != var2) {
                  DefensiveAi.field_s[24][1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,24,2", 95);
                if (var2 != null) {
                  DefensiveAi.field_s[24][2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,25,0", 97);
                if (null != var2) {
                  DefensiveAi.field_s[25][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aichat,26,0", 124);
                if (var2 != null) {
                  DefensiveAi.field_s[26][0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,0", 100);
                if (null != var2) {
                  WidgetStateStyle.field_a[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,1", 117);
                if (null != var2) {
                  WidgetStateStyle.field_a[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,2", 100);
                if (null != var2) {
                  WidgetStateStyle.field_a[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,3", 120);
                if (var2 != null) {
                  WidgetStateStyle.field_a[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,4", 116);
                if (var2 != null) {
                  WidgetStateStyle.field_a[4] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,5", 123);
                if (var2 != null) {
                  WidgetStateStyle.field_a[5] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,6", 109);
                if (null != var2) {
                  WidgetStateStyle.field_a[6] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,7", 123);
                if (null != var2) {
                  WidgetStateStyle.field_a[7] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("aitypes,8", 95);
                if (null != var2) {
                  WidgetStateStyle.field_a[8] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipIncome,0", 121);
                if (null != var2) {
                  BattleContribution.field_m[0] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipIncome,1", 125);
                if (var2 != null) {
                  BattleContribution.field_m[1] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipIncome,2", 118);
                if (null != var2) {
                  BattleContribution.field_m[2] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipIncome,3", 115);
                if (null != var2) {
                  BattleContribution.field_m[3] = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipIncomingLimiting", 101);
                if (null != var2) {
                  IconLabelPanel.field_yb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipTotalFleetProduction", 125);
                if (var2 != null) {
                  QuickChatPhraseDefinition.field_w = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipPlaceFleets", 117);
                if (null != var2) {
                  IntroTextLine.field_j = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipPlaceFleetsStop", 127);
                if (null != var2) {
                  ContentDialog.field_lb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipFleetsRemaining", 109);
                if (null != var2) {
                  ClientPacketFlushSupport.field_c = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipOneFleetRemaining", 101);
                if (var2 != null) {
                  StatusContent.field_a = IterableNodeHashTable.a(var2, 17746);
                }
            }
            void loadDiplomacyAndVictoryText() throws java.lang.RuntimeException {
                var2 = GameTextResources.loadGameTextResource("tooltipAllFleetsPlaced", 96);
                if (var2 != null) {
                  UnderageAccountInfoPanel.field_F = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipOfferTreaty", 110);
                if (null != var2) {
                  AudioService.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAcceptTreaty", 113);
                if (null != var2) {
                  StatefulWidgetTheme.field_x = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipWaitTreaty", 106);
                if (var2 != null) {
                  EmailValidator.field_u = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipPartiallyComplete", 117);
                if (null != var2) {
                  ScrollBar.field_yb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProjectComplete", 118);
                if (var2 != null) {
                  EmailSyntaxValidator.field_q = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProjectPending", 120);
                if (var2 != null) {
                  CellVertex.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProductionButtonShow", 120);
                if (null != var2) {
                  StarLinkPlanner.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProjectsButtonShow", 125);
                if (var2 != null) {
                  DiplomacyNotice.field_j = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipDiplomacyButtonShow", 112);
                if (null != var2) {
                  IntArrayReadRequest.field_o = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipFleetInfoButtonShow", 109);
                if (var2 != null) {
                  wm.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryButtonShow", 102);
                if (null != var2) {
                  TaskAi.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProductionButtonHide", 112);
                if (null != var2) {
                  ClientOverlaySupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProjectsButtonHide", 111);
                if (null != var2) {
                  ue.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipDiplomacyButtonHide", 112);
                if (null != var2) {
                  ChatAreaLayoutSupport.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipFleetInfoButtonHide", 104);
                if (var2 != null) {
                  ArchiveSource.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryButtonHide", 105);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipEndTurn", 101);
                if (null != var2) {
                  AccountCreationDialog.field_Bb = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryPaneManyMany", 105);
                if (var2 != null) {
                  AlternateLoginCredentials.field_q = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryPaneOneOne", 101);
                if (var2 != null) {
                  Archive.field_a = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryPaneOneMany", 105);
                if (null != var2) {
                  ChatMessage.field_b = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipVictoryPaneManyOne", 126);
                if (null != var2) {
                  ValidatedTextInputWidget.field_S = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipProjectedWinner", 115);
                if (var2 != null) {
                  SolVictoryChecker.field_q = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimAutoPlayIsOn", 107);
                if (null != var2) {
                  StarLink.field_i = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimAutoPlayIsOff", 101);
                if (null != var2) {
                  NodeHashTableIterator.field_e = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimClickToPlay", 116);
                if (null != var2) {
                  DebouncedValidator.field_f = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimClickToStop", 126);
                if (var2 != null) {
                  SecondaryNodeDequeIterator.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimSpeedIsNormal", 119);
                if (null != var2) {
                  UsernameAvailabilityValidator.field_t = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("tooltipAnimSpeedIsDouble", 95);
                if (var2 != null) {
                  StringNode.field_k = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("victoryTargetPoints", 110);
                if (var2 != null) {
                  ShatteredPlansClient.field_J = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("victoryInX", 100);
                if (null != var2) {
                  StandardAi.field_m = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("drawInX", 112);
                if (null != var2) {
                  IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("victoryTurnsRemaining", 118);
                if (var2 != null) {
                  ChatPanelLayoutSupport.field_d = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("victorySolEmpty", 118);
                if (null != var2) {
                  TutorialAi.field_t = IterableNodeHashTable.a(var2, 17746);
                }
                var2 = GameTextResources.loadGameTextResource("victorySolOwned", 105);
                if (null != var2) {
                  ChatMessage.field_h = IterableNodeHashTable.a(var2, 17746);
                }
                ArrayWidgetGroup.field_D = null;
            }
            void run() {
                var4 = ShatteredPlansClient.field_F ? 1 : 0;
                try {
                  loadMenusAndInstructionOverview();
                  if (finished) return;
                  loadInstructionsAndFleetControls();
                  if (finished) return;
                  loadDiplomacyAndVictoryText();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1731_0 = (RuntimeException) (var2_ref);
                  stackIn_1731_1 = new StringBuilder().append("ee.H(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_1732_2 = "null";
                  } else {
                    stackIn_1732_2 = "{...}";
                  }
                  throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_1731_0), ((StringBuilder) (Object) stackIn_1731_1).append(stackIn_1732_2).append(')').toString());
                }
                if (var4 != 0) {
                  var5 = GameApplet.field_l;
                  var5++;
                  GameApplet.field_l = var5;
                }
            }
        }
        GameTextLoader decompiledBody = new GameTextLoader(param0, param1);
        decompiledBody.run();
    }

    final MessageKind getKind(byte param0) {
        MessageKind stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -105 / ((param0 + 7) / 41);
          stackIn_1_0 = IsolationistAi.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var2), "ee.B(" + param0 + ')');
        }
    }

    PrivateChatMessage(String param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param1;
          this.field_m = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ee.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void clearStatics(boolean param0) {
        try {
          field_n = null;
          field_l = null;
          field_j = null;
          if (param0) {
            PrivateChatMessage.clearStatics(true);
          }
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ee.I(" + param0 + ')');
        }
    }

    static {
        field_j = "Start skirmish";
        field_n = "Tutorial";
    }
}
