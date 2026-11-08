/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTableInitializer {
    static Sprite field_a;
    static String field_e;
    static String field_b;
    static String field_f;
    static String field_c;
    static int[] field_d;

    public static void releaseStatics(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_b = null;
          field_f = null;
          field_d = null;
          field_e = null;
          if (param0 != 35) {
            TextTableInitializer.releaseStatics(59);
          }
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1), "rg.B(" + param0 + ')');
        }
    }

    final static boolean handleQuickChatKey(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~IntrusiveDeque.field_d == param1) {
            uc.closeQuickChatIfOpen(3);
            return true;
          }
          if (102 == IntrusiveDeque.field_d) {
            CacheEntry.field_q.clearTabStates(param1 ^ -89);
            return true;
          }
          stackIn_13_0 = (null != CacheEntry.field_q) && (CacheEntry.field_q.handleBackKey(param1 ^ -122, param0, param2));
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var3), "rg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean handleEscapeKey(int param0, int param1, int param2, int param3) {
        int stackIn_23_0 = 0;
        boolean stackIn_35_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (param2 != 13) {
            TextTableInitializer.handleEscapeKey(-21, -66, -84, -38);
          }
          if (pm.field_b != null &&
            13 == IntrusiveDeque.field_d) {
            pm.field_b = null;
            return true;
          }
          if (!SocketJs5Transport.field_r) {
            if (!oj.field_i &&
              IntrusiveDeque.field_d != 9 &&
              IntrusiveDeque.field_d != 10 &&
              IntrusiveDeque.field_d != 11) {
              if (80 == IntrusiveDeque.field_d &&
                tn.isNotMember((byte) 111)) {
                SocketJs5Transport.field_r = true;
                return true;
              }
              return false;
            }
            stackIn_35_0 = TextTableInitializer.handleQuickChatKey(param1, -14, param3);
            return stackIn_35_0;
          }
          if (!tn.isNotMember((byte) -40)) {
            return false;
          }
          var4_int = ko.drawChatInputLine(param2 - 121, param0, param3) ? 1 : 0;
          if (IntrusiveDeque.field_d == 80 ||
            IntrusiveDeque.field_d == 84) {
            var4_int = 1;
            SocketJs5Transport.field_r = false;
          }
          if (IntrusiveDeque.field_d == 13) {
            ue.clearChatInput(10);
            var4_int = 1;
            SocketJs5Transport.field_r = false;
          }
          stackIn_23_0 = var4_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var4), "rg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void initializeTextTable(ResourceArchive param0, byte param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_3095_0;
            StringBuilder stackIn_3095_1;
            String stackIn_3096_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            ResourceArchive param0;
            byte param1;
            boolean finished;
            $CfrPartitionedBody(ResourceArchive initialParam0, byte initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_3095_0 = null;
                this.stackIn_3095_1 = null;
                this.stackIn_3096_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                QuickChatPhraseCache.field_e = param0;
                var2 = CachedArchiveProvider.loadNamedFile("text_game_name", param1 ^ -75);
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_benefits,0", -106);
                if (var2 != null) {
                  SceneTabbedPanel.field_Ub[0] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_benefits,1", -88);
                if (null != var2) {
                  SceneTabbedPanel.field_Ub[1] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_benefits,2", -74);
                if (var2 != null) {
                  SceneTabbedPanel.field_Ub[2] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("receiving_game", -108);
                if (var2 != null) {
                  rb.field_l = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_title", -98);
                if (null != var2) {
                  SectorCacheStore.field_i = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp1inst", -101);
                if (null != var2) {
                  wj.field_e = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,0", -76);
                if (null != var2) {
                  SceneTextInput.field_Kb[0] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,1", -82);
                if (var2 != null) {
                  SceneTextInput.field_Kb[1] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,2", -128);
                if (null != var2) {
                  SceneTextInput.field_Kb[2] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,3", -102);
                if (var2 != null) {
                  SceneTextInput.field_Kb[3] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,4", -116);
                if (var2 != null) {
                  SceneTextInput.field_Kb[4] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("exp_1_cap,5", -94);
                if (null != var2) {
                  SceneTextInput.field_Kb[5] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ai1", -70);
                if (var2 != null) {
                  ImageProducerRasterBuffer.field_n = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ai2", -91);
                if (null != var2) {
                  rf.field_l = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ai3", -123);
                if (null != var2) {
                  field_c = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_x_hasbeendefeated", param1 ^ -75);
                if (var2 != null) {
                  GrowableIntList.field_i = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youcanchangeyourcharacter", -75);
                if (null != var2) {
                  MusicCrossfadeStream.field_x = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("smittenmessage", -94);
                if (var2 != null) {
                  co.field_d = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,0", -108);
                if (null != var2) {
                  vm.field_d[0] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,1", -122);
                if (var2 != null) {
                  vm.field_d[1] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,2", -91);
                if (var2 != null) {
                  vm.field_d[2] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,3", -73);
                if (null != var2) {
                  vm.field_d[3] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,4", -71);
                if (var2 != null) {
                  vm.field_d[4] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,5", -119);
                if (var2 != null) {
                  vm.field_d[5] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,6", param1 - 142);
                if (var2 != null) {
                  vm.field_d[6] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,7", param1 - 122);
                if (var2 != null) {
                  vm.field_d[7] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,8", -110);
                if (var2 != null) {
                  vm.field_d[8] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,9", -108);
                if (null != var2) {
                  vm.field_d[9] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,10", -87);
                if (var2 != null) {
                  vm.field_d[10] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,11", -122);
                if (null != var2) {
                  vm.field_d[11] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,12", -95);
                if (var2 != null) {
                  vm.field_d[12] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,13", -119);
                if (null != var2) {
                  vm.field_d[13] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,14", param1 - 106);
                if (null != var2) {
                  vm.field_d[14] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,15", -98);
                if (null != var2) {
                  vm.field_d[15] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,16", -90);
                if (null != var2) {
                  vm.field_d[16] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,17", -113);
                if (var2 != null) {
                  vm.field_d[17] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,18", -113);
                if (var2 != null) {
                  vm.field_d[18] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,19", -113);
                if (var2 != null) {
                  vm.field_d[19] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,20", -74);
                if (var2 != null) {
                  vm.field_d[20] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,21", -97);
                if (var2 != null) {
                  vm.field_d[21] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,22", -87);
                if (null != var2) {
                  vm.field_d[22] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,23", -97);
                if (null != var2) {
                  vm.field_d[23] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,24", -96);
                if (var2 != null) {
                  vm.field_d[24] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,25", -75);
                if (null != var2) {
                  vm.field_d[25] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,26", -93);
                if (null != var2) {
                  vm.field_d[26] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,27", -83);
                if (null != var2) {
                  vm.field_d[27] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,28", -91);
                if (var2 != null) {
                  vm.field_d[28] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,29", -80);
                if (var2 != null) {
                  vm.field_d[29] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,30", -124);
                if (var2 != null) {
                  vm.field_d[30] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,31", -126);
                if (var2 != null) {
                  vm.field_d[31] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,32", -84);
                if (null != var2) {
                  vm.field_d[32] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,33", -77);
                if (var2 != null) {
                  vm.field_d[33] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,34", -124);
                if (null != var2) {
                  vm.field_d[34] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,35", -100);
                if (null != var2) {
                  vm.field_d[35] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,36", param1 - 120);
                if (var2 != null) {
                  vm.field_d[36] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,37", param1 - 116);
                if (null != var2) {
                  vm.field_d[37] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,38", -80);
                if (null != var2) {
                  vm.field_d[38] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,39", -87);
                if (var2 != null) {
                  vm.field_d[39] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,40", -128);
                if (null != var2) {
                  vm.field_d[40] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,41", -122);
                if (var2 != null) {
                  vm.field_d[41] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,42", -81);
                if (var2 != null) {
                  vm.field_d[42] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,43", -80);
                if (null != var2) {
                  vm.field_d[43] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,44", -104);
                if (null != var2) {
                  vm.field_d[44] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,45", param1 - 147);
                if (null != var2) {
                  vm.field_d[45] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,46", -85);
                if (var2 != null) {
                  vm.field_d[46] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,47", param1 ^ -108);
                if (var2 != null) {
                  vm.field_d[47] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,48", -123);
                if (var2 != null) {
                  vm.field_d[48] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,49", -86);
                if (null != var2) {
                  vm.field_d[49] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,50", param1 ^ -104);
                if (var2 != null) {
                  vm.field_d[50] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,51", -107);
                if (null != var2) {
                  vm.field_d[51] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,52", -128);
                if (var2 != null) {
                  vm.field_d[52] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,53", param1 ^ -128);
                if (null != var2) {
                  vm.field_d[53] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,54", param1 - 103);
                if (var2 != null) {
                  vm.field_d[54] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,55", -77);
                if (null != var2) {
                  vm.field_d[55] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,56", -104);
                if (var2 != null) {
                  vm.field_d[56] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,57", param1 ^ -126);
                if (null != var2) {
                  vm.field_d[57] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,58", param1 - 117);
                if (null != var2) {
                  vm.field_d[58] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,59", param1 ^ -128);
                if (var2 != null) {
                  vm.field_d[59] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,60", -87);
                if (var2 != null) {
                  vm.field_d[60] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,61", -112);
                if (var2 != null) {
                  vm.field_d[61] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,62", -72);
                if (var2 != null) {
                  vm.field_d[62] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,63", -85);
                if (var2 != null) {
                  vm.field_d[63] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,64", -75);
                if (var2 != null) {
                  vm.field_d[64] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,65", -95);
                if (var2 != null) {
                  vm.field_d[65] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,66", param1 ^ -71);
                if (var2 != null) {
                  vm.field_d[66] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,67", -80);
                if (null != var2) {
                  vm.field_d[67] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,68", -112);
                if (null != var2) {
                  vm.field_d[68] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,69", -102);
                if (null != var2) {
                  vm.field_d[69] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,70", -108);
                if (null != var2) {
                  vm.field_d[70] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,71", -90);
                if (var2 != null) {
                  vm.field_d[71] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,72", -123);
                if (null != var2) {
                  vm.field_d[72] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,73", -93);
                if (null != var2) {
                  vm.field_d[73] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,74", -100);
                if (null != var2) {
                  vm.field_d[74] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,75", -121);
                if (var2 != null) {
                  vm.field_d[75] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,76", -123);
                if (null != var2) {
                  vm.field_d[76] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,77", param1 - 116);
                if (null != var2) {
                  vm.field_d[77] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,78", -124);
                if (var2 != null) {
                  vm.field_d[78] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,79", param1 ^ -124);
                if (var2 != null) {
                  vm.field_d[79] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,80", -113);
                if (null != var2) {
                  vm.field_d[80] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,81", -127);
                if (var2 != null) {
                  vm.field_d[81] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,82", -81);
                if (null != var2) {
                  vm.field_d[82] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,83", -89);
                if (var2 != null) {
                  vm.field_d[83] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,84", -114);
                if (var2 != null) {
                  vm.field_d[84] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,85", -92);
                if (var2 != null) {
                  vm.field_d[85] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,86", -101);
                if (var2 != null) {
                  vm.field_d[86] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,87", -123);
                if (var2 != null) {
                  vm.field_d[87] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,88", param1 ^ -77);
                if (null != var2) {
                  vm.field_d[88] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,89", -124);
                if (null != var2) {
                  vm.field_d[89] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,90", -83);
                if (null != var2) {
                  vm.field_d[90] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,91", param1 ^ -79);
                if (null != var2) {
                  vm.field_d[91] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,92", -99);
                if (var2 != null) {
                  vm.field_d[92] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,93", -107);
                if (var2 != null) {
                  vm.field_d[93] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,94", -76);
                if (var2 != null) {
                  vm.field_d[94] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,95", -86);
                if (var2 != null) {
                  vm.field_d[95] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,96", param1 - 101);
                if (null != var2) {
                  vm.field_d[96] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,97", -88);
                if (null != var2) {
                  vm.field_d[97] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,98", -117);
                if (var2 != null) {
                  vm.field_d[98] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,99", param1 - 122);
                if (null != var2) {
                  vm.field_d[99] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,100", -105);
                if (var2 != null) {
                  vm.field_d[100] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,101", -78);
                if (null != var2) {
                  vm.field_d[101] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,102", -93);
                if (var2 != null) {
                  vm.field_d[102] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,103", -127);
                if (var2 != null) {
                  vm.field_d[103] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,104", -111);
                if (null != var2) {
                  vm.field_d[104] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,105", -77);
                if (var2 != null) {
                  vm.field_d[105] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,106", -127);
                if (null != var2) {
                  vm.field_d[106] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,107", -79);
                if (null != var2) {
                  vm.field_d[107] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,108", param1 ^ -110);
                if (null != var2) {
                  vm.field_d[108] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,109", -84);
                if (null != var2) {
                  vm.field_d[109] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,110", -75);
                if (null != var2) {
                  vm.field_d[110] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,111", -123);
                if (var2 != null) {
                  vm.field_d[111] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,112", -108);
                if (null != var2) {
                  vm.field_d[112] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,113", -104);
                if (var2 != null) {
                  vm.field_d[113] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,114", -128);
                if (null != var2) {
                  vm.field_d[114] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,115", -122);
                if (null != var2) {
                  vm.field_d[115] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,116", -126);
                if (null != var2) {
                  vm.field_d[116] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,117", param1 ^ -65);
                if (null != var2) {
                  vm.field_d[117] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,118", -72);
                if (null != var2) {
                  vm.field_d[118] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,119", -82);
                if (var2 != null) {
                  vm.field_d[119] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,120", -101);
                if (null != var2) {
                  vm.field_d[120] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,121", -107);
                if (null != var2) {
                  vm.field_d[121] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,122", param1 - 94);
                if (null != var2) {
                  vm.field_d[122] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,123", -122);
                if (var2 != null) {
                  vm.field_d[123] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,124", param1 - 129);
                if (var2 != null) {
                  vm.field_d[124] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,125", -80);
                if (var2 != null) {
                  vm.field_d[125] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,126", param1 ^ -105);
                if (null != var2) {
                  vm.field_d[126] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,127", -114);
                if (null != var2) {
                  vm.field_d[127] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,128", param1 - 133);
                if (null != var2) {
                  vm.field_d[128] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,129", -127);
                if (var2 != null) {
                  vm.field_d[129] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,130", -86);
                if (var2 != null) {
                  vm.field_d[130] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,131", -127);
                if (null != var2) {
                  vm.field_d[131] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,132", param1 - 108);
                if (var2 != null) {
                  vm.field_d[132] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,133", param1 - 106);
                if (null != var2) {
                  vm.field_d[133] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,134", -74);
                if (var2 != null) {
                  vm.field_d[134] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,135", -95);
                if (null != var2) {
                  vm.field_d[135] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,136", param1 ^ -74);
                if (var2 != null) {
                  vm.field_d[136] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,137", -74);
                if (null != var2) {
                  vm.field_d[137] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,138", -108);
                if (var2 != null) {
                  vm.field_d[138] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,139", -97);
                if (var2 != null) {
                  vm.field_d[139] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,140", -96);
                if (var2 != null) {
                  vm.field_d[140] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,141", -110);
                if (null != var2) {
                  vm.field_d[141] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,142", -94);
                if (var2 != null) {
                  vm.field_d[142] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,143", param1 ^ -75);
                if (null != var2) {
                  vm.field_d[143] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,144", param1 - 122);
                if (null != var2) {
                  vm.field_d[144] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,145", param1 - 93);
                if (null != var2) {
                  vm.field_d[145] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,146", -119);
                if (var2 != null) {
                  vm.field_d[146] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,147", param1 - 107);
                if (null != var2) {
                  vm.field_d[147] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,148", -83);
                if (null != var2) {
                  vm.field_d[148] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,149", param1 - 96);
                if (var2 != null) {
                  vm.field_d[149] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,150", -114);
                if (null != var2) {
                  vm.field_d[150] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,151", -119);
                if (var2 != null) {
                  vm.field_d[151] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,152", -118);
                if (null != var2) {
                  vm.field_d[152] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,153", -71);
                if (null != var2) {
                  vm.field_d[153] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,154", -124);
                if (null != var2) {
                  vm.field_d[154] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,155", -85);
                if (null != var2) {
                  vm.field_d[155] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,156", -117);
                if (null != var2) {
                  vm.field_d[156] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellstrings,157", -125);
                if (null != var2) {
                  vm.field_d[157] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("reqachievement", param1 - 128);
                if (null != var2) {
                  ArrayWidgetContainer.field_y = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("needthetimebook", -125);
                if (null != var2) {
                  MeshModel.field_n = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("needhatsfortime", param1 ^ -114);
                if (null != var2) {
                  IntrusiveDeque.field_j = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,0", param1 - 136);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[0] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,1", -117);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[1] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,2", -109);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[2] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,3", -78);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[3] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,4", param1 ^ -115);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[4] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,5", -70);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[5] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,6", -124);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[6] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,7", -77);
                if (null != var2) {
                  PasswordFieldPainter.field_w[7] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,8", -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[8] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,9", -92);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[9] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,10", -87);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[10] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,11", -109);
                if (null != var2) {
                  PasswordFieldPainter.field_w[11] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,12", param1 ^ -66);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[12] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,13", -123);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[13] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,14", -108);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[14] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,15", -84);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[15] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,16", -82);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[16] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,17", -71);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[17] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,18", -120);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[18] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,19", -79);
                if (null != var2) {
                  PasswordFieldPainter.field_w[19] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,20", -115);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[20] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,21", param1 - 101);
                if (null != var2) {
                  PasswordFieldPainter.field_w[21] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,22", param1 - 129);
                if (null != var2) {
                  PasswordFieldPainter.field_w[22] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,23", param1 ^ -78);
                if (null != var2) {
                  PasswordFieldPainter.field_w[23] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,24", -100);
                if (null != var2) {
                  PasswordFieldPainter.field_w[24] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,25", param1 ^ -95);
                if (null != var2) {
                  PasswordFieldPainter.field_w[25] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,26", -76);
                if (null != var2) {
                  PasswordFieldPainter.field_w[26] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,27", -112);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[27] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,28", -119);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[28] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,29", -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[29] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,30", -102);
                if (null != var2) {
                  PasswordFieldPainter.field_w[30] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,31", param1 - 97);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[31] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,32", -89);
                if (null != var2) {
                  PasswordFieldPainter.field_w[32] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,33", -96);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[33] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,34", param1 ^ -79);
                if (null != var2) {
                  PasswordFieldPainter.field_w[34] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,35", param1 - 134);
                if (null != var2) {
                  PasswordFieldPainter.field_w[35] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,36", -99);
                if (null != var2) {
                  PasswordFieldPainter.field_w[36] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,37", -116);
                if (null != var2) {
                  PasswordFieldPainter.field_w[37] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,38", -87);
                if (null != var2) {
                  PasswordFieldPainter.field_w[38] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,39", -113);
                if (null != var2) {
                  PasswordFieldPainter.field_w[39] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,40", -101);
                if (null != var2) {
                  PasswordFieldPainter.field_w[40] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,41", param1 ^ -70);
                if (null != var2) {
                  PasswordFieldPainter.field_w[41] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,42", -128);
                if (null != var2) {
                  PasswordFieldPainter.field_w[42] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,43", -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[43] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,44", -96);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[44] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,45", -90);
                if (null != var2) {
                  PasswordFieldPainter.field_w[45] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,46", -103);
                if (null != var2) {
                  PasswordFieldPainter.field_w[46] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,47", -105);
                if (null != var2) {
                  PasswordFieldPainter.field_w[47] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,48", param1 - 145);
                if (null != var2) {
                  PasswordFieldPainter.field_w[48] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,49", -124);
                if (null != var2) {
                  PasswordFieldPainter.field_w[49] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,50", param1 - 124);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[50] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,51", -108);
                if (null != var2) {
                  PasswordFieldPainter.field_w[51] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,52", -122);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[52] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,53", -97);
                if (null != var2) {
                  PasswordFieldPainter.field_w[53] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,54", param1 ^ -74);
                if (null != var2) {
                  PasswordFieldPainter.field_w[54] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,55", -124);
                if (null != var2) {
                  PasswordFieldPainter.field_w[55] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,56", -99);
                if (null != var2) {
                  PasswordFieldPainter.field_w[56] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,57", param1 - 143);
                if (null != var2) {
                  PasswordFieldPainter.field_w[57] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,58", -119);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[58] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,59", -124);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[59] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,60", -128);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[60] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,61", -93);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[61] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,62", -76);
                if (null != var2) {
                  PasswordFieldPainter.field_w[62] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,63", param1 ^ -96);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[63] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,64", -108);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[64] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,65", -115);
                if (null != var2) {
                  PasswordFieldPainter.field_w[65] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,66", -118);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[66] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,67", -91);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[67] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,68", param1 ^ -118);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[68] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,69", -99);
                if (null != var2) {
                  PasswordFieldPainter.field_w[69] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,70", param1 ^ -114);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[70] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,71", -109);
                if (null != var2) {
                  PasswordFieldPainter.field_w[71] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,72", -80);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[72] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,73", param1 - 140);
                if (null != var2) {
                  PasswordFieldPainter.field_w[73] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,74", param1 ^ -75);
                if (null != var2) {
                  PasswordFieldPainter.field_w[74] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,75", param1 - 120);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[75] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,76", param1 ^ -100);
                if (null != var2) {
                  PasswordFieldPainter.field_w[76] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,77", -75);
                if (null != var2) {
                  PasswordFieldPainter.field_w[77] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,78", param1 ^ -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[78] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,79", -123);
                if (null != var2) {
                  PasswordFieldPainter.field_w[79] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,80", param1 ^ -91);
                if (null != var2) {
                  PasswordFieldPainter.field_w[80] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,81", param1 ^ -122);
                if (null != var2) {
                  PasswordFieldPainter.field_w[81] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,82", param1 ^ -118);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[82] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,83", param1 ^ -105);
                if (null != var2) {
                  PasswordFieldPainter.field_w[83] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,84", -77);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[84] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,85", -70);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[85] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,86", -80);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[86] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,87", param1 ^ -84);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[87] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,88", -95);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[88] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,89", -74);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[89] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,90", -96);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[90] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,91", -118);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[91] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,92", -87);
                if (null != var2) {
                  PasswordFieldPainter.field_w[92] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,93", param1 - 146);
                if (null != var2) {
                  PasswordFieldPainter.field_w[93] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,94", param1 - 139);
                if (null != var2) {
                  PasswordFieldPainter.field_w[94] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,95", -108);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[95] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,96", -80);
                if (null != var2) {
                  PasswordFieldPainter.field_w[96] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,97", -122);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[97] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,98", -93);
                if (null != var2) {
                  PasswordFieldPainter.field_w[98] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,99", -119);
                if (null != var2) {
                  PasswordFieldPainter.field_w[99] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,100", param1 - 99);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[100] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,101", param1 ^ -96);
                if (null != var2) {
                  PasswordFieldPainter.field_w[101] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,102", -75);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[102] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,103", -96);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[103] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,104", -113);
                if (null != var2) {
                  PasswordFieldPainter.field_w[104] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,105", -104);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[105] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,106", param1 ^ -70);
                if (null != var2) {
                  PasswordFieldPainter.field_w[106] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,107", -80);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[107] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,108", -98);
                if (null != var2) {
                  PasswordFieldPainter.field_w[108] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,109", param1 ^ -76);
                if (null != var2) {
                  PasswordFieldPainter.field_w[109] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,110", -88);
                if (null != var2) {
                  PasswordFieldPainter.field_w[110] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,111", -122);
                if (null != var2) {
                  PasswordFieldPainter.field_w[111] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,112", -83);
                if (null != var2) {
                  PasswordFieldPainter.field_w[112] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,113", -126);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[113] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,114", -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[114] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,115", -95);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[115] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,116", param1 - 142);
                if (null != var2) {
                  PasswordFieldPainter.field_w[116] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,117", -110);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[117] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,118", param1 ^ -98);
                if (null != var2) {
                  PasswordFieldPainter.field_w[118] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,119", -101);
                if (null != var2) {
                  PasswordFieldPainter.field_w[119] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,120", param1 - 118);
                if (null != var2) {
                  PasswordFieldPainter.field_w[120] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,121", -116);
                if (null != var2) {
                  PasswordFieldPainter.field_w[121] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,122", -76);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[122] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,123", -108);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[123] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,124", -124);
                if (null != var2) {
                  PasswordFieldPainter.field_w[124] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,125", -110);
                if (null != var2) {
                  PasswordFieldPainter.field_w[125] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,126", -81);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[126] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,127", -125);
                if (null != var2) {
                  PasswordFieldPainter.field_w[127] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,128", -106);
                if (null != var2) {
                  PasswordFieldPainter.field_w[128] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,129", -91);
                if (null != var2) {
                  PasswordFieldPainter.field_w[129] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,130", -124);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[130] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,131", -70);
                if (null != var2) {
                  PasswordFieldPainter.field_w[131] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,132", -118);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[132] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,133", param1 ^ -104);
                if (null != var2) {
                  PasswordFieldPainter.field_w[133] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,134", -80);
                if (null != var2) {
                  PasswordFieldPainter.field_w[134] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,135", -126);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[135] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,136", param1 - 103);
                if (null != var2) {
                  PasswordFieldPainter.field_w[136] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,137", param1 - 126);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[137] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,138", param1 - 97);
                if (null != var2) {
                  PasswordFieldPainter.field_w[138] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,139", -80);
                if (null != var2) {
                  PasswordFieldPainter.field_w[139] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,140", -100);
                if (null != var2) {
                  PasswordFieldPainter.field_w[140] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,141", param1 - 93);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[141] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,142", -88);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[142] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,143", -112);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[143] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,144", -100);
                if (null != var2) {
                  PasswordFieldPainter.field_w[144] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,145", param1 ^ -105);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[145] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,146", -109);
                if (null != var2) {
                  PasswordFieldPainter.field_w[146] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,147", -114);
                if (null != var2) {
                  PasswordFieldPainter.field_w[147] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,148", param1 ^ -91);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[148] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,149", param1 - 142);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[149] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,150", -107);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[150] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,151", -107);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[151] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,152", param1 - 141);
                if (null != var2) {
                  PasswordFieldPainter.field_w[152] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,153", -97);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[153] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,154", -77);
                if (null != var2) {
                  PasswordFieldPainter.field_w[154] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,155", param1 - 107);
                if (null != var2) {
                  PasswordFieldPainter.field_w[155] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,156", -127);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[156] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellnames,157", -126);
                if (var2 != null) {
                  PasswordFieldPainter.field_w[157] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,0", -74);
                if (var2 != null) {
                  rb.field_n[0] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,1", -123);
                if (var2 != null) {
                  rb.field_n[1] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,2", param1 - 106);
                if (null != var2) {
                  rb.field_n[2] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,3", -109);
                if (null != var2) {
                  rb.field_n[3] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,4", -75);
                if (var2 != null) {
                  rb.field_n[4] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,5", param1 - 127);
                if (null != var2) {
                  rb.field_n[5] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,6", param1 ^ -70);
                if (var2 != null) {
                  rb.field_n[6] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,7", -79);
                if (null != var2) {
                  rb.field_n[7] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,8", param1 ^ -108);
                if (null != var2) {
                  rb.field_n[8] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,9", -91);
                if (var2 != null) {
                  rb.field_n[9] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,10", -112);
                if (null != var2) {
                  rb.field_n[10] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,11", -92);
                if (var2 != null) {
                  rb.field_n[11] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,12", -115);
                if (null != var2) {
                  rb.field_n[12] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,13", -110);
                if (var2 != null) {
                  rb.field_n[13] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,14", -79);
                if (var2 != null) {
                  rb.field_n[14] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,15", -105);
                if (var2 != null) {
                  rb.field_n[15] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,16", -101);
                if (null != var2) {
                  rb.field_n[16] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,17", -86);
                if (var2 != null) {
                  rb.field_n[17] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,18", param1 - 126);
                if (var2 != null) {
                  rb.field_n[18] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,19", -128);
                if (var2 != null) {
                  rb.field_n[19] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,20", -87);
                if (null != var2) {
                  rb.field_n[20] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,21", param1 ^ -120);
                if (var2 != null) {
                  rb.field_n[21] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,22", param1 ^ -98);
                if (var2 != null) {
                  rb.field_n[22] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,23", -93);
                if (var2 != null) {
                  rb.field_n[23] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,24", -73);
                if (null != var2) {
                  rb.field_n[24] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,25", -72);
                if (null != var2) {
                  rb.field_n[25] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,26", -118);
                if (var2 != null) {
                  rb.field_n[26] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,27", param1 ^ -89);
                if (var2 != null) {
                  rb.field_n[27] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,28", -84);
                if (null != var2) {
                  rb.field_n[28] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,29", -114);
                if (null != var2) {
                  rb.field_n[29] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,30", -106);
                if (null != var2) {
                  rb.field_n[30] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,31", param1 - 115);
                if (null != var2) {
                  rb.field_n[31] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,32", -111);
                if (var2 != null) {
                  rb.field_n[32] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,33", -101);
                if (var2 != null) {
                  rb.field_n[33] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,34", -107);
                if (null != var2) {
                  rb.field_n[34] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,35", -99);
                if (var2 != null) {
                  rb.field_n[35] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,36", -83);
                if (null != var2) {
                  rb.field_n[36] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,37", param1 ^ -94);
                if (var2 != null) {
                  rb.field_n[37] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,38", param1 - 141);
                if (var2 != null) {
                  rb.field_n[38] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,39", -106);
                if (null != var2) {
                  rb.field_n[39] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,40", -112);
                if (var2 != null) {
                  rb.field_n[40] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,41", -109);
                if (null != var2) {
                  rb.field_n[41] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,42", -79);
                if (var2 != null) {
                  rb.field_n[42] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,43", -117);
                if (var2 != null) {
                  rb.field_n[43] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,44", param1 ^ -109);
                if (var2 != null) {
                  rb.field_n[44] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,45", param1 ^ -101);
                if (var2 != null) {
                  rb.field_n[45] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,46", -127);
                if (null != var2) {
                  rb.field_n[46] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,47", -111);
                if (var2 != null) {
                  rb.field_n[47] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,48", -118);
                if (var2 != null) {
                  rb.field_n[48] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,49", -125);
                if (var2 != null) {
                  rb.field_n[49] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,50", -112);
                if (var2 != null) {
                  rb.field_n[50] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,51", -113);
                if (var2 != null) {
                  rb.field_n[51] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,52", -125);
                if (var2 != null) {
                  rb.field_n[52] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,53", -81);
                if (var2 != null) {
                  rb.field_n[53] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,54", param1 - 103);
                if (null != var2) {
                  rb.field_n[54] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,55", -80);
                if (null != var2) {
                  rb.field_n[55] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,56", -82);
                if (null != var2) {
                  rb.field_n[56] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,57", -115);
                if (null != var2) {
                  rb.field_n[57] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,58", -98);
                if (null != var2) {
                  rb.field_n[58] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,59", -125);
                if (null != var2) {
                  rb.field_n[59] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,60", -120);
                if (null != var2) {
                  rb.field_n[60] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,61", -77);
                if (null != var2) {
                  rb.field_n[61] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,62", -88);
                if (null != var2) {
                  rb.field_n[62] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,63", param1 - 142);
                if (var2 != null) {
                  rb.field_n[63] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,64", -74);
                if (var2 != null) {
                  rb.field_n[64] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,65", param1 - 115);
                if (var2 != null) {
                  rb.field_n[65] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,66", param1 ^ -108);
                if (var2 != null) {
                  rb.field_n[66] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,67", param1 - 123);
                if (var2 != null) {
                  rb.field_n[67] = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,68", -111);
                if (null != var2) {
                  rb.field_n[68] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,69", -117);
                if (null != var2) {
                  rb.field_n[69] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,70", -126);
                if (null != var2) {
                  rb.field_n[70] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,71", -94);
                if (null != var2) {
                  rb.field_n[71] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,72", -97);
                if (null != var2) {
                  rb.field_n[72] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,73", -120);
                if (var2 != null) {
                  rb.field_n[73] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,74", param1 ^ -108);
                if (var2 != null) {
                  rb.field_n[74] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,75", -84);
                if (var2 != null) {
                  rb.field_n[75] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,76", param1 ^ -103);
                if (null != var2) {
                  rb.field_n[76] = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,77", -85);
                if (var2 != null) {
                  rb.field_n[77] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,78", -118);
                if (var2 != null) {
                  rb.field_n[78] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,79", -117);
                if (var2 != null) {
                  rb.field_n[79] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,80", -84);
                if (var2 != null) {
                  rb.field_n[80] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,81", -98);
                if (null != var2) {
                  rb.field_n[81] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,82", -78);
                if (var2 != null) {
                  rb.field_n[82] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,83", -96);
                if (var2 != null) {
                  rb.field_n[83] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,84", -102);
                if (null != var2) {
                  rb.field_n[84] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,85", -112);
                if (null != var2) {
                  rb.field_n[85] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,86", -81);
                if (null != var2) {
                  rb.field_n[86] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,87", -80);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  rb.field_n[87] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,88", param1 ^ -101);
                if (var2 != null) {
                  rb.field_n[88] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,89", param1 - 104);
                if (var2 != null) {
                  rb.field_n[89] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,90", -118);
                if (var2 != null) {
                  rb.field_n[90] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,91", param1 - 106);
                if (null != var2) {
                  rb.field_n[91] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,92", -80);
                if (var2 != null) {
                  rb.field_n[92] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,93", -101);
                if (null != var2) {
                  rb.field_n[93] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_names,94", -117);
                if (null != var2) {
                  rb.field_n[94] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,0", param1 ^ -119);
                if (null != var2) {
                  af.field_Bb[0] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,1", -105);
                if (var2 != null) {
                  af.field_Bb[1] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,2", -98);
                if (null != var2) {
                  af.field_Bb[2] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,3", -116);
                if (var2 != null) {
                  af.field_Bb[3] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,4", -70);
                if (null != var2) {
                  af.field_Bb[4] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,5", param1 - 141);
                if (null != var2) {
                  af.field_Bb[5] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,6", -119);
                if (null != var2) {
                  af.field_Bb[6] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,7", -82);
                if (var2 != null) {
                  af.field_Bb[7] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,8", -75);
                if (var2 != null) {
                  af.field_Bb[8] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,9", -100);
                if (null != var2) {
                  af.field_Bb[9] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,10", -125);
                if (var2 != null) {
                  af.field_Bb[10] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,11", -112);
                if (null != var2) {
                  af.field_Bb[11] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,12", param1 - 142);
                if (var2 != null) {
                  af.field_Bb[12] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,13", -79);
                if (null != var2) {
                  af.field_Bb[13] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,14", param1 - 125);
                if (null != var2) {
                  af.field_Bb[14] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,15", param1 ^ -119);
                if (null != var2) {
                  af.field_Bb[15] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,16", param1 - 130);
                if (var2 != null) {
                  af.field_Bb[16] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,17", -73);
                if (var2 != null) {
                  af.field_Bb[17] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,18", -101);
                if (var2 != null) {
                  af.field_Bb[18] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,19", -97);
                if (null != var2) {
                  af.field_Bb[19] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,20", -101);
                if (var2 != null) {
                  af.field_Bb[20] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,21", -106);
                if (var2 != null) {
                  af.field_Bb[21] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,22", param1 - 126);
                if (var2 != null) {
                  af.field_Bb[22] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,23", -124);
                if (null != var2) {
                  af.field_Bb[23] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,24", -125);
                if (null != var2) {
                  af.field_Bb[24] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,25", -103);
                if (null != var2) {
                  af.field_Bb[25] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,26", param1 - 97);
                if (null != var2) {
                  af.field_Bb[26] = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,27", -110);
                if (var2 != null) {
                  af.field_Bb[27] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,28", -75);
                if (var2 != null) {
                  af.field_Bb[28] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,29", -100);
                if (null != var2) {
                  af.field_Bb[29] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,30", -94);
                if (var2 != null) {
                  af.field_Bb[30] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,31", -108);
                if (var2 != null) {
                  af.field_Bb[31] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,32", -85);
                if (var2 != null) {
                  af.field_Bb[32] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,33", -122);
                if (null != var2) {
                  af.field_Bb[33] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,34", -88);
                if (null != var2) {
                  af.field_Bb[34] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,35", param1 ^ -115);
                if (var2 != null) {
                  af.field_Bb[35] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,36", -122);
                if (null != var2) {
                  af.field_Bb[36] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,37", -88);
                if (null != var2) {
                  af.field_Bb[37] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,38", -81);
                if (null != var2) {
                  af.field_Bb[38] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,39", -97);
                if (var2 != null) {
                  af.field_Bb[39] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,40", param1 ^ -71);
                if (var2 != null) {
                  af.field_Bb[40] = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,41", -121);
                if (var2 != null) {
                  af.field_Bb[41] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,42", -86);
                if (null != var2) {
                  af.field_Bb[42] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,43", -79);
                if (var2 != null) {
                  af.field_Bb[43] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,44", -96);
                if (var2 != null) {
                  af.field_Bb[44] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,45", -115);
                if (null != var2) {
                  af.field_Bb[45] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,46", param1 - 144);
                if (var2 != null) {
                  af.field_Bb[46] = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,47", -80);
                if (null != var2) {
                  af.field_Bb[47] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,48", param1 ^ -107);
                if (var2 != null) {
                  af.field_Bb[48] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,49", -118);
                if (var2 != null) {
                  af.field_Bb[49] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,50", -115);
                if (var2 != null) {
                  af.field_Bb[50] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,51", -86);
                if (var2 != null) {
                  af.field_Bb[51] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,52", -71);
                if (var2 != null) {
                  af.field_Bb[52] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,53", -96);
                if (var2 != null) {
                  af.field_Bb[53] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,54", param1 ^ -123);
                if (null != var2) {
                  af.field_Bb[54] = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,55", -83);
                if (var2 != null) {
                  af.field_Bb[55] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,56", param1 ^ -111);
                if (null != var2) {
                  af.field_Bb[56] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,57", -103);
                if (var2 != null) {
                  af.field_Bb[57] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,58", -120);
                if (var2 != null) {
                  af.field_Bb[58] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,59", -103);
                if (var2 != null) {
                  af.field_Bb[59] = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,60", param1 ^ -90);
                if (var2 != null) {
                  af.field_Bb[60] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,61", -91);
                if (var2 != null) {
                  af.field_Bb[61] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,62", -110);
                if (null != var2) {
                  af.field_Bb[62] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,63", -76);
                if (var2 != null) {
                  af.field_Bb[63] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,64", -127);
                if (null != var2) {
                  af.field_Bb[64] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,65", -108);
                if (null != var2) {
                  af.field_Bb[65] = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,66", -96);
                if (null != var2) {
                  af.field_Bb[66] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,67", param1 ^ -105);
                if (null != var2) {
                  af.field_Bb[67] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,68", -115);
                if (var2 != null) {
                  af.field_Bb[68] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,69", -72);
                if (var2 != null) {
                  af.field_Bb[69] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,70", -97);
                if (var2 != null) {
                  af.field_Bb[70] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,71", -121);
                if (null != var2) {
                  af.field_Bb[71] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,72", -114);
                if (var2 != null) {
                  af.field_Bb[72] = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,73", -94);
                if (var2 != null) {
                  af.field_Bb[73] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,74", -98);
                if (var2 != null) {
                  af.field_Bb[74] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,75", param1 - 110);
                if (var2 != null) {
                  af.field_Bb[75] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,76", -89);
                if (var2 != null) {
                  af.field_Bb[76] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,77", -126);
                if (var2 != null) {
                  af.field_Bb[77] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,78", param1 - 124);
                if (null != var2) {
                  af.field_Bb[78] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,79", -75);
                if (null != var2) {
                  af.field_Bb[79] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,80", -100);
                if (var2 != null) {
                  af.field_Bb[80] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,81", param1 ^ -81);
                if (var2 != null) {
                  af.field_Bb[81] = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,82", -92);
                if (var2 != null) {
                  af.field_Bb[82] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,83", -105);
                if (null != var2) {
                  af.field_Bb[83] = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,84", -111);
                if (null != var2) {
                  af.field_Bb[84] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,85", -79);
                if (null != var2) {
                  af.field_Bb[85] = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,86", -124);
                if (null != var2) {
                  af.field_Bb[86] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,87", param1 - 137);
                if (null != var2) {
                  af.field_Bb[87] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,88", -119);
                if (var2 != null) {
                  af.field_Bb[88] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,89", param1 - 126);
                if (null != var2) {
                  af.field_Bb[89] = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,90", -122);
                if (null != var2) {
                  af.field_Bb[90] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,91", param1 ^ -125);
                if (var2 != null) {
                  af.field_Bb[91] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,92", -122);
                if (null != var2) {
                  af.field_Bb[92] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,93", -81);
                if (var2 != null) {
                  af.field_Bb[93] = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("achievement_criteria,94", -90);
                if (var2 != null) {
                  af.field_Bb[94] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_walkleft1", -72);
                if (null != var2) {
                  WeightedLruCache.field_g = var2[0] & 255;
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_walkright1", -72);
                if (var2 != null) {
                  UsernameCredentials.field_g = var2[0] & 255;
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_walkleft2", -123);
                if (null != var2) {
                  ko.field_k = var2[0] & 255;
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_walkright2", -100);
                if (null != var2) {
                  GameApplet.field_w = 255 & var2[0];
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_scrollup", -102);
                if (var2 != null) {
                  fi.field_e = 255 & var2[0];
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_scrolldown", -93);
                if (null != var2) {
                  cm.field_j = 255 & var2[0];
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_scrollleft", param1 - 119);
                if (var2 != null) {
                  ClientException.field_a = var2[0] & 255;
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_scrollright", -105);
                if (null != var2) {
                  qo.field_b = 255 & var2[0];
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_q", -96);
                if (var2 != null) {
                  ByteStorage.field_c = var2[0] & 255;
                }
                var2 = CachedArchiveProvider.loadNamedFile("keycode_c", param1 ^ -104);
                if (null != var2) {
                  ao.field_f = 255 & var2[0];
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_login_or_discard", -86);
                if (var2 != null) {
                  ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("charcreate", -110);
                if (var2 != null) {
                  ie.field_Lb = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spelselect", -82);
                if (null != var2) {
                  KeyboardInputHandler.field_l = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("multiplayer", -101);
                if (null != var2) {
                  CameraFollowTarget.field_a = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_randomize", -72);
                if (var2 != null) {
                  nj.field_l = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_offeringrematch", -113);
                if (var2 != null) {
                  MembershipOfferScreen.field_b = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_waiting", -72);
                if (null != var2) {
                  MenuScreen.field_r = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("text_declined", -104);
                if (var2 != null) {
                  DiskCacheRequest.field_I = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameoptlabels,0", -125);
                if (null != var2) {
                  aj.field_a[0] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameoptlabels,1", -75);
                if (var2 != null) {
                  aj.field_a[1] = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameoptlabels,2", -110);
                if (null != var2) {
                  aj.field_a[2] = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,0", -75);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][0] = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,1", -127);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][1] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,2", param1 - 142);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][2] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,3", -72);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][3] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,4", -99);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][4] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,5", param1 - 112);
                if (null != var2) {
                  WhirlpoolHasher.field_l[0][5] = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,0,6", -92);
                if (var2 != null) {
                  WhirlpoolHasher.field_l[0][6] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,2,0", -83);
                if (null != var2) {
                  WhirlpoolHasher.field_l[2][0] = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_buttonnames,2,1", -121);
                if (var2 != null) {
                  WhirlpoolHasher.field_l[2][1] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,0", param1 - 92);
                if (var2 != null) {
                  DelegatingCanvas.field_d[0][0] = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,1", param1 ^ -123);
                if (null != var2) {
                  DelegatingCanvas.field_d[0][1] = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,2", -114);
                if (var2 != null) {
                  DelegatingCanvas.field_d[0][2] = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,3", param1 - 140);
                if (null != var2) {
                  DelegatingCanvas.field_d[0][3] = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,4", -73);
                if (var2 != null) {
                  DelegatingCanvas.field_d[0][4] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,5", -119);
                if (null != var2) {
                  DelegatingCanvas.field_d[0][5] = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,0,6", -127);
                if (null != var2) {
                  DelegatingCanvas.field_d[0][6] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,0", param1 ^ -84);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][0] = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,1", -95);
                if (var2 != null) {
                  DelegatingCanvas.field_d[1][1] = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,2", -90);
                if (var2 != null) {
                  DelegatingCanvas.field_d[1][2] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,3", -78);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][3] = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,4", param1 ^ -71);
                if (var2 != null) {
                  DelegatingCanvas.field_d[1][4] = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,5", -105);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][5] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,6", param1 - 132);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][6] = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,7", -76);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][7] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,8", -115);
                if (null != var2) {
                  DelegatingCanvas.field_d[1][8] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,1,9", -86);
                if (var2 != null) {
                  DelegatingCanvas.field_d[1][9] = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,2,0", -86);
                if (null != var2) {
                  DelegatingCanvas.field_d[2][0] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameopt_tooltipnames,2,1", -80);
                if (var2 != null) {
                  DelegatingCanvas.field_d[2][1] = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,0", param1 ^ -121);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[0] = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,1", -99);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[1] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,2", -71);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[2] = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,3", param1 - 146);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[3] = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,4", -113);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[4] = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,5", param1 ^ -124);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[5] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,6", -107);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[6] = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,7", param1 ^ -114);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[7] = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,8", -79);
                if (null != var2) {
                  LoadingProgressDialog.field_kb[8] = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,9", -96);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[9] = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,10", -76);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[10] = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,11", param1 ^ -101);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[11] = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("instructions_pages,12", -121);
                if (var2 != null) {
                  LoadingProgressDialog.field_kb[12] = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("yourname", param1 ^ -76);
                if (null != var2) {
                  BufferedSocket.field_p = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("castingspace", param1 - 97);
                if (var2 != null) {
                  NameSuggestionsPanel.field_I = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellbook_membersonly", -73);
                if (null != var2) {
                  qe.field_r = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("rated_membersonly", -127);
                if (var2 != null) {
                  NameValidator.field_t = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("wands_membersonly", -101);
                if (var2 != null) {
                  QuickChatPhrase.field_o = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youhavenoplatipusesavailaible", param1 ^ -113);
                if (null != var2) {
                  aa.field_j = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("playratedgamesgoshdarnit", -109);
                if (null != var2) {
                  TextFieldValidator.field_i = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("wandsavail", -87);
                if (var2 != null) {
                  IsaacCipher.field_l = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("playmoregames", -115);
                if (null != var2) {
                  ic.field_b = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("nowands", param1 ^ -104);
                if (null != var2) {
                  GrowableIntList.field_l = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("wandsspace", -80);
                if (var2 != null) {
                  mh.field_I = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("timetickingdown", -113);
                if (null != var2) {
                  UsernameCredentials.field_i = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc7", -98);
                if (var2 != null) {
                  kj.field_d = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit7", -114);
                if (null != var2) {
                  bm.field_c = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc6", -124);
                if (null != var2) {
                  LobbyGameEntry.field_lc = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit6", param1 ^ -93);
                if (var2 != null) {
                  QuickChatPhraseCache.field_j = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc5", -113);
                if (var2 != null) {
                  bj.field_pb = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit5", -121);
                if (null != var2) {
                  ih.field_a = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc4", param1 - 117);
                if (var2 != null) {
                  lm.field_h = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit4", -90);
                if (null != var2) {
                  gj.field_b = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc3", -70);
                if (null != var2) {
                  SoundCache.field_h = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit3", param1 - 94);
                if (null != var2) {
                  JaggrabDownloader.field_c = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc2", -109);
                if (null != var2) {
                  pc.field_f = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit2", param1 ^ -82);
                if (var2 != null) {
                  DateInputWidget.field_F = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc1", -128);
                if (null != var2) {
                  LinkButtonPainter.field_b = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit1", param1 ^ -66);
                if (var2 != null) {
                  AudioService.field_d = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dsc0", -115);
                if (null != var2) {
                  jo.field_d = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tit0", -85);
                if (null != var2) {
                  aj.field_f = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("clicktobuybook", -87);
                if (var2 != null) {
                  SceneTabbedPanel.field_Ob = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("getmorewands", -115);
                if (null != var2) {
                  mb.field_R = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("getmorewands_free", -76);
                if (var2 != null) {
                  Battle.field_yb = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("wandstobuy5", param1 - 95);
                if (var2 != null) {
                  aj.field_b = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("overdisc2", -117);
                if (var2 != null) {
                  ResizableViewResizeListener.field_k = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("underdisc2", -71);
                if (var2 != null) {
                  ArchiveIndex.field_v = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("frostdisc2", -111);
                if (var2 != null) {
                  ie.field_Jb = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stormdisc2", -75);
                if (null != var2) {
                  ec.field_h = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stonedisc2", -119);
                if (var2 != null) {
                  sb.field_d = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("naturedisc2", -84);
                if (var2 != null) {
                  NameValidator.field_q = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("oceandisc2", -104);
                if (null != var2) {
                  DropTargetWidget.field_H = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("level3locked", -124);
                if (null != var2) {
                  HotspotRegion.field_k = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("thisislevel2locked", -113);
                if (null != var2) {
                  NodeHashTableIterator.field_f = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("overdisc", param1 - 120);
                if (null != var2) {
                  SoundCache.field_f = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("overbook", -104);
                if (null != var2) {
                  TextHotspotWidget.field_M = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = CachedArchiveProvider.loadNamedFile("underidsc", -73);
                if (null != var2) {
                  IterableNodeHashTable.field_g = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("underbook", param1 ^ -127);
                if (null != var2) {
                  ad.field_g = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("frostdisc", -113);
                if (var2 != null) {
                  QuickChatPhrase.field_r = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("frostbook", -70);
                if (null != var2) {
                  SecondaryNodeDequeIterator.field_d = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stormdisc", -100);
                if (var2 != null) {
                  hm.field_d = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stormbook", -101);
                if (var2 != null) {
                  UiContainer.field_x = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stonedisc", -99);
                if (var2 != null) {
                  ri.field_d = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stonebook", param1 - 93);
                if (var2 != null) {
                  MusicCrossfadeStream.field_z = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("flamedisc", -88);
                if (null != var2) {
                  BevelBoxPainter.field_b = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("flamebook", -82);
                if (var2 != null) {
                  LoadingProgressDialog.field_qb = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("arcanedisc", -82);
                if (null != var2) {
                  AlternateUsernameCredentials.field_k = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("arcanebook", -98);
                if (null != var2) {
                  DebouncedValidator.field_c = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("naturedisc", param1 ^ -124);
                if (null != var2) {
                  QuickChatPhrase.field_w = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                if (param1 != 22) {
                  field_e = (String) null;
                }
                var2 = CachedArchiveProvider.loadNamedFile("naturebook", param1 - 93);
                if (null != var2) {
                  Battle.field_e = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("oceandisc", -93);
                if (null != var2) {
                  SpellProjectile.field_s = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("oceanbook", -92);
                if (null != var2) {
                  QuickChatCategory.field_r = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("cogsdisc", param1 ^ -101);
                if (var2 != null) {
                  FullscreenFocusCanvas.field_f = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("cogsbook", -107);
                if (var2 != null) {
                  BevelBoxPainter.field_c = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("choosespellsmoredetail", -84);
                if (var2 != null) {
                  tn.field_Ib = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("choosespells", -111);
                if (null != var2) {
                  HotspotRegion.field_l = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("buyfor3", -86);
                if (null != var2) {
                  TextHotspotWidget.field_P = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("buyfor2", -116);
                if (null != var2) {
                  SoundCache.field_l = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("notenoughwands", param1 - 137);
                if (null != var2) {
                  ArchiveIndex.field_d = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("buyasmember", param1 ^ -107);
                if (var2 != null) {
                  gg.field_g = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellbooknotpur", param1 - 94);
                if (null != var2) {
                  ra.field_i = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spellbooknotaquired", -118);
                if (var2 != null) {
                  vf.field_h = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("chosesspells", -115);
                if (var2 != null) {
                  PasswordFieldPainter.field_F = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("sort1", -74);
                if (null != var2) {
                  SceneTabbedPanel.field_Cb = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("sort0", -96);
                if (var2 != null) {
                  MenuButtonPanel.field_N = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("waitingforawards", -99);
                if (var2 != null) {
                  nj.field_b = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostbounce", -76);
                if (var2 != null) {
                  Js5ArchiveManager.field_a = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostfit", -108);
                if (var2 != null) {
                  rk.field_S = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mosthonor", -109);
                if (var2 != null) {
                  nj.field_i = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostcruel", -98);
                if (null != var2) {
                  SoundCache.field_i = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostresil", -111);
                if (var2 != null) {
                  co.field_b = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("minionmaster", -101);
                if (var2 != null) {
                  ao.field_a = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("dragonmaster", -108);
                if (var2 != null) {
                  ResizableModalPanel.field_X = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("impmaster", param1 ^ -76);
                if (var2 != null) {
                  ed.field_Eb = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostcrap", -72);
                if (var2 != null) {
                  PacketBuffer.field_h = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostwet", param1 - 147);
                if (null != var2) {
                  DropTargetWidget.field_J = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostskill", -107);
                if (var2 != null) {
                  SectorCacheStore.field_a = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostkill", -86);
                if (var2 != null) {
                  ArchiveProvider.field_e = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostminion", -124);
                if (null != var2) {
                  TextHotspotWidget.field_N = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostannoying", param1 ^ -110);
                if (null != var2) {
                  qa.field_p = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostpower", -103);
                if (null != var2) {
                  tm.field_e = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostdamage", param1 - 131);
                if (var2 != null) {
                  lo.field_v = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mostzombiemonkies", -72);
                if (null != var2) {
                  NanoFrameClock.field_q = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gameoutoftime", param1 - 141);
                if (null != var2) {
                  ff.field_d = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("drawgame", -98);
                if (null != var2) {
                  th.field_a = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("winnerdash", -84);
                if (null != var2) {
                  EditableTextWidget.field_K = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("pressstart", -94);
                if (null != var2) {
                  qe.field_s = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("currentlyyourturnpressstart", -74);
                if (null != var2) {
                  ae.field_d = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins55", param1 - 95);
                if (var2 != null) {
                  ao.field_b = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins54", -72);
                if (null != var2) {
                  lo.field_t = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins53", -123);
                if (var2 != null) {
                  lm.field_d = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins52", -111);
                if (var2 != null) {
                  SingleChildContainer.field_A = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins51", param1 ^ -93);
                if (null != var2) {
                  ValidationHelpWidget.field_S = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins50", -122);
                if (var2 != null) {
                  QuickChatCategory.field_q = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins49", param1 ^ -75);
                if (null != var2) {
                  SceneScrollPane.field_Bb = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins48", -83);
                if (null != var2) {
                  JaggrabDownloader.field_o = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins47", param1 - 120);
                if (var2 != null) {
                  ah.field_e = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins46", -119);
                if (var2 != null) {
                  rk.field_J = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins45", -124);
                if (var2 != null) {
                  OptionsDialog.field_pb = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins44", -97);
                if (null != var2) {
                  LobbyGameEntry.field_Tb = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins43", -105);
                if (var2 != null) {
                  PlayerActionMenu.field_j = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins42", -109);
                if (null != var2) {
                  EmailLoginCredentials.field_m = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins41", -108);
                if (null != var2) {
                  fo.field_j = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins40", -125);
                if (var2 != null) {
                  EmailLoginCredentials.field_n = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spacewands", -124);
                if (var2 != null) {
                  CanvasRasterBuffer.field_g = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("spacewand", param1 - 97);
                if (null != var2) {
                  SingleChildContainer.field_x = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins39", param1 - 122);
                if (null != var2) {
                  MouseWheelHandler.field_a = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins38", -103);
                if (var2 != null) {
                  NameCheckRequest.field_b = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins37", -75);
                if (var2 != null) {
                  i.field_h = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins36", -115);
                if (var2 != null) {
                  tn.field_Kb = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins35", -77);
                if (null != var2) {
                  QuickChatPhrase.field_m = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins34", -119);
                if (var2 != null) {
                  oa.field_b = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins33", param1 - 111);
                if (null != var2) {
                  ConditionalTextValue.field_a = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins32", -106);
                if (null != var2) {
                  HuffmanCodec.field_m = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins31", -117);
                if (var2 != null) {
                  lh.field_h = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins30", -87);
                if (null != var2) {
                  ue.field_a = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins29", -92);
                if (null != var2) {
                  IntKeyLookup.field_e = ValidationHelpWidget.decodeString((byte) 93, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins28", param1 ^ -68);
                if (null != var2) {
                  IsaacRandom.field_e = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins27", -76);
                if (var2 != null) {
                  MenuButtonPanel.field_P = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins26", -120);
                if (var2 != null) {
                  SecondaryNodeDeque.field_e = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins26b", -114);
                if (var2 != null) {
                  jn.field_b = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins25", -88);
                if (var2 != null) {
                  om.field_L = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins24", -121);
                if (var2 != null) {
                  DisplayNameForm.field_J = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins23", -108);
                if (var2 != null) {
                  LoadingTracker.field_f = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins22", -103);
                if (var2 != null) {
                  JaggrabDownloader.field_i = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins21", -103);
                if (var2 != null) {
                  qj.field_b = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins20", -127);
                if (null != var2) {
                  NodeHashTableIterator.field_i = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins19", param1 - 147);
                if (var2 != null) {
                  ConnectionState.field_b = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins18", -111);
                if (null != var2) {
                  mn.field_q = ValidationHelpWidget.decodeString((byte) 125, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins17", -97);
                if (var2 != null) {
                  oj.field_a = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins16", -105);
                if (null != var2) {
                  Scrollbar.field_S = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins15", -91);
                if (null != var2) {
                  MenuScreen.field_o = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins14", -123);
                if (var2 != null) {
                  ClientException.field_h = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins13", -85);
                if (var2 != null) {
                  pm.field_g = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins12", param1 - 108);
                if (null != var2) {
                  cf.field_e = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins11", -111);
                if (null != var2) {
                  lf.field_d = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins10", -78);
                if (null != var2) {
                  vf.field_p = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins9", param1 ^ -76);
                if (var2 != null) {
                  CredentialKind.field_e = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins8", -90);
                if (var2 != null) {
                  cc.field_b = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins7", -79);
                if (var2 != null) {
                  UiComponent.field_l = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins6", -94);
                if (var2 != null) {
                  md.field_e = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins5", -97);
                if (null != var2) {
                  fj.field_g = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins4", -99);
                if (var2 != null) {
                  fd.field_c = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins3", -77);
                if (var2 != null) {
                  BirthDateEntryPanel.field_J = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins3_free", param1 - 112);
                if (var2 != null) {
                  cb.field_d = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins2", -120);
                if (null != var2) {
                  GameApplet.field_u = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins1", -76);
                if (var2 != null) {
                  nj.field_j = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("ins0", -112);
                if (null != var2) {
                  wm.field_J = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("skincolour", param1 - 99);
                if (var2 != null) {
                  ProxySocketConnector.field_l = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("haircolour", param1 - 133);
                if (var2 != null) {
                  th.field_j = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("secondarycolour", param1 ^ -103);
                if (null != var2) {
                  ce.field_j = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("primarycolour", -116);
                if (var2 != null) {
                  gg.field_f = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("pressentertocont", -116);
                if (var2 != null) {
                  sk.field_c = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("rechargespell", -104);
                if (null != var2) {
                  StatefulTextPainter.field_x = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("chargeleft", -100);
                if (null != var2) {
                  PasswordFieldPainter.field_z = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("chargesleft", -91);
                if (var2 != null) {
                  QuickChatPhrase.field_s = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("turnleft", param1 - 105);
                if (var2 != null) {
                  DualLinkDeque.field_g = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("turnsleft", -72);
                if (var2 != null) {
                  ki.field_x = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("licheblocks", -128);
                if (var2 != null) {
                  oi.field_a = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unitcapreached", -108);
                if (var2 != null) {
                  QuickChatPhrase.field_p = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("shiningpowerblocks", -106);
                if (var2 != null) {
                  bj.field_sb = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("alreadycastled", -94);
                if (null != var2) {
                  qa.field_k = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("togglehelp", -116);
                if (null != var2) {
                  ValidationStatusIcon.field_L = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("verses", param1 - 123);
                if (var2 != null) {
                  sb.field_c = ValidationHelpWidget.decodeString((byte) 95, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut53", -82);
                if (null != var2) {
                  DropTargetWidget.field_F = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut52", -107);
                if (var2 != null) {
                  IntrusiveDequeCursor.field_h = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut51", param1 - 121);
                if (var2 != null) {
                  TextLine.field_j = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut50", -111);
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_l = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut49", -112);
                if (var2 != null) {
                  bb.field_d = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut48", param1 - 123);
                if (null != var2) {
                  GrowableIntList.field_e = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut47", -102);
                if (null != var2) {
                  fk.field_i = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut46", -93);
                if (var2 != null) {
                  bh.field_a = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut45", -79);
                if (null != var2) {
                  GameAppletShell.field_g = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut44", param1 - 143);
                if (null != var2) {
                  PasswordFieldPainter.field_y = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut43", param1 - 144);
                if (null != var2) {
                  r.field_c = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut42", -70);
                if (null != var2) {
                  DiskCacheWorker.field_f = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut41", -126);
                if (null != var2) {
                  CameraFollowTarget.field_e = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut40", param1 ^ -124);
                if (var2 != null) {
                  SceneWidgetNode.field_o = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut39", -78);
                if (null != var2) {
                  PasswordFieldPainter.field_E = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut38", -110);
                if (null != var2) {
                  va.field_b = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut37", -101);
                if (null != var2) {
                  af.field_Cb = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut36", param1 - 136);
                if (null != var2) {
                  ValidationStatusIcon.field_M = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut35", -93);
                if (var2 != null) {
                  bm.field_a = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut34", -109);
                if (var2 != null) {
                  MusicCrossfadeStream.field_u = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut33", param1 - 122);
                if (var2 != null) {
                  ScreenDisplayMode.field_b = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut32", -96);
                if (null != var2) {
                  IsaacRandom.field_c = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut31", param1 - 108);
                if (var2 != null) {
                  EmptyPainter.field_c = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut30", -92);
                if (null != var2) {
                  ui.field_u = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut29", param1 - 137);
                if (var2 != null) {
                  ub.field_f = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut28", param1 ^ -106);
                if (var2 != null) {
                  MidiPcmStream.field_o = ValidationHelpWidget.decodeString((byte) 113, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut27", param1 - 147);
                if (var2 != null) {
                  LoginPanel.field_D = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut26", -107);
                if (null != var2) {
                  QuickChatPhraseCache.field_f = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut25", -115);
                if (null != var2) {
                  TextButton.field_x = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut24", -88);
                if (var2 != null) {
                  qe.field_n = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut23", param1 - 97);
                if (var2 != null) {
                  SectorCacheStore.field_h = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut22", -99);
                if (null != var2) {
                  qn.field_jb = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut21", -119);
                if (null != var2) {
                  GzipDecoder.field_f = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut20", -71);
                if (null != var2) {
                  lh.field_d = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut19", param1 ^ -128);
                if (var2 != null) {
                  ra.field_g = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut18", -84);
                if (null != var2) {
                  DualLinkNode.field_h = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut17", param1 - 96);
                if (var2 != null) {
                  ub.field_d = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut16", -121);
                if (null != var2) {
                  nj.field_h = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut15", -92);
                if (var2 != null) {
                  ValidationStatusIcon.field_N = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut14", -92);
                if (null != var2) {
                  td.field_D = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut13", param1 - 124);
                if (var2 != null) {
                  DirectByteStorage.field_i = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut12", -90);
                if (null != var2) {
                  FadingModalPanel.field_D = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut11", param1 - 146);
                if (var2 != null) {
                  LabeledField.field_E = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut10", -77);
                if (var2 != null) {
                  ValidationStatusIcon.field_R = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut9", -116);
                if (null != var2) {
                  ie.field_Mb = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut8", -122);
                if (null != var2) {
                  WrappedTextLayout.field_m = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut7", -123);
                if (null != var2) {
                  kj.field_f = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut6", -75);
                if (null != var2) {
                  oi.field_b = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut5", param1 ^ -79);
                if (null != var2) {
                  sk.field_i = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut4", -96);
                if (null != var2) {
                  TextHotspotWidget.field_Q = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut3", -99);
                if (var2 != null) {
                  we.field_a = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut2", -125);
                if (null != var2) {
                  ic.field_c = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut1", param1 ^ -106);
                if (null != var2) {
                  CipherPacketBuffer.field_s = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tut0", -102);
                if (var2 != null) {
                  WidgetStyleLayer.field_f = ValidationHelpWidget.decodeString((byte) 99, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youfallenintowater4", -85);
                if (null != var2) {
                  bc.field_a = ValidationHelpWidget.decodeString((byte) 115, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youfallenintowater3", param1 - 145);
                if (null != var2) {
                  ck.field_g = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youfallenintowater2", -108);
                if (var2 != null) {
                  BattleUnit.field_K = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youfallenintowater", -106);
                if (null != var2) {
                  SceneScrollbar.field_Kb = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("timeleftcolon", param1 - 111);
                if (var2 != null) {
                  co.field_i = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack10", param1 ^ -78);
                if (var2 != null) {
                  md.field_d = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack9", param1 - 120);
                if (null != var2) {
                  mn.field_v = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack8", -79);
                if (null != var2) {
                  fl.field_c = ValidationHelpWidget.decodeString((byte) 86, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack7", -103);
                if (null != var2) {
                  AlternateUsernameCredentials.field_j = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack6", -74);
                if (var2 != null) {
                  fe.field_m = ValidationHelpWidget.decodeString((byte) 91, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack5", -125);
                if (null != var2) {
                  wh.field_j = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack4", -126);
                if (var2 != null) {
                  PatchEnvelopeSet.field_b = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack3", -80);
                if (var2 != null) {
                  SocketConnector.field_h = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpacknature", param1 ^ -96);
                if (null != var2) {
                  ArchiveProvider.field_g = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpackocean", -99);
                if (var2 != null) {
                  lo.field_s = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpackcogs", -83);
                if (null != var2) {
                  Scrollbar.field_I = ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack2", -85);
                if (null != var2) {
                  vm.field_f = ValidationHelpWidget.decodeString((byte) 112, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpace1", -98);
                if (var2 != null) {
                  DebouncedValidator.field_a = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("unpack0", -89);
                if (var2 != null) {
                  FadingModalPanel.field_Q = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("hahahiddenisthis", -118);
                if (var2 != null) {
                  PacketBuffer.field_k = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("blueteam", param1 - 142);
                if (var2 != null) {
                  BirthDateEntryPanel.field_I = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("redteam", -121);
                if (null != var2) {
                  b.field_d = ValidationHelpWidget.decodeString((byte) 94, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("rumrumrum", -100);
                if (null != var2) {
                  ClipState.field_l = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mosletitle", -119);
                if (var2 != null) {
                  b.field_c = ValidationHelpWidget.decodeString((byte) 126, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("skycastlepower", param1 - 109);
                if (null != var2) {
                  qj.field_f = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("skycastletitle", -119);
                if (null != var2) {
                  ck.field_c = ValidationHelpWidget.decodeString((byte) 102, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("summonclickonscreen", -87);
                if (null != var2) {
                  IntrusiveDeque.field_a = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("timetimetime", -111);
                if (null != var2) {
                  mf.field_e = ValidationHelpWidget.decodeString((byte) 101, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("yaywecanswim", param1 ^ -103);
                if (null != var2) {
                  MusicPatch.field_i = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("natureisgoodaswell", -128);
                if (null != var2) {
                  CanvasRasterBuffer.field_f = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("morehealingwtf", param1 - 112);
                if (var2 != null) {
                  pb.field_l = ValidationHelpWidget.decodeString((byte) 97, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("respawnpoint", -108);
                if (null != var2) {
                  ScrollContainer.field_M = ValidationHelpWidget.decodeString((byte) 96, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("bouncyminions", -114);
                if (var2 != null) {
                  IterableNodeHashTable.field_b = ValidationHelpWidget.decodeString((byte) 124, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("speedsrecharges", -128);
                if (var2 != null) {
                  MenuScreen.field_p = ValidationHelpWidget.decodeString((byte) 103, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("damageresist", -82);
                if (null != var2) {
                  ik.field_a = ValidationHelpWidget.decodeString((byte) 123, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("flamup", param1 - 121);
                if (var2 != null) {
                  ClipState.field_q = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("familarpowers", -85);
                if (var2 != null) {
                  GzipDecoder.field_c = ValidationHelpWidget.decodeString((byte) 100, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("mustbeamemeberforanimals", param1 ^ -78);
                if (var2 != null) {
                  SceneWidget.field_M = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("famtitle", param1 ^ -67);
                if (null != var2) {
                  db.field_d = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tp4", -87);
                if (null != var2) {
                  va.field_a = ValidationHelpWidget.decodeString((byte) 89, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tp3", -123);
                if (null != var2) {
                  nm.field_d = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tp2", -95);
                if (null != var2) {
                  GrowableIntList.field_f = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tp0", -96);
                if (null != var2) {
                  hl.field_i = ValidationHelpWidget.decodeString((byte) 88, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tptitle", -97);
                if (var2 != null) {
                  gl.field_a = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("earnlessnowhehe", param1 - 110);
                if (var2 != null) {
                  ck.field_e = ValidationHelpWidget.decodeString((byte) 92, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("tradeinnowdammit", -85);
                if (var2 != null) {
                  UiTheme.field_h = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("earnedlotstradeinnow", param1 ^ -75);
                if (null != var2) {
                  DropdownList.field_F = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youaredamagedhahaha", -72);
                if (var2 != null) {
                  qn.field_kb = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("sorryonlyonceperturn", -70);
                if (var2 != null) {
                  ConditionalTextValue.field_g = ValidationHelpWidget.decodeString((byte) 110, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("nocastwhileflying", -81);
                if (var2 != null) {
                  ValidationHelpWidget.field_T = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("nocastvinewhileflying", -99);
                if (null != var2) {
                  LoadingTracker.field_l = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("wateronlyspell", param1 - 150);
                if (var2 != null) {
                  bj.field_jb = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("arcanzeroblocks", -82);
                if (null != var2) {
                  IndexedSpriteState.field_a = ValidationHelpWidget.decodeString((byte) 104, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("youareentangled", -82);
            }
            void runChunk4() throws java.lang.RuntimeException {
                if (null != var2) {
                  ValidationHelpWidget.decodeString((byte) 118, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("levelx", -125);
                if (null != var2) {
                  Checkbox.field_H = ValidationHelpWidget.decodeString((byte) 121, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("alreadyatmax", -108);
                if (var2 != null) {
                  LoadingTracker.field_i = ValidationHelpWidget.decodeString((byte) 98, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("notenoughhp", param1 - 141);
                if (null != var2) {
                  hm.field_b = ValidationHelpWidget.decodeString((byte) 108, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("poweringupfamiliar", -75);
                if (null != var2) {
                  kj.field_b = ValidationHelpWidget.decodeString((byte) 105, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("starttut", -77);
                if (var2 != null) {
                  MenuButtonPanel.field_Q = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("gotosandbox", -103);
                if (var2 != null) {
                  IntrusiveNodeHashTable.field_d = ValidationHelpWidget.decodeString((byte) 120, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("brats", -74);
                if (null != var2) {
                  ui.field_q = ValidationHelpWidget.decodeString((byte) 119, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("bwins", param1 ^ -117);
                if (var2 != null) {
                  StatefulTextPainter.field_y = ValidationHelpWidget.decodeString((byte) 117, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("cogscaps", param1 ^ -80);
                if (var2 != null) {
                  ie.field_Rb = ValidationHelpWidget.decodeString((byte) 106, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("oceancaps", param1 - 121);
                if (null != var2) {
                  fo.field_i = ValidationHelpWidget.decodeString((byte) 114, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("naturecaps", -88);
                if (null != var2) {
                  ra.field_e = ValidationHelpWidget.decodeString((byte) 111, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("overcaps", -95);
                if (var2 != null) {
                  SocketConnector.field_f = ValidationHelpWidget.decodeString((byte) 122, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("underdarkcaps", -89);
                if (null != var2) {
                  NodeHashTable.field_b = ValidationHelpWidget.decodeString((byte) 127, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("frostcaps", -80);
                if (var2 != null) {
                  pc.field_a = ValidationHelpWidget.decodeString((byte) 107, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stonecaps", -85);
                if (null != var2) {
                  ra.field_b = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("stormcaps", -99);
                if (null != var2) {
                  hm.field_a = ValidationHelpWidget.decodeString((byte) 90, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("flamecaps", -116);
                if (var2 != null) {
                  ArchiveRequest.field_s = ValidationHelpWidget.decodeString((byte) 87, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("whensummoning", -121);
                if (var2 != null) {
                  ArrayWidgetContainer.field_F = ValidationHelpWidget.decodeString((byte) 109, var2);
                }
                var2 = CachedArchiveProvider.loadNamedFile("optionscreen", param1 - 110);
                if (var2 != null) {
                  ArchiveIndex.field_j = ValidationHelpWidget.decodeString((byte) 116, var2);
                }
                QuickChatPhraseCache.field_e = null;
            }
            void run() {
                var3 = ArcanistsMulti.field_G ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                  runChunk4();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_3095_0 = (RuntimeException) (var2_ref);
                  stackIn_3095_1 = new StringBuilder().append("rg.A(");
                  if (param0 == null) {
                    stackIn_3096_2 = "null";
                  } else {
                    stackIn_3096_2 = "{...}";
                  }
                  throw aa.wrapException((Throwable) ((Object) stackIn_3095_0), ((StringBuilder) (Object) stackIn_3095_1).append(stackIn_3096_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = GameAppletShell.field_b;
                  var4++;
                  GameAppletShell.field_b = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_b = "If you are not, please change your password to something more obscure!";
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_c = "Moe";
        field_e = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
